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
package de.cau.cs.kieler.sccharts.sim.c;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.osgi.framework.Bundle;

import com.google.inject.Guice;

import de.cau.cs.kieler.circuit.Actor;

import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions;
import de.cau.cs.kieler.core.model.util.ProgressMonitorAdapter;
import de.cau.cs.kieler.kexpressions.ValuedObject;
import de.cau.cs.kieler.kico.CompilationResult;
import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.kico.KielerCompilerContext;
import de.cau.cs.kieler.kico.TransformationIntermediateResult;
import de.cau.cs.kieler.sc.CExecution;
import de.cau.cs.kieler.sccharts.SCChartsPlugin;
import de.cau.cs.kieler.sccharts.SCCharts;
import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.sccharts.sim.c.xtend.CSimulationSCChart;
import de.cau.cs.kieler.sccharts.sim.c.xtend.CSimulationSCG;
import de.cau.cs.kieler.scg.SCGraph;
import de.cau.cs.kieler.sim.benchmark.Benchmark;
import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
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
//    private long computedTick = 1;

    /** The dirty indicator is used to notice editor changes and set the dirty flag accordingly. */
    private int dirtyIndicator = 0;

    private static final int KIEM_PROPERTY_MAX = 9;

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
    private static final int KIEM_PROPERTY_FULLDEBUGMODE = 4;

    /** The Constant KIEM_PROPERTY_NAME_FULLDEBUGMODE. */
    private static final String KIEM_PROPERTY_NAME_FULLDEBUGMODE = "Full Debug Mode";

    /** The Constant KIEM_PROPERTY_NAME_BENCHMARK. */
    private static final String KIEM_PROPERTY_NAME_BENCHMARK = "Benchmark Mode";

    /** The Constant KIEM_PROPERTY_BENCHMARK. */
    private static final int KIEM_PROPERTY_BENCHMARK = 3;

    /** The Constant KIEM_PROPERTY_DEFAULT_BENCHMARK. */
    private static final boolean KIEM_PROPERTY_DEFAULT_BENCHMARK = false;

    /** The Constant KIEM_PROPERTY_DEBUGTRANSFORMATIONS. */
    private static final int KIEM_PROPERTY_DEBUGTRANSFORMATIONS = 5;
    /** The Constant KIEM_PROPERTY_NAME_DEBUGTRANSFORMATIONS. */
    private static final String KIEM_PROPERTY_NAME_DEBUGTRANSFORMATIONS = "Debug Transformations";
    /** The Constant KIEM_PROPERTY_DEFAULT_DEBUGTRANSFORMATIONSS. */
    private static final String KIEM_PROPERTY_DEFAULT_DEBUGTRANSFORMATIONS =
            "T_SIMULATIONVISUALIZATION";

    /** The Constant KIEM_PROPERTY_HIGHLEVELTRANSFORMATIONS. */
    private static final int KIEM_PROPERTY_HIGHLEVELTRANSFORMATIONS = 6;
    /** The Constant KIEM_PROPERTY_NAME_HIGHLEVELTRANSFORMATIONS. */
    private static final String KIEM_PROPERTY_NAME_HIGHLEVELTRANSFORMATIONS =
            "High Level Transformations";
    /** The Constant KIEM_PROPERTY_DEFAULT_COMPILETRANSFORMATIONS. */
    private static final String KIEM_PROPERTY_DEFAULT_HIGHLEVELTRANSFORMATIONS = "CORE, T_ABORT";

    /** The Constant KIEM_PROPERTY_LOWLEVELTRANSFORMATIONS. */
    private static final int KIEM_PROPERTY_LOWLEVELTRANSFORMATIONS = 7;
    /** The Constant KIEM_PROPERTY_NAME_LOWLEVELTRANSFORMATIONS. */
    private static final String KIEM_PROPERTY_NAME_LOWLEVELTRANSFORMATIONS =
            "Low Level Transformations";
    /** The Constant KIEM_PROPERTY_DEFAULT_COMPILETRANSFORMATIONS. */
    private static final String KIEM_PROPERTY_DEFAULT_LOWLEVELTRANSFORMATIONS = "codegeneration, T_sccharts.scg, T_s.c";
    
    private static final int KIEM_PROPERTY_ALLVARS = 8;
    private static final String KIEM_PROPERTY_NAME_ALLVARS = "Expose ALL Variables";
    private static final boolean KIEM_PROPERTY_DEFAULT_ALLVARS = false;    

    /** The benchmark flag for generating cycle and file size signals. */
    private boolean benchmark = false;

    /** The source file size. */
    private long sourceFileSize = 0;

    /** The executabe file size. */
    private long executabeFileSize = 0;

    /** The compile time for benchmark. */
    private long compileTime = 0;
    
    /** The C execution object for concurrent execution. */
    private CExecution cExecution = null;

    /** The list of output signals. */
    private LinkedList<String> outputSignalList = null;

    /** The list of output signals. */
    private LinkedList<String> outputVariableList = null;

    /** The list of output states used for the visualization. */
    private LinkedList<String> outputStateList = null;

    /** The list of output transitions used for the visualization. */
    private LinkedList<String> outputTransitionList = null;

    /** The SSCharts State / SCG is the considered model to simulate. */
    private EObject myModel = null;

    /** The single s / kexpression extension. */
