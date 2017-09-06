/**
 */
package de.cau.cs.kieler.esterel;

import de.cau.cs.kieler.scl.Statement;
import de.cau.cs.kieler.scl.StatementContainer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.LocalVariable#getVarDecls <em>Var Decls</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getLocalVariable()
 * @model
 * @generated
 */
public interface LocalVariable extends StatementContainer, Statement
{
  /**
   * Returns the value of the '<em><b>Var Decls</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.VariableDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Decls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Decls</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getLocalVariable_VarDecls()
   * @model containment="true"
   * @generated
   */
  EList<VariableDecl> getVarDecls();

} // LocalVariable
