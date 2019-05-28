/**
 */
package de.cau.cs.kieler.kexpressions.kext;

import de.cau.cs.kieler.annotations.NamedObject;

import de.cau.cs.kieler.kexpressions.VariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.kext.ClassDeclaration#isHost <em>Host</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kexpressions.kext.KExtPackage#getClassDeclaration()
 * @model
 * @generated
 */
public interface ClassDeclaration extends DeclarationScope, VariableDeclaration, NamedObject {
    /**
     * Returns the value of the '<em><b>Host</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Host</em>' attribute.
     * @see #setHost(boolean)
     * @see de.cau.cs.kieler.kexpressions.kext.KExtPackage#getClassDeclaration_Host()
     * @model
     * @generated
     */
    boolean isHost();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.kext.ClassDeclaration#isHost <em>Host</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Host</em>' attribute.
     * @see #isHost()
     * @generated
     */
    void setHost(boolean value);

} // ClassDeclaration
