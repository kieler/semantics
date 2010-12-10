lexer grammar InternalInterfaces;
@header {
package de.cau.cs.kieler.synccharts.text.interfaces.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T17 : ':' ;
T18 : 'pre' ;
T19 : 'or' ;
T20 : 'and' ;
T21 : 'not' ;
T22 : '+' ;
T23 : '-' ;
T24 : '*' ;
T25 : 'mod' ;
T26 : '?' ;
T27 : '=' ;
T28 : '<' ;
T29 : '<=' ;
T30 : '>' ;
T31 : '>=' ;
T32 : '<>' ;
T33 : 'pure' ;
T34 : 'bool' ;
T35 : 'unsigned' ;
T36 : 'int' ;
T37 : 'float' ;
T38 : 'host' ;
T39 : 'none' ;
T40 : 'max' ;
T41 : 'min' ;
T42 : 'input' ;
T43 : 'output' ;
T44 : 'signal' ;
T45 : 'variable' ;
T46 : ';' ;
T47 : 'var' ;
T48 : ',' ;
T49 : ':=' ;
T50 : 'combine' ;
T51 : 'with' ;
T52 : '(' ;
T53 : ')' ;
T54 : 'inputoutput' ;
T55 : 'return' ;
T56 : '@' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 13202
RULE_STRING_D : ('"' '"'|'"' ('\\' '"'|~('"'))* ('\\' '"'|~(('\\'|'"'))) '"');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 13204
RULE_STRING_S : ('\'' '\''|'\'' ('\\' '\''|~('\''))* ('\\' '\''|~(('\\'|'\''))) '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 13206
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 13208
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 13210
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 13212
RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 13214
RULE_HOSTCODE : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 13216
RULE_COMMENT_ANNOTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 13218
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 13220
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 13222
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 13224
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 13226
RULE_ANY_OTHER : .;


