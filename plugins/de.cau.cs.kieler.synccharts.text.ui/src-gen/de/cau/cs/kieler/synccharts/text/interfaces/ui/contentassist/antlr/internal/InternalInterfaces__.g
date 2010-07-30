lexer grammar InternalInterfaces;
@header {
package de.cau.cs.kieler.synccharts.text.interfaces.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T15 : 'pre' ;
T16 : 'or' ;
T17 : 'and' ;
T18 : 'not' ;
T19 : '+' ;
T20 : '-' ;
T21 : '*' ;
T22 : 'mod' ;
T23 : '/' ;
T24 : '?' ;
T25 : '=' ;
T26 : '<' ;
T27 : '<=' ;
T28 : '>' ;
T29 : '>=' ;
T30 : '<>' ;
T31 : 'PURE' ;
T32 : 'BOOL' ;
T33 : 'UNSIGNED' ;
T34 : 'INT' ;
T35 : 'FLOAT' ;
T36 : 'HOST' ;
T37 : 'NONE' ;
T38 : 'max' ;
T39 : 'min' ;
T40 : 'host' ;
T41 : 'input' ;
T42 : 'output' ;
T43 : 'signal' ;
T44 : 'variable' ;
T45 : ':' ;
T46 : ';' ;
T47 : 'var' ;
T48 : ',' ;
T49 : ':=' ;
T50 : 'combine' ;
T51 : 'with' ;
T52 : '(' ;
T53 : ')' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 10261
RULE_STRING_D : ('"' '"'|'"' ('\\' '"'|~('"'))* ('\\' '"'|~(('\\'|'"'))) '"');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 10263
RULE_STRING_S : ('\'' '\''|'\'' ('\\' '\''|~('\''))* ('\\' '\''|~(('\\'|'\''))) '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 10265
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 10267
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 10269
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 10271
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 10273
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 10275
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 10277
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 10279
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 10281
RULE_ANY_OTHER : .;


