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
T51 : 'interface: ' ;
T52 : 'onentry' ;
T53 : 'oninner' ;
T54 : 'onexit' ;
T55 : 'suspension' ;
T56 : '{' ;
T57 : '}' ;
T58 : '||' ;
T59 : 'with' ;
T60 : 'delay:=' ;
T61 : ',' ;
T62 : 'var' ;
T63 : ': ' ;
T64 : ':=' ;
T65 : ': combine' ;
T66 : '@' ;
T67 : '.' ;
T68 : '(' ;
T69 : ')' ;
T70 : 'init' ;
T71 : 'final' ;
T72 : '#' ;
T73 : ' history' ;
T74 : 'input' ;
T75 : 'output' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 8223
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 8225
RULE_FLOAT : ((RULE_INT '.' ('0'..'9')+|RULE_INT ('.' ('0'..'9')+)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 8227
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 8229
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 8231
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 8233
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 8235
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 8237
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.dsl.kits.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits.g" 8239
RULE_ANY_OTHER : .;


