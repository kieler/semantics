package de.cau.cs.kieler.sim.tcpip;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.osgi.framework.Bundle;

import de.cau.cs.kieler.sim.kiem.data.KiemProperty;
import de.cau.cs.kieler.sim.kiem.extension.JSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.extension.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.json.JSONArray;
import de.cau.cs.kieler.sim.kiem.json.JSONException;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.Signal;
import de.cau.cs.kieler.synccharts.codegen.sc.WorkflowGenerator;

public class DataObserver extends JSONStringDataComponent {

    JSONClient client = null;
    WorkflowGenerator wf = null;

    public String step(String JSONString) throws KiemExecutionException {
        String out = "";
        try {
            client.sndMessage(JSONString);
            out = client.rcvMessage();
            System.out.println(out);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            JSONObject receivedObject = new JSONObject(out);
            JSONArray stateArray = receivedObject.getJSONArray("state");
            String allStates = "";

            for (int i = 0; i < stateArray.length(); i++) {
                if (!(allStates.contains(stateArray.opt(i).toString()))) {
                    allStates += stateArray.opt(i) + ",";
                }
            }
            allStates = allStates.substring(0, allStates.length() - 1);
            System.out.println(allStates);
            receivedObject.remove("state");
            receivedObject.put("state", allStates);
            out = receivedObject.toString();
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return out;
    }

    public void initialize() throws KiemInitializationException {
        // TODO Auto-generated method stub

        // generate Code from SyncChart
        wf.invokeWorkflow();

        // building relative path
        Bundle bundle = Platform.getBundle("de.cau.cs.kieler.synccharts.codegen.sc");
        String bundleLocation = bundle.getLocation().replaceAll("reference:file:", "");

        String compile = "gcc " + wf.getOutPath() + wf.getFileName() + ".c " + wf.getOutPath()
                + wf.getFileName() + "_data.c " + bundleLocation + "simulation/cJSON.c "
                + bundleLocation + "simulation/tcpip.c " + "-I " + bundleLocation + "simulation/ "
                + "-o " + bundleLocation + "simulation/simulation -lm";
        String executable = bundleLocation + "simulation/simulation";
        try {
            // compile and start the c server
            Process process;
            process = Runtime.getRuntime().exec(compile);
            process.waitFor();

            System.out.println("compiling ready");
            process = Runtime.getRuntime().exec(executable);
            // start client
            int clientConnectionTrails = 10;
            client = new JSONClient(Integer.parseInt(getProperties()[0].getValue()));
            while (clientConnectionTrails > 0) {
                if (client.getBoundingStatus()) {
                    // client has connection
                    clientConnectionTrails = 0;
                } else {
                    if (clientConnectionTrails == 1) {
                        System.out.println("Fehler");
                        clientConnectionTrails--;
                    } else {
                        Thread.sleep(500);
                        clientConnectionTrails--;
                    }
                }
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public boolean isObserver() {
        // TODO Auto-generated method stub
        return true;
    }

    public boolean isProducer() {
        // TODO Auto-generated method stub
        return true;
    }

    public String[] provideInterfaceKeys() {
        wf = new WorkflowGenerator();
        String[] signals = getSignals();
        return signals;
    }

    public void wrapup() throws KiemInitializationException {
        try {
            client.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public KiemProperty[] provideProperties() {
        KiemProperty[] properties = new KiemProperty[1];
        properties[0] = new KiemProperty("port", "12345");
        return properties;
    }

    public String[] getSignals() {
        EObject myModel = wf.getModel();
        List<String> tmp = new LinkedList<String>();
        String[] out = new String[0];
        List<Signal> signalList = ((Region) myModel).getInnerStates().get(0).getSignals();

        for (int i = 0; i < signalList.size(); i++) {
            tmp.add(signalList.get(i).getName());
        }
        out = tmp.toArray(new String[tmp.size()]);
        return out;
    }

}
