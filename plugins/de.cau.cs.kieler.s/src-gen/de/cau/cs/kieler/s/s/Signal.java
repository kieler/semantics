/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.s.s;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.s.s.Signal#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.s.s.Signal#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.s.s.Signal#getCombineFunction <em>Combine Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.s.s.SPackage#getSignal()
 * @model
 * @generated
 */
public interface Signal extends Annotatable
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.cau.cs.kieler.s.s.SPackage#getSignal_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.s.s.Signal#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(SignalType)
   * @see de.cau.cs.kieler.s.s.SPackage#getSignal_Type()
   * @model containment="true"
   * @generated
   */
  SignalType getType();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.s.s.Signal#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(SignalType value);

  /**
   * Returns the value of the '<em><b>Combine Function</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Combine Function</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Combine Function</em>' reference.
   * @see #setCombineFunction(CombineFunction)
   * @see de.cau.cs.kieler.s.s.SPackage#getSignal_CombineFunction()
   * @model
   * @generated
   */
  CombineFunction getCombineFunction();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.s.s.Signal#getCombineFunction <em>Combine Function</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Combine Function</em>' reference.
   * @see #getCombineFunction()
   * @generated
   */
  void setCombineFunction(CombineFunction value);

} // Signal
