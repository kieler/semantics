/**
 */
package de.cau.cs.kieler.scl;

import de.cau.cs.kieler.kexpressions.MethodDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Implementation Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scl.MethodImplementationDeclaration#isImplemented <em>Implemented</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.scl.SCLPackage#getMethodImplementationDeclaration()
 * @model
 * @generated
 */
public interface MethodImplementationDeclaration extends MethodDeclaration, Scope {

    /**
     * Returns the value of the '<em><b>Implemented</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Implemented</em>' attribute.
     * @see #setImplemented(boolean)
     * @see de.cau.cs.kieler.scl.SCLPackage#getMethodImplementationDeclaration_Implemented()
     * @model required="true"
     * @generated
     */
    boolean isImplemented();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scl.MethodImplementationDeclaration#isImplemented <em>Implemented</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Implemented</em>' attribute.
     * @see #isImplemented()
     * @generated
     */
    void setImplemented(boolean value);
} // MethodImplementationDeclaration
