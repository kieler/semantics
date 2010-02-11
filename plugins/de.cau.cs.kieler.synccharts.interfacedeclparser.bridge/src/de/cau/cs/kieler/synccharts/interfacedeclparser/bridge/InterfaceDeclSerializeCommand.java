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

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import de.cau.cs.kieler.core.KielerModelException;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.Signal;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.Variable;
import de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.InterfaceDeclFactory;
import de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.StateExtend;

/**
 * Command for serializing all contained signals of a state and its regions back
 * into the interface declaration.
 * 
 * @author uru
 * @author car
 * 
 */
public class InterfaceDeclSerializeCommand extends AbstractCommand {

    /**
     * determines that a new signal was added.
     */
    public static final int NEW = 0;
    /**
     * determines that a signal name was changed.
     */
    public static final int NAME = 1;
    /**
     * determines that the input status of a signal was changed.
     */
    public static final int INPUT = 2;
    /**
     * determines that the output status of a signal was changed.
     */
    public static final int OUTPUT = 3;
    /**
     * determines that a signal was deleted.
     */
    public static final int DELETE = 4;
    /**
     * determines that a region's signal was modified.
     */
    public static final int REGION_SIGNAL = 5;
    public static final int REGION_SIGNAL_NEW = 6;
    public static final int REGION_SIGNAL_DELETE = 7;
    /**
     * determines that a region's variable was modified.
     */
    public static final int REGION_VARIABLE = 8;
    public static final int REGION_VARIABLE_NEW = 8;
    public static final int REGION_VARIABLE_DELETE = 8;
    /**
     * determines that the modification is not further specified.
     */
    public static final int UNDEFINED = -1;

    // resources and misc
    private XtextResource resource;
    private Injector injector;
    private int occurredChange = UNDEFINED;

    // following variables contain changed elements
    private State rootState = null;
    private Signal changedSignal = null;
    private Region rootRegion = null;
    private Variable changedVariable = null;

    // used to detect a renaming
    private String oldName = null;

    // serialization logic
    private InterfaceDeclSerializerLogic serializeLogic;

    /**
     * Constructor being used if the name of a signal has changed or a new
     * signal was created.
     * 
     * @param theRootState
     *            the root state containing the ifdecl.
     * @param changedSignalOrVariable
     *            either the changed signal or the variable.
     * @param theResource
     *            resource containing the prior representation of the parsed
     *            interface declaration or null
     * @param theOldName
     *            if there was a renaming - the name prior modifying
     * @param theInjector
     *            the injector
     * @param theOccurredChange
     *            determines the change that occurred
     */
    public InterfaceDeclSerializeCommand(final State theRootState,
            final EObject changedSignalOrVariable, final XtextResource theResource,
            final String theOldName, final Injector theInjector, final int theOccurredChange) {
        this.injector = theInjector;
        this.rootState = theRootState;
        if (changedSignalOrVariable instanceof Signal) {
            this.changedSignal = (Signal) changedSignalOrVariable;
        } else if (changedSignalOrVariable instanceof Variable) {
            this.changedVariable = (Variable) changedSignalOrVariable;
            this.rootRegion = (Region) changedSignalOrVariable.eContainer();
        }
        this.resource = theResource;
        this.oldName = theOldName;
        this.occurredChange = theOccurredChange;
        this.isExecutable = true;
        this.serializeLogic = new InterfaceDeclSerializerLogic();
    }

