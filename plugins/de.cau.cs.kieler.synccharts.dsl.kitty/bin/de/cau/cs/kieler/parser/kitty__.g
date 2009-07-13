lexer grammar kitty;
@members {
	 private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
	public List<ErrorMsg> getErrors() {
		return errors;
	}

	public String getErrorMessage(RecognitionException e, String[] tokenNames) {
		String msg = super.getErrorMessage(e,tokenNames);
		errors.add(AntlrUtil.create(msg,e,tokenNames));
		return msg;
	}
}
@header {
package de.cau.cs.kieler.parser;

import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.impl.AntlrUtil;

}

T10 : 'statechart' ;
T11 : '[' ;
T12 : ';' ;
T13 : ']' ;
T14 : '{' ;
T15 : '}' ;
T16 : '_' ;
T17 : '#' ;
T18 : '.' ;
T19 : 'model' ;
T20 : '=' ;
T21 : 'version' ;
T22 : ':' ;
T23 : 'input' ;
T24 : 'output' ;
T25 : 'var' ;
T26 : 'boolean' ;
T27 : 'double' ;
T28 : 'float' ;
T29 : 'integer' ;
T30 : 'combine integer with +' ;
T31 : 'combine integer with *' ;
T32 : '||' ;
T33 : 'label' ;
T34 : 'type' ;
T35 : 'doActivity' ;
T36 : 'do' ;
T37 : 'entryActivity' ;
T38 : 'entry' ;
T39 : 'exitActivity' ;
T40 : 'exit' ;
T41 : 'final' ;
T42 : 'initial' ;
T43 : 'history' ;
T44 : 'choice' ;
T45 : 'dynamicchoice' ;
T46 : 'suspend' ;
T47 : 'localEvent' ;
T48 : 'localVariable' ;
T49 : '<' ;
T50 : '>' ;
T51 : '->' ;
T52 : 'priority' ;
T53 : 'weakAbortion' ;
T54 : 'wa' ;
T55 : 'strongAbortion' ;
T56 : 'sa' ;
T57 : 'normalTermination' ;
T58 : 'nt' ;
T59 : 'suspension' ;
T60 : 'sp' ;
T61 : 'conditional' ;
T62 : 'co' ;
T63 : 'internal' ;
T64 : 'it' ;

// $ANTLR src "..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g" 1557
RULE_ID :

	 ('^')?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
	 
;

// $ANTLR src "..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g" 1563
RULE_STRING :

	 '\"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\"') )* '\"' |
	 '\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\'') )* '\''
	 
;

// $ANTLR src "..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g" 1570
RULE_INT :

	 ('-')?('0'..'9')+
	 
;

// $ANTLR src "..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g" 1576
RULE_WS :

	 (' '|'\t'|'\r'|'\n')+ {$channel=HIDDEN;}
	 
;

// $ANTLR src "..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g" 1582
RULE_ML_COMMENT :

	 '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
	 
;

// $ANTLR src "..//de.cau.cs.kieler.synccharts.dsl.kitty/src-gen/de/cau/cs/kieler/parser/kitty.g" 1588
RULE_SL_COMMENT :

	 '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	 
;

