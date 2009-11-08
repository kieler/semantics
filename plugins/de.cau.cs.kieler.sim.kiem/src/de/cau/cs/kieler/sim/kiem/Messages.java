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

package de.cau.cs.kieler.sim.kiem;

import org.eclipse.osgi.util.NLS;

/**
 * The Class Messages is used to externalize strings in the messages.properties file.
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
    public static String mViewTitle;

    /** The Timing results title. */
    public static String mTimingResultsTitle;

    /** The Add data component title. */
    public static String mAddDataComponentTitle;

    /** The Observer data component. */
    public static String mObserverDataComponent;

    /** The Observer producer data component. */
    public static String mObserverProducerDataComponent;

    /** The Producer data component. */
    public static String mProducerDataComponent;

    /** The Initialization data component. */
    public static String mInitializationDataComponent;

    /** The Table component name. */
    public static String mTableComponentName;

    /** The Table value. */
    public static String mTableValue;

    /** The Table enabled. */
    public static String mTableEnabled;

    /** The Table type. */
    public static String mTableType;

    /** The Table master. */
    public static String mTableMaster;

    /** The Table component name key. */
    public static String mTableComponentNameKey;

    /** The Table hint component name. */
    public static String mTableHintComponentName;

    /** The Table hint value. */
    public static String mTableHintValue;

    /** The Table hint enabled. */
    public static String mTableHintEnabled;

    /** The Table hint type. */
    public static String mTableHintType;

    /** The Table hint master. */
    public static String mTableHintMaster;

    /** The Table hint component name key. */
    public static String mTableHintComponentNameKey;

    /** The Action open. */
    public static String mActionOpen;

    /** The Action hint open. */
    public static String mActionHintOpen;

    /** The Execution file extension. */
    public static String mExecutionFileExtension;

    /** The Action disable. */
    public static String mActionDisable;

    /** The Action hint disable. */
    public static String mActionHintDisable;

    /** The Action enable. */
    public static String mActionEnable;

    /** The Action hint enable. */
    public static String mActionHintEnable;

    /** The Action add. */
    public static String mActionAdd;

    /** The Action hint add. */
    public static String mActionHintAdd;

    /** The Action delete. */
    public static String mActionDelete;

    /** The Action hint delete. */
    public static String mActionHintDelete;

    /** The Action up. */
    public static String mActionUp;

    /** The Action hint up. */
    public static String mActionHintUp;

    /** The Action down. */
    public static String mActionDown;

    /** The Action hint down. */
    public static String mActionHintDown;

    /** The Action step. */
    public static String mActionStep;

    /** The Action hint step. */
    public static String mActionHintStep;

    /** The Action run user. */
    public static String mActionRunUser;

    /** The Action hint run user. */
    public static String mActionHintRunUser;

    /** The Action run user dialog title. */
    public static String mActionRunUserDialogTitle;

    /** The Action run user dialog text. */
    public static String mActionRunUserDialogText;

    /** The Action user defined step. */
    public static String mActionStepUser;

    /** The Action hint user defined step. */
    public static String mActionHintStepUser;

    /** The Action step user dialog title. */
    public static String mActionStepUserDialogTitle;

    /** The Action step user dialog text. */
    public static String mActionStepUserDialogText;

    /** The Action step forward most current. */
    public static String mActionStepFMC;

    /** The Action hint step forward most current. */
    public static String mActionHintStepFMC;

    /** The Action step back. */
    public static String mActionStepBack;

    /** The Action hint step back. */
    public static String mActionHintStepBack;

    /** The Action macro step. */
    public static String mActionMacroStep;

    /** The Action hint macro step. */
    public static String mActionHintMacroStep;

    /** The Action pause. */
    public static String mActionPause;

    /** The Action hint pause. */
    public static String mActionHintPause;

    /** The Action run. */
    public static String mActionRun;

    /** The Action hint run. */
    public static String mActionHintRun;

    /** The Action stop. */
    public static String mActionStop;

    /** The Action hint stop. */
    public static String mActionHintStop;

    /** The Timing results number of steps. */
    public static String mTimingResultsNumberOfSteps;

    /** The Timing results overall execution time. */
    public static String mTimingResultsOverallExecutionTime;

    /** The Timing results aimed step duration. */
    public static String mTimingResultsAimedStepDuration;

    /** The Timing results minimum step duration. */
    public static String mTimingResultsMinimumStepDuration;

    /** The Timing results weighted average step duration. */
    public static String mTimingResultsWheightedAverageStepDuration;

    /** The Timing results average step duration. */
    public static String mTimingResultsAverageStepDuration;

    /** The Timing results maximum step duration. */
    public static String mTimingResultsMaximumStepDuration;

    /** The Step text field name. */
    public static String mStepTextFieldName;

    /** The Step text field hint. */
    public static String mStepTextFieldHint;

    /** The Step text field reserve space. */
    public static String mStepTextFieldReserveSpace;

    /** The Step text field no step. */
    public static String mStepTextFieldNoStep;

    /** The Duration text field name. */
    public static String mDurationTextFieldName;

    /** The Duration text field hint. */
    public static String mDurationTextFieldHint;

    /** The Duration text field reserve space. */
    public static String mDurationTextFieldReserveSpace;

    /** The Duration text field suffix. */
    public static String mDurationTextFieldSuffix;

    /** The Warning duration too small. */
    public static String mWarningDurationTooSmall;

    /** The Warning duration too large. */
    public static String mWarningDurationTooLarge;

    /** The Warning at most one master. */
    public static String mWarningAtMostOneMaster;

    /** The Warning loading data component. */
    public static String mWarningLoadingDataComponent;

    /** The Error KIEM master exception. */
    public static String mErrorKiemMasterException;

    /** The Error timeout execution. */
    public static String mErrorTimeoutExecution;

    /** The Error no data producer. */
    public static String mErrorNoDataProducer;

    /** The Error no data observer. */
    public static String mErrorNoDataObserver;

    /** The Error open during execution. */
    public static String mErrorOpenDuringExecution;

    // -------------------------------------------------------------------------

    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates the messages class.
     */
    public Messages() {
    }
}
