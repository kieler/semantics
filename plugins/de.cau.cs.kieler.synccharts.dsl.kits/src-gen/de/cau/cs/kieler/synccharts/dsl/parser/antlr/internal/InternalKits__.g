lexer grammar InternalKits;
@header {
package de.cau.cs.kieler.synccharts.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T13 : 'region' ;
T14 : 'init' ;
T15 : 'final' ;
T16 : 'state' ;
T17 : '{' ;
T18 : 'onentry' ;
T19 : 'oninner' ;
T20 : 'onexit' ;
T21 : 'suspension' ;
T22 : '||' ;
T23 : '}' ;
T24 : '@' ;
T25 : 'with' ;
T26 : ' history' ;
T27 : ';' ;
T28 : 'var' ;
T29 : ': ' ;
T30 : ':=' ;
T31 : 'local' ;
T32 : 'input' ;
T33 : 'output' ;
T34 : ': combine' ;
T35 : '#' ;
T36 : '/' ;
T37 : ',' ;
T38 : '(' ;
T39 : ')' ;
T40 : '?' ;
T41 : '=' ;
T42 : '<' ;
T43 : '<=' ;
T44 : '>' ;
T45 : '>=' ;
T46 : 'not' ;
T47 : 'or' ;
T48 : 'and' ;
T49 : 'cond' ;
T50 : 'ref' ;
T51 : 'textual' ;
T52 : 'NONE' ;
T53 : '+' ;
T54 : '*' ;
T55 : 'AND' ;
T56 : 'OR' ;
T57 : 'hostCombineOperator' ;
T58 : 'PURE' ;
T59 : 'boolean' ;
T60 : 'unsigned' ;
T61 : 'integer' ;
T62 : 'float' ;
T63 : 'hostType' ;
T64 : '-->' ;
T65 : 'o->' ;
T66 : '>->' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 4396
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') ('-'|'+')? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 4398
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 4400
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 4402
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 4404
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 4406
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 4408
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 4410
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 4412
RULE_ANY_OTHER : .;


