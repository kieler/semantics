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
T30 : '@' ;
T31 : '=' ;
T32 : '<' ;
T33 : '<=' ;
T34 : '>' ;
T35 : '>=' ;
T36 : '<>' ;
T37 : 'pre' ;
T38 : 'or' ;
T39 : 'and' ;
T40 : 'not' ;
T41 : '+' ;
T42 : '-' ;
T43 : '*' ;
T44 : 'mod' ;
T45 : '/' ;
T46 : '?' ;
T47 : 'pure' ;
T48 : 'bool' ;
T49 : 'unsigned' ;
T50 : 'int' ;
T51 : 'float' ;
T52 : 'host' ;
T53 : 'none' ;
T54 : 'max' ;
T55 : 'min' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g" 4526
RULE_STRING_D : ('"' '"'|'"' ('\\' '"'|~('"'))* ('\\' '"'|~(('\\'|'"'))) '"');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g" 4528
RULE_STRING_S : ('\'' '\''|'\'' ('\\' '\''|~('\''))* ('\\' '\''|~(('\\'|'\''))) '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g" 4530
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g" 4532
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g" 4534
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g" 4536
RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g" 4538
RULE_HOSTCODE : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g" 4540
RULE_COMMENT_ANNOTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g" 4542
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g" 4544
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g" 4546
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g" 4548
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g" 4550
RULE_ANY_OTHER : .;


