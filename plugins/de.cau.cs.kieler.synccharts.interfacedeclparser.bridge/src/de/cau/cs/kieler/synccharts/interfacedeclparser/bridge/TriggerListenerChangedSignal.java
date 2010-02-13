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

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.Signal;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.Variable;
import de.cau.cs.kieler.synccharts.contentadapter.FireOnceTriggerListener;

/**
 * Listens to changes within a Signal. A proper command creating, manipulating
 * or moving the signal is triggered.
 * 
 * @author uru
 * @author car
 * 
 */
public class TriggerListenerChangedSignal extends FireOnceTriggerListener {

    /**
     * Constructor. Create filter for every element of a Signal
     */
    public TriggerListenerChangedSignal() {
        // TODO add variable support
        super(NotificationFilter.createFeatureFilter(
                SyncchartsPackage.eINSTANCE.getValuedObject_Name()).or(
                NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                        .getValuedObject_InitialValue())).or(
                NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                        .getValuedObject_Type())).or(
                NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                        .getSignal_CombineOperator())).or(
                NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                        .getValuedObject_HostType())).or(
                NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                        .getSignal_HostCombineOperator())).or(
                NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                        .getSignal_IsInput())).or(
                NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE
                        .getSignal_IsOutput())).or(
                NotificationFilter.createFeatureFilter(
                        SyncchartsPackage.eINSTANCE.getState_Signals()).and(
                        NotificationFilter.createEventTypeFilter(Notification.REMOVE))));

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
        // System.out.println("SignalTrigger: " + notification);
        if (notification.getNotifier() instanceof Variable) {
            // case is handled within different trigger listener
            return null;
        }

        Signal sig = null;
        State state = null;
        // depending on changed/new signal or deleted signal the incoming
        // notifier is either Signal or State
        if (notification.getNotifier() instanceof Signal) {
            sig = (Signal) notification.getNotifier();

            // get either parent region or state
            if (sig.eContainer() instanceof State) {
                state = (State) sig.eContainer();
            } else if (sig.eContainer() instanceof Region) {
                // case is handled within different trigger listener
                return null;
            } else {
                // TODO handle
            }
        } else {
            // signal was deleted, so old value is the signal
            state = (State) notification.getNotifier();
            sig = (Signal) notification.getOldValue();
        }

        // stop here if nothing to serialize but care about deleted signal
        if (state.getSignals().size() == 0
                && !notification.getFeature()
                        .equals(SyncchartsPackage.eINSTANCE.getState_Signals())) {
            return null;
        }

        // determine what happened for the serializer
        int occuredChange = -1;
        if (notification.getOldValue() == null
                && notification.getFeature().equals(
                        SyncchartsPackage.eINSTANCE.getValuedObject_Name())) {
            occuredChange = InterfaceDeclSerializeCommand.NEW;
        } else if (notification.getFeature().equals(
                SyncchartsPackage.eINSTANCE.getValuedObject_Name())) {
            occuredChange = InterfaceDeclSerializeCommand.NAME;
        } else if (notification.getFeature()
                .equals(SyncchartsPackage.eINSTANCE.getSignal_IsInput())) {
            occuredChange = InterfaceDeclSerializeCommand.INPUT;
        } else if (notification.getFeature().equals(
                SyncchartsPackage.eINSTANCE.getSignal_IsOutput())) {
            occuredChange = InterfaceDeclSerializeCommand.OUTPUT;
        } else if (notification.getFeature().equals(SyncchartsPackage.eINSTANCE.getState_Signals())) {
            occuredChange = InterfaceDeclSerializeCommand.DELETE;
        }

        CompoundCommand cc = new CompoundCommand();

        try {
            // renaming
            if (notification.getFeature()
                    .equals(SyncchartsPackage.eINSTANCE.getValuedObject_Name())) {
                cc.append(interfaceDeclProcessor.getSerializationCommand(state, sig, notification
                        .getOldStringValue(), occuredChange));
            } else if (occuredChange != -1) {
                cc.append(interfaceDeclProcessor.getSerializationCommand(state, sig, null,
                        occuredChange));
            } else {
                // modifying
                cc.append(interfaceDeclProcessor.getSerializationCommand(state, sig));
            }

            // labelparser runs automatically if name changed ??

        } catch (Exception e) {
            Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "", e);
            StatusManager.getManager().handle(myStatus, StatusManager.SHOW);

        }
        return cc;
    }

}
