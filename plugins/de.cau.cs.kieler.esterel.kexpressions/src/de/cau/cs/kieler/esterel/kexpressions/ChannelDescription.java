/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.esterel.kexpressions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.kexpressions.ChannelDescription#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.kexpressions.ChannelDescription#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.kexpressions.KExpressionsPackage#getChannelDescription()
 * @model
 * @generated
 */
public interface ChannelDescription extends EObject {
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
     * @see de.cau.cs.kieler.esterel.kexpressions.KExpressionsPackage#getChannelDescription_Type()
     * @model containment="true"
     * @generated
     */
    TypeIdentifier getType();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.kexpressions.ChannelDescription#getType <em>Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' containment reference.
     * @see #getType()
     * @generated
     */
    void setType(TypeIdentifier value);

    /**
     * Returns the value of the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Expression</em>' containment reference.
     * @see #setExpression(Expression)
     * @see de.cau.cs.kieler.esterel.kexpressions.KExpressionsPackage#getChannelDescription_Expression()
     * @model containment="true"
     * @generated
     */
    Expression getExpression();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.kexpressions.ChannelDescription#getExpression <em>Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression</em>' containment reference.
     * @see #getExpression()
     * @generated
     */
    void setExpression(Expression value);

} // ChannelDescription
