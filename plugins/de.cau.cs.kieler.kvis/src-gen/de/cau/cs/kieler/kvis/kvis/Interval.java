/**
 */
package de.cau.cs.kieler.kvis.kvis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kvis.kvis.Interval#getFrom <em>From</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kvis.kvis.Interval#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kvis.kvis.KvisPackage#getInterval()
 * @model
 * @generated
 */
public interface Interval extends EObject
{
  /**
   * Returns the value of the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' containment reference.
   * @see #setFrom(EObject)
   * @see de.cau.cs.kieler.kvis.kvis.KvisPackage#getInterval_From()
   * @model containment="true"
   * @generated
   */
  EObject getFrom();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kvis.kvis.Interval#getFrom <em>From</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' containment reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(EObject value);

  /**
   * Returns the value of the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' containment reference.
   * @see #setTo(EObject)
   * @see de.cau.cs.kieler.kvis.kvis.KvisPackage#getInterval_To()
   * @model containment="true"
   * @generated
   */
  EObject getTo();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kvis.kvis.Interval#getTo <em>To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' containment reference.
   * @see #getTo()
   * @generated
   */
  void setTo(EObject value);

} // Interval
