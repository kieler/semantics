package de.cau.cs.kieler.kev.extension.dataobserver;

import org.json.JSONObject;

import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;

public class TCPDataComponent extends JSONObjectDataComponent implements IJSONObjectDataComponent {

    public TCPDataComponent() {
        // TODO Auto-generated constructor stub
    }

    public void initialize() throws KiemInitializationException {
        // TODO Auto-generated method stub

    }

    public void wrapup() throws KiemInitializationException {
        // TODO Auto-generated method stub

    }

    public boolean isProducer() {
        // TODO Auto-generated method stub
        return true;
    }

    public boolean isObserver() {
        // TODO Auto-generated method stub
        return true;
    }

    public JSONObject step(JSONObject jSONObject) throws KiemExecutionException {
        // TODO Auto-generated method stub
      System.out.println("huhu");
      return null;
    }

}
