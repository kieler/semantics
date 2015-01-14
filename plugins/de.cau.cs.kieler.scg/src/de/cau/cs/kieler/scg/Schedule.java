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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scg.Schedule#getScheduledBlocks <em>Scheduled Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scg.ScgPackage#getSchedule()
 * @model
 * @generated
 */
public interface Schedule extends EObject {
    /**
     * Returns the value of the '<em><b>Scheduled Blocks</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.scg.ScheduledBlock}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled Blocks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Scheduled Blocks</em>' containment reference list.
     * @see de.cau.cs.kieler.scg.ScgPackage#getSchedule_ScheduledBlocks()
     * @model containment="true"
     * @generated
     */
	EList<ScheduledBlock> getScheduledBlocks();

} // Schedule
