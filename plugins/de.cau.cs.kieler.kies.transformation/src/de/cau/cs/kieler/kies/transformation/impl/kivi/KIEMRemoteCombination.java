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
package de.cau.cs.kieler.kies.transformation.impl.kivi;

import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.xtext.ui.editor.XtextEditor;

import com.google.common.collect.Maps;

import de.cau.cs.kieler.core.kivi.AbstractCombination;
import de.cau.cs.kieler.core.kivi.menu.ButtonTrigger.ButtonState;
import de.cau.cs.kieler.core.kivi.menu.KiviMenuContributionService;
import de.cau.cs.kieler.core.kivi.menu.MenuItemEnableStateEffect;
import de.cau.cs.kieler.core.kivi.triggers.EffectTrigger.EffectTriggerState;
import de.cau.cs.kieler.core.model.trigger.DiagramTrigger.DiagramState;
import de.cau.cs.kieler.core.model.trigger.ModelChangeTrigger.ActiveEditorState;
import de.cau.cs.kieler.kies.transformation.Activator;
import de.cau.cs.kieler.kies.transformation.core.AbstractTransformationDataComponent;
import de.cau.cs.kieler.kies.transformation.core.TransformationContext;
import de.cau.cs.kieler.kies.transformation.core.kivi.RefreshGMFElementsEffect;
import de.cau.cs.kieler.kies.transformation.core.kivi.TransformationEffect;
import de.cau.cs.kieler.kies.transformation.impl.EsterelToSyncChartDataComponent;
import de.cau.cs.kieler.kies.transformation.impl.SyncChartsOptimizationDataComponent;
import de.cau.cs.kieler.kies.transformation.util.TransformationUtil;
import de.cau.cs.kieler.kiml.ui.layout.LayoutEffect;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditor;

/**
 * @author uru
 * 
 */
public class KIEMRemoteCombination extends AbstractCombination {

    private static final String BUTTON_STEP = "de.cau.cs.kieler.kies.transformation.step";
    private static final String BUTTON_STEP_BACK = "de.cau.cs.kieler.kies.transformation.stepBack";
    private static final String BUTTON_EXPAND = "de.cau.cs.kieler.kies.transformation.expand";
    private static final String BUTTON_EXPAND_OPTIMIZE = "de.cau.cs.kieler.kies.transformation."
            + "expandAndOptimize";

    private static final String SYNCCHARTS_EDITOR_ID = "de.cau.cs.kieler.synccharts.diagram.part."
            + "SyncchartsDiagramEditorID";
    private static final String ESTEREL_EDITOR_ID = "de.cau.cs.kieler.kies.Esterel";

    private final Map<String, Boolean> buttonEnabling = Maps.newHashMap();

    private enum StepType {
        STEP, STEP_BACK, EXPAND, EXPAND_OPTIMIZE
    };

    private AbstractTransformationDataComponent currentDataComponent;
    private IWorkbenchPart currentlyActiveEditor;
    private CommandStack currentCommandStack;

    private StepType lastStepType = StepType.STEP;

    /**
     * Default Constructor, setting up all needed buttons.
     */
    public KIEMRemoteCombination() {
        buttonEnabling.put(BUTTON_STEP, true);
        buttonEnabling.put(BUTTON_EXPAND, true);
        buttonEnabling.put(BUTTON_EXPAND_OPTIMIZE, true);
        buttonEnabling.put(BUTTON_STEP_BACK, true);

        // #### back
        ImageDescriptor iconStepBack = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
                "icons/stepBackIcon.png");
        KiviMenuContributionService.INSTANCE.addToolbarButton(this, BUTTON_STEP_BACK, "StepBack",
                "Step Back", iconStepBack, SWT.PUSH, null, SYNCCHARTS_EDITOR_ID, ESTEREL_EDITOR_ID);

