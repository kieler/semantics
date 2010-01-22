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
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.Variable#getValue <em>Value</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Variable#getParentRegion <em>Parent Region</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends ValuedObject {
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
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getVariable_Value()
     * @model containment="true" required="true"
     * @generated
     */
	EObject getValue();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Variable#getValue <em>Value</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' containment reference.
     * @see #getValue()
     * @generated
     */
	void setValue(EObject value);

	/**
     * Returns the value of the '<em><b>Parent Region</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.Region#getVariables <em>Variables</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Region</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Region</em>' container reference.
     * @see #setParentRegion(Region)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getVariable_ParentRegion()
     * @see de.cau.cs.kieler.synccharts.Region#getVariables
     * @model opposite="variables" transient="false"
     * @generated
     */
	Region getParentRegion();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Variable#getParentRegion <em>Parent Region</em>}' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Region</em>' container reference.
     * @see #getParentRegion()
     * @generated
     */
	void setParentRegion(Region value);

} // Variable
