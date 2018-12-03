/**
 */
package de.cau.cs.kieler.scl;

import de.cau.cs.kieler.kexpressions.Call;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scl.ModuleCall#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.scl.SCLPackage#getModuleCall()
 * @model
 * @generated
 */
public interface ModuleCall extends Call, Statement {
    /**
     * Returns the value of the '<em><b>Module</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Module</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Module</em>' reference.
     * @see #setModule(de.cau.cs.kieler.scl.Module)
     * @see de.cau.cs.kieler.scl.SCLPackage#getModuleCall_Module()
     * @model required="true"
     * @generated
     */
    de.cau.cs.kieler.scl.Module getModule();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scl.ModuleCall#getModule <em>Module</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Module</em>' reference.
     * @see #getModule()
     * @generated
     */
    void setModule(de.cau.cs.kieler.scl.Module value);

} // ModuleCall
