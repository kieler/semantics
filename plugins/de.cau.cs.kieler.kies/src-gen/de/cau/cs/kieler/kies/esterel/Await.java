/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.kies.esterel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Await</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.Await#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getAwait()
 * @model
 * @generated
 */
public interface Await extends Statement
{
  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(AwaitBody)
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getAwait_Body()
   * @model containment="true"
   * @generated
   */
  AwaitBody getBody();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kies.esterel.Await#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(AwaitBody value);

} // Await
