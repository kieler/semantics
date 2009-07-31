/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl;

import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Assignment;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.BooleanValue;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Effect;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Emission;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Expression;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.FloatValue;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.HostCode;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.IntValue;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Operation;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Operations;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Operator;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.OperatorKind;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsFactory;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Signal;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.SignalReference;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateType;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.TransitionType;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Value;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.ValuedObject;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Variable;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.VariableReference;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RetypingSyncchartsPackageImpl extends EPackageImpl implements RetypingSyncchartsPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateContentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass effectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emissionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass signalReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valuedObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass signalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass floatValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hostCodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum stateTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum transitionTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum operatorKindEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private RetypingSyncchartsPackageImpl()
  {
    super(eNS_URI, RetypingSyncchartsFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link RetypingSyncchartsPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static RetypingSyncchartsPackage init()
  {
    if (isInited) return (RetypingSyncchartsPackage)EPackage.Registry.INSTANCE.getEPackage(RetypingSyncchartsPackage.eNS_URI);

    // Obtain or create and register package
    RetypingSyncchartsPackageImpl theRetypingSyncchartsPackage = (RetypingSyncchartsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RetypingSyncchartsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RetypingSyncchartsPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theRetypingSyncchartsPackage.createPackageContents();

    // Initialize created meta-data
    theRetypingSyncchartsPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theRetypingSyncchartsPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(RetypingSyncchartsPackage.eNS_URI, theRetypingSyncchartsPackage);
    return theRetypingSyncchartsPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getState()
  {
    return stateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getState_IsInitial()
  {
    return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getState_IsFinal()
  {
    return (EAttribute)stateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getState_StateKind()
  {
    return (EAttribute)stateEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getState_StateName()
  {
    return (EAttribute)stateEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getState_Label()
  {
    return (EAttribute)stateEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getState_StateContent()
  {
    return (EReference)stateEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getState_OutgoingTransitions()
  {
    return (EReference)stateEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getState_DeclaredStateType()
  {
    return (EAttribute)stateEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getState_DeclaredStateName()
  {
    return (EAttribute)stateEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateContent()
  {
    return stateContentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateContent_ExitActions()
  {
    return (EReference)stateContentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateContent_EntryActions()
  {
    return (EReference)stateContentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateContent_InnerAction()
  {
    return (EReference)stateContentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateContent_SignalsAndVariables()
  {
    return (EReference)stateContentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateContent_InnerStates()
  {
    return (EReference)stateContentEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateContent_ParallelStates()
  {
    return (EReference)stateContentEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAction()
  {
    return actionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAction_Trigger()
  {
    return (EReference)actionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAction_Effects()
  {
    return (EReference)actionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransition()
  {
    return transitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransition_SourceStateName()
  {
    return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransition_TransitionType()
  {
    return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransition_TargetStateName()
  {
    return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransition_DeclaredTargetState()
  {
    return (EReference)transitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransition_TransitionLabel()
  {
    return (EReference)transitionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEffect()
  {
    return effectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEmission()
  {
    return emissionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEmission_Signal()
  {
    return (EReference)emissionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEmission_NewValue()
  {
    return (EReference)emissionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssignment()
  {
    return assignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignment_Variable()
  {
    return (EReference)assignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignment_Expression()
  {
    return (EReference)assignmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSignalReference()
  {
    return signalReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSignalReference_Reference()
  {
    return (EReference)signalReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableReference()
  {
    return variableReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableReference_Reference()
  {
    return (EReference)variableReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValuedObject()
  {
    return valuedObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValuedObject_Name()
  {
    return (EAttribute)valuedObjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValuedObject_InitialValue()
  {
    return (EAttribute)valuedObjectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSignal()
  {
    return signalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariable()
  {
    return variableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntValue()
  {
    return intValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntValue_Value()
  {
    return (EAttribute)intValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFloatValue()
  {
    return floatValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFloatValue_Value()
  {
    return (EAttribute)floatValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanValue()
  {
    return booleanValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanValue_Value()
  {
    return (EAttribute)booleanValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValue()
  {
    return valueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHostCode()
  {
    return hostCodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHostCode_Code()
  {
    return (EAttribute)hostCodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperator()
  {
    return operatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperator_OperatorKind()
  {
    return (EAttribute)operatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_Operator()
  {
    return (EAttribute)expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_SubExpressions()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperations()
  {
    return operationsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperations_Operators()
  {
    return (EAttribute)operationsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperation()
  {
    return operationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_SubExpression()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getStateType()
  {
    return stateTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTransitionType()
  {
    return transitionTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOperatorKind()
  {
    return operatorKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RetypingSyncchartsFactory getRetypingSyncchartsFactory()
  {
    return (RetypingSyncchartsFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    stateEClass = createEClass(STATE);
    createEAttribute(stateEClass, STATE__IS_INITIAL);
    createEAttribute(stateEClass, STATE__IS_FINAL);
    createEAttribute(stateEClass, STATE__STATE_KIND);
    createEAttribute(stateEClass, STATE__STATE_NAME);
    createEAttribute(stateEClass, STATE__LABEL);
    createEReference(stateEClass, STATE__STATE_CONTENT);
    createEReference(stateEClass, STATE__OUTGOING_TRANSITIONS);
    createEAttribute(stateEClass, STATE__DECLARED_STATE_TYPE);
    createEAttribute(stateEClass, STATE__DECLARED_STATE_NAME);

    stateContentEClass = createEClass(STATE_CONTENT);
    createEReference(stateContentEClass, STATE_CONTENT__EXIT_ACTIONS);
    createEReference(stateContentEClass, STATE_CONTENT__ENTRY_ACTIONS);
    createEReference(stateContentEClass, STATE_CONTENT__INNER_ACTION);
    createEReference(stateContentEClass, STATE_CONTENT__SIGNALS_AND_VARIABLES);
    createEReference(stateContentEClass, STATE_CONTENT__INNER_STATES);
    createEReference(stateContentEClass, STATE_CONTENT__PARALLEL_STATES);

    actionEClass = createEClass(ACTION);
    createEReference(actionEClass, ACTION__TRIGGER);
    createEReference(actionEClass, ACTION__EFFECTS);

    transitionEClass = createEClass(TRANSITION);
    createEAttribute(transitionEClass, TRANSITION__SOURCE_STATE_NAME);
    createEAttribute(transitionEClass, TRANSITION__TRANSITION_TYPE);
    createEAttribute(transitionEClass, TRANSITION__TARGET_STATE_NAME);
    createEReference(transitionEClass, TRANSITION__DECLARED_TARGET_STATE);
    createEReference(transitionEClass, TRANSITION__TRANSITION_LABEL);

    effectEClass = createEClass(EFFECT);

    emissionEClass = createEClass(EMISSION);
    createEReference(emissionEClass, EMISSION__SIGNAL);
    createEReference(emissionEClass, EMISSION__NEW_VALUE);

    assignmentEClass = createEClass(ASSIGNMENT);
    createEReference(assignmentEClass, ASSIGNMENT__VARIABLE);
    createEReference(assignmentEClass, ASSIGNMENT__EXPRESSION);

    signalReferenceEClass = createEClass(SIGNAL_REFERENCE);
    createEReference(signalReferenceEClass, SIGNAL_REFERENCE__REFERENCE);

    variableReferenceEClass = createEClass(VARIABLE_REFERENCE);
    createEReference(variableReferenceEClass, VARIABLE_REFERENCE__REFERENCE);

    valuedObjectEClass = createEClass(VALUED_OBJECT);
    createEAttribute(valuedObjectEClass, VALUED_OBJECT__NAME);
    createEAttribute(valuedObjectEClass, VALUED_OBJECT__INITIAL_VALUE);

    signalEClass = createEClass(SIGNAL);

    variableEClass = createEClass(VARIABLE);

    intValueEClass = createEClass(INT_VALUE);
    createEAttribute(intValueEClass, INT_VALUE__VALUE);

    floatValueEClass = createEClass(FLOAT_VALUE);
    createEAttribute(floatValueEClass, FLOAT_VALUE__VALUE);

    booleanValueEClass = createEClass(BOOLEAN_VALUE);
    createEAttribute(booleanValueEClass, BOOLEAN_VALUE__VALUE);

    valueEClass = createEClass(VALUE);

    hostCodeEClass = createEClass(HOST_CODE);
    createEAttribute(hostCodeEClass, HOST_CODE__CODE);

    operatorEClass = createEClass(OPERATOR);
    createEAttribute(operatorEClass, OPERATOR__OPERATOR_KIND);

    expressionEClass = createEClass(EXPRESSION);
    createEAttribute(expressionEClass, EXPRESSION__OPERATOR);
    createEReference(expressionEClass, EXPRESSION__SUB_EXPRESSIONS);

    operationsEClass = createEClass(OPERATIONS);
    createEAttribute(operationsEClass, OPERATIONS__OPERATORS);

    operationEClass = createEClass(OPERATION);
    createEReference(operationEClass, OPERATION__SUB_EXPRESSION);

    // Create enums
    stateTypeEEnum = createEEnum(STATE_TYPE);
    transitionTypeEEnum = createEEnum(TRANSITION_TYPE);
    operatorKindEEnum = createEEnum(OPERATOR_KIND);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    emissionEClass.getESuperTypes().add(this.getEffect());
    assignmentEClass.getESuperTypes().add(this.getEffect());
    signalReferenceEClass.getESuperTypes().add(this.getExpression());
    variableReferenceEClass.getESuperTypes().add(this.getExpression());
    signalEClass.getESuperTypes().add(this.getValuedObject());
    variableEClass.getESuperTypes().add(this.getValuedObject());
    intValueEClass.getESuperTypes().add(this.getValue());
    intValueEClass.getESuperTypes().add(this.getExpression());
    floatValueEClass.getESuperTypes().add(this.getValue());
    floatValueEClass.getESuperTypes().add(this.getExpression());
    booleanValueEClass.getESuperTypes().add(this.getValue());
    booleanValueEClass.getESuperTypes().add(this.getExpression());
    hostCodeEClass.getESuperTypes().add(this.getEffect());
    operationsEClass.getESuperTypes().add(this.getExpression());
    operationEClass.getESuperTypes().add(this.getExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getState_IsInitial(), ecorePackage.getEBoolean(), "isInitial", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getState_IsFinal(), ecorePackage.getEBoolean(), "isFinal", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getState_StateKind(), this.getStateType(), "stateKind", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getState_StateName(), ecorePackage.getEString(), "stateName", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getState_Label(), ecorePackage.getEString(), "label", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getState_StateContent(), this.getStateContent(), null, "stateContent", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getState_OutgoingTransitions(), this.getTransition(), null, "outgoingTransitions", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getState_DeclaredStateType(), this.getStateType(), "declaredStateType", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getState_DeclaredStateName(), ecorePackage.getEString(), "declaredStateName", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateContentEClass, StateContent.class, "StateContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStateContent_ExitActions(), this.getAction(), null, "exitActions", null, 0, -1, StateContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStateContent_EntryActions(), this.getAction(), null, "entryActions", null, 0, -1, StateContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStateContent_InnerAction(), this.getAction(), null, "innerAction", null, 0, -1, StateContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStateContent_SignalsAndVariables(), this.getValuedObject(), null, "signalsAndVariables", null, 0, -1, StateContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStateContent_InnerStates(), this.getState(), null, "innerStates", null, 0, -1, StateContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStateContent_ParallelStates(), this.getState(), null, "parallelStates", null, 0, -1, StateContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAction_Trigger(), this.getExpression(), null, "trigger", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAction_Effects(), this.getEffect(), null, "effects", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTransition_SourceStateName(), ecorePackage.getEString(), "sourceStateName", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTransition_TransitionType(), this.getTransitionType(), "transitionType", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTransition_TargetStateName(), ecorePackage.getEString(), "targetStateName", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransition_DeclaredTargetState(), this.getState(), null, "declaredTargetState", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransition_TransitionLabel(), this.getAction(), null, "transitionLabel", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(effectEClass, Effect.class, "Effect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(emissionEClass, Emission.class, "Emission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEmission_Signal(), this.getSignal(), null, "signal", null, 0, 1, Emission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEmission_NewValue(), this.getExpression(), null, "newValue", null, 0, 1, Emission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssignment_Variable(), this.getVariable(), null, "variable", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssignment_Expression(), this.getExpression(), null, "expression", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(signalReferenceEClass, SignalReference.class, "SignalReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSignalReference_Reference(), this.getSignal(), null, "reference", null, 0, 1, SignalReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableReferenceEClass, VariableReference.class, "VariableReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariableReference_Reference(), this.getVariable(), null, "reference", null, 0, 1, VariableReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valuedObjectEClass, ValuedObject.class, "ValuedObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getValuedObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, ValuedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getValuedObject_InitialValue(), ecorePackage.getEString(), "initialValue", null, 0, 1, ValuedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(signalEClass, Signal.class, "Signal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(intValueEClass, IntValue.class, "IntValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntValue_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(floatValueEClass, FloatValue.class, "FloatValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFloatValue_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, FloatValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanValueEClass, BooleanValue.class, "BooleanValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBooleanValue_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, BooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(hostCodeEClass, HostCode.class, "HostCode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHostCode_Code(), ecorePackage.getEString(), "code", null, 0, 1, HostCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operatorEClass, Operator.class, "Operator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOperator_OperatorKind(), this.getOperatorKind(), "operatorKind", null, 0, 1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExpression_Operator(), this.getOperatorKind(), "operator", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_SubExpressions(), this.getExpression(), null, "subExpressions", null, 0, -1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationsEClass, Operations.class, "Operations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOperations_Operators(), this.getOperatorKind(), "operators", null, 0, 1, Operations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOperation_SubExpression(), this.getExpression(), null, "subExpression", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(stateTypeEEnum, StateType.class, "StateType");
    addEEnumLiteral(stateTypeEEnum, StateType.PSEUDO);
    addEEnumLiteral(stateTypeEEnum, StateType.REFERENCE);
    addEEnumLiteral(stateTypeEEnum, StateType.TEXTUAL);

    initEEnum(transitionTypeEEnum, TransitionType.class, "TransitionType");
    addEEnumLiteral(transitionTypeEEnum, TransitionType.STRONGABORT);
    addEEnumLiteral(transitionTypeEEnum, TransitionType.WEAKABORT);
    addEEnumLiteral(transitionTypeEEnum, TransitionType.NORMALTERMINATION);

    initEEnum(operatorKindEEnum, OperatorKind.class, "OperatorKind");
    addEEnumLiteral(operatorKindEEnum, OperatorKind.EQ);
    addEEnumLiteral(operatorKindEEnum, OperatorKind.LT);
    addEEnumLiteral(operatorKindEEnum, OperatorKind.LEQ);
    addEEnumLiteral(operatorKindEEnum, OperatorKind.GT);
    addEEnumLiteral(operatorKindEEnum, OperatorKind.GEQ);
    addEEnumLiteral(operatorKindEEnum, OperatorKind.NOT);
    addEEnumLiteral(operatorKindEEnum, OperatorKind.AND);
    addEEnumLiteral(operatorKindEEnum, OperatorKind.OR);
    addEEnumLiteral(operatorKindEEnum, OperatorKind.ADD);
    addEEnumLiteral(operatorKindEEnum, OperatorKind.SUB);
    addEEnumLiteral(operatorKindEEnum, OperatorKind.MULT);
    addEEnumLiteral(operatorKindEEnum, OperatorKind.DIV);
    addEEnumLiteral(operatorKindEEnum, OperatorKind.MOD);
    addEEnumLiteral(operatorKindEEnum, OperatorKind.VAL);
    addEEnumLiteral(operatorKindEEnum, OperatorKind.PRE);

    // Create resource
    createResource(eNS_URI);
  }

} //RetypingSyncchartsPackageImpl
