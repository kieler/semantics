/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.esterel.sim.c;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.osgi.framework.Bundle;

import com.google.inject.Guice;

import de.cau.cs.kieler.core.model.util.ModelUtil;
import de.cau.cs.kieler.core.model.util.ProgressMonitorAdapter;
import de.cau.cs.kieler.esterel.esterel.Module;
import de.cau.cs.kieler.esterel.esterel.Program;
import de.cau.cs.kieler.esterel.kexpressions.Input;
import de.cau.cs.kieler.esterel.kexpressions.InterfaceSignalDecl;
import de.cau.cs.kieler.esterel.kexpressions.Output;
import de.cau.cs.kieler.esterel.kexpressions.Signal;
import de.cau.cs.kieler.esterel.sim.c.xtend.CSimulationEsterel;
import de.cau.cs.kieler.esterel.xtend.InterfaceDeclarationFix;
import de.cau.cs.kieler.kico.CompilationResult;
import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.kico.KielerCompilerContext;
import de.cau.cs.kieler.s.extensions.SExtension;
//import de.cau.cs.kieler.s.s.Program;
import de.cau.cs.kieler.sc.CExecution;

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
 * The main simulator component.
 * 
 * @author cmot
 * @kieler.design 2014-11-26 proposed cmot
 * @kieler.rating 2014-11-26 proposed yellow
 */
