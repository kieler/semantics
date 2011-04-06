lexer grammar InternalKitsState;
@header {
package de.cau.cs.kieler.synccharts.text.kitsState.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T16 : ':' ;
T17 : 'pre' ;
T18 : 'or' ;
T19 : 'and' ;
T20 : 'not' ;
T21 : '+' ;
T22 : '-' ;
T23 : '*' ;
T24 : 'mod' ;
T25 : '?' ;
T26 : 'normal' ;
T27 : 'conditional' ;
T28 : 'reference' ;
T29 : 'textual' ;
T30 : '-->' ;
T31 : 'o->' ;
T32 : '>->' ;
T33 : '=' ;
T34 : '<' ;
T35 : '<=' ;
T36 : '>' ;
T37 : '>=' ;
T38 : '<>' ;
T39 : 'pure' ;
T40 : 'boolean' ;
T41 : 'unsigned' ;
T42 : 'integer' ;
T43 : 'float' ;
T44 : 'double' ;
T45 : 'string' ;
T46 : 'host' ;
T47 : 'none' ;
T48 : 'max' ;
T49 : 'min' ;
T50 : 'region' ;
T51 : 'code' ;
T52 : '(' ;
T53 : ')' ;
T54 : 'state' ;
T55 : '@' ;
T56 : '[' ;
T57 : ']' ;
T58 : ',' ;
T59 : '{' ;
T60 : '}' ;
T61 : 'onentry' ;
T62 : 'oninner' ;
T63 : 'onexit' ;
T64 : 'suspension' ;
T65 : 'with' ;
T66 : '/' ;
T67 : 'signal' ;
T68 : ':=' ;
T69 : 'combine' ;
T70 : 'var' ;
T71 : 'input' ;
T72 : ';' ;
T73 : 'output' ;
T74 : 'inputoutput' ;
T75 : 'return' ;
T76 : 'import' ;
T77 : 'init' ;
T78 : 'final' ;
T79 : '#' ;
T80 : 'history' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/ui/contentassist/antlr/internal/InternalKitsState.g" 15195
RULE_HOSTCODE : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/ui/contentassist/antlr/internal/InternalKitsState.g" 15197
RULE_COMMENT_ANNOTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/ui/contentassist/antlr/internal/InternalKitsState.g" 15199
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/ui/contentassist/antlr/internal/InternalKitsState.g" 15201
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/ui/contentassist/antlr/internal/InternalKitsState.g" 15203
RULE_FLOAT : ('-'? ('0'..'9')+ '.' ('0'..'9')* (('e'|'E') ('+'|'-')? ('0'..'9')+)? 'f'?|'-'? ('0'..'9')+ 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/ui/contentassist/antlr/internal/InternalKitsState.g" 15205
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/ui/contentassist/antlr/internal/InternalKitsState.g" 15207
RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/ui/contentassist/antlr/internal/InternalKitsState.g" 15209
RULE_TYPEID : '[' ('a'..'z'|'A'..'Z'|'_'|'.') ('a'..'z'|'A'..'Z'|'_'|'.'|'0'..'9')* ']';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/ui/contentassist/antlr/internal/InternalKitsState.g" 15211
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/ui/contentassist/antlr/internal/InternalKitsState.g" 15213
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/ui/contentassist/antlr/internal/InternalKitsState.g" 15215
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/ui/contentassist/antlr/internal/InternalKitsState.g" 15217
RULE_ANY_OTHER : .;


