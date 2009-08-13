/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
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
 ******************************************************************************/

package de.cau.cs.kieler.sim.kiem;

import org.eclipse.osgi.util.NLS;

/**
 * The Class Messages is used to externalize strings in the messages.properties
 * file.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
public class Messages extends NLS {
	
	/** The Constant BUNDLE_NAME. */
	private static final String BUNDLE_NAME = "de.cau.cs.kieler.sim.kiem.messages"; //$NON-NLS-1$
	
	/** The extension point jsoncomponent. */
	public static String extensionPointIDjsoncomponent;
	
	/** The extension point stringcomponent. */
	public static String extensionPointIDstringcomponent;
	
	/** The View title. */
	public static String ViewTitle;
	
	/** The Timing results title. */
	public static String TimingResultsTitle;
	
	/** The Add data component title. */
	public static String AddDataComponentTitle;
	
	/** The Observer data component. */
	public static String ObserverDataComponent;
	
	/** The Observer producer data component. */
	public static String ObserverProducerDataComponent;
	
	/** The Producer data component. */
	public static String ProducerDataComponent;
	
	/** The Initialization data component. */
	public static String InitializationDataComponent;
	
	/** The Table component name. */
	public static String TableComponentName;
	
	/** The Table value. */
	public static String TableValue;
	
	/** The Table enabled. */
	public static String TableEnabled;
	
	/** The Table type. */
	public static String TableType;
	
	/** The Table master. */
	public static String TableMaster;
	
	/** The Table component name key. */
	public static String TableComponentNameKey;
	
	/** The Table hint component name. */
	public static String TableHintComponentName;
	
	/** The Table hint value. */
	public static String TableHintValue;
	
	/** The Table hint enabled. */
	public static String TableHintEnabled;
	
	/** The Table hint type. */
	public static String TableHintType;
	
	/** The Table hint master. */
	public static String TableHintMaster;
	
	/** The Table hint component name key. */
	public static String TableHintComponentNameKey;

	/** The Action open. */
	public static String ActionOpen;

	/** The Action hint open. */
	public static String ActionHintOpen;
	
	/** The Execution file extension. */
	public static String ExecutionFileExtension;
	
	/** The Action disable. */
	public static String ActionDisable;
	
	/** The Action hint disable. */
	public static String ActionHintDisable;
	
	/** The Action enable. */
	public static String ActionEnable;
	
	/** The Action hint enable. */
	public static String ActionHintEnable;
	
	/** The Action add. */
	public static String ActionAdd;
	
	/** The Action hint add. */
	public static String ActionHintAdd;
	
	/** The Action delete. */
	public static String ActionDelete;
	
	/** The Action hint delete. */
	public static String ActionHintDelete;
	
	/** The Action up. */
	public static String ActionUp;
	
	/** The Action hint up. */
	public static String ActionHintUp;
	
	/** The Action down. */
	public static String ActionDown;
	
	/** The Action hint down. */
	public static String ActionHintDown;
	
	/** The Action step. */
	public static String ActionStep;
	
	/** The Action hint step. */
	public static String ActionHintStep;

	/** The Action run user. */
	public static String ActionRunUser;
	
	/** The Action hint run user. */
	public static String ActionHintRunUser;

	/** The Action run user dialog title. */
	public static String ActionRunUserDialogTitle;
	
	/** The Action run user dialog text. */
	public static String ActionRunUserDialogText;
	
	/** The Action user defined step. */
	public static String ActionStepUser;
	
	/** The Action hint user defined step. */
	public static String ActionHintStepUser;

	/** The Action step user dialog title. */
	public static String ActionStepUserDialogTitle;
	
	/** The Action step user dialog text. */
	public static String ActionStepUserDialogText;
	
	/** The Action step forward most current. */
	public static String ActionStepFMC;
	
	/** The Action hint step forward most current. */
	public static String ActionHintStepFMC;

	/** The Action step back. */
	public static String ActionStepBack;
	
	/** The Action hint step back. */
	public static String ActionHintStepBack;
	
	/** The Action macro step. */
	public static String ActionMacroStep;
	
	/** The Action hint macro step. */
	public static String ActionHintMacroStep;
	
	/** The Action pause. */
	public static String ActionPause;
	
	/** The Action hint pause. */
	public static String ActionHintPause;
	
	/** The Action run. */
	public static String ActionRun;
	
	/** The Action hint run. */
	public static String ActionHintRun;
	
	/** The Action stop. */
	public static String ActionStop;
	
	/** The Action hint stop. */
	public static String ActionHintStop;
	
	/** The Timing results number of steps. */
	public static String TimingResultsNumberOfSteps;
	
	/** The Timing results overall execution time. */
	public static String TimingResultsOverallExecutionTime; 
	
	/** The Timing results aimed step duration. */
	public static String TimingResultsAimedStepDuration; 
	
	/** The Timing results minimum step duration. */
	public static String TimingResultsMinimumStepDuration; 
	
	/** The Timing results wheighted average step duration. */
	public static String TimingResultsWheightedAverageStepDuration; 
	
	/** The Timing results average step duration. */
	public static String TimingResultsAverageStepDuration; 
	
	/** The Timing results maximum step duration. */
	public static String TimingResultsMaximumStepDuration;
	
	/** The Step text field name. */
	public static String StepTextFieldName;
	
	/** The Step text field hint. */
	public static String StepTextFieldHint;
	
	/** The Step text field reserve space. */
	public static String StepTextFieldReserveSpace;
	
	/** The Step text field no step. */
	public static String StepTextFieldNoStep;
	
	/** The Duration text field name. */
	public static String DurationTextFieldName;
	
	/** The Duration text field hint. */
	public static String DurationTextFieldHint;
	
	/** The Duration text field reserve space. */
	public static String DurationTextFieldReserveSpace;
	
	/** The Duration text field suffix. */
	public static String DurationTextFieldSuffix;

	/** The Warning duration too small. */
	public static String WarningDurationTooSmall;
	
	/** The Warning duration too large. */
	public static String WarningDurationTooLarge;
	
	/** The Warning at most one master. */
	public static String WarningAtMostOneMaster;
	
	/** The Warning loading data component. */
	public static String WarningLoadingDataComponent;
	
	/** The Error kiem master exception. */
	public static String ErrorKiemMasterException;
	
	/** The Error timeout execution. */
	public static String ErrorTimeoutExecution;
	
	/** The Error no data producer. */
	public static String ErrorNoDataProducer;
	
	/** The Error no data observer. */
	public static String ErrorNoDataObserver;
	
	/** The Error open during execution. */
	public static String ErrorOpenDuringExecution;
	
	//-------------------------------------------------------------------------
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	//-------------------------------------------------------------------------
	
	/**
	 * Instantiates the messages class.
	 */
	public Messages() {
	}
}
