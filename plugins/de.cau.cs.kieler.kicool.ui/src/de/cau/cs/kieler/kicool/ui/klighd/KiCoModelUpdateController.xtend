/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ui.klighd

import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.kitt.tracing.Tracing
import de.cau.cs.kieler.kicool.registration.ModelInformation
import de.cau.cs.kieler.kicool.ui.KiCoolUiModule
import de.cau.cs.kieler.kicool.ui.kitt.update.TracingVisualizationUpdateStrategy
import de.cau.cs.kieler.kicool.ui.klighd.models.ModelChain
import de.cau.cs.kieler.kicool.ui.view.CompilerView
import de.cau.cs.kieler.klighd.IViewer
import de.cau.cs.kieler.klighd.ui.view.controller.AbstractViewUpdateController
import de.cau.cs.kieler.klighd.ui.view.controllers.EditorSaveAdapter
import de.cau.cs.kieler.klighd.ui.view.controllers.XtextSelectionHighlighter
import de.cau.cs.kieler.klighd.ui.view.model.MessageModel
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties
import java.io.File
import java.io.IOException
import java.nio.file.Files
import java.util.Collections
import java.util.List
import org.eclipse.core.resources.IMarker
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.Status
import org.eclipse.emf.common.util.Diagnostic
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.Diagnostician
import org.eclipse.jface.action.Action
import org.eclipse.jface.action.IAction
import org.eclipse.jface.action.IMenuManager
import org.eclipse.jface.action.IToolBarManager
import org.eclipse.jface.action.Separator
import org.eclipse.jface.resource.ImageDescriptor
import org.eclipse.jface.viewers.SelectionChangedEvent
import org.eclipse.swt.SWT
import org.eclipse.swt.events.DisposeEvent
import org.eclipse.swt.events.DisposeListener
import org.eclipse.swt.events.MouseAdapter
import org.eclipse.swt.events.MouseEvent
import org.eclipse.swt.graphics.Color
import org.eclipse.swt.graphics.Image
import org.eclipse.swt.graphics.RGB
import org.eclipse.swt.layout.RowLayout
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.DirectoryDialog
import org.eclipse.swt.widgets.Label
import org.eclipse.ui.IEditorPart
import org.eclipse.ui.IMemento
import org.eclipse.ui.dialogs.SaveAsDialog
import org.eclipse.ui.statushandlers.StatusManager
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.ui.util.ResourceUtil
import org.eclipse.xtext.util.StringInputStream

/**
 * Controller for the ModelView to handle models interacting with KiCo.
 * 
 * @author als ssm
 * @kieler.design 2014-07-30 proposed
 * @kieler.rating 2014-07-30 proposed yellow
 * 
 */
class KiCoModelUpdateController extends AbstractViewUpdateController implements EditorSaveAdapter.EditorSafeListener {

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
    private static val String ID = "de.cau.cs.kieler.kicool.ui.klighd.KiCoModelUpdateController"
   
    // -- GUI (Model) texts --

    private static final String MODEL_PLACEHOLDER_PREFIX = "Model Placeholder: "
    private static final String MODEL_PLACEHOLDER_MESSGAE = "Model visualization is deactivated"

    // -- Icons --
    /** The icon for saving current model. */
    private static final ImageDescriptor SAVE_ICON = 
            KiCoolUiModule.getImageDescriptor("icons/full/etool16/save_edit.png")
    /** The icon for pin selection button. */
    private static final ImageDescriptor PIN_ICON =
            KiCoolUiModule.getImageDescriptor("icons/full/etool16/pin.png")
    /** The icon for toggling compile mode button. */
    private static final ImageDescriptor COMPILER_ICON =
            KiCoolUiModule.getImageDescriptor("icons/full/etool16/compile.png")
    /** The icon for synchronizing with compiler. */
    private static final ImageDescriptor SYNC_COMPILER_ICON =
            KiCoolUiModule.getImageDescriptor("icons/full/etool16/link_compile.png")
    /** The icon for fork view button. */
    private static final ImageDescriptor SIDE_BY_SIDE_ICON =
            KiCoolUiModule.getImageDescriptor("icons/full/etool16/side_by_side.png")
    /** The icon for toggling chain display mode button. */
    private static final ImageDescriptor CHAIN_ICON =
            KiCoolUiModule.getImageDescriptor("icons/full/etool16/chain.png")
    /** The icon for closing windows. */
    private static final ImageDescriptor CLOSE_ICON = 
            KiCoolUiModule.getImageDescriptor("icons/full/elcl16/remove.png")

