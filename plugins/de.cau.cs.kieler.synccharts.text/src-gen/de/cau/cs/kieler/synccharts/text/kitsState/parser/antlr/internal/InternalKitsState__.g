lexer grammar InternalKitsState;
@header {
package de.cau.cs.kieler.synccharts.text.kitsState.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T16 : 'region' ;
T17 : ':' ;
T18 : 'textual' ;
T19 : 'code' ;
T20 : '(' ;
T21 : ')' ;
T22 : 'init' ;
T23 : 'final' ;
T24 : 'state' ;
T25 : '@' ;
T26 : '[' ;
T27 : ',' ;
T28 : ']' ;
T29 : '{' ;
T30 : 'onentry' ;
T31 : 'oninner' ;
T32 : 'onexit' ;
T33 : 'suspension' ;
T34 : '}' ;
T35 : 'with' ;
T36 : '#' ;
T37 : '/' ;
T38 : 'history' ;
T39 : 'input' ;
T40 : 'output' ;
T41 : 'signal' ;
T42 : ':=' ;
T43 : 'combine' ;
T44 : 'var' ;
T45 : ';' ;
T46 : 'inputoutput' ;
T47 : 'return' ;
T48 : 'import' ;
T49 : 'normal' ;
T50 : 'conditional' ;
T51 : 'reference' ;
T52 : '-->' ;
T53 : 'o->' ;
T54 : '>->' ;
T55 : '=' ;
T56 : '<' ;
T57 : '<=' ;
T58 : '>' ;
T59 : '>=' ;
T60 : '<>' ;
T61 : 'pre' ;
T62 : 'or' ;
T63 : 'and' ;
T64 : 'not' ;
T65 : '+' ;
T66 : '-' ;
T67 : '*' ;
T68 : 'mod' ;
T69 : '?' ;
T70 : 'pure' ;
T71 : 'boolean' ;
T72 : 'unsigned' ;
T73 : 'integer' ;
T74 : 'float' ;
T75 : 'double' ;
T76 : 'string' ;
T77 : 'host' ;
T78 : 'none' ;
T79 : 'max' ;
T80 : 'min' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 6816
RULE_HOSTCODE : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 6818
RULE_COMMENT_ANNOTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 6820
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 6822
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 6824
RULE_FLOAT : ('-'? ('0'..'9')+ '.' ('0'..'9')* (('e'|'E') ('+'|'-')? ('0'..'9')+)? 'f'?|'-'? ('0'..'9')+ 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 6826
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 6828
RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 6830
RULE_TYPEID : '[' ('a'..'z'|'A'..'Z'|'_'|'.') ('a'..'z'|'A'..'Z'|'_'|'.'|'0'..'9')* ']';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 6832
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 6834
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 6836
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 6838
RULE_ANY_OTHER : .;


