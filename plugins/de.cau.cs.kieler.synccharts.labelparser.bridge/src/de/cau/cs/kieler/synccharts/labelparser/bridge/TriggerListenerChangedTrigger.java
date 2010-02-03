package de.cau.cs.kieler.synccharts.labelparser.bridge;

import java.io.IOException;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.TriggerListener;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.core.KielerModelException;
import de.cau.cs.kieler.core.ui.errorhandler.ModelErrorHandler;
import de.cau.cs.kieler.synccharts.Action;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.ValuedObject;

/**
 * Listen to changes of the TriggerAndEffects String of an Action and trigger the 
 * Xtext LabelParser to parse the String and create real objects out of it.
 * @author haf
 *
 */
public class TriggerListenerChangedTrigger extends TriggerListener {

    public TriggerListenerChangedTrigger() {
        super(NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE.getAction_TriggersAndEffects()));
    }
    
    private ActionLabelProcessorWrapper actionLabelProcessor = new ActionLabelProcessorWrapper();

    @Override
    protected Command trigger(final TransactionalEditingDomain domain, final Notification notification) {
        System.out.println("Trigger: " +notification);
        // We know the notifier is an Action. Otherwise it would not have passed the filter.
        Action action = (Action)notification.getNotifier();
        CompoundCommand cc = new CompoundCommand();
        /*
         * In order to parse correctly - the new String must not be
         * null - the old String must not be the same as the new String (however, it could be null)
         * - the Action needs a parent container to determine the scope correctly
         */
        if(notification.getNewStringValue() != null
                // FIXME: disable redundancy check in order to trigger parsing also when
                // there was no change in the label but in the underlying model
                // however, then parsing and serializing goes into an endless loop.
                        && (notification.getOldStringValue() == null || !notification.getNewStringValue()
                                .equals(notification.getOldStringValue()))
        && action.eContainer() != null){
            ModelErrorHandler.clearMarker(action);
            try {
                cc.append(actionLabelProcessor.getProcessActionCommand(action, ActionLabelProcessorWrapper.PARSE));
                // serialize the action again so that the user
                // gets feedback on what the machine thinks the label looks like
                cc.append(actionLabelProcessor.getProcessActionCommand(action, ActionLabelProcessorWrapper.SERIALIZE));
            } catch (Exception e) {
                Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "", e);
                StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
            }
        }
        return cc;
    }
    
   
}