    // -- Toolbar --
    /** The action for saving currently displayed model. */
    private val Action saveAction
    /** The last directory used for saving a model. */
    private var IPath lastSaveDirectory = null

    /** The action for toggling side-by-side display mode. */
    private var Action sideBySideToggleAction
    private static final boolean SIDE_BY_SIDE_TOGGLE_ACTION_DEFAULT_STATE = false

    /** The action for toggling compile. */
    private var Action compilerToggleAction
    private static final boolean COMPILER_TOGGLE_ACTION_DEFAULT_STATE = true

    /** The action for toggling sync with compiler. */
    private var Action syncCompilerToggleAction
    private static final boolean SYNC_COMPILER_TOGGLE_ACTION_DEFAULT_STATE = true
    
    // -- Menu --
    /** The action for toggling editor synchronization. */
    private var Action syncEditorToggleAction
    private static final boolean SYNC_EDITOR_TOGGLE_ACTION_DEFAULT_STATE = true

    /** The action for toggling display of diagram placeholder. */
    private var Action diagramPlaceholderToggleAction
    private static final boolean DIAGRAM_PLACEHOLDER_TOGGLE_ACTION_DEFAULT_STATE = false

    /** The action for toggling chain display mode. */
    private var Action chainToggleAction
    private static final boolean CHAIN_TOGGLE_ACTION_DEFAULT_STATE = false

    /** The action for toggling forced simple update strategy mode. */
    private var Action simpleUpdateToggleAction
    private static final boolean SIMPLE_UPDATE_TOGGLE_ACTION_DEFAULT_STATE = false
    
    /** External contributions */
    private val List<KiCoModelViewUIContributor> externalUIContributors = newArrayList
        
    // -- Model --

    /** Model extracted from editor. */
    @Accessors(PUBLIC_GETTER)
    private var Object sourceModel

    /** Indicates if the source model has error markers. */
    private var boolean sourceModelHasErrorMarkers = false

    /** The compiled model. */
    @Accessors(PUBLIC_GETTER)
    private val List<Object> compiledModel = <Object> newArrayList
    
    // -- Visual --

    /** Container for displaying waring messages. */
    private Composite warningMessageContainer = null
    
    /** The save adapter for the editor. */
    protected final EditorSaveAdapter saveAdapter;

    // -- Constructor and Initialization
    // -------------------------------------------------------------------------

