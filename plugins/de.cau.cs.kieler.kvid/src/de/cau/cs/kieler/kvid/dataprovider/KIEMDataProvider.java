package de.cau.cs.kieler.kvid.dataprovider;

import org.json.JSONObject;

import de.cau.cs.kieler.kvid.datadistributor.KViDDataDistributor;
import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;

public class KIEMDataProvider extends JSONObjectDataComponent implements IJSONObjectDataComponent {
    
    public JSONObject step(JSONObject jSONObject) throws KiemExecutionException {
        KViDDataDistributor.getInstance().update(jSONObject);
        return null;
    }

    public void initialize() throws KiemInitializationException {
        KViDDataDistributor.getInstance().initialize();        
    }

    public void wrapup() throws KiemInitializationException {
        KViDDataDistributor.getInstance().cleanup();
    }

    public boolean isProducer() {
        return false;
    }

    public boolean isObserver() {
        return true;
    }

}
