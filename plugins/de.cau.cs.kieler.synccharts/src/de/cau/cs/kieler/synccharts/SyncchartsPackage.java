/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see de.cau.cs.kieler.synccharts.SyncchartsFactory
 * @model kind="package"
 * @generated
 */
public interface SyncchartsPackage extends EPackage {
	/**
     * The package name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNAME = "synccharts";

	/**
     * The package namespace URI.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_URI = "http://www.informatik.uni-kiel.de/rtsys/synccharts";

	/**
     * The package namespace name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_PREFIX = "synccharts";

	/**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	SyncchartsPackage eINSTANCE = de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl.init();

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.impl.StateImpl
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getState()
     * @generated
     */
	int STATE = 0;

	/**
     * The feature id for the '<em><b>State Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STATE__STATE_KIND = 0;

	/**
     * The feature id for the '<em><b>State Flag</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STATE__STATE_FLAG = 1;

	/**
     * The feature id for the '<em><b>Signals</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STATE__SIGNALS = 2;

	/**
     * The feature id for the '<em><b>Regions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STATE__REGIONS = 3;

	/**
     * The feature id for the '<em><b>Entry Actions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STATE__ENTRY_ACTIONS = 4;

	/**
     * The feature id for the '<em><b>Inner Actions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STATE__INNER_ACTIONS = 5;

	/**
     * The feature id for the '<em><b>Exit Actions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STATE__EXIT_ACTIONS = 6;

	/**
     * The feature id for the '<em><b>Signal Renamings</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STATE__SIGNAL_RENAMINGS = 7;

	/**
     * The feature id for the '<em><b>Suspension Trigger</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STATE__SUSPENSION_TRIGGER = 8;

	/**
     * The feature id for the '<em><b>Outgoing Transitions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STATE__OUTGOING_TRANSITIONS = 9;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STATE__NAME = 10;

	/**
     * The feature id for the '<em><b>Parent Region</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STATE__PARENT_REGION = 11;

	/**
     * The feature id for the '<em><b>Variables</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STATE__VARIABLES = 12;

	/**
     * The number of structural features of the '<em>State</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STATE_FEATURE_COUNT = 13;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.ValuedObjectImpl <em>Valued Object</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.impl.ValuedObjectImpl
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getValuedObject()
     * @generated
     */
	int VALUED_OBJECT = 2;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VALUED_OBJECT__NAME = 0;

	/**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VALUED_OBJECT__TYPE = 1;

	/**
     * The feature id for the '<em><b>Initial Value</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VALUED_OBJECT__INITIAL_VALUE = 2;

	/**
     * The number of structural features of the '<em>Valued Object</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VALUED_OBJECT_FEATURE_COUNT = 3;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.SignalImpl <em>Signal</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.impl.SignalImpl
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getSignal()
     * @generated
     */
	int SIGNAL = 1;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SIGNAL__NAME = VALUED_OBJECT__NAME;

	/**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SIGNAL__TYPE = VALUED_OBJECT__TYPE;

	/**
     * The feature id for the '<em><b>Initial Value</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SIGNAL__INITIAL_VALUE = VALUED_OBJECT__INITIAL_VALUE;

	/**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SIGNAL__VALUE = VALUED_OBJECT_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Parent State</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SIGNAL__PARENT_STATE = VALUED_OBJECT_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Is Local</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SIGNAL__IS_LOCAL = VALUED_OBJECT_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Is Input</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SIGNAL__IS_INPUT = VALUED_OBJECT_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Is Output</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SIGNAL__IS_OUTPUT = VALUED_OBJECT_FEATURE_COUNT + 4;

	/**
     * The feature id for the '<em><b>Combine Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SIGNAL__COMBINE_TYPE = VALUED_OBJECT_FEATURE_COUNT + 5;

	/**
     * The number of structural features of the '<em>Signal</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SIGNAL_FEATURE_COUNT = VALUED_OBJECT_FEATURE_COUNT + 6;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.EmissionImpl <em>Emission</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.impl.EmissionImpl
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getEmission()
     * @generated
     */
	int EMISSION = 3;

	/**
     * The feature id for the '<em><b>New Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EMISSION__NEW_VALUE = 0;

	/**
     * The feature id for the '<em><b>Signal</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EMISSION__SIGNAL = 1;

	/**
     * The feature id for the '<em><b>Parent Action</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EMISSION__PARENT_ACTION = 2;

	/**
     * The number of structural features of the '<em>Emission</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EMISSION_FEATURE_COUNT = 3;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.impl.ActionImpl
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getAction()
     * @generated
     */
	int ACTION = 8;

	/**
     * The feature id for the '<em><b>Emissions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACTION__EMISSIONS = 0;

	/**
     * The feature id for the '<em><b>Trigger</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACTION__TRIGGER = 1;

	/**
     * The feature id for the '<em><b>Parent State Entry Action</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACTION__PARENT_STATE_ENTRY_ACTION = 2;

	/**
     * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACTION__ASSIGNMENTS = 3;

	/**
     * The feature id for the '<em><b>Triggers And Effects</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACTION__TRIGGERS_AND_EFFECTS = 4;

	/**
     * The feature id for the '<em><b>Parent State Inner Action</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACTION__PARENT_STATE_INNER_ACTION = 5;

	/**
     * The feature id for the '<em><b>Parent State Exit Action</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACTION__PARENT_STATE_EXIT_ACTION = 6;

	/**
     * The number of structural features of the '<em>Action</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACTION_FEATURE_COUNT = 7;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.impl.TransitionImpl
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getTransition()
     * @generated
     */
	int TRANSITION = 4;

