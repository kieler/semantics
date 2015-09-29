/**
 */
package de.cau.cs.kieler.scl.scl;

import de.cau.cs.kieler.core.annotations.Annotatable;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scl.scl.StatementSequence#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scl.scl.SclPackage#getStatementSequence()
 * @model
 * @generated
 */
public interface StatementSequence extends Annotatable
{
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
     * @see de.cau.cs.kieler.scl.scl.SclPackage#getStatementSequence_Statements()
     * @model containment="true"
     * @generated
     */
  EList<Statement> getStatements();

} // StatementSequence
