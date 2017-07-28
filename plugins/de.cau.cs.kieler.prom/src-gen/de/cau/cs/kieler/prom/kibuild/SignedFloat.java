/**
 */
package de.cau.cs.kieler.prom.kibuild;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signed Float</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.prom.kibuild.SignedFloat#getSign <em>Sign</em>}</li>
 *   <li>{@link de.cau.cs.kieler.prom.kibuild.SignedFloat#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.prom.kibuild.KibuildPackage#getSignedFloat()
 * @model
 * @generated
 */
public interface SignedFloat extends EObject
{
  /**
   * Returns the value of the '<em><b>Sign</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.kieler.prom.kibuild.Sign}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sign</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sign</em>' attribute.
   * @see de.cau.cs.kieler.prom.kibuild.Sign
   * @see #setSign(Sign)
   * @see de.cau.cs.kieler.prom.kibuild.KibuildPackage#getSignedFloat_Sign()
   * @model
   * @generated
   */
  Sign getSign();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.prom.kibuild.SignedFloat#getSign <em>Sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sign</em>' attribute.
   * @see de.cau.cs.kieler.prom.kibuild.Sign
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
   * @see #setValue(Float)
   * @see de.cau.cs.kieler.prom.kibuild.KibuildPackage#getSignedFloat_Value()
   * @model
   * @generated
   */
  Float getValue();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.prom.kibuild.SignedFloat#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(Float value);

} // SignedFloat
