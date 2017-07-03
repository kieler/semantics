/**
 */
package de.cau.cs.kieler.kvis.kvis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signed Int</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kvis.kvis.SignedInt#getSign <em>Sign</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kvis.kvis.SignedInt#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kvis.kvis.KvisPackage#getSignedInt()
 * @model
 * @generated
 */
public interface SignedInt extends EObject
{
  /**
   * Returns the value of the '<em><b>Sign</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.kieler.kvis.kvis.Sign}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sign</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sign</em>' attribute.
   * @see de.cau.cs.kieler.kvis.kvis.Sign
   * @see #setSign(Sign)
   * @see de.cau.cs.kieler.kvis.kvis.KvisPackage#getSignedInt_Sign()
   * @model
   * @generated
   */
  Sign getSign();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kvis.kvis.SignedInt#getSign <em>Sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sign</em>' attribute.
   * @see de.cau.cs.kieler.kvis.kvis.Sign
   * @see #getSign()
   * @generated
   */
  void setSign(Sign value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see de.cau.cs.kieler.kvis.kvis.KvisPackage#getSignedInt_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kvis.kvis.SignedInt#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // SignedInt
