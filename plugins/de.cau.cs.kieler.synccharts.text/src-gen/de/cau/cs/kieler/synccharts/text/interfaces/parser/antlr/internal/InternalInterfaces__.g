lexer grammar InternalInterfaces;
@header {
package de.cau.cs.kieler.synccharts.text.interfaces.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T17 : 'input' ;
T18 : 'output' ;
T19 : 'signal' ;
T20 : 'variable' ;
T21 : ':' ;
T22 : 'var' ;
T23 : ',' ;
T24 : ';' ;
T25 : ':=' ;
T26 : 'combine' ;
T27 : 'with' ;
T28 : '(' ;
T29 : ')' ;
T30 : 'inputoutput' ;
T31 : 'return' ;
T32 : '@' ;
T33 : '=' ;
T34 : '<' ;
T35 : '<=' ;
T36 : '>' ;
T37 : '>=' ;
T38 : '<>' ;
T39 : 'pre' ;
T40 : 'or' ;
T41 : 'and' ;
T42 : 'not' ;
T43 : '+' ;
T44 : '-' ;
T45 : '*' ;
T46 : 'mod' ;
T47 : '?' ;
T48 : 'pure' ;
T49 : 'bool' ;
T50 : 'unsigned' ;
T51 : 'int' ;
T52 : 'float' ;
T53 : 'host' ;
T54 : 'none' ;
T55 : 'max' ;
T56 : 'min' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g" 5598
RULE_STRING_D : ('"' '"'|'"' ('\\' '"'|~('"'))* ('\\' '"'|~(('\\'|'"'))) '"');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g" 5600
RULE_STRING_S : ('\'' '\''|'\'' ('\\' '\''|~('\''))* ('\\' '\''|~(('\\'|'\''))) '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g" 5602
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g" 5604
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g" 5606
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g" 5608
RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g" 5610
RULE_HOSTCODE : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g" 5612
RULE_COMMENT_ANNOTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g" 5614
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g" 5616
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g" 5618
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g" 5620
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g" 5622
RULE_ANY_OTHER : .;


