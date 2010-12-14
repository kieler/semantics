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
T34 : 'boolean' ;
T35 : 'unsigned' ;
T36 : 'integer' ;
T37 : 'float' ;
T38 : 'double' ;
T39 : 'string' ;
T40 : 'host' ;
T41 : 'none' ;
T42 : 'max' ;
T43 : 'min' ;
T44 : 'input' ;
T45 : 'output' ;
T46 : 'signal' ;
T47 : 'variable' ;
T48 : ';' ;
T49 : 'var' ;
T50 : ',' ;
T51 : ':=' ;
T52 : 'combine' ;
T53 : 'with' ;
T54 : '(' ;
T55 : ')' ;
T56 : 'inputoutput' ;
T57 : 'return' ;
T58 : '@' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 13216
RULE_STRING_D : ('"' '"'|'"' ('\\' '"'|~('"'))* ('\\' '"'|~(('\\'|'"'))) '"');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 13218
RULE_STRING_S : ('\'' '\''|'\'' ('\\' '\''|~('\''))* ('\\' '\''|~(('\\'|'\''))) '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 13220
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 13222
RULE_FLOAT : ('-'? ('0'..'9')+ '.' ('0'..'9')* (('e'|'E') ('+'|'-')? ('0'..'9')+)? 'f'?|'-'? ('0'..'9')+ 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 13224
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 13226
RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 13228
RULE_HOSTCODE : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 13230
RULE_COMMENT_ANNOTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 13232
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 13234
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 13236
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 13238
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 13240
RULE_ANY_OTHER : .;


