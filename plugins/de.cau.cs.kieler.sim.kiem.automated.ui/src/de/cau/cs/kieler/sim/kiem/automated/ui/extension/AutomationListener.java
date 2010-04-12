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
package de.cau.cs.kieler.sim.kiem.automated.ui.extension;

import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;

import de.cau.cs.kieler.sim.kiem.automated.AbstractAutomationListener;
import de.cau.cs.kieler.sim.kiem.automated.data.AbstractResult;
import de.cau.cs.kieler.sim.kiem.automated.data.IterationResult;
import de.cau.cs.kieler.sim.kiem.automated.ui.KiemAutoUIPlugin;
import de.cau.cs.kieler.sim.kiem.automated.ui.views.AutomatedEvalView;
import de.cau.cs.kieler.sim.kiem.automated.ui.views.ExecutionFilePanel;

/**
 * Listens to events coming from the automated execution and is responsible for
 * relaying them to the different view elements.
 * 
 * @author soh
 * @kieler.rating 2010-04-12 proposed yellow
 */
public class AutomationListener extends AbstractAutomationListener {

    /**
     * 
     * {@inheritDoc}
     */
    @Override
    public void doPreAutomationProcessing() {
        KiemAutoUIPlugin.getDisplay().syncExec(new Runnable() {

            /**
             * 
             * {@inheritDoc}
             */
            public void run() {

                try {
                    // activate the KIEM view in order to force eclipse to load
                    // its
                    // classes
                    IWorkbenchPage page = KiemAutoUIPlugin.getActivePage();

                    if (page != null) {
                        page.showView("de.cau.cs.kieler.sim.kiem.view");
                    }

                } catch (PartInitException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void executionFileStarted(final IPath executionFile,
            final Exception exception) {
        KiemAutoUIPlugin.getDisplay().syncExec(new Runnable() {

            /**
             * 
             * {@inheritDoc}
             */
            public void run() {
                AutomatedEvalView automatedView = KiemAutoUIPlugin
                        .getAutomatedEvalView();
                if (exception != null) {
                    automatedView.addExecutionFileFailed(executionFile,
                            exception);
                } else {
                    automatedView.addExecutionFile(executionFile);
                }
            }
        });
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void receiveIterationResult(final IterationResult result) {
        KiemAutoUIPlugin.getDisplay().syncExec(new Runnable() {
            /**
             * {@inheritDoc}
             */
            public void run() {
                AutomatedEvalView automatedView = KiemAutoUIPlugin
                        .getAutomatedEvalView();
                automatedView.addIterationResult(result);
            }
        });
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void receiveIterationResult(final List<IterationResult> results) {
        KiemAutoUIPlugin.getDisplay().syncExec(new Runnable() {
            /**
             * {@inheritDoc}
             */
            public void run() {
                AutomatedEvalView automatedView = KiemAutoUIPlugin
                        .getAutomatedEvalView();
                automatedView.addIterationResult(results);
            }
        });
    }

    /**
     * 
     * {@inheritDoc}
     */
    @Override
    public void receiveModelFileResults(final IPath executionFile,
            final List<AbstractResult> results) {
        KiemAutoUIPlugin.getDisplay().syncExec(new Runnable() {
            /**
             * {@inheritDoc}
             */
            public void run() {
                AutomatedEvalView automatedView = KiemAutoUIPlugin
                        .getAutomatedEvalView();
                ExecutionFilePanel panel = automatedView
                        .addExecutionFile(executionFile);
                panel.addResult(results);
            }
        });

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void refresh() {
        KiemAutoUIPlugin.getDisplay().syncExec(new Runnable() {
            /**
             * {@inheritDoc}
             */
            public void run() {
                AutomatedEvalView automatedView = KiemAutoUIPlugin
                        .getAutomatedEvalView();
                automatedView.refresh();
            }
        });
    }

}
