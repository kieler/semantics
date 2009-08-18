/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl;

import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.CombineOperator;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Region;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsFactory;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Signal;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.SignalRenaming;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateType;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.ValueType;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.ValuedObject;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Variable;

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
  private EClass signalRenamingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass regionEClass = null;

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
  private EClass valuedObjectEClass = null;

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
  private EClass signalEClass = null;

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
  private EEnum combineOperatorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum valueTypeEEnum = null;

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
  public EAttribute getState_Type()
  {
    return (EAttribute)stateEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getState_Id()
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
  public EAttribute getState_BodyText()
  {
    return (EAttribute)stateEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getState_NewStateID()
  {
    return (EAttribute)stateEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getState_ReferencedState()
  {
    return (EReference)stateEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getState_SignalRenamings()
  {
    return (EReference)stateEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getState_EntryActions()
  {
    return (EReference)stateEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getState_InnerActions()
  {
    return (EReference)stateEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getState_ExitActions()
  {
    return (EReference)stateEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getState_SuspensionTrigger()
  {
    return (EReference)stateEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getState_Signals()
  {
    return (EReference)stateEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getState_Regions()
  {
    return (EReference)stateEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSignalRenaming()
  {
    return signalRenamingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSignalRenaming_OldSignal()
  {
    return (EReference)signalRenamingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSignalRenaming_NewSignal()
  {
    return (EReference)signalRenamingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRegion()
  {
    return regionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRegion_Id()
  {
    return (EAttribute)regionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRegion_Variables()
  {
    return (EReference)regionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRegion_Signals()
  {
    return (EReference)regionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRegion_InnerStates()
  {
    return (EReference)regionEClass.getEStructuralFeatures().get(3);
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
  public EAttribute getAction_IsImmediate()
  {
    return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAction_TriggersAndEfects()
  {
    return (EAttribute)actionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAction_Delay()
  {
    return (EAttribute)actionEClass.getEStructuralFeatures().get(2);
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
  public EAttribute getValuedObject_Type()
  {
    return (EAttribute)valuedObjectEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValuedObject_HostType()
  {
    return (EAttribute)valuedObjectEClass.getEStructuralFeatures().get(3);
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
  public EClass getSignal()
  {
    return signalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSignal_IsLocal()
  {
    return (EAttribute)signalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSignal_IsInput()
  {
    return (EAttribute)signalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSignal_IsOutput()
  {
    return (EAttribute)signalEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSignal_CombineOperator()
  {
    return (EAttribute)signalEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSignal_HostCombineOperator()
  {
    return (EAttribute)signalEClass.getEStructuralFeatures().get(4);
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
  public EEnum getCombineOperator()
  {
    return combineOperatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getValueType()
  {
    return valueTypeEEnum;
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
    createEAttribute(stateEClass, STATE__TYPE);
    createEAttribute(stateEClass, STATE__ID);
    createEAttribute(stateEClass, STATE__LABEL);
    createEAttribute(stateEClass, STATE__BODY_TEXT);
    createEAttribute(stateEClass, STATE__NEW_STATE_ID);
    createEReference(stateEClass, STATE__REFERENCED_STATE);
    createEReference(stateEClass, STATE__SIGNAL_RENAMINGS);
    createEReference(stateEClass, STATE__ENTRY_ACTIONS);
    createEReference(stateEClass, STATE__INNER_ACTIONS);
    createEReference(stateEClass, STATE__EXIT_ACTIONS);
    createEReference(stateEClass, STATE__SUSPENSION_TRIGGER);
    createEReference(stateEClass, STATE__SIGNALS);
    createEReference(stateEClass, STATE__REGIONS);

    signalRenamingEClass = createEClass(SIGNAL_RENAMING);
    createEReference(signalRenamingEClass, SIGNAL_RENAMING__OLD_SIGNAL);
    createEReference(signalRenamingEClass, SIGNAL_RENAMING__NEW_SIGNAL);

    regionEClass = createEClass(REGION);
    createEAttribute(regionEClass, REGION__ID);
    createEReference(regionEClass, REGION__VARIABLES);
    createEReference(regionEClass, REGION__SIGNALS);
    createEReference(regionEClass, REGION__INNER_STATES);

    actionEClass = createEClass(ACTION);
    createEAttribute(actionEClass, ACTION__IS_IMMEDIATE);
    createEAttribute(actionEClass, ACTION__TRIGGERS_AND_EFECTS);
    createEAttribute(actionEClass, ACTION__DELAY);

    valuedObjectEClass = createEClass(VALUED_OBJECT);
    createEAttribute(valuedObjectEClass, VALUED_OBJECT__NAME);
    createEAttribute(valuedObjectEClass, VALUED_OBJECT__INITIAL_VALUE);
    createEAttribute(valuedObjectEClass, VALUED_OBJECT__TYPE);
    createEAttribute(valuedObjectEClass, VALUED_OBJECT__HOST_TYPE);

    variableEClass = createEClass(VARIABLE);

    signalEClass = createEClass(SIGNAL);
    createEAttribute(signalEClass, SIGNAL__IS_LOCAL);
    createEAttribute(signalEClass, SIGNAL__IS_INPUT);
    createEAttribute(signalEClass, SIGNAL__IS_OUTPUT);
    createEAttribute(signalEClass, SIGNAL__COMBINE_OPERATOR);
    createEAttribute(signalEClass, SIGNAL__HOST_COMBINE_OPERATOR);

    // Create enums
    stateTypeEEnum = createEEnum(STATE_TYPE);
    combineOperatorEEnum = createEEnum(COMBINE_OPERATOR);
    valueTypeEEnum = createEEnum(VALUE_TYPE);
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
    variableEClass.getESuperTypes().add(this.getValuedObject());
    signalEClass.getESuperTypes().add(this.getValuedObject());

    // Initialize classes and features; add operations and parameters
    initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getState_IsInitial(), ecorePackage.getEBoolean(), "isInitial", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getState_IsFinal(), ecorePackage.getEBoolean(), "isFinal", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getState_Type(), this.getStateType(), "type", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getState_Id(), ecorePackage.getEString(), "id", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getState_Label(), ecorePackage.getEString(), "label", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getState_BodyText(), ecorePackage.getEString(), "bodyText", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getState_NewStateID(), ecorePackage.getEString(), "newStateID", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getState_ReferencedState(), this.getState(), null, "referencedState", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getState_SignalRenamings(), this.getSignalRenaming(), null, "signalRenamings", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getState_EntryActions(), this.getAction(), null, "entryActions", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getState_InnerActions(), this.getAction(), null, "innerActions", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getState_ExitActions(), this.getAction(), null, "exitActions", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getState_SuspensionTrigger(), this.getAction(), null, "suspensionTrigger", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getState_Signals(), this.getSignal(), null, "signals", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getState_Regions(), this.getRegion(), null, "regions", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(signalRenamingEClass, SignalRenaming.class, "SignalRenaming", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSignalRenaming_OldSignal(), this.getSignal(), null, "oldSignal", null, 0, 1, SignalRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSignalRenaming_NewSignal(), this.getSignal(), null, "newSignal", null, 0, 1, SignalRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(regionEClass, Region.class, "Region", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRegion_Id(), ecorePackage.getEString(), "id", null, 0, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRegion_Variables(), this.getVariable(), null, "variables", null, 0, -1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRegion_Signals(), this.getSignal(), null, "signals", null, 0, -1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRegion_InnerStates(), this.getState(), null, "innerStates", null, 0, -1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAction_IsImmediate(), ecorePackage.getEBoolean(), "isImmediate", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAction_TriggersAndEfects(), ecorePackage.getEString(), "triggersAndEfects", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAction_Delay(), ecorePackage.getEInt(), "delay", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valuedObjectEClass, ValuedObject.class, "ValuedObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getValuedObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, ValuedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getValuedObject_InitialValue(), ecorePackage.getEInt(), "initialValue", null, 0, 1, ValuedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getValuedObject_Type(), this.getValueType(), "type", null, 0, 1, ValuedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getValuedObject_HostType(), ecorePackage.getEString(), "hostType", null, 0, 1, ValuedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(signalEClass, Signal.class, "Signal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSignal_IsLocal(), ecorePackage.getEBoolean(), "isLocal", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSignal_IsInput(), ecorePackage.getEBoolean(), "isInput", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSignal_IsOutput(), ecorePackage.getEBoolean(), "isOutput", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSignal_CombineOperator(), this.getCombineOperator(), "combineOperator", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSignal_HostCombineOperator(), ecorePackage.getEString(), "hostCombineOperator", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(stateTypeEEnum, StateType.class, "StateType");
    addEEnumLiteral(stateTypeEEnum, StateType.NORMAL);
    addEEnumLiteral(stateTypeEEnum, StateType.PSEUDO);
    addEEnumLiteral(stateTypeEEnum, StateType.REFERENCE);
    addEEnumLiteral(stateTypeEEnum, StateType.TEXTUAL);

    initEEnum(combineOperatorEEnum, CombineOperator.class, "CombineOperator");
    addEEnumLiteral(combineOperatorEEnum, CombineOperator.NONE);
    addEEnumLiteral(combineOperatorEEnum, CombineOperator.ADD);
    addEEnumLiteral(combineOperatorEEnum, CombineOperator.MULT);
    addEEnumLiteral(combineOperatorEEnum, CombineOperator.HOST);

    initEEnum(valueTypeEEnum, ValueType.class, "ValueType");
    addEEnumLiteral(valueTypeEEnum, ValueType.PURE);
    addEEnumLiteral(valueTypeEEnum, ValueType.BOOL);
    addEEnumLiteral(valueTypeEEnum, ValueType.UNSIGNED);
    addEEnumLiteral(valueTypeEEnum, ValueType.INTEGER);
    addEEnumLiteral(valueTypeEEnum, ValueType.DOUBLE);
    addEEnumLiteral(valueTypeEEnum, ValueType.HOST);

    // Create resource
    createResource(eNS_URI);
  }

} //RetypingSyncchartsPackageImpl
