package de.cau.cs.kieler.synccharts.labelparser.bridge;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import de.cau.cs.kieler.synccharts.Action;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.contentadapter.FireOnceTriggerListener;

/**
 * Will trigger a re-serialization of an Action label when one of its underlying
 * features has changed.
 * 
 * @author haf
 * 
 */
public class TriggerListenerSerializer extends FireOnceTriggerListener {

    private ActionLabelProcessorWrapper actionLabelProcessor = new ActionLabelProcessorWrapper();

    public TriggerListenerSerializer() {
        super(NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE.getAction_Delay())
                .or(
                        NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                                .getAction_Effects())).or(
                        NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                                .getAction_IsImmediate())).or(
                        NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                                .getAction_Trigger())));
    }

    @Override
    protected Command trigger(TransactionalEditingDomain domain, Notification notification) {
        System.out.println("Serialize: "+notification);
        Action action = (Action) notification.getNotifier();
        return actionLabelProcessor.getProcessActionCommand(action,
                ActionLabelProcessorWrapper.SERIALIZE);
    }

}
