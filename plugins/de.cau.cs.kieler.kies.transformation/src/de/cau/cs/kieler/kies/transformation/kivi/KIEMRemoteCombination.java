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
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.ui.editor.XtextEditor;

import de.cau.cs.kieler.core.kivi.AbstractCombination;
import de.cau.cs.kieler.core.kivi.triggers.ButtonTrigger.ButtonState;
import de.cau.cs.kieler.core.kivi.triggers.KiviMenuContributionService;
import de.cau.cs.kieler.kies.transformation.Activator;
import de.cau.cs.kieler.kies.transformation.impl.EsterelToSyncChartDataComponent;
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
    private static final String BUTTON_BACK = "de.cau.cs.kieler.kies.transformation.stepBack";

    private static final String SYNCCHARTS_EDITOR_ID = "de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditorID";
    private static final String ESTEREL_EDITOR_ID = "de.cau.cs.kieler.kies.Esterel";

    /**
     * 
     */
    public KIEMRemoteCombination() {
        String tooltip = "Does Something";
        // step
        ImageDescriptor iconStep = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
                "icons/stepIcon.png");
        KiviMenuContributionService.INSTANCE.addToolbarButton(this, BUTTON_STEP, "Step", tooltip,
                iconStep, SWT.PUSH, null, SYNCCHARTS_EDITOR_ID);

        // back
        ImageDescriptor iconStepBack = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
                "icons/stepBackIcon.png");
        KiviMenuContributionService.INSTANCE.addToolbarButton(this, BUTTON_BACK, "StepBack",
                tooltip, iconStepBack, SWT.PUSH, null, SYNCCHARTS_EDITOR_ID);

        KiviMenuContributionService.INSTANCE.addToolbarButton(this, BUTTON_START_TRANSFORMATION,
                "Init", tooltip, null, SWT.PUSH, null, ESTEREL_EDITOR_ID);
    }

    public void execute(final ButtonState buttonState) {
        String id = buttonState.getButtonId();
        if (id.equals(BUTTON_START_TRANSFORMATION)) {
            System.out.println("init");
            initializeTransformation();
        } else if (id.equals(BUTTON_STEP)) {
            System.out.println("step");
            step();
        } else if (id.equals(BUTTON_BACK)) {
            System.out.println("back");
        }
    }

    private void step() {
        boolean stepped = KiemPlugin.getDefault().getExecution().stepExecutionSync();
        System.out.println(stepped);
    }

    private void initializeTransformation() {
        // first check if there is anything to transform!
        // TODO
        IEditorPart editor = TransformationUtil.getActiveEditor();

        if (editor instanceof XtextEditor) {
            IFile strlFile = (IFile) editor.getEditorInput().getAdapter(IFile.class);

            TransformationUtil.strlToKixsAndOpen(strlFile);
        }

        // create DataComponent and call initialize
        EsterelToSyncChartDataComponent e2s = null;// = new EsterelToSyncChartDataComponent();
        List<DataComponentWrapper> wrapper = KiemPlugin.getDefault()
                .getDefaultComponentWrapperList();
        for (DataComponentWrapper w : wrapper) {
            System.out.println(w.getDataComponent().getDataComponentId());
            if (w.getDataComponent().getDataComponentId()
                    .startsWith("de.cau.cs.kieler.kies.transformation.Transformation")) {
                e2s = (EsterelToSyncChartDataComponent) w.getDataComponent();
                break;
            }
        }
        // KiemPlugin.getDefault().clearDataComponentWrapperList();
        DataComponentWrapper dataComponentWrapper = KiemPlugin.getDefault()
                .addTodataComponentWrapperList(e2s);
        System.out.println(KiemPlugin.getDefault().getDataComponentWrapperList());

        // dataComponentWrapper.getProperties()[0].setValue("false");

        KiemPlugin.getDefault().initExecution();
        Execution execution = KiemPlugin.getDefault().getExecution();
        if (execution != null) {
            execution.stepExecutionSync();
        }

       // execution.stopExecutionSync();
        // try {
        // KiemPlugin.getDefault().
        // } catch (Exception e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }
    }

}
