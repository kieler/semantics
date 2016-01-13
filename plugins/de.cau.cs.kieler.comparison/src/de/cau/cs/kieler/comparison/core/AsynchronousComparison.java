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
import java.io.FileNotFoundException;
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
 * @author nfl
 *
 */
public class AsynchronousComparison extends Job {

    /**
     * @param comparison
     * @param name
     */
    public AsynchronousComparison(ComparisonConfig config, String comparison) {
        super("Asynchronous Comparison Job");

        setUser(true);
        this.config = config;
        this.comparison = comparison;
    }

    private ComparisonConfig config;
    private String comparison;

    /**
     * {@inheritDoc}
     */
    @Override
    protected IStatus run(IProgressMonitor monitor) {

        Collection<ICompiler> compilers = config.getCompilers();
        Collection<ITestcase> testcases = config.getTestcases();
        String outputPath = config.getOutputPath() + "compilationResults/";
        int compAmount = config.getCompareCompSpeedAmount();
        if (!config.compareCompSpeed() || compAmount < 1)
            compAmount = 1;
        int execAmount = config.getCompareExecSpeedAmount();
        if (!config.compareExecSpeed() || execAmount < 1)
            execAmount = 1;

        IDataHandler dataHandler = DataHandler.getDataHandler();

        int totalWork = compilers.size() * testcases.size();
        if (config.compareCompSize())
            totalWork *= compAmount + 1;
        else
            totalWork *= compAmount;
        monitor.beginTask("Compiler Comparison", totalWork);

        String compilation = null;
        for (ICompiler comp : compilers) {
            for (ITestcase test : testcases) {
                // compare comp speed
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
                        dataHandler.serialize(comparison, new CompError(comp.getID(), test.getID(),
                                e.getMessage()));
                        monitor.worked(1);
                        continue;
                    }
                    long compTime = System.currentTimeMillis() - compStart;
                    dataHandler.serialize(comparison,
                            new CompSpeedMeasuring(comp.getID(), test.getID(), compTime));

                    monitor.worked(1);
                    if (monitor.isCanceled()) {
                        monitor.done();
                        return new Status(IStatus.CANCEL, Activator.PLUGIN_ID,
                                "Comparison canceled.");
                    }
                }

                // compare size
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
                        e.printStackTrace();
                    } finally {
                        try {
                            br.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        monitor.worked(1);
                    }
                }
            }
        }

        // TODO execution
        // input traces contain the file src file extension,
        // e.g. /abro.sct and /abro.sct.in

        monitor.done();

        return new Status(IStatus.OK, Activator.PLUGIN_ID, "Comparison done.");
    }
}
