/**
 */
package de.cau.cs.kieler.kexpressions;

import de.cau.cs.kieler.annotations.Annotatable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extern String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.ExternString#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getExternString()
 * @model
 * @generated
 */
public interface ExternString extends Annotatable {
    /**
     * Returns the value of the '<em><b>Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Code</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Code</em>' attribute.
     * @see #setCode(String)
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getExternString_Code()
     * @model
     * @generated
     */
    String getCode();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.ExternString#getCode <em>Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Code</em>' attribute.
     * @see #getCode()
     * @generated
     */
    void setCode(String value);

} // ExternString
