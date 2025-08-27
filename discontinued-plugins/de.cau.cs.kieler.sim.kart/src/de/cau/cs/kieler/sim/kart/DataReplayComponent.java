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
package de.cau.cs.kieler.sim.kart;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.elk.core.util.Pair;
import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.sim.eso.EsoFile;
import de.cau.cs.kieler.sim.eso.ISignal;
import de.cau.cs.kieler.sim.eso.ITick;
import de.cau.cs.kieler.sim.eso.ITrace;
import de.cau.cs.kieler.sim.eso.ITraceProvider;
import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.IKiemEventListener;
import de.cau.cs.kieler.sim.kiem.KiemEvent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.execution.TimeoutThread;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyException;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeInt;
import de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent;
import de.cau.cs.kieler.sim.kiem.util.KiemUtil;
import de.cau.cs.kieler.sim.signals.JSONSignalValues;

/**
 * Implements a data component for KIEM that reads a ESI/ESO trace file and in each step of the
 * simulation replays the corresponding signals. This component also offers a training mode to write
 * ESO files in conjunction with the {@link DataValidationComponent}.
 * 
 * @author ssc, cmot
 * @kieler.design 2012-02-23 cmot
 * @kieler.rating 2012-02-23 yellow cmot
 */
public class DataReplayComponent extends JSONObjectSimulationDataComponent implements
        IJSONObjectDataComponent, IKiemEventListener {

    /** The Constant DATA_REPLAY_COMPONENT_ID. */
    public static final String DATA_REPLAY_COMPONENT_ID =
            "de.cau.cs.kieler.sim.kart.DataReplayComponent";

    /** The Constant for the name of the KIEM property model file selection. */
    public static final String KIEM_PROPERTY_MODEFILE = "ESO Model File";

    /** The number of the current step. */
    private static long step;

    /** Name of the ESO file to be replayed/recorded from/to. */
    private IPath esoFilePath;

    /** Name of the variable that will be used to communicate with the validation component. */
    private String configVarName;

    /**
     * Name of the variable that will be used to communicate the values of output signals and
     * variables to the validation component.
     */
    private String outputVarName;

    /** The wrapup already called. */
    private boolean wrapupAlreadyCalled = false;

    /**
     * Name of the variable under which all signals injected into the simulation by components in
     * front of this component will be saved. These will be regarded as input signals when writing
     * an ESO file.
     */
    private String prevInputVarName;

    /** The single trace out of a ESI/ESO file that shall be replayed. */
    private ITrace trace;

    /** Are we in training mode, i. e. recording, or not. */
    private boolean trainingMode = false;
    // we had 3 training modes but manual training mode does not make sense because we do not know
    // which vars/signals are inputs

    /**
     * Stop the KIEM execution automatically if reaching end of ESO file. This option also updates
     * the trace file to the next trace.
     */
    private boolean automatic;

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getKiemPropertyModelFileName() {
        return KIEM_PROPERTY_MODEFILE;
    }

    // -------------------------------------------------------------------------

    /**
     * Initializes the component by reading the whole ESI/ESO file and saves it internally for
     * replay.
     * 
     * @throws KiemInitializationException
     *             thrown when reading the file fails
     */
    public void initialize() throws KiemInitializationException {
        KiemProperty[] properties = this.getProperties();
        trace = null;
        esoFilePath = this.getEsoFilePath();
        int tracenum = 0;
        step = 1;
        configVarName = "";
        outputVarName = "";
        prevInputVarName = "";
        wrapupAlreadyCalled = false;

        // load properties
        for (KiemProperty prop : properties) {
            if (prop.getKey().equals(KartConstants.TRACENUM)) {
                tracenum = prop.getValueAsInt();
            } else if (prop.getKey().equals(KartConstants.TRAINMODE)) {
                trainingMode = (Boolean) prop.getValueAsBoolean();
            } else if (prop.getKey().equals(KartConstants.CONFIGVAR)) {
                configVarName = prop.getValue();
            } else if (prop.getKey().equals(KartConstants.OUTPUTVAR)) {
                outputVarName = prop.getValue();
            } else if (prop.getKey().equals(KartConstants.PREVINVAR)) {
                prevInputVarName = prop.getValue();
            } else if (prop.getKey().equals(KartConstants.AUTOMATIC)) {
                automatic = prop.getValueAsBoolean();
            }
        }

        // if (trainingMode != KartConstants.TRAINING_MODE_MANUAL) {
        // Read the file in case of NO training mode (validation) or Automatic training mode
        ITraceProvider tracefile = new EsoFile();
        try {
            List<ITrace> tracelist = tracefile.loadTrace(esoFilePath);
            try {
                trace = tracelist.get(tracenum);
            } catch (IndexOutOfBoundsException e) {
                throw new KiemInitializationException(KartConstants.ERR_NOTRACE + tracenum, true, e);
            }
        } catch (FileNotFoundException e) {
            possiblyDisplayNoTraceFileDialog();
        } catch (KiemInitializationException e) {
            throw new KiemInitializationException(KartConstants.ERR_READ, true, e);
        }
        // }
    }

    // -------------------------------------------------------------------------

    /**
     * Possibly displays the no-trace-file-dialog if ui-plugin is loaded otherwise throw an
     * exception that the trace file cannot be found.
     * 
     * @throws KiemInitializationException
     */
    private void possiblyDisplayNoTraceFileDialog() throws KiemInitializationException {
        IConfigurationElement[] contributors =
                Platform.getExtensionRegistry().getConfigurationElementsFor(
                        KartConstants.KART_EXTENSION_MESSAGEDIALOG);

        if (contributors.length > 0) {
            try {
                TimeoutThread.setAwaitUserRepsonse(true);
                IMessageDialog msg =
                        (IMessageDialog) (contributors[0].createExecutableExtension("class"));
                if (msg.question(KartConstants.ERR_NOTFOUND_TITLE, KartConstants.ERR_NOTFOUND)) {
                    // if no trace file is found, set training mode to MANUAL
                    // trainingMode = KartConstants.TRAINING_MODE_MANUAL;
                    // ATTENTION: This does not make sense, because we do not know which signals are
                    // inputs
                } else {
                    KiemPlugin.getDefault().cancelInitialization();
                    KiemPlugin.getDefault().showError(KartConstants.ERR_NOTFOUND,
                            KartConstants.PLUGINID, null, KartConstants.ERR_SILENT);
                }
            } catch (CoreException e) {
                throw new KiemInitializationException(KartConstants.ERR_NOTFOUND, true, e);
            } finally {
                TimeoutThread.setAwaitUserRepsonse(false);
            }
        } else {
            throw new KiemInitializationException(KartConstants.ERR_NOTFOUND, true, null);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the ESO file path.
     * 
     * @return the ESO file path
     */
    private IPath getEsoFilePath() {
        IPath modelFilePath = this.getModelFilePath();
        IPath localEsoFilePath = null;
//        //TODO: is there a better way do do this?
//        String updatedPath = modelFilePath.toString().replace(".simulation.", ".");
//        modelFilePath = new Path(updatedPath);
        if (modelFilePath != null) {
            localEsoFilePath =
                    modelFilePath.removeFileExtension().addFileExtension(
                            KartConstants.ESO_FILEEXTENSION);
        }
        return localEsoFilePath;
    }

    // -------------------------------------------------------------------------

    /**
     * Wrapup the data component and revert the internal state, here this means do nothing.
     * 
     * @throws KiemInitializationException
     *             never thrown
     */
    public void wrapup() throws KiemInitializationException {
        if (!wrapupAlreadyCalled) {
            wrapupAlreadyCalled = true;
            // If KART is in automatic mode, then update/increment the trace number
            if (this.automatic) {
                KiemProperty[] properties = this.getProperties();
                int tracenum = 0;
                for (KiemProperty prop : properties) {
                    if (prop.getKey().equals(KartConstants.TRACENUM)) {
                        tracenum = prop.getValueAsInt();
                        int numberOfTraces = KartPlugin.getNumberOfTraces(esoFilePath);
                        tracenum++;
                        if (tracenum < numberOfTraces) {
                            prop.setValue("" + tracenum);
                        } else {
                            // Turn-a-round: The next trace is trace number 0
                            prop.setValue("" + 0);
                        }
                    }
                }
            }

        }

    }

    // -------------------------------------------------------------------------

    int getCurrentTrace() {
        KiemProperty[] properties = this.getProperties();
        int tracenum = 0;
        for (KiemProperty prop : properties) {
            if (prop.getKey().equals(KartConstants.TRACENUM)) {
                tracenum = prop.getValueAsInt();
                return tracenum;
            }
        }
        return -1;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the step number according to the button the user pressed. This is needed to correctly
     * handle history steps or jumps.
     * 
     * @param event
     *            the event
     */
    @SuppressWarnings("unchecked")
    @Override
    public void notifyEvent(final KiemEvent event) {
        if (event.isEvent(KiemEvent.STEP_INFO) && event.getInfo() instanceof Pair) {
            step = ((Pair<Long, Long>) event.getInfo()).getFirst().longValue();
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Return the types of events this component listens to.
     * 
     * @return the event types, currently only {@code KiemEvent.STEP_INFO}
     */
    @Override
    public KiemEvent provideEventOfInterest() {
        int[] events = { KiemEvent.STEP_INFO };
        KiemEvent event = new KiemEvent(events);
        return event;
    }

    // -------------------------------------------------------------------------

    /**
     * Tell KIEM that this component does produce data.
     * 
     * @return always true
     */
    public boolean isProducer() {
        return true;
    }

    // -------------------------------------------------------------------------

    /**
     * Tell KIEM that this component does observe data.
     * 
     * @return always true
     */
    @Override
    public boolean isObserver() {
        return true;
    }

    // -------------------------------------------------------------------------

    /**
     * Tell KIEM that we are a delta observer.
     * 
     * @return always true
     */
    @Override
    public boolean isDeltaObserver() {
        return true;
    }

    // -------------------------------------------------------------------------

    /**
     * Take a step in the simulation by reading the internal state and providing the signals read
     * from the ESI/ESO file to the simulation engine.
     * 
     * @param obj
     *            the obj
     * @return data that shall be injected into the simulation
     * @throws KiemExecutionException
     *             when the JSON object with signals from ESI/ESO file could not be built.
     */
    @Override
    public JSONObject doStep(final JSONObject obj) throws KiemExecutionException {
        JSONObject retval = new JSONObject();

        if (!trainingMode && trace.getSize() > (step - 1)) {
            loadInputs(retval);
            loadOutputs(retval);
        } else if (trainingMode && trace.getSize() > (step - 1)) {
            // only read inputs in this case
            loadInputs(retval);
        }
        
        loadPreviousInputSignals(obj, retval);
        loadValConfigVars(retval);
        
        // inject signals into simulation
        return retval;
    }

    // -------------------------------------------------------------------------

    /**
     * Extract input signals from an ESO file and prepare them for injection into the simulation.
     * 
     * @param retval
     *            the loaded inputs
     * @return the signals that shall be injected
     * @throws KiemExecutionException
     *             when building the JSONObject fails
     */
    private void loadInputs(final JSONObject retval) throws KiemExecutionException {
        JSONObject prevSignals = new JSONObject();

        if (step < 1) {
            return;
        }

        ITick tick = trace.get(step - 1);

        Iterator<ISignal> signals = tick.getInputs().iterator();

        // Add signals from the trace to the simulation
        try {
            while (signals.hasNext()) {
                ISignal signal = signals.next();
                if (signal.isValued()) {
                    retval.accumulate(signal.getName(),
                            JSONSignalValues.newValue(Utilities.getEsoSignalValue(signal), true));
                    prevSignals.accumulate(signal.getName(),
                            JSONSignalValues.newValue(Utilities.getEsoSignalValue(signal), true));
                } else {
                    retval.accumulate(signal.getName(), JSONSignalValues.newValue(true));
                    prevSignals.accumulate(signal.getName(), JSONSignalValues.newValue(true));
                }
            }
            retval.accumulate(prevInputVarName, prevSignals);
        } catch (JSONException e) {
            throw new KiemExecutionException(KartConstants.ERR_JSON, true, e);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Gather the input signals generated by components which were executed prior to this and
     * prepare them for submission to the validation component. This information is needed to:
     * 
     * (a) distinguish between input and output during validation (b) to generate a list of input
     * signals when writing an ESO file
     * 
     * @param json
     *            the data pool JSON object
     * @param retval
     *            the JSON object that will be injected into the simulation
     * @throws KiemExecutionException
     *             when adding to {@code retval} fails.
     */
    private void loadPreviousInputSignals(final JSONObject json, final JSONObject retval)
            throws KiemExecutionException {
        JSONObject prevSignals = retval.optJSONObject(prevInputVarName);
        retval.remove(prevInputVarName);
        if (prevSignals == null) {
            prevSignals = new JSONObject();
        }

        String[] fieldNames = JSONObject.getNames(json);
        if (fieldNames != null) {
            for (String field : fieldNames) {
                try {
                    Object obj = json.get(field);

                    if (obj instanceof JSONObject && JSONSignalValues.isSignalValue(obj)
                            && !retval.has(field)) {
                        prevSignals.accumulate(field, obj);
                    }
                } catch (JSONException e) {
                    KartPlugin.logError(e.getMessage());
                    e.printStackTrace();
                }
            }
        }
        try {
            retval.accumulate(prevInputVarName, prevSignals);
        } catch (JSONException e) {
            throw new KiemExecutionException("Error during gathering previous input signals", true,
                    e);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Load output signals and variables from ESO trace and prepare them for injection into the data
     * pool. This data will later on be used by the validation component.
     * 
     * @param json
     *            the JSON object the output data will be added to
     * @throws KiemExecutionException
     *             when adding to the JSON object fails
     */
    private void loadOutputs(final JSONObject json) throws KiemExecutionException {
        if (step < 1) {
            return;
        }

        ITick curTick = trace.get(step - 1);
        Iterator<ISignal> outputSignals = curTick.getOutputs().iterator();
        JSONObject value = new JSONObject();

        // Add output signals
        try {
            while (outputSignals.hasNext()) {
                ISignal outputSignal = outputSignals.next();
                if (outputSignal.isValued()) {
                    value.accumulate(outputSignal.getName(), JSONSignalValues.newValue(
                            Utilities.getEsoSignalValue(outputSignal), true));
                } else {
                    value.accumulate(outputSignal.getName(), JSONSignalValues.newValue(true));
                }
            }

            // Add variables
            Iterator<Entry<String, Object>> variables =
                    curTick.getExtraInfos().entrySet().iterator();

            while (variables.hasNext()) {
                Entry<String, Object> variable = variables.next();
                value.accumulate(variable.getKey(), Utilities.getEsoVarValue(variable));
            }
            
            json.accumulate(outputVarName, value);
        } catch (JSONException e) {
            throw new KiemExecutionException(KartConstants.ERR_JSON, true, e);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Prepare the current configuration of the replay component for addition to the data pool. This
     * configuration will be used by the validation component, so we save several properties there
     * and most properties will always be in sync (e. g. training mode).
     * 
     * @param json
     *            The JSONObject the configuration variables will be added to
     * @throws KiemExecutionException
     *             when adding to the JSON object fails
     */
    private void loadValConfigVars(final JSONObject json) throws KiemExecutionException {
        JSONObject value = new JSONObject();

        try {
            // for the validation component we only have training==(manual||automatic) or not
            // training == off
            value.accumulate(KartConstants.VAR_TRAINMODE, trainingMode);
            value.accumulate(KartConstants.VAR_ESOFILE, esoFilePath.toString());
            // if we read (OFF or AUTOMATIC) and detect end of eso file... what to do
            if (trace.getSize() <= (step - 1)) {
                value.accumulate(KartConstants.VAR_EOT, true);
                value.accumulate(KartConstants.VAR_TRACE, getCurrentTrace());
                if (automatic) {
                    // stop execution if this property is set to true and the EOT is reached
                    throw new KiemExecutionException("End of ESO file reached", true, true, true,
                            null);
                    // KiemPlugin.getDefault().getExecution().stopExecutionSync();
                }
            } else {
                value.accumulate(KartConstants.VAR_EOT, false);
                value.accumulate(KartConstants.VAR_TRACE, getCurrentTrace());
            }

            json.accumulate(configVarName, value);
        } catch (JSONException e) {
            throw new KiemExecutionException(KartConstants.ERR_JSON, true, e);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Provide a list of properties to KIEM so the user can configure this component.
     * 
     * @return the properties
     */
    @Override
    public KiemProperty[] doProvideProperties() {
        KiemProperty[] properties = new KiemProperty[KartConstants.KIEM_PROPERTY_REPLAY_NUMBER];

        properties[KartConstants.KIEM_PROPERTY_REPLAY_TRACENUM] =
                new KiemProperty(KartConstants.TRACENUM, new KiemPropertyTypeInt(), 0);
        properties[KartConstants.KIEM_PROPERTY_REPLAY_TRAINMODE] =
                new KiemProperty(KartConstants.TRAINMODE, false);
        properties[KartConstants.KIEM_PROPERTY_REPLAY_CONFIGVAR] =
                new KiemProperty(KartConstants.CONFIGVAR, KartConstants.DEF_CONFIGVAR);
        properties[KartConstants.KIEM_PROPERTY_REPLAY_OUTPUTVAR] =
                new KiemProperty(KartConstants.OUTPUTVAR, KartConstants.DEF_OUTPUTVAR);
        properties[KartConstants.KIEM_PROPERTY_REPLAY_PREVINVAR] =
                new KiemProperty(KartConstants.PREVINVAR, KartConstants.DEF_PREVINVAR);
        properties[KartConstants.KIEM_PROPERTY_REPLAY_STOPEXECUTION] =
                new KiemProperty(KartConstants.AUTOMATIC, true);
        return properties;
    }

    // -------------------------------------------------------------------------

    /**
     * Check whether the user actually selected an ESO file or messed up. This does not actually try
     * to read the file, it just checks for the correct extension.
     * 
     * @param properties
     *            the properties
     * @throws KiemPropertyException
     *             when the user messed up and did not select an ESI or ESO file
     */
    @Override
    public void checkProperties(final KiemProperty[] properties) throws KiemPropertyException {
        // check whether ESO file exists!
        IPath localEsoFilePath = this.getEsoFilePath();
        try {
            InputStream esoFile = KiemUtil.openWorkspaceFile(localEsoFilePath);
            if (esoFile == null) {
                throw new KiemPropertyException(KartConstants.ERR_NOTEXISTESO);
            }
        } catch (FileNotFoundException e) {
            throw new KiemPropertyException(KartConstants.ERR_NOTEXISTESO);
        }
    }

    // -------------------------------------------------------------------------

}
