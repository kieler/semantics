lexer grammar InternalKits;
@header {
package de.cau.cs.kieler.synccharts.dsl.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T13 : '?' ;
T14 : 'not' ;
T15 : 'pre' ;
T16 : 'or' ;
T17 : 'and' ;
T18 : '/' ;
T19 : 'region' ;
T20 : ';' ;
T21 : 'state' ;
T22 : 'cond' ;
T23 : 'conditional' ;
T24 : 'signal' ;
T25 : 'NORMAL' ;
T26 : 'ref' ;
T27 : 'textual' ;
T28 : 'NONE' ;
T29 : '+' ;
T30 : '*' ;
T31 : 'AND' ;
T32 : 'OR' ;
T33 : 'hostCombineOperator' ;
T34 : 'PURE' ;
T35 : 'boolean' ;
T36 : 'unsigned' ;
T37 : 'integer' ;
T38 : 'float' ;
T39 : 'hostType' ;
T40 : '-->' ;
T41 : 'o->' ;
T42 : '>->' ;
T43 : '=' ;
T44 : '<' ;
T45 : '<=' ;
T46 : '>' ;
T47 : '>=' ;
T48 : '<>' ;
T49 : '-' ;
T50 : 'mod' ;
T51 : 'onentry' ;
T52 : 'oninner' ;
T53 : 'onexit' ;
T54 : 'suspension' ;
T55 : '{' ;
T56 : '}' ;
T57 : '||' ;
T58 : 'with' ;
T59 : 'delay:=' ;
T60 : ',' ;
T61 : 'var' ;
T62 : ': ' ;
T63 : ':=' ;
T64 : ': combine' ;
T65 : '@' ;
T66 : '.' ;
T67 : '(' ;
T68 : ')' ;
T69 : 'init' ;
T70 : 'final' ;
T71 : '#' ;
T72 : ' history' ;
T73 : 'input' ;
T74 : 'output' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 7287
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 7289
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 7291
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 7293
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 7295
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 7297
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 7299
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 7301
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 7303
RULE_ANY_OTHER : .;


