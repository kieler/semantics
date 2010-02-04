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
T20 : 'init' ;
T21 : 'initial' ;
T22 : 'final' ;
T23 : 'cond' ;
T24 : 'conditional' ;
T25 : 'signal' ;
T26 : 'NORMAL' ;
T27 : 'ref' ;
T28 : 'textual' ;
T29 : 'NONE' ;
T30 : '+' ;
T31 : '*' ;
T32 : 'AND' ;
T33 : 'OR' ;
T34 : 'hostCombineOperator' ;
T35 : 'PURE' ;
T36 : 'boolean' ;
T37 : 'unsigned' ;
T38 : 'integer' ;
T39 : 'float' ;
T40 : 'hostType' ;
T41 : '-->' ;
T42 : 'o->' ;
T43 : '>->' ;
T44 : '=' ;
T45 : '<' ;
T46 : '<=' ;
T47 : '>' ;
T48 : '>=' ;
T49 : '-' ;
T50 : 'mod' ;
T51 : 'state' ;
T52 : 'onentry' ;
T53 : 'oninner' ;
T54 : 'onexit' ;
T55 : 'suspension' ;
T56 : '{' ;
T57 : '}' ;
T58 : '||' ;
T59 : '@' ;
T60 : ';' ;
T61 : 'with' ;
T62 : 'delay:=' ;
T63 : ',' ;
T64 : 'var' ;
T65 : ': ' ;
T66 : ':=' ;
T67 : ': combine' ;
T68 : '.' ;
T69 : '(' ;
T70 : ')' ;
T71 : '#' ;
T72 : ' history' ;
T73 : 'input' ;
T74 : 'output' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 7074
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 7076
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 7078
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 7080
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 7082
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 7084
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 7086
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 7088
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 7090
RULE_ANY_OTHER : .;


