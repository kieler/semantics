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
 * A representation of the model object '<em><b>Suspension Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.SuspensionTrigger#getParentState <em>Parent State</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.SuspensionTrigger#isImmediate <em>Immediate</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.SuspensionTrigger#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.SuspensionTrigger#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getSuspensionTrigger()
 * @model
 * @generated
 */
public interface SuspensionTrigger extends EObject {
	/**
     * Returns the value of the '<em><b>Parent State</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.State#getSuspensionTrigger <em>Suspension Trigger</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent State</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Parent State</em>' container reference.
     * @see #setParentState(State)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getSuspensionTrigger_ParentState()
     * @see de.cau.cs.kieler.synccharts.State#getSuspensionTrigger
     * @model opposite="suspensionTrigger" required="true" transient="false"
     * @generated
     */
	State getParentState();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.SuspensionTrigger#getParentState <em>Parent State</em>}' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent State</em>' container reference.
     * @see #getParentState()
     * @generated
     */
	void setParentState(State value);

	/**
     * Returns the value of the '<em><b>Immediate</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Immediate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Immediate</em>' attribute.
     * @see #setImmediate(boolean)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getSuspensionTrigger_Immediate()
     * @model required="true"
     * @generated
     */
	boolean isImmediate();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.SuspensionTrigger#isImmediate <em>Immediate</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Immediate</em>' attribute.
     * @see #isImmediate()
     * @generated
     */
	void setImmediate(boolean value);

	/**
     * Returns the value of the '<em><b>Trigger</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Trigger</em>' attribute.
     * @see #setTrigger(String)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getSuspensionTrigger_Trigger()
     * @model required="true"
     * @generated
     */
	String getTrigger();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.SuspensionTrigger#getTrigger <em>Trigger</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Trigger</em>' attribute.
     * @see #getTrigger()
     * @generated
     */
	void setTrigger(String value);

	/**
     * Returns the value of the '<em><b>Expression</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.Expression#getParentSuspensionTrigger <em>Parent Suspension Trigger</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Expression</em>' containment reference.
     * @see #setExpression(Expression)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getSuspensionTrigger_Expression()
     * @see de.cau.cs.kieler.synccharts.Expression#getParentSuspensionTrigger
     * @model opposite="parentSuspensionTrigger" containment="true" required="true"
     * @generated
     */
	Expression getExpression();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.SuspensionTrigger#getExpression <em>Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression</em>' containment reference.
     * @see #getExpression()
     * @generated
     */
	void setExpression(Expression value);

} // SuspensionTrigger
