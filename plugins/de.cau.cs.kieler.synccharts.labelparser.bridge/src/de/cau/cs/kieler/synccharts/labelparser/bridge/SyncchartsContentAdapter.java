/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 * 
 *****************************************************************************/
package de.cau.cs.kieler.synccharts.labelparser.bridge;

import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.xtext.parser.antlr.IAntlrParser;
import org.eclipse.xtext.parsetree.reconstr.SerializerUtil;

import com.google.inject.Injector;

import de.cau.cs.kieler.core.KielerException;
import de.cau.cs.kieler.core.KielerModelException;
import de.cau.cs.kieler.synccharts.Action;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.TransitionLabelStandaloneSetup;
import de.cau.cs.kieler.synccharts.ValuedObject;

/**
 * A content adapter for SyncCharts EMF models that listens to model changes and
 * triggers appropriate changes like parsing of Action labels and handling of
 * state labels and IDs.
 * 
 * @author haf
 * 
 */
public class SyncchartsContentAdapter extends AdapterImpl implements IStartup {

    /**
     * Singleton Pattern: Only one notifier object should be used
     */
    final static SyncchartsContentAdapter INSTANCE = new SyncchartsContentAdapter();

    ActionLabelProcessorWrapper actionLabelProcessor = new ActionLabelProcessorWrapper();

    /**
     * Implementing IStartup to register correctly at the startup of the
     * platform.
     */
    public void earlyStartup() {
        init();
    }

    /**
     * Initialization, register a new instance of this class as an Adapter to
     * the EMF EFactory for the metamodel of http://kieler.cs.cau.de/synccharts.
     */
    public static void init() {
        EFactory syncchartsFactory = EPackage.Registry.INSTANCE
                .getEFactory("http://kieler.cs.cau.de/synccharts");
        if (!syncchartsFactory.eAdapters().contains(INSTANCE))
            syncchartsFactory.eAdapters().add(INSTANCE);
    }

    /**
     * React on Notifications of a SyncCharts model and either parse Action
     * labels or serialize them. If the TriggersAndEffects String attribute of
     * an Action has changed, it gets parsed again to build the correct trigger
     * and effects objects. If a Signal or Variable has changed its name, all
     * descendant Actions in that scope are re-serialized such that all
     * TriggersAndEffects String labels will represent the name change. Also
     * listens to changes on States and adapts IDs automatically.
     */
    public void notifyChanged(Notification notification) {
        try {
            Object notifier = notification.getNotifier();

            if (notifier instanceof Action)
                handleAction(notification, (Action) notifier);
            else if (notifier instanceof ValuedObject)
                handleValuedObject(notification, (ValuedObject) notifier);
            else if (notifier instanceof State)
                handleState(notification, (State) notifier);

            // remove all existing problem markers
            if (notifier instanceof EObject) {
                SyncchartsContentUtil.clearMarker((EObject) notifier);
            }
        } catch (Exception e) {
            /*
             * Try to handle the exception by placing a problem Marker in the
             * diagram. If this fails somehow, propagate the error to the next
             * level.
             */
            if (e instanceof KielerModelException) {
                Object modelObject = ((KielerModelException) e)
                        .getModelObject();
                if (modelObject instanceof EObject) {
                    try {
                        SyncchartsContentUtil.addMarker(e.getMessage(),
                                (EObject) modelObject);
                        return;
                    } catch (KielerException e1) { /*
                                                    * nothing, will go on in
                                                    * next case
                                                    */
                    }
                }
            }
            /*
             * Handle the error the classic way by using a popup of the Status
             * Manager.
             */
            Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
                    "My Status Error Message", e);
            StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
            StatusManager.getManager().handle(myStatus, StatusManager.LOG);
        }
    }

    private void handleState(Notification notification, State state) {
        // if state label has changed
        if (notification.getFeature() != null
                && notification.getFeature().equals(
                        SyncchartsPackage.eINSTANCE.getState_Label())) {
            // if state has no label, create a new unique ID
            if (state.getLabel() == null || state.getLabel().trim().equals("")) {
                state.setId(SyncchartsContentUtil.getNewId(state));
            }
            // otherwise take label as ID
            else {
                String newId = state.getLabel();
                newId = newId.replaceAll("\\s", "_"); // replace all whitespace
                // with underscores
                state.setId(newId);
            }
        }
        // if new state is created, only the parent region is set
        else if (notification.getFeature() != null
                && notification.getFeature().equals(
                        SyncchartsPackage.eINSTANCE.getState_ParentRegion())) {
            if (state.getLabel() == null || state.getLabel().trim().equals("")) {
                state.setId(SyncchartsContentUtil.getNewId(state));
            }
        }
    }

    private void handleValuedObject(Notification notification,
            ValuedObject notifier) throws KielerModelException, IOException {
        /*
         * serialize the label again if any names have changed. Conditions for
         * serialization: - the name attribute of a Signal/Variable is affected
         * - new name is not null - name has really changed (new and old are not
         * the same, but old might be null)
         */
        if (notification.getFeature() != null
                && notification.getFeature().equals(
                        SyncchartsPackage.eINSTANCE.getValuedObject_Name())
                && notification.getNewStringValue() != null
                && (notification.getOldStringValue() == null || !notification
                        .getNewStringValue().equals(
                                notification.getOldStringValue()))) {
            // first serialize the label
            // then re-parse it again (might be necessary if new Signals have
            // been introduced)
            try {
                actionLabelProcessor.processAffectedActionLabels(notifier,
                        null, ActionLabelProcessorWrapper.SERIALIZE);
            } catch (Exception e) {
                /*
                 * do nothing: if serialization fails, then there is a problem
                 * with the Action model, e.g. a signal was removed which will
                 * lead to a NullPointerException. So we cannot serialize and
                 * have to parse with the old string.
                 */
            }
            actionLabelProcessor.processAffectedActionLabels(notifier, null,
                    ActionLabelProcessorWrapper.PARSE);
        }
    }

    private void handleAction(Notification notification, Action notifier)
            throws KielerModelException, IOException {
        /*
         * In order to parse correctly - the notifier must be an Action - the
         * new String must not be null - the old String must not be the same as
         * the new String (however, it could be null) - the Action needs a
         * parent container to determine the scope correctly
         */
        if (notification.getFeature() != null
                && notification.getFeature().equals(
                        SyncchartsPackage.eINSTANCE
                                .getAction_TriggersAndEffects())
                && notification.getNewStringValue() != null
                && (notification.getOldStringValue() == null || !notification
                        .getNewStringValue().equals(
                                notification.getOldStringValue()))
                && (notifier).eContainer() != null) {
            // action.setTriggersAndEffects(notification.getNewStringValue());
            actionLabelProcessor.processAction(notifier,
                    ActionLabelProcessorWrapper.PARSE);
            // serialize the action again so that the user
            // gets feedback on what the machine thinks the label looks like
            actionLabelProcessor.processAction(notifier,
                    ActionLabelProcessorWrapper.SERIALIZE);
        }
    }
}
