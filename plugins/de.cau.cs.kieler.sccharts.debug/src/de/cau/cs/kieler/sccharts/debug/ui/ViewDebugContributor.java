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
import org.eclipse.ui.plugin.AbstractUIPlugin;

import de.cau.cs.kieler.sccharts.debug.DataComponent;
import de.cau.cs.kieler.sccharts.debug.SCChartsDebugPlugin;
import de.cau.cs.kieler.sim.kiem.IKiemToolbarContributor;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;

/**
 * This class uses the contribution extension point of the KIEM view.
 * 
 * The elements added here are two toggle breakpoint buttons, one to indicate debug mode and one to
 * enable fast forwarding.
 * 
 * @author lgr
 *
 */
public class ViewDebugContributor implements IKiemToolbarContributor {

    /**
     * The icon that represents the debug mode.
     */
    public static final ImageDescriptor DEBUG = AbstractUIPlugin
            .imageDescriptorFromPlugin("de.cau.cs.kieler.sccharts.debug", "icons/debug_exc.png");

    /**
     * The icon that represents fast forwarding.
     */
    public static final ImageDescriptor FAST_FORWARD = AbstractUIPlugin
            .imageDescriptorFromPlugin("de.cau.cs.kieler.sccharts.debug", "icons/fastForward.png");

    /**
     * The new elements are added with this id.
     */
    public static final String CONTRIBUTION_ID = "Debugging";

    private static Button buttonDebug;
    private static Button buttonFastForward;

    private static boolean buttonDebugSelection = DataComponent.DEBUG_MODE;
    private static boolean buttonFastForwardSelection = DataComponent.FAST_FORWARD;

    private static boolean buttonDebugEnabled = true;
    private static boolean buttonFastForwardEnabled = DataComponent.DEBUG_MODE;

    /**
     * Sets the selection of the debug button according to the debug mode variable. In case the
     * debug button was instantiated its selection is also set accordingly. Additionally the fast
     * forward button is enabled or disabled.
     */
    public static void setButtonDebugSelection() {
        buttonDebugSelection = DataComponent.DEBUG_MODE;
        if (buttonDebug != null) {
            buttonDebug.setSelection(DataComponent.DEBUG_MODE);
        }
        setFastForwardEnable();
    }

    /**
     * Sets the debug buttons availability. If the button has been instantiated, its also
     * enabled/disabled.
     * 
     * @param enabled Indicated whether the button is supposed to be enabled/disabled.
     */
    public static void setButtonDebugEnable(boolean enabled) {
        buttonDebugEnabled = enabled;
        if (buttonDebug != null) {
            buttonDebug.setEnabled(enabled);
        }
    }

    /**
     * Sets whether the fast forward is selected and if the button is instantiated, also sets its
     * selection.
     */
    private static void setFastForwardSelection() {
        buttonFastForwardSelection = DataComponent.FAST_FORWARD;
        if (!(buttonFastForward == null)) {
            buttonFastForward.setSelection(DataComponent.FAST_FORWARD);
        }
    }

    /** 
     * Sets whether the fast forward is enabled and if the button is instantiated, also sets its
     * enable.
     * Can only be enabled, when the debug mode is enabled too. 
     */
    private static void setFastForwardEnable() {
        buttonFastForwardEnabled = DataComponent.DEBUG_MODE;
        if (buttonFastForward != null) {
            buttonFastForward.setEnabled(buttonFastForwardEnabled);
        }
    }

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
    
    /** 
     * Creates the debug Button. 
     * 
     * @param parent
     */
    private void createDebugButton(final Composite parent) {
        buttonDebug = new Button(parent, SWT.TOGGLE);
        buttonDebugSelection = DataComponent.DEBUG_MODE;
        buttonDebug.setSelection(buttonDebugSelection);
        buttonDebug.setImage(DEBUG.createImage());
        buttonDebug.setBackground(null);
        buttonDebug.setEnabled(buttonDebugEnabled);
        buttonDebug.addListener(SWT.Selection, new Listener() {
            @Override
            public void handleEvent(Event event) {
                if (buttonDebug.getSelection()) {
                    DataComponent.DEBUG_MODE = true;
                    setFastForwardEnable();
                } else {
                    DataComponent.DEBUG_MODE = false;
                    DataComponent.FAST_FORWARD = false;
                    setFastForwardEnable();
                    setFastForwardSelection();
                }
                SCChartsDebugPlugin.getDefault().scheduleExecution();
            }
        });
    }

    /** 
     * Created the fast forward button.
     * 
     * @param parent
     */
    private void createFastForwardButton(final Composite parent) {
        buttonFastForward = new Button(parent, SWT.TOGGLE);
        buttonFastForwardSelection = DataComponent.FAST_FORWARD;
        buttonFastForward.setSelection(buttonFastForwardSelection);
        buttonFastForward.setImage(FAST_FORWARD.createImage());
        buttonFastForward.setBackground(null);
        buttonFastForward.setEnabled(buttonFastForwardEnabled);
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
