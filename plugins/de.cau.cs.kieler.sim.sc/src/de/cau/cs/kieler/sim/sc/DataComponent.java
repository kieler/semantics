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
 *
 *****************************************************************************/
package de.cau.cs.kieler.sim.sc;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;
import org.osgi.framework.Bundle;

import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONSignalValues;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.automated.AbstractAutomatedProducer;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeChoice;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeFile;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.Signal;
import de.cau.cs.kieler.synccharts.ValueType;
import de.cau.cs.kieler.synccharts.codegen.sc.WorkflowGenerator;

public class DataComponent extends AbstractAutomatedProducer {

    private WorkflowGenerator wf = null;
    private Process process = null;
    private PrintWriter toSC;
    private BufferedReader fromSC;
    private BufferedReader error;
    private String outPath;
    private boolean validation;
    private String fileLocation;

    /**
     * {@inheritDoc}
     */
    public void initialize() throws KiemInitializationException {
        // building path to bundle
        Bundle bundle = Platform.getBundle("de.cau.cs.kieler.synccharts.codegen.sc");

        URL url = null;
        try {
            url = FileLocator.toFileURL(FileLocator.find(bundle, new Path("simulation"), null));
        } catch (IOException e2) {
            // TODO Auto-generated catch block
            e2.printStackTrace();
        }

        String bundleLocation = url.getFile();
        // because of windows vs. linux
        bundleLocation = bundleLocation.replaceAll("[/\\\\]+", "\\" + File.separator);
        if (bundleLocation.startsWith("\\")) {
            bundleLocation = bundleLocation.substring(1);
        }

        try {
            // compile
            String compiler = (getProperties()[0]).getValue();
            String compile = compiler + " " + outPath + "sim.c " + outPath + "sim_data.c "
                    + outPath + "misc.c " + bundleLocation + "cJSON.c " + "-I " + bundleLocation
                    + " " + "-o " + outPath
                    + "simulation -lm -D_SC_NOTRACE -D_SC_SUPPRESS_ERROR_DETECT -D_SC_USE_PRE";
            process = Runtime.getRuntime().exec(compile);

            InputStream stderr = process.getErrorStream();
            InputStreamReader isr = new InputStreamReader(stderr);
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            String errorString = "";
            while ((line = br.readLine()) != null) {
                errorString += "\n" + line;

            }

            int exitValue = process.waitFor();

            if (exitValue != 0) {
                throw new KiemInitializationException("could not compile", true, new Exception(
                        errorString));
            }

            // start compiled sc code
            String executable = outPath + "simulation ";

            process = Runtime.getRuntime().exec(executable);

            toSC = new PrintWriter(new OutputStreamWriter(process.getOutputStream()));
            fromSC = new BufferedReader(new InputStreamReader(process.getInputStream()));
            error = new BufferedReader(new InputStreamReader(process.getErrorStream()));
        } catch (IOException e) {
            System.err.println(e.getMessage());
            process.destroy();
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
            process.destroy();
        }

    }

    /**
     * {@inheritDoc}
     */
    public JSONObject step(final JSONObject jSONObject) throws KiemExecutionException {
        JSONObject out = null;
        try {
            jSONObject.remove("state");
            // boolToInt converts true and t to 1, false and f to 0
            String jSONString = boolToInt(jSONObject).toString();
            toSC.write(jSONString + "\n");
            toSC.flush();
            while (error.ready()) {
                System.out.print(error.read());
            }

            String receivedMessage = fromSC.readLine();
            // print and delete debug information
            receivedMessage = printDebugInfos(receivedMessage);
            while (error.ready()) {
                System.err.print(error.readLine());
            }

            out = new JSONObject(receivedMessage);
        } catch (IOException e) {
            System.err.println(e.getMessage());
            process.destroy();
        } catch (JSONException e) {
            e.printStackTrace();
            process.destroy();
        }

        try {
            JSONArray stateArray = out.getJSONArray("state");
            String allStates = "";

            for (int i = 0; i < stateArray.length(); i++) {
                allStates += stateArray.opt(i) + ",";
            }
            allStates = allStates.substring(0, allStates.length() - 1);
            out.remove("state");
            out.put("state", allStates);
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            System.err.println(e.getMessage());
            process.destroy();
        }

        // System.out.println("incoming " + out.toString());
        // System.out.println("outgoing " + jSONObject.toString());
        return out;
    }

