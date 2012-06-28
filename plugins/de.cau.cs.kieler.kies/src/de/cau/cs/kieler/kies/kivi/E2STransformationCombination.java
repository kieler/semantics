/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kies.kivi;

import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.xtext.ui.editor.XtextEditor;

import com.google.common.collect.Maps;

import de.cau.cs.kieler.core.kivi.AbstractCombination;
import de.cau.cs.kieler.core.kivi.menu.ButtonTrigger.ButtonState;
import de.cau.cs.kieler.core.kivi.menu.KiviMenuContributionService;
import de.cau.cs.kieler.core.kivi.menu.KiviMenuContributionService.LocationScheme;
import de.cau.cs.kieler.core.kivi.menu.MenuItemEnableStateEffect;
import de.cau.cs.kieler.core.kivi.triggers.EffectTrigger.EffectTriggerState;
import de.cau.cs.kieler.core.model.GraphicalFrameworkService;
import de.cau.cs.kieler.core.model.IGraphicalFrameworkBridge;
import de.cau.cs.kieler.core.model.effects.TransformationEffect;
import de.cau.cs.kieler.core.model.gmf.effects.RefreshGMFEditPoliciesEffect;
import de.cau.cs.kieler.core.model.gmf.triggers.ModelChangeTrigger.ActiveEditorState;
import de.cau.cs.kieler.core.model.m2m.ITransformationContext;
import de.cau.cs.kieler.core.model.m2m.TransformationDescriptor;
import de.cau.cs.kieler.core.ui.util.MonitoredOperation;
import de.cau.cs.kieler.kies.AbstractTransformationDataComponent;
import de.cau.cs.kieler.kies.Activator;
import de.cau.cs.kieler.kies.EsterelToSyncChartDataComponent;
import de.cau.cs.kieler.kies.SyncChartsOptimizationDataComponent;
import de.cau.cs.kieler.kies.util.TransformationUtil;
import de.cau.cs.kieler.kiml.kivi.LayoutEffect;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditor;

/**
 * A KiVi Combination controlling the Esterel To SyncCharts Transformation. Several buttons are
 * contributed to eclipse's gui. These buttons are used in order to control the transformation. The
 * transformation is executed by using a {@link TransformationEffect}.
 * 
 * @author uru
 * 
 */
public class E2STransformationCombination extends AbstractCombination {

    // contributed button ids
    private static final String BUTTON_STEP = "de.cau.cs.kieler.kies.step";
    private static final String BUTTON_STEP_BACK = "de.cau.cs.kieler.kies.stepBack";
    private static final String BUTTON_EXPAND = "de.cau.cs.kieler.kies.expand";
    private static final String BUTTON_EXPAND_OPTIMIZE = "de.cau.cs.kieler.kies.expandAndOptimize";

    // editor ids
    private static final String SYNCCHARTS_EDITOR_ID = "de.cau.cs.kieler.synccharts.diagram.part."
            + "SyncchartsDiagramEditorID";
    private static final String ESTEREL_EDITOR_ID = "de.cau.cs.kieler.esterel.Esterel";

    // map holding the information whether a button should be active or not.
    private final Map<String, Boolean> buttonEnabling = Maps.newHashMap();

    // the data components used for transformations
    private EsterelToSyncChartDataComponent transformingDataComponent;
    private SyncChartsOptimizationDataComponent optimizingDataComponent;

    // currently used data component
    private AbstractTransformationDataComponent currentDataComponent;

    // currently active editor and its command stack
    private IWorkbenchPart currentlyActiveEditor;
    private CommandStack currentCommandStack;

    // the type of the last performed step
    private String lastStepType = BUTTON_STEP;

    private boolean initInProgess = false;

    /**
     * Default Constructor, setting up all needed buttons.
     */
    public E2STransformationCombination() {
        buttonEnabling.put(BUTTON_STEP, true);
        buttonEnabling.put(BUTTON_EXPAND, true);
        buttonEnabling.put(BUTTON_EXPAND_OPTIMIZE, true);
        buttonEnabling.put(BUTTON_STEP_BACK, true);

        // #### back
        ImageDescriptor iconStepBack = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
                "icons/stepBackIcon.png");
        KiviMenuContributionService.INSTANCE.addToolbarButton(this, BUTTON_STEP_BACK, "Step Back",
                "Step Back", iconStepBack, SWT.PUSH, LocationScheme.MENU_POPUP_TOOLBAR, null, null,
                null, SYNCCHARTS_EDITOR_ID, ESTEREL_EDITOR_ID);

