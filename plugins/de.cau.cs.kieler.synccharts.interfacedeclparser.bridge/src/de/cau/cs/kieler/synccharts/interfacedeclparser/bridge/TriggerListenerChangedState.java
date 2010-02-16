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

        // TODO ... consider region signals and vars in conditions !!!
        
        
        CompoundCommand cc = new CompoundCommand();

        if (notification.getNewValue() instanceof State) {
            State state = (State) notification.getNewValue();

            // look for existing signals without interface declaration
            if (!state.getSignals().isEmpty()
                    && (state.getInterfaceDeclaration() == null || state.getInterfaceDeclaration()
                            .equals(""))) {
                cc.append(interfaceDeclProcessor.getCanonialSerializeCommand(state));

            }

            // look for interface declaration without existing signals
            if ((state.getInterfaceDeclaration() != null && state.getInterfaceDeclaration()
                    .length() > 1)
                    && state.getSignals().isEmpty()) {
                cc.append(interfaceDeclProcessor.getParseCommand(state));

            }

            // look through childstates, as there is just one "ADD STATE" coming
            // in from listener
            searchStatesForSignals(cc, state);
            searchStatesForInterfDecl(cc, state);

            // otherwise we hope everything was synced sweet before
        }

        return cc;
    }

    private void searchStatesForSignals(CompoundCommand cc, State parent) {
        for (Region r : parent.getRegions()) {
            for (State s : r.getInnerStates()) {
                if (!s.getSignals().isEmpty()
                        && (s.getInterfaceDeclaration() == null || s.getInterfaceDeclaration()
                                .equals(""))) {
                    cc.append(interfaceDeclProcessor.getCanonialSerializeCommand(s));
                }
                searchStatesForSignals(cc, s);
            }
        }
    }

    private void searchStatesForInterfDecl(CompoundCommand cc, State parent) {
        for (Region r : parent.getRegions()) {
            for (State s : r.getInnerStates()) {
                if ((s.getInterfaceDeclaration() != null && s.getInterfaceDeclaration().length() > 1)
                        && s.getSignals().isEmpty()) {
                    cc.append(interfaceDeclProcessor.getParseCommand(s));
                }
                searchStatesForInterfDecl(cc, s);
            }
        }
    }
}
