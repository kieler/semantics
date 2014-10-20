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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;

/**
 * The KIELER Compiler TCP client interface for compiling EMF models using KiCo. This is a plain
 * Java Application, and no Eclipse Plugin. This application can be run on any computer with Java
 * installed. It communicates with a running Eclipse instance with TCP. This Eclipse instance must
 * have the KiCo Web TCP server up and running in order to properly function.
 * 
 * @author cmot
 * @kieler.design 2014-06-08 proposed
 * @kieler.rating 2014-06-08 proposed yellow
 * 
 *                Example Call: C:\DATA\KEPLER\KLighD\bin>cat ../ABRO.sct | java KLighD
 *                localhost:4444 -f abro.sct -s 1 -r png -o mode.png
 * 
 */
public class KLighD {

    /**
     * The main method interprets all program parameters and starts the remote compilation.
     * 
     * @param args
     *            the arguments
     */
    public static void main(String[] args) {

        String inputFile = null;
        String outputFile = null;
        ArrayList<String> includeFiles = new ArrayList<String>();

        if (args.length < 1 || args[0].startsWith("-")) {
            System.out
                    .println("\n"
                            + "=====================\n"
                            + "== KLighD Renderer ==\n"
                            + "=====================\n"
                            + "Usage: \n"
                            + "  KLighD <host>:<port> [Options]\n"
                            + "Example 1:\n"
                            + "  cat <FILE.sct> | java -jar KLighD.jar localhost:4444 -r png -s 3 > model.png\n"
                            + "Example 2:\n"
                            + "  java -jar KLighD.jar 4444 -f FILE.sct -o model.png \n"
                            + "Example 3:\n"
                            + "  java -jar KLighD.jar render.sccharts.com -f FILE.sct -o model.png \n" + "\n"
                            + "Options:\n" + "-f <filename> : Use a specific input file\n"
                            + "-i <filename> : Include additional input files\n"
                            + "-o <filename> : Use a specific output file\n"
                            + "-r            : Render as png or svg, default is png\n"
                            + "-s            : Use a specific scale factor, default is 1\n");
            return;
        }

        String hostAndPort[] = args[0].split(":");
        String host = hostAndPort[0];
        int port = 4444;
        if (hostAndPort.length > 1) {
            try {
                port = Integer.parseInt(hostAndPort[1]);
            } catch (Exception e) {
            }
        } else {
            if (hostAndPort[0].toLowerCase().equals("render.sccharts.com")) {
                host = "render.sccharts.com";
                port = 80;
            }
            else {
                try {
                    port = Integer.parseInt(hostAndPort[0]);
                } catch (Exception e) {
                }
                if (port > 0) {
                    // if only the port was specified, assume localhost
                    host = "localhost";
                } else {
                    // if only the hostname was specified, assume 4444 as the standard port
                    port = 4444;
                }
            }
        }

        String render = "png";
        String scale = "1";

        for (int c = 1; c < args.length; c++) {

            String option = args[c];

            if (option.startsWith("-")) {
                if (option.equals("-f") || option.equals("--file")) {
                    if (c + 1 < args.length) {
                        inputFile = args[c + 1];
                        c++;
                    }
                } else if (option.equals("-i") || option.equals("--include")) {
                    if (c + 1 < args.length) {
                        String includeFile = args[c + 1];
                        includeFiles.add(includeFile);
                        c++;
                    }
                } else if (option.equals("-o") || option.equals("--output")) {
                    if (c + 1 < args.length) {
                        outputFile = args[c + 1];
                        c++;
                    }
                } else if (option.equals("-r") || option.equals("--render")) {
                    if (c + 1 < args.length) {
                        render = args[c + 1];
                        c++;
                    }
                } else if (option.equals("-s") || option.equals("--scale")) {
                    if (c + 1 < args.length) {
                        scale = args[c + 1];
                        c++;
                    }
                }
            }

        }

        // System.out.println("host: " + host);
        // System.out.println("port: " + port);
        // System.out.println("inputFile: " + inputFile);
        // System.out.println("outputFile: " + outputFile);
        // System.out.println("verbose: " + verbose);
        // System.out.println("strict: " + strict);
        // System.out.println("transformations: " + transformations);

        ArrayList<String> models = new ArrayList<String>();

        String model = readInputModel(inputFile);
        models.add(model);

        for (String includeFile : includeFiles) {
            String includedModel = readInputModel(includeFile);
            // model += "\n\n" + includedModel;
            models.add(includedModel);
        }
        // System.out.println("model: " + model);

        RenderResult renderResult = remoteRender(host, port, outputFile, render, scale, models);

        if (outputFile == null || outputFile.trim().equals("")) {
            try {
                System.out.write(renderResult.model);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            writeOutputModel(outputFile, renderResult.model);
        }
        if (renderResult.error != null && renderResult.error.length() > 0) {
            if (renderResult.model.length == 0) {
                System.out.println(renderResult.error);
            }
            if (renderResult.model.length == 0) {
                System.exit(1);
            }
        }
        System.exit(0);

    }

    // -------------------------------------------------------------------------

    /**
     * Read input model from file.
     * 
     * @param inputFile
     *            the input file
     * @return the string
     */
    private static String readInputModel(String inputFile) {
        String model = "";
        if (inputFile == null || inputFile.trim().equals("")) {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
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
        } else {
            if ((new File(inputFile)).exists()) {
                BufferedReader reader;
                try {
                    reader = new BufferedReader(new FileReader(inputFile));
                    String line = null;
                    StringBuilder stringBuilder = new StringBuilder();
                    String ls = System.getProperty("line.separator");
                    while ((line = reader.readLine()) != null) {
                        stringBuilder.append(line);
                        stringBuilder.append(ls);
                    }
                    reader.close();
                    model = stringBuilder.toString();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                // file non exits
                System.out.println("Error: Input file not exists.");
                System.exit(1);
            }
        }
        return model;
    }

    // -------------------------------------------------------------------------

    /**
     * Write output model to file.
     * 
     * @param outputFile
     *            the output file
     * @param modelAsText
     *            the model as text
     */
    private static void writeOutputModel(String outputFile, byte[] model) {
        FileOutputStream out;
        try {
            out = new FileOutputStream(outputFile);
            out.write(model);
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Remote compile.
     * 
     * @param host
     *            the host
     * @param port
     *            the port
     * @param model
     *            the model
     * @param transformations
     *            the transformations
     * @return the string
     */
    @SuppressWarnings("deprecation")
    public static RenderResult remoteRender(String host, int port, String outputFile,
            String render, String scale, ArrayList<String> models) {
        RenderResult result = new RenderResult(new byte[0], "");

        try {

            String query = "model=" + URLEncoder.encode(models.get(0));
            if (models.size() > 1) {
                for (int c = 1; c < models.size(); c++) {
                    query += "&include" + (c - 1) + "=" + URLEncoder.encode(models.get(1));
                }
            }
            query += "&scale=" + scale;
            query += "&render=" + render;

            String urlString = "http://" + host + ":" + port + "?" + query;
            // System.out.println(urlString);

            URL url = new URL(urlString);
            URLConnection yc = url.openConnection();

            String errors = yc.getHeaderField("Render-error");
            result.error = errors;

            int len = yc.getContentLength();
            InputStream in = yc.getInputStream();

            byte[] bytes = new byte[len];
            byte[] buffer = new byte[len];
            int leftBytes = len;
            int pos = 0;
            while (leftBytes > 0) {
                int readBytes = in.read(buffer);
                leftBytes = leftBytes - readBytes;
                // copy buffer to bytes
                for (int c = 0; c < readBytes; c++) {
                    bytes[c+pos] = buffer[c]; 
                }
                pos = pos + readBytes;
            }

            yc.getInputStream().close();
            result.model = bytes;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    // -------------------------------------------------------------------------

    /**
     * The Class RenderResult.
     */
    static private class RenderResult {
        public byte[] model;
        public String error;

        RenderResult(byte[] model, String error) {
            this.model = model;
            this.error = error;
        }
    }

    // -------------------------------------------------------------------------

}
