package de.cau.cs.kieler.scg.opt.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent;

public class BenchmarkCollector extends JSONObjectSimulationDataComponent implements
IJSONObjectDataComponent {
	static FileWriter fw;
    static BufferedWriter bw;
    static PrintWriter out;
    ArrayList<Double> data;
	private static boolean wrote;
	
    public void initialize() throws KiemInitializationException {
    	wrote = false;
		try {
			fw = new FileWriter("/tmp/executiontimeresults.csv", true);
		} catch (IOException e) {
			e.printStackTrace();
		}
		bw = new BufferedWriter(fw);
	    out = new PrintWriter(bw);
	    data = new ArrayList<>();
	}
	
	@Override
	public JSONObject step(JSONObject jSONObject) throws KiemExecutionException {
		// benchTime, benchSource, benchExecutable, benchCompileTime
		try {
			double benchTime = jSONObject.getDouble("benchTime");
			data.add(benchTime);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return jSONObject;
	}

	@Override
	public void wrapup() throws KiemInitializationException {
		if(wrote)
			return;
		// TODO: Write csv file
		String modelName = this.getModelFilePath().toString();
		String benchtimes = "";
		for (int i = 0; i < data.size(); i++) {
			benchtimes += ";" + data.get(i);
		}
		out.println(modelName + benchtimes);
		out.flush();
		try {
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		wrote = true;
	    data = new ArrayList<>();
	}
}
