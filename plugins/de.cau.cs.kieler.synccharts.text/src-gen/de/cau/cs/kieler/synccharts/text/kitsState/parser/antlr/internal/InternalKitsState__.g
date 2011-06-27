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
T48 : '.' ;
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

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 6867
RULE_HOSTCODE : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 6869
RULE_COMMENT_ANNOTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 6871
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 6873
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 6875
RULE_FLOAT : ('-'? ('0'..'9')+ '.' ('0'..'9')* (('e'|'E') ('+'|'-')? ('0'..'9')+)? 'f'?|'-'? ('0'..'9')+ 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 6877
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 6879
RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 6881
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 6883
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 6885
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/parser/antlr/internal/InternalKitsState.g" 6887
RULE_ANY_OTHER : .;


