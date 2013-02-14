/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

import de.cau.cs.kieler.sim.kiem.util.KiemUtil;

/**
 * This class is intended to compile and execute SC code.
 * 
 * @author cmot
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow cmot
 */
public class SCExecution {

    /** The Constant COMPILER_DEFAULT. */
    private static final String COMPILER_DEFAULT = "gcc";

    /** The Constant EXECUTABLE_PREFIX. */
    private static final String EXECUTABLE_PREFIX = "SC-GENERATED-EXECUTABLE-";

    /** The Constant BENCHMARK_SIGNAL. */
    public static final String BENCHMARK_SIGNAL_CYCLES = "benchCycles";

    /** The Constant BENCHMARK_SIGNAL. */
    public static final String BENCHMARK_SIGNAL_SOURCE = "benchSource";

    /** The Constant BENCHMARK_SIGNAL. */
    public static final String BENCHMARK_SIGNAL_EXECUTABLE = "benchExecutable";

    /** The execution process. */
    private Process executionProcess = null;

    /** The execution interface to sc. */
    private PrintWriter executionInterfaceToSC;

    /** The execution interface from sc. */
    private BufferedReader executionInterfaceFromSC;

    /** The execution interface error. */
    private BufferedReader executionInterfaceError;

    /** The compile error. */
    private String compileError;

    /** The output path. */
    private String outputPath;

    /** The compiled. */
    private boolean compiled;

    /** The started. */
    private boolean started;

    /** The cyclecount flag. */
    private boolean cycleCount;

    /** The source file size. */
    private long sourceFileSize;

    /** The executable file size. */
    private long executableFileSize;

    /** The accumulated cycles since last reset. */
    private int cycles;

    /** The compiler. */
    private String compiler;

    /** The executable name. */
    private String executableName;
    
    /** The path for sc. */
    private static final String SC_PATH = "sc";
    
