lexer grammar InternalRif;
@header {
package de.cau.cs.kieler.krep.editors.rif.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T15 : '@#' ;
T16 : ':' ;
T17 : 'bool' ;
T18 : 'int' ;
T19 : '#step' ;
T20 : '#outs' ;
T21 : '#locs' ;
T22 : 'T' ;
T23 : 'F' ;
T24 : 'The' ;
T25 : 'execution' ;
T26 : 'lasted' ;
T27 : '.' ;
T28 : 'second.' ;

// $ANTLR src "../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g" 625
RULE_INPUTS : '#@inputs';

// $ANTLR src "../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g" 627
RULE_OUTPUTS : '#@outputs';

// $ANTLR src "../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g" 629
RULE_LOCALS : '#@locals';

// $ANTLR src "../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g" 631
RULE_WS : ('\t'|' '|'\r'|'\n');

// $ANTLR src "../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g" 633
RULE_COMMENT : '# ' ( options {greedy=false;} : . )*'\n';

// $ANTLR src "../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g" 635
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g" 637
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g" 639
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g" 641
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g" 643
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g" 645
RULE_ANY_OTHER : .;


