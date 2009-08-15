/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.dsl.retypingSynccharts;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getExitActions <em>Exit Actions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getEntryActions <em>Entry Actions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getInnerAction <em>Inner Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getStateContent()
 * @model
 * @generated
 */
public interface StateContent extends EObject
{
  /**
   * Returns the value of the '<em><b>Exit Actions</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exit Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exit Actions</em>' containment reference list.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getStateContent_ExitActions()
   * @model containment="true"
   * @generated
   */
  EList<Action> getExitActions();

  /**
   * Returns the value of the '<em><b>Entry Actions</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entry Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entry Actions</em>' containment reference list.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getStateContent_EntryActions()
   * @model containment="true"
   * @generated
   */
  EList<Action> getEntryActions();

  /**
   * Returns the value of the '<em><b>Inner Action</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inner Action</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inner Action</em>' containment reference list.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getStateContent_InnerAction()
   * @model containment="true"
   * @generated
   */
  EList<Action> getInnerAction();

} // StateContent
