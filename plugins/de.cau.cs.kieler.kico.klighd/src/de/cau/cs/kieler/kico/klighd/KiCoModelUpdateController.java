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

import de.cau.cs.kieler.kico.CompilationResult;
import de.cau.cs.kieler.kico.KiCoPlugin;
import de.cau.cs.kieler.kico.KiCoProperties;
import de.cau.cs.kieler.kico.KielerCompilerException;
import de.cau.cs.kieler.kico.internal.ResourceExtension;
import de.cau.cs.kieler.kico.klighd.internal.ModelUtil;
import de.cau.cs.kieler.kico.klighd.internal.model.ModelChain;
import de.cau.cs.kieler.klighd.IViewer;
import de.cau.cs.kieler.klighd.ui.view.controller.AbstractViewUpdateController;
import de.cau.cs.kieler.klighd.ui.view.controllers.EcoreXtextSaveUpdateController;
import de.cau.cs.kieler.klighd.ui.view.model.MessageModel;
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties;

/**
 * Controller for the ModelView to handle models interacting with KiCo.
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
    public static enum ChangeEvent {
        DISPLAY_MODE, EDITOR, COMPILER
    }

    // -- CONSTANTS --
    /** Controller ID. */
    private static final String ID = "de.cau.cs.kieler.kico.klighd.KiCoModelUpdateController";
   
    // -- GUI (Model) texts --

    private static final String MODEL_PLACEHOLDER_PREFIX = "Model Placeholder: ";
    private static final String MODEL_PLACEHOLDER_MESSGAE = "Model visualization is deactivated";

    // -- Icons --
    /** The icon for saving current model. */
    private static final ImageDescriptor SAVE_ICON = AbstractUIPlugin
            .imageDescriptorFromPlugin("org.eclipse.ui", "icons/full/etool16/save_edit.gif");
    /** The icon for toggling compile mode button. */
    private static final ImageDescriptor COMPILER_ICON =
            KiCoKlighdPlugin.getImageDescriptor("icons/full/etool16/compile.png");
    /** The icon for synchronizing with compiler. */
    private static final ImageDescriptor SYNC_COMPILER_ICON =
            KiCoKlighdPlugin.getImageDescriptor("icons/full/etool16/pin.png");
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
    private Action compilerToggleAction;
    private static final boolean COMPILER_TOGGLE_ACTION_DEFAULT_STATE = true;

    /** The action for toggling sync with compiler. */
    private Action syncCompilerToggleAction;
    private static final boolean SYNC_COMPILER_TOGGLE_ACTION_DEFAULT_STATE = true;
    
    // -- Menu --
    /** The action for toggling editor synchronization. */
    private final Action syncEditorToggleAction;
    private static final boolean SYNC_EDITOR_TOGGLE_ACTION_DEFAULT_STATE = true;

    /** The action for toggling display of diagram placeholder. */
    private final Action diagramPlaceholderToggleAction;
    private static final boolean DIAGRAM_PLACEHOLDER_TOGGLE_ACTION_DEFAULT_STATE = false;

    /** The action for toggling chain display mode. */
    private Action chainToggleAction;
    private static final boolean CHAIN_TOGGLE_ACTION_DEFAULT_STATE = false;

    // -- Model --

    /** Model extracted from editor. */
    private EObject sourceModel;

    /** Indicates if the source model has error markers. */
    private boolean sourceModelHasErrorMarkers = false;

    /** The compiled model. */
    private Object compiledModel = null;
    
    /** The compiled model context. */
    private CompilationResult compiledModelContext = null;
    
    // -- Visual --

    /** Container for displaying waring messages. */
    private Composite warningMessageContainer = null;

    // -- Constructor and Initialization
    // -------------------------------------------------------------------------

    /**
     * Default Constructor.
     */
    public KiCoModelUpdateController() {
        KiCoModelViewNotifier.register(this);

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
        compilerToggleAction = new Action("Show compiled model", IAction.AS_CHECK_BOX) {
            @Override
            public void run() {
                update(ChangeEvent.COMPILER);
            }
        };
        compilerToggleAction.setId("compilerToggleAction");
        compilerToggleAction.setToolTipText("Show compiled model");
        compilerToggleAction.setImageDescriptor(COMPILER_ICON);
        compilerToggleAction.setChecked(COMPILER_TOGGLE_ACTION_DEFAULT_STATE);

        // Sync compiler button
        syncCompilerToggleAction = new Action("Link with compiler", IAction.AS_CHECK_BOX) {
            @Override
            public void run() {
            }
        };
        syncCompilerToggleAction.setId("syncCompilerToggleAction");
        syncCompilerToggleAction.setToolTipText("Link with compiler");
        syncCompilerToggleAction.setImageDescriptor(SYNC_COMPILER_ICON);
        syncCompilerToggleAction.setChecked(SYNC_COMPILER_TOGGLE_ACTION_DEFAULT_STATE);

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
                            update(ChangeEvent.EDITOR);
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


        // chain item
        chainToggleAction = new Action("", IAction.AS_CHECK_BOX) {
            public void run() {
                update(ChangeEvent.DISPLAY_MODE);
            }
        };
        chainToggleAction.setId("chainToggleAction");
        chainToggleAction.setText("Display Transformation Chain");
        chainToggleAction.setToolTipText(
                "Enable tranformation chain view in displaySideBySide display mode");
        // actionTracingChainToggle.setImageDescriptor(ICON_CHAIN);
        chainToggleAction.setChecked(CHAIN_TOGGLE_ACTION_DEFAULT_STATE);
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
    
    // -- Activation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void onActivate(final IEditorPart editor) {
        update(ChangeEvent.EDITOR);
        // Don't call super to prevent model update but activate adapter
        saveAdapter.activate(editor);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void onDeactivate() {
        sourceModel = null;
        compiledModel = null;
        compiledModelContext = null;
        saveAdapter.deactivate();
    }
    
    // -- Save Listener
    // -------------------------------------------------------------------------
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void onEditorSaved(final IEditorPart editor) {
        if (syncEditorToggleAction.isChecked() &&
            (!compilerToggleAction.isChecked() || compiledModel == null)) {
            update(ChangeEvent.EDITOR);
        }
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void refresh() {
        if (!compilerToggleAction.isChecked() || compiledModel == null) {
            update(ChangeEvent.EDITOR);
        }
    }
    
    // -- Diagram View Callbacks
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void addContributions(final IToolBarManager toolBar, final IMenuManager menu) {
        toolBar.add(new Separator());
        toolBar.add(saveAction);
        toolBar.add(compilerToggleAction);
        toolBar.add(syncCompilerToggleAction);
        toolBar.add(sideBySideToggleAction);

        menu.add(new Separator());
        menu.add(syncEditorToggleAction);
        menu.add(diagramPlaceholderToggleAction);
        menu.add(chainToggleAction);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void onDispose() {
        KiCoModelViewNotifier.unregister(this);
        super.onDispose();
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
    
    // -- Controller state
    // -------------------------------------------------------------------------
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void copy(final AbstractViewUpdateController source) {
        super.copy(source);
        if (source instanceof KiCoModelUpdateController) {
            KiCoModelUpdateController other = (KiCoModelUpdateController) source;
            lastSaveDirectory = other.lastSaveDirectory;
            compilerToggleAction.setChecked(other.compilerToggleAction.isChecked());
            if (other.compilerToggleAction.isChecked()) {
                syncCompilerToggleAction.setChecked(false);
            } else {
                syncCompilerToggleAction.setChecked(other.syncCompilerToggleAction.isChecked());
            }
            compiledModel = other.compiledModel;
            syncEditorToggleAction.setChecked(other.syncEditorToggleAction.isChecked());
            sideBySideToggleAction.setChecked(other.sideBySideToggleAction.isChecked());
            diagramPlaceholderToggleAction.setChecked(other.diagramPlaceholderToggleAction.isChecked());
            chainToggleAction.setChecked(other.chainToggleAction.isChecked());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void reset() {
        lastSaveDirectory = null;
        compilerToggleAction.setChecked(COMPILER_TOGGLE_ACTION_DEFAULT_STATE);
        syncCompilerToggleAction.setChecked(SYNC_COMPILER_TOGGLE_ACTION_DEFAULT_STATE);
        compiledModel = null;
        compiledModelContext = null;
        syncEditorToggleAction.setChecked(SYNC_EDITOR_TOGGLE_ACTION_DEFAULT_STATE);
        sideBySideToggleAction.setChecked(SIDE_BY_SIDE_TOGGLE_ACTION_DEFAULT_STATE);
        diagramPlaceholderToggleAction.setChecked(DIAGRAM_PLACEHOLDER_TOGGLE_ACTION_DEFAULT_STATE);
        chainToggleAction.setChecked(CHAIN_TOGGLE_ACTION_DEFAULT_STATE);
        getProperties().getAllProperties().clear();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void saveState(final IMemento memento) {
        if (lastSaveDirectory != null) {
            memento.putString("lastSaveDirectory", lastSaveDirectory.toPortableString());
        }
        
        memento.putBoolean("compilerToggleAction", compilerToggleAction.isChecked());
        
        memento.putBoolean("sideBySideToggleAction", sideBySideToggleAction.isChecked());

        memento.putBoolean("diagramPlaceholderToggleAction", diagramPlaceholderToggleAction.isChecked());
        
        memento.putBoolean("chainToggleAction", chainToggleAction.isChecked());
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

        Boolean compilerToggleActionValue = memento.getBoolean("compilerToggleAction");
        if (compilerToggleActionValue != null) {
            if (compilerToggleAction != null) {
                compilerToggleAction.setChecked(compilerToggleActionValue);
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
        
        Boolean chainToggleActionValue = memento.getBoolean("chainToggleAction");
        if (chainToggleActionValue != null) {
            if (chainToggleAction != null) {
                chainToggleAction.setChecked(chainToggleActionValue);
            }
        }
    }


    // -- Save model
    // -------------------------------------------------------------------------

    /**
     * Saves the current model into a file with saveAs dialog.
     */
    private void saveModel() {
        if (getModel() != null && isActive()) {
            Object model = getModel();
            // Get workspace
            IWorkspace workspace = ResourcesPlugin.getWorkspace();
            IWorkspaceRoot root = workspace.getRoot();

            // get filename with correct extension
            String filename = getResourceName(getEditor(), model);

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

    // -- Model Update
    // -------------------------------------------------------------------------

    /**
     * Updates the compiler model and compilation context.
     * 
     * @param model
     * @param context
     */
    // package protected
    void updateCompilerModel(Object model, CompilationResult context) {
        if (isActive() && syncCompilerToggleAction.isChecked()) {
            compiledModel = model;
            compiledModelContext = context;
            update(ChangeEvent.COMPILER);
        }
    }
    
    /**
     * Updates the model caused by changeEvent.
     * 
     * @param change
     *            the type of change
     */
    public void update(final ChangeEvent change) {
        if (isActive()) {
            // Read the model if necessary
            if (change == ChangeEvent.EDITOR) {
                sourceModel = readModel(getEditor());
                if (sourceModel != null && sourceModel.eResource() != null) {
                    Resource eResource = sourceModel.eResource();
                    sourceModelHasErrorMarkers = !eResource.getErrors().isEmpty();
                    
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
            properties.setProperty(KiCoProperties.COMPILATION_RESULT, compiledModelContext);

            // Create model to passed to update
            Object model = null;

            if (sourceModel != null) {
                if (diagramPlaceholderToggleAction.isChecked()) {
                    model = new MessageModel(MODEL_PLACEHOLDER_PREFIX + getEditor().getTitle(), MODEL_PLACEHOLDER_MESSGAE);
                } else if (sideBySideToggleAction.isChecked()) {
                    if (chainToggleAction.isChecked() && compiledModelContext != null) {
                        model = new ModelChain(compiledModelContext, getEditor().getTitle());
                    } else if (compilerToggleAction.isChecked() && compiledModel != null) {
                        model = new ModelChain(sourceModel, compiledModel);
                    } else {
                        model = new ModelChain(sourceModel, sourceModel);
                    }
                } else if (compilerToggleAction.isChecked() && compiledModel != null) {
                    model = compiledModel;
                } else {
                    model = sourceModel;
                }
            }

            // Update model
            updateModel(model, properties);
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
