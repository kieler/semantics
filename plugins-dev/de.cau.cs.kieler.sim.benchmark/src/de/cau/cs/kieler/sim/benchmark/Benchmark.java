/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.benchmark;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.util.LinkedList;

import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent;
import de.cau.cs.kieler.sim.kiem.util.KiemUtil;

/**
 * This Benchmark class is supposed to contain basic benchmark constants and code.
 * 
 * @author cmot
 * @kieler.design 2012-11-28 proposed
 * @kieler.rating 2012-11-28 proposed
 * 
 */
public class Benchmark {
    
    /** The Constant BENCHMARK_CMDLINE_START_DELEMITER. */
    public static final String BENCHMARK_CMDLINE_START_DELEMITER = "<#### BENCHMARK ####>";

    /** The Constant BENCHMARK_CMDLINE_END_DELEMITER. */
    public static final String BENCHMARK_CMDLINE_END_DELEMITER = "</#### BENCHMARK ####>";

    /** The Constant BENCHMARK_SIGNAL. */
    public static final String BENCHMARK_SIGNAL_TIME = "benchTime";

    /** The Constant BENCHMARK_SIGNAL. */
    public static final String BENCHMARK_SIGNAL_COMPILETIME = "benchCompileTime";

    /** The Constant BENCHMARK_SIGNAL. */
    public static final String BENCHMARK_SIGNAL_SOURCE = "benchSource";

    /** The Constant BENCHMARK_SIGNAL. */
    public static final String BENCHMARK_SIGNAL_EXECUTABLE = "benchExecutable";

    /** A Constant used for more acurate normed benchmark results. */
    public static final int BENCHMARK_NORMED_RUNS = 100000;

    /** The Constant BENCHMARK_COMPILER_OPTIONS. */
    static final String BENCHMARK_COMPILER_OPTIONS = "-O0 -c -o"; 

    /** The Constant BENCHMARK_PREFIX. */
    static final String BENCHMARK_PREFIX = "bench";


    //--------------------------------------------------------------------------

