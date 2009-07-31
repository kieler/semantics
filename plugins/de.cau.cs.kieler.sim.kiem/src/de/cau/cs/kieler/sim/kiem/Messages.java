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
 * 
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
	public static String TimingResultsTitle;
	public static String AddDataComponentTitle;
	
	public static String ObserverDataComponent;
	public static String ObserverProducerDataComponent;
	public static String ProducerDataComponent;
	public static String InitializationDataComponent;
	
	public static String TableComponentName;
	public static String TableValue;
	public static String TableEnabled;
	public static String TableType;
	public static String TableMaster;
	public static String TableComponentNameKey;
	public static String TableHintComponentName;
	public static String TableHintValue;
	public static String TableHintEnabled;
	public static String TableHintType;
	public static String TableHintMaster;
	public static String TableHintComponentNameKey;
	
	public static String ActionDisable;
	public static String ActionHintDisable;
	public static String ActionEnable;
	public static String ActionHintEnable;
	
	public static String ActionAdd;
	public static String ActionHintAdd;
	public static String ActionDelete;
	public static String ActionHintDelete;
	
	public static String ActionUp;
	public static String ActionHintUp;
	public static String ActionDown;
	public static String ActionHintDown;
	
	public static String ActionStep;
	public static String ActionHintStep;
	public static String ActionStepBack;
	public static String ActionHintStepBack;
	public static String ActionMacroStep;
	public static String ActionHintMacroStep;
	public static String ActionPause;
	public static String ActionHintPause;
	public static String ActionRun;
	public static String ActionHintRun;
	public static String ActionStop;
	public static String ActionHintStop;
	
	public static String TimingResultsNumberOfSteps;
	public static String TimingResultsOverallExecutionTime; 
	public static String TimingResultsAimedStepDuration; 
	public static String TimingResultsMinimumStepDuration; 
	public static String TimingResultsWheightedAverageStepDuration; 
	public static String TimingResultsAverageStepDuration; 
	public static String TimingResultsMaximumStepDuration;
	
	public static String StepTextFieldName;
	public static String StepTextFieldHint;
	public static String StepTextFieldReserveSpace;
	public static String StepTextFieldNoStep;
	
	public static String DurationTextFieldName;
	public static String DurationTextFieldHint;
	public static String DurationTextFieldReserveSpace;
	public static String DurationTextFieldSuffix;

	public static String WarningDurationTooSmall;
	public static String WarningDurationTooLarge;
	public static String WarningAtMostOneMaster;
	public static String WarningLoadingDataComponent;
	
	public static String ErrorKiemMasterException;
	public static String ErrorTimeoutExecution;
	public static String ErrorNoDataProducer;
	public static String ErrorNoDataObserver;
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	/**
	 * Instantiates the messages class.
	 */
	public Messages() {
	}
}
