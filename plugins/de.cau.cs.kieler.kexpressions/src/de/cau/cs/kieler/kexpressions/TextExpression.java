/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.kexpressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A TextExpression is an Expression containing arbitrary text. It is used to
 * escape to a host language such as C or Java. This way arbitrary host code
 * can be used as parameters for operators, other functions or values.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.TextExpression#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getTextExpression()
 * @model
 * @generated
 */
public interface TextExpression extends Expression {

    /**
     * Returns the value of the '<em><b>Text</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Text</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Text</em>' attribute.
     * @see #setText(String)
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getTextExpression_Text()
     * @model
     * @generated
     */
    String getText();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.TextExpression#getText <em>Text</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Text</em>' attribute.
     * @see #getText()
     * @generated
     */
    void setText(String value);
} // TextExpression
