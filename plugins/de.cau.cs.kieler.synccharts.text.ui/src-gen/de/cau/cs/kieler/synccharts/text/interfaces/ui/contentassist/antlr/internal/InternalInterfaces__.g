lexer grammar InternalInterfaces;
@header {
package de.cau.cs.kieler.synccharts.text.interfaces.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T17 : 'pre' ;
T18 : 'or' ;
T19 : 'and' ;
T20 : 'not' ;
T21 : '+' ;
T22 : '-' ;
T23 : '*' ;
T24 : 'mod' ;
T25 : '/' ;
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
T46 : ':' ;
T47 : ';' ;
T48 : 'var' ;
T49 : ',' ;
T50 : ':=' ;
T51 : 'combine' ;
T52 : 'with' ;
T53 : '(' ;
T54 : ')' ;
T55 : '@' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 10514
RULE_STRING_D : ('"' '"'|'"' ('\\' '"'|~('"'))* ('\\' '"'|~(('\\'|'"'))) '"');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 10516
RULE_STRING_S : ('\'' '\''|'\'' ('\\' '\''|~('\''))* ('\\' '\''|~(('\\'|'\''))) '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 10518
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 10520
RULE_FLOAT : ((RULE_INT '.' RULE_INT|RULE_INT ('.' RULE_INT)? ('e'|'E') '+'? RULE_INT) 'f'?|RULE_INT 'f');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 10522
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 10524
RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 10526
RULE_HOSTCODE : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 10528
RULE_COMMENT_ANNOTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 10530
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 10532
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 10534
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 10536
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/ui/contentassist/antlr/internal/InternalInterfaces.g" 10538
RULE_ANY_OTHER : .;


