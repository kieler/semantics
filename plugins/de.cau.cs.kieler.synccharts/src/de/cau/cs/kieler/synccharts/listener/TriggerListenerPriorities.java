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
 */
package de.cau.cs.kieler.synccharts.listener;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import de.cau.cs.kieler.core.model.util.PossiblyEmptyCompoundCommand;
import de.cau.cs.kieler.core.model.util.SetIndexCommand;
import de.cau.cs.kieler.core.model.util.SortCommand;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.Transition;

/**
 * A SyncCharts TriggerListener that fixes changes in Transition priorities.
 * 
 * Requirements of priorities of outgoing transitions of a state are: They must be 
 * a list starting with 1 with no duplicates and no holes.
 * 
 * Hence manually changing on priority must trigger an update of all other priorities.
 * Additionally, changing the sourceState of a transition (i.e. creating a new transition or
 * moving a transition source to another state) also requires prio updates for all outgoing
 * transitions at the involved states.
 *  
 * @author haf
 */
public class TriggerListenerPriorities extends FireOnceTriggerListener {

    /**
     * Constructor that configures a notification filter for only the
     * relevant notifications.
     */
    public TriggerListenerPriorities() {
        super(NotificationFilter.createFeatureFilter(
                SyncchartsPackage.eINSTANCE.getTransition_Priority()).or(
                NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                        .getState_OutgoingTransitions())).or(
                                NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                            .getRegion_States())));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Command trigger(final TransactionalEditingDomain domain,
            final Notification notification) {
        PossiblyEmptyCompoundCommand cc = new PossiblyEmptyCompoundCommand();
        if (notification.getFeature().equals(SyncchartsPackage.eINSTANCE.getTransition_Priority())
                && notification.getNewIntValue() != notification.getOldIntValue()) {
            // prio has changed
            cc.append(handleTransitionPrioChange(notification, (Transition) notification
                    .getNotifier()));
        } else if (notification.getFeature().equals(
                SyncchartsPackage.eINSTANCE.getState_OutgoingTransitions())) {
            // a new transition has been added or its source moved
            Transition newTransition = (Transition) notification.getNewValue();
            if (newTransition != null) {
                // give the transition a new unique prio
                cc.append(handleTransitionNew(newTransition));
            }
            // fix prios of all outgoing transitions
            cc.append(handleStateFixPriorities((State) notification.getNotifier()));
        } else if (notification.getFeature().equals(
            SyncchartsPackage.eINSTANCE.getRegion_States())
            && notification.getEventType() == Notification.ADD) {
            // a new state has been added that might already have some outgoing transitions.
            // fix prios of all outgoing transitions
            cc.append(handleStateFixPriorities((State) notification.getNewValue()));
        }
        return cc;
    }

    /**
     * Fix the priorities of all outgoing transitions. I.e. remove holes in the
     * list of all prios.
     * 
     * @param state
     *            The state in question
     */
    private Command handleStateFixPriorities(final State state) {
        PossiblyEmptyCompoundCommand cc = new PossiblyEmptyCompoundCommand();
        if (state != null) {
            // do a sort of the list of outgoing transitions and set the indexes
            cc.append(new SortCommand<Transition>(state.getOutgoingTransitions(),
                    new TransitionPrioComparator()));
            cc.append(new SetIndexCommand<Transition>(state.getOutgoingTransitions(),
                    SyncchartsPackage.eINSTANCE.getTransition_Priority(), 1));
        }
        return cc;
    }

    /**
     * if the prio has not changed, assume that a new Transition was created
     * which requires a new unique priority.
     */
    private Command handleTransitionNew(final Transition transition) {
        PossiblyEmptyCompoundCommand cc = new PossiblyEmptyCompoundCommand();
        int uniquePrio = SyncchartsContentUtil.getUniquePrio(transition);
        if (uniquePrio != transition.getPriority()) {
            cc.append(new SetCommand(getTarget(), transition, SyncchartsPackage.eINSTANCE
                    .getTransition_Priority(), uniquePrio));
        }
        return cc;
    }

    /**
     * If a prio has changed, make sure the other prios get changed as well.
     */
    private Command handleTransitionPrioChange(final Notification notification,
            final Transition transition) {
        PossiblyEmptyCompoundCommand cc = new PossiblyEmptyCompoundCommand();
        State source = transition.getSourceState();
        assert null != source;
        int newPrio = notification.getNewIntValue();

        EList<Transition> transitions = source.getOutgoingTransitions();
        // saturate the new Prio to allowed values
        int newIndex = newPrio - 1;
        if (newIndex < 0) {
            newIndex = 0;
        } else if (newIndex > transitions.size() - 1) {
            newIndex = transitions.size() - 1;
        }
        // Remove the changed transition from the list
        cc.append(new RemoveCommand(getTarget(), transitions, transition));
        // Sort the list of remaining transitions according to their prio
        cc.append(new SortCommand<Transition>(transitions, new TransitionPrioComparator()));
        // put the changed trans at the right index in the lis corresponding to
        // the new prio
        if (newIndex == transitions.size() - 1) {
            cc.append(new AddCommand(getTarget(), transitions, transition));
        } else {
            cc.append(new AddCommand(getTarget(), transitions, transition, newIndex));
        }
        // set all prios to their indizes in the list +1 in order to make sure
        // to have
        // monotonic lists without holes starting at 1
        cc.append(new SetIndexCommand<Transition>(transitions, SyncchartsPackage.eINSTANCE
                .getTransition_Priority(), 1));
        return cc;
    }

}
