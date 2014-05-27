/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.klighd;

import java.io.IOException;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPartConstants;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.StringInputStream;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import de.cau.cs.kieler.core.model.util.ModelUtil;
import de.cau.cs.kieler.kico.CompilationResult;
import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.kico.klighd.model.KiCoCodePlaceHolder;
import de.cau.cs.kieler.kico.klighd.model.KiCoModelChain;
import de.cau.cs.kieler.kico.klighd.model.KiCoModelWrapper;
import de.cau.cs.kieler.kiml.config.ILayoutConfig;
import de.cau.cs.kieler.klighd.ui.DiagramViewManager;
import de.cau.cs.kieler.klighd.ui.parts.DiagramViewPart;

/**
 * Singleton instance of DiagramViewPart to display any model
 * 
 * @author als
 * 
 */
public class KiCoModelView extends DiagramViewPart {

    /**
     * Events that can cause a update of shown model
     * 
     * @author als
     * 
     */
    public enum ChangeEvent {
        SAVED, DISPLAY_MODE, TRANSFORMATIONS, ACTIVE_EDITOR, COMPILE, ACTIVE_RESOURCE
    }

    /** Viewer ID **/
    public static final String ID = "de.cau.cs.kieler.kico.klighd.view";

    // ICONS
    /** The icon for saving current model. */
    public static final ImageDescriptor ICON_SAVE = AbstractUIPlugin.imageDescriptorFromPlugin(
            "org.eclipse.ui", "icons/full/etool16/save_edit.gif");
    /** The icon for toggling side-by-side display mode button. */
    public static final ImageDescriptor ICON_COMPILE = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.kico.klighd", "icons/KiCoModelViewIconCompile.png");
    /** The icon for toggling compile button. */
    public static final ImageDescriptor ICON_FORK = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.kico.klighd", "icons/KiCoModelViewIconDuplicate.png");
    /** The icon for forking view button. */
    public static final ImageDescriptor ICON_SIDE_BY_SIDE = AbstractUIPlugin
            .imageDescriptorFromPlugin("de.cau.cs.kieler.kico.ui",
                    "icons/KiCoViewIconSideBySide.png");

    // ACTIONS
    /** The action for toggling side-by-side display mode. */
    private Action actionSideBySideToggle;
    /** Flag if side-by-side display mode is active. */
    private boolean displaySideBySide = false;

    /** The action for toggling compile. */
    private Action actionCompileToggle;
    /** Flag if compile mode is active. */
    private boolean compileModel = true;

    /** The action for toggling side-by-side display mode. */
    private Action actionSave;

    /** Flag if resources should be displayed. */
    private boolean visualizeResourceModels = false;

    /** String of pinned transformations. */
    private String transformations = null;
    // private boolean pinTransformations = false;

    /** The action for forking view. */
    private Action actionFork;

    /** Secondary ID of this view. Indicates a non primary view */
    private String secondaryID;

    /** Active related editor */
    private IEditorPart activeEditor;
    /** Current model display as diagram */
    private Object currentModel;
    private Object sourceModel;

