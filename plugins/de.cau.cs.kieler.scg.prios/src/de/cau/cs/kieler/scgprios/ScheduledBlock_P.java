/**
 */
package de.cau.cs.kieler.scgprios;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduled Block P</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgprios.ScheduledBlock_P#getSchedulingBlock <em>Scheduling Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.ScheduledBlock_P#isSchizophrenic <em>Schizophrenic</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getScheduledBlock_P()
 * @model
 * @generated
 */
public interface ScheduledBlock_P extends EObject {
    /**
     * Returns the value of the '<em><b>Scheduling Block</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scheduling Block</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scheduling Block</em>' reference.
     * @see #setSchedulingBlock(SchedulingBlock_P)
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getScheduledBlock_P_SchedulingBlock()
     * @model
     * @generated
     */
    SchedulingBlock_P getSchedulingBlock();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scgprios.ScheduledBlock_P#getSchedulingBlock <em>Scheduling Block</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Scheduling Block</em>' reference.
     * @see #getSchedulingBlock()
     * @generated
     */
    void setSchedulingBlock(SchedulingBlock_P value);

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
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getScheduledBlock_P_Schizophrenic()
     * @model
     * @generated
     */
    boolean isSchizophrenic();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scgprios.ScheduledBlock_P#isSchizophrenic <em>Schizophrenic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Schizophrenic</em>' attribute.
     * @see #isSchizophrenic()
     * @generated
     */
    void setSchizophrenic(boolean value);

} // ScheduledBlock_P
