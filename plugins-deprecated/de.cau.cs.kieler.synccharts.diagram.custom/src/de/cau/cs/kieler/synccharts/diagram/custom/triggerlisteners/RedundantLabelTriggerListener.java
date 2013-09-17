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
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.TriggerListener;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.progress.WorkbenchJob;

import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.diagram.custom.SyncchartsDiagramCustomPlugin;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateRegionLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionPriorityEditPart;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditor;

/**
 * This class is responsible for hiding redundant labels.
 * 
 * For example it hides the region id label if the parent state only has one
 * region. It also hides the transition priority label if the source state only
 * has one outgoing transition.
 * 
 * @author soh
 * @kieler.ignore (excluded from review process)
 */
public class RedundantLabelTriggerListener extends TriggerListener {

    /** true if all labels should be hidden. */
    private static boolean hideAll = false;

    /**
     * Hide all transition labels.
     */
    public static void hideAll() {
        hideAll = true;
    }

    /**
     * Only hide redundant labels.
     */
    public static void hideRedundant() {
        hideAll = false;
    }

    /**
     * Creates a new RedundantLabelTriggerListener.
     * 
     */
    public RedundantLabelTriggerListener() {
        super(NotificationFilter.RESOURCE_LOADED.or(NotificationFilter
                .createFeatureFilter(
                        SyncchartsPackage.eINSTANCE.getState_Regions())
                .or(NotificationFilter
                        .createFeatureFilter(SyncchartsPackage.eINSTANCE
                                .getState_OutgoingTransitions()))));
    }

    /**
     * Creates a new RedundantLabelTriggerListener.
     * 
     * @param filter
     *            the filter
     */
    public RedundantLabelTriggerListener(final NotificationFilter filter) {
        super(filter);
    }

    /**
     * Manually trigger the trigger listener.
     * 
     */
    public static void hideRedundantLabels() {
        new RedundantLabelTriggerListener().performCleanup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Command trigger(final TransactionalEditingDomain domain,
            final Notification notification) {
        performCleanup();
        return null;
    }

    /** The currently running cleanup job. */
    private static WorkbenchJob job;

    /** True if a job is waiting. */
    private static boolean waiting = false;

    /** The delay of the job. */
    private static final int JOB_DELAY = 1000;

    /** The last active editor. */
    private static SyncchartsDiagramEditor lastActive;

    /**
     * Cleanup all labels.
     */
    private void performCleanup() {
        if (waiting) {
            job.cancel();
        }
        job = new WorkbenchJob("Redundant Label Cleanup") {
            @Override
            public IStatus runInUIThread(final IProgressMonitor monitor) {
                waiting = false;
                IEditorPart part = SyncchartsDiagramCustomPlugin
                        .getInstance().getActiveEditorPart();
                // IProgressMonitor dummyMonitor = new NullProgressMonitor();

                if (part instanceof SyncchartsDiagramEditor) {
                    // boolean save = !part.isDirty();
                    lastActive = (SyncchartsDiagramEditor) part;
                    VisibilityManager.reset(lastActive);
                    clean(lastActive);
                    // chsch: in combination with Xtext this can be a big mess!!
                    // if (save) {
                    // part.doSave(dummyMonitor);
                    // }
                    
                }
                return Status.OK_STATUS;
            }
        };
        waiting = true;
        job.schedule(JOB_DELAY);
    }

    /**
     * Cleanup one particular editor.
     * 
     * @param part
     *            the editor part
     */
    private void clean(final SyncchartsDiagramEditor part) {
        DiagramEditPart dep = part.getDiagramEditPart();
        Collection<?> editParts = dep.getViewer().getEditPartRegistry()
                .values();
        List<Object> list = new LinkedList<Object>();
        for (Object o : editParts) {
            list.add(o);
        }
        Iterator<?> iter = list.iterator();
        while (iter.hasNext()) {
            Object o = iter.next();
            // test if it is one of the relevant edit parts
            if (o instanceof TransitionPriorityEditPart
                    || o instanceof StateRegionLabelEditPart) {
                // get the semantic element
                EObject obj = ((View) ((EditPart) o).getModel()).getElement();
                if (o instanceof TransitionPriorityEditPart) {
                    Transition trans = (Transition) obj;
                    TransitionPriorityEditPart editPart = (TransitionPriorityEditPart) o;
                    // test condition
                    int outgoing = trans.getSourceState() == null ? 0 : trans
                            .getSourceState().getOutgoingTransitions().size();
                    if (hideAll || outgoing == 1) {
                        VisibilityManager.hide(part, editPart);
                        continue;
                    }
                } else if (o instanceof StateRegionLabelEditPart) {
                    StateRegionLabelEditPart editPart = (StateRegionLabelEditPart) o;
                    Region region = (Region) obj;
                    State parent = region.getParentState();
                    if (parent != null) {
                        int regions = parent.getRegions().size();
                        if (regions == 1) {
                            VisibilityManager.hide(part, editPart);
                            continue;
                        }
                    }
                }
            }
        }
    }
}
