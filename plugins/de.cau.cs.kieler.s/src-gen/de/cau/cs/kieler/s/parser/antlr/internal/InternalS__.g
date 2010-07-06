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
T14 : ':' ;
T15 : 'SIGNALS' ;
T16 : ';' ;
T17 : 'input' ;
T18 : 'output' ;
T19 : 'signal' ;
T20 : ':=' ;
T21 : 'combine' ;
T22 : 'with' ;
T23 : 'PAUSE' ;
T24 : 'TERM' ;
T25 : 'Halt' ;
T26 : 'JOIN' ;
T27 : 'ABORT' ;
T28 : 'IF' ;
T29 : ',' ;
T30 : '{' ;
T31 : '}' ;
T32 : 'GOTO' ;
T33 : 'FORK' ;
T34 : 'FORKE' ;
T35 : 'EMIT' ;
T36 : 'AWAIT' ;
T37 : 'PRIO' ;
T38 : '-' ;
T39 : '.' ;
T40 : 'E' ;
T41 : 'e' ;
T42 : 'true' ;
T43 : 'false' ;
T44 : '=' ;
T45 : '<' ;
T46 : '<=' ;
T47 : '>' ;
T48 : '>=' ;
T49 : '<>' ;
T50 : 'pre' ;
T51 : 'or' ;
T52 : 'and' ;
T53 : 'not' ;
T54 : '+' ;
T55 : '*' ;
T56 : 'mod' ;
T57 : '/' ;
T58 : '?' ;
T59 : 'PURE' ;
T60 : 'BOOL' ;
T61 : 'UNSIGNED' ;
T62 : 'INT' ;
T63 : 'FLOAT' ;
T64 : 'HOST' ;
T65 : 'NONE' ;
T66 : 'max' ;
T67 : 'min' ;
T68 : 'host' ;

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3927
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3929
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3931
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3933
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3935
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3937
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3939
RULE_ANY_OTHER : .;


