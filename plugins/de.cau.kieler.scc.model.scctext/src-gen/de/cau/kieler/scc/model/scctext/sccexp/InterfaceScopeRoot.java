/**
 */
package de.cau.kieler.scc.model.scctext.sccexp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Scope Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.kieler.scc.model.scctext.sccexp.InterfaceScopeRoot#getInterfaceScope <em>Interface Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.kieler.scc.model.scctext.sccexp.SccexpPackage#getInterfaceScopeRoot()
 * @model
 * @generated
 */
public interface InterfaceScopeRoot extends StateScope
{
  /**
   * Returns the value of the '<em><b>Interface Scope</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.kieler.scc.model.scctext.sccexp.InterfaceScope}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface Scope</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface Scope</em>' containment reference list.
   * @see de.cau.kieler.scc.model.scctext.sccexp.SccexpPackage#getInterfaceScopeRoot_InterfaceScope()
   * @model containment="true"
   * @generated
   */
  EList<InterfaceScope> getInterfaceScope();

} // InterfaceScopeRoot
