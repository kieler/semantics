lexer grammar InternalRetypingSynccharts;
@header {
package de.cau.cs.kieler.synccharts.dsl.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'state' ;
T12 : 'NORMAL' ;
T13 : 'cond' ;
T14 : 'ref' ;
T15 : 'textual' ;
T16 : 'NONE' ;
T17 : '+' ;
T18 : '*' ;
T19 : 'AND' ;
T20 : 'OR' ;
T21 : 'host' ;
T22 : 'PURE' ;
T23 : 'boolean' ;
T24 : 'unsigned' ;
T25 : 'integer' ;
T26 : 'float' ;
T27 : '-->' ;
T28 : 'o->' ;
T29 : '>->' ;
T30 : '[' ;
T31 : ']' ;
T32 : ',' ;
T33 : '{' ;
T34 : '}' ;
T35 : 'onentry' ;
T36 : 'oninner' ;
T37 : 'onexit' ;
T38 : 'suspension' ;
T39 : '||' ;
T40 : '/' ;
T41 : '@' ;
T42 : 'region' ;
T43 : ';' ;
T44 : 'with ' ;
T45 : ':= ' ;
T46 : ': ' ;
T47 : 'combine' ;
T48 : 'with' ;
T49 : 'init' ;
T50 : 'final' ;
T51 : '#' ;
T52 : ' history' ;
T53 : 'local' ;
T54 : 'input' ;
T55 : 'output' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g" 7181
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g" 7183
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g" 7185
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g" 7187
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g" 7189
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g" 7191
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g" 7193
RULE_ANY_OTHER : .;


