/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.dsl.retypingSynccharts;

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
 * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsFactory
 * @model kind="package"
 * @generated
 */
public interface RetypingSyncchartsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "retypingSynccharts";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cau.de/cs/kieler/synccharts/dsl/RetypingSynccharts";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "retypingSynccharts";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RetypingSyncchartsPackage eINSTANCE = de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateImpl
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getState()
   * @generated
   */
  int STATE = 0;

  /**
   * The feature id for the '<em><b>Is Initial</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__IS_INITIAL = 0;

  /**
   * The feature id for the '<em><b>Is Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__IS_FINAL = 1;

  /**
   * The feature id for the '<em><b>State Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__STATE_KIND = 2;

  /**
   * The feature id for the '<em><b>State Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__STATE_NAME = 3;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__LABEL = 4;

  /**
   * The feature id for the '<em><b>State Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__STATE_CONTENT = 5;

  /**
   * The feature id for the '<em><b>Outgoing Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__OUTGOING_TRANSITIONS = 6;

  /**
   * The feature id for the '<em><b>Declared State Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__DECLARED_STATE_TYPE = 7;

  /**
   * The feature id for the '<em><b>Declared State Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__DECLARED_STATE_NAME = 8;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateContentImpl <em>State Content</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateContentImpl
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getStateContent()
   * @generated
   */
  int STATE_CONTENT = 1;

  /**
   * The feature id for the '<em><b>Exit Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_CONTENT__EXIT_ACTIONS = 0;

  /**
   * The feature id for the '<em><b>Entry Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_CONTENT__ENTRY_ACTIONS = 1;

  /**
   * The feature id for the '<em><b>Inner Action</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_CONTENT__INNER_ACTION = 2;

  /**
   * The feature id for the '<em><b>Signals And Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_CONTENT__SIGNALS_AND_VARIABLES = 3;

  /**
   * The feature id for the '<em><b>Inner States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_CONTENT__INNER_STATES = 4;

  /**
   * The feature id for the '<em><b>Parallel States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_CONTENT__PARALLEL_STATES = 5;

  /**
   * The number of structural features of the '<em>State Content</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_CONTENT_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ActionImpl
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getAction()
   * @generated
   */
  int ACTION = 2;

  /**
   * The feature id for the '<em><b>Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__TRIGGER = 0;

  /**
   * The feature id for the '<em><b>Effects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__EFFECTS = 1;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.TransitionImpl
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 3;

  /**
   * The feature id for the '<em><b>Source State Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__SOURCE_STATE_NAME = 0;

  /**
   * The feature id for the '<em><b>Transition Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__TRANSITION_TYPE = 1;

  /**
   * The feature id for the '<em><b>Target State Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__TARGET_STATE_NAME = 2;

  /**
   * The feature id for the '<em><b>Declared Target State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__DECLARED_TARGET_STATE = 3;

  /**
   * The feature id for the '<em><b>Transition Label</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__TRANSITION_LABEL = 4;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.EffectImpl <em>Effect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.EffectImpl
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getEffect()
   * @generated
   */
  int EFFECT = 4;

  /**
   * The number of structural features of the '<em>Effect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.EmissionImpl <em>Emission</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.EmissionImpl
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getEmission()
   * @generated
   */
  int EMISSION = 5;

  /**
   * The feature id for the '<em><b>Signal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMISSION__SIGNAL = EFFECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>New Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMISSION__NEW_VALUE = EFFECT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Emission</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMISSION_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.AssignmentImpl <em>Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.AssignmentImpl
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getAssignment()
   * @generated
   */
  int ASSIGNMENT = 6;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__VARIABLE = EFFECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__EXPRESSION = EFFECT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ExpressionImpl
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 18;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__OPERATOR = 0;

  /**
   * The feature id for the '<em><b>Sub Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__SUB_EXPRESSIONS = 1;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.SignalReferenceImpl <em>Signal Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.SignalReferenceImpl
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getSignalReference()
   * @generated
   */
  int SIGNAL_REFERENCE = 7;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_REFERENCE__OPERATOR = EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Sub Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_REFERENCE__SUB_EXPRESSIONS = EXPRESSION__SUB_EXPRESSIONS;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_REFERENCE__REFERENCE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Signal Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.VariableReferenceImpl
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getVariableReference()
   * @generated
   */
  int VARIABLE_REFERENCE = 8;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REFERENCE__OPERATOR = EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Sub Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REFERENCE__SUB_EXPRESSIONS = EXPRESSION__SUB_EXPRESSIONS;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REFERENCE__REFERENCE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ValuedObjectImpl <em>Valued Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ValuedObjectImpl
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getValuedObject()
   * @generated
   */
  int VALUED_OBJECT = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUED_OBJECT__NAME = 0;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUED_OBJECT__INITIAL_VALUE = 1;

  /**
   * The number of structural features of the '<em>Valued Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUED_OBJECT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.SignalImpl <em>Signal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.SignalImpl
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getSignal()
   * @generated
   */
  int SIGNAL = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL__NAME = VALUED_OBJECT__NAME;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL__INITIAL_VALUE = VALUED_OBJECT__INITIAL_VALUE;

  /**
   * The number of structural features of the '<em>Signal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_FEATURE_COUNT = VALUED_OBJECT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.VariableImpl
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getVariable()
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
   * The feature id for the '<em><b>Initial Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__INITIAL_VALUE = VALUED_OBJECT__INITIAL_VALUE;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = VALUED_OBJECT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ValueImpl
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getValue()
   * @generated
   */
  int VALUE = 15;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.IntValueImpl <em>Int Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.IntValueImpl
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getIntValue()
   * @generated
   */
  int INT_VALUE = 12;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VALUE__OPERATOR = VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sub Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VALUE__SUB_EXPRESSIONS = VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VALUE__VALUE = VALUE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Int Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.FloatValueImpl <em>Float Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.FloatValueImpl
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getFloatValue()
   * @generated
   */
  int FLOAT_VALUE = 13;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_VALUE__OPERATOR = VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sub Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_VALUE__SUB_EXPRESSIONS = VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_VALUE__VALUE = VALUE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Float Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.BooleanValueImpl
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getBooleanValue()
   * @generated
   */
  int BOOLEAN_VALUE = 14;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE__OPERATOR = VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sub Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE__SUB_EXPRESSIONS = VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE__VALUE = VALUE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Boolean Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.HostCodeImpl <em>Host Code</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.HostCodeImpl
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getHostCode()
   * @generated
   */
  int HOST_CODE = 16;

  /**
   * The feature id for the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOST_CODE__CODE = EFFECT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Host Code</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOST_CODE_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.OperatorImpl <em>Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.OperatorImpl
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getOperator()
   * @generated
   */
  int OPERATOR = 17;

  /**
   * The feature id for the '<em><b>Operator Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR__OPERATOR_KIND = 0;

  /**
   * The number of structural features of the '<em>Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.OperationsImpl <em>Operations</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.OperationsImpl
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getOperations()
   * @generated
   */
  int OPERATIONS = 19;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATIONS__OPERATOR = EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Sub Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATIONS__SUB_EXPRESSIONS = EXPRESSION__SUB_EXPRESSIONS;

  /**
   * The feature id for the '<em><b>Operators</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATIONS__OPERATORS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Operations</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATIONS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.OperationImpl
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 20;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__OPERATOR = EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Sub Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__SUB_EXPRESSIONS = EXPRESSION__SUB_EXPRESSIONS;

  /**
   * The feature id for the '<em><b>Sub Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__SUB_EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateType <em>State Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateType
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getStateType()
   * @generated
   */
  int STATE_TYPE = 21;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.TransitionType <em>Transition Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.TransitionType
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getTransitionType()
   * @generated
   */
  int TRANSITION_TYPE = 22;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.OperatorKind <em>Operator Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.OperatorKind
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getOperatorKind()
   * @generated
   */
  int OPERATOR_KIND = 23;


  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#isIsInitial <em>Is Initial</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Initial</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#isIsInitial()
   * @see #getState()
   * @generated
   */
  EAttribute getState_IsInitial();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#isIsFinal <em>Is Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Final</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#isIsFinal()
   * @see #getState()
   * @generated
   */
  EAttribute getState_IsFinal();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getStateKind <em>State Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>State Kind</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getStateKind()
   * @see #getState()
   * @generated
   */
  EAttribute getState_StateKind();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getStateName <em>State Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>State Name</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getStateName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_StateName();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getLabel()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Label();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getStateContent <em>State Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>State Content</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getStateContent()
   * @see #getState()
   * @generated
   */
  EReference getState_StateContent();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Outgoing Transitions</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getOutgoingTransitions()
   * @see #getState()
   * @generated
   */
  EReference getState_OutgoingTransitions();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getDeclaredStateType <em>Declared State Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Declared State Type</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getDeclaredStateType()
   * @see #getState()
   * @generated
   */
  EAttribute getState_DeclaredStateType();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getDeclaredStateName <em>Declared State Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Declared State Name</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getDeclaredStateName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_DeclaredStateName();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent <em>State Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Content</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent
   * @generated
   */
  EClass getStateContent();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getExitActions <em>Exit Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exit Actions</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getExitActions()
   * @see #getStateContent()
   * @generated
   */
  EReference getStateContent_ExitActions();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getEntryActions <em>Entry Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entry Actions</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getEntryActions()
   * @see #getStateContent()
   * @generated
   */
  EReference getStateContent_EntryActions();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getInnerAction <em>Inner Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inner Action</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getInnerAction()
   * @see #getStateContent()
   * @generated
   */
  EReference getStateContent_InnerAction();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getSignalsAndVariables <em>Signals And Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Signals And Variables</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getSignalsAndVariables()
   * @see #getStateContent()
   * @generated
   */
  EReference getStateContent_SignalsAndVariables();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getInnerStates <em>Inner States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inner States</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getInnerStates()
   * @see #getStateContent()
   * @generated
   */
  EReference getStateContent_InnerStates();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getParallelStates <em>Parallel States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parallel States</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getParallelStates()
   * @see #getStateContent()
   * @generated
   */
  EReference getStateContent_ParallelStates();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action#getTrigger <em>Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trigger</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action#getTrigger()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Trigger();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action#getEffects <em>Effects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Effects</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action#getEffects()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Effects();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition#getSourceStateName <em>Source State Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source State Name</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition#getSourceStateName()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_SourceStateName();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition#getTransitionType <em>Transition Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Transition Type</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition#getTransitionType()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_TransitionType();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition#getTargetStateName <em>Target State Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target State Name</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition#getTargetStateName()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_TargetStateName();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition#getDeclaredTargetState <em>Declared Target State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Declared Target State</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition#getDeclaredTargetState()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_DeclaredTargetState();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition#getTransitionLabel <em>Transition Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Transition Label</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition#getTransitionLabel()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_TransitionLabel();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Effect <em>Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Effect</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Effect
   * @generated
   */
  EClass getEffect();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Emission <em>Emission</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Emission</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Emission
   * @generated
   */
  EClass getEmission();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Emission#getSignal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Signal</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Emission#getSignal()
   * @see #getEmission()
   * @generated
   */
  EReference getEmission_Signal();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Emission#getNewValue <em>New Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>New Value</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Emission#getNewValue()
   * @see #getEmission()
   * @generated
   */
  EReference getEmission_NewValue();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Assignment
   * @generated
   */
  EClass getAssignment();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Assignment#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Assignment#getVariable()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Variable();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Assignment#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Assignment#getExpression()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Expression();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.SignalReference <em>Signal Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signal Reference</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.SignalReference
   * @generated
   */
  EClass getSignalReference();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.SignalReference#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.SignalReference#getReference()
   * @see #getSignalReference()
   * @generated
   */
  EReference getSignalReference_Reference();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.VariableReference <em>Variable Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Reference</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.VariableReference
   * @generated
   */
  EClass getVariableReference();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.VariableReference#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.VariableReference#getReference()
   * @see #getVariableReference()
   * @generated
   */
  EReference getVariableReference_Reference();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.ValuedObject <em>Valued Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Valued Object</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.ValuedObject
   * @generated
   */
  EClass getValuedObject();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.ValuedObject#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.ValuedObject#getName()
   * @see #getValuedObject()
   * @generated
   */
  EAttribute getValuedObject_Name();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.ValuedObject#getInitialValue <em>Initial Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Initial Value</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.ValuedObject#getInitialValue()
   * @see #getValuedObject()
   * @generated
   */
  EAttribute getValuedObject_InitialValue();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Signal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signal</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Signal
   * @generated
   */
  EClass getSignal();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.IntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Value</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.IntValue
   * @generated
   */
  EClass getIntValue();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.IntValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.IntValue#getValue()
   * @see #getIntValue()
   * @generated
   */
  EAttribute getIntValue_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.FloatValue <em>Float Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float Value</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.FloatValue
   * @generated
   */
  EClass getFloatValue();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.FloatValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.FloatValue#getValue()
   * @see #getFloatValue()
   * @generated
   */
  EAttribute getFloatValue_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.BooleanValue <em>Boolean Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Value</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.BooleanValue
   * @generated
   */
  EClass getBooleanValue();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.BooleanValue#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.BooleanValue#isValue()
   * @see #getBooleanValue()
   * @generated
   */
  EAttribute getBooleanValue_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.HostCode <em>Host Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Host Code</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.HostCode
   * @generated
   */
  EClass getHostCode();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.HostCode#getCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.HostCode#getCode()
   * @see #getHostCode()
   * @generated
   */
  EAttribute getHostCode_Code();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operator</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Operator
   * @generated
   */
  EClass getOperator();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Operator#getOperatorKind <em>Operator Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator Kind</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Operator#getOperatorKind()
   * @see #getOperator()
   * @generated
   */
  EAttribute getOperator_OperatorKind();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Expression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Expression#getOperator()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Operator();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Expression#getSubExpressions <em>Sub Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Expressions</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Expression#getSubExpressions()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_SubExpressions();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Operations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operations</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Operations
   * @generated
   */
  EClass getOperations();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Operations#getOperators <em>Operators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operators</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Operations#getOperators()
   * @see #getOperations()
   * @generated
   */
  EAttribute getOperations_Operators();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Operation#getSubExpression <em>Sub Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Expression</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Operation#getSubExpression()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_SubExpression();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateType <em>State Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>State Type</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateType
   * @generated
   */
  EEnum getStateType();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.TransitionType <em>Transition Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Transition Type</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.TransitionType
   * @generated
   */
  EEnum getTransitionType();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.OperatorKind <em>Operator Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Operator Kind</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.OperatorKind
   * @generated
   */
  EEnum getOperatorKind();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RetypingSyncchartsFactory getRetypingSyncchartsFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateImpl
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Is Initial</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__IS_INITIAL = eINSTANCE.getState_IsInitial();

    /**
     * The meta object literal for the '<em><b>Is Final</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__IS_FINAL = eINSTANCE.getState_IsFinal();

    /**
     * The meta object literal for the '<em><b>State Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__STATE_KIND = eINSTANCE.getState_StateKind();

    /**
     * The meta object literal for the '<em><b>State Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__STATE_NAME = eINSTANCE.getState_StateName();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__LABEL = eINSTANCE.getState_Label();

    /**
     * The meta object literal for the '<em><b>State Content</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__STATE_CONTENT = eINSTANCE.getState_StateContent();

    /**
     * The meta object literal for the '<em><b>Outgoing Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__OUTGOING_TRANSITIONS = eINSTANCE.getState_OutgoingTransitions();

    /**
     * The meta object literal for the '<em><b>Declared State Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__DECLARED_STATE_TYPE = eINSTANCE.getState_DeclaredStateType();

    /**
     * The meta object literal for the '<em><b>Declared State Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__DECLARED_STATE_NAME = eINSTANCE.getState_DeclaredStateName();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateContentImpl <em>State Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateContentImpl
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getStateContent()
     * @generated
     */
    EClass STATE_CONTENT = eINSTANCE.getStateContent();

    /**
     * The meta object literal for the '<em><b>Exit Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_CONTENT__EXIT_ACTIONS = eINSTANCE.getStateContent_ExitActions();

    /**
     * The meta object literal for the '<em><b>Entry Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_CONTENT__ENTRY_ACTIONS = eINSTANCE.getStateContent_EntryActions();

    /**
     * The meta object literal for the '<em><b>Inner Action</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_CONTENT__INNER_ACTION = eINSTANCE.getStateContent_InnerAction();

    /**
     * The meta object literal for the '<em><b>Signals And Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_CONTENT__SIGNALS_AND_VARIABLES = eINSTANCE.getStateContent_SignalsAndVariables();

    /**
     * The meta object literal for the '<em><b>Inner States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_CONTENT__INNER_STATES = eINSTANCE.getStateContent_InnerStates();

    /**
     * The meta object literal for the '<em><b>Parallel States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_CONTENT__PARALLEL_STATES = eINSTANCE.getStateContent_ParallelStates();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ActionImpl
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '<em><b>Trigger</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__TRIGGER = eINSTANCE.getAction_Trigger();

    /**
     * The meta object literal for the '<em><b>Effects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__EFFECTS = eINSTANCE.getAction_Effects();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.TransitionImpl
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>Source State Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__SOURCE_STATE_NAME = eINSTANCE.getTransition_SourceStateName();

    /**
     * The meta object literal for the '<em><b>Transition Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__TRANSITION_TYPE = eINSTANCE.getTransition_TransitionType();

    /**
     * The meta object literal for the '<em><b>Target State Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__TARGET_STATE_NAME = eINSTANCE.getTransition_TargetStateName();

    /**
     * The meta object literal for the '<em><b>Declared Target State</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__DECLARED_TARGET_STATE = eINSTANCE.getTransition_DeclaredTargetState();

    /**
     * The meta object literal for the '<em><b>Transition Label</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__TRANSITION_LABEL = eINSTANCE.getTransition_TransitionLabel();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.EffectImpl <em>Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.EffectImpl
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getEffect()
     * @generated
     */
    EClass EFFECT = eINSTANCE.getEffect();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.EmissionImpl <em>Emission</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.EmissionImpl
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getEmission()
     * @generated
     */
    EClass EMISSION = eINSTANCE.getEmission();

    /**
     * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMISSION__SIGNAL = eINSTANCE.getEmission_Signal();

    /**
     * The meta object literal for the '<em><b>New Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMISSION__NEW_VALUE = eINSTANCE.getEmission_NewValue();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.AssignmentImpl
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getAssignment()
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
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__EXPRESSION = eINSTANCE.getAssignment_Expression();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.SignalReferenceImpl <em>Signal Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.SignalReferenceImpl
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getSignalReference()
     * @generated
     */
    EClass SIGNAL_REFERENCE = eINSTANCE.getSignalReference();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNAL_REFERENCE__REFERENCE = eINSTANCE.getSignalReference_Reference();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.VariableReferenceImpl
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getVariableReference()
     * @generated
     */
    EClass VARIABLE_REFERENCE = eINSTANCE.getVariableReference();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_REFERENCE__REFERENCE = eINSTANCE.getVariableReference_Reference();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ValuedObjectImpl <em>Valued Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ValuedObjectImpl
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getValuedObject()
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
     * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUED_OBJECT__INITIAL_VALUE = eINSTANCE.getValuedObject_InitialValue();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.SignalImpl <em>Signal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.SignalImpl
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getSignal()
     * @generated
     */
    EClass SIGNAL = eINSTANCE.getSignal();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.VariableImpl
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.IntValueImpl <em>Int Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.IntValueImpl
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getIntValue()
     * @generated
     */
    EClass INT_VALUE = eINSTANCE.getIntValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_VALUE__VALUE = eINSTANCE.getIntValue_Value();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.FloatValueImpl <em>Float Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.FloatValueImpl
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getFloatValue()
     * @generated
     */
    EClass FLOAT_VALUE = eINSTANCE.getFloatValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOAT_VALUE__VALUE = eINSTANCE.getFloatValue_Value();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.BooleanValueImpl
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getBooleanValue()
     * @generated
     */
    EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_VALUE__VALUE = eINSTANCE.getBooleanValue_Value();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ValueImpl
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.HostCodeImpl <em>Host Code</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.HostCodeImpl
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getHostCode()
     * @generated
     */
    EClass HOST_CODE = eINSTANCE.getHostCode();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HOST_CODE__CODE = eINSTANCE.getHostCode_Code();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.OperatorImpl <em>Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.OperatorImpl
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getOperator()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ExpressionImpl
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__OPERATOR = eINSTANCE.getExpression_Operator();

    /**
     * The meta object literal for the '<em><b>Sub Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__SUB_EXPRESSIONS = eINSTANCE.getExpression_SubExpressions();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.OperationsImpl <em>Operations</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.OperationsImpl
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getOperations()
     * @generated
     */
    EClass OPERATIONS = eINSTANCE.getOperations();

    /**
     * The meta object literal for the '<em><b>Operators</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATIONS__OPERATORS = eINSTANCE.getOperations_Operators();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.OperationImpl
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '<em><b>Sub Expression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__SUB_EXPRESSION = eINSTANCE.getOperation_SubExpression();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateType <em>State Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateType
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getStateType()
     * @generated
     */
    EEnum STATE_TYPE = eINSTANCE.getStateType();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.TransitionType <em>Transition Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.TransitionType
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getTransitionType()
     * @generated
     */
    EEnum TRANSITION_TYPE = eINSTANCE.getTransitionType();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.OperatorKind <em>Operator Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.OperatorKind
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getOperatorKind()
     * @generated
     */
    EEnum OPERATOR_KIND = eINSTANCE.getOperatorKind();

  }

} //RetypingSyncchartsPackage
