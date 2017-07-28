/**
 */
package de.cau.cs.kieler.prom.kibuild;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.prom.kibuild.Literal#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.prom.kibuild.KibuildPackage#getLiteral()
 * @model
 * @generated
 */
public interface Literal extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(EObject)
   * @see de.cau.cs.kieler.prom.kibuild.KibuildPackage#getLiteral_Value()
   * @model containment="true"
   * @generated
   */
  EObject getValue();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.prom.kibuild.Literal#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(EObject value);

} // Literal
