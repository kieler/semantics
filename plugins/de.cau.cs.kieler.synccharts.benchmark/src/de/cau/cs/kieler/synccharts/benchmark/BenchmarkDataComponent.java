package de.cau.cs.kieler.synccharts.benchmark;

import org.eclipse.emf.ecore.EObject;
import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.benchmark.xtend.SyncChartsBenchmark;


/**
 * This BenchmarkDataComponent class for SyncCharts benchmarks a SyncChart according to
 * the following: <BR>
 *   - number of states <BR>
 *   - number of transitions <BR>
 *   - maximal number of hierarchy <BR>
 *   - overall length of transition labels <BR>
 *   - number of states <BR>
 * 
 * @author cmot
 * @kieler.design 2012-11-28 proposed
 * @kieler.rating 2012-11-28 proposed
 */
public class BenchmarkDataComponent extends JSONObjectSimulationDataComponent implements
        IJSONObjectDataComponent {

    /** The Constant BENCHMARK_NAME_STATES. */
    final static String BENCHMARK_NAME_STATES = "benchStates";
    
    /** The Constant BENCHMARK_NAME_TRANSITIONS. */
    final static String BENCHMARK_NAME_TRANSITIONS = "benchTransitions";
    
    /** The Constant BENCHMARK_NAME_MAXHIERARCHY. */
    final static String BENCHMARK_NAME_MAXHIERARCHY = "benchMaxHierarchy";
    
    /** The Constant BENCHMARK_NAME_LABELLENGTH. */
    final static String BENCHMARK_NAME_LABELLENGTH = "benchLabelLength";
    
    /** The Constant BENCHMARK_NAME_MAXLABELLENGTH. */
    final static String BENCHMARK_NAME_MAXLABELLENGTH = "benchMaxLabelLength";

    /**
     * Instantiates a new benchmark data component.
     */
    public BenchmarkDataComponent() {
    }

    /**
     * {@inheritDoc}
     */
    public void initialize() throws KiemInitializationException {
    }

    /**
     * {@inheritDoc}
     */
    public void wrapup() throws KiemInitializationException {
    }

    /**
     * {@inheritDoc}
     */
    public boolean isProducer() {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    public boolean isObserver() {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    public JSONObject doStep(JSONObject jSONObject) throws KiemExecutionException {
        // For every step, benchmark the SyncChart
        
        JSONObject returnObj = new JSONObject();

        EObject eObject = this.getModelRootElement();
        int states = 0;
        int transitions = 0;
        int maxhierarchy = 0;
        int labellength = 0;
        int maxlabellength = 0;
        
        if (eObject != null) {
            if (eObject instanceof Region) {
                Region rootRegion = (Region) eObject;
                SyncChartsBenchmark syncChartsBenchmark = new SyncChartsBenchmark();
                // Perform the benchmark tests
                states = syncChartsBenchmark.countStates(rootRegion);
                transitions = syncChartsBenchmark.countTransitions(rootRegion);
                maxhierarchy = syncChartsBenchmark.maxHierarchy(rootRegion);
                labellength = syncChartsBenchmark.countLabelLength(rootRegion);
                maxlabellength = syncChartsBenchmark.maxLabelLength(rootRegion);
            }
        }
        
        try {
            returnObj.accumulate(BENCHMARK_NAME_STATES, states);
            returnObj.accumulate(BENCHMARK_NAME_TRANSITIONS, transitions);
            returnObj.accumulate(BENCHMARK_NAME_MAXHIERARCHY, maxhierarchy);
            returnObj.accumulate(BENCHMARK_NAME_LABELLENGTH, labellength);
            returnObj.accumulate(BENCHMARK_NAME_MAXLABELLENGTH, maxlabellength);
        } catch (JSONException e) {
            // If this goes wrong, produce an error
            throw new KiemExecutionException("Could not benchmak SyncChart.",false, false, true, e);
        }

        return returnObj;
    }
}
