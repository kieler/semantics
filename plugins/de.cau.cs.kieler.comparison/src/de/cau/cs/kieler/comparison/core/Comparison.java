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
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

import com.google.inject.Guice;

import de.cau.cs.kieler.comparison.exchange.ComparisonConfig;

/**
 * Comparison class is used as a central link for all the components. Comparison uses the singleton
 * pattern. It is used to provide extension points for compiler and test cases as well as getter for
 * these.
 * 
 * @author nfl
 */
public final class Comparison {

    /**
     * Identifier for the ICompiler extension point.
     */
    public static final String COMPILER_EXTENSION_POINT_ID = "de.cau.cs.kieler.comparison.compiler";

    /**
     * Identifier for the ITestcaseProvider extension point.
     */
    public static final String TESTCASEPROVIDER_EXTENSION_POINT_ID =
            "de.cau.cs.kieler.comparison.testcaseprovider";

    /**
     * Private constructor for singleton pattern.
     */
    private Comparison() {

    }

    /**
     * The singleton instance of this class.
     */
    private static Comparison singleton;

    /**
     * Get the singleton instance of Comparison.
     * 
     * @return Singleton Comparison
     */
    public static Comparison getComparison() {
        if (singleton == null) {
            singleton = new Comparison();
        }
        return singleton;
    }

    /**
     * The only comparison execution.
     */
    private AsynchronousComparison comparisonJob;

    /**
     * Starts a comparison for a given configuration. Only one comparison at a time is allowed. If
     * another comparison gets started, the first one gets canceled.
     * 
     * @param config
     *            configuration for the comparison
     * @param comparisonDataView 
     * @return a string to identify the completed comparison
     */
    public String startComparison(final ComparisonConfig config) {

        // Generate an identifier for this comparison
        String start = config.getOutputPath() + new Date().toString() + ".JSON";

        // Stop currently running comparison
        if (comparisonJob != null && comparisonJob.getResult() == null) {
            comparisonJob.cancel();
        }

        // Initiate and start a new comparison job
        comparisonJob = new AsynchronousComparison(config, start);
        comparisonJob.schedule();

        return start;
    }

    /**
     * The cache for the compilers.
     */
    private static HashMap<String, ICompiler> compilersCached;

