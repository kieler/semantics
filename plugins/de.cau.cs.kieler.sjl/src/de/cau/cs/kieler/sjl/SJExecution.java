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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLClassLoader;
//import org.eclipse.core.internal.boot.PlatformClassLoader;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

import de.cau.cs.kieler.sim.kiem.util.AbstractExecution;
import de.cau.cs.kieler.sim.kiem.util.KiemUtil;

import org.eclipse.jdt.core.compiler.batch.BatchCompiler;

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
//    private static final String SJL_PATH = "bin/de/cau/cs/kieler/sjl";
    private static final String SJL_PATH_SRC = "src/de/cau/cs/kieler/sjl";
    private static final String SJL_PATH_BIN = "bin/";

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

    public void compile(final List<String> filePaths, final String modelName) throws IOException,
            InterruptedException {

        // building path to bundle
        Bundle bundle = Platform.getBundle(SJPlugin.PLUGIN_ID);

        URL url = null;
        try {
            url = FileLocator.toFileURL(FileLocator.find(bundle, new Path(SJL_PATH_BIN), null));
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        // if (url == null) {
        // return;
        // }
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

//        for (String filePath : filePaths) {
//            BatchCompiler.compile(
//                    "-classpath " + bundleLocation + " " + filePath,
//                    new PrintWriter(System.out),
//                    new PrintWriter(System.err),
//                    null);
//        }

        
        System.out.println("-verbose -classpath " + bundleLocation + " -source 1.5 -target 1.5 -classpath d:/test/ d:/test/simple.java");
        
        
        // Compile all files
//        BatchCompiler.compile(
//                "-verbose -classpath " + bundleLocation + " -source 1.5 -target 1.5 -classpath d:/test/ d:/test/simple.java",
//                new PrintWriter(System.out),
//                new PrintWriter(System.err),
//                null);
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
        
        dynamicClassLoader.addClassFileByName("test.test2");
        dynamicClassLoader.addClassFileByName("test.test2$State");
        
        // Instantiate new class as SJProgram
        Class<?> cls;
        try {
            cls = Class.forName("test.test2", true, dynamicClassLoader);
            Object instance = cls.newInstance();
            Class superClass = instance.getClass().getSuperclass();
            Class compareClass = SJLProgram.class;
            String className = superClass.getName();
            if (instance instanceof SJLProgram) {
                SJLProgram<?> sJLProgram = (SJLProgram<?>) instance;
                sJLProgram.tick();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } 
        
//        String compile = this.getCompiler();
//
//        StringBuffer compileBuf = new StringBuffer();
//        for (String filePath : filePaths) {
//            compileBuf.append(" " + filePath);
//        }
//
//        compile += compileBuf.toString();
//
//        compile += " -jar -classpath " + bundleLocation + "SJLProgram.class " + bundleLocation
//                + "cJSON.c " + " -I " + bundleLocation + " " + "-o " + this.getOutputPath()
//                + getExecutableName()
//                // -m32 = 32 bit compatibility mode to prevent compiler errors on
//                // 64bit machines/architectures.
//                // + " -lm -D_SC_NOTRACE  -D_SC_USE_PRE -D_SC_NOASSEMBLER";
//                + " -lm  -D_SC_USE_PRE -D_SC_NOASSEMBLER";
//
//        super.
        return;
    }

    // -------------------------------------------------------------------------

    public void startExecution() throws IOException {

    }

    // -------------------------------------------------------------------------

    public void stopExecution(final boolean tryToDelete) {
        // reset successful started flag
        setStarted(false);

    }

    // -------------------------------------------------------------------------
}
