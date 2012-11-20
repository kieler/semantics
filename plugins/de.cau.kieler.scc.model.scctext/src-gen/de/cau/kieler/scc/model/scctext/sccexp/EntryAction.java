/**
 */
package de.cau.kieler.scc.model.scctext.sccexp;

import org.yakindu.sct.model.sgraph.Effect;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.kieler.scc.model.scctext.sccexp.EntryAction#getEffect <em>Effect</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.kieler.scc.model.scctext.sccexp.SccexpPackage#getEntryAction()
 * @model
 * @generated
 */
public interface EntryAction extends Effect
{
  /**
   * Returns the value of the '<em><b>Effect</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Effect</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Effect</em>' containment reference.
   * @see #setEffect(Effect)
   * @see de.cau.kieler.scc.model.scctext.sccexp.SccexpPackage#getEntryAction_Effect()
   * @model containment="true"
   * @generated
   */
  Effect getEffect();

  /**
   * Sets the value of the '{@link de.cau.kieler.scc.model.scctext.sccexp.EntryAction#getEffect <em>Effect</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Effect</em>' containment reference.
   * @see #getEffect()
   * @generated
   */
  void setEffect(Effect value);

} // EntryAction
