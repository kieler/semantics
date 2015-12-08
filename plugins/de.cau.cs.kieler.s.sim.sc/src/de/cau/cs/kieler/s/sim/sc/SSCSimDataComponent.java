/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.s.sim.sc;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.inject.Guice;

import de.cau.cs.kieler.core.kexpressions.ValuedObject;
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions;
import de.cau.cs.kieler.core.model.util.ModelUtil;
import de.cau.cs.kieler.core.model.util.ProgressMonitorAdapter;
import de.cau.cs.kieler.s.extensions.SExtension;
import de.cau.cs.kieler.s.s.Program;
import de.cau.cs.kieler.s.sc.S2SCPlugin;
import de.cau.cs.kieler.s.sim.xtend.S2Simulation;
import de.cau.cs.kieler.sc.SCExecution;
import de.cau.cs.kieler.sim.benchmark.Benchmark;
import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeFile;
import de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent;
import de.cau.cs.kieler.sim.kiem.util.KiemUtil;
import de.cau.cs.kieler.sim.signals.JSONSignalValues;

/**
 * The SimulationDataComponent for simulating S code with and without visualization.
 * 
 * @author cmot
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 yellow KI-28
 */
public class SSCSimDataComponent extends JSONObjectSimulationDataComponent implements
        IJSONObjectDataComponent {

    /** The constant name of the SC console. */
    private static final String SCCONSOLENAME = "SC Console";

    /** The S program is the considered model to simulate. */
    private Program myModel = null;

    /** The SC execution object for concurrent execution. */
    private SCExecution scExecution = null;

    /** The list of output signals including the ones used for the visualization. */
    private LinkedList<String> outputSignalList = null;

    /** The list of output signals including the ones used for the visualization. */
    private LinkedList<String> outputVariableList = null;

    /** A flag indicating that debug console output is generated and should be handled. */
    private boolean debugConsole = true;

    /** The benchmark flag for generating cycle and file size signals. */
    private boolean benchmark = false;

    /** A separate tick counter that is computed for the SC debug console as a reference. */
    private long computedTick = 1;

    /** The Constant NUMBER_OF_TASKS for model transformation and code generation. */
    private static final int NUMBER_OF_TASKS = 10;

    // The KIEM_PROPERTY constants
    /** The Constant KIEM_PROPERTY_NAME_STATEMENTNAME. */
    private static final String KIEM_PROPERTY_NAME_STATEMENTNAME = "Statement Name";

    /** The Constant KIEM_PROPERTY_NAME_CCOMPILER. */
    private static final String KIEM_PROPERTY_NAME_CCOMPILER = "SC-Compiler";

    /** The Constant KIEM_PROPERTY_NAME_FULLDEBUGMODE. */
    private static final String KIEM_PROPERTY_NAME_FULLDEBUGMODE = "Full Debug Mode";

    /** The Constant KIEM_PROPERTY_NAME_BENCHMARK. */
    private static final String KIEM_PROPERTY_NAME_BENCHMARK = "Benchmark Mode";

    /** The Constant KIEM_PROPERTY_NAME_SCL. */
    private static final String KIEM_PROPERTY_NAME_SCL = "SCL (SC Light)";

    /** The Constant KIEM_PROPERTY_NAME_SCDEBUGCONSOLE. */
    private static final String KIEM_PROPERTY_NAME_SCDEBUGCONSOLE = "SC Debug Console";

    /** The Constant KIEM_PROPERTY_NAME_ALTERNATIVESYNTAX. */
    private static final String KIEM_PROPERTY_NAME_ALTERNATIVESYNTAX = "Alternative SC Syntax";

    /** The Constant KIEM_PROPERTY_DEFAULT_STATEMENTNAME. */
    private static final String KIEM_PROPERTY_DEFAULT_STATEMENTNAME = "statement";

    /** The Constant KIEM_PROPERTY_DEFAULT_CCOMPILER. */
    private static final String KIEM_PROPERTY_DEFAULT_CCOMPILER = "gcc";

    /** The Constant KIEM_PROPERTY_DEFAULT_SCDEBUGCONSOLE. */
    private static final boolean KIEM_PROPERTY_DEFAULT_SCDEBUGCONSOLE = true;

    /** The Constant KIEM_PROPERTY_DEFAULT_ALTERNATIVESYNTAX. */
    private static final boolean KIEM_PROPERTY_DEFAULT_ALTERNATIVESYNTAX = false;

    /** The Constant KIEM_PROPERTY_DEFAULT_FULLDEBUGMODE. */
    private static final boolean KIEM_PROPERTY_DEFAULT_FULLDEBUGMODE = true;

    /** The Constant KIEM_PROPERTY_DEFAULT_BENCHMARK. */
    private static final boolean KIEM_PROPERTY_DEFAULT_BENCHMARK = false;

    /** The Constant KIEM_PROPERTY_DEFAULT_SCL. */
    private static final boolean KIEM_PROPERTY_DEFAULT_SCL = false;

    /** The Constant KIEM_PROPERTY_STATEMENTNAME. */
    private static final int KIEM_PROPERTY_STATEMENTNAME = 0;

    /** The Constant KIEM_PROPERTY_CCOMPILER. */
    private static final int KIEM_PROPERTY_CCOMPILER = 1;

    /** The Constant KIEM_PROPERTY_FULLDEBUGMODE. */
    private static final int KIEM_PROPERTY_FULLDEBUGMODE = 2;

    /** The Constant KIEM_PROPERTY_BENCHMARK. */
    private static final int KIEM_PROPERTY_BENCHMARK = 3;

    /** The Constant KIEM_PROPERTY_SCDEBUGCONSOLE. */
    private static final int KIEM_PROPERTY_SCDEBUGCONSOLE = 4;

    /** The Constant KIEM_PROPERTY_ALTERNATIVESYNTAX. */
    private static final int KIEM_PROPERTY_ALTERNATIVESYNTAX = 5;

    /** The Constant KIEM_PROPERTY_SCL. */
    private static final int KIEM_PROPERTY_SCL = 6;

    /** The Constant KIEM_PROPERTY_MAX. */
    private static final int KIEM_PROPERTY_MAX = 7;
    
    /** The single s / kexpression extension. */
    private static SExtension sExtension = new SExtension();
    private static KExpressionsValuedObjectExtensions kExpressionValuedObjectExtensions = new KExpressionsValuedObjectExtensions();    

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean checkModelValidation(final EObject rootEObject)
            throws KiemInitializationException {
        if (!(rootEObject instanceof Program)) {
            throw new KiemInitializationException(
                    "S Simulator can only be used with an S editor.\n\n", true, null);
        }

        return true;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void initialize() throws KiemInitializationException {
        // do nothing
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the SC execution.
     * 
     * @return the sC execution
     */
    public SCExecution getSCExecution() {
        return scExecution;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public JSONObject doStep(final JSONObject jSONObject) throws KiemExecutionException {
        // The return object to construct
        JSONObject returnObj = new JSONObject();

        // Collect active statements
        String activeStatements = "";
        StringBuffer activeStatementsBuf = new StringBuffer();
        List<DebugData> activeStatementList = new LinkedList<DebugData>();

        if (scExecution == null || !scExecution.isStarted()) {
            throw new KiemExecutionException("No S simulation is running", true, null);
        }
        try {
            String out = jSONObject.toString();
            scExecution.getInterfaceToExecution().write(out + "\n");
            scExecution.getInterfaceToExecution().flush();
            while (scExecution.getInterfaceError().ready()) {
                // Error output, if any
                System.out.print(scExecution.getInterfaceError().read());
            }

            String receivedMessage = scExecution.getInterfaceFromExecution().readLine();

            if (debugConsole) {
                printConsole("==============| TICK " + computedTick++ + " |==============");
                while (!receivedMessage.startsWith("{\"")) {
                    printConsole(receivedMessage);
                    receivedMessage = scExecution.getInterfaceFromExecution().readLine();
                }
                printConsole("\n");
            }

            if (receivedMessage != null) {
                JSONObject sSignalOutput = new JSONObject(receivedMessage);
                JSONArray sSignalOutputArray = sSignalOutput.names();

                if (sSignalOutputArray != null) {
                    // First add auxiliary signals
                    for (int i = 0; i < sSignalOutputArray.length(); i++) {
                        String sSignalOutputName = sSignalOutputArray.getString(i);
                        if (sSignalOutput.get(sSignalOutputName) instanceof JSONObject) {

                            JSONObject sSignal = sSignalOutput.getJSONObject(sSignalOutputName);

                            boolean sSignalIsPresent = JSONSignalValues.isPresent(sSignal);

                            // Test if the output variable is an auxiliary signal
                            // that is only there to mark the current S statement
                            // in full_simulation mode of the simulator.
                            //
                            // These auxiliary signals must be encapsulated in a state variable.
                            if (sSignalOutputName.startsWith(SSimSCPlugin.AUXILIARY_VARIABLE_TAG)
                                    && sSignalIsPresent) {
                                try {
                                    String statementWithoutAuxiliaryVariableTag = sSignalOutputName
                                            .substring(SSimSCPlugin.AUXILIARY_VARIABLE_TAG.length());

                                    int prio = -1;
                                    if (sSignal.has("prio")) {
                                        prio = sSignal.getInt("prio");
                                    }

                                    int order = -1;
                                    if (sSignal.has("order")) {
                                        order = sSignal.getInt("order");
                                    }

                                    DebugData activeStatement = new DebugData();
                                    activeStatement.name = statementWithoutAuxiliaryVariableTag;
                                    activeStatement.prio = prio;
                                    activeStatement.order = order;
                                    activeStatementList.add(activeStatement);

                                } catch (Exception e) {
                                    // ignore error
                                    e.printStackTrace();
                                }

                            }
                        }
                    }
                }

                // Sort statements according to their "order"
                Collections.sort(activeStatementList);
                // Serialize activeStatementList to activeStatements String
                for (DebugData activeStatement : activeStatementList) {
                    // Insert a "," if not the first statement
                    if (activeStatementsBuf.length() != 0) {
                        activeStatementsBuf.append(",");
                    }
                    activeStatementsBuf.append(activeStatement.name + "(" + activeStatement.prio
                            + ")");
                }
                activeStatements = activeStatementsBuf.toString();

                if (this.benchmark) {
                    if (sSignalOutput.has(Benchmark.BENCHMARK_SIGNAL_TIME)) {
                        Object bench = sSignalOutput.get(Benchmark.BENCHMARK_SIGNAL_TIME);
                        returnObj.accumulate(Benchmark.BENCHMARK_SIGNAL_TIME, bench);
                    }
                    returnObj.accumulate(Benchmark.BENCHMARK_SIGNAL_SOURCE,
                            this.scExecution.getSourceFileSize());
                    returnObj.accumulate(Benchmark.BENCHMARK_SIGNAL_EXECUTABLE,
                            this.scExecution.getExecutableFileSize());
                }

                // Then add normal output signals
                for (String outputSignal : outputSignalList) {
                    if (sSignalOutput.has(outputSignal)) {

                        // retrieve jsonSignal
                        JSONObject jsonSignal = sSignalOutput.getJSONObject(outputSignal);
                        boolean sSignalIsPresent = JSONSignalValues.isPresent(jsonSignal);

                        if (JSONSignalValues.isSignalValue(jsonSignal)) {
                            Object value = JSONSignalValues.getSignalValue(jsonSignal);
                            // valued signals
                            if (sSignalIsPresent) {
                                returnObj.accumulate(outputSignal,
                                        JSONSignalValues.newValue(value, true));
                            }
                        } else {
                            // pure signals
                            returnObj.accumulate(outputSignal,
                                    JSONSignalValues.newValue(sSignalIsPresent));
                        }
                    } else {
                        returnObj.accumulate(outputSignal, JSONSignalValues.newValue(false));
                    }
                }
                for (String outputVariable : outputVariableList) {
                    if (sSignalOutput.has(outputVariable)) {

                        // retrieve jsonSignal
                        JSONObject jsonVariable = sSignalOutput.getJSONObject(outputVariable);
                        boolean sVariableIsPresent = JSONSignalValues.isPresent(jsonVariable);

                        if (JSONSignalValues.isSignalValue(jsonVariable)) {
                            Object value = JSONSignalValues.getSignalValue(jsonVariable);
                            // valued signals
                            // ALWAYS UPDATE VALUES FOR VARIABLES
                            //if (sSignalIsPresent) {
                                returnObj.accumulate(outputVariable,
                                        JSONSignalValues.newValue(value, true));
                            //}
                        } else {
                            // pure signals
                            returnObj.accumulate(outputVariable,
                                    JSONSignalValues.newValue(sVariableIsPresent));
                        }
                    } else {
                        returnObj.accumulate(outputVariable, JSONSignalValues.newValue(false));
                    }
                }
            } else {
                throw new KiemExecutionException("No S simulation is running", true, null);

            }

            // Finally accumulate all active Statements (activeStatements)
            // under the statementName
            String statementName = this.getProperties()[KIEM_PROPERTY_STATEMENTNAME
                    + KIEM_PROPERTY_DIFF].getValue();
            returnObj.accumulate(statementName, activeStatements);

        } catch (IOException e) {
            System.err.println(e.getMessage());
            scExecution.stopExecution(false);
        } catch (JSONException e) {
            e.printStackTrace();
            scExecution.stopExecution(false);
        }

        return returnObj;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean isObserver() {
        return true;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean isProducer() {
        return true;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public KiemProperty[] doProvideProperties() {
        final int nProperties = KIEM_PROPERTY_MAX;
        KiemProperty[] properties = new KiemProperty[nProperties];
        KiemPropertyTypeFile compilerFile = new KiemPropertyTypeFile();
        properties[KIEM_PROPERTY_STATEMENTNAME] = new KiemProperty(
                KIEM_PROPERTY_NAME_STATEMENTNAME, KIEM_PROPERTY_DEFAULT_STATEMENTNAME);
        properties[KIEM_PROPERTY_CCOMPILER] = new KiemProperty(KIEM_PROPERTY_NAME_CCOMPILER,
                compilerFile, KIEM_PROPERTY_DEFAULT_CCOMPILER);
        properties[KIEM_PROPERTY_FULLDEBUGMODE] = new KiemProperty(
                KIEM_PROPERTY_NAME_FULLDEBUGMODE, KIEM_PROPERTY_DEFAULT_FULLDEBUGMODE);
        properties[KIEM_PROPERTY_BENCHMARK] = new KiemProperty(KIEM_PROPERTY_NAME_BENCHMARK,
                KIEM_PROPERTY_DEFAULT_BENCHMARK);
        properties[KIEM_PROPERTY_ALTERNATIVESYNTAX] = new KiemProperty(
                KIEM_PROPERTY_NAME_ALTERNATIVESYNTAX, KIEM_PROPERTY_DEFAULT_ALTERNATIVESYNTAX);
        properties[KIEM_PROPERTY_SCDEBUGCONSOLE] = new KiemProperty(
                KIEM_PROPERTY_NAME_SCDEBUGCONSOLE, KIEM_PROPERTY_DEFAULT_SCDEBUGCONSOLE);
        properties[KIEM_PROPERTY_SCL] = new KiemProperty(KIEM_PROPERTY_NAME_SCL,
                KIEM_PROPERTY_DEFAULT_SCL);

        return properties;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void wrapup() throws KiemInitializationException {
        computedTick = 1;
        clearConsole();
        if (scExecution != null) {
            // Do not delete the executable, maybe it can be used again
            scExecution.stopExecution(false);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void doModel2ModelTransform(final ProgressMonitorAdapter monitor)
            throws KiemInitializationException {
        // get active editor
        doModel2ModelTransform(monitor, (Program) this.getModelRootElement(),
                this.getProperties()[KIEM_PROPERTY_FULLDEBUGMODE + KIEM_PROPERTY_DIFF]
                        .getValueAsBoolean(), this.getProperties()[KIEM_PROPERTY_BENCHMARK
                        + KIEM_PROPERTY_DIFF].getValueAsBoolean(),
                this.getProperties()[KIEM_PROPERTY_SCDEBUGCONSOLE + KIEM_PROPERTY_DIFF]
                        .getValueAsBoolean(), this.getProperties()[KIEM_PROPERTY_SCL
                        + KIEM_PROPERTY_DIFF].getValueAsBoolean());
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void doModel2ModelTransform(final ProgressMonitorAdapter monitor, final Program model,
            final boolean debug, final boolean benchmarkParam, final boolean debugConsoleParam,
            final boolean scl) throws KiemInitializationException {
        this.myModel = model;
        monitor.begin("S Simulation", NUMBER_OF_TASKS);

        String compile = "";
        try {

            if (myModel == null) {
                throw new KiemInitializationException(
                        "Cannot simulate active editor using the S Simulator", true, null);
            }

            if (this.getModelRootElement().eResource() == null) {
                throw new KiemInitializationException(
                        "The active editor has must be saved in order to simulate the S program."
                                + " Volatile resources cannot be simulated.", true, null);
            }

            // Make a copy of the S program in case it was from
            // an active Editor
            URI sOutput = URI.createURI("");
            URI scOutput = URI.createURI("");
            // By default there is no additional transformation necessary
            Program transformedProgram = myModel;

            // Calculate output path for possible S-m2m
            String inputPathString = this.getModelFilePath().toString();
            URI input = URI.createPlatformResourceURI(inputPathString.replace("%20", " "), true);
            sOutput = URI.createURI(input.toString());

            // If 'Full Debug Mode' is turned on then the user also wants to have
            // states visualized.
            // Hence some pre-processing is needed and done by the
            // Esterl2Simulation Xtend2 model transformation
            if (debug) {
                // Try to load SyncCharts model
                // 'Full Debug Mode' is turned ON
                S2Simulation transform = Guice.createInjector().getInstance(S2Simulation.class);
                transformedProgram = transform.transform2Simulation(myModel);

                // Because we transformed the S program we need to save a different file
                // and pass this new file to the SC simulation instead.
                sOutput = sOutput.trimFragment();
                sOutput = sOutput.trimFileExtension().appendFileExtension("simulation.s");

                try {
                    // Write out copy/transformation of S program
                    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
                    Map<String, Object> m = reg.getExtensionToFactoryMap();
                    m.put("daform", new XMIResourceFactoryImpl());
                    ResourceSet resSet = new ResourceSetImpl();
                    Resource resource = resSet.createResource(sOutput);
                    resource.getContents().add(transformedProgram);
                    resource.save(Collections.EMPTY_MAP);
                } catch (IOException e) {
                    throw new KiemInitializationException("Cannot write output S file.", true, null);
                }
            }

            // Calculate output path for SC-m2t
            scOutput = URI.createURI(input.toString());
            scOutput = scOutput.trimFragment();
            scOutput = scOutput.trimFileExtension();
            String modelName = scOutput.lastSegment();
            scOutput = scOutput.appendFileExtension("c");

            // Set a random output folder for the compiled files
            String outputFolder = KiemUtil.generateRandomTempOutputFolder();

            // Check whether alternative SC syntax is requested
            boolean alternativeSyntax = this.getProperties()[KIEM_PROPERTY_ALTERNATIVESYNTAX
                    + KIEM_PROPERTY_DIFF].getValueAsBoolean();

            // Check whether SC compilation should generate additional debug output
            debugConsole = debugConsoleParam;
            benchmark = benchmarkParam;

            // Generate SC code
            IPath scOutputPath = new Path(scOutput.toPlatformString(false).replace("%20", " "));
            IFile scOutputFile = KiemUtil.convertIPathToIFile(scOutputPath);
            String scOutputString = KiemUtil.getAbsoluteFilePath(scOutputFile);
            
            URI header = URI.createURI("");
            header = URI.createURI(input.toString());
            header = scOutput.trimFragment();
            header = scOutput.trimFileExtension().appendFileExtension("h");
            
            IPath headerPath = new Path(header.toPlatformString(false).replace("%20", " "));
            IFile headerFile = ModelUtil.convertIPathToIFile(headerPath);
            
            String headerFileInclude = "";
            if (headerFile.exists()) {
                headerFileInclude = "#include \""+headerFile.getName()+"\"";
            }            
            
            S2SCPlugin.generateCCode(transformedProgram, scOutputString, outputFolder,
                    alternativeSyntax, headerFileInclude);

            // Compile
            scExecution = new SCExecution(outputFolder, benchmark);
            LinkedList<String> generatedSCFiles = new LinkedList<String>();
            generatedSCFiles.add(scOutputString);
            scExecution.setDebug(debugConsole);
            scExecution.setScl(scl);
            scExecution.compile(generatedSCFiles, modelName, scOutputString);
        } catch (RuntimeException e) {
            throw new KiemInitializationException("Error compiling S program:\n\n "
                    + e.getMessage() + "\n\n" + compile, true, e);
        } catch (IOException e) {
            throw new KiemInitializationException("Error compiling S program:\n\n "
                    + e.getMessage() + "\n\n" + compile, true, e);
        } catch (InterruptedException e) {
            throw new KiemInitializationException("Error compiling S program:\n\n "
                    + e.getMessage() + "\n\n" + compile, true, e);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public JSONObject doProvideInitialVariables() throws KiemInitializationException {

        // start execution of compiled program
        if (scExecution.isCompiled()) {
            try {
                scExecution.startExecution();
            } catch (IOException e) {
                throw new KiemInitializationException(
                        "S program could not be started sucessfully.\n\n", true, e);
            }
        } else {
            throw new KiemInitializationException("S program was not compiled sucessfully.\n\n",
                    true, null);
        }

        if (!scExecution.isStarted()) {
            throw new KiemInitializationException(
                    "Error running S program. Compiled simulation does not exist.\n", true, null);
        }

        // Build the list of interface output signals
        outputSignalList = new LinkedList<String>();
        outputVariableList = new LinkedList<String>();
        JSONObject res = new JSONObject();
        try {
            if (myModel != null && kExpressionValuedObjectExtensions.getValuedObjects(myModel) != null) {
                for (ValuedObject valuedObject : kExpressionValuedObjectExtensions.getValuedObjects(myModel)) {
                        if (kExpressionValuedObjectExtensions.isInput(valuedObject)) {
                            if (kExpressionValuedObjectExtensions.isSignal(valuedObject)) {
                                res.accumulate(valuedObject.getName(), JSONSignalValues.newValue(false));
                            }
                            else {
                                res.accumulate(valuedObject.getName(), JSONSignalValues.newValue(false));
                            }
                        }
                        if (kExpressionValuedObjectExtensions.isOutput(valuedObject)) {
                            String signalName = valuedObject.getName();
                            if (!signalName.startsWith(SSimSCPlugin.AUXILIARY_VARIABLE_TAG)) {
                                if (kExpressionValuedObjectExtensions.isSignal(valuedObject)) {
                                    res.accumulate(signalName, JSONSignalValues.newValue(false));
                                    outputSignalList.add(signalName);
                                }
                                else {
                                    res.accumulate(signalName, JSONSignalValues.newValue(false));
                                    outputVariableList.add(signalName);
                                }
                            }
                        }
                }
            }
        } catch (JSONException e) {
            // ignore
        }
        return res;
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
    // -------------------------------------------------------------------------

    /**
     * Clears the sc console.
     */
    protected void clearConsole() {
        printConsole(null);
    }

    // -------------------------------------------------------------------------

    /**
     * Prints to the sc console.
     * 
     * @param text
     *            the text
     */
    protected void printConsole(final String text) {
        MessageConsole scConsole = null;

        boolean found = false;
        ConsolePlugin plugin = ConsolePlugin.getDefault();
        IConsoleManager conMan = plugin.getConsoleManager();
        IConsole[] existing = conMan.getConsoles();
        for (int i = 0; i < existing.length; i++) {
            if (SSCSimDataComponent.SCCONSOLENAME.equals(existing[i].getName())) {
                scConsole = (MessageConsole) existing[i];
                found = true;
                break;
            }
        }
        if (!found) {
            // if no console found, so create a new one
            scConsole = new MessageConsole(SSCSimDataComponent.SCCONSOLENAME, null);
            conMan.addConsoles(new IConsole[] { scConsole });
        }

        // now print to the sc console or clear it
        if (text != null) {
            MessageConsoleStream out = scConsole.newMessageStream();
            out.println(text);
        } else {
            scConsole.clearConsole();
        }
    }

    // -------------------------------------------------------------------------

    /**
     * The Class DebugData.
     */
    protected class DebugData implements Comparable<DebugData> {

        /** The name. */
        public String name;

        /** The prio. */
        public int prio;

        /** The order. */
        public int order;

        /**
         * Instantiates a new debug data.
         */
        public DebugData() {
        }

        /**
         * {@inheritDoc}
         */
        public int compareTo(final DebugData compareObject) {
            if (order < compareObject.order) {
                return -1;
            } else if (order == compareObject.order) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    // -------------------------------------------------------------------------
}
