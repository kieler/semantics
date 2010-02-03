package de.cau.cs.kieler.sim.sc;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.osgi.framework.Bundle;

import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONSignalValues;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.Signal;
import de.cau.cs.kieler.synccharts.codegen.sc.WorkflowGenerator;

public class DataComponent extends JSONObjectDataComponent {

    private WorkflowGenerator wf = null;
    private Process process = null;
    private PrintWriter toSC;
    private BufferedReader fromSC;
    private BufferedReader error;

    public JSONObject step(final JSONObject jSONObject) throws KiemExecutionException {
        JSONObject out = null;
        try {
            jSONObject.remove("state");

            System.out.println("jSONObject: " + jSONObject.toString());

            toSC.write(jSONObject.toString() + "\n");
            toSC.flush();
            while (error.ready()) {
                System.out.print(error.read());
            }

            String receivedMessage = fromSC.readLine();
            // print and delete debug information
            receivedMessage = printDebugInfos(receivedMessage);
            System.out.println("in:  " + receivedMessage);
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
            System.out.println("out:" + out);
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            System.err.println(e.getMessage());
            process.destroy();
        }

        return out;
    }

    public void initialize() throws KiemInitializationException {
        // generate Code from SyncChart
        // true sets the flag for simulation
        wf.invokeWorkflow(true);
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
        // because of windows vs Linux
        bundleLocation = bundleLocation.replaceAll("[/\\\\]+", "\\" + File.separator);
        if (bundleLocation.startsWith("\\")){
        	bundleLocation = bundleLocation.substring(1);
        }

        try {
            // compile
            String compiler = (getProperties()[0]).getValue();
            String compile = compiler + " " + wf.getOutPath() + "sim.c " + wf.getOutPath()
                    + "sim_data.c " + wf.getOutPath() + "misc.c " + bundleLocation + "cJSON.c "
                    + "-I " + bundleLocation + " " + "-o " + wf.getOutPath()
                    + "simulation -lm -Dexternflags";
            System.out.println(compile);
            process = Runtime.getRuntime().exec(compile);
            process.waitFor();

            if (process.exitValue() != 0) {
                StringBuffer b = new StringBuffer();
                InputStreamReader err = new InputStreamReader(process.getErrorStream(), "UTF8");

                int character;
                while ((character = err.read()) > -1) {
                    b.append((char) character);
                }

                throw new KiemInitializationException("could not compile", true, new Exception(b
                        .toString()));
            }

            // start compiled sc code
            String executable = wf.getOutPath() + "simulation ";
            System.out.println("start: " + executable);

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

    public boolean isObserver() {
        return true;
    }

    public boolean isProducer() {
        return true;
    }

    public String[] provideInterfaceKeys() {
        wf = new WorkflowGenerator();
        String[] signals = getSignals();
        return signals;
    }

    @Override
    public KiemProperty[] provideProperties() {
        KiemProperty[] properties = new KiemProperty[1];
        properties[0] = new KiemProperty("compiler", "gcc");
        return properties;
    }

    public void wrapup() throws KiemInitializationException {
        // try {
        // client.close();
        process.destroy();
        // delete temp folder
        File folder = new File(wf.getOutPath());
        if (folder.getAbsolutePath().contains("tmp")) {
            /* Deleting folder for debugging disabled
             * 
            boolean folderDeleted = deleteFolder(folder);
            if (folderDeleted) {
                System.out.println("temp folder " + folder + " successfully deleted");
            } else {
                System.err.println("error while deleting temp folder: " + folder);
            }
            */
        }
    }

    @Override
    public JSONObject provideInitialVariables() {
        JSONObject returnObj = new JSONObject();
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

    @SuppressWarnings("unused")
    /*
     *  just unused for debugging
     */
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

    private String printDebugInfos(String s) {
        String out = "";
        String[] debugInfos = s.split("DEBUGEND");
        for (String string : debugInfos[0].split("INFO")) {
            System.out.println("SC Debug Info: " + string);
        }
        String[] noDebugInfos = s.split("DEBUGEND");
        out = noDebugInfos[noDebugInfos.length - 1];
        return out;
    }
}
