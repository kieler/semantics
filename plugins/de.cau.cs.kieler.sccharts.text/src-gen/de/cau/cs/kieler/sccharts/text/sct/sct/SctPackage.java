/**
 */
package de.cau.cs.kieler.sccharts.text.sct.sct;

import de.cau.cs.kieler.sccharts.SCChartsPackage;

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
 * @see de.cau.cs.kieler.sccharts.text.sct.sct.SctFactory
 * @model kind="package"
 * @generated
 */
public interface SctPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sct";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://kieler.cs.cau.de/sccharts/textual/0.1.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sct";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SctPackage eINSTANCE = de.cau.cs.kieler.sccharts.text.sct.sct.impl.SctPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.sccharts.text.sct.sct.impl.SCChartImpl <em>SC Chart</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.sccharts.text.sct.sct.impl.SCChartImpl
   * @see de.cau.cs.kieler.sccharts.text.sct.sct.impl.SctPackageImpl#getSCChart()
   * @generated
   */
  int SC_CHART = 0;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SC_CHART__ANNOTATIONS = SCChartsPackage.STATE__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SC_CHART__ID = SCChartsPackage.STATE__ID;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SC_CHART__LABEL = SCChartsPackage.STATE__LABEL;

  /**
   * The feature id for the '<em><b>Local Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SC_CHART__LOCAL_ACTIONS = SCChartsPackage.STATE__LOCAL_ACTIONS;

  /**
   * The feature id for the '<em><b>Referenced Scope</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SC_CHART__REFERENCED_SCOPE = SCChartsPackage.STATE__REFERENCED_SCOPE;

  /**
   * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SC_CHART__BINDINGS = SCChartsPackage.STATE__BINDINGS;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SC_CHART__DECLARATIONS = SCChartsPackage.STATE__DECLARATIONS;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SC_CHART__TYPE = SCChartsPackage.STATE__TYPE;

  /**
   * The feature id for the '<em><b>Regions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SC_CHART__REGIONS = SCChartsPackage.STATE__REGIONS;

  /**
   * The feature id for the '<em><b>Parent Region</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SC_CHART__PARENT_REGION = SCChartsPackage.STATE__PARENT_REGION;

  /**
   * The feature id for the '<em><b>Initial</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SC_CHART__INITIAL = SCChartsPackage.STATE__INITIAL;

  /**
   * The feature id for the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SC_CHART__FINAL = SCChartsPackage.STATE__FINAL;

  /**
   * The feature id for the '<em><b>Outgoing Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SC_CHART__OUTGOING_TRANSITIONS = SCChartsPackage.STATE__OUTGOING_TRANSITIONS;

  /**
   * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SC_CHART__INCOMING_TRANSITIONS = SCChartsPackage.STATE__INCOMING_TRANSITIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SC_CHART__NAME = SCChartsPackage.STATE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SC_CHART__IMPORTS = SCChartsPackage.STATE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Declaration</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SC_CHART__DECLARATION = SCChartsPackage.STATE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>SC Chart</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SC_CHART_FEATURE_COUNT = SCChartsPackage.STATE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.sccharts.text.sct.sct.impl.ImportDeclImpl <em>Import Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.sccharts.text.sct.sct.impl.ImportDeclImpl
   * @see de.cau.cs.kieler.sccharts.text.sct.sct.impl.SctPackageImpl#getImportDecl()
   * @generated
   */
  int IMPORT_DECL = 1;

  /**
   * The feature id for the '<em><b>Imported Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_DECL__IMPORTED_TYPE = 0;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_DECL__IMPORTED_NAMESPACE = 1;

  /**
   * The number of structural features of the '<em>Import Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_DECL_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.text.sct.sct.SCChart <em>SC Chart</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SC Chart</em>'.
   * @see de.cau.cs.kieler.sccharts.text.sct.sct.SCChart
   * @generated
   */
  EClass getSCChart();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sccharts.text.sct.sct.SCChart#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.sccharts.text.sct.sct.SCChart#getName()
   * @see #getSCChart()
   * @generated
   */
  EAttribute getSCChart_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.sccharts.text.sct.sct.SCChart#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see de.cau.cs.kieler.sccharts.text.sct.sct.SCChart#getImports()
   * @see #getSCChart()
   * @generated
   */
  EReference getSCChart_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.sccharts.text.sct.sct.SCChart#getDeclaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declaration</em>'.
   * @see de.cau.cs.kieler.sccharts.text.sct.sct.SCChart#getDeclaration()
   * @see #getSCChart()
   * @generated
   */
  EReference getSCChart_Declaration();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.text.sct.sct.ImportDecl <em>Import Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Decl</em>'.
   * @see de.cau.cs.kieler.sccharts.text.sct.sct.ImportDecl
   * @generated
   */
  EClass getImportDecl();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.sccharts.text.sct.sct.ImportDecl#getImportedType <em>Imported Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Imported Type</em>'.
   * @see de.cau.cs.kieler.sccharts.text.sct.sct.ImportDecl#getImportedType()
   * @see #getImportDecl()
   * @generated
   */
  EReference getImportDecl_ImportedType();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sccharts.text.sct.sct.ImportDecl#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see de.cau.cs.kieler.sccharts.text.sct.sct.ImportDecl#getImportedNamespace()
   * @see #getImportDecl()
   * @generated
   */
  EAttribute getImportDecl_ImportedNamespace();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SctFactory getSctFactory();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.text.sct.sct.impl.SCChartImpl <em>SC Chart</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sccharts.text.sct.sct.impl.SCChartImpl
     * @see de.cau.cs.kieler.sccharts.text.sct.sct.impl.SctPackageImpl#getSCChart()
     * @generated
     */
    EClass SC_CHART = eINSTANCE.getSCChart();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SC_CHART__NAME = eINSTANCE.getSCChart_Name();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SC_CHART__IMPORTS = eINSTANCE.getSCChart_Imports();

    /**
     * The meta object literal for the '<em><b>Declaration</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SC_CHART__DECLARATION = eINSTANCE.getSCChart_Declaration();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.text.sct.sct.impl.ImportDeclImpl <em>Import Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sccharts.text.sct.sct.impl.ImportDeclImpl
     * @see de.cau.cs.kieler.sccharts.text.sct.sct.impl.SctPackageImpl#getImportDecl()
     * @generated
     */
    EClass IMPORT_DECL = eINSTANCE.getImportDecl();

    /**
     * The meta object literal for the '<em><b>Imported Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPORT_DECL__IMPORTED_TYPE = eINSTANCE.getImportDecl_ImportedType();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_DECL__IMPORTED_NAMESPACE = eINSTANCE.getImportDecl_ImportedNamespace();

  }

} //SctPackage
