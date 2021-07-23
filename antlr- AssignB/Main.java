import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;

class MyListener extends MyGrammarBaseListener
{
	/** "memory" for our calculator; variable/value pairs go here */
	Map<String, Integer> memory = new HashMap<String, Integer>();

	private Stack<Integer> numberStack = new Stack<Integer>();
	private Stack<String> letterStack = new Stack<String>();

	@Override public void enterMyStart(MyGrammarParser.MyStartContext ctx) 
	{
		System.err.println("enterMyStart()");
	}
	
	@Override public void exitMyStart(MyGrammarParser.MyStartContext ctx) 
	{ 
		System.err.println("exitMyStart()");
	}
	
	@Override public void visitTerminal(TerminalNode node) 
	{ 
		System.err.println("terminal-node: '" + node.getText() + "'");
	}

	@Override
        public void exitAddSub(MyGrammarParser.AddSubContext ctx) {
			int right = numberStack.pop();      
			int left = numberStack.pop();      		
            				
            int result;
            if (ctx.op.getType() == MyGrammarParser.ADD) {
                result = left + right;
            } else {
                result = left - right;
            }
            numberStack.push(result);
			System.err.println("added "+left+ " with "+right);
        }

		@Override
        public void exitMulDiv(MyGrammarParser.MulDivContext ctx) {
            int right = numberStack.pop();      
			int left = numberStack.pop();   
			
            int result;
            if (ctx.op.getType() == MyGrammarParser.MUL) {
                result = left * right;
            } else {
                result = left / right;
            }
            numberStack.push(result);
			System.err.println("multiplied "+left+ " with "+right);
        }

	@Override public void exitAssign(MyGrammarParser.AssignContext ctx)
	{
		String id = ctx.ID().getText(); // id is left-hand side of '='
		// String value = ctx.expr().getText(); // expression value of expression on right
		
		int value= numberStack.pop();
		memory.put(id, value); // store it in our memory
		System.err.println("memory put: " + id + "=" + value);
	}


	@Override public void exitId(MyGrammarParser.IdContext ctx) {
		String id=ctx.ID().getText();
		//  letterStack.push(id);
		int number=memory.get(id);
		numberStack.push(number);
		 System.err.println("Added id to letterstack: "+id+" meaning adding "+number+" to numberstack");
		 }

	@Override public void exitInt(MyGrammarParser.IntContext ctx) { 
		String integ=ctx.INT().getText();
		numberStack.push(Integer.valueOf(integ));
		System.err.println("Added integ to numberStack: "+integ);
		}


	@Override public void exitPrintExpr(MyGrammarParser.PrintExprContext ctx) {
		int value=numberStack.pop();
		System.err.println("printed "+ctx.expr().getText()+" = "+value);
	 }

}

public class Main 
{
    public static void main(String[] args) throws Exception 
	{
        CharStream input = CharStreams.fromStream(System.in);
		MyGrammarLexer lexer = new MyGrammarLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

		// TODO: print the lexer's vocabulary and the actual list of tokens 
		
        MyGrammarParser parser = new MyGrammarParser(tokens);

        ParseTree tree = parser.myStart();
		
		MyListener m = new MyListener();
		ParseTreeWalker.DEFAULT.walk(m, tree);
    }
}