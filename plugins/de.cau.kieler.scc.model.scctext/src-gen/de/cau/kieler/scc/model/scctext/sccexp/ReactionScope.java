/**
 */
package de.cau.kieler.scc.model.scctext.sccexp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.yakindu.sct.model.sgraph.Scope;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reaction Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.kieler.scc.model.scctext.sccexp.ReactionScope#getReactionScope <em>Reaction Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.kieler.scc.model.scctext.sccexp.SccexpPackage#getReactionScope()
 * @model
 * @generated
 */
public interface ReactionScope extends Scope
{
  /**
   * Returns the value of the '<em><b>Reaction Scope</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reaction Scope</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reaction Scope</em>' containment reference list.
   * @see de.cau.kieler.scc.model.scctext.sccexp.SccexpPackage#getReactionScope_ReactionScope()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getReactionScope();

} // ReactionScope
