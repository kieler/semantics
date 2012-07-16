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
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URL;
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
 */
public class SCExecution {

    private static final String COMPILER_DEFAULT = "gcc";
    private static final String EXECUTABLE_PREFIX = "SC-GENERATED-EXECUTABLE-";
    
    private Process executionProcess = null;
    private PrintWriter executionInterfaceToSC;
    private BufferedReader executionInterfaceFromSC;
    private BufferedReader executionInterfaceError;

    private String compileError;
    private String outputPath;

    private boolean compiled;
    private boolean started;

    private String compiler;
    private String executableName;

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
        setOutputPath(KiemUtil.generateRandomTempOutputFolder());
    }

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
        setOutputPath(outputPath);
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * 
     * Compile the filePaths SC files together with the bundled SC core files within the given
     * outputPath folder. The executable will be randomly named and can later be started after a
     * successful compilation.
     * 
     * {@inheritDoc}
     */
    public void compile(final List<String> filePaths) throws IOException, InterruptedException {
        // reset successful compiled flag
        setCompiled(false);
        // choose a random name for the compiled executable
        setExecutableName(EXECUTABLE_PREFIX + KiemUtil.randomString());

        // building path to bundle
        Bundle bundle = Platform.getBundle(SCPlugin.PLUGIN_ID);

        URL url = null;
        try {
            // the SC path is the path to the needed SC c files
            url = FileLocator.toFileURL(FileLocator.find(bundle, new Path("sc"), null));
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
        for (String filePath : filePaths) {
            filePath = filePath.replaceAll("[/\\\\]+", "\\" + File.separator);
            if (filePath.startsWith("\\")) {
                filePath = filePath.substring(1);
            }
        }

        try {
            String compile = compiler;

            StringBuffer compileBuf = new StringBuffer();
            for (String filePath : filePaths) {
                compileBuf.append(" " + filePath);
            }

            compile += compileBuf.toString();

            compile += " "
                    // + outPath
                    // + "sim.c "
                    // + outPath
                    // + "sim_data.c "
                    // + outPath
                    // + "misc.c "
                    + bundleLocation + "sc.c " + bundleLocation + "cJSON.c " + " -I "
                    + bundleLocation + " " + "-o " + outputPath + getExecutableName()
                    // -m32 = 32 bit compatibility mode to prevent compiler errors on
                    // 64bit machines/architectures.
                    + " -lm -D_SC_NOTRACE  -D_SC_USE_PRE -D_SC_NOASSEMBLER";
            
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

        // start compiled sc code
        String executable = outputPath + getExecutableName() + " ";
        //executable = "C:\\Users\\delphino\\AppData\\Local\\Temp\\SC.exe";

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

    /**
     * Stop execution and destroy the execution process.
     */
    public void stopExecution() {
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

        // (try to) delete temp folder
        File folder = new File(outputPath);
        if (folder.getAbsolutePath().contains(System.getProperty("java.io.tmpdir"))) {
            KiemUtil.deleteFolder(folder);
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

}
