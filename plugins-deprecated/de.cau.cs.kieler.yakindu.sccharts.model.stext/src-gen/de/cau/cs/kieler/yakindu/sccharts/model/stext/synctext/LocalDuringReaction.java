/**
 */
package de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext;

import org.yakindu.sct.model.sgraph.Declaration;
import org.yakindu.sct.model.sgraph.Effect;
import org.yakindu.sct.model.sgraph.Trigger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local During Reaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalDuringReaction#isIsImmediate <em>Is Immediate</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalDuringReaction#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalDuringReaction#getEffect <em>Effect</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.SynctextPackage#getLocalDuringReaction()
 * @model
 * @generated
 */
public interface LocalDuringReaction extends Declaration
{
  /**
   * Returns the value of the '<em><b>Is Immediate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Immediate</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Immediate</em>' attribute.
   * @see #setIsImmediate(boolean)
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.SynctextPackage#getLocalDuringReaction_IsImmediate()
   * @model
   * @generated
   */
  boolean isIsImmediate();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalDuringReaction#isIsImmediate <em>Is Immediate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Immediate</em>' attribute.
   * @see #isIsImmediate()
   * @generated
   */
  void setIsImmediate(boolean value);

  /**
   * Returns the value of the '<em><b>Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trigger</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trigger</em>' containment reference.
   * @see #setTrigger(Trigger)
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.SynctextPackage#getLocalDuringReaction_Trigger()
   * @model containment="true"
   * @generated
   */
  Trigger getTrigger();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalDuringReaction#getTrigger <em>Trigger</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trigger</em>' containment reference.
   * @see #getTrigger()
   * @generated
   */
  void setTrigger(Trigger value);

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
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.SynctextPackage#getLocalDuringReaction_Effect()
   * @model containment="true"
   * @generated
   */
  Effect getEffect();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalDuringReaction#getEffect <em>Effect</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Effect</em>' containment reference.
   * @see #getEffect()
   * @generated
   */
  void setEffect(Effect value);

} // LocalDuringReaction
