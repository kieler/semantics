grammar scdsl;
 options{backtrack=true; memoize=true;} 

@lexer::header {
package de.cau.cs.kieler.synccharts.dsl.parser;

import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.impl.AntlrUtil;

}

@parser::header {
package de.cau.cs.kieler.synccharts.dsl.parser;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;

import org.openarchitectureware.xtext.parser.impl.AntlrUtil;
import org.openarchitectureware.xtext.XtextFile;
import org.openarchitectureware.xtext.parser.impl.EcoreModelFactory;
import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.model.ParseTreeManagerNeu;
import org.openarchitectureware.xtext.parser.parsetree.Node;

import de.cau.cs.kieler.synccharts.dsl.MetaModelRegistration;

}
@lexer::members {
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

@parser::members {

	private Token getLastToken() {
		return input.LT(-1);
	}

	protected Object convert(Object arg) {
		if (arg instanceof org.antlr.runtime.Token) {
			Token t = (Token) arg;
			String s = t.getText();
			if (t.getType() == scdslLexer.RULE_ID && s.startsWith("^")) {
				return s.substring(1);
			} else if (t.getType()==scdslLexer.RULE_STRING) {
				return s.substring(1,s.length()-1);
			} else if (t.getType()==scdslLexer.RULE_INT) {
				return Integer.valueOf(s);
			}
			return s;
		}
		return arg;
	}


	private EcoreModelFactory factory = new EcoreModelFactory(MetaModelRegistration.getEPackage());
    private ParseTreeManagerNeu ptm = new ParseTreeManagerNeu();
	private XtextFile xtextfile = MetaModelRegistration.getXtextFile();
	
	{
			factory.addImport("synccharts", "http://www.informatik.uni-kiel.de/rtsys/synccharts");
		
	}

	public ParseTreeManagerNeu getResult() {
		return ptm;
	}

	private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
	public List<ErrorMsg> getErrors() {
		return errors;
	}

	@Override
	public void reportError(RecognitionException e) {
		String msg = super.getErrorMessage(e,tokenNames);
		errors.add(AntlrUtil.create(msg,e,tokenNames));
		ptm.addError(msg, e);
		// This doesn't work. ANTLR may simply report an superfluous token. In that case,
		// two nodes will be finished instead of one.
		// ptm.ruleFinished(null, end());
	}

    private boolean skipCurrentToken;
    
	@Override
	protected boolean recoverFromMismatchedElement(IntStream arg0, RecognitionException arg1, BitSet arg2) {
		skipCurrentToken = true;
		return super.recoverFromMismatchedElement(arg0, arg1, arg2);
	}
}


parse returns [Node r]:
	 result=ruleAction
	 // Always return the root node! This prevents that this method is called multiple times
	 // with interesting side effects.
{
if (result != null)
  ptm.setModelElement(result);
$r = ptm.getCurrent();
ptm.ruleFinished(result);}	 EOF
;

ruleAction returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("synccharts", "Action");
			 }
(({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(0)));}temp_Expression=
ruleExpression{if (temp_Expression != null) {
  hasContent = true;
  ptm.setModelElement(temp_Expression);
  factory.set($result,"trigger",convert(temp_Expression),false);
  ptm.ruleFinished(temp_Expression);
} else {
  ptm.destroyNode();
}
}
)?

(({skipCurrentToken = false;}'/'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

(({ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(0)));}temp_Emission=
ruleEmission{if (temp_Emission != null) {
  hasContent = true;
  ptm.setModelElement(temp_Emission);
  factory.add($result,"emissions",convert(temp_Emission),false);
  ptm.ruleFinished(temp_Emission);
} else {
  ptm.destroyNode();
}
}
)
	|
({ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(1)));}temp_Assignment=
ruleAssignment{if (temp_Assignment != null) {
  hasContent = true;
  ptm.setModelElement(temp_Assignment);
  factory.add($result,"assignments",convert(temp_Assignment),false);
  ptm.ruleFinished(temp_Assignment);
} else {
  ptm.destroyNode();
}
}
)
)*
)?
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleExpression returns [EObject result]
:
        temp_signalreference=ruleSignalReference {$result=temp_signalreference;}	|        temp_variablereference=ruleVariableReference {$result=temp_variablereference;}	|        temp_complexexpression=ruleComplexExpression {$result=temp_complexexpression;}	;

ruleComplexExpression returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("synccharts", "ComplexExpression");
			 }
(({skipCurrentToken = false;}'('{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(1)));}temp_Expression=
ruleExpression{if (temp_Expression != null) {
  hasContent = true;
  ptm.setModelElement(temp_Expression);
  factory.add($result,"subExpressions",convert(temp_Expression),false);
  ptm.ruleFinished(temp_Expression);
} else {
  ptm.destroyNode();
}
}
)?

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(2)));}temp_Operator=
ruleOperator{if (temp_Operator != null) {
  hasContent = true;
  ptm.setModelElement(temp_Operator);
  factory.set($result,"operator",convert(temp_Operator),false);
  ptm.ruleFinished(temp_Operator);
} else {
  ptm.destroyNode();
}
}
)

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(3)));}temp_Expression=
ruleExpression{if (temp_Expression != null) {
  hasContent = true;
  ptm.setModelElement(temp_Expression);
  factory.add($result,"subExpressions",convert(temp_Expression),false);
  ptm.ruleFinished(temp_Expression);
} else {
  ptm.destroyNode();
}
}
)

