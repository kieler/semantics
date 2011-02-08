package de.cau.cs.kieler.uml2.sim.kiem;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.maude.MaudeInterfacePlugin;
import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONSignalValues;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.execution.TimeoutThread;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeFile;

// TODO: Auto-generated Javadoc
/**
 * The Class DataComponent.
 */
public class DataComponentSim extends DataComponent implements
		IJSONObjectDataComponent {

	/**
	 * The constant MAUDEPARSESTATESTARTER indicates the start token to search
	 * for.
	 */
	// FIXME: the has to be adapted to the new syntax -> check
	//
	private static final String MAUDEPARSESTATESTARTER = "--> maState doneC ("; // FALSCH! "--> maState  doneC (r";

	/** The constant MAUDEERROR indicates the error token to search for. */
	private static final String MAUDEERROR = "*HERE*";

	/** The currently active states. */
	String[] currentStates;

	// -------------------------------------------------------------------------

	/**
	 * Instantiates a new data component.
	 */
	public DataComponentSim() {
		// TODO Auto-generated constructor stub
	}

	// -------------------------------------------------------------------------

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent
	 * #doProvideProperties()
	 */
	@Override
	public KiemProperty[] doProvideProperties() {
		KiemProperty[] properties = new KiemProperty[2];
		KiemPropertyTypeFile maudeFile = new KiemPropertyTypeFile(true);
		properties[0] = new KiemProperty("Maude Executable", maudeFile, "maude");
		properties[1] = new KiemProperty("State Variable", "state");
		return properties;
	}

	// -------------------------------------------------------------------------

	@SuppressWarnings("unchecked")
	/**
	 * Extract the active states.
	 * 
	 * @param maudeResult
	 *            the maude result if any, empty list if no solution found
	 * @return the string[]
	 */
	@Override
	public List<String[]> extractActiveStates(String maudeResult) {
		boolean error = maudeResult.contains(MAUDEERROR);
		LinkedList activeStatesChoices = new LinkedList();
		// if maude result contains error, use the old current states
		if (error) {
			activeStatesChoices.add(activeStatesChoices);
			return activeStatesChoices;
		}

		boolean foundAnotherSolution = true;

		while (foundAnotherSolution) {
			try {
				int firstSolutionStartIndex = maudeResult
						.indexOf(MAUDEPARSESTATESTARTER);

				// check if solution is found
				if (firstSolutionStartIndex < 0) {
					foundAnotherSolution = false;
					break;
				}

				// part result
				String maudePartResult = maudeResult
						.substring(firstSolutionStartIndex
								+ MAUDEPARSESTATESTARTER.length());

				// remainder (may contain previous solutions)
				maudeResult = maudeResult.substring(firstSolutionStartIndex
						+ MAUDEPARSESTATESTARTER.length());

				// FIXME: this has to be adapted to the new syntax
				/*
				 * Maude output looks like this:
				 * 
				 * search in INIT : maState "UML" $stableC prettyVerts
				 * (T461729046, R-768353767) empty ee3 =>* mastate such that
				 * isDone mastate = true .
				 * 
				 * Solution 1 (state 3) states: 4 rewrites: 65 in 6597516000ms
				 * cpu (0ms real) (0 rewrites/second) mastate --> maState "UML"
				 * $doneC (C "T461729046", root R "R-768353767") empty empty
				 * 
				 * Solution 2 (state 3) states: 4 rewrites: 65 in 6597516000ms
				 * cpu (0ms real) (0 rewrites/second) mastate --> maState "UML"
				 * $doneC (C "T461729046", root R "R-768353767") empty empty
				 * 
				 * No more solutions. states: 4 rewrites: 65 in 6597516000ms cpu
				 * (0ms real) (0 rewrites/second)
				 * 
				 * 
				 * =========== new syntax:  START "--> maState  doneC (r"
				 * 
				 * search in INIT : maState stableC (State0-885791716,
				 * R-2027565592) empty a =>* mastate such that isDone mastate =
				 * (true).Bool . 
				 * 
				 * Solution 1 (state 18) states: 19 rewrites: 7169 in 9341596000ms cpu (139ms real) (0
				 * rewrites/second) mastate --> maState doneC (root R
				 * "R-2027565592", root R "R-2027565592" : C
				 * "State8--772141864", root R "R-2027565592" : C
				 * "State8--772141864" : R "R1009037042", root R "R-2027565592"
				 * : C "State8--772141864" : R "R236686905", root R
				 * "R-2027565592" : C "State8--772141864" : R "R1009037042" : C
				 * "State9--1326027058", root R "R-2027565592" : C
				 * "State8--772141864" : R "R236686905" : C
				 * "State12--599864602") empty a
				 * 
				 * 
				 * Solution 2 (state 21) states: 22 rewrites: 7493 in
				 * 9341596000ms cpu (142ms real) (0 rewrites/second) mastate -->
				 * maState doneC (root R "R-2027565592", root R "R-2027565592" :
				 * C "State8--772141864", root R "R-2027565592" : C
				 * "State8--772141864" : R "R1009037042", root R "R-2027565592"
				 * : C "State8--772141864" : R "R236686905", root R
				 * "R-2027565592" : C "State8--772141864" : R "R1009037042" : C
				 * "State9--1326027058", root R "R-2027565592" : C
				 * "State8--772141864" : R "R236686905" : C
				 * "State12--599864602") (historyconf root R "R-2027565592"
				 * (root R "R-2027565592" : C "State8--772141864") , historyconf
				 * root R "R-2027565592" : C "State8--772141864" : R
				 * "R1009037042" ( root R "R-2027565592" : C "State8--772141864"
				 * : R "R1009037042" : C "State9--1326027058") , historyconf
				 * root R "R-2027565592" : C "State8--772141864" : R
				 * "R236686905" ( root R "R-2027565592" : C "State8--772141864"
				 * : R "R236686905" : C "State12--599864602") ) a
				 */

				LinkedList<String> stringList = new LinkedList<String>();

				boolean consuming = false;
				String consumedPart = "";
				for (int c = 0; c < maudePartResult.length(); c++) {
					String character = maudePartResult.substring(c, c + 1);
					if (character.equals("\"")) {
						consuming = !consuming;
						if (!consuming) {
							stringList.add(consumedPart);
							consumedPart = "";
						}
						// do not consume "-character
						continue;
					}
					if (character.equals(")")) {
						break;
					}
					if (consuming) {
						consumedPart += character;
					}
				}

				activeStatesChoices.add(stringList.toArray(new String[0]));
			} catch (Exception e) {
				// do nothing
			}
		} // end while

		return activeStatesChoices;
	}

	// -------------------------------------------------------------------------

	/**
	 * Extract actions.
	 * 
	 * @param maudeResult
	 *            the maude result
	 * @return the string[]
	 */
	@Override
	public String[] extractActions(final String maudeResult) {
		// TODO: this seems not yet possible.
		String[] returnArray = new String[1];
		return returnArray;
	}

	// -------------------------------------------------------------------------

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent
	 * #doStep(org.json .JSONObject)
	 */
	@Override
	public JSONObject doStep(final JSONObject signals)
			throws KiemExecutionException {
		// the return object to construct
		JSONObject returnObj = new JSONObject();

		// build query string ---
		// first collect events
		String triggerEventsQuery = "";
		String[] signalNames = JSONObject.getNames(signals);
		if (signalNames != null) {
			for (String signalName : signalNames) {
				try {
					Object object;
					object = signals.get(signalName);
					if (JSONSignalValues.isPresent(object)) {
						if (!triggerEventsQuery.isEmpty()) {
							triggerEventsQuery += ",";
						}
						triggerEventsQuery += signalName;
					}
				} catch (JSONException e) {
					// ignore errors - should not happen at all
				}
			}
		}
		// if no events selected, produce this dummy event for maude
		if (triggerEventsQuery.equals("")) {
			triggerEventsQuery = "ev: \"noevent\"";
		}

		// second build the current states
		String currentStatesQuery = "";
		for (String currentState : currentStates) {
			if (!currentStatesQuery.isEmpty()) {
				currentStatesQuery += ",";
			}
			currentStatesQuery += currentState;
		}

		// FIXME: this has to be adapted to the new synatx
		// search (maState (stableC (prettyVerts (R-990928836 ,
		// susp441237549)) empty) (res,
		// ee1)) =>* mastate such that isDone mastate .
		String queryRequest = "search (maState (stableC (" + currentStatesQuery
				+ ") empty) (" + triggerEventsQuery
				+ ")) =>* mastate such that isDone mastate . \n";

		// Debug output query request
		printConsole(queryRequest);

		String result = "";
		try {
			result = MaudeInterfacePlugin.getDefault().queryMaude(queryRequest,
					maudeSessionId);
		} catch (Exception e) {
			throw new KiemExecutionException(
					"A Maude simulation error occurred.", false, e);
		}

		// Debug output query result
		printConsole(result);

		// interpret resulting states
		List<String[]> currentStatesChoices = extractActiveStates(result);

		if (currentStatesChoices.size() == 1) {
			currentStates = currentStatesChoices.get(0);
		}
		if (currentStatesChoices.size() > 1) {
			currentStates = selectCurrentState(currentStatesChoices);
		}
		// else
		// currentStates don't change

		// the stateName is the second KIEM property
		String stateName = this.getProperties()[2].getValue();
		try {
			returnObj.accumulate(stateName, getCurrentStateIds(currentStates));
		} catch (Exception e) {
			// ignore any errors
			e.printStackTrace();
		}
		
		System.out.println("BLAAAAAAAAAAAAAAAAAAAAKOTZ");

		// no actions can be extracted so far
		return returnObj;
	}

	// -------------------------------------------------------------------------

	private boolean flagDialogDone = false;
	private List<String[]> currentStatesChoices;
	private String[] currentStatesSelected;

	@Override
	public String[] selectCurrentState(
			final List<String[]> currentStatesChoicesParam) {
		flagDialogDone = false;
		currentStatesChoices = currentStatesChoicesParam;
		// this is also the default case if nothing is selected of canceled
		currentStatesSelected = currentStatesChoices.get(0);

		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				// Disable timeout
				TimeoutThread.setAwaitUserRepsonse(true);

				Shell currentShell = PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getShell();
				SelectTraceDialog dialog = new SelectTraceDialog(currentShell,
						"Select an execution trace");

				// build list to display
				LinkedList<String> displayList = new LinkedList<String>();
				for (String[] choice : currentStatesChoices) {
					String currentLine = "";
					for (String state : choice) {
						if (currentLine.length() != 0) {
							currentLine += ", ";
						}
						currentLine += state;
					}
					displayList.add(currentLine);
				}

				dialog.setComponentList(displayList);
				dialog.setBlockOnOpen(true);
				dialog.setForbiddenComponentList(new LinkedList<String>());

				if (dialog.open() == WizardDialog.OK) {
					try {
						currentStatesSelected = currentStatesChoices.get(dialog
								.getSelectedIndex());
					} catch (Exception e) {
						// go with the default
					}
				}
				// MUST eisable timeout again
				TimeoutThread.setAwaitUserRepsonse(false);

				flagDialogDone = true;
			}
		});

		while (!flagDialogDone) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
		}

		// we now have the user choose
		return currentStatesSelected;
	}

	// -------------------------------------------------------------------------

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent
	 * #initialize()
	 */
	@Override
	public void initialize() throws KiemInitializationException {
		String pathToMaude = this.getProperties()[1].getValue();

		String pathToMaudeCode = getMaudeGenCodeLocation();
		if (isWindows()) {
			pathToMaudeCode = transformToCygwinPath(pathToMaudeCode);
		}

		// reset the mapping
		resetMappingHashmap();

		// clear the maude console
		clearConsole();

		// initialize with initial states (and regions)
		currentStates = getInitialStates();

		maudeSessionId = MaudeInterfacePlugin.getDefault().createMaudeSession(
				pathToMaude, pathToMaudeCode);
		try {
			MaudeInterfacePlugin.getDefault().startMaudeSession(maudeSessionId);
			printConsole(MaudeInterfacePlugin.getDefault().queryMaude(null,
					1000, maudeSessionId));
		} catch (Exception e) {
			throw new KiemInitializationException(
					"Cannot start Maude. Plase make sure that the paths are "
							+ "set correctly in the KIEM parameters of the simulator"
							+ " component.", true, e);
		}
	}

	// -------------------------------------------------------------------------

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.cau.cs.kieler.sim.kiem.IDataComponent#wrapup()
	 */
	@Override
	public void wrapup() throws KiemInitializationException {
		MaudeInterfacePlugin.getDefault().closeMaudeSession(maudeSessionId);

	}

	// -------------------------------------------------------------------------

}
