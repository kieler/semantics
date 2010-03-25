/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts.diagram.custom.triggerlisteners;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.TriggerListener;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IEditorPart;

import de.cau.cs.kieler.core.model.util.ModelingUtil;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.diagram.custom.SyncchartsDiagramCustomPlugin;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionIdEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionPriorityEditPart;

/**
 * @author soh
 */
public class RedundantLabelTriggerListener extends TriggerListener {

    /**
     * Creates a new RedundantLabelTriggerListener.
     * 
     */
    public RedundantLabelTriggerListener() {
    }

    /**
     * Creates a new RedundantLabelTriggerListener.
     * 
     * @param filter
     */
    public RedundantLabelTriggerListener(NotificationFilter filter) {
        super(filter);
    }

    /**
     * Manually trigger the trigger listener.
     * 
     */
    public static void hideRedundantLabels() {
        new RedundantLabelTriggerListener().trigger(null, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Command trigger(TransactionalEditingDomain domain,
            Notification notification) {
        IEditorPart part = SyncchartsDiagramCustomPlugin.instance
                .getActiveEditorPart();
        VisibilityManager.reset(part);
        if (part instanceof IDiagramWorkbenchPart) {
            DiagramEditPart dep = ((IDiagramWorkbenchPart) part)
                    .getDiagramEditPart();
            Collection<?> editParts = dep.getViewer().getEditPartRegistry()
                    .values();
            for (Object o : editParts) {
                if (o instanceof EditPart) {
                    EditPart editPart = (EditPart) o;
                    Object model = editPart.getModel();
                    if (model instanceof View) {
                        EObject eObject = ((View) model).getElement();
                        if (eObject instanceof Transition) {
                            Transition trans = (Transition) eObject;
                            State parent = trans.getSourceState();
                            if (parent != null
                                    && parent.getOutgoingTransitions() != null
                                    && parent.getOutgoingTransitions().size() == 1) {
                                List<EditPart> parts = ModelingUtil
                                        .getEditParts(dep, trans);
                                for (EditPart edPart : parts) {
                                    if (edPart instanceof TransitionPriorityEditPart) {
                                        VisibilityManager.hide(part,
                                                (GraphicalEditPart) edPart);
                                    }
                                }
                            }
                        } else if (eObject instanceof Region) {
                            Region region = (Region) eObject;
                            State parent = region.getParentState();
                            if (parent != null && parent.getRegions() != null
                                    && parent.getRegions().size() == 1) {
                                List<EditPart> parts = ModelingUtil
                                        .getEditParts(dep, region);
                                for (EditPart edPart : parts) {
                                    if (edPart instanceof RegionIdEditPart) {
                                        VisibilityManager.hide(part,
                                                (GraphicalEditPart) edPart);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

}
