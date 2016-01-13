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
import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

import de.cau.cs.kieler.comparison.Activator;
import de.cau.cs.kieler.comparison.datahandler.DataHandler;
import de.cau.cs.kieler.comparison.datahandler.IDataHandler;
import de.cau.cs.kieler.comparison.exchange.ComparisonConfig;
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
        // the testcases, which are used within the comparison
        Collection<ITestcase> testcases = config.getTestcases();
        // the path to outputs like compilations
        String outputPath = config.getOutputPath() + "compilationResults/";
        // the amount of compilations each compiler has to do
        int compAmount = config.getCompareCompSpeedAmount();
        if (!config.compareCompSpeed() || compAmount < 1)
            compAmount = 1;
        // the amount of executions each compilation has to be run
        int execAmount = config.getCompareExecSpeedAmount();
        if (!config.compareExecSpeed() || execAmount < 1)
            execAmount = 1;

        // the IDataHandler is used to save the comparison results
        IDataHandler dataHandler = DataHandler.getDataHandler();

        // estimation of work, which has to be done within the comparison;
        // used in the progress monitor
        int totalWork = compilers.size() * testcases.size();
        if (config.compareCompSize())
            totalWork *= compAmount + 1;
        else
            totalWork *= compAmount;
        monitor.beginTask("Compiler Comparison", totalWork);

        String compilation = null;
        // each compiler has to compile each testcase
        for (ICompiler comp : compilers) {
            for (ITestcase test : testcases) {
                // compare compilation speed
                for (int i = 0; i < compAmount; i++) {
                    monitor.subTask(comp.getID() + " compiling " + test.getID() + " : " + (i + 1)
                            + "/" + compAmount);

                    long compStart = System.currentTimeMillis();
                    try {
                        // create sub folder for compilation results
                        File folder = new File(outputPath);
                        if (!folder.exists() && !folder.mkdirs())
                            throw new CompilationException(
                                    "Comparison failed: Could not create output into given path.");
                        // TODO suppress compiler console output
                        compilation = comp.compile(test.getTestcase(), outputPath);
                    } catch (CompilationException e) {
                        // something went wrong, save the error message as result anyway
                        dataHandler.serialize(comparison, new CompError(comp.getID(), test.getID(),
                                e.getMessage()));
                        monitor.worked(1);
                        // continue with other testcases / compilers
                        continue;
                    }
                    long compTime = System.currentTimeMillis() - compStart;
                    // save the compilation speed
                    dataHandler.serialize(comparison,
                            new CompSpeedMeasuring(comp.getID(), test.getID(), compTime));

                    monitor.worked(1);
                    // if the comparison got cancled within the progress monitor,
                    // react to it and cancel this comparison job
                    if (monitor.isCanceled()) {
                        monitor.done();
                        return new Status(IStatus.CANCEL, Activator.PLUGIN_ID,
                                "Comparison canceled.");
                    }
                }

                // compare compilation size
                if (config.compareCompSize() && compilation != null) {
                    BufferedReader br = null;
                    try {
                        // measure file size in bytes
                        File file = new File(compilation);
                        dataHandler.serialize(comparison,
                                new CompSizeMeasuring(comp.getID(), test.getID(), file.length()));

                        // measure file size in line of code
                        br = new BufferedReader(new FileReader(file));
                        int i = 0;
                        while (br.readLine() != null) {
                            i++;
                        }
                        dataHandler.serialize(comparison,
                                new CompLoCMeasuring(comp.getID(), test.getID(), i));
                    } catch (IOException e) {
                        // LoC measuring failed
                        dataHandler.serialize(comparison, new CompError(comp.getID(), test.getID(),
                                "LoC measuring failed."));
                    } finally {
                        try {
                            if (br != null)
                                br.close();
                        } catch (IOException e) {
                            // not much to do in this case, except maybe logging
                        }
                        monitor.worked(1);
                    }
                }
            }
        }

        // TODO execution
        // input traces contain the src file extension,
        // e.g. /abro.sct and /abro.sct.in

        monitor.done();

        return new Status(IStatus.OK, Activator.PLUGIN_ID, "Comparison done.");
    }
}
