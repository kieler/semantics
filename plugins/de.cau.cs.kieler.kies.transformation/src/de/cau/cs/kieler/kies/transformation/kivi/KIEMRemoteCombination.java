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
package de.cau.cs.kieler.kies.transformation.kivi;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.xtext.ui.editor.XtextEditor;

import de.cau.cs.kieler.core.kivi.AbstractCombination;
import de.cau.cs.kieler.core.kivi.menu.ButtonTrigger.ButtonState;
import de.cau.cs.kieler.core.kivi.menu.KiviMenuContributionService;
import de.cau.cs.kieler.core.kivi.menu.MenuItemEnableStateEffect;
import de.cau.cs.kieler.kies.transformation.Activator;
import de.cau.cs.kieler.kies.transformation.core.AbstractTransformationDataComponent;
import de.cau.cs.kieler.kies.transformation.impl.EsterelToSyncChartDataComponent;
import de.cau.cs.kieler.kies.transformation.impl.SyncChartsOptimizationDataComponent;
import de.cau.cs.kieler.kies.transformation.util.TransformationUtil;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.execution.Execution;
import de.cau.cs.kieler.sim.kiem.internal.DataComponentWrapper;

/**
 * @author uru
 * 
 */
public class KIEMRemoteCombination extends AbstractCombination {

    private static final String BUTTON_START_TRANSFORMATION = "de.cau.cs.kieler.kies.transformation.startTransformation";

    private static final String BUTTON_STEP = "de.cau.cs.kieler.kies.transformation.step";
    private static final String BUTTON_STEP_BACK = "de.cau.cs.kieler.kies.transformation.stepBack";
    private static final String BUTTON_EXPAND = "de.cau.cs.kieler.kies.transformation.expand";
    private static final String BUTTON_EXPAND_OPTIMIZE = "de.cau.cs.kieler.kies.transformation.expandAndOptimize";
    private static final String BUTTON_STOP = "de.cau.cs.kieler.kies.transformation.stop";

    private static final String SYNCCHARTS_EDITOR_ID = "de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditorID";
    private static final String ESTEREL_EDITOR_ID = "de.cau.cs.kieler.kies.Esterel";

    private static final String ESTEREL_TO_SYNCCHARTS_COMP_ID = "de.cau.cs.kieler.kies.transformation.Transformation";
    private static final String OPTIMIZATION_COMP_ID = "de.cau.cs.kieler.kies.transformation.Optimization";

    private static final int BUSY_WAIT_DELAY = 1000;

    /** current datacomponentwrapper or null. */
    private DataComponentWrapper wrapper = null;
    /** current execution context if initialized or null. */
    private Execution execution = null;

    private Long currentStep = null;

    /**
     * Default Constructor, setting up all needed buttons.
     */
    public KIEMRemoteCombination() {

        // #### initial transformation from strl
        KiviMenuContributionService.INSTANCE.addToolbarButton(this, BUTTON_START_TRANSFORMATION,
                "Init", "Initialize Transformation to SyncCharts.", null, SWT.PUSH, null,
                ESTEREL_EDITOR_ID);

        // #### back
        ImageDescriptor iconStepBack = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
                "icons/stepBackIcon.png");
        KiviMenuContributionService.INSTANCE.addToolbarButton(this, BUTTON_STEP_BACK, "StepBack",
                "Step Back", iconStepBack, SWT.PUSH, null, SYNCCHARTS_EDITOR_ID);