    /**
     * Constructor used for canonical serialization.
     * 
     * @param theRootState
     *            state whose interface declaration should be serialized
     * @param theInjector
     *            injector
     */
    public InterfaceDeclSerializeCommand(final State theRootState, final Injector theInjector) {
        this.injector = theInjector;
        this.rootState = theRootState;
        XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
        this.resource = (XtextResource) resourceSet.createResource(URI
                .createURI("platform:/resource/de.cau.cs.kieler.synccharts."
                        + "interfacedeclparser/dummy.ifd"));
        this.serializeLogic = new InterfaceDeclSerializerLogic();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void execute() {
        try {
            prepareSerialize();
            serialize();
        } catch (Exception e) {
            Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
                    "Error serializing Signals.", e);
            StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void redo() {
        execute();

    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean prepare() {
        return true;
    }

    /**
     * 
     */
    protected void processCanonicalSerialization() {
        // prepare
        prepareCanonicalSerialization(rootState);
        // serialize
        try {
            serialize();
        } catch (Exception e) {
            Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
                    "Error in canonical serialization.", e);
            StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
        }
    }

    /**
     * serializes the current resource and sets the interface declaration
     * string. the resource has to be been prepared beforehand.
     * 
     * @throws KielerModelException
     *             if serialization process went wrong
     */
    private void serialize() throws KielerModelException {
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

            if (resource != null) {
                HashMap<String, Boolean> saveOptions = new HashMap<String, Boolean>();
                // make sure correct formatting is applied
                saveOptions.put(XtextResource.OPTION_FORMAT, Boolean.TRUE);
                // serialize
                resource.save(outputStream, saveOptions);
            }

            //System.out.println("######Serialized result: " + outputStream.toString());

            // set the interface declaration string
            String result = outputStream.toString();
            ((State) rootState).setInterfaceDeclaration(result);

        } catch (IOException e) {
            throw new KielerModelException(e.getMessage(), rootState);
        }
    }

    /**
     * 
     * @return prepared parse object
     */
    private StateExtend prepareSerialize() {

        StateExtend se;
        // check if old interface declaration exist
        if (resource == null) {
            // create a new resource and StateExtend object
            XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
            resource = (XtextResource) resourceSet.createResource(URI
                    .createURI("platform:/resource/de.cau.cs.kieler.synccharts."
                            + "interfacedeclparser/dummy.ifd"));
            se = InterfaceDeclFactory.eINSTANCE.createStateExtend();
            resource.getContents().add(se);
        } else {
            se = (StateExtend) resource.getContents().get(0);
        }

        // specify whether to search for an old name or the current
        String searchForName;
        if (changedSignal != null) {
            searchForName = (oldName == null) ? changedSignal.getName() : oldName;
        } else {
            searchForName = (oldName == null) ? changedVariable.getName() : oldName;
        }

        // check if whole data is deleted afterwards
        boolean clear = false;

        if (occurredChange == UNDEFINED) {
            // something else was modified within the signal
            serializeLogic.handleSignalModify(se, changedSignal, searchForName);
        } else if (occurredChange == NEW) {
            serializeLogic.handleNewSignal(se, changedSignal);
        } else if (occurredChange == INPUT) {
            serializeLogic.handleInputChange(se, changedSignal, searchForName);
        } else if (occurredChange == OUTPUT) {
            serializeLogic.handleOutputChange(se, changedSignal, searchForName);
        } else if (occurredChange == DELETE) {
            clear = serializeLogic.handleDeleteSignal(se, changedSignal, searchForName);
        } else if (occurredChange == REGION_SIGNAL_NEW) {
            serializeLogic.handleRegionNewSignal(se, rootRegion, changedSignal);
        } else if (occurredChange == REGION_VARIABLE_NEW) {
            serializeLogic.handleRegionNewVariable(se, rootRegion, changedVariable);
        } else if (occurredChange == REGION_SIGNAL_DELETE) {
            clear = serializeLogic.handleRegionDeleteSignal(se, rootRegion.getId(), changedSignal
                    .getName());
        } else if (occurredChange == REGION_VARIABLE_DELETE) {
            clear = serializeLogic.handleRegionDeleteVariable(se, rootRegion.getId(),
                    changedVariable.getName());
        } else if (occurredChange == REGION_SIGNAL) {
            serializeLogic.handleRegionSignalModify(se, rootRegion.getId(), changedSignal,
                    searchForName);
        } else if (occurredChange == REGION_VARIABLE) {
            serializeLogic.handleRegionVariableModify(se, rootRegion.getId(), changedVariable,
                    searchForName);
        } else {
            System.out.println("MHHHH sollte hier nicht hinkomme !!");
        }

        // remove resource if nothing in it
        if (clear) {
            // TODO check if it has to be dumped as well, dunno ..
            resource = null;
        }
        return se;
    }

    /**
     * prepare resource for canonical serialization.
     * 
     * @param state
     *            state whose interface declaration is serialized
     */
    private void prepareCanonicalSerialization(final State state) {

        // init StateExtend and put it into resource
        StateExtend se = InterfaceDeclFactory.eINSTANCE.createStateExtend();
        resource.getContents().add(se);

        // inject all current signals and variables
        for (Signal s : state.getSignals()) {
            serializeLogic.handleNewSignal(se, s);
        }
        for (Region r : state.getRegions()) {
            for (Signal s : r.getSignals()) {
                serializeLogic.handleRegionNewSignal(se, r, s);
            }
            for (Variable v : r.getVariables()) {
                serializeLogic.handleRegionNewVariable(se, r, v);
            }
        }
    }

}
