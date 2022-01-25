package de.cau.cs.kieler.ptolemy.test;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.json.JSONException;
import org.json.JSONObject;
import org.osgi.framework.Bundle;

import de.cau.cs.kieler.ptolemy.test.ExecutePtolemyModel.ModelOutput;
import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.signals.JSONSignalValues;

public class DataComponent extends JSONObjectDataComponent implements IJSONObjectDataComponent {

    public static String MODELPATH = "/model/ptomodel.xml";

    private ExecutePtolemyModel model;

    public DataComponent() {
        // TODO Auto-generated constructor stub
    }

    // -------------------------------------------------------------------------

    public void wrapup() throws KiemInitializationException {
        try {
            model.executionStop();
        } catch (Exception e) {
            // we expect no serious errors here
        }
        model = null;
    }

    // -------------------------------------------------------------------------

    private void loadAndInitialize() throws KiemInitializationException {
        if (model == null) {
            String modelPath = getModelPath();
            model = new ExecutePtolemyModel(modelPath);
            model.executionInitialize();
        }
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void initialize() throws KiemInitializationException {
        loadAndInitialize();
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean isProducer() {
        return true;
    }

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
    public JSONObject step(JSONObject jSONObject) throws KiemExecutionException {
        // the return object to construct
        JSONObject returnObj = new JSONObject();

        // // contains the currently active state
        // String activeStates = "";
        //
        // // contains the currently active transitions
        // String activeTransitions = "";

        try {
            // set current input data
            model.setData(jSONObject);

            // perform an synchronous step in PtolemyExecutor
            model.executionStep();

            // // get the currently active states
            // activeStates = model.getActiveStates();
            // // get the currently active transitions
            // activeTransitions = model.getActiveTransitions();

        } catch (Exception e) {
            throw (new KiemExecutionException("Ptolemy Model cannot make a step.\n\n"
                    + "Please ensure that all simulation warnings in the "
                    + "respective Eclipse Problems View have been cleared. If"
                    + " all warings have been cleared and still 'unknown "
                    + " inputs remain', possibly your model is not constructive.\n\n", true, e));
        }

        // Accumulate outputs
        List<ModelOutput> outputs = model.getModelOutputList();
        for (int c = 0; c < outputs.size(); c++) {
            ModelOutput output = outputs.get(c);

            String signalName = output.getName();
            boolean present = output.isPresent();
            String value = output.getValue();
            //ptolemy.data.expr.Parameter {.ptomodel.MonitorValue.value} 0 

            try {
                JSONObject signalObject = JSONSignalValues.newValue(value, present);
                try {
                    returnObj.accumulate(signalName, signalObject);
                } catch (Exception e) {
                    // ignore
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        // the stateName is the second KIEM property
        // String stateName = this.getProperties()[1].getValue();

        // the transitionName is the third KIEM property
        // String transitionName = this.getProperties()[2].getValue();

        // try {
        // returnObj.accumulate(stateName, activeStates);
        // } catch (Exception e) {
        // // ignore
        // }
        // try {
        // returnObj.accumulate(transitionName, activeTransitions);
        // } catch (Exception e) {
        // // ignore
        // }
        return returnObj;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public JSONObject provideInitialVariables() throws KiemInitializationException {
        // do the initialization prior to providing the interface keys
        // this may rise an exception
        JSONObject returnObj = new JSONObject();

        String[] keys = null;
        loadAndInitialize();

        try {
            keys = model.getInterfaceSignals();
            for (String key : keys) {
                returnObj.accumulate(key, JSONSignalValues.newValue(false));
            }
        } catch (Exception e) {
            throw new KiemInitializationException("Ptolemy Model could not be generated\n\n"
                    + "Please ensure that all simulation warnings in the "
                    + "respective Eclipse Problems View have been cleared.\n\n", true, e);
        }
        return returnObj;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the model path.
     * 
     * @return the model path
     */
    public String getModelPath() {
        Bundle bundle = Platform.getBundle(PtolemyTestPlugin.PLUGIN_ID);

        URL url = null;
        try {
            // the SC path is the path to the needed SC c files
            url = FileLocator.toFileURL(FileLocator.find(bundle, new Path(MODELPATH), null));
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

}
