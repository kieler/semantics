/**
 */
package de.cau.cs.kieler.kvis;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kvis.Expression#getLeftSide <em>Left Side</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kvis.Expression#getRelation <em>Relation</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kvis.Expression#getRightSide <em>Right Side</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kvis.KvisPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends BooleanExpression
{
  /**
   * Returns the value of the '<em><b>Left Side</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Side</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Side</em>' containment reference.
   * @see #setLeftSide(VariableReference)
   * @see de.cau.cs.kieler.kvis.KvisPackage#getExpression_LeftSide()
   * @model containment="true"
   * @generated
   */
  VariableReference getLeftSide();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kvis.Expression#getLeftSide <em>Left Side</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Side</em>' containment reference.
   * @see #getLeftSide()
   * @generated
   */
  void setLeftSide(VariableReference value);

  /**
   * Returns the value of the '<em><b>Relation</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.kieler.kvis.OperatorType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relation</em>' attribute.
   * @see de.cau.cs.kieler.kvis.OperatorType
   * @see #setRelation(OperatorType)
   * @see de.cau.cs.kieler.kvis.KvisPackage#getExpression_Relation()
   * @model
   * @generated
   */
  OperatorType getRelation();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kvis.Expression#getRelation <em>Relation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relation</em>' attribute.
   * @see de.cau.cs.kieler.kvis.OperatorType
   * @see #getRelation()
   * @generated
   */
  void setRelation(OperatorType value);

  /**
   * Returns the value of the '<em><b>Right Side</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Side</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Side</em>' containment reference.
   * @see #setRightSide(Operand)
   * @see de.cau.cs.kieler.kvis.KvisPackage#getExpression_RightSide()
   * @model containment="true"
   * @generated
   */
  Operand getRightSide();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kvis.Expression#getRightSide <em>Right Side</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Side</em>' containment reference.
   * @see #getRightSide()
   * @generated
   */
  void setRightSide(Operand value);

} // Expression
