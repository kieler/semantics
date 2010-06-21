lexer grammar InternalActions;
@header {
package de.cau.cs.kieler.synccharts.textual.actions.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'pre' ;
T12 : 'or' ;
T13 : 'and' ;
T14 : 'not' ;
T15 : '+' ;
T16 : '-' ;
T17 : '*' ;
T18 : 'mod' ;
T19 : '/' ;
T20 : '?' ;
T21 : 'E' ;
T22 : 'e' ;
T23 : 'true' ;
T24 : 'false' ;
T25 : '=' ;
T26 : '<' ;
T27 : '<=' ;
T28 : '>' ;
T29 : '>=' ;
T30 : '<>' ;
T31 : ',' ;
T32 : '(' ;
T33 : ')' ;
T34 : ':=' ;
T35 : '.' ;
T36 : '#' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.textual.actions.ui/src-gen/de/cau/cs/kieler/synccharts/textual/actions/ui/contentassist/antlr/internal/InternalActions.g" 5474
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.textual.actions.ui/src-gen/de/cau/cs/kieler/synccharts/textual/actions/ui/contentassist/antlr/internal/InternalActions.g" 5476
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.textual.actions.ui/src-gen/de/cau/cs/kieler/synccharts/textual/actions/ui/contentassist/antlr/internal/InternalActions.g" 5478
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.textual.actions.ui/src-gen/de/cau/cs/kieler/synccharts/textual/actions/ui/contentassist/antlr/internal/InternalActions.g" 5480
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.textual.actions.ui/src-gen/de/cau/cs/kieler/synccharts/textual/actions/ui/contentassist/antlr/internal/InternalActions.g" 5482
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.textual.actions.ui/src-gen/de/cau/cs/kieler/synccharts/textual/actions/ui/contentassist/antlr/internal/InternalActions.g" 5484
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.textual.actions.ui/src-gen/de/cau/cs/kieler/synccharts/textual/actions/ui/contentassist/antlr/internal/InternalActions.g" 5486
RULE_ANY_OTHER : .;


