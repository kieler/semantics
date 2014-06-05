/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author cmot
 * @kieler.design 2014-06-08 proposed
 * @kieler.rating 2014-06-08 proposed yellow
 * 
 * Example Call:
 * C:\DATA\KEPLER\RemoteKielerCompiler\bin>cat ../ABRO.sct | java KielerCompiler localhost:5555 sct EXTENDED
 *
 */
public class RemoteKielerCompiler {

    /** 
     * @param args
     */
    public static void main(String[] args) {

        if (args.length < 3) {
            System.out.println("KielerCompiler\n"
                    + "Usage: RemoteKielerCompiler <host>:<port> <file extension> <transformation 1> ... <transformation n>"
                    + "Usage Example: cat <FILE.sct> | java RemoteKielerCompiler localhost:5555 sct EXTENDED");
        }

        String hostAndPort[] = args[0].split(":");
        String host = hostAndPort[0];
        int port = 5555;
        if (hostAndPort.length > 1) {
            try {
                port = Integer.parseInt(hostAndPort[1]);
            } catch(Exception e) {
            }
        }
        
        String fileExtension = args[1];
        
        String transformations = ""; 
        for (int c = 2; c < args.length; c++) {
            if (!transformations.equals("")) {
                transformations +=  ",";
            }
            transformations += args[c];
        }
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String model = "";
        String s;
        try {
            while (((s = in.readLine()) != null)) {
                if (!model.equals("")) {
                    model += "\n";
                }
                model += s;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        //System.out.println("host: " + host);
        //System.out.println("port: " + port);
        //System.out.println("fileExtension: " + fileExtension);
        //System.out.println("transformations: " + transformations);
        //System.out.println("model: " + model);

        System.out.println(remoteCompile(host, port, model, fileExtension, transformations));
    }
    
    
    public static String remoteCompile(String host, int port, String model, String fileExtension, String transformations) {
        String compiledModel = "";
        
        try {
            TCPClient client = new TCPClient(host, port);
            client.sndMessage(fileExtension  + "\n" );
            client.sndMessage(transformations  + "\n");
            client.sndMessage(model.split("\n").length + "\n");
            client.sndMessage(model + "\n");
            
            compiledModel = client.rcvModel();
            
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return compiledModel;
    }

}
