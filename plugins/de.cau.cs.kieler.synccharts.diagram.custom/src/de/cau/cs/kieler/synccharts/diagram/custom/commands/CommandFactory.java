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
package de.cau.cs.kieler.synccharts.diagram.custom.commands;

import java.net.URL;
import java.util.List;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.ui.IEditorPart;
import org.osgi.framework.Bundle;

import de.cau.cs.kieler.core.model.transformation.ITransformationFramework;
import de.cau.cs.kieler.core.model.transformation.xtend.XtendTransformationFramework;
import de.cau.cs.kieler.kiml.ui.layout.DiagramLayoutManager;
import de.cau.cs.kieler.ksbase.ui.handler.TransformationCommand;
import de.cau.cs.kieler.synccharts.diagram.custom.SyncchartsDiagramCustomPlugin;

/**
 * Creates the cut, copy and paste commands from ksbase.
 * 
 * @author soh
 */
public class CommandFactory {

    /** The transformation file. */
    private static final String FILE = "/transformations/feature.ext";

    /** The base package of the underlying meta model. */
    private static final String MODEL = "de.cau.cs.kieler.synccharts.SyncchartsPackage";

    /** The transformation framework. */
    private static final ITransformationFramework framework = new XtendTransformationFramework();

    /** The path of the transformation file. */
    private static String FILE_PATH = FILE;

    {
        Bundle bundle = SyncchartsDiagramCustomPlugin.instance.getBundle();
        if (bundle != null) {
            URL urlPath = bundle.getEntry("/" + FILE);
            FILE_PATH = urlPath.toString();
        }
    }

    /**
     * Build a new copy command.
     * 
     * @param part
     *            the editor
     * @param selection
     *            the selection
     * @return the command
     */
    public static ICommand buildCopyCommand(final IDiagramWorkbenchPart part,
            final List<Object> selection) {
        return buildCommand(part, selection, "Copy");
    }

    /**
     * Build a new cut command.
     * 
     * @param part
     *            the editor
     * @param selection
     *            the selection
     * @return the command
     */
    public static ICommand buildCutCommand(final IDiagramWorkbenchPart part,
            final List<Object> selection) {
        return buildCommand(part, selection, "Cut");
    }

    /**
     * Build a new paste command.
     * 
     * @param part
     *            the editor
     * @param selection
     *            the selection
     * @return the command
     */
    public static ICommand buildPasteCommand(final IDiagramWorkbenchPart part,
            final List<Object> selection) {
        doAutoLayoutInternal();
        return buildCommand(part, selection, "Paste");
    }

    /**
     * Build a command.
     * 
     * @param part
     *            the editor
     * @param selection
     *            the selection
     * @param label
     *            the label and name of the transformation
     * @return the command
     */
    private static ICommand buildCommand(final IDiagramWorkbenchPart part,
            final List<Object> selection, final String label) {
        TransformationCommand result = null;
        if (part instanceof DiagramEditor) {
            DiagramEditor editor = (DiagramEditor) part;
            TransactionalEditingDomain transDomain = editor.getEditingDomain();

            result = new TransformationCommand(transDomain, label, null);
            result.initalize(editor, selection, label.toLowerCase(), FILE_PATH,
                    MODEL, framework);
        }

        return result;
    }

    /**
     * Do an autolayout of the selected object.
     * 
     * @param object
     *            the object
     */
    private static void doAutoLayoutInternal() {
        if (WorkerThread.isRunning) {
            WorkerThread.reset();
        } else {
            WorkerThread thread = new WorkerThread();
            thread.start();
        }
    }

    /**
     * Thread for triggering an autolayout after some time.
     * 
     * @author soh
     */
    private static class WorkerThread extends Thread {

        /** Delay before auto layout. */
        private static final long WAIT_TIME = 1000;

        /** Check interval. */
        private static final long INTERVAL = 100;

        /** If the thread is running. */
        static boolean isRunning = false;

        /** The start time. WAIT_TIME after this the layout will be triggered. */
        private static long start;

        @Override
        public void run() {
            isRunning = true;
            start = System.currentTimeMillis();

            while (System.currentTimeMillis() - start < WAIT_TIME) {
                try {
                    Thread.sleep(INTERVAL);
                } catch (InterruptedException e0) {
                    e0.printStackTrace();
                }
            }

            isRunning = false;
            SyncchartsDiagramCustomPlugin.instance.getDisplay().asyncExec(
                    new Runnable() {

                        @Override
                        public void run() {
                            IEditorPart editorPart = SyncchartsDiagramCustomPlugin.instance
                                    .getActiveEditorPart();
                            if (editorPart != null) {
                                DiagramLayoutManager.layout(editorPart, null,
                                        true, false);
                            }
                        }
                    });

        }

        /**
         * reset the timer.
         */
        static void reset() {
            start = System.currentTimeMillis();
        }
    }
}
