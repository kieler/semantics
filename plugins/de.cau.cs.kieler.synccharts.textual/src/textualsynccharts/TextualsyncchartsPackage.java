/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package textualsynccharts;

import de.cau.cs.kieler.synccharts.SyncchartsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see textualsynccharts.TextualsyncchartsFactory
 * @model kind="package"
 * @generated
 */
public interface TextualsyncchartsPackage extends EPackage {
    /**
	 * The package name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNAME = "textualsynccharts";

    /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNS_URI = "http://kieler.cs.cau.de/textualsynccharts";

    /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNS_PREFIX = "textualsynccharts";

    /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    TextualsyncchartsPackage eINSTANCE = textualsynccharts.impl.TextualsyncchartsPackageImpl.init();

    /**
	 * The meta object id for the '{@link textualsynccharts.impl.TextualStateImpl <em>Textual State</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see textualsynccharts.impl.TextualStateImpl
	 * @see textualsynccharts.impl.TextualsyncchartsPackageImpl#getTextualState()
	 * @generated
	 */
    int TEXTUAL_STATE = 0;

    /**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEXTUAL_STATE__ID = SyncchartsPackage.STATE__ID;

    /**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEXTUAL_STATE__LABEL = SyncchartsPackage.STATE__LABEL;

    /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEXTUAL_STATE__TYPE = SyncchartsPackage.STATE__TYPE;

    /**
	 * The feature id for the '<em><b>Signals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEXTUAL_STATE__SIGNALS = SyncchartsPackage.STATE__SIGNALS;

    /**
	 * The feature id for the '<em><b>Regions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEXTUAL_STATE__REGIONS = SyncchartsPackage.STATE__REGIONS;

    /**
	 * The feature id for the '<em><b>Entry Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEXTUAL_STATE__ENTRY_ACTIONS = SyncchartsPackage.STATE__ENTRY_ACTIONS;

    /**
	 * The feature id for the '<em><b>Inner Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEXTUAL_STATE__INNER_ACTIONS = SyncchartsPackage.STATE__INNER_ACTIONS;

    /**
	 * The feature id for the '<em><b>Exit Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEXTUAL_STATE__EXIT_ACTIONS = SyncchartsPackage.STATE__EXIT_ACTIONS;

    /**
	 * The feature id for the '<em><b>Renamings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEXTUAL_STATE__RENAMINGS = SyncchartsPackage.STATE__RENAMINGS;

    /**
	 * The feature id for the '<em><b>Suspension Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEXTUAL_STATE__SUSPENSION_TRIGGER = SyncchartsPackage.STATE__SUSPENSION_TRIGGER;

    /**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEXTUAL_STATE__OUTGOING_TRANSITIONS = SyncchartsPackage.STATE__OUTGOING_TRANSITIONS;

    /**
	 * The feature id for the '<em><b>Parent Region</b></em>' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEXTUAL_STATE__PARENT_REGION = SyncchartsPackage.STATE__PARENT_REGION;

    /**
	 * The feature id for the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEXTUAL_STATE__IS_INITIAL = SyncchartsPackage.STATE__IS_INITIAL;

    /**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEXTUAL_STATE__IS_FINAL = SyncchartsPackage.STATE__IS_FINAL;

    /**
	 * The feature id for the '<em><b>Body Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEXTUAL_STATE__BODY_TEXT = SyncchartsPackage.STATE__BODY_TEXT;

    /**
	 * The feature id for the '<em><b>Body Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_STATE__BODY_REFERENCE = SyncchartsPackage.STATE__BODY_REFERENCE;

				/**
	 * The feature id for the '<em><b>Body Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_STATE__BODY_CONTENTS = SyncchartsPackage.STATE__BODY_CONTENTS;

				/**
	 * The feature id for the '<em><b>Interface Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_STATE__INTERFACE_DECLARATION = SyncchartsPackage.STATE__INTERFACE_DECLARATION;

				/**
	 * The feature id for the '<em><b>Input Signals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_STATE__INPUT_SIGNALS = SyncchartsPackage.STATE_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>Output Signals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_STATE__OUTPUT_SIGNALS = SyncchartsPackage.STATE_FEATURE_COUNT + 1;

				/**
	 * The number of structural features of the '<em>Textual State</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEXTUAL_STATE_FEATURE_COUNT = SyncchartsPackage.STATE_FEATURE_COUNT + 2;

    /**
	 * The meta object id for the '{@link textualsynccharts.impl.TextualTransitionImpl <em>Textual Transition</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see textualsynccharts.impl.TextualTransitionImpl
	 * @see textualsynccharts.impl.TextualsyncchartsPackageImpl#getTextualTransition()
	 * @generated
	 */
    int TEXTUAL_TRANSITION = 1;

