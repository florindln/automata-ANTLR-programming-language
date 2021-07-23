import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;

class Value {

    public static Value VOID = new Value(new Object());

    final Object value;

    public Value(Object value) {
        this.value = value;
    }

    public Boolean asBoolean() {
        return (Boolean)value;
    }

    public Integer asInteger() {
        return (Integer)value;
    }

    public String asString() {
        return String.valueOf(value);
    }

    @Override
    public int hashCode() {

        if(value == null) {
            return 0;
        }

        return this.value.hashCode();
    }

    @Override
    public boolean equals(Object o) {

        if(value == o) {
            return true;
        }

        if(value == null || o == null || o.getClass() != value.getClass()) {
            return false;
        }

        Value that = (Value)o;

        return this.value.equals(that.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}


class MyVisitor extends Example2BaseVisitor<Value>
{
	// MyVisitor doesn't contain visitAndExpr(), so Example2BaseVisitor.visitAndExpr()
    // is called when running the application
	// (see Example2BaseVisitor.java: this Example2BaseVisitor.visitAndExpr() calls visitChildren())

    /** "memory" for our calculator; variable/value pairs go here */
    Map<String, Value> memory = new HashMap<String, Value>();
    Map<String, Value> secondMemory = new HashMap<String, Value>();
    Map<String, Value> functVariablesMemory = new HashMap<String, Value>();
    Map<String,Example2Parser.BlockContext> functBlockMemory= new HashMap<String,Example2Parser.BlockContext>();
    Map<String, List<String>> functParameterMemory = new HashMap<String, List<String>>();


    /** ID '=' expr */
    @Override public Value visitAssign(Example2Parser.AssignContext ctx) {
        String id = ctx.ID().getText(); // id is left-hand side of '='
        Value value = visit(ctx.expr()); // compute value of expression on right
        System.err.println("added in normal memory "+id+" with value "+value);
        memory.put(id, value); // store it in our memory
        return value;
    }

    /** INT */
    @Override public Value visitInt(Example2Parser.IntContext ctx) {
        return new Value((ctx.INT().getText()));
    }

    /** ID */
    @Override public Value visitId(Example2Parser.IdContext ctx) {
        String id = ctx.ID().getText();
        if ( memory.containsKey(id) ) return (memory.get(id));
        // System.err.println("visited id "+id);

        return Value.VOID;
    }

    /** expr op=('*'|'/') expr */
    @Override public Value visitMulDiv(Example2Parser.MulDivContext ctx) {
        Value left = visit(ctx.expr(0)); // get value of left subexpression
        Value right = visit(ctx.expr(1)); // get value of right subexpression
        if ( ctx.op.getType() == Example2Parser.MUL ) return new Value(Integer.valueOf(left.asString()) * Integer.valueOf(right.asString()));
        return new Value(Integer.valueOf(left.asString()) / Integer.valueOf(right.asString())); // must be DIV
    }

    /** expr op=('+'|'-') expr */
    @Override public Value visitAddSub(Example2Parser.AddSubContext ctx) {
        Value left = visit(ctx.expr(0)); // get value of left subexpression
        Value right = visit(ctx.expr(1)); // get value of right subexpression
        if ( ctx.op.getType() == Example2Parser.ADD ) return new Value(Integer.valueOf(left.asString()) + Integer.valueOf(right.asString()));
        return new Value(Integer.valueOf(left.asString()) - Integer.valueOf(right.asString())); // must be SUB
    }

    /** '(' expr ')' */
    @Override public Value visitParens(Example2Parser.ParensContext ctx) {
        return visit(ctx.expr()); // return child expr's value
    }

    /** 'print' expr */
    @Override public Value visitPrint(Example2Parser.PrintContext ctx) {
        Value value = visit(ctx.expr());
        System.out.println("printed:" + value);
        return Value.VOID;
    }

    /** expr ( '=='| '!=' ) expr */
    @Override public Value visitEqualCheckExpr(Example2Parser.EqualCheckExprContext ctx) {
        Value left = visit(ctx.expr(0));
        Value right = visit(ctx.expr(1));
        // System.out.println("LETF: " + left + " || RIGHT: " + right);
        if(ctx.op.getType() == Example2Parser.Equals){
            if(left.equals(right)){
                System.out.println("Returned true");
                return new Value(Boolean.valueOf(true));
            }
            System.out.println("Returned false");
            return new Value(Boolean.valueOf(false));
        }
        if(ctx.op.getType() == Example2Parser.NEquals){
            if(left.equals(right)){
                return new Value(Boolean.valueOf(false));
            }
            return new Value(Boolean.valueOf(true));
        }
        return new Value(Boolean.valueOf(true));
    }

    /** expr ( '>=' | '<=' | '>' | '<' ) expr */
    @Override public Value visitCompareExpr(Example2Parser.CompareExprContext ctx) {
        Value left = visit(ctx.expr(0));
        Value right = visit(ctx.expr(1));

        /** '>=' */
        if(ctx.op.getType() == Example2Parser.GTEquals){
            if(Integer.valueOf(left.asString()) >= Integer.valueOf(right.asString())){
                System.out.println(left + " >= " + right);
                return new Value(Boolean.valueOf(true));
            }
        }

        /** '<=' */
        if(ctx.op.getType() == Example2Parser.LTEquals){
            if(Integer.valueOf(left.asString()) <= Integer.valueOf(right.asString())){
                System.out.println(left + " <= " + right);
                return new Value(Boolean.valueOf(true));
            }
        }

        /** '>' */
        if(ctx.op.getType() == Example2Parser.BIGGER){
            if(Integer.valueOf(left.asString()) > Integer.valueOf(right.asString())){
                System.out.println(left + " > " + right);
                return new Value(Boolean.valueOf(true));
            }
        }

        /** '<' */
        if(ctx.op.getType() == Example2Parser.SMALLER){
            if(Integer.valueOf(left.asString()) < Integer.valueOf(right.asString())){
                System.out.println(left + " < " + right);
                return new Value(Boolean.valueOf(true));
            }
        }

        return new Value(Boolean.valueOf(false));
    }

    /** IF expr THEN thenBlock( ELSE elseBlock)? FI */
    @Override public Value visitIfStat(Example2Parser.IfStatContext ctx) {
        Value condition = visit(ctx.expr());
        System.out.println("if " + ctx.expr().getText());
        if(condition.asBoolean()){
            Value thenStat = visit(ctx.thenBlock());
        }
        else{
           if(ctx.elseBlock() != null){
               Value elseStat = visit(ctx.elseBlock());
           }
        }
        return Value.VOID;
    }

    /** WHILE expr DO stat */
    @Override public Value visitLoop(Example2Parser.LoopContext ctx) {
        Value condition = visit(ctx.expr());
        System.out.println("while " + ctx.expr().getText());
        while(condition.asBoolean()){
            int i=0;
            while(ctx.stat(i)!=null){
                Value stat = visit(ctx.stat(i));
                i++;
            }
            condition = visit(ctx.expr());
        }
        return Value.VOID;
    }

    /** TRUE */
    @Override public Value visitTrue(Example2Parser.TrueContext ctx) {
        return new Value(Boolean.valueOf(true));
    }

    /** FALSE */
    @Override public Value visitFalse(Example2Parser.FalseContext ctx) {
        return new Value(Boolean.valueOf(false));
    }

    /**  expr '||' expr  */
    @Override public Value visitOrExpr(Example2Parser.OrExprContext ctx) {
        Value expr1 = visit(ctx.expr(0));
        Value expr2 = visit(ctx.expr(1));

        if(expr1.asBoolean() || expr2.asBoolean()){
            return new Value(Boolean.valueOf(true));
        }

        return new Value(Boolean.valueOf(false));
    }

    /**  expr '&&' expr  */
    @Override public Value visitAndExpr(Example2Parser.AndExprContext ctx) {
        Value expr1 = visit(ctx.expr(0));
        Value expr2 = visit(ctx.expr(1));

        if(expr1.asBoolean() && expr2.asBoolean()){
            return new Value(Boolean.valueOf(true));
        }

        return new Value(Boolean.valueOf(false));
    }

    /**  'TEXT'  */
    @Override public Value visitText(Example2Parser.TextContext ctx) {
        return new Value((ctx.TEXT().getText()));
    }

    /**  'formal parameter'  */
    @Override public Value visitFormalPars(Example2Parser.FormalParsContext ctx) { 
        // System.err.println("visited formal pars");
          int i=0;
        while(ctx.ID(i)!=null){
                String paramName=ctx.ID(i).getText();
                // System.err.println(paramName);
                i++;
        }

        return Value.VOID;
    }

    /**  'function definition'  */
    @Override public Value visitFunctionDef(Example2Parser.FunctionDefContext ctx) {
        String variableName=(ctx.ID().getText());
        String id=variableName;
        //we save the context in memory so we can visit it later
        functBlockMemory.put(id,ctx.block());

        //put in memory the functional name and parameters
        List<String> params = new ArrayList<>();
        int i=0;
        while(ctx.formalPars().ID(i)!=null){
            String paramName=ctx.formalPars().ID(i).getText();
            // System.err.println(paramName);
            params.add(paramName);
            i++;
        }

        functParameterMemory.put(id,params);
        return Value.VOID;
    }

    /**  'func call'  */
    @Override public Value visitFuncCall(Example2Parser.FuncCallContext ctx) { 
        // System.err.println("visited func call");
        String name=ctx.ID().getText();

        Map<String, Value> functVariablesMemory = new HashMap<String, Value>();
        for (int i = 0; i < functParameterMemory.get(name).size(); i++)
        {
            String formalParam=functParameterMemory.get(name).get(i);
            Value actualParam=visit(ctx.actualPars().expr(i));
            functVariablesMemory.put(formalParam,actualParam );
            System.err.println("Formal Parameter: " +formalParam + " -> " + "Actual Parameter: " + actualParam);
        }

        Iterator i = memory.entrySet().iterator();
        Iterator j = functVariablesMemory.entrySet().iterator();

        secondMemory.putAll(memory);

        memory.putAll(functVariablesMemory);

        Iterator m = memory.entrySet().iterator();
        while(m.hasNext()) {
            Map.Entry element = (Map.Entry)m.next();
            // System.out.println("INITIAL Key: " + element.getKey() + " -> " + "INITIAL Value: " + element.getValue());
        }


        int indx=0;
        Value rtrnValue = new Value(0);
        while(functBlockMemory.get(ctx.ID().getText()).stat(indx)!=null){
            String statName = functBlockMemory.get(ctx.ID().getText()).stat(indx).getText();
            // System.err.println("stat "+statName);
            Value v= visit(functBlockMemory.get(ctx.ID().getText()).stat(indx));
            if(statName.contains("return")){
                System.out.println("RETURNED VALUE IS " + v);
                rtrnValue = v;
                break;
            }
            indx++;
        }

        // System.err.println("end of func call");
        memory.clear();
        memory.putAll(secondMemory);
        return rtrnValue;
    }

    /**  'return expr'  */
    @Override public Value visitRtrn(Example2Parser.RtrnContext ctx) {
        //System.out.println("RETURN VALUE: " + visit(ctx.expr()));
        return visit(ctx.expr());
    }

  

}

public class Main {

    public static void main(String[] args) throws Exception {
		
        CharStream input = CharStreams.fromStream(System.in);
		Example2Lexer lexer = new Example2Lexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        Example2Parser parser = new Example2Parser(tokens);

        ParseTree tree = parser.start2();
		
        Example2Visitor<Value> visitor = new MyVisitor();
        visitor.visit(tree);
    }
}