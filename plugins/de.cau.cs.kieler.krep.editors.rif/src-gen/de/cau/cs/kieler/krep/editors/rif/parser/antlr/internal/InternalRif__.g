lexer grammar InternalRif;
@header {
package de.cau.cs.kieler.krep.editors.rif.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : '@#' ;
T12 : ':' ;
T13 : 'bool' ;
T14 : 'int' ;
T15 : '#step' ;
T16 : '#outs' ;
T17 : '#locs' ;
T18 : 'T' ;
T19 : 'F' ;
T20 : 'The' ;
T21 : 'execution' ;
T22 : 'lasted' ;
T23 : '.' ;
T24 : 'second.' ;

// $ANTLR src "../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g" 625
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g" 627
RULE_INPUTS : '#@inputs';

// $ANTLR src "../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g" 629
RULE_OUTPUTS : '#@outputs';

// $ANTLR src "../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g" 631
RULE_LOCALS : '#@locals';

// $ANTLR src "../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g" 633
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g" 635
RULE_WS : ('\t'|' '|'\r'|'\n');

// $ANTLR src "../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g" 637
RULE_COMMENT : '# ' ( options {greedy=false;} : . )*'\n';