public class EsterelCDataComponent extends JSONObjectSimulationDataComponent implements
        IJSONObjectDataComponent {
    /** The dirty indicator is used to notice editor changes and set the dirty flag accordingly. */
    private int dirtyIndicator = 0;

    private static final int KIEM_PROPERTY_MAX = 7;

    private static final int KIEM_PROPERTY_STATEMENTNAME = 0;
    private static final String KIEM_PROPERTY_NAME_STATEMENTNAME = "Statement Name";

    /** The Constant KIEM_PROPERTY_CCOMPILER. */
    private static final int KIEM_PROPERTY_CCOMPILER = 1;

    /** The Constant KIEM_PROPERTY_DEFAULT_CCOMPILER. */
    private static final String KIEM_PROPERTY_DEFAULT_CCOMPILER = "gcc";

    /** The Constant KIEM_PROPERTY_NAME_CCOMPILER. */
    private static final String KIEM_PROPERTY_NAME_CCOMPILER = "SC-Compiler";

    /** The Constant KIEM_PROPERTY_FULLDEBUGMODE. */
    private static final int KIEM_PROPERTY_FULLDEBUGMODE = 2;

    /** The Constant KIEM_PROPERTY_NAME_FULLDEBUGMODE. */
    private static final String KIEM_PROPERTY_NAME_FULLDEBUGMODE = "Full Debug Mode";

    /** The Constant KIEM_PROPERTY_DEBUGTRANSFORMATIONS. */
    private static final int KIEM_PROPERTY_DEBUGTRANSFORMATIONS = 3;
    /** The Constant KIEM_PROPERTY_NAME_DEBUGTRANSFORMATIONS. */
    private static final String KIEM_PROPERTY_NAME_DEBUGTRANSFORMATIONS = "Debug Transformations";
    /** The Constant KIEM_PROPERTY_DEFAULT_DEBUGTRANSFORMATIONSS. */
    private static final String KIEM_PROPERTY_DEFAULT_DEBUGTRANSFORMATIONS = "";

    /** The Constant KIEM_PROPERTY_HIGHLEVELTRANSFORMATIONS. */
    private static final int KIEM_PROPERTY_HIGHLEVELTRANSFORMATIONS = 4;
    /** The Constant KIEM_PROPERTY_NAME_HIGHLEVELTRANSFORMATIONS. */
    private static final String KIEM_PROPERTY_NAME_HIGHLEVELTRANSFORMATIONS =
            "High Level Transformations";
    /** The Constant KIEM_PROPERTY_DEFAULT_COMPILETRANSFORMATIONS. */
    private static final String KIEM_PROPERTY_DEFAULT_HIGHLEVELTRANSFORMATIONS = "";

    /** The Constant KIEM_PROPERTY_LOWLEVELTRANSFORMATIONS. */
    private static final int KIEM_PROPERTY_LOWLEVELTRANSFORMATIONS = 5;
    /** The Constant KIEM_PROPERTY_NAME_LOWLEVELTRANSFORMATIONS. */
    private static final String KIEM_PROPERTY_NAME_LOWLEVELTRANSFORMATIONS =
            "Low Level Transformations";
    /** The Constant KIEM_PROPERTY_DEFAULT_COMPILETRANSFORMATIONS. */
    private static final String KIEM_PROPERTY_DEFAULT_LOWLEVELTRANSFORMATIONS =
            "scl.basic, scg, codegeneration";

    /** The KiemProperty Constant for the full debug mode. */
    static final int KIEM_PROPERTY_BENCHMARK = 6;

    /** The Constant KIEM_PROPERTY_NAME_BENCHMARK. */
    private static final String KIEM_PROPERTY_NAME_BENCHMARK = "Benchmark Mode";

    /** The Constant KIEM_PROPERTY_DEFAULT_BENCHMARK. */
    private static final boolean KIEM_PROPERTY_DEFAULT_BENCHMARK = false;

    /** The C execution object for concurrent execution. */
    private CExecution cExecution = null;

    /** The list of output signals. */
    private LinkedList<String> outputSignalList = null;

    /** The SSCharts State / SCG is the considered model to simulate. */
    private EObject myModel = null;

    /** The benchmark flag for generating cycle and file size signals. */
    private boolean benchmark = false;

    /** The source file size. */
    private long sourceFileSize = 0;

    /** The executabe file size. */
    private long executabeFileSize = 0;

    // -------------------------------------------------------------------------

    public EsterelCDataComponent() {
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public KiemProperty[] doProvideProperties() {
        final int nProperties = KIEM_PROPERTY_MAX;
        KiemPropertyTypeFile compilerFile = new KiemPropertyTypeFile();
        KiemProperty[] properties = new KiemProperty[nProperties];
        properties[KIEM_PROPERTY_STATEMENTNAME] =
                new KiemProperty(KIEM_PROPERTY_NAME_STATEMENTNAME, "statement");
        properties[KIEM_PROPERTY_CCOMPILER] =
                new KiemProperty(KIEM_PROPERTY_NAME_CCOMPILER, compilerFile,
                        KIEM_PROPERTY_DEFAULT_CCOMPILER);
        properties[KIEM_PROPERTY_FULLDEBUGMODE] =
                new KiemProperty(KIEM_PROPERTY_NAME_FULLDEBUGMODE, true);
        properties[KIEM_PROPERTY_DEBUGTRANSFORMATIONS] =
                new KiemProperty(KIEM_PROPERTY_NAME_DEBUGTRANSFORMATIONS,
                        KIEM_PROPERTY_DEFAULT_DEBUGTRANSFORMATIONS);
        properties[KIEM_PROPERTY_HIGHLEVELTRANSFORMATIONS] =
                new KiemProperty(KIEM_PROPERTY_NAME_HIGHLEVELTRANSFORMATIONS,
                        KIEM_PROPERTY_DEFAULT_HIGHLEVELTRANSFORMATIONS);
        properties[KIEM_PROPERTY_LOWLEVELTRANSFORMATIONS] =
                new KiemProperty(KIEM_PROPERTY_NAME_LOWLEVELTRANSFORMATIONS,
                        KIEM_PROPERTY_DEFAULT_LOWLEVELTRANSFORMATIONS);
        properties[KIEM_PROPERTY_BENCHMARK] =
                new KiemProperty(KIEM_PROPERTY_NAME_BENCHMARK, KIEM_PROPERTY_DEFAULT_BENCHMARK);
        return properties;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean checkModelValidation(final EObject rootEObject)
            throws KiemInitializationException {
//        if (!(rootEObject instanceof Program) && !(rootEObject instanceof SCLProgram)) {
        if (!(rootEObject instanceof Program)) {
            throw new KiemInitializationException(
                    "Esterel (SCG) Simulator can only be used with an Esterel or SCL editor.\n\n",
                    true, null);
        }

        return true;
    }

    // -------------------------------------------------------------------------

    /**
     * SCG {@inheritDoc}
     */
    public boolean isDirty() {
        // Calculate a dirty indicator from ALL model elements and their textual representation's
        // hash code.
        int newDirtyIndicator = 0;
        TreeIterator<?> treeIterator = super.getModelRootElement().eAllContents();
        while (treeIterator.hasNext()) {
            Object obj = treeIterator.next();
            newDirtyIndicator += obj.toString().hashCode();
        }
        // Also consider KIEM properties (may have changes and require new code generation)
        for (int i = 0; i < KIEM_PROPERTY_MAX + KIEM_PROPERTY_DIFF; i++) {
            newDirtyIndicator += this.getProperties()[i].getValue().hashCode();
        }
        if (newDirtyIndicator != dirtyIndicator) {
            dirtyIndicator = newDirtyIndicator;
            return true;
        }
        // We conclude at this point that we are not dirty on the level of
        // changes to the diagram
        return false || (cExecution == null);
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public String getDataComponentId() {
        // This method should be removed for release because it disables the compability check of
        // KIEM.
        return "de.cau.cs.kieler.esterel.sim.c";
    }

    // -------------------------------------------------------------------------

    public void initialize() throws KiemInitializationException {
    }

    // -------------------------------------------------------------------------

    public void wrapup() throws KiemInitializationException {
        if (cExecution != null) {
            // Do not delete the executable, maybe it can be used again
            cExecution.stopExecution(false);
        }
    }

    // -------------------------------------------------------------------------

    public boolean isProducer() {
        return true;
    }

    // -------------------------------------------------------------------------

    public boolean isObserver() {
        return true;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the C execution.
     * 
     * @return the C execution
     */
    public CExecution getCExecution() {
        return cExecution;
    }

    // -------------------------------------------------------------------------
    
    /**
     * Gets the bundle path.
     * 
     * @param subDirectory
     *            the sub directory
     * @return the bundle path
     */
    private String getBundlePath(String subDirectory) {
        Bundle bundle = Platform.getBundle(EsterelCSimulationPlugin.PLUGIN_ID);

        URL url = null;
        String bundleLocation = null;
      try {
            url = FileLocator.toFileURL(FileLocator.find(bundle, new Path(subDirectory), null));
            IPath bla = new Path(url.getPath());
            bundleLocation = bla.toOSString();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return bundleLocation;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public JSONObject doProvideInitialVariables() throws KiemInitializationException {
        // start execution of compiled program
        if (cExecution != null && cExecution.isCompiled()) {
            try {
                cExecution.startExecution();
            } catch (IOException e) {
                throw new KiemInitializationException(
                        "Esterel program could not be started sucessfully.\n\n", true, e);
            }
        } else {
            throw new KiemInitializationException(
                    "Esterel program was not compiled sucessfully.\n\n", true, null);
        }

        if (!cExecution.isStarted()) {
            throw new KiemInitializationException(
                    "Error running Esterel program. Compiled simulation does not exist.\n", true,
                    null);
        }

        // Build the list of interface output signals
        outputSignalList = new LinkedList<String>();
        new LinkedList<String>();

        JSONObject res = new JSONObject();
        try {
            if (myModel != null && myModel instanceof Program) {
                Program program = (Program) myModel;
                // only do this for the first module as it is the main module
                if (program.getModules() != null && program.getModules().size() > 0) {
                    Module module = program.getModules().get(0);

                    if (module.getInterface() != null
                            && module.getInterface().getIntSignalDecls() != null) {
                        for (InterfaceSignalDecl sig : module.getInterface().getIntSignalDecls()) {
                            if (sig instanceof Input) {
                                for (Signal s : sig.getSignals()) {
                                    res.accumulate(s.getName(), JSONSignalValues.newValue(false));
                                }
                            }
                            if (sig instanceof Output) {
                                for (Signal signal : sig.getSignals()) {
                                    String signalName = signal.getName();
                                    if (!signalName
                                            .startsWith(EsterelCSimulationPlugin.AUXILIARY_VARIABLE_TAG)) {
                                        res.accumulate(signalName, JSONSignalValues.newValue(false));
                                        outputSignalList.add(signalName);
                                    }
                                }
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
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void doModel2ModelTransform(final ProgressMonitorAdapter monitor)
            throws KiemInitializationException {
        doModel2ModelTransform(monitor, this.getModelRootElement(),
                this.getProperties()[KIEM_PROPERTY_FULLDEBUGMODE + KIEM_PROPERTY_DIFF]
                        .getValueAsBoolean(), this.getProperties()[KIEM_PROPERTY_BENCHMARK
                        + KIEM_PROPERTY_DIFF].getValueAsBoolean());
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void doModel2ModelTransform(final ProgressMonitorAdapter monitor, final EObject model,
            final boolean debug, final boolean benchmarkParam) throws KiemInitializationException {

        benchmark = benchmarkParam;
        this.myModel = model;
        monitor.begin("Esterel (SCG) Simulation", 1);

        String compile = "";
        try {
            if (this.myModel == null) {
                throw new KiemInitializationException(
                        "Cannot simulate active editor using the Esterel (SCG) Simulator", true,
                        null);
            }
            // if (this.getModelRootElement().eResource() == null) {
            // throw new KiemInitializationException(
            // "The active editor has must be saved in order to simulate the SCChart."
            // + " Volatile resources cannot be simulated.", true, null);
            // }

            URI.createURI("");
            URI.createURI("");

            // Calculate output path for possible S-m2m
            String inputPathString = this.getModelFilePath().toString();
            URI input = URI.createPlatformResourceURI(inputPathString.replace("%20", " "), true);
            URI.createURI(input.toString());

            String highLevelTransformations =
                    this.getProperties()[KIEM_PROPERTY_HIGHLEVELTRANSFORMATIONS
                            + KIEM_PROPERTY_DIFF].getValue();
            String lowLevelTransformations =
                    this.getProperties()[KIEM_PROPERTY_LOWLEVELTRANSFORMATIONS + KIEM_PROPERTY_DIFF]
                            .getValue();

            // If 'Full Debug Mode' is turned on then the user also wants to have
            // states and transitions visualized.
            // Hence some pre-processing is needed and done by the
            // an addition model transformation
            String debugTransformations =
                    this.getProperties()[KIEM_PROPERTY_DEBUGTRANSFORMATIONS + KIEM_PROPERTY_DIFF]
                            .getValue();
            if (debug) {
                highLevelTransformations = debugTransformations + ", " + highLevelTransformations;
            }

            // Compile the SCChart to C code
            EObject extendedSCChart = this.myModel;
            
            // Enforce the complete model to be loaded. Otherwise references to objects (signals)
            // might not be resolvable resulting in nasty error messages.
            EcoreUtil.resolveAll(myModel);

            KielerCompilerContext highLevelContext =
                    new KielerCompilerContext(highLevelTransformations, extendedSCChart);

            // Create a dummy resource ONLY for debug visualization, where we need FragmentURIs
            highLevelContext.setCreateDummyResource(debug);

            highLevelContext.setInplace(false);
            // TODO: check
            CompilationResult highLeveleCompilationResult =
                    KielerCompiler.compile(highLevelContext);

            // The following should be a state or an SCG
            EObject esterelProgramOrSCLProgram = highLeveleCompilationResult.getEObject();

            if (!((esterelProgramOrSCLProgram instanceof Program))) {
                // compilation failed
                throw new KiemInitializationException(
                        "Error compiling the Esterel/SCEst (high-level synthesis). Try compiling it manually step-by-step using the KiCo compiler selection view.",
                        true, null);
            }

            KielerCompilerContext lowLevelContext =
                    new KielerCompilerContext(lowLevelTransformations, esterelProgramOrSCLProgram);
            lowLevelContext.setCreateDummyResource(true);
            lowLevelContext.setInplace(false);
            // TODO: check
            lowLevelContext.setAdvancedSelect(true);
            CompilationResult lowLevelCompilationResult = KielerCompiler.compile(lowLevelContext);

            String cModelCCode = lowLevelCompilationResult.getString();
            if (cModelCCode == null) {
                // compilation failed
                throw new KiemInitializationException(
                        "Error compiling the Esterel/SCEst (low-level synthesis). Try compiling it manually step-by-step using the KiCo compiler selection view.",
                        true, null);
            }

            // Generate Simulation wrapper C code
            String cSimulation = "";
            if (esterelProgramOrSCLProgram instanceof Program) {
                CSimulationEsterel cSimulationSCChart =
                        Guice.createInjector().getInstance(CSimulationEsterel.class);
                Program program = (Program) esterelProgramOrSCLProgram;

                // Cannot be done before because otherwise the new model cannot be serialized
                // Do this on a copy to not destroy original program;
                // Make Esterel Interface declaration consistent
                InterfaceDeclarationFix interfaceDeclarationFix =
                        Guice.createInjector().getInstance(InterfaceDeclarationFix.class);
                Program fixedTransformedProgram = (Program) EcoreUtil.copy(program);
                interfaceDeclarationFix.fix(fixedTransformedProgram);

                
                cSimulation = cSimulationSCChart.transform(fixedTransformedProgram, "10000").toString();
            }

            if (benchmark) {
                cSimulation = Benchmark.addTimingCode(cSimulation, "tick");
            }

            // Possibly add #include for a header file
            cSimulation = copyPossibleHeaderFile(input, cSimulation);

            // Set a random output folder for the compiled files
            String outputFolder = ModelUtil.generateRandomTempOutputFolder();

            String fileNameSCChart = "model.c";
            String outputFileSCChart = outputFolder + fileNameSCChart;
            writeOutputModel(outputFileSCChart, cModelCCode.getBytes());

            String fileNameSimulation = "simulation.c";
            String outputFileSimulation = outputFolder + fileNameSimulation;
            writeOutputModel(outputFileSimulation, cSimulation.getBytes());

            String includePath = getBundlePath("templates");
            // Compile
            cExecution = new CExecution(outputFolder, benchmark);
            LinkedList<String> generatedSCFiles = new LinkedList<String>();
            generatedSCFiles.add(outputFileSimulation);
            generatedSCFiles.add("-I " + includePath);
            String modelName = "SCG";
            if (myModel instanceof Program) {
                modelName = ((Program) myModel).getModules().get(0).getName();
            }
            cExecution.compile(generatedSCFiles, modelName, outputFileSCChart);

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
     * Write output model to file.
     * 
     * @param outputFile
     *            the output file
     * @param modelAsText
     *            the model as text
     */
    private static void writeOutputModel(String outputFile, byte[] model) {
        FileOutputStream out;
        try {
            out = new FileOutputStream(outputFile);
            out.write(model);
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    public JSONObject doStep(JSONObject jSONObject) throws KiemExecutionException {
        // The return object to construct
        JSONObject returnObj = new JSONObject();

        // Collect active statements
        StringBuffer activeStatementsBuf = new StringBuffer();
        new StringBuffer();

        if (cExecution == null || !cExecution.isStarted()) {
            throw new KiemExecutionException("No S simulation is running", true, null);
        }

        if (benchmark) {
            sourceFileSize = cExecution.getSourceFileSize();
            executabeFileSize = cExecution.getExecutableFileSize();
        }

        try {
            String out = jSONObject.toString();
            cExecution.getInterfaceToExecution().write(out + "\n");
            cExecution.getInterfaceToExecution().flush();
            while (cExecution.getInterfaceError().ready()) {
                // Error output, if any
                EsterelCSimulationPlugin.logError("ERROR: " + cExecution.getInterfaceError().read());
            }

            String receivedMessage = cExecution.getInterfaceFromExecution().readLine();

            if (receivedMessage != null) {
                JSONObject output = new JSONObject(receivedMessage);
                JSONArray outputArray = output.names();

                if (outputArray != null) {
                    // First add auxiliary signals (for active statements)
                    for (int i = 0; i < outputArray.length(); i++) {
                        String outputName = outputArray.getString(i);

                        if (output.get(outputName) instanceof JSONObject) {

                            JSONObject valuedObject = output.getJSONObject(outputName);
                            Object value = ((JSONObject) valuedObject).get("value");
                            
                            boolean present = false;
                            boolean isSignal = false;
                            if (valuedObject.has("present")) {
                                isSignal = true;
                                Object isPresentValue = valuedObject.get("present");
                                if (value instanceof Boolean) {
                                    present = (Boolean) isPresentValue;
                                } else if (value instanceof Integer) {
                                    present = ((Integer) isPresentValue) != 0;
                                }
                            }
                            
                            if (!isSignal) {
                                if (value instanceof Boolean) {
                                    present = (Boolean) value;
                                } else if (value instanceof Integer) {
                                    present = ((Integer) value) != 0;
                                }
                            }

                            if (outputName
                                    .startsWith(EsterelCSimulationPlugin.AUXILIARY_VARIABLE_TAG)) {
                                if (present) {
                                    if (activeStatementsBuf.length() > 0) {
                                        activeStatementsBuf.append(",");
                                    }
                                    String activeStatementName =
                                            outputName
                                                    .substring(EsterelCSimulationPlugin.AUXILIARY_VARIABLE_TAG
                                                            .length());
                                    activeStatementsBuf.append(activeStatementName);
                                }
                            } else {
                                returnObj.accumulate(outputName,
                                        JSONSignalValues.newValue(value, present));
                            }
                        }

                    }
                }
                // Add benchmark information
                if (this.benchmark) {
                    if (output.has(Benchmark.BENCHMARK_SIGNAL_TIME)) {
                        Object bench = output.get(Benchmark.BENCHMARK_SIGNAL_TIME);
                        returnObj.accumulate(Benchmark.BENCHMARK_SIGNAL_TIME, bench);
                    }
                }
            }

            // Add benchmark information
            if (this.benchmark) {
                returnObj.accumulate(Benchmark.BENCHMARK_SIGNAL_SOURCE, sourceFileSize);
                returnObj.accumulate(Benchmark.BENCHMARK_SIGNAL_EXECUTABLE, executabeFileSize);
            }

            // Finally accumulate all active Statements (activeStatements)
            // under the statementName
            String activeStatements = "";
            activeStatements = activeStatementsBuf.toString();

            String activeStatementsName =
                    this.getProperties()[KIEM_PROPERTY_STATEMENTNAME + KIEM_PROPERTY_DIFF]
                            .getValue();
            returnObj.accumulate(activeStatementsName, activeStatements);

        } catch (IOException e) {
            System.err.println(e.getMessage());
            cExecution.stopExecution(false);
        } catch (JSONException e) {
            e.printStackTrace();
            cExecution.stopExecution(false);
        }

        return returnObj;
    }

    // -------------------------------------------------------------------------
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

    /**
     * If there is a header file available, add include directive to generated C program and return
     * the path to the modified C program. Otherwise return the original path.
     * 
     * @throws KiemInitializationException
     */
    private String copyPossibleHeaderFile(final URI inputModel, String cCode)
            throws KiemInitializationException {
        // Build header file name
        String headerFileString;
        try {
            java.net.URI inputURI = convertEMFtoJavaURI(inputModel);
            headerFileString = inputURI.toString();
            headerFileString = headerFileString.replaceFirst(".strl", ".h");
        } catch (URISyntaxException e) {
            return cCode;
        }
        IPath headerFilePath = new Path(headerFileString);

        // Test if header file exists
        File headerFile = new File(headerFileString);
        if (!headerFile.exists()) {
            // header file was not found, return the original cProgram path
            return cCode;
        }

        // append include directive to cProgram
        cCode = "#include \"" + headerFilePath + "\"\n" + cCode;
        return cCode;
    }

    // -------------------------------------------------------------------------

    /**
     * Convert an EMF URI to a Java.net.URI.
     * 
     * @param URI
     *            the URI
     * @return the java.net. URI
     * @throws URISyntaxException
     *             the URI syntax exception
     */
    private java.net.URI convertEMFtoJavaURI(final URI uri) throws URISyntaxException {
        IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();


        IPath path = new Path(uri.toPlatformString(false));
        IFile file = myWorkspaceRoot.getFile(path);
        IPath fullPath = file.getLocation();

        return new java.net.URI(fullPath.toString());
    }

    // -------------------------------------------------------------------------

}
