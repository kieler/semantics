/**
 */
package de.cau.cs.kieler.core.kexpressions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.TypeGroup#getValuedObjects <em>Valued Objects</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.TypeGroup#getArrayCardinalities <em>Array Cardinalities</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.TypeGroup#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getTypeGroup()
 * @model
 * @generated
 */
public interface TypeGroup extends EObject {
    /**
     * Returns the value of the '<em><b>Valued Objects</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.core.kexpressions.ValuedObject}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Valued Objects</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Valued Objects</em>' containment reference list.
     * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getTypeGroup_ValuedObjects()
     * @model containment="true"
     * @generated
     */
    EList<ValuedObject> getValuedObjects();

    /**
     * Returns the value of the '<em><b>Array Cardinalities</b></em>' attribute list.
     * The list contents are of type {@link java.lang.Integer}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Array Cardinalities</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Array Cardinalities</em>' attribute list.
     * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getTypeGroup_ArrayCardinalities()
     * @model
     * @generated
     */
    EList<Integer> getArrayCardinalities();

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link de.cau.cs.kieler.core.kexpressions.ValueType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see de.cau.cs.kieler.core.kexpressions.ValueType
     * @see #setType(ValueType)
     * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getTypeGroup_Type()
     * @model required="true"
     * @generated
     */
    ValueType getType();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.TypeGroup#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see de.cau.cs.kieler.core.kexpressions.ValueType
     * @see #getType()
     * @generated
     */
    void setType(ValueType value);

} // TypeGroup
