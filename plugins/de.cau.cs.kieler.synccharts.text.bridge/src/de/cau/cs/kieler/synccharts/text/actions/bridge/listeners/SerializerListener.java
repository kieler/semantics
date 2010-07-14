package de.cau.cs.kieler.synccharts.text.actions.bridge.listeners;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import de.cau.cs.kieler.synccharts.Action;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.contentadapter.FireOnceTriggerListener;
import de.cau.cs.kieler.synccharts.text.actions.bridge.ActionLabelProcessorWrapper;
import de.cau.cs.kieler.synccharts.text.actions.bridge.LabelParserBridgePlugin;

/**
 * Will trigger a re-serialization of an Action label when one of its underlying
 * features has changed.
 * 
 * @author haf
 * 
 */
public class SerializerListener extends FireOnceTriggerListener {

    private ActionLabelProcessorWrapper actionLabelProcessor = new ActionLabelProcessorWrapper();

    public SerializerListener() {
        super(NotificationFilter.createFeatureFilter(
                SyncchartsPackage.eINSTANCE.getAction_Delay()).or(
                NotificationFilter
                        .createFeatureFilter(SyncchartsPackage.eINSTANCE
                                .getAction_Effects())).or(
                NotificationFilter
                        .createFeatureFilter(SyncchartsPackage.eINSTANCE
                                .getAction_IsImmediate())).or(
                NotificationFilter
                        .createFeatureFilter(SyncchartsPackage.eINSTANCE
                                .getAction_Trigger())));
    }

    @Override
    protected Command trigger(TransactionalEditingDomain domain,
            Notification notification) {
        Action action = (Action) notification.getNotifier();
        if (LabelParserBridgePlugin.getDefault().doAutomaticSerialization()) {
            return actionLabelProcessor.getProcessActionCommand(action,
                    ActionLabelProcessorWrapper.SERIALIZE);
        }
        return null;
    }

}
