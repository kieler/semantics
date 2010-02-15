package de.cau.cs.kieler.synccharts.contentadapter;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.TriggerListener;

public class TriggerListenerDebug extends TriggerListener {

    public TriggerListenerDebug() {
        super(NotificationFilter.ANY);
    }

    public TriggerListenerDebug(NotificationFilter filter) {
        super(filter);
    }

    @Override
    protected Command trigger(TransactionalEditingDomain domain, Notification notification) {
        //System.out.println(notification);
        return null;
    }

}
