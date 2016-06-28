/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.debug.ui;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ControlContribution;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import de.cau.cs.kieler.sccharts.debug.DataComponent;
import de.cau.cs.kieler.sccharts.debug.SCChartsDebugPlugin;
import de.cau.cs.kieler.sim.kiem.IKiemToolbarContributor;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.config.managers.ScheduleManager;

/**
 * This class uses the contribution extention point of the KIEM view. A new toggle button is added
 * through which the debug mode can be enabled or disabled.
 * 
 * @author lgr
 *
 */
public class ViewDebugContributor implements IKiemToolbarContributor {

    public static final ImageDescriptor DEBUG = AbstractUIPlugin
            .imageDescriptorFromPlugin("de.cau.cs.kieler.sccharts.debug", "icons/debug_exc.png");

    public static final ImageDescriptor FAST_FORWARD = AbstractUIPlugin
            .imageDescriptorFromPlugin("de.cau.cs.kieler.sccharts.debug", "icons/fastForward.png");

    public static final String CONTRIBUTION_ID = "Debugging";

    public static Button buttonDebug; 
    public static Button buttonFastForward;

    /**
     * {@inheritDoc}
     */
    @Override
    public ControlContribution[] provideToolbarContributions(Object info) {
        ControlContribution[] result = new ControlContribution[2];

        result[0] = new ControlContribution(CONTRIBUTION_ID) {
            @Override
            protected Control createControl(final Composite parent) {
                createDebugButton(parent);
                return buttonDebug;
            }
        };

        result[1] = new ControlContribution(CONTRIBUTION_ID) {
            @Override
            protected Control createControl(final Composite parent) {
                createFastForwardButton(parent);
                return buttonFastForward;
            }
        };

        return result;
    }

    private void createDebugButton(final Composite parent) {
        buttonDebug = new Button(parent, SWT.TOGGLE);
        buttonDebug.setSelection(DataComponent.DEBUG_MODE);
        buttonDebug.setImage(DEBUG.createImage());
        buttonDebug.setBackground(null);
        buttonDebug.addListener(SWT.Selection, new Listener() {
            @Override
            public void handleEvent(Event event) {
                if (buttonDebug.getSelection()) {
                    DataComponent.DEBUG_MODE = true;
                    buttonFastForward.setEnabled(true);
                } else {
                    DataComponent.DEBUG_MODE = false;
                    buttonFastForward.setEnabled(false);

                }
                SCChartsDebugPlugin.getDefault().scheduleDefaultDebugExecution();
            }
        });
    }

    private void createFastForwardButton(final Composite parent) {
        buttonFastForward = new Button(parent, SWT.TOGGLE);
        buttonFastForward.setSelection(DataComponent.FAST_FORWARD);
        buttonFastForward.setImage(FAST_FORWARD.createImage());
        buttonFastForward.setBackground(null);
        buttonFastForward.addListener(SWT.Selection, new Listener() {
            private int oldStepDuration = KiemPlugin.AIMED_STEP_DURATION_DEFAULT;
            @Override
            public void handleEvent(Event event) {
                if (buttonFastForward.getSelection()) {
                    DataComponent.FAST_FORWARD = true;
                    oldStepDuration = KiemPlugin.getDefault().getAimedStepDuration();
                    KiemPlugin.getDefault().setAimedStepDuration(0);
                } else {
                    DataComponent.FAST_FORWARD = false;
                    KiemPlugin.getDefault().setAimedStepDuration(oldStepDuration);
                }
            }
        });
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Action[] provideToolbarActions(Object info) {
        return null; // not needed
    }

}
