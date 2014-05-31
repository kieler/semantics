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

import java.util.HashSet;
import java.util.WeakHashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Composite;
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
import org.eclipse.xtext.util.StringInputStream;

import com.google.common.collect.Sets;

import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.model.util.ModelUtil;
import de.cau.cs.kieler.kico.CompilationResult;
import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.kico.klighd.model.KiCoCodePlaceHolder;
import de.cau.cs.kieler.kico.klighd.model.KiCoErrorModel;
import de.cau.cs.kieler.kico.klighd.model.KiCoModelChain;
import de.cau.cs.kieler.kico.klighd.model.KiCoModelWrapper;
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

    /** Secondary ID of this view. Indicates a non primary view */
    private String secondaryID;

    /** default view title **/
    private static final String defaultViewTitle = "KIELER Model View";

    // ICONS
    /** The icon for saving current model. */
    private static final ImageDescriptor ICON_SAVE = AbstractUIPlugin.imageDescriptorFromPlugin(
            "org.eclipse.ui", "icons/full/etool16/save_edit.gif");
    /** The icon for toggling side-by-side display mode button. */
    private static final ImageDescriptor ICON_COMPILE = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.kico.klighd", "icons/KiCoModelViewIconCompile.png");
    /** The icon for toggling compile button. */
    private static final ImageDescriptor ICON_FORK = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.kico.klighd", "icons/KiCoModelViewIconDuplicate.png");
    /** The icon for forking view button. */
    private static final ImageDescriptor ICON_SIDE_BY_SIDE = AbstractUIPlugin
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

    /** String of pinned transformations. */
    private String transformations = null;
    // private boolean pinTransformations = false;

    /** The action for forking view. */
    private Action actionFork;

    // Models

    /** Current model display as diagram */
    private Object currentModel;

    /** Model extracted from editor */
    private EObject sourceModel;

    // Editor

    /** Active related editor */
    private IEditorPart activeEditor;

    /** Stores all last saved files for active editors */
    private WeakHashMap<IEditorPart, IFile> lastSavedFiles = new WeakHashMap<IEditorPart, IFile>();

    // -- Constructor and Initialization
    // -------------------------------------------------------------------------

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
        // if has secondary id set variable
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
                // dirty flag changed and editor is not dirty -> saved
                updateModel(ChangeEvent.SAVED);
            }
        }
    };

    // -- Setup Toolbar
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

        updateViewTitle();
    }

    // -- Editor
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

                updateViewTitle();

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
                        child.compileModel = compileModel;
                        child.actionCompileToggle.setChecked(compileModel);
                        child.displaySideBySide = displaySideBySide;
                        child.actionSideBySideToggle.setChecked(displaySideBySide);
                        // TODO update when implemented new toggle buttons
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
                saveCurrentModel();
            }
        };
        actionSave.setText("Save displayed main model");
        actionSave.setToolTipText("Save displayed main model");
        actionSave.setImageDescriptor(ICON_SAVE);
        return actionSave;
    }

    // -- Save model
    // -------------------------------------------------------------------------

    /**
     * Saves the current model into a file with saveAs dialog
     */
    protected void saveCurrentModel() {
        if (currentModel != null && activeEditor != null) {
            // Get workspace
            IWorkspace workspace = ResourcesPlugin.getWorkspace();
            IWorkspaceRoot root = workspace.getRoot();

            // get filename with correct extension
            String filename = activeEditor.getTitle();
            if (filename.contains(".")) {
                filename = filename.substring(0, filename.lastIndexOf('.'));
            }
            // TODO add correct file extension
            // if (currentModel instanceof EObject) {
            // filename = "." + ModelUtil.getFileExtension((EObject) currentModel);
            // } else if (currentModel instanceof CompilationResult) {
            // filename = "." + ((CompilationResult) currentModel).getFileExtension();
            // }

            SaveAsDialog saveAsDialog = new SaveAsDialog(getSite().getShell());
            // Configure dialog

            if (lastSavedFiles.containsKey(activeEditor)) {
                IFile lastSavedFile = lastSavedFiles.get(activeEditor);
                IPath path = lastSavedFile.getFullPath();
                // remove filename
                path = path.removeLastSegments(1);
                // add new filename
                path = path.append(filename);
                saveAsDialog.setOriginalFile(root.getFile(path));
            } else {
                saveAsDialog.setOriginalName(filename);
            }

            saveAsDialog.setTitle("Save Model");
            saveAsDialog.setBlockOnOpen(true);

            // open and get result
            saveAsDialog.open();
            IPath path = saveAsDialog.getResult();

            // save
            if (path != null && !path.isEmpty()) {
                IFile file = root.getFile(path);
                URI uri = URI.createPlatformResourceURI(path.toString(), false);

                // register as last save
                lastSavedFiles.put(activeEditor, file);

                try {
                    // model to save
                    Object saveModel = currentModel;
                    if (saveModel instanceof KiCoModelChain) {
                        saveModel = ((KiCoModelChain) saveModel).getSelectedModel();
                    }

                    if (saveModel instanceof EObject) {
                        ModelUtil.saveModel((EObject) saveModel, uri);
                    } else if (saveModel instanceof KiCoCodePlaceHolder) {
                        // save to text file (create if necessary)
                        if (!file.exists()) {
                            file.create(
                                    new StringInputStream(((KiCoCodePlaceHolder) saveModel)
                                            .getCode()), 0, null);
                        } else {
                            file.setContents(new StringInputStream(
                                    ((KiCoCodePlaceHolder) saveModel).getCode()), 0, null);
                        }

                        // open editor with content
                        // todo handle in code diagram
                        PlatformUI
                                .getWorkbench()
                                .getActiveWorkbenchWindow()
                                .getActivePage()
                                .openEditor(new FileEditorInput(file),
                                        "org.eclipse.ui.DefaultTextEditor");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    ErrorDialog errorDialog = new ErrorDialog(getSite().getShell(), "Saving model failed!",
                            "Saving model failed.", new Status(
                                    IStatus.WARNING, ID,
                                    "An error occured while saving displayed model", e),
                            IStatus.WARNING);
                    errorDialog.create();
                    errorDialog.open();
                }
            }
        }
    }

    // -- UPDATE
    // -------------------------------------------------------------------------

    /**
     * Sets view title according to current context
     */
    private void updateViewTitle() {
        if (!isPrimaryView()) {
            if (activeEditor != null) {
                setPartName(activeEditor.getTitle());
            } else {
                setPartName("Secondary " + defaultViewTitle);
            }
        } else {
            if (activeEditor != null) {
                setPartName(defaultViewTitle + " [" + activeEditor.getTitle() + "]");
            } else {
                setPartName(defaultViewTitle);
            }
        }
    }

    /**
     * Updates the current model caused by changeEvent if necessary
     * 
     * @param change
     */
    void updateModel(ChangeEvent change) {
        if (activeEditor != null) {
            // change event flags
            boolean is_active_editor_update = change == ChangeEvent.ACTIVE_EDITOR;
            boolean is_save_update = change == ChangeEvent.SAVED;
            boolean is_transformation_update = change == ChangeEvent.TRANSFORMATIONS;
            boolean is_display_mode_update = change == ChangeEvent.DISPLAY_MODE;
            boolean is_compile_update = change == ChangeEvent.COMPILE;

            // Evaluate if source model should be updated
            boolean do_get_model = false;
            do_get_model |= is_active_editor_update;
            do_get_model |= is_save_update;

            // Indicates if type of model changed and thus the model view has to reinitialize
            boolean model_type_changed = false;

            // Get model if necessary
            Object previousSourceModel = sourceModel;
            if (do_get_model) {
                sourceModel = KiCoModelViewManager.getModelFromModelEditor(activeEditor);
            }
            // compare types and set type change flag
            if (previousSourceModel != null && sourceModel != null
                    && previousSourceModel.getClass() == sourceModel.getClass()) {
                model_type_changed |= true;
            }

            // check if source model is read correctly
            if (sourceModel == null) {
                currentModel = null;
                updateDiagram(new KiCoErrorModel("Cannot read model from active Editor!"), true,
                        true);
                return;
            }

            // TODO pin transformation
            // Evaluate if current transformation configuration should be asked
            boolean do_get_transformations = false;
            do_get_transformations |= is_transformation_update;
            do_get_transformations |= is_active_editor_update;
            do_get_transformations |= is_compile_update && compileModel;

            // Indicates of the current transformation configuration differs from previous
            // configuration
            boolean transformations_changed = false;

            // get new transformations if necessary
            if (do_get_transformations) {
                KiCoModelViewManager mvm = KiCoModelViewManager.getInstance();
                if (mvm != null) {
                    String newTransformations = mvm.getTransformations(activeEditor);
                    // if newTransformations is references can be compares else a string compare
                    // is necessary
                    if (newTransformations == null) {
                        if (newTransformations != transformations) {
                            transformations_changed |= true;
                            transformations = newTransformations;
                        }
                    } else {
                        if (transformations != null) {// Ignore order in comparison
                            HashSet<String> trans = Sets.newHashSet(transformations.split(","));
                            HashSet<String> newTrans =
                                    Sets.newHashSet(newTransformations.split(","));
                            if (!trans.equals(newTrans)) {
                                transformations_changed |= true;
                                transformations = newTransformations;
                            }
                        } else {// transformations are null but new ones are not -> chnage
                            transformations_changed |= true;
                            transformations = newTransformations;
                        }
                    }
                }
            }

            // Evaluate if compilation is needed
            boolean do_compile = false;
            // -- compile only if something changed
            do_compile |= transformations_changed;
            do_compile |= is_save_update;
            do_compile |= is_compile_update;
            do_compile |= is_display_mode_update;
            // -- But only if:
            do_compile &= transformations != null;
            do_compile &= compileModel;

            Object previousCurrentModel = currentModel;

            // Compile if necessary
            if (do_compile) {
                CompilationResult result;
                try {
                    result = KielerCompiler.compile(transformations, (EObject) sourceModel);
                    if (result == null) {
                        throw new NullPointerException("Compiled model is NULL.");
                    }
                } catch (Exception e) {
                    currentModel = null;
                    e.printStackTrace();
                    updateDiagram(new KiCoErrorModel("Compilation Error!", e), true, true);
                    return;
                }

                // set current model to either ecore model or code
                if (result.getEObject() != null) {
                    currentModel = result.getEObject();
                } else if (result.getString() != null) {
                    currentModel = new KiCoCodePlaceHolder(result.getString());
                }

                // composite model in given display mode
                if (displaySideBySide) {
                    KiCoModelChain chain = new KiCoModelChain();
                    chain.getModels().add(new KiCoModelWrapper(sourceModel));
                    chain.getModels().add(new KiCoModelWrapper(currentModel));
                    currentModel = chain;
                }
            } else {
                currentModel = sourceModel;
            }

            // compare types and set type change flag
            if (previousCurrentModel != null && currentModel != null
                    && previousCurrentModel.getClass() == currentModel.getClass()) {
                model_type_changed |= true;
            }

            boolean do_update_diagram = false;
            do_update_diagram |= do_get_model;
            do_update_diagram |= do_compile;
            // should compile but no transformations are selected
            do_update_diagram |= is_compile_update && transformations != null;
            // compile and transformations changed to null
            do_update_diagram |= compileModel && transformations == null && transformations_changed;

            if (do_update_diagram) {
                updateDiagram(currentModel, model_type_changed, false);
            }
        }
    }

    /**
     * Updates displayed diagram in this view. Initializes this view if necessary.
     */
    private void updateDiagram(Object model, boolean modelTypeChanged, boolean isErrorModel) {
        try {
            KNode previousDiagram = null;
            if (this.getViewer() == null || this.getViewer().getViewContext() == null) {
                // if viewer or context does not exist always init view
                modelTypeChanged = true;
            } else {
                previousDiagram = this.getViewer().getViewContext().getViewModel();
            }

            // Update diagram
            if (modelTypeChanged) {
                // the (re)initialization case
                DiagramViewManager.initializeView(this, model, null, null);
                // reset layout to resolve KISEMA-905
                resetLayoutConfig();
            } else {
                // update case (keeps options and sidebar)
                DiagramViewManager.updateView(this.getViewer().getViewContext(), model);
            }

            // check is update was successful
            // FIXME this only works with simple update strategy!
            // TODO chsch: any success indication should be returned by klighd
            KNode currentDiagram = this.getViewer().getViewContext().getViewModel();
            if (currentDiagram == null || currentDiagram == previousDiagram
                    || currentDiagram.getChildren().size() == 0) {
                throw new Exception("Inernal KLighD error");
            }

            // enable synchronous selection between diagram and editor
            if (activeEditor != null && !isErrorModel) {
                this.getViewer().getViewContext().setSourceWorkbenchPart(activeEditor);
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (!isErrorModel) {
                updateDiagram(new KiCoErrorModel("Displaying diagram falied!", e), true, true);
            }
        }
    }

}
