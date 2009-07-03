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
 * A representation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.Signal#getValue <em>Value</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Signal#getParentState <em>Parent State</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Signal#isIsLocal <em>Is Local</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Signal#isIsInput <em>Is Input</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Signal#isIsOutput <em>Is Output</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Signal#getCombineType <em>Combine Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getSignal()
 * @model
 * @generated
 */
public interface Signal extends ValuedObject {
	/**
     * Returns the value of the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' containment reference.
     * @see #setValue(EObject)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getSignal_Value()
     * @model containment="true"
     * @generated
     */
	EObject getValue();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Signal#getValue <em>Value</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' containment reference.
     * @see #getValue()
     * @generated
     */
	void setValue(EObject value);

	/**
     * Returns the value of the '<em><b>Parent State</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.State#getSignals <em>Signals</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent State</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Parent State</em>' container reference.
     * @see #setParentState(State)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getSignal_ParentState()
     * @see de.cau.cs.kieler.synccharts.State#getSignals
     * @model opposite="signals" required="true" transient="false"
     * @generated
     */
	State getParentState();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Signal#getParentState <em>Parent State</em>}' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent State</em>' container reference.
     * @see #getParentState()
     * @generated
     */
	void setParentState(State value);

	/**
     * Returns the value of the '<em><b>Is Local</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Local</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Is Local</em>' attribute.
     * @see #setIsLocal(boolean)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getSignal_IsLocal()
     * @model required="true"
     * @generated
     */
	boolean isIsLocal();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Signal#isIsLocal <em>Is Local</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Local</em>' attribute.
     * @see #isIsLocal()
     * @generated
     */
	void setIsLocal(boolean value);

	/**
     * Returns the value of the '<em><b>Is Input</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Input</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Is Input</em>' attribute.
     * @see #setIsInput(boolean)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getSignal_IsInput()
     * @model required="true"
     * @generated
     */
	boolean isIsInput();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Signal#isIsInput <em>Is Input</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Input</em>' attribute.
     * @see #isIsInput()
     * @generated
     */
	void setIsInput(boolean value);

	/**
     * Returns the value of the '<em><b>Is Output</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Output</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Is Output</em>' attribute.
     * @see #setIsOutput(boolean)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getSignal_IsOutput()
     * @model required="true"
     * @generated
     */
	boolean isIsOutput();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Signal#isIsOutput <em>Is Output</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Output</em>' attribute.
     * @see #isIsOutput()
     * @generated
     */
	void setIsOutput(boolean value);

	/**
     * Returns the value of the '<em><b>Combine Type</b></em>' attribute.
     * The literals are from the enumeration {@link de.cau.cs.kieler.synccharts.CombineType}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Combine Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Combine Type</em>' attribute.
     * @see de.cau.cs.kieler.synccharts.CombineType
     * @see #setCombineType(CombineType)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getSignal_CombineType()
     * @model required="true"
     * @generated
     */
	CombineType getCombineType();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Signal#getCombineType <em>Combine Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Combine Type</em>' attribute.
     * @see de.cau.cs.kieler.synccharts.CombineType
     * @see #getCombineType()
     * @generated
     */
	void setCombineType(CombineType value);

} // Signal
