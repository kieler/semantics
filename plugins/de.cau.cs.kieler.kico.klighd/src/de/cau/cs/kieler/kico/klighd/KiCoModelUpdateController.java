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

import java.util.WeakHashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
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
import org.eclipse.ui.plugin.AbstractUIPlugin;
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
import de.cau.cs.kieler.kico.klighd.model.CodePlaceHolder;
import de.cau.cs.kieler.kico.klighd.model.ErrorModel;
import de.cau.cs.kieler.kico.klighd.model.MessageModel;
import de.cau.cs.kieler.kico.klighd.model.ModelChain;
import de.cau.cs.kieler.kico.klighd.view.AbstractModelUpdateController;
import de.cau.cs.kieler.kico.klighd.view.DefaultEcoreXtextModelUpdateController;
import de.cau.cs.kieler.kico.klighd.view.ModelView;
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
@SuppressWarnings("restriction")
public class KiCoModelUpdateController extends DefaultEcoreXtextModelUpdateController {

    /**
     * Events that can cause a update of shown model
     * 
     * @author als
     * 
     */
    public enum ChangeEvent {
        SAVED, DISPLAY_MODE, SELECTION, ACTIVE_EDITOR, COMPILE, COMPILATION_FINISHED
    }

    // -- CONSTANTS --
    /** Controller ID */
    private static final String ID = "de.cau.cs.kieler.kico.klighd.KiCoModelUpdateController";

    /** Path to notify Simulation component */
    private static final IPath modelViewPath = new Path(ModelView.ID);

    /**
     * Indicates how long this view should wait before starting REAL asynchronous compilation. This
     * timer makes the common case faster (without intermediate model)
     */
    private static final int waitForAsync = 500;

    // -- Icons --
    /** The icon for toggling side-by-side display mode button. */
    private static final ImageDescriptor ICON_COMPILE = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.kico.klighd", "icons/Compile.png");
    /** The icon for fork view button. */
    private static final ImageDescriptor ICON_SIDE_BY_SIDE = AbstractUIPlugin
            .imageDescriptorFromPlugin("de.cau.cs.kieler.kico.klighd",
                    "icons/SideBySide.png");
    /** The icon for toggling chain display mode button. */
    private static final ImageDescriptor ICON_CHAIN = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.kico.klighd", "icons/Chain.png");
    /** The icon for pin selection button. */
    private static final ImageDescriptor ICON_PIN = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.kico.klighd", "icons/Pin.png");

    /** The icon for closing windows. */
    private static final ImageDescriptor ICON_CLOSE = AbstractUIPlugin.imageDescriptorFromPlugin(
            "org.eclipse.ui", "icons/full/elcl16/remove.gif");

    // -- Toolbar --
    /** The action for toggling side-by-side display mode. */
    private Action actionSideBySideToggle;
    /** Flag if side-by-side display mode is active. */
    private boolean displaySideBySide = false;

    /** The action for toggling compile. */
    private Action actionCompileToggle;
    /** Flag if compile mode is active. */
    private boolean compileModel = true;

    /** The action for toggling compile. */
    private Action actionPinToggle;
    /** String currently saved transformations. */
    private Pair<KielerCompilerSelection, Boolean> selection = null;
    /** Map with pinned transformations */
    private WeakHashMap<IEditorPart, Pair<KielerCompilerSelection, Boolean>> pinnedTransformations =
            new WeakHashMap<IEditorPart, Pair<KielerCompilerSelection, Boolean>>();

    // -- Menu --
    /** The action for toggling tracing. */
    private Action actionTracingToggle;
    /** Flag if tracing is activated. */
    private boolean doTracing = false;

    /** The action for toggling chain display mode. */
    private Action actionTracingChainToggle;
    /** Flag if chain display mode is active. */
    private boolean displayTracingChain = false;

    // -- Model --

    /** Model extracted from editor */
    private EObject sourceModel;

    /** Current compilation running in background */
    private AsynchronousCompilation currentCompilation = null;

    /**
     * Current compilation result associated with current model or null if current model is not
     * compiled
     */
    private CompilationResult currentCompilationResult = null;

    // -- Visual --

    /**
     * Container for displaying waring messages.
     */
    private Composite warningMessageContainer = null;

    // -- Constructor and Initialization
    // -------------------------------------------------------------------------