	/**
     * The feature id for the '<em><b>Emissions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION__EMISSIONS = ACTION__EMISSIONS;

	/**
     * The feature id for the '<em><b>Trigger</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION__TRIGGER = ACTION__TRIGGER;

	/**
     * The feature id for the '<em><b>Parent State Entry Action</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION__PARENT_STATE_ENTRY_ACTION = ACTION__PARENT_STATE_ENTRY_ACTION;

	/**
     * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION__ASSIGNMENTS = ACTION__ASSIGNMENTS;

	/**
     * The feature id for the '<em><b>Triggers And Effects</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION__TRIGGERS_AND_EFFECTS = ACTION__TRIGGERS_AND_EFFECTS;

	/**
     * The feature id for the '<em><b>Parent State Inner Action</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION__PARENT_STATE_INNER_ACTION = ACTION__PARENT_STATE_INNER_ACTION;

	/**
     * The feature id for the '<em><b>Parent State Exit Action</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION__PARENT_STATE_EXIT_ACTION = ACTION__PARENT_STATE_EXIT_ACTION;

	/**
     * The feature id for the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION__DELAY = ACTION_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Immediate</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION__IMMEDIATE = ACTION_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION__PRIORITY = ACTION_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Transition Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION__TRANSITION_KIND = ACTION_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Target State</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION__TARGET_STATE = ACTION_FEATURE_COUNT + 4;

	/**
     * The feature id for the '<em><b>Source State</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION__SOURCE_STATE = ACTION_FEATURE_COUNT + 5;

	/**
     * The feature id for the '<em><b>History</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION__HISTORY = ACTION_FEATURE_COUNT + 6;

	/**
     * The number of structural features of the '<em>Transition</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 7;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.impl.ExpressionImpl
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getExpression()
     * @generated
     */
	int EXPRESSION = 5;

	/**
     * The feature id for the '<em><b>Parent Action</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EXPRESSION__PARENT_ACTION = 0;

	/**
     * The feature id for the '<em><b>Parent Emisson</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EXPRESSION__PARENT_EMISSON = 1;

	/**
     * The feature id for the '<em><b>Parent Assignment</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EXPRESSION__PARENT_ASSIGNMENT = 2;

	/**
     * The feature id for the '<em><b>Parent Expression</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EXPRESSION__PARENT_EXPRESSION = 3;

	/**
     * The feature id for the '<em><b>Parent Suspension Trigger</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EXPRESSION__PARENT_SUSPENSION_TRIGGER = 4;

	/**
     * The number of structural features of the '<em>Expression</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EXPRESSION_FEATURE_COUNT = 5;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.SignalRenamingImpl <em>Signal Renaming</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.impl.SignalRenamingImpl
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getSignalRenaming()
     * @generated
     */
	int SIGNAL_RENAMING = 6;

	/**
     * The feature id for the '<em><b>Old Signal</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SIGNAL_RENAMING__OLD_SIGNAL = 0;

	/**
     * The feature id for the '<em><b>New Signal</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SIGNAL_RENAMING__NEW_SIGNAL = 1;

	/**
     * The feature id for the '<em><b>Parent State</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SIGNAL_RENAMING__PARENT_STATE = 2;

	/**
     * The number of structural features of the '<em>Signal Renaming</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SIGNAL_RENAMING_FEATURE_COUNT = 3;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.OperatorImpl <em>Operator</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.impl.OperatorImpl
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getOperator()
     * @generated
     */
	int OPERATOR = 7;

	/**
     * The feature id for the '<em><b>Operator Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int OPERATOR__OPERATOR_KIND = 0;

	/**
     * The feature id for the '<em><b>Parent Expression</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int OPERATOR__PARENT_EXPRESSION = 1;

	/**
     * The number of structural features of the '<em>Operator</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int OPERATOR_FEATURE_COUNT = 2;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.SuspensionTriggerImpl <em>Suspension Trigger</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.impl.SuspensionTriggerImpl
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getSuspensionTrigger()
     * @generated
     */
	int SUSPENSION_TRIGGER = 9;

	/**
     * The feature id for the '<em><b>Parent State</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SUSPENSION_TRIGGER__PARENT_STATE = 0;

	/**
     * The feature id for the '<em><b>Immediate</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SUSPENSION_TRIGGER__IMMEDIATE = 1;

	/**
     * The feature id for the '<em><b>Trigger</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SUSPENSION_TRIGGER__TRIGGER = 2;

	/**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SUSPENSION_TRIGGER__EXPRESSION = 3;

	/**
     * The number of structural features of the '<em>Suspension Trigger</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SUSPENSION_TRIGGER_FEATURE_COUNT = 4;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.impl.AssignmentImpl
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getAssignment()
     * @generated
     */
	int ASSIGNMENT = 10;

	/**
     * The feature id for the '<em><b>Variable</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASSIGNMENT__VARIABLE = 0;

	/**
     * The feature id for the '<em><b>Parent Action</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASSIGNMENT__PARENT_ACTION = 1;

	/**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASSIGNMENT__EXPRESSION = 2;

	/**
     * The number of structural features of the '<em>Assignment</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASSIGNMENT_FEATURE_COUNT = 3;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.impl.VariableImpl
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getVariable()
     * @generated
     */
	int VARIABLE = 11;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VARIABLE__NAME = VALUED_OBJECT__NAME;

	/**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VARIABLE__TYPE = VALUED_OBJECT__TYPE;

	/**
     * The feature id for the '<em><b>Initial Value</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VARIABLE__INITIAL_VALUE = VALUED_OBJECT__INITIAL_VALUE;

	/**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VARIABLE__VALUE = VALUED_OBJECT_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Parent State</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VARIABLE__PARENT_STATE = VALUED_OBJECT_FEATURE_COUNT + 1;

	/**
     * The number of structural features of the '<em>Variable</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VARIABLE_FEATURE_COUNT = VALUED_OBJECT_FEATURE_COUNT + 2;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.RegionImpl <em>Region</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.impl.RegionImpl
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getRegion()
     * @generated
     */
	int REGION = 12;

	/**
     * The feature id for the '<em><b>Inner States</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REGION__INNER_STATES = 0;

	/**
     * The feature id for the '<em><b>Parent State</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REGION__PARENT_STATE = 1;

	/**
     * The number of structural features of the '<em>Region</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REGION_FEATURE_COUNT = 2;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.ComplexExpressionImpl <em>Complex Expression</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.impl.ComplexExpressionImpl
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getComplexExpression()
     * @generated
     */
	int COMPLEX_EXPRESSION = 13;

	/**
     * The feature id for the '<em><b>Parent Action</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPLEX_EXPRESSION__PARENT_ACTION = EXPRESSION__PARENT_ACTION;

	/**
     * The feature id for the '<em><b>Parent Emisson</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPLEX_EXPRESSION__PARENT_EMISSON = EXPRESSION__PARENT_EMISSON;

	/**
     * The feature id for the '<em><b>Parent Assignment</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPLEX_EXPRESSION__PARENT_ASSIGNMENT = EXPRESSION__PARENT_ASSIGNMENT;

	/**
     * The feature id for the '<em><b>Parent Expression</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPLEX_EXPRESSION__PARENT_EXPRESSION = EXPRESSION__PARENT_EXPRESSION;

	/**
     * The feature id for the '<em><b>Parent Suspension Trigger</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPLEX_EXPRESSION__PARENT_SUSPENSION_TRIGGER = EXPRESSION__PARENT_SUSPENSION_TRIGGER;

	/**
     * The feature id for the '<em><b>Operator</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPLEX_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Sub Expressions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPLEX_EXPRESSION__SUB_EXPRESSIONS = EXPRESSION_FEATURE_COUNT + 1;

	/**
     * The number of structural features of the '<em>Complex Expression</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPLEX_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.SignalReferenceImpl <em>Signal Reference</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.impl.SignalReferenceImpl
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getSignalReference()
     * @generated
     */
	int SIGNAL_REFERENCE = 14;

