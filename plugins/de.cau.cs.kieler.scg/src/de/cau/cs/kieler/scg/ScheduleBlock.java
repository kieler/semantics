/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scg.ScheduleBlock#getSchedulingBlock <em>Scheduling Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.ScheduleBlock#getAdditionalGuards <em>Additional Guards</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scg.ScgPackage#getScheduleBlock()
 * @model
 * @generated
 */
public interface ScheduleBlock extends EObject {
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
	 * @see de.cau.cs.kieler.scg.ScgPackage#getScheduleBlock_SchedulingBlock()
	 * @model
	 * @generated
	 */
	SchedulingBlock getSchedulingBlock();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.scg.ScheduleBlock#getSchedulingBlock <em>Scheduling Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduling Block</em>' reference.
	 * @see #getSchedulingBlock()
	 * @generated
	 */
	void setSchedulingBlock(SchedulingBlock value);

	/**
	 * Returns the value of the '<em><b>Additional Guards</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.scg.Guard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Guards</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Guards</em>' reference list.
	 * @see de.cau.cs.kieler.scg.ScgPackage#getScheduleBlock_AdditionalGuards()
	 * @model
	 * @generated
	 */
	EList<Guard> getAdditionalGuards();

} // ScheduleBlock