    /**
     * Used to get a collection of all compilers, who used an extension point to register. The
     * collection consist of KeyValuePairs, where the value is an instance of ICompiler and the key
     * is an identifier for this compiler as String. This method uses caching for optimization.
     * 
     * @param forceReload
     *            if true, the cache will be refreshed; otherwise the cache my be used
     * @return a HashMap with all registered compilers
     */
    public static HashMap<String, ICompiler> getCompilers(final boolean forceReload) {

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
                // TODO better error logging
                System.out.println("Instantiation of compiler extention failed: "
                        + extension.getAttribute("class"));
            }
        }
        return compilersCached;
    }

    /**
     * The cache for the test cases.
     */
    private static HashMap<Path, ITestcase> testcasesCached;

    /**
     * Used to get a collection of all test cases. The collection consist of KeyValuePairs, where
     * the value is an instance of ITestcase and the key is an identifier for this test case as
     * String. This method uses caching for optimization. All test cases within
     * de.cau.cs.kieler.comparison/testcases/ are added. Additional test case directories may be
     * added within this method. ITestcaseProvider are used to wrap test case files together with
     * properties into ITestcase classes.
     * 
     * @param forceReload
     *            if true, the cache will be refreshed; otherwise the cache my be used
     * @return a HashMap with all test cases
     */
    public static HashMap<Path, ITestcase> getTestcases(final boolean forceReload) {

        // Return the cache if there is any and not forced to reload
        if (testcasesCached != null && !forceReload) {
            return testcasesCached;
        }
        // Clear the cache
        testcasesCached = new HashMap<Path, ITestcase>();

        // All files that may contain test cases or are test cases
        ArrayList<File> files = new ArrayList<File>();

        // Add the default folder (de.cau.cs.kieler.comparison/testcases/) as test case folder
        try {
            URL url = new URL("platform:/plugin/de.cau.cs.kieler.comparison/testcases/");
            files.add(new File(FileLocator.resolve(url).toURI()).getCanonicalFile());
        } catch (IOException | URISyntaxException e) {
            // should never happen
            // TODO better error logging
            System.out.println("Test case folder could not be resolved.");
            e.printStackTrace();
        }

        // Add SCCharts test folder
        try {
            URL baseUrl =
                    FileLocator.resolve(new URL("platform:/plugin/de.cau.cs.kieler.comparison/"));
            URL url =
                    new URL(baseUrl.toString()
                            + "../../test/de.cau.cs.kieler.sccharts.sim.c.test/testdata-simple/");
            files.add(new File(FileLocator.resolve(url).toURI()).getCanonicalFile());

            url =
                    new URL(baseUrl.toString()
                            + "../../test/de.cau.cs.kieler.sccharts.sim.c.test/testdata-advanced/");
            files.add(new File(FileLocator.resolve(url).toURI()).getCanonicalFile());
        } catch (IOException | URISyntaxException e) {
            // TODO better error logging
            System.out.println("SCCharts test case folder could not be resolved.");
            e.printStackTrace();
        }

        // All ITestcaseProvider used while iterating through the files
        Collection<ITestcaseProvider> providers = getTestcaseProviders(false).values();
        // All extensions the providers can handle
        Collection<String> extensions = new ArrayList<String>();
        for (ITestcaseProvider provider : providers) {
            String ext = provider.getExtension().toLowerCase();
            if (!extensions.contains(ext)) {
                extensions.add(ext);
            }
        }

        // Filter used while iterating through the files
        FileFilter filter = new FileFilter() {
            @Override
            public boolean accept(final File pathname) {
                if (pathname.isDirectory()) {
                    return true;
                }
                String path = pathname.getAbsolutePath();
                for (String ext : extensions) {
                    int index = path.length() - ext.length();
                    if (0 <= index && index < path.length()
                            && path.substring(index).toLowerCase().equals(ext.toLowerCase())) {
                        return true;
                    }
                }
                // ignore input files
                if (path.length() > 2 && path.substring(path.length() - 3).equals(".in")) {
                    return false;
                }

                // TODO better error logging
                System.out.println("No ITestcaseProvider for Testcase "
                        + pathname.getAbsolutePath() + " found.");
                return false;
            }
        };

        // A collection of all ITestcase created by the providers
        Collection<ITestcase> allTestcases = new ArrayList<ITestcase>();

        // Iterate trough the file list and search for files, which are handled by any provider
        while (files.size() > 0) {
            File file = files.remove(0);
            // If the current file is a directory, add all its containing files to the list
            if (file.isDirectory()) {
                files.addAll(Arrays.asList(file.listFiles(filter)));
            }
            // Try to create a ITestcase for the current file with the given providers
            else {
                // Used to answer the question: Did any provider successfully create a ITestcase?
                boolean parsed = false;
                // Try each provider
                for (ITestcaseProvider provider : providers) {
                    // extensions are not handled case sensitive
                    String ext = provider.getExtension().toLowerCase();
                    String fileName = file.getName();
                    int nameLength = fileName.length();
                    int index = nameLength - ext.length();
                    // Check if the provider can handle the current file extension
                    if (index >= 0 && index < nameLength
                            && fileName.substring(index).toLowerCase().equals(ext)) {
                        // Try to create new test cases with the current provider
                        Collection<ITestcase> newTestcases = provider.createTestcases(file);
                        // If the provider creates new test cases, add them to the list of test
                        // cases
                        if (newTestcases != null && newTestcases.size() > 0) {
                            insertTestcases(allTestcases, newTestcases);
                            parsed = true;
                        }
                    }
                }
                // If no provider created a test case for the current file, notify the user
                if (!parsed) {
                    // TODO better error logging
                    System.out.println("No ITestcaseProvider could be found for the File ("
                            + file.getAbsolutePath()
                            + ") or it could not be parsed into ITestcase!");
                }
            }
        }

        // Add all newly created test cases to the cache
        // Ever since using multiple provider multiple test cases with the same path to a test case
        // could exist. These are getting merged into a single testcase.
        for (ITestcase test : allTestcases) {
            ITestcase cached = testcasesCached.get(test.getPath());
            // If no ITestcase with the current path exists in the cache, add the current test case
            if (cached == null) {
                testcasesCached.put(test.getPath(), test);
            }
            // Else try to merge the two test cases into the cached one
            else {
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
    private static void insertTestcases(Collection<ITestcase> into, final Collection<ITestcase> from) {

        if (into == null) {
            into = from;
            return;
        }
        if (from == null) {
            return;
        }

        // Insert all the ITestcase from one list to another
        for (ITestcase newTest : from) {
            Path testPath = newTest.getPath();
            boolean inserted = false;
            // Check all test cases in the first list for possible merging
            for (ITestcase existingTest : into) {
                if (existingTest.getPath().equals(testPath)) {
                    // If a test case with the same path already exists within the first list,
                    // try to merge the two cases into the one already contained within the list
                    mergeTestcases(existingTest, newTest);
                    inserted = true;
                    break;
                }
            }
            // If the test case did not get merged with another one, add itself to the list
            if (!inserted) {
                into.add(newTest);
            }
        }
    }

    /**
     * Tries to merge the second test case into the first one. This can only be done successfully,
     * if both test cases have the same file path, Language and identifier. In that case both lists
     * of properties are getting merged into a single one.
     * 
     * @param into
     *            the first test case to merge into
     * @param from
     *            the second test case to merge from
     * @return true, if the merge was successful; false otherwise
     */
    private static boolean mergeTestcases(ITestcase into, final ITestcase from) {

        // Only merge the test cases if both have the same file path ...
        if (into.getPath().equals(from.getPath())) {
            // ... and the same Language
            if (into.getLanguage() != from.getLanguage()) {
                // TODO better error logging
                System.out.println("ITestcase (" + from.getID() + ", " + from.getPath()
                        + ") could not be merged with an existing testcase: "
                        + "Language is not the same");
            }
            // ... and the same ID
            else if (!into.getID().equals(from.getID())) {
                // TODO better error logging
                System.out.println("ITestcase (" + from.getID() + ", " + from.getPath()
                        + ") could not be merged with an existing testcase: "
                        + "ID is not the same");
            }
            // ... and the same Test Trace, if both do have one
            else if (into.getTestTrace() != null && from.getTestTrace() != null && !into.getTestTrace().equals(from.getTestTrace())){
                // TODO better error logging
                System.out.println("ITestcase (" + from.getID() + ", " + from.getPath()
                        + ") could not be merged with an existing testcase: "
                        + "Test Traces are not the same");
            }
            // All requirements met, therefore insert the properties of the second into the first one
            else {
                insertProperties(into.getProperties(), from.getProperties());
                if (into.getTestTrace() == null)
                {
                    into.setTestTrace(from.getTestTrace());
                }
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
    private static void insertProperties(Collection<String> into, final Collection<String> from) {
        if (into == null) {
            into = from;
            return;
        }
        if (from == null) {
            return;
        }
        for (String newProp : from) {
            if (!into.contains(newProp)) {
                into.add(newProp);
            }
        }
    }

    /**
     * The cache for the test case provider.
     */
    private static HashMap<String, ITestcaseProvider> testcaseProvidersCached;

    /**
     * Used to get a collection of all test case providers. The collection consist of KeyValuePairs,
     * where the value is an instance of ITestcaseProvider and the key is an identifier for this
     * provider as String. This method uses caching for optimization.
     * 
     * @param forceReload
     *            if true, the cache will be refreshed; otherwise the cache my be used
     * @return a HashMap with all test cases
     */
    public static HashMap<String, ITestcaseProvider> getTestcaseProviders(final boolean forceReload) {
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
                // TODO better error logging
                System.out.println("Instantiation of test case provider extention failed: "
                        + extension.getAttribute("class"));
            }
        }
        return testcaseProvidersCached;
    }
}
