lexer grammar InternalKitsState;
@header {
package de.cau.cs.kieler.synccharts.text.kitsState.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T15 : ':' ;
T16 : 'pre' ;
T17 : 'or' ;
T18 : 'and' ;
T19 : 'not' ;
T20 : '+' ;
T21 : '-' ;
T22 : '*' ;
T23 : 'mod' ;
T24 : '?' ;
T25 : 'normal' ;
T26 : 'conditional' ;
T27 : 'reference' ;
T28 : 'textual' ;
T29 : '-->' ;
T30 : 'o->' ;
T31 : '>->' ;
T32 : '=' ;
T33 : '<' ;
T34 : '<=' ;
T35 : '>' ;
T36 : '>=' ;
T37 : '<>' ;
T38 : 'pure' ;
T39 : 'boolean' ;
T40 : 'unsigned' ;
T41 : 'integer' ;
T42 : 'float' ;
T43 : 'double' ;
T44 : 'string' ;
T45 : 'host' ;
T46 : 'none' ;
T47 : 'max' ;
T48 : 'min' ;
T49 : 'region' ;
T50 : 'code' ;
T51 : '(' ;
T52 : ')' ;
T53 : 'state' ;
T54 : '@' ;
T55 : '[' ;
T56 : ']' ;
T57 : ',' ;
T58 : '{' ;
T59 : '}' ;
T60 : 'onentry' ;
T61 : 'oninner' ;
T62 : 'onexit' ;
T63 : 'suspension' ;
T64 : 'with' ;
T65 : '/' ;
T66 : 'signal' ;
T67 : ':=' ;
T68 : 'combine' ;
T69 : 'var' ;
T70 : 'input' ;
T71 : ';' ;
T72 : 'output' ;
T73 : 'inputoutput' ;
T74 : 'return' ;
T75 : 'import' ;
T76 : '.' ;
T77 : 'init' ;
T78 : 'final' ;
T79 : '#' ;
T80 : 'history' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/ui/contentassist/antlr/internal/InternalKitsState.g" 15413
RULE_HOSTCODE : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/ui/contentassist/antlr/internal/InternalKitsState.g" 15415
RULE_COMMENT_ANNOTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/ui/contentassist/antlr/internal/InternalKitsState.g" 15417
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/ui/contentassist/antlr/internal/InternalKitsState.g" 15419
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/ui/contentassist/antlr/internal/InternalKitsState.g" 15421
RULE_FLOAT : ('-'? ('0'..'9')+ '.' ('0'..'9')* (('e'|'E') ('+'|'-')? ('0'..'9')+)? 'f'?|'-'? ('0'..'9')+ 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/ui/contentassist/antlr/internal/InternalKitsState.g" 15423
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/ui/contentassist/antlr/internal/InternalKitsState.g" 15425
RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/ui/contentassist/antlr/internal/InternalKitsState.g" 15427
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/ui/contentassist/antlr/internal/InternalKitsState.g" 15429
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/ui/contentassist/antlr/internal/InternalKitsState.g" 15431
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/ui/contentassist/antlr/internal/InternalKitsState.g" 15433
RULE_ANY_OTHER : .;


