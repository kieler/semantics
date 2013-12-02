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
package de.cau.cs.kieler.scgsched;

import de.cau.cs.kieler.scgbb.SCGraphBB;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SC Graph Sched</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgsched.SCGraphSched#isUnschedulable <em>Unschedulable</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgsched.SCGraphSched#getSchedules <em>Schedules</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgsched.SCGraphSched#getProblems <em>Problems</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scgsched.ScgschedPackage#getSCGraphSched()
 * @model
 * @generated
 */
public interface SCGraphSched extends SCGraphBB {
    /**
	 * Returns the value of the '<em><b>Unschedulable</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unschedulable</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Unschedulable</em>' attribute.
	 * @see #setUnschedulable(boolean)
	 * @see de.cau.cs.kieler.scgsched.ScgschedPackage#getSCGraphSched_Unschedulable()
	 * @model
	 * @generated
	 */
    boolean isUnschedulable();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.scgsched.SCGraphSched#isUnschedulable <em>Unschedulable</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unschedulable</em>' attribute.
	 * @see #isUnschedulable()
	 * @generated
	 */
    void setUnschedulable(boolean value);

    /**
	 * Returns the value of the '<em><b>Schedules</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.scgsched.Schedule}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Schedules</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedules</em>' containment reference list.
	 * @see de.cau.cs.kieler.scgsched.ScgschedPackage#getSCGraphSched_Schedules()
	 * @model containment="true"
	 * @generated
	 */
    EList<Schedule> getSchedules();

				/**
	 * Returns the value of the '<em><b>Problems</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.scgsched.Problem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Problems</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problems</em>' containment reference list.
	 * @see de.cau.cs.kieler.scgsched.ScgschedPackage#getSCGraphSched_Problems()
	 * @model containment="true"
	 * @generated
	 */
	EList<Problem> getProblems();

} // SCGraphSched
