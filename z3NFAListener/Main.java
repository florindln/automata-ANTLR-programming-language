import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;
import java.io.PrintStream;

class MyCancelException extends RuntimeException{
	String str1;
	public MyCancelException(){
		str1="threw cancel exception";
	}
	public String toString(){ 
	return (str1) ;
   }
}

class Triple<T, U, V> {

    private final T first;
    private final U second;
    private final V third;

    public Triple(T first, U second, V third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() { return first; }
    public U getSecond() { return second; }
    public V getThird() { return third; }
}

class MyListener extends MyGrammarBaseListener
{

	Map<String, Integer> memory = new HashMap<String, Integer>();
	private Stack<Integer> numberStack = new Stack<Integer>();
	List<String> finalStates = new ArrayList<>();
	String initialState = "0";
	String maxNrState = "7";

	private Stack<String> letStack=new Stack<String>();
	public List<String> endNodes=new ArrayList<String>();
	
	public List<Triple<String,String,String>> triples=new ArrayList();

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
		// System.err.println("terminal-node: '" + node.getText() + "'");
	}

	/** REMEMBER THE STATES */
	@Override
	public void exitFunctionDef(MyGrammarParser.FunctionDefContext ctx){

		/** PROCESS THE FINAL STATES */
		if(ctx.ID().getText().equals("FinalStates")){

			String finalStates=letStack.pop();
			finalStates=finalStates.replace("\"","");
			// System.err.println("Popped finalstates "+finalStates);

			String[] newStates=finalStates.split(":");
			for(String s:newStates){
				if(!s.equals("end")){
		 			
					s=String.valueOf(Integer.valueOf(s)%1000);

					System.err.println("finalstates "+s);
					endNodes.add(s);
				}
			}
		}

		/** PROCESS THE INITIAL STATE */
		if(ctx.ID().getText().equals("InitState")){
			initialState=letStack.pop();
			System.err.println("Popped initialnr "+initialState);
		}

		/** PROCESS THE MAX STATE */
		if(ctx.ID().getText().equals("MaxState")){

			maxNrState=letStack.pop();
			System.err.println("Popped maxnr "+maxNrState);

		}

		/** PROCESS THE STATES CONNECTIONS */
		//stop the program here
		if(ctx.ID().getText().equals("A")){
			int j =0;
			// System.err.println("connections "+ctx.fValues().getText());
			throw new MyCancelException();
		}
		
	}

	@Override public void exitAndExpr(MyGrammarParser.AndExprContext ctx) { 
		 String right=letStack.pop();
		 String middle=letStack.pop();
		 String left=letStack.pop();

		 left=String.valueOf(Integer.valueOf(left)%1000);
		 middle=String.valueOf(Integer.valueOf(middle)%1000);

		System.err.println("exited And expr LEFT:"+left+" MIDDLE "+middle+" RIGHT "+right);
		triples.add(new Triple(left,middle,right));
		String newN=left+right;
		letStack.push(newN);

	 }

	 @Override public void exitValue(MyGrammarParser.ValueContext ctx) {
		if(ctx.NUMBER()!=null){
		 	letStack.push(ctx.NUMBER().getText());
			 System.err.println("added number string to letStack: " +ctx.NUMBER());
		} else if(ctx.TEXT()!=null){
			letStack.push(ctx.TEXT().getText());
			 System.err.println("added text string to letStack: " +ctx.TEXT());
		}
	  }


	public void printGraph(){
		System.out.println("digraph dfa {");
		System.out.println("rankdir = LR");
		System.out.println("node [shape=circle,style=filled,fillcolor=white,fontname=Arial]");
		System.out.println("edge [fontname=Arial]");
		System.out.println("dummy [style=filled,fontcolor=white,color=white]");
		System.out.println("");

		System.out.println("dummy -> 0");
		for(String s:endNodes){
			System.out.println(s+" [shape = doublecircle]");
		}
		for(Triple t: triples){
			System.out.println(t.getFirst()+" -> "+t.getSecond()+" [label = "+t.getThird()+"]");
		}

		System.out.println("}");
	}



}

public class Main 
{
    public static void main(String[] args) throws Exception 
	{
		PrintStream fileOut = new PrintStream("./graphVizInput.dot");
		System.setOut(fileOut);

        CharStream input = CharStreams.fromStream(System.in);
		MyGrammarLexer lexer = new MyGrammarLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

		// TODO: print the lexer's vocabulary and the actual list of tokens 
		
        MyGrammarParser parser = new MyGrammarParser(tokens);

        ParseTree tree = parser.myStart();
		
		MyListener m = new MyListener();

		try{
		ParseTreeWalker.DEFAULT.walk(m, tree);
		} catch(MyCancelException re){
			System.err.println(re.toString());
		}
		m.printGraph();
		


    }
}