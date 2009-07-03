/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.Operator#getOperatorKind <em>Operator Kind</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Operator#getParentExpression <em>Parent Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getOperator()
 * @model
 * @generated
 */
public interface Operator extends EObject {
	/**
	 * Returns the value of the '<em><b>Operator Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link de.cau.cs.kieler.synccharts.OperatorKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator Kind</em>' attribute.
	 * @see de.cau.cs.kieler.synccharts.OperatorKind
	 * @see #setOperatorKind(OperatorKind)
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getOperator_OperatorKind()
	 * @model required="true"
	 * @generated
	 */
	OperatorKind getOperatorKind();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Operator#getOperatorKind <em>Operator Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator Kind</em>' attribute.
	 * @see de.cau.cs.kieler.synccharts.OperatorKind
	 * @see #getOperatorKind()
	 * @generated
	 */
	void setOperatorKind(OperatorKind value);

	/**
	 * Returns the value of the '<em><b>Parent Expression</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.ComplexExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Expression</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Expression</em>' container reference.
	 * @see #setParentExpression(ComplexExpression)
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getOperator_ParentExpression()
	 * @see de.cau.cs.kieler.synccharts.ComplexExpression#getOperator
	 * @model opposite="operator" required="true" transient="false"
	 * @generated
	 */
	ComplexExpression getParentExpression();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Operator#getParentExpression <em>Parent Expression</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Expression</em>' container reference.
	 * @see #getParentExpression()
	 * @generated
	 */
	void setParentExpression(ComplexExpression value);

} // Operator
