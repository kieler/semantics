package de.cau.cs.kieler.sccharts.text.sct.serializer;

import com.google.inject.Inject;
import de.cau.cs.kieler.sccharts.text.sct.services.SctGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public abstract class AbstractSctSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SctGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_LeftParenthesisKeyword_3_0_a__a;
	protected AbstractElementAlias match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_LeftParenthesisKeyword_3_0_a__p;
	protected AbstractElementAlias match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0___LeftParenthesisKeyword_3_0_a_LeftParenthesisKeyword_2_0__a__q;
	protected AbstractElementAlias match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_or_LeftParenthesisKeyword_3_0__a;
	protected AbstractElementAlias match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_or_LeftParenthesisKeyword_3_0__p;
	protected AbstractElementAlias match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_3_0_a_LeftParenthesisKeyword_2_0__a;
	protected AbstractElementAlias match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_3_0_a_LeftParenthesisKeyword_2_0__p;
	protected AbstractElementAlias match_DuringAction_SemicolonKeyword_5_q;
	protected AbstractElementAlias match_EntryAction_SemicolonKeyword_4_q;
	protected AbstractElementAlias match_ExitAction_SemicolonKeyword_4_q;
	protected AbstractElementAlias match_FunctionCallEffect_LeftParenthesisRightParenthesisKeyword_3_1_q;
	protected AbstractElementAlias match_FunctionCall_LeftParenthesisRightParenthesisKeyword_2_1_q;
	protected AbstractElementAlias match_IterateAction_SemicolonKeyword_5_q;
	protected AbstractElementAlias match_SCChart___LeftCurlyBracketKeyword_4_1_0_RightCurlyBracketKeyword_4_1_2__q;
	protected AbstractElementAlias match_SingleControlflowRegion___RegionKeyword_1_1_ColonKeyword_1_4__q;
	protected AbstractElementAlias match_SingleDataflowRegion___DataflowKeyword_1_1_ColonKeyword_1_4__q;
	protected AbstractElementAlias match_SuspendAction_SemicolonKeyword_5_q;
	protected AbstractElementAlias match_Transition_DoKeyword_3_3_0_1_0_1_or_SolidusKeyword_3_3_0_1_0_0;
	protected AbstractElementAlias match_Transition_WithKeyword_3_3_0_0_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SctGrammarAccess) access;
		match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_LeftParenthesisKeyword_3_0_a__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(true, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0()));
		match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_LeftParenthesisKeyword_3_0_a__p = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(true, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0()));
		match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0___LeftParenthesisKeyword_3_0_a_LeftParenthesisKeyword_2_0__a__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0()), new GroupAlias(true, true, new TokenAlias(true, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0())));
		match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_or_LeftParenthesisKeyword_3_0__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0()));
		match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_or_LeftParenthesisKeyword_3_0__p = new AlternativeAlias(true, false, new TokenAlias(false, false, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0()));
		match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_3_0_a_LeftParenthesisKeyword_2_0__a = new GroupAlias(true, true, new TokenAlias(true, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0()));
		match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_3_0_a_LeftParenthesisKeyword_2_0__p = new GroupAlias(true, false, new TokenAlias(true, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0()));
		match_DuringAction_SemicolonKeyword_5_q = new TokenAlias(false, true, grammarAccess.getDuringActionAccess().getSemicolonKeyword_5());
		match_EntryAction_SemicolonKeyword_4_q = new TokenAlias(false, true, grammarAccess.getEntryActionAccess().getSemicolonKeyword_4());
		match_ExitAction_SemicolonKeyword_4_q = new TokenAlias(false, true, grammarAccess.getExitActionAccess().getSemicolonKeyword_4());
		match_FunctionCallEffect_LeftParenthesisRightParenthesisKeyword_3_1_q = new TokenAlias(false, true, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisRightParenthesisKeyword_3_1());
		match_FunctionCall_LeftParenthesisRightParenthesisKeyword_2_1_q = new TokenAlias(false, true, grammarAccess.getFunctionCallAccess().getLeftParenthesisRightParenthesisKeyword_2_1());
		match_IterateAction_SemicolonKeyword_5_q = new TokenAlias(false, true, grammarAccess.getIterateActionAccess().getSemicolonKeyword_5());
		match_SCChart___LeftCurlyBracketKeyword_4_1_0_RightCurlyBracketKeyword_4_1_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSCChartAccess().getLeftCurlyBracketKeyword_4_1_0()), new TokenAlias(false, false, grammarAccess.getSCChartAccess().getRightCurlyBracketKeyword_4_1_2()));
		match_SingleControlflowRegion___RegionKeyword_1_1_ColonKeyword_1_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSingleControlflowRegionAccess().getRegionKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getSingleControlflowRegionAccess().getColonKeyword_1_4()));
		match_SingleDataflowRegion___DataflowKeyword_1_1_ColonKeyword_1_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSingleDataflowRegionAccess().getDataflowKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getSingleDataflowRegionAccess().getColonKeyword_1_4()));
		match_SuspendAction_SemicolonKeyword_5_q = new TokenAlias(false, true, grammarAccess.getSuspendActionAccess().getSemicolonKeyword_5());
		match_Transition_DoKeyword_3_3_0_1_0_1_or_SolidusKeyword_3_3_0_1_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTransitionAccess().getDoKeyword_3_3_0_1_0_1()), new TokenAlias(false, false, grammarAccess.getTransitionAccess().getSolidusKeyword_3_3_0_1_0_0()));
		match_Transition_WithKeyword_3_3_0_0_1_q = new TokenAlias(false, true, grammarAccess.getTransitionAccess().getWithKeyword_3_3_0_0_1());
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
			if(match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_LeftParenthesisKeyword_3_0_a__a.equals(syntax))
				emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_LeftParenthesisKeyword_3_0_a__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_LeftParenthesisKeyword_3_0_a__p.equals(syntax))
				emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_LeftParenthesisKeyword_3_0_a__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0___LeftParenthesisKeyword_3_0_a_LeftParenthesisKeyword_2_0__a__q.equals(syntax))
				emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0___LeftParenthesisKeyword_3_0_a_LeftParenthesisKeyword_2_0__a__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_or_LeftParenthesisKeyword_3_0__a.equals(syntax))
				emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_or_LeftParenthesisKeyword_3_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_or_LeftParenthesisKeyword_3_0__p.equals(syntax))
				emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_or_LeftParenthesisKeyword_3_0__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_3_0_a_LeftParenthesisKeyword_2_0__a.equals(syntax))
				emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_3_0_a_LeftParenthesisKeyword_2_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_3_0_a_LeftParenthesisKeyword_2_0__p.equals(syntax))
				emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_3_0_a_LeftParenthesisKeyword_2_0__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DuringAction_SemicolonKeyword_5_q.equals(syntax))
				emit_DuringAction_SemicolonKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_EntryAction_SemicolonKeyword_4_q.equals(syntax))
				emit_EntryAction_SemicolonKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExitAction_SemicolonKeyword_4_q.equals(syntax))
				emit_ExitAction_SemicolonKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionCallEffect_LeftParenthesisRightParenthesisKeyword_3_1_q.equals(syntax))
				emit_FunctionCallEffect_LeftParenthesisRightParenthesisKeyword_3_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionCall_LeftParenthesisRightParenthesisKeyword_2_1_q.equals(syntax))
				emit_FunctionCall_LeftParenthesisRightParenthesisKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IterateAction_SemicolonKeyword_5_q.equals(syntax))
				emit_IterateAction_SemicolonKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SCChart___LeftCurlyBracketKeyword_4_1_0_RightCurlyBracketKeyword_4_1_2__q.equals(syntax))
				emit_SCChart___LeftCurlyBracketKeyword_4_1_0_RightCurlyBracketKeyword_4_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SingleControlflowRegion___RegionKeyword_1_1_ColonKeyword_1_4__q.equals(syntax))
				emit_SingleControlflowRegion___RegionKeyword_1_1_ColonKeyword_1_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SingleDataflowRegion___DataflowKeyword_1_1_ColonKeyword_1_4__q.equals(syntax))
				emit_SingleDataflowRegion___DataflowKeyword_1_1_ColonKeyword_1_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SuspendAction_SemicolonKeyword_5_q.equals(syntax))
				emit_SuspendAction_SemicolonKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Transition_DoKeyword_3_3_0_1_0_1_or_SolidusKeyword_3_3_0_1_0_0.equals(syntax))
				emit_Transition_DoKeyword_3_3_0_1_0_1_or_SolidusKeyword_3_3_0_1_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Transition_WithKeyword_3_3_0_0_1_q.equals(syntax))
				emit_Transition_WithKeyword_3_3_0_0_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('(' '('*)*
	 */
	protected void emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_LeftParenthesisKeyword_3_0_a__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' '('*)+
	 */
	protected void emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_LeftParenthesisKeyword_3_0_a__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ('('* '(')*)?
	 */
	protected void emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0___LeftParenthesisKeyword_3_0_a_LeftParenthesisKeyword_2_0__a__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' | '(')*
	 */
	protected void emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_or_LeftParenthesisKeyword_3_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' | '(')+
	 */
	protected void emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_or_LeftParenthesisKeyword_3_0__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('('* '(')*
	 */
	protected void emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_3_0_a_LeftParenthesisKeyword_2_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('('* '(')+
	 */
	protected void emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_3_0_a_LeftParenthesisKeyword_2_0__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	protected void emit_FunctionCallEffect_LeftParenthesisRightParenthesisKeyword_3_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     ';'?
	 */
	protected void emit_IterateAction_SemicolonKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_SCChart___LeftCurlyBracketKeyword_4_1_0_RightCurlyBracketKeyword_4_1_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('region' ':')?
	 */
	protected void emit_SingleControlflowRegion___RegionKeyword_1_1_ColonKeyword_1_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('dataflow' ':')?
	 */
	protected void emit_SingleDataflowRegion___DataflowKeyword_1_1_ColonKeyword_1_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     '/' | 'do'
	 */
	protected void emit_Transition_DoKeyword_3_3_0_1_0_1_or_SolidusKeyword_3_3_0_1_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'with'?
	 */
	protected void emit_Transition_WithKeyword_3_3_0_0_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
