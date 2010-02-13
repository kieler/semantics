lexer grammar InternalRif;
@header {
package de.cau.cs.kieler.krep.editors.rif.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'bool' ;
T12 : 'int' ;
T13 : '#@inputs' ;
T14 : '@#' ;
T15 : '#@outputs' ;
T16 : '#@locals' ;
T17 : '"' ;
T18 : '":' ;
T19 : '#step' ;
T20 : '#outs' ;
T21 : '#locs' ;
T22 : 'T' ;
T23 : 'F' ;

// $ANTLR src "../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g" 936
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g" 938
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g" 940
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g" 942
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g" 944
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g" 946
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g" 948
RULE_ANY_OTHER : .;


