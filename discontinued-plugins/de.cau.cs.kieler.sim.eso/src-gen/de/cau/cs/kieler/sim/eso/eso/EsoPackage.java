/**
 */
package de.cau.cs.kieler.sim.eso.eso;

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
 * @see de.cau.cs.kieler.sim.eso.eso.EsoFactory
 * @model kind="package"
 * @generated
 */
public interface EsoPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "eso";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cau.de/cs/kieler/sim/eso/Eso";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "eso";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EsoPackage eINSTANCE = de.cau.cs.kieler.sim.eso.eso.impl.EsoPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.sim.eso.eso.impl.tracelistImpl <em>tracelist</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.sim.eso.eso.impl.tracelistImpl
   * @see de.cau.cs.kieler.sim.eso.eso.impl.EsoPackageImpl#gettracelist()
   * @generated
   */
  int TRACELIST = 0;

  /**
   * The feature id for the '<em><b>Traces</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACELIST__TRACES = 0;

  /**
   * The number of structural features of the '<em>tracelist</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACELIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.sim.eso.eso.impl.traceImpl <em>trace</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.sim.eso.eso.impl.traceImpl
   * @see de.cau.cs.kieler.sim.eso.eso.impl.EsoPackageImpl#gettrace()
   * @generated
   */
  int TRACE = 1;

  /**
   * The feature id for the '<em><b>Ticks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE__TICKS = 0;

  /**
   * The number of structural features of the '<em>trace</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.sim.eso.eso.impl.tickImpl <em>tick</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.sim.eso.eso.impl.tickImpl
   * @see de.cau.cs.kieler.sim.eso.eso.impl.EsoPackageImpl#gettick()
   * @generated
   */
  int TICK = 2;

  /**
   * The feature id for the '<em><b>Input</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TICK__INPUT = 0;

  /**
   * The feature id for the '<em><b>Output</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TICK__OUTPUT = 1;

  /**
   * The feature id for the '<em><b>Extra Infos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TICK__EXTRA_INFOS = 2;

  /**
   * The feature id for the '<em><b>Extra Infos Output</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TICK__EXTRA_INFOS_OUTPUT = 3;

  /**
   * The number of structural features of the '<em>tick</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TICK_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.sim.eso.eso.impl.signalImpl <em>signal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.sim.eso.eso.impl.signalImpl
   * @see de.cau.cs.kieler.sim.eso.eso.impl.EsoPackageImpl#getsignal()
   * @generated
   */
  int SIGNAL = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL__NAME = 0;

  /**
   * The feature id for the '<em><b>Valued</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL__VALUED = 1;

  /**
   * The feature id for the '<em><b>Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL__VAL = 2;

  /**
   * The number of structural features of the '<em>signal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.sim.eso.eso.impl.kvpairImpl <em>kvpair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.sim.eso.eso.impl.kvpairImpl
   * @see de.cau.cs.kieler.sim.eso.eso.impl.EsoPackageImpl#getkvpair()
   * @generated
   */
  int KVPAIR = 4;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KVPAIR__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KVPAIR__VALUE = 1;

  /**
   * The number of structural features of the '<em>kvpair</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KVPAIR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.sim.eso.eso.impl.EsoIntImpl <em>Int</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.sim.eso.eso.impl.EsoIntImpl
   * @see de.cau.cs.kieler.sim.eso.eso.impl.EsoPackageImpl#getEsoInt()
   * @generated
   */
  int ESO_INT = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESO_INT__VALUE = 0;

  /**
   * The number of structural features of the '<em>Int</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESO_INT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.sim.eso.eso.impl.EsoStringImpl <em>String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.sim.eso.eso.impl.EsoStringImpl
   * @see de.cau.cs.kieler.sim.eso.eso.impl.EsoPackageImpl#getEsoString()
   * @generated
   */
  int ESO_STRING = 6;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESO_STRING__VALUE = 0;

  /**
   * The number of structural features of the '<em>String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESO_STRING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.sim.eso.eso.impl.EsoFloatImpl <em>Float</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.sim.eso.eso.impl.EsoFloatImpl
   * @see de.cau.cs.kieler.sim.eso.eso.impl.EsoPackageImpl#getEsoFloat()
   * @generated
   */
  int ESO_FLOAT = 7;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESO_FLOAT__VALUE = 0;

  /**
   * The number of structural features of the '<em>Float</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESO_FLOAT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.sim.eso.eso.impl.EsoBoolImpl <em>Bool</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.sim.eso.eso.impl.EsoBoolImpl
   * @see de.cau.cs.kieler.sim.eso.eso.impl.EsoPackageImpl#getEsoBool()
   * @generated
   */
  int ESO_BOOL = 8;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESO_BOOL__VALUE = 0;

  /**
   * The number of structural features of the '<em>Bool</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESO_BOOL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.sim.eso.eso.impl.EsoJsonImpl <em>Json</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.sim.eso.eso.impl.EsoJsonImpl
   * @see de.cau.cs.kieler.sim.eso.eso.impl.EsoPackageImpl#getEsoJson()
   * @generated
   */
  int ESO_JSON = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESO_JSON__VALUE = 0;

  /**
   * The number of structural features of the '<em>Json</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESO_JSON_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.sim.eso.eso.tracelist <em>tracelist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>tracelist</em>'.
   * @see de.cau.cs.kieler.sim.eso.eso.tracelist
   * @generated
   */
  EClass gettracelist();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.sim.eso.eso.tracelist#getTraces <em>Traces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Traces</em>'.
   * @see de.cau.cs.kieler.sim.eso.eso.tracelist#getTraces()
   * @see #gettracelist()
   * @generated
   */
  EReference gettracelist_Traces();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.sim.eso.eso.trace <em>trace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>trace</em>'.
   * @see de.cau.cs.kieler.sim.eso.eso.trace
   * @generated
   */
  EClass gettrace();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.sim.eso.eso.trace#getTicks <em>Ticks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ticks</em>'.
   * @see de.cau.cs.kieler.sim.eso.eso.trace#getTicks()
   * @see #gettrace()
   * @generated
   */
  EReference gettrace_Ticks();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.sim.eso.eso.tick <em>tick</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>tick</em>'.
   * @see de.cau.cs.kieler.sim.eso.eso.tick
   * @generated
   */
  EClass gettick();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.sim.eso.eso.tick#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Input</em>'.
   * @see de.cau.cs.kieler.sim.eso.eso.tick#getInput()
   * @see #gettick()
   * @generated
   */
  EReference gettick_Input();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.sim.eso.eso.tick#getOutput <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Output</em>'.
   * @see de.cau.cs.kieler.sim.eso.eso.tick#getOutput()
   * @see #gettick()
   * @generated
   */
  EReference gettick_Output();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.sim.eso.eso.tick#getExtraInfos <em>Extra Infos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Extra Infos</em>'.
   * @see de.cau.cs.kieler.sim.eso.eso.tick#getExtraInfos()
   * @see #gettick()
   * @generated
   */
  EReference gettick_ExtraInfos();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.sim.eso.eso.tick#getExtraInfosOutput <em>Extra Infos Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Extra Infos Output</em>'.
   * @see de.cau.cs.kieler.sim.eso.eso.tick#getExtraInfosOutput()
   * @see #gettick()
   * @generated
   */
  EReference gettick_ExtraInfosOutput();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.sim.eso.eso.signal <em>signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>signal</em>'.
   * @see de.cau.cs.kieler.sim.eso.eso.signal
   * @generated
   */
  EClass getsignal();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sim.eso.eso.signal#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.sim.eso.eso.signal#getName()
   * @see #getsignal()
   * @generated
   */
  EAttribute getsignal_Name();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sim.eso.eso.signal#isValued <em>Valued</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Valued</em>'.
   * @see de.cau.cs.kieler.sim.eso.eso.signal#isValued()
   * @see #getsignal()
   * @generated
   */
  EAttribute getsignal_Valued();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.sim.eso.eso.signal#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Val</em>'.
   * @see de.cau.cs.kieler.sim.eso.eso.signal#getVal()
   * @see #getsignal()
   * @generated
   */
  EReference getsignal_Val();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.sim.eso.eso.kvpair <em>kvpair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>kvpair</em>'.
   * @see de.cau.cs.kieler.sim.eso.eso.kvpair
   * @generated
   */
  EClass getkvpair();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sim.eso.eso.kvpair#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see de.cau.cs.kieler.sim.eso.eso.kvpair#getKey()
   * @see #getkvpair()
   * @generated
   */
  EAttribute getkvpair_Key();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.sim.eso.eso.kvpair#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.cau.cs.kieler.sim.eso.eso.kvpair#getValue()
   * @see #getkvpair()
   * @generated
   */
  EReference getkvpair_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.sim.eso.eso.EsoInt <em>Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int</em>'.
   * @see de.cau.cs.kieler.sim.eso.eso.EsoInt
   * @generated
   */
  EClass getEsoInt();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sim.eso.eso.EsoInt#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.kieler.sim.eso.eso.EsoInt#getValue()
   * @see #getEsoInt()
   * @generated
   */
  EAttribute getEsoInt_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.sim.eso.eso.EsoString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String</em>'.
   * @see de.cau.cs.kieler.sim.eso.eso.EsoString
   * @generated
   */
  EClass getEsoString();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sim.eso.eso.EsoString#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.kieler.sim.eso.eso.EsoString#getValue()
   * @see #getEsoString()
   * @generated
   */
  EAttribute getEsoString_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.sim.eso.eso.EsoFloat <em>Float</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float</em>'.
   * @see de.cau.cs.kieler.sim.eso.eso.EsoFloat
   * @generated
   */
  EClass getEsoFloat();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sim.eso.eso.EsoFloat#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.kieler.sim.eso.eso.EsoFloat#getValue()
   * @see #getEsoFloat()
   * @generated
   */
  EAttribute getEsoFloat_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.sim.eso.eso.EsoBool <em>Bool</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bool</em>'.
   * @see de.cau.cs.kieler.sim.eso.eso.EsoBool
   * @generated
   */
  EClass getEsoBool();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sim.eso.eso.EsoBool#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.kieler.sim.eso.eso.EsoBool#isValue()
   * @see #getEsoBool()
   * @generated
   */
  EAttribute getEsoBool_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.sim.eso.eso.EsoJson <em>Json</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Json</em>'.
   * @see de.cau.cs.kieler.sim.eso.eso.EsoJson
   * @generated
   */
  EClass getEsoJson();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sim.eso.eso.EsoJson#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.kieler.sim.eso.eso.EsoJson#getValue()
   * @see #getEsoJson()
   * @generated
   */
  EAttribute getEsoJson_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EsoFactory getEsoFactory();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.sim.eso.eso.impl.tracelistImpl <em>tracelist</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sim.eso.eso.impl.tracelistImpl
     * @see de.cau.cs.kieler.sim.eso.eso.impl.EsoPackageImpl#gettracelist()
     * @generated
     */
    EClass TRACELIST = eINSTANCE.gettracelist();

    /**
     * The meta object literal for the '<em><b>Traces</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRACELIST__TRACES = eINSTANCE.gettracelist_Traces();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.sim.eso.eso.impl.traceImpl <em>trace</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sim.eso.eso.impl.traceImpl
     * @see de.cau.cs.kieler.sim.eso.eso.impl.EsoPackageImpl#gettrace()
     * @generated
     */
    EClass TRACE = eINSTANCE.gettrace();

    /**
     * The meta object literal for the '<em><b>Ticks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRACE__TICKS = eINSTANCE.gettrace_Ticks();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.sim.eso.eso.impl.tickImpl <em>tick</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sim.eso.eso.impl.tickImpl
     * @see de.cau.cs.kieler.sim.eso.eso.impl.EsoPackageImpl#gettick()
     * @generated
     */
    EClass TICK = eINSTANCE.gettick();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TICK__INPUT = eINSTANCE.gettick_Input();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TICK__OUTPUT = eINSTANCE.gettick_Output();

    /**
     * The meta object literal for the '<em><b>Extra Infos</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TICK__EXTRA_INFOS = eINSTANCE.gettick_ExtraInfos();

    /**
     * The meta object literal for the '<em><b>Extra Infos Output</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TICK__EXTRA_INFOS_OUTPUT = eINSTANCE.gettick_ExtraInfosOutput();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.sim.eso.eso.impl.signalImpl <em>signal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sim.eso.eso.impl.signalImpl
     * @see de.cau.cs.kieler.sim.eso.eso.impl.EsoPackageImpl#getsignal()
     * @generated
     */
    EClass SIGNAL = eINSTANCE.getsignal();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIGNAL__NAME = eINSTANCE.getsignal_Name();

    /**
     * The meta object literal for the '<em><b>Valued</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIGNAL__VALUED = eINSTANCE.getsignal_Valued();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNAL__VAL = eINSTANCE.getsignal_Val();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.sim.eso.eso.impl.kvpairImpl <em>kvpair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sim.eso.eso.impl.kvpairImpl
     * @see de.cau.cs.kieler.sim.eso.eso.impl.EsoPackageImpl#getkvpair()
     * @generated
     */
    EClass KVPAIR = eINSTANCE.getkvpair();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KVPAIR__KEY = eINSTANCE.getkvpair_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KVPAIR__VALUE = eINSTANCE.getkvpair_Value();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.sim.eso.eso.impl.EsoIntImpl <em>Int</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sim.eso.eso.impl.EsoIntImpl
     * @see de.cau.cs.kieler.sim.eso.eso.impl.EsoPackageImpl#getEsoInt()
     * @generated
     */
    EClass ESO_INT = eINSTANCE.getEsoInt();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ESO_INT__VALUE = eINSTANCE.getEsoInt_Value();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.sim.eso.eso.impl.EsoStringImpl <em>String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sim.eso.eso.impl.EsoStringImpl
     * @see de.cau.cs.kieler.sim.eso.eso.impl.EsoPackageImpl#getEsoString()
     * @generated
     */
    EClass ESO_STRING = eINSTANCE.getEsoString();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ESO_STRING__VALUE = eINSTANCE.getEsoString_Value();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.sim.eso.eso.impl.EsoFloatImpl <em>Float</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sim.eso.eso.impl.EsoFloatImpl
     * @see de.cau.cs.kieler.sim.eso.eso.impl.EsoPackageImpl#getEsoFloat()
     * @generated
     */
    EClass ESO_FLOAT = eINSTANCE.getEsoFloat();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ESO_FLOAT__VALUE = eINSTANCE.getEsoFloat_Value();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.sim.eso.eso.impl.EsoBoolImpl <em>Bool</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sim.eso.eso.impl.EsoBoolImpl
     * @see de.cau.cs.kieler.sim.eso.eso.impl.EsoPackageImpl#getEsoBool()
     * @generated
     */
    EClass ESO_BOOL = eINSTANCE.getEsoBool();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ESO_BOOL__VALUE = eINSTANCE.getEsoBool_Value();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.sim.eso.eso.impl.EsoJsonImpl <em>Json</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sim.eso.eso.impl.EsoJsonImpl
     * @see de.cau.cs.kieler.sim.eso.eso.impl.EsoPackageImpl#getEsoJson()
     * @generated
     */
    EClass ESO_JSON = eINSTANCE.getEsoJson();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ESO_JSON__VALUE = eINSTANCE.getEsoJson_Value();

  }

} //EsoPackage
