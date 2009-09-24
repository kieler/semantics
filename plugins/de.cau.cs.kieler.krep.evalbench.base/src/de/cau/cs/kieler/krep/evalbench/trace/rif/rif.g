grammar rif;

@lexer::header {
  package krep.evalbench.trace.rif;
}

@header {
  package krep.evalbench.trace.rif;
  import java.util.LinkedList;
  import java.io.Reader;
  
  import krep.evalbench.program.IAssembler;
  import krep.evalbench.program.krep.*;
  import krep.evalbench.trace.*;
  import krep.evalbench.comm.Signal;
  import krep.evalbench.exceptions.ParseException;
}

@members {
  Trace trace = null;
  
   private ArrayList<String> inputs= new ArrayList<String>();
  private ArrayList<String> outputs= new ArrayList<String>();
  private int i,j;

  public static Trace parse(IAssembler asm, final Reader source) throws ParseException{
	try {
		Trace res = new Trace(asm);
	    final rifLexer lex = new rifLexer(new ANTLRReaderStream(source));
	    final CommonTokenStream tokens = new CommonTokenStream(lex);
	    new rifParser(tokens).parse(res);
	    return res;
	} catch (final Error err) {
	    throw new ParseException(err.getMessage());
	} catch (final Exception exc) {
	    throw new ParseException(exc.getMessage());
	}
  }

  private void addSignal(IO io, int value){
    switch(io){
    case INPUT: trace.add(io, new Signal(inputs.get(i), true, value, i)); i++; break;
    case OUTPUT: trace.add(io, new Signal(outputs.get(j), true, value, j)); j++; break;
	}
  }
  
  private void addName(IO io, String name){
    switch(io){
    case INPUT: inputs.add(name); break;
    case OUTPUT: outputs.add(name); break;
	}
  }
  
  private String errorMsg = new String();
  private boolean error = false;
  
  public void emitErrorMessage(String msg) {
    errorMsg += msg + "\n";
    error = true;
    throw new Error(msg);
  }
  
  public String getErrorMsg(){
    return errorMsg;
  }
}

parse[Trace trace] returns [boolean ok]: {error = false;this.trace=trace;} trace {return !error;} ;

trace: init (tick)* ;

init: '#@inputs' (decl[IO.INPUT]*)  '@#'
       '#@outputs' (decl[IO.OUTPUT]*) '@#' 
       '#@locals' (decl[null]*)  '@#';

decl [IO io] : '"' n=ID  '":' type {addName(io, $n.text);};

type :  'bool' 
        | 'int';
  
tick : '#step'  num() {i=0; j=0;trace.startTick();} data[IO.INPUT]* 
         '#outs' data[IO.OUTPUT]* 
         '#locs' data[null]* ;

data[IO io]:   v=num {addSignal(io, $v.v);}
        | 'T' {addSignal(io, 1);} 
        | 'F' {addSignal(io, 0);};
        
 num returns [Integer v] 
      : n=NUMBER { v=Integer.parseInt($n.text); }
      ;
        
/*------------------------------------------------------------------
* LEXER RULES
*------------------------------------------------------------------*/

ID	: (Letter | '_') (Letter | Digit | '_')*;

NUMBER	: ('+'|'-')?(Digit)+ ;

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C')+ 	{ $channel = HIDDEN; } ;

COMMENT : '# ' (options {greedy=false;}: .)* '\n' {$channel=HIDDEN;}
                 |  '#program' (options {greedy=false;}: .)* '\n' {$channel=HIDDEN;}
                 |  'The execution' (options {greedy=false;}: .)* '\n' {$channel=HIDDEN;};

fragment Digit	: '0'..'9' ;

fragment Letter 
	:	'a'..'z'|'A'..'Z';