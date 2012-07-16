/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
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
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.ui.editor.XtextEditor;

import de.cau.cs.kieler.core.kivi.AbstractCombination;
import de.cau.cs.kieler.core.model.gmf.util.GmfModelingUtil;
import de.cau.cs.kieler.core.model.triggers.PartTrigger.PartState;
import de.cau.cs.kieler.core.model.xtext.util.XtextModelingUtil;
import de.cau.cs.kieler.sim.kiem.IKiemEventListener;
import de.cau.cs.kieler.sim.kiem.KiemEvent;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.internal.KiemProxyEditor;

/**
 * A KiVi Combination controlling the provisioning of active and opened model files to select from
 * in simulators.
 * 
 * @author cmot
 * 
 */
public class KIEMModelSelectionCombination extends AbstractCombination implements IKiemEventListener {

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
     * @param partState the part state
     */
    public void execute(final PartState partState) {
        // to prevent UI thread deadlocks (editorIsActivePart) because during initialization
        // components may require UI access, do not execution at this point
        if (KiemPlugin.getDefault().isInitializingExecution()) {
            return;
        }

        // if currently active editor is also the active part
        if (partState != null) {
            // Select the active editor
            IEditorPart activeEditorPart = partState.getEditorPart();

            // this is a special editor and we do'nt want to adjust kiem when it is loaded
            if (activeEditorPart == null || activeEditorPart instanceof KiemProxyEditor) {
                return;
            }

            // if no execution is running or is about to run
            if (!(KiemPlugin.getDefault().isInitializingExecution() || KiemPlugin.getDefault()
                    .getExecution() != null)) {
                // reset any deferred partState
                deferredEditorPart = null;
                refreshKIEMActiveAndOpenedModels(activeEditorPart);
            } else {
                // defer the partState until KIEM is stopping
                // then a KIEM event will trigger this combination
                deferredEditorPart = activeEditorPart;
            }
        }

    }

    // -------------------------------------------------------------------------

    /**
     * Refresh KIEM's the active and the list of opened models that serves as an input for the model
     * selection KIEMProperty of simulator components.
     */
    private void refreshKIEMActiveAndOpenedModels(final IEditorPart activeEditorPart) {
        // By default reset opened editors (also no active one)
        KiemPlugin.getOpenedModelFiles().clear();
        KiemPlugin.setCurrentModelFile(null);
        KiemPlugin.getOpenedModelEditors().clear();
        KiemPlugin.getOpenedModelRootObjects().clear();

        IEditorPart[] localEditors = getEditorList();
        if ((localEditors == null) || (localEditors.length == 0)) {
            return;
        }

        // Go thru all editors
        for (IEditorPart editorPart : localEditors) {
            IPath inputModelPath = getInputModelPath(editorPart);

            // this is the active editor if any
            if (editorPart == activeEditorPart) {
                KiemPlugin.setCurrentModelFile(inputModelPath);
            }

            // add to opened model files
            KiemPlugin.getOpenedModelFiles().add(inputModelPath);
            EObject rootObject = this.getInputModelEObject(editorPart);
            if (rootObject != null) {
                KiemPlugin.getOpenedModelRootObjects().put(inputModelPath, rootObject);
            }
            if (editorPart != null) {
                KiemPlugin.getOpenedModelEditors().put(inputModelPath, editorPart);
            }

        }

    }

    // -------------------------------------------------------------------------

    private boolean doneGetEditorList = false;
    private IEditorPart[] editors = null;

    /**
     * Gets the editor list in the UI thread.
     * 
     * @return the editor list
     */
    IEditorPart[] getEditorList() {
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
     * Gets the input model EObject.
     * 
     * @param editorPart
     *            the editor part
     * @return the input model e object
     */
    protected EObject getInputModelEObject(final IEditorPart editorPart) {
        EObject model = null;
        if (editorPart instanceof DiagramEditor) {
            model = GmfModelingUtil.getModelFromGmfEditor((DiagramEditor) editorPart);
        } else if (editorPart instanceof XtextEditor) {
            boolean ignoreDirtyEditor = true;
            model = XtextModelingUtil.getModelFromXtextEditor((XtextEditor) editorPart,
                    ignoreDirtyEditor);
        }
        return model;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the input model.
     * 
     * @param editorPart
     *            the editor part
     * @return the input model
     */
    protected IPath getInputModelPath(final IEditorPart editorPart) {
        EObject model = this.getInputModelEObject(editorPart);
        IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
        IPath fullPath = null;
        if (model != null) {
            // EMF model case
            org.eclipse.emf.common.util.URI uri = model.eResource().getURI();
            IPath path = new Path(uri.toPlatformString(false));
            IFile file = myWorkspaceRoot.getFile(path);
            fullPath = file.getFullPath();
        } else {
            // Other editors
            IEditorInput editorInput = editorPart.getEditorInput();
            if (editorInput instanceof FileEditorInput) {
                FileEditorInput fileEditorInput = (FileEditorInput) editorInput;
                IFile file = fileEditorInput.getFile();
                fullPath = file.getFullPath();
            }
        }
        return fullPath;
    }

    //-------------------------------------------------------------------------

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
    
    //-------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public KiemEvent provideEventOfInterest() {
        int[] events = { KiemEvent.EXECUTION_STOP, KiemEvent.ERROR_STOP};
        return new KiemEvent(events);
    }

    // -------------------------------------------------------------------------
}
