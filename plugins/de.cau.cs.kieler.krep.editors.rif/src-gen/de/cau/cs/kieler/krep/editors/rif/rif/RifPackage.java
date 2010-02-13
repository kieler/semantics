/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.krep.editors.rif.rif;

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
 * @see de.cau.cs.kieler.krep.editors.rif.rif.RifFactory
 * @model kind="package"
 * @generated
 */
public interface RifPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "rif";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cau.de/cs/kieler/krep/editors/rif/Rif";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "rif";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RifPackage eINSTANCE = de.cau.cs.kieler.krep.editors.rif.rif.impl.RifPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.krep.editors.rif.rif.impl.TraceImpl <em>Trace</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.krep.editors.rif.rif.impl.TraceImpl
   * @see de.cau.cs.kieler.krep.editors.rif.rif.impl.RifPackageImpl#getTrace()
   * @generated
   */
  int TRACE = 0;

  /**
   * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE__INPUTS = 0;

  /**
   * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE__OUTPUTS = 1;

  /**
   * The feature id for the '<em><b>Local</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE__LOCAL = 2;

  /**
   * The feature id for the '<em><b>Tick</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE__TICK = 3;

  /**
   * The number of structural features of the '<em>Trace</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.krep.editors.rif.rif.impl.declImpl <em>decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.krep.editors.rif.rif.impl.declImpl
   * @see de.cau.cs.kieler.krep.editors.rif.rif.impl.RifPackageImpl#getdecl()
   * @generated
   */
  int DECL = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECL__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECL__TYPE = 1;

  /**
   * The number of structural features of the '<em>decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.krep.editors.rif.rif.impl.TickImpl <em>Tick</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.krep.editors.rif.rif.impl.TickImpl
   * @see de.cau.cs.kieler.krep.editors.rif.rif.impl.RifPackageImpl#getTick()
   * @generated
   */
  int TICK = 2;

  /**
   * The feature id for the '<em><b>Nr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TICK__NR = 0;

  /**
   * The feature id for the '<em><b>Input</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TICK__INPUT = 1;

  /**
   * The feature id for the '<em><b>Output</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TICK__OUTPUT = 2;

  /**
   * The feature id for the '<em><b>Local</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TICK__LOCAL = 3;

  /**
   * The number of structural features of the '<em>Tick</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TICK_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.krep.editors.rif.rif.impl.DataImpl <em>Data</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.krep.editors.rif.rif.impl.DataImpl
   * @see de.cau.cs.kieler.krep.editors.rif.rif.impl.RifPackageImpl#getData()
   * @generated
   */
  int DATA = 3;

  /**
   * The feature id for the '<em><b>Int Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA__INT_VAL = 0;

  /**
   * The feature id for the '<em><b>True</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA__TRUE = 1;

  /**
   * The feature id for the '<em><b>False</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA__FALSE = 2;

  /**
   * The number of structural features of the '<em>Data</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.krep.editors.rif.rif.Trace <em>Trace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trace</em>'.
   * @see de.cau.cs.kieler.krep.editors.rif.rif.Trace
   * @generated
   */
  EClass getTrace();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.krep.editors.rif.rif.Trace#getInputs <em>Inputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inputs</em>'.
   * @see de.cau.cs.kieler.krep.editors.rif.rif.Trace#getInputs()
   * @see #getTrace()
   * @generated
   */
  EReference getTrace_Inputs();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.krep.editors.rif.rif.Trace#getOutputs <em>Outputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Outputs</em>'.
   * @see de.cau.cs.kieler.krep.editors.rif.rif.Trace#getOutputs()
   * @see #getTrace()
   * @generated
   */
  EReference getTrace_Outputs();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.krep.editors.rif.rif.Trace#getLocal <em>Local</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Local</em>'.
   * @see de.cau.cs.kieler.krep.editors.rif.rif.Trace#getLocal()
   * @see #getTrace()
   * @generated
   */
  EReference getTrace_Local();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.krep.editors.rif.rif.Trace#getTick <em>Tick</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tick</em>'.
   * @see de.cau.cs.kieler.krep.editors.rif.rif.Trace#getTick()
   * @see #getTrace()
   * @generated
   */
  EReference getTrace_Tick();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.krep.editors.rif.rif.decl <em>decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>decl</em>'.
   * @see de.cau.cs.kieler.krep.editors.rif.rif.decl
   * @generated
   */
  EClass getdecl();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.krep.editors.rif.rif.decl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.krep.editors.rif.rif.decl#getName()
   * @see #getdecl()
   * @generated
   */
  EAttribute getdecl_Name();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.krep.editors.rif.rif.decl#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.cau.cs.kieler.krep.editors.rif.rif.decl#getType()
   * @see #getdecl()
   * @generated
   */
  EAttribute getdecl_Type();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.krep.editors.rif.rif.Tick <em>Tick</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tick</em>'.
   * @see de.cau.cs.kieler.krep.editors.rif.rif.Tick
   * @generated
   */
  EClass getTick();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.krep.editors.rif.rif.Tick#getNr <em>Nr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nr</em>'.
   * @see de.cau.cs.kieler.krep.editors.rif.rif.Tick#getNr()
   * @see #getTick()
   * @generated
   */
  EAttribute getTick_Nr();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.krep.editors.rif.rif.Tick#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Input</em>'.
   * @see de.cau.cs.kieler.krep.editors.rif.rif.Tick#getInput()
   * @see #getTick()
   * @generated
   */
  EReference getTick_Input();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.krep.editors.rif.rif.Tick#getOutput <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Output</em>'.
   * @see de.cau.cs.kieler.krep.editors.rif.rif.Tick#getOutput()
   * @see #getTick()
   * @generated
   */
  EReference getTick_Output();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.krep.editors.rif.rif.Tick#getLocal <em>Local</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Local</em>'.
   * @see de.cau.cs.kieler.krep.editors.rif.rif.Tick#getLocal()
   * @see #getTick()
   * @generated
   */
  EReference getTick_Local();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.krep.editors.rif.rif.Data <em>Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data</em>'.
   * @see de.cau.cs.kieler.krep.editors.rif.rif.Data
   * @generated
   */
  EClass getData();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.krep.editors.rif.rif.Data#getIntVal <em>Int Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Int Val</em>'.
   * @see de.cau.cs.kieler.krep.editors.rif.rif.Data#getIntVal()
   * @see #getData()
   * @generated
   */
  EAttribute getData_IntVal();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.krep.editors.rif.rif.Data#isTrue <em>True</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>True</em>'.
   * @see de.cau.cs.kieler.krep.editors.rif.rif.Data#isTrue()
   * @see #getData()
   * @generated
   */
  EAttribute getData_True();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.krep.editors.rif.rif.Data#isFalse <em>False</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>False</em>'.
   * @see de.cau.cs.kieler.krep.editors.rif.rif.Data#isFalse()
   * @see #getData()
   * @generated
   */
  EAttribute getData_False();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RifFactory getRifFactory();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.krep.editors.rif.rif.impl.TraceImpl <em>Trace</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.krep.editors.rif.rif.impl.TraceImpl
     * @see de.cau.cs.kieler.krep.editors.rif.rif.impl.RifPackageImpl#getTrace()
     * @generated
     */
    EClass TRACE = eINSTANCE.getTrace();

    /**
     * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRACE__INPUTS = eINSTANCE.getTrace_Inputs();

    /**
     * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRACE__OUTPUTS = eINSTANCE.getTrace_Outputs();

    /**
     * The meta object literal for the '<em><b>Local</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRACE__LOCAL = eINSTANCE.getTrace_Local();

    /**
     * The meta object literal for the '<em><b>Tick</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRACE__TICK = eINSTANCE.getTrace_Tick();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.krep.editors.rif.rif.impl.declImpl <em>decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.krep.editors.rif.rif.impl.declImpl
     * @see de.cau.cs.kieler.krep.editors.rif.rif.impl.RifPackageImpl#getdecl()
     * @generated
     */
    EClass DECL = eINSTANCE.getdecl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECL__NAME = eINSTANCE.getdecl_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECL__TYPE = eINSTANCE.getdecl_Type();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.krep.editors.rif.rif.impl.TickImpl <em>Tick</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.krep.editors.rif.rif.impl.TickImpl
     * @see de.cau.cs.kieler.krep.editors.rif.rif.impl.RifPackageImpl#getTick()
     * @generated
     */
    EClass TICK = eINSTANCE.getTick();

    /**
     * The meta object literal for the '<em><b>Nr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TICK__NR = eINSTANCE.getTick_Nr();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TICK__INPUT = eINSTANCE.getTick_Input();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TICK__OUTPUT = eINSTANCE.getTick_Output();

    /**
     * The meta object literal for the '<em><b>Local</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TICK__LOCAL = eINSTANCE.getTick_Local();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.krep.editors.rif.rif.impl.DataImpl <em>Data</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.krep.editors.rif.rif.impl.DataImpl
     * @see de.cau.cs.kieler.krep.editors.rif.rif.impl.RifPackageImpl#getData()
     * @generated
     */
    EClass DATA = eINSTANCE.getData();

    /**
     * The meta object literal for the '<em><b>Int Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA__INT_VAL = eINSTANCE.getData_IntVal();

    /**
     * The meta object literal for the '<em><b>True</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA__TRUE = eINSTANCE.getData_True();

    /**
     * The meta object literal for the '<em><b>False</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA__FALSE = eINSTANCE.getData_False();

  }

} //RifPackage
