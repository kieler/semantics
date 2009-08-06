package de.cau.cs.kieler.synccharts.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.Action2EditPart;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramUpdater;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsNodeDescriptor;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsVisualIDRegistry;

/**
 * @generated
 */
public class StateInnerActionsCompartment2CanonicalEditPolicy extends
        CanonicalEditPolicy {

    /**
     * @generated
     */
    Set myFeaturesToSynchronize;

    /**
     * @generated
     */
    protected List getSemanticChildrenList() {
        View viewObject = (View) getHost().getModel();
        List result = new LinkedList();
        for (Iterator it = SyncchartsDiagramUpdater
                .getStateOnInsideAction_7011SemanticChildren(viewObject)
                .iterator(); it.hasNext();) {
            result
                    .add(((SyncchartsNodeDescriptor) it.next())
                            .getModelElement());
        }
        return result;
    }

    /**
     * @generated
     */
    protected boolean isOrphaned(Collection semanticChildren, final View view) {
        int visualID = SyncchartsVisualIDRegistry.getVisualID(view);
        switch (visualID) {
        case Action2EditPart.VISUAL_ID:
            if (!semanticChildren.contains(view.getElement())) {
                return true;
            }
        }
        return false;
    }

    /**
     * @generated
     */
    protected String getDefaultFactoryHint() {
        return null;
    }

    /**
     * @generated
     */
    protected Set getFeaturesToSynchronize() {
        if (myFeaturesToSynchronize == null) {
            myFeaturesToSynchronize = new HashSet();
            myFeaturesToSynchronize.add(SyncchartsPackage.eINSTANCE
                    .getState_InnerActions());
        }
        return myFeaturesToSynchronize;
    }

}
