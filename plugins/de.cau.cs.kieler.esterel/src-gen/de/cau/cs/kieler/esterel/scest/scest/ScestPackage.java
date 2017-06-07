/**
 */
package de.cau.cs.kieler.esterel.scest.scest;

import de.cau.cs.kieler.scl.scl.SclPackage;

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
 * @see de.cau.cs.kieler.esterel.scest.scest.ScestFactory
 * @model kind="package"
 * @generated
 */
public interface ScestPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "scest";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cau.de/cs/kieler/esterel/scest/SCEst";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "scest";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ScestPackage eINSTANCE = de.cau.cs.kieler.esterel.scest.scest.impl.ScestPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.scest.scest.impl.SCEstProgramImpl <em>SC Est Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.scest.scest.impl.SCEstProgramImpl
   * @see de.cau.cs.kieler.esterel.scest.scest.impl.ScestPackageImpl#getSCEstProgram()
   * @generated
   */
  int SC_EST_PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Modules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SC_EST_PROGRAM__MODULES = 0;

  /**
   * The number of structural features of the '<em>SC Est Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SC_EST_PROGRAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.scest.scest.impl.SCEstModuleImpl <em>SC Est Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.scest.scest.impl.SCEstModuleImpl
   * @see de.cau.cs.kieler.esterel.scest.scest.impl.ScestPackageImpl#getSCEstModule()
   * @generated
   */
  int SC_EST_MODULE = 1;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SC_EST_MODULE__ANNOTATIONS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SC_EST_MODULE__NAME = 1;

  /**
   * The feature id for the '<em><b>Int Signal Decls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SC_EST_MODULE__INT_SIGNAL_DECLS = 2;

  /**
   * The feature id for the '<em><b>Int Type Decls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SC_EST_MODULE__INT_TYPE_DECLS = 3;

  /**
   * The feature id for the '<em><b>Int Sensor Decls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SC_EST_MODULE__INT_SENSOR_DECLS = 4;

  /**
   * The feature id for the '<em><b>Int Constant Decls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SC_EST_MODULE__INT_CONSTANT_DECLS = 5;

  /**
   * The feature id for the '<em><b>Int Relation Decls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SC_EST_MODULE__INT_RELATION_DECLS = 6;

  /**
   * The feature id for the '<em><b>Int Task Decls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SC_EST_MODULE__INT_TASK_DECLS = 7;

  /**
   * The feature id for the '<em><b>Int Function Decls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SC_EST_MODULE__INT_FUNCTION_DECLS = 8;

  /**
   * The feature id for the '<em><b>Int Procedure Decls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SC_EST_MODULE__INT_PROCEDURE_DECLS = 9;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SC_EST_MODULE__STATEMENTS = 10;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SC_EST_MODULE__DECLARATIONS = 11;

  /**
   * The number of structural features of the '<em>SC Est Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SC_EST_MODULE_FEATURE_COUNT = 12;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.scest.scest.impl.UnEmitImpl <em>Un Emit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.scest.scest.impl.UnEmitImpl
   * @see de.cau.cs.kieler.esterel.scest.scest.impl.ScestPackageImpl#getUnEmit()
   * @generated
   */
  int UN_EMIT = 2;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UN_EMIT__ANNOTATIONS = SclPackage.STATEMENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Signal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UN_EMIT__SIGNAL = SclPackage.STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tick</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UN_EMIT__TICK = SclPackage.STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Un Emit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UN_EMIT_FEATURE_COUNT = SclPackage.STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.esterel.scest.scest.impl.SetImpl <em>Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.esterel.scest.scest.impl.SetImpl
   * @see de.cau.cs.kieler.esterel.scest.scest.impl.ScestPackageImpl#getSet()
   * @generated
   */
  int SET = 3;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET__ANNOTATIONS = SclPackage.STATEMENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Signal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET__SIGNAL = SclPackage.STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tick</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET__TICK = SclPackage.STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET__EXPR = SclPackage.STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_FEATURE_COUNT = SclPackage.STATEMENT_FEATURE_COUNT + 3;


  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.scest.scest.SCEstProgram <em>SC Est Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SC Est Program</em>'.
   * @see de.cau.cs.kieler.esterel.scest.scest.SCEstProgram
   * @generated
   */
  EClass getSCEstProgram();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.scest.scest.SCEstProgram#getModules <em>Modules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Modules</em>'.
   * @see de.cau.cs.kieler.esterel.scest.scest.SCEstProgram#getModules()
   * @see #getSCEstProgram()
   * @generated
   */
  EReference getSCEstProgram_Modules();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.scest.scest.SCEstModule <em>SC Est Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SC Est Module</em>'.
   * @see de.cau.cs.kieler.esterel.scest.scest.SCEstModule
   * @generated
   */
  EClass getSCEstModule();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.scest.scest.SCEstModule#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see de.cau.cs.kieler.esterel.scest.scest.SCEstModule#getAnnotations()
   * @see #getSCEstModule()
   * @generated
   */
  EReference getSCEstModule_Annotations();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.scest.scest.SCEstModule#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.esterel.scest.scest.SCEstModule#getName()
   * @see #getSCEstModule()
   * @generated
   */
  EAttribute getSCEstModule_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.scest.scest.SCEstModule#getIntSignalDecls <em>Int Signal Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Int Signal Decls</em>'.
   * @see de.cau.cs.kieler.esterel.scest.scest.SCEstModule#getIntSignalDecls()
   * @see #getSCEstModule()
   * @generated
   */
  EReference getSCEstModule_IntSignalDecls();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.scest.scest.SCEstModule#getIntTypeDecls <em>Int Type Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Int Type Decls</em>'.
   * @see de.cau.cs.kieler.esterel.scest.scest.SCEstModule#getIntTypeDecls()
   * @see #getSCEstModule()
   * @generated
   */
  EReference getSCEstModule_IntTypeDecls();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.scest.scest.SCEstModule#getIntSensorDecls <em>Int Sensor Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Int Sensor Decls</em>'.
   * @see de.cau.cs.kieler.esterel.scest.scest.SCEstModule#getIntSensorDecls()
   * @see #getSCEstModule()
   * @generated
   */
  EReference getSCEstModule_IntSensorDecls();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.scest.scest.SCEstModule#getIntConstantDecls <em>Int Constant Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Int Constant Decls</em>'.
   * @see de.cau.cs.kieler.esterel.scest.scest.SCEstModule#getIntConstantDecls()
   * @see #getSCEstModule()
   * @generated
   */
  EReference getSCEstModule_IntConstantDecls();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.scest.scest.SCEstModule#getIntRelationDecls <em>Int Relation Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Int Relation Decls</em>'.
   * @see de.cau.cs.kieler.esterel.scest.scest.SCEstModule#getIntRelationDecls()
   * @see #getSCEstModule()
   * @generated
   */
  EReference getSCEstModule_IntRelationDecls();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.scest.scest.SCEstModule#getIntTaskDecls <em>Int Task Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Int Task Decls</em>'.
   * @see de.cau.cs.kieler.esterel.scest.scest.SCEstModule#getIntTaskDecls()
   * @see #getSCEstModule()
   * @generated
   */
  EReference getSCEstModule_IntTaskDecls();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.scest.scest.SCEstModule#getIntFunctionDecls <em>Int Function Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Int Function Decls</em>'.
   * @see de.cau.cs.kieler.esterel.scest.scest.SCEstModule#getIntFunctionDecls()
   * @see #getSCEstModule()
   * @generated
   */
  EReference getSCEstModule_IntFunctionDecls();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.scest.scest.SCEstModule#getIntProcedureDecls <em>Int Procedure Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Int Procedure Decls</em>'.
   * @see de.cau.cs.kieler.esterel.scest.scest.SCEstModule#getIntProcedureDecls()
   * @see #getSCEstModule()
   * @generated
   */
  EReference getSCEstModule_IntProcedureDecls();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.scest.scest.SCEstModule#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see de.cau.cs.kieler.esterel.scest.scest.SCEstModule#getStatements()
   * @see #getSCEstModule()
   * @generated
   */
  EReference getSCEstModule_Statements();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.scest.scest.SCEstModule#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see de.cau.cs.kieler.esterel.scest.scest.SCEstModule#getDeclarations()
   * @see #getSCEstModule()
   * @generated
   */
  EReference getSCEstModule_Declarations();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.scest.scest.UnEmit <em>Un Emit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Un Emit</em>'.
   * @see de.cau.cs.kieler.esterel.scest.scest.UnEmit
   * @generated
   */
  EClass getUnEmit();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.scest.scest.UnEmit#getSignal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Signal</em>'.
   * @see de.cau.cs.kieler.esterel.scest.scest.UnEmit#getSignal()
   * @see #getUnEmit()
   * @generated
   */
  EReference getUnEmit_Signal();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.scest.scest.UnEmit#getTick <em>Tick</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tick</em>'.
   * @see de.cau.cs.kieler.esterel.scest.scest.UnEmit#getTick()
   * @see #getUnEmit()
   * @generated
   */
  EReference getUnEmit_Tick();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.scest.scest.Set <em>Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set</em>'.
   * @see de.cau.cs.kieler.esterel.scest.scest.Set
   * @generated
   */
  EClass getSet();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.scest.scest.Set#getSignal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Signal</em>'.
   * @see de.cau.cs.kieler.esterel.scest.scest.Set#getSignal()
   * @see #getSet()
   * @generated
   */
  EReference getSet_Signal();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.scest.scest.Set#getTick <em>Tick</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tick</em>'.
   * @see de.cau.cs.kieler.esterel.scest.scest.Set#getTick()
   * @see #getSet()
   * @generated
   */
  EReference getSet_Tick();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.scest.scest.Set#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.cau.cs.kieler.esterel.scest.scest.Set#getExpr()
   * @see #getSet()
   * @generated
   */
  EReference getSet_Expr();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ScestFactory getScestFactory();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.scest.scest.impl.SCEstProgramImpl <em>SC Est Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.scest.scest.impl.SCEstProgramImpl
     * @see de.cau.cs.kieler.esterel.scest.scest.impl.ScestPackageImpl#getSCEstProgram()
     * @generated
     */
    EClass SC_EST_PROGRAM = eINSTANCE.getSCEstProgram();

    /**
     * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SC_EST_PROGRAM__MODULES = eINSTANCE.getSCEstProgram_Modules();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.scest.scest.impl.SCEstModuleImpl <em>SC Est Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.scest.scest.impl.SCEstModuleImpl
     * @see de.cau.cs.kieler.esterel.scest.scest.impl.ScestPackageImpl#getSCEstModule()
     * @generated
     */
    EClass SC_EST_MODULE = eINSTANCE.getSCEstModule();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SC_EST_MODULE__ANNOTATIONS = eINSTANCE.getSCEstModule_Annotations();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SC_EST_MODULE__NAME = eINSTANCE.getSCEstModule_Name();

    /**
     * The meta object literal for the '<em><b>Int Signal Decls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SC_EST_MODULE__INT_SIGNAL_DECLS = eINSTANCE.getSCEstModule_IntSignalDecls();

    /**
     * The meta object literal for the '<em><b>Int Type Decls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SC_EST_MODULE__INT_TYPE_DECLS = eINSTANCE.getSCEstModule_IntTypeDecls();

    /**
     * The meta object literal for the '<em><b>Int Sensor Decls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SC_EST_MODULE__INT_SENSOR_DECLS = eINSTANCE.getSCEstModule_IntSensorDecls();

    /**
     * The meta object literal for the '<em><b>Int Constant Decls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SC_EST_MODULE__INT_CONSTANT_DECLS = eINSTANCE.getSCEstModule_IntConstantDecls();

    /**
     * The meta object literal for the '<em><b>Int Relation Decls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SC_EST_MODULE__INT_RELATION_DECLS = eINSTANCE.getSCEstModule_IntRelationDecls();

    /**
     * The meta object literal for the '<em><b>Int Task Decls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SC_EST_MODULE__INT_TASK_DECLS = eINSTANCE.getSCEstModule_IntTaskDecls();

    /**
     * The meta object literal for the '<em><b>Int Function Decls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SC_EST_MODULE__INT_FUNCTION_DECLS = eINSTANCE.getSCEstModule_IntFunctionDecls();

    /**
     * The meta object literal for the '<em><b>Int Procedure Decls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SC_EST_MODULE__INT_PROCEDURE_DECLS = eINSTANCE.getSCEstModule_IntProcedureDecls();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SC_EST_MODULE__STATEMENTS = eINSTANCE.getSCEstModule_Statements();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SC_EST_MODULE__DECLARATIONS = eINSTANCE.getSCEstModule_Declarations();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.scest.scest.impl.UnEmitImpl <em>Un Emit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.scest.scest.impl.UnEmitImpl
     * @see de.cau.cs.kieler.esterel.scest.scest.impl.ScestPackageImpl#getUnEmit()
     * @generated
     */
    EClass UN_EMIT = eINSTANCE.getUnEmit();

    /**
     * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UN_EMIT__SIGNAL = eINSTANCE.getUnEmit_Signal();

    /**
     * The meta object literal for the '<em><b>Tick</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UN_EMIT__TICK = eINSTANCE.getUnEmit_Tick();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.esterel.scest.scest.impl.SetImpl <em>Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.scest.scest.impl.SetImpl
     * @see de.cau.cs.kieler.esterel.scest.scest.impl.ScestPackageImpl#getSet()
     * @generated
     */
    EClass SET = eINSTANCE.getSet();

    /**
     * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET__SIGNAL = eINSTANCE.getSet_Signal();

    /**
     * The meta object literal for the '<em><b>Tick</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET__TICK = eINSTANCE.getSet_Tick();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET__EXPR = eINSTANCE.getSet_Expr();

  }

} //ScestPackage
