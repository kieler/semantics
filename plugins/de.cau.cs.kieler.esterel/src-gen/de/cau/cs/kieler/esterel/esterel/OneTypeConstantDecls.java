/**
 */
package de.cau.cs.kieler.esterel.esterel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>One Type Constant Decls</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.OneTypeConstantDecls#getConstants <em>Constants</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.OneTypeConstantDecls#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getOneTypeConstantDecls()
 * @model
 * @generated
 */
public interface OneTypeConstantDecls extends EObject
{
  /**
   * Returns the value of the '<em><b>Constants</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.esterel.ConstantWithValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constants</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constants</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getOneTypeConstantDecls_Constants()
   * @model containment="true"
   * @generated
   */
  EList<ConstantWithValue> getConstants();

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(TypeIdentifier)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getOneTypeConstantDecls_Type()
   * @model containment="true"
   * @generated
   */
  TypeIdentifier getType();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.OneTypeConstantDecls#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TypeIdentifier value);

} // OneTypeConstantDecls
