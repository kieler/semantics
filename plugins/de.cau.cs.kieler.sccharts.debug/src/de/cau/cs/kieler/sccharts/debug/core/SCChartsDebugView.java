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
package de.cau.cs.kieler.sccharts.debug.core;

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

import de.cau.cs.kieler.sim.kiem.IKiemToolbarContributor;

/**
 * This class uses the contribution extention point of the KIEM view. A new toggle button is added
 * through which the debug mode can be enabled or disabled.
 * 
 * @author lgr
 *
 */
public class SCChartsDebugView implements IKiemToolbarContributor {

    public static final ImageDescriptor DEBUG = AbstractUIPlugin
            .imageDescriptorFromPlugin("de.cau.cs.kieler.sccharts.debug", "icons/debug_exc.png");

    public static final ImageDescriptor DEBUG_INACTIVE = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.sccharts.debug", "icons/debug_exc_inactive.png");

    public static boolean DEBUG_MODE;

    public SCChartsDebugView() {
    }

    /*
     * private Action actionToggleDebugMode; private KiemPlugin kIEMInstance =
     * KiemPlugin.getDefault();
     * 
     * private Action getActionToggleDebugMode() {
     * 
     * if (actionToggleDebugMode != null) { return actionToggleDebugMode; } actionToggleDebugMode =
     * new Action() {
     * 
     * @Override public void run() {
     * 
     * // if ((KiemPlugin.getDefault().getCurrentMaster() != null) // &&
     * KiemPlugin.getDefault().getCurrentMaster().isMasterImplementingGUI()) { // // if a master
     * implements the action // KiemPlugin.getDefault().getCurrentMaster() //
     * .masterGUI(AbstractDataComponent.MASTER_CMD_PAUSE); // // currentMaster.masterGUIpause(); //
     * } else { // // otherwise default implementation // kIEMInstance.resetRequestReRun(true); //
     * if (kIEMInstance.initExecution()) { // kIEMInstance.getExecution().pauseExecutionSync(); // }
     * // }
     * 
     * } }; actionToggleDebugMode.setImageDescriptor(SCChartsDebugView.DEBUG); return
     * actionToggleDebugMode; }
     */

    /**
     * {@inheritDoc}
     */
    @Override
    public ControlContribution[] provideToolbarContributions(Object info) {

        ControlContribution[] result = new ControlContribution[1];
        result[0] = new ControlContribution("debugMode.toggle") {

            @Override
            protected Control createControl(final Composite parent) {

                Button toggleDebug = new Button(parent, SWT.TOGGLE);
                toggleDebug.setSelection(false);
                toggleDebug.setImage(DEBUG.createImage());
                toggleDebug.setBackground(null);
                toggleDebug.addListener(SWT.Selection, new Listener() {
                    @Override
                    public void handleEvent(Event event) {
                        if (toggleDebug.getSelection()) {
                            DEBUG_MODE = true;
                        } else {
                            DEBUG_MODE = false;
                        }
                    }
                });
                return toggleDebug;
            }
        };
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Action[] provideToolbarActions(Object info) {
        return null; // not needed
    }

}
