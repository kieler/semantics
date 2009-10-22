lexer grammar InternalKits;
@header {
package de.cau.cs.kieler.synccharts.dsl.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T13 : '?' ;
T14 : 'not' ;
T15 : 'or' ;
T16 : 'and' ;
T17 : 'state' ;
T18 : '=' ;
T19 : '<' ;
T20 : '<=' ;
T21 : '>' ;
T22 : '>=' ;
T23 : 'cond' ;
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
T41 : 'region' ;
T42 : '{' ;
T43 : '}' ;
T44 : 'onentry' ;
T45 : 'oninner' ;
T46 : 'onexit' ;
T47 : 'suspension' ;
T48 : '||' ;
T49 : '@' ;
T50 : ';' ;
T51 : 'with' ;
T52 : '/' ;
T53 : ',' ;
T54 : 'var' ;
T55 : ': ' ;
T56 : ':=' ;
T57 : ': combine' ;
T58 : '(' ;
T59 : ')' ;
T60 : 'init' ;
T61 : 'final' ;
T62 : '#' ;
T63 : ' history' ;
T64 : 'input' ;
T65 : 'output' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 9101
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') ('-'|'+')? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 9103
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 9105
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 9107
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 9109
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 9111
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 9113
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 9115
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 9117
RULE_ANY_OTHER : .;