    /**
     * {@inheritDoc}
     */
    public boolean isObserver() {
        return true;
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
    public String[] provideInterfaceKeys() {
        String[] signals = getSignals();
        return signals;
    }

    @Override
    public KiemProperty[] provideProperties() {
        final int numberOfProperties = 3;
        KiemProperty[] properties = new KiemProperty[numberOfProperties];
        KiemPropertyTypeFile compilerFile = new KiemPropertyTypeFile();
        properties[0] = new KiemProperty("compiler", compilerFile, "gcc");
        properties[1] = new KiemProperty("file location", "");
        String[] items = { "complete hierarchie", "shortest hierarchie", "unique incremental name" };
        KiemPropertyTypeChoice choice = new KiemPropertyTypeChoice(items);
        properties[2] = new KiemProperty("label names for SC code", choice, items[0]);

        return properties;
    }

    /**
     * {@inheritDoc}
     */
    public void wrapup() throws KiemInitializationException {
        process.destroy();
        // delete temp folder
        File folder = new File(outPath);
        if (folder.getAbsolutePath().contains("tmp")) {
            boolean folderDeleted = deleteFolder(folder);
            if (folderDeleted) {
                System.out.println("temp folder " + folder + " successfully deleted");
            } else {
                System.err.println("error while deleting temp folder: " + folder);
            }
        }
    }

    @Override
    public JSONObject provideInitialVariables() {

        JSONObject returnObj = new JSONObject();

        if ((getProperties()[1]).getValue().equals("")) {
            String tempDir = System.getProperty("java.io.tmpdir");
            // for Windows (tmpdir ends with backslash)
            if (tempDir.endsWith("\\")) {
                tempDir = tempDir.substring(0, tempDir.length() - 1);
            }
            outPath = tempDir + File.separator + randomString() + File.separator;
        } else {
            outPath = (getProperties()[1]).getValue();
            if (!outPath.endsWith(File.separator)) {
                outPath += File.separator;
            }
        }
        if (validation) {
            wf = new WorkflowGenerator(fileLocation);
        } else {
            wf = new WorkflowGenerator();
        }
        // generate Code from SyncChart
        // true sets the flag for simulation
        wf.invokeWorkflow(true, outPath);
        EObject myModel = wf.getModel();
        List<Signal> signalList = ((Region) myModel).getInnerStates().get(0).getSignals();
        for (int i = 0; i < signalList.size(); i++) {
            try {
                returnObj.accumulate(signalList.get(i).getName(), JSONSignalValues.newValue(false));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return returnObj;
    }

    private static String randomString() {
        final int folderLength = 16;
        String allowedChars = "0123456789abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        int max = allowedChars.length();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < folderLength; i++) {
            int value = random.nextInt(max);
            buffer.append(allowedChars.charAt(value));
        }
        return buffer.toString();
    }

    private String[] getSignals() {
        Region myModel = (Region) (wf.getModel());
        List<String> tmp = new LinkedList<String>();
        String[] out = new String[0];
        List<Signal> signalList = myModel.getInnerStates().get(0).getSignals();

        for (int i = 0; i < signalList.size(); i++) {
            tmp.add(signalList.get(i).getName());
        }
        out = tmp.toArray(new String[tmp.size()]);
        return out;
    }

    private JSONObject boolToInt(JSONObject signals) {
        JSONObject out = signals;
        Region myModel = (Region) (wf.getModel());
        List<Signal> signalList = myModel.getInnerStates().get(0).getSignals();
        for (Signal signal : signalList) {
            if (signal.getType().equals(ValueType.BOOL)) {
                String sig = signal.getName();
                try {
                    JSONObject jSONSig = signals.getJSONObject(sig);
                    if (!jSONSig.isNull("value")) {
                        Object obj = jSONSig.get("value");
                        int bool = 0;
                        if (obj.equals(true) || obj.equals("t")) {
                            bool = 1;
                        }
                        jSONSig.remove("value");
                        jSONSig.put("value", bool);
                        out.remove(sig);
                        out.put(sig, jSONSig);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return out;
    }

    private boolean deleteFolder(final File dir) {
        if (dir.isDirectory()) {
            String[] entries = dir.list();
            for (int x = 0; x < entries.length; x++) {
                File aktFile = new File(dir.getPath(), entries[x]);
                deleteFolder(aktFile);
            }
        }
        return dir.delete();
    }

    private String printDebugInfos(final String s) {
        String out = "";
        String[] debugInfos = s.split("DEBUGEND");
        for (String string : debugInfos[0].split("INFO")) {
            if (!string.equals("")) {
                System.out.println("SC Debug Info: " + string);
            }
        }
        String[] noDebugInfos = s.split("DEBUGEND");
        out = noDebugInfos[noDebugInfos.length - 1];
        return out;
    }

    public List<KiemProperty> produceInformation() {
        return null;
    }

    public String[] getSupportedExtensions() {
        String[] test = { "kixs" };
        return test;
    }

    public void setParameters(List<KiemProperty> properties) throws KiemInitializationException {
        validation = true;
        for (KiemProperty p : properties) {
            if (p.getKey().equals(MODEL_FILE)) {
                fileLocation = p.getValue();
            }
        }
    }

    public int wantsMoreRuns() {
        return 0;
    }

    public int wantsMoreSteps() {
        return 0;
    }
}
