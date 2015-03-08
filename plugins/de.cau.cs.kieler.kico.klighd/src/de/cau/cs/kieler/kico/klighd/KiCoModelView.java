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

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.ILogListener;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
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
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.progress.UIJob;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.xtext.util.StringInputStream;

import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;

import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.model.util.ModelUtil;
import de.cau.cs.kieler.core.util.Pair;
import de.cau.cs.kieler.kico.CompilationResult;
import de.cau.cs.kieler.kico.KiCoPlugin;
import de.cau.cs.kieler.kico.KiCoUtil;
import de.cau.cs.kieler.kico.KielerCompilerException;
import de.cau.cs.kieler.kico.ResourceExtension;
import de.cau.cs.kieler.kico.klighd.model.KiCoCodePlaceHolder;
import de.cau.cs.kieler.kico.klighd.model.KiCoErrorModel;
import de.cau.cs.kieler.kico.klighd.model.KiCoMessageModel;
import de.cau.cs.kieler.kico.klighd.model.KiCoModelChain;
import de.cau.cs.kieler.kico.klighd.model.KiCoModelWrapper;
import de.cau.cs.kieler.kico.ui.KiCoSelection;
import de.cau.cs.kieler.kiml.ui.KimlUiPlugin;
import de.cau.cs.kieler.klighd.IViewer;
import de.cau.cs.kieler.klighd.KlighdDataManager;
import de.cau.cs.kieler.klighd.KlighdPlugin;
import de.cau.cs.kieler.klighd.LightDiagramServices;
import de.cau.cs.kieler.klighd.SynthesisOption;
import de.cau.cs.kieler.klighd.ViewContext;
import de.cau.cs.kieler.klighd.internal.ISynthesis;
import de.cau.cs.kieler.klighd.ui.DiagramViewManager;
import de.cau.cs.kieler.klighd.ui.parts.DiagramViewPart;
import de.cau.cs.kieler.klighd.util.KlighdProperties;
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.config.kivi.KIEMExecutionAutoloadCombination;
import de.cau.cs.kieler.sim.kiem.config.kivi.KIEMModelSelectionCombination;

/**
 * Singleton instance of DiagramViewPart to display any model
 * 
 * @author als
 * @kieler.design 2014-07-30 proposed
 * @kieler.rating 2014-07-30 proposed yellow
 * 
 */
public class KiCoModelView extends DiagramViewPart implements ILogListener {

    /**
     * Events that can cause a update of shown model
     * 
     * @author als
     * 
     */
    public enum ChangeEvent {
        SAVED, DISPLAY_MODE, TRANSFORMATIONS, ACTIVE_EDITOR, COMPILE, COMPILATION_FINISHED
    }

    /** Viewer ID **/
    public static final String ID = "de.cau.cs.kieler.kico.klighd.view";
    private static final IPath modelViewPath = new Path(ID);

    /**
     * Indicates how long this view should wait before starting REAL asynchronous compilation. This
     * timer makes the common case faster (without intermediate model)
     */
    private static final int waitForAsync = 500;

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
    /** The icon for fork view button. */
    private static final ImageDescriptor ICON_SIDE_BY_SIDE = AbstractUIPlugin
            .imageDescriptorFromPlugin("de.cau.cs.kieler.kico.klighd",
                    "icons/KiCoModelViewIconSideBySide.png");
    /** The icon for pin selection button. */
    private static final ImageDescriptor ICON_PIN = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.kico.klighd", "icons/KiCoModelViewIconPin.png");
    
    /** The icon for closing windows. */
    private static final ImageDescriptor ICON_CLOSE = AbstractUIPlugin.imageDescriptorFromPlugin(
            "org.eclipse.ui", "icons/full/elcl16/remove.gif");

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

    /** The action for toggling compile. */
    private Action actionPinToggle;
    /** String currently saved transformations. */
    private KiCoSelection transformations = KiCoSelection.EMPTY_SELECTION;
    /** Map with pinned transformations */
    private WeakHashMap<IEditorPart, KiCoSelection> pinnedTransformations =
            new WeakHashMap<IEditorPart, KiCoSelection>();

    /** The action for forking view. */
    private Action actionFork;

    /** The action for toggling pausing of synchronization. */
    private Action actionPauseSyncToggle;
    /** Flag if this view is paused and does not update its model due to external changes. */
    private boolean pauseSynchronization = false;