    /**
	 * The feature id for the '<em><b>Effects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEXTUAL_TRANSITION__EFFECTS = SyncchartsPackage.TRANSITION__EFFECTS;

    /**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEXTUAL_TRANSITION__TRIGGER = SyncchartsPackage.TRANSITION__TRIGGER;

    /**
	 * The feature id for the '<em><b>Triggers And Effects</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEXTUAL_TRANSITION__TRIGGERS_AND_EFFECTS = SyncchartsPackage.TRANSITION__TRIGGERS_AND_EFFECTS;

    /**
	 * The feature id for the '<em><b>Parent State Entry Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEXTUAL_TRANSITION__PARENT_STATE_ENTRY_ACTION = SyncchartsPackage.TRANSITION__PARENT_STATE_ENTRY_ACTION;

    /**
	 * The feature id for the '<em><b>Parent State Inner Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEXTUAL_TRANSITION__PARENT_STATE_INNER_ACTION = SyncchartsPackage.TRANSITION__PARENT_STATE_INNER_ACTION;

    /**
	 * The feature id for the '<em><b>Parent State Exit Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEXTUAL_TRANSITION__PARENT_STATE_EXIT_ACTION = SyncchartsPackage.TRANSITION__PARENT_STATE_EXIT_ACTION;

    /**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEXTUAL_TRANSITION__DELAY = SyncchartsPackage.TRANSITION__DELAY;

    /**
	 * The feature id for the '<em><b>Is Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEXTUAL_TRANSITION__IS_IMMEDIATE = SyncchartsPackage.TRANSITION__IS_IMMEDIATE;

    /**
	 * The feature id for the '<em><b>Parent State Suspension</b></em>' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEXTUAL_TRANSITION__PARENT_STATE_SUSPENSION = SyncchartsPackage.TRANSITION__PARENT_STATE_SUSPENSION;

    /**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEXTUAL_TRANSITION__PRIORITY = SyncchartsPackage.TRANSITION__PRIORITY;

    /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEXTUAL_TRANSITION__TYPE = SyncchartsPackage.TRANSITION__TYPE;

    /**
	 * The feature id for the '<em><b>Target State</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEXTUAL_TRANSITION__TARGET_STATE = SyncchartsPackage.TRANSITION__TARGET_STATE;

    /**
	 * The feature id for the '<em><b>Source State</b></em>' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEXTUAL_TRANSITION__SOURCE_STATE = SyncchartsPackage.TRANSITION__SOURCE_STATE;

    /**
	 * The feature id for the '<em><b>Is History</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEXTUAL_TRANSITION__IS_HISTORY = SyncchartsPackage.TRANSITION__IS_HISTORY;

    /**
	 * The feature id for the '<em><b>Target State Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEXTUAL_TRANSITION__TARGET_STATE_PROXY = SyncchartsPackage.TRANSITION_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Make Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_TRANSITION__MAKE_FINAL = SyncchartsPackage.TRANSITION_FEATURE_COUNT + 1;

				/**
	 * The feature id for the '<em><b>Make Conditional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_TRANSITION__MAKE_CONDITIONAL = SyncchartsPackage.TRANSITION_FEATURE_COUNT + 2;

				/**
	 * The number of structural features of the '<em>Textual Transition</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEXTUAL_TRANSITION_FEATURE_COUNT = SyncchartsPackage.TRANSITION_FEATURE_COUNT + 3;


    /**
	 * Returns the meta object for class '{@link textualsynccharts.TextualState <em>Textual State</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textual State</em>'.
	 * @see textualsynccharts.TextualState
	 * @generated
	 */
    EClass getTextualState();

