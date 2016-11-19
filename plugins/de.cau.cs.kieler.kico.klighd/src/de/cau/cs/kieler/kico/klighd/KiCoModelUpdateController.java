/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.klighd;

import java.util.Map.Entry;
import java.util.WeakHashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
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
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.xtext.ui.util.ResourceUtil;
import org.eclipse.xtext.util.StringInputStream;

import com.google.common.collect.Lists;

import de.cau.cs.kieler.core.util.Pair;
import de.cau.cs.kieler.kico.CompilationResult;
import de.cau.cs.kieler.kico.KiCoPlugin;
import de.cau.cs.kieler.kico.KiCoProperties;
import de.cau.cs.kieler.kico.KielerCompilerException;
import de.cau.cs.kieler.kico.KielerCompilerSelection;
import de.cau.cs.kieler.kico.internal.ResourceExtension;
import de.cau.cs.kieler.kico.klighd.internal.AsynchronousCompilation;
import de.cau.cs.kieler.kico.klighd.internal.CompilerSelectionStore;
import de.cau.cs.kieler.kico.klighd.internal.ModelUtil;
import de.cau.cs.kieler.kico.klighd.internal.model.CodePlaceHolder;
import de.cau.cs.kieler.kico.klighd.internal.model.ModelChain;
import de.cau.cs.kieler.kiml.config.CompoundLayoutConfig;
import de.cau.cs.kieler.kiml.config.ILayoutConfig;
import de.cau.cs.kieler.kiml.config.LayoutContext;
import de.cau.cs.kieler.kiml.config.VolatileLayoutConfig;
import de.cau.cs.kieler.kiml.options.Direction;
import de.cau.cs.kieler.kiml.options.LayoutOptions;
import de.cau.cs.kieler.klighd.IViewer;
import de.cau.cs.kieler.klighd.KlighdConstants;
import de.cau.cs.kieler.klighd.ViewContext;
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties;
import de.cau.cs.kieler.klighd.ui.view.DiagramView;
import de.cau.cs.kieler.klighd.ui.view.controller.AbstractViewUpdateController;
import de.cau.cs.kieler.klighd.ui.view.controllers.EcoreXtextSaveUpdateController;
import de.cau.cs.kieler.klighd.ui.view.model.ErrorModel;
import de.cau.cs.kieler.klighd.ui.view.model.MessageModel;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.config.kivi.KIEMExecutionAutoloadCombination;
import de.cau.cs.kieler.sim.kiem.config.kivi.KIEMModelSelectionCombination;

/**
 * Controller for XText and ECore model editors interacting with KiCo.
 * 
 * @author als
 * @kieler.design 2014-07-30 proposed
 * @kieler.rating 2014-07-30 proposed yellow
 * 
 */
public class KiCoModelUpdateController extends EcoreXtextSaveUpdateController {

    /**
     * Events that can cause an update of displayed model.
     * 
     * @author als
     * 
     */
    public enum ChangeEvent {
        SAVED, DISPLAY_MODE, SELECTION, ACTIVE_EDITOR, COMPILE, COMPILATION_FINISHED
    }

    // -- CONSTANTS --
    /** Controller ID. */
    private static final String ID = "de.cau.cs.kieler.kico.klighd.KiCoModelUpdateController";


    /** Path to notify Simulation component. */
    private static final IPath modelViewPath = new Path(DiagramView.ID);

    /** Path to notify Simulation component for the source model. */
    private static final IPath sourceModelViewPath = new Path(KiCoKlighdPlugin.SOURCE_MODEL_ID);

    /**
     * Indicates how long this view should wait before starting REAL asynchronous compilation. This
     * timer makes the common case faster (without intermediate model).
     */
    private static final int ASYNC_DELAY = 500;

    // -- GUI (Model) texts --

    private static final String MODEL_PLACEHOLDER_PREFIX = "Model Placeholder: ";
    private static final String MODEL_PLACEHOLDER_MESSGAE = "Model visualization is deactivated";

