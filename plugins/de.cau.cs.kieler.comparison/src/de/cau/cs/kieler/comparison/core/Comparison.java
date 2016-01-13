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

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.jobs.Job;

import com.google.inject.Guice;

import de.cau.cs.kieler.comparison.exchange.ComparisonConfig;

/**
 * @author nfl
 *
 */
public class Comparison {

    public static final String COMPILER_EXTENSION_POINT_ID = "de.cau.cs.kieler.comparison.compiler";
    public static final String TESTCASEPROVIDER_EXTENSION_POINT_ID =
            "de.cau.cs.kieler.comparison.testcaseprovider";

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

    private Job comparisonJob;

    /**
     * 
     * @param srcFile
     * @return
     */
    public String startComparison(ComparisonConfig conf) {

        String start = conf.getOutputPath() + new Date().toString() + ".JSON";

        if (comparisonJob != null && comparisonJob.getResult() == null)
            comparisonJob.cancel();

        comparisonJob = new AsynchronousComparison(conf, start);
        comparisonJob.schedule();

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
    public static HashMap<String, ICompiler> getCompilers(boolean forceReload) {

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
        // Walk through every extension and instantiate the declared class, then put it into the
        // cache
        for (IConfigurationElement extension : extensions) {
            try {
                String className = extension.getAttribute("class");
                Object rawCompiler = extension.createExecutableExtension("class");
                ICompiler compiler =
                        (ICompiler) Guice.createInjector().getInstance(rawCompiler.getClass());
                String id = compiler.getID();
                if (compilersCached.containsKey(id)) {
                    // TODO better error logging
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
    public static HashMap<String, ITestcase> getTestcases(boolean forceReload) {

        // Return the cache if there is any and not forced to reload
        if (testcasesCached != null && !forceReload) {
            return testcasesCached;
        }
        // Clear the cache
        testcasesCached = new HashMap<String, ITestcase>();

        ArrayList<File> files = new ArrayList<File>();

        try {
            URL url = new URL("platform:/plugin/de.cau.cs.kieler.comparison/testcases/");
            files.add(new File(FileLocator.resolve(url).toURI()));
        } catch (IOException | URISyntaxException e) {
            // should never happen
            e.printStackTrace();
        }

        Collection<ITestcaseProvider> providers = getTestcaseProviders(false).values();
        Collection<String> extensions = new ArrayList<String>();

        for (ITestcaseProvider provider : providers) {
            String ext = provider.getExtension().toLowerCase();
            if (!extensions.contains(ext))
                extensions.add(ext);
        }
        FileFilter filter = new FileFilter() {

            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory())
                    return true;
                for (String ext : extensions) {
                    String path = pathname.getAbsolutePath();
                    if (path.substring(path.length() - ext.length()).toLowerCase().equals(ext))
                        return true;
                }
                // TODO better error logging
                System.out.println("No ITestcaseProvider for Testcase "
                        + pathname.getAbsolutePath() + " found.");
                return false;
            }
        };

        Collection<ITestcase> allTestcases = new ArrayList<ITestcase>();

        while (files.size() > 0) {
            File file = files.remove(0);
            if (file.isDirectory()) {
                files.addAll(Arrays.asList(file.listFiles(filter)));
            } else {
                boolean parsed = false;
                for (ITestcaseProvider provider : providers) {
                    String ext = provider.getExtension();
                    String filePath = file.getAbsolutePath();
                    if (filePath.substring(filePath.length() - ext.length()).toLowerCase()
                            .equals(ext)) {
                        Collection<ITestcase> newTestcases = provider.createTestcases(filePath);
                        if (newTestcases != null && newTestcases.size() > 0) {
                            insertTestcases(allTestcases, newTestcases);
                            parsed = true;
                        }
                    }
                }
                if (!parsed) {
                    // TODO better error logging
                    System.out.println("No ITestcaseProvider could be found for the File ("
                            + file.getAbsolutePath() + ") or it could not be parsed into ITestcase!");
                }
            }
        }

        for (ITestcase test : allTestcases) {
            ITestcase cached = testcasesCached.get(test.getTestcase());
            if (cached == null) {
                testcasesCached.put(test.getTestcase(), test);
            } else {
                mergeTestcases(cached, test);
            }
        }

        return testcasesCached;
    }

    /**
     * Inserts a Collection of ITestcase into another Collection of ITestcase without Duplicates. If
     * two ITestcase have the same file path, but are not compatible, the second ITestcase will be
     * ignored. If two ITestcase are compatible, the properties are merged.
     * 
     * Warning: This merge could possible result in a problematic ITestcase, if different providers
     * provide excluding properties.
     * 
     * @param into
     *            the collection to insert into
     * @param from
     *            the collection to insert from
     */
    private static void insertTestcases(Collection<ITestcase> into, Collection<ITestcase> from) {
        if (into == null) {
            into = from;
            return;
        }
        if (from == null)
            return;

        for (ITestcase newTest : from) {
            String testPath = newTest.getTestcase();
            boolean inserted = false;
            for (ITestcase existingTest : into) {
                if (existingTest.getTestcase().equals(testPath)) {
                    if (mergeTestcases(existingTest, newTest)) {
                        inserted = true;
                    }
                    break;
                }
            }
            if (!inserted) {
                into.add(newTest);
            }
        }
    }

    /**
     * @param first
     * @param second
     */
    private static boolean mergeTestcases(ITestcase first, ITestcase second) {

        if (first.getTestcase().equals(second.getTestcase())) {
            if (first.getLanguage() != second.getLanguage()) {
                // TODO better error logging
                System.out.println("ITestcase (" + second.getID() + ", " + second.getTestcase()
                        + ") could not be merged with an existing testcase: "
                        + "Language is not the same");
            } else if (!first.getID().equals(second.getID())) {
                // TODO better error logging
                System.out.println("ITestcase (" + second.getID() + ", " + second.getTestcase()
                        + ") could not be merged with an existing testcase: "
                        + "ID is not the same");
            } else {
                insertProperties(first.getProperties(), second.getProperties());
                return true;
            }
        }
        return false;
    }

    /**
     * Inserts a Collection of String into another Collection of String without Duplicates.
     * 
     * @param into
     *            the collection to insert into
     * @param from
     *            the collection to insert from
     */
    private static void insertProperties(Collection<String> into, Collection<String> from) {
        if (into == null) {
            into = from;
            return;
        }
        if (from == null)
            return;
        for (String newProp : from) {
            if (!into.contains(newProp))
                into.add(newProp);
        }
    }

    /**
     * 
     */
    private static HashMap<String, ITestcaseProvider> testcaseProvidersCached;

    /**
     * 
     * @param forceReload
     * @return
     */
    public static HashMap<String, ITestcaseProvider> getTestcaseProviders(boolean forceReload) {
        // Return the cache if there is any and not forced to reload
        if (testcaseProvidersCached != null && !forceReload) {
            return testcaseProvidersCached;
        }
        // Otherwise inspect the extensions
        IConfigurationElement[] extensions =
                Platform.getExtensionRegistry().getConfigurationElementsFor(
                        TESTCASEPROVIDER_EXTENSION_POINT_ID);
        // Clear the cache
        testcaseProvidersCached = new HashMap<String, ITestcaseProvider>();
        // Walk through every extension and instantiate the declared class, then put it into the
        // cache
        for (IConfigurationElement extension : extensions) {
            try {
                String className = extension.getAttribute("class");
                Object rawProvider = extension.createExecutableExtension("class");
                ITestcaseProvider provider =
                        (ITestcaseProvider) Guice.createInjector().getInstance(
                                rawProvider.getClass());
                String id = provider.getID();
                if (testcaseProvidersCached.containsKey(id)) {
                    // TODO better error logging
                    System.out.println("Comparison failed to register testcase provider: "
                            + extension + " for class " + className + " (" + id + ")"
                            + " because this ID is already taken.");
                } else {
                    testcaseProvidersCached.put(id, provider);
                }
            } catch (CoreException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return testcaseProvidersCached;
    }
}
