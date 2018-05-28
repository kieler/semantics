/**
 */
package de.cau.cs.kieler.kexpressions;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Object Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.JsonObjectValue#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getJsonObjectValue()
 * @model
 * @generated
 */
public interface JsonObjectValue extends Value {
    /**
     * Returns the value of the '<em><b>Members</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kexpressions.JsonObjectMember}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Members</em>' containment reference list.
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getJsonObjectValue_Members()
     * @model containment="true"
     * @generated
     */
    EList<JsonObjectMember> getMembers();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" required="true"
     * @generated
     */
    Map<String, Value> getMembersMap();

} // JsonObjectValue
