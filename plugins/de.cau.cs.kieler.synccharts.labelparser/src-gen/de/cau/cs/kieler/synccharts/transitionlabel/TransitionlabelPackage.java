/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.transitionlabel;

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
 * @see de.cau.cs.kieler.synccharts.transitionlabel.TransitionlabelFactory
 * @model kind="package"
 * @generated
 */
public interface TransitionlabelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "transitionlabel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://kieler.cs.cau.de/synccharts/actionlabel";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "transitionlabel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TransitionlabelPackage eINSTANCE = de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.ModelImpl
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Signals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__SIGNALS = 0;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__VARIABLES = 1;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ACTIONS = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.ActionImpl
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getAction()
   * @generated
   */
  int ACTION = 1;

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
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.EffectImpl <em>Effect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.EffectImpl
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getEffect()
   * @generated
   */
  int EFFECT = 2;

  /**
   * The number of structural features of the '<em>Effect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.EmissionImpl <em>Emission</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.EmissionImpl
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getEmission()
   * @generated
   */
  int EMISSION = 3;

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
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.AssignmentImpl <em>Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.AssignmentImpl
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getAssignment()
   * @generated
   */
  int ASSIGNMENT = 4;

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
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.ExpressionImpl
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 15;

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
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.SignalReferenceImpl <em>Signal Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.SignalReferenceImpl
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getSignalReference()
   * @generated
   */
  int SIGNAL_REFERENCE = 5;

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
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.VariableReferenceImpl
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getVariableReference()
   * @generated
   */
  int VARIABLE_REFERENCE = 6;

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
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.SignalImpl <em>Signal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.SignalImpl
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getSignal()
   * @generated
   */
  int SIGNAL = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL__NAME = 0;

  /**
   * The number of structural features of the '<em>Signal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.VariableImpl
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = 0;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.ValueImpl
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getValue()
   * @generated
   */
  int VALUE = 12;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.IntValueImpl <em>Int Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.IntValueImpl
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getIntValue()
   * @generated
   */
  int INT_VALUE = 9;

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
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.FloatValueImpl <em>Float Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.FloatValueImpl
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getFloatValue()
   * @generated
   */
  int FLOAT_VALUE = 10;

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
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.BooleanValueImpl
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getBooleanValue()
   * @generated
   */
  int BOOLEAN_VALUE = 11;

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
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.HostCodeImpl <em>Host Code</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.HostCodeImpl
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getHostCode()
   * @generated
   */
  int HOST_CODE = 13;

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
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.OperatorImpl <em>Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.OperatorImpl
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getOperator()
   * @generated
   */
  int OPERATOR = 14;

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
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.OperationsImpl <em>Operations</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.OperationsImpl
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getOperations()
   * @generated
   */
  int OPERATIONS = 16;

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
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.OperationImpl
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 17;

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
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.OperatorKind <em>Operator Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.transitionlabel.OperatorKind
   * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getOperatorKind()
   * @generated
   */
  int OPERATOR_KIND = 18;


  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.transitionlabel.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.transitionlabel.Model#getSignals <em>Signals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Signals</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.Model#getSignals()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Signals();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.transitionlabel.Model#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.Model#getVariables()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Variables();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.transitionlabel.Model#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.Model#getActions()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Actions();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.transitionlabel.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts.transitionlabel.Action#getTrigger <em>Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trigger</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.Action#getTrigger()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Trigger();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.transitionlabel.Action#getEffects <em>Effects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Effects</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.Action#getEffects()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Effects();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.transitionlabel.Effect <em>Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Effect</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.Effect
   * @generated
   */
  EClass getEffect();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.transitionlabel.Emission <em>Emission</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Emission</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.Emission
   * @generated
   */
  EClass getEmission();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts.transitionlabel.Emission#getSignal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Signal</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.Emission#getSignal()
   * @see #getEmission()
   * @generated
   */
  EReference getEmission_Signal();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts.transitionlabel.Emission#getNewValue <em>New Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>New Value</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.Emission#getNewValue()
   * @see #getEmission()
   * @generated
   */
  EReference getEmission_NewValue();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.transitionlabel.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.Assignment
   * @generated
   */
  EClass getAssignment();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts.transitionlabel.Assignment#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.Assignment#getVariable()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Variable();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts.transitionlabel.Assignment#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.Assignment#getExpression()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Expression();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.transitionlabel.SignalReference <em>Signal Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signal Reference</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.SignalReference
   * @generated
   */
  EClass getSignalReference();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts.transitionlabel.SignalReference#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.SignalReference#getReference()
   * @see #getSignalReference()
   * @generated
   */
  EReference getSignalReference_Reference();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.transitionlabel.VariableReference <em>Variable Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Reference</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.VariableReference
   * @generated
   */
  EClass getVariableReference();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts.transitionlabel.VariableReference#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.VariableReference#getReference()
   * @see #getVariableReference()
   * @generated
   */
  EReference getVariableReference_Reference();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.transitionlabel.Signal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signal</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.Signal
   * @generated
   */
  EClass getSignal();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.transitionlabel.Signal#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.Signal#getName()
   * @see #getSignal()
   * @generated
   */
  EAttribute getSignal_Name();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.transitionlabel.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.transitionlabel.Variable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.Variable#getName()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Name();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.transitionlabel.IntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Value</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.IntValue
   * @generated
   */
  EClass getIntValue();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.transitionlabel.IntValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.IntValue#getValue()
   * @see #getIntValue()
   * @generated
   */
  EAttribute getIntValue_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.transitionlabel.FloatValue <em>Float Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float Value</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.FloatValue
   * @generated
   */
  EClass getFloatValue();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.transitionlabel.FloatValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.FloatValue#getValue()
   * @see #getFloatValue()
   * @generated
   */
  EAttribute getFloatValue_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.transitionlabel.BooleanValue <em>Boolean Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Value</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.BooleanValue
   * @generated
   */
  EClass getBooleanValue();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.transitionlabel.BooleanValue#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.BooleanValue#isValue()
   * @see #getBooleanValue()
   * @generated
   */
  EAttribute getBooleanValue_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.transitionlabel.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.transitionlabel.HostCode <em>Host Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Host Code</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.HostCode
   * @generated
   */
  EClass getHostCode();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.transitionlabel.HostCode#getCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.HostCode#getCode()
   * @see #getHostCode()
   * @generated
   */
  EAttribute getHostCode_Code();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.transitionlabel.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operator</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.Operator
   * @generated
   */
  EClass getOperator();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.transitionlabel.Operator#getOperatorKind <em>Operator Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator Kind</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.Operator#getOperatorKind()
   * @see #getOperator()
   * @generated
   */
  EAttribute getOperator_OperatorKind();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.transitionlabel.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.transitionlabel.Expression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.Expression#getOperator()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Operator();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.transitionlabel.Expression#getSubExpressions <em>Sub Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Expressions</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.Expression#getSubExpressions()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_SubExpressions();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.transitionlabel.Operations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operations</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.Operations
   * @generated
   */
  EClass getOperations();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.transitionlabel.Operations#getOperators <em>Operators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operators</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.Operations#getOperators()
   * @see #getOperations()
   * @generated
   */
  EAttribute getOperations_Operators();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.transitionlabel.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.transitionlabel.Operation#getSubExpression <em>Sub Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Expression</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.Operation#getSubExpression()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_SubExpression();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.kieler.synccharts.transitionlabel.OperatorKind <em>Operator Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Operator Kind</em>'.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.OperatorKind
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
  TransitionlabelFactory getTransitionlabelFactory();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.ModelImpl
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Signals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__SIGNALS = eINSTANCE.getModel_Signals();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__VARIABLES = eINSTANCE.getModel_Variables();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ACTIONS = eINSTANCE.getModel_Actions();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.ActionImpl
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getAction()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.EffectImpl <em>Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.EffectImpl
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getEffect()
     * @generated
     */
    EClass EFFECT = eINSTANCE.getEffect();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.EmissionImpl <em>Emission</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.EmissionImpl
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getEmission()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.AssignmentImpl
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getAssignment()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.SignalReferenceImpl <em>Signal Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.SignalReferenceImpl
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getSignalReference()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.VariableReferenceImpl
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getVariableReference()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.SignalImpl <em>Signal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.SignalImpl
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getSignal()
     * @generated
     */
    EClass SIGNAL = eINSTANCE.getSignal();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIGNAL__NAME = eINSTANCE.getSignal_Name();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.VariableImpl
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.IntValueImpl <em>Int Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.IntValueImpl
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getIntValue()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.FloatValueImpl <em>Float Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.FloatValueImpl
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getFloatValue()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.BooleanValueImpl
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getBooleanValue()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.ValueImpl
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.HostCodeImpl <em>Host Code</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.HostCodeImpl
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getHostCode()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.OperatorImpl <em>Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.OperatorImpl
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getOperator()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.ExpressionImpl
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getExpression()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.OperationsImpl <em>Operations</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.OperationsImpl
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getOperations()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.OperationImpl
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getOperation()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.transitionlabel.OperatorKind <em>Operator Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.transitionlabel.OperatorKind
     * @see de.cau.cs.kieler.synccharts.transitionlabel.impl.TransitionlabelPackageImpl#getOperatorKind()
     * @generated
     */
    EEnum OPERATOR_KIND = eINSTANCE.getOperatorKind();

  }

} //TransitionlabelPackage
