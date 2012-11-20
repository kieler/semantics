/**
 */
package de.cau.kieler.scc.model.scctext.sccexp;

import org.eclipse.emf.common.util.EList;

import org.yakindu.sct.model.stext.stext.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.kieler.scc.model.scctext.sccexp.Effect#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.kieler.scc.model.scctext.sccexp.SccexpPackage#getEffect()
 * @model
 * @generated
 */
public interface Effect extends org.yakindu.sct.model.sgraph.Effect
{
  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link org.yakindu.sct.model.stext.stext.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see de.cau.kieler.scc.model.scctext.sccexp.SccexpPackage#getEffect_Actions()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getActions();

} // Effect
