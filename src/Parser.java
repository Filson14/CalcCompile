
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Wed Jun 10 12:53:30 CEST 2015
//----------------------------------------------------

import java_cup.runtime.*;
import java.util.HashMap;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Wed Jun 10 12:53:30 CEST 2015
  */
public class Parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\024\000\002\004\004\000\002\002\004\000\002\004" +
    "\003\000\002\003\003\000\002\003\006\000\002\003\004" +
    "\000\002\002\003\000\002\002\003\000\002\002\005\000" +
    "\002\002\005\000\002\002\005\000\002\002\005\000\002" +
    "\002\005\000\002\002\005\000\002\002\004\000\002\002" +
    "\006\000\002\002\006\000\002\002\006\000\002\002\006" +
    "\000\002\002\006" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\060\000\024\004\015\006\004\013\016\016\006\017" +
    "\011\020\007\021\005\022\010\023\012\001\002\000\006" +
    "\013\060\022\057\001\002\000\004\013\054\001\002\000" +
    "\004\013\051\001\002\000\004\013\046\001\002\000\020" +
    "\004\ufffb\005\ufffb\006\ufffb\007\ufffb\010\ufffb\011\ufffb\014" +
    "\ufffb\001\002\000\004\013\043\001\002\000\020\004\ufffa" +
    "\005\ufffa\006\ufffa\007\ufffa\010\ufffa\011\ufffa\012\040\001" +
    "\002\000\026\002\036\004\015\006\004\013\016\016\006" +
    "\017\011\020\007\021\005\022\010\023\012\001\002\000" +
    "\016\004\035\005\024\006\025\007\027\010\026\011\022" +
    "\001\002\000\026\002\ufffe\004\ufffe\006\ufffe\013\ufffe\016" +
    "\ufffe\017\ufffe\020\ufffe\021\ufffe\022\ufffe\023\ufffe\001\002" +
    "\000\022\006\004\013\016\016\006\017\011\020\007\021" +
    "\005\022\010\023\020\001\002\000\026\002\uffff\004\uffff" +
    "\006\uffff\013\uffff\016\uffff\017\uffff\020\uffff\021\uffff\022" +
    "\uffff\023\uffff\001\002\000\020\004\ufffa\005\ufffa\006\ufffa" +
    "\007\ufffa\010\ufffa\011\ufffa\014\ufffa\001\002\000\016\005" +
    "\024\006\025\007\027\010\026\011\022\014\023\001\002" +
    "\000\022\006\004\013\016\016\006\017\011\020\007\021" +
    "\005\022\010\023\020\001\002\000\020\004\ufff4\005\ufff4" +
    "\006\ufff4\007\ufff4\010\ufff4\011\ufff4\014\ufff4\001\002\000" +
    "\022\006\004\013\016\016\006\017\011\020\007\021\005" +
    "\022\010\023\020\001\002\000\022\006\004\013\016\016" +
    "\006\017\011\020\007\021\005\022\010\023\020\001\002" +
    "\000\022\006\004\013\016\016\006\017\011\020\007\021" +
    "\005\022\010\023\020\001\002\000\022\006\004\013\016" +
    "\016\006\017\011\020\007\021\005\022\010\023\020\001" +
    "\002\000\020\004\ufff7\005\ufff7\006\ufff7\007\ufff7\010\ufff7" +
    "\011\022\014\ufff7\001\002\000\020\004\ufff6\005\ufff6\006" +
    "\ufff6\007\ufff6\010\ufff6\011\022\014\ufff6\001\002\000\020" +
    "\004\ufff8\005\ufff8\006\ufff8\007\027\010\026\011\022\014" +
    "\ufff8\001\002\000\020\004\ufff9\005\ufff9\006\ufff9\007\027" +
    "\010\026\011\022\014\ufff9\001\002\000\020\004\ufff5\005" +
    "\ufff5\006\ufff5\007\ufff5\010\ufff5\011\ufff5\014\ufff5\001\002" +
    "\000\026\002\ufffc\004\ufffc\006\ufffc\013\ufffc\016\ufffc\017" +
    "\ufffc\020\ufffc\021\ufffc\022\ufffc\023\ufffc\001\002\000\004" +
    "\002\000\001\002\000\026\002\001\004\001\006\001\013" +
    "\001\016\001\017\001\020\001\021\001\022\001\023\001" +
    "\001\002\000\022\006\004\013\016\016\006\017\011\020" +
    "\007\021\005\022\010\023\020\001\002\000\016\004\042" +
    "\005\024\006\025\007\027\010\026\011\022\001\002\000" +
    "\026\002\ufffd\004\ufffd\006\ufffd\013\ufffd\016\ufffd\017\ufffd" +
    "\020\ufffd\021\ufffd\022\ufffd\023\ufffd\001\002\000\022\006" +
    "\004\013\016\016\006\017\011\020\007\021\005\022\010" +
    "\023\020\001\002\000\016\005\024\006\025\007\027\010" +
    "\026\011\022\014\045\001\002\000\020\004\ufff0\005\ufff0" +
    "\006\ufff0\007\ufff0\010\ufff0\011\ufff0\014\ufff0\001\002\000" +
    "\022\006\004\013\016\016\006\017\011\020\007\021\005" +
    "\022\010\023\020\001\002\000\016\005\024\006\025\007" +
    "\027\010\026\011\022\014\050\001\002\000\020\004\uffef" +
    "\005\uffef\006\uffef\007\uffef\010\uffef\011\uffef\014\uffef\001" +
    "\002\000\022\006\004\013\016\016\006\017\011\020\007" +
    "\021\005\022\010\023\020\001\002\000\016\005\024\006" +
    "\025\007\027\010\026\011\022\014\053\001\002\000\020" +
    "\004\ufff1\005\ufff1\006\ufff1\007\ufff1\010\ufff1\011\ufff1\014" +
    "\ufff1\001\002\000\022\006\004\013\016\016\006\017\011" +
    "\020\007\021\005\022\010\023\020\001\002\000\016\005" +
    "\024\006\025\007\027\010\026\011\022\014\056\001\002" +
    "\000\020\004\uffee\005\uffee\006\uffee\007\uffee\010\uffee\011" +
    "\uffee\014\uffee\001\002\000\020\004\ufff3\005\ufff3\006\ufff3" +
    "\007\ufff3\010\ufff3\011\ufff3\014\ufff3\001\002\000\022\006" +
    "\004\013\016\016\006\017\011\020\007\021\005\022\010" +
    "\023\020\001\002\000\016\005\024\006\025\007\027\010" +
    "\026\011\022\014\062\001\002\000\020\004\ufff2\005\ufff2" +
    "\006\ufff2\007\ufff2\010\ufff2\011\ufff2\014\ufff2\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\060\000\010\002\013\003\016\004\012\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\002\013\003\036\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\002\020\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\002\033" +
    "\001\001\000\002\001\001\000\004\002\032\001\001\000" +
    "\004\002\031\001\001\000\004\002\030\001\001\000\004" +
    "\002\027\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\002" +
    "\040\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\002\043\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\002\046\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\002\051\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\002\054\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\002\060\001\001\000" +
    "\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {
