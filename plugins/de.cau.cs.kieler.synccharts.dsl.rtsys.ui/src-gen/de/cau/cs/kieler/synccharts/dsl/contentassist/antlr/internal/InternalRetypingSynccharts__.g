lexer grammar InternalRetypingSynccharts;
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
T20 : 'host' ;
T21 : 'PURE' ;
T22 : 'boolean' ;
T23 : 'unsigned' ;
T24 : 'integer' ;
T25 : 'float' ;
T26 : '-->' ;
T27 : 'o->' ;
T28 : '>->' ;
T29 : '[' ;
T30 : ']' ;
T31 : ',' ;
T32 : '{' ;
T33 : '}' ;
T34 : 'onentry' ;
T35 : 'oninner' ;
T36 : 'onexit' ;
T37 : 'suspension' ;
T38 : '||' ;
T39 : '/' ;
T40 : '@' ;
T41 : 'region' ;
T42 : ';' ;
T43 : 'with ' ;
T44 : ':= ' ;
T45 : ': ' ;
T46 : 'combine' ;
T47 : 'with' ;
T48 : 'init' ;
T49 : 'final' ;
T50 : '#' ;
T51 : ' history' ;
T52 : 'local' ;
T53 : 'input' ;
T54 : 'output' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g" 7184
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g" 7186
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g" 7188
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g" 7190
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g" 7192
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g" 7194
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g" 7196
RULE_ANY_OTHER : .;


