package de.cau.cs.kieler.kvid.dataprovider;

import org.json.JSONObject;

import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;

public class KIEMDataProvider extends JSONObjectDataComponent implements IJSONObjectDataComponent {

    public JSONObject step(JSONObject jSONObject) throws KiemExecutionException {
        jSONObject.toString();
        return null;
    }

    public void initialize() throws KiemInitializationException {
        // TODO Auto-generated method stub
        
    }

    public void wrapup() throws KiemInitializationException {
        // TODO Auto-generated method stub
        
    }

    public boolean isProducer() {
        return false;
    }

    public boolean isObserver() {
        return true;
    }

}
