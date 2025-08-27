/**
 */
package de.cau.cs.kieler.sim.eso.eso;

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
 *   <li>{@link de.cau.cs.kieler.sim.eso.eso.tick#getInput <em>Input</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sim.eso.eso.tick#getOutput <em>Output</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sim.eso.eso.tick#getExtraInfos <em>Extra Infos</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sim.eso.eso.tick#getExtraInfosOutput <em>Extra Infos Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.sim.eso.eso.EsoPackage#gettick()
 * @model
 * @generated
 */
public interface tick extends EObject
{
  /**
   * Returns the value of the '<em><b>Input</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.sim.eso.eso.signal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' containment reference list.
   * @see de.cau.cs.kieler.sim.eso.eso.EsoPackage#gettick_Input()
   * @model containment="true"
   * @generated
   */
  EList<signal> getInput();

  /**
   * Returns the value of the '<em><b>Output</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.sim.eso.eso.signal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output</em>' containment reference list.
   * @see de.cau.cs.kieler.sim.eso.eso.EsoPackage#gettick_Output()
   * @model containment="true"
   * @generated
   */
  EList<signal> getOutput();

  /**
   * Returns the value of the '<em><b>Extra Infos</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.sim.eso.eso.kvpair}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extra Infos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extra Infos</em>' containment reference list.
   * @see de.cau.cs.kieler.sim.eso.eso.EsoPackage#gettick_ExtraInfos()
   * @model containment="true"
   * @generated
   */
  EList<kvpair> getExtraInfos();

  /**
   * Returns the value of the '<em><b>Extra Infos Output</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.sim.eso.eso.kvpair}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extra Infos Output</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extra Infos Output</em>' containment reference list.
   * @see de.cau.cs.kieler.sim.eso.eso.EsoPackage#gettick_ExtraInfosOutput()
   * @model containment="true"
   * @generated
   */
  EList<kvpair> getExtraInfosOutput();

} // tick
