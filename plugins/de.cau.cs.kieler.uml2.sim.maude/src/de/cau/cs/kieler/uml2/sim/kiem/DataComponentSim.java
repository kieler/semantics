package de.cau.cs.kieler.uml2.sim.kiem;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowContextDefaultImpl;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.emf.mwe.internal.core.Workflow;
import org.eclipse.emf.mwe.utils.Reader;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.papyrus.editor.PapyrusMultiDiagramEditor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xpand2.Generator;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xtend.XtendComponent;
import org.eclipse.xtend.XtendFacade;
import org.eclipse.xtend.expression.AbstractExpressionsUsingWorkflowComponent.GlobalVar;
import org.eclipse.xtend.typesystem.MetaModel;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;
import org.json.JSONException;
import org.json.JSONObject;
import org.osgi.framework.Bundle;

import de.cau.cs.kieler.core.model.validation.ValidationManager;
import de.cau.cs.kieler.core.ui.KielerProgressMonitor;
import de.cau.cs.kieler.maude.MaudeInterfacePlugin;
import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONSignalValues;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.execution.TimeoutThread;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeEditor;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeFile;
import de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent;
import de.cau.cs.kieler.uml2.sim.Uml2SimPlugin;

import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;

// TODO: Auto-generated Javadoc
/**
 * The Class DataComponent.
 */
