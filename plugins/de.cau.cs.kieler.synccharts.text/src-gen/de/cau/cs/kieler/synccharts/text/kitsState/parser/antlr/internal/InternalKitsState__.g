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
T44 : ';' ;
T45 : 'inputoutput' ;
T46 : 'return' ;
T47 : 'import' ;
T48 : 'normal' ;
T49 : 'conditional' ;
T50 : 'reference' ;
T51 : '-->' ;
T52 : 'o->' ;
T53 : '>->' ;
T54 : '=' ;
T55 : '<' ;
T56 : '<=' ;
T57 : '>' ;
T58 : '>=' ;
T59 : '<>' ;
T60 : 'pre' ;
T61 : 'or' ;
T62 : 'and' ;
T63 : 'not' ;
T64 : '+' ;
T65 : '-' ;
T66 : '*' ;
T67 : 'mod' ;
T68 : '?' ;
T69 : 'pure' ;
T70 : 'boolean' ;
T71 : 'unsigned' ;
T72 : 'integer' ;
T73 : 'float' ;
T74 : 'double' ;
T75 : 'string' ;
T76 : 'host' ;
T77 : 'none' ;
T78 : 'max' ;
T79 : 'min' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 5908
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 5910
RULE_FLOAT : ('-'? ('0'..'9')+ '.' ('0'..'9')* (('e'|'E') ('+'|'-')? ('0'..'9')+)? 'f'?|'-'? ('0'..'9')+ 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 5912
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 5914
RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 5916
RULE_HOSTCODE : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 5918
RULE_COMMENT_ANNOTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 5920
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 5922
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 5924
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 5926
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 5928
RULE_ANY_OTHER : .;


