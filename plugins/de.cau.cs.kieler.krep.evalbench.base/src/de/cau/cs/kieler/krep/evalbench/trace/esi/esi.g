grammar esi;

@lexer::header {
  package krep.evalbench.trace.esi;
}

@header {
  package krep.evalbench.trace.esi;
  import java.util.LinkedList;
  import java.util.HashMap;
  import java.io.Reader;
  
  import krep.evalbench.program.IAssembler;
  import krep.evalbench.program.krep.*;
  import krep.evalbench.trace.*;
  import krep.evalbench.comm.Signal;
}

@members {
  LinkedList<Trace> traces = null;
  Trace currentTrace = null;
  Tick currentTick = null;

  public static LinkedList<Trace> parse(IAssembler asm, final Reader source) {
	try {
	    final esiLexer lex = new esiLexer(new ANTLRReaderStream(source));
	    final CommonTokenStream tokens = new CommonTokenStream(lex);
	    return new esiParser(tokens).parse(asm);
	} catch (final Exception e) {
	    return null;
	}
  }
   
  private String errorMsg = new String();
  private boolean error = false;
  
  private HashMap<String, Integer> index;
  
  public void emitErrorMessage(String msg){
    errorMsg += msg + "\n";
    error = true;
  }
  
  public String getErrorMsg(){
    return errorMsg;
  }
}

parse[IAssembler asm] returns [LinkedList<Trace> traces]: 
  {this.index=asm.getSignalIndex(); } 
  l=tracelist 
  {traces=l;} 
  ;

tracelist returns [LinkedList<Trace> traces] :
  {LinkedList<Trace> ts = new LinkedList<Trace>(); } 
  (
   t=trace {ts.add(t);} 
   | (('!' 'reset' ';' t=trace{ts.add(t);})+)
   )
   {traces=ts; } 
   ;


trace returns [Trace trace]: 
   {LinkedList<Tick> ts = new LinkedList<Tick>();}
   ((t=tick { ts.add(t); })*)
   {trace = new Trace(ts);}
   ;

  
tick returns [Tick t]:
    inputs=signals ('%' 'Output' ':' outputs=signals)? ';' {t = new Tick(inputs, outputs);}
   ; 

signals returns [LinkedList<Signal> sigs]:
   {LinkedList<Signal> ss = new LinkedList<Signal>();}
   ((s=signal { ss.add(s); })*)
   {sigs = ss;} 
   ;

signal returns [Signal s]:
     i=ID               { s = new Signal($i.text, true, null, index); }
   | i=ID '(' v=num ')' { s = new Signal($i.text, true, $v.v, index); }
   ;
        
 num returns [Integer v] 
      : n=NUMBER { v=Integer.parseInt($n.text); }
      ;
        
/*------------------------------------------------------------------
* LEXER RULES
*------------------------------------------------------------------*/

ID	: (Letter | '_') (Letter | Digit | '_')*;

NUMBER	: ('+'|'-')?(Digit)+ ;

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C')+ 	{ $channel = HIDDEN; } ;

COMMENT : '%' ('A'..'N' | 'P'..'Z')( options {greedy=false;}: .)* '\n' {$channel=HIDDEN;}
        ;

fragment Digit	: '0'..'9' ;

fragment Letter 
	:	'a'..'z'|'A'..'Z';