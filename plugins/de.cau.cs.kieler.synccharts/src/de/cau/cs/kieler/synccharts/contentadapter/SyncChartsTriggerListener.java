package de.cau.cs.kieler.synccharts.contentadapter;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.TriggerListener;


public class SyncChartsTriggerListener extends TriggerListener{

    /**
     * Singleton Pattern: Only one notifier object should be used.
     */
    public static final SyncChartsTriggerListener INSTANCE = new SyncChartsTriggerListener();
    
    @Override
    protected Command trigger(TransactionalEditingDomain domain, Notification notification) {
//        System.out.println(notification);
        return null;
    }

    
}
