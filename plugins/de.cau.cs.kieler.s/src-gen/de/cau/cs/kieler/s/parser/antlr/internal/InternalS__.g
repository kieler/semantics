lexer grammar InternalS;
@header {
package de.cau.cs.kieler.s.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T13 : 'Synchronous Program' ;
T14 : '(' ;
T15 : ')' ;
T16 : ':' ;
T17 : 'SIGNALS' ;
T18 : ';' ;
T19 : 'input' ;
T20 : 'output' ;
T21 : 'signal' ;
T22 : ':=' ;
T23 : 'combine' ;
T24 : 'with' ;
T25 : 'PAUSE' ;
T26 : 'TERM' ;
T27 : 'Halt' ;
T28 : 'JOIN' ;
T29 : 'ABORT' ;
T30 : 'IF' ;
T31 : ',' ;
T32 : '{' ;
T33 : '}' ;
T34 : 'GOTO' ;
T35 : 'FORK' ;
T36 : 'FORKE' ;
T37 : 'EMIT' ;
T38 : 'AWAIT' ;
T39 : 'PRIO' ;
T40 : '?' ;
T41 : '=' ;
T42 : '<' ;
T43 : '<=' ;
T44 : '>' ;
T45 : '>=' ;
T46 : '<>' ;
T47 : 'not' ;
T48 : 'pre' ;
T49 : 'or' ;
T50 : 'and' ;
T51 : '+' ;
T52 : '-' ;
T53 : '*' ;
T54 : 'mod' ;
T55 : '/' ;
T56 : 'PURE' ;
T57 : 'BOOL' ;
T58 : 'UNSIGNED' ;
T59 : 'INT' ;
T60 : 'FLOAT' ;
T61 : 'HOST' ;
T62 : 'NONE' ;
T63 : 'max' ;
T64 : 'min' ;
T65 : 'host' ;

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3815
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3817
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3819
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3821
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3823
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3825
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3827
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3829
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3831
RULE_ANY_OTHER : .;


