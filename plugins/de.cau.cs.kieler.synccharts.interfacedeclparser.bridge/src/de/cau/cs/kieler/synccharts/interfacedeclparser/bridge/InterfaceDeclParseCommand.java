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

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import de.cau.cs.kieler.core.KielerModelException;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.Signal;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsFactory;
import de.cau.cs.kieler.synccharts.Variable;
import de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.InOutputSignals;
import de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.InputSignals;
import de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.OutputSignals;
import de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.RegionSignalDec;
import de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.Signals;
import de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.StateExtend;
import de.cau.cs.kieler.synccharts.interfacedeclparser.scoping.InterfaceDeclScopeProvider;

/**
 * Command for parsing the interface declaration string. Also provides some
 * methods to return a xtext resource with the parsed interface declaration.
 * 
 * @author uru
 * @author car
 * 
 */
public class InterfaceDeclParseCommand extends AbstractCommand {

    private String interfaceDeclaration;
    private Injector injector;
    private State rootState;
    private String oldInterfaceDeclaration;

    /**
     * 
     * @param rootElement
     *            the state which contains the currently edited interface
     *            declaration.
     * @param theInjector
     *            the injector.
     */
    public InterfaceDeclParseCommand(final State rootElement, final Injector theInjector) {
        this.interfaceDeclaration = rootElement.getInterfaceDeclaration();
        this.injector = theInjector;
        this.rootState = rootElement;
        this.isExecutable = true;
    }

