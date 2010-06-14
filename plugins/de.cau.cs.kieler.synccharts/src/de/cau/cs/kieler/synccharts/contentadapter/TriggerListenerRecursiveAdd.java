package de.cau.cs.kieler.synccharts.contentadapter;

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
 * A pre-commit TriggerListener that listens to any ADD and ADD_MANY
 * notifications in the SyncChartsPackage and broadcasts new ADD Notifications
 * for all children of the new objects. This is used to inform all pre-commit
 * ResourceSetListeners also about the new children of the freshly added
 * elements. If this was not installed, adding ABRO in one batch operation to a
 * SyncChart would cause only one Notification about the main ABRO state but not
 * about any of the child States/Regions/Signals/Transitions/...
 * 
 * @author haf
 * 
 */
public class TriggerListenerRecursiveAdd extends FireOnceTriggerListener {

    public TriggerListenerRecursiveAdd() {
        super(NotificationFilter.ANY);
    }

    public TriggerListenerRecursiveAdd(NotificationFilter filter) {
        super(filter);
    }

    @Override
    protected Command trigger(TransactionalEditingDomain domain, Notification notification) {
        PossiblyEmptyCompoundCommand cc = new PossiblyEmptyCompoundCommand();
        int type = notification.getEventType();
        if (type == Notification.ADD || type == Notification.ADD_MANY) {
//            System.out.println("Recursive: " + notification);
            Object newValue = notification.getNewValue();
            if (newValue instanceof EObject
                    && ((EObject) newValue).eClass().getEPackage().equals(
                            SyncchartsPackage.eINSTANCE)) {
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
                List<ResourceSetListener> listeners = SyncchartsContentUtil
                        .getTriggerListeners(domain);
                for (ResourceSetListener listener : listeners) {
                    if (listener != this) { // do not inform ME again of this change!
                        try {
                            List<Notification> filtered = FilterManager.getInstance().select(newNotifications,listener.getFilter());
                            ResourceSetChangeEvent event = new ResourceSetChangeEvent(domain, null,
                                    filtered);
                            cc.append(listener.transactionAboutToCommit(event));
                        } catch (RollbackException e) {
                            Status myStatus = new Status(IStatus.ERROR,
                                    "de.cau.cs.kieler.synccharts",
                                    "Error handling nested model change in TriggerListener", e);
                            StatusManager.getManager().handle(myStatus, StatusManager.LOG);
                        }
                    }
                }
            }
        }
        return cc.unwrapAll();
    }

}
