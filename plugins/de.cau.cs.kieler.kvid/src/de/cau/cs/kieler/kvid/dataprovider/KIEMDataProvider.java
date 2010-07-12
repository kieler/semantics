package de.cau.cs.kieler.kvid.dataprovider;

import java.util.HashMap;
import java.util.Iterator;

import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.kvid.datadistributor.GMFDataDistributor;
import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;

public class KIEMDataProvider extends JSONObjectDataComponent implements IJSONObjectDataComponent {
    
    private HashMap<String, Object> dataByURI = new HashMap<String, Object>();

    public JSONObject step(JSONObject jSONObject) throws KiemExecutionException {
        Iterator allKeys = jSONObject.keys();
        while (allKeys.hasNext()) {
            Object o = allKeys.next();
            try {
                dataByURI.put(o.toString(), jSONObject.get(o.toString()));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        for (String string : dataByURI.keySet()) {
            System.out.println("KViD: " + string + " " + dataByURI.get(string));
            GMFDataDistributor.getInstance().markPartByURI(string);
        }
        return null;
    }

    public void initialize() throws KiemInitializationException {
        GMFDataDistributor.getInstance().initialize();        
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
