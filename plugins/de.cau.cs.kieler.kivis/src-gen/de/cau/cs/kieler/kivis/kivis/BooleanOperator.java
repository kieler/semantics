/**
 */
package de.cau.cs.kieler.kivis.kivis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kivis.kivis.BooleanOperator#getAND <em>AND</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kivis.kivis.KivisPackage#getBooleanOperator()
 * @model
 * @generated
 */
public interface BooleanOperator extends EObject
{
  /**
   * Returns the value of the '<em><b>AND</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>AND</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>AND</em>' attribute.
   * @see #setAND(String)
   * @see de.cau.cs.kieler.kivis.kivis.KivisPackage#getBooleanOperator_AND()
   * @model
   * @generated
   */
  String getAND();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kivis.kivis.BooleanOperator#getAND <em>AND</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>AND</em>' attribute.
   * @see #getAND()
   * @generated
   */
  void setAND(String value);

} // BooleanOperator
