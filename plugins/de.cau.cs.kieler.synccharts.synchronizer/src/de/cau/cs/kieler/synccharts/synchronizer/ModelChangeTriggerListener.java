package de.cau.cs.kieler.synccharts.synchronizer;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.TriggerListener;

import de.cau.cs.kieler.core.annotations.AnnotationsPackage;
import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;

public class ModelChangeTriggerListener extends TriggerListener {

    private static boolean enabled = false;

    public ModelChangeTriggerListener() {
        super(NotificationFilter.createNotifierTypeFilter(
                AnnotationsPackage.eINSTANCE.getAnnotatable()).or(
                NotificationFilter.createNotifierTypeFilter(
                        KExpressionsPackage.eINSTANCE.getExpression())));
    }

    public Command transactionAboutToCommit(ResourceSetChangeEvent event) throws RollbackException {
        return null;
    }

    public void resourceSetChanged(ResourceSetChangeEvent event) {
        if (enabled && ModelSynchronizer.INSTANCE != null) {
            // System.out.println("GMF triggering is " + (enabled?"":"not ") + "enabled!");
            ModelSynchronizer.INSTANCE.triggerModelChangeListener(event);
        }
    }

    @Override
    protected Command trigger(TransactionalEditingDomain domain, Notification notification) {
//        System.out.println("Hier");
        return null;
    }

    @Override
    public boolean isPrecommitOnly() {
        return false;
    }

    @Override
    public boolean isPostcommitOnly() {
        return true;
    }

    public static void setEnabled(boolean isEnabled) {
        enabled = isEnabled;
    }
}
