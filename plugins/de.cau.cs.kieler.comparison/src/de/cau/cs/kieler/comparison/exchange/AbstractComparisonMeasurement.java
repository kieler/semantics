/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.comparison.exchange;

import java.util.ArrayList;
import java.util.Collection;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.comparison.measuring.IMeasuring;

/**
 * @author nfl
 *
 */
public class AbstractComparisonMeasurement {

    private Collection<String> compilers;
    private Collection<String> testcases;
    private Collection<String> criterias;
    private Collection<Testbench> testbenches;

    /**
     * @return the compilers
     */
    public Collection<String> getCompilers() {
        return compilers;
    }

    /**
     * @param compilers
     *            the compilers to set
     */
    public void setCompilers(Collection<String> compilers) {
        this.compilers = compilers;
    }

    /**
     * @return the testcases
     */
    public Collection<String> getTestcases() {
        return testcases;
    }

    /**
     * @param testcases
     *            the testcases to set
     */
    public void setTestcases(Collection<String> testcases) {
        this.testcases = testcases;
    }

    /**
     * @return the criterias
     */
    public Collection<String> getCriterias() {
        return criterias;
    }

    /**
     * @param criterias
     *            the criterias to set
     */
    public void setCriterias(Collection<String> criterias) {
        this.criterias = criterias;
    }

    /**
     * @return the testbenches
     */
    public Collection<Testbench> getTestbenches() {
        return testbenches;
    }

    /**
     * @param testbenches
     *            the testbenches to set
     */
    public void setTestbenches(Collection<Testbench> testbenches) {
        this.testbenches = testbenches;
    }

    /**
     * 
     */
    public AbstractComparisonMeasurement() {
        compilers = new ArrayList<String>();
        testcases = new ArrayList<String>();
        criterias = new ArrayList<String>();
        testbenches = new ArrayList<Testbench>();
    }

    /**
     * 
     * @param measuring
     * @return
     */
    @SuppressWarnings("unchecked")
    public boolean insert(IMeasuring measuring) {
        Testbench testbench = null;
        for (Testbench bench : testbenches) {
            if (bench.getCompiler().equals(measuring.getCompiler())
                    && bench.getTestcase().equals(measuring.getTestcase())
                    && bench.getCriteria().equals(measuring.getCriteria())) {
                testbench = bench;
                break;
            }
        }
        if (testbench == null) {
            testbench = new Testbench();
            testbench.setCompiler(measuring.getCompiler());
            testbench.setTestcase(measuring.getTestcase());
            testbench.setCriteria(measuring.getCriteria());
            testbenches.add(testbench);
        }
        testbench.getData().add(measuring.getMeasuringData());

        return true;
    }

    /**
     * 
     * @return
     */
    public String toJSON() {
        String ret = "{ \n";
        ret += "\"comparison\": [\n";

        if (testbenches.size() > 0) {
            Testbench[] array = testbenches.toArray(new Testbench[testbenches.size()]);
            ret += benchToJSON(array[0]);
            for (int i = 1; i < array.length; i++) {
                ret += ",\n" + benchToJSON(array[i]);
            }
        }

        ret += "\n]";
        ret += "\n}";

        return ret;
    }

    private String benchToJSON(Testbench testbench) {
        String ret = "{\n";
        ret += "\"compiler\": \"" + testbench.getCompiler() + "\",\n";
        ret += "\"testcase\": \"" + testbench.getTestcase() + "\",\n";
        ret += "\"criteria\": \"" + testbench.getCriteria() + "\",\n";
        ret += "\"measurings\": [";
        Collection<String> dataCollection = testbench.getData();
        if (dataCollection.size() > 0) {
            String[] array = dataCollection.toArray(new String[dataCollection.size()]);
            ret += "\"" + array[0] + "\"";
            for (int i = 1; i < array.length; i++) {
                ret += ", \"" + array[i] + "\"";
            }
        }
        ret += "]\n";
        ret += "}";
        return ret;
    }

    /**
     * Creates a new ComparisonMeasurement from a JSON String
     * 
     * @param json
     *            JSON String used to generate ComparisonMeasurement
     * @return generated ComparisonMeasurement
     */
    public static AbstractComparisonMeasurement fromJSON(String json) {
        AbstractComparisonMeasurement ret = new AbstractComparisonMeasurement();
        if (json == null || json.equals(""))
            return ret;

        try {
            JSONObject root = new JSONObject(json);
            JSONArray array = root.getJSONArray("comparison");
            for (int i = 0; i < array.length(); i++) {
                JSONObject measuring = array.getJSONObject(i);
                Testbench bench = new Testbench();
                bench.setCompiler(measuring.getString("compiler"));
                bench.setTestcase(measuring.getString("testcase"));
                bench.setCriteria(measuring.getString("criteria"));
                JSONArray measurings = measuring.getJSONArray("measurings");
                ArrayList<String> list = new ArrayList<String>();
                for (int j = 0; j < measurings.length(); j++) {
                    list.add(measurings.getString(j));
                }
                bench.setData(list);
                ret.testbenches.add(bench);
                addToCollection(ret.compilers, bench.getCompiler());
                addToCollection(ret.testcases, bench.getTestcase());
                addToCollection(ret.criterias, bench.getCriteria());
            }
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return ret;
    }

    /**
     * Adds a string to a given collection, if the string is not already in collection.
     * 
     * @param collection
     *            collection to modify
     * @param string
     *            string to add
     */
    private static void addToCollection(Collection<String> collection, String string) {
        boolean missing = true;
        for (String comp : collection) {
            if (comp.equals(string)) {
                missing = false;
                break;
            }
        }
        if (missing)
            collection.add(string);
    }
}
