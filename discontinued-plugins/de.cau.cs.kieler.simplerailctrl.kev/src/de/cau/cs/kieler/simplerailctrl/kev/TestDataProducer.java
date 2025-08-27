package de.cau.cs.kieler.simplerailctrl.kev;

import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;


public class TestDataProducer extends JSONObjectDataComponent implements IJSONObjectDataComponent {

    String[] tracks = {
            "KH_ST_1",
            "KH_LN_1",
            "OC_ST_1",
            "OC_LN_1",
            "IC_ST_1",
            "KIO_LN_1",
            "IO_LN_1",
            "OI_LN_1"
    };
    
    String[] trackDirection = {
            "M_OFF__simulation",
            "M_PRIMARY__simulation",
            "M_SECONDARY__simulation",
            "M_BRAKE__simulation"
    };
    
    String[] pointDirection = {
            "P_STRAIGHT__simulation",
            "P_TURN__simulation"
    };
    
    int positionCounter = 0;
    float trackDirectionCounter = 0;
    String trackError = "E_OK__simulation";
    String pointError = "E_OK__simulation";
    
    boolean straight = true;
    
    @Override
    public JSONObject step(JSONObject jSONObject) throws KiemExecutionException {
        JSONObject railwayData = new JSONObject();
                
        try {
        // set some arbitrary data for tracks, engines and trailers
        for (int i = 0; i < tracks.length; i++) {
            String trackID = tracks[i];
            railwayData.append("engine-"+trackID, positionCounter);
            railwayData.append("trailer-"+trackID, positionCounter-10);
            railwayData.append("track-"+trackID, trackDirection[Math.round(trackDirectionCounter)]);
            railwayData.append("text-"+trackID, trackError);
        }
        // set some data for switch points
        for(int point=0; point<29; point++){
            railwayData.append("point-"+point, straight ? pointDirection[0] : pointDirection[1] );
            railwayData.append("point-text-"+point, pointError);
        }
        
        } catch (JSONException e) {
            e.printStackTrace();
        }
        // increase values so we get some animation
        positionCounter = (positionCounter +1)%100 ;
        trackDirectionCounter = (trackDirectionCounter + 0.1f)%4;
        return railwayData;
    }

    @Override
    public boolean isObserver() {
        return false;
    }

    @Override
    public boolean isProducer() {
        return true;
    }

    @Override
    public void wrapup() throws KiemInitializationException {
    }

    @Override
    public void initialize() throws KiemInitializationException {
    }

}
