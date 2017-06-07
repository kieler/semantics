/**
 */
package de.cau.cs.kieler.kvis;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kvis.VariableDomain#getValue <em>Value</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kvis.VariableDomain#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kvis.KvisPackage#getVariableDomain()
 * @model
 * @generated
 */
public interface VariableDomain extends AttributeDomain
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see de.cau.cs.kieler.kvis.KvisPackage#getVariableDomain_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kvis.VariableDomain#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

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
   * @see de.cau.cs.kieler.kvis.KvisPackage#getVariableDomain_Range()
   * @model containment="true"
   * @generated
   */
  Interval getRange();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kvis.VariableDomain#getRange <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range</em>' containment reference.
   * @see #getRange()
   * @generated
   */
  void setRange(Interval value);

} // VariableDomain
