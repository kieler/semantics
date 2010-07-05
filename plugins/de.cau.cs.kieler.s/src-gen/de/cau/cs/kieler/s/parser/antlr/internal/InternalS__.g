lexer grammar InternalS;
@header {
package de.cau.cs.kieler.s.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'Synchronous Program' ;
T12 : '(' ;
T13 : ')' ;
T14 : 'Inputs' ;
T15 : ',' ;
T16 : ';' ;
T17 : 'Outputs' ;
T18 : 'Signals' ;
T19 : ':' ;
T20 : 'SIGNALS' ;
T21 : 'input' ;
T22 : 'output' ;
T23 : 'signal' ;
T24 : ':=' ;
T25 : 'combine' ;
T26 : 'with' ;
T27 : 'PAUSE' ;
T28 : 'TERM' ;
T29 : 'Halt' ;
T30 : 'JOIN' ;
T31 : 'ABORT' ;
T32 : 'PRESENT' ;
T33 : '{' ;
T34 : '}' ;
T35 : 'GOTO' ;
T36 : 'FORK' ;
T37 : 'FORKE' ;
T38 : 'EMIT' ;
T39 : 'AWAIT' ;
T40 : 'PRIO' ;
T41 : '-' ;
T42 : '.' ;
T43 : 'E' ;
T44 : 'e' ;
T45 : 'true' ;
T46 : 'false' ;
T47 : '=' ;
T48 : '<' ;
T49 : '<=' ;
T50 : '>' ;
T51 : '>=' ;
T52 : '<>' ;
T53 : 'pre' ;
T54 : 'or' ;
T55 : 'and' ;
T56 : 'not' ;
T57 : '+' ;
T58 : '*' ;
T59 : 'mod' ;
T60 : '/' ;
T61 : '?' ;
T62 : 'PURE' ;
T63 : 'BOOL' ;
T64 : 'UNSIGNED' ;
T65 : 'INT' ;
T66 : 'FLOAT' ;
T67 : 'HOST' ;
T68 : 'NONE' ;
T69 : 'max' ;
T70 : 'min' ;
T71 : 'host' ;

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 4083
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 4085
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 4087
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 4089
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 4091
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 4093
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 4095
RULE_ANY_OTHER : .;


