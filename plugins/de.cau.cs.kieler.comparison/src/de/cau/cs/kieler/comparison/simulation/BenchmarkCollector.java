package de.cau.cs.kieler.comparison.simulation;

import java.util.ArrayList;

import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.comparison.core.ICompiler;
import de.cau.cs.kieler.comparison.core.ITestcase;
import de.cau.cs.kieler.comparison.datahandler.DataHandler;
import de.cau.cs.kieler.comparison.datahandler.IDataHandler;
import de.cau.cs.kieler.sim.benchmark.Benchmark;
import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;

public class BenchmarkCollector extends JSONObjectDataComponent implements IJSONObjectDataComponent {

    // TODO remove test defaults
    private ArrayList<Double> times = new ArrayList<Double>();
    private String comparison;
    private String compiler;
    private String testcase;
    
    public void setComparison(String comparison) {
        this.comparison = comparison;
    }

    public BenchmarkCollector() {

    }

    @Override
    public void wrapup() throws KiemInitializationException {

        System.out.println("collector wrap up");
        
        IDataHandler dataHandler = DataHandler.getDataHandler();
        
        // overall time
        double sum = 0;        
        for (Double time : times)
        {
            sum += time;
        }        
        
        ExecSpeedMeasuring data = new ExecSpeedMeasuring(compiler, testcase, sum);        
        dataHandler.serialize(comparison, data);
        
        System.out.println("collector wrap up done");
    }

    @Override
    public boolean isProducer() {
        return false;
    }

    @Override
    public boolean isObserver() {
        return true;
    }

    @Override
    public JSONObject step(JSONObject jSONObject) throws KiemExecutionException {

        try {
            Double bench = (Double) jSONObject.get(Benchmark.BENCHMARK_SIGNAL_TIME);
            times.add(bench);
        } catch (JSONException e) {
            // ignore
        }
        return null;
    }

    /**
     * @param compiler
     */
    public void setCompiler(String compiler) {
        this.compiler = compiler;        
    }

    /**
     * @param testcase
     */
    public void setTestcase(String testcase) {
        this.testcase = testcase;        
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void initialize() throws KiemInitializationException {
        
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isMaster() {
        return true;
    }
}
