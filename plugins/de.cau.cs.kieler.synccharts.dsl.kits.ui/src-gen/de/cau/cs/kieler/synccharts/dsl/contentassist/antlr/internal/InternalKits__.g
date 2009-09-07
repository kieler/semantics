lexer grammar InternalKits;
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
T38 : ';' ;
T39 : 'var' ;
T40 : ': ' ;
T41 : ':=' ;
T42 : ': combine' ;
T43 : 'with' ;
T44 : '@' ;
T45 : 'init' ;
T46 : 'final' ;
T47 : '#' ;
T48 : 'input' ;
T49 : 'output' ;
T50 : ' history' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 7051
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 7053
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 7055
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 7057
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 7059
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 7061
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 7063
RULE_ANY_OTHER : .;


