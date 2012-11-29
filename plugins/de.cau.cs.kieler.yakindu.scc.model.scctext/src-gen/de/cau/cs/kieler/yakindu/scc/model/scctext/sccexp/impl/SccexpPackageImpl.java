/**
 */
package de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl;

import de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.CombineOperator;
import de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.EntryAction;
import de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.ExitAction;
import de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.InsideAction;
import de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.InterfaceScope;
import de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.PreValueExpressionreturns;
import de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.ReactionScope;
import de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.ReactionTrigger;
import de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.SccexpFactory;
import de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.SccexpPackage;
import de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.StateScope;
import de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.StateSpecification;
import de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.Suspend;
import de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.VarDirection;
import de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.VariableDefinition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.yakindu.sct.model.sgraph.SGraphPackage;

import org.yakindu.sct.model.stext.stext.StextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SccexpPackageImpl extends EPackageImpl implements SccexpPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateSpecificationEClass = null;

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
  private EClass interfaceScopeEClass = null;

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
  private EClass reactionScopeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exitActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass insideActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entryActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass suspendEClass = null;

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
  private EClass preValueExpressionreturnsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum combineOperatorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum varDirectionEEnum = null;

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
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.SccexpPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SccexpPackageImpl()
  {
    super(eNS_URI, SccexpFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link SccexpPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SccexpPackage init()
  {
    if (isInited) return (SccexpPackage)EPackage.Registry.INSTANCE.getEPackage(SccexpPackage.eNS_URI);

    // Obtain or create and register package
    SccexpPackageImpl theSccexpPackage = (SccexpPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SccexpPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SccexpPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    StextPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theSccexpPackage.createPackageContents();

    // Initialize created meta-data
    theSccexpPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSccexpPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SccexpPackage.eNS_URI, theSccexpPackage);
    return theSccexpPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateSpecification()
  {
    return stateSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateSpecification_Scopes()
  {
    return (EReference)stateSpecificationEClass.getEStructuralFeatures().get(0);
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
  public EClass getInterfaceScope()
  {
    return interfaceScopeEClass;
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
  public EAttribute getVariableDefinition_Direction()
  {
    return (EAttribute)variableDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDefinition_IsStatic()
  {
    return (EAttribute)variableDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableDefinition_VarInitialValue()
  {
    return (EReference)variableDefinitionEClass.getEStructuralFeatures().get(2);
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
  public EClass getReactionScope()
  {
    return reactionScopeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReactionScope_ReactionScope()
  {
    return (EReference)reactionScopeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExitAction()
  {
    return exitActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExitAction_Effect()
  {
    return (EReference)exitActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInsideAction()
  {
    return insideActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInsideAction_Effect()
  {
    return (EReference)insideActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntryAction()
  {
    return entryActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntryAction_Effect()
  {
    return (EReference)entryActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSuspend()
  {
    return suspendEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSuspend_Trigger()
  {
    return (EReference)suspendEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getReactionTrigger_IsImmediate()
  {
    return (EAttribute)reactionTriggerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReactionTrigger_Delay()
  {
    return (EAttribute)reactionTriggerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReactionTrigger_Triggers()
  {
    return (EReference)reactionTriggerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReactionTrigger_GuardExpression()
  {
    return (EReference)reactionTriggerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPreValueExpressionreturns()
  {
    return preValueExpressionreturnsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPreValueExpressionreturns_Value()
  {
    return (EReference)preValueExpressionreturnsEClass.getEStructuralFeatures().get(0);
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
  public EEnum getVarDirection()
  {
    return varDirectionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SccexpFactory getSccexpFactory()
  {
    return (SccexpFactory)getEFactoryInstance();
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
    stateSpecificationEClass = createEClass(STATE_SPECIFICATION);
    createEReference(stateSpecificationEClass, STATE_SPECIFICATION__SCOPES);

    stateScopeEClass = createEClass(STATE_SCOPE);

    interfaceScopeEClass = createEClass(INTERFACE_SCOPE);

    variableDefinitionEClass = createEClass(VARIABLE_DEFINITION);
    createEAttribute(variableDefinitionEClass, VARIABLE_DEFINITION__DIRECTION);
    createEAttribute(variableDefinitionEClass, VARIABLE_DEFINITION__IS_STATIC);
    createEReference(variableDefinitionEClass, VARIABLE_DEFINITION__VAR_INITIAL_VALUE);
    createEAttribute(variableDefinitionEClass, VARIABLE_DEFINITION__VAR_COMBINE_OPERATOR);

    reactionScopeEClass = createEClass(REACTION_SCOPE);
    createEReference(reactionScopeEClass, REACTION_SCOPE__REACTION_SCOPE);

    exitActionEClass = createEClass(EXIT_ACTION);
    createEReference(exitActionEClass, EXIT_ACTION__EFFECT);

    insideActionEClass = createEClass(INSIDE_ACTION);
    createEReference(insideActionEClass, INSIDE_ACTION__EFFECT);

    entryActionEClass = createEClass(ENTRY_ACTION);
    createEReference(entryActionEClass, ENTRY_ACTION__EFFECT);

    suspendEClass = createEClass(SUSPEND);
    createEReference(suspendEClass, SUSPEND__TRIGGER);

    reactionTriggerEClass = createEClass(REACTION_TRIGGER);
    createEAttribute(reactionTriggerEClass, REACTION_TRIGGER__IS_IMMEDIATE);
    createEAttribute(reactionTriggerEClass, REACTION_TRIGGER__DELAY);
    createEReference(reactionTriggerEClass, REACTION_TRIGGER__TRIGGERS);
    createEReference(reactionTriggerEClass, REACTION_TRIGGER__GUARD_EXPRESSION);

    preValueExpressionreturnsEClass = createEClass(PRE_VALUE_EXPRESSIONRETURNS);
    createEReference(preValueExpressionreturnsEClass, PRE_VALUE_EXPRESSIONRETURNS__VALUE);

    // Create enums
    combineOperatorEEnum = createEEnum(COMBINE_OPERATOR);
    varDirectionEEnum = createEEnum(VAR_DIRECTION);
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
    StextPackage theStextPackage = (StextPackage)EPackage.Registry.INSTANCE.getEPackage(StextPackage.eNS_URI);
    SGraphPackage theSGraphPackage = (SGraphPackage)EPackage.Registry.INSTANCE.getEPackage(SGraphPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    stateSpecificationEClass.getESuperTypes().add(theStextPackage.getStateSpecification());
    stateScopeEClass.getESuperTypes().add(theSGraphPackage.getScope());
    interfaceScopeEClass.getESuperTypes().add(this.getStateScope());
    interfaceScopeEClass.getESuperTypes().add(theStextPackage.getInterfaceScope());
    variableDefinitionEClass.getESuperTypes().add(theStextPackage.getVariableDefinition());
    reactionScopeEClass.getESuperTypes().add(this.getStateScope());
    exitActionEClass.getESuperTypes().add(theSGraphPackage.getEffect());
    insideActionEClass.getESuperTypes().add(theSGraphPackage.getEffect());
    entryActionEClass.getESuperTypes().add(theSGraphPackage.getEffect());
    suspendEClass.getESuperTypes().add(theSGraphPackage.getTrigger());
    reactionTriggerEClass.getESuperTypes().add(theSGraphPackage.getTrigger());
    preValueExpressionreturnsEClass.getESuperTypes().add(theStextPackage.getExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(stateSpecificationEClass, StateSpecification.class, "StateSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStateSpecification_Scopes(), this.getInterfaceScope(), null, "scopes", null, 0, -1, StateSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateScopeEClass, StateScope.class, "StateScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interfaceScopeEClass, InterfaceScope.class, "InterfaceScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(variableDefinitionEClass, VariableDefinition.class, "VariableDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariableDefinition_Direction(), this.getVarDirection(), "direction", null, 0, 1, VariableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariableDefinition_IsStatic(), ecorePackage.getEBoolean(), "isStatic", null, 0, 1, VariableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableDefinition_VarInitialValue(), theStextPackage.getExpression(), null, "varInitialValue", null, 0, 1, VariableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariableDefinition_VarCombineOperator(), this.getCombineOperator(), "varCombineOperator", null, 0, 1, VariableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(reactionScopeEClass, ReactionScope.class, "ReactionScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReactionScope_ReactionScope(), ecorePackage.getEObject(), null, "reactionScope", null, 0, -1, ReactionScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exitActionEClass, ExitAction.class, "ExitAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExitAction_Effect(), theSGraphPackage.getEffect(), null, "effect", null, 0, 1, ExitAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(insideActionEClass, InsideAction.class, "InsideAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInsideAction_Effect(), theSGraphPackage.getEffect(), null, "effect", null, 0, 1, InsideAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entryActionEClass, EntryAction.class, "EntryAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEntryAction_Effect(), theSGraphPackage.getEffect(), null, "effect", null, 0, 1, EntryAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(suspendEClass, Suspend.class, "Suspend", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSuspend_Trigger(), theSGraphPackage.getTrigger(), null, "trigger", null, 0, 1, Suspend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(reactionTriggerEClass, ReactionTrigger.class, "ReactionTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReactionTrigger_IsImmediate(), ecorePackage.getEBoolean(), "isImmediate", null, 0, 1, ReactionTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReactionTrigger_Delay(), ecorePackage.getEInt(), "delay", null, 0, 1, ReactionTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReactionTrigger_Triggers(), theStextPackage.getEventSpec(), null, "triggers", null, 0, -1, ReactionTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReactionTrigger_GuardExpression(), theStextPackage.getExpression(), null, "guardExpression", null, 0, 1, ReactionTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(preValueExpressionreturnsEClass, PreValueExpressionreturns.class, "PreValueExpressionreturns", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPreValueExpressionreturns_Value(), theStextPackage.getExpression(), null, "value", null, 0, 1, PreValueExpressionreturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(combineOperatorEEnum, CombineOperator.class, "CombineOperator");
    addEEnumLiteral(combineOperatorEEnum, CombineOperator.NONE);
    addEEnumLiteral(combineOperatorEEnum, CombineOperator.ADD);
    addEEnumLiteral(combineOperatorEEnum, CombineOperator.MULT);
    addEEnumLiteral(combineOperatorEEnum, CombineOperator.MAX);
    addEEnumLiteral(combineOperatorEEnum, CombineOperator.MIN);
    addEEnumLiteral(combineOperatorEEnum, CombineOperator.OR);
    addEEnumLiteral(combineOperatorEEnum, CombineOperator.AND);
    addEEnumLiteral(combineOperatorEEnum, CombineOperator.HOST);

    initEEnum(varDirectionEEnum, VarDirection.class, "VarDirection");
    addEEnumLiteral(varDirectionEEnum, VarDirection.INOUT);
    addEEnumLiteral(varDirectionEEnum, VarDirection.IN);
    addEEnumLiteral(varDirectionEEnum, VarDirection.OUT);

    // Create resource
    createResource(eNS_URI);
  }

} //SccexpPackageImpl
