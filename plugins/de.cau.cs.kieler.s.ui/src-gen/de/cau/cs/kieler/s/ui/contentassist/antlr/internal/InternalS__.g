lexer grammar InternalS;
@header {
package de.cau.cs.kieler.s.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'pre' ;
T12 : 'or' ;
T13 : 'and' ;
T14 : 'not' ;
T15 : '+' ;
T16 : '-' ;
T17 : '*' ;
T18 : 'mod' ;
T19 : '/' ;
T20 : '?' ;
T21 : 'E' ;
T22 : 'e' ;
T23 : 'true' ;
T24 : 'false' ;
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
T41 : 'Synchronous Program' ;
T42 : '(' ;
T43 : ')' ;
T44 : 'Inputs' ;
T45 : ';' ;
T46 : ',' ;
T47 : 'Outputs' ;
T48 : 'Signals' ;
T49 : ':' ;
T50 : 'SIGNALS' ;
T51 : 'signal' ;
T52 : ':=' ;
T53 : 'combine' ;
T54 : 'with' ;
T55 : 'PAUSE' ;
T56 : 'TERM' ;
T57 : 'Halt' ;
T58 : 'JOIN' ;
T59 : 'ABORT' ;
T60 : 'PRESENT' ;
T61 : '{' ;
T62 : '}' ;
T63 : 'GOTO' ;
T64 : 'FORK' ;
T65 : 'FORKE' ;
T66 : 'EMIT' ;
T67 : 'AWAIT' ;
T68 : 'PRIO' ;
T69 : '.' ;
T70 : 'input' ;
T71 : 'output' ;

// $ANTLR src "../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g" 9981
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g" 9983
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g" 9985
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g" 9987
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g" 9989
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g" 9991
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g" 9993
RULE_ANY_OTHER : .;


