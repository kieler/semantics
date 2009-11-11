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
T19 : 'state' ;
T20 : 'NORMAL' ;
T21 : 'cond' ;
T22 : 'ref' ;
T23 : 'textual' ;
T24 : 'NONE' ;
T25 : '+' ;
T26 : '*' ;
T27 : 'AND' ;
T28 : 'OR' ;
T29 : 'hostCombineOperator' ;
T30 : 'PURE' ;
T31 : 'boolean' ;
T32 : 'unsigned' ;
T33 : 'integer' ;
T34 : 'float' ;
T35 : 'hostType' ;
T36 : '-->' ;
T37 : 'o->' ;
T38 : '>->' ;
T39 : '=' ;
T40 : '<' ;
T41 : '<=' ;
T42 : '>' ;
T43 : '>=' ;
T44 : '-' ;
T45 : 'mod' ;
T46 : 'region' ;
T47 : '{' ;
T48 : '}' ;
T49 : 'onentry' ;
T50 : 'oninner' ;
T51 : 'onexit' ;
T52 : 'suspension' ;
T53 : '||' ;
T54 : '@' ;
T55 : ';' ;
T56 : 'with' ;
T57 : ',' ;
T58 : 'var' ;
T59 : ': ' ;
T60 : ':=' ;
T61 : ': combine' ;
T62 : '.' ;
T63 : '(' ;
T64 : ')' ;
T65 : 'init' ;
T66 : 'final' ;
T67 : '#' ;
T68 : ' history' ;
T69 : 'input' ;
T70 : 'output' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 10483
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 10485
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 10487
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 10489
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 10491
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 10493
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 10495
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 10497
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 10499
RULE_ANY_OTHER : .;


