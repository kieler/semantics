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
package de.cau.cs.kieler.sjl;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jdt.core.compiler.batch.BatchCompiler;
import org.osgi.framework.Bundle;

import de.cau.cs.kieler.sim.kiem.util.AbstractExecution;
//import org.eclipse.core.internal.boot.PlatformClassLoader;

/**
 * This class is intended to compile and execute SJ code.
 * 
 * @author cmot
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow cmot
 */
public class SJExecution extends AbstractExecution {

    /** The Constant COMPILER_DEFAULT. */
    private static final String COMPILER_DEFAULT = "java";

    /** The Constant SJL_PATH to the SJLProgram.class for compilation. */
    private static final String SJL_PATH_BIN = "bin/";
    
    /** The model name used when compile() was called. */
    private String modelName;
    
    /** The program set after successful compilation. */
    private SJLProgramWithSignals<?> program;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new sC execution.
     * 
     * @param outputPath
     *            the output path
     * @param cycleCountOrTime
     *            the cycle count or time
     */
    public SJExecution(final String outputPath, final boolean cycleCountOrTime) {
        super(outputPath, cycleCountOrTime);

    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public String setCompilerDefault() {
        return COMPILER_DEFAULT;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public String buildCompileCommandLine(final List<String> filePaths) {
        // No command line necessary
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public String generateExecutableName(final List<String> filePaths, final String modelName) {
        // No executable name necessary
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public String filesPreProcessing(final String filePath) {
        // No pre processing
        return filePath;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public String buildExecutionCommandLine() {
        // No command line necessary
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void compile(final List<String> filePaths, final String modelName) throws IOException,
            InterruptedException {
        // Reset flag that compilation was NOT successful at this point
        super.setCompiled(false);
        
        // Reset program
        this.program = null;
                
        // Set modelName
        this.setModelName(modelName);
        
        // Building path to bundle
        Bundle bundle = Platform.getBundle(SJPlugin.PLUGIN_ID);

        URL url = null;
        try {
            url = FileLocator.toFileURL(FileLocator.find(bundle, new Path(SJL_PATH_BIN), null));
        } catch (IOException e2) {
            e2.printStackTrace();
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
        
        //DEBUG OUTPUT
        //System.out.println("-verbose -classpath " + bundleLocation + " -source 1.5 -target 1.5 -classpath d:/test/ d:/test/simple.java");
        
        // Compile all files
        for (String filePath : filePaths) {
            String filePathRoot = null;
            if (filePath.lastIndexOf("/") > 0) {
                filePathRoot = filePath.substring(0, filePath.lastIndexOf("/"));
            }
            if (filePath.lastIndexOf("\\") > 0) {
                filePathRoot = filePath.substring(0, filePath.lastIndexOf("\\"));
            }
            BatchCompiler.compile(
                    "-verbose -classpath " + bundleLocation + " -source 1.5 -target 1.5 -classpath "+ filePathRoot +" " + filePath,
                    new PrintWriter(System.out),
                    new PrintWriter(System.err),
                    null);
        }

        // Instantiate the dynamic class loader
        DynamicClassLoader dynamicClassLoader = new DynamicClassLoader(this.getClass().getClassLoader());
        
        // Fill the class loader with all necessary file paths
        for (String filePath : filePaths) {
            String filePathRoot = null;
            if (filePath.lastIndexOf("/") > 0) {
                filePathRoot = filePath.substring(0, filePath.lastIndexOf("/"));
            }
            if (filePath.lastIndexOf("\\") > 0) {
                filePathRoot = filePath.substring(0, filePath.lastIndexOf("\\"));
            }
            File classLoaderRoot = new File(filePathRoot);
            if (classLoaderRoot.exists()) {
                URL classLoaderRootURL = classLoaderRoot.toURI().toURL();
                dynamicClassLoader.addClassPath(classLoaderRootURL);
            }
        }
        
        // Register classes to be loaded specifically by the dynamic class loader
        dynamicClassLoader.addClassFileByName("test." + modelName);
        dynamicClassLoader.addClassFileByName("test." + modelName +"$State");
        
        // Instantiate new class as SJProgramWithSignals
        Class<?> cls;
        try {
            cls = Class.forName("test." + modelName, true, dynamicClassLoader);
            Object instance = cls.newInstance();
            if (instance instanceof SJLProgramWithSignals) {
                SJLProgramWithSignals<?> program = (SJLProgramWithSignals<?>) instance;
                
                // Set this program to be used
                this.program = program;

                // Flag that compilation was successful
                super.setCompiled(true);

//                // Example sequence
//                program.setInput("I", true);
//                program.doTick();
//                System.out.println("O:"+program.getOutput("O"));
//                program.setInput("I", true);
//                program.doTick();
//                System.out.println("O:"+program.getOutput("O"));
//                program.doTick();
//                System.out.println("O:"+program.getOutput("O"));
//                program.doTick();
//                System.out.println("O:"+program.getOutput("O"));
            }
        } catch (ClassNotFoundException e) {
            throw new IOException(e.getMessage());
        } catch (InstantiationException e) {
            throw new IOException(e.getMessage());
        } catch (IllegalAccessException e) {
            throw new IOException(e.getMessage());
        } catch (SecurityException e) {
            throw new IOException(e.getMessage());
        } catch (IllegalArgumentException e) {
            throw new IOException(e.getMessage());
        } 
        
        return;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void startExecution() throws IOException {
        if (super.isCompiled() && program != null) {
            setStarted(true);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void stopExecution(final boolean tryToDelete) {
        // Reset successful started flag
        setStarted(false);
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the model name.
     *
     * @return the model name
     */
    public String getModelName() {
        return modelName;
    }

    // -------------------------------------------------------------------------
    
    /**
     * Sets the model name.
     *
     * @param modelName the new model name
     */
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    // -------------------------------------------------------------------------
    
}
