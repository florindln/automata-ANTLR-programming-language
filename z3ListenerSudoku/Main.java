import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;

class MyListener extends MyGrammarBaseListener
{
	/** "memory" for our calculator; variable/value pairs go here */
	Map<String, Integer> memory = new HashMap<String, Integer>();

	private Stack<Integer> numberStack = new Stack<Integer>();
	int a[][]= new int[9][9];
	

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


	//	 @Override
       // public void exitIntNumber(MyGrammarParser.IntNumberContext ctx) {
            // System.err.println("exit int "+ctx.INTEGER().getText());
          //  stack.push(Integer.valueOf(ctx.INTEGER().getText()));
      //  }
	  @Override public void exitEqOExpr(MyGrammarParser.EqOExprContext ctx) {
		System.err.println("exited EQ O");

	 }

	@Override public void exitEqPExpr(MyGrammarParser.EqPExprContext ctx) {
		// System.err.println("exited EQ P   ID: "+ ctx.ID()+" with value "+numberStack.peek());
		
	 }
	 @Override public void exitAndExpr(MyGrammarParser.AndExprContext ctx) { 
		 int right=numberStack.pop();
		 int left=numberStack.pop();
		 System.err.println("exited And expr LEFT:"+left+" RIGHT "+right);
		String newN=Integer.toString(left)+Integer.toString(right);
		numberStack.push(Integer.valueOf(newN));

	 }

	 @Override public void exitITEexpr(MyGrammarParser.ITEexprContext ctx) { 
		int lastValue=numberStack.pop();//the else from the output is useless
		int middleValue=numberStack.pop();// value of the coordinates
		int first=numberStack.pop();//coordinates for adjacency matrix
		 System.err.println("exited ITE expr LAST: "+lastValue+" MIDDLE: "+middleValue+" FIRST "+first);
		int row=Integer.valueOf(	Integer.toString(first).substring(0,1) );
		int col=Integer.valueOf( Integer.toString(first).substring(1,2) );
		// System.err.println("row: "+row+" col: "+col);
		a[row-1][col-1]=middleValue;
//		System.err.println("added a["+(row-1)+"]["+(col-1)+"]="+middleValue+" to adj matrix");
		numberStack.push(99999);//we dont care about the value from the else because it's an output

	 }

	 @Override public void exitValue(MyGrammarParser.ValueContext ctx) {
		if(ctx.NUMBER()!=null){
		 	numberStack.push(Integer.valueOf(ctx.NUMBER().getText()));
			// System.err.println("added value numberstack: " +ctx.NUMBER());
		}
	  }

	// 	  #000000  //black
	// 	  #a9a9a9  //grey
	// 	  #3cb44b	//cyan
	// 	  #911eb4 //purple
	// 	  #e6194B //red
	// 	  #f58231 //orange
	// 	  #3cb44b //green
	// 	  #dcbeff //lavender
	//	  #4363d8//blue
	  List<String> colors=Arrays.asList("#000000","#a9a9a9","#3cb44b","#911eb4","#e6194B","#f58231","#3cb44b","#dcbeff","#4363d8");


	  public void printGraphViz(){
		System.err.println("graph myAutomaton {");
		//-----------declare the nodes-----------
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				int valueA=a[i][j]>0?a[i][j]-1:0;
				System.err.println("a"+(i+1)+(j+1)+""+" [shape=circle color=\""+colors.get(valueA)+"\"]"/*+"  VALUE "+a[i][j]*/);
			}
		}
		//-----------add connections between nodes-----------

		//add edges between all elements in the same row
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				for(int k=j;k<a[i].length-1;k++){
					System.err.println("a"+(i+1)+(j+1)+""+ "--"+"a"+(i+1)+(k+2));
				}
			}
		}

		// add edges between all elements in the same column
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				for(int k=j;k<a[i].length-1;k++){
					System.err.println("a"+(j+1)+(i+1)+""+ "--"+"a"+(k+2)+(i+1));
				}
			}
		}

		//add edges between all elements in the same 3x3 block		
		for(int i=0;i<a.length;i=i+3){
			for(int j=0;j<a[i].length;j=j+3){
				//3 cells in a row probably redundant
				System.err.println("a"+(i+1)+(j+1)+""+ "--"+"a"+(i+1)+(j+2));
				System.err.println("a"+(i+1)+(j+1)+""+ "--"+"a"+(i+1)+(j+3));
				System.err.println("a"+(i+1)+(j+2)+""+ "--"+"a"+(i+1)+(j+3));
				//3 cells in a column probably redundant
				System.err.println("a"+(j+1)+(i+1)+""+ "--"+"a"+(j+2)+(i+1));
				System.err.println("a"+(j+1)+(i+1)+""+ "--"+"a"+(j+3)+(i+1));
				System.err.println("a"+(j+2)+(i+1)+""+ "--"+"a"+(j+3)+(i+1));
				//diagonal main
				 System.err.println("a"+(i+1)+(j+1)+""+ "--"+"a"+(i+2)+(j+2));
				 System.err.println("a"+(i+1)+(j+1)+""+ "--"+"a"+(i+3)+(j+3));
				 System.err.println("a"+(i+2)+(j+2)+""+ "--"+"a"+(i+3)+(j+3));
				//diagonal second
				System.err.println("a"+(i+1)+(j+3)+""+ "--"+"a"+(i+2)+(j+2));
				System.err.println("a"+(i+1)+(j+3)+""+ "--"+"a"+(i+3)+(j+1));
				System.err.println("a"+(i+2)+(j+2)+""+ "--"+"a"+(i+3)+(j+1));				
			}
		}

		System.err.println("}");
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


//		m.printGraphViz();


    }
}