/**
 */
package de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext;

import org.eclipse.emf.common.util.EList;

import org.yakindu.sct.model.sgraph.Effect;

import org.yakindu.sct.model.stext.stext.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reaction Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.ReactionEffect#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.SynctextPackage#getReactionEffect()
 * @model
 * @generated
 */
public interface ReactionEffect extends Effect
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
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.SynctextPackage#getReactionEffect_Actions()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getActions();

} // ReactionEffect
