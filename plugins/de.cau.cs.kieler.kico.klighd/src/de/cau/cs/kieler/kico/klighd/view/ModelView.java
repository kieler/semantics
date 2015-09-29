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
package de.cau.cs.kieler.kico.klighd.view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IElementFactory;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.progress.UIJob;
import org.eclipse.ui.statushandlers.StatusManager;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.util.Pair;
import de.cau.cs.kieler.kico.klighd.KiCoKLighDPlugin;
import de.cau.cs.kieler.kico.klighd.view.controller.AbstractModelUpdateController;
import de.cau.cs.kieler.kico.klighd.view.controller.ModelUpdateControllerFactory;
import de.cau.cs.kieler.kico.klighd.view.menu.SynthesisSelectionMenu;
import de.cau.cs.kieler.kico.klighd.view.model.ErrorModel;
import de.cau.cs.kieler.kico.klighd.view.model.ISaveableModel;
import de.cau.cs.kieler.kico.klighd.view.model.MessageModel;
import de.cau.cs.kieler.kiml.config.ILayoutConfig;
import de.cau.cs.kieler.kiml.ui.KimlUiPlugin;
import de.cau.cs.kieler.klighd.KlighdDataManager;
import de.cau.cs.kieler.klighd.KlighdPlugin;
import de.cau.cs.kieler.klighd.LightDiagramServices;
import de.cau.cs.kieler.klighd.SynthesisOption;
import de.cau.cs.kieler.klighd.ViewContext;
import de.cau.cs.kieler.klighd.internal.ISynthesis;
import de.cau.cs.kieler.klighd.ui.parts.DiagramViewPart;
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties;

/**
 * 
 * This {@link DiagramViewPart} displays a diagram of a related editor and provides several
 * functionality.
 * 
 * @author als
 * @kieler.design 2015-06-22 proposed
 * @kieler.rating 2015-06-22 proposed yellow
 *
 */
@SuppressWarnings("restriction")
public final class ModelView extends DiagramViewPart {

    // -- CONSTANTS --

    /** Viewer ID. **/
    public static final String ID = "de.cau.cs.kieler.kico.klighd.modelview";

    /** Default view title. **/
    private static final String VIEW_TITLE = "KIELER Model View";

    // -- GUI (Model) texts --

    private static final String NO_MODEL_PRIMARY = "No model in active editor";
    private static final String NO_MODEL_SECONDARY = "No model in related editor";
    private static final String MODEL_PLACEHOLDER_PREFIX = "Model Placeholder: ";
    private static final String MODEL_PLACEHOLDER_MESSGAE = "Model visualization is deactivated";
    private static final String UPDATE_DIAGRAM_EXCEPTION = "Displaying diagram failed!";

    // -- Icons --

    /** The icon for forking a view. */
    private static final ImageDescriptor ICON_FORK = AbstractUIPlugin
            .imageDescriptorFromPlugin("de.cau.cs.kieler.kico.klighd", "icons/fork.png");

    /** The icon for saving current model. */
    private static final ImageDescriptor ICON_SAVE = AbstractUIPlugin
            .imageDescriptorFromPlugin("org.eclipse.ui", "icons/full/etool16/save_edit.gif");

    // -- Instance list --

    /** List of all open ModelViews. */
    private static List<ModelView> modelViews = new ArrayList<ModelView>(6);

    // -- ATTRIBUTES --

    /** Secondary ID of this view. Indicates a non primary view */
    private String secondaryID;

    /** Active related editor. */
    private IEditorPart activeEditor;

    /** Stores saved selection of synthesis options according to their model type. */
    private final HashMap<ISynthesis, HashMap<SynthesisOption, Object>> recentSynthesisOptions =
            Maps.newHashMap();

    /** Current model display as diagram. */
    private Object currentModel = null;

    /** The currently active controller performing model updates. */
    private AbstractModelUpdateController activeController = null;

    /** The until now instantiated controllers. */
    private final List<AbstractModelUpdateController> controllers =
            new ArrayList<AbstractModelUpdateController>();

    // -- Toolbar --
    private IToolBarManager toolBarManager;

