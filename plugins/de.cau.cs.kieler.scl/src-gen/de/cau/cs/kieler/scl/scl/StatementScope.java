/**
 */
package de.cau.cs.kieler.scl.scl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scl.scl.StatementScope#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scl.scl.StatementScope#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scl.scl.SclPackage#getStatementScope()
 * @model
 * @generated
 */
public interface StatementScope extends Instruction
{
  /**
   * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.scl.scl.VariableDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarations</em>' containment reference list.
   * @see de.cau.cs.kieler.scl.scl.SclPackage#getStatementScope_Declarations()
   * @model containment="true"
   * @generated
   */
  EList<VariableDeclaration> getDeclarations();

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.scl.scl.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see de.cau.cs.kieler.scl.scl.SclPackage#getStatementScope_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

} // StatementScope
