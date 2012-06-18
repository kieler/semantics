package de.cau.cs.kieler.uml2.sim.kiem;

//TODO: check if necessary
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
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
import de.cau.cs.kieler.maude.MaudeInterfacePlugin;
import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.IKiemEventListener;
import de.cau.cs.kieler.sim.signals.JSONSignalValues;
import de.cau.cs.kieler.sim.kiem.KiemEvent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.execution.TimeoutThread;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeFile;
import de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent;
import de.cau.cs.kieler.uml2.sim.JavaEscape;
import de.cau.cs.kieler.uml2.sim.Uml2SimPlugin;

import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;

import de.cau.cs.kieler.core.util.Pair;

/**
 * The Class DataComponent.
 */
public class DataComponentModelCheck extends DataComponent implements IJSONObjectDataComponent,
        IKiemEventListener {

    /**
     * The constant MAUDEPARSESTATESTARTER indicates the start token to search for.
     */
    private static final String MAUDEPARSECOUNTEREXAMPLESTARTER = "result ModelCheckResult: counterexample";

    /** The Constant MAUDESTEPSEPARATOR rule token for a finished run to completion step. */
    private static final String MAUDE_RULE_FINISHEDRTC = "'finishedRTCESINT";

    /** The Constant MAUDE_RULE_COMPUTEES rule token for a finished event set computation. */
    private static final String MAUDE_RULE_COMPUTEES = "'computeFSetESINT";

    /** The Constant MAUDEMODELCHECKOK1 (or 2) indicates no counter example can be found. */
    private static final String MAUDEMODELCHECKOK1 = "result Bool: (true).Bool";

    /** The Constant MAUDEMODELCHECKOK2 (or 1) indicates no counter example can be found. */
    private static final String MAUDEMODELCHECKOK2 = "result Bool: true";

    /** The currently active states. */
    String[] currentStates;

    private static int stepNumber = -1;

    List<Step> steps;

    /**
     * The model check done flag is reset by the initialization and set after model checking has
     * been done once.
     */
    private boolean modelCheckDone;

    /** The model check counter example true if a counter example was found. */
    private boolean modelCheckCounterExample;

    // -------------------------------------------------------------------------

    public void notifyEvent(final KiemEvent event) {
        if (event.isEvent(KiemEvent.STEP_INFO)) {
            try {
                Pair pair = (Pair) event.getInfo();
                stepNumber = (int) ((Long) pair.getFirst()).longValue();
            } catch (Exception e) {
                stepNumber = -1;
                // no valid step number
            }
        }
    }

    // -------------------------------------------------------------------------

    public KiemEvent provideEventOfInterest() {
        int[] events = { KiemEvent.STEP_INFO };
        return new KiemEvent(events);
    }

    // -------------------------------------------------------------------------

    /**
     * The internal class Step represents steps.
     */
    class Step {
        List<String> states;
        List<String> events;
        List<String> transitions;
        List<String> actions;

        public Step() {
            states = new LinkedList<String>();
            events = new LinkedList<String>();
            transitions = new LinkedList<String>();
            actions = new LinkedList<String>();
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new data component.
     */
    public DataComponentModelCheck() {
    }

    // -------------------------------------------------------------------------

    /**
     * Tries to resolve ids in "<id>", e.g., "d" and construct a string with the ids used in maude,
     * e.g., d--983727134.
     * 
     * @param inputRule
     *            the input rule
     * @return the string
     */
    private String expandCheckingRule(String inputRule) {
        EObject rootElement = this.getModelRootElement();

        String outputRule = JavaEscape.resolveStateNames(inputRule, rootElement);

        return outputRule;
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent
     * #doProvideProperties()
     */
    public KiemProperty[] doProvideProperties() {
        KiemProperty[] properties = new KiemProperty[4];
        KiemPropertyTypeFile maudeFile = new KiemPropertyTypeFile(true);
        properties[0] = new KiemProperty("Maude Executable", maudeFile, "maude");
        properties[1] = new KiemProperty("State Variable", "state");
        properties[2] = new KiemProperty("No Consume Events", true);
        properties[3] = new KiemProperty("Checking Rule", "<> inC(\"d\")");
        return properties;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the rule's raw value of numbers's occurrence.
     * 
     * @param input
     *            the input
     * @param ruleName
     *            the rule name
     * @param number
     *            the number
     * @return the rule raw value
     */
    private String getRuleRawValue(String input, String ruleName, int number) {
        String[] parts = input.split(ruleName);

        if (parts != null && parts.length > number) {
            String part = parts[number];

            int start = part.lastIndexOf("{") + 1;
            int end = part.lastIndexOf(",");
            // int end = part.lastIndexOf("\")") + 2;
            String value = part.substring(start, end);
            return value;
        }

        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * Extracting states of a rawValue.
     * 
     * @param rawValue
     *            the raw value
     * @return the string[]
     */
    private String[] extractStates(String rawValue) {
        LinkedList<String> stringList = new LinkedList<String>();
        // if invalid data return empty list
        if (rawValue.indexOf("(") == -1) {
            return (stringList.toArray(new String[0]));
        }

        //
        // result (sort not calculated): readyBFPSM schedule <ready QUEUE a b a b a b a b
        // a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b
        // a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b
        // a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b
        // a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b
        // a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b
        // a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b
        // a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b
        // a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b
        // a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b
        // a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b
        // a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b
        // a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b
        // a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b
        // a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b
        // a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b
        // a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b a b
        // a b a b a b a b a ENDQUEUE > <ready (b, a) (acc:(E)b(F)a(L)5(U)0, acc:(E)a(
        // F)b(L)5(U)1) > b maState eventSelC<STATEC> root R "R1280114252", root R
        // "R1280114252" : C "State0--402295417", root R "R1280114252" : C
        // "State0--402295417" : R "R-775518637", root R "R1280114252" : C
        // "State0--402295417" : R "R-775518637" : C "State2--412151283" <HISTC> empty
        // <EVENT> b <ENDCONF> (b, a)
        //

        // consume "maState stableC (" or similar
        rawValue = rawValue.substring(rawValue.indexOf("<STATEC>") + 8);

        boolean consuming = false;
        String consumedPart = "";
        for (int c = 0; c < rawValue.length(); c++) {
            String character = rawValue.substring(c, c + 1);
            if (character.equals("\"")) {
                consuming = !consuming;
                if (!consuming) {
                    stringList.add(consumedPart);
                    consumedPart = "";
                }
                // do not consume "-character
                continue;
            }
            if (character.equals("<")) {
                break;
            }
            if (consuming) {
                consumedPart += character;
            }
        }

        return (stringList.toArray(new String[0]));
    }

    // -------------------------------------------------------------------------

    /**
     * Extracting events or actions of a rawValue.
     * 
     * @param rawValue
     *            the raw value
     * @return the string[]
     */
    private String[] extractEventsAndActions(String rawValue) {
        // parsing "... seq seq (a1 skip skip) ee2" --> a1 skip skip
        // parsing "... seq seq a1 ee2" --> a1
        // parsing "... seq seq a1 (ee2 ee2)" --> a1
        // parsing "... seq seq (a1 skip skip) (ee2 ee2)" --> a1 skip skip
        rawValue = rawValue.substring(rawValue.indexOf("("));
        rawValue = rawValue.trim();

        boolean inBracket = false;
        boolean skipped = false;
        String extracted = "";
        for (int c = rawValue.length() - 1; c >= 0; c--) {
            String character = rawValue.substring(c, c + 1);
            if (character.equals(" ") && !inBracket) {
                if (skipped) {
                    // end now
                    break;
                }
                skipped = true;
                continue;
            }
            if (character.equals(")")) {
                inBracket = true;
                continue;
            }
            if (character.equals("(")) {
                inBracket = false;
                if (skipped) {
                    // end now
                    break;
                }
                continue;
            }
            if (skipped) {
                extracted = character + extracted;
            }
        }
        return extracted.split(" ");
    }

    // -------------------------------------------------------------------------

    /**
     * Parses all steps of a maude counter example and fill the steps variable.
     * 
     * @param maudeResult
     *            the maude result
     */
    private void parseSteps(String maudeResult) {
        // filter all text before start of counter example
        maudeResult = maudeResult.substring(maudeResult.indexOf(MAUDEPARSECOUNTEREXAMPLESTARTER)
                + MAUDEPARSECOUNTEREXAMPLESTARTER.length());

        String[] resultParts = maudeResult.split(MAUDE_RULE_FINISHEDRTC);

        for (int i = 0; i < resultParts.length; i++) {
            Step currentStep = new Step();

            String resultPart = resultParts[i];
            // If not the last, add separator again for rulerawvalue-method
            if (i < resultParts.length - 1) {
                resultPart += MAUDE_RULE_FINISHEDRTC;
            }

            // Events
            int numEventParts = resultPart.split(MAUDE_RULE_COMPUTEES).length - 1;
            for (int ii = 0; ii < numEventParts; ii++) {
                String rawValue = getRuleRawValue(resultPart, MAUDE_RULE_COMPUTEES, ii);
                String[] events = extractEventsAndActions(rawValue);
                for (String event : events) {
                    currentStep.events.add(event);
                }
            }

            // Actions
            String rawValue = getRuleRawValue(resultPart, MAUDE_RULE_FINISHEDRTC, 0);
            // FIXME: The following does not seem to work any more :/ ... did we recently change the
            // syntax of actions (actually NO actions esp.)?
            // String[] actions = extractEventsAndActions(rawValue);
            // for (String action : actions) {
            // currentStep.actions.add(action);
            // }

            // States
            String[] states = extractStates(rawValue);
            for (String state : states) {
                currentStep.states.add(state);
            }

            steps.add(currentStep);
        }

    }

    // -------------------------------------------------------------------------

    static final String EVENT_FILE_NAME = "events-gen.maude";
    static final String RESULT_FILE_NAME = "out.txt";
    static final String EVENT_PRELUDE = "mod QUEUESEMANTICS is\n" + " including QUEUESIGNATURE .\n"
            + " including eclipseInterface .\n" + "     sort QueueStatus .\n"
            + " var el : EventSet .\n" + " var event : Event .\n" + " var equeue : EventQueue .\n "
            + " op allEvs : -> EventSet .\n" + " eq allEvs = empty";
    static final String EVENT_POSTLUDE = "  .\n"
            + " op <ready_ > : EventQueue -> QueueStatus .\n"
            + " op <schedule__ > : EventQueue Event -> QueueStatus .\n"
            + " op <initQueue> : -> QueueStatus .\n"
            + " rl <ready (QUEUE event, el ENDQUEUE) > => <schedule (QUEUE el, event ENDQUEUE) event > .\n"
            + " rl <schedule equeue event >  => <ready equeue > .\n"
            + " rl <initQueue> => <ready (QUEUE allEvs ENDQUEUE) > .\n " + "endm\n";
    static final String EVENT_LINE_START = "***   rl QUEUE el ENDQUEUE => QUEUE el (";
    static final String EVENT_LINE_END = ") ENDQUEUE .\n";

    public void writeAndReloadSelectedEvents(JSONObject signals) throws KiemExecutionException {
        // This is the additional Maude code to write
        String maudeCode = "";

        maudeCode += EVENT_PRELUDE;
        String[] signalNames = JSONObject.getNames(signals);
        for (String signalName : signalNames) {
            try {
                if (JSONSignalValues.isPresent(signals.get(signalName))) {
                    // maudeCode += EVENT_LINE_START;
                    maudeCode += (", " + signalName);
                    // maudeCode += EVENT_LINE_END;

                }
            } catch (JSONException e) {
                // TODO: handle these errors properly
                // ignore JSON parser errors for now
            }
        }
        maudeCode += EVENT_POSTLUDE;

        // Write this out to file
        String path = super.outPath;
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(path + "/" + EVENT_FILE_NAME));
            out.write(maudeCode);
            out.close();
        } catch (IOException e) {
            throw new KiemExecutionException("Java IO Error. Cannot write event file.", false, e);
        }

        // (Re)Load into Maude
        try {
            String result = MaudeInterfacePlugin.getDefault().queryMaude(maudeCode, maudeSessionId);
        } catch (Exception e) {
            throw new KiemExecutionException(
                    "A Maude error occurred when trying to reload events.", false, e);
        }

    }

    // -------------------------------------------------------------------------

    String MessageText;

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent
     * #doStep(org.json .JSONObject)
     */
    public JSONObject doStep(JSONObject signals) throws KiemExecutionException {
        // the return object to construct
        JSONObject returnObj = null;

        // If this component is in the zero tick, then we do the check, otherwise we are in replay
        // mode and do NOTHING!
        if (!modelCheckDone) {
            // First reload events/signals
            writeAndReloadSelectedEvents(signals);

            // do not modelcheck another time
            modelCheckDone = true;

            // Get the checking rule
            String checkingRule = this.getProperties()[4].getValue();
            // Try to search for vertex
            checkingRule = expandCheckingRule(checkingRule);

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
                triggerEventsQuery = MAUDENOEVENT;
            }

            // second build the current states
            String currentStatesQuery = "";
            for (String currentState : currentStates) {
                if (!currentStatesQuery.equals("")) {
                    currentStatesQuery += ",";
                }
                currentStatesQuery += currentState;
            }

            // Consider no-consume option
            // TODO: Select/load different modules on simulation run/model checking
            // boolean noConsume = this.getProperties()[3].getValueAsBoolean();
            // String noConsumeString = "";
            // if (noConsume) {
            // noConsumeString = " noConsume";
            // }

            // search (maState (stableC ((R-990928836 ,
            // susp441237549)) empty) (res,
            // ee1)) =>* mastate such that isDone mastate .
            // TODO: empty == history conf string
            String queryRequest =
            // "set trace on .\n"+
            // "red 2 . \n "+
            // "red in MCBFPOOLANDSM : "+ currentStatesQuery + " .\n"+
            // "red " + triggerEventsQuery + " .\n"+
            // "red in MCBFPOOLANDSM :  tups .\n" +
            // "red in MCBFPOOLANDSM : emptyQueue .\n" +
            // "red in MCBFPOOLANDSM : <ready (a, b) tups > .\n" +
            // "red in MCBFPOOLANDSM : ready <ready emptyQueue > <ready (a, b) tups > .\n" +

            //
            //
            "red in MCBFPOOLANDSM : modelCheck(" + "readyBFPSM(ready <ready QUEUE "
                    + triggerEventsQuery + " ENDQUEUE > <ready (" + triggerEventsQuery
                    + ") tups >)" + "(maState (stableC<STATEC> " + currentStatesQuery
                    + " <HISTC> empty <ENDCONF>)  (" + triggerEventsQuery + ")), " + checkingRule
                    + ") . \n"

            ;

            // Debug output query request
            printConsole(queryRequest);

            String result = "";
            String path = super.outPath;

            try {
                // StringBuilder text = new StringBuilder();
                // String NL = System.getProperty("line.separator");
                // Scanner scanner = new Scanner(new FileInputStream(path + "/" +
                // RESULT_FILE_NAME));
                // try {
                // while (scanner.hasNextLine()){
                // result += (scanner.nextLine() + NL);
                // }
                // }
                // finally{
                // scanner.close();
                // }
                //
                result = MaudeInterfacePlugin.getDefault().queryMaude(queryRequest, maudeSessionId);
            } catch (Exception e) {
                throw new KiemExecutionException("A Maude model checking error occurred.", false, e);
            }

            // Debug output query result
            printConsole(result);

            // Search for the MAUDEMODELCHECKOK-sequence in order to know if we have a counter
            // example
            // or not
            modelCheckCounterExample = true;
            if (result.contains(MAUDEMODELCHECKOK1) || result.contains(MAUDEMODELCHECKOK2)) {
                modelCheckCounterExample = false;
            }

            // If we found a counter example we want the user to be able to step through it
            if (modelCheckCounterExample) {
                // TODO: Now parse the result and build up the fake-datapool
                this.steps = new LinkedList<Step>();
                parseSteps(result);
                // TODO: Now replace the normal data-pool by the fake one
            }

            // Alert the user
            MessageText = "Model Checking passed without finding any counter example for rule:\n\n"
                    + checkingRule;
            if (modelCheckCounterExample) {
                MessageText = "Model Checking found at least one counter example for rule:\n\n"
                        + checkingRule
                        + "\n\nYou may now use the KIELER Execution Manager View to inspect the counter example.";
            }

            Display.getDefault().asyncExec(new Runnable() {
                public void run() {
                    final Shell shell = Display.getCurrent().getShells()[0];
                    MessageDialog.openInformation(shell, "Model Checking finished", MessageText);
                }
            });

            if (modelCheckCounterExample) {
                // Pause the execution
                throw (new KiemExecutionException(
                        "Maude Model Checking finished. Counter example found: "
                                + modelCheckCounterExample + ".", false, true, true, null));
            } else {
                // Raise a stop exception to stop the running execution
                throw (new KiemExecutionException(
                        "No counter example was found. Execution was stopped.", true, false, true,
                        null));
            }
        } else {
            // In this case we may have computed a counter example an can now re-play it
            // We do this only iff we have a valid stepNumber and if there is an example
            if ((stepNumber > -1) && (modelCheckCounterExample)) {
                // the return object to construct
                returnObj = new JSONObject();
                // the stateName is the second KIEM property
                String stateName = this.getProperties()[2].getValue();

                // If more than maximum steps, then hold the last one!
                if (stepNumber > steps.size() + 2) {
                    stepNumber = steps.size() + 2;
                }

                // If this is the second step then display the initial states and return!
                if (stepNumber == 2) {
                    String[] initialStates = getInitialStates();
                    try {
                        returnObj.accumulate(stateName, getCurrentStateIds(initialStates));
                    } catch (Exception e) {
                        // ignore any errors
                    }
                    returnObj = resetOtherEventsAndActions(returnObj);
                    return returnObj;
                }

                // We must deduct three steps: 0. setup, 1. model check, 2. initial states
                Step currentStep = steps.get(stepNumber - 3);

                // states
                try {
                    returnObj.accumulate(stateName,
                            getCurrentStateIds(currentStep.states.toArray(new String[0])));
                    returnObj.accumulate("DEBUG", currentStep.states.toArray(new String[0]));
                } catch (Exception e) {
                    // ignore any errors
                }

                // events and actions as signals
                for (String event : currentStep.events) {
                    if (!event.equals(MAUDENOEVENT)) {
                        try {
                            returnObj.accumulate(event, JSONSignalValues.newValue(true));
                        } catch (Exception e) {
                            // ignore any errors
                        }
                    }
                }
                for (String action : currentStep.actions) {
                    if (!action.equals(MAUDENOACTION)) {
                        try {
                            returnObj.accumulate(action, JSONSignalValues.newValue(true));
                        } catch (Exception e) {
                            // ignore any errors
                        }
                    }
                }

            }
        }

        returnObj = resetOtherEventsAndActions(returnObj);

        // no actions can be extracted so far
        return returnObj;
    }

    // -------------------------------------------------------------------------

    /**
     * Reset all events and actions that are not already set.
     * 
     * @param returnObj
     *            the return obj
     * @return the jSON object
     */
    private JSONObject resetOtherEventsAndActions(JSONObject returnObj) {
        // now reset all other events/actions that are not present at this step
        for (String event : getAllEvents()) {
            try {
                if (!returnObj.has(event)) {
                    returnObj.accumulate(event, JSONSignalValues.newValue(false));
                }
            } catch (Exception e) {
                // ignore any errors
            }

        }
        for (String action : getAllActions()) {
            try {
                if (!returnObj.has(action)) {
                    returnObj.accumulate(action, JSONSignalValues.newValue(false));
                }
            } catch (Exception e) {
                // ignore any errors
            }
        }
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
        try {
            String pathToMaude = this.getProperties()[1].getValue();

            System.out.println("");

            String pathToMaudeCode = getMaudeGenCodeLocation();
            if (isWindows()) {
                pathToMaudeCode = "\"" + transformToCygwinPath(pathToMaudeCode) + "\"";
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
                            + "set correctly in the KIELER Execution Manager parameters of the simulator"
                            + " component.", true, e);
        }

        // Reset the modelcheck flag
        modelCheckDone = false;
    }

    // -------------------------------------------------------------------------

}
