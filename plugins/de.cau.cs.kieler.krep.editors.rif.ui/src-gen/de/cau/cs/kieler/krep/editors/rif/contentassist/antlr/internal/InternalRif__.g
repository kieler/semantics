lexer grammar InternalRif;
@header {
package de.cau.cs.kieler.krep.editors.rif.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T15 : 'bool' ;
T16 : 'int' ;
T17 : '@#' ;
T18 : ':' ;
T19 : '#step' ;
T20 : '#outs' ;
T21 : '#locs' ;
T22 : 'The' ;
T23 : 'execution' ;
T24 : 'lasted' ;
T25 : '.' ;
T26 : 'second.' ;
T27 : 'T' ;
T28 : 'F' ;

// $ANTLR src "../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g" 1105
RULE_INPUTS : '#@inputs';

// $ANTLR src "../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g" 1107
RULE_OUTPUTS : '#@outputs';

// $ANTLR src "../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g" 1109
RULE_LOCALS : '#@locals';

// $ANTLR src "../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g" 1111
RULE_WS : ('\t'|' '|'\r'|'\n');

// $ANTLR src "../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g" 1113
RULE_COMMENT : '# ' ( options {greedy=false;} : . )*'\n';

// $ANTLR src "../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g" 1115
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g" 1117
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g" 1119
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g" 1121
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g" 1123
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g" 1125
RULE_ANY_OTHER : .;