    // -- Icons --
    /** The icon for saving current model. */
    private static final ImageDescriptor SAVE_ICON = AbstractUIPlugin
            .imageDescriptorFromPlugin("org.eclipse.ui", "icons/full/etool16/save_edit.gif");
    /** The icon for pin selection button. */
    private static final ImageDescriptor PIN_ICON =
            KiCoKlighdPlugin.getImageDescriptor("icons/full/etool16/pin.png");
    /** The icon for toggling compile mode button. */
    private static final ImageDescriptor COMPILE_ICON =
            KiCoKlighdPlugin.getImageDescriptor("icons/full/etool16/compile.png");
    /** The icon for fork view button. */
    private static final ImageDescriptor SIDE_BY_SIDE_ICON =
            KiCoKlighdPlugin.getImageDescriptor("icons/full/etool16/side_by_side.png");
    /** The icon for toggling chain display mode button. */
    private static final ImageDescriptor CHAIN_ICON =
            KiCoKlighdPlugin.getImageDescriptor("icons/full/etool16/chain.png");

    /** The icon for closing windows. */
    private static final ImageDescriptor CLOSE_ICON = AbstractUIPlugin
            .imageDescriptorFromPlugin("org.eclipse.ui", "icons/full/elcl16/remove.gif");

    // -- Toolbar --
    /** The action for saving currently displayed model. */
    private final Action saveAction;
    /** The last directory used for saving a model. */
    private IPath lastSaveDirectory = null;

    /** The action for toggling side-by-side display mode. */
    private Action sideBySideToggleAction;
    private static final boolean SIDE_BY_SIDE_TOGGLE_ACTION_DEFAULT_STATE = false;

    /** The action for toggling compile. */
    private Action compileToggleAction;
    private static final boolean COMPILE_TOGGLE_ACTION_DEFAULT_STATE = true;

    /** The action for toggling compile. */
    private Action pinToggleAction;
    private static final boolean PIN_TOGGLE_ACTION_DEFAULT_STATE = false;
    /** String currently saved transformations. */
    private Pair<KielerCompilerSelection, Boolean> selection = null;
    /** Map with pinned transformations. */
    private WeakHashMap<IEditorPart, Pair<KielerCompilerSelection, Boolean>> pinnedTransformations =
            new WeakHashMap<IEditorPart, Pair<KielerCompilerSelection, Boolean>>();

    // -- Menu --
    /** The action for toggling editor synchronization. */
    private final Action syncEditorToggleAction;
    private static final boolean SYNC_EDITOR_TOGGLE_ACTION_DEFAULT_STATE = true;

    /** The action for toggling display of diagram placeholder. */
    private final Action diagramPlaceholderToggleAction;
    private static final boolean DIAGRAM_PLACEHOLDER_TOGGLE_ACTION_DEFAULT_STATE = false;

    /** The action for toggling tracing. */
    private Action tracingToggleAction;
    private static final boolean TRACING_TOGGLE_ACTION_DEFAULT_STATE = false;

    /** The action for toggling chain display mode. */
    private Action tracingChainToggleAction;
    private static final boolean TRACING_CHAIN_TOGGLE_ACTION_DEFAULT_STATE = false;

    // -- Model --

    /** Model extracted from editor. */
    private EObject sourceModel;

    /** Indicates if the source model has error markers. */
    private boolean sourceModelHasErrorMarkers = false;

    /** Current compilation running in background. */
    private AsynchronousCompilation currentCompilation = null;

    /**
     * Current compilation result associated with current model or null if current model was not
     * compiled.
     */
    private CompilationResult currentCompilationResult = null;

    // -- Visual --

    /** Container for displaying waring messages. */
    private Composite warningMessageContainer = null;

    /** The last editor synchronized with the view. */
    private IEditorPart recentEditor = null;

    // -- Constructor and Initialization
    // -------------------------------------------------------------------------

