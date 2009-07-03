grammar debugMeWithAntlrWorks;
 options{backtrack=true; memoize=true;} 



parse :
	 result=ruleAction
	 // Always return the root node! This prevents that this method is called multiple times
	 // with interesting side effects.
	 EOF
;

ruleAction 

:
((ruleExpression)?

(('/')

((ruleEmission)
	|
(ruleAssignment)
)*
)?
)
;

ruleExpression 
:
        temp_signalreference=ruleSignalReference 	|        temp_variablereference=ruleVariableReference 	|        temp_complexexpression=ruleComplexExpression 	;

ruleComplexExpression 

:
(('(')

(ruleExpression)?

(ruleOperator)

(ruleExpression)

(')')
)
;

ruleEmission 

:
((ruleSignal)

(('(')

(ruleExpression)

(')')
)?
)
;

ruleAssignment 

:
((ruleVariable)

('=')

(ruleExpression)
)
;

ruleSignalReference 

:
(ruleSignal)
;

ruleVariableReference 

:
(ruleVariable)
;

ruleSignal 

:
(RULE_ID)
;

ruleVariable 

:
((RULE_ID)
	|
(RULE_INT)
)
;

ruleOperator 

:
(ruleOperatorKind)
;

ruleOperatorKind  :
		 'not'
		 
	 |		 '='
		 
	 |		 '<'
		 
	 |		 '<='
		 
	 |		 'and'
		 
	 |		 'or'
		 
	 |		 '+'
		 
	 |		 '-'
		 
	 |		 '*'
		 
	 |		 '/'
		 
	 |		 '?'
		 
;

RULE_ID :

	 ('^')?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
	 
;

RULE_STRING :

	 '\"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\"') )* '\"' |
	 '\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\'') )* '\''
	 
;

RULE_INT :

	 ('-')?('0'..'9')+
	 
;

RULE_WS :

	 (' '|'\t'|'\r'|'\n')+ {$channel=HIDDEN;}
	 
;

RULE_ML_COMMENT :

	 '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
	 
;

RULE_SL_COMMENT :

	 '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	 
;

