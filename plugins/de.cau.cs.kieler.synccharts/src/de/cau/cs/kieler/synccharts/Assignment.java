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
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.Assignment#getVariable <em>Variable</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Assignment#getParentAction <em>Parent Action</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Assignment#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends EObject {
	/**
     * Returns the value of the '<em><b>Variable</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Variable</em>' reference.
     * @see #setVariable(Variable)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getAssignment_Variable()
     * @model required="true"
     * @generated
     */
	Variable getVariable();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Assignment#getVariable <em>Variable</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Variable</em>' reference.
     * @see #getVariable()
     * @generated
     */
	void setVariable(Variable value);

	/**
     * Returns the value of the '<em><b>Parent Action</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.Action#getAssignments <em>Assignments</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Action</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Action</em>' container reference.
     * @see #setParentAction(Action)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getAssignment_ParentAction()
     * @see de.cau.cs.kieler.synccharts.Action#getAssignments
     * @model opposite="assignments" transient="false"
     * @generated
     */
	Action getParentAction();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Assignment#getParentAction <em>Parent Action</em>}' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Action</em>' container reference.
     * @see #getParentAction()
     * @generated
     */
	void setParentAction(Action value);

	/**
     * Returns the value of the '<em><b>Expression</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.Expression#getParentAssignment <em>Parent Assignment</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Expression</em>' containment reference.
     * @see #setExpression(Expression)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getAssignment_Expression()
     * @see de.cau.cs.kieler.synccharts.Expression#getParentAssignment
     * @model opposite="parentAssignment" containment="true" required="true"
     * @generated
     */
	Expression getExpression();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Assignment#getExpression <em>Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression</em>' containment reference.
     * @see #getExpression()
     * @generated
     */
	void setExpression(Expression value);

} // Assignment
