lexer grammar InternalKitsState;
@header {
package de.cau.cs.kieler.synccharts.text.kitsState.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T15 : 'region' ;
T16 : ':' ;
T17 : 'init' ;
T18 : 'final' ;
T19 : 'state' ;
T20 : '@' ;
T21 : '[' ;
T22 : ',' ;
T23 : ']' ;
T24 : '{' ;
T25 : 'onentry' ;
T26 : 'oninner' ;
T27 : 'onexit' ;
T28 : 'suspension' ;
T29 : '}' ;
T30 : 'with' ;
T31 : '#' ;
T32 : '/' ;
T33 : 'history' ;
T34 : 'input' ;
T35 : 'output' ;
T36 : 'signal' ;
T37 : ':=' ;
T38 : 'combine' ;
T39 : 'var' ;
T40 : '(' ;
T41 : ')' ;
T42 : 'import' ;
T43 : 'normal' ;
T44 : 'conditional' ;
T45 : 'reference' ;
T46 : 'textual' ;
T47 : '-->' ;
T48 : 'o->' ;
T49 : '>->' ;
T50 : '=' ;
T51 : '<' ;
T52 : '<=' ;
T53 : '>' ;
T54 : '>=' ;
T55 : '<>' ;
T56 : 'pre' ;
T57 : 'or' ;
T58 : 'and' ;
T59 : 'not' ;
T60 : '+' ;
T61 : '-' ;
T62 : '*' ;
T63 : 'mod' ;
T64 : '?' ;
T65 : 'pure' ;
T66 : 'bool' ;
T67 : 'unsigned' ;
T68 : 'int' ;
T69 : 'float' ;
T70 : 'host' ;
T71 : 'none' ;
T72 : 'max' ;
T73 : 'min' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 4637
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 4639
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 4641
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 4643
RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 4645
RULE_HOSTCODE : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 4647
RULE_COMMENT_ANNOTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 4649
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 4651
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 4653
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 4655
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 4657
RULE_ANY_OTHER : .;