	/**
     * The feature id for the '<em><b>Parent Action</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SIGNAL_REFERENCE__PARENT_ACTION = EXPRESSION__PARENT_ACTION;

	/**
     * The feature id for the '<em><b>Parent Emisson</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SIGNAL_REFERENCE__PARENT_EMISSON = EXPRESSION__PARENT_EMISSON;

	/**
     * The feature id for the '<em><b>Parent Assignment</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SIGNAL_REFERENCE__PARENT_ASSIGNMENT = EXPRESSION__PARENT_ASSIGNMENT;

	/**
     * The feature id for the '<em><b>Parent Expression</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SIGNAL_REFERENCE__PARENT_EXPRESSION = EXPRESSION__PARENT_EXPRESSION;

	/**
     * The feature id for the '<em><b>Parent Suspension Trigger</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SIGNAL_REFERENCE__PARENT_SUSPENSION_TRIGGER = EXPRESSION__PARENT_SUSPENSION_TRIGGER;

	/**
     * The feature id for the '<em><b>Signal</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SIGNAL_REFERENCE__SIGNAL = EXPRESSION_FEATURE_COUNT + 0;

	/**
     * The number of structural features of the '<em>Signal Reference</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SIGNAL_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.impl.VariableReferenceImpl
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getVariableReference()
     * @generated
     */
	int VARIABLE_REFERENCE = 15;

	/**
     * The feature id for the '<em><b>Parent Action</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VARIABLE_REFERENCE__PARENT_ACTION = EXPRESSION__PARENT_ACTION;

	/**
     * The feature id for the '<em><b>Parent Emisson</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VARIABLE_REFERENCE__PARENT_EMISSON = EXPRESSION__PARENT_EMISSON;

	/**
     * The feature id for the '<em><b>Parent Assignment</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VARIABLE_REFERENCE__PARENT_ASSIGNMENT = EXPRESSION__PARENT_ASSIGNMENT;

	/**
     * The feature id for the '<em><b>Parent Expression</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VARIABLE_REFERENCE__PARENT_EXPRESSION = EXPRESSION__PARENT_EXPRESSION;

	/**
     * The feature id for the '<em><b>Parent Suspension Trigger</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VARIABLE_REFERENCE__PARENT_SUSPENSION_TRIGGER = EXPRESSION__PARENT_SUSPENSION_TRIGGER;

	/**
     * The feature id for the '<em><b>Variable</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VARIABLE_REFERENCE__VARIABLE = EXPRESSION_FEATURE_COUNT + 0;

	/**
     * The number of structural features of the '<em>Variable Reference</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VARIABLE_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.StateKind <em>State Kind</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.StateKind
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getStateKind()
     * @generated
     */
	int STATE_KIND = 16;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.StateFlag <em>State Flag</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.StateFlag
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getStateFlag()
     * @generated
     */
	int STATE_FLAG = 17;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.TransitionKind <em>Transition Kind</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.TransitionKind
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getTransitionKind()
     * @generated
     */
	int TRANSITION_KIND = 18;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.OperatorKind <em>Operator Kind</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.OperatorKind
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getOperatorKind()
     * @generated
     */
	int OPERATOR_KIND = 19;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.CombineType <em>Combine Type</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.CombineType
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getCombineType()
     * @generated
     */
	int COMBINE_TYPE = 20;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.ValueType <em>Value Type</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.ValueType
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getValueType()
     * @generated
     */
	int VALUE_TYPE = 21;


	/**
     * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.State <em>State</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>State</em>'.
     * @see de.cau.cs.kieler.synccharts.State
     * @generated
     */
	EClass getState();

	/**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.State#getStateKind <em>State Kind</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>State Kind</em>'.
     * @see de.cau.cs.kieler.synccharts.State#getStateKind()
     * @see #getState()
     * @generated
     */
	EAttribute getState_StateKind();

	/**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.State#getStateFlag <em>State Flag</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>State Flag</em>'.
     * @see de.cau.cs.kieler.synccharts.State#getStateFlag()
     * @see #getState()
     * @generated
     */
	EAttribute getState_StateFlag();

	/**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.State#getSignals <em>Signals</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Signals</em>'.
     * @see de.cau.cs.kieler.synccharts.State#getSignals()
     * @see #getState()
     * @generated
     */
	EReference getState_Signals();

	/**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.State#getRegions <em>Regions</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Regions</em>'.
     * @see de.cau.cs.kieler.synccharts.State#getRegions()
     * @see #getState()
     * @generated
     */
	EReference getState_Regions();

	/**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.State#getEntryActions <em>Entry Actions</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Entry Actions</em>'.
     * @see de.cau.cs.kieler.synccharts.State#getEntryActions()
     * @see #getState()
     * @generated
     */
	EReference getState_EntryActions();

	/**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.State#getInnerActions <em>Inner Actions</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Inner Actions</em>'.
     * @see de.cau.cs.kieler.synccharts.State#getInnerActions()
     * @see #getState()
     * @generated
     */
	EReference getState_InnerActions();

	/**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.State#getExitActions <em>Exit Actions</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Exit Actions</em>'.
     * @see de.cau.cs.kieler.synccharts.State#getExitActions()
     * @see #getState()
     * @generated
     */
	EReference getState_ExitActions();

	/**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.State#getSignalRenamings <em>Signal Renamings</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Signal Renamings</em>'.
     * @see de.cau.cs.kieler.synccharts.State#getSignalRenamings()
     * @see #getState()
     * @generated
     */
	EReference getState_SignalRenamings();

	/**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts.State#getSuspensionTrigger <em>Suspension Trigger</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Suspension Trigger</em>'.
     * @see de.cau.cs.kieler.synccharts.State#getSuspensionTrigger()
     * @see #getState()
     * @generated
     */
	EReference getState_SuspensionTrigger();

