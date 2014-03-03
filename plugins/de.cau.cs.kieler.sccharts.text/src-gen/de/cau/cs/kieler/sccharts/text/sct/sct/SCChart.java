/**
 */
package de.cau.cs.kieler.sccharts.text.sct.sct;

import de.cau.cs.kieler.sccharts.State;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SC Chart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.text.sct.sct.SCChart#getPackage <em>Package</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.text.sct.sct.SCChart#getImports <em>Imports</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.sccharts.text.sct.sct.SctPackage#getSCChart()
 * @model
 * @generated
 */
public interface SCChart extends State
{
  /**
   * Returns the value of the '<em><b>Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package</em>' attribute.
   * @see #setPackage(String)
   * @see de.cau.cs.kieler.sccharts.text.sct.sct.SctPackage#getSCChart_Package()
   * @model
   * @generated
   */
  String getPackage();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.sccharts.text.sct.sct.SCChart#getPackage <em>Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package</em>' attribute.
   * @see #getPackage()
   * @generated
   */
  void setPackage(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.sccharts.text.sct.sct.ImportDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see de.cau.cs.kieler.sccharts.text.sct.sct.SctPackage#getSCChart_Imports()
   * @model containment="true"
   * @generated
   */
  EList<ImportDecl> getImports();

} // SCChart
