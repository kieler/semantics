/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.sim.c;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
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
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.osgi.framework.Bundle;

import com.google.inject.Guice;

import de.cau.cs.kieler.core.kexpressions.ValuedObject;
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension;
import de.cau.cs.kieler.core.model.util.ModelUtil;
import de.cau.cs.kieler.core.model.util.ProgressMonitorAdapter;
import de.cau.cs.kieler.kico.CompilationResult;
import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.s.extensions.SExtension;
import de.cau.cs.kieler.s.s.Program;
import de.cau.cs.kieler.sc.SCExecution;
import de.cau.cs.kieler.sc.SCPlugin;
import de.cau.cs.kieler.sccharts.Region;
import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.sccharts.sim.c.xtend.CSimulation;
import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeChoice;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeFile;
import de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent;
import de.cau.cs.kieler.sim.kiem.util.KiemUtil;
import de.cau.cs.kieler.sim.signals.JSONSignalValues;

/**
 * The main simulator component.
 * 
 * @author cmot
 * @kieler.design 2014-07-17 proposed cmot
 * @kieler.rating 2014-07-17 proposed yellow
 */
public class SCChartsCDataComponent extends JSONObjectSimulationDataComponent implements
        IJSONObjectDataComponent {
    /** A separate tick counter that is computed for the SC debug console as a reference. */
    private long computedTick = 1;

    /** The dirty indicator is used to notice editor changes and set the dirty flag accordingly. */
    private int dirtyIndicator = 0;

    private static final int KIEM_PROPERTY_MAX = 6;

    private static final int KIEM_PROPERTY_STATENAME = 0;
    private static final String KIEM_PROPERTY_NAME_STATENAME = "State Name";
    private static final int KIEM_PROPERTY_TRANSITIONNAME = 1;
    private static final String KIEM_PROPERTY_NAME_TRANSITIONNAME = "Transition Name";

    /** The Constant KIEM_PROPERTY_CCOMPILER. */
    private static final int KIEM_PROPERTY_CCOMPILER = 2;

    /** The Constant KIEM_PROPERTY_DEFAULT_CCOMPILER. */
    private static final String KIEM_PROPERTY_DEFAULT_CCOMPILER = "gcc";

    /** The Constant KIEM_PROPERTY_NAME_CCOMPILER. */
    private static final String KIEM_PROPERTY_NAME_CCOMPILER = "SC-Compiler";

    /** The Constant KIEM_PROPERTY_FULLDEBUGMODE. */
    private static final int KIEM_PROPERTY_FULLDEBUGMODE = 3;

    /** The Constant KIEM_PROPERTY_NAME_FULLDEBUGMODE. */
    private static final String KIEM_PROPERTY_NAME_FULLDEBUGMODE = "Full Debug Mode";

    /** The Constant KIEM_PROPERTY_DEBUGTRANSFORMATIONS. */
    private static final int KIEM_PROPERTY_DEBUGTRANSFORMATIONS = 4;
    /** The Constant KIEM_PROPERTY_NAME_DEBUGTRANSFORMATIONS. */
    private static final String KIEM_PROPERTY_NAME_DEBUGTRANSFORMATIONS = "Debug Transformations";
    /** The Constant KIEM_PROPERTY_DEFAULT_DEBUGTRANSFORMATIONSS. */
    private static final String KIEM_PROPERTY_DEFAULT_DEBUGTRANSFORMATIONS = "SCCHARTSSIMULATION";

    /** The Constant KIEM_PROPERTY_COMPILETRANSFORMATIONS. */
    private static final int KIEM_PROPERTY_COMPILETRANSFORMATIONS = 5;
    /** The Constant KIEM_PROPERTY_NAME_COMPILETRANSFORMATIONS. */
    private static final String KIEM_PROPERTY_NAME_COMPILETRANSFORMATIONS = "Compile Transformations";
    /** The Constant KIEM_PROPERTY_DEFAULT_COMPILETRANSFORMATIONS. */
    private static final String KIEM_PROPERTY_DEFAULT_COMPILETRANSFORMATIONS = "CODEGENERATION";
    
    /** The SC execution object for concurrent execution. */
    private SCExecution scExecution = null;

    /** The list of output signals. */
    private LinkedList<String> outputSignalList = null;

    /** The list of output signals. */
    private LinkedList<String> outputVariableList = null;

    /** The list of output states used for the visualization. */
    private LinkedList<String> outputStateList = null;

    /** The list of output transitions used for the visualization. */
    private LinkedList<String> outputTransitionList = null;

    /** The SSCharts State is the considered model to simulate. */
    private State myModel = null;

    /** The single s / kexpression extension. */
    private static SExtension sExtension = new SExtension();
    private static KExpressionsExtension kExpressionExtension = new KExpressionsExtension();

    // -------------------------------------------------------------------------

    public SCChartsCDataComponent() {
        // TODO Auto-generated constructor stub
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
        properties[KIEM_PROPERTY_STATENAME] =
                new KiemProperty(KIEM_PROPERTY_NAME_STATENAME, "state");
        properties[KIEM_PROPERTY_TRANSITIONNAME] =
                new KiemProperty(KIEM_PROPERTY_NAME_TRANSITIONNAME, "transition");
        properties[KIEM_PROPERTY_CCOMPILER] =
                new KiemProperty(KIEM_PROPERTY_NAME_CCOMPILER, compilerFile,
                        KIEM_PROPERTY_DEFAULT_CCOMPILER);
        properties[KIEM_PROPERTY_FULLDEBUGMODE] =
                new KiemProperty(KIEM_PROPERTY_NAME_FULLDEBUGMODE, true);
        properties[KIEM_PROPERTY_DEBUGTRANSFORMATIONS] =
                new KiemProperty(KIEM_PROPERTY_NAME_DEBUGTRANSFORMATIONS, KIEM_PROPERTY_DEFAULT_DEBUGTRANSFORMATIONS);
        properties[KIEM_PROPERTY_COMPILETRANSFORMATIONS] =
                new KiemProperty(KIEM_PROPERTY_NAME_COMPILETRANSFORMATIONS, KIEM_PROPERTY_DEFAULT_COMPILETRANSFORMATIONS);
        // properties[KIEM_PROPERTY_BENCHMARK] = new KiemProperty(KIEM_PROPERTY_NAME_BENCHMARK,
        // false);
        // properties[KIEM_PROPERTY_RUNTIMEDEBUGCONSOLE] = new KiemProperty(
        // KIEM_PROPERTY_NAME_RUNTIMEDEBUGCONSOLE, true);
        // properties[KIEM_PROPERTY_EXPOSELOCALSIGNALS] = new KiemProperty(
        // KIEM_PROPERTY_NAME_EXPOSELOCALSIGNALS, false);
        // String[] items = { KIEM_RUNTIME_SJ, KIEM_RUNTIME_SJL, KIEM_RUNTIME_SC, KIEM_RUNTIME_SCL
        // };
        // properties[KIEM_PROPERTY_RUNTIME] = new KiemProperty(KIEM_PROPERTY_NAME_RUNTIME,
        // new KiemPropertyTypeChoice(items), items[0]);
        return properties;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean checkModelValidation(final EObject rootEObject)
            throws KiemInitializationException {
        if (!(rootEObject instanceof State)) {
            throw new KiemInitializationException(
                    "SCCharts Simulator can only be used with a SCCharts editor.\n\n", true, null);
        }

        return true;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
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
        return false;
    }

    // -------------------------------------------------------------------------
    
    public String getDataComponentId() {
        return "de.cau.cs.kieler.sccharts.sim.c";
    }

    // -------------------------------------------------------------------------
    
    public void initialize() throws KiemInitializationException {
        computedTick = 1;
    }

    // -------------------------------------------------------------------------

    public void wrapup() throws KiemInitializationException {
        if (scExecution != null) {
            // Do not delete the executable, maybe it can be used again
            scExecution.stopExecution(false);
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
     * Gets the SC execution.
     * 
     * @return the sC execution
     */
    public SCExecution getSCExecution() {
        return scExecution;
    }

    // -------------------------------------------------------------------------
    
    /**
     * Gets the bundle path.
     *
     * @param subDirectory the sub directory
     * @return the bundle path
     */
    private String getBundlePath(String subDirectory) {
        Bundle bundle = Platform.getBundle(SCChartsSimCPlugin.PLUGIN_ID);

        URL url = null;
        try {
             url = FileLocator.toFileURL(FileLocator.find(bundle, new Path(subDirectory), null));
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        String bundleLocation = url.getFile();

        // Windows vs. Linux: Exchange possibly wrong slash/backslash
        bundleLocation = bundleLocation.replaceAll("[/\\\\]+", "\\" + File.separator);
        if (bundleLocation.startsWith("\\")) {
            bundleLocation = bundleLocation.substring(1);
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
        if (scExecution.isCompiled()) {
            try {
                scExecution.startExecution();
            } catch (IOException e) {
                throw new KiemInitializationException(
                        "SCCharts could not be started sucessfully.\n\n", true, e);
            }
        } else {
            throw new KiemInitializationException("SCCharts was not compiled sucessfully.\n\n",
                    true, null);
        }

        if (!scExecution.isStarted()) {
            throw new KiemInitializationException(
                    "Error running SCCharts. Compiled simulation does not exist.\n", true, null);
        }

        // Build the list of interface output signals
        outputSignalList = new LinkedList<String>();
        outputVariableList = new LinkedList<String>();

        JSONObject res = new JSONObject();
        try {
            if (myModel != null && kExpressionExtension.getValuedObjects(myModel) != null) {
                for (ValuedObject valuedObject : kExpressionExtension.getValuedObjects(myModel)) {
                    if (kExpressionExtension.isInput(valuedObject)) {
                        if (kExpressionExtension.isSignal(valuedObject)) {
                            res.accumulate(valuedObject.getName(), JSONSignalValues.newValue(false));
                        } else {
                            res.accumulate(valuedObject.getName(), JSONSignalValues.newValue(false));
                        }
                    }
                    if (kExpressionExtension.isOutput(valuedObject)) {
                        String signalName = valuedObject.getName();
                        if (signalName.startsWith(SCChartsSimCPlugin.AUXILIARY_VARIABLE_TAG_STATE)) {
                            outputStateList.add(signalName);
                        } else if (signalName.startsWith(SCChartsSimCPlugin.AUXILIARY_VARIABLE_TAG_TRANSITION)) {
                            outputTransitionList.add(signalName);
                        }
                        else {
                            if (kExpressionExtension.isSignal(valuedObject)) {
                                res.accumulate(signalName, JSONSignalValues.newValue(false));
                                outputSignalList.add(signalName);
                            } else {
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
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void doModel2ModelTransform(final ProgressMonitorAdapter monitor)
            throws KiemInitializationException {
        doModel2ModelTransform(monitor, (State) this.getModelRootElement(),
                this.getProperties()[KIEM_PROPERTY_FULLDEBUGMODE + KIEM_PROPERTY_DIFF]
                        .getValueAsBoolean());        
    }

    // -------------------------------------------------------------------------
    
    /**
     * {@inheritDoc}
     */
    public void doModel2ModelTransform(final ProgressMonitorAdapter monitor, final State model,
            final boolean debug) throws KiemInitializationException {
        this.myModel = model;
        monitor.begin("SCCharts Simulation", 1);

        String compile = "";
        try {

            if (this.myModel == null) {
                throw new KiemInitializationException(
                        "Cannot simulate active editor using the SCCharts Simulator", true, null);
            }

            if (this.getModelRootElement().eResource() == null) {
                throw new KiemInitializationException(
                        "The active editor has must be saved in order to simulate the SCChart."
                                + " Volatile resources cannot be simulated.", true, null);
            }

            // Make a copy of the S program in case it was from
            // an active Editor
            URI sOutput = URI.createURI("");
            URI scOutput = URI.createURI("");
                      
            // By default there is no additional transformation necessary
            Program transformedProgram = null;

            // Calculate output path for possible S-m2m
            String inputPathString = this.getModelFilePath().toString();
            URI input = URI.createPlatformResourceURI(inputPathString.replace("%20", " "), true);
            sOutput = URI.createURI(input.toString());

            String transformations = this.getProperties()[KIEM_PROPERTY_COMPILETRANSFORMATIONS + KIEM_PROPERTY_DIFF]
                    .getValue();
            
            // If 'Full Debug Mode' is turned on then the user also wants to have
            // states and transitions visualized.
            // Hence some pre-processing is needed and done by the
            // an addition model transformation
            if (debug) {
                transformations = this.getProperties()[KIEM_PROPERTY_DEBUGTRANSFORMATIONS + KIEM_PROPERTY_DIFF]
                        .getValue() + ", " + transformations;
            }

            // Compile the SCChart to C code
            CompilationResult compilationResult = KielerCompiler.compile(transformations, this.myModel, true, false);
            String cSCChart = compilationResult.getString();
            
            // Generate Simulation wrapper C code
            CSimulation transform = Guice.createInjector().getInstance(CSimulation.class);
            String cSimulation = transform.transform(this.myModel, "10000").toString();

            // Set a random output folder for the compiled files
            String outputFolder = KiemUtil.generateRandomTempOutputFolder();
            
            String fileNameSCChart = "scchart.c";
            String outputFileSCChart = outputFolder + fileNameSCChart;
            writeOutputModel(outputFileSCChart, cSCChart.getBytes());

            String fileNameSimulation = "simulation.c";
            String outputFileSimulation = outputFolder + fileNameSimulation;
            writeOutputModel(outputFileSimulation, cSimulation.getBytes());
            
            
            String includePath = getBundlePath("templates");
            System.out.println(includePath);
            // Compile
//            scExecution = new SCExecution(outputFolder, benchmark);
//            LinkedList<String> generatedSCFiles = new LinkedList<String>();
//            generatedSCFiles.add(scOutputString);
//            scExecution.setDebug(debugConsole);
//            scExecution.setScl(scl);
//            scExecution.compile(generatedSCFiles, modelName);
        } catch (RuntimeException e) {
            throw new KiemInitializationException("Error compiling S program:\n\n "
                    + e.getMessage() + "\n\n" + compile, true, e);
        } catch (IOException e) {
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
        String activeStatements = "";
        StringBuffer activeStatementsBuf = new StringBuffer();
        List<DebugData> activeStatementList = new LinkedList<DebugData>();

        if (scExecution == null || !scExecution.isStarted()) {
            throw new KiemExecutionException("No S simulation is running", true, null);
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

}
