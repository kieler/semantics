/**
 */
package de.cau.cs.kieler.kexpressions;

import de.cau.cs.kieler.annotations.NamedObject;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.GenericTypeReference#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.GenericTypeReference#getGenericParameters <em>Generic Parameters</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getGenericTypeReference()
 * @model
 * @generated
 */
public interface GenericTypeReference extends Expression {
    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(NamedObject)
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getGenericTypeReference_Type()
     * @model required="true"
     * @generated
     */
    NamedObject getType();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.GenericTypeReference#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(NamedObject value);

    /**
     * Returns the value of the '<em><b>Generic Parameters</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kexpressions.Parameter}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Generic Parameters</em>' containment reference list.
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getGenericTypeReference_GenericParameters()
     * @model containment="true"
     * @generated
     */
    EList<Parameter> getGenericParameters();

} // GenericTypeReference
