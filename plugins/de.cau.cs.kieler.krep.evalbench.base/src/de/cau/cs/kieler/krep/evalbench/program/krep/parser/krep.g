grammar krep;

@lexer::header {
  package krep.evalbench.program.krep.parser;
}

@header {
  package krep.evalbench.program.krep.parser;
  import java.util.LinkedList;
  
  import krep.evalbench.program.krep.*;
  import krep.evalbench.program.krep.Process;
}

@members {

}

prog returns [LinkedList<Process> res]  
  :;

 num returns [Integer v] 
      : n=NUMBER { v=Integer.parseInt($n.text); }
      ;

 
/*------------------------------------------------------------------
* LEXER RULES
*------------------------------------------------------------------*/

ID	: (Letter | '_') (Letter | Digit | '_')*;

NUMBER	: ('+'|'-')?(Digit)+ ;

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C')+ 	{ $channel = HIDDEN; } ;

COMMENT : '#' (options {greedy=false;}: .)* '\n' {$channel=HIDDEN;};

fragment Digit	: '0'..'9' ;

fragment Letter 
	:	'a'..'z'|'A'..'Z';
 
