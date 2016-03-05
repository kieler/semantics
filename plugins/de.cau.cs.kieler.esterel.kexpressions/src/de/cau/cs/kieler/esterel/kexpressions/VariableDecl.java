/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.esterel.kexpressions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.kexpressions.VariableDecl#getVariables <em>Variables</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.kexpressions.VariableDecl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.kexpressions.KExpressionsPackage#getVariableDecl()
 * @model
 * @generated
 */
public interface VariableDecl extends EObject {
    /**
     * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.esterel.kexpressions.IVariable}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Variables</em>' containment reference list.
     * @see de.cau.cs.kieler.esterel.kexpressions.KExpressionsPackage#getVariableDecl_Variables()
     * @model containment="true"
     * @generated
     */
    EList<IVariable> getVariables();

    /**
     * Returns the value of the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' containment reference.
     * @see #setType(TypeIdentifier)
     * @see de.cau.cs.kieler.esterel.kexpressions.KExpressionsPackage#getVariableDecl_Type()
     * @model containment="true"
     * @generated
     */
    TypeIdentifier getType();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.kexpressions.VariableDecl#getType <em>Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' containment reference.
     * @see #getType()
     * @generated
     */
    void setType(TypeIdentifier value);

} // VariableDecl
