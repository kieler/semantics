/**
 */
package de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext;

import org.yakindu.sct.model.sgraph.Declaration;
import org.yakindu.sct.model.sgraph.Trigger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Suspend Reaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalSuspendReaction#isIsImmediate <em>Is Immediate</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalSuspendReaction#getTrigger <em>Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.SynctextPackage#getLocalSuspendReaction()
 * @model
 * @generated
 */
public interface LocalSuspendReaction extends Declaration
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
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.SynctextPackage#getLocalSuspendReaction_IsImmediate()
   * @model
   * @generated
   */
  boolean isIsImmediate();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalSuspendReaction#isIsImmediate <em>Is Immediate</em>}' attribute.
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
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.SynctextPackage#getLocalSuspendReaction_Trigger()
   * @model containment="true"
   * @generated
   */
  Trigger getTrigger();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalSuspendReaction#getTrigger <em>Trigger</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trigger</em>' containment reference.
   * @see #getTrigger()
   * @generated
   */
  void setTrigger(Trigger value);

} // LocalSuspendReaction