    /**
     * {@inheritDoc}
     */
    public void execute() {
        try {
            oldInterfaceDeclaration = interfaceDeclaration;
            // prepare and then start parsing
            prepareInterfaceDeclParse();
            parseInterfaceDecl();
        } catch (Exception e) {
            Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
                    "Error parsing interface declaration, possible reason: ", e);
            StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void redo() {
        execute();
    }

    /**
     * {@inheritDoc}
     */
    public void undo() {
        rootState.setInterfaceDeclaration(oldInterfaceDeclaration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean prepare() {
        return true;
    }

    /**
     * connection for Handler.
     */
    protected void processInterfaceDeclParse() {
        try {
            // start the parsing
            prepareInterfaceDeclParse();
            parseInterfaceDecl();
        } catch (Exception e) {
            Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
                    "Error parsing interface declaration, possible reason: ", e);
            StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
        }
    }

    /**
     * Parses the current interface declaration and returns the surrounding
     * resource.
     * 
     * @return resource with current representation of interface declaration or
     *         null
     */
    protected XtextResource getParsedResource() {
        try {
            return parse();
        } catch (Exception e) {
            Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
                    "Error parsing interface declaration "
                            + "resource for serialization, possible reason: ", e);
            StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
        }
        return null;
    }

    // #### Internal methods
    /**
     * Remove old signals to ensure consistency of data.
     * 
     * @throws KielerModelException
     */
    private void prepareInterfaceDeclParse() throws KielerModelException {
        if (rootState == null) {
            throw new KielerModelException(
                    "InterfaceDeclaration \nThe passed element to be parsed was null!", rootState);
        }
        State currentState = (State) rootState;

        try {
            // FIXME if there's just 1 signal left, a remove trigger is fired by
            // clear()
            // workaround: if there's just 1 signal add a new dummy signal
            // remove old signals
            if (currentState.getSignals().size() == 1) {
                currentState.getSignals().add(SyncchartsFactory.eINSTANCE.createSignal());
            }
            currentState.getSignals().clear();
            // remove old signals and variables of regions
            for (Region r : currentState.getRegions()) {
                if (r.getSignals().size() == 1) {
                    r.getSignals().add(SyncchartsFactory.eINSTANCE.createSignal());
                }
                r.getSignals().clear();
                if (r.getVariables().size() == 1) {
                    r.getVariables().add(SyncchartsFactory.eINSTANCE.createVariable());
                }
                r.getVariables().clear();
            }

        } catch (Exception e) {
            throw new KielerModelException(
                    "InterfaceDeclaration: there was a problem clearing the state for parsing.",
                    rootState);
        }
    }

    /**
     * parse the current interface declaration string and afterwards inject the
     * parsed signals in the current state.
     * 
     * @throws KielerModelException
     *             if there's an error with the parsing
     * @throws IOException
     *             internal parser error
     */
    protected void parseInterfaceDecl() throws KielerModelException, IOException {

        XtextResource resource = parse();
        EObject parsedObject = null;
        if (resource != null) {
            parsedObject = resource.getContents().get(0);
        }

        if (parsedObject != null && parsedObject instanceof StateExtend) {
            injectSignalsAndVars((State) rootState, (StateExtend) parsedObject);
        }
    }

    /**
     * create a resource from the interface declaration and try to parse it.
     * pass the rootElement to the ScopeProvider to ensure that all subregions
     * are found.
     * 
     * @return parsed object
     * @throws KielerModelException
     *             if there's an error with the parsing or an internal parser
     *             error
     */
    private XtextResource parse() throws KielerModelException, IOException {
        if (interfaceDeclaration == null || interfaceDeclaration.trim().length() == 0) {
            // nothing to do
            return null;
        }
        // set up the resource
        ByteArrayInputStream stream = new ByteArrayInputStream(interfaceDeclaration.getBytes());

        XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
        XtextResource resource = (XtextResource) resourceSet.createResource(URI
                .createURI("platform:/resource/de.cau.cs.kieler.synccharts."
                        + "interfacedeclparser/dummy.ifd"));

        // FIXME: passing the parent to the scope provider in this static
        // way is veeeeery evil
        InterfaceDeclScopeProvider.parent = rootState;

        // start the actual parsing
        Map<Object, Object> loadOptions = resourceSet.getLoadOptions();
        loadOptions.put(XtextResource.OPTION_RESOLVE_ALL, true);
        loadOptions.put(XtextResource.OPTION_FORMAT, false);
        resource.load(stream, loadOptions);

        IParseResult parseResult = resource.getParseResult();
        if (parseResult == null) {
            throw new KielerModelException("\"" + interfaceDeclaration + "\""
                    + "Could not parse interface declaration. Parser did return null.", rootState);
        }

        // check for errors and add them to the exception
        List<Diagnostic> errors = resource.getErrors();
        if (errors != null && errors.size() > 0) {
            StringBuffer parseErrorString = new StringBuffer("");
            for (Diagnostic syntaxError : errors) {
                parseErrorString.append("\n" + syntaxError.getMessage());
            }
            throw new KielerModelException(
                    "Interface Declaration Parsing failed, possible reason: " + parseErrorString,
                    rootState);
        }

        return resource;
    }

    /**
     * Adds freshly created Signal to the current State.
     * 
     * @param currentState
     *            state being filled
     * @param se
     *            StateExtend object with parsed content
     */
    private void injectSignalsAndVars(final State currentState, final StateExtend se) {

        // add signals to current state
        List<Signal> newSigs = new LinkedList<Signal>();
        for (InputSignals iss : se.getInputSignals()) {
            for (Signal is : iss.getSignals()) {
                is.setIsInput(true);
                newSigs.add(is);
            }
        }
        for (OutputSignals oss : se.getOutputSignals()) {
            for (Signal is : oss.getSignals()) {
                is.setIsOutput(true);
                newSigs.add(is);
            }
        }
        for (InOutputSignals ois : se.getInOutputSignals()) {
            for (Signal s : ois.getSignals()) {
                s.setIsInput(true);
                s.setIsOutput(true);
                newSigs.add(s);
            }
        }
        for (Signals sigs : se.getSignals()) {
            for (Signal is : sigs.getSignals()) {
                newSigs.add(is);
            }
        }
        currentState.getSignals().addAll(newSigs);

        // add signals and vars to contained regions
        for (RegionSignalDec rsd : se.getRegions()) {
            Region currRegion = rsd.getRegion();

            LinkedList<Signal> newSignals = new LinkedList<Signal>();
            for (Signal s : rsd.getSignals()) {
                newSignals.add(s);
            }
            currRegion.getSignals().addAll(newSignals);
            // vars
            LinkedList<Variable> newVars = new LinkedList<Variable>();
            for (Variable v : rsd.getVars()) {
                newVars.add(v);
            }
            currRegion.getVariables().addAll(newVars);
        }
    }
}