        // #### step
        ImageDescriptor iconStep = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
                "icons/stepIcon.png");
        KiviMenuContributionService.INSTANCE.addToolbarButton(this, BUTTON_STEP, "Step", "Step",
                iconStep, SWT.PUSH, null, SYNCCHARTS_EDITOR_ID);

        // #### expand (complete transformation)
        ImageDescriptor iconExpand = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
                "icons/expandIcon.png");
        KiviMenuContributionService.INSTANCE.addToolbarButton(this, BUTTON_EXPAND, "Expand",
                "Expand", iconExpand, SWT.PUSH, null, SYNCCHARTS_EDITOR_ID);

        // #### expand and optimize
        ImageDescriptor iconExpandAndOptimize = Activator.imageDescriptorFromPlugin(
                Activator.PLUGIN_ID, "icons/expandAndOptimizeIcon.png");
        KiviMenuContributionService.INSTANCE.addToolbarButton(this, BUTTON_EXPAND_OPTIMIZE, "EaO",
                "Expand and Optimize", iconExpandAndOptimize, SWT.PUSH, null, SYNCCHARTS_EDITOR_ID);

        // #### stop
        ImageDescriptor iconStop = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
                "icons/stopIcon.png");
        KiviMenuContributionService.INSTANCE.addToolbarButton(this, BUTTON_STOP, "Stop", "Stop",
                iconStop, SWT.PUSH, null, SYNCCHARTS_EDITOR_ID);
    }

    /**
     * Method called by KiVi as soon as the ButtonState changes.
     * 
     * @param buttonState
     *            contains information which buttons where pressed.
     */
    public void execute(final ButtonState buttonState) {
        String id = buttonState.getButtonId();
        if (id.equals(BUTTON_START_TRANSFORMATION)) {
            System.out.println("init");
            initializeTransformation();
        } else if (id.equals(BUTTON_STEP)) {
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
    }

    private void initializeTransformation() {
        // first check if there is anything to transform!
        // TODO

        // get the current editor
        IEditorPart editor = TransformationUtil.getActiveEditor();
        if (editor instanceof XtextEditor) {
            IFile strlFile = (IFile) editor.getEditorInput().getAdapter(IFile.class);
            TransformationUtil.strlToKixsAndOpen(strlFile);
        }

        // create DataComponent and call initialize
        EsterelToSyncChartDataComponent e2s = null;// = new EsterelToSyncChartDataComponent();

        // first check whether the esterel to synccharts component is already in the component list
        List<DataComponentWrapper> existingWrappers = KiemPlugin.getDefault()
                .getDataComponentWrapperList();
        for (DataComponentWrapper w : existingWrappers) {
            System.out.println(w.getDataComponent().getDataComponentId());
            if (w.getDataComponent().getDataComponentId().startsWith(ESTEREL_TO_SYNCCHARTS_COMP_ID)) {
                e2s = (EsterelToSyncChartDataComponent) w.getDataComponent();
                wrapper = w;
                w.setEnabled(true);
            } else {
                // disable all other data components
                w.setEnabled(false);
            }
        }

        // if not, get it from the default datacomponent list.
        if (e2s == null) {
            List<DataComponentWrapper> wrappers = KiemPlugin.getDefault()
                    .getDefaultComponentWrapperList();
            for (DataComponentWrapper w : wrappers) {
                System.out.println(w.getDataComponent().getDataComponentId());
                if (w.getDataComponent().getDataComponentId()
                        .startsWith(ESTEREL_TO_SYNCCHARTS_COMP_ID)) {
                    e2s = (EsterelToSyncChartDataComponent) w.getDataComponent();
                    w.setEnabled(true);
                    break;
                }
            }

            // if still not found there was something started erroneous
            if (e2s == null) {
                Status myStatus = new Status(Status.ERROR, Activator.PLUGIN_ID,
                        "Could not find a proper DataComponent for the Esterel To SyncCharts Transformation.");
                StatusManager.getManager().handle(myStatus);
                return;
            }

            // add to the active datacomponents
            wrapper = KiemPlugin.getDefault().addTodataComponentWrapperList(e2s);

        }

        KiemPlugin.getDefault().initExecution();
        execution = KiemPlugin.getDefault().getExecution();

        setRecursiveTransformation(false);
    }

    private void initializeOptimization() {
        // create DataComponent and call initialize
        SyncChartsOptimizationDataComponent opt = null;// = new EsterelToSyncChartDataComponent();

        // first check whether the esterel to synccharts component is already in the component list
        List<DataComponentWrapper> existingWrappers = KiemPlugin.getDefault()
                .getDataComponentWrapperList();
        for (DataComponentWrapper w : existingWrappers) {
            System.out.println(w.getDataComponent().getDataComponentId());
            if (w.getDataComponent().getDataComponentId().startsWith(OPTIMIZATION_COMP_ID)) {
                opt = (SyncChartsOptimizationDataComponent) w.getDataComponent();
                wrapper = w;
                w.setEnabled(true);
            } else {
                // disable all other data components
                w.setEnabled(false);
            }
        }

        // if not, get it from the default datacomponent list.
        if (opt == null) {
            List<DataComponentWrapper> wrappers = KiemPlugin.getDefault()
                    .getDefaultComponentWrapperList();
            for (DataComponentWrapper w : wrappers) {
                System.out.println(w.getDataComponent().getDataComponentId());
                if (w.getDataComponent().getDataComponentId().startsWith(OPTIMIZATION_COMP_ID)) {
                    opt = (SyncChartsOptimizationDataComponent) w.getDataComponent();
                    w.setEnabled(true);
                    break;
                }
            }

            // if still not found there was something started erroneous
            if (opt == null) {
                Status myStatus = new Status(Status.ERROR, Activator.PLUGIN_ID,
                        "Could not find a proper DataComponent for the SyncCharts Optimization.");
                StatusManager.getManager().handle(myStatus);
                return;
            }

            // add to the active datacomponents
            wrapper = KiemPlugin.getDefault().addTodataComponentWrapperList(opt);

        }

        KiemPlugin.getDefault().initExecution();
        execution = KiemPlugin.getDefault().getExecution();
        setRecursiveOptimization(false);
    }

    private void step() {
        if (execution != null) {
            setRecursiveTransformation(false);
            if (currentStep != null) {
                System.out.println(currentStep);
                ((AbstractTransformationDataComponent) wrapper.getDataComponent()).setSkipSteps(1);
                execution.stepExecutionPause(currentStep + 1);
                while (!execution.isPaused()) {
                    pause();
                }
            }

            execution.stepExecutionSync();
            currentStep = null;
        }
    }

    private void expand() {
        if (execution != null) {
            setRecursiveTransformation(true);
            boolean stepped = execution.stepExecutionSync();
        }
    }

    private void expandAndOptimize() {
        if (execution != null) {

            // finish current transformation
            setRecursiveTransformation(true);
            execution.stepExecutionSync();

            // pause until finished, then stop
            while (!execution.isPaused()) {
                pause();
            }
            execution.stopExecutionSync();

            while (execution.isStarted()) {
                pause();
            }

            // initialize the optimization
            initializeOptimization();
            while (execution == null) {
                pause();
            }
            // run
            setRecursiveOptimization(true);
            execution.stepExecutionSync();

            // wait till finished and stop
            while (!execution.isPaused()) {
                pause();
            }
            execution.stopExecutionSync();
        }
    }

    private void back() {
        if (execution != null) {
            // if first step back remember the current number
            if (currentStep == null) {
                currentStep = execution.getSteps();
            }
            execution.stepBackExecutionSync();
        }
    }

    private void setRecursiveTransformation(final boolean bool) {
        if (wrapper != null
                && wrapper.getDataComponent() instanceof EsterelToSyncChartDataComponent) {
            ((EsterelToSyncChartDataComponent) wrapper.getDataComponent()).setGlobalVariable(
                    EsterelToSyncChartDataComponent.GLOBVAR_REC, bool);
        }
    }

    private void setRecursiveOptimization(final boolean bool) {
        if (wrapper != null
                && wrapper.getDataComponent() instanceof SyncChartsOptimizationDataComponent) {
            ((SyncChartsOptimizationDataComponent) wrapper.getDataComponent()).setGlobalVariable(
                    SyncChartsOptimizationDataComponent.GLOBALVAR_REC, bool);
        } else {
            System.err.println("tried setting opt recursive went wrong");
        }
    }

    private void pause() {
        try {
            Thread.sleep(BUSY_WAIT_DELAY);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
