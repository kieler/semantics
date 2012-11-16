/**
 */
package de.cau.kieler.scc.model.scctext.sccexp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Suspend Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.kieler.scc.model.scctext.sccexp.SuspendDeclaration#getSuspendDeclaration <em>Suspend Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.kieler.scc.model.scctext.sccexp.SccexpPackage#getSuspendDeclaration()
 * @model
 * @generated
 */
public interface SuspendDeclaration extends InterfaceScope
{
  /**
   * Returns the value of the '<em><b>Suspend Declaration</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.kieler.scc.model.scctext.sccexp.SuspendVariableDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Suspend Declaration</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Suspend Declaration</em>' containment reference list.
   * @see de.cau.kieler.scc.model.scctext.sccexp.SccexpPackage#getSuspendDeclaration_SuspendDeclaration()
   * @model containment="true"
   * @generated
   */
  EList<SuspendVariableDeclaration> getSuspendDeclaration();

} // SuspendDeclaration
