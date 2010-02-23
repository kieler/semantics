lexer grammar InternalQuartz;
@header {
package de.cau.cs.kieler.quartz.editor.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T13 : 'event' ;
T14 : 'mem' ;
T15 : 'bool' ;
T16 : 'real' ;
T17 : 'bv' ;
T18 : 'nat' ;
T19 : 'int' ;
T20 : '?' ;
T21 : '!' ;
T22 : 'mu' ;
T23 : 'nu' ;
T24 : '_' ;
T25 : 'instant' ;
T26 : 'inside' ;
T27 : 'terminate' ;
T28 : 'true' ;
T29 : 'false' ;
T30 : '||' ;
T31 : '|||' ;
T32 : '&&' ;
T33 : '&&&' ;
T34 : 'during' ;
T35 : 'final' ;
T36 : 'not' ;
T37 : '&' ;
T38 : 'and' ;
T39 : '|' ;
T40 : 'or' ;
T41 : 'package' ;
T42 : ';' ;
T43 : 'import' ;
T44 : '.' ;
T45 : 'macro' ;
T46 : '(' ;
T47 : ')' ;
T48 : '=' ;
T49 : 'module' ;
T50 : ',' ;
T51 : '{' ;
T52 : '}' ;
T53 : '[' ;
T54 : ']' ;
T55 : '+' ;
T56 : '-' ;
T57 : 'abs' ;
T58 : 'sat' ;
T59 : 'der' ;
T60 : 'reverse' ;
T61 : '::' ;
T62 : 'next' ;
T63 : 'nat2bv' ;
T64 : 'int2bv' ;
T65 : 'arr2bv' ;
T66 : 'tup2bv' ;
T67 : 'bv2nat' ;
T68 : 'bv2int' ;
T69 : 'nat2real' ;
T70 : 'int2real' ;
T71 : 'sin' ;
T72 : 'cos' ;
T73 : 'exp' ;
T74 : 'log' ;
T75 : 'sizeOf' ;
T76 : 'forall' ;
T77 : 'exists' ;
T78 : 'sum' ;
T79 : 'X' ;
T80 : 'G' ;
T81 : 'F' ;
T82 : 'PA' ;
T83 : 'PF' ;
T84 : 'PSX' ;
T85 : 'PMX' ;
T86 : 'E' ;
T87 : 'A' ;
T88 : '[]' ;
T89 : '<>' ;
T90 : '[:]' ;
T91 : '<:>' ;
T92 : 'fixpoints' ;
T93 : 'in' ;
T94 : ':' ;
T95 : 'emit' ;
T96 : '<-' ;
T97 : 'assume' ;
T98 : 'assert' ;
T99 : 'do' ;
T100 : '..' ;
T101 : 'nothing' ;
T102 : 'weak' ;
T103 : 'immediate' ;
T104 : 'abort' ;
T105 : 'when' ;
T106 : 'abstract' ;
T107 : 'case' ;
T108 : 'default' ;
T109 : 'choose' ;
T110 : 'while' ;
T111 : 'for' ;
T112 : 'if' ;
T113 : 'else' ;
T114 : 'let' ;
T115 : 'loop' ;
T116 : 'pause' ;
T117 : 'halt' ;
T118 : 'every' ;
T119 : '.*' ;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor.ui/src-gen/de/cau/cs/kieler/quartz/editor/contentassist/antlr/internal/InternalQuartz.g" 10731
RULE_BVCONST : '0b';

// $ANTLR src "../de.cau.cs.kieler.quartz.editor.ui/src-gen/de/cau/cs/kieler/quartz/editor/contentassist/antlr/internal/InternalQuartz.g" 10733
RULE_OCTCONST : '0o' ('0'..'7')+;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor.ui/src-gen/de/cau/cs/kieler/quartz/editor/contentassist/antlr/internal/InternalQuartz.g" 10735
RULE_HEXCONST : '0x' ('0'..'9'|'A'..'F')+;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor.ui/src-gen/de/cau/cs/kieler/quartz/editor/contentassist/antlr/internal/InternalQuartz.g" 10737
RULE_NATCONST : ('0'..'9')*;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor.ui/src-gen/de/cau/cs/kieler/quartz/editor/contentassist/antlr/internal/InternalQuartz.g" 10739
RULE_REALCONST : ('+'|'-')? ('0'..'9')+ '.' ('0'..'9')+ ('e' ('+'|'-')? ('0'..'9')+)?;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor.ui/src-gen/de/cau/cs/kieler/quartz/editor/contentassist/antlr/internal/InternalQuartz.g" 10741
RULE_ID : ('a'..'z'|'A'..'Z') ('_'? ('a'..'z'|'A'..'Z'|'0'..'9'))*;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor.ui/src-gen/de/cau/cs/kieler/quartz/editor/contentassist/antlr/internal/InternalQuartz.g" 10743
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.cau.cs.kieler.quartz.editor.ui/src-gen/de/cau/cs/kieler/quartz/editor/contentassist/antlr/internal/InternalQuartz.g" 10745
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.cau.cs.kieler.quartz.editor.ui/src-gen/de/cau/cs/kieler/quartz/editor/contentassist/antlr/internal/InternalQuartz.g" 10747
RULE_WS : (' '|'\t'|'\r'|'\n')+;


