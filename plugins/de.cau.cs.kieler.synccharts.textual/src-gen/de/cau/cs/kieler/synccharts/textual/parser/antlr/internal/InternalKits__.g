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
T16 : 'interface: ' ;
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
T31 : 'state' ;
T32 : 'cond' ;
T33 : 'conditional' ;
T34 : 'var' ;
T35 : ':=' ;
T36 : ': ' ;
T37 : 'input' ;
T38 : 'output' ;
T39 : 'signal' ;
T40 : ': combine' ;
T41 : '@' ;
T42 : '.' ;
T43 : '(' ;
T44 : ')' ;
T45 : 'NORMAL' ;
T46 : 'ref' ;
T47 : 'textual' ;
T48 : 'NONE' ;
T49 : '+' ;
T50 : '*' ;
T51 : 'AND' ;
T52 : 'OR' ;
T53 : 'hostCombineOperator' ;
T54 : 'PURE' ;
T55 : 'boolean' ;
T56 : 'unsigned' ;
T57 : 'integer' ;
T58 : 'float' ;
T59 : 'hostType' ;
T60 : '-->' ;
T61 : 'o->' ;
T62 : '>->' ;
T63 : '?' ;
T64 : '=' ;
T65 : '<' ;
T66 : '<=' ;
T67 : '>' ;
T68 : '>=' ;
T69 : '<>' ;
T70 : 'not' ;
T71 : 'pre' ;
T72 : 'or' ;
T73 : 'and' ;
T74 : '-' ;
T75 : 'mod' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 4567
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 4569
RULE_FLOAT : ((RULE_INT '.' ('0'..'9')+|RULE_INT ('.' ('0'..'9')+)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 4571
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 4573
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 4575
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 4577
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 4579
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 4581
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g" 4583
RULE_ANY_OTHER : .;


