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
package de.cau.cs.kieler.comparison.datahandler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import de.cau.cs.kieler.comparison.exchange.GeneralComparisonMeasurement;
import de.cau.cs.kieler.comparison.measuring.IMeasuring;

/**
 * A specific implementation of the {@link AbstractDataHandler}. This DataHandler uses the Singleton
 * pattern and serializes using the JSON data format.
 * 
 * @author nfl
 */
public final class DataHandler extends AbstractDataHandler {

    /**
     * Private constructor for singleton pattern.
     */
    private DataHandler() {

    }

    private static DataHandler singleton = new DataHandler();

    /**
     * Get the singleton instance of Comparison.
     * 
     * @return Singleton Comparison
     */
    public static DataHandler getDataHandler() {
        if (singleton == null) {
            singleton = new DataHandler();
        }
        return singleton;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void serialize(final String comparison, final IMeasuring data) {
        // loading the complete measurement is not very performant, but required for json insertion
        GeneralComparisonMeasurement measurement = getData(comparison);
        measurement.insert(data);
        saveAsJSONFile(comparison, measurement);

        this.setChanged();
        notifyObservers(measurement);
    }

    /**
     * This method stores a comparison and its measurings as a JSON file. The comparison identifier
     * given as String is used for unique naming of the JSON file. The
     * {@link GeneralComparisonMeasurement} contains the measurings.
     * 
     * @param comparison
     *            a String which uniquely identifies the comparison
     * @param measurement
     *            the measurings to serialize
     */
    private void saveAsJSONFile(final String comparison, final GeneralComparisonMeasurement measurement) {

        String json = measurement.toJSON();
        BufferedWriter bw = null;

        try {
            if (comparison.toLowerCase().contains(".json")) {
                bw = new BufferedWriter(new FileWriter(comparison));
            } else {
                bw = new BufferedWriter(new FileWriter(comparison + ".JSON"));
            }
            bw.write(json);
        } catch (IOException e) {
            // measurings are probably lost
            // TODO better error logging
            System.out.println("Measurings could not be serialized.");
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                // ignore
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GeneralComparisonMeasurement getData(final String comparison) {
        // load the content of a JSON file as String
        String json = loadJSONFile(comparison);
        // parse the String to a GeneralComparisonMeasurement object
        return GeneralComparisonMeasurement.fromJSON(json);
    }

    /**
     * This method reads a comparison and its measurings from a JSON file as a String.
     * 
     * @param filePath
     *            the JSON file containing the measurings
     * @return a JSON String of the comparison
     */
    private String loadJSONFile(final String filePath) {

        String jsonObj = "";
        BufferedReader br = null;
        try {
            if (filePath.toLowerCase().contains(".json")) {
                br = new BufferedReader(new FileReader(filePath));
            } else {
                br = new BufferedReader(new FileReader(filePath + ".JSON"));
            }
            while (br.ready()) {
                int c = br.read();
                if (c == -1) {
                    break;
                }
                jsonObj += (char) c;
            }
        } catch (FileNotFoundException e) {
            // File not found -> return empty String
            jsonObj = "";
        } catch (IOException e) {
            // TODO better error logging
            System.out.println("Measurings could not be deserialized.");
            // make sure the return String is not corrupted
            jsonObj = "";
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                // ignore
            }
        }
        return jsonObj;
    }
}
