/**
 */
package de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext;

import org.yakindu.sct.model.sgraph.Declaration;
import org.yakindu.sct.model.sgraph.Effect;
import org.yakindu.sct.model.sgraph.Trigger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Exit Reaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalExitReaction#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalExitReaction#getEffect <em>Effect</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.SynctextPackage#getLocalExitReaction()
 * @model
 * @generated
 */
public interface LocalExitReaction extends Declaration
{
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
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.SynctextPackage#getLocalExitReaction_Trigger()
   * @model containment="true"
   * @generated
   */
  Trigger getTrigger();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalExitReaction#getTrigger <em>Trigger</em>}' containment reference.
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
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.SynctextPackage#getLocalExitReaction_Effect()
   * @model containment="true"
   * @generated
   */
  Effect getEffect();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalExitReaction#getEffect <em>Effect</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Effect</em>' containment reference.
   * @see #getEffect()
   * @generated
   */
  void setEffect(Effect value);

} // LocalExitReaction
