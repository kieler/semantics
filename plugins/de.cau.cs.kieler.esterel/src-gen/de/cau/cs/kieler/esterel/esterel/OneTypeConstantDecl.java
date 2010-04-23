/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.esterel.esterel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>One Type Constant Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.OneTypeConstantDecl#getConstant <em>Constant</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.OneTypeConstantDecl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getOneTypeConstantDecl()
 * @model
 * @generated
 */
public interface OneTypeConstantDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Constant</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.esterel.Constant}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constant</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getOneTypeConstantDecl_Constant()
   * @model containment="true"
   * @generated
   */
  EList<Constant> getConstant();

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getOneTypeConstantDecl_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.OneTypeConstantDecl#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

} // OneTypeConstantDecl
