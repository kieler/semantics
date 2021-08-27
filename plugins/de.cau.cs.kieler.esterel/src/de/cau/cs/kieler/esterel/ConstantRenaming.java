/**
 */
package de.cau.cs.kieler.esterel;

import de.cau.cs.kieler.kexpressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Renaming</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.ConstantRenaming#getNewName <em>New Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.ConstantRenaming#getNewValue <em>New Value</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.ConstantRenaming#getOldName <em>Old Name</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getConstantRenaming()
 * @model
 * @generated
 */
public interface ConstantRenaming extends Renaming {
    /**
     * Returns the value of the '<em><b>New Name</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>New Name</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>New Name</em>' reference.
     * @see #setNewName(Constant)
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getConstantRenaming_NewName()
     * @model
     * @generated
     */
    Constant getNewName();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.ConstantRenaming#getNewName <em>New Name</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>New Name</em>' reference.
     * @see #getNewName()
     * @generated
     */
    void setNewName(Constant value);

    /**
     * Returns the value of the '<em><b>New Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>New Value</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>New Value</em>' containment reference.
     * @see #setNewValue(Expression)
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getConstantRenaming_NewValue()
     * @model containment="true"
     * @generated
     */
    Expression getNewValue();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.ConstantRenaming#getNewValue <em>New Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>New Value</em>' containment reference.
     * @see #getNewValue()
     * @generated
     */
    void setNewValue(Expression value);

    /**
     * Returns the value of the '<em><b>Old Name</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Old Name</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Old Name</em>' reference.
     * @see #setOldName(Constant)
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getConstantRenaming_OldName()
     * @model
     * @generated
     */
    Constant getOldName();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.ConstantRenaming#getOldName <em>Old Name</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Old Name</em>' reference.
     * @see #getOldName()
     * @generated
     */
    void setOldName(Constant value);

} // ConstantRenaming
