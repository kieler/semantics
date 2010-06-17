/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.s.s;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Signal Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.s.s.PrimitiveSignalType#getPrimitiveType <em>Primitive Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.s.s.SPackage#getPrimitiveSignalType()
 * @model
 * @generated
 */
public interface PrimitiveSignalType extends SignalType
{
  /**
   * Returns the value of the '<em><b>Primitive Type</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.kieler.s.s.PrimitiveType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primitive Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primitive Type</em>' attribute.
   * @see de.cau.cs.kieler.s.s.PrimitiveType
   * @see #setPrimitiveType(PrimitiveType)
   * @see de.cau.cs.kieler.s.s.SPackage#getPrimitiveSignalType_PrimitiveType()
   * @model
   * @generated
   */
  PrimitiveType getPrimitiveType();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.s.s.PrimitiveSignalType#getPrimitiveType <em>Primitive Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primitive Type</em>' attribute.
   * @see de.cau.cs.kieler.s.s.PrimitiveType
   * @see #getPrimitiveType()
   * @generated
   */
  void setPrimitiveType(PrimitiveType value);

} // PrimitiveSignalType
