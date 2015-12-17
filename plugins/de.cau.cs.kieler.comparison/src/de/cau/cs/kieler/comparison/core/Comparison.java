/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.comparison.core;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.jobs.Job;

import com.google.inject.Guice;

import de.cau.cs.kieler.comparison.exchanges.ComparisonConfig;

/**
 * @author nfl
 *
 */
public class Comparison {

    public static final String COMPILER_EXTENSION_POINT_ID = "de.cau.cs.kieler.comparison.compiler";
    public static final String TESTCASE_EXTENSION_POINT_ID = "de.cau.cs.kieler.comparison.testcase";
    public static final String INPUTGENERATOR_EXTENSION_POINT_ID =
            "de.cau.cs.kieler.comparison.inputgenerator";

    /**
     * Private constructor for singleton pattern
     */
    private Comparison() {

    }

    private static Comparison singleton;

    /**
     * Get the singleton instance of Comparison
     * 
     * @return Singleton Comparison
     */
    public static Comparison getComparison() {
        if (singleton == null)
            singleton = new Comparison();
        return singleton;
    }

    private Job job;
    
    /**
     * 
     * @param srcFile
     * @return
     */
    public String startComparison(ComparisonConfig conf) {

        String start = conf.getOutputPath() + new Date().toString() + ".JSON";
        
        if (job != null && job.getResult() == null)
            job.cancel();

        job = new AsynchronousComparison(conf, start);
        job.schedule();

        return start;
    }

    /**
     * 
     */
    private static HashMap<String, ICompiler> compilersCached;

    /**
     * 
     * @param forceReload
     * @return
     */
    public static HashMap<String, ICompiler> getRegisteredCompilers(boolean forceReload) {

        // Return the cache if there is any and not forced to reload
        if (compilersCached != null && !forceReload) {
            return compilersCached;
        }
        // Otherwise inspect the extensions
        IConfigurationElement[] extensions =
                Platform.getExtensionRegistry().getConfigurationElementsFor(
                        COMPILER_EXTENSION_POINT_ID);
        // Clear the cache
        compilersCached = new HashMap<String, ICompiler>();
        // Walk thru every extension and instantiate the declared class, then put it into the cache
        for (IConfigurationElement extension : extensions) {
            try {
                String className = extension.getAttribute("class");
                Object rawCompiler = extension.createExecutableExtension("class");
                ICompiler compiler =
                        (ICompiler) Guice.createInjector().getInstance(rawCompiler.getClass());
                String id = compiler.getID();
                if (compilersCached.containsKey(id)) {
                    System.out.println("Comparison failed to register compiler: " + extension
                            + " for class " + className + " (" + id + ")"
                            + " because this ID is already taken.");
                } else {
                    compilersCached.put(id, compiler);
                }
            } catch (CoreException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return compilersCached;
    }

    /**
     * 
     */
    private static HashMap<String, ITestcase> testcasesCached;

    /**
     * 
     * @param forceReload
     * @return
     */
    public static HashMap<String, ITestcase> getRegisteredTestcases(boolean forceReload) {

        // Return the cache if there is any and not forced to reload
        if (testcasesCached != null && !forceReload) {
            return testcasesCached;
        }
        // Otherwise inspect the extensions
        IConfigurationElement[] extensions =
                Platform.getExtensionRegistry().getConfigurationElementsFor(
                        TESTCASE_EXTENSION_POINT_ID);
        // Clear the cache
        testcasesCached = new HashMap<String, ITestcase>();
        // Walk thru every extension and instantiate the declared class, then put it into the cache
        for (IConfigurationElement extension : extensions) {
            try {
                String className = extension.getAttribute("class");
                Object rawTestcase = extension.createExecutableExtension("class");
                ITestcase testcase =
                        (ITestcase) Guice.createInjector().getInstance(rawTestcase.getClass());
                String id = testcase.getID();
                if (testcasesCached.containsKey(id)) {
                    System.out.println("Comparison failed to register testcase: " + extension
                            + " for class " + className + " (" + id + ")"
                            + " because this ID is already taken.");
                } else {
                    testcasesCached.put(id, testcase);
                }
            } catch (CoreException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return testcasesCached;
    }

    /**
     * 
     * @return
     */
    public Collection<IInputGenerator> getRegisteredInputGenerators() {
        return null;
    }
}
