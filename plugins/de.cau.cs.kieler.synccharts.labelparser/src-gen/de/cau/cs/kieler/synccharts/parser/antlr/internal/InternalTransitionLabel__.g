lexer grammar InternalTransitionLabel;
@header {
package de.cau.cs.kieler.synccharts.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T13 : '#' ;
T14 : '/' ;
T15 : ',' ;
T16 : '(' ;
T17 : ')' ;
T18 : ':=' ;
T19 : '?' ;
T20 : '=' ;
T21 : '<' ;
T22 : '<=' ;
T23 : '>' ;
T24 : '>=' ;
T25 : 'not' ;
T26 : 'or' ;
T27 : 'and' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g" 1323
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') ('-'|'+')? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g" 1325
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g" 1327
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g" 1329
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g" 1331
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g" 1333
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g" 1335
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g" 1337
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g" 1339
RULE_ANY_OTHER : .;


