package de.cau.cs.kieler.sim.modelrailway;

import java.io.IOException;
import java.net.URL;

import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import org.json.JSONObject;

import com.sun.jna.Library;
import com.sun.jna.Native;

import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;

public class DataComponent extends JSONObjectDataComponent implements
		IJSONObjectDataComponent {

    public interface CLibrary extends Library {
        CLibrary INSTANCE = (CLibrary)
        Native.loadLibrary(DataComponent.getLibLocation(), CLibrary.class);
        void initSimulation();
        void stepSimulation();
        String getSimulationData();
        void setInitialTrain(int block);
        int getTrackNum(String trackname);
        String getTrackName(int tracknum);
        void settrack(int invalid, int track, int mode, int target);        
    }
	
	public static String getLibLocation() {
		try {
			String path = (org.eclipse.core.runtime.FileLocator.toFileURL(Activator.getDefault().getBundle().getResource("/lib/railway.dll"))).toString();
			path = path.replaceFirst("file:/", "");
			System.out.println(path);
			return path;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
    
	public JSONObject step(JSONObject jSONObject) throws KiemExecutionException {
        System.out.println("-1-");
	    CLibrary.INSTANCE.stepSimulation();
        System.out.println("-2-");
        System.out.println(CLibrary.INSTANCE.getSimulationData());
        System.out.println("-3-");
		return null;
	}

	public void initialize() throws KiemInitializationException {
		   getLibLocation();
		   
	       CLibrary.INSTANCE.initSimulation();

	       CLibrary.INSTANCE.setInitialTrain(CLibrary.INSTANCE.getTrackNum("IC_ST_1"));
	       CLibrary.INSTANCE.settrack(0, CLibrary.INSTANCE.getTrackNum("IC_ST_1"), 1, 50);
	       CLibrary.INSTANCE.settrack(0, CLibrary.INSTANCE.getTrackNum("IC_ST_0"), 1, 50);
	       CLibrary.INSTANCE.settrack(0, CLibrary.INSTANCE.getTrackNum("IC_ST_4"), 1, 50);
	}

	public boolean isObserver() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean isProducer() {
		// TODO Auto-generated method stub
		return true;
	}

	public void wrapup() throws KiemInitializationException {
		// TODO Auto-generated method stub
		
	}

}
