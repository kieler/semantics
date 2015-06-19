/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.benchmark;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeChoice;
import de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent;

/**
 * This BenchmarkDataComponent class is supposed to collect benchmark values and to start over the
 * execution for a number of RUNS time.
 * 
 * @author cmot
 * @kieler.design 2012-11-28 proposed
 * @kieler.rating 2012-11-28 proposed
 * 
 */
public class BenchmarkDataComponent extends JSONObjectSimulationDataComponent implements
        IJSONObjectDataComponent {

    /** The Constant KIEM_PROPERTY_MAX. */
    private static final int KIEM_PROPERTY_MAX = 3;
    private static final String KIEM_PROPERTY_NAME_RUNS = "Number of Runs";
    private static final String KIEM_PROPERTY_NAME_MARKER = "Benchmark Marker";
    private static final String KIEM_PROPERTY_NAME_CONSOLIDATE = "Consolidate";
    private static final String CONSOLIDATE_NONE = "NONE";
    private static final String CONSOLIDATE_MIN = "MIN";
    private static final String CONSOLIDATE_MAX = "MAX";
    private static final String CONSOLIDATE_ADD = "ADD";
    private static final int KIEM_PROPERTY_RUNS = 0;
    private static final int KIEM_PROPERTY_MARKER = 1;
    private static final int KIEM_PROPERTY_CONSOLIDATE = 2;
    private static final String KIEM_PROPERTY_MARKER_DEFAULT = "benchTime, benchSource, benchExecutable";

    private static final String BENCHMARK_FILE_ENDING = "csv";
    private static final String BENCHMARK_DATA_SEPARATOR = ",";

    /** The current tick. */
    private int tick = 0;

    private boolean okToWrite = false;
    
    /** The num of executions still to run. */
    private int numToRun = 0;

    /** The gathered benchmark data. */
    private List<String> benchmarkData = new LinkedList<String>();

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new benchmark data component.
     */
    public BenchmarkDataComponent() {
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void initialize() throws KiemInitializationException {
        benchmarkData.clear();
        tick = 0;

        // If wrapped up and num to run > 0, then run again!
        numToRun = this.getProperties()[KIEM_PROPERTY_RUNS + KIEM_PROPERTY_DIFF].getValueAsInt();
        int updatedNumToRun = numToRun - 1;
        if (updatedNumToRun > 0) {
            // Reduce counter
            this.getProperties()[KIEM_PROPERTY_RUNS + KIEM_PROPERTY_DIFF].setValue(""
                    + updatedNumToRun);
            // Reinitialize execution
            KiemPlugin kiemPlugin = KiemPlugin.getDefault();
            if (kiemPlugin != null) {
                kiemPlugin.requestReRun();
            }
        }
        
        okToWrite = true;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void wrapup() throws KiemInitializationException {
        IPath modelFilePath = this.getModelFilePath();
        IPath benchmarkFilePath = modelFilePath.removeFileExtension().addFileExtension(
                BENCHMARK_FILE_ENDING);
        System.out.println("+++ wrapup start ");

        try {
            if (benchmarkData.size() > 0) {
                this.writeTextFile(benchmarkFilePath, benchmarkData, true);
                // Guard against possible second call of wrapup()
                benchmarkData.clear();
            }
        } catch (IOException e) {
            throw new KiemInitializationException("Could not write Benchmark data.", false, e, true);
        } catch (CoreException e) {
            throw new KiemInitializationException("Could not write Benchmark data.", false, e, true);
        }
        System.out.println("+++ wrapup done ");
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean isProducer() {
        return false;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean isObserver() {
        return true;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public JSONObject doStep(JSONObject jSONObject) throws KiemExecutionException {
        if (!okToWrite) {
            return null;
        }
        
        // In the step method open a benchmark file "model.ben" and
        // write the comma separated values into it if these values exist
        String markers = this.getProperties()[KIEM_PROPERTY_MARKER + KIEM_PROPERTY_DIFF].getValue();
        String markerArray[] = markers.split(",");

        String benchmarkDataEntry = "";
        // Run number is the first value
        benchmarkDataEntry += "" + numToRun + BENCHMARK_DATA_SEPARATOR;

        // Tick number is the second value
        benchmarkDataEntry += "" + (tick++);

        for (String marker : markerArray) {
            // Trim away any white space
            marker = marker.trim();
            // Separation of all values
            benchmarkDataEntry += BENCHMARK_DATA_SEPARATOR;
            if (jSONObject.has(marker)) {
                Object obj;
                try {
                    obj = jSONObject.get(marker);
                    if (obj instanceof String) {
                        benchmarkDataEntry += ((String) obj);
                    }
                    if (obj instanceof Integer) {
                        benchmarkDataEntry += ((Integer) obj);
                    }
                    if (obj instanceof Double) {
                        benchmarkDataEntry += ((Double) obj);
                    }
                } catch (JSONException e) {
                    // Ignore errors
                }
            }
        }

        System.out.println("+++ STEP ADD: " + benchmarkDataEntry);
        this.benchmarkData.add(benchmarkDataEntry);

        return null;
    }

    // -------------------------------------------------------------------------

    public void writeTextFile(final IPath path, final List<String> stringList, final boolean append)
            throws IOException, CoreException, KiemInitializationException {
        
        System.out.println("+++ WRITE TEXT FILE ");
        
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        IWorkspaceRoot root = workspace.getRoot();
        IFile file = root.getFile(path);
        boolean newFile = false;
        LinkedList<String> oldFileContent = new LinkedList<String>();

        if (!file.exists() || !append) {
            file.create(null, IResource.NONE, null);
            newFile = true;
        }

        String stringPath = file.getRawLocation().toString();

        if (!newFile) {
            // Copy old contents
            FileInputStream fis = new FileInputStream(stringPath);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                oldFileContent.add(line);
            }
            br.close();
            fis.close();
            
            if (oldFileContent.size() == 0) {
                newFile = true;
            }
        }

        PrintWriter out = new PrintWriter(stringPath);

        if (newFile) {
            // Write header
            String markers = "Run"
                    + BENCHMARK_DATA_SEPARATOR
                    + "Tick"
                    + BENCHMARK_DATA_SEPARATOR
                    + this.getProperties()[KIEM_PROPERTY_MARKER + KIEM_PROPERTY_DIFF].getValue()
                            .replace(",", BENCHMARK_DATA_SEPARATOR);
            out.println(markers);
        }
        
        // Possibly consolidate witn new values
        String consolidation = this.getProperties()[KIEM_PROPERTY_CONSOLIDATE
                                                 + KIEM_PROPERTY_DIFF].getValue();
        if (!consolidation.equals(CONSOLIDATE_NONE)) {
            // In this case we need to update the old values and combine them with the new
            // ones of stringList.
            for (int i = 0; i < oldFileContent.size(); i++) {
                String oldLine = oldFileContent.get(i);
                
                String[] oldLineSplit = oldLine.split(BENCHMARK_DATA_SEPARATOR);
                String oldTick = oldLineSplit[1];

                // Try to find a combinable new tick
                for (String newLine : stringList) {
                    String[] newLineSplit = newLine.split(BENCHMARK_DATA_SEPARATOR);
                    String newTick = newLineSplit[1];
                    
                    if (newTick.equals(oldTick)) {
//                        // Now combine all other split values (the size should match)
//                        if (newLineSplit.length != oldLineSplit.length) {
//                            out.close();
//                            throw new KiemInitializationException("Cannot consolidate a different number of values.", false, null);
//                        }
                        
                        for (int ii = 2; ii < oldLineSplit.length; ii++) {
                            String oldValue = oldLineSplit[ii];
                            String newValue = newLineSplit[ii];
                            try {
                                int oldValueInt = 0;
                                int newValueInt = 0;
                                double oldValueDouble = 0.0;
                                double newValueDouble = 0.0;
                                boolean isDouble = false;
                                try {
                                    oldValueInt = Integer.parseInt(oldValue);
                                    newValueInt = Integer.parseInt(newValue);
                                } catch(Exception e) {
                                    isDouble = true;
                                    oldValueDouble = Double.parseDouble(oldValue);
                                    newValueDouble = Double.parseDouble(newValue);
                                }
                                
                                // Consolidate new value into new 
                                if (consolidation.equals(CONSOLIDATE_MIN)) {
                                    if (newValueInt < oldValueInt || newValueDouble < oldValueDouble) {
                                        oldLineSplit[ii] = newValue + "";
                                        oldLineSplit[0] = "-1";
                                    }
                                } else if (consolidation.equals(CONSOLIDATE_MAX)) {
                                    if (newValueInt > oldValueInt || newValueDouble > oldValueDouble) {
                                        oldLineSplit[ii] = newValue + "";
                                        oldLineSplit[0] = "-1";
                                    }
                                } else if (consolidation.equals(CONSOLIDATE_ADD)) {
                                    if (!isDouble) {
                                        oldLineSplit[ii] = oldValueInt + newValueInt + "";
                                    } else {
                                        oldLineSplit[ii] = oldValueDouble + newValueDouble + "";
                                    }
                                    oldLineSplit[0] = "-1";
                                }
                            } catch (Exception e) {
                                // If not combinable, then keep the old value, e.g.,
                                // the values might not be integers (e.g., strings).
                                e.printStackTrace();
                            }
                            System.out.println("+++ WRITE TEXT FILE: U ");
                            
                        }

                        System.out.println("+++ WRITE TEXT FILE: X ");

                        // Construct updated old line
                        String updatedOldLine = "";
                        for (String element : oldLineSplit) {
                            if (updatedOldLine.length() > 0) {
                                updatedOldLine += BENCHMARK_DATA_SEPARATOR;
                            }
                            updatedOldLine += element;
                        }
                        // Replace old line with updated old line
                        oldFileContent.remove(i);
                        oldFileContent.add(i, updatedOldLine);
                        
                        System.out.println("+++ WRITE TEXT FILE: Z ");
                        // We found the tick to consolidate
                        break;
                    }
                }
            }
        }

        System.out.println("+++ WRITE TEXT FILE: 1 ");

        if (!newFile) {
            for (String line : oldFileContent) {
               // Write out old or consolidated contents
               out.println(line);
            }
        }

        System.out.println("+++ WRITE TEXT FILE: 2 ");

        if (newFile || consolidation.equals(CONSOLIDATE_NONE)) {
            // Append new contents (if not already consolidated)
            for (String line : stringList) {
                out.println(line);
            }
        }

        System.out.println("+++ WRITE TEXT FILE: CLOSE ");
        out.close();
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public KiemProperty[] doProvideProperties() {
        final int nProperties = KIEM_PROPERTY_MAX;
        KiemProperty[] properties = new KiemProperty[nProperties];
        properties[KIEM_PROPERTY_RUNS] = new KiemProperty(KIEM_PROPERTY_NAME_RUNS, 10);
        properties[KIEM_PROPERTY_MARKER] = new KiemProperty(KIEM_PROPERTY_NAME_MARKER,
                KIEM_PROPERTY_MARKER_DEFAULT);
        String[] items = { "NONE", "MIN", "MAX", "ADD" };
        properties[KIEM_PROPERTY_CONSOLIDATE] = new KiemProperty(KIEM_PROPERTY_NAME_CONSOLIDATE,
                new KiemPropertyTypeChoice(items), items[0]);

        return properties;
    }

    // -------------------------------------------------------------------------

}
