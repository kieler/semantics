/*
 * generated by Xtext
 */
package de.cau.cs.kieler.lustre.ide.contentassist.antlr;

import com.google.inject.Inject;
import de.cau.cs.kieler.lustre.ide.contentassist.antlr.internal.InternalLustreParser;
import de.cau.cs.kieler.lustre.services.LustreGrammarAccess;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class LustreParser extends AbstractContentAssistParser {

	@Inject
	private LustreGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalLustreParser createParser() {
		InternalLustreParser result = new InternalLustreParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getPackage_DeclarationAccess().getAlternatives_6(), "rule__Package_Declaration__Alternatives_6");
					put(grammarAccess.getEntity_DeclarationAccess().getAlternatives(), "rule__Entity_Declaration__Alternatives");
					put(grammarAccess.getType_DeclarationAccess().getAlternatives(), "rule__Type_Declaration__Alternatives");
					put(grammarAccess.getConstant_DeclarationAccess().getAlternatives(), "rule__Constant_Declaration__Alternatives");
					put(grammarAccess.getLocal_Constant_DeclarationAccess().getAlternatives(), "rule__Local_Constant_Declaration__Alternatives");
					put(grammarAccess.getNode_DeclarationAccess().getAlternatives_11(), "rule__Node_Declaration__Alternatives_11");
					put(grammarAccess.getNode_DeclarationAccess().getAlternatives_13(), "rule__Node_Declaration__Alternatives_13");
					put(grammarAccess.getAStateAccess().getAlternatives_2(), "rule__AState__Alternatives_2");
					put(grammarAccess.getATransitionAccess().getAlternatives_0(), "rule__ATransition__Alternatives_0");
					put(grammarAccess.getATransitionAccess().getAlternatives_2(), "rule__ATransition__Alternatives_2");
					put(grammarAccess.getLeft_PartAccess().getAlternatives(), "rule__Left_Part__Alternatives");
					put(grammarAccess.getSelectorAccess().getAlternatives(), "rule__Selector__Alternatives");
					put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
					put(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0(), "rule__Equality__OpAlternatives_1_1_0");
					put(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0(), "rule__Comparison__OpAlternatives_1_1_0");
					put(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0(), "rule__PlusOrMinus__Alternatives_1_0");
					put(grammarAccess.getMulOrDivAccess().getAlternatives_1_0(), "rule__MulOrDiv__Alternatives_1_0");
					put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
					put(grammarAccess.getAtomicExpressionAccess().getAlternatives(), "rule__AtomicExpression__Alternatives");
					put(grammarAccess.getConstantExpressionAccess().getAlternatives(), "rule__ConstantExpression__Alternatives");
					put(grammarAccess.getPackage_DeclarationAccess().getGroup(), "rule__Package_Declaration__Group__0");
					put(grammarAccess.getPackage_DeclarationAccess().getGroup_2(), "rule__Package_Declaration__Group_2__0");
					put(grammarAccess.getPackage_DeclarationAccess().getGroup_2_2(), "rule__Package_Declaration__Group_2_2__0");
					put(grammarAccess.getPackage_ProvidedAccess().getGroup(), "rule__Package_Provided__Group__0");
					put(grammarAccess.getPackage_ProvidedAccess().getGroup_3(), "rule__Package_Provided__Group_3__0");
					put(grammarAccess.getPackage_ProvidedAccess().getGroup_3_1(), "rule__Package_Provided__Group_3_1__0");
					put(grammarAccess.getPackage_ProvidedAccess().getGroup_8(), "rule__Package_Provided__Group_8__0");
					put(grammarAccess.getPackage_Provided_IOAccess().getGroup(), "rule__Package_Provided_IO__Group__0");
					put(grammarAccess.getType_DeclarationAccess().getGroup_0(), "rule__Type_Declaration__Group_0__0");
					put(grammarAccess.getType_DeclarationAccess().getGroup_1(), "rule__Type_Declaration__Group_1__0");
					put(grammarAccess.getArray_TypeAccess().getGroup(), "rule__Array_Type__Group__0");
					put(grammarAccess.getRecord_TypeAccess().getGroup(), "rule__Record_Type__Group__0");
					put(grammarAccess.getRecord_TypeAccess().getGroup_3(), "rule__Record_Type__Group_3__0");
					put(grammarAccess.getFieldAccess().getGroup(), "rule__Field__Group__0");
					put(grammarAccess.getConstant_DeclarationAccess().getGroup_0(), "rule__Constant_Declaration__Group_0__0");
					put(grammarAccess.getConstant_DeclarationAccess().getGroup_1(), "rule__Constant_Declaration__Group_1__0");
					put(grammarAccess.getConstant_DeclarationAccess().getGroup_2(), "rule__Constant_Declaration__Group_2__0");
					put(grammarAccess.getVariable_DeclarationAccess().getGroup(), "rule__Variable_Declaration__Group__0");
					put(grammarAccess.getVariable_DeclarationAccess().getGroup_3(), "rule__Variable_Declaration__Group_3__0");
					put(grammarAccess.getLocal_Variable_DeclarationAccess().getGroup(), "rule__Local_Variable_Declaration__Group__0");
					put(grammarAccess.getLocal_Constant_DeclarationAccess().getGroup_0(), "rule__Local_Constant_Declaration__Group_0__0");
					put(grammarAccess.getLocal_Constant_DeclarationAccess().getGroup_1(), "rule__Local_Constant_Declaration__Group_1__0");
					put(grammarAccess.getNode_DeclarationAccess().getGroup(), "rule__Node_Declaration__Group__0");
					put(grammarAccess.getNode_DeclarationAccess().getGroup_3(), "rule__Node_Declaration__Group_3__0");
					put(grammarAccess.getNode_DeclarationAccess().getGroup_3_1(), "rule__Node_Declaration__Group_3_1__0");
					put(grammarAccess.getNode_DeclarationAccess().getGroup_8(), "rule__Node_Declaration__Group_8__0");
					put(grammarAccess.getEquationAccess().getGroup(), "rule__Equation__Group__0");
					put(grammarAccess.getAssertionAccess().getGroup(), "rule__Assertion__Group__0");
					put(grammarAccess.getAutomatonAccess().getGroup(), "rule__Automaton__Group__0");
					put(grammarAccess.getAutomatonAccess().getGroup_2(), "rule__Automaton__Group_2__0");
					put(grammarAccess.getAStateAccess().getGroup(), "rule__AState__Group__0");
					put(grammarAccess.getATransitionAccess().getGroup(), "rule__ATransition__Group__0");
					put(grammarAccess.getLeft_PartAccess().getGroup_0(), "rule__Left_Part__Group_0__0");
					put(grammarAccess.getLeft_ListAccess().getGroup(), "rule__Left_List__Group__0");
					put(grammarAccess.getLeft_ListAccess().getGroup_1(), "rule__Left_List__Group_1__0");
					put(grammarAccess.getLeftAccess().getGroup(), "rule__Left__Group__0");
					put(grammarAccess.getSelectorAccess().getGroup_0(), "rule__Selector__Group_0__0");
					put(grammarAccess.getSelectorAccess().getGroup_1(), "rule__Selector__Group_1__0");
					put(grammarAccess.getSelTrancheEndAccess().getGroup(), "rule__SelTrancheEnd__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup_0(), "rule__Expression__Group_0__0");
					put(grammarAccess.getFbyAccess().getGroup(), "rule__Fby__Group__0");
					put(grammarAccess.getFbyAccess().getGroup_1(), "rule__Fby__Group_1__0");
					put(grammarAccess.getFbyAccess().getGroup_1_1(), "rule__Fby__Group_1_1__0");
					put(grammarAccess.getArrowAccess().getGroup(), "rule__Arrow__Group__0");
					put(grammarAccess.getArrowAccess().getGroup_1(), "rule__Arrow__Group_1__0");
					put(grammarAccess.getArrowAccess().getGroup_1_1(), "rule__Arrow__Group_1_1__0");
					put(grammarAccess.getOrAccess().getGroup(), "rule__Or__Group__0");
					put(grammarAccess.getOrAccess().getGroup_1(), "rule__Or__Group_1__0");
					put(grammarAccess.getOrAccess().getGroup_1_1(), "rule__Or__Group_1_1__0");
					put(grammarAccess.getAndAccess().getGroup(), "rule__And__Group__0");
					put(grammarAccess.getAndAccess().getGroup_1(), "rule__And__Group_1__0");
					put(grammarAccess.getAndAccess().getGroup_1_1(), "rule__And__Group_1_1__0");
					put(grammarAccess.getEqualityAccess().getGroup(), "rule__Equality__Group__0");
					put(grammarAccess.getEqualityAccess().getGroup_1(), "rule__Equality__Group_1__0");
					put(grammarAccess.getComparisonAccess().getGroup(), "rule__Comparison__Group__0");
					put(grammarAccess.getComparisonAccess().getGroup_1(), "rule__Comparison__Group_1__0");
					put(grammarAccess.getModAccess().getGroup(), "rule__Mod__Group__0");
					put(grammarAccess.getModAccess().getGroup_1(), "rule__Mod__Group_1__0");
					put(grammarAccess.getPlusOrMinusAccess().getGroup(), "rule__PlusOrMinus__Group__0");
					put(grammarAccess.getPlusOrMinusAccess().getGroup_1(), "rule__PlusOrMinus__Group_1__0");
					put(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0(), "rule__PlusOrMinus__Group_1_0_0__0");
					put(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1(), "rule__PlusOrMinus__Group_1_0_1__0");
					put(grammarAccess.getMulOrDivAccess().getGroup(), "rule__MulOrDiv__Group__0");
					put(grammarAccess.getMulOrDivAccess().getGroup_1(), "rule__MulOrDiv__Group_1__0");
					put(grammarAccess.getMulOrDivAccess().getGroup_1_0_0(), "rule__MulOrDiv__Group_1_0_0__0");
					put(grammarAccess.getMulOrDivAccess().getGroup_1_0_1(), "rule__MulOrDiv__Group_1_0_1__0");
					put(grammarAccess.getPrimaryAccess().getGroup_0(), "rule__Primary__Group_0__0");
					put(grammarAccess.getPrimaryAccess().getGroup_1(), "rule__Primary__Group_1__0");
					put(grammarAccess.getPrimaryAccess().getGroup_2(), "rule__Primary__Group_2__0");
					put(grammarAccess.getPrimaryAccess().getGroup_3(), "rule__Primary__Group_3__0");
					put(grammarAccess.getPrimaryAccess().getGroup_4(), "rule__Primary__Group_4__0");
					put(grammarAccess.getVariableReferenceAccess().getGroup(), "rule__VariableReference__Group__0");
					put(grammarAccess.getConstantExpressionAccess().getGroup_0(), "rule__ConstantExpression__Group_0__0");
					put(grammarAccess.getConstantExpressionAccess().getGroup_1(), "rule__ConstantExpression__Group_1__0");
					put(grammarAccess.getConstantExpressionAccess().getGroup_2(), "rule__ConstantExpression__Group_2__0");
					put(grammarAccess.getLustreProgramAccess().getNodesAssignment(), "rule__LustreProgram__NodesAssignment");
					put(grammarAccess.getPackage_DeclarationAccess().getNameAssignment_1(), "rule__Package_Declaration__NameAssignment_1");
					put(grammarAccess.getPackage_DeclarationAccess().getUsesAssignment_2_1(), "rule__Package_Declaration__UsesAssignment_2_1");
					put(grammarAccess.getPackage_DeclarationAccess().getUsesAssignment_2_2_1(), "rule__Package_Declaration__UsesAssignment_2_2_1");
					put(grammarAccess.getPackage_DeclarationAccess().getProvidesAssignment_4(), "rule__Package_Declaration__ProvidesAssignment_4");
					put(grammarAccess.getPackage_DeclarationAccess().getNodesAssignment_6_0(), "rule__Package_Declaration__NodesAssignment_6_0");
					put(grammarAccess.getPackage_DeclarationAccess().getTypesAssignment_6_1(), "rule__Package_Declaration__TypesAssignment_6_1");
					put(grammarAccess.getPackage_DeclarationAccess().getConstantsAssignment_6_2(), "rule__Package_Declaration__ConstantsAssignment_6_2");
					put(grammarAccess.getPackage_ProvidedAccess().getNameAssignment_1(), "rule__Package_Provided__NameAssignment_1");
					put(grammarAccess.getPackage_ProvidedAccess().getParametersAssignment_3_0(), "rule__Package_Provided__ParametersAssignment_3_0");
					put(grammarAccess.getPackage_ProvidedAccess().getParametersAssignment_3_1_1(), "rule__Package_Provided__ParametersAssignment_3_1_1");
					put(grammarAccess.getPackage_ProvidedAccess().getReturnedAssignment_7(), "rule__Package_Provided__ReturnedAssignment_7");
					put(grammarAccess.getPackage_ProvidedAccess().getReturnedAssignment_8_1(), "rule__Package_Provided__ReturnedAssignment_8_1");
					put(grammarAccess.getPackage_Provided_IOAccess().getNameAssignment_0(), "rule__Package_Provided_IO__NameAssignment_0");
					put(grammarAccess.getPackage_Provided_IOAccess().getTypeAssignment_2(), "rule__Package_Provided_IO__TypeAssignment_2");
					put(grammarAccess.getType_DeclarationAccess().getNameAssignment_0_1(), "rule__Type_Declaration__NameAssignment_0_1");
					put(grammarAccess.getType_DeclarationAccess().getNameAssignment_1_1(), "rule__Type_Declaration__NameAssignment_1_1");
					put(grammarAccess.getType_DeclarationAccess().getTypeAssignment_1_3(), "rule__Type_Declaration__TypeAssignment_1_3");
					put(grammarAccess.getTypeAccess().getNameAssignment(), "rule__Type__NameAssignment");
					put(grammarAccess.getArray_TypeAccess().getTypeAssignment_0(), "rule__Array_Type__TypeAssignment_0");
					put(grammarAccess.getArray_TypeAccess().getLengthAssignment_2(), "rule__Array_Type__LengthAssignment_2");
					put(grammarAccess.getRecord_TypeAccess().getFieldsAssignment_2(), "rule__Record_Type__FieldsAssignment_2");
					put(grammarAccess.getRecord_TypeAccess().getFieldsAssignment_3_1(), "rule__Record_Type__FieldsAssignment_3_1");
					put(grammarAccess.getFieldAccess().getNameAssignment_0(), "rule__Field__NameAssignment_0");
					put(grammarAccess.getFieldAccess().getTypeAssignment_2(), "rule__Field__TypeAssignment_2");
					put(grammarAccess.getConstant_DeclarationAccess().getNameAssignment_0_1(), "rule__Constant_Declaration__NameAssignment_0_1");
					put(grammarAccess.getConstant_DeclarationAccess().getTypeAssignment_0_3(), "rule__Constant_Declaration__TypeAssignment_0_3");
					put(grammarAccess.getConstant_DeclarationAccess().getNameAssignment_1_1(), "rule__Constant_Declaration__NameAssignment_1_1");
					put(grammarAccess.getConstant_DeclarationAccess().getExprAssignment_1_3(), "rule__Constant_Declaration__ExprAssignment_1_3");
					put(grammarAccess.getConstant_DeclarationAccess().getNameAssignment_2_1(), "rule__Constant_Declaration__NameAssignment_2_1");
					put(grammarAccess.getConstant_DeclarationAccess().getTypeAssignment_2_3(), "rule__Constant_Declaration__TypeAssignment_2_3");
					put(grammarAccess.getConstant_DeclarationAccess().getExprAssignment_2_5(), "rule__Constant_Declaration__ExprAssignment_2_5");
					put(grammarAccess.getVariable_DeclarationAccess().getNameAssignment_0(), "rule__Variable_Declaration__NameAssignment_0");
					put(grammarAccess.getVariable_DeclarationAccess().getTypeAssignment_2(), "rule__Variable_Declaration__TypeAssignment_2");
					put(grammarAccess.getVariable_DeclarationAccess().getClockAssignment_3_1(), "rule__Variable_Declaration__ClockAssignment_3_1");
					put(grammarAccess.getLocal_Constant_DeclarationAccess().getNameAssignment_0_2(), "rule__Local_Constant_Declaration__NameAssignment_0_2");
					put(grammarAccess.getLocal_Constant_DeclarationAccess().getExprAssignment_0_4(), "rule__Local_Constant_Declaration__ExprAssignment_0_4");
					put(grammarAccess.getLocal_Constant_DeclarationAccess().getNameAssignment_1_2(), "rule__Local_Constant_Declaration__NameAssignment_1_2");
					put(grammarAccess.getLocal_Constant_DeclarationAccess().getTypeAssignment_1_4(), "rule__Local_Constant_Declaration__TypeAssignment_1_4");
					put(grammarAccess.getLocal_Constant_DeclarationAccess().getExprAssignment_1_6(), "rule__Local_Constant_Declaration__ExprAssignment_1_6");
					put(grammarAccess.getNode_DeclarationAccess().getNameAssignment_1(), "rule__Node_Declaration__NameAssignment_1");
					put(grammarAccess.getNode_DeclarationAccess().getParametersAssignment_3_0(), "rule__Node_Declaration__ParametersAssignment_3_0");
					put(grammarAccess.getNode_DeclarationAccess().getParametersAssignment_3_1_1(), "rule__Node_Declaration__ParametersAssignment_3_1_1");
					put(grammarAccess.getNode_DeclarationAccess().getReturnedAssignment_7(), "rule__Node_Declaration__ReturnedAssignment_7");
					put(grammarAccess.getNode_DeclarationAccess().getReturnedAssignment_8_1(), "rule__Node_Declaration__ReturnedAssignment_8_1");
					put(grammarAccess.getNode_DeclarationAccess().getConstantsAssignment_11_0(), "rule__Node_Declaration__ConstantsAssignment_11_0");
					put(grammarAccess.getNode_DeclarationAccess().getVariablesAssignment_11_1(), "rule__Node_Declaration__VariablesAssignment_11_1");
					put(grammarAccess.getNode_DeclarationAccess().getEquationsAssignment_13_0(), "rule__Node_Declaration__EquationsAssignment_13_0");
					put(grammarAccess.getNode_DeclarationAccess().getAssertionsAssignment_13_1(), "rule__Node_Declaration__AssertionsAssignment_13_1");
					put(grammarAccess.getNode_DeclarationAccess().getAutomatonsAssignment_13_2(), "rule__Node_Declaration__AutomatonsAssignment_13_2");
					put(grammarAccess.getEquationAccess().getLeftAssignment_0(), "rule__Equation__LeftAssignment_0");
					put(grammarAccess.getEquationAccess().getRightAssignment_2(), "rule__Equation__RightAssignment_2");
					put(grammarAccess.getAutomatonAccess().getStatesAssignment_1(), "rule__Automaton__StatesAssignment_1");
					put(grammarAccess.getAutomatonAccess().getStatesAssignment_2_1(), "rule__Automaton__StatesAssignment_2_1");
					put(grammarAccess.getAStateAccess().getNameAssignment_0(), "rule__AState__NameAssignment_0");
					put(grammarAccess.getAStateAccess().getEquationsAssignment_2_0(), "rule__AState__EquationsAssignment_2_0");
					put(grammarAccess.getAStateAccess().getAssertionsAssignment_2_1(), "rule__AState__AssertionsAssignment_2_1");
					put(grammarAccess.getAStateAccess().getAutomatonsAssignment_2_2(), "rule__AState__AutomatonsAssignment_2_2");
					put(grammarAccess.getAStateAccess().getTransitionsAssignment_3(), "rule__AState__TransitionsAssignment_3");
					put(grammarAccess.getATransitionAccess().getStrongAssignment_0_1(), "rule__ATransition__StrongAssignment_0_1");
					put(grammarAccess.getATransitionAccess().getConditionAssignment_1(), "rule__ATransition__ConditionAssignment_1");
					put(grammarAccess.getATransitionAccess().getHistoryAssignment_2_1(), "rule__ATransition__HistoryAssignment_2_1");
					put(grammarAccess.getATransitionAccess().getNextStateAssignment_3(), "rule__ATransition__NextStateAssignment_3");
					put(grammarAccess.getLeft_ListAccess().getIdAssignment_0(), "rule__Left_List__IdAssignment_0");
					put(grammarAccess.getLeft_ListAccess().getIdAssignment_1_1(), "rule__Left_List__IdAssignment_1_1");
					put(grammarAccess.getLeftAccess().getNameAssignment_0(), "rule__Left__NameAssignment_0");
					put(grammarAccess.getLeftAccess().getSelectorAssignment_1(), "rule__Left__SelectorAssignment_1");
					put(grammarAccess.getSelectorAccess().getNameAssignment_0_1(), "rule__Selector__NameAssignment_0_1");
					put(grammarAccess.getSelectorAccess().getBeginAssignment_1_1(), "rule__Selector__BeginAssignment_1_1");
					put(grammarAccess.getSelectorAccess().getEndAssignment_1_2(), "rule__Selector__EndAssignment_1_2");
					put(grammarAccess.getExpressionAccess().getIfexprAssignment_0_2(), "rule__Expression__IfexprAssignment_0_2");
					put(grammarAccess.getExpressionAccess().getThenexprAssignment_0_4(), "rule__Expression__ThenexprAssignment_0_4");
					put(grammarAccess.getExpressionAccess().getElseexprAssignment_0_6(), "rule__Expression__ElseexprAssignment_0_6");
					put(grammarAccess.getFbyAccess().getSubExpressionsAssignment_1_1_1(), "rule__Fby__SubExpressionsAssignment_1_1_1");
					put(grammarAccess.getArrowAccess().getSubExpressionsAssignment_1_1_1(), "rule__Arrow__SubExpressionsAssignment_1_1_1");
					put(grammarAccess.getOrAccess().getSubExpressionsAssignment_1_1_1(), "rule__Or__SubExpressionsAssignment_1_1_1");
					put(grammarAccess.getAndAccess().getSubExpressionsAssignment_1_1_1(), "rule__And__SubExpressionsAssignment_1_1_1");
					put(grammarAccess.getEqualityAccess().getOpAssignment_1_1(), "rule__Equality__OpAssignment_1_1");
					put(grammarAccess.getEqualityAccess().getRightAssignment_1_2(), "rule__Equality__RightAssignment_1_2");
					put(grammarAccess.getComparisonAccess().getOpAssignment_1_1(), "rule__Comparison__OpAssignment_1_1");
					put(grammarAccess.getComparisonAccess().getRightAssignment_1_2(), "rule__Comparison__RightAssignment_1_2");
					put(grammarAccess.getModAccess().getSubExpressionsAssignment_1_2(), "rule__Mod__SubExpressionsAssignment_1_2");
					put(grammarAccess.getPlusOrMinusAccess().getSubExpressionsAssignment_1_1(), "rule__PlusOrMinus__SubExpressionsAssignment_1_1");
					put(grammarAccess.getMulOrDivAccess().getSubExpressionsAssignment_1_1(), "rule__MulOrDiv__SubExpressionsAssignment_1_1");
					put(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2(), "rule__Primary__ExpressionAssignment_1_2");
					put(grammarAccess.getPrimaryAccess().getExpressionAssignment_2_2(), "rule__Primary__ExpressionAssignment_2_2");
					put(grammarAccess.getPrimaryAccess().getExpressionAssignment_3_2(), "rule__Primary__ExpressionAssignment_3_2");
					put(grammarAccess.getPrimaryAccess().getExpressionAssignment_4_2(), "rule__Primary__ExpressionAssignment_4_2");
					put(grammarAccess.getVariableReferenceAccess().getValueAssignment_1(), "rule__VariableReference__ValueAssignment_1");
					put(grammarAccess.getConstantExpressionAccess().getValueAssignment_0_1(), "rule__ConstantExpression__ValueAssignment_0_1");
					put(grammarAccess.getConstantExpressionAccess().getValueAssignment_1_1(), "rule__ConstantExpression__ValueAssignment_1_1");
					put(grammarAccess.getConstantExpressionAccess().getValueAssignment_2_1(), "rule__ConstantExpression__ValueAssignment_2_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] {  };
	}

	public LustreGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LustreGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}