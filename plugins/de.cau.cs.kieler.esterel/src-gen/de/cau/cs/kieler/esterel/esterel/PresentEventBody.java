/**
 */
package de.cau.cs.kieler.esterel.esterel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Present Event Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.PresentEventBody#getEvent <em>Event</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.PresentEventBody#getThenPart <em>Then Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getPresentEventBody()
 * @model
 * @generated
 */
public interface PresentEventBody extends PresentBody
{
  /**
   * Returns the value of the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' containment reference.
   * @see #setEvent(PresentEvent)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getPresentEventBody_Event()
   * @model containment="true"
   * @generated
   */
  PresentEvent getEvent();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.PresentEventBody#getEvent <em>Event</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' containment reference.
   * @see #getEvent()
   * @generated
   */
  void setEvent(PresentEvent value);

  /**
   * Returns the value of the '<em><b>Then Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then Part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then Part</em>' containment reference.
   * @see #setThenPart(ThenPart)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getPresentEventBody_ThenPart()
   * @model containment="true"
   * @generated
   */
  ThenPart getThenPart();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.PresentEventBody#getThenPart <em>Then Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then Part</em>' containment reference.
   * @see #getThenPart()
   * @generated
   */
  void setThenPart(ThenPart value);

} // PresentEventBody
