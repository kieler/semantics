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
package de.cau.cs.kieler.sccharts.sim.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.ui.IEditorSite;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.osgi.framework.Bundle;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.inject.Guice;

import de.cau.cs.kieler.circuit.Actor;
import de.cau.cs.kieler.kexpressions.ValuedObject;
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions;
import de.cau.cs.kieler.core.model.util.ProgressMonitorAdapter;
import de.cau.cs.kieler.kico.CompilationResult;
import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.kico.KielerCompilerContext;
import de.cau.cs.kieler.kico.TransformationIntermediateResult;
import de.cau.cs.kieler.kico.internal.KiCoUtil;
import de.cau.cs.kieler.kico.klighd.KiCoKlighdPlugin;
import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.sccharts.sim.java.xtend.JavaSimulationSCChart;
import de.cau.cs.kieler.sccharts.sim.java.xtend.JavaSimulationSCG;
import de.cau.cs.kieler.sccharts.transformations.Signal;
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
public class SCChartsJavaDataComponent extends JSONObjectSimulationDataComponent
        implements IJSONObjectDataComponent {
    /** A separate tick counter that is computed for the SC debug console as a reference. */
    // private long computedTick = 1;

    /** The dirty indicator is used to notice editor changes and set the dirty flag accordingly. */
    private int dirtyIndicator = 0;

    private static final int KIEM_PROPERTY_MAX = 8;

    private static final int KIEM_PROPERTY_STATENAME = 0;
    private static final String KIEM_PROPERTY_NAME_STATENAME = "State Name";
    private static final int KIEM_PROPERTY_TRANSITIONNAME = 1;
    private static final String KIEM_PROPERTY_NAME_TRANSITIONNAME = "Transition Name";

    /** The Constant KIEM_PROPERTY_FULLDEBUGMODE. */
    private static final int KIEM_PROPERTY_FULLDEBUGMODE = 3;

    /** The Constant KIEM_PROPERTY_NAME_FULLDEBUGMODE. */
    private static final String KIEM_PROPERTY_NAME_FULLDEBUGMODE = "Full Debug Mode";

    /** The Constant KIEM_PROPERTY_NAME_BENCHMARK. */
    private static final String KIEM_PROPERTY_NAME_BENCHMARK = "Benchmark Mode";

    /** The Constant KIEM_PROPERTY_BENCHMARK. */
    private static final int KIEM_PROPERTY_BENCHMARK = 2;

    /** The Constant KIEM_PROPERTY_DEFAULT_BENCHMARK. */
    private static final boolean KIEM_PROPERTY_DEFAULT_BENCHMARK = false;

    /** The Constant KIEM_PROPERTY_DEBUGTRANSFORMATIONS. */
    private static final int KIEM_PROPERTY_DEBUGTRANSFORMATIONS = 4;
    /** The Constant KIEM_PROPERTY_NAME_DEBUGTRANSFORMATIONS. */
    private static final String KIEM_PROPERTY_NAME_DEBUGTRANSFORMATIONS = "Debug Transformations";
    /** The Constant KIEM_PROPERTY_DEFAULT_DEBUGTRANSFORMATIONSS. */
    private static final String KIEM_PROPERTY_DEFAULT_DEBUGTRANSFORMATIONS =
            "T_SIMULATIONVISUALIZATION";

    /** The Constant KIEM_PROPERTY_HIGHLEVELTRANSFORMATIONS. */
    private static final int KIEM_PROPERTY_HIGHLEVELTRANSFORMATIONS = 5;
    /** The Constant KIEM_PROPERTY_NAME_HIGHLEVELTRANSFORMATIONS. */
    private static final String KIEM_PROPERTY_NAME_HIGHLEVELTRANSFORMATIONS =
            "High Level Transformations";
    /** The Constant KIEM_PROPERTY_DEFAULT_COMPILETRANSFORMATIONS. */
    private static final String KIEM_PROPERTY_DEFAULT_HIGHLEVELTRANSFORMATIONS = "CORE, T_ABORT";

    /** The Constant KIEM_PROPERTY_LOWLEVELTRANSFORMATIONS. */
    private static final int KIEM_PROPERTY_LOWLEVELTRANSFORMATIONS = 6;
    /** The Constant KIEM_PROPERTY_NAME_LOWLEVELTRANSFORMATIONS. */
    private static final String KIEM_PROPERTY_NAME_LOWLEVELTRANSFORMATIONS =
            "Low Level Transformations";
    /** The Constant KIEM_PROPERTY_DEFAULT_COMPILETRANSFORMATIONS. */
    private static final String KIEM_PROPERTY_DEFAULT_LOWLEVELTRANSFORMATIONS =
            "codegeneration, T_sccharts.scg, T_s.java";
    
    private static final int KIEM_PROPERTY_ALLVARS = 7;
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
    private JavaExecution javaExecution = null;

    /** The list of output signals. */
    private LinkedList<String> inputVariableList = null;

    /** The list of output signals. */
    private LinkedList<String> outputVariableList = null;

    /** The list of output states used for the visualization. */
    private LinkedList<String> outputStateList = null;

    /** The list of output transitions used for the visualization. */
    private LinkedList<String> outputTransitionList = null;

    /** The SSCharts State / SCG is the considered model to simulate. */
    private EObject myModel = null;

    /** The SSCharts State / SCG is the considered model to simulate. */
    private EObject simulatedModel = null;

    /** The single s / kexpression extension. */
    // private static SExtension sExtension = new SExtension();
    private static KExpressionsValuedObjectExtensions kExpressionValuedObjectExtensions =
            new KExpressionsValuedObjectExtensions();

    // -------------------------------------------------------------------------

    public SCChartsJavaDataComponent() {
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
     * Checks if is expose all vars flag is turned on.
     *
     * @return true, if is expose all vars
     */
    public boolean isExposeAllVars() {
        return this.getProperties()[KIEM_PROPERTY_ALLVARS
                             + KIEM_PROPERTY_DIFF].getValueAsBoolean();
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean checkModelValidation(final EObject rootEObject)
            throws KiemInitializationException {
        if (!(rootEObject instanceof State) && !(rootEObject instanceof SCGraph)) {
            throw new KiemInitializationException(
                    "SCCharts Simulator can only be used with a SCCharts editor.\n\n", true, null);
        }
        Diagnostic diagnostic = Diagnostician.INSTANCE.validate(rootEObject);
        if (diagnostic.getSeverity() == Diagnostic.ERROR) {
            throw new KiemInitializationException("The source model contains error markers.\n\n",
                    true, null);
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
        // if (isDirtyOnError) {
        // return true;
        // }
        // // Calculate a dirty indicator from ALL model elements and their textual representation's
        // // hash code.
        // int newDirtyIndicator = 0;
        // TreeIterator<?> treeIterator = super.getModelRootElement().eAllContents();
        // while (treeIterator.hasNext()) {
        // Object obj = treeIterator.next();
        // newDirtyIndicator += obj.toString().hashCode();
        // }
        // // Also consider KIEM properties (may have changes and require new code generation)
        // for (int i = 0; i < KIEM_PROPERTY_MAX + KIEM_PROPERTY_DIFF; i++) {
        // newDirtyIndicator += this.getProperties()[i].getValue().hashCode();
        // }
        // if (newDirtyIndicator != dirtyIndicator) {
        // dirtyIndicator = newDirtyIndicator;
        // return true;
        // }
        // // We conclude at this point that we are not dirty on the level of
        // // changes to the diagram
        // return false || (cExecution == null);
    }

    public void setDirty(boolean isDirty) {
        isDirtyOnError = isDirty;
    }

    // -------------------------------------------------------------------------

    public String getDataComponentId() {
        return "de.cau.cs.kieler.sccharts.sim.java";
    }

    // -------------------------------------------------------------------------

    public void initialize() throws KiemInitializationException {
        // computedTick = 1;
    }

    // -------------------------------------------------------------------------

    public void wrapup() throws KiemInitializationException {
        if (javaExecution != null) {
            // Do not delete the executable, maybe it can be used again
            javaExecution.stopExecution(false);
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
     * Gets the Java execution.
     * 
     * @return the Java execution
     */
    public JavaExecution getCExecution() {
        return javaExecution;
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
        Bundle bundle = Platform.getBundle(SCChartsSimJavaPlugin.PLUGIN_ID);

        URL url = null;
        String bundleLocation = null;
        try {
            url = FileLocator.toFileURL(FileLocator.find(bundle, new Path(subDirectory), null));
            IPath bla = new Path(url.getPath());
            // bla.makeAbsolute();
            bundleLocation = bla.toOSString();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        // String bundleLocation = url.getFile();

        // // Windows vs. Linux: Exchange possibly wrong slash/backslash
        // bundleLocation = bundleLocation.replaceAll("[/\\\\]+", "\\" + File.separator);
        // if (bundleLocation.startsWith("\\")) {
        // bundleLocation = bundleLocation.substring(1);
        // }
        return bundleLocation;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public JSONObject doProvideInitialVariables() throws KiemInitializationException {
        // start execution of compiled program
        if (javaExecution != null && javaExecution.isCompiled()) {
            try {
                javaExecution.startExecution();
            } catch (IOException e) {
                throw new KiemInitializationException(
                        "SCChart could not be started sucessfully.\n\n", true, e);
            }
        } else {
            throw new KiemInitializationException("SCChart was not compiled sucessfully.\n\n", true,
                    null);
        }

        if (!javaExecution.isStarted()) {
            throw new KiemInitializationException(
                    "Error running SCChart. Compiled simulation does not exist.\n", true, null);
        }

        // Build the list of interface output signals
        inputVariableList = new LinkedList<String>();
        outputVariableList = new LinkedList<String>();

        JSONObject res = new JSONObject();
        try {
            if (myModel != null && Iterators.any(myModel.eAllContents(), Predicates.instanceOf(ValuedObject.class))) {
                Iterator<ValuedObject> vos = Iterators.filter(myModel.eAllContents(), ValuedObject.class);
                while (vos.hasNext()) {
                    ValuedObject valuedObject = vos.next();
                    if (kExpressionValuedObjectExtensions.isInput(valuedObject)) {
                        String valuedObjectName = valuedObject.getName();
                        inputVariableList.add(valuedObjectName);
                        if (kExpressionValuedObjectExtensions.isSignal(valuedObject)) {
                            res.accumulate(valuedObject.getName(),
                                    JSONSignalValues.newValue(false));
                            if (kExpressionValuedObjectExtensions.isValuedSignal(valuedObject)) {
                                inputVariableList.add(valuedObjectName + Signal.variableValueExtension);
                                res.accumulate(valuedObject.getName() + Signal.variableValueExtension,
                                        JSONSignalValues.newValue(false));
                            }
                        } else {
                            res.accumulate(valuedObject.getName(),
                                    JSONSignalValues.newValue(false));
                        }
                    }
                    if (kExpressionValuedObjectExtensions.isOutput(valuedObject)) {
                        String valuedObjectName = valuedObject.getName();
                        if (valuedObjectName
                                .startsWith(SCChartsSimJavaPlugin.AUXILIARY_VARIABLE_TAG_STATE)) {
                            outputStateList.add(valuedObjectName);
                        } else if (valuedObjectName.startsWith(
                                SCChartsSimJavaPlugin.AUXILIARY_VARIABLE_TAG_TRANSITION)) {
                            outputTransitionList.add(valuedObjectName);
                        } else {
                            res.accumulate(valuedObjectName, JSONSignalValues.newValue(false));
                            outputVariableList.add(valuedObjectName);
                            if (kExpressionValuedObjectExtensions.isValuedSignal(valuedObject)) {
                                outputVariableList.add(valuedObjectName + Signal.variableValueExtension);
                                res.accumulate(valuedObject.getName() + Signal.variableValueExtension,
                                        JSONSignalValues.newValue(false));
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
                        .getValueAsBoolean(),
                this.getProperties()[KIEM_PROPERTY_BENCHMARK + KIEM_PROPERTY_DIFF]
                        .getValueAsBoolean());
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void doModel2ModelTransform(final ProgressMonitorAdapter monitor, final EObject model,
            final boolean debug, final boolean benchmarkParam) throws KiemInitializationException {

        benchmark = benchmarkParam;

        // System.out.println("1");
        this.myModel = model;
        simulatedModel = model;
        monitor.begin("SCCharts Simulation", 1);
        // System.out.println("2");

        String compile = "";
        try {

            // System.out.println("3");
            if (this.myModel == null) {
                throw new KiemInitializationException(
                        "\nCannot simulate active editor using the SCCharts Simulator.", true,
                        null);
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

            // System.out.println("4");

            // if (this.getModelRootElement().eResource() == null) {
            // throw new KiemInitializationException(
            // "The active editor has must be saved in order to simulate the SCChart."
            // + " Volatile resources cannot be simulated.", true, null);
            // }
            // System.out.println("5");

            // Make a copy of the S program in case it was from
            // an active Editor
            // URI sOutput = URI.createURI("");
            // URI scOutput = URI.createURI("");

            // By default there is no additional transformation necessary
            // Program transformedProgram = null;

            // Calculate output path for possible S-m2m
            // String inputPathString = this.getModelFilePath().toString();
            // System.out.println("6 " + inputPathString);
            // URI input = URI.createPlatformResourceURI(inputPathString.replace("%20", " "), true);
            // sOutput = URI.createURI(input.toString());

            String highLevelTransformations =
                    this.getProperties()[KIEM_PROPERTY_HIGHLEVELTRANSFORMATIONS
                            + KIEM_PROPERTY_DIFF].getValue();
            String lowLevelTransformations =
                    this.getProperties()[KIEM_PROPERTY_LOWLEVELTRANSFORMATIONS + KIEM_PROPERTY_DIFF]
                            .getValue();
            // System.out.println("7");

            // If 'Full Debug Mode' is turned on then the user also wants to have
            // states and transitions visualized.
            // Hence some pre-processing is needed and done by the
            // an addition model transformation
            String debugTransformations =
                    this.getProperties()[KIEM_PROPERTY_DEBUGTRANSFORMATIONS + KIEM_PROPERTY_DIFF]
                            .getValue();
            // System.out.println("8");

            // EObject alternativeEObject =
            // KiemPlugin.getOpenedModelRootObjects().get(modelFilePath);

            // Compile the SCChart to C code
            EObject extendedSCChart = this.myModel;
            // System.out.println("9");

            String className = this.myModel.getClass().getCanonicalName();

            if (this.myModel instanceof Actor) {
                // In case we want to simulate a circuit, first re-compile the model
                // but just up to SSA-SCG.
                HashMap<IPath, EObject> map = KiemPlugin.getOpenedModelRootObjects();
                if (map.containsKey(new Path(KiCoKlighdPlugin.SOURCE_MODEL_ID))) {
                    EObject sourceModel =
                            (EObject) map.get(new Path(KiCoKlighdPlugin.SOURCE_MODEL_ID));

                    // Compile to SSA_SCG

                    // Do a PRE compilation with the debugTransformations!
                    KielerCompilerContext highLevelContext =
                            new KielerCompilerContext("scg.seqssa", sourceModel);
                    // Create a dummy resource ONLY for debug visualization, where we need
                    // FragmentURIs
                    highLevelContext.setCreateDummyResource(true);

                    highLevelContext.setInplace(false);
                    highLevelContext.setAdvancedSelect(true);
                    // System.out.println("10");
                    CompilationResult highLeveleCompilationResult =
                            KielerCompiler.compile(highLevelContext);

                    // extendedSCChart = sourceModel;
                    myModel = sourceModel;
                    extendedSCChart = highLeveleCompilationResult.getEObject();
                }
            }

            
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
                // System.out.println("10");
                CompilationResult highLeveleCompilationResult =
                        KielerCompiler.compile(highLevelContext);

                extendedSCChart = highLeveleCompilationResult.getEObject();

                // highLevelTransformations = debugTransformations + ", " +
                // highLevelTransformations;
            }

//            String[] prefExt = { "sct" };
//            String bla = KiCoUtil.serialize((EObject) extendedSCChart, null, false, prefExt, true);

            KielerCompilerContext highLevelContext =
                    new KielerCompilerContext(highLevelTransformations, extendedSCChart);

            // Create a dummy resource ONLY for debug visualization, where we need FragmentURIs
            highLevelContext.setCreateDummyResource(false);

            highLevelContext.setInplace(false);
            highLevelContext.setAdvancedSelect(true);
            // System.out.println("10");
            CompilationResult highLeveleCompilationResult =
                    KielerCompiler.compile(highLevelContext);
            // System.out.println("11");

            // reset compile time and accumulate
            compileTime = 0;

            // The following should be a state or an SCG
            EObject stateOrSCG = highLeveleCompilationResult.getEObject();
            if (!((stateOrSCG instanceof State) || (stateOrSCG instanceof SCGraph))) {
                // compilation failed
                throw new KiemInitializationException(
                        "Error compiling the SCChart (high-level synthesis). Try compiling it manually step-by-step using the KiCo compiler selection view:"
                                + highLeveleCompilationResult.getAllErrors(),
                        true, null);
            }

            String errors = highLeveleCompilationResult.getAllErrors();
            if (errors != null && errors.length() > 0) {
                if (errors.length() > 200) {
                    errors = errors.substring(0, 199) + "...";
                }
                ;
                throw new KiemInitializationException("\n" + errors, true, null);
            }
            String warnings = highLeveleCompilationResult.getAllWarnings();
            if (warnings != null && warnings.length() > 0) {
                if (warnings.length() > 200) {
                    warnings = warnings.substring(0, 199) + "...";
                }
                ;
                throw new KiemInitializationException("\n" + warnings, false, null);
            }

            // accumulate compile time
            for (TransformationIntermediateResult intermediateResult : highLeveleCompilationResult
                    .getTransformationIntermediateResults()) {
                compileTime += intermediateResult.getDuration();
            }

            // String coreSSChartText = KiCoUtil.serialize(coreSCChart, highLevelContext, false);
            // writeOutputModel("D:\\sschart.sct", coreSSChartText.getBytes());
            // System.out.println(coreSSChartText);

            KielerCompilerContext lowLevelContext =
                    new KielerCompilerContext(lowLevelTransformations, stateOrSCG);
            lowLevelContext.setCreateDummyResource(true);
            lowLevelContext.setInplace(false);
            lowLevelContext.setAdvancedSelect(true);
            // System.out.println("12");
            CompilationResult lowLevelCompilationResult = KielerCompiler.compile(lowLevelContext);
            // System.out.println("13");

            errors = lowLevelCompilationResult.getAllErrors();
            warnings = lowLevelCompilationResult.getAllWarnings();
            if (errors != null && errors.length() > 0) {
                if (errors.length() > 200) {
                    errors = errors.substring(0, 199) + "...";
                }
                ;
                throw new KiemInitializationException("\n" + errors, true, null);
            } else if (warnings != null && warnings.length() > 0) {
                if (warnings.length() > 200) {
                    warnings = warnings.substring(0, 199) + "...";
                }
                ;
                throw new KiemInitializationException("\n" + warnings, false, null);
            }

            String cSCChartCCode = lowLevelCompilationResult.getString();

            String modelName = "SCG";
            if (myModel instanceof State) {
                modelName = ((State) myModel).getName();
            }
            if (myModel instanceof SCGraph) {
                modelName = ((SCGraph) myModel).getLabel();
            }

            String constructor = "";// "\npublic SCChart() {};\n";
            if (cSCChartCCode.contains("public class " + modelName + " {")) {
                cSCChartCCode = cSCChartCCode.replace("public class " + modelName + " {",
                        "package test;\n\npublic class SCChart extends de.cau.cs.kieler.sccharts.sim.java.SCChartsJavaProgram {"
                                + constructor);
            } else if (cSCChartCCode.contains("class " + modelName + " {")) {
                cSCChartCCode = cSCChartCCode.replace("class " + modelName + " {",
                        "package test;\n\npublic class SCChart extends de.cau.cs.kieler.sccharts.sim.java.SCChartsJavaProgram {"
                                + constructor);
            }
            

            // System.out.println("14 " + cSCChartCCode);
            if (cSCChartCCode == null) {
                // compilation failed
                throw new KiemInitializationException(
                        "Error compiling the SCChart (low-level synthesis). Try compiling it manually step-by-step using the KiCo compiler selection view:"
                                + lowLevelCompilationResult.getAllErrors(),
                        true, null);
            }

            // accumulate compile time
            for (TransformationIntermediateResult intermediateResult : lowLevelCompilationResult
                    .getTransformationIntermediateResults()) {
                compileTime += intermediateResult.getDuration();
            }

            // // Generate Simulation wrapper C code
            // String cSimulation = "";
            // if (stateOrSCG instanceof State) {
            //// System.out.println("15");
            // CSimulationSCChart cSimulationSCChart =
            // Guice.createInjector().getInstance(CSimulationSCChart.class);
            //// System.out.println("16");
            // cSimulation = cSimulationSCChart.transform((State) stateOrSCG, "10000").toString();
            // } else if (stateOrSCG instanceof SCGraph) {
            //// System.out.println("15");
            // CSimulationSCG cSimulationSCG =
            // Guice.createInjector().getInstance(CSimulationSCG.class);
            //// System.out.println("16");
            // cSimulation = cSimulationSCG.transform((SCGraph) stateOrSCG, "10000").toString();
            // }
            //// System.out.println("17 " + cSimulation);

            // if (benchmark) {
            // cSimulation = Benchmark.addTimingCode(cSimulation, "tick");
            // }

            // Set a random output folder for the compiled files
            @SuppressWarnings("deprecation")
            String outputFolder = KiemUtil.generateRandomTempOutputFolder();
            // System.out.println("18 " + outputFolder);

            String fileNameSCChart = "SCChart.java";
            String outputFileSCChart = outputFolder + fileNameSCChart;
            // System.out.println("19 " + outputFileSCChart);
            writeOutputModel(outputFileSCChart, cSCChartCCode.getBytes());

            javaExecution = new JavaExecution(outputFileSCChart, benchmark);
            LinkedList<String> generatedSCFiles = new LinkedList<String>();
            generatedSCFiles.add(outputFileSCChart);
            javaExecution.setDebug(false);
            javaExecution.compile(generatedSCFiles, "SCChart", "");

            // Do a reset
            javaExecution.getSCChartsJavaProgram().reset();

            // String fileNameSimulation = "simulation.c";
            // String outputFileSimulation = outputFolder + fileNameSimulation;
            //// System.out.println("20 " + outputFileSimulation);
            // writeOutputModel(outputFileSimulation, cSimulation.getBytes());

            // String includePath = getBundlePath("templates");
            //// System.out.println("21 " + includePath);
            //// System.out.println(includePath);
            // // Compile
            // cExecution = new CExecution(outputFolder, benchmark);
            // LinkedList<String> generatedSCFiles = new LinkedList<String>();
            // generatedSCFiles.add(outputFileSimulation);
            // // generatedSCFiles.add(outputFileSCChart);
            // generatedSCFiles.add("-I " + includePath);

            // cExecution.compile(generatedSCFiles, modelName, outputFileSCChart);
        } catch (RuntimeException e) {
            throw new KiemInitializationException(
                    "Error compiling S program:\n\n " + e.getMessage() + "\n\n" + compile, true, e);
        } catch (IOException e) {
            throw new KiemInitializationException(
                    "Error compiling S program:\n\n " + e.getMessage() + "\n\n" + compile, true, e);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
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

        // boolean debugConsole = false;

        // Collect active statements
        StringBuffer activeStatesBuf = new StringBuffer();
        StringBuffer activeTransitionsBuf = new StringBuffer();
        // List<DebugData> activeStatesList = new LinkedList<DebugData>();

        if (javaExecution == null || !javaExecution.isStarted()) {
            throw new KiemExecutionException("No S simulation is running", true, null);
        }

        if (benchmark) {
            sourceFileSize = javaExecution.getSourceFileSize();
            executabeFileSize = javaExecution.getExecutableFileSize();
        }

        SCChartsJavaProgram program = javaExecution.getSCChartsJavaProgram();

        // First pass inputs
        // program.getVariableNames()
        for (String input : inputVariableList) {
            try {
                if (jSONObject.has(input)) {
                    Object object;
                    object = jSONObject.get(input);
                    boolean present = true;

                    if (JSONSignalValues.isSignalValue(object)) {
                        present = JSONSignalValues.isPresent(object);
                        object = JSONSignalValues.getSignalValue(object);
                        if (object == null) {
                            object = present;
                        }
                    }

                    if (object instanceof Boolean) {
                        program.setInput(input, (boolean) object);
                    } else if (object instanceof Integer) {
                        program.setInput(input, (int) object);
                    } else if (object instanceof Double) {
                        program.setInput(input, (double) object);
                    } else if (object instanceof Long) {
                        program.setInput(input, (long) object);
                    }

                }
            } catch (JSONException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (NoSuchFieldException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (SecurityException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IllegalArgumentException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        // Stimulate tick
        program.tick();

        // Inspect outputs
        for (String output : this.outputVariableList) {
            try {
                Object object = program.getOutput(output);

                boolean present = true;
                if (object instanceof Boolean) {
                    present = (Boolean) object;
                }

                Object value = JSONSignalValues.newValue(object, present);

                returnObj.accumulate(output, value);
            } catch (NoSuchFieldException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (SecurityException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IllegalArgumentException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (JSONException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        boolean fullDebugMode =
                this.getProperties()[KIEM_PROPERTY_FULLDEBUGMODE + KIEM_PROPERTY_DIFF]
                        .getValueAsBoolean();

        HashMap<String, Integer> activeTransitionsHashMap = new HashMap<String, Integer>();

        for (String output : program.getVariableNames()) {
            Object object;
            try {
                object = program.getOutput(output);
                int order = 0;
                boolean present = true;
                if (object instanceof Boolean) {
                    present = (Boolean) object;
                } else if (object instanceof Integer) {
                    order = (Integer) object;
                    present = (order) > 0;
                }

                if (isExposeAllVars() || ((!(simulatedModel instanceof State)) && fullDebugMode)) {
                    if (output.startsWith("g") || output.equals("_GO")) {
                        Object value;
                        try {
                            if (present) {
                                value = JSONSignalValues.newValue(1, present);
                            } else {
                                value = JSONSignalValues.newValue(0, present);
                            }
                            returnObj.accumulate(output, value);
                        } catch (JSONException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                }

                if (output.startsWith(SCChartsSimJavaPlugin.AUXILIARY_VARIABLE_TAG_STATE)) {
                    if (present) {
                        if (activeStatesBuf.length() > 0) {
                            activeStatesBuf.append(",");
                        }
                        String activeStateName = output.substring(
                                SCChartsSimJavaPlugin.AUXILIARY_VARIABLE_TAG_STATE.length());
                        activeStatesBuf.append(activeStateName);
                    }
                } else if (output
                        .startsWith(SCChartsSimJavaPlugin.AUXILIARY_VARIABLE_TAG_TRANSITION)) {
                    if (present) {
                        String activeTransitionName = output.substring(
                                SCChartsSimJavaPlugin.AUXILIARY_VARIABLE_TAG_TRANSITION.length());
                        activeTransitionsHashMap.put(activeTransitionName, order);
                    }
                }
            } catch (NoSuchFieldException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (SecurityException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IllegalArgumentException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        List<String> sorted = sortByValue(activeTransitionsHashMap);
        for (String activeTransitionName : sorted) {
            if (activeTransitionsBuf.length() > 0) {
                activeTransitionsBuf.append(",");
            }
            activeTransitionsBuf.append(activeTransitionName);
        }

        // // Finally accumulate all active Statements (activeStatements)
        // under the statementName
        String activeStates = "";
        String activeTransitions = "";
        activeStates = activeStatesBuf.toString();
        activeTransitions = activeTransitionsBuf.toString();

        String activeStatesName =
                this.getProperties()[KIEM_PROPERTY_STATENAME + KIEM_PROPERTY_DIFF].getValue();
        String activeTransitionsName =
                this.getProperties()[KIEM_PROPERTY_TRANSITIONNAME + KIEM_PROPERTY_DIFF].getValue();
        try {
            returnObj.accumulate(activeStatesName, activeStates);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            returnObj.accumulate(activeTransitionsName, activeTransitions);
        } catch (JSONException e) {
            e.printStackTrace();
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

    // Taken from: http://stackoverflow.com/questions/109383/sort-a-mapkey-value-by-values-java
    public static <K, V extends Comparable<? super V>> List<K> sortByValue(Map<K, V> map) {

        List<Map.Entry<K, V>> list = new LinkedList<Map.Entry<K, V>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        List<K> result = new ArrayList<K>();
        for (Map.Entry<K, V> entry : list) {
            result.add(entry.getKey());
        }
        return result;
    }

    // -------------------------------------------------------------------------

}
