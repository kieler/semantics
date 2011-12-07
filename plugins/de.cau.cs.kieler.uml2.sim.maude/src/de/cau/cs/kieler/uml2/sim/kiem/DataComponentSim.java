package de.cau.cs.kieler.uml2.sim.kiem;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.maude.MaudeInterfacePlugin;
import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONSignalValues;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.execution.TimeoutThread;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeBool;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeFile;

// TODO: Auto-generated Javadoc
/**
 * The Class DataComponent.
 */
public class DataComponentSim extends DataComponent implements IJSONObjectDataComponent {

    /**
     * The constant MAUDEPARSESTATESTARTER indicates the start token to search for.
     */
//  TODO: is this used as relative position? 
    // FIXME: the has to be adapted to the new syntax -> check
    private static final String MAUDEPARSESTATESTARTER = "maState doneC<STATEC>"; // FALSCH!
                                                                                // "--> maState  doneC (r";

    /** The constant MAUDEERROR indicates the error token to search for. */
    private static final String MAUDEERROR = "*HERE*";

    /** The currently active states. */
    List<String> currentStates = new LinkedList<String>();

    /** The currently active regions. */
    List<String> currentRegions = new LinkedList<String>();

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
    @Override
    public KiemProperty[] doProvideProperties() {
        KiemProperty[] properties = new KiemProperty[4];
        KiemPropertyTypeFile maudeFile = new KiemPropertyTypeFile(true);
        KiemPropertyTypeBool macroStep = new KiemPropertyTypeBool();

        properties[0] = new KiemProperty("Maude Executable", maudeFile, "maude");
        properties[1] = new KiemProperty("State Variable", "state");
        properties[2] = new KiemProperty("Region Variable", "region");
        properties[3] = new KiemProperty("Number of Steps", 1);
       // properties[4] = new KiemProperty("parse output", (new KiemPropertyTypeBool()));
        
        
        return properties;
    }

    // -------------------------------------------------------------------------

