package de.cau.cs.kieler.synccharts.viewmanagement;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.listener.FireOnceTriggerListener;
import de.cau.cs.kieler.viewmanagement.ATrigger;
import de.cau.cs.kieler.viewmanagement.TriggerEventObject;

public class LabelSizeChangedTrigger extends FireOnceTriggerListener {

    public LabelSizeChangedTrigger() {
        super(NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE.getScope_Label())
            .or(NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                .getAction_Label())));
    }

    @Override
    protected Command trigger(final TransactionalEditingDomain domain, final Notification notification) {
        Object notifier = notification.getNotifier();
        if (notifier instanceof EObject) {
            ViewManagementTrigger.getInstance().notifyAllListeners((EObject) notifier);
        }

        return null;
    }

    static public class ViewManagementTrigger extends ATrigger {

        static ViewManagementTrigger instance;

        public ViewManagementTrigger() {
            instance = this;
        }

        static ViewManagementTrigger getInstance() {
            if (instance == null) {
                instance = new ViewManagementTrigger();
            }
            return instance;
        }

        void notifyAllListeners(final EObject notifier) {
            if(this.getListenerQuantity() > 0){
                TriggerEventObject triggerEvent = new TriggerEventObject();
                triggerEvent.setAffectedObject(notifier);
                triggerEvent.setTriggerActive(true);
                this.notifyTrigger(triggerEvent);
            }
        }

    }
}
