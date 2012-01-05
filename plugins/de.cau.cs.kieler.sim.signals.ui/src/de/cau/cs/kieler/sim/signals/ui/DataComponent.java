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

package de.cau.cs.kieler.sim.signals.ui;

import java.util.LinkedList;

import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.json.JSONObject;

import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.signals.JSONSignalValues;
import de.cau.cs.kieler.sim.signals.ui.views.Signal;
import de.cau.cs.kieler.sim.signals.ui.views.SignalList;
import de.cau.cs.kieler.sim.signals.ui.views.SignalsView;

/**
 * The class DataComponent implements a Execution Manager observer DataComponent
 * and in each step plots all signals and their histories.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
public class DataComponent extends JSONObjectDataComponent implements
		IJSONObjectDataComponent {

	/** The id of the view for KIEM. */
	private static final String SIGNALSUIVIEWID = "de.cau.cs.kieler.sim.signals.ui.view";

	/** The Constant MAXIMALTICKS. */
	private static final int MAXIMALTICKS = 1000;

	/** The maximal ticks. */
	private int maximalTicks = MAXIMALTICKS;

	/** The signal list representing the current history. */
	private SignalList signalList = new SignalList(maximalTicks);

	/** An additional signal list to set or append. */
	private SignalList additionalSignalList = null;

	// -------------------------------------------------------------------------

	public DataComponent() {
	}

	// -------------------------------------------------------------------------

	/**
	 * Sets an additional signal list. Use cases are the comparison of signals.
	 * Note that newer computations may override older signals that may appear
	 * in this list if they have the same name. To prevent this, ensure unique
	 * signal names.
	 * 
	 * @param additionalSignalList
	 *            the new additional signal list
	 */
	public void setAdditionalSignalList(LinkedList<Signal> additionalSignalList) {
		this.additionalSignalList = new SignalList(additionalSignalList,
				maximalTicks);
	}

	// -------------------------------------------------------------------------

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.cau.cs.kieler.sim.kiem.IDataComponent#initialize()
	 */
	@Override
	public void initialize() throws KiemInitializationException {
		// bring view to front
		bringToFront();

		// clear signalList
		this.signalList.clear();

		// if there are additional signals then append them now
		if (additionalSignalList != null) {
			this.signalList.appendClonedSignalList(additionalSignalList);
		}

		// consider global variable initializations
		try {
			step(this.getInitialVariables());
		} catch (KiemExecutionException e) {
			throw new KiemInitializationException(
					"Considering global variable initializations failed",
					false, e);
		}

		// SignalsView.getInstance().setSignalDataComponent(this);
	}

	// -------------------------------------------------------------------------

	/**
	 * Gets the signal list.
	 * 
	 * @return the signal list
	 */
	public SignalList getSignalList() {
		return signalList;
	}

	// -------------------------------------------------------------------------

	/**
	 * Gets the setting for the maximal ticks.
	 * 
	 * @return the maximal ticks
	 */
	public int getMaximalTicks() {
		return this.maximalTicks;
	}

	// -------------------------------------------------------------------------

	@Override
	public void wrapup() throws KiemInitializationException {
		// SignalsView.getInstance().setSignalDataComponent(null);
		signalList.clear();
		// update signal list
		SignalsView.getInstance().setSignalList(signalList);
		// asynchronous refresh
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				SignalsView.getInstance().refresh(getTick());
			}
		});
	}

	// -------------------------------------------------------------------------

	@Override
	public boolean isProducer() {
		return false;
	}

	// -------------------------------------------------------------------------

	@Override
	public boolean isObserver() {
		return true;
	}

	// -------------------------------------------------------------------------

	/**
	 * Gets the current KIEM tick.
	 * 
	 * @return the tick
	 */
	public long getTick() {
		long tick = 0;
		if (KiemPlugin.getDefault() != null) {
			if (KiemPlugin.getDefault().getExecution() != null) {
				tick = KiemPlugin.getDefault().getExecution().getSteps();
			}
		}
		return tick;
	}

	// -------------------------------------------------------------------------

	@Override
	public JSONObject step(JSONObject jSONObject) throws KiemExecutionException {

		try {
			String[] fieldNames = JSONObject.getNames(jSONObject);
			if (fieldNames != null) {
				for (int c = 0; c < fieldNames.length; c++) {
					// extract key, value from JSONObject
					Object obj = jSONObject.get(fieldNames[c]);
					String name = fieldNames[c];
					boolean isPresent = false; // default
					boolean isSignal = false;
					if (obj instanceof JSONObject) {
						// can be a signal
						isPresent = JSONSignalValues
								.isPresent((JSONObject) obj);
						// extract signal value if any
						if (JSONSignalValues.isSignalValue((JSONObject) obj)) {
							isSignal = true;
							obj = JSONSignalValues
									.getSignalValue((JSONObject) obj);
						}
					}

					// only if this is a synchronous signal
					if (isSignal) {
						System.out.println("");
						if (!signalList.containsSignal(name)) {
							signalList.add(new Signal(name, maximalTicks));
						}
						Signal signal = signalList.getSignal(name);

						// if (!this.isHistoryStep()) {
						long tick = this.getTick();
						signalList.setCurrentTick(tick);
						signal.setPresent(tick, isPresent);
						// }
					}
				}
			}
		} catch (Exception e) {
			// this should not happen
			e.printStackTrace();
		}

		// update signal list
		SignalsView.getInstance().setSignalList(signalList);
		// asynchronous refresh
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				SignalsView.getInstance().refresh(getTick());
			}
		});

		return null;
	}

	// -------------------------------------------------------------------------
	private boolean broughtToFront;

	/**
	 * This method brings the Table view to the front.
	 */
	public void bringToFront() {
		broughtToFront = false;
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				// bring TABLE view to the front (lazy loading)
				try {
					IWorkbenchWindow window = SignalsUIPlugin.getDefault()
							.getWorkbench().getActiveWorkbenchWindow();
					IViewPart vP = window.getActivePage().showView(
							SIGNALSUIVIEWID);
					vP.setFocus();
					// set done flag
					broughtToFront = true;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		while (!broughtToFront) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	public boolean isDeltaObserver() {
		return true;
	}

	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	public boolean isHistoryObserver() {
		return true;
	}

}
