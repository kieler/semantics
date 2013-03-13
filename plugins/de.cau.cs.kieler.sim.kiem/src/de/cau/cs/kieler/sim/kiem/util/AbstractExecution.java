/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.kiem.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

/**
 * This class is intended to compile and execute SC or SJ code.
 * 
 * @author cmot
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow cmot
 */
public abstract class AbstractExecution {

    /** The execution process. */
    private Process executionProcess = null;

    /** The execution interface to execution. */
    private PrintWriter interfaceToExecution;

    /** The execution interface from execution. */
    private BufferedReader interfaceFromExecution;

    /** The execution interface error. */
    private BufferedReader interfaceError;

    /** The compile error. */
    private String compileError;

    /** The output path. */
    private String outputPath;

    /** The compiled. */
    private boolean compiled;

    /** The started. */
    private boolean started;

    /** The cyclecount or time flag. */
    private boolean cycleCountOrTime;

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

    /** The debug flag. */
    private boolean debug;

    // -------------------------------------------------------------------------

    /**
     * Sets the compiler default.
     * 
     * @return the string
     */
    public abstract String setCompilerDefault();

    // -------------------------------------------------------------------------

    /**
     * Builds the compile command line that is executed when compilation is necessary before a run.
     *
     * @param filePaths the file paths
     * @return the string
     */
    public abstract String buildCompileCommandLine(final List<String> filePaths);

    // -------------------------------------------------------------------------

    /**
     * Files pre processing before compilation. Here, possible cycle counting code can be inserted.
     * The method must return a possible modified file path.
     *
     * @param filePath the file path
     * @return the string
     */
    public abstract String filesPreProcessing(String filePath);

    // -------------------------------------------------------------------------

    /**
     * Gets the executable prefix that is later followed by a random number.
     *
     * @param filePaths the file paths
     * @param modelName the model name
     * @return the executable prefix
     */
    public String generateExecutableName(final List<String> filePaths, final String modelName) {
        return modelName + KiemUtil.randomString();
    }

    // -------------------------------------------------------------------------