//scanner.init(); 
    }

  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 return scanner.next_token(); 
    }


	Scanner scanner;
	Writer writer;
	HashMap<String, Double> variables = new HashMap<String, Double>();
	
	
	public void setScanner(Scanner scanner)
	{
		this.scanner = scanner;
	}
	
	public void setWriter(Writer  writer)
	{
		this.writer = writer;
	}
	
	public Parser(Scanner scanner,Writer writer){
		super(scanner);
		this.scanner = scanner;
		this.writer = writer;
	}
	
	public void report_error(String message, Object info){
		StringBuilder msg = new StringBuilder("Error");
		if(info instanceof java_cup.runtime.Symbol){
			Symbol s = (java_cup.runtime.Symbol) info;
			if(s.left >= 0){
				msg.append(" in line " + (s.left+1));
				if(s.right >= 0) msg.append(", column " + (s.right+1));
			}
		}

		msg.append(" : " + message);
		System.err.println(msg);
		writer.write(msg.toString()+"\n");
	}
	
	public Writer getWriter()
	{
		return this.writer;
	}
	
	public void report_fatal_error(String message, Object info){
		report_error(message, info);
		//writer.write(message + " " + info + "\n");
		//System.exit(1);
	}
	
	public void addVariable(String key, Double value){
		variables.put(key, value);
	}
	
	public Double getVariable(String key) throws Exception{
		if(variables.get(key)==null) throw new Exception("Undefined variable " + key);
		return variables.get(key);
	}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expr ::= CTG LPARENT expr RPARENT 
            {
              Double RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 if(e%180!=0)RESULT =  1/Math.tan(Math.toRadians(e));
												else throw new Exception("Ctg undefined"); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expr ::= TAN LPARENT expr RPARENT 
            {
              Double RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 if((e-90)%180!=0) RESULT = Math.tan(Math.toRadians(e));
												else{throw new Exception("Tan undefined");} 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expr ::= COS LPARENT expr RPARENT 
            {
              Double RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = Math.cos(Math.toRadians(e)); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expr ::= SIN LPARENT expr RPARENT 
            {
              Double RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = Math.sin(Math.toRadians(e)); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expr ::= MINUS LPARENT expr RPARENT 
            {
              Double RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = -e; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expr ::= MINUS NUMBER 
            {
              Double RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double n = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = -n; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expr ::= LPARENT expr RPARENT 
            {
              Double RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = e; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expr ::= expr POW expr 
            {
              Double RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = Math.pow(e1,e2); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expr ::= expr DIVIDE expr 
            {
              Double RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 if(e2!=0)RESULT = e1/e2; 
												else {throw new Exception("Divide by zero");}
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // expr ::= expr TIMES expr 
            {
              Double RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = e1*e2; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expr ::= expr MINUS expr 
            {
              Double RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = e1-e2; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expr ::= expr PLUS expr 
            {
              Double RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = e1+e2; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expr ::= ID 
            {
              Double RESULT =null;
		int varleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int varright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String var = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = parser.getVariable(var); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expr ::= NUMBER 
            {
              Double RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double n = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = n; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // line ::= expr NEW_LINE 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 parser.getWriter().write("=" + (double) Math.round(1000 * e)/1000  + "\n"); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("line",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // line ::= ID EQ expr NEW_LINE 
            {
              Object RESULT =null;
		int varleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int varright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		String var = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 parser.addVariable(var, e); parser.getWriter().write(var + " = " + (double) Math.round(1000 * e)/1000  + "\n"); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("line",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // line ::= NEW_LINE 
            {
              Object RESULT =null;
		 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("line",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // input ::= line 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("input",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= input EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // input ::= input line 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("input",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

