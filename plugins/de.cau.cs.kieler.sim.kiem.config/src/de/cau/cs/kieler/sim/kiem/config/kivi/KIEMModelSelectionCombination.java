/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.kiem.config.kivi;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.ui.editor.XtextEditor;

import de.cau.cs.kieler.core.model.util.EditorUtils;
import de.cau.cs.kieler.core.model.util.ModelUtil;
import de.cau.cs.kieler.core.model.util.XtextModelingUtil;
import de.cau.cs.kieler.sim.kiem.IKiemEventListener;
import de.cau.cs.kieler.sim.kiem.KiemEvent;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.internal.KiemProxyEditor;

/**
 * A KiVi Combination controlling the provisioning of active and opened model files to select from
 * in simulators.
 * 
 * @author cmot
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow cmot
 * 
 */
public class KIEMModelSelectionCombination implements
        IKiemEventListener {

    /** The time to sleep during blocking wait. */
    public static final int SLEEP_WAIT_TIME = 50;

    /** The deferred editor part that may be set while KIEM was executing or initializing. */
    private static IEditorPart deferredEditorPart = null;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new kIEM model selection combination.
     */
    public KIEMModelSelectionCombination() {
    }

    // -------------------------------------------------------------------------

    /**
     * Execute.
     * 
     * @param partState
     *            the part state
     */
    public void execute(final IWorkbenchPartReference partRef) {
        // to prevent UI thread deadlocks (editorIsActivePart) because during initialization
        // components may require UI access, do not execution at this point
        if (KiemPlugin.getDefault().isInitializingExecution()) {
            return;
        }

        // if currently active editor is also the active part
        IWorkbenchPart part = partRef.getPart(false);
        if (part != null && part instanceof IEditorPart) {
            // Select the active editor
            IEditorPart activeEditorPart = (IEditorPart) part;

            // this is a special editor and we do'nt want to adjust kiem when it is loaded
            if (activeEditorPart == null || activeEditorPart instanceof KiemProxyEditor) {
                return;
            }

            refreshKIEMActiveAndOpenedModels(activeEditorPart);
        }

    }

    // -------------------------------------------------------------------------
    
    
    
    /**
     * Refresh KIEM's the active and the list of opened models that serves as an input for the model
     * selection KIEMProperty of simulator components.
     */
    public static void refreshKIEMActiveAndOpenedModels(final IEditorPart activeEditorPart) {
        // if no execution is running or is about to run
        if (!(KiemPlugin.getDefault().isInitializingExecution() || KiemPlugin.getDefault()
                .getExecution() != null)) {
            // reset any deferred partState
            deferredEditorPart = null;
            if (KIEMExecutionAutoloadCombination.getLastValidEditorId() == null) {
              //Is the following right?! By-pass setting this seems to corrupt detection 
              //wether this is the first start
              //KIEMExecutionAutoloadCombination.setLastValidEditorId(activeEditorPart.getSite().getId());
            }
            refreshKIEMActiveAndOpenedModels2(activeEditorPart);
        } else {
            // defer the partState until KIEM is stopping
            // then a KIEM event will trigger this combination
            deferredEditorPart = activeEditorPart;
        }    }
    
    // -------------------------------------------------------------------------

    
    private static void refreshKIEMActiveAndOpenedModels2(final IEditorPart activeEditorPart) {
        IEditorPart[] localEditors = getEditorList();
        if ((localEditors == null) || (localEditors.length == 0)) {
            return;
        }

//        // By default reset opened editors (also no active one)
//        KiemPlugin.getOpenedModelFiles().clear();
//        KiemPlugin.setCurrentModelFile(null);
//        KiemPlugin.getOpenedModelEditors().clear();
//        KiemPlugin.getOpenedModelRootObjects().clear();

        // Go thru all editors
        for (IEditorPart editorPart : localEditors) {
            IPath inputModelPath = ModelUtil.getInputModelPath(editorPart);
           
            if (inputModelPath != null) {
                // this is the active editor if any
                if (editorPart == activeEditorPart) {
                    KiemPlugin.setCurrentModelFile(inputModelPath);
                }

                // add to opened model files
                KiemPlugin.getOpenedModelFiles().add(inputModelPath);
                EObject rootObject = ModelUtil.getInputModelEObject(editorPart);

                if (rootObject != null) {
                    KiemPlugin.getOpenedModelRootObjects().put(inputModelPath, rootObject);
                }
                if (editorPart != null) {
                    KiemPlugin.getOpenedModelEditors().put(inputModelPath, editorPart);
                }
            }

        }

    }

    // -------------------------------------------------------------------------

    private static boolean doneGetEditorList = false;
    private static IEditorPart[] editors = null;

    /**
     * Gets the editor list in the UI thread.
     * 
     * @return the editor list
     */
    private static IEditorPart[] getEditorList() {
        doneGetEditorList = false;
        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                IWorkbench workbench = PlatformUI.getWorkbench();
                if (workbench != null) {
                    IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
                    if (workbenchWindow != null) {
                        IWorkbenchPage page = workbenchWindow.getActivePage();
                        if (page != null) {
                            IEditorReference[] editorReferences = page.getEditorReferences();
                            editors = new IEditorPart[editorReferences.length];
                            int c = 0;
                            for (IEditorReference editorReference : editorReferences) {
                                IEditorPart editorPart = editorReference.getEditor(true);
                                editors[c++] = editorPart;
                            }
                        }
                    }
                }
                doneGetEditorList = true;
            }
        });

        while (!doneGetEditorList) {
            try {
                Thread.sleep(SLEEP_WAIT_TIME);
            } catch (InterruptedException e) {
                // ignore sleeping errors
            }
        }
        return editors;

    }



    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void notifyEvent(final KiemEvent event) {
        if (event.isEvent(KiemEvent.ERROR_STOP) || event.isEvent(KiemEvent.EXECUTION_STOP)) {
            // In case of erroneous or intended execution stops
            // trigger to select the NOW current model
            if (deferredEditorPart != null) {
                refreshKIEMActiveAndOpenedModels(deferredEditorPart);
            }
        }
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public KiemEvent provideEventOfInterest() {
        int[] events = { KiemEvent.EXECUTION_STOP, KiemEvent.ERROR_STOP };
        return new KiemEvent(events);
    }

    // -------------------------------------------------------------------------
}
