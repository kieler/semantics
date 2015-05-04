/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduled Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scg.ScheduledBlock#getSchedulingBlock <em>Scheduling Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.ScheduledBlock#isSchizophrenic <em>Schizophrenic</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scg.ScgPackage#getScheduledBlock()
 * @model
 * @generated
 */
public interface ScheduledBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Scheduling Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduling Block</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduling Block</em>' reference.
	 * @see #setSchedulingBlock(SchedulingBlock)
	 * @see de.cau.cs.kieler.scg.ScgPackage#getScheduledBlock_SchedulingBlock()
	 * @model
	 * @generated
	 */
	SchedulingBlock getSchedulingBlock();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.scg.ScheduledBlock#getSchedulingBlock <em>Scheduling Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduling Block</em>' reference.
	 * @see #getSchedulingBlock()
	 * @generated
	 */
	void setSchedulingBlock(SchedulingBlock value);

	/**
	 * Returns the value of the '<em><b>Schizophrenic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schizophrenic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schizophrenic</em>' attribute.
	 * @see #setSchizophrenic(boolean)
	 * @see de.cau.cs.kieler.scg.ScgPackage#getScheduledBlock_Schizophrenic()
	 * @model
	 * @generated
	 */
	boolean isSchizophrenic();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.scg.ScheduledBlock#isSchizophrenic <em>Schizophrenic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schizophrenic</em>' attribute.
	 * @see #isSchizophrenic()
	 * @generated
	 */
	void setSchizophrenic(boolean value);

} // ScheduledBlock
