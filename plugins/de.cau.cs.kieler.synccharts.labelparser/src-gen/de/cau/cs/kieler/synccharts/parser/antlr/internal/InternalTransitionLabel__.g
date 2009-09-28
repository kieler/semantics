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
T26 : 'pre' ;
T27 : 'or' ;
T28 : 'and' ;
T29 : '+' ;
T30 : '-' ;
T31 : '*' ;
T32 : 'mod' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g" 2040
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g" 2042
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g" 2044
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g" 2046
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g" 2048
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g" 2050
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g" 2052
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g" 2054
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g" 2056
RULE_ANY_OTHER : .;


