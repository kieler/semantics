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

import com.google.common.collect.ImmutableMap;

import de.cau.cs.kieler.core.kivi.AbstractCombination;
import de.cau.cs.kieler.core.kivi.menu.ButtonTrigger.ButtonState;
import de.cau.cs.kieler.core.kivi.menu.KiviMenuContributionService;
import de.cau.cs.kieler.core.kivi.menu.MenuItemEnableStateEffect;
import de.cau.cs.kieler.core.kivi.triggers.EffectTrigger.EffectTriggerState;
import de.cau.cs.kieler.core.model.trigger.ModelChangeTrigger.ActiveEditorState;
import de.cau.cs.kieler.kies.transformation.Activator;
import de.cau.cs.kieler.kies.transformation.core.AbstractTransformationDataComponent;
import de.cau.cs.kieler.kies.transformation.core.TransformationContext;
import de.cau.cs.kieler.kies.transformation.core.kivi.TransformationEffect;
import de.cau.cs.kieler.kies.transformation.impl.EsterelToSyncChartDataComponent;
import de.cau.cs.kieler.kies.transformation.impl.SyncChartsOptimizationDataComponent;
import de.cau.cs.kieler.kies.transformation.util.TransformationUtil;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.execution.Execution;
import de.cau.cs.kieler.sim.kiem.internal.DataComponentWrapper;
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

    private static final Map<String, Boolean> BUTTON_ENABLEING = ImmutableMap.of(BUTTON_STEP, true,
            BUTTON_EXPAND, true, BUTTON_EXPAND_OPTIMIZE, true, BUTTON_STEP_BACK, true);

    private enum TStatus {
        NONE, FINISHED, RUNNING
    };

    private TStatus transformationStatus = TStatus.NONE;
    private TStatus optimizationStatus = TStatus.NONE;

    private AbstractTransformationDataComponent currentDataComponent;

    private IWorkbenchPart currentlyActiveEditor;
    private CommandStack currentCommandStack;

    private boolean scheduleOptimization = false;
    private boolean dynamicButtonEnabling = true;

    /**
     * Default Constructor, setting up all needed buttons.
     */
    public KIEMRemoteCombination() {

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

        this.schedule(new MenuItemEnableStateEffect(BUTTON_STEP_BACK, false));
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
        if (editorState.getSequenceNumber() > buttonState.getSequenceNumber()
                && editorState.getSequenceNumber() > transformationState.getSequenceNumber()) {
            System.out.println("editor state");
            editorStateChanged(editorState);
            return;
        }

        // transformation state
        if (transformationState.getSequenceNumber() > buttonState.getSequenceNumber()
                && transformationState.getSequenceNumber() > editorState.getSequenceNumber()) {
            System.out.println("finished state");
            // activate / deactivate back button.
            if (dynamicButtonEnabling && currentCommandStack != null) {
                enableStepBack(currentCommandStack.canUndo());
            }
            setButtonEnabling(true);
            return;
        }

        // button state
        if (buttonState.getSequenceNumber() > editorState.getSequenceNumber()
                && buttonState.getSequenceNumber() > transformationState.getSequenceNumber()) {
            System.out.println("button state");

            if (!BUTTON_ENABLEING.keySet().contains(buttonState.getButtonId())) {
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

            if (currentDataComponent instanceof SyncChartsOptimizationDataComponent) {
                EsterelToSyncChartDataComponent dc = new EsterelToSyncChartDataComponent();
                try {
                    dc.initialize();
                } catch (KiemInitializationException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                if (dc.getNextTransformation() != null) {
                    currentDataComponent = null;
                    optimizationStatus = TStatus.NONE;
                    transformationStatus = TStatus.NONE;
                }
            }

            if (currentDataComponent == null) {
                if (transformationStatus != TStatus.FINISHED) {
                    currentDataComponent = new EsterelToSyncChartDataComponent();
                } else if (currentDataComponent == null) {
                    currentDataComponent = new SyncChartsOptimizationDataComponent();
                }
                try {
                    currentDataComponent.initialize();
                } catch (KiemInitializationException e) {
                    e.printStackTrace();
                }
            }

            String id = buttonState.getButtonId();
            if (id.equals(BUTTON_STEP)) {
                System.out.println("step");
                step();
            } else if (id.equals(BUTTON_STEP_BACK)) {
                System.out.println("back");
                back();
            } else if (id.equals(BUTTON_EXPAND)) {
                expand();
            } else if (id.equals(BUTTON_EXPAND_OPTIMIZE)) {
                expandAndOptimize();
            }

            setButtonEnabling(false);
        }

        return;
    }

    private boolean initializeTransformation() {
        // first check if there is anything to transform!
        // TODO

        // get the current editor
        IEditorPart editor = TransformationUtil.getActiveEditor();
        if (editor instanceof XtextEditor) {
            IFile strlFile = (IFile) editor.getEditorInput().getAdapter(IFile.class);
            boolean created = TransformationUtil.strlToKixsAndOpen(strlFile);

            if (!created) {
                return false;
            }

            currentDataComponent = new EsterelToSyncChartDataComponent();
            try {
                currentDataComponent.initialize();
            } catch (KiemInitializationException e) {
                e.printStackTrace();
            }
            return true;
        }
        return false;
    }

    private void step() {
        setRecursive(false);
        try {
            initiateStep();
            this.schedule(new MenuItemEnableStateEffect(BUTTON_STEP_BACK, true));
        } catch (KiemExecutionException e) {
            if (currentDataComponent instanceof EsterelToSyncChartDataComponent) {
                transformationStatus = TStatus.FINISHED;
                currentDataComponent = null;
            }
        }
    }

    private void expand() {
        setRecursive(true);
        try {
            try {
                initiateStep();
            } catch (KiemExecutionException e) {
                e.printStackTrace();
            }
            currentDataComponent.wrapup();
            currentDataComponent = null;
            transformationStatus = TStatus.FINISHED;
            this.schedule(new MenuItemEnableStateEffect(BUTTON_EXPAND, false));
            // currentDataComponent.step(null);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void expandAndOptimize() {
        try {
            if (currentDataComponent instanceof EsterelToSyncChartDataComponent) {
                setRecursive(true);
                try {
                    initiateStep();
                } catch (Exception e) {
                    System.err.println("finished");
                }
                try {
                    currentDataComponent.wrapup();
                } catch (Exception e) {
                    System.err.println("finished2");
                }
                scheduleOptimization = true;
            } // else {
              // Thread.sleep(3000);
            currentDataComponent = new SyncChartsOptimizationDataComponent();
            try {
                currentDataComponent.initialize();
                setRecursive(true);
                initiateStep();
                initiateStep();
                initiateStep();
                currentDataComponent.wrapup();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
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

    private void setButtonEnabling(boolean bool) {
        for (String button : BUTTON_ENABLEING.keySet()) {
            this.schedule(new MenuItemEnableStateEffect(button, !bool ? false
                    : (Boolean) BUTTON_ENABLEING.get(button)));
        }
    }

    private void initiateStep() throws KiemExecutionException {
        if (currentDataComponent != null) {
            currentDataComponent.step(null);
            TransformationContext ctx = currentDataComponent.getCurrentContext();
            if (ctx != null) {
                this.schedule(new TransformationEffect(ctx));
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

        optimizationStatus = TStatus.NONE;
        transformationStatus = TStatus.NONE;
        scheduleOptimization = false;
    }
}