    /**
     * Create an instance
     */
    public KiCoModelView() {
        super();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void init(IViewSite site) throws PartInitException {
        super.init(site);
        if (site.getSecondaryId() != null) {
            secondaryID = site.getSecondaryId();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getPartId() {
        if (isPrimaryView()) {
            return ID;
        } else {
            return ID + "." + secondaryID;
        }
    }

    /**
     * @return if this view is primary
     */
    public boolean isPrimaryView() {
        return secondaryID == null;
    }

    // -- LISTENER
    // -------------------------------------------------------------------------

    /** PropertyListener to check if a editor was saved. */
    final IPropertyListener dirtyPropertyListener = new IPropertyListener() {

        public void propertyChanged(Object source, int propId) {
            if (propId == IWorkbenchPartConstants.PROP_DIRTY && !((IEditorPart) source).isDirty()) {
                updateModel(ChangeEvent.SAVED);
            }
        }
    };

    // -- Setup Toolabr
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void createPartControl(final Composite parent) {
        super.createPartControl(parent);

        IActionBars bars = getViewSite().getActionBars();
        IToolBarManager toolBarManager = bars.getToolBarManager();
        toolBarManager.add(getActionSave());
        toolBarManager.add(getActionFork());
        // toolBarManager.add(getActionResourceVisualization());
        toolBarManager.add(getActionCompile());
        toolBarManager.add(getActionSideBySide());
    }

    // -- Editor Relation
    // -------------------------------------------------------------------------

    /**
     * Set the active editor as source and updates diagram.
     * 
     * @param editor
     *            active editor or null to unset
     */
    void setActiveEditor(IEditorPart editor) {
        if (editor != null) {
            if (activeEditor != editor) {
                // unregister save listener if necessary
                if (activeEditor != null) {
                    activeEditor.removePropertyListener(dirtyPropertyListener);
                }
                // register save listener
                editor.addPropertyListener(dirtyPropertyListener);

                // set as active editor
                activeEditor = editor;

                if (!isPrimaryView()) {
                    setPartName(editor.getTitle());
                }

                updateModel(ChangeEvent.ACTIVE_EDITOR);
            }
        } else {
            activeEditor = null;
        }

    }

    /**
     * @return active editor
     */
    public IEditorPart getActiveEditor() {
        return activeEditor;
    }

    // -- ACTIONS
    // -------------------------------------------------------------------------

    /**
     * Gets the action to toggle compile.
     * 
     * @return the action
     */
    private Action getActionCompile() {
        if (actionCompileToggle != null) {
            return actionCompileToggle;
        }
        actionCompileToggle = new Action("", IAction.AS_CHECK_BOX) {
            public void run() {
                compileModel = actionCompileToggle.isChecked();
                updateModel(ChangeEvent.COMPILE);
            }
        };
        actionCompileToggle.setText("Show compiled model");
        actionCompileToggle.setToolTipText("Show compiled model");
        // actionCompileToggle.setToolTipText("Show compiled model acording to compiler selection");
        actionCompileToggle.setImageDescriptor(ICON_COMPILE);
        actionCompileToggle.setChecked(compileModel);
        return actionCompileToggle;
    }

    /**
     * Gets the action to toggle side-by-side display mode.
     * 
     * @return the action
     */
    private Action getActionSideBySide() {
        if (actionSideBySideToggle != null) {
            return actionSideBySideToggle;
        }
        actionSideBySideToggle = new Action("", IAction.AS_CHECK_BOX) {
            public void run() {
                displaySideBySide = actionSideBySideToggle.isChecked();
                updateModel(ChangeEvent.DISPLAY_MODE);
            }
        };
        actionSideBySideToggle.setText("Enable side-by-side display mode");
        actionSideBySideToggle.setToolTipText("Enable side-by-side display mode");
        // actionSideBySideToggle.setToolTipText("Enables side-by-side display mode of compiled and source model.");
        actionSideBySideToggle.setImageDescriptor(ICON_SIDE_BY_SIDE);
        actionSideBySideToggle.setChecked(displaySideBySide);
        return actionSideBySideToggle;
    }

    /**
     * Gets the action to fork this view.
     * 
     * @return the action
     */
    private Action getActionFork() {
        if (actionFork != null) {
            return actionFork;
        }
        actionFork = new Action("", IAction.AS_PUSH_BUTTON) {
            public void run() {
                try {
                    // Create new View
                    IViewPart newViewPart =
                            PlatformUI
                                    .getWorkbench()
                                    .getActiveWorkbenchWindow()
                                    .getActivePage()
                                    .showView(ID, Long.toString(System.currentTimeMillis()),
                                            IWorkbenchPage.VIEW_ACTIVATE);
                    // Configure child view
                    if (newViewPart instanceof KiCoModelView) {
                        KiCoModelView child = (KiCoModelView) newViewPart;
                        // TODO configure child
                        child.setActiveEditor(KiCoModelView.this.activeEditor);
                    }

                } catch (PartInitException e) {
                    e.printStackTrace();
                }
            }
        };
        actionFork.setText("Fork this view");
        actionFork.setToolTipText("Fork this view");
        actionFork.setImageDescriptor(ICON_FORK);
        return actionFork;
    }

    /**
     * Gets the action to save current model.
     * 
     * @return the action
     */
    private Action getActionSave() {
        if (actionSave != null) {
            return actionSave;
        }
        actionSave = new Action("", IAction.AS_PUSH_BUTTON) {
            public void run() {
                if (currentModel != null && activeEditor != null) {
                    String filename = activeEditor.getTitle();
                    SaveAsDialog saveAsDialog = new SaveAsDialog(getSite().getShell());
                    saveAsDialog.setOriginalName(filename);
                    saveAsDialog.setTitle("Save Model");
                    saveAsDialog.setBlockOnOpen(true);
                    saveAsDialog.open();
                    IPath path = saveAsDialog.getResult();
                    if (path != null && !path.isEmpty()) {
                        IWorkspace workspace = ResourcesPlugin.getWorkspace();
                        IWorkspaceRoot root = workspace.getRoot();
                        IFile file = root.getFile(path);
                        URI uri = URI.createPlatformResourceURI(path.toString(), false);

                        try {
                            if (currentModel instanceof EObject) {
                                ModelUtil.saveModel((EObject) currentModel, uri);
                            } else if (currentModel instanceof CompilationResult
                                    && ((CompilationResult) currentModel).getEObject() != null) {
                                ModelUtil.saveModel(
                                        ((CompilationResult) currentModel).getEObject(), uri);
                            } else if (currentModel instanceof CompilationResult
                                    && ((CompilationResult) currentModel).getString() != null) {
                                if (!file.exists()) {
                                    file.create(new StringInputStream(
                                            ((CompilationResult) currentModel).getString()), 0,
                                            null);
                                } else {
                                    file.setContents(new StringInputStream(
                                            ((CompilationResult) currentModel).getString()), 0,
                                            null);
                                }
                                // open editor
                                PlatformUI
                                        .getWorkbench()
                                        .getActiveWorkbenchWindow()
                                        .getActivePage()
                                        .openEditor(new FileEditorInput(file),
                                                "org.eclipse.ui.DefaultTextEditor");
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        actionSave.setText("Save displayed main model");
        actionSave.setToolTipText("Save displayed main model");
        actionSave.setImageDescriptor(ICON_SAVE);
        return actionSave;
    }

    // -- UPDATE
    // -------------------------------------------------------------------------

    /**
     * Updates the current model caused by changeEvent if necessary
     * 
     * @param change
     */
    void updateModel(ChangeEvent change) {
        if (visualizeResourceModels) {
            // TODO display resource selection
            return;
        }
        if (activeEditor != null) {
            // Get model
            if (activeEditor instanceof XtextEditor) {// Get model from XTextEditor
                IXtextDocument document = ((XtextEditor) activeEditor).getDocument();
                if (document != null) {
                    document.readOnly(new IUnitOfWork.Void<XtextResource>() {

                        @Override
                        public void process(final XtextResource state) throws Exception {
                            if (!state.getContents().isEmpty()) {
                                sourceModel = state.getContents().get(0);
                            }
                        }
                    });
                }
            } else if (activeEditor instanceof IEditingDomainProvider) {// Get model from EMF
                                                                        // TreeEditor
                IEditingDomainProvider editor = (IEditingDomainProvider) activeEditor;

                List<Resource> resources =
                        editor.getEditingDomain().getResourceSet().getResources();

                if (!resources.isEmpty() && !resources.get(0).getContents().isEmpty()) {
                    sourceModel = EcoreUtil.getRootContainer(resources.get(0).getContents().get(0));
                }
            }

            if (sourceModel != null) {
                boolean transformationsChanged = false;
                // get new transformations
                // TODO pin transformation
                if (transformations != null || change == ChangeEvent.TRANSFORMATIONS
                        || change == ChangeEvent.ACTIVE_EDITOR) {
                    KiCoModelViewManager mvm = KiCoModelViewManager.getInstance();
                    if (KiCoModelViewManager.getInstance() != null) {
                        String trans = mvm.getTransformations(activeEditor);
                        if (trans == null ? trans != transformations : !trans
                                .equals(transformations)) {
                            transformationsChanged = true;
                            transformations = trans;
                        }
                    }
                }
                transformationsChanged =
                        transformationsChanged || change == ChangeEvent.DISPLAY_MODE
                                || change == ChangeEvent.COMPILE;

                // if compiling is available and requested
                if (compileModel && transformations != null
                        && (transformationsChanged || change == ChangeEvent.SAVED)) {

                    // compile
                    CompilationResult result =
                            KielerCompiler.compile(transformations, (EObject) sourceModel);

                    // TODO test if compiler error occured
                    // composite model in given display mode
                    if (result != null) {
                        if (result.getEObject() != null) {
                            if (displaySideBySide) {
                                KiCoModelChain chain = new KiCoModelChain();
                                chain.models.add(new KiCoModelWrapper(sourceModel));
                                chain.models.add(new KiCoModelWrapper(result.getEObject()));

                                currentModel = chain;
                                updateDiagram(chain, true);
                            } else {
                                currentModel = result;
                                updateDiagram(result.getEObject(), true);
                            }
                        } else if (result.getString() != null) {
                            currentModel = result;
                            updateDiagram(new KiCoCodePlaceHolder(), change != ChangeEvent.SAVED);
                        }
                    }
                } else if (!(
                // Don't update uncompiled diagram when..
                // display mode changed (no effect on uncomipled)
                change == ChangeEvent.DISPLAY_MODE
                        // transformations changed but should not compile (no effect on uncomipled)
                        || (!compileModel && change == ChangeEvent.TRANSFORMATIONS)
                        || (!transformationsChanged && change == ChangeEvent.TRANSFORMATIONS)
                // switched to uncompiled view but no compiled diagram was shown before
                || (change == ChangeEvent.COMPILE && transformations == null))) {
                    updateDiagram(sourceModel, change != ChangeEvent.SAVED);
                }
            }
        }
    }

    /**
     * Updates displayed diagram in this view. Initializes this view if necessary.
     */
    private void updateDiagram(Object model, boolean modelTypeChanged) {
        try {
            if (modelTypeChanged || this.getViewer() == null
                    || this.getViewer().getViewContext() == null) {
                // the initialization case
                DiagramViewManager.initializeView(this, model, null, null);
                //reset layout to resolve KISEMA-905
                resetLayoutConfig();                
            } else {
                // update case (keeps options and sidebar)
                DiagramViewManager.updateView(this.getViewer().getViewContext(), model);
            }
            if (activeEditor != null) {
                this.getViewer().getViewContext().setSourceWorkbenchPart(activeEditor);
            }
        } catch (Exception e) {
            // TODO handle exception line NPE if no synthesis available
            e.printStackTrace();
        }
    }

}
