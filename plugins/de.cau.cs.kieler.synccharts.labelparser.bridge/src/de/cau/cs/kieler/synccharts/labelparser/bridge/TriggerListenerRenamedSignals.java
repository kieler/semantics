package de.cau.cs.kieler.synccharts.labelparser.bridge;

import java.io.IOException;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.TriggerListener;

import de.cau.cs.kieler.core.KielerModelException;
import de.cau.cs.kieler.synccharts.Action;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.ValuedObject;
import de.cau.cs.kieler.synccharts.contentadapter.FireOnceTriggerListener;

/**
 * Listen to renamings of Signals and Variables and then re-serialize all affected transition
 * labels.
 * @author haf
 *
 */
public class TriggerListenerRenamedSignals extends FireOnceTriggerListener {

    public TriggerListenerRenamedSignals() {
        super(NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE.getValuedObject_Name()));
    }
    
    private ActionLabelProcessorWrapper actionLabelProcessor = new ActionLabelProcessorWrapper();

    
    @Override
    protected Command trigger(TransactionalEditingDomain domain, Notification notification) {
        ValuedObject signal = (ValuedObject)notification.getNotifier();
        CompoundCommand cc = new CompoundCommand();
        /*
         * serialize the label again if any names have changed. Conditions for serialization: - the
         * name attribute of a Signal/Variable is affected - new name is not null - name has really
         * changed (new and old are not the same, but old might be null)
         */
        if (   notification.getNewStringValue() != null
                && (notification.getOldStringValue() == null || !notification.getNewStringValue()
                        .equals(notification.getOldStringValue()))) {
            // first serialize the label
            // then re-parse it again (might be necessary if new Signals have
            // been introduced) Reparsing is done automatically by the corresponding TriggerListener.
            cc.append(actionLabelProcessor.getProcessAffectedActionLabelCommand(signal, null,
                        ActionLabelProcessorWrapper.SERIALIZE));
        }
        return cc;
    }

}
