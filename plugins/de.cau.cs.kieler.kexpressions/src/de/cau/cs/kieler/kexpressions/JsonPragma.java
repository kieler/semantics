/**
 */
package de.cau.cs.kieler.kexpressions;

import de.cau.cs.kieler.annotations.Pragma;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Pragma</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.JsonPragma#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getJsonPragma()
 * @model
 * @generated
 */
public interface JsonPragma extends Pragma {
    /**
     * Returns the value of the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' containment reference.
     * @see #setValue(JsonObjectValue)
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getJsonPragma_Value()
     * @model containment="true"
     * @generated
     */
    JsonObjectValue getValue();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.JsonPragma#getValue <em>Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' containment reference.
     * @see #getValue()
     * @generated
     */
    void setValue(JsonObjectValue value);

} // JsonPragma
