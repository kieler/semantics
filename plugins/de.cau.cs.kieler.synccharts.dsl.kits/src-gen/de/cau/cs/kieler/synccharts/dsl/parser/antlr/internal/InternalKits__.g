lexer grammar InternalKits;
@header {
package de.cau.cs.kieler.synccharts.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T13 : 'region' ;
T14 : 'init' ;
T15 : 'final' ;
T16 : 'state' ;
T17 : 'onentry' ;
T18 : 'oninner' ;
T19 : 'onexit' ;
T20 : 'suspension' ;
T21 : '{' ;
T22 : '||' ;
T23 : '}' ;
T24 : '@' ;
T25 : 'with' ;
T26 : '#' ;
T27 : 'delay:=' ;
T28 : '/' ;
T29 : ',' ;
T30 : ' history' ;
T31 : ';' ;
T32 : 'cond' ;
T33 : 'conditional' ;
T34 : 'var' ;
T35 : ':=' ;
T36 : ': ' ;
T37 : 'input' ;
T38 : 'output' ;
T39 : 'signal' ;
T40 : ': combine' ;
T41 : '.' ;
T42 : '(' ;
T43 : ')' ;
T44 : 'NORMAL' ;
T45 : 'ref' ;
T46 : 'textual' ;
T47 : '-->' ;
T48 : 'o->' ;
T49 : '>->' ;
T50 : '?' ;
T51 : '=' ;
T52 : '<' ;
T53 : '<=' ;
T54 : '>' ;
T55 : '>=' ;
T56 : '<>' ;
T57 : 'not' ;
T58 : 'pre' ;
T59 : 'or' ;
T60 : 'and' ;
T61 : '+' ;
T62 : '-' ;
T63 : '*' ;
T64 : 'mod' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 3955
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 3957
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 3959
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 3961
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 3963
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 3965
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 3967
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 3969
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 3971
RULE_ANY_OTHER : .;


