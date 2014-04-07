/**
 */
package de.cau.cs.kieler.sccharts.text.sct.sct;

import de.cau.cs.kieler.core.kexpressions.Declaration;

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
 *   <li>{@link de.cau.cs.kieler.sccharts.text.sct.sct.SCChart#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.text.sct.sct.SCChart#getImports <em>Imports</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.text.sct.sct.SCChart#getDeclaration <em>Declaration</em>}</li>
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
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.cau.cs.kieler.sccharts.text.sct.sct.SctPackage#getSCChart_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.sccharts.text.sct.sct.SCChart#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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

  /**
   * Returns the value of the '<em><b>Declaration</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.core.kexpressions.Declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declaration</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declaration</em>' containment reference list.
   * @see de.cau.cs.kieler.sccharts.text.sct.sct.SctPackage#getSCChart_Declaration()
   * @model containment="true"
   * @generated
   */
  EList<Declaration> getDeclaration();

} // SCChart
