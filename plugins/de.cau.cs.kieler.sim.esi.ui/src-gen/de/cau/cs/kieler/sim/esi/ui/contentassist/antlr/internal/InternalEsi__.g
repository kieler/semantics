lexer grammar InternalEsi;
@header {
package de.cau.cs.kieler.sim.esi.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T10 : '!' ;
T11 : 'reset' ;
T12 : ';' ;
T13 : '%' ;
T14 : 'Output' ;
T15 : ':' ;
T16 : ')' ;
T17 : '(' ;

// $ANTLR src "../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g" 971
RULE_ID : (RULE_LETTER|'_') (RULE_LETTER|RULE_DIGIT|'_')*;

// $ANTLR src "../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g" 973
RULE_NUM : ('+'|'-')? RULE_DIGIT+;

// $ANTLR src "../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g" 975
RULE_WS : ('\t'|' '|'\r'|'\n');

// $ANTLR src "../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g" 977
RULE_COMMENT : '%' ('A'..'N'|'P'..'Z') ( options {greedy=false;} : . )*'\n';

// $ANTLR src "../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g" 979
RULE_DIGIT : '0'..'9';

// $ANTLR src "../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g" 981
RULE_LETTER : ('a'..'z'|'A'..'Z');