	/**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.State#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Outgoing Transitions</em>'.
     * @see de.cau.cs.kieler.synccharts.State#getOutgoingTransitions()
     * @see #getState()
     * @generated
     */
	EReference getState_OutgoingTransitions();

	/**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.State#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see de.cau.cs.kieler.synccharts.State#getName()
     * @see #getState()
     * @generated
     */
	EAttribute getState_Name();

	/**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts.State#getParentRegion <em>Parent Region</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Region</em>'.
     * @see de.cau.cs.kieler.synccharts.State#getParentRegion()
     * @see #getState()
     * @generated
     */
	EReference getState_ParentRegion();

	/**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.State#getVariables <em>Variables</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Variables</em>'.
     * @see de.cau.cs.kieler.synccharts.State#getVariables()
     * @see #getState()
     * @generated
     */
	EReference getState_Variables();

	/**
     * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.Signal <em>Signal</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Signal</em>'.
     * @see de.cau.cs.kieler.synccharts.Signal
     * @generated
     */
	EClass getSignal();

	/**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts.Signal#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Value</em>'.
     * @see de.cau.cs.kieler.synccharts.Signal#getValue()
     * @see #getSignal()
     * @generated
     */
	EReference getSignal_Value();

	/**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts.Signal#getParentState <em>Parent State</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent State</em>'.
     * @see de.cau.cs.kieler.synccharts.Signal#getParentState()
     * @see #getSignal()
     * @generated
     */
	EReference getSignal_ParentState();

	/**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.Signal#isIsLocal <em>Is Local</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Local</em>'.
     * @see de.cau.cs.kieler.synccharts.Signal#isIsLocal()
     * @see #getSignal()
     * @generated
     */
	EAttribute getSignal_IsLocal();

	/**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.Signal#isIsInput <em>Is Input</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Input</em>'.
     * @see de.cau.cs.kieler.synccharts.Signal#isIsInput()
     * @see #getSignal()
     * @generated
     */
	EAttribute getSignal_IsInput();

	/**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.Signal#isIsOutput <em>Is Output</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Output</em>'.
     * @see de.cau.cs.kieler.synccharts.Signal#isIsOutput()
     * @see #getSignal()
     * @generated
     */
	EAttribute getSignal_IsOutput();

	/**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.Signal#getCombineType <em>Combine Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Combine Type</em>'.
     * @see de.cau.cs.kieler.synccharts.Signal#getCombineType()
     * @see #getSignal()
     * @generated
     */
	EAttribute getSignal_CombineType();

	/**
     * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.ValuedObject <em>Valued Object</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Valued Object</em>'.
     * @see de.cau.cs.kieler.synccharts.ValuedObject
     * @generated
     */
	EClass getValuedObject();

	/**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.ValuedObject#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see de.cau.cs.kieler.synccharts.ValuedObject#getName()
     * @see #getValuedObject()
     * @generated
     */
	EAttribute getValuedObject_Name();

	/**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.ValuedObject#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see de.cau.cs.kieler.synccharts.ValuedObject#getType()
     * @see #getValuedObject()
     * @generated
     */
	EAttribute getValuedObject_Type();

	/**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.ValuedObject#getInitialValue <em>Initial Value</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Initial Value</em>'.
     * @see de.cau.cs.kieler.synccharts.ValuedObject#getInitialValue()
     * @see #getValuedObject()
     * @generated
     */
	EAttribute getValuedObject_InitialValue();

	/**
     * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.Emission <em>Emission</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Emission</em>'.
     * @see de.cau.cs.kieler.synccharts.Emission
     * @generated
     */
	EClass getEmission();

	/**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts.Emission#getNewValue <em>New Value</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>New Value</em>'.
     * @see de.cau.cs.kieler.synccharts.Emission#getNewValue()
     * @see #getEmission()
     * @generated
     */
	EReference getEmission_NewValue();

	/**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts.Emission#getSignal <em>Signal</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Signal</em>'.
     * @see de.cau.cs.kieler.synccharts.Emission#getSignal()
     * @see #getEmission()
     * @generated
     */
	EReference getEmission_Signal();

	/**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts.Emission#getParentAction <em>Parent Action</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Action</em>'.
     * @see de.cau.cs.kieler.synccharts.Emission#getParentAction()
     * @see #getEmission()
     * @generated
     */
	EReference getEmission_ParentAction();

	/**
     * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.Transition <em>Transition</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Transition</em>'.
     * @see de.cau.cs.kieler.synccharts.Transition
     * @generated
     */
	EClass getTransition();

	/**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.Transition#getDelay <em>Delay</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Delay</em>'.
     * @see de.cau.cs.kieler.synccharts.Transition#getDelay()
     * @see #getTransition()
     * @generated
     */
	EAttribute getTransition_Delay();

	/**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.Transition#isImmediate <em>Immediate</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Immediate</em>'.
     * @see de.cau.cs.kieler.synccharts.Transition#isImmediate()
     * @see #getTransition()
     * @generated
     */
	EAttribute getTransition_Immediate();

	/**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.Transition#getPriority <em>Priority</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Priority</em>'.
     * @see de.cau.cs.kieler.synccharts.Transition#getPriority()
     * @see #getTransition()
     * @generated
     */
	EAttribute getTransition_Priority();

	/**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.Transition#getTransitionKind <em>Transition Kind</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Transition Kind</em>'.
     * @see de.cau.cs.kieler.synccharts.Transition#getTransitionKind()
     * @see #getTransition()
     * @generated
     */
	EAttribute getTransition_TransitionKind();

	/**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts.Transition#getTargetState <em>Target State</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target State</em>'.
     * @see de.cau.cs.kieler.synccharts.Transition#getTargetState()
     * @see #getTransition()
     * @generated
     */
	EReference getTransition_TargetState();

	/**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts.Transition#getSourceState <em>Source State</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Source State</em>'.
     * @see de.cau.cs.kieler.synccharts.Transition#getSourceState()
     * @see #getTransition()
     * @generated
     */
	EReference getTransition_SourceState();

	/**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.Transition#isHistory <em>History</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>History</em>'.
     * @see de.cau.cs.kieler.synccharts.Transition#isHistory()
     * @see #getTransition()
     * @generated
     */
	EAttribute getTransition_History();

	/**
     * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.Expression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Expression</em>'.
     * @see de.cau.cs.kieler.synccharts.Expression
     * @generated
     */
	EClass getExpression();