    /** The action for toggling pausing of synchronization. */
    private Action actionNoDiagramToggle;
    /** Flag if this view is paused and does not update its model due to external changes. */
    private boolean noDiagram = false;

    // Models

    /** Current model display as diagram */
    private Object currentModel;

    /** Model extracted from editor */
    private EObject sourceModel;

    /** current compilation running in background */
    private KiCoAsynchronousCompilation currentCompilation = null;

    /**
     * current compilation result assocuiiated with current model or null if current model is not
     * compiled
     */
    private CompilationResult currentCompilationResult = null;
    
    /** Stores saved selection of synthesis options according to their model type */ 
    private HashMap<ISynthesis, HashMap<SynthesisOption,Object>> recentSynthesisOptions = Maps.newHashMap();

    // Editor

    /** Active related editor */
    private IEditorPart activeEditor;

    // Error handling
    
    private Exception lastException = null;
    
    // Visual
    
    private Composite warningMessageContainer = null;
    

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
        toolBarManager.add(getActionCompile());
        toolBarManager.add(getActionPin());
        toolBarManager.add(getActionSideBySide());

        IMenuManager menu = bars.getMenuManager();
        menu.add(new Separator());
        menu.add(getActionPauseSync());
        menu.add(getActionNoDiagram());

        updateViewTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void addButtons() {
        final IToolBarManager toolBar = getViewSite().getActionBars().getToolBarManager();

        // force complete refresh button
        toolBar.add(new Action("Refresh diagram", KlighdPlugin
                .getImageDescriptor("icons/full/elcl16/refresh.gif")) {

            @Override
            public void run() {
                updateModel(ChangeEvent.ACTIVE_EDITOR);
            }
        });

        // automatic layout button
        toolBar.add(new Action("Arrange", IAction.AS_PUSH_BUTTON) {
            // Constructor
            {
                setImageDescriptor(KimlUiPlugin
                        .getImageDescriptor("icons/menu16/kieler-arrange.gif"));
            }

            @Override
            public void run() {
                LightDiagramServices.layoutDiagram(KiCoModelView.this);
            }
        });

        // reset the layout options set over the side pane
        final IMenuManager menu = getViewSite().getActionBars().getMenuManager();
        menu.add(new Action("Reset Layout Options") {
            {
                this.setId(ACTION_ID_RESET_LAYOUT_OPTIONS);
            }

            @Override
            public void run() {
                resetLayoutConfig();
            }
        });
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
            if (activeEditor != null) {
                activeEditor.removePropertyListener(dirtyPropertyListener);
            }
            activeEditor = null;
            
            updateViewTitle();

            updateModel(ChangeEvent.ACTIVE_EDITOR);
        }
    }

    /**
     * @return active editor
     */
    public IEditorPart getActiveEditor() {
        return activeEditor;
    }

    /**
     * {@inheritDoc}
     */
    public void dispose() {
        // unregister save listener if necessary
        if (activeEditor != null) {
            activeEditor.removePropertyListener(dirtyPropertyListener);
        }
        super.dispose();
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
     * Gets the action to toggle pin selection.
     * 
     * @return the action
     */
    private Action getActionPin() {
        if (actionPinToggle != null) {
            return actionPinToggle;
        }
        actionPinToggle = new Action("", IAction.AS_CHECK_BOX) {
            public void run() {
                if (activeEditor != null) {
                    if (isChecked()) {
                        pinnedTransformations.put(activeEditor, transformations);
                    } else {
                        pinnedTransformations.remove(activeEditor);
                        // update model due to possible changed of transformation configuration
                        updateModel(ChangeEvent.TRANSFORMATIONS);
                    }
                }
            }
        };
        actionPinToggle.setText("Pin selected transformations");
        actionPinToggle.setToolTipText("Pin selected transformations");
        actionPinToggle.setImageDescriptor(ICON_PIN);
        actionPinToggle.setChecked(false);
        return actionPinToggle;
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
                displaySideBySide = isChecked();
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
                forkView();
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

    /**
     * Gets the action to pause synchronization of this view.
     * 
     * @return the action
     */
    private Action getActionPauseSync() {
        final String pauseText = "Decouple from editors";
        final String continueText = "Couple to editors";

        if (actionPauseSyncToggle != null) {
            return actionPauseSyncToggle;
        }
        actionPauseSyncToggle = new Action("", IAction.AS_PUSH_BUTTON) {
            public void run() {

                if (pauseSynchronization) {
                    pauseSynchronization = false;
                    setText(pauseText);
                    // force view to update model
                    updateModel(ChangeEvent.ACTIVE_EDITOR);
                } else {
                    pauseSynchronization = true;
                    setText(continueText);
                }
                updateViewTitle();
            }
        };
        actionPauseSyncToggle.setText(pauseText);
        actionPauseSyncToggle
                .setToolTipText("If paused, this view will no longer update its status.");
        return actionPauseSyncToggle;
    }

    /**
     * Gets the action to switch of diagram synthesis of this view.
     * 
     * @return the action
     */
    private Action getActionNoDiagram() {
        final String pauseText = "Deactivate model visualization";
        final String continueText = "Activate model visualization";

        if (actionNoDiagramToggle != null) {
            return actionNoDiagramToggle;
        }
        actionNoDiagramToggle = new Action("", IAction.AS_PUSH_BUTTON) {
            public void run() {
                if (noDiagram) {
                    this.setText(pauseText);
                    noDiagram = false;
                    // force synthesis of diagram
                    if (currentModel != null) {
                        updateDiagram(currentModel, true, activeEditor);
                    }
                } else {
                    this.setText(continueText);
                    noDiagram = true;
                }
            }
        };
        actionNoDiagramToggle.setText(pauseText);
        actionNoDiagramToggle
                .setToolTipText("If visualization is deactiveted, all diagrams will be replaced by a placeholder diagram.");
        return actionNoDiagramToggle;
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
            String filename = getCurrentResourceName();

            SaveAsDialog saveAsDialog = new SaveAsDialog(getSite().getShell());

            // Configure dialog

            IPath lastDir = null;
            try {
                String lastDirString = KiCoKLighDPlugin.getLastDir();
                lastDir = new Path(lastDirString);
            } catch(Exception e){
                lastDir = null;
            }
            if (lastDir != null) {
                IPath path = lastDir;
                // add new filename
                path = path.append(filename);
                try{
                    saveAsDialog.setOriginalFile(root.getFile(path));
                } catch(Exception e) {
                    // In case of any path error
                    saveAsDialog.setOriginalName(filename);
                }
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
                IPath lastPath = file.getFullPath();
                // remove filename to just store the path
                lastPath = lastPath.removeLastSegments(1);
                KiCoKLighDPlugin.setLastDir(lastPath.toString());

                // refresh workspace to prevent out of sync with filesystem
                if (file.exists()) {
                    try {
                        file.refreshLocal(IResource.DEPTH_INFINITE, null);
                    } catch (CoreException e) {
                        e.printStackTrace();
                    }
                }

                try {
                    // model to save
                    Object saveModel = currentModel;
                    if (saveModel instanceof KiCoModelChain) {
                        saveModel = ((KiCoModelChain) saveModel).getSelectedModel();
                    }
                    // TODO Handle Compiling intermeduate result
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
                    }
                } catch (Exception e) {
                    StatusManager.getManager()
                            .handle(new Status(IStatus.ERROR, KiCoKLighDPlugin.PLUGIN_ID,
                                    e.getMessage(), e), StatusManager.SHOW);
                }
            }
        }
    }

    /**
     * @return filename of current model with appropriate file extension
     */
    private String getCurrentResourceName() {
        if (activeEditor != null && currentModel != null) {
            String filename = activeEditor.getTitle();
            if (filename.contains(".")) {
                filename = filename.substring(0, filename.lastIndexOf('.'));
            }
            // Adding file extension
            ResourceExtension ext = KiCoPlugin.getInstance().getResourceExtension(currentModel);
            if (ext != null) {
                filename += "." + ext.getExtension();
            }
            return filename;
        }
        return "";
    }
    
    // -- Fork
    // -------------------------------------------------------------------------

    /**
     * Forks this view into new one with the same settings
     */
    protected void forkView() {
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
                // adopt compile settings
                child.compileModel = compileModel;
                child.actionCompileToggle.setChecked(compileModel);
                // adopt display mode settings
                child.displaySideBySide = displaySideBySide;
                child.actionSideBySideToggle.setChecked(displaySideBySide);
                // adopt transformation settings
                child.pinnedTransformations =
                        new WeakHashMap<IEditorPart, KiCoSelection>(pinnedTransformations);
                // synchronization settings cannot be adopted

                // TODO update when implemented new toggle buttons

                // update model of forked view
                child.setActiveEditor(KiCoModelView.this.activeEditor);
            }

        } catch (PartInitException e) {
            StatusManager.getManager().handle(
                    new Status(IStatus.ERROR, KiCoKLighDPlugin.PLUGIN_ID, e.getMessage(),
                            e.getCause()), StatusManager.SHOW);
        }
    }

    // -- UPDATE
    // -------------------------------------------------------------------------

    /**
     * Sets view title according to current context
     */
    protected void updateViewTitle() {
        // prefix when paused
        if (pauseSynchronization) {
            String syncPrefix = "<decoupled>";
            if (!getPartName().contains(syncPrefix)) {
                if (!isPrimaryView()) {
                    if (activeEditor != null) {
                        setPartName(syncPrefix + activeEditor.getTitle());
                    } else {
                        setPartName("Secondary " + defaultViewTitle + " " + syncPrefix);
                    }
                } else {
                    if (activeEditor != null) {
                        setPartName(defaultViewTitle + " " + syncPrefix + "["
                                + activeEditor.getTitle() + "]");
                    } else {
                        setPartName(defaultViewTitle + " " + syncPrefix);
                    }
                }
            }
        } else {
            // else set name according to view type and state
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
    }

    /**
     * Updates checked and enabled state of transformation pin toggle button according to current
     * transformation
     */
    private void updatePinToggleButton() {
        actionPinToggle.setEnabled(!transformations.isEmpty());
        actionPinToggle.setChecked(pinnedTransformations.containsKey(activeEditor));
    }

    /**
     * Updates the current model caused by changeEvent if necessary
     * 
     * @param change
     */
    void updateModel(ChangeEvent change) {
        updateModel(change, null);
    }

    /**
     * Updates the current model caused by changeEvent if necessary
     * 
     * @param change
     */
    synchronized void updateModel(ChangeEvent change, KiCoAsynchronousCompilation compilation) {
        if (activeEditor != null) {
            // change event flags
            boolean is_active_editor_update = change == ChangeEvent.ACTIVE_EDITOR;
            boolean is_save_update = change == ChangeEvent.SAVED;
            boolean is_transformation_update = change == ChangeEvent.TRANSFORMATIONS;
            boolean is_display_mode_update = change == ChangeEvent.DISPLAY_MODE;
            boolean is_compile_update =
                    change == ChangeEvent.COMPILE || change == ChangeEvent.COMPILATION_FINISHED;

            // Evaluate if source model should be updated
            boolean do_get_model = false;
            do_get_model |= is_active_editor_update;
            do_get_model |= is_save_update;
            // Don't read input model when paused
            do_get_model &= !pauseSynchronization;

            // Get model if necessary
            if (do_get_model) {
                sourceModel = KiCoModelViewManager.getModelFromModelEditor(activeEditor);
            }

            // check if source model is read correctly
            if (sourceModel == null) {
                currentModel = null;
                updateDiagram(new KiCoErrorModel("Cannot read model from active Editor!"), true,
                        activeEditor);
                return;
            }

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
                    // if there is a pinned transformation for active editor take pinned one else
                    // take selected ones
                    KiCoSelection newTransformations = null;
                    if (pinnedTransformations.containsKey(activeEditor)) {
                        newTransformations = pinnedTransformations.get(activeEditor);
                        // null pointer is indicator for no selection
                        if (newTransformations.isEmpty()) {
                            newTransformations = KiCoSelection.EMPTY_SELECTION;
                        }
                    } else {
                        newTransformations = mvm.getSelection(activeEditor);
                    }
                    // check if selection changed
                    if (newTransformations == null) {
                        if (transformations != KiCoSelection.EMPTY_SELECTION) {
                            transformations_changed |= true;
                            transformations = KiCoSelection.EMPTY_SELECTION;
                            ;
                        }
                    } else {
                        if (!newTransformations.equals(transformations)) {
                            transformations_changed |= true;
                            transformations = newTransformations;
                        }
                    }
                }
            }

            // update pin button according to current transformations selection
            updatePinToggleButton();

            // Evaluate if compilation is needed
            boolean do_compile = false;
            // -- compile only if something changed
            do_compile |= transformations_changed;
            do_compile |= is_active_editor_update;
            do_compile |= is_save_update;
            do_compile |= is_compile_update;
            do_compile |= is_display_mode_update;
            // -- But only if:
            do_compile &= !transformations.isEmpty();
            do_compile &= compileModel;

            Object previousCurrentModel = currentModel;

            // Compile if necessary
            if (do_compile) {

                // this call is not update model run with asynchronous compilation result
                if (compilation == null) {
                    // stop already running (now deprecated) compilation
                    if (currentCompilation != null) {
                        currentCompilation.cancel();
                    }
                    // create compilation job
                    currentCompilation =
                            new KiCoAsynchronousCompilation(this, (EObject) sourceModel,
                                    activeEditor.getTitle(), transformations);
                    currentCompilationResult = null;                    
                    currentModel = currentCompilation.getModel();
                    // start
                    currentCompilation.schedule();

                    boolean showProgress = true;
                    // To make the common case fast
                    // First wait some seconds for cases with fast compilation
                    for (int i = 0; i < waitForAsync / 10; i++) {
                        // check if finished
                        if (currentCompilation.hasFinishedCompilation()) {
                            showProgress = false;
                            break;
                        }
                        // wait
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            return;
                        }
                    }

                    if (showProgress) {// if not the fast case
                        if (this.getViewer() != null) {
                            currentCompilation.showProgress(this.getViewer());
                        }
                        currentCompilation.setUpdateModelView(true);
                        // return;
                    } else { // directly take result and suppress additional update
                        currentModel = currentCompilation.getModel();
                        currentCompilationResult = currentCompilation.getCompilationResult();
                    }
                    // check if given compilation is most recent
                } else if (compilation == currentCompilation) {
                    // take the result
                    currentModel = currentCompilation.getModel();
                    currentCompilationResult = currentCompilation.getCompilationResult();
                    currentCompilation = null;
                } else {// This is not the most recent compilation
                    return;
                }
            } else if (!is_transformation_update || transformations_changed) {
                currentModel = sourceModel;
                currentCompilationResult = null;
                // drop any existing compilation
                if (currentCompilation != null) {
                    currentCompilation.cancel();
                    currentCompilation = null;
                }
            }

            // composite model in given display mode
            if (!noDiagram && displaySideBySide) {
                KiCoModelChain chain = new KiCoModelChain();
                chain.getModels().add(new KiCoModelWrapper(sourceModel));
                chain.getModels().add(new KiCoModelWrapper(currentModel));
                currentModel = chain;
            }

            // Indicates if type of model changed and thus the model view has to reinitialize
            boolean model_type_changed = false;
            // compare types and set type change flag
            if (previousCurrentModel == null
                    || previousCurrentModel.getClass() != currentModel.getClass()) {
                model_type_changed = true;
            }

            boolean do_update_diagram = false;
            do_update_diagram |= do_get_model;
            do_update_diagram |= do_compile;
            do_update_diagram |= is_display_mode_update;
            // should compile but no transformations are selected
            do_update_diagram |= is_compile_update && !transformations.isEmpty();
            // compile and transformations changed to null
            do_update_diagram |=
                    compileModel && transformations.isEmpty() && transformations_changed;

            boolean is_buisness_model = true;
            is_buisness_model &= !(currentModel instanceof KiCoErrorModel);
            is_buisness_model &= !(currentModel instanceof KiCoMessageModel);
            is_buisness_model &= !(currentModel instanceof KiCoCodePlaceHolder);
            
            if (do_update_diagram) {
                if (noDiagram && is_buisness_model) {
                    updateDiagram(new KiCoMessageModel(
                            "Model Placeholder: " + getCurrentResourceName(),
                            "Model visualization is deactivated"), true, activeEditor);
                } else {
                    updateDiagram(currentModel, model_type_changed, activeEditor);
                }
            }
        } else {
            // drop any existing compilation
            if (currentCompilation != null) {
                currentCompilation.cancel();
                currentCompilation = null;
            }
            currentCompilationResult = null;
            currentModel = new KiCoMessageModel("No model in active editor");
            updateDiagram(currentModel, true, null);
        }
    }
    
    /**
     * Updates displayed diagram in this view in a dedicated job.
     */
    private void updateDiagram(final Object model, final boolean modelTypeChanged,
            final IEditorPart editorContext) {
        final CompilationResult compilationResult = currentCompilationResult;
        final KiCoAsynchronousCompilation compilation = currentCompilation;
        new UIJob("Updating ModelView "
                + (editorContext != null ? "[ " + editorContext.getTitle() + " ]" : "")) {

            @Override
            public IStatus runInUIThread(IProgressMonitor monitor) {
                updateDiagram(model, modelTypeChanged, editorContext, compilationResult, compilation, false);
                return Status.OK_STATUS;
            }
        }.schedule();
    }

    /**
     * DO NOT CALL THIS METHOD!<p>
     * This method should only be invoked by {@link #updateDiagram(Object, boolean, IEditorPart)}<p>
     * Updates displayed diagram in this view. Initializes this view if necessary.
     */
    private void updateDiagram(final Object model, boolean modelTypeChanged,
            final IEditorPart editorContext, final CompilationResult compilationResult,
            final KiCoAsynchronousCompilation compilation, boolean isErrorModel) {
        try {
            ViewContext vc = null;
            if (this.getViewer() == null || this.getViewer().getViewContext() == null) {
                // if viewer or context does not exist always init view
                modelTypeChanged = true;
            }else{
                vc = this.getViewer().getViewContext();
            }

            // listen for internal klighd errors
            lastException = null;
            Platform.addLogListener(this);
            
            boolean success = false;
            
            // Update diagram
            if (modelTypeChanged) {
                //save previous synthesis options to restore later
                KlighdSynthesisProperties properties = new KlighdSynthesisProperties();
                properties.setProperty(KlighdProperties.EDGES_FIRST, true);

                if (vc != null) {
                    ISynthesis synthesis = vc.getDiagramSynthesis();
                    if (synthesis != null) {
                        List<SynthesisOption> options = vc.getDisplayedSynthesisOptions();
                        if (!options.isEmpty()) {
                            HashMap<SynthesisOption, Object> optionsMap;
                            if (recentSynthesisOptions.containsKey(synthesis)) {
                                optionsMap = recentSynthesisOptions.get(synthesis);
                            } else {
                                optionsMap = Maps.newHashMap();
                                recentSynthesisOptions.put(synthesis, optionsMap);
                            }
                            for (SynthesisOption option : options) {
                                if(synthesis.getDisplayedSynthesisOptions().contains(option)){
                                    optionsMap.put(option, vc.getOptionValue(option));
                                }
                            }
                        }
                    }
                }

                // get save options to restore
                ISynthesis synthesis = Iterables.getFirst(KlighdDataManager.getInstance().getAvailableSyntheses(model.getClass()), null);
                if (synthesis != null && recentSynthesisOptions.containsKey(synthesis)) {
                    properties.configureSynthesisOptionValues(recentSynthesisOptions.get(synthesis));
                }

                // Give model synthesis access to the compilation result
                properties.setProperty(KiCoKLighDProperties.COMPILATION_RESULT, compilationResult);
                publishCurrentModelInformation(model, compilationResult);

                // the (re)initialization case
                initialize(model, null, properties);
                success = true;
                // reset layout to resolve KISEMA-905
                resetLayoutConfig();

            } else {
                // Give model synthesis access to the compilation result
                vc.setProperty(KiCoKLighDProperties.COMPILATION_RESULT, compilationResult);
                publishCurrentModelInformation(model, compilationResult);
                // update case (keeps options and sidebar)
                success = DiagramViewManager.updateView(this.getViewer().getViewContext(), model) != null;
            }

            // stop listening
            Platform.removeLogListener(this);  
            
            // check is update was successful
            if (lastException != null) {
                throw lastException;
            } else {
                KNode currentDiagram = this.getViewer().getViewContext().getViewModel();
                if (!success || currentDiagram == null || currentDiagram.getChildren().isEmpty()) {
                    if (model instanceof EObject && !(model instanceof KiCoCodePlaceHolder)) {
                        String editorID = null;
                        // Adding file extension
                        ResourceExtension resourceExtension = KiCoPlugin.getInstance().getResourceExtension(currentModel);
                        String resourceExtensionString = "txt";
                        if (resourceExtension != null) {
                            resourceExtensionString = resourceExtension.getExtension();
                        }
                        //TODO Cannot open xtext editor because it fails to create a resource for the special StringEditorInput because it has no path
                      ResourceExtension ext = KiCoPlugin.getInstance().getResourceExtension(currentModel);
                      if (ext != null) {
                          editorID = ext.getEditorID();
                      }
                        updateDiagram(new KiCoCodePlaceHolder(getCurrentResourceName(), KiCoUtil.serialize((EObject)model, null, false), editorID, resourceExtensionString), true, editorContext, null, null, false);
                    } else {
                        throw new NullPointerException(
                                "Diagram is null or empty. Inernal KLighD error.");
                    }
                }
            }

            // enable synchronous selection between diagram and editor
            if (editorContext != null && !isErrorModel) {
                this.getViewer().getViewContext().setSourceWorkbenchPart(editorContext);
            }

            //dispose warning message composite if necessary
            if (warningMessageContainer != null) {
                if (!warningMessageContainer.isDisposed()) {
                    warningMessageContainer.dispose();
                }
                warningMessageContainer = null;
            }
            //show warnings
            if (compilationResult != null && !compilationResult.getPostponedWarnings().isEmpty()) {
                StringBuilder warnings = new StringBuilder();
                for (KielerCompilerException warning : compilationResult.getPostponedWarnings()) {
                    warnings.append(warning.getMessage()).append("\n");
                }
                warnings.setLength(warnings.length() - 1);
                addWarningComposite(this.getViewer(), warnings.toString());
            }

        } catch (Exception e) {
            if (!isErrorModel) {
                updateDiagram(new KiCoErrorModel("Displaying diagram failed!", e), true, editorContext, null, null, true);
            }
        } finally {
            Platform.removeLogListener(this);
        }
    }

    /**
     * Publishes information about the currently displayed model.
     * 
     * @param model
     */
    private void publishCurrentModelInformation(final Object model, final CompilationResult compilationResult) {
        if (isPrimaryView()) {
            boolean is_placeholder =
                    model instanceof KiCoErrorModel || model instanceof KiCoMessageModel
                            || model instanceof KiCoCodePlaceHolder;
            boolean is_chain = model instanceof KiCoModelChain;
            // Inform KIEM about current model
            if (compilationResult != null) {
                if (model != null && !is_placeholder && !is_chain) {
                    KiemPlugin.getOpenedModelRootObjects().put(modelViewPath, (EObject) model);
                    KiemPlugin.setCurrentModelFile(modelViewPath);
                    KIEMExecutionAutoloadCombination.autoloadExecutionSchedule();
                } else if (!is_placeholder) {
                    KiemPlugin.getOpenedModelRootObjects().put(modelViewPath, null);
                    KiemPlugin.setCurrentModelFile(modelViewPath);
                    KIEMExecutionAutoloadCombination.autoloadExecutionSchedule();
                }
            } else { //this case when model is not compiled
                KIEMModelSelectionCombination.refreshKIEMActiveAndOpenedModels(activeEditor);
                KIEMExecutionAutoloadCombination.autoloadExecutionSchedule();
            }
        }
    }

    // -- Error Handling
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void logging(IStatus status, String plugin) {
        if (status.getSeverity() == Status.ERROR && status.getException() instanceof Exception) {
            if (status.getPlugin().startsWith(KlighdPlugin.PLUGIN_ID)
                    || status.getPlugin().startsWith(KiCoPlugin.PLUGIN_ID)) {
                lastException = (Exception) status.getException();
            }
        }
    }
    
    /**
     * Shows warning text in klighd canvas
     * @param viewer
     * @param allWarnings
     */
    private void addWarningComposite(IViewer viewer, String allWarnings) {
        final Composite canvas = (Composite) viewer.getControl();
        warningMessageContainer = new Composite(canvas, SWT.NONE);

        final Color orange = new Color(canvas.getDisplay(), new RGB(255, 165, 0));
        warningMessageContainer.setBackground(orange);

        final Label close = new Label(warningMessageContainer, SWT.NONE);
        final Image closeImage = ICON_CLOSE.createImage();
        close.setBackground(orange);
        close.setImage(closeImage);
        //close.setBackground(orange);
        close.setToolTipText("Close warnings");
        //close action
        close.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseUp(final MouseEvent event) {
                warningMessageContainer.dispose();
            }
        });

        final Label warningLabel = new Label(warningMessageContainer, SWT.NO_BACKGROUND);
        warningLabel.setBackground(orange);
        warningLabel.setText(allWarnings);

        warningMessageContainer.setLocation(0, 0);
        warningMessageContainer.setLayout(new RowLayout());
        
        //update composite
        warningMessageContainer.pack();
        canvas.layout(true, true);

        //cleanup on dispose
        warningMessageContainer.addDisposeListener(new DisposeListener() {

            public void widgetDisposed(DisposeEvent e) {
                orange.dispose();
                closeImage.dispose();
            }
        });
    }

}
