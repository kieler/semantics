package de.cau.cs.kieler.scg.opt.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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
	private double max;
	private double min;
	private double sum;
	private int count;
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
	}
	
	@Override
	public JSONObject step(JSONObject jSONObject) throws KiemExecutionException {
		// benchTime, benchSource, benchExecutable, benchCompileTime
		try {
			double benchTime = jSONObject.getDouble("benchTime");
			sum += benchTime;
			count++;
			if(benchTime > max) {
				max = benchTime;
			}
			if(benchTime < min || min == 0) {
				min = benchTime;
			}
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
		out.println(modelName + ";" + min + ";" + max + ";" + (sum / count));
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
		System.out.println("DataCollectorResult: min = " + min + " | max = " + max + " | avg = " + (sum / count));
		wrote = true;
		min = 0.0;
		max = 0.0;
		sum = 0.0;
		count = 0;
	}
}
