/**
 */
package de.cau.cs.kieler.kexpressions;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedulable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.Schedulable#getSchedule <em>Schedule</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getSchedulable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Schedulable extends EObject {
    /**
     * Returns the value of the '<em><b>Schedule</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kexpressions.ScheduleObjectReference}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Schedule</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Schedule</em>' containment reference list.
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getSchedulable_Schedule()
     * @model containment="true"
     * @generated
     */
    EList<ScheduleObjectReference> getSchedule();

} // Schedulable
