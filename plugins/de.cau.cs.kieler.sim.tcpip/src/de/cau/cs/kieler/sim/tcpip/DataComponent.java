package de.cau.cs.kieler.sim.tcpip;

import java.io.File;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.osgi.framework.Bundle;

import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONSignalValues;
import de.cau.cs.kieler.sim.kiem.extension.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.extension.KiemInitializationException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.Signal;
import de.cau.cs.kieler.synccharts.codegen.sc.WorkflowGenerator;

public class DataComponent extends JSONObjectDataComponent {

    JSONClient client = null;
    WorkflowGenerator wf = null;
    Process process = null;

    public JSONObject step(final JSONObject jSONObject) throws KiemExecutionException {
        JSONObject out = null;
        try {
            jSONObject.remove("state");
            System.out.println("jSONObject: " + jSONObject.toString());
            client.sndMessage(jSONObject.toString());
            String receivedMessage = client.rcvMessage();
            System.out.println("rcv from server: " + receivedMessage);
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

        String bundleLocation = url.getPath();

        // find free port
        boolean findNewPort = false;
        int port = 0;
        do {
            Random random = new Random();
            port = random.nextInt(65535);
            try {
                testPort(port);
                findNewPort = true;
            } catch (IOException e1) {
                findNewPort = false;
            }
        } while (findNewPort);

        String compile = "gcc " + wf.getOutPath() + "sim.c " + wf.getOutPath() + "sim_data.c "
                + bundleLocation + "cJSON.c " + bundleLocation + "tcpip.c " + "-I "
                + bundleLocation + " " + "-o " + wf.getOutPath() + "simulation -lm";
        String executable = wf.getOutPath() + "simulation " + port;
        System.out.println("start: " + executable);

        try {
            // compile and start the c server
            process = Runtime.getRuntime().exec(compile);
            process.waitFor();
            process = Runtime.getRuntime().exec(executable);
            // start client
            int clientConnectionTrails = 10;
            // client = new JSONClient(Integer.parseInt(getProperties()[0].getValue()));
            client = new JSONClient(port);
            while (clientConnectionTrails > 0) {
                if (client.getBoundingStatus()) {
                    // client has connection
                    clientConnectionTrails = 0;
                } else {
                    if (clientConnectionTrails == 1) {
                        System.out.println("error while trying to connect");
                    } else {
                        Thread.sleep(500);
                    }
                    clientConnectionTrails--;
                }
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.err.println(e.getMessage());
            process.destroy();
            initialize();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            System.err.println(e.getMessage());
            process.destroy();
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
            process.destroy();
            // delete temp folder
            File folder = new File(wf.getOutPath());
            if (folder.getAbsolutePath().contains("tmp")) {
                boolean folderDeleted = deleteFolder(folder);
                if (folderDeleted) {
                    System.out.println("temp folder " + folder + "successfully deleted");
                } else {
                    System.err.println("error while deleting temp folder: " + folder);
                }
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
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

    public boolean testPort(int port) throws IOException {
        boolean out = false;
        Socket socket = null;
        try {
            socket = new Socket();
            socket.connect(new InetSocketAddress("localhost", port), 1000);

        } finally {
            if (socket != null) {
                socket.close();
                out = true;
            }
        }
        return out;
    }

    public boolean deleteFolder(File dir) {
        if (dir.isDirectory()) {
            String[] entries = dir.list();
            for (int x = 0; x < entries.length; x++) {
                File aktFile = new File(dir.getPath(), entries[x]);
                deleteFolder(aktFile);
            }
            if (dir.delete())
                return true;
            else
                return false;
        } else {
            if (dir.delete())
                return true;
            else
                return false;
        }
    }

}
