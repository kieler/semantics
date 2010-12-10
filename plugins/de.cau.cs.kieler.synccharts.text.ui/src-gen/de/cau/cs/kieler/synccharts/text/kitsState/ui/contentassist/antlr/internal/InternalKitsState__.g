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
T39 : 'bool' ;
T40 : 'unsigned' ;
T41 : 'int' ;
T42 : 'float' ;
T43 : 'host' ;
T44 : 'none' ;
T45 : 'max' ;
T46 : 'min' ;
T47 : 'region' ;
T48 : 'code' ;
T49 : '(' ;
T50 : ')' ;
T51 : 'state' ;
T52 : '@' ;
T53 : '[' ;
T54 : ']' ;
T55 : ',' ;
T56 : '{' ;
T57 : '}' ;
T58 : 'onentry' ;
T59 : 'oninner' ;
T60 : 'onexit' ;
T61 : 'suspension' ;
T62 : 'with' ;
T63 : '/' ;
T64 : 'signal' ;
T65 : ':=' ;
T66 : 'combine' ;
T67 : 'var' ;
T68 : 'input' ;
T69 : ';' ;
T70 : 'output' ;
T71 : 'inputoutput' ;
T72 : 'return' ;
T73 : 'import' ;
T74 : 'init' ;
T75 : 'final' ;
T76 : '#' ;
T77 : 'history' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/ui/contentassist/antlr/internal/InternalKitsState.g" 12862
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/ui/contentassist/antlr/internal/InternalKitsState.g" 12864
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/ui/contentassist/antlr/internal/InternalKitsState.g" 12866
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/ui/contentassist/antlr/internal/InternalKitsState.g" 12868
RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/ui/contentassist/antlr/internal/InternalKitsState.g" 12870
RULE_HOSTCODE : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/ui/contentassist/antlr/internal/InternalKitsState.g" 12872
RULE_COMMENT_ANNOTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/ui/contentassist/antlr/internal/InternalKitsState.g" 12874
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/ui/contentassist/antlr/internal/InternalKitsState.g" 12876
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/ui/contentassist/antlr/internal/InternalKitsState.g" 12878
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/ui/contentassist/antlr/internal/InternalKitsState.g" 12880
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kitsState/ui/contentassist/antlr/internal/InternalKitsState.g" 12882
RULE_ANY_OTHER : .;


