/**
 */
package de.cau.cs.kieler.yakindu.model.stext.synctext.impl;

import de.cau.cs.kieler.yakindu.model.stext.synctext.CombineOperator;
import de.cau.cs.kieler.yakindu.model.stext.synctext.Entry;
import de.cau.cs.kieler.yakindu.model.stext.synctext.EventDefinition;
import de.cau.cs.kieler.yakindu.model.stext.synctext.EventValueReferenceExpression;
import de.cau.cs.kieler.yakindu.model.stext.synctext.Exit;
import de.cau.cs.kieler.yakindu.model.stext.synctext.Inside;
import de.cau.cs.kieler.yakindu.model.stext.synctext.LocalReaction;
import de.cau.cs.kieler.yakindu.model.stext.synctext.MultiplicativeOperator2;
import de.cau.cs.kieler.yakindu.model.stext.synctext.NumericalMultiplyDivideExpression;
import de.cau.cs.kieler.yakindu.model.stext.synctext.OperationDefinition;
import de.cau.cs.kieler.yakindu.model.stext.synctext.PreValueExpression;
import de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionEffect;
import de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionTrigger;
import de.cau.cs.kieler.yakindu.model.stext.synctext.SignalDefinition;
import de.cau.cs.kieler.yakindu.model.stext.synctext.SimpleScope;
import de.cau.cs.kieler.yakindu.model.stext.synctext.StateReaction;
import de.cau.cs.kieler.yakindu.model.stext.synctext.StateScope;
import de.cau.cs.kieler.yakindu.model.stext.synctext.SuspendEffect;
import de.cau.cs.kieler.yakindu.model.stext.synctext.SynctextFactory;
import de.cau.cs.kieler.yakindu.model.stext.synctext.SynctextPackage;
import de.cau.cs.kieler.yakindu.model.stext.synctext.VariableDefinition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.yakindu.base.types.TypesPackage;

import org.yakindu.sct.model.sgraph.SGraphPackage;

