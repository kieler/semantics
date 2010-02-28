lexer grammar InternalKits;
@header {
package de.cau.cs.kieler.synccharts.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T16 : 'region' ;
T17 : 'init' ;
T18 : 'final' ;
T19 : 'state' ;
T20 : 'onentry' ;
T21 : 'oninner' ;
T22 : 'onexit' ;
T23 : 'suspension' ;
T24 : '{' ;
T25 : '||' ;
T26 : '}' ;
T27 : 'with' ;
T28 : '#' ;
T29 : 'delay:=' ;
T30 : '/' ;
T31 : ',' ;
T32 : ' history' ;
T33 : ';' ;
T34 : 'cond' ;
T35 : 'conditional' ;
T36 : 'var' ;
T37 : ':=' ;
T38 : ': ' ;
T39 : 'input' ;
T40 : 'output' ;
T41 : 'signal' ;
T42 : ': combine' ;
T43 : '(' ;
T44 : ')' ;
T45 : 'NONE' ;
T46 : '+' ;
T47 : '*' ;
T48 : 'AND' ;
T49 : 'OR' ;
T50 : 'hostCombineOperator' ;
T51 : 'PURE' ;
T52 : 'boolean' ;
T53 : 'unsigned' ;
T54 : 'integer' ;
T55 : 'float' ;
T56 : 'hostType' ;
T57 : '-->' ;
T58 : 'o->' ;
T59 : '>->' ;
T60 : '?' ;
T61 : '=' ;
T62 : '<' ;
T63 : '<=' ;
T64 : '>' ;
T65 : '>=' ;
T66 : '<>' ;
T67 : 'not' ;
T68 : 'pre' ;
T69 : 'or' ;
T70 : 'and' ;
T71 : '-' ;
T72 : 'mod' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 3881
RULE_FULLSTATEID : (RULE_ID '@')? RULE_ID;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 3883
RULE_VARSIGVALUE : (RULE_INT|RULE_ID|RULE_BOOLEAN|RULE_STRING|RULE_FLOAT)+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 3885
RULE_QUALIFIEDNAME : (RULE_ID '.')* RULE_ID;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 3887
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 3889
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 3891
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 3893
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 3895
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 3897
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 3899
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 3901
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 3903
RULE_ANY_OTHER : .;


