/**
 */
package de.cau.kieler.scc.model.scctext.sccexp;

import org.eclipse.emf.common.util.EList;

import org.yakindu.sct.model.sgraph.Scope;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.kieler.scc.model.scctext.sccexp.StateSpecification#getScopes <em>Scopes</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.kieler.scc.model.scctext.sccexp.SccexpPackage#getStateSpecification()
 * @model
 * @generated
 */
public interface StateSpecification extends org.yakindu.sct.model.stext.stext.StateSpecification
{
  /**
   * Returns the value of the '<em><b>Scopes</b></em>' containment reference list.
   * The list contents are of type {@link org.yakindu.sct.model.sgraph.Scope}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scopes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scopes</em>' containment reference list.
   * @see de.cau.kieler.scc.model.scctext.sccexp.SccexpPackage#getStateSpecification_Scopes()
   * @model containment="true"
   * @generated
   */
  EList<Scope> getScopes();

} // StateSpecification
