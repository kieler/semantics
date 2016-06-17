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

import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.LineBreakpoint;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.sccharts.Transition;
import de.cau.cs.kieler.sccharts.debug.SCChartsDebugPlugin;
import de.cau.cs.kieler.sccharts.debug.ui.presentation.SCChartsDebugModelPresentation;
import de.cau.cs.kieler.sim.kiem.IKiemEventListener;
import de.cau.cs.kieler.sim.kiem.KiemEvent;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kivi.KiViDataComponent;

/**
 * @author lgr
 *
 */
public class SCChartsDebugEventListener implements IKiemEventListener {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void notifyEvent(KiemEvent event) {
		if (event.isEvent(KiemEvent.STEP_DONE)) {
			if (SCChartsDebugPlugin.DEBUG_MODE && KiemPlugin.getDefault().getExecution().isRunning()) {
				List<EObject> statesAndTransitions = KiViDataComponent.activeStatesAndTransitions;
				for (EObject elem : statesAndTransitions) {
					if (elem instanceof Transition) {
						if (SCChartsDebugPlugin.checkTransitionequalsLine((Transition) elem)) {
							if (KiemPlugin.getDefault().initExecution()) {
								KiemPlugin.getDefault().getExecution().pauseExecutionSync();
								break;
							}
						}
					}
				}

			}

		} else if (event.isEvent(KiemEvent.EXECUTION_START)) {
			SCChartsDebugPlugin.breakpointLines.clear();

			IBreakpoint[] bps = DebugPlugin.getDefault().getBreakpointManager()
					.getBreakpoints(SCChartsDebugModelPresentation.ID);
			for (IBreakpoint b : bps) {
				try {
					SCChartsDebugPlugin.breakpointLines.add(((LineBreakpoint) b).getLineNumber());
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public KiemEvent provideEventOfInterest() {
		int[] events = { KiemEvent.STEP_DONE, KiemEvent.EXECUTION_START };
		return new KiemEvent(events);
	}

}
