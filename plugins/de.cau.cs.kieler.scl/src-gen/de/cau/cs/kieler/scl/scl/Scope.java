/**
 */
package de.cau.cs.kieler.scl.scl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scl.scl.Scope#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scl.scl.SclPackage#getScope()
 * @model
 * @generated
 */
public interface Scope extends org.yakindu.sct.model.sgraph.Scope
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
   * @see de.cau.cs.kieler.scl.scl.SclPackage#getScope_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

} // Scope