    /** The path to scl. */
    private static final String SCL_PATH = "scl"; 

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new SCExecution with a random outputPath.
     * 
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public SCExecution() throws IOException {
        setCompiler(COMPILER_DEFAULT);
        setCompiled(false);
        setStarted(false);
        cycleCount = false;
        setOutputPath(KiemUtil.generateRandomTempOutputFolder());
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new SCExecution with a concrete outputPath.
     * 
     * @param outputPath
     *            the output path
     */
    public SCExecution(final String outputPath) {
        setCompiler(COMPILER_DEFAULT);
        setCompiled(false);
        setStarted(false);
        cycleCount = false;
        setOutputPath(outputPath);
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new SCExecution with a concrete outputPath.
     * 
     * @param outputPath
     *            the output path
     * @param cycleCount
     *            the cycle count flag if measuring should be turned on
     */
    public SCExecution(final String outputPath, final boolean cycleCount) {
        setCompiler(COMPILER_DEFAULT);
        setCompiled(false);
        setStarted(false);
        this.cycleCount = cycleCount;
        setOutputPath(outputPath);
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Compile the filePaths SC files together with the bundled SC core files within the given
     * outputPath folder. The executable will be randomly named and can later be started after a
     * successful compilation.
     *
     * @param filePaths the file paths
     * @param debug additional debug output before the signal output
     * @param scl a flag indicating that SC light (scl) should be used instead of (standard) SC
     * @throws IOException Signals that an I/O exception has occurred.
     * @throws InterruptedException the interrupted exception
     */
    public void compile(final List<String> filePaths, final boolean debug, final boolean scl)
            throws IOException, InterruptedException {

        List<String> usedfilePaths = filePaths;

        if (this.cycleCount) {
            List<String> filePathsCycleCounter = new LinkedList<String>();
            for (String filePath : filePaths) {
                filePathsCycleCounter.add(addCycleCounterCode(filePath));
            }
            usedfilePaths = filePathsCycleCounter;
        }

        // reset successful compiled flag
        setCompiled(false);
        // choose a random name for the compiled executable
        setExecutableName(EXECUTABLE_PREFIX + KiemUtil.randomString());

        // building path to bundle
        Bundle bundle = Platform.getBundle(SCPlugin.PLUGIN_ID);

        URL url = null;
        try {
            // the SC path is the path to the needed SC c files
            if (scl) {
                url = FileLocator.toFileURL(FileLocator.find(bundle, new Path(SCL_PATH), null));
            } else {
                url = FileLocator.toFileURL(FileLocator.find(bundle, new Path(SC_PATH), null));
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        if (url == null) {
            return;
        }
        String bundleLocation = url.getFile();

        // Windows vs. Linux: Exchange possibly wrong slash/backslash
        bundleLocation = bundleLocation.replaceAll("[/\\\\]+", "\\" + File.separator);
        if (bundleLocation.startsWith("\\")) {
            bundleLocation = bundleLocation.substring(1);
        }
        for (String filePath : usedfilePaths) {
            filePath = filePath.replaceAll("[/\\\\]+", "\\" + File.separator);
            if (filePath.startsWith("\\")) {
                filePath = filePath.substring(1);
            }
        }

        try {
            String compile = compiler;

            // Measure source file size
            sourceFileSize = 0;
            executableFileSize = 0;

            StringBuffer compileBuf = new StringBuffer();
            for (String filePath : usedfilePaths) {
                compileBuf.append(" " + "\"" + filePath + "\"");
                File currentFile = new File(filePath);
                sourceFileSize += currentFile.length();
            }

            compile += compileBuf.toString();

            // If Cycle counting activated include the header
            if (this.cycleCount) {
                compile += " " +  "\"" + bundleLocation + "cycle.h\" ";
            }

            compile += " "
                    // + outPath
                    // + "sim.c "
                    // + outPath
                    // + "sim_data.c "
                    // + outPath
                    // + "misc.c "
                    +    "\"" + bundleLocation + "sc.c\" " +  "\"" + bundleLocation + "cJSON.c\" " 
                    + " -I "
                    +  bundleLocation + " " + "-o " +  "\"" + outputPath + getExecutableName() 
                    +  "\""  
                    // -m32 = 32 bit compatibility mode to prevent compiler errors on
                    // 64bit machines/architectures.
                    // + " -lm -D_SC_NOTRACE  -D_SC_USE_PRE -D_SC_NOASSEMBLER";
                    + " -lm  -D_SC_USE_PRE -D_SC_NOASSEMBLER";

            // If debugging AND if no cycle counting, then provide a trace for the
            // SC debug console
            if (!debug || cycleCount) {
                compile += " -D_SC_NOTRACE ";
            }

            // -D_SC_SUPPRESS_ERROR_DETECT
            // cmot: removed this option for now because of strange error
            // in causality-test @ #define _checkEMIT(s) in sc-generic.h
            // EMAIL to rvh on 16. Jul 2012

            /*
             * -m32"; REMOVED due to error with surefire on 64bit machine:
             * 
             * In file included from /usr/include/string.h:27:0, build 11-Jun-2012 11:42:26 from
             * /var
             * /atlassian/bamboo-data/xml-data/build-dir/KIELER-PLUGIN2-JOB1/test/de.cau.cs.kieler
             * .s.
             * sim.sc.test/target/work/data/test-s/05-simpletransition-inputoutput-communication.c
             * :16: build 11-Jun-2012 11:42:26 /usr/include/features.h:323:26: fatal error:
             * bits/predefs.h: No such file or directory build 11-Jun-2012 11:42:26 compilation
             * terminated. build 11-Jun-2012 11:42:26 In file included from
             * /usr/include/string.h:27:0, build 11-Jun-2012 11:42:26 from
             * /var/atlassian/bamboo-data
             * /xml-data/build-dir/KIELER-PLUGIN2-JOB1/test/de.cau.cs.kieler
             * .s.sim.sc.test/target/work
             * /configuration/org.eclipse.osgi/bundles/67/1/.cp/sc/sc.c:14: build 11-Jun-2012
             * 11:42:26 /usr/include/features.h:323:26: fatal error: bits/predefs.h: No such file or
             * directory build 11-Jun-2012 11:42:26 compilation terminated. build 11-Jun-2012
             * 11:42:26 In file included from /usr/include/string.h:27:0, build 11-Jun-2012 11:42:26
             * from
             * /var/atlassian/bamboo-data/xml-data/build-dir/KIELER-PLUGIN2-JOB1/test/de.cau.cs.
             * kieler
             * .s.sim.sc.test/target/work/configuration/org.eclipse.osgi/bundles/67/1/.cp/sc/cJSON
             * .c:26: build 11-Jun-2012 11:42:26 /usr/include/features.h:323:26: fatal error:
             * bits/predefs.h: No such file or directory build 11-Jun-2012 11:42:26 compilation
             * terminated.
             */
            System.out.println(compile);
            executionProcess = Runtime.getRuntime().exec(compile);

            InputStream stderr = executionProcess.getErrorStream();
            InputStreamReader isr = new InputStreamReader(stderr);
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            setCompileError("");
            while ((line = br.readLine()) != null) {
                setCompileError(getCompileError() + "\n" + line);
            }
            br.close();

            // TODO: -D_SC_SUPPRESS_ERROR_DETECT: error messages detecting
            // (use own buffer)
            int exitValue = executionProcess.waitFor();

            // Test if compiled file exists
            File file = new File(outputPath + getExecutableName());
            if (!file.exists()) {
                if (exitValue != 0) {
                    throw new IOException("Could not compile the generated C code (" + exitValue
                            + ").\nCheck that the path to your Workspace/Eclipse"
                            + " installation does not contain any white spaces.\n\n"
                            + getCompileError());
                }
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
            if (executionProcess != null) {
                executionProcess.destroy();
            }
            throw e;

        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
            if (executionProcess != null) {
                executionProcess.destroy();
            }
            throw e;
        }

        // set successful compiled flag
        setCompiled(true);
    }

    // -------------------------------------------------------------------------

    /**
     * Start execution and start the execution process.
     * 
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public void startExecution() throws IOException {
        // reset successful started flag
        setStarted(false);

        // if the sc code was not successfully compiled yet, do not try to
        // execute it
        if (!compiled) {
            throw new IOException("SC code was not compiled yet.");
        }

        File file = new File(outputPath + getExecutableName());
        if (file.exists()) {
            executableFileSize = file.length();
        } else {
            // The Windows case
            file = new File(outputPath + getExecutableName() + ".exe");
            if (file.exists()) {
                executableFileSize = file.length();
            }
        }

        // start compiled sc code
        String executable = outputPath + getExecutableName() + " ";
        // executable = "C:\\Users\\delphino\\AppData\\Local\\Temp\\SC.exe";

        executionProcess = Runtime.getRuntime().exec(executable);

        setExecutionInterfaceToSC(new PrintWriter(new OutputStreamWriter(
                executionProcess.getOutputStream())));
        setExecutionInterfaceFromSC(new BufferedReader(new InputStreamReader(
                executionProcess.getInputStream())));
        setExecutionInterfaceError(new BufferedReader(new InputStreamReader(
                executionProcess.getErrorStream())));

        // set successful started flag
        setStarted(true);
    }

    // -------------------------------------------------------------------------

    // If Cycle counting activated, do the following on all sc files:
    // 1. include header #include<cycle.h>
    // 2. add "ticks t0, t1;" as global variables
    // 3. search for "tick();" and surround with
    // t0 = getticks();
    // tick();
    // t1 = getticks();
    // value = cJSON_CreateObject();
    // cJSON_AddItemToObject(value, "value",
    // cJSON_CreateNumber((double)((double)(t1)-(double)(t0))));
    // cJSON_AddItemToObject(value, "present", cJSON_CreateTrue());
    // cJSON_AddItemToObject(output, "cycles", value);

    /**
     * Adds cycle counter code.
     * 
     * @param filePath
     *            the file path
     * @return the string
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public static String addCycleCounterCode(final String filePath) throws IOException {

        String newFilePath = filePath.replace(".c", ".cyclecount.c");

        LinkedList<String> fileContent = new LinkedList<String>();

        // Load original SC file
        FileInputStream fis = new FileInputStream(filePath);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        String lineIn;
        while ((lineIn = br.readLine()) != null) {

            // Before the main function, add
            // #include<cycle.h>
            // ticks t0, t1;
            if (lineIn.contains("int main")) {
                fileContent.add("#include<cycle.h>");
                fileContent.add("ticks t0, t1;");
            }

            // Instead of the tick() function add
            // t0 = getticks();
            // tick();
            // t1 = getticks();
            // value = cJSON_CreateObject();
            // cJSON_AddItemToObject(value, "value",
            // cJSON_CreateNumber((double)((double)(t1)-(double)(t0))));
            // cJSON_AddItemToObject(value, "present", cJSON_CreateTrue());
            // cJSON_AddItemToObject(output, "cycles", value);
            if (lineIn.contains("tick();")) {
                fileContent.add("t0 = getticks();");
                fileContent.add("tick();");
                fileContent.add("t1 = getticks();");
                // fileContent.add("value = cJSON_CreateObject();");
                // fileContent.add("cJSON_AddItemToObject(value, \"value\", "
                // + "cJSON_CreateNumber((double)((double)(t1)-(double)(t0))));");
                // fileContent.add("cJSON_AddItemToObject(value, \"present\", cJSON_CreateTrue());");
                fileContent.add("cJSON_AddItemToObject(output, \"" + BENCHMARK_SIGNAL_CYCLES + "\""
                        + ", cJSON_CreateNumber((double)((double)(t1)-(double)(t0))));");
            } else {
                fileContent.add(lineIn);
            }
        }
        br.close();
        fis.close();

        // Write out SC modified file
        PrintWriter out = new PrintWriter(newFilePath);
        for (String lineOut : fileContent) {
            out.println(lineOut);
        }
        out.close();

        return newFilePath;
    }

    // -------------------------------------------------------------------------
    /**
     * Stop execution and destroy the execution process.
     * 
     * @param tryToDelete
     *            the try to delete
     */
    public void stopExecution(final boolean tryToDelete) {
        // reset successful started flag
        setStarted(false);

        // close streams
        getExecutionInterfaceToSC().close();
        try {
            getExecutionInterfaceFromSC().close();
        } catch (IOException e) {
            // ignore errors
        }
        try {
            getExecutionInterfaceError().close();
        } catch (IOException e) {
            // ignore errors
        }

        // destroy process
        executionProcess.destroy();

        if (tryToDelete) {
            // (try to) delete temp folder
            File folder = new File(outputPath);
            if (folder.getAbsolutePath().contains(System.getProperty("java.io.tmpdir"))) {
                KiemUtil.deleteFolder(folder);
            }
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the executable name.
     * 
     * @param executableName
     *            the new executable name
     */
    public void setExecutableName(final String executableName) {
        this.executableName = executableName;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the executable name.
     * 
     * @return the executable name
     */
    public String getExecutableName() {
        return executableName;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the compiler.
     * 
     * @return the compiler
     */
    public String getCompiler() {
        return compiler;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the compiler.
     * 
     * @param compiler
     *            the new compiler
     */
    public void setCompiler(final String compiler) {
        this.compiler = compiler;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the output path.
     * 
     * @return the output path
     */
    public String getOutputPath() {
        return outputPath;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the output path.
     * 
     * @param outputPath
     *            the new output path
     */
    public void setOutputPath(final String outputPath) {
        this.outputPath = outputPath;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the execution interface to sc.
     * 
     * @return the execution interface to sc
     */
    public PrintWriter getExecutionInterfaceToSC() {
        return executionInterfaceToSC;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the execution interface to sc.
     * 
     * @param toSC
     *            the new execution interface to sc
     */
    private void setExecutionInterfaceToSC(final PrintWriter toSC) {
        this.executionInterfaceToSC = toSC;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the execution interface from sc.
     * 
     * @return the execution interface from sc
     */
    public BufferedReader getExecutionInterfaceFromSC() {
        return executionInterfaceFromSC;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the execution interface from sc.
     * 
     * @param fromSC
     *            the new execution interface from sc
     */
    private void setExecutionInterfaceFromSC(final BufferedReader fromSC) {
        this.executionInterfaceFromSC = fromSC;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the execution interface error.
     * 
     * @return the execution interface error
     */
    public BufferedReader getExecutionInterfaceError() {
        return executionInterfaceError;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the execution interface error.
     * 
     * @param error
     *            the new execution interface error
     */
    private void setExecutionInterfaceError(final BufferedReader error) {
        this.executionInterfaceError = error;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the compile error.
     * 
     * @return the compile error
     */
    public String getCompileError() {
        return compileError;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the compile error.
     * 
     * @param compileError
     *            the new compile error
     */
    private void setCompileError(final String compileError) {
        this.compileError = compileError;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if is started.
     * 
     * @return true, if is started
     */
    public boolean isStarted() {
        return started;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the started.
     * 
     * @param started
     *            the new started
     */
    private void setStarted(final boolean started) {
        this.started = started;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if is compiled.
     * 
     * @return true, if is compiled
     */
    public boolean isCompiled() {
        return compiled;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the compiled.
     * 
     * @param compiled
     *            the new compiled
     */
    private void setCompiled(final boolean compiled) {
        this.compiled = compiled;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the current accumulated differential cycles. These are measured before and after each
     * tick() computation iff measuring is set to true.
     * 
     * @return the cycles
     */
    public int getCycles() {
        return cycles;
    }

    // -------------------------------------------------------------------------

    /**
     * Reset the cycle counter for cycle counting measurement.
     * 
     */
    public void resetCycles() {
        this.cycles = 0;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the source file size.
     * 
     * @return the source file size
     */
    public long getSourceFileSize() {
        return sourceFileSize;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the executable file size.
     * 
     * @return the executable file size
     */
    public long getExecutableFileSize() {
        return executableFileSize;
    }

    // -------------------------------------------------------------------------
}
