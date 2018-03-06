/**
 */
package de.cau.cs.kieler.esterel;

import de.cau.cs.kieler.kexpressions.ValuedObjectReference;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Renaming</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.SignalRenaming#getNewName <em>New Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.SignalRenaming#getOldName <em>Old Name</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getSignalRenaming()
 * @model
 * @generated
 */
public interface SignalRenaming extends Renaming {
    /**
     * Returns the value of the '<em><b>New Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>New Name</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>New Name</em>' containment reference.
     * @see #setNewName(ValuedObjectReference)
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getSignalRenaming_NewName()
     * @model containment="true"
     * @generated
     */
    ValuedObjectReference getNewName();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.SignalRenaming#getNewName <em>New Name</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>New Name</em>' containment reference.
     * @see #getNewName()
     * @generated
     */
    void setNewName(ValuedObjectReference value);

    /**
     * Returns the value of the '<em><b>Old Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Old Name</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Old Name</em>' containment reference.
     * @see #setOldName(ValuedObjectReference)
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getSignalRenaming_OldName()
     * @model containment="true"
     * @generated
     */
    ValuedObjectReference getOldName();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.SignalRenaming#getOldName <em>Old Name</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Old Name</em>' containment reference.
     * @see #getOldName()
     * @generated
     */
    void setOldName(ValuedObjectReference value);

} // SignalRenaming