	/**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts.Expression#getParentAction <em>Parent Action</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Action</em>'.
     * @see de.cau.cs.kieler.synccharts.Expression#getParentAction()
     * @see #getExpression()
     * @generated
     */
	EReference getExpression_ParentAction();

	/**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts.Expression#getParentEmisson <em>Parent Emisson</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Emisson</em>'.
     * @see de.cau.cs.kieler.synccharts.Expression#getParentEmisson()
     * @see #getExpression()
     * @generated
     */
	EReference getExpression_ParentEmisson();

	/**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts.Expression#getParentAssignment <em>Parent Assignment</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Assignment</em>'.
     * @see de.cau.cs.kieler.synccharts.Expression#getParentAssignment()
     * @see #getExpression()
     * @generated
     */
	EReference getExpression_ParentAssignment();

	/**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts.Expression#getParentExpression <em>Parent Expression</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Expression</em>'.
     * @see de.cau.cs.kieler.synccharts.Expression#getParentExpression()
     * @see #getExpression()
     * @generated
     */
	EReference getExpression_ParentExpression();

	/**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts.Expression#getParentSuspensionTrigger <em>Parent Suspension Trigger</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Suspension Trigger</em>'.
     * @see de.cau.cs.kieler.synccharts.Expression#getParentSuspensionTrigger()
     * @see #getExpression()
     * @generated
     */
	EReference getExpression_ParentSuspensionTrigger();

	/**
     * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.SignalRenaming <em>Signal Renaming</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Signal Renaming</em>'.
     * @see de.cau.cs.kieler.synccharts.SignalRenaming
     * @generated
     */
	EClass getSignalRenaming();

	/**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts.SignalRenaming#getOldSignal <em>Old Signal</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Old Signal</em>'.
     * @see de.cau.cs.kieler.synccharts.SignalRenaming#getOldSignal()
     * @see #getSignalRenaming()
     * @generated
     */
	EReference getSignalRenaming_OldSignal();

	/**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts.SignalRenaming#getNewSignal <em>New Signal</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>New Signal</em>'.
     * @see de.cau.cs.kieler.synccharts.SignalRenaming#getNewSignal()
     * @see #getSignalRenaming()
     * @generated
     */
	EReference getSignalRenaming_NewSignal();

	/**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts.SignalRenaming#getParentState <em>Parent State</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent State</em>'.
     * @see de.cau.cs.kieler.synccharts.SignalRenaming#getParentState()
     * @see #getSignalRenaming()
     * @generated
     */
	EReference getSignalRenaming_ParentState();

	/**
     * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.Operator <em>Operator</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Operator</em>'.
     * @see de.cau.cs.kieler.synccharts.Operator
     * @generated
     */
	EClass getOperator();

	/**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.Operator#getOperatorKind <em>Operator Kind</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Operator Kind</em>'.
     * @see de.cau.cs.kieler.synccharts.Operator#getOperatorKind()
     * @see #getOperator()
     * @generated
     */
	EAttribute getOperator_OperatorKind();

	/**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts.Operator#getParentExpression <em>Parent Expression</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Expression</em>'.
     * @see de.cau.cs.kieler.synccharts.Operator#getParentExpression()
     * @see #getOperator()
     * @generated
     */
	EReference getOperator_ParentExpression();

	/**
     * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.Action <em>Action</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Action</em>'.
     * @see de.cau.cs.kieler.synccharts.Action
     * @generated
     */
	EClass getAction();

	/**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.Action#getEmissions <em>Emissions</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Emissions</em>'.
     * @see de.cau.cs.kieler.synccharts.Action#getEmissions()
     * @see #getAction()
     * @generated
     */
	EReference getAction_Emissions();

	/**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts.Action#getTrigger <em>Trigger</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Trigger</em>'.
     * @see de.cau.cs.kieler.synccharts.Action#getTrigger()
     * @see #getAction()
     * @generated
     */
	EReference getAction_Trigger();

	/**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts.Action#getParentStateEntryAction <em>Parent State Entry Action</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent State Entry Action</em>'.
     * @see de.cau.cs.kieler.synccharts.Action#getParentStateEntryAction()
     * @see #getAction()
     * @generated
     */
	EReference getAction_ParentStateEntryAction();

	/**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.Action#getAssignments <em>Assignments</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Assignments</em>'.
     * @see de.cau.cs.kieler.synccharts.Action#getAssignments()
     * @see #getAction()
     * @generated
     */
	EReference getAction_Assignments();

	/**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.Action#getTriggersAndEffects <em>Triggers And Effects</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Triggers And Effects</em>'.
     * @see de.cau.cs.kieler.synccharts.Action#getTriggersAndEffects()
     * @see #getAction()
     * @generated
     */
	EAttribute getAction_TriggersAndEffects();

	/**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts.Action#getParentStateInnerAction <em>Parent State Inner Action</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent State Inner Action</em>'.
     * @see de.cau.cs.kieler.synccharts.Action#getParentStateInnerAction()
     * @see #getAction()
     * @generated
     */
	EReference getAction_ParentStateInnerAction();

	/**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts.Action#getParentStateExitAction <em>Parent State Exit Action</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent State Exit Action</em>'.
     * @see de.cau.cs.kieler.synccharts.Action#getParentStateExitAction()
     * @see #getAction()
     * @generated
     */
	EReference getAction_ParentStateExitAction();

	/**
     * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.SuspensionTrigger <em>Suspension Trigger</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Suspension Trigger</em>'.
     * @see de.cau.cs.kieler.synccharts.SuspensionTrigger
     * @generated
     */
	EClass getSuspensionTrigger();

	/**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts.SuspensionTrigger#getParentState <em>Parent State</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent State</em>'.
     * @see de.cau.cs.kieler.synccharts.SuspensionTrigger#getParentState()
     * @see #getSuspensionTrigger()
     * @generated
     */
	EReference getSuspensionTrigger_ParentState();

	/**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.SuspensionTrigger#isImmediate <em>Immediate</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Immediate</em>'.
     * @see de.cau.cs.kieler.synccharts.SuspensionTrigger#isImmediate()
     * @see #getSuspensionTrigger()
     * @generated
     */
	EAttribute getSuspensionTrigger_Immediate();

	/**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.SuspensionTrigger#getTrigger <em>Trigger</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Trigger</em>'.
     * @see de.cau.cs.kieler.synccharts.SuspensionTrigger#getTrigger()
     * @see #getSuspensionTrigger()
     * @generated
     */
	EAttribute getSuspensionTrigger_Trigger();

