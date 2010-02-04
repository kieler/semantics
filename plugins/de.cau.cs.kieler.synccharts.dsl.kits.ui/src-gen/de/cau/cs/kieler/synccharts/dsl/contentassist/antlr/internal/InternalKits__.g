lexer grammar InternalKits;
@header {
package de.cau.cs.kieler.synccharts.dsl.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T13 : '?' ;
T14 : 'not' ;
T15 : 'pre' ;
T16 : 'or' ;
T17 : 'and' ;
T18 : '/' ;
T19 : 'region' ;
T20 : 'cond' ;
T21 : 'conditional' ;
T22 : 'signal' ;
T23 : 'NORMAL' ;
T24 : 'ref' ;
T25 : 'textual' ;
T26 : 'NONE' ;
T27 : '+' ;
T28 : '*' ;
T29 : 'AND' ;
T30 : 'OR' ;
T31 : 'hostCombineOperator' ;
T32 : 'PURE' ;
T33 : 'boolean' ;
T34 : 'unsigned' ;
T35 : 'integer' ;
T36 : 'float' ;
T37 : 'hostType' ;
T38 : '-->' ;
T39 : 'o->' ;
T40 : '>->' ;
T41 : '=' ;
T42 : '<' ;
T43 : '<=' ;
T44 : '>' ;
T45 : '>=' ;
T46 : '-' ;
T47 : 'mod' ;
T48 : 'state' ;
T49 : 'onentry' ;
T50 : 'oninner' ;
T51 : 'onexit' ;
T52 : 'suspension' ;
T53 : '{' ;
T54 : '}' ;
T55 : '||' ;
T56 : '@' ;
T57 : ';' ;
T58 : 'with' ;
T59 : 'delay:=' ;
T60 : ',' ;
T61 : 'var' ;
T62 : ': ' ;
T63 : ':=' ;
T64 : ': combine' ;
T65 : '.' ;
T66 : '(' ;
T67 : ')' ;
T68 : 'init' ;
T69 : 'final' ;
T70 : '#' ;
T71 : ' history' ;
T72 : 'input' ;
T73 : 'output' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 7109
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 7111
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 7113
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 7115
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 7117
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 7119
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 7121
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 7123
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 7125
RULE_ANY_OTHER : .;


