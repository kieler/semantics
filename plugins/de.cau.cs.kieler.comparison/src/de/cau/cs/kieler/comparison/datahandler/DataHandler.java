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
package de.cau.cs.kieler.comparison.datahandler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Observer;

import de.cau.cs.kieler.comparison.exchange.AbstractComparisonMeasurement;
import de.cau.cs.kieler.comparison.measuring.IMeasuring;

/**
 * @author nfl
 *
 */
public class DataHandler extends AbstractDataHandler {

    /**
     * Private constructor for singleton pattern
     */
    private DataHandler() {

    }

    private static DataHandler singleton;

    /**
     * Get the singleton instance of Comparison
     * 
     * @return Singleton Comparison
     */
    public static DataHandler getDataHandler() {
        if (singleton == null)
            singleton = new DataHandler();
        return singleton;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void serialize(String comparison, IMeasuring data) { 
        AbstractComparisonMeasurement measurement = getData(comparison);
        measurement.insert(data);
        saveAsJSONFile(comparison, measurement);
        this.setChanged();
        notifyObservers(measurement);
    }

    /**
     * @param comparison
     * @param measures
     */
    private void saveAsJSONFile(String comparison, AbstractComparisonMeasurement measurement) {
        
        String json = measurement.toJSON();
        BufferedWriter bw = null;
                
        try {
            bw = new BufferedWriter(new FileWriter(comparison));
            bw.write(json);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }            
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbstractComparisonMeasurement getData(String comparison) {   

        String json = loadJSONFile(comparison);
        return AbstractComparisonMeasurement.fromJSON(json);
    }

    /**
     * 
     * @param filePath
     * @return
     */
    private String loadJSONFile(String filePath) {
        
        String jsonObj = "";
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filePath));
            while (br.ready())
            {
             int c = br.read();
             if (c == -1)
                 break;
             jsonObj += (char)c;
            }
        } catch (FileNotFoundException e) {
            // File not found -> return empty String
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return jsonObj;
    }
}
