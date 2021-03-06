/**
 */
package de.cau.cs.kieler.esterel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Renaming</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.TaskRenaming#getNewName <em>New Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.TaskRenaming#getOldName <em>Old Name</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getTaskRenaming()
 * @model
 * @generated
 */
public interface TaskRenaming extends Renaming {
    /**
     * Returns the value of the '<em><b>New Name</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>New Name</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>New Name</em>' reference.
     * @see #setNewName(Task)
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getTaskRenaming_NewName()
     * @model
     * @generated
     */
    Task getNewName();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.TaskRenaming#getNewName <em>New Name</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>New Name</em>' reference.
     * @see #getNewName()
     * @generated
     */
    void setNewName(Task value);

    /**
     * Returns the value of the '<em><b>Old Name</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Old Name</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Old Name</em>' reference.
     * @see #setOldName(Task)
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getTaskRenaming_OldName()
     * @model
     * @generated
     */
    Task getOldName();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.TaskRenaming#getOldName <em>Old Name</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Old Name</em>' reference.
     * @see #getOldName()
     * @generated
     */
    void setOldName(Task value);

} // TaskRenaming
