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
 * A representation of the model object '<em><b>Signal Renaming</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.SignalRenaming#getOldSignal <em>Old Signal</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.SignalRenaming#getNewSignal <em>New Signal</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.SignalRenaming#getParentState <em>Parent State</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getSignalRenaming()
 * @model
 * @generated
 */
public interface SignalRenaming extends EObject {
	/**
     * Returns the value of the '<em><b>Old Signal</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Signal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Old Signal</em>' reference.
     * @see #setOldSignal(Signal)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getSignalRenaming_OldSignal()
     * @model required="true"
     * @generated
     */
	Signal getOldSignal();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.SignalRenaming#getOldSignal <em>Old Signal</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Old Signal</em>' reference.
     * @see #getOldSignal()
     * @generated
     */
	void setOldSignal(Signal value);

	/**
     * Returns the value of the '<em><b>New Signal</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Signal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>New Signal</em>' reference.
     * @see #setNewSignal(Signal)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getSignalRenaming_NewSignal()
     * @model required="true"
     * @generated
     */
	Signal getNewSignal();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.SignalRenaming#getNewSignal <em>New Signal</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>New Signal</em>' reference.
     * @see #getNewSignal()
     * @generated
     */
	void setNewSignal(Signal value);

	/**
     * Returns the value of the '<em><b>Parent State</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.State#getSignalRenamings <em>Signal Renamings</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent State</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Parent State</em>' container reference.
     * @see #setParentState(State)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getSignalRenaming_ParentState()
     * @see de.cau.cs.kieler.synccharts.State#getSignalRenamings
     * @model opposite="signalRenamings" required="true" transient="false"
     * @generated
     */
	State getParentState();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.SignalRenaming#getParentState <em>Parent State</em>}' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent State</em>' container reference.
     * @see #getParentState()
     * @generated
     */
	void setParentState(State value);

} // SignalRenaming
