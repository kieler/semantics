lexer grammar InternalTSC;
@header {
package de.cau.cs.kieler.synccharts.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T13 : 'init' ;
T14 : 'final' ;
T15 : 'state' ;
T16 : '{' ;
T17 : '||' ;
T18 : '}' ;
T19 : 'onentry' ;
T20 : '/' ;
T21 : 'onexit' ;
T22 : 'oninner' ;
T23 : 'with' ;
T24 : '(' ;
T25 : ')' ;
T26 : ':=' ;
T27 : 'input' ;
T28 : ';' ;
T29 : 'var' ;
T30 : 'pseudo' ;
T31 : 'reference' ;
T32 : 'textual' ;
T33 : 'o->' ;
T34 : '-->' ;
T35 : '>->' ;
T36 : '=' ;
T37 : '<' ;
T38 : '<=' ;
T39 : '>' ;
T40 : '>=' ;
T41 : 'not' ;
T42 : 'and' ;
T43 : 'or' ;
T44 : '+' ;
T45 : '-' ;
T46 : '*' ;
T47 : 'div' ;
T48 : 'mod' ;
T49 : '?' ;
T50 : 'pre' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.textualsyncchart/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalTSC.g" 2299
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') ('-'|'+')? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.textualsyncchart/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalTSC.g" 2301
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.textualsyncchart/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalTSC.g" 2303
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.textualsyncchart/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalTSC.g" 2305
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.textualsyncchart/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalTSC.g" 2307
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.textualsyncchart/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalTSC.g" 2309
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.textualsyncchart/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalTSC.g" 2311
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.textualsyncchart/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalTSC.g" 2313
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.textualsyncchart/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalTSC.g" 2315
RULE_ANY_OTHER : .;