import org.yakindu.sct.model.stext.stext.StextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SynctextPackageImpl extends EPackageImpl implements SynctextPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateScopeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass signalDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localReactionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateReactionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass insideEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleScopeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass suspendEffectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reactionTriggerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reactionEffectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numericalMultiplyDivideExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventValueReferenceExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass preValueExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum multiplicativeOperator2EEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum combineOperatorEEnum = null;

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
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.SynctextPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SynctextPackageImpl()
  {
    super(eNS_URI, SynctextFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link SynctextPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SynctextPackage init()
  {
    if (isInited) return (SynctextPackage)EPackage.Registry.INSTANCE.getEPackage(SynctextPackage.eNS_URI);

    // Obtain or create and register package
    SynctextPackageImpl theSynctextPackage = (SynctextPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SynctextPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SynctextPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    StextPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theSynctextPackage.createPackageContents();

    // Initialize created meta-data
    theSynctextPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSynctextPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SynctextPackage.eNS_URI, theSynctextPackage);
    return theSynctextPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateScope()
  {
    return stateScopeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSignalDefinition()
  {
    return signalDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableDefinition()
  {
    return variableDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDefinition_IsInput()
  {
    return (EAttribute)variableDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDefinition_IsOutput()
  {
    return (EAttribute)variableDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDefinition_IsStatic()
  {
    return (EAttribute)variableDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDefinition_VarCombineOperator()
  {
    return (EAttribute)variableDefinitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperationDefinition()
  {
    return operationDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperationDefinition_FunctionType()
  {
    return (EReference)operationDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperationDefinition_ParamType()
  {
    return (EReference)operationDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocalReaction()
  {
    return localReactionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateReaction()
  {
    return stateReactionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntry()
  {
    return entryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInside()
  {
    return insideEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExit()
  {
    return exitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleScope()
  {
    return simpleScopeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEventDefinition()
  {
    return eventDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEventDefinition_Input()
  {
    return (EAttribute)eventDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEventDefinition_Output()
  {
    return (EAttribute)eventDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEventDefinition_Type()
  {
    return (EReference)eventDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEventDefinition_VarInitialValue()
  {
    return (EReference)eventDefinitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEventDefinition_VarCombineOperator()
  {
    return (EAttribute)eventDefinitionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSuspendEffect()
  {
    return suspendEffectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReactionTrigger()
  {
    return reactionTriggerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReactionTrigger_StateReaction()
  {
    return (EReference)reactionTriggerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReactionTrigger_ReactionTrigger()
  {
    return (EReference)reactionTriggerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReactionTrigger_LabelPriority()
  {
    return (EAttribute)reactionTriggerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReactionTrigger_Delay()
  {
    return (EAttribute)reactionTriggerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReactionTrigger_Expression()
  {
    return (EReference)reactionTriggerEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReactionEffect()
  {
    return reactionEffectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReactionEffect_Actions()
  {
    return (EReference)reactionEffectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumericalMultiplyDivideExpression()
  {
    return numericalMultiplyDivideExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumericalMultiplyDivideExpression_LeftOperand()
  {
    return (EReference)numericalMultiplyDivideExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumericalMultiplyDivideExpression_Operator()
  {
    return (EAttribute)numericalMultiplyDivideExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumericalMultiplyDivideExpression_RightOperand()
  {
    return (EReference)numericalMultiplyDivideExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEventValueReferenceExpression()
  {
    return eventValueReferenceExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEventValueReferenceExpression_Value()
  {
    return (EReference)eventValueReferenceExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPreValueExpression()
  {
    return preValueExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPreValueExpression_Value()
  {
    return (EReference)preValueExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getMultiplicativeOperator2()
  {
    return multiplicativeOperator2EEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getCombineOperator()
  {
    return combineOperatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SynctextFactory getSynctextFactory()
  {
    return (SynctextFactory)getEFactoryInstance();
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
    stateScopeEClass = createEClass(STATE_SCOPE);

    signalDefinitionEClass = createEClass(SIGNAL_DEFINITION);

    variableDefinitionEClass = createEClass(VARIABLE_DEFINITION);
    createEAttribute(variableDefinitionEClass, VARIABLE_DEFINITION__IS_INPUT);
    createEAttribute(variableDefinitionEClass, VARIABLE_DEFINITION__IS_OUTPUT);
    createEAttribute(variableDefinitionEClass, VARIABLE_DEFINITION__IS_STATIC);
    createEAttribute(variableDefinitionEClass, VARIABLE_DEFINITION__VAR_COMBINE_OPERATOR);

    operationDefinitionEClass = createEClass(OPERATION_DEFINITION);
    createEReference(operationDefinitionEClass, OPERATION_DEFINITION__FUNCTION_TYPE);
    createEReference(operationDefinitionEClass, OPERATION_DEFINITION__PARAM_TYPE);

    localReactionEClass = createEClass(LOCAL_REACTION);

    stateReactionEClass = createEClass(STATE_REACTION);

    entryEClass = createEClass(ENTRY);

    insideEClass = createEClass(INSIDE);

    exitEClass = createEClass(EXIT);

    simpleScopeEClass = createEClass(SIMPLE_SCOPE);

    eventDefinitionEClass = createEClass(EVENT_DEFINITION);
    createEAttribute(eventDefinitionEClass, EVENT_DEFINITION__INPUT);
    createEAttribute(eventDefinitionEClass, EVENT_DEFINITION__OUTPUT);
    createEReference(eventDefinitionEClass, EVENT_DEFINITION__TYPE);
    createEReference(eventDefinitionEClass, EVENT_DEFINITION__VAR_INITIAL_VALUE);
    createEAttribute(eventDefinitionEClass, EVENT_DEFINITION__VAR_COMBINE_OPERATOR);

    suspendEffectEClass = createEClass(SUSPEND_EFFECT);

    reactionTriggerEClass = createEClass(REACTION_TRIGGER);
    createEReference(reactionTriggerEClass, REACTION_TRIGGER__STATE_REACTION);
    createEReference(reactionTriggerEClass, REACTION_TRIGGER__REACTION_TRIGGER);
    createEAttribute(reactionTriggerEClass, REACTION_TRIGGER__LABEL_PRIORITY);
    createEAttribute(reactionTriggerEClass, REACTION_TRIGGER__DELAY);
    createEReference(reactionTriggerEClass, REACTION_TRIGGER__EXPRESSION);

    reactionEffectEClass = createEClass(REACTION_EFFECT);
    createEReference(reactionEffectEClass, REACTION_EFFECT__ACTIONS);

    numericalMultiplyDivideExpressionEClass = createEClass(NUMERICAL_MULTIPLY_DIVIDE_EXPRESSION);
    createEReference(numericalMultiplyDivideExpressionEClass, NUMERICAL_MULTIPLY_DIVIDE_EXPRESSION__LEFT_OPERAND);
    createEAttribute(numericalMultiplyDivideExpressionEClass, NUMERICAL_MULTIPLY_DIVIDE_EXPRESSION__OPERATOR);
    createEReference(numericalMultiplyDivideExpressionEClass, NUMERICAL_MULTIPLY_DIVIDE_EXPRESSION__RIGHT_OPERAND);

    eventValueReferenceExpressionEClass = createEClass(EVENT_VALUE_REFERENCE_EXPRESSION);
    createEReference(eventValueReferenceExpressionEClass, EVENT_VALUE_REFERENCE_EXPRESSION__VALUE);

    preValueExpressionEClass = createEClass(PRE_VALUE_EXPRESSION);
    createEReference(preValueExpressionEClass, PRE_VALUE_EXPRESSION__VALUE);

    // Create enums
    multiplicativeOperator2EEnum = createEEnum(MULTIPLICATIVE_OPERATOR2);
    combineOperatorEEnum = createEEnum(COMBINE_OPERATOR);
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

    // Obtain other dependent packages
    SGraphPackage theSGraphPackage = (SGraphPackage)EPackage.Registry.INSTANCE.getEPackage(SGraphPackage.eNS_URI);
    StextPackage theStextPackage = (StextPackage)EPackage.Registry.INSTANCE.getEPackage(StextPackage.eNS_URI);
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    stateScopeEClass.getESuperTypes().add(theSGraphPackage.getScope());
    signalDefinitionEClass.getESuperTypes().add(theSGraphPackage.getEvent());
    variableDefinitionEClass.getESuperTypes().add(theSGraphPackage.getVariable());
    variableDefinitionEClass.getESuperTypes().add(theStextPackage.getVariableDefinition());
    operationDefinitionEClass.getESuperTypes().add(theStextPackage.getOperationDefinition());
    localReactionEClass.getESuperTypes().add(theStextPackage.getLocalReaction());
    entryEClass.getESuperTypes().add(this.getStateReaction());
    insideEClass.getESuperTypes().add(this.getStateReaction());
    exitEClass.getESuperTypes().add(this.getStateReaction());
    simpleScopeEClass.getESuperTypes().add(this.getStateScope());
    eventDefinitionEClass.getESuperTypes().add(this.getSignalDefinition());
    suspendEffectEClass.getESuperTypes().add(theSGraphPackage.getEffect());
    reactionTriggerEClass.getESuperTypes().add(theSGraphPackage.getTrigger());
    reactionEffectEClass.getESuperTypes().add(theSGraphPackage.getEffect());
    numericalMultiplyDivideExpressionEClass.getESuperTypes().add(theStextPackage.getExpression());
    eventValueReferenceExpressionEClass.getESuperTypes().add(theStextPackage.getExpression());
    preValueExpressionEClass.getESuperTypes().add(theStextPackage.getExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(stateScopeEClass, StateScope.class, "StateScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(signalDefinitionEClass, SignalDefinition.class, "SignalDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(variableDefinitionEClass, VariableDefinition.class, "VariableDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariableDefinition_IsInput(), ecorePackage.getEBoolean(), "isInput", null, 0, 1, VariableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariableDefinition_IsOutput(), ecorePackage.getEBoolean(), "isOutput", null, 0, 1, VariableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariableDefinition_IsStatic(), ecorePackage.getEBoolean(), "isStatic", null, 0, 1, VariableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariableDefinition_VarCombineOperator(), this.getCombineOperator(), "varCombineOperator", null, 0, 1, VariableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationDefinitionEClass, OperationDefinition.class, "OperationDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOperationDefinition_FunctionType(), theTypesPackage.getType(), null, "functionType", null, 0, 1, OperationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperationDefinition_ParamType(), theTypesPackage.getType(), null, "paramType", null, 0, 1, OperationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(localReactionEClass, LocalReaction.class, "LocalReaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stateReactionEClass, StateReaction.class, "StateReaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(entryEClass, Entry.class, "Entry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(insideEClass, Inside.class, "Inside", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(exitEClass, Exit.class, "Exit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(simpleScopeEClass, SimpleScope.class, "SimpleScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(eventDefinitionEClass, EventDefinition.class, "EventDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEventDefinition_Input(), ecorePackage.getEBoolean(), "Input", null, 0, 1, EventDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEventDefinition_Output(), ecorePackage.getEBoolean(), "Output", null, 0, 1, EventDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEventDefinition_Type(), theTypesPackage.getType(), null, "type", null, 0, 1, EventDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEventDefinition_VarInitialValue(), theStextPackage.getExpression(), null, "varInitialValue", null, 0, 1, EventDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEventDefinition_VarCombineOperator(), this.getCombineOperator(), "varCombineOperator", null, 0, 1, EventDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(suspendEffectEClass, SuspendEffect.class, "SuspendEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(reactionTriggerEClass, ReactionTrigger.class, "ReactionTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReactionTrigger_StateReaction(), this.getStateReaction(), null, "stateReaction", null, 0, 1, ReactionTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReactionTrigger_ReactionTrigger(), theSGraphPackage.getTrigger(), null, "reactionTrigger", null, 0, 1, ReactionTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReactionTrigger_LabelPriority(), ecorePackage.getEInt(), "labelPriority", null, 0, 1, ReactionTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReactionTrigger_Delay(), ecorePackage.getEInt(), "delay", null, 0, 1, ReactionTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReactionTrigger_Expression(), theStextPackage.getExpression(), null, "expression", null, 0, 1, ReactionTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(reactionEffectEClass, ReactionEffect.class, "ReactionEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReactionEffect_Actions(), theStextPackage.getExpression(), null, "actions", null, 0, -1, ReactionEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numericalMultiplyDivideExpressionEClass, NumericalMultiplyDivideExpression.class, "NumericalMultiplyDivideExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNumericalMultiplyDivideExpression_LeftOperand(), theStextPackage.getExpression(), null, "leftOperand", null, 0, 1, NumericalMultiplyDivideExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNumericalMultiplyDivideExpression_Operator(), this.getMultiplicativeOperator2(), "operator", null, 0, 1, NumericalMultiplyDivideExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNumericalMultiplyDivideExpression_RightOperand(), theStextPackage.getExpression(), null, "rightOperand", null, 0, 1, NumericalMultiplyDivideExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventValueReferenceExpressionEClass, EventValueReferenceExpression.class, "EventValueReferenceExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEventValueReferenceExpression_Value(), theStextPackage.getExpression(), null, "value", null, 0, 1, EventValueReferenceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(preValueExpressionEClass, PreValueExpression.class, "PreValueExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPreValueExpression_Value(), theStextPackage.getExpression(), null, "value", null, 0, 1, PreValueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(multiplicativeOperator2EEnum, MultiplicativeOperator2.class, "MultiplicativeOperator2");
    addEEnumLiteral(multiplicativeOperator2EEnum, MultiplicativeOperator2.MUL);
    addEEnumLiteral(multiplicativeOperator2EEnum, MultiplicativeOperator2.DIV);
    addEEnumLiteral(multiplicativeOperator2EEnum, MultiplicativeOperator2.MOD);

    initEEnum(combineOperatorEEnum, CombineOperator.class, "CombineOperator");
    addEEnumLiteral(combineOperatorEEnum, CombineOperator.NONE);
    addEEnumLiteral(combineOperatorEEnum, CombineOperator.ADD);
    addEEnumLiteral(combineOperatorEEnum, CombineOperator.MULT);
    addEEnumLiteral(combineOperatorEEnum, CombineOperator.MAX);
    addEEnumLiteral(combineOperatorEEnum, CombineOperator.MIN);
    addEEnumLiteral(combineOperatorEEnum, CombineOperator.OR);
    addEEnumLiteral(combineOperatorEEnum, CombineOperator.AND);
    addEEnumLiteral(combineOperatorEEnum, CombineOperator.HOST);

    // Create resource
    createResource(eNS_URI);
  }

} //SynctextPackageImpl
