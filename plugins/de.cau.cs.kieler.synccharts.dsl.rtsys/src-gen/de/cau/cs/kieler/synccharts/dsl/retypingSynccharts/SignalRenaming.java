/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.dsl.retypingSynccharts;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Renaming</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.SignalRenaming#getOldSignal <em>Old Signal</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.SignalRenaming#getNewSignal <em>New Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getSignalRenaming()
 * @model
 * @generated
 */
public interface SignalRenaming extends EObject
{
  /**
   * Returns the value of the '<em><b>Old Signal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Old Signal</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Old Signal</em>' reference.
   * @see #setOldSignal(Signal)
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getSignalRenaming_OldSignal()
   * @model
   * @generated
   */
  Signal getOldSignal();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.SignalRenaming#getOldSignal <em>Old Signal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Old Signal</em>' reference.
   * @see #getOldSignal()
   * @generated
   */
  void setOldSignal(Signal value);

  /**
   * Returns the value of the '<em><b>New Signal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>New Signal</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>New Signal</em>' reference.
   * @see #setNewSignal(Signal)
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getSignalRenaming_NewSignal()
   * @model
   * @generated
   */
  Signal getNewSignal();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.SignalRenaming#getNewSignal <em>New Signal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>New Signal</em>' reference.
   * @see #getNewSignal()
   * @generated
   */
  void setNewSignal(Signal value);

} // SignalRenaming