	/**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts.SuspensionTrigger#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Expression</em>'.
     * @see de.cau.cs.kieler.synccharts.SuspensionTrigger#getExpression()
     * @see #getSuspensionTrigger()
     * @generated
     */
	EReference getSuspensionTrigger_Expression();

	/**
     * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.Assignment <em>Assignment</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Assignment</em>'.
     * @see de.cau.cs.kieler.synccharts.Assignment
     * @generated
     */
	EClass getAssignment();

	/**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts.Assignment#getVariable <em>Variable</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Variable</em>'.
     * @see de.cau.cs.kieler.synccharts.Assignment#getVariable()
     * @see #getAssignment()
     * @generated
     */
	EReference getAssignment_Variable();

	/**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts.Assignment#getParentAction <em>Parent Action</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Action</em>'.
     * @see de.cau.cs.kieler.synccharts.Assignment#getParentAction()
     * @see #getAssignment()
     * @generated
     */
	EReference getAssignment_ParentAction();

	/**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts.Assignment#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Expression</em>'.
     * @see de.cau.cs.kieler.synccharts.Assignment#getExpression()
     * @see #getAssignment()
     * @generated
     */
	EReference getAssignment_Expression();

	/**
     * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.Variable <em>Variable</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Variable</em>'.
     * @see de.cau.cs.kieler.synccharts.Variable
     * @generated
     */
	EClass getVariable();

	/**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts.Variable#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Value</em>'.
     * @see de.cau.cs.kieler.synccharts.Variable#getValue()
     * @see #getVariable()
     * @generated
     */
	EReference getVariable_Value();

	/**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts.Variable#getParentState <em>Parent State</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent State</em>'.
     * @see de.cau.cs.kieler.synccharts.Variable#getParentState()
     * @see #getVariable()
     * @generated
     */
	EReference getVariable_ParentState();

	/**
     * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.Region <em>Region</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Region</em>'.
     * @see de.cau.cs.kieler.synccharts.Region
     * @generated
     */
	EClass getRegion();

	/**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.Region#getInnerStates <em>Inner States</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Inner States</em>'.
     * @see de.cau.cs.kieler.synccharts.Region#getInnerStates()
     * @see #getRegion()
     * @generated
     */
	EReference getRegion_InnerStates();

	/**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts.Region#getParentState <em>Parent State</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent State</em>'.
     * @see de.cau.cs.kieler.synccharts.Region#getParentState()
     * @see #getRegion()
     * @generated
     */
	EReference getRegion_ParentState();

	/**
     * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.ComplexExpression <em>Complex Expression</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Complex Expression</em>'.
     * @see de.cau.cs.kieler.synccharts.ComplexExpression
     * @generated
     */
	EClass getComplexExpression();

	/**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts.ComplexExpression#getOperator <em>Operator</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Operator</em>'.
     * @see de.cau.cs.kieler.synccharts.ComplexExpression#getOperator()
     * @see #getComplexExpression()
     * @generated
     */
	EReference getComplexExpression_Operator();

	/**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.ComplexExpression#getSubExpressions <em>Sub Expressions</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sub Expressions</em>'.
     * @see de.cau.cs.kieler.synccharts.ComplexExpression#getSubExpressions()
     * @see #getComplexExpression()
     * @generated
     */
	EReference getComplexExpression_SubExpressions();

	/**
     * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.SignalReference <em>Signal Reference</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Signal Reference</em>'.
     * @see de.cau.cs.kieler.synccharts.SignalReference
     * @generated
     */
	EClass getSignalReference();

	/**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts.SignalReference#getSignal <em>Signal</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Signal</em>'.
     * @see de.cau.cs.kieler.synccharts.SignalReference#getSignal()
     * @see #getSignalReference()
     * @generated
     */
	EReference getSignalReference_Signal();

	/**
     * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.VariableReference <em>Variable Reference</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Variable Reference</em>'.
     * @see de.cau.cs.kieler.synccharts.VariableReference
     * @generated
     */
	EClass getVariableReference();

	/**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts.VariableReference#getVariable <em>Variable</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Variable</em>'.
     * @see de.cau.cs.kieler.synccharts.VariableReference#getVariable()
     * @see #getVariableReference()
     * @generated
     */
	EReference getVariableReference_Variable();

	/**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.synccharts.StateKind <em>State Kind</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>State Kind</em>'.
     * @see de.cau.cs.kieler.synccharts.StateKind
     * @generated
     */
	EEnum getStateKind();

	/**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.synccharts.StateFlag <em>State Flag</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>State Flag</em>'.
     * @see de.cau.cs.kieler.synccharts.StateFlag
     * @generated
     */
	EEnum getStateFlag();

	/**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.synccharts.TransitionKind <em>Transition Kind</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Transition Kind</em>'.
     * @see de.cau.cs.kieler.synccharts.TransitionKind
     * @generated
     */
	EEnum getTransitionKind();

	/**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.synccharts.OperatorKind <em>Operator Kind</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Operator Kind</em>'.
     * @see de.cau.cs.kieler.synccharts.OperatorKind
     * @generated
     */
	EEnum getOperatorKind();

	/**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.synccharts.CombineType <em>Combine Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Combine Type</em>'.
     * @see de.cau.cs.kieler.synccharts.CombineType
     * @generated
     */
	EEnum getCombineType();

	/**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.synccharts.ValueType <em>Value Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Value Type</em>'.
     * @see de.cau.cs.kieler.synccharts.ValueType
     * @generated
     */
	EEnum getValueType();

	/**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
	SyncchartsFactory getSyncchartsFactory();

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
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.StateImpl <em>State</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.impl.StateImpl
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getState()
         * @generated
         */
		EClass STATE = eINSTANCE.getState();

