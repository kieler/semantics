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
package de.cau.cs.kieler.sccharts.kivi;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.jface.preference.IPreferenceStore;

import de.cau.cs.kieler.core.kivi.AbstractCombination;
import de.cau.cs.kieler.core.model.gmf.triggers.ModelChangeTrigger.DiagramChangeState;
import de.cau.cs.kieler.kiml.kivi.LayoutEffect;
import de.cau.cs.kieler.kiml.ui.KimlUiPlugin;
import de.cau.cs.kieler.kiml.ui.diagram.LayoutHandler;

/**
 * Applies automatic layout after the collapsed state of a compartment of a
 * diagram has changed.
 *
 * @author haf
 * @kieler.design proposed by msp
 * @kieler.rating proposed yellow by msp
 */
public class LayoutAfterCollapseExpandCombination extends AbstractCombination {

    /** filter for collapse / expand notifications. */
    private NotificationFilter diagramFilter = NotificationFilter
            .createFeatureFilter(NotationPackage.eINSTANCE.getDrawerStyle_Collapsed());

    /**
     * Apply automatic layout every time the model changed state is updated.
     *
     * @param diagramState
     *            diagram changed
     */
    public void execute(final DiagramChangeState diagramState) {
        IPreferenceStore preferenceStore = KimlUiPlugin.getDefault().getPreferenceStore();
        boolean animation = preferenceStore.getBoolean(LayoutHandler.PREF_ANIMATION);
        boolean zoomToFit = preferenceStore.getBoolean(LayoutHandler.PREF_ZOOM);
        boolean progressDialog = preferenceStore.getBoolean(LayoutHandler.PREF_PROGRESS);

        // Create a copy of the notifications list, since the transaction could still be active,
        // which could lead to concurrent modification exceptions.
        List<Notification> list = diagramState.getChange().getNotifications();
        Notification[] notifications = list.toArray(new Notification[list.size()]);
        for (Notification notification : notifications) {
            if (diagramFilter.matches(notification)
                    && notification.getNotifier() instanceof EObject) {
                schedule(new LayoutEffect(diagramState.getWorkbenchPart(),
                        (EObject) notification.getNotifier(), zoomToFit, progressDialog, true,
                        animation));
            }
        }
    }

}
