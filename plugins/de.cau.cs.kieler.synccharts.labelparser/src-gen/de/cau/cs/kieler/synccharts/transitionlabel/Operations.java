/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.transitionlabel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.transitionlabel.Operations#getOperators <em>Operators</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.transitionlabel.TransitionlabelPackage#getOperations()
 * @model
 * @generated
 */
public interface Operations extends Expression
{
  /**
   * Returns the value of the '<em><b>Operators</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.kieler.synccharts.transitionlabel.OperatorKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operators</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operators</em>' attribute.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.OperatorKind
   * @see #setOperators(OperatorKind)
   * @see de.cau.cs.kieler.synccharts.transitionlabel.TransitionlabelPackage#getOperations_Operators()
   * @model
   * @generated
   */
  OperatorKind getOperators();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.transitionlabel.Operations#getOperators <em>Operators</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operators</em>' attribute.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.OperatorKind
   * @see #getOperators()
   * @generated
   */
  void setOperators(OperatorKind value);

} // Operations