		/**
         * The meta object literal for the '<em><b>State Kind</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute STATE__STATE_KIND = eINSTANCE.getState_StateKind();

		/**
         * The meta object literal for the '<em><b>State Flag</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute STATE__STATE_FLAG = eINSTANCE.getState_StateFlag();

		/**
         * The meta object literal for the '<em><b>Signals</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference STATE__SIGNALS = eINSTANCE.getState_Signals();

		/**
         * The meta object literal for the '<em><b>Regions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference STATE__REGIONS = eINSTANCE.getState_Regions();

		/**
         * The meta object literal for the '<em><b>Entry Actions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference STATE__ENTRY_ACTIONS = eINSTANCE.getState_EntryActions();

		/**
         * The meta object literal for the '<em><b>Inner Actions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference STATE__INNER_ACTIONS = eINSTANCE.getState_InnerActions();

		/**
         * The meta object literal for the '<em><b>Exit Actions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference STATE__EXIT_ACTIONS = eINSTANCE.getState_ExitActions();

		/**
         * The meta object literal for the '<em><b>Signal Renamings</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference STATE__SIGNAL_RENAMINGS = eINSTANCE.getState_SignalRenamings();

		/**
         * The meta object literal for the '<em><b>Suspension Trigger</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference STATE__SUSPENSION_TRIGGER = eINSTANCE.getState_SuspensionTrigger();

		/**
         * The meta object literal for the '<em><b>Outgoing Transitions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference STATE__OUTGOING_TRANSITIONS = eINSTANCE.getState_OutgoingTransitions();

		/**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
         * The meta object literal for the '<em><b>Parent Region</b></em>' container reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference STATE__PARENT_REGION = eINSTANCE.getState_ParentRegion();

		/**
         * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference STATE__VARIABLES = eINSTANCE.getState_Variables();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.SignalImpl <em>Signal</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.impl.SignalImpl
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getSignal()
         * @generated
         */
		EClass SIGNAL = eINSTANCE.getSignal();

		/**
         * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SIGNAL__VALUE = eINSTANCE.getSignal_Value();

		/**
         * The meta object literal for the '<em><b>Parent State</b></em>' container reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SIGNAL__PARENT_STATE = eINSTANCE.getSignal_ParentState();

		/**
         * The meta object literal for the '<em><b>Is Local</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SIGNAL__IS_LOCAL = eINSTANCE.getSignal_IsLocal();

		/**
         * The meta object literal for the '<em><b>Is Input</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SIGNAL__IS_INPUT = eINSTANCE.getSignal_IsInput();

		/**
         * The meta object literal for the '<em><b>Is Output</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SIGNAL__IS_OUTPUT = eINSTANCE.getSignal_IsOutput();

		/**
         * The meta object literal for the '<em><b>Combine Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SIGNAL__COMBINE_TYPE = eINSTANCE.getSignal_CombineType();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.ValuedObjectImpl <em>Valued Object</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.impl.ValuedObjectImpl
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getValuedObject()
         * @generated
         */
		EClass VALUED_OBJECT = eINSTANCE.getValuedObject();

		/**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute VALUED_OBJECT__NAME = eINSTANCE.getValuedObject_Name();

		/**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute VALUED_OBJECT__TYPE = eINSTANCE.getValuedObject_Type();

		/**
         * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute VALUED_OBJECT__INITIAL_VALUE = eINSTANCE.getValuedObject_InitialValue();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.EmissionImpl <em>Emission</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.impl.EmissionImpl
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getEmission()
         * @generated
         */
		EClass EMISSION = eINSTANCE.getEmission();

		/**
         * The meta object literal for the '<em><b>New Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference EMISSION__NEW_VALUE = eINSTANCE.getEmission_NewValue();

		/**
         * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference EMISSION__SIGNAL = eINSTANCE.getEmission_Signal();

		/**
         * The meta object literal for the '<em><b>Parent Action</b></em>' container reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference EMISSION__PARENT_ACTION = eINSTANCE.getEmission_ParentAction();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.TransitionImpl <em>Transition</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.impl.TransitionImpl
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getTransition()
         * @generated
         */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
         * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute TRANSITION__DELAY = eINSTANCE.getTransition_Delay();

		/**
         * The meta object literal for the '<em><b>Immediate</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute TRANSITION__IMMEDIATE = eINSTANCE.getTransition_Immediate();

		/**
         * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute TRANSITION__PRIORITY = eINSTANCE.getTransition_Priority();

		/**
         * The meta object literal for the '<em><b>Transition Kind</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute TRANSITION__TRANSITION_KIND = eINSTANCE.getTransition_TransitionKind();

		/**
         * The meta object literal for the '<em><b>Target State</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference TRANSITION__TARGET_STATE = eINSTANCE.getTransition_TargetState();

		/**
         * The meta object literal for the '<em><b>Source State</b></em>' container reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference TRANSITION__SOURCE_STATE = eINSTANCE.getTransition_SourceState();

		/**
         * The meta object literal for the '<em><b>History</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute TRANSITION__HISTORY = eINSTANCE.getTransition_History();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.ExpressionImpl <em>Expression</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.impl.ExpressionImpl
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getExpression()
         * @generated
         */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
         * The meta object literal for the '<em><b>Parent Action</b></em>' container reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference EXPRESSION__PARENT_ACTION = eINSTANCE.getExpression_ParentAction();

		/**
         * The meta object literal for the '<em><b>Parent Emisson</b></em>' container reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference EXPRESSION__PARENT_EMISSON = eINSTANCE.getExpression_ParentEmisson();

		/**
         * The meta object literal for the '<em><b>Parent Assignment</b></em>' container reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference EXPRESSION__PARENT_ASSIGNMENT = eINSTANCE.getExpression_ParentAssignment();

		/**
         * The meta object literal for the '<em><b>Parent Expression</b></em>' container reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference EXPRESSION__PARENT_EXPRESSION = eINSTANCE.getExpression_ParentExpression();

		/**
         * The meta object literal for the '<em><b>Parent Suspension Trigger</b></em>' container reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference EXPRESSION__PARENT_SUSPENSION_TRIGGER = eINSTANCE.getExpression_ParentSuspensionTrigger();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.SignalRenamingImpl <em>Signal Renaming</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.impl.SignalRenamingImpl
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getSignalRenaming()
         * @generated
         */
		EClass SIGNAL_RENAMING = eINSTANCE.getSignalRenaming();

		/**
         * The meta object literal for the '<em><b>Old Signal</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SIGNAL_RENAMING__OLD_SIGNAL = eINSTANCE.getSignalRenaming_OldSignal();

		/**
         * The meta object literal for the '<em><b>New Signal</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SIGNAL_RENAMING__NEW_SIGNAL = eINSTANCE.getSignalRenaming_NewSignal();

		/**
         * The meta object literal for the '<em><b>Parent State</b></em>' container reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SIGNAL_RENAMING__PARENT_STATE = eINSTANCE.getSignalRenaming_ParentState();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.OperatorImpl <em>Operator</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.impl.OperatorImpl
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getOperator()
         * @generated
         */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
         * The meta object literal for the '<em><b>Operator Kind</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute OPERATOR__OPERATOR_KIND = eINSTANCE.getOperator_OperatorKind();

