package de.cau.cs.kieler.synccharts.text.kitsState.serializer;

import com.google.inject.Inject;
import de.cau.cs.kieler.synccharts.text.kitsState.services.KitsStateGrammarAccess;
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

@SuppressWarnings("restriction")
public class AbstractKitsStateSyntacticSequencer extends AbstractSyntacticSequencer {

	protected KitsStateGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_LeftParenthesisKeyword_2_0_a__a;
	protected AbstractElementAlias match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0___LeftParenthesisKeyword_2_0_a_LeftParenthesisKeyword_2_0__a__q;
	protected AbstractElementAlias match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_a_LeftParenthesisKeyword_2_0__a;
	protected AbstractElementAlias match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_a_LeftParenthesisKeyword_2_0__p;
	protected AbstractElementAlias match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_or_LeftParenthesisKeyword_2_0__a;
	protected AbstractElementAlias match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_or_LeftParenthesisKeyword_2_0__p;
	protected AbstractElementAlias match_KeyBooleanValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q;
	protected AbstractElementAlias match_KeyFloatValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q;
	protected AbstractElementAlias match_KeyIntValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q;
	protected AbstractElementAlias match_KeyStringValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q;
	protected AbstractElementAlias match_RootRegion___RegionKeyword_2_1_ColonKeyword_2_4__q;
	protected AbstractElementAlias match_SingleRegion___RegionKeyword_1_1_ColonKeyword_1_4__q;
	protected AbstractElementAlias match_State___LeftCurlyBracketKeyword_6_1_0_RightCurlyBracketKeyword_6_1_2__q;
	protected AbstractElementAlias match_TagAnnotation___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q;
	protected AbstractElementAlias match_Transition_WithKeyword_4_0_q;
	protected AbstractElementAlias match_TypedKeyStringValueAnnotation___LeftParenthesisKeyword_6_0_RightParenthesisKeyword_6_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (KitsStateGrammarAccess) access;
		match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_LeftParenthesisKeyword_2_0_a__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(true, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0()));
		match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0___LeftParenthesisKeyword_2_0_a_LeftParenthesisKeyword_2_0__a__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0()), new GroupAlias(true, true, new TokenAlias(true, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0())));
		match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_a_LeftParenthesisKeyword_2_0__a = new GroupAlias(true, true, new TokenAlias(true, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0()));
		match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_a_LeftParenthesisKeyword_2_0__p = new GroupAlias(true, false, new TokenAlias(true, true, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0()));
		match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_or_LeftParenthesisKeyword_2_0__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0()));
		match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_or_LeftParenthesisKeyword_2_0__p = new AlternativeAlias(true, false, new TokenAlias(false, false, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0()));
		match_KeyBooleanValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getKeyBooleanValueAnnotationAccess().getLeftParenthesisKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getKeyBooleanValueAnnotationAccess().getRightParenthesisKeyword_3_2()));
		match_KeyFloatValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getKeyFloatValueAnnotationAccess().getLeftParenthesisKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getKeyFloatValueAnnotationAccess().getRightParenthesisKeyword_3_2()));
		match_KeyIntValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getKeyIntValueAnnotationAccess().getLeftParenthesisKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getKeyIntValueAnnotationAccess().getRightParenthesisKeyword_3_2()));
		match_KeyStringValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getKeyStringValueAnnotationAccess().getRightParenthesisKeyword_3_2()));
		match_RootRegion___RegionKeyword_2_1_ColonKeyword_2_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRootRegionAccess().getRegionKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getRootRegionAccess().getColonKeyword_2_4()));
		match_SingleRegion___RegionKeyword_1_1_ColonKeyword_1_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSingleRegionAccess().getRegionKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getSingleRegionAccess().getColonKeyword_1_4()));
		match_State___LeftCurlyBracketKeyword_6_1_0_RightCurlyBracketKeyword_6_1_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_6_1_0()), new TokenAlias(false, false, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_6_1_2()));
		match_TagAnnotation___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTagAnnotationAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getTagAnnotationAccess().getRightParenthesisKeyword_2_2()));
		match_Transition_WithKeyword_4_0_q = new TokenAlias(false, true, grammarAccess.getTransitionAccess().getWithKeyword_4_0());
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
			if(match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_LeftParenthesisKeyword_2_0_a__a.equals(syntax))
				emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_LeftParenthesisKeyword_2_0_a__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0___LeftParenthesisKeyword_2_0_a_LeftParenthesisKeyword_2_0__a__q.equals(syntax))
				emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0___LeftParenthesisKeyword_2_0_a_LeftParenthesisKeyword_2_0__a__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_a_LeftParenthesisKeyword_2_0__a.equals(syntax))
				emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_a_LeftParenthesisKeyword_2_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_a_LeftParenthesisKeyword_2_0__p.equals(syntax))
				emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_a_LeftParenthesisKeyword_2_0__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_or_LeftParenthesisKeyword_2_0__a.equals(syntax))
				emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_or_LeftParenthesisKeyword_2_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_or_LeftParenthesisKeyword_2_0__p.equals(syntax))
				emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_or_LeftParenthesisKeyword_2_0__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_KeyBooleanValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q.equals(syntax))
				emit_KeyBooleanValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_KeyFloatValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q.equals(syntax))
				emit_KeyFloatValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_KeyIntValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q.equals(syntax))
				emit_KeyIntValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_KeyStringValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q.equals(syntax))
				emit_KeyStringValueAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RootRegion___RegionKeyword_2_1_ColonKeyword_2_4__q.equals(syntax))
				emit_RootRegion___RegionKeyword_2_1_ColonKeyword_2_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SingleRegion___RegionKeyword_1_1_ColonKeyword_1_4__q.equals(syntax))
				emit_SingleRegion___RegionKeyword_1_1_ColonKeyword_1_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_State___LeftCurlyBracketKeyword_6_1_0_RightCurlyBracketKeyword_6_1_2__q.equals(syntax))
				emit_State___LeftCurlyBracketKeyword_6_1_0_RightCurlyBracketKeyword_6_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TagAnnotation___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q.equals(syntax))
				emit_TagAnnotation___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Transition_WithKeyword_4_0_q.equals(syntax))
				emit_Transition_WithKeyword_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TypedKeyStringValueAnnotation___LeftParenthesisKeyword_6_0_RightParenthesisKeyword_6_2__q.equals(syntax))
				emit_TypedKeyStringValueAnnotation___LeftParenthesisKeyword_6_0_RightParenthesisKeyword_6_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('(' '('*)*
	 */
	protected void emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_LeftParenthesisKeyword_2_0_a__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ('('* '(')*)?
	 */
	protected void emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0___LeftParenthesisKeyword_2_0_a_LeftParenthesisKeyword_2_0__a__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('('* '(')*
	 */
	protected void emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_a_LeftParenthesisKeyword_2_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('('* '(')+
	 */
	protected void emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_a_LeftParenthesisKeyword_2_0__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' | '(')*
	 */
	protected void emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_or_LeftParenthesisKeyword_2_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' | '(')+
	 */
	protected void emit_AtomicExpression_AtomicValuedExpression___LeftParenthesisKeyword_2_0_or_LeftParenthesisKeyword_2_0__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     ('region' ':')?
	 */
	protected void emit_RootRegion___RegionKeyword_2_1_ColonKeyword_2_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('region' ':')?
	 */
	protected void emit_SingleRegion___RegionKeyword_1_1_ColonKeyword_1_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_State___LeftCurlyBracketKeyword_6_1_0_RightCurlyBracketKeyword_6_1_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     'with'?
	 */
	protected void emit_Transition_WithKeyword_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
