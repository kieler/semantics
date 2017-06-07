/**
 */
package de.cau.cs.kieler.kvis;

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
 *   <li>{@link de.cau.cs.kieler.kvis.Interval#getFrom <em>From</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kvis.Interval#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kvis.KvisPackage#getInterval()
 * @model
 * @generated
 */
public interface Interval extends EObject
{
  /**
   * Returns the value of the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' attribute.
   * @see #setFrom(String)
   * @see de.cau.cs.kieler.kvis.KvisPackage#getInterval_From()
   * @model
   * @generated
   */
  String getFrom();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kvis.Interval#getFrom <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' attribute.
   * @see #getFrom()
   * @generated
   */
  void setFrom(String value);

  /**
   * Returns the value of the '<em><b>To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' attribute.
   * @see #setTo(String)
   * @see de.cau.cs.kieler.kvis.KvisPackage#getInterval_To()
   * @model
   * @generated
   */
  String getTo();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kvis.Interval#getTo <em>To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' attribute.
   * @see #getTo()
   * @generated
   */
  void setTo(String value);

} // Interval
