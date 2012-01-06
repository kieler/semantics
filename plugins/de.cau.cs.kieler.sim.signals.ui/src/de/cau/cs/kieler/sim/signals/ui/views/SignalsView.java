/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sim.signals.ui.views;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.part.ViewPart;

import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.signals.ui.SignalsUIPlugin;

import de.cau.cs.kieler.sim.signals.SignalList;
import de.cau.cs.kieler.sim.signals.Signal;
import de.cau.cs.kieler.sim.signals.SignalASCIIPlotter;

/**
 * The SignalView constructs the actual Eclipse View of the synchronous signal
 * UI.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
public class SignalsView extends ViewPart {

	/** The action for deleting an entry. */
	private Action actionDelete;

	/** The action to zoom in. */
	private Action actionZoomIn;

	/** The action to zoom out. */
	private Action actionZoomOut;

	/** The zoom level. */
	private int zoomLevel = 100;

	/** The action to save as. */
	private Action actionSaveAs;

	/** The signals plotter. */
	private SignalsPlotter signalsPlotter;

	/** The signals view instance. */
	private static SignalsView signalsViewInstance = null;

	/** The signal list. */
	private SignalList signalList = new SignalList();

	// -------------------------------------------------------------------------

	/**
	 * Instantiates a new signals view.
	 */
	public SignalsView() {
		signalsViewInstance = this;
	}

	// -------------------------------------------------------------------------

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets
	 * .Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {

		// instantiate a plotter, and provide data to it.
		signalsPlotter = new SignalsPlotter(parent);

		// update signalList of plotter and plot
		this.refresh(0);

		// add clear button
		contributeToActionBars();
	}

	// -------------------------------------------------------------------------

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
		signalsPlotter.outerScrolledComposite.setFocus();
	}

	// -------------------------------------------------------------------------

	/**
	 * Gets the single instance of SignalsView.
	 * 
	 * @return single instance of SignalsView
	 */
	public static SignalsView getInstance() {
		return signalsViewInstance;
	}

	// -------------------------------------------------------------------------

	/**
	 * Sets the signal list.
	 * 
	 * @param signalList
	 *            the new signal list
	 */
	public void setSignalList(SignalList signalList) {
		this.signalList = signalList;
	}

	// -------------------------------------------------------------------------

	/**
	 * Refresh.
	 * 
	 * @param currentTick
	 *            the current tick
	 */
	public void refresh(long currentTick) {
		signalList.setCurrentTick(currentTick);
		this.signalsPlotter.setSignalList(signalList);
		this.signalsPlotter.plot(zoomLevel);
	}

	// -------------------------------------------------------------------------

	/**
	 * Contribute to the tool bar of this ViewPart.
	 */
	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		IToolBarManager toolBarManager = bars.getToolBarManager();
		toolBarManager.add(getActionZoomIn());
		toolBarManager.add(getActionZoomOut());
		toolBarManager.add(new Separator());
		toolBarManager.add(getActionDelete());
		toolBarManager.add(new Separator());
		toolBarManager.add(getActionSaveAs());
	}

	// -------------------------------------------------------------------------

	/**
	 * Gets the action to delete a variable or signal.
	 * 
	 * @return the action delete
	 */
	private Action getActionDelete() {
		if (actionDelete != null) {
			return actionDelete;
		}
		actionDelete = new Action() {
			public void run() {
				// reset all signals to the same tick, the current tick.
				long tickToResetTo = signalList.getMaxTick();
				for (Signal signal : signalList) {
					signal.clear(tickToResetTo);
				}
				signalsPlotter.plot(zoomLevel);
			}
		};
		actionDelete.setText("Clear History");
		actionDelete.setToolTipText("Clear History");
		actionDelete.setImageDescriptor(SignalsUIPlugin
				.getImageDescriptor("icons/clear.png"));
		return actionDelete;
	}

	// -------------------------------------------------------------------------

	/**
	 * Gets the action to zoom in.
	 * 
	 * @return the action zoom in
	 */
	private Action getActionZoomIn() {
		if (actionZoomIn != null) {
			return actionZoomIn;
		}
		actionZoomIn = new Action() {
			public void run() {
				zoomLevel += 10;
				signalsPlotter.plot(zoomLevel);
			}
		};
		actionZoomIn.setText("Zoom In");
		actionZoomIn.setToolTipText("Zoom In");
		actionZoomIn.setImageDescriptor(SignalsUIPlugin
				.getImageDescriptor("icons/zoomin.png"));
		return actionZoomIn;
	}

	// -------------------------------------------------------------------------

	/**
	 * Gets the action to zoom out.
	 * 
	 * @return the action zoom out
	 */
	private Action getActionZoomOut() {
		if (actionZoomOut != null) {
			return actionZoomOut;
		}
		actionZoomOut = new Action() {
			public void run() {
				if (zoomLevel > 10) {
					zoomLevel -= 10;
				}
				signalsPlotter.plot(zoomLevel);
			}
		};
		actionZoomOut.setText("Zoom Out");
		actionZoomOut.setToolTipText("Zoom Out");
		actionZoomOut.setImageDescriptor(SignalsUIPlugin
				.getImageDescriptor("icons/zoomout.png"));
		return actionZoomOut;
	}

	// -------------------------------------------------------------------------

	/**
	 * Gets the action to save as.
	 * 
	 * @return the action save as
	 */
	private Action getActionSaveAs() {
		if (actionSaveAs != null) {
			return actionSaveAs;
		}
		actionSaveAs = new Action() {
			public void run() {
				Shell shell = Display.getDefault().getActiveShell();
				if (shell != null) {
					SaveAsDialog dlg = new SaveAsDialog(shell);
					dlg.setBlockOnOpen(true);
					dlg.setOriginalName(KiemPlugin.getDefault()
							.getActiveProjectName() + ".txt");
					if (dlg.open() == SaveAsDialog.OK) {
						new SignalASCIIPlotter().plotToTextFile(
								dlg.getResult(), signalList);
					}
				}
			}
		};
		actionSaveAs.setText("Save As");
		actionSaveAs.setToolTipText("Save As");
		actionSaveAs.setImageDescriptor(SignalsUIPlugin
				.getImageDescriptor("icons/saveas.png"));
		return actionSaveAs;
	}

}