    /** The action for reloading displayed model. */
    private final Action actionRefresh;
    /** The action for performing. */
    private final Action actionLayout;
    /** The action for saving currently displayed model. */
    private final Action actionSave;
    /** The last directory used for saving a model. */
    private IPath lastSaveDirectory = null;
    /** The action for forking view. */
    private final Action actionFork;

    // -- Menu --
    private IMenuManager menuManager;

    /** The action for resetting layout options. */
    private final Action actionResetOptions;

    /** The action for toggling editor synchronization. */
    private final Action actionSyncEditor;
    /** Indicates if this view updates always to the state current state of the editor. */
    private boolean synchronizeEditor = true;

    /** The action for toggling display of diagram placeholder. */
    private final Action actionDiagramPlaceholder;
    /** Indicates if this view shall display a place holder. */
    private boolean showDiagramPlaceholder = false;

    /** The menu and controller handling the selection of available synthesis. */
    private final SynthesisSelectionMenu synthesisSelection = new SynthesisSelectionMenu(this);

    // -- Static ModelView Access
    // -------------------------------------------------------------------------

    /**
     * Returns the list of {@link ModelView} currently displaying the content of the given editor.
     * 
     * @param editor
     *            the editor to filter for
     * @return List of {@link ModelView}s associated with editor
     */
    public static List<ModelView> getModelViews(final IEditorPart editor) {
        if (editor != null) {
            return Lists.newArrayList(Iterables.filter(modelViews, new Predicate<ModelView>() {
                public boolean apply(ModelView view) {
                    return editor.equals(view.getEditor());
                }
            }));
        }
        return Collections.emptyList();
    }

    /**
     * Returns the list of all {@link ModelView}s.
     * 
     * @return List of all {@link ModelView}s
     */
    public static List<ModelView> getAllModelViews() {
        return Lists.newArrayList(modelViews);
    }

    // -- Constructor and Initialization
    // -------------------------------------------------------------------------

