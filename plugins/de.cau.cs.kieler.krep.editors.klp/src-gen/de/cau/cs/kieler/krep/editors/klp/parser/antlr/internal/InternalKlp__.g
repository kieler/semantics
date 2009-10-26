lexer grammar InternalKlp;
@header {
package de.cau.cs.kieler.krep.editors.klp.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T14 : ':' ;
T15 : 'SETCLK' ;
T16 : 'SETPC' ;
T17 : 'PRIO' ;
T18 : 'DONE' ;
T19 : 'JMP' ;
T20 : 'pre' ;
T21 : '(' ;
T22 : ')' ;
T23 : 'INPUT' ;
T24 : 'OUTPUT' ;
T25 : 'LOCAL' ;
T26 : 'ADD' ;
T27 : 'IADD' ;
T28 : 'SUB' ;
T29 : 'MUL' ;
T30 : 'DIV' ;
T31 : 'AND' ;
T32 : 'OR' ;
T33 : 'XOR' ;
T34 : 'LT' ;
T35 : 'LE' ;
T36 : 'EQ' ;
T37 : 'GE' ;
T38 : 'GT' ;
T39 : 'NEQ' ;
T40 : 'ISUB' ;
T41 : 'IMUL' ;
T42 : 'IDIV' ;
T43 : 'IAND' ;
T44 : 'IOR' ;
T45 : 'IXOR' ;
T46 : 'ILT' ;
T47 : 'ILE' ;
T48 : 'IEQ' ;
T49 : 'IGE' ;
T50 : 'IGT' ;
T51 : 'INEQ' ;
T52 : 'JT' ;
T53 : 'JF' ;
T54 : 'JZ' ;
T55 : 'JNZ' ;
T56 : 'CVMOV' ;
T57 : 'VCMOV' ;
T58 : 'VVMOV' ;
T59 : 'CCMOV' ;
T60 : 'IVMOV' ;
T61 : 'ICMOV' ;

// $ANTLR src "../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g" 1405
RULE_INT : ('+'|'-')? RULE_DIGIT+;

// $ANTLR src "../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g" 1407
RULE_ID : (RULE_LETTER|'_') (RULE_LETTER|RULE_DIGIT|'_')*;

// $ANTLR src "../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g" 1409
RULE_WS : ('\t'|' '|'\r'|'\n');

// $ANTLR src "../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g" 1411
RULE_COMMENT : '#' ( options {greedy=false;} : . )*'\n';

// $ANTLR src "../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g" 1413
RULE_DIGIT : '0'..'9';

// $ANTLR src "../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g" 1415
RULE_LETTER : ('a'..'z'|'A'..'Z');

// $ANTLR src "../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g" 1417
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g" 1419
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g" 1421
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g" 1423
RULE_ANY_OTHER : .;


