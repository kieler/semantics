package de.cau.cs.kieler.scl.serializer;

import com.google.inject.Inject;
import de.cau.cs.kieler.scl.services.SCLGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public abstract class AbstractSCLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SCLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AlwaysEvent_AlwaysKeyword_1_0_or_OncycleKeyword_1_1;
	protected AbstractElementAlias match_Conditional_SemicolonKeyword_3_0_2_q;
	protected AbstractElementAlias match_DefaultTrigger_DefaultKeyword_1_0_or_ElseKeyword_1_1;
	protected AbstractElementAlias match_InstructionScope_SemicolonKeyword_3_0_2_q;
	protected AbstractElementAlias match_Program_SemicolonKeyword_4_0_2_q;
	protected AbstractElementAlias match_Thread_SemicolonKeyword_1_0_2_q;
	protected AbstractElementAlias match_TransitionReaction_NumberSignKeyword_3_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SCLGrammarAccess) access;
		match_AlwaysEvent_AlwaysKeyword_1_0_or_OncycleKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAlwaysEventAccess().getAlwaysKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getAlwaysEventAccess().getOncycleKeyword_1_1()));
		match_Conditional_SemicolonKeyword_3_0_2_q = new TokenAlias(false, true, grammarAccess.getConditionalAccess().getSemicolonKeyword_3_0_2());
		match_DefaultTrigger_DefaultKeyword_1_0_or_ElseKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDefaultTriggerAccess().getDefaultKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getDefaultTriggerAccess().getElseKeyword_1_1()));
		match_InstructionScope_SemicolonKeyword_3_0_2_q = new TokenAlias(false, true, grammarAccess.getInstructionScopeAccess().getSemicolonKeyword_3_0_2());
		match_Program_SemicolonKeyword_4_0_2_q = new TokenAlias(false, true, grammarAccess.getProgramAccess().getSemicolonKeyword_4_0_2());
		match_Thread_SemicolonKeyword_1_0_2_q = new TokenAlias(false, true, grammarAccess.getThreadAccess().getSemicolonKeyword_1_0_2());
		match_TransitionReaction_NumberSignKeyword_3_0_q = new TokenAlias(false, true, grammarAccess.getTransitionReactionAccess().getNumberSignKeyword_3_0());
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
			if(match_AlwaysEvent_AlwaysKeyword_1_0_or_OncycleKeyword_1_1.equals(syntax))
				emit_AlwaysEvent_AlwaysKeyword_1_0_or_OncycleKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Conditional_SemicolonKeyword_3_0_2_q.equals(syntax))
				emit_Conditional_SemicolonKeyword_3_0_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DefaultTrigger_DefaultKeyword_1_0_or_ElseKeyword_1_1.equals(syntax))
				emit_DefaultTrigger_DefaultKeyword_1_0_or_ElseKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_InstructionScope_SemicolonKeyword_3_0_2_q.equals(syntax))
				emit_InstructionScope_SemicolonKeyword_3_0_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Program_SemicolonKeyword_4_0_2_q.equals(syntax))
				emit_Program_SemicolonKeyword_4_0_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Thread_SemicolonKeyword_1_0_2_q.equals(syntax))
				emit_Thread_SemicolonKeyword_1_0_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TransitionReaction_NumberSignKeyword_3_0_q.equals(syntax))
				emit_TransitionReaction_NumberSignKeyword_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'oncycle' | 'always'
	 */
	protected void emit_AlwaysEvent_AlwaysKeyword_1_0_or_OncycleKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_Conditional_SemicolonKeyword_3_0_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'else' | 'default'
	 */
	protected void emit_DefaultTrigger_DefaultKeyword_1_0_or_ElseKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_InstructionScope_SemicolonKeyword_3_0_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_Program_SemicolonKeyword_4_0_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_Thread_SemicolonKeyword_1_0_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '#'?
	 */
	protected void emit_TransitionReaction_NumberSignKeyword_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