public class DataComponentSim extends DataComponent implements
        IJSONObjectDataComponent {

    /**
     * The constant MAUDEPARSESTATESTARTER indicates the start token to search for.
     */
    private static final String MAUDEPARSESTATESTARTER = "--> maState \"UML\" $doneC (C";

    /** The constant MAUDEERROR indicates the error token to search for. */
    private static final String MAUDEERROR = "*HERE*";

    /** The currently active states. */
    String[] currentStates;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new data component.
     */
    public DataComponentSim() {
        // TODO Auto-generated constructor stub
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent
     * #doProvideProperties()
     */
    public KiemProperty[] doProvideProperties() {
        KiemProperty[] properties = new KiemProperty[2];
        KiemPropertyTypeFile maudeFile = new KiemPropertyTypeFile(true);
        properties[0] = new KiemProperty("Maude Executable", maudeFile, "maude");
        properties[1] = new KiemProperty("State Variable", "state");
        return properties;
    }

    // -------------------------------------------------------------------------


    /**
     * Extract the active states.
     * 
     * @param maudeResult
     *            the maude result if any, empty list if no solution found
     * @return the string[]
     */
    public List<String[]> extractActiveStates(String maudeResult) {
        boolean error = maudeResult.contains(MAUDEERROR);
        LinkedList activeStatesChoices = new LinkedList();
        // if maude result contains error, use the old current states
        if (error) {
            activeStatesChoices.add(activeStatesChoices);
            return activeStatesChoices;
        }

        boolean foundAnotherSolution = true;

        while (foundAnotherSolution) {
            try {
                int firstSolutionStartIndex = maudeResult.indexOf(MAUDEPARSESTATESTARTER);

                // check if solution is found
                if (firstSolutionStartIndex < 0) {
                    foundAnotherSolution = false;
                    break;
                }

                // part result
                String maudePartResult = maudeResult.substring(firstSolutionStartIndex
                        + MAUDEPARSESTATESTARTER.length());

                // remainder (may contain previous solutions)
                maudeResult = maudeResult.substring(firstSolutionStartIndex
                        + MAUDEPARSESTATESTARTER.length());

                /*
                 * Maude output looks like this:
                 * 
                 * search in INIT : maState "UML" $stableC prettyVerts (T461729046, R-768353767)
                 * empty ee3 =>* mastate such that isDone mastate = true .
                 * 
                 * Solution 1 (state 3) states: 4 rewrites: 65 in 6597516000ms cpu (0ms real) (0
                 * rewrites/second) mastate --> maState "UML" $doneC (C "T461729046", root R
                 * "R-768353767") empty empty
                 * 
                 * Solution 2 (state 3) states: 4 rewrites: 65 in 6597516000ms cpu (0ms real) (0
                 * rewrites/second) mastate --> maState "UML" $doneC (C "T461729046", root R
                 * "R-768353767") empty empty
                 * 
                 * No more solutions. states: 4 rewrites: 65 in 6597516000ms cpu (0ms real) (0
                 * rewrites/second)
                 */

                LinkedList<String> stringList = new LinkedList<String>();

                boolean consuming = false;
                String consumedPart = "";
                for (int c = 0; c < maudePartResult.length(); c++) {
                    String character = maudePartResult.substring(c, c + 1);
                    if (character.equals("\"")) {
                        consuming = !consuming;
                        if (!consuming) {
                            stringList.add(consumedPart);
                            consumedPart = "";
                        }
                        // do not consume "-character
                        continue;
                    }
                    if (character.equals(")")) {
                        break;
                    }
                    if (consuming) {
                        consumedPart += character;
                    }
                }

                activeStatesChoices.add(stringList.toArray(new String[0]));
            } catch (Exception e) {
                // do nothing
            }
        } // end while

        return activeStatesChoices;
    }

    // -------------------------------------------------------------------------

    /**
     * Extract actions.
     * 
     * @param maudeResult
     *            the maude result
     * @return the string[]
     */
    public String[] extractActions(String maudeResult) {
        // TODO: this seems not yes possible.
        String[] returnArray = new String[1];
        return returnArray;
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent
     * #doStep(org.json .JSONObject)
     */
    public JSONObject doStep(JSONObject signals) throws KiemExecutionException {
        // the return object to construct
        JSONObject returnObj = new JSONObject();

        // build query string ---
        // first collect events
        String triggerEventsQuery = "";
        String[] signalNames = JSONObject.getNames(signals);
        for (String signalName : signalNames) {
            try {
                Object object;
                object = signals.get(signalName);
                if (JSONSignalValues.isPresent(object)) {
                    if (!triggerEventsQuery.isEmpty()) {
                        triggerEventsQuery += ",";
                    }
                    triggerEventsQuery += signalName;
                }
            } catch (JSONException e) {
                // ignore errors - should not happen at all
            }
        }
        // if no events selected, produce this dummy event for maude
        if (triggerEventsQuery.equals("")) {
            triggerEventsQuery = "ev: \"noevent\"";
        }

        // second build the current states
        String currentStatesQuery = "";
        for (String currentState : currentStates) {
            if (!currentStatesQuery.isEmpty()) {
                currentStatesQuery += ",";
            }
            currentStatesQuery += currentState;
        }

        // search (maState "UML" ($stableC (prettyVerts (R-990928836 ,
        // susp441237549)) empty) (res,
        // ee1)) =>* mastate such that isDone mastate .
        String queryRequest = "search (maState \"UML\" ($stableC (prettyVerts ("
                + currentStatesQuery + ")) empty) (" + triggerEventsQuery
                + ")) =>* mastate such that isDone mastate . \n";

        // Debug output query request
        printConsole(queryRequest);

        String result = "";
        try {
            result = MaudeInterfacePlugin.getDefault().queryMaude(queryRequest, maudeSessionId);
        } catch (Exception e) {
            throw new KiemExecutionException("A Maude simulation error occurred.", false, e);
        }

        // Debug output query rresult
        printConsole(result);

        // interpret resulting states
        List<String[]> currentStatesChoices = extractActiveStates(result);

        if (currentStatesChoices.size() == 1) {
            currentStates = currentStatesChoices.get(0);
        }
        if (currentStatesChoices.size() > 1) {
            currentStates = selectCurrentState(currentStatesChoices);
        }
        // else
        // currentStates don't change

        // the stateName is the second KIEM property
        String stateName = this.getProperties()[2].getValue();
        try {
            returnObj.accumulate(stateName, getCurrentStateIds(currentStates));
        } catch (Exception e) {
            // ignore any errors
        	e.printStackTrace();
        }

        // no actions can be extracted so far
        return returnObj;
    }

    // -------------------------------------------------------------------------

    private boolean flagDialogDone = false;
    private List<String[]> currentStatesChoices;
    private String[] currentStatesSelected;

    public String[] selectCurrentState(List<String[]> currentStatesChoicesParam) {
        flagDialogDone = false;
        currentStatesChoices = currentStatesChoicesParam;
        // this is also the default case if nothing is selected of canceled
        currentStatesSelected = currentStatesChoices.get(0);

        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
                // Disable timeout
                TimeoutThread.setAwaitUserRepsonse(true);
                
                Shell currentShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                        .getShell();
                SelectTraceDialog dialog = new SelectTraceDialog(currentShell,
                        "Select an execution trace");

                // build list to display
                LinkedList<String> displayList = new LinkedList<String>();
                for (String[] choice : currentStatesChoices) {
                    String currentLine = "";
                    for (String state : choice) {
                        if (currentLine.length() != 0) {
                            currentLine += ", ";
                        }
                        currentLine += state;
                    }
                    displayList.add(currentLine);
                }

                dialog.setComponentList(displayList);
                dialog.setBlockOnOpen(true);
                dialog.setForbiddenComponentList(new LinkedList<String>());

                if (dialog.open() == WizardDialog.OK) {
                    try {
                        currentStatesSelected = currentStatesChoices.get(dialog.getSelectedIndex());
                    } catch (Exception e) {
                        // go with the default
                    }
                }
                // MUST eisable timeout again
                TimeoutThread.setAwaitUserRepsonse(false);
                
                flagDialogDone = true;
            }
        });

        while (!flagDialogDone) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }

        // we now have the user choose
        return currentStatesSelected;
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent
     * #initialize()
     */
    public void initialize() throws KiemInitializationException {
        String pathToMaude = this.getProperties()[1].getValue();

        String pathToMaudeCode = getMaudeGenCodeLocation();
        if (isWindows()) {
            pathToMaudeCode = transformToCygwinPath(pathToMaudeCode);
        }

        // reset the mapping
        resetMappingHashmap();

        // clear the maude console
        clearConsole();

        // initialize with initial states (and regions)
        currentStates = getInitialStates();

        maudeSessionId = MaudeInterfacePlugin.getDefault().createMaudeSession(pathToMaude,
                pathToMaudeCode);
        try {
            MaudeInterfacePlugin.getDefault().startMaudeSession(maudeSessionId);
            printConsole(MaudeInterfacePlugin.getDefault().queryMaude(null, 1000, maudeSessionId));
        } catch (Exception e) {
            throw new KiemInitializationException(
                    "Cannot start Maude. Plase make sure that the paths are "
                            + "set correctly in the KIEM parameters of the simulator"
                            + " component.", true, e);
        }
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.IDataComponent#wrapup()
     */
    public void wrapup() throws KiemInitializationException {
        MaudeInterfacePlugin.getDefault().closeMaudeSession(maudeSessionId);

    }

    // -------------------------------------------------------------------------

}
