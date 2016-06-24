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
import de.cau.cs.kieler.sim.kiem.config.managers.ScheduleManager;

/**
 * This class uses the contribution extention point of the KIEM view. A new
 * toggle button is added through which the debug mode can be enabled or
 * disabled.
 * 
 * @author lgr
 *
 */
public class ViewDebugContributor implements IKiemToolbarContributor {

	public static final ImageDescriptor DEBUG = AbstractUIPlugin
			.imageDescriptorFromPlugin("de.cau.cs.kieler.sccharts.debug", "icons/debug_exc.png");

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
				toggleDebug.setSelection(DataComponent.DEBUG_MODE);
				toggleDebug.setImage(DEBUG.createImage());
				toggleDebug.setBackground(null);
				toggleDebug.addListener(SWT.Selection, new Listener() {
					@Override
					public void handleEvent(Event event) {
						if (toggleDebug.getSelection()) {
						    DataComponent.DEBUG_MODE = true;
						} else {
						    DataComponent.DEBUG_MODE = false;
						}
						SCChartsDebugPlugin.getDefault().scheduleDefaultDebugExecution();
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