    /**
     * Builds the execution command line that is executed when compilation is about to run.
     * 
     * @return the string
     */
    public abstract String buildExecutionCommandLine();

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new SCExecution with a random outputPath.
     * 
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public AbstractExecution() throws IOException {
        setCompiler(setCompilerDefault());
        setCompiled(false);
        setStarted(false);
        cycleCountOrTime = false;
        setOutputPath(KiemUtil.generateRandomTempOutputFolder());
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new SCExecution with a concrete outputPath.
     * 
     * @param outputPath
     *            the output path
     */
    public AbstractExecution(final String outputPath) {
        setCompiler(setCompilerDefault());
        setCompiled(false);
        setStarted(false);
        cycleCountOrTime = false;
        setOutputPath(outputPath);
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new SCExecution with a concrete outputPath.
     * 
     * @param outputPath
     *            the output path
     * @param cycleCountOrTime
     *            the cycle count or time flag if measuring should be turned on
     */
    public AbstractExecution(final String outputPath, final boolean cycleCountOrTime) {
        setCompiler(setCompilerDefault());
        setCompiled(false);
        setStarted(false);
        this.cycleCountOrTime = cycleCountOrTime;
        setOutputPath(outputPath);
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Compile the filePaths SC files together with the bundled SC core files within the given
     * outputPath folder. The executable will be randomly named and can later be started after a
     * successful compilation.
     * 
     * @param filePaths
     *            the file paths
     * @param modelName
     *            the model name
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     * @throws InterruptedException
     *             the interrupted exception
     */
    public void compile(final List<String> filePaths, final String modelName) throws IOException,
            InterruptedException {

        // Possible pre processing
        List<String> usedfilePaths = new LinkedList<String>();
        for (String filePath : filePaths) {
            usedfilePaths.add(filesPreProcessing(filePath));
        }

        // Reset successful compiled flag
        setCompiled(false);

        // Choose a random name for the compiled executable
        setExecutableName(generateExecutableName(filePaths, modelName));


        try {
            // Measure source file size
            sourceFileSize = 0;
            executableFileSize = 0;
            for (String filePath : usedfilePaths) {
                File currentFile = new File(filePath);
                sourceFileSize += currentFile.length();
            }
            
            String compile = buildCompileCommandLine(filePaths);

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

            int exitValue = executionProcess.waitFor();

            // Test if compiled file exists
            File file = new File(outputPath + getExecutableName());
            if (!file.exists()) {
                if (exitValue != 0) {
                    throw new IOException("Could not compile the generated code (" + exitValue
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

        // Set successful compiled flag
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
        // Reset successful started flag
        setStarted(false);

        // If the code was not successfully compiled yet, do not try to
        // execute it
        if (!compiled) {
            throw new IOException("Generated code was not compiled yet.");
        }

        File file = new File(this.getOutputPath() + getExecutableName());
        if (file.exists()) {
            executableFileSize = file.length();
        } else {
            // The Windows case
            file = new File(this.getOutputPath() + getExecutableName() + ".exe");
            if (file.exists()) {
                executableFileSize = file.length();
            }
        }
        
        // File file = new File(outputPath + getExecutableName());
        // if (file.exists()) {
        // executableFileSize = file.length();
        // } else {
        // // The Windows case
        // file = new File(outputPath + getExecutableName() + ".exe");
        // if (file.exists()) {
        // executableFileSize = file.length();
        // }
        // }
        // outputPath + getExecutableName() + " ";

        // Start compiled sc code
        String executable = buildExecutionCommandLine();
        // executable = "C:\\Users\\delphino\\AppData\\Local\\Temp\\SC.exe";

        executionProcess = Runtime.getRuntime().exec(executable);

        setInterfaceToExecution(new PrintWriter(new OutputStreamWriter(
                executionProcess.getOutputStream())));
        setInterfaceFromExecution(new BufferedReader(new InputStreamReader(
                executionProcess.getInputStream())));
        setInterfaceError(new BufferedReader(new InputStreamReader(
                executionProcess.getErrorStream())));

        // set successful started flag
        setStarted(true);
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
        getInterfaceToExecution().close();
        try {
            getInterfaceFromExecution().close();
        } catch (IOException e) {
            // ignore errors
        }
        try {
            getInterfaceError().close();
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
     * Gets the execution interface to execution.
     * 
     * @return the execution interface to execution
     */
    public PrintWriter getInterfaceToExecution() {
        return interfaceToExecution;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the execution interface to execution.
     * 
     * @param toSC
     *            the new execution interface to execution
     */
    protected void setInterfaceToExecution(final PrintWriter toSC) {
        this.interfaceToExecution = toSC;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the execution interface from execution.
     * 
     * @return the execution interface from execution
     */
    public BufferedReader getInterfaceFromExecution() {
        return interfaceFromExecution;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the execution interface from execution.
     * 
     * @param fromSC
     *            the new execution interface from execution
     */
    protected void setInterfaceFromExecution(final BufferedReader fromSC) {
        this.interfaceFromExecution = fromSC;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the execution interface error.
     * 
     * @return the execution interface error
     */
    public BufferedReader getInterfaceError() {
        return interfaceError;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the execution interface error.
     * 
     * @param error
     *            the new execution interface error
     */
    protected void setInterfaceError(final BufferedReader error) {
        this.interfaceError = error;
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
    protected void setCompileError(final String compileError) {
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
    protected void setStarted(final boolean started) {
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
    protected void setCompiled(final boolean compiled) {
        this.compiled = compiled;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the current accumulated differential cycles or time. These are/is measured before and
     * after each tick() computation iff measuring is set to true.
     * 
     * @return the cycles
     */
    public int getCyclesOrTime() {
        return cycles;
    }

    // -------------------------------------------------------------------------

    /**
     * Reset the cycle or time counter for cycle counting or time measurement.
     * 
     */
    public void resetCyclesOrTime() {
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

    /**
     * Checks if is debug.
     * 
     * @return the debug
     */
    public boolean isDebug() {
        return debug;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the debug.
     * 
     * @param debug
     *            the debug to set
     */
    public void setDebug(final boolean debug) {
        this.debug = debug;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if is cycle count or time.
     * 
     * @return the cycleCountOrTime
     */
    public boolean isCycleCountOrTime() {
        return cycleCountOrTime;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the cycle count or time.
     * 
     * @param cycleCountOrTime
     *            the cycleCountOrTime to set
     */
    public void setCycleCountOrTime(final boolean cycleCountOrTime) {
        this.cycleCountOrTime = cycleCountOrTime;
    }

    // -------------------------------------------------------------------------
}
