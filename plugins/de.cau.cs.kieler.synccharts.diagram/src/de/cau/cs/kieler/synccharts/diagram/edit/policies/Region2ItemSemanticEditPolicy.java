package de.cau.cs.kieler.synccharts.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionStateCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.State2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionEditPart;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsVisualIDRegistry;
import de.cau.cs.kieler.synccharts.diagram.providers.SyncchartsElementTypes;

/**
 * @generated
 */
public class Region2ItemSemanticEditPolicy extends SyncchartsBaseItemSemanticEditPolicy {

    /**
     * @generated
     */
    public Region2ItemSemanticEditPolicy() {
        super(SyncchartsElementTypes.Region_3001);
    }

    /**
     * @generated
     */
    protected Command getDestroyElementCommand(DestroyElementRequest req) {
        View view = (View) getHost().getModel();
        CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(),
                null);
        cmd.setTransactionNestingEnabled(false);
        EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
        if (annotation == null) {
            // there are indirectly referenced children, need extra commands: false
            addDestroyChildNodesCommand(cmd);
            addDestroyShortcutsCommand(cmd, view);
            // delete host element
            cmd.add(new DestroyElementCommand(req));
        } else {
            cmd.add(new DeleteCommand(getEditingDomain(), view));
        }
        return getGEFWrapper(cmd.reduce());
    }

    /**
     * @generated
     */
    private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
        View view = (View) getHost().getModel();
        for (Iterator nit = view.getChildren().iterator(); nit.hasNext();) {
            Node node = (Node) nit.next();
            switch (SyncchartsVisualIDRegistry.getVisualID(node)) {
            case RegionStateCompartmentEditPart.VISUAL_ID:
                for (Iterator cit = node.getChildren().iterator(); cit.hasNext();) {
                    Node cnode = (Node) cit.next();
                    switch (SyncchartsVisualIDRegistry.getVisualID(cnode)) {
                    case State2EditPart.VISUAL_ID:
                        for (Iterator it = cnode.getTargetEdges().iterator(); it.hasNext();) {
                            Edge incomingLink = (Edge) it.next();
                            if (SyncchartsVisualIDRegistry.getVisualID(incomingLink) == TransitionEditPart.VISUAL_ID) {
                                DestroyElementRequest r = new DestroyElementRequest(incomingLink
                                        .getElement(), false);
                                cmd.add(new DestroyElementCommand(r));
                                cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
                                continue;
                            }
                        }
                        for (Iterator it = cnode.getSourceEdges().iterator(); it.hasNext();) {
                            Edge outgoingLink = (Edge) it.next();
                            if (SyncchartsVisualIDRegistry.getVisualID(outgoingLink) == TransitionEditPart.VISUAL_ID) {
                                DestroyElementRequest r = new DestroyElementRequest(outgoingLink
                                        .getElement(), false);
                                cmd.add(new DestroyElementCommand(r));
                                cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
                                continue;
                            }
                        }
                        cmd.add(new DestroyElementCommand(new DestroyElementRequest(
                                getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
                        // don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
                        // cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
                        break;
                    }
                }
                break;
            }
        }
    }

}
