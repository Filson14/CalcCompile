
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Wed May 20 09:02:56 CEST 2015
//----------------------------------------------------

import java_cup.runtime.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Wed May 20 09:02:56 CEST 2015
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
    "\000\020\000\002\004\004\000\002\002\004\000\002\004" +
    "\003\000\002\003\003\000\002\003\004\000\002\002\003" +
    "\000\002\002\005\000\002\002\005\000\002\002\005\000" +
    "\002\002\005\000\002\002\005\000\002\002\005\000\002" +
    "\002\006\000\002\002\006\000\002\002\006\000\002\002" +
    "\006" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\046\000\020\004\013\012\014\014\004\015\010\016" +
    "\006\017\005\020\007\001\002\000\004\012\046\001\002" +
    "\000\004\012\043\001\002\000\004\012\040\001\002\000" +
    "\020\004\ufffc\005\ufffc\006\ufffc\007\ufffc\010\ufffc\011\ufffc" +
    "\013\ufffc\001\002\000\004\012\035\001\002\000\022\002" +
    "\033\004\013\012\014\014\004\015\010\016\006\017\005" +
    "\020\007\001\002\000\016\004\032\005\021\006\022\007" +
    "\024\010\023\011\020\001\002\000\022\002\ufffe\004\ufffe" +
    "\012\ufffe\014\ufffe\015\ufffe\016\ufffe\017\ufffe\020\ufffe\001" +
    "\002\000\016\012\014\014\004\015\010\016\006\017\005" +
    "\020\007\001\002\000\022\002\uffff\004\uffff\012\uffff\014" +
    "\uffff\015\uffff\016\uffff\017\uffff\020\uffff\001\002\000\016" +
    "\005\021\006\022\007\024\010\023\011\020\013\017\001" +
    "\002\000\020\004\ufff6\005\ufff6\006\ufff6\007\ufff6\010\ufff6" +
    "\011\ufff6\013\ufff6\001\002\000\016\012\014\014\004\015" +
    "\010\016\006\017\005\020\007\001\002\000\016\012\014" +
    "\014\004\015\010\016\006\017\005\020\007\001\002\000" +
    "\016\012\014\014\004\015\010\016\006\017\005\020\007" +
    "\001\002\000\016\012\014\014\004\015\010\016\006\017" +
    "\005\020\007\001\002\000\016\012\014\014\004\015\010" +
    "\016\006\017\005\020\007\001\002\000\020\004\ufff9\005" +
    "\ufff9\006\ufff9\007\ufff9\010\ufff9\011\020\013\ufff9\001\002" +
    "\000\020\004\ufff8\005\ufff8\006\ufff8\007\ufff8\010\ufff8\011" +
    "\020\013\ufff8\001\002\000\020\004\ufffa\005\ufffa\006\ufffa" +
    "\007\024\010\023\011\020\013\ufffa\001\002\000\020\004" +
    "\ufffb\005\ufffb\006\ufffb\007\024\010\023\011\020\013\ufffb" +
    "\001\002\000\020\004\ufff7\005\ufff7\006\ufff7\007\ufff7\010" +
    "\ufff7\011\ufff7\013\ufff7\001\002\000\022\002\ufffd\004\ufffd" +
    "\012\ufffd\014\ufffd\015\ufffd\016\ufffd\017\ufffd\020\ufffd\001" +
    "\002\000\004\002\000\001\002\000\022\002\001\004\001" +
    "\012\001\014\001\015\001\016\001\017\001\020\001\001" +
    "\002\000\016\012\014\014\004\015\010\016\006\017\005" +
    "\020\007\001\002\000\016\005\021\006\022\007\024\010" +
    "\023\011\020\013\037\001\002\000\020\004\ufff4\005\ufff4" +
    "\006\ufff4\007\ufff4\010\ufff4\011\ufff4\013\ufff4\001\002\000" +
    "\016\012\014\014\004\015\010\016\006\017\005\020\007" +
    "\001\002\000\016\005\021\006\022\007\024\010\023\011" +
    "\020\013\042\001\002\000\020\004\ufff3\005\ufff3\006\ufff3" +
    "\007\ufff3\010\ufff3\011\ufff3\013\ufff3\001\002\000\016\012" +
    "\014\014\004\015\010\016\006\017\005\020\007\001\002" +
    "\000\016\005\021\006\022\007\024\010\023\011\020\013" +
    "\045\001\002\000\020\004\ufff2\005\ufff2\006\ufff2\007\ufff2" +
    "\010\ufff2\011\ufff2\013\ufff2\001\002\000\016\012\014\014" +
    "\004\015\010\016\006\017\005\020\007\001\002\000\016" +
    "\005\021\006\022\007\024\010\023\011\020\013\050\001" +
    "\002\000\020\004\ufff5\005\ufff5\006\ufff5\007\ufff5\010\ufff5" +
    "\011\ufff5\013\ufff5\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\046\000\010\002\011\003\014\004\010\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\002\011\003\033\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\002\015" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\002\030\001\001\000\004\002\027\001\001" +
    "\000\004\002\026\001\001\000\004\002\025\001\001\000" +
    "\004\002\024\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\002\035\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\002\040\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\002\043\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\002\046\001\001\000\002\001\001\000\002" +
    "\001\001" });

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
	public Parser(Scanner scanner){
		super(scanner);
		this.scanner = scanner;
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
	}
	
	public void report_fatal_error(String message, Object info){
		report_error(message, info);
		System.exit(1);
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
          case 15: // expr ::= CTG LPARENT expr RPARENT 
            {
              Double RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 if(e%180!=0)RESULT =  1/Math.tan(Math.toRadians(e));
												else throw new Error("Ctg undefined") ;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expr ::= TAN LPARENT expr RPARENT 
            {
              Double RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 if((e-90)%180!=0) RESULT = Math.tan(Math.toRadians(e));
												else{throw new Error("Tan undefined");} 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expr ::= COS LPARENT expr RPARENT 
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
          case 12: // expr ::= SIN LPARENT expr RPARENT 
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
          case 11: // expr ::= LPARENT expr RPARENT 
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
          case 10: // expr ::= expr POW expr 
            {
              Double RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT= Math.pow(e1,e2); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expr ::= expr DIVIDE expr 
            {
              Double RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT=e1/e2; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expr ::= expr TIMES expr 
            {
              Double RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT=e1*e2; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expr ::= expr MINUS expr 
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
          case 6: // expr ::= expr PLUS expr 
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
          case 5: // expr ::= NUMBER 
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
          case 4: // line ::= expr NEW_LINE 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 System.out.println(e); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("line",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
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

