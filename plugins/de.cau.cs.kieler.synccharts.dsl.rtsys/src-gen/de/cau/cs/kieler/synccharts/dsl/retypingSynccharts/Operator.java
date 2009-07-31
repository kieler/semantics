/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.dsl.retypingSynccharts;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Operator#getOperatorKind <em>Operator Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getOperator()
 * @model
 * @generated
 */
public interface Operator extends EObject
{
  /**
   * Returns the value of the '<em><b>Operator Kind</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.OperatorKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator Kind</em>' attribute.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.OperatorKind
   * @see #setOperatorKind(OperatorKind)
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getOperator_OperatorKind()
   * @model
   * @generated
   */
  OperatorKind getOperatorKind();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Operator#getOperatorKind <em>Operator Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator Kind</em>' attribute.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.OperatorKind
   * @see #getOperatorKind()
   * @generated
   */
  void setOperatorKind(OperatorKind value);

} // Operator
