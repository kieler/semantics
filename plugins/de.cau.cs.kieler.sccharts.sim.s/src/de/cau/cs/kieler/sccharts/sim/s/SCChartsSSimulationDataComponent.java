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
package de.cau.cs.kieler.sccharts.sim.s;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

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

import com.google.inject.Guice;

import de.cau.cs.kieler.core.model.util.ProgressMonitorAdapter;
import de.cau.cs.kieler.s.s.Program;
import de.cau.cs.kieler.s.sim.sc.SSCSimDataComponent;
import de.cau.cs.kieler.s.sim.sj.SSJSimDataComponent;
import de.cau.cs.kieler.sim.benchmark.Benchmark;
import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeChoice;
import de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent;
import de.cau.cs.kieler.sim.signals.JSONSignalValues;
import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.sccharts.s.SCCharts2STransformation;
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension;
import de.cau.cs.kieler.sccharts.extensions.SCChartsSimulation;

/**
 * The SimulationDataComponent for simulating S code with and without visualization.
 *
 * @author cmot
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow
 */
public class SCChartsSSimulationDataComponent extends JSONObjectSimulationDataComponent implements
        IJSONObjectDataComponent {

    /** The SyncChart is the considered model to simulate. */
    private State myModel = null;

    /** The Constant NUMBER_OF_TASKS for model transformation and code generation. */
    private static final int NUMBER_OF_TASKS = 10;

    private static final int KIEM_PROPERTY_MAX = 7;
    private static final int KIEM_PROPERTY_STATENAME = 0;
    private static final int KIEM_PROPERTY_TRANSITIONNAME = 1;
    private static final int KIEM_PROPERTY_FULLDEBUGMODE = 2;
    private static final int KIEM_PROPERTY_BENCHMARK = 3;
    private static final int KIEM_PROPERTY_RUNTIMEDEBUGCONSOLE = 4;
    private static final int KIEM_PROPERTY_EXPOSELOCALSIGNALS = 5;
    private static final int KIEM_PROPERTY_RUNTIME = 6; // Can be SC / SCL (SC Light) / SJ

    private static final String KIEM_PROPERTY_NAME_STATENAME = "State Name";
    private static final String KIEM_PROPERTY_NAME_TRANSITIONNAME = "Transition Name";
    private static final String KIEM_PROPERTY_NAME_FULLDEBUGMODE = "Full Debug Mode";
    private static final String KIEM_PROPERTY_NAME_BENCHMARK = "Benchmark Mode";
    private static final String KIEM_PROPERTY_NAME_RUNTIMEDEBUGCONSOLE = "Runtime Debug Console";
    private static final String KIEM_PROPERTY_NAME_EXPOSELOCALSIGNALS = "Expose Local Signals";
    private static final String KIEM_PROPERTY_NAME_RUNTIME = "Runtime Environment";
    private static final String KIEM_RUNTIME_SJ = "SJ";
    private static final String KIEM_RUNTIME_SJL = "SJL (SJ Light)";
    private static final String KIEM_RUNTIME_SC = "SC";
    private static final String KIEM_RUNTIME_SCL = "SCL (SC Light)";

    /** The currently selected/used runtime. */
    private String runtime;

    /** A flag indicating that debug console output is generated and should be handled. */
    private boolean debugConsole = true;

    /** The benchmark flag for generating cycle and file size signals. */
    private boolean benchmark = false;

    /** The dirty indicator is used to notice editor changes and set the dirty flag accordingly. */
    private int dirtyIndicator = 0;

    /** The simulation DataComponent. */
    private JSONObjectSimulationDataComponent sSimDataComponent = null;
    
    private SCChartsSimulation simulationTransformation =
            Guice.createInjector().getInstance(SCChartsSimulation.class);

//    private SCChartsCoreTransformation coreTransformation =
//            Guice.createInjector().getInstance(SCChartsCoreTransformation.class);

    private SCCharts2STransformation sCodeGenerationTransformation =
            Guice.createInjector().getInstance(SCCharts2STransformation.class);
    

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean checkModelValidation(final EObject rootEObject)
            throws KiemInitializationException {
        if (!(rootEObject instanceof State)) {
            throw new KiemInitializationException(
                    "SCCharts Simulator can only be used with a SCCharts editor.\n\n", true,
                    null);
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
        // If KiCo Selection has changed, consider this to be dirty
        
        
        // If we conclude at this point that we are not dirty on the level of
        // changes to the diagram, we MUST check whether the simulation
        // DataComponent used comes to the same result.
        return (sSimDataComponent == null || sSimDataComponent.isDirty());
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void initialize() throws KiemInitializationException {
        getSSimDataComponent().initialize();
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public JSONObject doStep(final JSONObject jSONObject) throws KiemExecutionException {
        // The return object to construct
        JSONObject returnObj = new JSONObject();

        // Collect active statements
        String activeStates = "";
        String activeTransitions = "";
        StringBuffer activeStatesBuf = new StringBuffer();
        StringBuffer activeTransitionsBuf = new StringBuffer();

        JSONObject signalOutput = getSSimDataComponent().doStep(jSONObject);
        if (signalOutput != null) {
            JSONArray signalOutputArray = signalOutput.names();

            if (this.benchmark) {
                try {
                    if (signalOutput.has(Benchmark.BENCHMARK_SIGNAL_TIME)) {
                        Object bench = signalOutput.get(Benchmark.BENCHMARK_SIGNAL_TIME);
                        returnObj.accumulate(Benchmark.BENCHMARK_SIGNAL_TIME, bench);
                    }
                    if (signalOutput.has(Benchmark.BENCHMARK_SIGNAL_SOURCE)) {
                        Object source = signalOutput.get(Benchmark.BENCHMARK_SIGNAL_SOURCE);
                        returnObj.accumulate(Benchmark.BENCHMARK_SIGNAL_SOURCE, source);
                    }
                    if (signalOutput.has(Benchmark.BENCHMARK_SIGNAL_EXECUTABLE)) {
                        Object exe = signalOutput.get(Benchmark.BENCHMARK_SIGNAL_EXECUTABLE);
                        returnObj.accumulate(Benchmark.BENCHMARK_SIGNAL_EXECUTABLE, exe);
                    }
                } catch (JSONException e) {
                    // do nothing if this signal is not provided
                    // or JSON data cannot be added
                }
            }

            if (signalOutputArray != null) {
                // First add auxiliary signals
                for (int i = 0; i < signalOutputArray.length(); i++) {
                    String signalName;
                    try {
                        signalName = signalOutputArray.getString(i);
                        JSONObject signalValue = signalOutput.getJSONObject(signalName);
                        boolean signalIsPresent = JSONSignalValues.isPresent(signalValue);

                        // Test if the output variable is an auxiliary signal
                        // that is only there to mark the current S statement
                        // in full_simulation mode of the simulator.
                        //
                        // These auxiliary signals must be encapsulated in a state variable.
                        if (signalName
                                .startsWith(SCChartsSimSPlugin.AUXILIARY_VARIABLE_TAG_STATE)
                                && signalIsPresent) {
                            try {
                                String statementWithoutAuxiliaryVariableTag = signalName
                                        .substring(SCChartsSimSPlugin.AUXILIARY_VARIABLE_TAG_STATE
                                                .length());
                                // Insert a "," if not the first statement
                                if (activeStatesBuf.length() != 0) {
                                    activeStatesBuf.append(",");
                                }
                                activeStatesBuf.append(statementWithoutAuxiliaryVariableTag);
                            } catch (Exception e) {
                                // ignore error
                            }
                        } else if (signalName
                                .startsWith(SCChartsSimSPlugin.AUXILIARY_VARIABLE_TAG_TRANSITION)
                                && signalIsPresent) {
                            try {
                                String statementWithoutAuxiliaryVariableTag = signalName
                                        .substring(SCChartsSimSPlugin.AUXILIARY_VARIABLE_TAG_TRANSITION
                                                .length());
                                // Insert a "," if not the first statement
                                if (activeTransitionsBuf.length() != 0) {
                                    activeTransitionsBuf.append(",");
                                }
                                activeTransitionsBuf.append(statementWithoutAuxiliaryVariableTag);
                            } catch (Exception e) {
                                // ignore error
                            }
                        } else if (!signalName
                                .startsWith(SCChartsSimSPlugin.AUXILIARY_VARIABLE_TAG_STATE)
                                && !signalName
                                        .startsWith(SCChartsSimSPlugin.AUXILIARY_VARIABLE_TAG_TRANSITION)) {
                            // add/pass-through normal signals directly
                            returnObj.accumulate(signalName, signalValue);
                        }
                    } catch (JSONException e) {
                        // ignore error
                    }
                }
                activeStates = activeStatesBuf.toString();
                activeTransitions = activeTransitionsBuf.toString();

                // Finally accumulate all active Statements (activeStatements)
                // under the statementName
                String stateName = this.getProperties()[KIEM_PROPERTY_STATENAME
                        + KIEM_PROPERTY_DIFF].getValue();
                try {
                    returnObj.accumulate(stateName, activeStates);
                } catch (JSONException e) {
                    // ignore error
                }
                String transitionName = this.getProperties()[KIEM_PROPERTY_TRANSITIONNAME
                        + KIEM_PROPERTY_DIFF].getValue();
                try {
                    returnObj.accumulate(transitionName, activeTransitions);
                } catch (JSONException e) {
                    // ignore error
                }
            }
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
        properties[KIEM_PROPERTY_STATENAME] = new KiemProperty(KIEM_PROPERTY_NAME_STATENAME,
                "state");
        properties[KIEM_PROPERTY_TRANSITIONNAME] = new KiemProperty(
                KIEM_PROPERTY_NAME_TRANSITIONNAME, "transition");

        properties[KIEM_PROPERTY_FULLDEBUGMODE] = new KiemProperty(
                KIEM_PROPERTY_NAME_FULLDEBUGMODE, true);
        properties[KIEM_PROPERTY_BENCHMARK] = new KiemProperty(KIEM_PROPERTY_NAME_BENCHMARK, false);
        properties[KIEM_PROPERTY_RUNTIMEDEBUGCONSOLE] = new KiemProperty(
                KIEM_PROPERTY_NAME_RUNTIMEDEBUGCONSOLE, true);
        properties[KIEM_PROPERTY_EXPOSELOCALSIGNALS] = new KiemProperty(
                KIEM_PROPERTY_NAME_EXPOSELOCALSIGNALS, false);
        String[] items = { KIEM_RUNTIME_SJ, KIEM_RUNTIME_SJL, KIEM_RUNTIME_SC, KIEM_RUNTIME_SCL };
        properties[KIEM_PROPERTY_RUNTIME] = new KiemProperty(KIEM_PROPERTY_NAME_RUNTIME,
                new KiemPropertyTypeChoice(items), items[0]);

        return properties;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void wrapup() throws KiemInitializationException {
        getSSimDataComponent().wrapup();
        sSimDataComponent = null;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void doModel2ModelTransform(final ProgressMonitorAdapter monitor)
            throws KiemInitializationException {
        monitor.begin("S Simulation", NUMBER_OF_TASKS);

        String compile = "";

        try {
            // get active editor
            myModel = (State) this.getModelRootElement();

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

            URI sCChartOutput = URI.createURI("");
            URI sOutput = URI.createURI("");
            // By default there is not always an additional transformation necessary
            State transformedModel = myModel;

            // Calculate output path for possible S-m2m
            // FileEditorInput editorInput = (FileEditorInput) editorPart.getEditorInput();
            String inputPathString = this.getModelFilePath().toString();
            URI input = URI.createPlatformResourceURI(inputPathString.replace("%20", " "), true);
            sCChartOutput = URI.createURI(input.toString());

            debugConsole = this.getProperties()[KIEM_PROPERTY_RUNTIMEDEBUGCONSOLE
                    + KIEM_PROPERTY_DIFF].getValueAsBoolean();

            benchmark = this.getProperties()[KIEM_PROPERTY_BENCHMARK + KIEM_PROPERTY_DIFF]
                    .getValueAsBoolean();

            runtime = this.getProperties()[KIEM_PROPERTY_RUNTIME + KIEM_PROPERTY_DIFF].getValue();

            // If 'Full Debug Mode' is turned on then the user wants to have
            // also states visualized.
            // Hence some pre-processing is needed and done by the
            // Esterl2Simulation Xtend2 model transformation
            if (this.getProperties()[KIEM_PROPERTY_FULLDEBUGMODE + KIEM_PROPERTY_DIFF]
                    .getValueAsBoolean()) {
                // Try to load SCCharts model
                // 'Full Debug Mode' is turned ON
                // SCCharts2Simulation transform =
                // Guice.createInjector().getInstance(SCCharts2Simulation.class);
                // transformedModel = transform.transform2Simulation(myModel);

                
                // Simulation Visualization
                transformedModel = simulationTransformation.transform2Simulation(myModel);

                // Because we transformed the S program we need to save a different file
                // and pass this new file to the SC simulation instead.
                sCChartOutput = sCChartOutput.trimFragment();
                sCChartOutput = sCChartOutput.trimFileExtension().appendFileExtension(
                        "simulation.scc");

                try {
                    // Write out copy/transformation of scchart program
                    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
                    Map<String, Object> m = reg.getExtensionToFactoryMap();
                    m.put("daform", new XMIResourceFactoryImpl());
                    ResourceSet resSet = new ResourceSetImpl();
                    Resource resource = resSet.createResource(sCChartOutput);
                    resource.getContents().add(transformedModel);
                    resource.save(Collections.EMPTY_MAP);
                } catch (IOException e) {
                    throw new KiemInitializationException("Cannot write output SyncChart file.",
                            true, null);
                }
            }
//
//            // The following transformations operate on the SyncChart to be simulated
//            // and which already may contain visualization auxiliary signals.
//            // These are done AFTER the visualization transformation because the visualization
//            // transformation MUST operate on the resource file (for URI gathering reasons).
//
//            if (this.getProperties()[KIEM_PROPERTY_EXPOSELOCALSIGNALS + KIEM_PROPERTY_DIFF]
//                    .getValueAsBoolean()) {
//                // We now support exposing Local Signals (should run AFTER raising local signals)
//                transformedModel = coreTransformation
//                        .transformExposeLocalValuedObject(transformedModel);
//            }
//
//            // Normal Pre operator (@requires: none)
//            transformedModel = coreTransformation.transformPre(transformedModel);
//
//            // If a LIGHT runtime is selected, that makes use of normal termination, then
//            // do NOT transform these away.
////            if (!(runtime.equals(KIEM_RUNTIME_SJL) || runtime.equals(KIEM_RUNTIME_SCL))) {
////                // Normal Termination transitions (@requires: during actions, @before: exit actions)
////                transformedModel = (new SCCharts2Simulation())
////                        .transformNormalTermination(transformedModel);
////            }
//
//            // Count Delays now for the SC (host code) simulation.
//            transformedModel = coreTransformation.transformCountDelay(transformedModel);
//
//            // Exit actions (@requires: entry actions, during actions, history)
//            transformedModel = coreTransformation.transformExit(transformedModel);
//
//            // History transitions. (@requires: suspend)
//            transformedModel = coreTransformation.transformHistory(transformedModel);
//
//            // Suspends (non-immediate and non-delayed) (@requires: during)
//            transformedModel = coreTransformation.transformSuspend(transformedModel);
//
//            // Entry actions (@requires: during actions)
//            transformedModel = coreTransformation.transformEntry(transformedModel);
//
//            // During actions (@requires: none)
//            transformedModel = coreTransformation
//                    .transformDuring(transformedModel);
//
//            // Normal SCC Aborts (@requires: none)
//            transformedModel = coreTransformation
//                        .transformAbortDefault(transformedModel);
//
//            // SCG-normalize: Split Transitions (@requires: none)
//            transformedModel = coreTransformation
//                        .transformTriggerEffect(transformedModel);
//
////            // SCG-normalize: Surface Depth (@requires: none)
////            transformedModel = coreTransformation
////                        .transformSurfaceDepth(transformedModel);
            
            // Transform SyncChart into S code
            Program program = sCodeGenerationTransformation.transformS(transformedModel);

            // Calculate out path
            sOutput = URI.createURI(input.toString());
            sOutput = sOutput.trimFragment();
            sOutput = sOutput.trimFileExtension().appendFileExtension("s");

            try {
                // Write out S program
                Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
                Map<String, Object> m = reg.getExtensionToFactoryMap();
                m.put("daform", new XMIResourceFactoryImpl());
                ResourceSet resSet = new ResourceSetImpl();
                Resource resource = resSet.createResource(sOutput);
                resource.getContents().add(program);
                resource.save(Collections.EMPTY_MAP);
            } catch (IOException e) {
                throw new KiemInitializationException("Cannot write output S file.", true, null);
            }

            // If a LIGHT runtime is selected, that makes use of normal termination, then
            // do NOT transform these away
            boolean lightRuntime = false;
            if (runtime.equals(KIEM_RUNTIME_SJL) || runtime.equals(KIEM_RUNTIME_SCL)) {
                lightRuntime = true;
            }
            if (runtime.equals(KIEM_RUNTIME_SJ) || runtime.equals(KIEM_RUNTIME_SJL)) {
                // Use the SSJSimulationDataComponent
                SSJSimDataComponent sSJSimDataComponent = (SSJSimDataComponent) getSSimDataComponent();
                sSJSimDataComponent.doModel2ModelTransform(monitor, program, false, this
                        .getProperties()[KIEM_PROPERTY_BENCHMARK + KIEM_PROPERTY_DIFF]
                        .getValueAsBoolean(), debugConsole, lightRuntime);
            }
            if (runtime.equals(KIEM_RUNTIME_SC) || runtime.equals(KIEM_RUNTIME_SCL)) {
                // Use the SSCSimulationDataComponent
                SSCSimDataComponent sSCSimDataComponent = (SSCSimDataComponent) getSSimDataComponent();
                sSCSimDataComponent.doModel2ModelTransform(monitor, program, false, this
                        .getProperties()[KIEM_PROPERTY_BENCHMARK + KIEM_PROPERTY_DIFF]
                        .getValueAsBoolean(), debugConsole, lightRuntime);
            }

        } catch (RuntimeException e) {
            throw new KiemInitializationException("Error compiling S program:\n\n "
                    + e.getMessage() + "\n\n" + compile, true, e);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Retrieves the SJ or SC simulation data component (cached in sSimDataComponent).
     *
     * @return the JSONObjectSimulationDataComponent of SJ or SC
     */
    protected JSONObjectSimulationDataComponent getSSimDataComponent() {
        if (sSimDataComponent == null) {
            if (runtime.equals(KIEM_RUNTIME_SJ) || runtime.equals(KIEM_RUNTIME_SJL)) {
                // Use the SSJSimulationDataComponent
                SSJSimDataComponent sSJSimDataComponent = new SSJSimDataComponent();
                // Set the global sSimDataComponent / sSimExecution
                sSimDataComponent = sSJSimDataComponent;
            }
            if (runtime.equals(KIEM_RUNTIME_SC) || runtime.equals(KIEM_RUNTIME_SCL)) {
                // Use the SSCSimulationDataComponent
                SSCSimDataComponent sSCSimDataComponent = new SSCSimDataComponent();
                // Set the global sSimDataComponent / sSimExecution
                sSimDataComponent = sSCSimDataComponent;
            }
        }
        return sSimDataComponent;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public JSONObject doProvideInitialVariables() throws KiemInitializationException {
        JSONObject initialSignals = getSSimDataComponent().doProvideInitialVariables();

        // filter away signals used for debugging
        // The return object to construct
        JSONObject returnObj = new JSONObject();

        if (initialSignals != null) {
            JSONArray signalArray = initialSignals.names();

            if (signalArray != null) {
                for (int i = 0; i < signalArray.length(); i++) {
                    String signalName;
                    try {
                        signalName = signalArray.getString(i);
                        JSONObject signalValue = initialSignals.getJSONObject(signalName);

                        // Filter here
                        if (!signalName
                                .startsWith(SCChartsSimSPlugin.AUXILIARY_VARIABLE_TAG_STATE)
                                && !signalName
                                        .startsWith(SCChartsSimSPlugin.AUXILIARY_VARIABLE_TAG_TRANSITION)) {
                            returnObj.accumulate(signalName, signalValue);
                        }
                    } catch (JSONException e) {
                        // ignore error
                    }
                }
            }
        }

        return returnObj;
    }

    // -------------------------------------------------------------------------
}
