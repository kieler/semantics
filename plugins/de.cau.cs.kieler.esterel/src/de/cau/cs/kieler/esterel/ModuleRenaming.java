/**
 */
package de.cau.cs.kieler.esterel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Renaming</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.ModuleRenaming#getModule <em>Module</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.ModuleRenaming#getNewName <em>New Name</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getModuleRenaming()
 * @model
 * @generated
 */
public interface ModuleRenaming extends EObject {
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
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getModuleRenaming_Module()
     * @model
     * @generated
     */
    de.cau.cs.kieler.scl.Module getModule();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.ModuleRenaming#getModule <em>Module</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Module</em>' reference.
     * @see #getModule()
     * @generated
     */
    void setModule(de.cau.cs.kieler.scl.Module value);

    /**
     * Returns the value of the '<em><b>New Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>New Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>New Name</em>' attribute.
     * @see #setNewName(String)
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getModuleRenaming_NewName()
     * @model
     * @generated
     */
    String getNewName();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.ModuleRenaming#getNewName <em>New Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>New Name</em>' attribute.
     * @see #getNewName()
     * @generated
     */
    void setNewName(String value);

} // ModuleRenaming
