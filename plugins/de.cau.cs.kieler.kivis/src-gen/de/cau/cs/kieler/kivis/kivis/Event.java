/**
 */
package de.cau.cs.kieler.kivis.kivis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kivis.kivis.Event#getEvent <em>Event</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kivis.kivis.Event#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kivis.kivis.KivisPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EObject
{
  /**
   * Returns the value of the '<em><b>Event</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.kieler.kivis.kivis.DOMEvent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' attribute.
   * @see de.cau.cs.kieler.kivis.kivis.DOMEvent
   * @see #setEvent(DOMEvent)
   * @see de.cau.cs.kieler.kivis.kivis.KivisPackage#getEvent_Event()
   * @model
   * @generated
   */
  DOMEvent getEvent();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kivis.kivis.Event#getEvent <em>Event</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' attribute.
   * @see de.cau.cs.kieler.kivis.kivis.DOMEvent
   * @see #getEvent()
   * @generated
   */
  void setEvent(DOMEvent value);

  /**
   * Returns the value of the '<em><b>Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' attribute.
   * @see #setElement(String)
   * @see de.cau.cs.kieler.kivis.kivis.KivisPackage#getEvent_Element()
   * @model
   * @generated
   */
  String getElement();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kivis.kivis.Event#getElement <em>Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' attribute.
   * @see #getElement()
   * @generated
   */
  void setElement(String value);

} // Event
