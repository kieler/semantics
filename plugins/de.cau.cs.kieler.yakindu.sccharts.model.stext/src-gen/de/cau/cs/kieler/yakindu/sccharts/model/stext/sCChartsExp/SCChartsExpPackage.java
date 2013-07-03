/**
 */
package de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp;

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
 * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.SCChartsExpFactory
 * @model kind="package"
 * @generated
 */
public interface SCChartsExpPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sCChartsExp";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://kieler.cs.cau.de/yakindu/sccharts/stext/";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sCChartsExp";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SCChartsExpPackage eINSTANCE = de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.impl.SCChartsExpPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.impl.DummyImpl <em>Dummy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.impl.DummyImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.impl.SCChartsExpPackageImpl#getDummy()
   * @generated
   */
  int DUMMY = 0;

  /**
   * The feature id for the '<em><b>Variable Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUMMY__VARIABLE_DEFINITION = 0;

  /**
   * The number of structural features of the '<em>Dummy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUMMY_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.Dummy <em>Dummy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dummy</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.Dummy
   * @generated
   */
  EClass getDummy();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.Dummy#getVariableDefinition <em>Variable Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable Definition</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.Dummy#getVariableDefinition()
   * @see #getDummy()
   * @generated
   */
  EReference getDummy_VariableDefinition();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SCChartsExpFactory getSCChartsExpFactory();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.impl.DummyImpl <em>Dummy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.impl.DummyImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.impl.SCChartsExpPackageImpl#getDummy()
     * @generated
     */
    EClass DUMMY = eINSTANCE.getDummy();

    /**
     * The meta object literal for the '<em><b>Variable Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DUMMY__VARIABLE_DEFINITION = eINSTANCE.getDummy_VariableDefinition();

  }

} //SCChartsExpPackage
