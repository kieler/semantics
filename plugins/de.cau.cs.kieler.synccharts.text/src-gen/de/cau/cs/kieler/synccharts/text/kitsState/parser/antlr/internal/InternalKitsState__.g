lexer grammar InternalKitsState;
@header {
package de.cau.cs.kieler.synccharts.text.kitsState.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T15 : 'region' ;
T16 : ':' ;
T17 : 'textual' ;
T18 : 'code' ;
T19 : '(' ;
T20 : ')' ;
T21 : 'init' ;
T22 : 'final' ;
T23 : 'state' ;
T24 : '@' ;
T25 : '[' ;
T26 : ',' ;
T27 : ']' ;
T28 : '{' ;
T29 : 'onentry' ;
T30 : 'oninner' ;
T31 : 'onexit' ;
T32 : 'suspension' ;
T33 : '}' ;
T34 : 'with' ;
T35 : '#' ;
T36 : '/' ;
T37 : 'history' ;
T38 : 'input' ;
T39 : 'output' ;
T40 : 'signal' ;
T41 : ':=' ;
T42 : 'combine' ;
T43 : 'var' ;
T44 : 'import' ;
T45 : 'normal' ;
T46 : 'conditional' ;
T47 : 'reference' ;
T48 : '-->' ;
T49 : 'o->' ;
T50 : '>->' ;
T51 : '=' ;
T52 : '<' ;
T53 : '<=' ;
T54 : '>' ;
T55 : '>=' ;
T56 : '<>' ;
T57 : 'pre' ;
T58 : 'or' ;
T59 : 'and' ;
T60 : 'not' ;
T61 : '+' ;
T62 : '-' ;
T63 : '*' ;
T64 : 'mod' ;
T65 : '?' ;
T66 : 'pure' ;
T67 : 'bool' ;
T68 : 'unsigned' ;
T69 : 'int' ;
T70 : 'float' ;
T71 : 'host' ;
T72 : 'none' ;
T73 : 'max' ;
T74 : 'min' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 4824
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 4826
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 4828
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 4830
RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 4832
RULE_HOSTCODE : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 4834
RULE_COMMENT_ANNOTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 4836
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 4838
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 4840
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 4842
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 4844
RULE_ANY_OTHER : .;


