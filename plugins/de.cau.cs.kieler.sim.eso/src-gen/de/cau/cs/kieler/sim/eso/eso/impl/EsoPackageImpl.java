/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.sim.eso.eso.impl;

import de.cau.cs.kieler.sim.eso.eso.EsoBool;
import de.cau.cs.kieler.sim.eso.eso.EsoFactory;
import de.cau.cs.kieler.sim.eso.eso.EsoFloat;
import de.cau.cs.kieler.sim.eso.eso.EsoInt;
import de.cau.cs.kieler.sim.eso.eso.EsoJson;
import de.cau.cs.kieler.sim.eso.eso.EsoPackage;
import de.cau.cs.kieler.sim.eso.eso.EsoString;
import de.cau.cs.kieler.sim.eso.eso.kvpair;
import de.cau.cs.kieler.sim.eso.eso.signal;
import de.cau.cs.kieler.sim.eso.eso.tick;
import de.cau.cs.kieler.sim.eso.eso.trace;
import de.cau.cs.kieler.sim.eso.eso.tracelist;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EsoPackageImpl extends EPackageImpl implements EsoPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tracelistEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass traceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tickEClass = null;

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
  private EClass kvpairEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass esoIntEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass esoStringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass esoFloatEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass esoBoolEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass esoJsonEClass = null;

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
   * @see de.cau.cs.kieler.sim.eso.eso.EsoPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private EsoPackageImpl()
  {
    super(eNS_URI, EsoFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link EsoPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static EsoPackage init()
  {
    if (isInited) return (EsoPackage)EPackage.Registry.INSTANCE.getEPackage(EsoPackage.eNS_URI);

    // Obtain or create and register package
    EsoPackageImpl theEsoPackage = (EsoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EsoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EsoPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theEsoPackage.createPackageContents();

    // Initialize created meta-data
    theEsoPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theEsoPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(EsoPackage.eNS_URI, theEsoPackage);
    return theEsoPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettracelist()
  {
    return tracelistEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettracelist_Traces()
  {
    return (EReference)tracelistEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettrace()
  {
    return traceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettrace_Ticks()
  {
    return (EReference)traceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettick()
  {
    return tickEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettick_Input()
  {
    return (EReference)tickEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettick_Output()
  {
    return (EReference)tickEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettick_ExtraInfos()
  {
    return (EReference)tickEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsignal()
  {
    return signalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsignal_Name()
  {
    return (EAttribute)signalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsignal_Valued()
  {
    return (EAttribute)signalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsignal_Val()
  {
    return (EReference)signalEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getkvpair()
  {
    return kvpairEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getkvpair_Key()
  {
    return (EAttribute)kvpairEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getkvpair_Value()
  {
    return (EReference)kvpairEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEsoInt()
  {
    return esoIntEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEsoInt_Value()
  {
    return (EAttribute)esoIntEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEsoString()
  {
    return esoStringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEsoString_Value()
  {
    return (EAttribute)esoStringEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEsoFloat()
  {
    return esoFloatEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEsoFloat_Value()
  {
    return (EAttribute)esoFloatEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEsoBool()
  {
    return esoBoolEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEsoBool_Value()
  {
    return (EAttribute)esoBoolEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEsoJson()
  {
    return esoJsonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEsoJson_Value()
  {
    return (EAttribute)esoJsonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EsoFactory getEsoFactory()
  {
    return (EsoFactory)getEFactoryInstance();
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
    tracelistEClass = createEClass(TRACELIST);
    createEReference(tracelistEClass, TRACELIST__TRACES);

    traceEClass = createEClass(TRACE);
    createEReference(traceEClass, TRACE__TICKS);

    tickEClass = createEClass(TICK);
    createEReference(tickEClass, TICK__INPUT);
    createEReference(tickEClass, TICK__OUTPUT);
    createEReference(tickEClass, TICK__EXTRA_INFOS);

    signalEClass = createEClass(SIGNAL);
    createEAttribute(signalEClass, SIGNAL__NAME);
    createEAttribute(signalEClass, SIGNAL__VALUED);
    createEReference(signalEClass, SIGNAL__VAL);

    kvpairEClass = createEClass(KVPAIR);
    createEAttribute(kvpairEClass, KVPAIR__KEY);
    createEReference(kvpairEClass, KVPAIR__VALUE);

    esoIntEClass = createEClass(ESO_INT);
    createEAttribute(esoIntEClass, ESO_INT__VALUE);

    esoStringEClass = createEClass(ESO_STRING);
    createEAttribute(esoStringEClass, ESO_STRING__VALUE);

    esoFloatEClass = createEClass(ESO_FLOAT);
    createEAttribute(esoFloatEClass, ESO_FLOAT__VALUE);

    esoBoolEClass = createEClass(ESO_BOOL);
    createEAttribute(esoBoolEClass, ESO_BOOL__VALUE);

    esoJsonEClass = createEClass(ESO_JSON);
    createEAttribute(esoJsonEClass, ESO_JSON__VALUE);
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

    // Initialize classes and features; add operations and parameters
    initEClass(tracelistEClass, tracelist.class, "tracelist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(gettracelist_Traces(), this.gettrace(), null, "traces", null, 0, -1, tracelist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(traceEClass, trace.class, "trace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(gettrace_Ticks(), this.gettick(), null, "ticks", null, 0, -1, trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tickEClass, tick.class, "tick", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(gettick_Input(), this.getsignal(), null, "input", null, 0, -1, tick.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(gettick_Output(), this.getsignal(), null, "output", null, 0, -1, tick.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(gettick_ExtraInfos(), this.getkvpair(), null, "extraInfos", null, 0, -1, tick.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(signalEClass, signal.class, "signal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsignal_Name(), ecorePackage.getEString(), "name", null, 0, 1, signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsignal_Valued(), ecorePackage.getEBoolean(), "valued", null, 0, 1, signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getsignal_Val(), ecorePackage.getEObject(), null, "val", null, 0, 1, signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(kvpairEClass, kvpair.class, "kvpair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getkvpair_Key(), ecorePackage.getEString(), "key", null, 0, 1, kvpair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getkvpair_Value(), ecorePackage.getEObject(), null, "value", null, 0, 1, kvpair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(esoIntEClass, EsoInt.class, "EsoInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEsoInt_Value(), ecorePackage.getEInt(), "value", null, 0, 1, EsoInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(esoStringEClass, EsoString.class, "EsoString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEsoString_Value(), ecorePackage.getEString(), "value", null, 0, 1, EsoString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(esoFloatEClass, EsoFloat.class, "EsoFloat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEsoFloat_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, EsoFloat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(esoBoolEClass, EsoBool.class, "EsoBool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEsoBool_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, EsoBool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(esoJsonEClass, EsoJson.class, "EsoJson", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEsoJson_Value(), ecorePackage.getEString(), "value", null, 0, 1, EsoJson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //EsoPackageImpl