    /**
     * Create an instance.
     */
    public ModelView() {
        super();

        // Add this view to the active modelviews
        modelViews.add(this);

        // Refresh Button
        actionRefresh = new Action("Refresh diagram",
                KlighdPlugin.getImageDescriptor("icons/full/elcl16/refresh.gif")) {

            @Override
            public void run() {
                notifyEditorSaved();
            }
        };
        actionRefresh.setId("actionRefresh");

        // Automatic Layout Button
        actionLayout = new Action("Arrange", IAction.AS_PUSH_BUTTON) {
            @Override
            public void run() {
                LightDiagramServices.layoutDiagram(ModelView.this);
            }
        };
        actionLayout.setId("actionLayout");
        actionLayout.setImageDescriptor(
                KimlUiPlugin.getImageDescriptor("icons/menu16/kieler-arrange.gif"));

        // Fork Button
        actionFork = new Action("Fork this view", IAction.AS_PUSH_BUTTON) {
            @Override
            public void run() {
                forkView();
            }
        };
        actionFork.setId("actionFork");
        actionFork.setToolTipText("Fork this view");
        actionFork.setImageDescriptor(ICON_FORK);

        // Save Button
        actionSave = new Action("Save displayed main model", IAction.AS_PUSH_BUTTON) {
            @Override
            public void run() {
                saveCurrentModel();
            }
        };
        actionSave.setId("actionSave");
        actionSave.setToolTipText("Save displayed main model");
        actionSave.setImageDescriptor(ICON_SAVE);

        // -- MENU --

        // Reset Layout Options Item
        actionResetOptions = new Action("Reset Configuration") {
            @Override
            public void run() {
                resetLayoutConfig();
                reset();
            }
        };
        actionResetOptions.setId("actionResetOptions");
        actionResetOptions.setId(ACTION_ID_RESET_LAYOUT_OPTIONS);

        // Sync Menu Item
        actionSyncEditor = new Action("Synchronize with Editor", IAction.AS_CHECK_BOX) {
            @Override
            public void run() {
                synchronizeEditor = isChecked();
                updateViewTitle();
                if (synchronizeEditor) {
                    if (activeEditor == null) {
                        notifyEditorChanged();
                    } else {
                        notifyEditorSaved();
                    }
                }
            }
        };
        actionSyncEditor.setId("actionSyncEditor");
        actionSyncEditor.setToolTipText(
                "If Synchronize is disabled, this view will no longer update its status when editor changes.");
        actionSyncEditor.setChecked(synchronizeEditor);

        // Diagram PlaceHolder Menu Item
        actionDiagramPlaceholder = new Action("Model visualization", IAction.AS_CHECK_BOX) {
            @Override
            public void run() {
                showDiagramPlaceholder = isChecked();
                updateDiagram();
            }
        };
        actionDiagramPlaceholder.setId("actionDiagramPlaceholder");
        actionDiagramPlaceholder.setToolTipText(
                "If visualization is deactiveted, all diagrams will be replaced by a placeholder diagram.");
        actionDiagramPlaceholder.setChecked(showDiagramPlaceholder);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void init(IViewSite site) throws PartInitException {
        super.init(site);
        initID(site);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void init(IViewSite site, IMemento memento) throws PartInitException {
        super.init(site, memento);
        initID(site);
        if (memento != null) {
            loadState(memento);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void createPartControl(final Composite parent) {
        super.createPartControl(parent);

        IActionBars bars = getViewSite().getActionBars();
        toolBarManager = bars.getToolBarManager();
        menuManager = bars.getMenuManager();

        updateViewTitle();
        // Some events may occur before this and need to be triggered again (e.g. setEditor)
        if (activeController == null && activeEditor != null) {
            updateController();
            notifyEditorChanged();
        } else {
            addContributions();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void addButtons() {
        // Suppressing DiagramViewPart default buttons
    }

    // -- View
    // -------------------------------------------------------------------------

    /**
     * Initializes the ID and determines if this view is the primary view.
     * 
     * @param site
     *            the view site
     */
    private void initID(IViewSite site) {
        // If secondary id is set in site save secondary id in variable
        if (site.getSecondaryId() != null) {
            secondaryID = site.getSecondaryId();
        }
    }

    /**
     * Adds the menu and toolbar contributions.
     */
    private void addContributions() {
        toolBarManager.add(actionRefresh);
        toolBarManager.add(actionLayout);
        toolBarManager.add(actionSave);
        toolBarManager.add(actionFork);

        menuManager.add(actionResetOptions);
        menuManager.add(actionSyncEditor);
        menuManager.add(actionDiagramPlaceholder);
        menuManager.add(synthesisSelection);
        menuManager.add(new Separator());
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
     * The primary view should listen on the active editor while secondary views stick to their
     * editor.
     * 
     * @return true if this view is primary
     */
    public boolean isPrimaryView() {
        return secondaryID == null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void dispose() {
        super.dispose();
        modelViews.remove(this);
        for (AbstractModelUpdateController controller : controllers) {
            controller.onDispose();
        }
    }

    /**
     * Sets view part title according to current editor and configuration.
     */
    private void updateViewTitle() {
        ArrayList<String> modifiers = new ArrayList<String>(5);

        if (!isPrimaryView()) {
            modifiers.add("secondary");
        }
        if (!synchronizeEditor) {
            modifiers.add("async");
        }

        StringBuffer title = new StringBuffer(VIEW_TITLE);

        if (!modifiers.isEmpty()) {
            title.append('<');
            for (int i = 0; i < modifiers.size(); i++) {
                title.append(modifiers.get(i));
                if (i < modifiers.size() - 1) {
                    title.append(',');
                }
            }
            title.append('>');
        }

        if (activeEditor != null) {
            title.append('[');
            title.append(activeEditor.getTitle());
            title.append(']');
        }

        // Apply
        setPartName(title.toString());
    }

    /**
     * Forks this view into second view with the same settings.
     */
    private void forkView() {
        try {
            // Create new View
            IViewPart newViewPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                    .getActivePage().showView(ID, Long.toString(System.currentTimeMillis()),
                            IWorkbenchPage.VIEW_ACTIVATE);
            // Configure child view
            if (newViewPart instanceof ModelView) {
                ModelView newModelView = (ModelView) newViewPart;
                // Menu
                newModelView.synchronizeEditor = synchronizeEditor;
                newModelView.actionSyncEditor.setChecked(synchronizeEditor);
                newModelView.showDiagramPlaceholder = showDiagramPlaceholder;
                newModelView.actionDiagramPlaceholder.setChecked(showDiagramPlaceholder);
                // State
                newModelView.lastSaveDirectory = lastSaveDirectory;
                newModelView.synthesisSelection.copy(synthesisSelection);
                for (Entry<ISynthesis, HashMap<SynthesisOption, Object>> entry : recentSynthesisOptions
                        .entrySet()) {
                    newModelView.recentSynthesisOptions.put(entry.getKey(),
                            (HashMap<SynthesisOption, Object>) entry.getValue().clone());
                }
                for (AbstractModelUpdateController modelUpdateController : controllers) {
                    newModelView.controllers.add(modelUpdateController.clone(newModelView));
                }
                newModelView.setEditor(activeEditor);
            }
        } catch (PartInitException e) {
            StatusManager.getManager().handle(new Status(IStatus.ERROR, KiCoKLighDPlugin.PLUGIN_ID,
                    e.getMessage(), e.getCause()), StatusManager.SHOW);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void saveState(IMemento memento) {
        try {
            super.saveState(memento);
            if (memento != null) {
                if (lastSaveDirectory != null) {
                    memento.putString("lastSaveDirectory", lastSaveDirectory.toPortableString());
                }

                // Saving synchronizeEditor makes no sense because view would start empty if not
                // synchronized

                memento.putBoolean("showDiagramPlaceholder", showDiagramPlaceholder);

                if (activeEditor != null && !isPrimaryView()) {
                    IPersistableElement editorPersistable =
                            activeEditor.getEditorInput().getPersistable();
                    if (editorPersistable != null) {
                        memento.putString("activeEditorFactory", editorPersistable.getFactoryId());
                        editorPersistable.saveState(memento.createChild("activeEditorInput"));
                    }
                }

                storeCurrentSynthesisOptions();
                IMemento recentSynthesisOptionsMemento =
                        memento.createChild("recentSynthesisOptions");
                for (Entry<ISynthesis, HashMap<SynthesisOption, Object>> entry : recentSynthesisOptions
                        .entrySet()) {
                    IMemento synthesisMemento = recentSynthesisOptionsMemento.createChild(
                            KlighdDataManager.getInstance().getSynthesisID(entry.getKey()));
                    for (Entry<SynthesisOption, Object> optionEntry : entry.getValue().entrySet()) {
                        SynthesisOption option = optionEntry.getKey();
                        Object value = optionEntry.getValue();
                        String id = Integer.toString(option.getName().hashCode());
                        try {
                            if (value instanceof Boolean) {
                                synthesisMemento.putBoolean("b" + id, (Boolean) value);
                            } else if (value instanceof Integer) {
                                synthesisMemento.putInteger("i" + id, (Integer) value);
                            } else if (value instanceof Float) {
                                synthesisMemento.putFloat("f" + id, (Float) value);
                            } else if (value instanceof String) {
                                synthesisMemento.putString("s" + id, (String) value);
                            }
                        } catch (Exception e) {
                            // Do nothing, just fail
                        }
                    }
                }

                synthesisSelection.saveState(memento.createChild("synthesisSelection"));

                IMemento controllersMemento = memento.createChild("controllers");
                for (AbstractModelUpdateController controller : controllers) {
                    controller.saveState(controllersMemento.createChild(controller.getID()));
                }
            }
        } catch (Exception e) {
            StatusManager.getManager().handle(new Status(IStatus.WARNING,
                    KiCoKLighDPlugin.PLUGIN_ID, e.getMessage(), e.getCause()), StatusManager.LOG);
        }
    }

    /**
     * Loads saved configuration form a memento.
     * 
     * @param memento
     *            saved configuration
     */
    private void loadState(IMemento memento) {
        try {
            String lastSaveDirectoryValue = memento.getString("lastSaveDirectory");
            if (lastSaveDirectoryValue != null) {
                lastSaveDirectory = Path.fromPortableString(lastSaveDirectoryValue);
            }

            Boolean showDiagramPlaceholderValue = memento.getBoolean("showDiagramPlaceholder");
            if (showDiagramPlaceholderValue != null) {
                showDiagramPlaceholder = showDiagramPlaceholderValue;
                if (actionDiagramPlaceholder != null) {
                    actionDiagramPlaceholder.setChecked(showDiagramPlaceholder);
                }
            }

            String editorInputFactory = memento.getString("activeEditorFactory");
            if (editorInputFactory != null) {
                IElementFactory elementFactory =
                        PlatformUI.getWorkbench().getElementFactory(editorInputFactory);
                IMemento editorInputMemento = memento.getChild("activeEditorInput");
                if (elementFactory != null && editorInputMemento != null) {
                    IAdaptable editorInputElelemt =
                            elementFactory.createElement(editorInputMemento);
                    if (editorInputElelemt instanceof IEditorInput) {
                        IEditorInput editorInput = (IEditorInput) editorInputElelemt;
                        for (IWorkbenchWindow window : PlatformUI.getWorkbench()
                                .getWorkbenchWindows()) {
                            for (IWorkbenchPage page : window.getPages()) {
                                IEditorPart foundEditor = page.findEditor(editorInput);
                                if (foundEditor != null) {
                                    setEditor(foundEditor);
                                }
                            }
                        }
                    }
                }
            }

            IMemento synthesisOptionsMemento = memento.getChild("recentSynthesisOptions");
            if (synthesisOptionsMemento != null) {
                for (IMemento synthesisOptionMemento : synthesisOptionsMemento.getChildren()) {
                    ISynthesis synthesis = KlighdDataManager.getInstance()
                            .getDiagramSynthesisById(synthesisOptionMemento.getType());
                    if (synthesis != null) {
                        HashMap<Integer, SynthesisOption> optionMap =
                                new HashMap<Integer, SynthesisOption>(
                                        synthesis.getDisplayedSynthesisOptions().size());
                        for (SynthesisOption synthesisOption : synthesis
                                .getDisplayedSynthesisOptions()) {
                            optionMap.put(synthesisOption.getName().hashCode(), synthesisOption);
                        }
                        HashMap<SynthesisOption, Object> values =
                                new HashMap<SynthesisOption, Object>();
                        for (String key : synthesisOptionMemento.getAttributeKeys()) {
                            SynthesisOption option = optionMap.get(key.substring(1).hashCode());
                            if (option != null) {
                                Object value = null;
                                if (key.startsWith("b")) {
                                    value = synthesisOptionMemento.getBoolean(key);
                                } else if (key.startsWith("i")) {
                                    value = synthesisOptionMemento.getInteger(key);
                                } else if (key.startsWith("f")) {
                                    value = synthesisOptionMemento.getFloat(key);
                                } else if (key.startsWith("s")) {
                                    value = synthesisOptionMemento.getString(key);
                                }
                                if (value != null) {
                                    values.put(option, value);
                                }
                            }
                        }
                        recentSynthesisOptions.put(synthesis, values);
                    }
                }
            }

            IMemento synthesisSelectionMemento = memento.getChild("synthesisSelection");
            if (synthesisSelectionMemento != null) {
                synthesisSelection.loadState(synthesisSelectionMemento);
            }

            IMemento controllersMemento = memento.getChild("controllers");
            if (controllersMemento != null) {
                for (IMemento controllerMemento : controllersMemento.getChildren()) {
                    AbstractModelUpdateController controller = ModelUpdateControllerFactory
                            .getNewInstance(controllerMemento.getType(), this);
                    if (controller != null) {
                        controller.loadState(controllerMemento);
                        controllers.add(controller);
                    }
                }
            }
        } catch (Exception e) {
            StatusManager.getManager().handle(new Status(IStatus.WARNING,
                    KiCoKLighDPlugin.PLUGIN_ID, e.getMessage(), e.getCause()), StatusManager.LOG);
        }
    }

    /**
     * Resets all configurations to default.
     */
    private void reset() {
        synchronizeEditor = true;
        actionSyncEditor.setChecked(synchronizeEditor);
        showDiagramPlaceholder = false;
        actionDiagramPlaceholder.setChecked(showDiagramPlaceholder);
        synthesisSelection.clear();
        recentSynthesisOptions.clear();
        lastSaveDirectory = null;
        for (AbstractModelUpdateController controller : controllers) {
            controller.reset();
        }
        updateViewTitle();
    }

    /**
     * @return the synthesisSelectionMenu
     */
    public SynthesisSelectionMenu getSynthesisSelectionMenu() {
        return synthesisSelection;
    }

    // -- Editor
    // -------------------------------------------------------------------------

    /**
     * Set associates this view with the given editor and notifies update controller.
     * 
     * @param editor
     *            editor or null to unset
     */
    private void setEditor(IEditorPart editor) {
        if (editor != null) {
            if (activeEditor != editor) {
                // set as active editor
                activeEditor = editor;
                updateViewTitle();
                updateController();
                notifyEditorChanged();
            }
        } else {
            activeEditor = null;
            updateViewTitle();
            notifyEditorChanged();
        }
    }

    /**
     * Returns associated editor.
     * 
     * @return the editor
     */
    public IEditorPart getEditor() {
        return activeEditor;
    }

    // -- Controller
    // -------------------------------------------------------------------------

    /**
     * Activates the correct controller for according to the current editor.
     */
    private void updateController() {
        if (activeEditor != null && toolBarManager != null && menuManager != null) {
            String responsibleControllerID =
                    ModelUpdateControllerFactory.getHandlingControllerID(activeEditor);
            if (responsibleControllerID != null) {
                if (activeController == null
                        || !responsibleControllerID.equals(activeController.getID())) {
                    if (activeController != null) {
                        activeController.setActive(false);
                    }

                    // search for responsible controller in list
                    AbstractModelUpdateController alreadyInstaciatedController = null;
                    for (AbstractModelUpdateController controller : controllers) {
                        if (controller.getID().equals(responsibleControllerID)) {
                            alreadyInstaciatedController = controller;
                            break;
                        }
                    }
                    // create controller
                    if (alreadyInstaciatedController != null) {
                        activeController = alreadyInstaciatedController;
                    } else {
                        activeController = ModelUpdateControllerFactory
                                .getNewInstance(responsibleControllerID, this);
                        controllers.add(activeController);
                    }

                    // update contributions
                    toolBarManager.removeAll();
                    menuManager.removeAll();
                    addContributions();
                    activeController.addContributions(toolBarManager, menuManager);
                    toolBarManager.update(false);
                    menuManager.updateAll(false);
                    // activate
                    activeController.setActive(true);
                }
            }
        }
    }

    /**
     * Notifies the controller about the save event in the editor.
     */
    void notifyEditorSaved() {
        if (activeController != null && synchronizeEditor) {
            activeController.onEditorSaved(activeEditor);
        }
    }

    /**
     * Notifies the controller about changed editor.
     */
    void notifyEditorChanged() {
        if (activeController != null && synchronizeEditor) {
            activeController.onEditorChanged(activeEditor);
        }
    }

    // -- Model
    // -------------------------------------------------------------------------

    /**
     * Sets the current model and updates relates configuration.
     * <p>
     * This should normally followed by a {@link updateDiagram} call}
     * 
     * @param model
     *            new model to set
     */
    void setModel(Object model) {
        currentModel = model;
        synthesisSelection.update(model);
    }

    /**
     * Stores the current synthesis options configured in the {@link ViewContext}.
     */
    private synchronized void storeCurrentSynthesisOptions() {
        if (this.getViewer() != null && this.getViewer().getViewContext() != null) {
            ViewContext viewContext = this.getViewer().getViewContext();
            ISynthesis usedSynthesis = viewContext.getDiagramSynthesis();
            if (usedSynthesis != null) {
                List<SynthesisOption> options = viewContext.getDisplayedSynthesisOptions();
                if (!options.isEmpty()) {
                    HashMap<SynthesisOption, Object> optionsMap;
                    if (recentSynthesisOptions.containsKey(usedSynthesis)) {
                        optionsMap = recentSynthesisOptions.get(usedSynthesis);
                    } else {
                        optionsMap = Maps.newHashMap();
                        recentSynthesisOptions.put(usedSynthesis, optionsMap);
                    }
                    for (SynthesisOption option : options) {
                        if (usedSynthesis.getDisplayedSynthesisOptions().contains(option)) {
                            optionsMap.put(option, viewContext.getOptionValue(option));
                        }
                    }
                }
            }
        }
    }

    // -- Save model
    // -------------------------------------------------------------------------

    /**
     * Saves the current model into a file with saveAs dialog.
     */
    private void saveCurrentModel() {
        if (currentModel != null && activeController != null) {
            // Get workspace
            IWorkspace workspace = ResourcesPlugin.getWorkspace();
            IWorkspaceRoot root = workspace.getRoot();

            // get filename with correct extension
            String filename = activeController.getResourceName(activeEditor, currentModel);

            SaveAsDialog saveAsDialog = new SaveAsDialog(getSite().getShell());

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
                                KiCoKLighDPlugin.PLUGIN_ID, e.getMessage(), e), StatusManager.LOG);
                    }
                }

                // perform saving
                try {
                    // if model is a saveable model of the ModelView handle directly otherwise
                    // redirect save operation to controller
                    if (currentModel instanceof ISaveableModel) {
                        ((ISaveableModel) currentModel).save(file, uri);
                    } else {
                        activeController.saveModel(currentModel, file, uri);
                    }
                } catch (Exception e) {
                    StatusManager.getManager().handle(new Status(IStatus.ERROR,
                            KiCoKLighDPlugin.PLUGIN_ID, e.getMessage(), e), StatusManager.SHOW);
                }
            }
        }
    }

    // -- Diagram Update
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public ILayoutConfig getLayoutConfig() {
        if (activeController != null) {
            ILayoutConfig layoutConfig = activeController.getLayoutConfig();
            if (layoutConfig != null) {
                return layoutConfig;
            }
        }
        return super.getLayoutConfig();
    }

    /**
     * Updates the diagram with the same properties as before.
     */
    public void updateModel() {
        if (activeController != null) {
            updateDiagram(activeController.getUpdateModel(),
                    activeController.getUpdateProperties());
        }
    }

    /**
     * Updates the diagram with the same properties as before.
     */
    public void updateDiagram() {
        KlighdSynthesisProperties properties = new KlighdSynthesisProperties();
        if (this.getViewer() == null || this.getViewer().getViewContext() == null) {
            properties.copyProperties(this.getViewContext());
        }
        updateDiagram(currentModel, properties);
    }

    /**
     * Updates displayed diagram in a dedicated job.
     * 
     * @param model
     *            the new model
     * @param properties
     *            the properties
     */
    private void updateDiagram(Object model, final KlighdSynthesisProperties properties) {
        String editorTitle = null;
        if (activeEditor != null) {
            editorTitle = activeEditor.getTitle();
        }
        // Adjust model
        if (model == null) {
            if (isPrimaryView()) {
                model = new MessageModel(NO_MODEL_PRIMARY);
            } else {
                model = new MessageModel(NO_MODEL_SECONDARY);
            }
        } else if (showDiagramPlaceholder) {
            model = new MessageModel(MODEL_PLACEHOLDER_PREFIX + editorTitle,
                    MODEL_PLACEHOLDER_MESSGAE);
        }
        final Object displayModel = model;

        // Start update job
        String jobName = "Updating ModelView";
        if (editorTitle != null) {
            jobName += " [" + editorTitle + "]";
        }
        new UIJob(jobName) {

            @Override
            public IStatus runInUIThread(IProgressMonitor monitor) {
                doUpdateDiagram(displayModel, properties, activeController, activeEditor, false);
                return Status.OK_STATUS;
            }
        }.schedule();
    }

    /**
     * Performs the actual update on the diagram.
     * <p>
     * This method is intended to run in a separate UIJob.
     * 
     * @param model
     *            model to display
     * @param properties
     *            properties for configuration
     * @param controller
     *            the controller related to this update
     * @param editor
     *            the editor related to the model
     * @param isErrorModel
     *            true indicates an re-invocation of update to show an error model concerning an
     *            error occurred in the actual update.
     */
    private void doUpdateDiagram(Object model, KlighdSynthesisProperties properties,
            AbstractModelUpdateController controller, IEditorPart editor, boolean isErrorModel) {
        try {
            // Indicated if the model type changed according to the current model
            boolean modelTypeChanged = false;
            ViewContext vc = null;
            if (this.getViewer() == null || this.getViewer().getViewContext() == null) {
                // if viewer or context does not exist always init view
                modelTypeChanged = true;
            } else {
                vc = this.getViewer().getViewContext();
                if (vc.getInputModel() == null || vc.getInputModel() != model.getClass()) {
                    modelTypeChanged = true;
                }
            }

            // Get correct synthesis
            Pair<ISynthesis, Object> synthesisModelPair =
                    synthesisSelection.getSynthesis(model, editor, properties);
            ISynthesis synthesis = synthesisModelPair.getFirst();
            if (synthesis == null) {
                throw new NullPointerException("No synthesis available");
            }
            // In case model was specially prepared take the return instance
            model = synthesisModelPair.getSecond();
            // Maybe adjust type change flag
            if (vc != null && vc.getInputModel() != null
                    && vc.getInputModel() == model.getClass()) {
                modelTypeChanged = false;
            }

            // Set properties
            properties.setProperty(KlighdSynthesisProperties.REQUESTED_DIAGRAM_SYNTHESIS,
                    KlighdDataManager.getInstance().getSynthesisID(synthesis));
            properties.setProperty(ModelViewProperties.EDITOR_PART, editor);

            // Update diagram

            // Success flag indicating a successful synthesis and diagram update
            boolean success = false;

            // If the type changed the view must be reinitialized to provide a correct ViewContext
            // otherwise the ViewContext can be simply updated
            if (modelTypeChanged) {
                // save previous synthesis options to restore later
                storeCurrentSynthesisOptions();

                // get saved options to restore
                if (synthesis != null && recentSynthesisOptions.containsKey(synthesis)) {
                    properties
                            .configureSynthesisOptionValues(recentSynthesisOptions.get(synthesis));
                } else {
                    // Configure with empty map to reset possible configuration
                    properties
                            .configureSynthesisOptionValues(new HashMap<SynthesisOption, Object>());
                }

                // the (re)initialization case
                initialize(model, null, properties);
                success = true;
                // reset layout to resolve KISEMA-905
                resetLayoutConfig(false);
            } else {
                // update case (keeps options and sidebar)
                success = LightDiagramServices.updateDiagram(this.getViewer().getViewContext(),
                        model);
            }

            // check if update was successful
            KNode currentDiagram = this.getViewer().getViewContext().getViewModel();
            if (!success || currentDiagram == null || currentDiagram.getChildren().isEmpty()) {
                // If update was not successfulk try default synthesis of fail if already in
                // fallback mode.
                if (properties.getProperty(ModelViewProperties.USE_FALLBACK_SYSTHESIS)) {
                    throw new NullPointerException(
                            "Diagram is null or empty. Inernal KLighD error.");
                } else {
                    properties.setProperty(ModelViewProperties.USE_FALLBACK_SYSTHESIS, true);
                    updateDiagram(model, properties);
                    return;
                }
            }

            // enable synchronous selection between diagram and editor
            if (editor != null && !isErrorModel) {
                this.getViewer().getViewContext().setSourceWorkbenchPart(editor);
            }

            // Notify the controller about the successful update
            if (controller != null) {
                controller.onDiagramUpdate(model, properties, this.getViewer());
            }
        } catch (Exception e) {
            if (!isErrorModel) {
                doUpdateDiagram(new ErrorModel(UPDATE_DIAGRAM_EXCEPTION, e), properties, controller,
                        editor, true);
            } else {
                StatusManager.getManager().handle(new Status(IStatus.WARNING,
                        KiCoKLighDPlugin.PLUGIN_ID, e.getLocalizedMessage(), e),
                        StatusManager.SHOW);
            }

        }
    }
}
