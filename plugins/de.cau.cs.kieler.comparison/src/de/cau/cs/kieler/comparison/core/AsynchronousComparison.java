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
import de.cau.cs.kieler.comparison.datahandler.DataHandler;
import de.cau.cs.kieler.comparison.datahandler.IDataHandler;
import de.cau.cs.kieler.comparison.exchange.ComparisonConfig;
import de.cau.cs.kieler.comparison.exchange.IMeasuringParameters;
import de.cau.cs.kieler.comparison.exchange.KBestMeasuringParameteres;
import de.cau.cs.kieler.comparison.exchange.StandardMeasuringParameters;
import de.cau.cs.kieler.comparison.measuring.CompError;
import de.cau.cs.kieler.comparison.measuring.CompLoCMeasuring;
import de.cau.cs.kieler.comparison.measuring.CompSizeMeasuring;
import de.cau.cs.kieler.comparison.measuring.CompSpeedMeasuring;

/**
 * AsynchronousComparison extends the Job class and is used to execute the comparison between
 * compilers. This job schedules itself and needs a ComparisonConfig and an identification string to
 * be created.
 * 
 * @author nfl
 */
public class AsynchronousComparison extends Job {

    /**
     * Creates and schedules a comparison job.
     * 
     * @param config
     *            the configuration for the comparison
     * @param comparison
     *            the identifier for the comparison
     */
    public AsynchronousComparison(ComparisonConfig config, String comparison) {
        super("Asynchronous Comparison Job");

        setUser(true);
        this.config = config;
        this.comparison = comparison;
        this.schedule();
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
    protected IStatus run(IProgressMonitor monitor) {
        // the compilers, which are used within the comparison
        Collection<ICompiler> compilers = config.getCompilers();
        // the test cases, which are used within the comparison
        Collection<ITestcase> testcases = config.getTestcases();

        // the IDataHandler is used to save the comparison results
        IDataHandler dataHandler = DataHandler.getDataHandler();

        // estimation of work, which has to be done within the comparison
        // used in the progress monitor
        int totalWork = compilers.size() * testcases.size() * 10;
        monitor.beginTask("Compiler Comparison", totalWork);

        if (config.compareCompSpeed() || config.compareCompSize()) {
            IMeasuringParameters compMeasuringParameters = config.getCompareCompParameters();
            if (compMeasuringParameters instanceof KBestMeasuringParameteres) {
                KBestMeasuringParameteres params =
                        (KBestMeasuringParameteres) compMeasuringParameters;
                
                compileKBest(monitor, params.getK(), params.getEpsilon(), params.getM());

                if (monitor.isCanceled()) {
                    monitor.done();
                    return new Status(IStatus.CANCEL, Activator.PLUGIN_ID, "Comparison canceled.");
                }
            } else if (compMeasuringParameters instanceof StandardMeasuringParameters) {
                StandardMeasuringParameters params =
                        (StandardMeasuringParameters) compMeasuringParameters;
                // K-Best with k = M results in exact k measurements no matter how close they are
                compileKBest(monitor, params.getComparisonAmount(), 0, params.getComparisonAmount());

                if (monitor.isCanceled()) {
                    monitor.done();
                    return new Status(IStatus.CANCEL, Activator.PLUGIN_ID, "Comparison canceled.");
                }
            } else {
                // no valid / known measuring selected
                // TODO better error logging
                System.out
                        .println("Comparison of compilations can not be done: unknown measuring.");
            }
        }

        // TODO execution with kiem simulator
        // berry's inputs are contained within a subfolder
        // kieler inputs use extension .eso
        // make sure inputs can be matched to exactly one test case

        monitor.done();

        return new Status(IStatus.OK, Activator.PLUGIN_ID, "Comparison done.");
    }

    /**
     * @param monitor
     * @param compilers
     * @param testcases
     * @param outputPath
     * @param k
     * @param epsilon
     * @param m
     * 
     */
    private void compileKBest(IProgressMonitor monitor, int k, double epsilon, int m) {

        // the compilers, which are used within the comparison
        Collection<ICompiler> compilers = config.getCompilers();
        // the test cases, which are used within the comparison
        Collection<ITestcase> testcases = config.getTestcases();
        
        IDataHandler dataHandler = DataHandler.getDataHandler();

        // each compiler has to compile each test case
        for (ICompiler comp : compilers) {
            String compID = comp.getID();
            for (ITestcase test : testcases) {
                String testID = test.getID() + " (" + test.getPath() + ")";
                monitor.subTask(compID + " compiling " + testID);
                Path compilation = null;
                // create sub folder for compilation results
                Path tmpFolder;
                try {
                    tmpFolder = Files.createTempDirectory("comp");
                } catch (IOException e) {
                    System.out.println("Comparison failed: Could not create temporary output path.");
                    continue;
                }
                // warm up caches; this result could also be used for size measuring
                try {
                    compilation = comp.compile(test.getPath(), tmpFolder);
                } catch (CompilationException e) {
                    // errors will be caught within the measuring
                }

                // Note: Keeping a huge PriorityQueue in RAM might influence the results.
                // queue to hold the best results
                PriorityQueue<Long> measurings = new PriorityQueue<Long>(k, new Comparator<Long>() {

                    @Override
                    public int compare(Long o1, Long o2) {
                        // reverse natural order
                        return o2.compareTo(o1);
                    }
                });
                long best = 0;
                
                if (config.compareCompSpeed()){
                    // compare compilation speed
                    for (int i = 0; i < m; i++) {
                        // if the comparison got canceled within the progress monitor,
                        // react to it and cancel this comparison job
                        if (monitor.isCanceled()) {
                            // measurements are discarded
                            return;
                        }
                        long compStart = System.currentTimeMillis();
                        try {
                            // TODO suppress compiler console output
                            compilation = comp.compile(test.getPath(), tmpFolder);
                        } catch (CompilationException e) {
                            // something went wrong, save the error message as result
                            dataHandler.serialize(comparison,
                                    new CompError(compID, testID, e.getMessage()));
                            // continue with other test cases / compilers
                            break;
                        }
                        long compTime = System.currentTimeMillis() - compStart;
                        if (best == 0 || best > compTime) {
                            best = compTime;
                        }

                        measurings.add(compTime);
                        if (i >= k) {
                            measurings.poll();
                            if (measurings.peek() <= (1.0 + epsilon) * best) {
                                break;
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
                        dataHandler.serialize(comparison, new CompSizeMeasuring(compID, testID,
                                file.length()));

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
                            if (br != null)
                                br.close();
                        } catch (IOException e) {
                            // not much to do in this case, except maybe logging
                        }
                    }
                }

                monitor.worked(10);
            }
        }
    }
}
