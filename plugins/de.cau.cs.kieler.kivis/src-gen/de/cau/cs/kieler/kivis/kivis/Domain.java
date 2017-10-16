/**
 */
package de.cau.cs.kieler.kivis.kivis;

import de.cau.cs.kieler.prom.kibuild.Literal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kivis.kivis.Domain#isOtherValues <em>Other Values</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kivis.kivis.Domain#getValue <em>Value</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kivis.kivis.Domain#getRange <em>Range</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kivis.kivis.Domain#isCurrentValue <em>Current Value</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kivis.kivis.KivisPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject
{
  /**
   * Returns the value of the '<em><b>Other Values</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Other Values</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Other Values</em>' attribute.
   * @see #setOtherValues(boolean)
   * @see de.cau.cs.kieler.kivis.kivis.KivisPackage#getDomain_OtherValues()
   * @model
   * @generated
   */
  boolean isOtherValues();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kivis.kivis.Domain#isOtherValues <em>Other Values</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Other Values</em>' attribute.
   * @see #isOtherValues()
   * @generated
   */
  void setOtherValues(boolean value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Literal)
   * @see de.cau.cs.kieler.kivis.kivis.KivisPackage#getDomain_Value()
   * @model containment="true"
   * @generated
   */
  Literal getValue();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kivis.kivis.Domain#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Literal value);

  /**
   * Returns the value of the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' containment reference.
   * @see #setRange(Interval)
   * @see de.cau.cs.kieler.kivis.kivis.KivisPackage#getDomain_Range()
   * @model containment="true"
   * @generated
   */
  Interval getRange();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kivis.kivis.Domain#getRange <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range</em>' containment reference.
   * @see #getRange()
   * @generated
   */
  void setRange(Interval value);

  /**
   * Returns the value of the '<em><b>Current Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Current Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Current Value</em>' attribute.
   * @see #setCurrentValue(boolean)
   * @see de.cau.cs.kieler.kivis.kivis.KivisPackage#getDomain_CurrentValue()
   * @model
   * @generated
   */
  boolean isCurrentValue();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kivis.kivis.Domain#isCurrentValue <em>Current Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Current Value</em>' attribute.
   * @see #isCurrentValue()
   * @generated
   */
  void setCurrentValue(boolean value);

} // Domain
