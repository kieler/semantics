/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 * 
 *****************************************************************************/
package de.cau.cs.kieler.synccharts.interfacedeclparser.bridge;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.contentadapter.FireOnceTriggerListener;

/**
 * Listens to State ADD events, for instance adding an ABRO. Checks all newly
 * added states and regions for consistency between the interface declaration
 * and the containing signals/variables.
 * 
 * @deprecated shouldnt be needed any more
 * 
 * @author uru
 * @author car
 * 
 */
public class TriggerListenerChangedState extends FireOnceTriggerListener {

    /**
     * Constructor. Create filter for interface declaration element.
     */
    public TriggerListenerChangedState() {
        super(NotificationFilter.createFeatureFilter(
                SyncchartsPackage.eINSTANCE.getRegion_InnerStates()).and(
                NotificationFilter.createEventTypeFilter(Notification.ADD)));
    }

    /**
     * Wrapper for getting proper commands.
     */
    private InterfaceDeclProcessorWrapper interfaceDeclProcessor = new InterfaceDeclProcessorWrapper();

    /**
     * {@inheritDoc}
     */
    @Override
    protected Command trigger(final TransactionalEditingDomain domain,
            final Notification notification) {
        // System.out.println("STATE ADD : " + notification);

        CompoundCommand cc = new CompoundCommand();

        if (notification.getNewValue() instanceof State) {
            State state = (State) notification.getNewValue();

            // look through childstates, as there is just one "ADD STATE" coming
            // in from listener
            // look for existing signals without interface declaration
            searchStatesForSignals(cc, state);
            // look for interface declaration without existing signals
            searchStatesForInterfDecl(cc, state);

            // otherwise we hope everything was synced sweet before
        }

        return cc;
    }

    /**
     * checks if a state exists, that has signals or regions defined, but no
     * interfaceDeclaration.
     * 
     * @param cc
     *            CompoundCommand
     * @param parent
     *            state which should be searched
     */
    private void searchStatesForSignals(final CompoundCommand cc, final State parent) {

        // check sub regions
        boolean found = false;
        for (Region r : parent.getRegions()) {
            if (!r.getSignals().isEmpty() || !r.getVariables().isEmpty()) {
                found = true;
            }
        }

        // check state itself
        if ((!parent.getSignals().isEmpty() || found)
                && (parent.getInterfaceDeclaration() == null || parent.getInterfaceDeclaration()
                        .equals(""))) {
            cc.append(interfaceDeclProcessor.getCanonialSerializeCommand(parent));
        }

        // call check for every child state
        for (Region r : parent.getRegions()) {
            for (State s : r.getInnerStates()) {
                searchStatesForSignals(cc, s);
            }
        }
    }

    /**
     * checks if a state exists, that has a interfaceDeclaration, but no
     * internal signals or variables.
     * 
     * @param cc
     *            CompoundCommand
     * @param parent
     *            state which should be searched
     */
    private void searchStatesForInterfDecl(final CompoundCommand cc, final State parent) {

        // check sub regions for signals
        boolean found = true;
        for (Region r : parent.getRegions()) {
            if (!r.getSignals().isEmpty() || !r.getVariables().isEmpty()) {
                found = false;
            }
        }

        // check state itself
        if ((parent.getInterfaceDeclaration() != null && parent.getInterfaceDeclaration().length() > 1)
                && (parent.getSignals().isEmpty() && found)) {
            cc.append(interfaceDeclProcessor.getParseCommand(parent));
        }

        // call check for every child state
        for (Region r : parent.getRegions()) {
            for (State s : r.getInnerStates()) {
                searchStatesForInterfDecl(cc, s);
            }
        }
    }
}
