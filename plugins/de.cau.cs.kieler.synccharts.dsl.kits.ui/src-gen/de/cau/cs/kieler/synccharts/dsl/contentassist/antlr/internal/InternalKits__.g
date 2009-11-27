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
T19 : 'NORMAL' ;
T20 : 'cond' ;
T21 : 'ref' ;
T22 : 'textual' ;
T23 : 'NONE' ;
T24 : '+' ;
T25 : '*' ;
T26 : 'AND' ;
T27 : 'OR' ;
T28 : 'hostCombineOperator' ;
T29 : 'PURE' ;
T30 : 'boolean' ;
T31 : 'unsigned' ;
T32 : 'integer' ;
T33 : 'float' ;
T34 : 'hostType' ;
T35 : '-->' ;
T36 : 'o->' ;
T37 : '>->' ;
T38 : '=' ;
T39 : '<' ;
T40 : '<=' ;
T41 : '>' ;
T42 : '>=' ;
T43 : '-' ;
T44 : 'mod' ;
T45 : 'region' ;
T46 : 'state' ;
T47 : 'onentry' ;
T48 : 'oninner' ;
T49 : 'onexit' ;
T50 : 'suspension' ;
T51 : '{' ;
T52 : '}' ;
T53 : '||' ;
T54 : '@' ;
T55 : ';' ;
T56 : 'with' ;
T57 : 'var' ;
T58 : ': ' ;
T59 : ':=' ;
T60 : ': combine' ;
T61 : '.' ;
T62 : ',' ;
T63 : '(' ;
T64 : ')' ;
T65 : 'init' ;
T66 : 'final' ;
T67 : '#' ;
T68 : ' history' ;
T69 : 'input' ;
T70 : 'output' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 6237
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 6239
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 6241
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 6243
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 6245
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 6247
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 6249
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 6251
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 6253
RULE_ANY_OTHER : .;


