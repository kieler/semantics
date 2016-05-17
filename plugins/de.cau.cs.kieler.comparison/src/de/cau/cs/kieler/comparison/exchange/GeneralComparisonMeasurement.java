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
package de.cau.cs.kieler.comparison.exchange;

import java.util.ArrayList;
import java.util.Collection;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.comparison.core.ICompiler;
import de.cau.cs.kieler.comparison.core.ITestcase;
import de.cau.cs.kieler.comparison.datahandler.AbstractDataHandler;
import de.cau.cs.kieler.comparison.measuring.IMeasuring;

/**
 * This class is used for the communication with {@link AbstractDataHandler}s. The measurings and
 * components of a comparison can be stored using this class.
 * 
 * @author nfl
 */
public class GeneralComparisonMeasurement {

    private Collection<String> compilers;
    private Collection<String> testcases;
    private Collection<String> criteria;
    private Collection<Testbench> testbenches;

    /**
     * Getter for the {@link ICompiler}s used in the comparison.
     * 
     * @return the compilers
     */
    public Collection<String> getCompilers() {
        return compilers;
    }

    /**
     * Setter for the {@link ICompiler}s used in the comparison.
     * 
     * @param compilers
     *            the compilers to set
     */
    public void setCompilers(Collection<String> compilers) {
        this.compilers = compilers;
    }

    /**
     * Getter for the test cases used in the comparison.
     * 
     * @return the identifiers of the test cases
     */
    public Collection<String> getTestcases() {
        return testcases;
    }

    /**
     * Setter for the test cases used in the comparison.
     * 
     * @param testcases
     *            the identifiers of the test cases to set
     */
    public void setTestcases(Collection<String> testcases) {
        this.testcases = testcases;
    }

    /**
     * Getter for the measuring criteria used in the comparison.
     * 
     * @return the criteria
     */
    public Collection<String> getCriteria() {
        return criteria;
    }

    /**
     * Setter for the measuring criteria used in the comparison.
     * 
     * @param criteria
     *            the criteria to set
     */
    public void setCriterias(Collection<String> criteria) {
        this.criteria = criteria;
    }

    /**
     * Getter for the measurings taken in the comparison. The {@link Testbench} class is used for
     * that purpose.
     * 
     * @return the test benches
     */
    public Collection<Testbench> getTestbenches() {
        return testbenches;
    }

    /**
     * Setter for the measurings taken in the comparison. The {@link Testbench} class is used for
     * that purpose.
     * 
     * @param testbenches
     *            the test benches to set
     */
    public void setTestbenches(Collection<Testbench> testbenches) {
        this.testbenches = testbenches;
    }

    /**
     * The constructor for an empty {@link GeneralComparisonMeasurement} object.
     */
    public GeneralComparisonMeasurement() {
        compilers = new ArrayList<String>();
        testcases = new ArrayList<String>();
        criteria = new ArrayList<String>();
        testbenches = new ArrayList<Testbench>();
    }

    /**
     * This method is used to insert a {@link IMeasuring} into the GeneralComparisonMeasurement
     * object. If a {@link Testbench} using the same compiler, test case and criterion exists, that
     * measuring is inserted into that test bench. Otherwise a new test bench is created.
     * 
     * @param measuring
     *            the measuring to insert
     * @return true, if the insertion was successfully; false otherwise
     */
    public boolean insert(IMeasuring measuring) {
        Testbench testbench = null;
        // look for a test bench using the same compiler, test case and criterion
        for (Testbench bench : testbenches) {
            if (bench.getCompiler().equals(measuring.getCompiler())
                    && bench.getTestcase().equals(measuring.getTestcase())
                    && bench.getCriterion().equals(measuring.getCriterion())) {
                testbench = bench;
                break;
            }
        }
        if (testbench == null) {
            testbench = new Testbench();
            testbench.setCompiler(measuring.getCompiler());
            testbench.setTestcase(measuring.getTestcase());
            testbench.setCriterion(measuring.getCriterion());
            testbenches.add(testbench);
        }
        testbench.getData().add(measuring.getMeasuringData());

        return true;
    }

    /**
     * Transforms a {@link GeneralComparisonMeasurement} object into a JSON-String.
     * 
     * @return the JSON-String
     */
    public String toJSON() {
        // open new enclosing JSON object
        String ret = "{ \n";
        ret += "\"comparison\": [\n";

        // add test benches
        if (testbenches.size() > 0) {
            Testbench[] array = testbenches.toArray(new Testbench[testbenches.size()]);
            ret += benchToJSON(array[0]);
            for (int i = 1; i < array.length; i++) {
                ret += ",\n" + benchToJSON(array[i]);
            }
        }

        // close enclosing JSON object
        ret += "\n]";
        ret += "\n}";

        return ret;
    }

    /**
     * Transforms a given {@link Testbench} object into a JSON-String.
     * 
     * @param testbench
     *            the Testbench to transform
     * @return the JSON-String
     */
    private String benchToJSON(Testbench testbench) {
        String ret = "{\n";
        ret += "\"compiler\": \"" + testbench.getCompiler() + "\",\n";
        ret += "\"testcase\": \"" + testbench.getTestcase() + "\",\n";
        ret += "\"criteria\": \"" + testbench.getCriterion() + "\",\n";
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
     * Creates a new GeneralComparisonMeasurement from a JSON-String.
     * 
     * @param json
     *            JSON-String used to generate GeneralComparisonMeasurement
     * @return generated GeneralComparisonMeasurement
     */
    public static GeneralComparisonMeasurement fromJSON(String json) {
        GeneralComparisonMeasurement ret = new GeneralComparisonMeasurement();
        if (json == null || json.equals(""))
            return ret;

        // try to parse the JSON-String
        try {
            JSONObject root = new JSONObject(json);
            JSONArray array = root.getJSONArray("comparison");
            // parse the test benches
            for (int i = 0; i < array.length(); i++) {
                JSONObject measuring = array.getJSONObject(i);
                Testbench bench = new Testbench();
                bench.setCompiler(measuring.getString("compiler"));
                bench.setTestcase(measuring.getString("testcase"));
                bench.setCriterion(measuring.getString("criteria"));
                JSONArray measurings = measuring.getJSONArray("measurings");
                ArrayList<String> list = new ArrayList<String>();
                for (int j = 0; j < measurings.length(); j++) {
                    list.add(measurings.getString(j));
                }
                bench.setData(list);
                ret.testbenches.add(bench);
                addToCollection(ret.compilers, bench.getCompiler());
                addToCollection(ret.testcases, bench.getTestcase());
                addToCollection(ret.criteria, bench.getCriterion());
            }
        } catch (JSONException e) {
            // return everything that went well
        }

        return ret;
    }

    /**
     * Adds an object to a matching collection, if no equal object is already in collection.
     * 
     * @param <T>
     *            the type of the object and the objects in the collection
     * @param collection
     *            collection to modify
     * @param object
     *            object to add
     */
    private static <T> void addToCollection(Collection<T> collection, T object) {
        boolean missing = true;
        for (T obj : collection) {
            if (obj.equals(object)) {
                missing = false;
                break;
            }
        }
        if (missing)
            collection.add(object);
    }
}
