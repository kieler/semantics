lexer grammar InternalInterfaceDecl;
@header {
package de.cau.cs.kieler.synccharts.interfacedeclparser.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'PURE' ;
T12 : 'BOOL' ;
T13 : 'UNSIGNED' ;
T14 : 'INT' ;
T15 : 'FLOAT' ;
T16 : 'HOST' ;
T17 : 'NONE' ;
T18 : '+' ;
T19 : '*' ;
T20 : 'max' ;
T21 : 'min' ;
T22 : 'or' ;
T23 : 'and' ;
T24 : 'host' ;
T25 : 'input' ;
T26 : 'output' ;
T27 : 'signal' ;
T28 : 'renaming' ;
T29 : ':' ;
T30 : ';' ;
T31 : 'var' ;
T32 : ',' ;
T33 : ':=' ;
T34 : 'combine' ;
T35 : 'with' ;
T36 : '/' ;

// $ANTLR src "../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g" 4206
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g" 4208
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g" 4210
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g" 4212
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g" 4214
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g" 4216
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g" 4218
RULE_ANY_OTHER : .;


