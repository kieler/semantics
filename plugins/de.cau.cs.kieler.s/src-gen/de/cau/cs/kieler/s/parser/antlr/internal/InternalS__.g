lexer grammar InternalS;
@header {
package de.cau.cs.kieler.s.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T14 : 'Synchronous Program' ;
T15 : '(' ;
T16 : ')' ;
T17 : ':' ;
T18 : 'SIGNALS' ;
T19 : ';' ;
T20 : 'input' ;
T21 : 'output' ;
T22 : 'signal' ;
T23 : ':=' ;
T24 : 'combine' ;
T25 : 'with' ;
T26 : 'PAUSE' ;
T27 : 'TERM' ;
T28 : 'Halt' ;
T29 : 'JOIN' ;
T30 : 'ABORT' ;
T31 : 'IF' ;
T32 : ',' ;
T33 : '{' ;
T34 : '}' ;
T35 : 'GOTO' ;
T36 : 'FORK' ;
T37 : 'FORKE' ;
T38 : 'EMIT' ;
T39 : 'AWAIT' ;
T40 : 'PRIO' ;
T41 : '@' ;
T42 : '=' ;
T43 : '<' ;
T44 : '<=' ;
T45 : '>' ;
T46 : '>=' ;
T47 : '<>' ;
T48 : 'pre' ;
T49 : 'or' ;
T50 : 'and' ;
T51 : 'not' ;
T52 : '+' ;
T53 : '-' ;
T54 : '*' ;
T55 : 'mod' ;
T56 : '/' ;
T57 : '?' ;
T58 : 'pure' ;
T59 : 'bool' ;
T60 : 'unsigned' ;
T61 : 'int' ;
T62 : 'float' ;
T63 : 'host' ;
T64 : 'none' ;
T65 : 'max' ;
T66 : 'min' ;

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3829
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3831
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3833
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3835
RULE_COMMENT_ANNOTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3837
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3839
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3841
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3843
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3845
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g" 3847
RULE_ANY_OTHER : .;


