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
package de.cau.cs.kieler.esterel.sim;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.json.JSONArray; 
import org.json.JSONException;
import org.json.JSONObject;
import org.osgi.framework.Bundle;

import com.google.inject.Guice;

import de.cau.cs.kieler.esterel.esterel.Input;
import de.cau.cs.kieler.esterel.esterel.InterfaceSignalDecl;
import de.cau.cs.kieler.esterel.esterel.Output;
import de.cau.cs.kieler.esterel.esterel.ISignal;
import de.cau.cs.kieler.core.model.util.ProgressMonitorAdapter;
import de.cau.cs.kieler.esterel.esterel.Module;
import de.cau.cs.kieler.esterel.esterel.Program;
import de.cau.cs.kieler.esterel.sim.xtend.Esterel2CSimulationInterface;
import de.cau.cs.kieler.esterel.sim.xtend.Esterel2Simulation;
import de.cau.cs.kieler.esterel.xtend.InterfaceDeclarationFix;
import de.cau.cs.kieler.sim.benchmark.Benchmark;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeFile;
import de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent;
import de.cau.cs.kieler.sim.signals.JSONSignalValues;
//import de.cau.cs.kieler.esterel.cec.CEC;


/**
 * The Esterel simulation DataComponent is responsible for <br>
 * <ol>
 * <li>preparing Esterel code for a possibly visualized simulation execution run</li>
 * <li>generating C code with the CEC</li>
 * <li>compiling the C code to an exeutable</li>
 * <li>starting and running the executable stepwise generating inputs and examinating outputs.</li>
 * </ol>
 * <br>
 * 
 * @author cmot, ctr
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-05-31 yellow KI-7
 * 
 */
public abstract class EsterelSimulatorDataComponent extends JSONObjectSimulationDataComponent {

    // -----------------------------------------------------------------------------
    // -----------------------------------------------------------------------------

    /** The constant for waiting for a possible error message. */
    static final int SLEEP_TIME_ERRORWAITING = 100;

    /** The KiemProperty Constant for the statement name. */
    static final int KIEM_PROPERTY_STATEMENTNAME = 0;

    /** The KiemProperty Constant for the C compiler. */
    static final int KIEM_PROPERTY_CCOMPILER = 1;

    /** The KiemProperty Constant for the full debug mode. */
    static final int KIEM_PROPERTY_FULLDEBUGMODE = 2;

    /** The KiemProperty Constant for the full debug mode. */
    static final int KIEM_PROPERTY_BENCHMARK = 3;

    /** The Constant KIEM_PROPERTY_NAME_BENCHMARK. */
    protected static final String KIEM_PROPERTY_NAME_BENCHMARK = "Benchmark Mode";

    /** The Constant KIEM_PROPERTY_DEFAULT_BENCHMARK. */
    protected static final boolean KIEM_PROPERTY_DEFAULT_BENCHMARK = false;

    /** The Constant SIMULATION_SUBPATH. */
    static final String SIMULATION_SUBPATH = "include";

    /** The Constant SIMULATION_PREFIX. */
    static final String SIMULATION_PREFIX = "simu";

    /** The Constant SIMULATION_SUFFIX. */
    static final String SIMULATION_SUFFIX = ".exe";

    /** The Constant SIMULATION_JSONBIB. */
    static final String SIMULATION_JSONBIB = "cJSON.c";

    /** The Constant SIMULATION_USERTIMEBIB. */
    static final String SIMULATION_USERTIMEBIB = "usertime.h";

    /** The Constant SIMULATION_COMPILER_OPTIONS. */
    static final String SIMULATION_COMPILER_OPTIONS = "-O2 -lm -o";

    /** The benchmark flag for generating cycle and file size signals. */
    protected boolean benchmark = false;

    /** The source file size. */
    protected long sourceFileSize = 0;

    /** The executabe file size. */
    protected long executabeFileSize = 0;

    /** The Esterel program is the concerned model. */
    protected Program myModel = null;

    /** The process running the executable. */
    protected Process process = null;

    /** The PrintWriter for input to the executed Esterel C program. */
    protected PrintWriter toEsterel = null;

