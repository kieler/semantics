package de.cau.cs.kieler.sj.test;

import org.json.JSONObject;

import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeChoice;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeEditor;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeFile;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeWorkspaceFile;

public class SJValidationSimulatorDataComponent extends JSONObjectDataComponent implements
        IJSONObjectDataComponent {

    public SJValidationSimulatorDataComponent() {
        // TODO Auto-generated constructor stub
    }

    // -------------------------------------------------------------------------

    public void initialize() throws KiemInitializationException {
        // TODO Auto-generated method stub

    }

    // -------------------------------------------------------------------------

    public void wrapup() throws KiemInitializationException {
        // TODO Auto-generated method stub

    }

    // -------------------------------------------------------------------------

    @Override
    public JSONObject provideInitialVariables() throws KiemInitializationException {
        // TODO Auto-generated method stub
        return null;
    }

    // -------------------------------------------------------------------------
    
    public boolean isProducer() {
        return true;
    }

    public boolean isObserver() {
        return true;
    }

    // -------------------------------------------------------------------------

    public JSONObject step(JSONObject jSONObject) throws KiemExecutionException {
        // TODO Auto-generated method stub
        System.out.println(jSONObject.toString());
        return null;
    }
    
    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#provideProperties()
     */
    @Override
    public KiemProperty[] provideProperties() {
        KiemProperty[] properties = new KiemProperty[1];
        String[] items = {"ABRO", "PrimeFactor"};
        properties[0] = new KiemProperty("SJ Program", new KiemPropertyTypeChoice(items), items[0]);
        return properties;
    }

}
