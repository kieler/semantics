/**
 */
package de.cau.kieler.scc.model.scctext.sccexp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exit Action Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.kieler.scc.model.scctext.sccexp.ExitActionDeclaration#getExitActionDeclaration <em>Exit Action Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.kieler.scc.model.scctext.sccexp.SccexpPackage#getExitActionDeclaration()
 * @model
 * @generated
 */
public interface ExitActionDeclaration extends ActionDeclaration
{
  /**
   * Returns the value of the '<em><b>Exit Action Declaration</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.kieler.scc.model.scctext.sccexp.ActionVariableDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exit Action Declaration</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exit Action Declaration</em>' containment reference list.
   * @see de.cau.kieler.scc.model.scctext.sccexp.SccexpPackage#getExitActionDeclaration_ExitActionDeclaration()
   * @model containment="true"
   * @generated
   */
  EList<ActionVariableDeclaration> getExitActionDeclaration();

} // ExitActionDeclaration
