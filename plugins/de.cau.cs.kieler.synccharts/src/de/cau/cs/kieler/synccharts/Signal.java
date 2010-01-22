/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
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
 *   <li>{@link de.cau.cs.kieler.synccharts.Signal#isIsInput <em>Is Input</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Signal#isIsOutput <em>Is Output</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Signal#getCombineOperator <em>Combine Operator</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Signal#getHostCombineOperator <em>Host Combine Operator</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Signal#getParentRegion <em>Parent Region</em>}</li>
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
     * @model opposite="signals" transient="false"
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
     * Returns the value of the '<em><b>Combine Operator</b></em>' attribute.
     * The literals are from the enumeration {@link de.cau.cs.kieler.synccharts.CombineOperator}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Combine Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Combine Operator</em>' attribute.
     * @see de.cau.cs.kieler.synccharts.CombineOperator
     * @see #setCombineOperator(CombineOperator)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getSignal_CombineOperator()
     * @model required="true"
     * @generated
     */
	CombineOperator getCombineOperator();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Signal#getCombineOperator <em>Combine Operator</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Combine Operator</em>' attribute.
     * @see de.cau.cs.kieler.synccharts.CombineOperator
     * @see #getCombineOperator()
     * @generated
     */
	void setCombineOperator(CombineOperator value);

	/**
     * Returns the value of the '<em><b>Host Combine Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Combine Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Host Combine Operator</em>' attribute.
     * @see #setHostCombineOperator(String)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getSignal_HostCombineOperator()
     * @model
     * @generated
     */
	String getHostCombineOperator();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Signal#getHostCombineOperator <em>Host Combine Operator</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Host Combine Operator</em>' attribute.
     * @see #getHostCombineOperator()
     * @generated
     */
	void setHostCombineOperator(String value);

	/**
     * Returns the value of the '<em><b>Parent Region</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.Region#getSignals <em>Signals</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Region</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Region</em>' container reference.
     * @see #setParentRegion(Region)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getSignal_ParentRegion()
     * @see de.cau.cs.kieler.synccharts.Region#getSignals
     * @model opposite="signals" transient="false"
     * @generated
     */
	Region getParentRegion();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Signal#getParentRegion <em>Parent Region</em>}' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Region</em>' container reference.
     * @see #getParentRegion()
     * @generated
     */
	void setParentRegion(Region value);

} // Signal