    /**
     * Default Constructor.
     */
    new() {
        KiCoModelViewNotifier.register(this)
        saveAdapter = new EditorSaveAdapter(this);

        // Save Button
        saveAction = new Action("Save displayed main model", IAction.AS_PUSH_BUTTON) {
            override void run() {
                saveModel()
            }
        }
        saveAction.setId("saveAction")
        saveAction.setToolTipText("Save displayed main model")
        saveAction.setImageDescriptor(SAVE_ICON)

        // Compile button
        compilerToggleAction = new Action("Show compiled model", IAction.AS_CHECK_BOX) {
            override void run() {
                update(ChangeEvent.COMPILER)
            }
        }
        compilerToggleAction.setId("compilerToggleAction")
        compilerToggleAction.setToolTipText("Show compiled model")
        compilerToggleAction.setImageDescriptor(COMPILER_ICON)
        compilerToggleAction.setChecked(COMPILER_TOGGLE_ACTION_DEFAULT_STATE)

        // Sync compiler button
        syncCompilerToggleAction = new Action("Link with compiler", IAction.AS_CHECK_BOX) {
            override void run() {
            }
        }
        syncCompilerToggleAction.setId("syncCompilerToggleAction")
        syncCompilerToggleAction.setToolTipText("Link with compiler selection")
        syncCompilerToggleAction.setImageDescriptor(SYNC_COMPILER_ICON)
        syncCompilerToggleAction.setChecked(SYNC_COMPILER_TOGGLE_ACTION_DEFAULT_STATE)

        // Side-by-Side button
        sideBySideToggleAction =
                new Action("Activate side-by-side display mode", IAction.AS_CHECK_BOX) {
                    override void run() {
                        update(ChangeEvent.DISPLAY_MODE)
                    }
                }
        sideBySideToggleAction.setId("sideBySideToggleAction")
        sideBySideToggleAction.setToolTipText("Activate side-by-side display mode")
        sideBySideToggleAction.setImageDescriptor(SIDE_BY_SIDE_ICON)
        sideBySideToggleAction.setChecked(SIDE_BY_SIDE_TOGGLE_ACTION_DEFAULT_STATE)

        // Sync Menu Item
        syncEditorToggleAction =
                new Action("Synchronize with editor content", IAction.AS_CHECK_BOX) {
                    override void run() {
                        if (isChecked()) {
                            update(ChangeEvent.EDITOR)
                        }
                    }
                }
        syncEditorToggleAction.setId("syncEditorToggleAction")
        syncEditorToggleAction.setToolTipText(
                "If Synchronize is disabled, this view will no longer update its status when editor content changes.")
        syncEditorToggleAction.setChecked(SYNC_EDITOR_TOGGLE_ACTION_DEFAULT_STATE)

        // Diagram PlaceHolder Menu Item
        diagramPlaceholderToggleAction = new Action("Diagram Placeholder", IAction.AS_CHECK_BOX) {
            override void run() {
                update(ChangeEvent.DISPLAY_MODE)
            }
        }
        diagramPlaceholderToggleAction.setId("diagramPlaceholderToggleAction")
        diagramPlaceholderToggleAction.setToolTipText(
                "If visualization is deactiveted, all diagrams will be replaced by a placeholder diagram.")
        diagramPlaceholderToggleAction.setChecked(DIAGRAM_PLACEHOLDER_TOGGLE_ACTION_DEFAULT_STATE)


        // chain item
        chainToggleAction = new Action("", IAction.AS_CHECK_BOX) {
            override void run() {
                update(ChangeEvent.DISPLAY_MODE)
            }
        }
        chainToggleAction.setId("chainToggleAction")
        chainToggleAction.setText("Display Tracing Chain")
        chainToggleAction.setToolTipText(
                "Shows tracing chain in side-by-side mode if tracing data is available.")
        // actionTracingChainToggle.setImageDescriptor(ICON_CHAIN)
        chainToggleAction.setChecked(CHAIN_TOGGLE_ACTION_DEFAULT_STATE)
        
        // force simple update
        simpleUpdateToggleAction = new Action("", IAction.AS_CHECK_BOX) {
            override void run() {
                update(ChangeEvent.DISPLAY_MODE)
            }
        }
        simpleUpdateToggleAction.setId("simpleUpdateToggleAction")
        simpleUpdateToggleAction.setText("Force Simple Update Strategy")
        simpleUpdateToggleAction.setToolTipText(
                "Forces this view to always use the simple update strategy (no incremental update)")
        simpleUpdateToggleAction.setChecked(SIMPLE_UPDATE_TOGGLE_ACTION_DEFAULT_STATE)
        
        
        externalUIContributors += KiCoModelViewUIContributorRegistry.contributors
    }

    // -- Controller
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    override String getID() {
        return ID
    }
    
    def boolean showsCompiledModel() {
        return compilerToggleAction.isChecked
    }
    
