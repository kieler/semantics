/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Kiel University
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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.elk.core.util.Pair;
import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.IKiemEventListener;
import de.cau.cs.kieler.sim.kiem.KiemEvent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent;

/**
 * This BenchmarkTestDataComponent class is supposed to collect benchmark values and compare them to
 * previously recorded ones. It raises an exception if a predefined absolute+relative limit is
 * reached.
 * 
 * @author cmot
 * @kieler.design 2015-06-10 proposed
 * @kieler.rating 2015-06-10 proposed
 * 
 */
public class BenchmarkTestDataComponent extends JSONObjectSimulationDataComponent
        implements IJSONObjectDataComponent, IKiemEventListener {

    public static final String ERRORMESSAGE = "benchError";

    /** The Constant KIEM_PROPERTY_MAX. */
    private static final int KIEM_PROPERTY_MAX = 5;
    private static final String KIEM_PROPERTY_NAME_MARKER = "Benchmark Marker";
    private static final String KIEM_PROPERTY_NAME_ABSOLUTETOLERANCE = "Absolute Tolerance";
    private static final String KIEM_PROPERTY_NAME_RELATIVETOLERANCE = "Relative Tolerance";
    private static final String KIEM_PROPERTY_NAME_CONSOLIDATETICKS = "Consolidate Ticks";
    private static final String KIEM_PROPERTY_NAME_CMDLINEOUTPUTINPUT = "Cmd Line Output/Input";
    private static final int KIEM_PROPERTY_MARKER = 0;
    private static final int KIEM_PROPERTY_ABSOLUTETOLERANCE = 1;
    private static final int KIEM_PROPERTY_RELATIVETOLERANCE = 2;
    private static final int KIEM_PROPERTY_CONSOLIDATETICKS = 3;
    private static final int KIEM_PROPERTY_CMDLINEOUTPUTINPUT = 4;
    private static final String KIEM_PROPERTY_MARKER_DEFAULT =
            "benchTime, benchSource, benchExecutable, benchCompileTime";
    private static final String KIEM_PROPERTY_ABSOLUTETOLERANCE_DEFAULT = "0,0,0,1000";
    private static final String KIEM_PROPERTY_RELATIVETOLERANCE_DEFAULT = "10,10,10,10";
    private static final String KIEM_PROPERTY_CONSOLIDATETICKS_DEFAULT = "1,0,0,0";
    private static final boolean KIEM_PROPERTY_CMDLINEOUTPUTINPUT_DEFAULT = true;

    private static final String BENCHMARK_FILE_ENDING = "bench";
    private static final String BENCHMARK_DATA_SEPARATOR = ":";
    private static final String CMDLINEOUTPUTINPUT_FILE = "benchmark.txt";
    private static final int CMDLINEOUTPUTINPUT_FILE_OFFSET = 32;

    private String[] markerArray;
    private double[] absoluteToleranceArray;
    private double[] relativeToleranceArray;
    private boolean[] consolidateTicksArray;

    /**
     * The cmd line input output mode where we output benchmark information to the command line and
     * read in from benchmark.txt file.
     */
    private boolean cmdLineInputOutput = false;

    /** The gathered benchmark data. */
    private double[] benchmarkData;

    /** The current tick. */
    private static long tick = 0;

    /** The benchmark file path. */
    private IPath benchmarkFilePath = null;

    /** The benchmark file path. */
    private IPath cmdLineBenchmarkFilePath = null;

    /** The tick when benchmark comparison is done. */
    private int benchmarkTick = -1;

    private double[] oldData = null;
    
    // seach for the trace'th occurrence in a global log file
    private static int trace = 0;

    // -------------------------------------------------------------------------

    /**
     * Sets the trace to search for the trace'th occurrence in a global log file.
     *
     * @param trace the new trace
     */
    public static void setTrace(int trace) {
        BenchmarkTestDataComponent.trace = trace;
        SimBenchmarkPlugin.log("BENCHMARK setTrace("+trace+") => trac := " + BenchmarkTestDataComponent.trace);
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new benchmark data component.
     */
    public BenchmarkTestDataComponent() {
    }

    // -------------------------------------------------------------------------

    IPath getCmdLineBenchmarkFilePath( IPath modelFilePath) {
        IPath cmdLineBenchmarkFilePath = null;
        try {
            IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
            cmdLineBenchmarkFilePath = modelFilePath.removeLastSegments(1).append(new Path(CMDLINEOUTPUTINPUT_FILE));
            IFile file = workspaceRoot.getFile(modelFilePath);
        } catch (Exception e) {
        }
        return cmdLineBenchmarkFilePath;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void initialize() throws KiemInitializationException {
        tick = 0;
        benchmarkTick = -1;

        IPath modelFilePath = this.getModelFilePath();
        benchmarkFilePath =
                modelFilePath.removeFileExtension().addFileExtension(BENCHMARK_FILE_ENDING);

        // the generic cmd line benchmark text file to parse from (if this option is set)
        cmdLineBenchmarkFilePath = getCmdLineBenchmarkFilePath(modelFilePath);

        // write the comma separated values into it if these values exist
        String markers = this.getProperties()[KIEM_PROPERTY_MARKER + KIEM_PROPERTY_DIFF].getValue();
        markerArray = markers.split(",");

        // make a new array for the benchmark data
        benchmarkData = new double[markerArray.length];

        String absolute = this.getProperties()[KIEM_PROPERTY_ABSOLUTETOLERANCE + KIEM_PROPERTY_DIFF]
                .getValue();
        String[] absoluteToleranceStringArray = absolute.split(",");
        absoluteToleranceArray = new double[absoluteToleranceStringArray.length];
        int i = 0;
        for (String item : absoluteToleranceStringArray) {
            absoluteToleranceArray[i++] = Double.parseDouble(item);
        }

        String relative = this.getProperties()[KIEM_PROPERTY_RELATIVETOLERANCE + KIEM_PROPERTY_DIFF]
                .getValue();
        String[] relativeToleranceStringArray = relative.split(",");
        relativeToleranceArray = new double[relativeToleranceStringArray.length];
        i = 0;
        for (String item : relativeToleranceStringArray) {
            relativeToleranceArray[i++] = Double.parseDouble(item);
        }

        String consolidateTicks =
                this.getProperties()[KIEM_PROPERTY_CONSOLIDATETICKS + KIEM_PROPERTY_DIFF]
                        .getValue();
        String[] consolidateTicksStringArray = consolidateTicks.split(",");
        consolidateTicksArray = new boolean[consolidateTicksStringArray.length];
        i = 0;
        for (String item : consolidateTicksStringArray) {
            consolidateTicksArray[i++] = (Integer.parseInt(item) != 0);
        }

        cmdLineInputOutput =
                this.getProperties()[KIEM_PROPERTY_CMDLINEOUTPUTINPUT + KIEM_PROPERTY_DIFF]
                        .getValueAsBoolean();

    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void wrapup() throws KiemInitializationException {
        SimBenchmarkPlugin.log("+++ wrapup start: " + tick);

        try {
            possiblyWriteBenchmarkFile(benchmarkFilePath, benchmarkData);
        } catch (IOException e) {
            throw new KiemInitializationException("Could not write Benchmark data.", false, e,
                    true);
        } catch (CoreException e) {
            throw new KiemInitializationException("Could not write Benchmark data.", false, e,
                    true);
        }
        SimBenchmarkPlugin.log("+++ wrapup done ");
        // Reset for the next run!
        BenchmarkTestDataComponent.trace = 0;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean isProducer() {
        return true;
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
     * Gets the marker index for a marker name.
     * 
     * @param markerName
     *            the marker name
     * @return the marker index
     */
    private int getMarkerIndex(String markerName) {
        int i = 0;
        for (String marker : markerArray) {
            marker = marker.trim();
            if (marker.equals(markerName)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public JSONObject doStep(JSONObject jSONObject) throws KiemExecutionException {
        // In the step method open a benchmark file "model.ben" and
        // tick = this.g

        // String benchmarkDataEntry = "";
        // // Run number is the first value
        // benchmarkDataEntry += "" + BENCHMARK_DATA_SEPARATOR;

        // // Tick number is the second value
        // benchmarkDataEntry += "" + (tick++);

        for (String marker : markerArray) {
            // Trim away any white space
            marker = marker.trim();
            // Separation of all values
            // benchmarkDataEntry += BENCHMARK_DATA_SEPARATOR;
            if (jSONObject.has(marker)) {
                Object obj;
                try {
                    obj = jSONObject.get(marker);
                    double newValue = 0;
                    int i = getMarkerIndex(marker);
                    if (obj instanceof String) {
                    }
                    if (obj instanceof Integer) {
                        newValue = (Integer) obj;
                    }
                    if (obj instanceof Double) {
                        newValue = (Double) obj;
                    }
                    if (newValue > 0) {
                        if (consolidateTicksArray[i]) {
                            benchmarkData[i] = benchmarkData[i] + newValue;
                        } else {
                            benchmarkData[i] = newValue;
                        }
                    }

                } catch (JSONException e) {
                    // Ignore errors
                }
            }
        }

        JSONObject returnValue = null;
        try {
            returnValue = compareBenchmarkFile(benchmarkData);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CoreException e) {
            e.printStackTrace();
        } catch (KiemInitializationException e) {
            e.printStackTrace();
        }
        return returnValue;

    }

    // -------------------------------------------------------------------------

    public JSONObject compareBenchmarkFile(final double[] data)
            throws IOException, CoreException, KiemInitializationException {

        if (benchmarkTick > -1 && benchmarkTick != tick) {
            // The benchmark tick has not been reached
            return null;
        }

        IPath path = null;
        if (cmdLineInputOutput) {
            path = cmdLineBenchmarkFilePath;
        } else {
            path = benchmarkFilePath;
        }

        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        IWorkspaceRoot root = workspace.getRoot();
        IFile file = root.getFile(path);

        if (!file.exists()) {
            // Only validate if a *.bench file exists
            SimBenchmarkPlugin.log("+++ NO BENCHMARK FILE EXISTS!");
            return null;
        }

        String stringPath = file.getRawLocation().toString();
        SimBenchmarkPlugin.log("+++ BENCHMARK FILE EXISTS:" + stringPath);


        // Read in old data
        if (cmdLineInputOutput) {
            readInOldDataFromGenericCmdLineTextFile(data, stringPath, benchmarkFilePath);
        } else {
            readInOldDataFromSpecificFile(data, stringPath);
        }

        if (benchmarkTick != tick) {
            SimBenchmarkPlugin.log("+++ BENCHMARK TICK "+benchmarkTick+" NOT REACHED YET ("+tick+")");
            // The benchmark tick has not been reached
            return null;
        }

        System.out.print("+++ COMPARE TO BENCHMARK FILE ... ");

        // Compare old data and current data using tolerance

        // Write header
        JSONObject returnValue = new JSONObject();
        for (String marker : markerArray) {
            // Trim away any white space
            marker = marker.trim();
            int i = getMarkerIndex(marker);

            double oldValue = oldData[i];
            double newValue = data[i];

            double relativeToleranceAddition = ((relativeToleranceArray[i] * oldValue) / 100);
            double overallToleranceAddition = absoluteToleranceArray[i] + relativeToleranceAddition;

            double barrierValue = oldValue + overallToleranceAddition;

            try {
                if (newValue > barrierValue) {
                    // This indicates an error
                    String message = "Violation of benchmark limit for '" + marker
                            + "': old value is '" + oldValue + "', current value is '" + newValue
                            + "' > '" + barrierValue
                            + "' which is the barrier value including tolerance ("
                            + absoluteToleranceArray[i] + " + " + relativeToleranceArray[i] + "%).";
                    SimBenchmarkPlugin.log("BENCHMARK FAILED :" + message);
                    returnValue.accumulate(ERRORMESSAGE, message);
                    return returnValue;
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }

        SimBenchmarkPlugin.log("BENCHMARK OK ");
        try {
            returnValue.accumulate(ERRORMESSAGE, "");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return returnValue;
    }

    // -------------------------------------------------------------------------

    public void readInOldDataFromGenericCmdLineTextFile(final double[] data, String stringPath,
            final IPath modelPath) throws IOException {
        oldData = new double[data.length];
        int traceCntDown = BenchmarkTestDataComponent.trace;

        FileInputStream fis = new FileInputStream(stringPath);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        String line;

        boolean isBenchmarkInformation = false; // true while within benchmark information
        boolean isSeekedBenchmarkInformation = false; // true while within the seeked concrete
                                                      // benchmark information for the current model
        while ((line = br.readLine()) != null) {
            
            line = line.substring(CMDLINEOUTPUTINPUT_FILE_OFFSET);

            if (line.equals(Benchmark.BENCHMARK_CMDLINE_START_DELEMITER)) {
                isBenchmarkInformation = true;
                String fileName = br.readLine();
                fileName = fileName.substring(CMDLINEOUTPUTINPUT_FILE_OFFSET);
                if (fileName.equals(modelPath.toOSString())) {
                    if (traceCntDown > 0) {
                        SimBenchmarkPlugin.log("BENCHMARK TRACE NUMBER COUNT DOWN :" + traceCntDown--);
                    }
                    else {
                        SimBenchmarkPlugin.log("BENCHMARK TRACE NUMBER COUNT DOWN : 0");
                        isSeekedBenchmarkInformation = true;
                        String benchmarkTickString = br.readLine();
                        benchmarkTickString = benchmarkTickString.substring(CMDLINEOUTPUTINPUT_FILE_OFFSET);
                        try {
                            benchmarkTick = Integer.parseInt(benchmarkTickString);
                        } catch (Exception e) {
                        }
                        SimBenchmarkPlugin.log("BENCHMARK benchmarkTick : " + benchmarkTick);
                        line = br.readLine();
                        line = line.substring(CMDLINEOUTPUTINPUT_FILE_OFFSET);
                    }
                }
            } else if (line.equals(Benchmark.BENCHMARK_CMDLINE_END_DELEMITER)) {
                if (isSeekedBenchmarkInformation) {
                    br.close();
                    fis.close();
                    return;
                }
                isBenchmarkInformation = false;
                isSeekedBenchmarkInformation = false;
            }

            if (isSeekedBenchmarkInformation) {
                String[] lineData = line.split(BENCHMARK_DATA_SEPARATOR);
                if (lineData.length == 2) {
                    String dataName = lineData[0];
                    String dataValueString = lineData[1];
                    try {
                        double dataValue = Double.parseDouble(dataValueString);
                        int i = getMarkerIndex(dataName);
                        oldData[i] = dataValue;
                        SimBenchmarkPlugin.log("BENCHMARK "+dataName+" : " + dataValue);
                    } catch (Exception e) {
                    }
                }
            }
        }
        br.close();
        fis.close();
    }

    // -------------------------------------------------------------------------

    public void readInOldDataFromSpecificFile(final double[] data, String stringPath)
            throws IOException {
        oldData = new double[data.length];

        FileInputStream fis = new FileInputStream(stringPath);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        String line;

        String benchmarkTickString = br.readLine();
        try {
            benchmarkTick = Integer.parseInt(benchmarkTickString);
        } catch (Exception e) {
        }

        while ((line = br.readLine()) != null) {
            String[] lineData = line.split(BENCHMARK_DATA_SEPARATOR);
            if (lineData.length == 2) {
                String dataName = lineData[0];
                String dataValueString = lineData[1];
                try {
                    double dataValue = Double.parseDouble(dataValueString);
                    int i = getMarkerIndex(dataName);
                    oldData[i] = dataValue;
                } catch (Exception e) {
                }
            }
        }
        br.close();
        fis.close();
    }

    // -------------------------------------------------------------------------

    public void possiblyWriteBenchmarkFile(final IPath modelPath, final double[] data)
            throws IOException, CoreException, KiemInitializationException {

        SimBenchmarkPlugin.log("+++ WRITE TEXT FILE ");

        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        IWorkspaceRoot root = workspace.getRoot();
        IFile file = root.getFile(modelPath);

        if (cmdLineInputOutput) {
            // Command Line Printout for debugging and for tracking benchmark in regression test
            // environments
            // this printout cna be parsed automatically later for validating benchmark results

            // by convention the first number represents the last tick which is used to for
            // evaluation
            SimBenchmarkPlugin.log(Benchmark.BENCHMARK_CMDLINE_START_DELEMITER);

            SimBenchmarkPlugin.log(modelPath.toOSString());
            SimBenchmarkPlugin.log((tick - 1) + "");
            // String stringPath = file.getRawLocation().toString();
            // SimBenchmarkPlugin.log(stringPath);
            for (String marker : markerArray) {
                String line = "";
                // Trim away any white space
                marker = marker.trim();
                int i = getMarkerIndex(marker);
                line = marker + BENCHMARK_DATA_SEPARATOR + data[i];
                SimBenchmarkPlugin.log(line);
            }
            SimBenchmarkPlugin.log(Benchmark.BENCHMARK_CMDLINE_END_DELEMITER);
        } else {
            // We want separate benchmark files
            if (file.exists()) {
                // We do not want to overwrite *.bench files
                return;
            }

            file.create(null, IResource.NONE, null);

            String stringPath = file.getRawLocation().toString();
            PrintWriter out = new PrintWriter(stringPath);

            // by convention the first number represents the last tick which is used to for
            // evaluation
            out.println(tick - 1);

            for (String marker : markerArray) {
                String line = "";

                // Trim away any white space
                marker = marker.trim();
                int i = getMarkerIndex(marker);

                line = marker + BENCHMARK_DATA_SEPARATOR + data[i];
                out.println(line);
            }

            SimBenchmarkPlugin.log("+++ WRITE TEXT FILE: CLOSE ");
            out.close();
        }

    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public KiemProperty[] doProvideProperties() {
        final int nProperties = KIEM_PROPERTY_MAX;
        KiemProperty[] properties = new KiemProperty[nProperties];
        properties[KIEM_PROPERTY_MARKER] =
                new KiemProperty(KIEM_PROPERTY_NAME_MARKER, KIEM_PROPERTY_MARKER_DEFAULT);
        properties[KIEM_PROPERTY_ABSOLUTETOLERANCE] = new KiemProperty(
                KIEM_PROPERTY_NAME_ABSOLUTETOLERANCE, KIEM_PROPERTY_ABSOLUTETOLERANCE_DEFAULT);
        properties[KIEM_PROPERTY_RELATIVETOLERANCE] = new KiemProperty(
                KIEM_PROPERTY_NAME_RELATIVETOLERANCE, KIEM_PROPERTY_RELATIVETOLERANCE_DEFAULT);
        properties[KIEM_PROPERTY_CONSOLIDATETICKS] = new KiemProperty(
                KIEM_PROPERTY_NAME_CONSOLIDATETICKS, KIEM_PROPERTY_CONSOLIDATETICKS_DEFAULT);
        properties[KIEM_PROPERTY_CMDLINEOUTPUTINPUT] = new KiemProperty(
                KIEM_PROPERTY_NAME_CMDLINEOUTPUTINPUT, KIEM_PROPERTY_CMDLINEOUTPUTINPUT_DEFAULT);
        return properties;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the step number according to the button the user pressed. This is needed to correctly
     * handle history steps or jumps.
     * 
     * @param event
     *            the event
     */
    @SuppressWarnings("unchecked")
    @Override
    public void notifyEvent(final KiemEvent event) {
        if (event.isEvent(KiemEvent.STEP_INFO) && event.getInfo() instanceof Pair) {
            tick = ((Pair<Long, Long>) event.getInfo()).getFirst().longValue();
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Return the types of events this component listens to.
     * 
     * @return the event types, currently only {@code KiemEvent.STEP_INFO}
     */
    @Override
    public KiemEvent provideEventOfInterest() {
        int[] events = { KiemEvent.STEP_INFO };
        KiemEvent event = new KiemEvent(events);
        return event;
    }

    // -------------------------------------------------------------------------
}
