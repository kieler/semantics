lexer grammar InternalInterfaceDecl;
@header {
package de.cau.cs.kieler.synccharts.interfacedeclparser.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'input' ;
T12 : 'output' ;
T13 : 'signal' ;
T14 : 'renaming' ;
T15 : ':' ;
T16 : 'var' ;
T17 : ',' ;
T18 : ';' ;
T19 : ':=' ;
T20 : 'combine' ;
T21 : 'with' ;
T22 : 'host' ;
T23 : '/' ;
T24 : 'PURE' ;
T25 : 'BOOL' ;
T26 : 'UNSIGNED' ;
T27 : 'INT' ;
T28 : 'FLOAT' ;
T29 : 'HOST' ;
T30 : 'NONE' ;
T31 : '+' ;
T32 : '*' ;
T33 : 'max' ;
T34 : 'min' ;
T35 : 'or' ;
T36 : 'and' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g" 1999
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g" 2001
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g" 2003
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g" 2005
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g" 2007
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g" 2009
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g" 2011
RULE_ANY_OTHER : .;


