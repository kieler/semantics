/*
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.core.KielerException;
import de.cau.cs.kieler.core.KielerModelException;
import de.cau.cs.kieler.synccharts.Action;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.ValuedObject;

/**
 * A content adapter for SyncCharts EMF models that listens to model changes and
 * triggers appropriate changes like parsing of Action labels and handling of
 * state labels and IDs.
 * 
 * @author haf
 */
public class SyncchartsContentAdapter extends AdapterImpl implements IStartup {

    /**
     * Singleton Pattern: Only one notifier object should be used.
     */
    public static final SyncchartsContentAdapter INSTANCE = new SyncchartsContentAdapter();

    /**
     * true if the content adapter should do something. Used to temporarily
     * deactivate the processing.
     */
    private boolean enabled = true;
    /** true if the content adapter should record the notifications. */
    private boolean recording = false;

    /**
     * A List where the adapter records notifications while it is temporarily
     * deactivated.
     */
    private List<Notification> recordedNotifications = new ArrayList<Notification>();

    private ActionLabelProcessorWrapper actionLabelProcessor = new ActionLabelProcessorWrapper();

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
        if (!syncchartsFactory.eAdapters().contains(INSTANCE)) {
            syncchartsFactory.eAdapters().add(INSTANCE);
        }
    }

    /**
     * Enable or disable the content adapter. May be used to temporarily disable
     * the content adaption completely. Make sure to re-enable if you just
     * disabled temporarily, e.g. make sure even when exceptions happen, the
     * adapter is re-enabled. While disabled, also no recordings will be taken.
     * 
     * @see SyncchartsContentAdapter#setRecording(boolean)
     * 
     * @param enable
     *            true if the content adapter should be enabled, false
     *            otherwise.
     */
    public void setEnabled(final boolean enable) {
        this.enabled = enable;
    }

    /**
     * Return true iff the content adapter currently is enabled. If false, the
     * adapter is temporarily deactivated and will not do anything.
     * 
     * @return true iff the adapter is enabled and will listen to model changes.
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Set the content adapter into a recording state. This means it will only
     * record listened notifications and not handle them at that moment. When
     * recording is deactivated, the recorded notifications will get processed
     * all in a bunch automatically. Can be used to deactivate the content
     * adapter temporarily and make multiple changes to the model which will
     * then later be processed in batch.
     * 
     * @param enable
     *            true if start recording, false if stop recording and process
     *            all recorded notifications
     */
    public void setRecording(final boolean enable) {
        this.recording = enable;

        if (!this.recording) {
            for (Notification notification : recordedNotifications) {
                this.notifyChanged(notification);
            }
        }
    }

    /**
     * Return true iff the content adapter is only recording Notifications but
     * not immediately handling them.
     * 
     * @return true iff recording
     */
    public boolean isRecording() {
        return recording;
    }

    /**
     * React on Notifications of a SyncCharts model and either parse Action
     * labels or serialize them. If the TriggersAndEffects String attribute of
     * an Action has changed, it gets parsed again to build the correct trigger
     * and effects objects. If a Signal or Variable has changed its name, all
     * descendant Actions in that scope are re-serialized such that all
     * TriggersAndEffects String labels will represent the name change. Also
     * listens to changes on States and adapts IDs automatically.
     * 
     * @param notification
     *            the notification object given from EMF runtime
     */
    public void notifyChanged(final Notification notification) {
        if (this.enabled) { // only do something if we are not temporarily
            // disabled
            if (this.recording) {
                recordedNotifications.add(notification);
            } else {
                try {
                    Object notifier = notification.getNotifier();

                    if (notifier instanceof Transition) {
                        handleTransition(notification, (Transition) notifier);
                    }
                    // fallthrough: A transition is also an Action
                    if (notifier instanceof Action) {
                        handleAction(notification, (Action) notifier);
                    } else if (notifier instanceof ValuedObject) {
                        handleValuedObject(notification, (ValuedObject) notifier);
                    } else if (notifier instanceof State) {
                        handleState(notification, (State) notifier);
                    }

                    // remove all existing problem markers
                    if (notifier instanceof EObject) {
                        SyncchartsContentUtil.clearMarker((EObject) notifier);
                    }
                } catch (IllegalStateException ise) {
                    Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
                            "Exception during SyncChart model post-processing: "
                                    + ise.getClass().getName(), ise);
                    StatusManager.getManager().handle(myStatus, StatusManager.LOG);
                } catch (Exception e) {
                    /*
                     * Try to handle the exception by placing a problem Marker in the diagram. 
                     * If this fails
                     * somehow, propagate the error to the next level.
                     */
                    if (e instanceof KielerModelException) {
                        Object modelObject = ((KielerModelException) e).getModelObject();
                        if (modelObject instanceof EObject) {
                            try {
                                SyncchartsContentUtil.addMarker(e.getMessage(),
                                        (EObject) modelObject);
                                return;
                            } catch (KielerException e1) {
                                /* nothing, will go on in next case */
                            }
                        }
                    }
                    /*
                     * Handle the error the classic way by using a popup of the Status Manager.
                     */
                    Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
                            "Exception during SyncChart model post-processing: "
                                    + e.getClass().getName(), e);
                    StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
                    StatusManager.getManager().handle(myStatus, StatusManager.LOG);
                }
            }
        }
    }

    /* 
     * Process transition priorities: Fix priorities automatically such that there is
     * a successive order of priorities.
     */
    private void handleTransition(final Notification notification, final Transition transition) {
        State source = transition.getSourceState();
        if (source != null) {
            // Prio has changed
            if (notification.getFeature() != null
                    && notification.getFeature().equals(
                            SyncchartsPackage.eINSTANCE.getTransition_Priority())
                    && notification.getNewIntValue() != notification.getOldIntValue()) {

                handleTransitionPrioChange(notification, transition);
                // source has changed
            } else if (notification.getFeature() != null
                    && notification.getFeature().equals(
                            SyncchartsPackage.eINSTANCE.getTransition_SourceState())
                    && notification.getNewValue() != notification.getOldValue()) {
                // fix prios of old source state
                handleStateFixPriorities((State) notification.getOldValue());
                // give the transition a new unique prio at the new source state
                handleTransitionNew(transition);
                // now fix the prios at the new source state
                handleStateFixPriorities((State) notification.getNewValue());
            } else { // new transition created
                handleTransitionNew(transition);
                handleStateFixPriorities(transition.getSourceState());
            }
        }
    }

    /**
     * Fix the priorities of all outgoing transitions. I.e. remove holes in the
     * list of all prios.
     * 
     * @param state
     *            The state in question
     */
    private void handleStateFixPriorities(final State state) {
        if (state != null) {
            List<Transition> transitions = new ArrayList<Transition>();
            transitions.addAll(state.getOutgoingTransitions());
            Collections.sort(transitions, new TransitionPrioComparator());
            for (int i = 0; i < transitions.size(); i++) {
                Transition transition2 = transitions.get(i);
                this.setEnabled(false); // disable the content adapter
                // temporarily
                transition2.setPriority(i + 1); // prios should start with 1
                this.setEnabled(true);
            }
        }
    }

    /**
     * if the prio has not changed, assume that a new Transition was created
     * which requires a new unique priority.
     */
    private void handleTransitionNew(final Transition transition) {
        int uniquePrio = SyncchartsContentUtil.getUniquePrio(transition);
        if (uniquePrio != transition.getPriority()) {
            this.setEnabled(false);
            transition.setPriority(uniquePrio);
            this.setEnabled(true);
        }
    }

    /**
     * If a prio has changed, make sure the other prios get changed as well.
     */
    private void handleTransitionPrioChange(final Notification notification,
            final Transition transition) {
        State source = transition.getSourceState();
        assert null != source;
        int newPrio = notification.getNewIntValue();
        int oldPrio = notification.getOldIntValue();
        System.out.println("Prio: " + notification.getOldIntValue() + " -> "
                + notification.getNewIntValue() + " (" + transition.getPriority() + ")");

        EList<Transition> transitions = source.getOutgoingTransitions();
        // create an ordered List of transitions by priority
        ArrayList<Transition> orderedTransitions = new ArrayList<Transition>(transitions.size());
        orderedTransitions.addAll(transitions);
        // do not sort the current transition, as its prio is already
        // dirty
        orderedTransitions.remove(transition);
        Collections.sort(orderedTransitions, new TransitionPrioComparator());
        // add the transition at the right new position
        boolean prioIncreased = oldPrio < newPrio;
        for (int i = 0; i < orderedTransitions.size(); i++) {
            Transition transition2 = orderedTransitions.get(i);
            // if prio has conflict or is greater than another prio
            if (transition2.getPriority() >= newPrio) {
                if (prioIncreased) {
                    orderedTransitions.add(i + 1, transition);
                } else {
                    orderedTransitions.add(i, transition);
                }
                break;
            }
            // if not, put at end of list
            if (i == orderedTransitions.size() - 1) {
                orderedTransitions.add(transition);
                break;
            }
        }
        // actually set the new priority for all transitions according to
        // their position in the list
        for (int i = 0; i < orderedTransitions.size(); i++) {
            Transition transition2 = orderedTransitions.get(i);
            this.setEnabled(false); // disable the content adapter
            // temporarily
            transition2.setPriority(i + 1); // prios should start with 1
            this.setEnabled(true);
        }
    }

    private void handleState(final Notification notification, final State state) {
        // if state label has changed
        if (notification.getFeature() != null
                && notification.getFeature().equals(SyncchartsPackage.eINSTANCE.getState_Label())) {
            // if state has no label, create a new unique ID
            if (state.getLabel() == null || state.getLabel().trim().equals("")) {
                state.setId(SyncchartsContentUtil.getNewId(state));
            } else { // otherwise take label as ID
                String newId = state.getLabel();
                newId = newId.replaceAll("\\s", "_"); // replace all
                // whitespace
                // with underscores
                state.setId(newId);
            }
        } else if (notification.getFeature() != null
                && notification.getFeature().equals(
                        SyncchartsPackage.eINSTANCE.getState_ParentRegion())) {
            // if new state is created, only the parent region is set
            if (state.getLabel() == null || state.getLabel().trim().equals("")) {
                state.setId(SyncchartsContentUtil.getNewId(state));
            }
        }
    }

    private void handleValuedObject(final Notification notification, final ValuedObject notifier)
            throws KielerModelException, IOException {
        /*
         * serialize the label again if any names have changed. Conditions for serialization: - the
         * name attribute of a Signal/Variable is affected - new name is not null - name has really
         * changed (new and old are not the same, but old might be null)
         */
        if (notification.getFeature() != null
                && notification.getFeature().equals(
                        SyncchartsPackage.eINSTANCE.getValuedObject_Name())
                && notification.getNewStringValue() != null
                && (notification.getOldStringValue() == null || !notification.getNewStringValue()
                        .equals(notification.getOldStringValue()))) {
            // first serialize the label
            // then re-parse it again (might be necessary if new Signals have
            // been introduced)
            try {
                actionLabelProcessor.processAffectedActionLabels(notifier, null,
                        ActionLabelProcessorWrapper.SERIALIZE);
            } catch (Exception e) {
                /*
                 * do nothing: if serialization fails, then there is a problem with the Action
                 * model, e.g. a signal was removed which will lead to a NullPointerException. So we
                 * cannot serialize and have to parse with the old string.
                 */
            }
            actionLabelProcessor.processAffectedActionLabels(notifier, null,
                    ActionLabelProcessorWrapper.PARSE);
        }
    }

    private void handleAction(final Notification notification, final Action notifier)
            throws KielerModelException, IOException {
        /*
         * In order to parse correctly - the notifier must be an Action - the new String must not be
         * null - the old String must not be the same as the new String (however, it could be null)
         * - the Action needs a parent container to determine the scope correctly
         */
        if (notification.getFeature() != null
                && notification.getFeature().equals(
                        SyncchartsPackage.eINSTANCE.getAction_TriggersAndEffects())
                && notification.getNewStringValue() != null
                && (notification.getOldStringValue() == null || !notification.getNewStringValue()
                        .equals(notification.getOldStringValue()))
                && (notifier).eContainer() != null) {
            // action.setTriggersAndEffects(notification.getNewStringValue());
            actionLabelProcessor.processAction(notifier, ActionLabelProcessorWrapper.PARSE);
            // serialize the action again so that the user
            // gets feedback on what the machine thinks the label looks like
            actionLabelProcessor.processAction(notifier, ActionLabelProcessorWrapper.SERIALIZE);
        }
    }
}