({skipCurrentToken = false;}')'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(4)));
  ptm.ruleFinished(getLastToken());
}})
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleEmission returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("synccharts", "Emission");
			 }
(({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(0)));}temp_Signal=
ruleSignal{if (temp_Signal != null) {
  hasContent = true;
  ptm.setModelElement(temp_Signal);
  factory.set($result,"signal",convert(temp_Signal),false);
  ptm.ruleFinished(temp_Signal);
} else {
  ptm.destroyNode();
}
}
)

(({skipCurrentToken = false;}'('{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(1)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

({ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(1)).eContents().get(1)));}temp_Expression=
ruleExpression{if (temp_Expression != null) {
  hasContent = true;
  ptm.setModelElement(temp_Expression);
  factory.set($result,"newValue",convert(temp_Expression),false);
  ptm.ruleFinished(temp_Expression);
} else {
  ptm.destroyNode();
}
}
)

({skipCurrentToken = false;}')'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(1)).eContents().get(2)));
  ptm.ruleFinished(getLastToken());
}})
)?
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleAssignment returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("synccharts", "Assignment");
			 }
(({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(0)));}temp_Variable=
ruleVariable{if (temp_Variable != null) {
  hasContent = true;
  ptm.setModelElement(temp_Variable);
  factory.set($result,"variable",convert(temp_Variable),false);
  ptm.ruleFinished(temp_Variable);
} else {
  ptm.destroyNode();
}
}
)

({skipCurrentToken = false;}'='{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(1)));
  ptm.ruleFinished(getLastToken());
}})

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(2)));}temp_Expression=
ruleExpression{if (temp_Expression != null) {
  hasContent = true;
  ptm.setModelElement(temp_Expression);
  factory.set($result,"expression",convert(temp_Expression),false);
  ptm.ruleFinished(temp_Expression);
} else {
  ptm.destroyNode();
}
}
)
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleSignalReference returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("synccharts", "SignalReference");
			 }
({ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)));}temp_Signal=
ruleSignal{if (temp_Signal != null) {
  hasContent = true;
  ptm.setModelElement(temp_Signal);
  factory.set($result,"signal",convert(temp_Signal),false);
  ptm.ruleFinished(temp_Signal);
} else {
  ptm.destroyNode();
}
}
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleVariableReference returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("synccharts", "VariableReference");
			 }
({ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)));}temp_Variable=
ruleVariable{if (temp_Variable != null) {
  hasContent = true;
  ptm.setModelElement(temp_Variable);
  factory.set($result,"variable",convert(temp_Variable),false);
  ptm.ruleFinished(temp_Variable);
} else {
  ptm.destroyNode();
}
}
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleSignal returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("synccharts", "Signal");
			 }
({skipCurrentToken = false;}
RULE_ID{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)));
  factory.set($result,"name",convert(temp),false);
  ptm.ruleFinished(temp);
}}
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleVariable returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("synccharts", "Variable");
			 }
(({skipCurrentToken = false;}
RULE_ID{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(0)));
  factory.set($result,"name",convert(temp),false);
  ptm.ruleFinished(temp);
}}
)
	|
({skipCurrentToken = false;}
RULE_INT{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)));
  factory.set($result,"value",convert(temp),false);
  ptm.ruleFinished(temp);
}}
)
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleOperator returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("synccharts", "Operator");
			 }
({ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)));}temp_OperatorKind=
ruleOperatorKind{if (temp_OperatorKind != null) {
  hasContent = true;
  factory.set($result,"operatorKind",convert(temp_OperatorKind),false);
  ptm.ruleFinished(temp_OperatorKind);
} else {
  ptm.destroyNode();
}
}
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleOperatorKind returns [Enumerator r] :
		 'not'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)));
$r=factory.enumLit("synccharts", "OperatorKind","NOT");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
	 |		 '='
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(2)));
$r=factory.enumLit("synccharts", "OperatorKind","EQ");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
	 |		 '<'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(3)));
$r=factory.enumLit("synccharts", "OperatorKind","LT");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
	 |		 '<='
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(4)));
$r=factory.enumLit("synccharts", "OperatorKind","LEQ");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
	 |		 'and'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(5)));
$r=factory.enumLit("synccharts", "OperatorKind","AND");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
	 |		 'or'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(6)));
$r=factory.enumLit("synccharts", "OperatorKind","OR");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
	 |		 '+'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(7)));
$r=factory.enumLit("synccharts", "OperatorKind","ADD");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
	 |		 '-'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(8)));
$r=factory.enumLit("synccharts", "OperatorKind","SUB");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
	 |		 '*'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(9)));
$r=factory.enumLit("synccharts", "OperatorKind","MULT");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
	 |		 '/'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(10)));
$r=factory.enumLit("synccharts", "OperatorKind","DIV");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
	 |		 '?'
		 {ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(11)));
$r=factory.enumLit("synccharts", "OperatorKind","VAL");
ptm.setModelElement($r);
ptm.ruleFinished(getLastToken());
}
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

