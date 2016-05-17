/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.comparison.core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Comparator;
import java.util.PriorityQueue;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

import de.cau.cs.kieler.comparison.Activator;
import de.cau.cs.kieler.comparison.datahandler.AbstractDataHandler;
import de.cau.cs.kieler.comparison.datahandler.DataHandler;
import de.cau.cs.kieler.comparison.exchange.ComparisonConfig;
import de.cau.cs.kieler.comparison.exchange.IMeasuringParameters;
import de.cau.cs.kieler.comparison.exchange.KBestMeasuringParameteres;
import de.cau.cs.kieler.comparison.exchange.StandardMeasuringParameters;
import de.cau.cs.kieler.comparison.measuring.CompError;
import de.cau.cs.kieler.comparison.measuring.CompLoCMeasuring;
import de.cau.cs.kieler.comparison.measuring.CompSizeMeasuring;
import de.cau.cs.kieler.comparison.measuring.CompSpeedMeasuring;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;

/**
 * AsynchronousComparison extends the {@link Job} class and is used to execute the comparison
 * between compilers. This job needs a {@link ComparisonConfig} and an identification String to be
 * created.
 * 
 * @author nfl
 */
public class AsynchronousComparison extends Job {

    /**
     * The constructor for the asynchronous comparison job.
     * 
     * @param config
     *            the configuration for the comparison
     * @param comparison
     *            the identifier for the comparison
     */
    public AsynchronousComparison(final ComparisonConfig config, final String comparison) {
        super("Asynchronous Comparison Job");

        setUser(true);
        this.config = config;
        this.comparison = comparison;
    }

    /**
     * The configuration to run the comparison with.
     */
    private ComparisonConfig config;

    /**
     * A String, which is used to identify the comparison.
     */
    private String comparison;

    /**
     * {@inheritDoc}
     */
    @Override
    protected IStatus run(final IProgressMonitor monitor) {
        // the compilers, which are used within the comparison
        Collection<ICompiler> compilers = config.getCompilers();
        // the test cases, which are used within the comparison
        Collection<ITestcase> testcases = config.getTestcases();

        // the IDataHandler is used to save the comparison results
        AbstractDataHandler dataHandler = DataHandler.getDataHandler();

        // estimation of work, which has to be done within the comparison
        // used in the progress monitor
        int totalWork = compilers.size() * testcases.size() * 10;
        monitor.beginTask("Compiler Comparison", totalWork);

        // each compiler has to compile each test case
        for (ICompiler comp : compilers) {
            for (ITestcase test : testcases) {

                Path compilation = null;

                if (config.compareCompSpeed() || config.compareCompSize()) {
                    IMeasuringParameters compMeasuringParameters =
                            config.getCompareCompParameters();
                    // usage of different measuring methods
                    if (compMeasuringParameters instanceof KBestMeasuringParameteres) {
                        KBestMeasuringParameteres params =
                                (KBestMeasuringParameteres) compMeasuringParameters;

                        compilation =
                                compileKBest(comp, test, monitor, params.getK(),
                                        params.getEpsilon(), params.getM());

                    } else if (compMeasuringParameters instanceof StandardMeasuringParameters) {
                        StandardMeasuringParameters params =
                                (StandardMeasuringParameters) compMeasuringParameters;
                        // K-Best with k = M results is exact k measurements no matter how close
                        // they are to the best
                        for (int i = 0; i < params.getComparisonAmount(); i++) {
                            compilation = compileKBest(comp, test, monitor, 1, 0, 1);
                        }

                    } else {
                        // no valid / known measuring selected
                        // TODO better error logging
                        System.out
                                .println("Comparison of compilations can not be done: unknown measuring.");
                    }

                    if (monitor.isCanceled()) {
                        monitor.done();

                        // since only one comparison is done at a time, clearing all observer at the
                        // end is fine
                        dataHandler.deleteObservers();

                        return new Status(IStatus.CANCEL, Activator.PLUGIN_ID,
                                "Comparison canceled.");
                    }
                }

                // compare compilation speed
                if (config.compareExecSpeed()) {

                    // no comp measurings
                    if (compilation == null) {
                        compilation = compileKBest(comp, test, monitor, 1, 0, 1);
                    }

                    KiemPlugin kiemPlugin = KiemPlugin.getDefault();
                    if (kiemPlugin == null) {
                        System.out.println("KIEM Plugin is not loaded.");
                        continue;
                    }

                    // TODO kiem magic here
                    System.out
                            .println("TODO: Comparing the Execution Speed of Compilations not implemented.");
                }
            }
        }

        monitor.done();

        // since only one comparison is done at a time, clearing all observer at the end is fine
        dataHandler.deleteObservers();

        return new Status(IStatus.OK, Activator.PLUGIN_ID, "Comparison done.");
    }

