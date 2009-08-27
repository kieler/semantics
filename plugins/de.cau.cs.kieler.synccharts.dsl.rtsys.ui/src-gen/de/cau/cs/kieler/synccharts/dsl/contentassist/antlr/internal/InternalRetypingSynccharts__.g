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
T42 : ';' ;
T43 : 'with' ;
T44 : 'var' ;
T45 : ': ' ;
T46 : ':=' ;
T47 : ': combine' ;
T48 : 'init' ;
T49 : 'final' ;
T50 : '#' ;
T51 : ' history' ;
T52 : 'inputoutput' ;
T53 : 'input' ;
T54 : 'output' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g" 7361
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g" 7363
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g" 7365
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g" 7367
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g" 7369
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g" 7371
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g" 7373
RULE_ANY_OTHER : .;


