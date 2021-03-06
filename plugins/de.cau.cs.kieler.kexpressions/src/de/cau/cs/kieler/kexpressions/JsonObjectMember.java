/**
 */
package de.cau.cs.kieler.kexpressions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Object Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.JsonObjectMember#getKey <em>Key</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.JsonObjectMember#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getJsonObjectMember()
 * @model
 * @generated
 */
public interface JsonObjectMember extends EObject {
    /**
     * Returns the value of the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Key</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Key</em>' attribute.
     * @see #setKey(String)
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getJsonObjectMember_Key()
     * @model
     * @generated
     */
    String getKey();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.JsonObjectMember#getKey <em>Key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Key</em>' attribute.
     * @see #getKey()
     * @generated
     */
    void setKey(String value);

    /**
     * Returns the value of the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' containment reference.
     * @see #setValue(Value)
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getJsonObjectMember_Value()
     * @model containment="true"
     * @generated
     */
    Value getValue();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.JsonObjectMember#getValue <em>Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' containment reference.
     * @see #getValue()
     * @generated
     */
    void setValue(Value value);

} // JsonObjectMember