    // -- Activation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    override void onActivate(IEditorPart editor) {
        update(ChangeEvent.EDITOR)
        // Don't call super to prevent model update but activate adapter
        saveAdapter.activate(editor)
    }

    /**
     * {@inheritDoc}
     */
    override void onDeactivate() {
        sourceModel = null
        compiledModel.clear()
        saveAdapter.deactivate()
    }
    
    // -- Diagram Selection Change Event
    // -------------------------------------------------------------------------
    
    /**
     * {@inheritDoc}
     */
    override selectionChanged(SelectionChangedEvent event) {
        if (getEditor() instanceof XtextEditor) {
            // ssm: Deactivate for workaround for the SBE with SDs
            XtextSelectionHighlighter.highlightSelection(getEditor as XtextEditor, event.getSelection());
        }
    }
    
    // -- Save Listener
    // -------------------------------------------------------------------------
    
    /**
     * {@inheritDoc}
     */
    override void onEditorSaved(IEditorPart editor) {
        if (syncEditorToggleAction.isChecked() &&
            (!compilerToggleAction.isChecked() || compiledModel.empty)) {
            update(ChangeEvent.EDITOR)
        }
        if (sourceModel instanceof EObject) {
            if (sourceModel.eResource !== null) {
                sourceModel.eResource.timeStamp = System.currentTimeMillis
            }
        }
    }
    
    /**
     * {@inheritDoc}
     */
    override void refresh() {
        if (!compilerToggleAction.isChecked() || compiledModel.empty) {
            update(ChangeEvent.EDITOR)
        } else {
            diagramView.updateDiagram
        }
    }
    
    // -- Diagram View Callbacks
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    override void addContributions(IToolBarManager toolBar, IMenuManager menu) {
        toolBar.add(new Separator())
        toolBar.add(saveAction)
        toolBar.add(compilerToggleAction)
        toolBar.add(syncCompilerToggleAction)
        toolBar.add(sideBySideToggleAction)

        menu.add(new Separator())
        menu.add(syncEditorToggleAction)
        menu.add(diagramPlaceholderToggleAction)
        menu.add(chainToggleAction)
        menu.add(simpleUpdateToggleAction)
        
        externalUIContributors.forEach[contributeControls(this, toolBar, menu)]
    }

    /**
     * {@inheritDoc}
     */
    override void onDispose() {
        KiCoModelViewNotifier.unregister(this)
        super.onDispose()
    }
    
    /**
     * {@inheritDoc}
     */
    override void onDiagramUpdate(Object model, KlighdSynthesisProperties properties) {
        // dispose warning message composite if necessary
        if (warningMessageContainer !== null) {
            if (!warningMessageContainer.isDisposed()) {
                warningMessageContainer.dispose()
            }
            warningMessageContainer = null
        }
        // show warnings composite
        val warnings = new StringBuilder()
        if (sourceModelHasErrorMarkers) {
            warnings.append("The source model contains error markers.\n")
        }
        for (contributor : KiCoModelViewUIContributorRegistry.contributors) {
            val texts = contributor.contributeDiagramWarnings(this, model, properties)
            if (texts !== null && texts.length > 0) {
                for (text : texts) {
                    warnings.append(text)
                    warnings.append("\n")
                }
            }
        }
        if (warnings.length() > 0) {
            warnings.setLength(warnings.length() - 1)           
            addWarningComposite(getDiagramView().getViewer(), warnings.toString())
        }
    }
    
    // -- Controller state
    // -------------------------------------------------------------------------
    
    /**
     * {@inheritDoc}
     */
    override void copy(AbstractViewUpdateController source) {
        super.copy(source)
        if (source instanceof KiCoModelUpdateController) {
            lastSaveDirectory = source.lastSaveDirectory
            compilerToggleAction.setChecked(source.compilerToggleAction.isChecked())
            if (source.compilerToggleAction.isChecked()) {
                syncCompilerToggleAction.setChecked(false)
            } else {
                syncCompilerToggleAction.setChecked(source.syncCompilerToggleAction.isChecked())
            }
            compiledModel.clear
            compiledModel.addAll(source.compiledModel)
            syncEditorToggleAction.setChecked(source.syncEditorToggleAction.isChecked())
            sideBySideToggleAction.setChecked(source.sideBySideToggleAction.isChecked())
            diagramPlaceholderToggleAction.setChecked(source.diagramPlaceholderToggleAction.isChecked())
            chainToggleAction.setChecked(source.chainToggleAction.isChecked())
            simpleUpdateToggleAction.setChecked(source.simpleUpdateToggleAction.isChecked())
        }
    }

    /**
     * {@inheritDoc}
     */
    override void reset() {
        lastSaveDirectory = null
        compilerToggleAction.setChecked(COMPILER_TOGGLE_ACTION_DEFAULT_STATE)
        syncCompilerToggleAction.setChecked(SYNC_COMPILER_TOGGLE_ACTION_DEFAULT_STATE)
        compiledModel.clear
        syncEditorToggleAction.setChecked(SYNC_EDITOR_TOGGLE_ACTION_DEFAULT_STATE)
        sideBySideToggleAction.setChecked(SIDE_BY_SIDE_TOGGLE_ACTION_DEFAULT_STATE)
        diagramPlaceholderToggleAction.setChecked(DIAGRAM_PLACEHOLDER_TOGGLE_ACTION_DEFAULT_STATE)
        chainToggleAction.setChecked(CHAIN_TOGGLE_ACTION_DEFAULT_STATE)
        simpleUpdateToggleAction.setChecked(SIMPLE_UPDATE_TOGGLE_ACTION_DEFAULT_STATE)
        getProperties().getAllProperties().clear()
    }

    /**
     * {@inheritDoc}
     */
    override void saveState(IMemento memento) {
        if (lastSaveDirectory !== null) {
            memento.putString("lastSaveDirectory", lastSaveDirectory.toPortableString())
        }
        
        memento.putBoolean("compilerToggleAction", compilerToggleAction.isChecked())
        
        memento.putBoolean("sideBySideToggleAction", sideBySideToggleAction.isChecked())

        memento.putBoolean("diagramPlaceholderToggleAction", diagramPlaceholderToggleAction.isChecked())
        
        memento.putBoolean("chainToggleAction", chainToggleAction.isChecked())

        memento.putBoolean("simpleUpdateToggleAction", simpleUpdateToggleAction.isChecked())
        
        externalUIContributors.forEach[saveState(this, memento)]
    }

    /**
     * {@inheritDoc}
     */
    override void loadState(IMemento memento) {
        val lastSaveDirectoryValue = memento.getString("lastSaveDirectory")
        if (lastSaveDirectoryValue != null) {
            lastSaveDirectory = Path.fromPortableString(lastSaveDirectoryValue)
        }

        val compilerToggleActionValue = memento.getBoolean("compilerToggleAction")
        if (compilerToggleActionValue != null) {
            if (compilerToggleAction != null) {
                compilerToggleAction.setChecked(compilerToggleActionValue)
            }
        }
        
        val sideBySideToggleActionValue = memento.getBoolean("sideBySideToggleAction")
        if (sideBySideToggleActionValue != null) {
            if (sideBySideToggleAction != null) {
                sideBySideToggleAction.setChecked(sideBySideToggleActionValue)
            }
        }
        
        val actionDiagramPlaceholderValue = memento.getBoolean("diagramPlaceholderToggleAction")
        if (actionDiagramPlaceholderValue != null) {
            if (diagramPlaceholderToggleAction != null) {
                diagramPlaceholderToggleAction.setChecked(actionDiagramPlaceholderValue)
            }
        }
        
        val chainToggleActionValue = memento.getBoolean("chainToggleAction")
        if (chainToggleActionValue != null) {
            if (chainToggleAction != null) {
                chainToggleAction.setChecked(chainToggleActionValue)
            }
        }
        
        val simpleUpdateToggleActionValue = memento.getBoolean("simpleUpdateToggleAction")
        if (simpleUpdateToggleActionValue != null) {
            if (simpleUpdateToggleAction != null) {
                simpleUpdateToggleAction.setChecked(simpleUpdateToggleActionValue)
            }
        }
        
        externalUIContributors.forEach[loadState(this, memento)]
    }


    // -- Save model
    // -------------------------------------------------------------------------

    /**
     * Saves the current model into a file with saveAs dialog.
     */
    private def void saveModel() {
        if (getModel() !== null && isActive()) {
            val model = getModel()
            // Get workspace
            val workspace = ResourcesPlugin.getWorkspace()
            val root = workspace.getRoot()

            // get filename with correct extension
            var filename = getResourceName(getEditor(), model)
            if (model instanceof CodeContainer) {
                if (model.files.size == 1) {
                    filename = model.files.head.fileName
                }
            }
            
            if (model instanceof CodeContainer) {
                val dialog = new DirectoryDialog(getDiagramView().getSite().getShell())
                val path = dialog.open()
                val dest = new File(path)
                for (code : (model as CodeContainer).files) {
                    val target = new File(dest, code.fileName)
                    Files.write(target.toPath, code.code.getBytes())
                }
            } else {
                val saveAsDialog = new SaveAsDialog(getDiagramView().getSite().getShell())
    
                // Configure dialog
                if (lastSaveDirectory !== null) {
                    var lastpath = lastSaveDirectory
                    // add new filename
                    lastpath = lastpath.append(filename)
                    try {
                        saveAsDialog.setOriginalFile(root.getFile(lastpath))
                    } catch (Exception e) {
                        // In case of any path error
                        saveAsDialog.setOriginalName(filename)
                    }
                } else {
                    saveAsDialog.setOriginalName(filename)
                }
    
                saveAsDialog.setTitle("Save Model")
                saveAsDialog.setBlockOnOpen(true)
    
                // open and get result
                saveAsDialog.open()
                val path = saveAsDialog.getResult()
    
                // save
                if (path !== null && !path.isEmpty()) {
                    val file = root.getFile(path)
                    val uri = URI.createPlatformResourceURI(path.toString(), false)
    
                    // remove filename to just store the path
                    lastSaveDirectory = file.getFullPath().removeLastSegments(1)
    
                    // refresh workspace to prevent out of sync with file-system
                    if (file.exists()) {
                        try {
                            file.refreshLocal(IResource.DEPTH_INFINITE, null)
                        } catch (CoreException e) {
                            StatusManager.getManager().handle(new Status(IStatus.WARNING,
                                    KiCoolUiModule.PLUGIN_ID, e.getMessage(), e), StatusManager.LOG)
                        }
                    }
    
                    // perform saving
                    try {
                        var saveModel = model
                        // decompose chain
                        if (model instanceof ModelChain) {
                            saveModel = model.getSelectedModel()
                        }
                        // save
                        if (saveModel instanceof EObject) {
                            saveModel(saveModel, uri)
                        } else {
                            // save to text file (create it if necessary)
                            if (!file.exists()) {
                                file.create(new StringInputStream(saveModel.toString()), 0, null)
                            } else {
                                file.setContents(new StringInputStream(saveModel.toString()), 0, null)
                            }
                        }
                    } catch (Exception e) {
                        StatusManager.getManager().handle(new Status(IStatus.ERROR,
                                KiCoolUiModule.PLUGIN_ID, e.getMessage(), e), StatusManager.SHOW)
                    }
                }
            }
        }
    }
    
    /**
     * Save a models to the given URI.
     * 
     * @param model
     *            the models to store in the new file
     * @param uri
     *            the target file URI
     * @throws IOException
     *             if an error occurs while saving
     */
    private def saveModel(EObject model, URI uri) throws IOException {
        // Create a resource set.
        val resourceSet = new ResourceSetImpl();
        // Create a resource for this file.
        val resource = resourceSet.createResource(uri);
        // Add the model objects to the contents.
        resource.getContents().add(model);
        // Save the contents of the resource to the file system.
        resource.save(Collections.EMPTY_MAP);
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
    public def String getResourceName(IEditorPart editor, Object model) {
        if (editor !== null && model !== null) {
            var filename = editor.getTitle()
            if (filename.contains(".")) {
                filename = filename.substring(0, filename.lastIndexOf('.'))
            }
            // Adding correct file extension if available
            val ext = ModelInformation.getResourceExtension(model)
            if (ext !== null) {
                filename += "." + ext
            }
            return filename
        }
        return ""
    }
    
    public def getCurrentCompilationContext() {
        if (compilerToggleAction.isChecked && !compiledModel.empty) {
            val compiler = CompilerView.getVIEWS().findFirst[editPartSystemManager.activeEditor == editor]
            if (compiler !== null) {
                return compiler.editPartSystemManager.editPartCompilationContextMap.get(editor)
            }
        }
        return null
    }

    // -- Model Update
    // -------------------------------------------------------------------------

    /**
     * Updates the compiler model and compilation context.
     * 
     * @param model
     * @param context
     */
    package def void updateCompilerModel(Object model) {
        if (isActive() && syncCompilerToggleAction.isChecked()) {
            compiledModel.clear
            if (model !== null) compiledModel += model
            // If the user selected an intermediate model before, the model as to be read in again from the editor.
            update(compiledModel.empty ? ChangeEvent.EDITOR : ChangeEvent.COMPILER)
        }
    }
    
    /**
     * Updates the compiler model and compilation context with multiple models at once.
     * 
     * @param model
     * @param context
     */
    package def void updateCompilerModels(List<Object> models) {
        if (isActive() && syncCompilerToggleAction.isChecked()) {
            compiledModel.clear
            compiledModel.addAll(models)
            update(ChangeEvent.COMPILER)
        }
    }    
    
    /**
     * Updates the model caused by changeEvent.
     * 
     * @param change
     *            the type of change
     */
    public def void update(ChangeEvent change) {
        if (isActive()) {
            if (diagramView.viewContext !== null) {
                diagramView.viewContext.setProperty(TracingVisualizationUpdateStrategy.ALWAYS_FALLBACK_TO_SIMPLE_UPDATE_STRATEGY, simpleUpdateToggleAction.isChecked())
            }
            // Read the model if necessary
            if (change == ChangeEvent.EDITOR) {
                sourceModel = ModelReaderUtil.readModelFromEditor(getEditor()) 
                if (sourceModel instanceof EObject) {
                    if (sourceModel.eResource() !== null) {
                        val eResource = sourceModel.eResource()
                        sourceModelHasErrorMarkers = !eResource.getErrors().isEmpty()
                        
                        // Check for model specific errors (e.g. Xtext validator rules) 
                        val diagnostic = Diagnostician.INSTANCE.validate(sourceModel)
                        if (diagnostic.getSeverity() == Diagnostic.ERROR) {
                            sourceModelHasErrorMarkers = true
                        }
    
                        try {
                            val underlyingFile = ResourceUtil.getUnderlyingFile(eResource)
                            if (underlyingFile !== null) {
                                sourceModelHasErrorMarkers = sourceModelHasErrorMarkers ||
                                        underlyingFile.findMarkers(IMarker.PROBLEM, false,
                                                IResource.DEPTH_INFINITE).length > 0
                            }
                        } catch (Exception e) {
                            // do nothing
                        }
                    }
                }
            }

            // Create properties with default values
            val properties = new KlighdSynthesisProperties()
            properties.setProperty(KlighdSynthesisProperties.REQUESTED_UPDATE_STRATEGY,
                    "de.cau.cs.kieler.kitt.klighd.tracing.TracingVisualizationUpdateStrategy")
            // Give model synthesis access to the compilation result
            val cc = currentCompilationContext
            properties.setProperty(KiCoDiagramViewProperties.COMPILATION_CONTEXT, cc)

            // Create model to passed to update
            var Object model = null
            if (sourceModel !== null) {
                if (diagramPlaceholderToggleAction.isChecked()) {
                    model = new MessageModel(MODEL_PLACEHOLDER_PREFIX + getEditor().getTitle(), MODEL_PLACEHOLDER_MESSGAE)
                } else if (sideBySideToggleAction.isChecked()) {
                    // Assumes singleton view
                    val tracing = if (cc !== null && cc.startEnvironment.getProperty(Tracing.ACTIVE_TRACING)) {
                        cc.startEnvironment.getProperty(Tracing.TRACING_DATA)
                    }
                    if (chainToggleAction.isChecked && compilerToggleAction.isChecked && tracing !== null) {
                        model = new ModelChain(tracing, getEditor().getTitle(), null)
                    } else if (compilerToggleAction.isChecked && !compiledModel.empty) {
                        if (compiledModel.size == 1) {
                        model = new ModelChain(sourceModel, compiledModel.head)
                        } else {
                            model = new ModelChain(compiledModel.head, compiledModel.get(1))
                            for (int i : 2..<compiledModel.size) {
                                (model as ModelChain).models += compiledModel.get(i)
                            }
                        }
                    } else {
                        model = new ModelChain(sourceModel, sourceModel)
                    }
                } else if (compilerToggleAction.isChecked && !compiledModel.empty) {
                    model = compiledModel.head
                } else {
                    model = sourceModel
                }
            }

            // Update model
            updateModel(model, properties)
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
    private def void addWarningComposite(IViewer viewer, String allWarnings) {
        val Composite canvas = viewer.getControl() as Composite
        warningMessageContainer = new Composite(canvas, SWT.NONE)

        val Color orange = new Color(canvas.getDisplay(), new RGB(255, 165, 0))
        warningMessageContainer.setBackground(orange)

        val Label close = new Label(warningMessageContainer, SWT.NONE)
        val Image closeImage = CLOSE_ICON.createImage()
        close.setBackground(orange)
        close.setImage(closeImage)
        // close.setBackground(orange)
        close.setToolTipText("Close warnings")
        // close action
        close.addMouseListener(new MouseAdapter() {
            override void mouseUp(MouseEvent event) {
                warningMessageContainer.dispose()
            }
        })

        val Label warningLabel = new Label(warningMessageContainer, SWT.NO_BACKGROUND)
        warningLabel.setBackground(orange)
        warningLabel.setText(allWarnings)

        warningMessageContainer.setLocation(0, 0)
        warningMessageContainer.setLayout(new RowLayout())

        // update composite
        warningMessageContainer.pack()
        canvas.layout(true, true)

        // cleanup on dispose
        warningMessageContainer.addDisposeListener(new DisposeListener() {

            override void widgetDisposed(DisposeEvent e) {
                orange.dispose()
                closeImage.dispose()
            }
        })
    }
}
