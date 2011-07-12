/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kies.transformation.action;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.core.ui.util.MonitoredOperation;
import de.cau.cs.kieler.kies.transformation.Activator;
import de.cau.cs.kieler.kies.transformation.util.TransformationUtil;
import de.cau.cs.kieler.kies.transformation.util.TransformationUtil.TransformationType;
import de.cau.cs.kieler.kiml.ui.diagram.LayoutEffect;

/**
 * @author uru
 * 
 */
public class InitialTransformationAction implements IActionDelegate {

    private IFile strlFile;

    /**
     * In case an .strl file is selected perform a complete transformation and optimization and open
     * the created .kids in the SyncCharts editor.
     * 
     * @param action
     *            no need for this here
     */
    public void run(final IAction action) {
        if (strlFile == null || !strlFile.exists()) {
            return;
        }
        try {
            PlatformUI.getWorkbench().getProgressService()
                    .run(false, true, new IRunnableWithProgress() {
                        public void run(final IProgressMonitor uiMonitor) {
                            try {
                                uiMonitor.beginTask("Initial Transformation",
                                        IProgressMonitor.UNKNOWN);
                                final long start = System.currentTimeMillis();
                                final IFile kixsFile = TransformationUtil.strlToKixs(strlFile);
                                uiMonitor.beginTask(
                                        "Performing Esterel To SyncCharts Transformation",
                                        IProgressMonitor.UNKNOWN);
                                if (kixsFile == null) {
                                    throw new Exception(strlFile
                                            + " could not be transformed "
                                            + "initially into a SyncCharts.");
                                }
                                boolean success = false;
                                success = TransformationUtil.performHeadlessTransformation(
                                        kixsFile, TransformationType.E2S);
                                uiMonitor.beginTask("Performing SyncCharts Optimization",
                                        IProgressMonitor.UNKNOWN);
                                if (!success) {
                                    throw new Exception(strlFile
                                            + ": Transformating Esterel elements "
                                            + "to their SyncCharts equivalent failed.");
                                }
                                success = TransformationUtil.performHeadlessTransformation(
                                        kixsFile, TransformationType.SYNC_OPT);
                                if (!success) {
                                    throw new Exception(strlFile
                                            + ": Optimizing the transformed SyncCharts failed.");
                                }
                                uiMonitor
                                        .beginTask("Opening the Diagram", IProgressMonitor.UNKNOWN);
                                TransformationUtil.openKidsInEditor(kixsFile);
                                LayoutEffect effect = new LayoutEffect(TransformationUtil
                                        .getActiveEditor(), null);
                                effect.schedule();
                                final long end = System.currentTimeMillis();

                                MonitoredOperation.runInUI(new Runnable() {

                                    public void run() {
                                        IWorkbenchPart editor = TransformationUtil
                                                .getActiveEditor();
                                        IWorkbenchPartSite site = editor.getSite();
                                        IActionBars bars = ((IEditorSite) site).getActionBars();
                                        bars.getStatusLineManager().setMessage(
                                                "Transformed SyncCharts from " + strlFile.getName()
                                                        + " (" + (end - start) + "ms)");
                                    }
                                }, false);

                            } catch (Exception ke) {
                                Status s = new Status(Status.ERROR, Activator.PLUGIN_ID,
                                        "Could not transform " + strlFile.getName()
                                                + " into a SyncCharts.", ke);
                                StatusManager.getManager().handle(s, StatusManager.SHOW);
                            }
                        }
                    });
        } catch (Exception e) {
            Status s = new Status(Status.ERROR, Activator.PLUGIN_ID, "Could not transform "
                    + strlFile.getName() + " into a SyncCharts.", e);
            StatusManager.getManager().handle(s, StatusManager.SHOW);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void selectionChanged(final IAction action, final ISelection selection) {
        action.setEnabled(false);
        if (!(selection instanceof IStructuredSelection) || selection.isEmpty()) {
            return;
        }
        strlFile = (IFile) ((IStructuredSelection) selection).getFirstElement();
        action.setEnabled(true);
    }

    /**
     * @return the currentFile
     */
    public IFile getCurrentFile() {
        return strlFile;
    }

}
