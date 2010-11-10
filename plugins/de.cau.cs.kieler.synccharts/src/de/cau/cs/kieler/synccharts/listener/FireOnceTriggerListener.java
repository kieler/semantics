package de.cau.cs.kieler.synccharts.listener;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.Transaction;

/**
 * A TriggerListener that executes the trigger only once for a given
 * transaction. That is, it will not call the trigger again, if the trigger
 * itself has caused some changes that lead to new notifications. This avoids
 * the usual notification loops.
 * 
 * @author haf
 */
public abstract class FireOnceTriggerListener extends FailSafeTriggerListener {

    protected Transaction transaction;

    public FireOnceTriggerListener(NotificationFilter filter) {
        super(filter);
    }
    
    public FireOnceTriggerListener(){
        super();
    }

    /**
     * Setting the Transaction in the event to null will also trigger this listener
     * no matter what.
     */
    @Override
    public Command transactionAboutToCommit(ResourceSetChangeEvent event) throws RollbackException {
        //FIXME: (haf) transaction.isActive() is synchronized an may deadlock if other stuff is changing the model
        //       this can especially happen if changes are called from some other thread and both have to synchronize
        //       on UI thread. Then UI synchronization and this transaction synchronization can deadlock. Workaround
        //       is to run the model changes themselves on the UI thread, which is usually not what one wants.
        if (event.getTransaction() != null && transaction != null && transaction.isActive()) {
            // do nothing if the last transaction seen is not yet committed.
            // That means
            // we see changes performed within that transaction again
            return null;
        }
        // so this is a fresh transaction and we can process it
        if (event != null && event.getTransaction() != null) {
            this.transaction = event.getTransaction();
        }
        return super.transactionAboutToCommit(event);
    }
}
