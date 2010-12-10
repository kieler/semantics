/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts.kivi;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.gmf.runtime.notation.NotationPackage;

import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.core.kivi.AbstractCombination;
import de.cau.cs.kieler.kiml.ui.layout.LayoutEffect;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.core.model.trigger.ModelChangeTrigger.ModelChangeState;
import de.cau.cs.kieler.core.model.trigger.ModelChangeTrigger.DiagramChangeState;

/**
 * Applies automatic layout after the model has been changed.
 * 
 * @author mmu
 * 
 */
public class LayoutAfterModelChangedCombination extends AbstractCombination {

    private static NotificationFilter modelFilter = NotificationFilter
            .createFeatureFilter(SyncchartsPackage.eINSTANCE.getScope_Label())
            .or(NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                    .getAction_Label()))
            .or(NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                    .getScope_SuspensionTrigger()))
            .or(NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                    .getScope_BodyText()))
            .or(NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                    .getScope_InnerActions()))
            .or(NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                    .getScope_ExitActions()))
            .or(NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                    .getScope_EntryActions()))
            .or(NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                    .getState_Regions()))
            .or(NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                    .getState_OutgoingTransitions()))
            .or(NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                    .getState_IncomingTransitions()))
            .or(NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                    .getRegion_States()))
            .or(NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                    .getScope_Signals()))
            .or(NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                    .getScope_Variables()))
            .or(NotificationFilter.createFeatureFilter(KExpressionsPackage.eINSTANCE
                    .getValuedObject_Name()));
    private NotificationFilter diagramFilter = NotificationFilter
            .createFeatureFilter(NotationPackage.eINSTANCE.getDrawerStyle_Collapsed());

    /**
     * Apply automatic layout every time the model changed state is updated.
     * 
     * @param modelState
     *            model changed
     * @param diagramState
     *            diagram changed
     */
    public void execute(final ModelChangeState modelState, final DiagramChangeState diagramState) {
        dontUndo();
        if (modelState.getSequenceNumber() > diagramState.getSequenceNumber()) {
            // model changed
            for (Notification notification : modelState.getChange().getNotifications()) {
                if (modelFilter.matches(notification)
                        && notification.getNotifier() instanceof EObject) {
                    schedule(new LayoutEffect(modelState.getDiagramEditor(),
                            (EObject) notification.getNotifier(), true, false, true));
                }
            }
        } else {
            // diagram changed
            for (Notification notification : diagramState.getChange().getNotifications()) {
                if (diagramFilter.matches(notification)
                        && notification.getNotifier() instanceof EObject) {
                    schedule(new LayoutEffect(diagramState.getDiagramEditor(),
                            (EObject) notification.getNotifier(), true, false, true));
                }
            }
        }
    }
}
