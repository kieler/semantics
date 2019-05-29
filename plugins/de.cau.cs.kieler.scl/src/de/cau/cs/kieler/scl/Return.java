/**
 */
package de.cau.cs.kieler.scl;

import de.cau.cs.kieler.kexpressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scl.Return#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.scl.SCLPackage#getReturn()
 * @model
 * @generated
 */
public interface Return extends Statement {
    /**
     * Returns the value of the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Expression</em>' containment reference.
     * @see #setExpression(Expression)
     * @see de.cau.cs.kieler.scl.SCLPackage#getReturn_Expression()
     * @model containment="true" required="true"
     * @generated
     */
    Expression getExpression();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scl.Return#getExpression <em>Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression</em>' containment reference.
     * @see #getExpression()
     * @generated
     */
    void setExpression(Expression value);

} // Return