    /** The BufferedReader for output from the executed Esterel C program. */
    protected BufferedReader fromEsterel = null;

    /** The BufferedReader for errors possibly occurring during execution of the Esterel C program. */
    protected BufferedReader error = null;

    /** The executed file. */
    protected File simFile = null;

    /** The list of output signals to be examined. */
    protected LinkedList<String> outputSignalList = null;

    /** The Esterel error message that may be filled by the asynchronous thread. */
    protected String esterelErrorMessage = "";

    /**
     * The error reading done flag indicating that the asynchronous thread has finished reading the
     * error (if there was one).
     */
    protected boolean errorReadingDone = false;

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public String getDataComponentId() {
        // This method should be removed for release because it disables the compability check of
        // KIEM.
        return "ESTERELDATACOMPONENTID";
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean checkModelValidation(final EObject rootEObject)
            throws KiemInitializationException {
        if (!(rootEObject instanceof Program)) {
            throw new KiemInitializationException(
                    "CEC Esterel Simulator can only be used with an Esterel editor.\n\n", true,
                    null);
        }
        return true;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void initialize() throws KiemInitializationException {
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

        if (process == null) {
            throw new KiemExecutionException("No Esterel simulation is running", true, null);
        }
        try {

            // Handle gathering error messages asynchronously
            Runnable errorRunnable = new Runnable() {
                public void run() {
                    try {
                        while (error.ready()) {
                            esterelErrorMessage += error.read();
                        }
                    } catch (IOException e) {
                        // Ignore IO errors that occur when trying to read from the error stream
                    }
                    errorReadingDone = true;
                }
            };
            Thread errorThread = new Thread(errorRunnable);
            // Reset error message before performing the step
            errorReadingDone = false;
            esterelErrorMessage = "";
            errorThread.start();

            toEsterel.write(jSONObject.toString() + "\n");
            toEsterel.flush();

            // Gather any error message from Esterel if there is one.
            while (!errorReadingDone) {
                // wait for the error thread
                try {
                    Thread.sleep(SLEEP_TIME_ERRORWAITING);
                } catch (InterruptedException e) {
                    // Ignore thread errors
                    e.printStackTrace();
                }
            }
            if (!esterelErrorMessage.equals("")) {
                throw new KiemExecutionException(
                        "Error performing a step in the Esterel simulation: " + esterelErrorMessage,
                        true, null);
            }

            String receivedMessage = fromEsterel.readLine();

            if (receivedMessage != null) {
                JSONObject esterelOutput = new JSONObject(receivedMessage);
                JSONArray esterelOutputArray = esterelOutput.names();

                if (esterelOutputArray != null) {
                    // First add auxiliary signals
                    for (int i = 0; i < esterelOutputArray.length(); i++) {
                        String esterelOutputName = esterelOutputArray.getString(i);

                        // Test if the output variable is an auxiliary signal
                        // that is only there to mark the current Esterel
                        // statement
                        // in full_simulation mode of the simulator.
                        // These auxiliary signals must be encapsulated in a
                        // state
                        // variable.
                        if (esterelOutputName
                                .startsWith(EsterelSimPlugin.AUXILIARY_VARIABLE_TAG)) {
                            try {
                                String statementWithoutAuxiliaryVariableTag =
                                        esterelOutputName
                                                .substring(EsterelSimPlugin.AUXILIARY_VARIABLE_TAG
                                                        .length());

                                // Insert a "," if not the first statement
                                if (activeStatements.length() != 0) {
                                    activeStatements += ",";
                                }

                                // Add active statement to string.
                                activeStatements += statementWithoutAuxiliaryVariableTag;

                            } catch (Exception e) {
                                // Could not extract statement
                            }

                        }

                    }
                }

                // Add benchmark information
                if (this.benchmark) {
                    if (esterelOutput.has(Benchmark.BENCHMARK_SIGNAL_TIME)) {
                        Object bench = esterelOutput.get(Benchmark.BENCHMARK_SIGNAL_TIME);
                        returnObj.accumulate(Benchmark.BENCHMARK_SIGNAL_TIME, bench);
                    }
                    returnObj.accumulate(Benchmark.BENCHMARK_SIGNAL_SOURCE, sourceFileSize);
                    returnObj.accumulate(Benchmark.BENCHMARK_SIGNAL_EXECUTABLE, executabeFileSize);
                }

                // Then add normal output signals
                for (String outputSignal : outputSignalList) {
                    if (esterelOutput.has(outputSignal)) {

                        // Retrieve jsonSignal
                        JSONObject jSONSignal = esterelOutput.getJSONObject(outputSignal);

                        if (jSONSignal.has("value")) {
                            // Valued signals
                            Object value = jSONSignal.get("value");
                            returnObj.accumulate(outputSignal,
                                    JSONSignalValues.newValue(value, true));
                        } else {
                            // Pure signals
                            returnObj.accumulate(outputSignal, JSONSignalValues.newValue(true));
                        }
                    } else {
                        // This is clearly a signal (it was priorly defined as an output signal
                        // but it was not set to be present or absent in the Esterel output
                        // so by default we assume the signal is absent.
                        returnObj.accumulate(outputSignal, JSONSignalValues.newValue(false));
                    }
                }
            } else {
                throw new KiemExecutionException("No Esterel simulation is running", true, null);

            }

            // Finally accumulate all active Statements (activeStatements)
            // under the statementName
            String statementName =
                    this.getProperties()[KIEM_PROPERTY_STATEMENTNAME
                            + JSONObjectSimulationDataComponent.KIEM_PROPERTY_DIFF].getValue();
            returnObj.accumulate(statementName, activeStatements);

        } catch (IOException e) {
            // error messages are brought to the user's attention when trying to access the process
            // in the next iteration
            System.err.println(e.getMessage());
            process.destroy();
        } catch (JSONException e) {
            // error messages are brought to the user's attention when trying to access the process
            // in the next iteration
            e.printStackTrace();
            process.destroy();
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
        final int nProperties = 4;
        KiemProperty[] properties = new KiemProperty[nProperties];
        KiemPropertyTypeFile compilerFile = new KiemPropertyTypeFile();
        properties[KIEM_PROPERTY_STATEMENTNAME] = new KiemProperty("Statement Name", "statement");

        properties[KIEM_PROPERTY_CCOMPILER] = new KiemProperty("C-Compiler", compilerFile, "gcc");
        properties[KIEM_PROPERTY_FULLDEBUGMODE] = new KiemProperty("Full Debug Mode", true);
        properties[KIEM_PROPERTY_BENCHMARK] =
                new KiemProperty(KIEM_PROPERTY_NAME_BENCHMARK, KIEM_PROPERTY_DEFAULT_BENCHMARK);

        return properties;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void wrapup() throws KiemInitializationException {
        if (process != null) {
            process.destroy();
        }
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
    protected java.net.URI convertEMFtoJavaURI(final URI uri) throws URISyntaxException {
        IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();

        EsterelSimPlugin.log("convertEMFtoJavaURI 1");

        IPath path = new Path(uri.toPlatformString(false));
        EsterelSimPlugin.log("convertEMFtoJavaURI 2" + path);
        IFile file = myWorkspaceRoot.getFile(path);
        EsterelSimPlugin.log("convertEMFtoJavaURI 3" + file.toString());

        IPath fullPath = file.getLocation();
        EsterelSimPlugin.log("convertEMFtoJavaURI 4" + fullPath.toString());

        return new java.net.URI(fullPath.toString());
    }

    // -------------------------------------------------------------------------
    
    /**
     * Gets the default out file.
     * 
     * @return the default out file
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    abstract public File getDefaultOutFile() throws IOException;

    // -------------------------------------------------------------------------

    /**
     * Compile Esterel to C using the CEC and its protocol. Do this stepwise for a more detailed
     * progress bar.
     * 
     * @param strlFile
     *            the strl file
     * @param outFile
     *            the out file
     * @param monitor
     *            the monitor
     * @return the java.net. uri
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     * @throws URISyntaxException
     *             the uRI syntax exception
     */
    abstract protected java.net.URI compileEsterelToC(final URI strlFile, final File outFile,
            final EsterelSimulationProgressMonitor monitor) throws IOException, URISyntaxException;
//    {
//        monitor.subTask("Reading Esterel file");
//        EsterelSimPlugin.log("Compile 1" + strlFile.toString() + " , " + outFile.toString());
//        java.net.URI inputURI = convertEMFtoJavaURI(strlFile);
//
//        EsterelSimPlugin.log("Compile 2" + inputURI.toString());
//        InputStream strl = CEC.runSTRL(inputURI);
//        EsterelSimPlugin.log("Compile 3");
//        monitor.worked(1);
//        if (monitor.isCanceled()) {
//            strl.close();
//            return null;
//        }
//        EsterelSimPlugin.log("Compile 4");
//        monitor.subTask("Parsing Esterel file");
//        InputStream strlxml = CEC.runSTRLXML(strl);
//        monitor.worked(1);
//        if (monitor.isCanceled()) {
//            strl.close();
//            return null;
//        }
//        EsterelSimPlugin.log("Compile 5");
//        monitor.subTask("Expanding Esterel file");
//        // InputStream expandmodule = CEC.runEXPANDMODULE(strlxml, System.out);
//        InputStream expandmodule = CEC.runEXPANDMODULE(strlxml, System.out);
//        monitor.worked(1);
//        if (monitor.isCanceled()) {
//            strl.close();
//            return null;
//        }
//        EsterelSimPlugin.log("Compile 6");
//        monitor.subTask("Dismantle Esterel file");
//        InputStream dismantle = CEC.runDISMANTLE(expandmodule);
//        monitor.worked(1);
//        if (monitor.isCanceled()) {
//            strl.close();
//            return null;
//        }
//        EsterelSimPlugin.log("Compile 7");
//        monitor.subTask("ASTGRC");
//        InputStream astgrc = CEC.runASTGRC(dismantle);
//        monitor.worked(1);
//        if (monitor.isCanceled()) {
//            strl.close();
//            return null;
//        }
//        EsterelSimPlugin.log("Compile 8");
//        monitor.subTask("GRCOPT");
//        InputStream grcopt = CEC.runGRCOPT(astgrc);
//        monitor.worked(1);
//        if (monitor.isCanceled()) {
//            strl.close();
//            return null;
//        }
//        monitor.subTask("GRCPDG");
//        InputStream grcpdg = CEC.runGRCPDG(grcopt);
//        monitor.worked(1);
//        if (monitor.isCanceled()) {
//            strl.close();
//            return null;
//        }
//        monitor.subTask("PDGCCFG");
//        InputStream pdgccfg = CEC.runPDGCCFG(grcpdg);
//        monitor.worked(1);
//        if (monitor.isCanceled()) {
//            strl.close();
//            return null;
//        }
//        EsterelSimPlugin.log("Compile 9");
//        monitor.subTask("EEC");
//        InputStream eec = CEC.runEEC(pdgccfg);
//        monitor.worked(1);
//        if (monitor.isCanceled()) {
//            strl.close();
//            return null;
//        }
//        monitor.subTask("SCFGC");
//        InputStream scfgc = CEC.runSCFGC(eec);
//        monitor.worked(1);
//        if (monitor.isCanceled()) {
//            strl.close();
//            return null;
//        }
//        EsterelSimPlugin.log("Compile 10");
//        monitor.subTask("Generating C code");
//        java.net.URI uri = CEC.runCODEGEN(scfgc, outFile);
//        EsterelSimPlugin.log("Compile 11" + uri);
//
//        if (benchmark) {
//            File currentFile = new File(uri.getPath());
//            if (currentFile.exists()) {
//                sourceFileSize = currentFile.length();
//            }
//        }
//
//        monitor.worked(1);
//        strl.close();
//        return uri;
//    }

    // -------------------------------------------------------------------------

    /**
     * If there is a header file available, add include directive to generated C program and return
     * the path to the modified C program. Otherwise return the original path.
     * 
     * @throws KiemInitializationException
     */
    protected URL copyPossibleHeaderFile(final String mainModuleName, final URI inputModel,
            final URL cProgram) throws KiemInitializationException {
        // Build header file name
        String headerFileString;
        try {
            java.net.URI inputURI = convertEMFtoJavaURI(inputModel);
            headerFileString = inputURI.toString();
            headerFileString = headerFileString.replaceFirst(".strl", ".h");
        } catch (URISyntaxException e) {
            return cProgram;
        }
        IPath headerFilePath = new Path(headerFileString);

        // Test if header file exists
        File headerFile = new File(headerFileString);
        if (!headerFile.exists()) {
            // header file was not found, return the original cProgram path
            return cProgram;
        }

        // append include directive to cProgram
        URI cProgramFile = URI.createURI(cProgram.toString());
        URI cProgramModifiedFile = URI.createURI(cProgram.toString());
        cProgramModifiedFile = cProgramModifiedFile.trimFragment();
        cProgramModifiedFile =
                cProgramModifiedFile.trimFileExtension().appendFileExtension("modified.c");
        IPath cProgramFilePath = new Path(cProgramFile.toFileString());
        IPath cProgramModifiedFilePath = new Path(cProgramModifiedFile.toFileString());

        try {
            InputStream cProgramFileInputStream = new FileInputStream(cProgramFilePath.toString());
            OutputStream cProgramModifiedFileOutputStream =
                    new FileOutputStream(cProgramModifiedFilePath.toString());

            BufferedReader bufferedReader =
                    new BufferedReader(new InputStreamReader(cProgramFileInputStream));
            BufferedWriter bufferedWriter =
                    new BufferedWriter(new OutputStreamWriter(cProgramModifiedFileOutputStream));
            String line = null;

            while ((line = bufferedReader.readLine()) != null) {
                // Search for "#include mainmodule.h" line and replace it with
                // the more concrete header file.
                if (line.startsWith("#include")) {
                    if (line.contains(mainModuleName + ".h")) {
                        // replace this line
                        line = "#include \"" + headerFilePath + "\"\n";
                    }
                }

                bufferedWriter.append(line + "\n");
            }
            bufferedWriter.close();
            bufferedReader.close();

            // return the modified file instead
            URL cProgramModified = new URL(cProgramModifiedFile.toString());

            return cProgramModified;
        } catch (FileNotFoundException e) {
            throw new KiemInitializationException(
                    "Cannot read from generated C file in order to append header file inclusion.",
                    true, e);
        } catch (IOException e) {
            throw new KiemInitializationException(
                    "Cannot read from generated C file in order to append header file inclusion.",
                    true, e);
        }
    }

//    /**
//     * If there is a header file available, return the path to the header file in order to be able
//     * to include it in the wrapper code.
//     * 
//     * @throws KiemInitializationException
//     */
//    protected String getPossibleHeaderFile(final String mainModuleName, final URI inputModel,
//            final URL cProgram) throws KiemInitializationException {
//        // Build header file name
//        String headerFileString;
//        try {
//            java.net.URI inputURI = convertEMFtoJavaURI(inputModel);
//            headerFileString = inputURI.toString();
//            headerFileString = headerFileString.replaceFirst(".strl", ".h");
//        } catch (URISyntaxException e) {
//            return "";
//        }
//        IPath headerFilePath = new Path(headerFileString);
//
//        // Test if header file exists
//        File headerFile = new File(headerFileString);
//        if (!headerFile.exists()) {
//            // header file was not found, return the original cProgram path
//            return "";
//        }
//
//        return headerFilePath.toString();
//    }

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
                        + KIEM_PROPERTY_DIFF].getValueAsBoolean());
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void doModel2ModelTransform(final ProgressMonitorAdapter monitor, final Program model,
            final boolean debug, final boolean benchmarkParam) throws KiemInitializationException {
        EsterelSimPlugin.log("M2M 1");
        monitor.begin("Esterel Simulation", EsterelSimulationProgressMonitor.NUMBER_OF_TASKS);

        EsterelSimulationProgressMonitor esterelSimulationProgressMonitor =
                new EsterelSimulationProgressMonitor(monitor,
                        EsterelSimulationProgressMonitor.NUMBER_OF_TASKS);

        benchmark = benchmarkParam;

        File executable = null;
        String compile = "";
        EsterelSimPlugin.log("M2M 2");

        try {
            myModel = (Program) this.getModelRootElement();

            // Enforce the complete model to be loaded. Otherwise references to objects (signals)
            // might not be resolvable resulting in nasty error messages.
            EcoreUtil.resolveAll(myModel);

            EsterelSimPlugin.log("M2M 3");
            if (myModel == null) {
                throw new KiemInitializationException(
                        "Cannot simulate active editor using the CEC", true, null);
            }

            URI esterelOutput = URI.createURI("");
            // By default there is no additional transformation necessary
            Program transformedProgram = EcoreUtil.copy(myModel);
            EsterelSimPlugin.log("M2M 4");

            // If 'Full Debug Mode' is turned on then the user wants to have
            // also states visualized.
            // Hence some pre-processing is needed and done by the
            // Esterl2Simulation Xtend2 model transformation
            if (debug) {
                // Try to load SyncCharts model
                // 'Full Debug Mode' is turned ON
                Esterel2Simulation transform =
                        Guice.createInjector().getInstance(Esterel2Simulation.class);
                transformedProgram = transform.transform2Simulation(myModel);
            }
            EsterelSimPlugin.log("M2M 5");

            // Calculate output path
            URI input = URI.createPlatformResourceURI(this.getModelFilePath().toString(), true);
            EsterelSimPlugin.log("M2M 6" + input.toString());

            esterelOutput = URI.createURI(input.toString());
            esterelOutput = esterelOutput.trimFragment();
            esterelOutput =
                    esterelOutput.trimFileExtension().appendFileExtension("simulation.strl");
            EsterelSimPlugin.log("M2M 7" + esterelOutput.toString());

            try {
                // Write out copy/transformation of Esterel program
                Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
                Map<String, Object> m = reg.getExtensionToFactoryMap();
                m.put("", new XMIResourceFactoryImpl());
                ResourceSet resSet = new ResourceSetImpl();
                Resource resource = resSet.createResource(esterelOutput);
                resource.getContents().add(transformedProgram);
                resource.save(Collections.EMPTY_MAP);
            } catch (IOException e) {
                throw new KiemInitializationException("Cannot write output Esterel file.", true,
                        null);
            }
            EsterelSimPlugin.log("M2M 8");

            // Compile Esterel to C
            URL output =
                    this.compileEsterelToC(esterelOutput, getDefaultOutFile(),
                            esterelSimulationProgressMonitor).toURL();
            EsterelSimPlugin.log("M2M 9");

            // Possibly add #include for a header file
            String possibleHeader = "";
            if (myModel.getModules() != null && myModel.getModules().size() > 0) {
                String mainModuleName = myModel.getModules().get(0).getName();
//                possibleHeader = getPossibleHeaderFile(mainModuleName, input, output);
                  output = copyPossibleHeaderFile(mainModuleName, input, output);
            }
            EsterelSimPlugin.log("M2M 10");

            // Cannot be done before because otherwise the new model cannot be serialized
            // Do this on a copy to not destroy original program;
            // Make Esterel Interface declaration consistent
            InterfaceDeclarationFix interfaceDeclarationFix =
                    Guice.createInjector().getInstance(InterfaceDeclarationFix.class);
            Program fixedTransformedProgram = (Program) EcoreUtil.copy(transformedProgram);
            interfaceDeclarationFix.fix(fixedTransformedProgram);
            EsterelSimPlugin.log("M2M 11");

            String esterelCCodeFile = output.getPath();
            int i = esterelCCodeFile.lastIndexOf("strl");
            String esterelCCodeFileName = esterelCCodeFile;
            if (i >= 0) {
                esterelCCodeFileName = esterelCCodeFile.substring(i);
            }

            // Generate data.c
            URL data =
                    generateCSimulationInterface(fixedTransformedProgram, esterelOutput, benchmark,
                            esterelCCodeFileName, possibleHeader);
            EsterelSimPlugin.log("M2M 12");

            // Compile C code
            Bundle bundle = Platform.getBundle(EsterelSimPlugin.PLUGIN_ID);
            EsterelSimPlugin.log("M2M 13");

            URL fileUrl = FileLocator.find(bundle, new Path(SIMULATION_SUBPATH), null);
            URL bundleLocation = FileLocator.toFileURL(fileUrl);
            String bundelLocationString = (new Path(bundleLocation.getPath())).toOSString();

            EsterelSimPlugin.log("M2M 14");

            EsterelSimPlugin.log("M2M 15");

            String compiler =
                    (getProperties()[KIEM_PROPERTY_CCOMPILER
                            + JSONObjectSimulationDataComponent.KIEM_PROPERTY_DIFF]).getValue();

            if (!isWindows()) {
                // Non-Windows
                executable = File.createTempFile(SIMULATION_PREFIX, "");
                compile =
                        compiler + " " + data.getPath() + " "
                                + bundelLocationString + SIMULATION_JSONBIB + " " + "-I "
                                + bundelLocationString
                                + " -D_NO_EXTERN_DEFINITIONS -D_NO_FUNCTION_DEFINITIONS "
                                + SIMULATION_COMPILER_OPTIONS + " " + executable;

                // compile =
                // compiler + " " + output.getPath() + " " + data.getPath() + " "
                // + bundleLocation.getPath() + SIMULATION_JSONBIB + " " + "-I "
                // + bundleLocation.getPath() +
                // " -D_NO_EXTERN_DEFINITIONS -D_NO_FUNCTION_DEFINITIONS " +
                // SIMULATION_COMPILER_OPTIONS
                // + " " + executable;
            } else {
                // Windows
                executable = File.createTempFile(SIMULATION_PREFIX, SIMULATION_SUFFIX);
                compile =
                        compiler + " " + data.getPath().substring(1) + " "
                                + bundelLocationString + SIMULATION_JSONBIB + " "
                                + "-I " + bundelLocationString
                                + " -D_NO_EXTERN_DEFINITIONS -D_NO_FUNCTION_DEFINITIONS "
                                + SIMULATION_COMPILER_OPTIONS + " " + executable;
                // compile =
                // compiler + " " + output.getPath().substring(1) + " "
                // + data.getPath().substring(1) + " "
                // + bundleLocation.getPath().substring(1) + SIMULATION_JSONBIB + " "
                // + "-I " + bundleLocation.getPath().substring(1) +
                // " -D_NO_EXTERN_DEFINITIONS -D_NO_FUNCTION_DEFINITIONS "
                // + SIMULATION_COMPILER_OPTIONS + " " + executable;
            }

            // D_NO_EXTERN_DEFINITIONS
            // D_NO_FUNCTION_DEFINITIONS

            EsterelSimPlugin.log("M2M 15" + compile);
            simFile = executable;

            // Compile the code with the settings from above
            process = Runtime.getRuntime().exec(compile);
            InputStream stderr = process.getErrorStream();
            InputStreamReader isr = new InputStreamReader(stderr);
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            StringBuilder errorString = new StringBuilder();
            while ((line = br.readLine()) != null) {
                errorString.append("\n" + line);
            }
            EsterelSimPlugin.log("M2M 16");

            int exitValue = process.waitFor();

            if (exitValue != 0) {
                throw new KiemInitializationException("Could not compile: " + errorString, true,
                        new Exception(errorString.toString()));
            } else {
                if (benchmark) {
                    String benchmalCompiler =
                            (getProperties()[KIEM_PROPERTY_CCOMPILER
                                    + JSONObjectSimulationDataComponent.KIEM_PROPERTY_DIFF]).getValue();
                    
                    executabeFileSize = Benchmark.benchmarkExecutable(output, benchmalCompiler, isWindows());
                    // File currentFile = new File(simFile.getPath());
                    // if (currentFile.exists()) {
                    // executabeFileSize = currentFile.length();
                    // }
                }

            }

        } catch (Exception e) {
            throw new KiemInitializationException("Error compiling Esterel file:\n\n "
                    + e.getMessage() + "\n\n" + compile, true, e);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public JSONObject doProvideInitialVariables() throws KiemInitializationException {

        if ((simFile == null) || (!simFile.exists())) {
            throw new KiemInitializationException(
                    "Error running Esterel file. Compiled simulation does not exist.\n", true, null);
        }

        try {
            // Execute the compiled C program (asynchronously)
            String executablePath = simFile.getPath();
            process = Runtime.getRuntime().exec(executablePath);

            toEsterel = new PrintWriter(new OutputStreamWriter(process.getOutputStream()));
            fromEsterel = new BufferedReader(new InputStreamReader(process.getInputStream()));
            error = new BufferedReader(new InputStreamReader(process.getErrorStream()));
        } catch (IOException e) {
            throw new KiemInitializationException("Error running Esterel file:\n\n"
                    + e.getMessage(), true, e);
        }

        // Build the list of interface output signals
        outputSignalList = new LinkedList<String>();
        JSONObject res = new JSONObject();
        try {
            if (myModel != null) {
                // only do this for the first module as it is the main module
                if (myModel.getModules() != null && myModel.getModules().size() > 0) {
                    Module module = myModel.getModules().get(0);

                    if (module.getIntSignalDecls() != null) {
                        for (InterfaceSignalDecl sig : module.getIntSignalDecls()) {
                            if (sig instanceof Input) {
                                for (ISignal s : sig.getSignals()) {
                                    res.accumulate(s.getName(), JSONSignalValues.newValue(false));
                                }
                            }
                            if (sig instanceof Output) {
                                for (ISignal signal : sig.getSignals()) {
                                    String signalName = signal.getName();
                                    if (!signalName
                                            .startsWith(EsterelSimPlugin.AUXILIARY_VARIABLE_TAG)) {
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

    /**
     * Generate the CSimulationInterface.
     * 
     * @param esterelProgram
     *            the esterel program
     * @param esterelProgramURI
     *            the esterel program uri
     * @return the uRL
     * @throws KiemInitializationException
     *             the kiem initialization exception
     */
    protected URL generateCSimulationInterface(final Program esterelProgram,
            final URI esterelProgramURI, final boolean benchmark, final String strlProgramFileName,
            final String possibleHeader) throws KiemInitializationException {
        File data;
        try {
            data = File.createTempFile("data", ".c");

            // Apply transformation
            // Because for @Inject tags we cannot use the standard JAVA 'new'
            // keyword
            Esterel2CSimulationInterface transform =
                    Guice.createInjector().getInstance(Esterel2CSimulationInterface.class);

            if (esterelProgram.getModules() == null || esterelProgram.getModules().size() < 1) {
                throw new KiemInitializationException(
                        "Error creating data file due to invalid Esterel file "
                                + "(no Esterel modules found)", true, null);
            }

            String ccode =
                    transform.createCSimulationInterface(esterelProgram.getModules().get(0))
                            .toString();

            String additionalHeader = "";
            if (possibleHeader != null && possibleHeader.length() > 0) {
                additionalHeader = "#include \"" + possibleHeader + "\"\n\r";
            }

            ccode = additionalHeader + "#include \"" + strlProgramFileName + "\"\n\r" + ccode;

            if (benchmark) {
                ccode = Benchmark.addTimingCode(ccode, "doTick");
            }

            // Write out c program
            URI output = URI.createURI(esterelProgramURI.toString());
            output = output.trimFragment();
            try {
                FileWriter fileWriter = new FileWriter(data.getPath());
                if (fileWriter != null) {
                    BufferedWriter out = new BufferedWriter(fileWriter);
                    if (out != null) {
                        out.write(ccode);
                        out.close();
                    }
                }
            } catch (IOException e) {
                throw new ExecutionException("Cannot write output file.");
            }
            return data.toURI().toURL();
        } catch (IOException e) {
            throw new KiemInitializationException("Error creating data file", true, e);
        } catch (ExecutionException e) {
            throw new KiemInitializationException("Error creating data file", true, e);
        }
    }

    // -------------------------------------------------------------------------

}
