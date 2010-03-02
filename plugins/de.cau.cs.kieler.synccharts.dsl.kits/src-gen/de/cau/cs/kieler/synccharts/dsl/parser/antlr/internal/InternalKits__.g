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
T21 : ';' ;
T22 : '{' ;
T23 : '||' ;
T24 : '}' ;
T25 : 'with' ;
T26 : '#' ;
T27 : 'delay:=' ;
T28 : '/' ;
T29 : ',' ;
T30 : ' history' ;
T31 : 'cond' ;
T32 : 'conditional' ;
T33 : 'var' ;
T34 : ':=' ;
T35 : ': ' ;
T36 : 'input' ;
T37 : 'output' ;
T38 : 'signal' ;
T39 : ': combine' ;
T40 : '@' ;
T41 : '.' ;
T42 : '(' ;
T43 : ')' ;
T44 : 'NORMAL' ;
T45 : 'ref' ;
T46 : 'textual' ;
T47 : 'NONE' ;
T48 : '+' ;
T49 : '*' ;
T50 : 'AND' ;
T51 : 'OR' ;
T52 : 'hostCombineOperator' ;
T53 : 'PURE' ;
T54 : 'boolean' ;
T55 : 'unsigned' ;
T56 : 'integer' ;
T57 : 'float' ;
T58 : 'hostType' ;
T59 : '-->' ;
T60 : 'o->' ;
T61 : '>->' ;
T62 : '?' ;
T63 : '=' ;
T64 : '<' ;
T65 : '<=' ;
T66 : '>' ;
T67 : '>=' ;
T68 : '<>' ;
T69 : 'not' ;
T70 : 'pre' ;
T71 : 'or' ;
T72 : 'and' ;
T73 : '-' ;
T74 : 'mod' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 4130
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 4132
RULE_FLOAT : ((RULE_INT '.' ('0'..'9')+|RULE_INT ('.' ('0'..'9')+)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 4134
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 4136
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 4138
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 4140
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 4142
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 4144
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 4146
RULE_ANY_OTHER : .;