        // #### step
        ImageDescriptor iconStep = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
                "icons/stepIcon.png");
        KiviMenuContributionService.INSTANCE.addToolbarButton(this, BUTTON_STEP, "Step", "Step",
                iconStep, SWT.PUSH, LocationScheme.MENU_POPUP_TOOLBAR, null, null, null,
                SYNCCHARTS_EDITOR_ID, ESTEREL_EDITOR_ID);

        // #### expand (complete transformation)
        ImageDescriptor iconExpand = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
                "icons/expandIcon.png");
        KiviMenuContributionService.INSTANCE.addToolbarButton(this, BUTTON_EXPAND, "Expand",
                "Expand", iconExpand, SWT.PUSH, LocationScheme.MENU_POPUP_TOOLBAR, null, null,
                null, SYNCCHARTS_EDITOR_ID, ESTEREL_EDITOR_ID);

        // #### expand and optimize
        ImageDescriptor iconExpandAndOptimize = Activator.imageDescriptorFromPlugin(
                Activator.PLUGIN_ID, "icons/expandAndOptimizeIcon.png");
        KiviMenuContributionService.INSTANCE.addToolbarButton(this, BUTTON_EXPAND_OPTIMIZE,
                "Expand and Optimize", "Expand and Optimize", iconExpandAndOptimize, SWT.PUSH,
                LocationScheme.MENU_POPUP_TOOLBAR, null, null, null, SYNCCHARTS_EDITOR_ID,
                ESTEREL_EDITOR_ID);

        MenuItemEnableStateEffect ef = new MenuItemEnableStateEffect(BUTTON_STEP_BACK, false);
        ef.schedule();
        // KiVi.getInstance().setDebug(true);
    }

    /**
     * Method called by KiVi as soon as the ButtonState changes.
     * 
     * @param buttonState
     *            contains information which buttons where pressed.
     * @param editorState
     *            informs about the change of the current editor.
     * @param transformationState
     *            informs about the completion of a transformation.
     */
    public void execute(final ButtonState buttonState, final ActiveEditorState editorState,
            final EffectTriggerState<TransformationEffect> transformationState) {

        switch (latestStateIndex()) {
        case SECOND: // editor state, remember the currently active editor
            editorStateChanged(editorState);
            return;

        case THIRD: // transformation state
            TransformationUtil.LOGGER.info("\t #### Transformation finished with result: "
                    + transformationState.getEffect().getResult());
            postTransformation(transformationState.getEffect());
            return;

        case FIRST: // button state
            if (!buttonEnabling.keySet().contains(buttonState.getButtonId())) {
                // not interested in that button
                return;
            }

            // in case no editor change happened prior first execution, fetch the active one.
            if (currentlyActiveEditor == null) {
                currentlyActiveEditor = TransformationUtil.getActiveEditor();
            }
            // if XtextEditor is opened the transformation has to be initialized.
            // (checking for xtext editor is sufficient as the buttons are only displayed for the
            // esterel editor.)
            if (currentlyActiveEditor instanceof XtextEditor) {
                boolean created = initializeTransformation();
                if (created
                        && (buttonState.getButtonId() == BUTTON_EXPAND
                        ||  buttonState.getButtonId() == BUTTON_EXPAND_OPTIMIZE)) {
                    // FIXME the editor was changed by the initializeTransformation method, but the
                    // editorState wasn't processed yet. Therefore, it is necessary to fetch the new
                    // editor.
                    currentlyActiveEditor = TransformationUtil.getActiveEditor();
                    process(buttonState.getButtonId());
                }
                return;
            }

            process(buttonState.getButtonId());

            setButtonEnabling(true);
        default:
            throw new RuntimeException("KIES Error: This should never happen!");
        }
    }

    /*
     * /////////////////////////////////////////////////////////////////////////////////////////
     * Initial Transformation to a SyncCharts
     */

    private boolean initializeTransformation() {
        // first check if there is anything to transform!

        setButtonState(true, BUTTON_EXPAND_OPTIMIZE, BUTTON_STEP, BUTTON_EXPAND);
        setButtonState(false, BUTTON_STEP_BACK);

        // get the current editor
        if (currentlyActiveEditor instanceof XtextEditor) {
            IFile strlFile = (IFile) ((IEditorPart) currentlyActiveEditor).getEditorInput()
                    .getAdapter(IFile.class);
            IFile created = TransformationUtil.strlToKixs(strlFile);
            // if the user canceled the action, return!
            if (created == null) {
                return false;
            }
            initInProgess = true;
            TransformationUtil.openKidsInEditor(created);
            // @author: cmot, do not disable ALL checks by default
            // if (ValidationManager.isEnabled(SYNCCHARTS_EDITOR_ID));
            // ValidationManager.disableAll();
            return true;
        }
        return false;
    }

    /*
     * /////////////////////////////////////////////////////////////////////////////////////////
     * Reaction upon a button click
     */
    private void process(final String type) {
        lastStepType = type;

        if (lastStepType.equals(BUTTON_STEP_BACK)) {
            back();
            LayoutEffect layoutEffect = new LayoutEffect(currentlyActiveEditor, null);
            layoutEffect.schedule();
            return;
        }

        boolean isTransformable = isTransformable();
        if (lastStepType.equals(BUTTON_EXPAND_OPTIMIZE) && !isTransformable) {
            // do not perform two optimizations if already expanded completely
            lastStepType = BUTTON_EXPAND;
        }

        if (transformingDataComponent == null || optimizingDataComponent == null) {
            initializeDataComponents();
        }

        // initialize the correct DataComponent
        if (isTransformable) {
            currentDataComponent = transformingDataComponent;
        } else {

            currentDataComponent = optimizingDataComponent;
        }

        // determine proceeding
        if (lastStepType.equals(BUTTON_EXPAND) || lastStepType.equals(BUTTON_EXPAND_OPTIMIZE)) {
            setRecursive(true);
            startTransformation(true);
        }
        if (lastStepType.equals(BUTTON_STEP)) {
            setRecursive(false);
            startTransformation(false);
        }
    }

    private void startTransformation(final boolean monitored) {
        try {
            long start = System.currentTimeMillis();
            currentDataComponent.step(null);
            ITransformationContext lastContext = currentDataComponent.getCurrentContext();
            TransformationDescriptor lastDescriptor = currentDataComponent.getCurrentDescriptor();
            if (lastContext != null) {
                TransformationEffect effect = new TransformationEffect(lastContext, lastDescriptor,
                        monitored);
                long end = System.currentTimeMillis();
                TransformationUtil.LOGGER.info("\t ##### Initialize Time: " + (end - start));
                effect.schedule();
            }
        } catch (KiemExecutionException e) {
            Status s = new Status(Status.ERROR, Activator.PLUGIN_ID,
                    "A problem occured during transformation.", e);
            StatusManager.getManager().handle(s, StatusManager.SHOW);
        }
    }

    private void back() {
        if (currentCommandStack != null && currentCommandStack.canUndo()) {
            currentCommandStack.undo();
            currentCommandStack.undo();
        }
        // very important to refresh the policies at this point as well!
        RefreshGMFEditPoliciesEffect gmfEffect = new RefreshGMFEditPoliciesEffect(
                (SyncchartsDiagramEditor) currentlyActiveEditor, false);
        gmfEffect.schedule();
        if (currentCommandStack != null) {
            enableStepBack(currentCommandStack.canUndo());
        }
    }

    /*
     * /////////////////////////////////////////////////////////////////////////////////////////
     * Editor changed.
     */
    private void editorStateChanged(final ActiveEditorState editorState) {

        if (!initInProgess) {
            currentDataComponent = null;
        } else {
            initInProgess = false;
        }

        // set currently active editor null and look for the first matching editors within the
        // opened workbenchparts
        currentlyActiveEditor = null;
        List<IWorkbenchPart> openWorkbenchParts = editorState.getOpenWorkbenchParts();
        for (IWorkbenchPart part : openWorkbenchParts) {
            if ((part instanceof XtextEditor && part.getSite().getId().equals(ESTEREL_EDITOR_ID))
                    || part instanceof SyncchartsDiagramEditor) {
                currentlyActiveEditor = part;
                break;
            }
        }

        // if neither esterel editor nor synccharts editor, we're not interested
        if (currentlyActiveEditor == null) {
            return;
        }

        if (currentlyActiveEditor instanceof SyncchartsDiagramEditor) {
            currentCommandStack = ((DiagramEditor) currentlyActiveEditor).getEditingDomain()
                    .getCommandStack();

            // init datacomponents
            initializeDataComponents();

            // activate all buttons
            setButtonState(true, BUTTON_EXPAND_OPTIMIZE, BUTTON_STEP);
            setButtonState(isTransformable(), BUTTON_EXPAND);
            setButtonState(currentCommandStack.canUndo(), BUTTON_STEP_BACK);

        } else {
            if (currentlyActiveEditor instanceof XtextEditor) {
                setButtonState(true, BUTTON_EXPAND, BUTTON_EXPAND_OPTIMIZE, BUTTON_STEP);
                setButtonState(false, BUTTON_STEP_BACK);
            }

            currentCommandStack = null;
            transformingDataComponent = null;
            optimizingDataComponent = null;
        }
        setButtonEnabling(true);
    }

    /*
     * /////////////////////////////////////////////////////////////////////////////////////////
     * Reaction upon a finished TransformationEffect.
     */
    private void postTransformation(final TransformationEffect effect) {
        if (lastStepType.equals(BUTTON_EXPAND_OPTIMIZE)) {
            // optimization is performed the same manner line expand just with different data
            // component.
            if (currentDataComponent != null) {
                currentDataComponent.doPostTransformation();
            }
            process(BUTTON_EXPAND);
        } else if (lastStepType.equals(BUTTON_EXPAND)) {
            if (currentDataComponent != null) {
                currentDataComponent.doPostTransformation();
            }
            setButtonState(false, BUTTON_EXPAND);
        }

        // activate / deactivate back button.
        if (currentCommandStack != null) {
            setButtonState(currentCommandStack.canUndo(), BUTTON_STEP_BACK);
        }

        setButtonEnabling(true);

        if (currentlyActiveEditor instanceof SyncchartsDiagramEditor) {
            // refresh GMF edit policies
            RefreshGMFEditPoliciesEffect gmfEffect = new RefreshGMFEditPoliciesEffect(
                    (SyncchartsDiagramEditor) currentlyActiveEditor, true);
            gmfEffect.schedule();

            // apply automatic layout by triggering the trigger (null layouts whole diagram)
            LayoutEffect layoutEffect = new LayoutEffect(currentlyActiveEditor, null);
            layoutEffect.schedule();

            // set a new selection in case xtext passed one
            if (currentDataComponent instanceof EsterelToSyncChartDataComponent) {
                final IGraphicalFrameworkBridge bridge = GraphicalFrameworkService.getInstance()
                        .getBridge(currentlyActiveEditor);
                if (bridge != null) {
                    // a selection has to be performed on the UI thread.
                    MonitoredOperation.runInUI(new Runnable() {

                        public void run() {
                            if (isTransformable() && effect.getResult() instanceof State) {
                                State selection = (State) effect.getResult();
                                final EditPart p = bridge.getEditPart(selection);
                                if (p != null) {
                                    ((IEditorPart) currentlyActiveEditor).getEditorSite()
                                            .getSelectionProvider()
                                            .setSelection(new StructuredSelection(p));
                                }
                            } else {
                                // if nothing is transformable anymore, clear the current
                                // selection
                                EditPart root = bridge.getEditPart(currentDataComponent
                                        .getRootState());
                                ((IEditorPart) currentlyActiveEditor).getEditorSite()
                                        .getSelectionProvider()
                                        .setSelection(new StructuredSelection(root));
                            }
                        }
                    }, false);
                }
            }
        }
    }

    /*
     * /////////////////////////////////////////////////////////////////////////////////////////
     * Convenient Methods.
     */

    private void setRecursive(final boolean bool) {
        if (currentDataComponent != null) {
            currentDataComponent.setGlobalVariable(EsterelToSyncChartDataComponent.GLOBALVAR_REC,
                    bool);
        }
    }

    private void enableStepBack(final boolean bool) {
        this.schedule(new MenuItemEnableStateEffect(BUTTON_STEP_BACK, bool));
    }

    private void setButtonState(final boolean enabled, final String... buttons) {
        for (String button : buttons) {
            buttonEnabling.put(button, enabled);
        }
    }

    private void setButtonEnabling(final boolean bool) {
        for (String button : buttonEnabling.keySet()) {
            MenuItemEnableStateEffect effect = new MenuItemEnableStateEffect(button, !bool ? false
                    : (Boolean) buttonEnabling.get(button));
            effect.schedule();
        }
    }

    private void initializeDataComponents() {
        try {
            transformingDataComponent = new EsterelToSyncChartDataComponent(true);
            transformingDataComponent.initialize();
            optimizingDataComponent = new SyncChartsOptimizationDataComponent(true);
            optimizingDataComponent.initialize();
        } catch (KiemInitializationException e) {
            Status s = new Status(Status.ERROR, Activator.PLUGIN_ID,
                    "An error occured during the setup of the DataComponents.", e);
            StatusManager.getManager().handle(s, StatusManager.SHOW);
        }
    }

    /**
     * @return true if the currently opened model is transformable.
     */
    private boolean isTransformable() {
        if (currentlyActiveEditor instanceof SyncchartsDiagramEditor) {
            // fetch the root part of the current diagram
            EditPart rootEditPart = ((DiagramEditor) currentlyActiveEditor).getDiagramEditPart();
            Object selView = rootEditPart.getModel();
            EObject selModel = ((View) selView).getElement();
            Region rootRegion = (Region) selModel;

            // check if any state exists with a body reference to an esterel element
            TreeIterator<EObject> contents = rootRegion.eAllContents();
            while (contents.hasNext()) {
                EObject current = contents.next();
                if (current instanceof State) {
                    if (TransformationUtil.isEsterelElement(((State) current).getBodyReference())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
