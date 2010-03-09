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
T14 : ':' ;
T15 : 'var' ;
T16 : ',' ;
T17 : ';' ;
T18 : ':=' ;
T19 : 'combine' ;
T20 : 'with' ;
T21 : 'host' ;
T22 : 'PURE' ;
T23 : 'BOOL' ;
T24 : 'UNSIGNED' ;
T25 : 'INT' ;
T26 : 'FLOAT' ;
T27 : 'HOST' ;
T28 : 'NONE' ;
T29 : '+' ;
T30 : '*' ;
T31 : 'max' ;
T32 : 'min' ;
T33 : 'or' ;
T34 : 'and' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g" 1811
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g" 1813
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g" 1815
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g" 1817
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g" 1819
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g" 1821
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g" 1823
RULE_ANY_OTHER : .;


