package de.cau.cs.kieler.synccharts.contentadapter;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TriggerListener;
import org.eclipse.ui.statushandlers.StatusManager;

/**
 * An abstract TriggerListener, that catches all Exceptions and logs them.
 * Problem with TriggerListeners is that in case of an Exception, the whole
 * corresponding transaction will be rolled back. Even commands that have not
 * much to do with the trigger listener will be undone. Subclasses of this class
 * can throw any exceptions which get only logged (to get some not annoying fail
 * silent behavior) and still return a null Command, which will be correctly
 * processed by the transaction service. Hence the original transaction can be
 * executed correctly and will not be disturbed by this TriggerListener.
 * 
 * @author haf
 * 
 */
abstract public class FailSafeTriggerListener extends TriggerListener {

    public FailSafeTriggerListener() {
        super();
    }

    public FailSafeTriggerListener(NotificationFilter filter) {
        super(filter);
    }

    @Override
    public Command transactionAboutToCommit(ResourceSetChangeEvent event) throws RollbackException {
        try {
            return super.transactionAboutToCommit(event);
        } catch (Exception e) {
            Status myStatus = new Status(IStatus.ERROR, "de.cau.cs.kieler.synccharts",
                    "Failed to apply a SyncCharts trigger listener.", e);
            StatusManager.getManager().handle(myStatus, StatusManager.LOG);
            return null;
        }
    }

}