    /**
     * Extract actions.
     * 
     * @param maudeResult
     *            the maude result
     * @return the string[]
     */
    @Override
    public String[] extractActions(final String maudeResult) {
        // TODO: this seems not yet possible.
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
    @Override
    public JSONObject doStep(final JSONObject signals) throws KiemExecutionException {
        // the return object to construct
        JSONObject returnObj = new JSONObject();

        // build query string ---
        // first collect events
        String triggerEventsQuery = "";
        String[] signalNames = JSONObject.getNames(signals);
        if (signalNames != null) {
            for (String signalName : signalNames) {
                try {
                    Object object;
                    object = signals.get(signalName);
                    if (JSONSignalValues.isPresent(object)) {
                        if (!triggerEventsQuery.equals("")) {
                            triggerEventsQuery += ",";
                        }
                        triggerEventsQuery += signalName;
                    }
                } catch (JSONException e) {
                    // ignore errors - should not happen at all
                }
            }
        }
        // if no events selected, produce this dummy event for maude
        // TODO remove noevent here?
        if (triggerEventsQuery.equals("")) {
            triggerEventsQuery = "ev: \"noevent\"";
        }
        String triggerEventsQueue = triggerEventsQuery.replace(",", " "); 

        // second build the current states
        String currentStatesRegionsQuery = "";
        for (String currentState : currentStates) {
            if (!currentStatesRegionsQuery.equals("")) {
                currentStatesRegionsQuery += ",";
            }
            currentStatesRegionsQuery += currentState;
        }
        for (String currentRegion : currentRegions) {
            if (!currentStatesRegionsQuery.equals("")) {
                currentStatesRegionsQuery += ",";
            }
            currentStatesRegionsQuery += currentRegion;
        }

        // event queue
        String numSteps = this.getProperties()[4].getValue();
        String queryEQ = "<ready emptyQueue > ";
        // acceptance tuples 
        String queryAT = "(" + "acc:(E) emptyEventSet (F) " + triggerEventsQuery + " (L)" + numSteps + "(U)0 " + ") "; 
//        String queryAS = "<ready (" + triggerEventsQuery + ") emptyAcctupSet > ";
        String queryAS = "<ready (" + triggerEventsQuery + ") " +  queryAT + " > ";
        // event pool 
        String queryEP = "ready " + queryEQ + queryAS + " ";
        // configuration
        String queryCf = "stableC<STATEC> " + currentStatesRegionsQuery +  " <HISTC> empty <ENDCONF> ";
        // machine configuration
        String queryMC = "maState (" + queryCf + ") (" + triggerEventsQuery + ") ";
        // system configuration
        String querySC = "readyBFPSM (" + queryEP + ") (" + queryMC + ") "; 
        
        
        // The event pool
        //readyBFPSM(ready <ready emptyQueue > <ready
     
        String queryRequest = 
//        		"red (acc:(E)emptyEventSet(F)b(L)1(U)1) . \n"+
//        		"red (blocked (acc:(E)emptyEventSet(F)b(L)1(U)1)) . \n"+
//        		"red 2 . \n";
//        		"red " + queryEQ + ". \n"+
//           		"red " + queryAT + ". \n"+
//       		"red " + queryAS + ". \n"+

//        		"red " + queryEP + ". \n"+
//           		"red " + queryCf + ". \n"+
//           		"red " + queryMC + ". \n"+
//           		"red " + querySC + ". \n"+
//				"red $allowed " + triggerEventsQuery + " " + queryAT + " . \n" + 
        		"search " + querySC +" =>* mastate such that isDone mastate . \n";
//        		"rew [200] " + querySC +" . \n";
           		

        // Debug output query request
        printConsole(queryRequest);

        String result = "";
        try {
            result = MaudeInterfacePlugin.getDefault().queryMaude(queryRequest, maudeSessionId);
        } catch (Exception e) {
            throw new KiemExecutionException("A Maude simulation error occurred.", false, e);
        }

        // Debug output query result
        printConsole(result);

        // interpret resulting states
        List<String[]> currentStatesRegionsChoices = extractActiveStates(result);
        List<String> currentStatesRegions = new LinkedList<String>();

        if (currentStatesRegionsChoices.size() == 1) {
            currentStatesRegions = Arrays.asList(currentStatesRegionsChoices.get(0));
        } 
        else {

        	printConsole(currentStatesRegionsChoices.toString()); 
        }
        
        if (currentStatesRegionsChoices.size() > 1) {
            currentStatesRegions = Arrays.asList(selectCurrentState(currentStatesRegionsChoices));
            if (KiemPlugin.getDefault().getExecution() != null && 
                      KiemPlugin.getDefault().getExecution().isRunning()) {
                // Raise a pause exception to pause a possibly running execution
                throw (new KiemExecutionException(
                        "A user selection during a running execution will cause the execution to be paused.",
                        false, true, true, null));
            }
        }

        // if anything changed, extract regions from state list
        if (currentStatesRegionsChoices.size() > 0) {
            currentStates = new LinkedList<String>();
            currentRegions = new LinkedList<String>();

            for (String currentStateRegion : currentStatesRegions) {
                if (currentStateRegion.startsWith("R-")) {
                    // possibly add to region list
                    boolean found = false;
                    for (String currentRegion : currentRegions) {
                        if (currentRegion.equals(currentStateRegion)) {
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        // add to regions list because it is not yet in this list
                        currentRegions.add(currentStateRegion);
                    }
                } else {
                    // possibly add to state list
                    boolean found = false;
                    for (String currentState : currentStates) {
                        if (currentState.equals(currentStateRegion)) {
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        // add to regions list because it is not yet in this list
                        currentStates.add(currentStateRegion);
                    }
                }
            }
        }

        // else
        // currentStates and currentRegions don't change

        // the stateName is the second KIEM property
        String stateName = this.getProperties()[2].getValue();
        try {
            returnObj.accumulate(stateName,
                    getCurrentStateIds(currentStates.toArray(new String[0])));
            returnObj.accumulate("DEBUG", currentStates.toArray(new String[0]));
        } catch (Exception e) {
            // ignore any errors
            e.printStackTrace();
        }

        // the regionName is the third KIEM property
        String regionName = this.getProperties()[3].getValue();
        try {
            returnObj.accumulate(regionName,
                    getCurrentStateIds(currentRegions.toArray(new String[0])));
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

    @Override
    public String[] selectCurrentState(final List<String[]> currentStatesChoicesParam) {
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
    @Override
    public void initialize() throws KiemInitializationException {
        String pathToMaude = this.getProperties()[1].getValue();

        String pathToMaudeCode = getMaudeGenCodeLocation();
        if (isWindows()) {
            pathToMaudeCode = "\"" + transformToCygwinPath(pathToMaudeCode) +"\"";
        }

        // reset the mapping
        resetMappingHashmap();

        // clear the maude console
        clearConsole();

        // initialize with initial states (and regions)
        currentStates = Arrays.asList(getInitialStates());
        // TODO: Initial Regions?

        maudeSessionId = MaudeInterfacePlugin.getDefault().createMaudeSession(pathToMaude,
                pathToMaudeCode );
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


}
