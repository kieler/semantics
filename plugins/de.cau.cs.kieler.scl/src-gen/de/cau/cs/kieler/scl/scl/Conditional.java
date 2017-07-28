/**
 */
package de.cau.cs.kieler.scl.scl;

import org.eclipse.emf.common.util.EList;

import de.cau.cs.kieler.kexpressions.Declaration;
import de.cau.cs.kieler.kexpressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scl.scl.Conditional#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scl.scl.Conditional#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scl.scl.Conditional#getElseStatements <em>Else Statements</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.scl.scl.SclPackage#getConditional()
 * @model
 * @generated
 */
public interface Conditional extends StatementSequence, Instruction {
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
     * @see de.cau.cs.kieler.scl.scl.SclPackage#getConditional_Expression()
     * @model containment="true"
     * @generated
     */
    Expression getExpression();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scl.scl.Conditional#getExpression <em>Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression</em>' containment reference.
     * @see #getExpression()
     * @generated
     */
    void setExpression(Expression value);

    /**
     * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kexpressions.Declaration}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Declarations</em>' containment reference list.
     * @see de.cau.cs.kieler.scl.scl.SclPackage#getConditional_Declarations()
     * @model containment="true"
     * @generated
     */
    EList<Declaration> getDeclarations();

    /**
     * Returns the value of the '<em><b>Else Statements</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.scl.scl.Statement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Else Statements</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Else Statements</em>' containment reference list.
     * @see de.cau.cs.kieler.scl.scl.SclPackage#getConditional_ElseStatements()
     * @model containment="true"
     * @generated
     */
    EList<Statement> getElseStatements();

} // Conditional
