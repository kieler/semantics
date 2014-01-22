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
package de.cau.cs.kieler.synccharts.listener;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.FilterManager;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.core.model.util.PossiblyEmptyCompoundCommand;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;

/**
 * A pre-commit TriggerListener that listens to any ADD and ADD_MANY notifications in the
 * SyncChartsPackage and broadcasts new ADD Notifications for all children of the new objects. This
 * is used to inform all pre-commit ResourceSetListeners also about the new children of the freshly
 * added elements. If this was not installed, adding ABRO in one batch operation to a SyncChart
 * would cause only one Notification about the main ABRO state but not about any of the child
 * States/Regions/Signals/Transitions/...
 * 
 * @author haf
 * @kieler.ignore (excluded from review process)
 */
public class TriggerListenerRecursiveAdd extends FireOnceTriggerListener {

    /**
     * Constructor.
     */
    public TriggerListenerRecursiveAdd() {
        super(NotificationFilter.createEventTypeFilter(Notification.ADD).or(
                NotificationFilter.createEventTypeFilter(Notification.ADD_MANY)));
    }

    /**
     * Constructor.
     * 
     * @param filter a filter
     */
    public TriggerListenerRecursiveAdd(final NotificationFilter filter) {
        super(filter);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Command trigger(final TransactionalEditingDomain domain,
            final Notification notification) {
        PossiblyEmptyCompoundCommand cc = new PossiblyEmptyCompoundCommand();
        // System.out.println("Recursive: " + notification);
        Object newValue = notification.getNewValue();
        if (newValue instanceof EObject
                && ((EObject) newValue).eClass().getEPackage().equals(SyncchartsPackage.eINSTANCE)) {
            List<Notification> newNotifications = new ArrayList<Notification>();
            TreeIterator<EObject> iter = ((EObject) newValue).eAllContents();
            while (iter.hasNext()) {
                EObject descendant = iter.next();
                EStructuralFeature containingFeature = descendant.eContainingFeature();
                final EObject parent = descendant.eContainer();
                newNotifications.add(new ENotificationImpl((InternalEObject) parent,
                        Notification.ADD, containingFeature, null, descendant));
            }
            // create a new event with a null Transaction. This will cause
            // also FireOnceTriggerListener
            // to call its trigger methods and process the event
            List<ResourceSetListener> listeners = SyncchartsContentUtil.getTriggerListeners(domain);
            for (ResourceSetListener listener : listeners) {
                if (listener != this) { // do not inform ME again of this change!
                    try {
                        List<Notification> filtered = FilterManager.getInstance().select(
                                newNotifications, listener.getFilter());
                        ResourceSetChangeEvent event = new ResourceSetChangeEvent(domain, null,
                                filtered);
                        cc.append(listener.transactionAboutToCommit(event));
                    } catch (RollbackException e) {
                        Status myStatus = new Status(IStatus.ERROR, "de.cau.cs.kieler.synccharts",
                                "Error handling nested model change in TriggerListener", e);
                        StatusManager.getManager().handle(myStatus, StatusManager.LOG);
                    }
                }
            }
        }
        return cc.unwrapAll();
    }

}
