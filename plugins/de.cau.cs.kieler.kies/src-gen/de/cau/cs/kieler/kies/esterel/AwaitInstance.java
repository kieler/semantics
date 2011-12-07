/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.kies.esterel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Await Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.AwaitInstance#getDelay <em>Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getAwaitInstance()
 * @model
 * @generated
 */
public interface AwaitInstance extends StatementContainer, AwaitBody
{
  /**
   * Returns the value of the '<em><b>Delay</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delay</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delay</em>' containment reference.
   * @see #setDelay(DelayExpr)
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getAwaitInstance_Delay()
   * @model containment="true"
   * @generated
   */
  DelayExpr getDelay();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kies.esterel.AwaitInstance#getDelay <em>Delay</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delay</em>' containment reference.
   * @see #getDelay()
   * @generated
   */
  void setDelay(DelayExpr value);

} // AwaitInstance
