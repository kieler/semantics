/**
 */
package de.cau.cs.kieler.yakindu.model.stext.synctext;

import org.yakindu.sct.model.sgraph.Trigger;

import org.yakindu.sct.model.stext.stext.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reaction Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionTrigger#getStateReaction <em>State Reaction</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionTrigger#getReactionTrigger <em>Reaction Trigger</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionTrigger#getLabelPriority <em>Label Priority</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionTrigger#getDelay <em>Delay</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionTrigger#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.yakindu.model.stext.synctext.SynctextPackage#getReactionTrigger()
 * @model
 * @generated
 */
public interface ReactionTrigger extends Trigger
{
  /**
   * Returns the value of the '<em><b>State Reaction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State Reaction</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State Reaction</em>' containment reference.
   * @see #setStateReaction(StateReaction)
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.SynctextPackage#getReactionTrigger_StateReaction()
   * @model containment="true"
   * @generated
   */
  StateReaction getStateReaction();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionTrigger#getStateReaction <em>State Reaction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State Reaction</em>' containment reference.
   * @see #getStateReaction()
   * @generated
   */
  void setStateReaction(StateReaction value);

  /**
   * Returns the value of the '<em><b>Reaction Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reaction Trigger</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reaction Trigger</em>' containment reference.
   * @see #setReactionTrigger(Trigger)
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.SynctextPackage#getReactionTrigger_ReactionTrigger()
   * @model containment="true"
   * @generated
   */
  Trigger getReactionTrigger();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionTrigger#getReactionTrigger <em>Reaction Trigger</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reaction Trigger</em>' containment reference.
   * @see #getReactionTrigger()
   * @generated
   */
  void setReactionTrigger(Trigger value);

  /**
   * Returns the value of the '<em><b>Label Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label Priority</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label Priority</em>' attribute.
   * @see #setLabelPriority(int)
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.SynctextPackage#getReactionTrigger_LabelPriority()
   * @model
   * @generated
   */
  int getLabelPriority();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionTrigger#getLabelPriority <em>Label Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label Priority</em>' attribute.
   * @see #getLabelPriority()
   * @generated
   */
  void setLabelPriority(int value);

  /**
   * Returns the value of the '<em><b>Delay</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delay</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delay</em>' attribute.
   * @see #setDelay(int)
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.SynctextPackage#getReactionTrigger_Delay()
   * @model
   * @generated
   */
  int getDelay();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionTrigger#getDelay <em>Delay</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delay</em>' attribute.
   * @see #getDelay()
   * @generated
   */
  void setDelay(int value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.SynctextPackage#getReactionTrigger_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionTrigger#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // ReactionTrigger
