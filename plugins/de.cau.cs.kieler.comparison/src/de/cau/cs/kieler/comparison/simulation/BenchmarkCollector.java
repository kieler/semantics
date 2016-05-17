/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.comparison.simulation;

import java.util.ArrayList;

import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.comparison.datahandler.AbstractDataHandler;
import de.cau.cs.kieler.comparison.datahandler.DataHandler;
import de.cau.cs.kieler.sim.benchmark.Benchmark;
import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;

/**
 * The BenchmarkCollector class is used for the simulation of compilations using KIEM. It is
 * responsible for gathering all the measuring taken by KIEM for each step.
 * 
 * @author nfl
 */
public class BenchmarkCollector extends JSONObjectDataComponent implements IJSONObjectDataComponent {

    /**
     * The identifier of the compiler used in the simulation.
     */
    private String compiler;

    /**
     * The identifier of the test case used in the simulation.
     */
    private String testcase;

    /**
     * The comparison the measurings are taken in.
     */
    private String comparison;

    /**
     * The measurings of each step done by the KIEM.
     */
    private ArrayList<Double> times = new ArrayList<Double>();

    /**
     * The constructor for a {@link BenchmarkCollector} object.
     */
    public BenchmarkCollector() {

    }

    @Override
    public void wrapup() throws KiemInitializationException {

        // overall time
        double sum = 0;
        for (Double time : times) {
            sum += time;
        }

        // serialize measuring
        AbstractDataHandler dataHandler = DataHandler.getDataHandler();
        ExecSpeedMeasuring data = new ExecSpeedMeasuring(compiler, testcase, sum);
        dataHandler.serialize(comparison, data);
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
    public JSONObject step(final JSONObject jSONObject) throws KiemExecutionException {

        // gather the data produces in the last round
        try {
            Double bench = (Double) jSONObject.get(Benchmark.BENCHMARK_SIGNAL_TIME);
            times.add(bench);
        } catch (JSONException e) {
            // ignore
        }
        // do not produce new data
        return null;
    }

    /**
     * Setter for the compiler used in the simulation of the compiled test case.
     * 
     * @param compiler
     *            the compiler to set
     */
    public void setCompiler(final String compiler) {
        this.compiler = compiler;
    }

    /**
     * Setter for the test case used in the simulation.
     * 
     * @param testcase
     *            the test case to set
     */
    public void setTestcase(final String testcase) {
        this.testcase = testcase;
    }

    /**
     * Setter for the comparison the measurings are taken in.
     * 
     * @param comparison
     *            the comparison to set
     */
    public void setComparison(final String comparison) {
        this.comparison = comparison;
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
