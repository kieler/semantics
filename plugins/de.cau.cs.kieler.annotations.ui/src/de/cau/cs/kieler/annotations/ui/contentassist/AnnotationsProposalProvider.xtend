/*
 * generated by Xtext
 */
package de.cau.cs.kieler.annotations.ui.contentassist

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.common.ui.contentassist.TerminalsProposalProvider
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal
import org.eclipse.xtext.GrammarUtil
import org.eclipse.xtext.util.Strings

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class AnnotationsProposalProvider extends AbstractAnnotationsProposalProvider {

    /**
     * Need this delegate in order to call methods of that class that are also generated
     * into {@link AbstractAnnotationsProposalProvider} (due to some terminal re-definitions).
     */
    @Inject
    private TerminalsProposalProvider delegate;    
    
    // ---------------------------------------------------------
    //  Terminal-specific annotation proposals
    // ---------------------------------------------------------
    
    override complete_BOOLEAN(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        acceptor.accept(createCompletionProposal("false", "false", getImage(ruleCall), context));
        acceptor.accept(createCompletionProposal("true", "true", getImage(ruleCall), context));
    }
    
    override complete_ExtendedID(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        delegate.complete_ID(model, ruleCall, context, acceptor);
    }
    
    override complete_EString(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        delegate.complete_STRING(model, ruleCall, context, acceptor);
    }
    
    override complete_INT(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        delegate.complete_INT(model, ruleCall, context, acceptor);
    } 
    
    override complete_FLOAT(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        createFloatProposal(context, acceptor, ruleCall, getAssignedFeature(ruleCall), 1f);
    }
    
    /**
     * This method has been copied from
     * {@link org.eclipse.xtext.common.ui.contentassist.TerminalsProposalProvider}.
     */
    private def String getAssignedFeature(RuleCall call) {
        val ass = GrammarUtil.containingAssignment(call);
        if (ass != null) {
                var result = ass.getFeature();
                if (result.equals(result.toLowerCase()))
                        result = Strings.toFirstUpper(result);
                return result;
        }
        return null;
    }
    
    /**
     * This method has been copied and adapted from
     * {@link org.eclipse.xtext.common.ui.contentassist.TerminalsProposalProvider}.
     */
    private def createFloatProposal(ContentAssistContext context,
            ICompletionProposalAcceptor acceptor, RuleCall ruleCall, String feature, float i) {
        val proposalText = getValueConverter().toString(i, ruleCall.getRule().getName());
        var displayText = proposalText + " - " + ruleCall.getRule().getName();
        if (feature != null)
            displayText = proposalText + " - " + feature;
        val proposal = createCompletionProposal(proposalText, displayText, null,
                context);
        if (proposal instanceof ConfigurableCompletionProposal) {
            val configurable = proposal as ConfigurableCompletionProposal;
            configurable.setSelectionStart(configurable.getReplacementOffset());
            configurable.setSelectionLength(proposalText.length());
            configurable.setAutoInsertable(false);
            configurable.setSimpleLinkedMode(context.getViewer(), '\t', ' ');
        }
        acceptor.accept(proposal);
    }

}