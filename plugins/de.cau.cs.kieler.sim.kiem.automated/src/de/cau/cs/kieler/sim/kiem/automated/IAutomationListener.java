/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.kiem.automated;

import java.util.List;

import org.eclipse.core.runtime.IPath;

import de.cau.cs.kieler.sim.kiem.automated.data.AbstractResult;
import de.cau.cs.kieler.sim.kiem.automated.data.IterationResult;

/**
 * This interface is for plugins who want to listen to the automated execution.
 * 
 * @author soh
 */
public interface IAutomationListener {

    /**
     * This method indicates that the automation tried to start a new execution
     * file. If starting the file failed the exception will be passed.
     * 
     * @param executionFile
     *            the path to the execution file
     * @param exception
     *            an exception that caused the file to fail, null if the file
     *            was started successfully
     */
    void executionFileStarted(IPath executionFile, Exception exception);

    /**
     * This method will pass all summarized model file results produced by the
     * given execution file. It will be called once the execution file was
     * completely simulated.
     * 
     * @param executionFile
     *            the execution file
     * @param results
     *            the list of model file results
     */
    void receiveModelFileResults(IPath executionFile,
            List<AbstractResult> results);

    /**
     * Publishes the result of the currently running iteration. This result
     * might NOT be complete yet and some information in it might be changed or
     * updated until the iteration finishes. All listeners should re-check the
     * iteration results when the refresh method is called.
     * 
     * @param result
     *            the result
     */
    void receiveIterationResult(IterationResult result);

    /**
     * Publishes a list of results of the last couple of iterations. The results
     * might NOT be complete yet and some information in them might be changed
     * or updated until the model file finishes. All listeners should re-check
     * the iteration results when the refresh method is called.
     * 
     * @param results
     *            the results
     */
    void receiveIterationResult(List<IterationResult> results);

    /**
     * Notifies the listeners that information in the already produced results
     * may have changed and that the listeners should re-check the values.
     * 
     * A change should only happen in the results connected to the currently
     * simulated execution file.
     */
    void refresh();

    /**
     * This method is called immediately before the automation starts and gives
     * listeners a chance to perform some action like opening views or loading
     * plugins.
     */
    void doPreAutomationProcessing();

    /**
     * This method is called immediately after the entire automation has
     * finished.
     */
    void doPostAutomationProcessing();
}
