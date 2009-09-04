lexer grammar InternalKits_textonly;
@header {
package de.cau.cs.kieler.synccharts.dsl.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'state' ;
T12 : 'cond' ;
T13 : 'ref' ;
T14 : 'textual' ;
T15 : 'NONE' ;
T16 : '+' ;
T17 : '*' ;
T18 : 'AND' ;
T19 : 'OR' ;
T20 : 'hostCombineOperator' ;
T21 : 'PURE' ;
T22 : 'boolean' ;
T23 : 'unsigned' ;
T24 : 'integer' ;
T25 : 'float' ;
T26 : 'hostType' ;
T27 : '-->' ;
T28 : 'o->' ;
T29 : '>->' ;
T30 : 'region' ;
T31 : '{' ;
T32 : '}' ;
T33 : 'onentry' ;
T34 : 'oninner' ;
T35 : 'onexit' ;
T36 : 'suspension' ;
T37 : '||' ;
T38 : '@' ;
T39 : ';' ;
T40 : 'with' ;
T41 : 'var' ;
T42 : ': ' ;
T43 : ':=' ;
T44 : ': combine' ;
T45 : 'init' ;
T46 : 'final' ;
T47 : '#' ;
T48 : ' history' ;
T49 : 'inputoutput' ;
T50 : 'input' ;
T51 : 'output' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g" 11432
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g" 11434
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g" 11436
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g" 11438
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g" 11440
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g" 11442
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g" 11444
RULE_ANY_OTHER : .;


