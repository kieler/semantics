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
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * The KIELER Compiler TCP client interface for compiling EMF models using KiCo. This is a plain
 * Java Application, and no Eclipse Plugin. This application can be run on any computer with
 * Java installed. It communicates with a running Eclipse instance with TCP. This Eclipse instance
 * must have the KiCo Web TCP server up and running in order to properly function. 
 * 
 * @author cmot
 * @kieler.design 2014-06-08 proposed
 * @kieler.rating 2014-06-08 proposed yellow
 * 
 * Example Call:
 * C:\DATA\KEPLER\RemoteKielerCompiler\bin>cat ../ABRO.sct | java RemoteKielerCompiler localhost:5555 sct EXTENDED
 *
 */
public class KielerCompiler {

    /** 
     * @param args
     */
    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("\n"
                    + "******************\n"
                    + "* KielerCompiler *\n"
                    + "******************\n"
                    + "    Usage: KielerCompiler <host>:<port> [Options] <transformation 1> ... <transformation n>\n"
                    + "Example 1: cat <FILE.sct> | java KielerCompiler localhost:5555 EXTENDED CORE > code.c\n"
                    + "Example 2: java KielerCompiler localhost:5555 -f FILE.sct -o code.c EXTENDED CORE\n"
                    + "\n"
                    + "Options:\n"
                    + "-f <filename> : Use a specific input file\n"
                    + "-o <filename> : Use a specific output file\n"
                    + "-v            : Use verbose compilation, do not stop on errors\n"
                    + "-s            : Use strict mode in which only selected transformations are applied\n");
            return;
        }

        String hostAndPort[] = args[0].split(":");
        String host = hostAndPort[0];
        int port = 5555;
        if (hostAndPort.length > 1) {
            try {
                port = Integer.parseInt(hostAndPort[1]);
            } catch(Exception e) {
            }
        } else {
            try {
                port = Integer.parseInt(hostAndPort[1]);
            } catch(Exception e) {
            }
            if (port > 0) {
                // if only the port was specified, assume localhost
                host = "localhost";
            } else {
                // if only the hostname was specified, assume 5555 as the standard port
                port = 5555;
            }
        }
        
        
        String transformations = ""; 
        for (int c = 1; c < args.length; c++) {
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

        System.out.println(remoteCompile(host, port, model, transformations));
    }
    
    
    public static String remoteCompile(String host, int port, String model, String transformations) {
        String compiledModel = "";
        
        try {
            TCPClient client = new KielerCompiler.TCPClient(host, port);
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

    
    
    static private class TCPClient {
        Socket socket = null;

        public TCPClient() throws IOException {
                socket = new Socket("localhost", 5555);
        }
        
        public TCPClient(String host, int port) throws IOException {
                socket = new Socket(host, port);
        }

        void sndMessage(String msg) throws IOException {
                OutputStreamWriter out = new OutputStreamWriter(socket
                                .getOutputStream());
                PrintWriter printWriter = new PrintWriter(out);
                printWriter.print(msg);
                printWriter.flush();
                out.flush();
        }

        String rcvModel() throws IOException {
                InputStreamReader in = new InputStreamReader(socket.getInputStream());
                BufferedReader bufferedReader = new BufferedReader(in);
                
                int lines = Integer.parseInt(bufferedReader.readLine());

                String model = "";
                String s;
                while (lines > 0) {
                    s = bufferedReader.readLine();
                    lines--;
                    if (!model.equals("")) {
                        model += "\n";
                    }
                    model += s;
                }
                
                return model;
        }
        
        void close() throws IOException{
                socket.close();
        }
        
        boolean getBoundingStatus(){
            return socket.isBound();
        }

}
}
