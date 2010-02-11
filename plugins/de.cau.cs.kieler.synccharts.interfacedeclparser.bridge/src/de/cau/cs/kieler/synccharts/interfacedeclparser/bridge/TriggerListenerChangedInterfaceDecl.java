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
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.contentadapter.FireOnceTriggerListener;

/**
 * Listens to changes of the interface declaration String. A proper command
 * creating, manipulating or moving the signal is triggered.
 * 
 * @author uru
 * @author car
 * 
 */
public class TriggerListenerChangedInterfaceDecl extends FireOnceTriggerListener {

    /**
     * Constructor. Create filter for interface declaration element.
     */
    public TriggerListenerChangedInterfaceDecl() {
        super(NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                .getState_InterfaceDeclaration()));
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

        // notification is triggered by interface declaration so
        // the notifier has to be a signal
        State state = (State) notification.getNotifier();
        CompoundCommand cc = new CompoundCommand();

        // if new interface declaration was created, first set the string and
        // then parse
        if (notification.getOldStringValue() == null) {
            cc.appendIfCanExecute(new SetCommand(domain, state, SyncchartsPackage.eINSTANCE
                    .getState_InterfaceDeclaration(), notification.getNewStringValue()));
            cc.appendIfCanExecute(interfaceDeclProcessor.getParseCommand(state));
            return cc;
        }
        // only start parsing if something changed
        // old an new value are always the declaration string
        if (notification.getNewStringValue() != null
                && !notification.getOldStringValue().equals(notification.getNewStringValue())) {
            cc.appendIfCanExecute(interfaceDeclProcessor.getParseCommand(state));
        }
        return cc;
    }
}