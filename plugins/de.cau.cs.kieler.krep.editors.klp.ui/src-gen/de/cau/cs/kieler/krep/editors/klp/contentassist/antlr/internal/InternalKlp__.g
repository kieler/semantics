lexer grammar InternalKlp;
@header {
package de.cau.cs.kieler.krep.editors.klp.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T14 : 'INPUT' ;
T15 : 'OUTPUT' ;
T16 : 'LOCAL' ;
T17 : 'ADD' ;
T18 : 'IADD' ;
T19 : 'SUB' ;
T20 : 'MUL' ;
T21 : 'DIV' ;
T22 : 'AND' ;
T23 : 'OR' ;
T24 : 'XOR' ;
T25 : 'LT' ;
T26 : 'LE' ;
T27 : 'EQ' ;
T28 : 'GE' ;
T29 : 'GT' ;
T30 : 'NEQ' ;
T31 : 'ISUB' ;
T32 : 'IMUL' ;
T33 : 'IDIV' ;
T34 : 'IAND' ;
T35 : 'IOR' ;
T36 : 'IXOR' ;
T37 : 'ILT' ;
T38 : 'ILE' ;
T39 : 'IEQ' ;
T40 : 'IGE' ;
T41 : 'IGT' ;
T42 : 'INEQ' ;
T43 : 'JT' ;
T44 : 'JF' ;
T45 : 'JZ' ;
T46 : 'JNZ' ;
T47 : 'CVMOV' ;
T48 : 'VCMOV' ;
T49 : 'VVMOV' ;
T50 : 'CCMOV' ;
T51 : 'IVMOV' ;
T52 : 'ICMOV' ;
T53 : ':' ;
T54 : 'SETCLK' ;
T55 : 'SETPC' ;
T56 : 'PRIO' ;
T57 : 'DONE' ;
T58 : 'JMP' ;
T59 : '(' ;
T60 : ')' ;
T61 : 'pre' ;

// $ANTLR src "../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/contentassist/antlr/internal/InternalKlp.g" 2124
RULE_INT : ('+'|'-')? RULE_DIGIT+;

// $ANTLR src "../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/contentassist/antlr/internal/InternalKlp.g" 2126
RULE_ID : (RULE_LETTER|'_') (RULE_LETTER|RULE_DIGIT|'_')*;

// $ANTLR src "../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/contentassist/antlr/internal/InternalKlp.g" 2128
RULE_WS : ('\t'|' '|'\r'|'\n');

// $ANTLR src "../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/contentassist/antlr/internal/InternalKlp.g" 2130
RULE_COMMENT : '#' ( options {greedy=false;} : . )*'\n';

// $ANTLR src "../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/contentassist/antlr/internal/InternalKlp.g" 2132
RULE_DIGIT : '0'..'9';

// $ANTLR src "../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/contentassist/antlr/internal/InternalKlp.g" 2134
RULE_LETTER : ('a'..'z'|'A'..'Z');

// $ANTLR src "../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/contentassist/antlr/internal/InternalKlp.g" 2136
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/contentassist/antlr/internal/InternalKlp.g" 2138
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/contentassist/antlr/internal/InternalKlp.g" 2140
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/contentassist/antlr/internal/InternalKlp.g" 2142
RULE_ANY_OTHER : .;


