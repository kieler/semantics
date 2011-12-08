/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.sim.esi.esi;

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
 * @see de.cau.cs.kieler.sim.esi.esi.EsiFactory
 * @model kind="package"
 * @generated
 */
public interface EsiPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "esi";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cau.de/cs/kieler/sim/esi/Esi";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "esi";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EsiPackage eINSTANCE = de.cau.cs.kieler.sim.esi.esi.impl.EsiPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.sim.esi.esi.impl.tracelistImpl <em>tracelist</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.sim.esi.esi.impl.tracelistImpl
   * @see de.cau.cs.kieler.sim.esi.esi.impl.EsiPackageImpl#gettracelist()
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
   * The meta object id for the '{@link de.cau.cs.kieler.sim.esi.esi.impl.traceImpl <em>trace</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.sim.esi.esi.impl.traceImpl
   * @see de.cau.cs.kieler.sim.esi.esi.impl.EsiPackageImpl#gettrace()
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
   * The meta object id for the '{@link de.cau.cs.kieler.sim.esi.esi.impl.tickImpl <em>tick</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.sim.esi.esi.impl.tickImpl
   * @see de.cau.cs.kieler.sim.esi.esi.impl.EsiPackageImpl#gettick()
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
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TICK__N = 3;

  /**
   * The number of structural features of the '<em>tick</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TICK_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.sim.esi.esi.impl.kvpairImpl <em>kvpair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.sim.esi.esi.impl.kvpairImpl
   * @see de.cau.cs.kieler.sim.esi.esi.impl.EsiPackageImpl#getkvpair()
   * @generated
   */
  int KVPAIR = 3;

  /**
   * The feature id for the '<em><b>K</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KVPAIR__K = 0;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KVPAIR__VAL = 1;

  /**
   * The number of structural features of the '<em>kvpair</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KVPAIR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.sim.esi.esi.impl.signalImpl <em>signal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.sim.esi.esi.impl.signalImpl
   * @see de.cau.cs.kieler.sim.esi.esi.impl.EsiPackageImpl#getsignal()
   * @generated
   */
  int SIGNAL = 4;

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
   * The feature id for the '<em><b>Val</b></em>' attribute.
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
   * Returns the meta object for class '{@link de.cau.cs.kieler.sim.esi.esi.tracelist <em>tracelist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>tracelist</em>'.
   * @see de.cau.cs.kieler.sim.esi.esi.tracelist
   * @generated
   */
  EClass gettracelist();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.sim.esi.esi.tracelist#getTraces <em>Traces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Traces</em>'.
   * @see de.cau.cs.kieler.sim.esi.esi.tracelist#getTraces()
   * @see #gettracelist()
   * @generated
   */
  EReference gettracelist_Traces();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.sim.esi.esi.trace <em>trace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>trace</em>'.
   * @see de.cau.cs.kieler.sim.esi.esi.trace
   * @generated
   */
  EClass gettrace();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.sim.esi.esi.trace#getTicks <em>Ticks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ticks</em>'.
   * @see de.cau.cs.kieler.sim.esi.esi.trace#getTicks()
   * @see #gettrace()
   * @generated
   */
  EReference gettrace_Ticks();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.sim.esi.esi.tick <em>tick</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>tick</em>'.
   * @see de.cau.cs.kieler.sim.esi.esi.tick
   * @generated
   */
  EClass gettick();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.sim.esi.esi.tick#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Input</em>'.
   * @see de.cau.cs.kieler.sim.esi.esi.tick#getInput()
   * @see #gettick()
   * @generated
   */
  EReference gettick_Input();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.sim.esi.esi.tick#getOutput <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Output</em>'.
   * @see de.cau.cs.kieler.sim.esi.esi.tick#getOutput()
   * @see #gettick()
   * @generated
   */
  EReference gettick_Output();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.sim.esi.esi.tick#getExtraInfos <em>Extra Infos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Extra Infos</em>'.
   * @see de.cau.cs.kieler.sim.esi.esi.tick#getExtraInfos()
   * @see #gettick()
   * @generated
   */
  EReference gettick_ExtraInfos();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sim.esi.esi.tick#getN <em>N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>N</em>'.
   * @see de.cau.cs.kieler.sim.esi.esi.tick#getN()
   * @see #gettick()
   * @generated
   */
  EAttribute gettick_N();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.sim.esi.esi.kvpair <em>kvpair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>kvpair</em>'.
   * @see de.cau.cs.kieler.sim.esi.esi.kvpair
   * @generated
   */
  EClass getkvpair();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sim.esi.esi.kvpair#getK <em>K</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>K</em>'.
   * @see de.cau.cs.kieler.sim.esi.esi.kvpair#getK()
   * @see #getkvpair()
   * @generated
   */
  EAttribute getkvpair_K();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sim.esi.esi.kvpair#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see de.cau.cs.kieler.sim.esi.esi.kvpair#getVal()
   * @see #getkvpair()
   * @generated
   */
  EAttribute getkvpair_Val();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.sim.esi.esi.signal <em>signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>signal</em>'.
   * @see de.cau.cs.kieler.sim.esi.esi.signal
   * @generated
   */
  EClass getsignal();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sim.esi.esi.signal#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.sim.esi.esi.signal#getName()
   * @see #getsignal()
   * @generated
   */
  EAttribute getsignal_Name();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sim.esi.esi.signal#isValued <em>Valued</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Valued</em>'.
   * @see de.cau.cs.kieler.sim.esi.esi.signal#isValued()
   * @see #getsignal()
   * @generated
   */
  EAttribute getsignal_Valued();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sim.esi.esi.signal#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see de.cau.cs.kieler.sim.esi.esi.signal#getVal()
   * @see #getsignal()
   * @generated
   */
  EAttribute getsignal_Val();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EsiFactory getEsiFactory();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.sim.esi.esi.impl.tracelistImpl <em>tracelist</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sim.esi.esi.impl.tracelistImpl
     * @see de.cau.cs.kieler.sim.esi.esi.impl.EsiPackageImpl#gettracelist()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.sim.esi.esi.impl.traceImpl <em>trace</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sim.esi.esi.impl.traceImpl
     * @see de.cau.cs.kieler.sim.esi.esi.impl.EsiPackageImpl#gettrace()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.sim.esi.esi.impl.tickImpl <em>tick</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sim.esi.esi.impl.tickImpl
     * @see de.cau.cs.kieler.sim.esi.esi.impl.EsiPackageImpl#gettick()
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
     * The meta object literal for the '<em><b>N</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TICK__N = eINSTANCE.gettick_N();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.sim.esi.esi.impl.kvpairImpl <em>kvpair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sim.esi.esi.impl.kvpairImpl
     * @see de.cau.cs.kieler.sim.esi.esi.impl.EsiPackageImpl#getkvpair()
     * @generated
     */
    EClass KVPAIR = eINSTANCE.getkvpair();

    /**
     * The meta object literal for the '<em><b>K</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KVPAIR__K = eINSTANCE.getkvpair_K();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KVPAIR__VAL = eINSTANCE.getkvpair_Val();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.sim.esi.esi.impl.signalImpl <em>signal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sim.esi.esi.impl.signalImpl
     * @see de.cau.cs.kieler.sim.esi.esi.impl.EsiPackageImpl#getsignal()
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
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIGNAL__VAL = eINSTANCE.getsignal_Val();

  }

} //EsiPackage
