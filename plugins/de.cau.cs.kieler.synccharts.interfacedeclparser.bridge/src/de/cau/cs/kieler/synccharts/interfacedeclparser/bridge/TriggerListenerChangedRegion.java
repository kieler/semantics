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

import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.Signal;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.ValuedObject;
import de.cau.cs.kieler.synccharts.Variable;
import de.cau.cs.kieler.synccharts.contentadapter.FireOnceTriggerListener;

/**
 * Not testable ... we can't cause a trigger for a region's signal or var within
 * live editor.
 * 
 * @author uru
 * @author car
 * 
 */
public class TriggerListenerChangedRegion extends FireOnceTriggerListener {

    /**
     * Constructor. Create filter for regions signals and variables
     * 
     * CARE : this isn't validated so far.
     */
    public TriggerListenerChangedRegion() {
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
                NotificationFilter.createFeatureFilter(
                        SyncchartsPackage.eINSTANCE.getRegion_Signals()).and(
                        NotificationFilter.createEventTypeFilter(Notification.REMOVE))).or(
                NotificationFilter.createFeatureFilter(
                        SyncchartsPackage.eINSTANCE.getRegion_Variables()).and(
                        NotificationFilter.createEventTypeFilter(Notification.REMOVE))).or(
                NotificationFilter.createFeatureFilter(SyncchartsPackage.eINSTANCE.getRegion_Id())));
    }

    /**
     * Wrapper for getting proper commands.
     */
    private InterfaceDeclProcessorWrapper interfaceDeclProcessor = new InterfaceDeclProcessorWrapper();

    /**
     * {@inheritDoc}
     */
    @Override
    protected Command trigger(TransactionalEditingDomain domain, Notification notification) {
        // System.out.println("RegionTrigger: " + notification);

        CompoundCommand cc = new CompoundCommand();
        // as a region name should be unique, the easiest way to react to an id
        // change, is just to replace the region's id within the interface
        // declaration string
        if (notification.getFeature().equals(SyncchartsPackage.eINSTANCE.getRegion_Id())
                && notification.getOldValue() != null) {
            Region r = (Region) notification.getNotifier();
            if (r.getParentState() != null) {
                State par = r.getParentState();
                String ifdecl = par.getInterfaceDeclaration();
                ifdecl = ifdecl.replace(notification.getOldStringValue() + ":", notification
                        .getNewStringValue()
                        + ":");

                cc.appendIfCanExecute(new SetCommand(domain, par, SyncchartsPackage.eINSTANCE
                        .getState_InterfaceDeclaration(), ifdecl));
                return cc;
            }
            return null;
        }

        // in other case has to be a valued object, else return
        if (!(notification.getNotifier() instanceof ValuedObject)) {
            return null;
        }

        // either signal or variable
        ValuedObject vo = (ValuedObject) notification.getNotifier();
        if (!(vo.eContainer() instanceof Region)) {
            // handled within different listener
            return null;
        }

        State parent = (State) vo.eContainer().eContainer();
        int occuredChange = -1;
        String oldName = null;

        // Variable
        if (vo instanceof Variable) {
            Variable var = (Variable) vo;
            if (notification.getOldValue() == null
                    && notification.getFeature().equals(
                            SyncchartsPackage.eINSTANCE.getValuedObject_Name())) {
                // new variable was created
                occuredChange = InterfaceDeclSerializeCommand.REGION_VARIABLE_NEW;
            } else if (notification.getFeature().equals(
                    SyncchartsPackage.eINSTANCE.getRegion_Variables())) {
                // variable was deleted
                occuredChange = InterfaceDeclSerializeCommand.REGION_VARIABLE_DELETE;
            } else {
                occuredChange = InterfaceDeclSerializeCommand.REGION_VARIABLE;
                // modified or renamed
                if (notification.getFeature().equals(
                        SyncchartsPackage.eINSTANCE.getValuedObject_Name())) {
                    // if it isnt catched in 1st&2nd case it has to be a
                    // renaming
                    oldName = notification.getOldStringValue();
                }
            }
            cc.append(interfaceDeclProcessor.getSerializationCommand(parent, var, oldName,
                    occuredChange));
        } else if (vo instanceof Signal) {

            // Signal
            Signal sig = (Signal) vo;

            // determine what happened for the serializer
            if (notification.getOldValue() == null
                    && notification.getFeature().equals(
                            SyncchartsPackage.eINSTANCE.getValuedObject_Name())) {
                occuredChange = InterfaceDeclSerializeCommand.REGION_SIGNAL_NEW;
            } else if (notification.getFeature().equals(
                    SyncchartsPackage.eINSTANCE.getState_Signals())) {
                occuredChange = InterfaceDeclSerializeCommand.REGION_SIGNAL_DELETE;
            } else {
                occuredChange = InterfaceDeclSerializeCommand.REGION_SIGNAL;
                if (notification.getFeature().equals(
                        SyncchartsPackage.eINSTANCE.getValuedObject_Name())) {
                    // if it isnt catched in 1st&2nd case it has to be a
                    // renaming
                    oldName = notification.getOldStringValue();
                }
            }
            cc.append(interfaceDeclProcessor.getSerializationCommand(parent, sig, oldName,
                    occuredChange));
        }

        return cc;
    }
}