//    private static SExtension sExtension = new SExtension();
    private static KExpressionsValuedObjectExtensions kExpressionValuedObjectExtensions = new KExpressionsValuedObjectExtensions();

    // -------------------------------------------------------------------------

    public SCChartsCDataComponent() {
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
        properties[KIEM_PROPERTY_BENCHMARK] =
                new KiemProperty(KIEM_PROPERTY_NAME_BENCHMARK, KIEM_PROPERTY_DEFAULT_BENCHMARK);
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
        properties[KIEM_PROPERTY_ALLVARS] =
                new KiemProperty(KIEM_PROPERTY_NAME_ALLVARS, KIEM_PROPERTY_DEFAULT_ALLVARS);
        
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
        if (!(rootEObject instanceof State) && !(rootEObject instanceof SCGraph)
                && !(rootEObject instanceof SCCharts)) {
            throw new KiemInitializationException(
                    "SCCharts Simulator can only be used with a SCCharts editor.\n\n", true, null);
        }
        Diagnostic diagnostic = Diagnostician.INSTANCE.validate(rootEObject);
        if (diagnostic.getSeverity() ==  Diagnostic.ERROR) {
              throw new KiemInitializationException(
                      "The source model contains error markers.\n\n", true, null);
        }         
        Resource r = rootEObject.eResource();
        if (r != null) {
            if (r.getErrors().size() > 0) {
                throw new KiemInitializationException(
                       "The source model contains error markers.\n\n", true, null);
            }
        }

        return true;
    }

    // -------------------------------------------------------------------------
    
    boolean isDirtyOnError = false;

    /**
     * {@inheritDoc}
     */
    public boolean isDirty() {
        // For the release, always re-compile!
        return true;
//        if (isDirtyOnError) {
//            return true;
//        }
//        // Calculate a dirty indicator from ALL model elements and their textual representation's
//        // hash code.
//        int newDirtyIndicator = 0;
//        TreeIterator<?> treeIterator = super.getModelRootElement().eAllContents();
//        while (treeIterator.hasNext()) {
//            Object obj = treeIterator.next();
//            newDirtyIndicator += obj.toString().hashCode();
//        }
//        // Also consider KIEM properties (may have changes and require new code generation)
//        for (int i = 0; i < KIEM_PROPERTY_MAX + KIEM_PROPERTY_DIFF; i++) {
//            newDirtyIndicator += this.getProperties()[i].getValue().hashCode();
//        }
//        if (newDirtyIndicator != dirtyIndicator) {
//            dirtyIndicator = newDirtyIndicator;
//            return true;
//        }
//        // We conclude at this point that we are not dirty on the level of
//        // changes to the diagram
//        return false || (cExecution == null);
    }

    
    public void setDirty(boolean isDirty) {
        isDirtyOnError = isDirty;
    }
    
    // -------------------------------------------------------------------------

    public String getDataComponentId() {
        return "de.cau.cs.kieler.sccharts.sim.c";
    }

    // -------------------------------------------------------------------------

    public void initialize() throws KiemInitializationException {
//        computedTick = 1;
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
        Bundle bundle = Platform.getBundle(SCChartsSimCPlugin.PLUGIN_ID);

        URL url = null;
        String bundleLocation = null;
      try {
            url = FileLocator.toFileURL(FileLocator.find(bundle, new Path(subDirectory), null));
            IPath bla = new Path(url.getPath());
//            bla.makeAbsolute();
            bundleLocation = bla.toOSString();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
//        String bundleLocation = url.getFile();

//        // Windows vs. Linux: Exchange possibly wrong slash/backslash
//        bundleLocation = bundleLocation.replaceAll("[/\\\\]+", "\\" + File.separator);
//        if (bundleLocation.startsWith("\\")) {
//            bundleLocation = bundleLocation.substring(1);
//        }
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
                        "SCChart could not be started sucessfully.\n\n", true, e);
            }
        } else {
            throw new KiemInitializationException("SCChart was not compiled sucessfully.\n\n",
                    true, null);
        }

        if (!cExecution.isStarted()) {
            throw new KiemInitializationException(
                    "Error running SCChart. Compiled simulation does not exist.\n", true, null);
        }

        // Build the list of interface output signals
        outputSignalList = new LinkedList<String>();
        outputVariableList = new LinkedList<String>();

        JSONObject res = new JSONObject();
        try {
            EObject model = myModel;
            if (myModel instanceof SCCharts) {
                model = ((SCCharts) myModel).getRootStates().get(0);
            }
            
            if (model != null && kExpressionValuedObjectExtensions.getValuedObjectsFromEObject(model) != null) {
                for (ValuedObject valuedObject : kExpressionValuedObjectExtensions.getValuedObjectsFromEObject(model)) {
                    if (kExpressionValuedObjectExtensions.isInput(valuedObject)) {
                        if (kExpressionValuedObjectExtensions.isSignal(valuedObject)) {
                            res.accumulate(valuedObject.getName(), JSONSignalValues.newValue(false));
                        } else {
                            res.accumulate(valuedObject.getName(), JSONSignalValues.newValue(false));
                        }
                    }
                    if (kExpressionValuedObjectExtensions.isOutput(valuedObject)) {
                        String signalName = valuedObject.getName();
                        if (signalName.startsWith(SCChartsPlugin.AUXILIARY_VARIABLE_TAG_STATE)) {
                            outputStateList.add(signalName);
                        } else if (signalName
                                .startsWith(SCChartsPlugin.AUXILIARY_VARIABLE_TAG_TRANSITION)) {
                            outputTransitionList.add(signalName);
                        } else {
                            if (kExpressionValuedObjectExtensions.isSignal(valuedObject)) {
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

//        SCChartsSimCPlugin.log("1");
        this.myModel = model;
        monitor.begin("SCCharts Simulation", 1);
//        SCChartsSimCPlugin.log("2");

        String compile = "";
        try {

//            SCChartsSimCPlugin.log("3");
            if (this.myModel == null) {
                throw new KiemInitializationException(
                        "\nCannot simulate active editor using the SCCharts Simulator.", true, null);
            }
            

            // skip for circuit or SCG models which we handle as a special case anyway...
            if ((myModel instanceof State)) {
                Resource eResource = model.eResource();
                boolean modelHasErrorMarkers = false;
                if (eResource != null) {
                    modelHasErrorMarkers = !eResource.getErrors().isEmpty();
                }
                if (modelHasErrorMarkers) {
                    throw new KiemInitializationException(
                            "\nThe source model contains error markers.", true, null);
                }
                Diagnostic diagnostic = Diagnostician.INSTANCE.validate(model);
                if (diagnostic.getSeverity() ==  Diagnostic.ERROR) {
                      throw new KiemInitializationException(
                              "The source model contains error markers.\n\n", true, null);
                }         
            }

//            SCChartsSimCPlugin.log("4");

            // if (this.getModelRootElement().eResource() == null) {
            // throw new KiemInitializationException(
            // "The active editor has must be saved in order to simulate the SCChart."
            // + " Volatile resources cannot be simulated.", true, null);
            // }
//            SCChartsSimCPlugin.log("5");

            // Make a copy of the S program in case it was from
            // an active Editor
//            URI sOutput = URI.createURI("");
//            URI scOutput = URI.createURI("");

            // By default there is no additional transformation necessary
//            Program transformedProgram = null;

            // Calculate output path for possible S-m2m
//            String inputPathString = this.getModelFilePath().toString();
//            SCChartsSimCPlugin.log("6 " + inputPathString);
//            URI input = URI.createPlatformResourceURI(inputPathString.replace("%20", " "), true);
//            sOutput = URI.createURI(input.toString());

            String highLevelTransformations =
                    this.getProperties()[KIEM_PROPERTY_HIGHLEVELTRANSFORMATIONS
                            + KIEM_PROPERTY_DIFF].getValue();
            String lowLevelTransformations =
                    this.getProperties()[KIEM_PROPERTY_LOWLEVELTRANSFORMATIONS + KIEM_PROPERTY_DIFF]
                            .getValue();
//            SCChartsSimCPlugin.log("7");

            // If 'Full Debug Mode' is turned on then the user also wants to have
            // states and transitions visualized.
            // Hence some pre-processing is needed and done by the
            // an addition model transformation
            String debugTransformations =
                    this.getProperties()[KIEM_PROPERTY_DEBUGTRANSFORMATIONS + KIEM_PROPERTY_DIFF]
                            .getValue();
//            SCChartsSimCPlugin.log("8");

            // Compile the SCChart to C code
            EObject extendedSCChart = this.myModel;
//            SCChartsSimCPlugin.log("9");


            if (this.myModel instanceof Actor) {
                // In case we want to simulate a circuit, first re-compile the model
                // but just up to SSA-SCG.
                HashMap<IPath, EObject> map = KiemPlugin.getOpenedModelRootObjects();
                // TODO adapt for kicool
//                if (map.containsKey(new Path(KiCoKlighdPlugin.SOURCE_MODEL_ID))) {
//                    EObject sourceModel = (EObject)map.get(new Path(KiCoKlighdPlugin.SOURCE_MODEL_ID));
                        EObject sourceModel = null;
                    
                    // Compile to SSA_SCG
                    
                    // Do a PRE compilation with the debugTransformations!
                    KielerCompilerContext highLevelContext =
                            new KielerCompilerContext("scg.seqssa", sourceModel);
                    // Create a dummy resource ONLY for debug visualization, where we need FragmentURIs
                    highLevelContext.setCreateDummyResource(true);

                    highLevelContext.setInplace(false);
                    highLevelContext.setAdvancedSelect(true);
//                    SCChartsSimCPlugin.log("10");
                    CompilationResult highLeveleCompilationResult =
                            KielerCompiler.compile(highLevelContext);
                    
                    
                    //extendedSCChart = sourceModel;
                    myModel = sourceModel;
                    extendedSCChart = highLeveleCompilationResult.getEObject();
                }
//            }


            if (isExposeAllVars()) {
                // Do a PRE compilation with the debugTransformations!
                KielerCompilerContext highLevelContext =
                        new KielerCompilerContext("EXPOSELOCALVALUEDOBJECT", extendedSCChart);
                // Create a dummy resource ONLY for debug visualization, where we need FragmentURIs
                highLevelContext.setCreateDummyResource(true);

                highLevelContext.setInplace(false);
                highLevelContext.setAdvancedSelect(true);
                // System.out.println("10");
                CompilationResult highLeveleCompilationResult =
                        KielerCompiler.compile(highLevelContext);

                extendedSCChart = highLeveleCompilationResult.getEObject();

                // re-link myModel such that the additional outputs are shown
                this.myModel = extendedSCChart;

                // highLevelTransformations = debugTransformations + ", " +
                // highLevelTransformations;
            }            


            if (debug) {
                
                // Do a PRE compilation with the debugTransformations!
                KielerCompilerContext highLevelContext =
                        new KielerCompilerContext(debugTransformations, extendedSCChart);
                // Create a dummy resource ONLY for debug visualization, where we need FragmentURIs
                highLevelContext.setCreateDummyResource(true);

                highLevelContext.setInplace(false);
                highLevelContext.setAdvancedSelect(true);
//                SCChartsSimCPlugin.log("10");
                CompilationResult highLeveleCompilationResult =
                        KielerCompiler.compile(highLevelContext);
                
                extendedSCChart = highLeveleCompilationResult.getEObject();

//                highLevelTransformations = debugTransformations + ", " + highLevelTransformations;
            }
            
            
            if (isExposeAllVars()) {
                highLevelTransformations += ", scg.sequentialize";
            }
            
            KielerCompilerContext highLevelContext =
                    new KielerCompilerContext(highLevelTransformations, extendedSCChart);

            // Create a dummy resource ONLY for debug visualization, where we need FragmentURIs
            highLevelContext.setCreateDummyResource(false);

            highLevelContext.setInplace(false);
            highLevelContext.setAdvancedSelect(true);
//            SCChartsSimCPlugin.log("10");
            CompilationResult highLeveleCompilationResult =
                    KielerCompiler.compile(highLevelContext);
//            SCChartsSimCPlugin.log("11");
            
            
            // reset compile time and accumulate
            compileTime = 0;

            // The following should be a state or an SCG
            EObject stateOrSCG = highLeveleCompilationResult.getEObject();
            if (!((stateOrSCG instanceof State) || (stateOrSCG instanceof SCGraph)
                    || (stateOrSCG instanceof SCCharts))) {
                // compilation failed
                throw new KiemInitializationException(
                        "Error compiling the SCChart (high-level synthesis). Try compiling it manually step-by-step using the KiCo compiler selection view:" + highLeveleCompilationResult.getAllErrors(),
                        true, null);
            }
            
            String errors = highLeveleCompilationResult.getAllErrors();
            if (errors != null && errors.length() > 0) {
                if (errors.length() > 200) {errors = errors.substring(0, 199) + "...";};
                throw new KiemInitializationException(
                        "\n" + errors,
                        true, null);
            }
            String warnings = highLeveleCompilationResult.getAllWarnings();
            if (warnings != null && warnings.length() > 0) {
                if (warnings.length() > 200) {warnings = warnings.substring(0, 199) + "...";};
                throw new KiemInitializationException(
                        "\n" + warnings,
                        false, null);
            }  
            
            // accumulate compile time
            for (TransformationIntermediateResult intermediateResult : highLeveleCompilationResult.getTransformationIntermediateResults()) {
                compileTime += intermediateResult.getDuration();
            }
            
            // String coreSSChartText = KiCoUtil.serialize(coreSCChart, highLevelContext, false);
            // writeOutputModel("D:\\sschart.sct", coreSSChartText.getBytes());
            // SCChartsSimCPlugin.log(coreSSChartText);

            KielerCompilerContext lowLevelContext =
                    new KielerCompilerContext(lowLevelTransformations, stateOrSCG);
            lowLevelContext.setCreateDummyResource(true);
            lowLevelContext.setInplace(false);
            lowLevelContext.setAdvancedSelect(true);
//            SCChartsSimCPlugin.log("12");
            CompilationResult lowLevelCompilationResult = KielerCompiler.compile(lowLevelContext);
//            SCChartsSimCPlugin.log("13");
            
            errors = lowLevelCompilationResult.getAllErrors();
            warnings = lowLevelCompilationResult.getAllWarnings();
            if (errors != null && errors.length() > 0) {
                if (errors.length() > 200) {errors = errors.substring(0, 199) + "...";};
                throw new KiemInitializationException(
                        "\n" + errors,
                        true, null);
            }
            else if (warnings != null && warnings.length() > 0) {
                if (warnings.length() > 200) {warnings = warnings.substring(0, 199) + "...";};
                throw new KiemInitializationException(
                        "\n" + warnings,
                        false, null);
            }            

            String cSCChartCCode = lowLevelCompilationResult.getString();
//            SCChartsSimCPlugin.log("14 " + cSCChartCCode);
            if (cSCChartCCode == null) {
                // compilation failed
                throw new KiemInitializationException(
                        "Error compiling the SCChart (low-level synthesis). Try compiling it manually step-by-step using the KiCo compiler selection view:" + lowLevelCompilationResult.getAllErrors(),
                        true, null);
            }

            // accumulate compile time
            for (TransformationIntermediateResult intermediateResult : lowLevelCompilationResult.getTransformationIntermediateResults()) {
                compileTime += intermediateResult.getDuration();
            }
            
            // Generate Simulation wrapper C code
            String cSimulation = "";
            if (stateOrSCG instanceof State) {
//                SCChartsSimCPlugin.log("15");
                CSimulationSCChart cSimulationSCChart =
                        Guice.createInjector().getInstance(CSimulationSCChart.class);
//                SCChartsSimCPlugin.log("16");
                cSimulation = cSimulationSCChart.transform((State) stateOrSCG, "10000").toString();
            } else if (stateOrSCG instanceof SCCharts) {
                CSimulationSCChart cSimulationSCChart =
                        Guice.createInjector().getInstance(CSimulationSCChart.class);
                cSimulation = cSimulationSCChart.transform(((SCCharts) stateOrSCG).getRootStates().get(0), "10000").toString();
            } else if (stateOrSCG instanceof SCGraph) {
//                SCChartsSimCPlugin.log("15");
                CSimulationSCG cSimulationSCG =
                        Guice.createInjector().getInstance(CSimulationSCG.class);
//                SCChartsSimCPlugin.log("16");
                cSimulation = cSimulationSCG.transform((SCGraph) stateOrSCG, "10000").toString();
            }
//            SCChartsSimCPlugin.log("17 " + cSimulation);
            
            if (benchmark) {
                cSimulation = Benchmark.addTimingCode(cSimulation, "tick");
            }

            // Set a random output folder for the compiled files
            @SuppressWarnings("deprecation")
            String outputFolder = KiemUtil.generateRandomTempOutputFolder();
//            SCChartsSimCPlugin.log("18 " + outputFolder);

            String fileNameSCChart = "scchart.c";
            String outputFileSCChart = outputFolder + fileNameSCChart;
//            SCChartsSimCPlugin.log("19 " + outputFileSCChart);
            writeOutputModel(outputFileSCChart, cSCChartCCode.getBytes());

            String fileNameSimulation = "simulation.c";
            String outputFileSimulation = outputFolder + fileNameSimulation;
//            SCChartsSimCPlugin.log("20 " + outputFileSimulation);
            writeOutputModel(outputFileSimulation, cSimulation.getBytes());

            String includePath = getBundlePath("templates");
//            SCChartsSimCPlugin.log("21 " + includePath);
//            SCChartsSimCPlugin.log(includePath);
            // Compile
            cExecution = new CExecution(outputFolder, benchmark);
            LinkedList<String> generatedSCFiles = new LinkedList<String>();
            generatedSCFiles.add(outputFileSimulation);
            // generatedSCFiles.add(outputFileSCChart);
            generatedSCFiles.add("-I " + includePath);
            String modelName = "SCG";
            if (myModel instanceof State) {
                modelName = ((State) myModel).getName();
            }
            cExecution.compile(generatedSCFiles, modelName, outputFileSCChart);
        } catch (RuntimeException e) {
            throw new KiemInitializationException("Error compiling C program:\n\n "
                    + e.getMessage() + "\n\n" + compile, true, e);
        } catch (IOException e) {
            throw new KiemInitializationException("Error compiling C program:\n\n "
                    + e.getMessage() + "\n\n" + compile, true, e);
        } catch (InterruptedException e) {
            throw new KiemInitializationException("Error compiling C program:\n\n "
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

//        boolean debugConsole = false;

        // Collect active statements
        StringBuffer activeStatesBuf = new StringBuffer();
        StringBuffer activeTransitionsBuf = new StringBuffer();
        // List<DebugData> activeStatesList = new LinkedList<DebugData>();

        if (cExecution == null || !cExecution.isStarted()) {
            throw new KiemExecutionException("No S simulation is running", true, null);
        }
        
        if (benchmark) {
            sourceFileSize = cExecution.getSourceFileSize();
            executabeFileSize = cExecution.getExecutableFileSize();
        }

        try {
            String out = jSONObject.toString();
//            SCChartsSimCPlugin.log("> " + out);
            cExecution.getInterfaceToExecution().write(out + "\n");
            cExecution.getInterfaceToExecution().flush();
            while (cExecution.getInterfaceError().ready()) {
                // Error output, if any
                SCChartsSimCPlugin.logError("ERROR: "  + cExecution.getInterfaceError().read());
            }

            String receivedMessage = cExecution.getInterfaceFromExecution().readLine();

//            SCChartsSimCPlugin.log("< " + receivedMessage);
            // if (debugConsole) {
            // printConsole("==============| TICK " + computedTick++ + " |==============");
            // while (!receivedMessage.startsWith("{\"")) {
            // printConsole(receivedMessage);
            // receivedMessage = scExecution.getInterfaceFromExecution().readLine();
            // }
            // printConsole("\n");
            // }

            if (receivedMessage != null) {
                JSONObject output = new JSONObject(receivedMessage);
                JSONArray outputArray = output.names();

                if (outputArray != null) {
                    // First add auxiliary signals
                    for (int i = 0; i < outputArray.length(); i++) {
                        String outputName = outputArray.getString(i);

                        if (output.get(outputName) instanceof JSONObject) {

                            JSONObject valuedObject = output.getJSONObject(outputName);
                            Object value = ((JSONObject) valuedObject).get("value");

                            boolean present = false;
                            if (value instanceof Boolean) {
                                present = (Boolean) value;
                            } else if (value instanceof Integer) {
                                present = ((Integer) value) != 0;
                            }

                            if (outputName
                                    .startsWith(SCChartsPlugin.AUXILIARY_VARIABLE_TAG_STATE)) {
                                if (present) {
                                    if (activeStatesBuf.length() > 0) {
                                        activeStatesBuf.append(",");
                                    }
                                    String activeStateName =
                                            outputName
                                                    .substring(SCChartsPlugin.AUXILIARY_VARIABLE_TAG_STATE
                                                            .length());
                                    activeStatesBuf.append(activeStateName);
                                }
                            } else if (outputName
                                    .startsWith(SCChartsPlugin.AUXILIARY_VARIABLE_TAG_TRANSITION)) {
                                if (present) {
                                    if (activeTransitionsBuf.length() > 0) {
                                        activeTransitionsBuf.append(",");
                                    }
                                    String activeTransitionName =
                                            outputName
                                                    .substring(SCChartsPlugin.AUXILIARY_VARIABLE_TAG_TRANSITION
                                                            .length());
                                    activeTransitionsBuf.append(activeTransitionName);
                                }
                            } else {
                                returnObj.accumulate(outputName,
                                        JSONSignalValues.newValue(value, present));
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
            }

            // Add benchmark information
            if (this.benchmark) {
                returnObj.accumulate(Benchmark.BENCHMARK_SIGNAL_SOURCE, sourceFileSize);
                returnObj.accumulate(Benchmark.BENCHMARK_SIGNAL_EXECUTABLE, executabeFileSize);
                returnObj.accumulate(Benchmark.BENCHMARK_SIGNAL_COMPILETIME, compileTime);
            }
            
            // Finally accumulate all active Statements (activeStatements)
            // under the statementName
            String activeStates = "";
            String activeTransitions = "";
            activeStates = activeStatesBuf.toString();
            activeTransitions = activeTransitionsBuf.toString();

            String activeStatesName =
                    this.getProperties()[KIEM_PROPERTY_STATENAME + KIEM_PROPERTY_DIFF].getValue();
            String activeTransitionsName =
                    this.getProperties()[KIEM_PROPERTY_TRANSITIONNAME + KIEM_PROPERTY_DIFF]
                            .getValue();
            returnObj.accumulate(activeStatesName, activeStates);
            returnObj.accumulate(activeTransitionsName, activeTransitions);

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


    // -------------------------------------------------------------------------


    public List<String> getOutputNames() {
        List<String> allOutputs = new ArrayList<String>();
        allOutputs.addAll(outputSignalList);
        allOutputs.addAll(outputVariableList);
        return allOutputs;
        
    }


    // -------------------------------------------------------------------------

    /**
     * Checks if is expose all vars flag is turned on.
     *
     * @return true, if is expose all vars
     */
    public boolean isExposeAllVars() {
        return this.getProperties()[KIEM_PROPERTY_ALLVARS
                             + KIEM_PROPERTY_DIFF].getValueAsBoolean();
    }

    // -------------------------------------------------------------------------

}
