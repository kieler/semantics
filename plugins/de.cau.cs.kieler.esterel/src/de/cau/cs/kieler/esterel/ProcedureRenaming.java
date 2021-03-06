/**
 */
package de.cau.cs.kieler.esterel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Renaming</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.ProcedureRenaming#getNewName <em>New Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.ProcedureRenaming#getOldName <em>Old Name</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getProcedureRenaming()
 * @model
 * @generated
 */
public interface ProcedureRenaming extends Renaming {
    /**
     * Returns the value of the '<em><b>New Name</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>New Name</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>New Name</em>' reference.
     * @see #setNewName(Procedure)
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getProcedureRenaming_NewName()
     * @model
     * @generated
     */
    Procedure getNewName();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.ProcedureRenaming#getNewName <em>New Name</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>New Name</em>' reference.
     * @see #getNewName()
     * @generated
     */
    void setNewName(Procedure value);

    /**
     * Returns the value of the '<em><b>Old Name</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Old Name</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Old Name</em>' reference.
     * @see #setOldName(Procedure)
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getProcedureRenaming_OldName()
     * @model
     * @generated
     */
    Procedure getOldName();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.ProcedureRenaming#getOldName <em>Old Name</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Old Name</em>' reference.
     * @see #getOldName()
     * @generated
     */
    void setOldName(Procedure value);

} // ProcedureRenaming
