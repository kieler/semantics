/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.yakindu.sccharts.kivi;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.jface.preference.IPreferenceStore;
import org.yakindu.sct.model.sgraph.SGraphPackage;

import de.cau.cs.kieler.core.kivi.AbstractCombination;
import de.cau.cs.kieler.core.model.gmf.triggers.ModelChangeTrigger.ModelChangeState;
import de.cau.cs.kieler.kiml.kivi.LayoutEffect;
import de.cau.cs.kieler.kiml.ui.KimlUiPlugin;
import de.cau.cs.kieler.kiml.ui.diagram.LayoutHandler;
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncgraphPackage;

/**
 * Applies automatic layout after the model has been changed. Listens to all
 * model attributes that are relevant for the layout, e.g. all String labels of
 * the model and the list of signals, etc.
 * 
 * @author wah
 */
public class LayoutAfterModelChangedCombination extends AbstractCombination {

	private static NotificationFilter modelFilter = NotificationFilter
			.createNotifierTypeFilter(SyncgraphPackage.eINSTANCE.getSyncState())
			.or(NotificationFilter
					.createNotifierTypeFilter(SyncgraphPackage.eINSTANCE
							.getSyncTransition()))
			.or(NotificationFilter
					.createNotifierTypeFilter(SGraphPackage.eINSTANCE
							.getRegion())
			.or(NotificationFilter
					.createNotifierTypeFilter(SGraphPackage.eINSTANCE
							.getChoice()))				
					);

	/**
	 * Apply automatic layout every time the model changed state is updated.
	 * 
	 * @param modelState
	 *            model changed
	 */
	public void execute(final ModelChangeState modelState) {
		IPreferenceStore preferenceStore = KimlUiPlugin.getDefault()
				.getPreferenceStore();
		boolean animation = preferenceStore
				.getBoolean(LayoutHandler.PREF_ANIMATION);
		boolean zoomToFit = preferenceStore.getBoolean(LayoutHandler.PREF_ZOOM);
		boolean progressDialog = preferenceStore
				.getBoolean(LayoutHandler.PREF_PROGRESS);

		// Create a copy of the notifications list, since the transaction could
		// still be active,
		// which could lead to concurrent modification exceptions.
		List<Notification> list = modelState.getChange().getNotifications();
		Notification[] notifications = list.toArray(new Notification[list
				.size()]);
		for (Notification notification : notifications) {
			// call layout for every relevant model change. layout effects will
			// be merged by
			// KiVi to avoid too many effects and to guarantee that the right
			// parent is layouted
			if (modelFilter.matches(notification)
					&& notification.getNotifier() instanceof EObject) {
				schedule(new LayoutEffect(modelState.getWorkbenchPart(),
						(EObject) notification.getNotifier(), zoomToFit,
						progressDialog, true, animation));
			}
		}
	}

}