        // #### step
        ImageDescriptor iconStep = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
                "icons/stepIcon.png");
        KiviMenuContributionService.INSTANCE.addToolbarButton(this, BUTTON_STEP, "Step", "Step",
                iconStep, SWT.PUSH, null, SYNCCHARTS_EDITOR_ID, ESTEREL_EDITOR_ID);

        // #### expand (complete transformation)
        ImageDescriptor iconExpand = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
                "icons/expandIcon.png");
        KiviMenuContributionService.INSTANCE.addToolbarButton(this, BUTTON_EXPAND, "Expand",
                "Expand", iconExpand, SWT.PUSH, null, SYNCCHARTS_EDITOR_ID, ESTEREL_EDITOR_ID);

        // #### expand and optimize
        ImageDescriptor iconExpandAndOptimize = Activator.imageDescriptorFromPlugin(
                Activator.PLUGIN_ID, "icons/expandAndOptimizeIcon.png");
        KiviMenuContributionService.INSTANCE.addToolbarButton(this, BUTTON_EXPAND_OPTIMIZE, "EaO",
                "Expand and Optimize", iconExpandAndOptimize, SWT.PUSH, null, SYNCCHARTS_EDITOR_ID,
                ESTEREL_EDITOR_ID);

        MenuItemEnableStateEffect ef = new MenuItemEnableStateEffect(BUTTON_STEP_BACK, false);
        ef.schedule();
    }

    /**
     * Method called by KiVi as soon as the ButtonState changes.
     * 
     * @param buttonState
     *            contains information which buttons where pressed.
     */
    public void execute(final ButtonState buttonState, final ActiveEditorState editorState,
            EffectTriggerState<TransformationEffect> transformationState) {

        // editor state
        if (getTriggerState() instanceof ActiveEditorState) {
            System.out.println("editor state");
            editorStateChanged(editorState);
            return;
        }

        // transformation state
        if (transformationState.getSequenceNumber() > buttonState.getSequenceNumber()
                && transformationState.getSequenceNumber() > editorState.getSequenceNumber()) {
            System.out.println("\t #### FINISHED with result: "
                    + transformationState.getEffect().getResult());

            if (lastStepType == StepType.EXPAND_OPTIMIZE) {
                // optimization is performed the same manner line expand just with different data
                // component.
                process(StepType.EXPAND);
                setButtonState(false, BUTTON_EXPAND_OPTIMIZE, BUTTON_STEP, BUTTON_STEP_BACK);
            } else if (lastStepType == StepType.EXPAND) {
                if (currentDataComponent != null) {
                    currentDataComponent.doPostTransformation();
                }
                setButtonState(false, BUTTON_EXPAND);
            }

            // activate / deactivate back button.
            if (currentCommandStack != null) {
                buttonEnabling.put(BUTTON_STEP_BACK, currentCommandStack.canUndo());
            }

            setButtonEnabling(true);

            if (currentlyActiveEditor instanceof SyncchartsDiagramEditor) {
                // refresh GMF edit policies
                RefreshGMFElementsEffect gmfEffect = new RefreshGMFElementsEffect(
                        (SyncchartsDiagramEditor) currentlyActiveEditor);
                this.schedule(gmfEffect);

                // apply automatic layout by triggering the trigger (null layouts whole diagram)
                LayoutEffect layoutEffect = new LayoutEffect(currentlyActiveEditor, null);
                layoutEffect.schedule();
            }

            return;
        }

        // button state
        if (buttonState.getSequenceNumber() > editorState.getSequenceNumber()
                && buttonState.getSequenceNumber() > transformationState.getSequenceNumber()) {
            System.out.println("button state");

            if (!buttonEnabling.keySet().contains(buttonState.getButtonId())) {
                // not interested in that button
                return;
            }

            if (currentlyActiveEditor == null) {
                currentlyActiveEditor = TransformationUtil.getActiveEditor();
            }

            // if XtextEditor is opened the transformation has to be initialized.
            if (currentlyActiveEditor instanceof XtextEditor) {
                if (!initializeTransformation()) {
                    return;
                }
            }

            String id = buttonState.getButtonId();
            if (id.equals(BUTTON_STEP)) {
                process(StepType.STEP);
            } else if (id.equals(BUTTON_STEP_BACK)) {
                process(StepType.STEP_BACK);
            } else if (id.equals(BUTTON_EXPAND)) {
                process(StepType.EXPAND);
            } else if (id.equals(BUTTON_EXPAND_OPTIMIZE)) {
                process(StepType.EXPAND_OPTIMIZE);
            }
            setButtonEnabling(true);
        }

        return;
    }

    private boolean initializeTransformation() {
        // first check if there is anything to transform!
        // TODO
        setButtonState(true, BUTTON_EXPAND_OPTIMIZE, BUTTON_STEP, BUTTON_EXPAND);
        setButtonState(false, BUTTON_STEP_BACK);

        // get the current editor
        IEditorPart editor = TransformationUtil.getActiveEditor();
        if (editor instanceof XtextEditor) {
            IFile strlFile = (IFile) editor.getEditorInput().getAdapter(IFile.class);
            boolean created = TransformationUtil.strlToKixsAndOpen(strlFile);

            if (!created) {
                return false;
            }

            currentDataComponent = new EsterelToSyncChartDataComponent(true);
            try {
                currentDataComponent.initialize();
            } catch (KiemInitializationException e) {
                e.printStackTrace();
            }
            return true;
        }
        return false;
    }

    private void process(StepType type) {
        lastStepType = type;

        if (type == StepType.STEP_BACK) {
            back();
            return;
        }

        // initialize the correct datacomponent
        if (isTransformable()) {
            currentDataComponent = new EsterelToSyncChartDataComponent(true);
        } else {
            currentDataComponent = new SyncChartsOptimizationDataComponent(true);
        }
        try {
            currentDataComponent.initialize();
        } catch (KiemInitializationException e) {
            e.printStackTrace();
        }

        // determine proceeding
        switch (type) {
        case STEP:
            setRecursive(false);
            break;
        case EXPAND:
            setRecursive(true);
            break;
        case EXPAND_OPTIMIZE:
            setRecursive(true);
            break;
        default:
        }

        // perform step
        try {
            initiateStep();
        } catch (KiemExecutionException e) {
            e.printStackTrace();
            System.out.println("Finished");
        }
    }

    private void back() {
        if (currentCommandStack != null && currentCommandStack.canUndo()) {
            currentCommandStack.undo();
        }
        if (currentCommandStack != null) {
            enableStepBack(currentCommandStack.canUndo());
        }
    }

    private void setRecursive(final boolean bool) {
        if (currentDataComponent != null) {
            currentDataComponent.setGlobalVariable(EsterelToSyncChartDataComponent.GLOBVAR_REC,
                    bool);
        }
    }

    private void enableStepBack(final boolean bool) {
        this.schedule(new MenuItemEnableStateEffect(BUTTON_STEP_BACK, bool));
    }

    private void setButtonState(boolean enabled, String... buttons) {
        for (String button : buttons) {
            buttonEnabling.put(button, enabled);
        }
    }

    private void setButtonEnabling(boolean bool) {
        for (String button : buttonEnabling.keySet()) {
            this.schedule(new MenuItemEnableStateEffect(button, !bool ? false
                    : (Boolean) buttonEnabling.get(button)));
        }
    }

    private void initiateStep() throws KiemExecutionException {
        if (currentDataComponent != null) {
            currentDataComponent.step(null);
            TransformationContext lastContext = currentDataComponent.getCurrentContext();
            if (lastContext != null) {
                this.schedule(new TransformationEffect(lastContext));
            }
        }
    }

    private void editorStateChanged(ActiveEditorState editorState) {
        currentlyActiveEditor = editorState.getLastActiveEditor();
        currentDataComponent = null;
        if (currentlyActiveEditor instanceof SyncchartsDiagramEditor) {
            currentCommandStack = ((DiagramEditor) currentlyActiveEditor).getEditingDomain()
                    .getCommandStack();
        } else {
            currentCommandStack = null;
        }
    }

    private boolean isTransformable() {
        EsterelToSyncChartDataComponent dc = new EsterelToSyncChartDataComponent(true);
        try {
            dc.initialize();
        } catch (KiemInitializationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Object next = dc.getNextTransformation();
        return next != null;
    }
}
