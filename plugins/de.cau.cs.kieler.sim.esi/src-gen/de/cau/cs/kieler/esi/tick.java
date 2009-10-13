/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>tick</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esi.tick#getInput <em>Input</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esi.tick#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esi.EsiPackage#gettick()
 * @model
 * @generated
 */
public interface tick extends EObject
{
  /**
   * Returns the value of the '<em><b>Input</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esi.signal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' containment reference list.
   * @see de.cau.cs.kieler.esi.EsiPackage#gettick_Input()
   * @model containment="true"
   * @generated
   */
  EList<signal> getInput();

  /**
   * Returns the value of the '<em><b>Output</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esi.signal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output</em>' containment reference list.
   * @see de.cau.cs.kieler.esi.EsiPackage#gettick_Output()
   * @model containment="true"
   * @generated
   */
  EList<signal> getOutput();

} // tick