		/**
         * The meta object literal for the '<em><b>Parent Expression</b></em>' container reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference OPERATOR__PARENT_EXPRESSION = eINSTANCE.getOperator_ParentExpression();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.ActionImpl <em>Action</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.impl.ActionImpl
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getAction()
         * @generated
         */
		EClass ACTION = eINSTANCE.getAction();

		/**
         * The meta object literal for the '<em><b>Emissions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ACTION__EMISSIONS = eINSTANCE.getAction_Emissions();

		/**
         * The meta object literal for the '<em><b>Trigger</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ACTION__TRIGGER = eINSTANCE.getAction_Trigger();

		/**
         * The meta object literal for the '<em><b>Parent State Entry Action</b></em>' container reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ACTION__PARENT_STATE_ENTRY_ACTION = eINSTANCE.getAction_ParentStateEntryAction();

		/**
         * The meta object literal for the '<em><b>Assignments</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ACTION__ASSIGNMENTS = eINSTANCE.getAction_Assignments();

		/**
         * The meta object literal for the '<em><b>Triggers And Effects</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ACTION__TRIGGERS_AND_EFFECTS = eINSTANCE.getAction_TriggersAndEffects();

		/**
         * The meta object literal for the '<em><b>Parent State Inner Action</b></em>' container reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ACTION__PARENT_STATE_INNER_ACTION = eINSTANCE.getAction_ParentStateInnerAction();

		/**
         * The meta object literal for the '<em><b>Parent State Exit Action</b></em>' container reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ACTION__PARENT_STATE_EXIT_ACTION = eINSTANCE.getAction_ParentStateExitAction();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.SuspensionTriggerImpl <em>Suspension Trigger</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.impl.SuspensionTriggerImpl
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getSuspensionTrigger()
         * @generated
         */
		EClass SUSPENSION_TRIGGER = eINSTANCE.getSuspensionTrigger();

		/**
         * The meta object literal for the '<em><b>Parent State</b></em>' container reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SUSPENSION_TRIGGER__PARENT_STATE = eINSTANCE.getSuspensionTrigger_ParentState();

		/**
         * The meta object literal for the '<em><b>Immediate</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SUSPENSION_TRIGGER__IMMEDIATE = eINSTANCE.getSuspensionTrigger_Immediate();

		/**
         * The meta object literal for the '<em><b>Trigger</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SUSPENSION_TRIGGER__TRIGGER = eINSTANCE.getSuspensionTrigger_Trigger();

		/**
         * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SUSPENSION_TRIGGER__EXPRESSION = eINSTANCE.getSuspensionTrigger_Expression();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.AssignmentImpl <em>Assignment</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.impl.AssignmentImpl
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getAssignment()
         * @generated
         */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
         * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ASSIGNMENT__VARIABLE = eINSTANCE.getAssignment_Variable();

		/**
         * The meta object literal for the '<em><b>Parent Action</b></em>' container reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ASSIGNMENT__PARENT_ACTION = eINSTANCE.getAssignment_ParentAction();

		/**
         * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ASSIGNMENT__EXPRESSION = eINSTANCE.getAssignment_Expression();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.VariableImpl <em>Variable</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.impl.VariableImpl
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getVariable()
         * @generated
         */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
         * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference VARIABLE__VALUE = eINSTANCE.getVariable_Value();

		/**
         * The meta object literal for the '<em><b>Parent State</b></em>' container reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference VARIABLE__PARENT_STATE = eINSTANCE.getVariable_ParentState();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.RegionImpl <em>Region</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.impl.RegionImpl
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getRegion()
         * @generated
         */
		EClass REGION = eINSTANCE.getRegion();

		/**
         * The meta object literal for the '<em><b>Inner States</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference REGION__INNER_STATES = eINSTANCE.getRegion_InnerStates();

		/**
         * The meta object literal for the '<em><b>Parent State</b></em>' container reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference REGION__PARENT_STATE = eINSTANCE.getRegion_ParentState();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.ComplexExpressionImpl <em>Complex Expression</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.impl.ComplexExpressionImpl
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getComplexExpression()
         * @generated
         */
		EClass COMPLEX_EXPRESSION = eINSTANCE.getComplexExpression();

		/**
         * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference COMPLEX_EXPRESSION__OPERATOR = eINSTANCE.getComplexExpression_Operator();

		/**
         * The meta object literal for the '<em><b>Sub Expressions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference COMPLEX_EXPRESSION__SUB_EXPRESSIONS = eINSTANCE.getComplexExpression_SubExpressions();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.SignalReferenceImpl <em>Signal Reference</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.impl.SignalReferenceImpl
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getSignalReference()
         * @generated
         */
		EClass SIGNAL_REFERENCE = eINSTANCE.getSignalReference();

		/**
         * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SIGNAL_REFERENCE__SIGNAL = eINSTANCE.getSignalReference_Signal();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.impl.VariableReferenceImpl
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getVariableReference()
         * @generated
         */
		EClass VARIABLE_REFERENCE = eINSTANCE.getVariableReference();

		/**
         * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference VARIABLE_REFERENCE__VARIABLE = eINSTANCE.getVariableReference_Variable();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.StateKind <em>State Kind</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.StateKind
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getStateKind()
         * @generated
         */
		EEnum STATE_KIND = eINSTANCE.getStateKind();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.StateFlag <em>State Flag</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.StateFlag
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getStateFlag()
         * @generated
         */
		EEnum STATE_FLAG = eINSTANCE.getStateFlag();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.TransitionKind <em>Transition Kind</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.TransitionKind
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getTransitionKind()
         * @generated
         */
		EEnum TRANSITION_KIND = eINSTANCE.getTransitionKind();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.OperatorKind <em>Operator Kind</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.OperatorKind
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getOperatorKind()
         * @generated
         */
		EEnum OPERATOR_KIND = eINSTANCE.getOperatorKind();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.CombineType <em>Combine Type</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.CombineType
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getCombineType()
         * @generated
         */
		EEnum COMBINE_TYPE = eINSTANCE.getCombineType();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.ValueType <em>Value Type</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.ValueType
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getValueType()
         * @generated
         */
		EEnum VALUE_TYPE = eINSTANCE.getValueType();

	}

} //SyncchartsPackage
