lexer grammar InternalKits;
@header {
package de.cau.cs.kieler.synccharts.dsl.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T16 : '?' ;
T17 : 'not' ;
T18 : 'pre' ;
T19 : 'or' ;
T20 : 'and' ;
T21 : '/' ;
T22 : 'region' ;
T23 : 'state' ;
T24 : 'cond' ;
T25 : 'conditional' ;
T26 : 'signal' ;
T27 : 'NONE' ;
T28 : '+' ;
T29 : '*' ;
T30 : 'AND' ;
T31 : 'OR' ;
T32 : 'hostCombineOperator' ;
T33 : 'PURE' ;
T34 : 'boolean' ;
T35 : 'unsigned' ;
T36 : 'integer' ;
T37 : 'float' ;
T38 : 'hostType' ;
T39 : '-->' ;
T40 : 'o->' ;
T41 : '>->' ;
T42 : '=' ;
T43 : '<' ;
T44 : '<=' ;
T45 : '>' ;
T46 : '>=' ;
T47 : '<>' ;
T48 : '-' ;
T49 : 'mod' ;
T50 : 'onentry' ;
T51 : 'oninner' ;
T52 : 'onexit' ;
T53 : 'suspension' ;
T54 : '{' ;
T55 : '}' ;
T56 : '||' ;
T57 : ';' ;
T58 : 'with' ;
T59 : 'delay:=' ;
T60 : ',' ;
T61 : 'var' ;
T62 : ': ' ;
T63 : ':=' ;
T64 : ': combine' ;
T65 : '(' ;
T66 : ')' ;
T67 : 'init' ;
T68 : 'final' ;
T69 : '#' ;
T70 : ' history' ;
T71 : 'input' ;
T72 : 'output' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 6900
RULE_FULLSTATEID : (RULE_ID '@')? RULE_ID;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 6902
RULE_VARSIGVALUE : (RULE_INT|RULE_ID|RULE_BOOLEAN|RULE_STRING|RULE_FLOAT)+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 6904
RULE_QUALIFIEDNAME : (RULE_ID '.')* RULE_ID;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 6906
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 6908
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 6910
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 6912
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 6914
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 6916
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 6918
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 6920
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 6922
RULE_ANY_OTHER : .;