    /**
     * Default Constructor.
     */
    public KiCoModelUpdateController() {
        CompilerSelectionStore.register(this);

        // Save Button
        saveAction = new Action("Save displayed main model", IAction.AS_PUSH_BUTTON) {
            @Override
            public void run() {
                saveModel();
            }
        };
        saveAction.setId("saveAction");
        saveAction.setToolTipText("Save displayed main model");
        saveAction.setImageDescriptor(SAVE_ICON);

        // Compile button
        compileToggleAction = new Action("Show compiled model", IAction.AS_CHECK_BOX) {
            @Override
            public void run() {
                update(ChangeEvent.COMPILE);
            }
        };
        compileToggleAction.setId("compileToggleAction");
        compileToggleAction.setToolTipText("Show compiled model");
        compileToggleAction.setImageDescriptor(COMPILE_ICON);
        compileToggleAction.setChecked(COMPILE_TOGGLE_ACTION_DEFAULT_STATE);

        // Pin button
        pinToggleAction = new Action("Pin selected transformations", IAction.AS_CHECK_BOX) {
            @Override
            public void run() {
                if (recentEditor != null) {
                    if (isChecked()) {
                        pinnedTransformations.put(recentEditor, selection);
                    } else {
                        pinnedTransformations.remove(recentEditor);
                        // update model due to possible changed of transformation configuration
                        update(ChangeEvent.SELECTION);
                    }
                }
            }
        };
        pinToggleAction.setId("pinToggleAction");
        pinToggleAction.setToolTipText("Pin selected transformations");
        pinToggleAction.setImageDescriptor(PIN_ICON);
        pinToggleAction.setChecked(PIN_TOGGLE_ACTION_DEFAULT_STATE);

        // Side-by-Side button
        sideBySideToggleAction =
                new Action("Activate side-by-side display mode", IAction.AS_CHECK_BOX) {
                    @Override
                    public void run() {
                        update(ChangeEvent.DISPLAY_MODE);
                    }
                };
        sideBySideToggleAction.setId("sideBySideToggleAction");
        sideBySideToggleAction.setToolTipText("Activate side-by-side display mode");
        sideBySideToggleAction.setImageDescriptor(SIDE_BY_SIDE_ICON);
        sideBySideToggleAction.setChecked(SIDE_BY_SIDE_TOGGLE_ACTION_DEFAULT_STATE);

        // Sync Menu Item
        syncEditorToggleAction =
                new Action("Synchronize with editor content", IAction.AS_CHECK_BOX) {
                    @Override
                    public void run() {
                        if (isChecked()) {
                            update(ChangeEvent.ACTIVE_EDITOR);
                        }
                    }
                };
        syncEditorToggleAction.setId("syncEditorToggleAction");
        syncEditorToggleAction.setToolTipText(
                "If Synchronize is disabled, this view will no longer update its status when editor content changes.");
        syncEditorToggleAction.setChecked(SYNC_EDITOR_TOGGLE_ACTION_DEFAULT_STATE);

        // Diagram PlaceHolder Menu Item
        diagramPlaceholderToggleAction = new Action("Diagram Placeholder", IAction.AS_CHECK_BOX) {
            @Override
            public void run() {
                update(ChangeEvent.DISPLAY_MODE);
            }
        };
        diagramPlaceholderToggleAction.setId("diagramPlaceholderToggleAction");
        diagramPlaceholderToggleAction.setToolTipText(
                "If visualization is deactiveted, all diagrams will be replaced by a placeholder diagram.");
        diagramPlaceholderToggleAction.setChecked(DIAGRAM_PLACEHOLDER_TOGGLE_ACTION_DEFAULT_STATE);

        // Tracing item
        tracingToggleAction = new Action("Tracing", IAction.AS_CHECK_BOX) {
            @Override
            public void run() {
                update(ChangeEvent.COMPILE);
            }
        };
        tracingToggleAction.setId("tracingToggleAction");
        tracingToggleAction
                .setToolTipText("Performes tracing during transformations if activated.");
        tracingToggleAction.setChecked(TRACING_TOGGLE_ACTION_DEFAULT_STATE);

        // Tracing chain item
        tracingChainToggleAction = new Action("", IAction.AS_CHECK_BOX) {
            public void run() {
                update(ChangeEvent.DISPLAY_MODE);
            }
        };
        tracingChainToggleAction.setId("tracingChainToggleAction");
        tracingChainToggleAction.setText("Display Transformation Chain");
        tracingChainToggleAction.setToolTipText(
                "Enable tranformation chain view in displaySideBySide display mode");
        // actionTracingChainToggle.setImageDescriptor(ICON_CHAIN);
        tracingChainToggleAction.setChecked(TRACING_CHAIN_TOGGLE_ACTION_DEFAULT_STATE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void onDispose() {
        super.onDispose();
        CompilerSelectionStore.unregister(this);
    }

    // -- Controller
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public String getID() {
        return ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void copy(final AbstractViewUpdateController source) {
        super.copy(source);
        if (source instanceof KiCoModelUpdateController) {
            KiCoModelUpdateController other = (KiCoModelUpdateController) source;
            lastSaveDirectory = other.lastSaveDirectory;
            compileToggleAction.setChecked(other.compileToggleAction.isChecked());
            pinToggleAction.setChecked(other.pinToggleAction.isChecked());
            for (Entry<IEditorPart, Pair<KielerCompilerSelection, Boolean>> entry : other.pinnedTransformations
                    .entrySet()) {
                pinnedTransformations.put(entry.getKey(),
                        new Pair<KielerCompilerSelection, Boolean>(
                                entry.getValue().getFirst().clone(),
                                entry.getValue().getSecond().booleanValue()));
            }
            syncEditorToggleAction.setChecked(other.syncEditorToggleAction.isChecked());
            sideBySideToggleAction.setChecked(other.sideBySideToggleAction.isChecked());
            diagramPlaceholderToggleAction
                    .setChecked(other.diagramPlaceholderToggleAction.isChecked());
            tracingToggleAction.setChecked(other.tracingToggleAction.isChecked());
            tracingChainToggleAction.setChecked(other.tracingChainToggleAction.isChecked());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void reset() {
        lastSaveDirectory = null;
        compileToggleAction.setChecked(COMPILE_TOGGLE_ACTION_DEFAULT_STATE);
        pinToggleAction.setChecked(PIN_TOGGLE_ACTION_DEFAULT_STATE);
        selection = null;
        pinnedTransformations.clear();
        syncEditorToggleAction.setChecked(SYNC_EDITOR_TOGGLE_ACTION_DEFAULT_STATE);
        sideBySideToggleAction.setChecked(SIDE_BY_SIDE_TOGGLE_ACTION_DEFAULT_STATE);
        diagramPlaceholderToggleAction.setChecked(DIAGRAM_PLACEHOLDER_TOGGLE_ACTION_DEFAULT_STATE);
        tracingToggleAction.setChecked(TRACING_TOGGLE_ACTION_DEFAULT_STATE);
        tracingChainToggleAction.setChecked(TRACING_CHAIN_TOGGLE_ACTION_DEFAULT_STATE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void saveState(final IMemento memento) {
        if (lastSaveDirectory != null) {
            memento.putString("lastSaveDirectory", lastSaveDirectory.toPortableString());
        }
        
        memento.putBoolean("compileToggleAction", compileToggleAction.isChecked());
        
        memento.putBoolean("sideBySideToggleAction", sideBySideToggleAction.isChecked());

        //TODO Save pinnedTransformations
        
        memento.putBoolean("diagramPlaceholderToggleAction", diagramPlaceholderToggleAction.isChecked());
        
        memento.putBoolean("tracingToggleAction", tracingToggleAction.isChecked());
        
        memento.putBoolean("tracingChainToggleAction", tracingChainToggleAction.isChecked());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void loadState(final IMemento memento) {
        String lastSaveDirectoryValue = memento.getString("lastSaveDirectory");
        if (lastSaveDirectoryValue != null) {
            lastSaveDirectory = Path.fromPortableString(lastSaveDirectoryValue);
        }

        Boolean compileToggleActionValue = memento.getBoolean("compileToggleAction");
        if (compileToggleActionValue != null) {
            if (compileToggleAction != null) {
                compileToggleAction.setChecked(compileToggleActionValue);
            }
        }
        
        Boolean sideBySideToggleActionValue = memento.getBoolean("sideBySideToggleAction");
        if (sideBySideToggleActionValue != null) {
            if (sideBySideToggleAction != null) {
                sideBySideToggleAction.setChecked(sideBySideToggleActionValue);
            }
        }
        
        Boolean actionDiagramPlaceholderValue = memento.getBoolean("diagramPlaceholderToggleAction");
        if (actionDiagramPlaceholderValue != null) {
            if (diagramPlaceholderToggleAction != null) {
                diagramPlaceholderToggleAction.setChecked(actionDiagramPlaceholderValue);
            }
        }
        
        //TODO Load pinnedTransformations
                        
        Boolean tracingToggleActionValue = memento.getBoolean("tracingToggleAction");
        if (tracingToggleActionValue != null) {
            if (tracingToggleAction != null) {
                tracingToggleAction.setChecked(tracingToggleActionValue);
            }
        }
        
        Boolean tracingChainToggleActionValue = memento.getBoolean("tracingChainToggleAction");
        if (tracingChainToggleActionValue != null) {
            if (tracingChainToggleAction != null) {
                tracingChainToggleAction.setChecked(tracingChainToggleActionValue);
            }
        }
    }

    // -- View
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void addContributions(final IToolBarManager toolBar, final IMenuManager menu) {
        toolBar.add(new Separator());
        toolBar.add(saveAction);
        toolBar.add(compileToggleAction);
        toolBar.add(pinToggleAction);
        toolBar.add(sideBySideToggleAction);

        menu.add(new Separator());
        menu.add(syncEditorToggleAction);
        menu.add(diagramPlaceholderToggleAction);
        menu.add(tracingChainToggleAction);
        menu.add(tracingToggleAction);
    }

    // -- Save model
    // -------------------------------------------------------------------------

    /**
     * Saves the current model into a file with saveAs dialog.
     */
    private void saveModel() {
        if (getModel() != null) {
            Object model = getModel();
            // Get workspace
            IWorkspace workspace = ResourcesPlugin.getWorkspace();
            IWorkspaceRoot root = workspace.getRoot();

            // get filename with correct extension
            String filename = getResourceName(recentEditor, model);

            SaveAsDialog saveAsDialog = new SaveAsDialog(getDiagramView().getSite().getShell());

            // Configure dialog
            if (lastSaveDirectory != null) {
                IPath path = lastSaveDirectory;
                // add new filename
                path = path.append(filename);
                try {
                    saveAsDialog.setOriginalFile(root.getFile(path));
                } catch (Exception e) {
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

                // remove filename to just store the path
                lastSaveDirectory = file.getFullPath().removeLastSegments(1);

                // refresh workspace to prevent out of sync with file-system
                if (file.exists()) {
                    try {
                        file.refreshLocal(IResource.DEPTH_INFINITE, null);
                    } catch (CoreException e) {
                        StatusManager.getManager().handle(new Status(IStatus.WARNING,
                                KiCoKlighdPlugin.PLUGIN_ID, e.getMessage(), e), StatusManager.LOG);
                    }
                }

                // perform saving
                try {
                    Object saveModel = model;
                    // decompose chain
                    if (model instanceof ModelChain) {
                        saveModel = ((ModelChain) model).getSelectedModel();
                    }
                    // save
                    if (saveModel instanceof EObject) {
                        ModelUtil.saveModel((EObject) saveModel, uri);
                    } else {
                        // save to text file (create it if necessary)
                        if (!file.exists()) {
                            file.create(new StringInputStream(saveModel.toString()), 0, null);
                        } else {
                            file.setContents(new StringInputStream(saveModel.toString()), 0, null);
                        }
                    }
                } catch (Exception e) {
                    StatusManager.getManager().handle(new Status(IStatus.ERROR,
                            KiCoKlighdPlugin.PLUGIN_ID, e.getMessage(), e), StatusManager.SHOW);
                }
            }
        }
    }

    /**
     * Returns the appropriate file extension for the given model.
     * 
     * @param editor
     *            the source editor
     * @param model
     *            the model
     * @return file extension or empty string if non exists.
     */
    public String getResourceName(final IEditorPart editor, final Object model) {
        if (editor != null && model != null) {
            String filename = editor.getTitle();
            if (filename.contains(".")) {
                filename = filename.substring(0, filename.lastIndexOf('.'));
            }
            // Adding correct file extension if available
            ResourceExtension ext = KiCoPlugin.getInstance().getResourceExtension(model);
            if (ext != null) {
                filename += "." + ext.getExtension();
            }
            return filename;
        }
        return "";
    }

    // -- Controller Events
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void onActivate(final IEditorPart editor) {
        recentEditor = editor;
        update(ChangeEvent.ACTIVE_EDITOR);
        // Don't call super to prevent model update but activate adapter
        saveAdapter.activate(editor);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void onEditorSaved(final IEditorPart editor) {
        update(ChangeEvent.SAVED);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void onDiagramUpdate(final Object model, final KlighdSynthesisProperties properties) {
        // dispose warning message composite if necessary
        if (warningMessageContainer != null) {
            if (!warningMessageContainer.isDisposed()) {
                warningMessageContainer.dispose();
            }
            warningMessageContainer = null;
        }
        // show warnings composite
        CompilationResult compilationResult =
                properties.getProperty(KiCoProperties.COMPILATION_RESULT);
        StringBuilder warnings = new StringBuilder();
        if (sourceModelHasErrorMarkers) {
            warnings.append("The source model contains error markers.\n");
        }
        if (compilationResult != null && !compilationResult.getPostponedWarnings().isEmpty()) {
            for (KielerCompilerException warning : compilationResult.getPostponedWarnings()) {
                warnings.append(warning.getMessage()).append("\n");
            }
        }
        if (warnings.length() > 0) {
            warnings.setLength(warnings.length() - 1);
            addWarningComposite(getDiagramView().getViewer(), warnings.toString());
        }
    }

    // -- Model Update
    // -------------------------------------------------------------------------

    /**
     * Updates the model caused by changeEvent.
     * 
     * @param change
     *            the type of change
     */
    public void update(final ChangeEvent change) {
        update(change, null);
    }

    /**
     * Updates the model caused by changeEvent including return of asynchronous compilation.
     * 
     * @param change
     *            the change event
     * @param compilation
     *            the finished {@link AsynchronousCompilation} or null
     */
    public synchronized void update(final ChangeEvent change,
            final AsynchronousCompilation compilation) {

        // determine event flags
        boolean is_active_editor_update = change == ChangeEvent.ACTIVE_EDITOR;
        boolean is_save_update = change == ChangeEvent.SAVED;
        boolean is_selection_update = change == ChangeEvent.SELECTION;
        boolean is_display_mode_update = change == ChangeEvent.DISPLAY_MODE;
        boolean is_compile_update =
                change == ChangeEvent.COMPILE || change == ChangeEvent.COMPILATION_FINISHED;

        if (isActive() || (recentEditor != null
                && (is_selection_update || is_display_mode_update || is_compile_update))) {

            // Evaluate if source model should be read from source editor
            boolean do_get_model = false;
            do_get_model |= is_active_editor_update;
            do_get_model |= is_save_update;
            // Don't read input model when paused
            do_get_model &= syncEditorToggleAction.isChecked();

            // Get model if necessary
            if (do_get_model) {
                sourceModel = readModel(recentEditor);
                if (sourceModel != null && sourceModel.eResource() != null) {
                    Resource eResource = sourceModel.eResource();
                    sourceModelHasErrorMarkers = !eResource.getErrors().isEmpty();
                    
                    // added my cmot
                    // Check for model specific errors (e.g. Xtext validator rules) 
                    Diagnostic diagnostic = Diagnostician.INSTANCE.validate(sourceModel);
                    if (diagnostic.getSeverity() ==  Diagnostic.ERROR) {
                        sourceModelHasErrorMarkers = true;
                    }         
                    
                    IFile underlyingFile = ResourceUtil.getUnderlyingFile(eResource);
                    try {
                        if (underlyingFile != null) {
                            sourceModelHasErrorMarkers |=
                                    underlyingFile.findMarkers(IMarker.PROBLEM, false,
                                            IResource.DEPTH_INFINITE).length > 0;
                        }
                    } catch (Exception e) {
                        // do nothing
                    }
                }
            }

            // Create properties with default values
            KlighdSynthesisProperties properties = new KlighdSynthesisProperties();
            properties.setProperty(KlighdSynthesisProperties.REQUESTED_UPDATE_STRATEGY,
                    "de.cau.cs.kieler.kitt.klighd.tracing.TracingVisualizationUpdateStrategy");
            // Give model synthesis access to the compilation result
            properties.setProperty(KiCoProperties.COMPILATION_RESULT, null);

            // check if source model is read correctly
            if (sourceModel == null) {
                updateModel(null, properties);
                return;
            } else if (diagramPlaceholderToggleAction.isChecked()) {
                updateModel(new MessageModel(MODEL_PLACEHOLDER_PREFIX + recentEditor.getTitle(),
                        MODEL_PLACEHOLDER_MESSGAE), properties);
            }

            // Create model to passed to update
            Object model = sourceModel;

            // Evaluate if current transformation configuration should be read
            boolean do_get_selection = false;
            do_get_selection |= is_selection_update;
            do_get_selection |= is_active_editor_update;
            do_get_selection |= is_compile_update && compileToggleAction.isChecked();

            // Indicates of the current transformation configuration differs from previous
            // configuration
            boolean selection_changed = false;

            // get new transformations if necessary
            if (do_get_selection) {
                // if there is a pinned transformation for active editor take pinned one else
                // take selected ones
                Pair<KielerCompilerSelection, Boolean> newSelection = null;
                if (pinnedTransformations.containsKey(recentEditor)) {
                    newSelection = pinnedTransformations.get(recentEditor);
                } else {
                    newSelection = CompilerSelectionStore.getSelection(recentEditor);
                }
                // check if selection changed
                if (newSelection != null) {
                    if (!newSelection.equals(selection)) {
                        selection_changed |= true;
                        selection = newSelection;
                    }
                } else if (newSelection != selection) {
                    selection_changed |= true;
                    selection = newSelection;
                }
            }

            // update pin button according to current transformations selection
            updatePinToggleButton();

            // Evaluate if compilation is needed
            boolean do_compile = false;
            // -- compile only if something changed
            do_compile |= selection_changed;
            do_compile |= is_active_editor_update;
            do_compile |= is_save_update;
            do_compile |= is_compile_update;
            do_compile |= is_display_mode_update;
            // -- But only if:
            do_compile &= selection != null;
            do_compile &= compileToggleAction.isChecked();

            // Compile if necessary
            if (do_compile) {

                // this call is not update model run with asynchronous compilation result
                if (compilation == null) {
                    // stop already running (now deprecated) compilation
                    if (currentCompilation != null) {
                        currentCompilation.cancel();
                    }

                    // create compilation job
                    currentCompilation = new AsynchronousCompilation(this, (EObject) sourceModel,
                            recentEditor.getTitle(), selection, tracingToggleAction.isChecked());
                    currentCompilationResult = null;
                    model = currentCompilation.getModel();
                    // start
                    currentCompilation.schedule();

                    boolean showProgress = true;
                    // To make the common case fast
                    // First wait some seconds for cases with fast compilation
                    for (int i = 0; i < ASYNC_DELAY / 10; i++) {
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

                    if (showProgress) { // if not the fast case
                        currentCompilation.setNotifyWhenFinished(true);
                    } else { // directly take result and suppress additional update
                        model = currentCompilation.getModel();
                        currentCompilationResult = currentCompilation.getCompilationResult();
                    }
                    // check if given compilation is most recent
                } else if (compilation == currentCompilation) {
                    // take the result
                    model = currentCompilation.getModel();
                    currentCompilationResult = currentCompilation.getCompilationResult();
                    currentCompilation = null;
                } else { // In case this is not the most recent compilation
                    return;
                }
            } else if (!is_selection_update || selection_changed) {
                currentCompilationResult = null;
                // drop any existing compilation
                if (currentCompilation != null) {
                    currentCompilation.cancel();
                    currentCompilation = null;
                }
            }

            // publish compilation result if exists
            if (currentCompilationResult != null) {
                publishCurrentModelInformation(model, currentCompilationResult);
                properties.setProperty(KiCoProperties.COMPILATION_RESULT, currentCompilationResult);
            } else {
                // just update the autoload schedules accordingly
                KIEMModelSelectionCombination.refreshKIEMActiveAndOpenedModels(recentEditor);
                KIEMExecutionAutoloadCombination.autoloadExecutionSchedule();
            }

            // composite model in given display mode
            if (sideBySideToggleAction.isChecked()) {
                if (tracingChainToggleAction.isChecked() && currentCompilationResult != null) {
                    model = new ModelChain(sourceModel, currentCompilationResult,
                            recentEditor.getTitle(), selection.getFirst());
                } else {
                    model = new ModelChain(sourceModel, model);
                }
            }

            // Evaluate if diagram update is necessary
            boolean do_update_diagram = false;
            do_update_diagram |= do_get_model;
            do_update_diagram |= do_compile;
            do_update_diagram |= is_display_mode_update;
            // should compile but no transformations are selected
            do_update_diagram |= is_compile_update && selection != null;
            // compile and transformations changed to null
            do_update_diagram |=
                    compileToggleAction.isChecked() && selection == null && selection_changed;

            if (do_update_diagram) {
                updateModel(model, properties);
            }
        } else {
            // drop any existing compilation
            if (currentCompilation != null) {
                currentCompilation.cancel();
                currentCompilation = null;
            }
            currentCompilationResult = null;
            updateModel(null, null);
        }
    }

    // -- Update Configuration
    // -------------------------------------------------------------------------

    /**
     * Updates checked and enabled state of transformation pin toggle button according to current
     * transformation.
     */
    private void updatePinToggleButton() {
        pinToggleAction.setEnabled(selection != null);
        pinToggleAction.setChecked(pinnedTransformations.containsKey(recentEditor));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ILayoutConfig getLayoutConfig() {
        ViewContext viewContext = getDiagramView().getViewContext();
        // Assure that model chain is always layouted left to right
        if (viewContext.getInputModel() instanceof ModelChain) {
            return new CompoundLayoutConfig(Lists.newArrayList(
                    new VolatileLayoutConfig(KlighdConstants.SIDE_BAR_LAYOUT_CONFIG_PRIORITY + 1)
                            .setValue(LayoutOptions.DIRECTION, viewContext.getViewModel(),
                                    LayoutContext.DIAGRAM_PART, Direction.RIGHT)));
        } else {
            return super.getLayoutConfig();
        }
    }

    /**
     * Publishes information about the currently displayed model.
     * 
     * @param model
     */
    private void publishCurrentModelInformation(final Object model,
            final CompilationResult compilationResult) {
        if (!pinToggleAction.isChecked() && getDiagramView().getEditor().getSite().getPage().getActiveEditor() == getDiagramView().getEditor()) {
            boolean is_placeholder = model instanceof ErrorModel || model instanceof MessageModel
                    || model instanceof CodePlaceHolder;
            boolean is_chain = model instanceof ModelChain;
            // Inform KIEM about current model
            if (compilationResult != null) {
                if (model != null && !is_placeholder && !is_chain) {
                    KiemPlugin.getOpenedModelRootObjects().put(modelViewPath, (EObject) model);
                    KiemPlugin.getOpenedModelRootObjects().put(sourceModelViewPath, (EObject) sourceModel);
                    KiemPlugin.setCurrentModelFile(modelViewPath);
                    KIEMExecutionAutoloadCombination.autoloadExecutionSchedule();
                } else if (!is_placeholder) {
                    KiemPlugin.getOpenedModelRootObjects().put(modelViewPath, null);
                    KiemPlugin.getOpenedModelRootObjects().put(sourceModelViewPath, (EObject) sourceModel);
                    KiemPlugin.setCurrentModelFile(modelViewPath);
                    KIEMExecutionAutoloadCombination.autoloadExecutionSchedule();
                }
            } else { // this case when model is not compiled
                KIEMModelSelectionCombination.refreshKIEMActiveAndOpenedModels(recentEditor);
                KIEMExecutionAutoloadCombination.autoloadExecutionSchedule();
            }
        }
    }

    // -- Visual error feedback
    // -------------------------------------------------------------------------

    /**
     * Shows warning text in klighd canvas.
     * 
     * @param viewer
     * @param allWarnings
     */
    private void addWarningComposite(final IViewer viewer, final String allWarnings) {
        final Composite canvas = (Composite) viewer.getControl();
        warningMessageContainer = new Composite(canvas, SWT.NONE);

        final Color orange = new Color(canvas.getDisplay(), new RGB(255, 165, 0));
        warningMessageContainer.setBackground(orange);

        final Label close = new Label(warningMessageContainer, SWT.NONE);
        final Image closeImage = CLOSE_ICON.createImage();
        close.setBackground(orange);
        close.setImage(closeImage);
        // close.setBackground(orange);
        close.setToolTipText("Close warnings");
        // close action
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

        // update composite
        warningMessageContainer.pack();
        canvas.layout(true, true);

        // cleanup on dispose
        warningMessageContainer.addDisposeListener(new DisposeListener() {

            public void widgetDisposed(final DisposeEvent e) {
                orange.dispose();
                closeImage.dispose();
            }
        });
    }

}
