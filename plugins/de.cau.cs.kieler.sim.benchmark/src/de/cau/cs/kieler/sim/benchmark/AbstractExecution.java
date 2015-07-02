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
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.util.KiemUtil;

/**
 * This class is intended to compile and execute SC or SJ code.
 * 
 * @author cmot
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow cmot
 */
public abstract class AbstractExecution implements IBenchmarkExecution {

    /** The compile error. */
    private String compileError;

    /** The output path. */
    private String outputPath;

    /** The compiled. */
    private boolean compiled;

    /** The started. */
    private boolean started;

    /** The benchmark (cyclecount or time) flag. */
    private boolean benchmark;

    /** The source file size. */
    private long sourceFileSize;

    /** The executable file size. */
    private long executableFileSize;

    /** The compiler. */
    private String compiler;

    /** The executable name. */
    private String executableName;

    /** The debug flag. */
    private boolean debug;

    private File[] compiledFiles;

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
     * @param filePaths
     *            the file paths
     * @return the string
     */
    public abstract String buildCompileCommandLine(final List<String> filePaths);

    // -------------------------------------------------------------------------

    /**
     * Files pre processing before compilation. Here, possible timing/cycle counting code can be inserted.
     * The method must return a possible modified file path.
     * 
     * @param filePath
     *            the file path
     * @return the string
     */
    public abstract String filesPreProcessing(String filePath);

    // -------------------------------------------------------------------------

    /**
     * Gets the executable prefix that is later followed by a random number.
     * 
     * @param filePaths
     *            the file paths
     * @param modelName
     *            the model name
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
        benchmark = false;
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
        benchmark = false;
        setOutputPath(outputPath);
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new SCExecution with a concrete outputPath.
     * 
     * @param outputPath
     *            the output path
     * @param benchmark
     *            the cycle count or time flag if measuring should be turned on
     */
    public AbstractExecution(final String outputPath, final boolean benchmark) {
        setCompiler(setCompilerDefault());
        setCompiled(false);
        setStarted(false);
        this.benchmark = benchmark;
        setOutputPath(outputPath);
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Compile the filePaths files and return the compiled files or null if compilation fails. On
     * failure IOExecption/Interrupted Exception can be thrown.
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
    protected abstract File[] doCompile(final List<String> filePaths, final String modelName)
            throws IOException, InterruptedException;

    // -------------------------------------------------------------------------

    /**
     * Compile the filePaths files and does the surrounding measurement of file sizes.
     * Implementations implement doCompile only. The tickMethodFile is for bechmarking only.
     *
     * @param filePaths the file paths
     * @param modelName the model name
     * @param tickMethodFile the tick method file
     * @throws IOException Signals that an I/O exception has occurred.
     * @throws InterruptedException the interrupted exception
     */
    final public void compile(final List<String> filePaths, final String modelName, final String tickMethodFile)
            throws IOException, InterruptedException {
        // Possible benchmarking
        sourceFileSize = 0;
        executableFileSize = 0;
        if (isBenchmark()) {
            try {
                String benchmalCompiler =  this.getCompiler();
                this.executableFileSize = Benchmark.benchmarkExecutable(new URL("file:/" + tickMethodFile), benchmalCompiler, Benchmark.isWindows());
                File tickMethodFileFile = new File(tickMethodFile);
                sourceFileSize = tickMethodFileFile.length();
            } catch (KiemInitializationException e) {
                e.printStackTrace();
            }
        }
        

        // Possible pre processing
        List<String> usedfilePaths = new LinkedList<String>();
        for (String filePath : filePaths) {
            File tmp = new File(filePath);
            if (tmp.exists()) {
                usedfilePaths.add(filesPreProcessing(filePath));
            }
        }

        // Reset successful compiled flag
        setCompiled(false);

        // Choose a random name for the compiled executable
        setExecutableName(generateExecutableName(filePaths, modelName));

//        // Measure source file size
//        for (String filePath : usedfilePaths) {
//            File currentFile = new File(filePath);
//            sourceFileSize += currentFile.length();
//        }

        // Decide based on benchmark which files to use
//        if (!benchmark) {
            usedfilePaths = filePaths;
//        }
        
        // Test if compiled file exists
        compiledFiles = doCompile(usedfilePaths, modelName);
        
        boolean raiseError = false;
        if (compiledFiles == null) {
            raiseError = true;
        } else if (!compiledFiles[0].exists()) {
            // The Windows case
            if (!(new File(compiledFiles[0].getAbsolutePath() + ".exe").exists())) {
                raiseError = true;
            }
        }

        if (raiseError) {
            throw new IOException("Could not compile the generated code."
                    + "\nCheck that the path to your Workspace/Eclipse"
                    + " installation does not contain any white spaces.\n\n" + getCompileError());
        }

        // Set successful compiled flag
        setCompiled(true);
    }

    // -------------------------------------------------------------------------

    /**
     * Start execution and start the execution process return false if this did not succeed.
     * 
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    abstract protected boolean doStartExecution() throws IOException;

    // -------------------------------------------------------------------------

    /**
     * Start execution and start the execution process and also does the surrounding compiled files
     * size measurement. Implementations implement doStartExecution().
     * 
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    final public void startExecution() throws IOException {
        // Reset successful started flag
        setStarted(false);

        // If the code was not successfully compiled yet, do not try to
        // execute it
        if (!compiled) {
            throw new IOException("Generated code was not compiled yet.");
        }

        // Compute file sizes
//        executableFileSize = 0;
//        for (File file : compiledFiles) {
//            if (file.exists()) {
//                executableFileSize += file.length();
//            } else {
//                // The Windows case
//                file = new File(this.getOutputPath() + getExecutableName() + ".exe");
//                if (file.exists()) {
//                    executableFileSize += file.length();
//                }
//            }
//        }

        // Execution specific code goes here
        doStartExecution();

        // set successful started flag
        setStarted(true);
    }

    // -------------------------------------------------------------------------

    /**
     * Stop execution and destroy the execution process. Implementation can implement cleanup
     * procedures here;
     * 
     * @param tryToDelete
     *            the try to delete
     */
    protected abstract void doStopExecution(final boolean tryToDelete);

    // -------------------------------------------------------------------------

    /**
     * Stop execution and destroy the execution process.
     * 
     * @param tryToDelete
     *            the try to delete
     */
    public final void stopExecution(final boolean tryToDelete) {
        // reset successful started flag
        setStarted(false);

        // Implementation specific code
        doStopExecution(tryToDelete);

        if (tryToDelete) {
            // (try to) delete on VM exit
            for (File file : compiledFiles) {
                file.deleteOnExit();
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
    public boolean isBenchmark() {
        return benchmark;
    }

    // -------------------------------------------------------------------------

}
