/**
 */
package de.cau.kieler.scc.model.scctext.sccexp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Action Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.kieler.scc.model.scctext.sccexp.EntryActionDeclaration#getEntryActionDeclaration <em>Entry Action Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.kieler.scc.model.scctext.sccexp.SccexpPackage#getEntryActionDeclaration()
 * @model
 * @generated
 */
public interface EntryActionDeclaration extends ActionDeclaration
{
  /**
   * Returns the value of the '<em><b>Entry Action Declaration</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.kieler.scc.model.scctext.sccexp.ActionVariableDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entry Action Declaration</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entry Action Declaration</em>' containment reference list.
   * @see de.cau.kieler.scc.model.scctext.sccexp.SccexpPackage#getEntryActionDeclaration_EntryActionDeclaration()
   * @model containment="true"
   * @generated
   */
  EList<ActionVariableDeclaration> getEntryActionDeclaration();

} // EntryActionDeclaration
