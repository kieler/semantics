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

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.jface.preference.IPreferenceStore;

import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.core.kivi.AbstractCombination;
import de.cau.cs.kieler.core.model.gmf.triggers.ModelChangeTrigger.ModelChangeState;
import de.cau.cs.kieler.kiml.kivi.LayoutEffect;
import de.cau.cs.kieler.kiml.ui.KimlUiPlugin;
import de.cau.cs.kieler.kiml.ui.diagram.LayoutHandler;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;

/**
 * Applies automatic layout after the model has been changed. Listens to 
 * all model attributes that are relevant for the layout, e.g. all String labels
 * of the model and the list of signals, etc.
 * 
 * @deprecated (haf) this combination might trigger layout very often, i.e. at every small model
 *             change. This calls layout even during a more complex model change that involves
 *             multiple small changes.
 * 
 * @author mmu
 * @author haf
 * @kieler.ignore (excluded from review process)
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

    /**
     * Apply automatic layout every time the model changed state is updated.
     * 
     * @param modelState
     *            model changed
     */
    public void execute(final ModelChangeState modelState) {
        IPreferenceStore preferenceStore = KimlUiPlugin.getDefault().getPreferenceStore();
        boolean animation = preferenceStore.getBoolean(LayoutHandler.PREF_ANIMATION);
        boolean zoomToFit = preferenceStore.getBoolean(LayoutHandler.PREF_ZOOM);
        boolean progressDialog = preferenceStore.getBoolean(LayoutHandler.PREF_PROGRESS);
        
        // Create a copy of the notifications list, since the transaction could still be active,
        // which could lead to concurrent modification exceptions.
        List<Notification> list = modelState.getChange().getNotifications();
        Notification[] notifications = list.toArray(new Notification[list.size()]);
        for (Notification notification : notifications) {
            // call layout for every relevant model change. layout effects will be merged by
            // KiVi to avoid too many effects and to guarantee that the right parent is layouted
            if (modelFilter.matches(notification) && notification.getNotifier() instanceof EObject) {
                schedule(new LayoutEffect(modelState.getWorkbenchPart(),
                        (EObject) notification.getNotifier(), zoomToFit, progressDialog, true,
                        animation));
            }
        }
    }
    
}