    /**
     * Adds timing measurement code.
     * 
     * @param filePath
     *            the file path
     * @return the string
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public static String addTimingCode(final String cCodeString, final String tickFunctionName) throws IOException {
        StringBuilder returnCCodeString = new  StringBuilder();
        
        String[] lines = cCodeString.split("\n");
        for (String lineIn : lines) {

            // Before the main function, add
            // #include<cycle.h>
            // ticks t0, t1;
            if (lineIn.contains("int main")) {
              returnCCodeString.append("#include <usertime.h>\n");
              returnCCodeString.append("double t;\n");
            }
            
            // double elapsed(ticks t1, ticks t0);

            // Instead of the tick() function add
            // t0 = getticks();
            // tick();
            // t1 = getticks();
            // value = cJSON_CreateObject();
            // cJSON_AddItemToObject(value, "value",
            // cJSON_CreateNumber((double)((double)(t1)-(double)(t0))));
            // cJSON_AddItemToObject(value, "present", cJSON_CreateTrue());
            // cJSON_AddItemToObject(output, "cycles", value);
            if (lineIn.contains(tickFunctionName + "();")) {
                returnCCodeString.append("resetusertime();");
                returnCCodeString.append(tickFunctionName + "();");
                returnCCodeString.append("t =  getusertime();");
                // fileContent.add("value = cJSON_CreateObject();");
                // fileContent.add("cJSON_AddItemToObject(value, \"value\", "
                // + "cJSON_CreateNumber((double)((double)(t1)-(double)(t0))));");
                // fileContent.add("cJSON_AddItemToObject(value, \"present\", cJSON_CreateTrue());");
                returnCCodeString.append("cJSON_AddItemToObject(output, \"" + Benchmark.BENCHMARK_SIGNAL_TIME + "\""
                        + ", cJSON_CreateNumber((double)(((double) t)*1)));");
            } else {
                returnCCodeString.append(lineIn + "\n");
            }
        }
        return returnCCodeString.toString();
    }
    
    // ---------------------------------------------------------------------------------

    
    /**
     * Adds timing measurement code.
     * 
     * @param filePath
     *            the file path
     * @return the string
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public static String addTimingCodeFile(final String filePath, final String tickFunctionName) throws IOException {

        String newFilePath = filePath.replace(".c", ".timing.c");

//        LinkedList<String> fileContent = new LinkedList<String>();

        String fileContent = "";
        
        // Load original SC file
        FileInputStream fis = new FileInputStream(filePath);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        String lineIn;
        while ((lineIn = br.readLine()) != null) {
            fileContent = lineIn + "\n";
        }
        br.close();
        fis.close();
        
        String fileOutContent = addTimingCode(fileContent, tickFunctionName);
        
        // Write out SC modified file
        PrintWriter out = new PrintWriter(newFilePath);
        out.print(fileOutContent);
        // for (String lineOut : fileContent) {
        // out.println(lineOut);
        // }
        out.close();

        return newFilePath;
    }
    
    

    // -------------------------------------------------------------------------

    /**
     * Benchmark the file size of the executable object file including the tick function only.
     * @throws KiemInitializationException 
     */
    public static long benchmarkExecutable(URL tickMethodFile, String compiler, boolean isWindows) throws KiemInitializationException {
        File executable = null; // this contains only the object file
        String compile = "";

        try {
            
//            String outputFolder = KiemUtil.generateRandomTempOutputFolder();

           String tickeMethodFilePath = tickMethodFile.toString().replace("file:/","").replace("file:", "");// getPath();
           
           tickeMethodFilePath = tickeMethodFilePath.replaceAll("[/\\\\]+", "\\" + File.separator);
           if (tickeMethodFilePath.startsWith("\\")) {
               tickeMethodFilePath = tickeMethodFilePath.substring(1);
           }
           
          executable = File.createTempFile(BENCHMARK_PREFIX, ".o");
          compile =
                  compiler + " " + tickeMethodFilePath + " "
                        //  + " -D_NO_EXTERN_DEFINITIONS -D_NO_FUNCTION_DEFINITIONS "
                          + BENCHMARK_COMPILER_OPTIONS + " " + executable;

//            if (!isWindows) {
//                // Non-Windows
//                executable = File.createTempFile(BENCHMARK_PREFIX, ".o");
//                compile =
//                        compiler + " " + tickMethodFile.getPath()  + " "
//                              //  + " -D_NO_EXTERN_DEFINITIONS -D_NO_FUNCTION_DEFINITIONS "
//                                + BENCHMARK_COMPILER_OPTIONS + " " + executable;
//            } else {
//                // Windows
//                executable = File.createTempFile(BENCHMARK_PREFIX, ".o");
//                compile =
//                        compiler + " " + tickMethodFile.getPath().substring(1) + " "
//                               // + " -D_NO_EXTERN_DEFINITIONS -D_NO_FUNCTION_DEFINITIONS "
//                                + BENCHMARK_COMPILER_OPTIONS + " " + executable;
//            }
            
            
          SimBenchmarkPlugin.log("M2M 17 benchmak: " + compile);

            // Compile the code with the settings from above
            Process process = Runtime.getRuntime().exec(compile);
            InputStream stderr = process.getErrorStream();
            InputStreamReader isr = new InputStreamReader(stderr);
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            StringBuilder errorString = new StringBuilder();
            while ((line = br.readLine()) != null) {
                errorString.append("\n" + line);
            }
            SimBenchmarkPlugin.log("M2M 18");

            int exitValue = process.waitFor();

            if (exitValue != 0) {
                throw new KiemInitializationException("Could not compile benchmark object file: " + errorString, true,
                        new Exception(errorString.toString()));
            } else {
                    File currentFile = new File(executable.getPath());
                    if (currentFile.exists()) {
                        return currentFile.length();
                    }
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return -1;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks whether the system is based on windows.
     * 
     * @return true, if is windows
     */
    public static boolean isWindows() {
        String os = System.getProperty("os.name").toLowerCase();
        return (os.indexOf("win") >= 0);
    }

    // -------------------------------------------------------------------------

    /**
     * Checks whether the system is based on Mac OSX.
     * 
     * @return true, if is Max OSX
     */
    public static boolean isMac() {
        String os = System.getProperty("os.name").toLowerCase();
        return (os.indexOf("mac") >= 0);
    }

    // -------------------------------------------------------------------------

}
