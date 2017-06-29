/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2012 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.sim.s;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.internal.resources.File;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions;
import de.cau.cs.kieler.kexpressions.ValuedObject;
import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension;

/**
 * SCCharts random input generation, generates an ESO file with random inputs for the SyncChart
 * based on the interface (input signals).
 *
 * @author cmot
 * @kieler.design 2012-11-26 proposed cmot
 * @kieler.rating 2012-11-26 proposed yellow
 */
@SuppressWarnings("restriction")
public class SCChartsGenerateRandomInputs implements IHandler {

    /** The user input dialog title. */
    private static final String INPUT_DLG_TITLE = "ESO Model Random Input Generation";

    /** The user input dialog text. */
    private static final String INPUT_DLG_TEXT =
            "Set the number of ticks to generate random inputs for the selected model:";

    /** The user input dialog default. */
    private static final long INPUT_DLG_DEFAULT = 1000;

    /** The random generator. */
    private Random randomGenerator;
    
    /** The single s / kexpression extension. */
    private static SCChartsExtension sCChartExtension = new SCChartsExtension();
    private static KExpressionsValuedObjectExtensions kExpressionsExtension = new KExpressionsValuedObjectExtensions();        

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void addHandlerListener(final IHandlerListener handlerListener) {
        // Do nothing
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void dispose() {
        // Do nothing
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public Object execute(final ExecutionEvent event) throws ExecutionException {
        // Get input model from currently selected file in Explorer
        ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                .getSelectionService().getSelection();
        File file = (File) ((TreeSelection) selection).getFirstElement();
        URI input = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
        URI output = URI.createURI("");

        // Try to load SCCharts model
        XMIResourceImpl inputResource = new XMIResourceImpl(input);
        try {
            // Load SCCharts model
            inputResource.load(null);
            State rootState = (State) inputResource.getContents().get(0);
            List<String> inputSignalList = getInputSignalList(rootState);

            // This will hold the randomly generated data
            List<String> esoList = new LinkedList<String>();

            // Ask the user to input the number of ticks to generate random
            // inputs for
            String value = showInputDialog(INPUT_DLG_TITLE, INPUT_DLG_TEXT, "" + INPUT_DLG_DEFAULT);
            if (value != null) {
                try {
                    long ticks = Long.parseLong(value);
                    // Generate Data
                    esoList = generateRandomInputs(inputSignalList, ticks);
                } catch (Exception e) {
                    // no error should appear here
                }
            }

            // Calculate output path
            output = URI.createURI(input.toString());
            output = output.trimFragment();
            output = output.trimFileExtension().appendFileExtension("eso");
            IPath path = new Path(output.toPlatformString(false));
            try {
                IWorkspace workspace = ResourcesPlugin.getWorkspace();
                IWorkspaceRoot root = workspace.getRoot();
                IFile outputfile = root.getFile(path);
                if (!outputfile.exists()) {
                    outputfile.create(null, IResource.NONE, null);
                }
                String outStringPath = outputfile.getRawLocation().toString();
                PrintWriter out = new PrintWriter(outStringPath);
                // Write eso data to file
                for (String line : esoList) {
                    out.println(line);
                }
                out.close();
            } catch (IOException e) {
                throw new ExecutionException("Cannot write ESO trace file.");
            } catch (CoreException e) {
                throw new ExecutionException("Cannot write ESO trace file.");
            }
        } catch (IOException e) {
            throw new ExecutionException("Cannot read input file.");
        }

        // Refresh the file explorer
        try {
            ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, null);
        } catch (CoreException e2) {
            e2.printStackTrace();
        }

        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean isEnabled() {
        // Initialize the random generator
        randomGenerator = new Random();
        return true;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean isHandled() {
        return true;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void removeHandlerListener(final IHandlerListener handlerListener) {
        // Do nothing

    }

    // -------------------------------------------------------------------------

    /**
     * Generate random inputs for ticks ticks.
     *
     * @param signalList
     *            the signal list
     * @param ticks
     *            the ticks
     * @return the list
     */
    private List<String> generateRandomInputs(final List<String> inputSignalList, final long ticks) {
        List<String> returnList = new LinkedList<String>();
        int numberOfSignals = inputSignalList.size();

        // ESO header
        returnList.add("! reset;");
        returnList.add("");

        for (long tick = 0; tick < ticks; tick++) {
            // For each tick decide which signals to emit
            Set<String> signalNameSet = new HashSet<String>();
            int randomDense2 = randomGenerator.nextInt(numberOfSignals + 1);
            int randomDense = randomGenerator.nextInt(randomDense2 + 2);
            for (int i = 0; i < randomDense; i++) {
                int randomSignalIndex = randomGenerator.nextInt(numberOfSignals);
                String randomSignalName = inputSignalList.get(randomSignalIndex);
                signalNameSet.add(randomSignalName);
            }

            // After decided for a set of signal name, generate the ESO entry for these
            StringBuffer esoEntry = new StringBuffer();
            for (String signalName : signalNameSet) {
                if (esoEntry.length() > 0) {
                    esoEntry.append(" ");
                }
                esoEntry.append(signalName);
            }
            returnList.add(esoEntry.toString() + " % Output: ;");
        }

        return returnList;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets a list of all input signal names.
     *
     * @param rootRegion
     *            the root region
     * @return the input signal list
     */
    private List<String> getInputSignalList(final State rootState) {
        List<String> returnList = new LinkedList<String>();
        if (rootState != null) {
            for (ValuedObject valuedObject : kExpressionsExtension.getValuedObjectsFromEObject(rootState)) {
                if (kExpressionsExtension.isInput(valuedObject)) {
                    returnList.add(valuedObject.getName());
                }
            }
        }
        return returnList;
    }

    // -------------------------------------------------------------------------

    /** The input dialog return value. */
    private String inputDialogReturnValue = "";

    /**
     * Show an input dialog with the message, a default value and a specific title.
     *
     * @param title
     *            the title of the dialog
     * @param message
     *            the message to present
     * @param defaultValue
     *            the default value
     *
     * @return the string value entered or null if aborted
     */
    private String showInputDialog(final String title, final String message,
            final String defaultValue) {
        inputDialogReturnValue = null;
        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                final Shell shell = Display.getCurrent().getShells()[0];
                InputDialog dlg = new InputDialog(shell, title, message, defaultValue, null);
                dlg.open();
                if (dlg.getReturnCode() == InputDialog.OK) {
                    inputDialogReturnValue = dlg.getValue();
                }
            }
        });
        return inputDialogReturnValue;
    }

    // -------------------------------------------------------------------------
}
