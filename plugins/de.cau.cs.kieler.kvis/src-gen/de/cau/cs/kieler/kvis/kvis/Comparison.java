/**
 */
package de.cau.cs.kieler.kvis.kvis;

import de.cau.cs.kieler.kexpressions.OperatorType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kvis.kvis.Comparison#getLeft <em>Left</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kvis.kvis.Comparison#getRelation <em>Relation</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kvis.kvis.Comparison#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kvis.kvis.KvisPackage#getComparison()
 * @model
 * @generated
 */
public interface Comparison extends Condition
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(VariableReference)
   * @see de.cau.cs.kieler.kvis.kvis.KvisPackage#getComparison_Left()
   * @model containment="true"
   * @generated
   */
  VariableReference getLeft();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kvis.kvis.Comparison#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(VariableReference value);

  /**
   * Returns the value of the '<em><b>Relation</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.kieler.kexpressions.OperatorType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relation</em>' attribute.
   * @see de.cau.cs.kieler.kexpressions.OperatorType
   * @see #setRelation(OperatorType)
   * @see de.cau.cs.kieler.kvis.kvis.KvisPackage#getComparison_Relation()
   * @model
   * @generated
   */
  OperatorType getRelation();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kvis.kvis.Comparison#getRelation <em>Relation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relation</em>' attribute.
   * @see de.cau.cs.kieler.kexpressions.OperatorType
   * @see #getRelation()
   * @generated
   */
  void setRelation(OperatorType value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(EObject)
   * @see de.cau.cs.kieler.kvis.kvis.KvisPackage#getComparison_Right()
   * @model containment="true"
   * @generated
   */
  EObject getRight();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kvis.kvis.Comparison#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(EObject value);

} // Comparison
