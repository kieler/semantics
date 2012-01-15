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

import java.util.HashMap;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.part.ViewPart;

import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.signals.Signal;
import de.cau.cs.kieler.sim.signals.SignalASCIIChartPlotter;
import de.cau.cs.kieler.sim.signals.SignalASCIITimeLinePlotter;
import de.cau.cs.kieler.sim.signals.SignalList;
import de.cau.cs.kieler.sim.signals.ui.SignalsUIPlugin;

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

	/** The action to toggle colors. */
	private Action actionToggleColors;

	/** The action to toggle mode. */
	private Action actionToggleMode;

	/** The signals plotter. */
	private SignalsPlotter signalsPlotter;

	/** The signals view instance. */
	private static SignalsView signalsViewInstance = null;

	/** The maximal number of ticks. */
	private final long MAXIMALTICKS = 250;
	
	/** The signal list. */
	private SignalList signalList = new SignalList(MAXIMALTICKS);

	/** The signal view colors. */
	private Colors colors = new Colors();
	
	/** The nondefault signal view colors. This is the second color scheme */
	private final RGB NONDEFAULTBACKGROUNDCOLOR = new RGB(255, 255, 255); // white
	private final RGB NONDEFAULTSIGNALCOLOR2 = new RGB(0, 0, 150); // dark blue
	private final RGB NONDEFAULTSIGNALCOLOR0 = new RGB(230, 230, 230); // light gray
	private final RGB NONDEFAULTSIGNALCOLORMARKER = new RGB(200, 0, 0); // dark red	

	/**
	 * The default color scheme flag. The default color scheme has the black
	 * background the other has a white background.
	 */
	private boolean defaultColorScheme = true;

	/** The default mode flag. The default mode has a line for each signal. */
	private boolean defaultMode = true;
	
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

//		colors.setSignalColor("S2", new RGB(0, 255, 0));

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
		this.signalList.setMaximalTicks(MAXIMALTICKS);
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
		this.signalList.setMaximalTicks(MAXIMALTICKS);
		this.signalsPlotter.setSignalList(signalList);
		this.signalsPlotter.plot(zoomLevel, colors, defaultMode);
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
		toolBarManager.add(getActionSaveAs());
		toolBarManager.add(new Separator());
		toolBarManager.add(getActionToggleMode());
		toolBarManager.add(getActionToggleColors());
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
				signalsPlotter.plot(zoomLevel, colors, defaultMode);
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
				signalsPlotter.plot(zoomLevel, colors, defaultMode);
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
				signalsPlotter.plot(zoomLevel, colors, defaultMode);
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
						if (defaultMode) {
							new SignalASCIIChartPlotter().plotToTextFile(
									dlg.getResult(), signalList);
						}
						else {
							new SignalASCIITimeLinePlotter().plotToTextFile(
									dlg.getResult(), signalList);
							
						}
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

	// -------------------------------------------------------------------------

	/**
	 * Gets the action to toggle the color scheme.
	 * 
	 * @return the action to toggle the color scheme
	 */
	private Action getActionToggleColors() {
		if (actionToggleColors != null) {
			return actionToggleColors;
		}
		actionToggleColors = new Action("", IAction.AS_CHECK_BOX) {
			public void run() {
				defaultColorScheme = !defaultColorScheme;
				if (defaultColorScheme) {
					Colors tmpColors = new Colors();
					colors.setBackgroundColor(tmpColors.getBackgroundColor());
					colors.setSignalColor2(tmpColors.getSignalColor2());
					colors.setSignalColorMarker(tmpColors.getSignalColorMarker());
					colors.setSignalSpareColor(tmpColors.getSignalSpareColor());
				}
				else {
					colors.setBackgroundColor(NONDEFAULTBACKGROUNDCOLOR);
					colors.setSignalColor2(NONDEFAULTSIGNALCOLOR2);
					colors.setSignalColorMarker(NONDEFAULTSIGNALCOLORMARKER);
					colors.setSignalSpareColor(NONDEFAULTSIGNALCOLOR0);
				}
				signalsPlotter.plot(zoomLevel, colors, defaultMode);
			}
		};
		actionToggleColors.setText("Toggle Colors");
		actionToggleColors.setToolTipText("Toggle Colors");
		actionToggleColors.setImageDescriptor(SignalsUIPlugin
				.getImageDescriptor("icons/togglecolors.png"));
		return actionToggleColors;
	}

	// -------------------------------------------------------------------------

	/**
	 * Gets the action to toggle the color scheme.
	 * 
	 * @return the action to toggle the color scheme
	 */
	private Action getActionToggleMode() {
		if (actionToggleMode != null) {
			return actionToggleMode;
		}
		actionToggleMode = new Action("", IAction.AS_CHECK_BOX) {
			public void run() {
				defaultMode = !defaultMode;
				signalsPlotter.plot(zoomLevel, colors, defaultMode);
			}
		};
		actionToggleMode.setText("Toggle Timeline Mode");
		actionToggleMode.setToolTipText("Toggle Timeline Mode");
		actionToggleMode.setImageDescriptor(SignalsUIPlugin
				.getImageDescriptor("icons/togglemode.png"));
		return actionToggleMode;
	}
	
	// -------------------------------------------------------------------------

	/**
	 * Gets the currently used color settings for this view.
	 * 
	 * @return the colors
	 */
	public Colors getColors() {
		return colors;
	}

	// -------------------------------------------------------------------------

	/**
	 * Sets the used color settings for this view..
	 * 
	 * @param colors
	 *            the new colors
	 */
	public void setColors(Colors colors) {
		this.colors = colors;
		// refresh with new colors
		signalsPlotter.plot(zoomLevel, colors, defaultMode);
	}

	// -------------------------------------------------------------------------

}
