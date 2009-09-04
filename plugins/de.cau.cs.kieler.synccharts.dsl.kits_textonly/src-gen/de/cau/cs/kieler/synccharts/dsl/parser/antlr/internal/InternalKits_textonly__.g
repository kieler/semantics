lexer grammar InternalKits_textonly;
@header {
package de.cau.cs.kieler.synccharts.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'region' ;
T12 : 'init' ;
T13 : 'final' ;
T14 : 'state' ;
T15 : '{' ;
T16 : 'onentry' ;
T17 : 'oninner' ;
T18 : 'onexit' ;
T19 : 'suspension' ;
T20 : '||' ;
T21 : '}' ;
T22 : '@' ;
T23 : '#' ;
T24 : ';' ;
T25 : 'with' ;
T26 : ' history' ;
T27 : 'var' ;
T28 : ': ' ;
T29 : ':=' ;
T30 : 'inputoutput' ;
T31 : 'input' ;
T32 : 'output' ;
T33 : ': combine' ;
T34 : 'cond' ;
T35 : 'ref' ;
T36 : 'textual' ;
T37 : 'NONE' ;
T38 : '+' ;
T39 : '*' ;
T40 : 'AND' ;
T41 : 'OR' ;
T42 : 'hostCombineOperator' ;
T43 : 'PURE' ;
T44 : 'boolean' ;
T45 : 'unsigned' ;
T46 : 'integer' ;
T47 : 'float' ;
T48 : 'hostType' ;
T49 : '-->' ;
T50 : 'o->' ;
T51 : '>->' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits_textonly/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits_textonly.g" 5310
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits_textonly/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits_textonly.g" 5312
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits_textonly/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits_textonly.g" 5314
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits_textonly/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits_textonly.g" 5316
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits_textonly/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits_textonly.g" 5318
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits_textonly/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits_textonly.g" 5320
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits_textonly/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits_textonly.g" 5322
RULE_ANY_OTHER : .;


