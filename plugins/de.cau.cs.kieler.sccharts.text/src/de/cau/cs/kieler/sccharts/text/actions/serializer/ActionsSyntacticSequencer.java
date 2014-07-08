package de.cau.cs.kieler.sccharts.text.actions.serializer;

import java.util.List;

import javax.inject.Inject;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;

import de.cau.cs.kieler.sccharts.text.actions.services.ActionsGrammarAccess;

@SuppressWarnings("restriction")
public class ActionsSyntacticSequencer extends AbstractActionsSyntacticSequencer {
    
    @Inject
    ActionsGrammarAccess ga;
    
    /**
     * {@inheritDoc}
     */
    @Override
    protected void emit_DuringAction_SemicolonKeyword_5_q(EObject semanticObject,
            ISynNavigable transition, List<INode> nodes) {
        super.emit_DuringAction_SemicolonKeyword_5_q(semanticObject, transition, nodes);
        
        acceptUnassignedKeyword(ga.getDuringActionAccess().getSemicolonKeyword_5(), ";", null);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    protected void emit_EntryAction_SemicolonKeyword_4_q(EObject semanticObject,
            ISynNavigable transition, List<INode> nodes) {
        super.emit_EntryAction_SemicolonKeyword_4_q(semanticObject, transition, nodes);

        acceptUnassignedKeyword(ga.getEntryActionAccess().getSemicolonKeyword_4(), ";", null);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    protected void emit_ExitAction_SemicolonKeyword_4_q(EObject semanticObject,
            ISynNavigable transition, List<INode> nodes) {
        super.emit_ExitAction_SemicolonKeyword_4_q(semanticObject, transition, nodes);

        acceptUnassignedKeyword(ga.getExitActionAccess().getSemicolonKeyword_4(), ";", null);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    protected void emit_SuspendAction_SemicolonKeyword_5_q(EObject semanticObject,
            ISynNavigable transition, List<INode> nodes) {
        super.emit_SuspendAction_SemicolonKeyword_5_q(semanticObject, transition, nodes);

        acceptUnassignedKeyword(ga.getSuspendActionAccess().getSemicolonKeyword_5(), ";", null);
    }
    
}
