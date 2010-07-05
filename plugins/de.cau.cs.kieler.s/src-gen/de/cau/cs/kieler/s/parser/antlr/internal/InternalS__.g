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
T21 : 'PAUSE' ;
T22 : 'TERM' ;
T23 : 'Halt' ;
T24 : 'JOIN' ;
T25 : 'ABORT' ;
T26 : 'PRESENT' ;
T27 : '{' ;
T28 : '}' ;
T29 : 'GOTO' ;
T30 : 'FORK' ;
T31 : 'FORKE' ;
T32 : 'EMIT' ;
T33 : 'AWAIT' ;
T34 : 'PRIO' ;
T35 : '-' ;
T36 : '.' ;
T37 : 'E' ;
T38 : 'e' ;
T39 : 'true' ;
T40 : 'false' ;
T41 : '=' ;
T42 : '<' ;
T43 : '<=' ;
T44 : '>' ;
T45 : '>=' ;
T46 : '<>' ;
T47 : 'pre' ;
T48 : 'or' ;
T49 : 'and' ;
T50 : 'not' ;
T51 : '+' ;
T52 : '*' ;
T53 : 'mod' ;
T54 : '/' ;
T55 : '?' ;

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3764
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3766
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3768
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3770
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3772
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3774
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3776
RULE_ANY_OTHER : .;


