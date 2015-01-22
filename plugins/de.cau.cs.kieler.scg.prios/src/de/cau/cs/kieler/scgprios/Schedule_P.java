/**
 */
package de.cau.cs.kieler.scgprios;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule P</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgprios.Schedule_P#getScheduledBlocks <em>Scheduled Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getSchedule_P()
 * @model
 * @generated
 */
public interface Schedule_P extends EObject {
    /**
     * Returns the value of the '<em><b>Scheduled Blocks</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.scgprios.ScheduledBlock_P}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scheduled Blocks</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scheduled Blocks</em>' containment reference list.
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getSchedule_P_ScheduledBlocks()
     * @model containment="true"
     * @generated
     */
    EList<ScheduledBlock_P> getScheduledBlocks();

} // Schedule_P
