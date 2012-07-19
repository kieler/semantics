package de.cau.cs.kieler.uml2.sim.kiem;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowContextDefaultImpl;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.core.issues.MWEDiagnostic;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.emf.mwe.internal.core.Workflow;
import org.eclipse.emf.mwe.utils.Reader;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.WizardDialog;
//import org.eclipse.papyrus.editor.PapyrusMultiDiagramEditor;
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
import de.cau.cs.kieler.core.ui.ProgressMonitorAdapter;
import de.cau.cs.kieler.maude.MaudeInterfacePlugin;
import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.signals.JSONSignalValues;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.execution.TimeoutThread;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeFile;
import de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent;
import de.cau.cs.kieler.sim.kiem.util.KiemUtil;
import de.cau.cs.kieler.uml2.sim.Uml2SimPlugin;

import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Vertex;

import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;

import de.cau.cs.kieler.uml2.sim.JavaEscape;

// TODO: Auto-generated Javadoc
/**
 * The Class DataComponent.
 */
public class DataComponent extends JSONObjectSimulationDataComponent implements
        IJSONObjectDataComponent {

    /** The constant name of the maude console. */
    private static final String MAUDECONSOLENAME = "Maude Console";

    /**
     * The constant MAUDEPARSESTATESTARTER indicates the start token to search for.
     */
    // protected static final String MAUDEPARSESTATESTARTER = "--> maState \"UML\" $doneC (C"; (OLD
    // SYNTAX)
    // protected static final String MAUDEPARSESTATESTARTER = "--> maState doneC (";
    // TODO: is this used as relative position?
    // TODO: still needed? seems to be defined in DCSim and DCMC
    protected static final String MAUDEPARSESTATESTARTER = "maState doneC<STATEC>";

    /** The Constant MAUDENOEVENT no event (will not be displayed). */
    protected static final String MAUDENOEVENT = "(ev: \"noevent\")";

    /** The Constant MAUDENOACTION no aktion (will not be displayed). */
    protected static final String MAUDENOACTION = "skip";

    /** The constant MAUDEERROR indicates the error token to search for. */
    protected static final String MAUDEERROR = "*HERE*";

    /** The maude2 emf id hashmap to cache the mapping. */
    private HashMap<String, String> maude2EMFId;

    /** The all events cache. */
    private String[] allEvents = null;

    /** The all actions cache. */
    private String[] allActions = null;

    /** The maude session id. */
    int maudeSessionId;

    /** The out path. */
    String outPath;

    /** The currently active states. */
    String[] currentStates;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new data component.
     */
    public DataComponent() {
        // TODO Auto-generated constructor stub
    }

    // -------------------------------------------------------------------------

    // protected EObject getInputModelEObject(IEditorPart editorPart) {
    // EObject model = null;
    // if (editorPart instanceof PapyrusMultiDiagramEditor) {
    // PapyrusMultiDiagramEditor papyrusMultiDiagramEditor = (PapyrusMultiDiagramEditor) editorPart;
    // View notationElement = (View) papyrusMultiDiagramEditor.getDiagramEditPart().getModel();
    // if (notationElement == null) {
    // return null;
    // }
    // model = (EObject) notationElement.getElement();
    // }
    // return model;
    // }

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
     * Gets the initial states.
     * 
     * @return the initial states
     */
    public String[] getInitialStates() {
        LinkedList<String> stringList = new LinkedList<String>();

        // we here read in the uml model and extract the necessary information
        Object rootObject = this.getModelRootElement();
        if (rootObject instanceof EObject) {
            EObject eObject = (EObject) rootObject;
            EmfMetaModel metaModel0 = new EmfMetaModel(org.eclipse.uml2.uml.UMLPackage.eINSTANCE);
            EmfMetaModel metaModel1 = new EmfMetaModel(org.eclipse.emf.ecore.EcorePackage.eINSTANCE);

            XtendFacade facade = XtendFacade.create("model::Extensions");
            facade.registerMetaModel(metaModel0);
            facade.registerMetaModel(metaModel1);

            // collect all initial states
            Object objectList = facade.call("getInitialStates", eObject);
            if (objectList instanceof ArrayList) {
                for (Object stateOrRegion : ((ArrayList) objectList)) {
                    if (stateOrRegion instanceof String) {
                        stringList.add((String) stateOrRegion);
                        printConsole("Initial state: " + (String) stateOrRegion);
                    }
                }
            }

        }

        return stringList.toArray(new String[0]);
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
                // start of what? i assume the state configuration
                String maudePartResult = maudeResult.substring(firstSolutionStartIndex
                        + MAUDEPARSESTATESTARTER.length());

                // remainder (may contain previous solutions)
                maudeResult = maudeResult.substring(firstSolutionStartIndex
                        + MAUDEPARSESTATESTARTER.length());

                // FIXME: this has to be adapted to the new syntax
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
                 * 
                 * 
                 * =========== new syntax: START "--> maState  doneC (r"
                 * 
                 * search in INIT : maState stableC (State0-885791716, R-2027565592) empty a =>*
                 * mastate such that isDone mastate = (true).Bool .
                 * 
                 * Solution 1 (state 18) states: 19 rewrites: 7169 in 9341596000ms cpu (139ms real)
                 * (0 rewrites/second) mastate --> maState doneC (root R "R-2027565592", root R
                 * "R-2027565592" : C "State8--772141864", root R "R-2027565592" : C
                 * "State8--772141864" : R "R1009037042", root R "R-2027565592" : C
                 * "State8--772141864" : R "R236686905", root R "R-2027565592" : C
                 * "State8--772141864" : R "R1009037042" : C "State9--1326027058", root R
                 * "R-2027565592" : C "State8--772141864" : R "R236686905" : C "State12--599864602")
                 * empty a
                 * 
                 * 
                 * Solution 2 (state 21) states: 22 rewrites: 7493 in 9341596000ms cpu (142ms real)
                 * (0 rewrites/second) mastate --> maState doneC (root R "R-2027565592", root R
                 * "R-2027565592" : C "State8--772141864", root R "R-2027565592" : C
                 * "State8--772141864" : R "R1009037042", root R "R-2027565592" : C
                 * "State8--772141864" : R "R236686905", root R "R-2027565592" : C
                 * "State8--772141864" : R "R1009037042" : C "State9--1326027058", root R
                 * "R-2027565592" : C "State8--772141864" : R "R236686905" : C "State12--599864602")
                 * (historyconf root R "R-2027565592" (root R "R-2027565592" : C
                 * "State8--772141864") , historyconf root R "R-2027565592" : C "State8--772141864"
                 * : R "R1009037042" ( root R "R-2027565592" : C "State8--772141864" : R
                 * "R1009037042" : C "State9--1326027058") , historyconf root R "R-2027565592" : C
                 * "State8--772141864" : R "R236686905" ( root R "R-2027565592" : C
                 * "State8--772141864" : R "R236686905" : C "State12--599864602") ) a
                 */

                LinkedList<String> stringList = new LinkedList<String>();

                boolean consuming = false;
                String consumedPart = "";
                for (int c = 0; c < maudePartResult.length(); c++) {
                    String character = maudePartResult.substring(c, c + 1);
                    if (character.equals("\"")) {
                        consuming = !consuming;
                        if (!consuming) {
                            // Add state or region only if not already contained
                            boolean foundInList = false;
                            for (String stringListItem : stringList) {
                                if (stringListItem.equals(consumedPart)) {
                                    foundInList = true;
                                    break;
                                }
                            }
                            if (!foundInList) {
                                stringList.add(consumedPart);
                            }
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

                // add only if not already inside the activeStatesChoices list
                boolean foundInList = false;
                for (Object object : activeStatesChoices) {
                    if (object instanceof String[]) {
                        boolean equal = false;
                        String[] itemList = (String[]) object;
                        if (stringList.size() != itemList.length) {
                            equal = true;
                            for (int i = 0; i < stringList.size(); i++) {
                                equal = equal && stringList.get(i).equals(itemList[i]);
                            }
                        }
                        if (equal) {
                            foundInList = true;
                        }
                    }
                }
                if (!foundInList) {
                    activeStatesChoices.add(stringList.toArray(new String[0]));
                }
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

    /**
     * Constructs the currently active states using the original emf ids
     * 
     * @return the current state ids
     */
    public String getCurrentStateIds(String[] currentStates) {
        // FIXME: Seems not to work in some cases ?!
        String stateIds = "";
        for (String maudeStateId : currentStates) {
            System.out.println("Search for " + maudeStateId);
            String eMFId = getEMFId(maudeStateId);
            System.out.println("Found " + eMFId);
            if (eMFId != null) {
                if (!stateIds.equals("")) {
                    stateIds += ",";
                }
                stateIds += eMFId;
            }
        }
        return stateIds;
    }

    // -------------------------------------------------------------------------

    /**
     * Reset the hashmap.
     */
    public void resetMappingHashmap() {
        // create new hash map
        maude2EMFId = new HashMap<String, String>();
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the (cashed) eMF id.
     * 
     * @param maudeStateId
     *            the maude state id
     * @return the eMF id
     */
    public String getEMFId(String maudeStateId) {
        // if no hashmap exists create one
        if (maude2EMFId == null) {
            maude2EMFId = new HashMap<String, String>();
        }

        // if id was found in hashmap return it
        if (maude2EMFId.containsKey(maudeStateId)) {
            return (String) maude2EMFId.get(maudeStateId);
        }

        // if id was not found, then we search the model for it

        Object rootObject = this.getModelRootElement();
        if (rootObject instanceof EObject) {
            EObject eObject = (EObject) rootObject;
            EmfMetaModel metaModel0 = new EmfMetaModel(org.eclipse.uml2.uml.UMLPackage.eINSTANCE);
            EmfMetaModel metaModel1 = new EmfMetaModel(org.eclipse.emf.ecore.EcorePackage.eINSTANCE);

            XtendFacade facade = XtendFacade.create("model::Extensions");
            facade.registerMetaModel(metaModel0);
            facade.registerMetaModel(metaModel1);

            // collect all initial states
            Object objectList = facade.call("getEmfId", eObject, maudeStateId);
            System.out.println(objectList.toString());
            if (objectList instanceof ArrayList) {
                if (((ArrayList) objectList).size() > 0) {
                    String eMFId = (String) ((ArrayList) objectList).get(0);
                    maude2EMFId.put(maudeStateId, eMFId);
                    return eMFId;
                }
            }
        }
        return null;
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
                    if (!triggerEventsQuery.equals("")) {
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
            if (!currentStatesQuery.equals("")) {
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
        // this is also the default case if nothing is selected or canceled
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
        try {
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
        // clear caches
        resetAllEventsAndActions();
        // close Maude session
        MaudeInterfacePlugin.getDefault().closeMaudeSession(maudeSessionId);
    }

    // -------------------------------------------------------------------------

    /**
     * Refresh workspace so that, e.g. the Project Explorer is updated to display the generated
     * maude file.
     */
    public void refreshWorkspace() {
        try {
            // get resource
            IResource myresource = ResourcesPlugin.getWorkspace().getRoot();
            // then just refresh it
            myresource.refreshLocal(IResource.DEPTH_INFINITE, null);
        } catch (CoreException e) {
            e.printStackTrace();
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the maude gen code location. It is the same path where the original source file lives
     * just ending with the maude file extension instead of uml.
     * 
     * @return the maude gen code location
     */
    public String getMaudeGenCodeLocation() throws MalformedURLException, URISyntaxException {
        String outPath = getLocation().replace("%20", " ");
        URI fileUri = KiemUtil.getFileStringAsEMFURI(KiemUtil.resolveBundleOrWorkspaceFile(
                this.getModelFilePath().toString()).toString());
        String stringUri = fileUri.lastSegment().toString();
        String stringUri2 = stringUri.replace(".uml", "");
        stringUri2 = stringUri2.substring(stringUri2.indexOf("/", 1) + 1);
        return (outPath + stringUri2);
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the maude base code location that must be included into the generated maude file that
     * has to access these maude base files.
     * 
     * @return the maude base code location
     */
    public String getMaudeBaseCodeLocation() {
        // building path to bundle
        Bundle bundle = Platform.getBundle("de.cau.cs.kieler.uml2.sim.maude");

        URL url = null;
        try {
            url = FileLocator.toFileURL(FileLocator.find(bundle, new Path("maude"), null));
        } catch (IOException e2) {
            e2.printStackTrace();
        }

        String bundleLocation = url.getFile();
        // because of windows vs. linux
        bundleLocation = bundleLocation.replaceAll("[/\\\\]+", "\\" + "/");
        if (bundleLocation.startsWith("\\")) {
            bundleLocation = bundleLocation.substring(1);
        }

        return bundleLocation;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks whether the system is based on windows.
     * 
     * @return true, if is windows
     */
    public static boolean isWindows() {
        String os = System.getProperty("os.name").toLowerCase();
        return (os.indexOf("win") >= 0);
    }

    // -------------------------------------------------------------------------

    /**
     * Transforms a normal Windows path into a cygwin path because Maude for Windows is compiled w/
     * cygwin.
     * 
     * @param WindowsPath
     *            the windows path
     * @return the string
     */
    public String transformToCygwinPath(String WindowsPath) {
        int i = WindowsPath.indexOf(":");
        String drive = WindowsPath.substring(i - 1, i);
        String location = WindowsPath.substring(i + 2);
        location = location.replaceAll("[/\\\\]+", "\\" + "/");
        return "/cygdrive/" + drive.toLowerCase() + "/" + location;
    }

    // -------------------------------------------------------------------------
    public String errorMsg = "";
    public String blaaa;

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent #
     * doModel2ModelTransform(de.cau.cs.kieler.core.ui.KielerProgressMonitor)
     */
    public void doModel2ModelTransform(ProgressMonitorAdapter monitor) throws Exception {
        // Workflow
        Workflow workflow = new Workflow();

        // EMF reader
        Reader emfReader = new Reader();
        URI fileUri = KiemUtil.getFileStringAsEMFURI(KiemUtil.resolveBundleOrWorkspaceFile(
                this.getModelFilePath().toString()).toString());
        String stringUri = fileUri.toString().replace(".di", ".uml");

        // FIXME: Is this correct?! Seems not to work in RCA :(
        // emfReader.setUri("platform:/resource" + stringUri);
        emfReader.setUri(stringUri);
        emfReader.setModelSlot("model");
        // DO NOT USE THE SAME INPUT RESOUCRCE SET
        // OTHERWISE WE MAY CHANGE THE INPUT MODEL!
        // emfReader.setResourceSet(this.getInputResourceSet());
        // emfReader.setResourceSet(ptolemyModel.getResourceSet());

        String fileOut = KiemUtil.resolveBundleOrWorkspaceFile(
                this.getModelFilePath().toString()).toString();
        outPath = fileOut.substring(0, fileOut.lastIndexOf('/'));
        outPath = outPath.replace("%20", " ");
        outPath = outPath.replace("file://", "");
//        outPath = fileOutUri.trimSegments(1).toString().replace("%20", " ");;

        // Set model name (gets model.maude)
        GlobalVar modelname = new GlobalVar();
        modelname.setName("modelname");
        // Try to exchange file extension
        String stringUri2 = stringUri;
        if (stringUri.lastIndexOf(".uml") > 0) {
            stringUri2 = stringUri.substring(0, stringUri.lastIndexOf(".uml"));
        }
        stringUri2 = stringUri2.substring(stringUri2.lastIndexOf("/") + 1);
        modelname.setValue(stringUri2);

        // blaaa = "1";
        // if (blaaa.equals("1")) {
        // System.out.println("sdfsdfsdf");
        // }
        //
        // errorMsg = stringUri2;
        // Display.getDefault().syncExec(new Runnable() {
        // public void run() {
        // final Shell shell = Display.getCurrent().getShells()[0];
        // MessageDialog.openInformation(shell, "Info", errorMsg);
        // }
        // });
        //
        // Display.getDefault().syncExec(new Runnable() {
        // public void run() {
        // final Shell shell = Display.getCurrent().getShells()[0];
        // MessageDialog.openInformation(shell, "Info", "debug test");
        // }
        // });
        //

        GlobalVar maudebasecode = new GlobalVar();
        maudebasecode.setName("maudebasecode");
        String baseLocation = getMaudeBaseCodeLocation();
        if (isWindows()) {
            baseLocation = transformToCygwinPath(baseLocation);
        }
        maudebasecode.setValue(baseLocation);
        //
        // errorMsg = baseLocation;
        // Display.getDefault().syncExec(new Runnable() {
        // public void run() {
        // final Shell shell = Display.getCurrent().getShells()[0];
        // MessageDialog.openInformation(shell, "Info", errorMsg);
        // }
        // });

        // Outlet
        Outlet outlet = new Outlet();
        outlet.setPath(outPath);

        // Meta models
        EmfMetaModel metaModel0 = new EmfMetaModel(UMLPackage.eINSTANCE);
        EmfMetaModel metaModel1 = new EmfMetaModel(org.eclipse.emf.ecore.EcorePackage.eINSTANCE);

        // Xpand Generator
        Generator generator = new Generator();
        generator.addMetaModel(metaModel0);
        generator.addMetaModel(metaModel1);
        generator.addOutlet(outlet);
        generator.addGlobalVar(modelname);
        generator.addGlobalVar(maudebasecode);
        generator.setExpand("model::Template::main FOR model");

        // workflow
        WorkflowContext wfx = new WorkflowContextDefaultImpl();
        Issues issues = new org.eclipse.emf.mwe.core.issues.IssuesImpl();
        M2MProgressMonitor m2mMonitor = new M2MProgressMonitor(monitor, 3);

        workflow.addComponent(emfReader);
        workflow.addComponent(generator);
        // workflow.invoke(wfx, (ProgressMonitor)monitor.subTask(80), issues);
        workflow.invoke(wfx, m2mMonitor, issues);

        // For debugging purposes
        for (MWEDiagnostic errorDiag : issues.getErrors()) {
            errorMsg = errorDiag.getMessage();
            Display.getDefault().syncExec(new Runnable() {
                public void run() {
                    final Shell shell = Display.getCurrent().getShells()[0];
                    MessageDialog.openInformation(shell, "Info", errorMsg);
                }
            });
        }
        for (MWEDiagnostic errorDiag : issues.getWarnings()) {
            errorMsg = errorDiag.getMessage();
            Display.getDefault().syncExec(new Runnable() {
                public void run() {
                    final Shell shell = Display.getCurrent().getShells()[0];
                    MessageDialog.openInformation(shell, "Info", errorMsg);
                }
            });
        }
        for (MWEDiagnostic errorDiag : issues.getIssues()) {
            errorMsg = errorDiag.getMessage();
            Display.getDefault().syncExec(new Runnable() {
                public void run() {
                    final Shell shell = Display.getCurrent().getShells()[0];
                    MessageDialog.openInformation(shell, "Info", errorMsg);
                }
            });
        }
        for (MWEDiagnostic errorDiag : issues.getInfos()) {
            errorMsg = errorDiag.getMessage();
            Display.getDefault().syncExec(new Runnable() {
                public void run() {
                    final Shell shell = Display.getCurrent().getShells()[0];
                    MessageDialog.openInformation(shell, "Info", errorMsg);
                }
            });
        }

        // refresh the workspace because we created a new file
        refreshWorkspace();
    }

    // -------------------------------------------------------------------------

    /**
     * Get the editor input as fill directory.
     * 
     * @param editor
     *            the editor
     * @return the string
     */
    private String getLocation() {
        IPath outPathTmp = this.getModelFilePath();
        outPathTmp = outPathTmp.removeFileExtension();
        outPathTmp = outPathTmp.removeLastSegments(1);
        return outPathTmp.toString();
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent
     * #checkModelValidation (org.eclipse.emf.ecore.EObject)
     */
    public boolean checkModelValidation(final EObject rootEObject) {
        // FIXME: Reenable this later
        // Enable KlePto checks in possibly open GMF SyncCharts editor
        // ValidationManager.enableCheck("de.cau.cs.kieler.uml2.UMLMaudeChecks");
        // ValidationManager.validateActiveEditor();

        // We don't want a dependency to synccharts diagram (custom) for validation
        // because we might want to simulate head less!!!
        // Check if the model conforms to all check files and no warnings left!
        Diagnostician diagnostician = Diagnostician.INSTANCE;
        Diagnostic diagnostic = diagnostician.validate(rootEObject);
        int serenity = diagnostic.getSeverity();
        boolean ok = (serenity == Diagnostic.OK);

        return ok;
    }

    // -------------------------------------------------------------------------

    /**
     * Reset all events and actions.
     */
    protected void resetAllEventsAndActions() {
        allEvents = null;
        allActions = null;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets all events of the model (cached).
     * 
     * @return the events
     */
    protected String[] getAllEvents() {
        if (allEvents == null) {
            LinkedList<String> returnList = new LinkedList<String>();
            Object rootEObject = this.getModelRootElement();
            XtendFacade facade = getXtendFacade();

            // first collect events
            Object objectList = facade.call("getTriggerEvents", rootEObject);
            if (objectList instanceof ArrayList) {
                for (Object key : ((ArrayList<?>) objectList)) {
                    if (key instanceof String) {
                        String keyString = (String) key;
                        // not include noevent
                        if (!keyString.equals(MAUDENOEVENT)) {
                            returnList.add(keyString);
                        }
                    }
                }
            }
            allEvents = returnList.toArray(new String[0]);
        }
        return allEvents;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets all actions of the model (cached).
     * 
     * @return the actions
     */
    protected String[] getAllActions() {
        if (allActions == null) {
            LinkedList<String> returnList = new LinkedList<String>();
            Object rootEObject = this.getModelRootElement();
            XtendFacade facade = getXtendFacade();

            // first collect events
            Object objectList = facade.call("getActions", rootEObject);
            if (objectList instanceof ArrayList) {
                for (Object key : ((ArrayList<?>) objectList)) {
                    if (key instanceof String) {
                        String keyString = (String) key;
                        // not include skip action
                        if (!keyString.equals(MAUDENOACTION)) {
                            returnList.add(keyString);
                        }
                    }
                }
            }
            allActions = returnList.toArray(new String[0]);
        }
        return allActions;
    }

    // -------------------------------------------------------------------------

    /**
     * Tries to gets the xtend facade, returns null otherwise.
     * 
     * @return the xtend facade
     */
    protected XtendFacade getXtendFacade() {
        // we here read in the uml model and extract the necessary information
        Object rootObject = this.getModelRootElement();
        if (rootObject instanceof EObject) {
            EmfMetaModel metaModel0 = new EmfMetaModel(org.eclipse.uml2.uml.UMLPackage.eINSTANCE);
            EmfMetaModel metaModel1 = new EmfMetaModel(org.eclipse.emf.ecore.EcorePackage.eINSTANCE);

            XtendFacade facade = XtendFacade.create("model::Extensions");
            facade.registerMetaModel(metaModel0);
            facade.registerMetaModel(metaModel1);
            return facade;
        }
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public JSONObject doProvideInitialVariables() throws KiemInitializationException {
        JSONObject returnObj = new JSONObject();

        // first collect events
        for (String event : getAllEvents()) {
            if (!returnObj.has(event)) {
                try {
                    returnObj.accumulate(event, JSONSignalValues.newValue(false));
                } catch (JSONException e) {
                    // ignore
                }
            }
        }

        // second collect actions
        for (String action : getAllActions()) {
            if (!returnObj.has(action)) {
                try {
                    returnObj.accumulate(action, JSONSignalValues.newValue(false));
                } catch (JSONException e) {
                    // ignore
                }
            }
        }
        return returnObj;
    }

    // -------------------------------------------------------------------------

    // Adapted method because papyrus editors are not instance of DiagramEditor
    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent
     * #getNotationElement (org.eclipse.ui.IEditorPart)
     */
    // @Override
    // protected View getNotationElement(IEditorPart diagramEditor) {
    // if (diagramEditor instanceof PapyrusMultiDiagramEditor) {
    // View notationElement = ((View) ((PapyrusMultiDiagramEditor) diagramEditor)
    // .getDiagramEditPart().getModel());
    // return notationElement;
    // }
    // return null;
    // }

    // -------------------------------------------------------------------------

    // Only return the papyrus uml editor
    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent
     * #getInputEditor()
     */
    // @Override
    // protected IEditorPart getInputEditor() {
    // IEditorPart ep = super.getInputEditor();
    // if (!(ep instanceof PapyrusMultiDiagramEditor)) {
    // return null;
    // }
    // return ep;
    // }

    // -------------------------------------------------------------------------

    /**
     * Clears the maude console.
     */
    protected void clearConsole() {
        printConsole(null);
    }

    /**
     * Prints to the maude console.
     * 
     * @param text
     *            the text
     */
    protected void printConsole(final String text) {
        MessageConsole maudeConsole = null;

        boolean found = false;
        ConsolePlugin plugin = ConsolePlugin.getDefault();
        IConsoleManager conMan = plugin.getConsoleManager();
        IConsole[] existing = conMan.getConsoles();
        for (int i = 0; i < existing.length; i++)  {
            if (DataComponent.MAUDECONSOLENAME.equals(existing[i].getName())) {
                maudeConsole = (MessageConsole) existing[i];
                found = true;
                break;
            }
        }
        if (!found) {
            // if no console found, so create a new one
            maudeConsole = new MessageConsole(DataComponent.MAUDECONSOLENAME, null);
            conMan.addConsoles(new IConsole[] { maudeConsole });
        }

        // now print to the maude console or clear it
        if (text != null) {
            MessageConsoleStream out = maudeConsole.newMessageStream();
            out.println(text);
        } else {
            maudeConsole.clearConsole();
        }
    }

}
