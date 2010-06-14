/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.s.s;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.s.s.PrimitiveSignal#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.s.s.SPackage#getPrimitiveSignal()
 * @model
 * @generated
 */
public interface PrimitiveSignal extends SignalType
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.kieler.s.s.PrimitiveSignalType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see de.cau.cs.kieler.s.s.PrimitiveSignalType
   * @see #setType(PrimitiveSignalType)
   * @see de.cau.cs.kieler.s.s.SPackage#getPrimitiveSignal_Type()
   * @model
   * @generated
   */
  PrimitiveSignalType getType();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.s.s.PrimitiveSignal#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see de.cau.cs.kieler.s.s.PrimitiveSignalType
   * @see #getType()
   * @generated
   */
  void setType(PrimitiveSignalType value);

} // PrimitiveSignal
