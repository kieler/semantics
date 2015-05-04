package de.cau.cs.kieler.sccharts.text.actions.serializer;

import com.google.inject.Inject;
import de.cau.cs.kieler.sccharts.text.actions.services.ActionsGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public abstract class AbstractActionsSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ActionsGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_3_0_a_LeftParenthesisKeyword_2_0_p__q;
	protected AbstractElementAlias match_AtomicExpression_LeftParenthesisKeyword_2_0_a;
	protected AbstractElementAlias match_AtomicExpression_LeftParenthesisKeyword_2_0_p;
	protected AbstractElementAlias match_AtomicValuedExpression_LeftParenthesisKeyword_3_0_a;
	protected AbstractElementAlias match_AtomicValuedExpression_LeftParenthesisKeyword_3_0_p;
	protected AbstractElementAlias match_DuringAction_SemicolonKeyword_5_q;
	protected AbstractElementAlias match_EntryAction_SemicolonKeyword_4_q;
	protected AbstractElementAlias match_ExitAction_SemicolonKeyword_4_q;
	protected AbstractElementAlias match_FunctionCallEffect_LeftParenthesisRightParenthesisKeyword_2_1_q;
	protected AbstractElementAlias match_FunctionCall_LeftParenthesisRightParenthesisKeyword_2_1_q;
	protected AbstractElementAlias match_KeyBooleanValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q;
	protected AbstractElementAlias match_KeyFloatValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q;
	protected AbstractElementAlias match_KeyIntValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q;
	protected AbstractElementAlias match_KeyStringValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q;
	protected AbstractElementAlias match_SuspendAction_SemicolonKeyword_5_q;
	protected AbstractElementAlias match_TagAnnotation___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q;
	protected AbstractElementAlias match_TypedKeyStringValueAnnotation___LeftParenthesisKeyword_6_0_RightParenthesisKeyword_6_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ActionsGrammarAccess) access;
		match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_3_0_a_LeftParenthesisKeyword_2_0_p__q = new GroupAlias(false, true, new TokenAlias(true, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0()), new TokenAlias(true, false, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0()));
		match_AtomicExpression_LeftParenthesisKeyword_2_0_a = new TokenAlias(true, true, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0());
		match_AtomicExpression_LeftParenthesisKeyword_2_0_p = new TokenAlias(true, false, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0());
		match_AtomicValuedExpression_LeftParenthesisKeyword_3_0_a = new TokenAlias(true, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0());
		match_AtomicValuedExpression_LeftParenthesisKeyword_3_0_p = new TokenAlias(true, false, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0());
		match_DuringAction_SemicolonKeyword_5_q = new TokenAlias(false, true, grammarAccess.getDuringActionAccess().getSemicolonKeyword_5());
		match_EntryAction_SemicolonKeyword_4_q = new TokenAlias(false, true, grammarAccess.getEntryActionAccess().getSemicolonKeyword_4());
		match_ExitAction_SemicolonKeyword_4_q = new TokenAlias(false, true, grammarAccess.getExitActionAccess().getSemicolonKeyword_4());
		match_FunctionCallEffect_LeftParenthesisRightParenthesisKeyword_2_1_q = new TokenAlias(false, true, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisRightParenthesisKeyword_2_1());
		match_FunctionCall_LeftParenthesisRightParenthesisKeyword_2_1_q = new TokenAlias(false, true, grammarAccess.getFunctionCallAccess().getLeftParenthesisRightParenthesisKeyword_2_1());
		match_KeyBooleanValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getKeyBooleanValueAnnotationAccess().getLeftParenthesisKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getKeyBooleanValueAnnotationAccess().getRightParenthesisKeyword_3_2()));
		match_KeyFloatValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getKeyFloatValueAnnotationAccess().getLeftParenthesisKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getKeyFloatValueAnnotationAccess().getRightParenthesisKeyword_3_2()));
		match_KeyIntValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getKeyIntValueAnnotationAccess().getLeftParenthesisKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getKeyIntValueAnnotationAccess().getRightParenthesisKeyword_3_2()));
		match_KeyStringValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getKeyStringValueAnnotationAccess().getRightParenthesisKeyword_3_2()));
		match_SuspendAction_SemicolonKeyword_5_q = new TokenAlias(false, true, grammarAccess.getSuspendActionAccess().getSemicolonKeyword_5());
		match_TagAnnotation___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTagAnnotationAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getTagAnnotationAccess().getRightParenthesisKeyword_2_2()));
		match_TypedKeyStringValueAnnotation___LeftParenthesisKeyword_6_0_RightParenthesisKeyword_6_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightParenthesisKeyword_6_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_3_0_a_LeftParenthesisKeyword_2_0_p__q.equals(syntax))
				emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_3_0_a_LeftParenthesisKeyword_2_0_p__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicExpression_LeftParenthesisKeyword_2_0_a.equals(syntax))
				emit_AtomicExpression_LeftParenthesisKeyword_2_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicExpression_LeftParenthesisKeyword_2_0_p.equals(syntax))
				emit_AtomicExpression_LeftParenthesisKeyword_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicValuedExpression_LeftParenthesisKeyword_3_0_a.equals(syntax))
				emit_AtomicValuedExpression_LeftParenthesisKeyword_3_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicValuedExpression_LeftParenthesisKeyword_3_0_p.equals(syntax))
				emit_AtomicValuedExpression_LeftParenthesisKeyword_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DuringAction_SemicolonKeyword_5_q.equals(syntax))
				emit_DuringAction_SemicolonKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_EntryAction_SemicolonKeyword_4_q.equals(syntax))
				emit_EntryAction_SemicolonKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExitAction_SemicolonKeyword_4_q.equals(syntax))
				emit_ExitAction_SemicolonKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionCallEffect_LeftParenthesisRightParenthesisKeyword_2_1_q.equals(syntax))
				emit_FunctionCallEffect_LeftParenthesisRightParenthesisKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionCall_LeftParenthesisRightParenthesisKeyword_2_1_q.equals(syntax))
				emit_FunctionCall_LeftParenthesisRightParenthesisKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_KeyBooleanValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q.equals(syntax))
				emit_KeyBooleanValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_KeyFloatValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q.equals(syntax))
				emit_KeyFloatValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_KeyIntValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q.equals(syntax))
				emit_KeyIntValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_KeyStringValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q.equals(syntax))
				emit_KeyStringValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SuspendAction_SemicolonKeyword_5_q.equals(syntax))
				emit_SuspendAction_SemicolonKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TagAnnotation___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q.equals(syntax))
				emit_TagAnnotation___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TypedKeyStringValueAnnotation___LeftParenthesisKeyword_6_0_RightParenthesisKeyword_6_2__q.equals(syntax))
				emit_TypedKeyStringValueAnnotation___LeftParenthesisKeyword_6_0_RightParenthesisKeyword_6_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('('* '('+)?
	 */
	protected void emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_3_0_a_LeftParenthesisKeyword_2_0_p__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_AtomicExpression_LeftParenthesisKeyword_2_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_AtomicExpression_LeftParenthesisKeyword_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_AtomicValuedExpression_LeftParenthesisKeyword_3_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_AtomicValuedExpression_LeftParenthesisKeyword_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_DuringAction_SemicolonKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_EntryAction_SemicolonKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_ExitAction_SemicolonKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '()'?
	 */
	protected void emit_FunctionCallEffect_LeftParenthesisRightParenthesisKeyword_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '()'?
	 */
	protected void emit_FunctionCall_LeftParenthesisRightParenthesisKeyword_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_KeyBooleanValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_KeyFloatValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_KeyIntValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_KeyStringValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_SuspendAction_SemicolonKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_TagAnnotation___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_TypedKeyStringValueAnnotation___LeftParenthesisKeyword_6_0_RightParenthesisKeyword_6_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
