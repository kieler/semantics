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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.ui.IEditorPart;
import org.osgi.framework.Bundle;

import de.cau.cs.kieler.core.model.transformation.ITransformationFramework;
import de.cau.cs.kieler.core.model.transformation.xtend.XtendTransformationFramework;
import de.cau.cs.kieler.kiml.ui.layout.DiagramLayoutManager;
import de.cau.cs.kieler.ksbase.ui.handler.TransformationCommand;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.Transition;
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
    private static String FILE_PATH = null;

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
            final List<EObject> selection) {
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
            final List<EObject> selection) {
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
            final List<EObject> selection) {
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
            final List<EObject> selection, final String label) {
        Bundle bundle = SyncchartsDiagramCustomPlugin.instance.getBundle();
        InputStream inStream = null;
        StringBuffer contentBuffer = new StringBuffer();
        try {
            if (bundle != null) {
                URL urlPath = bundle.getEntry(FILE);
                // Parse transformation file to read transformations and
                // parameters now:
                if (urlPath != null) {
                    inStream = urlPath.openStream();
                    while (inStream.available() > 0) {
                        contentBuffer.append((char) inStream.read());

                    }
                }
            }
            // Write transformation file to .metadata
            IPath path = ResourcesPlugin.getPlugin().getStateLocation();
            // Transformation file name:
            path = path.append("feature").addFileExtension("ext");

            File file = new File(path.toOSString());
            if (file != null) {
                FileOutputStream out = null;
                try {
                    out = new FileOutputStream(file);
                    if (out != null) {
                        if (!file.exists()) {
                            if (!file.createNewFile()) {
                                System.out.println("Can't create file.");
                            }
                        }

                        out.write(contentBuffer.toString().getBytes());
                        out.flush();
                        out.close();
                    }
                } catch (FileNotFoundException fne) {
                } catch (SecurityException sece) {
                } finally {
                    if (out != null) {
                        out.close();
                    }
                }
                // Set delete on exit flag, so the files will be cleaned when
                // exiting
                // eclipse
                FILE_PATH = file.getAbsolutePath();
                file.deleteOnExit();
            }
        } catch (IOException e0) {
            e0.printStackTrace();
        }
        TransformationCommandWithAutoLayout result = null;
        if (part instanceof DiagramEditor) {
            if (WorkerJob.instance != null) {
                WorkerJob.instance.cancel();
            }
            DiagramEditor editor = (DiagramEditor) part;
            TransactionalEditingDomain transDomain = editor.getEditingDomain();

            result = new TransformationCommandWithAutoLayout(transDomain, label);

            if (selection.size() > 1) {

                boolean hasStateList = false;
                boolean hasRegionList = false;
                boolean hasTransitionList = false;
                List<String> pureMapping = new LinkedList<String>();

                for (int i = 0; i < selection.size(); i++) {
                    EObject obj = selection.get(i);
                    if (obj instanceof State) {
                        pureMapping.add("State");
                        hasStateList = true;
                    } else if (obj instanceof Region) {
                        pureMapping.add("Region");
                        hasRegionList = true;
                    } else if (obj instanceof Transition) {
                        pureMapping.add("Transition");
                        hasTransitionList = true;
                    }
                }

                List<String[]> possibleMappings = new LinkedList<String[]>();
                if (hasStateList) {
                    String[] array = { "List[State]" };
                    possibleMappings.add(array);
                } else if (hasRegionList) {
                    String[] array = { "List[Region]" };
                    possibleMappings.add(array);
                } else if (hasTransitionList) {
                    String[] array = { "List[Transition]" };
                    possibleMappings.add(array);
                }
                possibleMappings.add(pureMapping.toArray(new String[pureMapping
                        .size()]));

                for (String[] s : possibleMappings) {
                    List<Object> mappedSelection = framework
                            .createParameterMapping(selection, s);

                    if (mappedSelection != null
                            && result
                                    .initalize(editor, mappedSelection, label
                                            .toLowerCase(), FILE_PATH, MODEL,
                                            framework)) {
                        break;
                    }
                }
            } else {
                List<Object> list = new LinkedList<Object>();
                list.add(selection.get(0));
                result.initalize(editor, list, label.toLowerCase(), FILE_PATH,
                        MODEL, framework);
            }
        }

        return result;
    }

    /**
     * This transformation command performs an auto layout some time after the
     * last transformation.
     * 
     * @author soh
     */
    private static class TransformationCommandWithAutoLayout extends
            TransformationCommand {

        /** The label. */
        private String label;

        /** The delay. */
        private static final int DELAY = 500;

        /**
         * Creates a new Transformation command.
         * 
         * @param domain
         * @param labelParam
         */
        public TransformationCommandWithAutoLayout(
                TransactionalEditingDomain domain, String labelParam) {
            super(domain, labelParam, null);
            this.label = labelParam;
        }

        @Override
        protected CommandResult doExecuteWithResult(
                final IProgressMonitor monitor, final IAdaptable info)
                throws ExecutionException {
            CommandResult res = super.doExecuteWithResult(monitor, info);
            if (label.equalsIgnoreCase("paste")) {
                // DiagramEditor editor = (DiagramEditor) part;
                // TransactionalEditingDomain transDomain = editor
                // .getEditingDomain();
                //
                // TransformationCommand result = new TransformationCommand(
                // transDomain, label, null);
                // List<Object> dummy = new LinkedList<Object>();
                // dummy.add(new Object());
                // result.initalize(editor, dummy, "dummy", FILE_PATH, MODEL,
                // framework);
                // result.execute(monitor, info);

                // if (sel == null) {
                // sel = ((View) part.getDiagramEditPart().getModel())
                // .getElement();
                // }
                // List<?> editPolicies = CanonicalEditPolicy
                // .getRegisteredEditPolicies(sel);
                // for (Iterator<?> it = editPolicies.iterator(); it.hasNext();)
                // {
                // CanonicalEditPolicy nextEditPolicy = (CanonicalEditPolicy) it
                // .next();
                // nextEditPolicy.refresh();
                // }
                // IDiagramGraphicalViewer graphViewer = part
                // .getDiagramGraphicalViewer();
                // graphViewer.flush();
                WorkerJob job = new WorkerJob();
                job.schedule(DELAY);

            }
            return res;
        }
    }

    /**
     * Thread for triggering an autolayout after some time.
     * 
     * @author soh
     */
    private static class WorkerJob extends Job {

        /** The instance of the job. */
        static WorkerJob instance = null;

        /**
         * Creates a new CommandFactory.java.
         * 
         * @param name
         */
        public WorkerJob() {
            super("Autolayout");
            instance = this;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        protected IStatus run(final IProgressMonitor monitor) {
            SyncchartsDiagramCustomPlugin.instance.getDisplay().syncExec(
                    new Runnable() {

                        public void run() {
                            IEditorPart editorPart = SyncchartsDiagramCustomPlugin.instance
                                    .getActiveEditorPart();
                            if (editorPart != null) {
                                DiagramLayoutManager.layout(editorPart, null,
                                        true, false);
                            }
                        }
                    });
            return new Status(IStatus.OK,
                    "de.cau.cs.kieler.synccharts.diagram.custom", "Layout done");
        }
    }
}