    /**
     * Uses the K-Best Scheme for measuring compilations.
     * 
     * @param compiler
     *            the compiler used for the compilation
     * @param testcase
     *            the test case to compile
     * @param monitor
     *            the IProgressMonitor used for visual feedback of the progression
     * @param k
     *            the first parameter for the K-Best Scheme (K) is used to tell how many measurings
     *            have to be in close range
     * @param epsilon
     *            the second parameter for the K-Best Scheme (epsilon) is used to describe the range
     *            of the best K measurings
     * @param m
     *            the third parameter for the K-Best Scheme (M) is used as a stop criterion
     * @return the path to the compiled test case
     */
    private Path compileKBest(final ICompiler compiler, final ITestcase testcase,
            final IProgressMonitor monitor, final int k, final double epsilon, final int m) {

        AbstractDataHandler dataHandler = DataHandler.getDataHandler();

        String compID = compiler.getID();
        String testID = testcase.getID() + " (" + testcase.getPath() + ")";
        Path compilation = null;

        monitor.subTask(compID + " compiling " + testID);

        // create sub folder for compilation results
        Path tmpFolder;
        try {
            tmpFolder = Files.createTempDirectory("comp");
        } catch (IOException e) {
            System.out.println("Comparison failed: Could not create temporary output path.");
            return compilation;
        }
        // warm up caches; this result could also be used for size measuring
        try {
            compilation = compiler.compile(testcase.getPath(), tmpFolder);
        } catch (CompilationException e) {
            // errors will be caught within the measuring
        }

        // Note: Keeping a huge PriorityQueue in RAM might influence the results.
        PriorityQueue<Long> measurings = new PriorityQueue<Long>(k, new Comparator<Long>() {

            @Override
            public int compare(final Long o1, final Long o2) {
                // reverse natural order
                return o2.compareTo(o1);
            }
        });
        long best = 0;

        // compare compilation speed
        if (config.compareCompSpeed()) {
            for (int i = 1; i <= m; i++) {
                // if the comparison got canceled within the progress monitor,
                // react to it and cancel this comparison job
                if (monitor.isCanceled()) {
                    // measurements are discarded
                    return compilation;
                }
                long compStart = System.currentTimeMillis();
                try {
                    // TODO suppress compiler console output
                    compilation = compiler.compile(testcase.getPath(), tmpFolder);
                } catch (CompilationException e) {
                    // something went wrong, save the error message as result
                    dataHandler
                            .serialize(comparison, new CompError(compID, testID, e.getMessage()));
                    // continue with other test cases / compilers
                    break;
                }
                long compTime = System.currentTimeMillis() - compStart;
                if (best == 0 || best > compTime) {
                    best = compTime;
                }

                measurings.add(compTime);
                // check if enough measurings are in close range
                if (i >= k) {
                    if (measurings.peek() <= (1.0 + epsilon) * best) {
                        break;
                    } else {
                        measurings.poll();
                    }
                }
            }

            // save best compilation speed result
            if (best != 0) {
                dataHandler.serialize(comparison, new CompSpeedMeasuring(compID, testID, best));
            }
        }

        // compare compilation size
        if (config.compareCompSize() && compilation != null) {
            BufferedReader br = null;
            try {
                // measure file size in bytes
                File file = compilation.toFile();
                dataHandler.serialize(comparison,
                        new CompSizeMeasuring(compID, testID, file.length()));

                // measure file size in line of code
                br = new BufferedReader(new FileReader(file));
                int i = 0;
                while (br.readLine() != null) {
                    i++;
                }
                dataHandler.serialize(comparison, new CompLoCMeasuring(compID, testID, i));
            } catch (IOException e) {
                // LoC measuring failed
                dataHandler.serialize(comparison, new CompError(compID, testID,
                        "LoC measuring failed."));
            } finally {
                try {
                    if (br != null) {
                        br.close();
                    }
                } catch (IOException e) {
                    // not much to do in this case, except maybe logging
                }
            }
        }

        monitor.worked(10);

        return compilation;
    }
}