    /**
     * Default Constructor.
     * 
     * @param modelView
     *            the ModelView this controller is associated with
     */
    public KiCoModelUpdateController(ModelView modelView) {
        super(modelView);
        CompilerSelectionStore.register(this);

        // Compile Button
        actionCompileToggle = new Action("Show compiled model", IAction.AS_CHECK_BOX) {
            @Override
            public void run() {
                compileModel = actionCompileToggle.isChecked();
                update(ChangeEvent.COMPILE);
            }
        };
        actionCompileToggle.setToolTipText("Show compiled model");
        actionCompileToggle.setImageDescriptor(ICON_COMPILE);
        actionCompileToggle.setChecked(compileModel);

        // Pin Button
        actionPinToggle = new Action("Pin selected transformations", IAction.AS_CHECK_BOX) {
            @Override
            public void run() {
                IEditorPart activeEditor = getEditor();
                if (activeEditor != null) {
                    if (isChecked()) {
                        pinnedTransformations.put(activeEditor, selection);
                    } else {
                        pinnedTransformations.remove(activeEditor);
                        // update model due to possible changed of transformation configuration
                        update(ChangeEvent.SELECTION);
                    }
                }
            }
        };
        actionPinToggle.setToolTipText("Pin selected transformations");
        actionPinToggle.setImageDescriptor(ICON_PIN);
        actionPinToggle.setChecked(false);

        // Side-by-Side Button
        actionSideBySideToggle =
                new Action("Activate side-by-side display mode", IAction.AS_CHECK_BOX) {
                    @Override
                    public void run() {
                        displaySideBySide = isChecked();
                        update(ChangeEvent.DISPLAY_MODE);
                    }
                };
        actionSideBySideToggle.setToolTipText("Activate side-by-side display mode");
        actionSideBySideToggle.setImageDescriptor(ICON_SIDE_BY_SIDE);
        actionSideBySideToggle.setChecked(displaySideBySide);

        // Tracing Item
        actionTracingToggle = new Action("Tracing", IAction.AS_CHECK_BOX) {
            @Override
            public void run() {
                doTracing = isChecked();
                update(ChangeEvent.COMPILE);
            }
        };
        actionTracingToggle.setChecked(doTracing);
        actionTracingToggle
                .setToolTipText("Performes tracing during transformations if activated.");

        // Tracing chain item
        actionTracingChainToggle = new Action("", IAction.AS_CHECK_BOX) {
            public void run() {
                displayTracingChain = isChecked();
                update(ChangeEvent.DISPLAY_MODE);
            }
        };
        actionTracingChainToggle.setText("Display Transformation Chain");
        actionTracingChainToggle
                .setToolTipText("Enable tranformation chain view in displaySideBySide display mode");
        // actionTracingChainToggle.setImageDescriptor(ICON_CHAIN);
        actionTracingChainToggle.setChecked(displayTracingChain);
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
    public AbstractModelUpdateController clone(ModelView modelView) {
        KiCoModelUpdateController newController = new KiCoModelUpdateController(modelView);
        // TODO copy attributes
        return newController;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void reset() {
        // TODO reset attributes
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void saveState(IMemento memento) {
        // TODO Auto-generated method stub
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void loadState(IMemento memento) {
        // TODO Auto-generated method stub
    }

    // -- View
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void addContributions(IToolBarManager toolBar, IMenuManager menu) {
        toolBar.add(actionCompileToggle);
        toolBar.add(actionPinToggle);
        toolBar.add(actionSideBySideToggle);
        menu.add(actionTracingToggle);
        menu.add(actionTracingChainToggle);
    }

    // -- Saving Model
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void saveModel(Object model, IFile file, URI uri) throws Exception {
        if (model instanceof ModelChain) {
            model = ((ModelChain) model).getSelectedModel();
        }
        // TODO Handle Compiled intermeduate result
        if (model instanceof EObject) {
            super.saveModel(model, file, uri);
        } else if (model instanceof CodePlaceHolder) {
            // save to text file (create if necessary)
            if (!file.exists()) {
                file.create(new StringInputStream(((CodePlaceHolder) model).getCode()), 0, null);
            } else {
                file.setContents(new StringInputStream(((CodePlaceHolder) model).getCode()), 0,
                        null);
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getResourceName(IEditorPart editor, Object model) {
        if (editor != null && model != null) {
            String filename = editor.getTitle();
            if (filename.contains(".")) {
                filename = filename.substring(0, filename.lastIndexOf('.'));
            }
            // Adding file extension
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
    public void onEditorSaved(IEditorPart editor) {
        update(ChangeEvent.SAVED);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void onEditorChanged(IEditorPart editor) {
        update(ChangeEvent.ACTIVE_EDITOR);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void onDiagramUpdate(Object model, KlighdSynthesisProperties properties, IViewer viewer) {
        // dispose warning message composite if necessary
        if (warningMessageContainer != null) {
            if (!warningMessageContainer.isDisposed()) {
                warningMessageContainer.dispose();
            }
            warningMessageContainer = null;
        }
        // show warnings
        CompilationResult compilationResult =
                properties.getProperty(KiCoProperties.COMPILATION_RESULT);
        if (compilationResult != null && !compilationResult.getPostponedWarnings().isEmpty()) {
            StringBuilder warnings = new StringBuilder();
            for (KielerCompilerException warning : compilationResult.getPostponedWarnings()) {
                warnings.append(warning.getMessage()).append("\n");
            }
            warnings.setLength(warnings.length() - 1);
            addWarningComposite(viewer, warnings.toString());
        }
    }

    // -- Model Update
    // -------------------------------------------------------------------------

    /**
     * Updates the model caused by changeEvent.
     * 
     * @param change
     */
    public void update(ChangeEvent change) {
        update(change, null);
    }

    /**
     * Updates the model caused by changeEvent including return of asynchronous compilation.
     * 
     * @param change
     */
    public synchronized void update(ChangeEvent change, AsynchronousCompilation compilation) {
        IEditorPart editor = getEditor();
        if (editor != null) {
            // change event flags
            boolean is_active_editor_update = change == ChangeEvent.ACTIVE_EDITOR;
            boolean is_save_update = change == ChangeEvent.SAVED;
            boolean is_selection_update = change == ChangeEvent.SELECTION;
            boolean is_display_mode_update = change == ChangeEvent.DISPLAY_MODE;
            boolean is_compile_update =
                    change == ChangeEvent.COMPILE || change == ChangeEvent.COMPILATION_FINISHED;

            // Evaluate if source model should be updated
            boolean do_get_model = false;
            do_get_model |= is_active_editor_update;
            do_get_model |= is_save_update;

            // Get model if necessary
            if (do_get_model) {
                sourceModel = readModel(editor);
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
            }

            // Create model to pass to update
            Object model = sourceModel;

            // Evaluate if current transformation configuration should be asked
            boolean do_get_selection = false;
            do_get_selection |= is_selection_update;
            do_get_selection |= is_active_editor_update;
            do_get_selection |= is_compile_update && compileModel;

            // Indicates of the current transformation configuration differs from previous
            // configuration
            boolean selection_changed = false;

            // get new transformations if necessary
            if (do_get_selection) {
                // if there is a pinned transformation for active editor take pinned one else
                // take selected ones
                Pair<KielerCompilerSelection, Boolean> newSelection = null;
                if (pinnedTransformations.containsKey(editor)) {
                    newSelection = pinnedTransformations.get(editor);
                } else {
                    newSelection = CompilerSelectionStore.getSelection(editor);
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
            do_compile &= compileModel;

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
                            new AsynchronousCompilation(this, (EObject) sourceModel,
                                    editor.getTitle(), selection, doTracing);
                    currentCompilationResult = null;
                    model = currentCompilation.getModel();
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
                        // if (this.getViewer() != null) {
                        // currentCompilation.showProgress(this.getViewer());
                        // }
                        currentCompilation.setUpdateModelView(true);
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
                } else {// This is not the most recent compilation
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

            // public compilation result if exists
            if (currentCompilationResult != null) {
                publishCurrentModelInformation(model, currentCompilationResult);
                properties.setProperty(KiCoProperties.COMPILATION_RESULT, currentCompilationResult);
            }

            // composite model in given display mode
            if (displaySideBySide) {
                if (displayTracingChain && currentCompilationResult != null) {
                    model =
                            new ModelChain(sourceModel, currentCompilationResult,
                                    editor.getTitle(), selection.getFirst());
                } else {
                    model = new ModelChain(sourceModel, model);
                }
            }

            boolean do_update_diagram = false;
            do_update_diagram |= do_get_model;
            do_update_diagram |= do_compile;
            do_update_diagram |= is_display_mode_update;
            // should compile but no transformations are selected
            do_update_diagram |= is_compile_update && selection != null;
            // compile and transformations changed to null
            do_update_diagram |= compileModel && selection == null && selection_changed;

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
            updateModel(null);
        }
    }

    // -- Update Configuration
    // -------------------------------------------------------------------------

    /**
     * Updates checked and enabled state of transformation pin toggle button according to current
     * transformation
     */
    private void updatePinToggleButton() {
        actionPinToggle.setEnabled(selection != null);
        actionPinToggle.setChecked(pinnedTransformations.containsKey(getEditor()));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ILayoutConfig getLayoutConfig() {
        ViewContext viewContext = getModelView().getViewContext();
        if (viewContext.getInputModel() instanceof ModelChain) {
            return new CompoundLayoutConfig(Lists.newArrayList(super.getLayoutConfig(),
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
        if (getModelView().isPrimaryView()) {
            boolean is_placeholder =
                    model instanceof ErrorModel || model instanceof MessageModel
                            || model instanceof CodePlaceHolder;
            boolean is_chain = model instanceof ModelChain;
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
            } else { // this case when model is not compiled
                KIEMModelSelectionCombination.refreshKIEMActiveAndOpenedModels(getEditor());
                KIEMExecutionAutoloadCombination.autoloadExecutionSchedule();
            }
        }
    }
    
    // -- Visual error feedback
    // -------------------------------------------------------------------------

    /**
     * Shows warning text in klighd canvas
     * 
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

            public void widgetDisposed(DisposeEvent e) {
                orange.dispose();
                closeImage.dispose();
            }
        });
    }

}