    /**
	 * Returns the meta object for the containment reference list '{@link textualsynccharts.TextualState#getInputSignals <em>Input Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Signals</em>'.
	 * @see textualsynccharts.TextualState#getInputSignals()
	 * @see #getTextualState()
	 * @generated
	 */
	EReference getTextualState_InputSignals();

				/**
	 * Returns the meta object for the containment reference list '{@link textualsynccharts.TextualState#getOutputSignals <em>Output Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Signals</em>'.
	 * @see textualsynccharts.TextualState#getOutputSignals()
	 * @see #getTextualState()
	 * @generated
	 */
	EReference getTextualState_OutputSignals();

				/**
	 * Returns the meta object for class '{@link textualsynccharts.TextualTransition <em>Textual Transition</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textual Transition</em>'.
	 * @see textualsynccharts.TextualTransition
	 * @generated
	 */
    EClass getTextualTransition();

    /**
	 * Returns the meta object for the attribute '{@link textualsynccharts.TextualTransition#getTargetStateProxy <em>Target State Proxy</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target State Proxy</em>'.
	 * @see textualsynccharts.TextualTransition#getTargetStateProxy()
	 * @see #getTextualTransition()
	 * @generated
	 */
    EAttribute getTextualTransition_TargetStateProxy();

    /**
	 * Returns the meta object for the attribute '{@link textualsynccharts.TextualTransition#isMakeFinal <em>Make Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Make Final</em>'.
	 * @see textualsynccharts.TextualTransition#isMakeFinal()
	 * @see #getTextualTransition()
	 * @generated
	 */
	EAttribute getTextualTransition_MakeFinal();

				/**
	 * Returns the meta object for the attribute '{@link textualsynccharts.TextualTransition#isMakeConditional <em>Make Conditional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Make Conditional</em>'.
	 * @see textualsynccharts.TextualTransition#isMakeConditional()
	 * @see #getTextualTransition()
	 * @generated
	 */
	EAttribute getTextualTransition_MakeConditional();

				/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
    TextualsyncchartsFactory getTextualsyncchartsFactory();

    /**
	 * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
	 * @generated
	 */
    interface Literals {
        /**
		 * The meta object literal for the '{@link textualsynccharts.impl.TextualStateImpl <em>Textual State</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see textualsynccharts.impl.TextualStateImpl
		 * @see textualsynccharts.impl.TextualsyncchartsPackageImpl#getTextualState()
		 * @generated
		 */
        EClass TEXTUAL_STATE = eINSTANCE.getTextualState();

        /**
		 * The meta object literal for the '<em><b>Input Signals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXTUAL_STATE__INPUT_SIGNALS = eINSTANCE.getTextualState_InputSignals();

								/**
		 * The meta object literal for the '<em><b>Output Signals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXTUAL_STATE__OUTPUT_SIGNALS = eINSTANCE.getTextualState_OutputSignals();

								/**
		 * The meta object literal for the '{@link textualsynccharts.impl.TextualTransitionImpl <em>Textual Transition</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see textualsynccharts.impl.TextualTransitionImpl
		 * @see textualsynccharts.impl.TextualsyncchartsPackageImpl#getTextualTransition()
		 * @generated
		 */
        EClass TEXTUAL_TRANSITION = eINSTANCE.getTextualTransition();

        /**
		 * The meta object literal for the '<em><b>Target State Proxy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute TEXTUAL_TRANSITION__TARGET_STATE_PROXY = eINSTANCE.getTextualTransition_TargetStateProxy();

								/**
		 * The meta object literal for the '<em><b>Make Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTUAL_TRANSITION__MAKE_FINAL = eINSTANCE.getTextualTransition_MakeFinal();

								/**
		 * The meta object literal for the '<em><b>Make Conditional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTUAL_TRANSITION__MAKE_CONDITIONAL = eINSTANCE.getTextualTransition_MakeConditional();

    }

} //TextualsyncchartsPackage
