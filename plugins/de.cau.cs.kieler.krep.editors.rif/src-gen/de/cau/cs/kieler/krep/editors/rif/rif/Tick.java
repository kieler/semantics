/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.krep.editors.rif.rif;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tick</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.krep.editors.rif.rif.Tick#getNr <em>Nr</em>}</li>
 *   <li>{@link de.cau.cs.kieler.krep.editors.rif.rif.Tick#getInput <em>Input</em>}</li>
 *   <li>{@link de.cau.cs.kieler.krep.editors.rif.rif.Tick#getOutput <em>Output</em>}</li>
 *   <li>{@link de.cau.cs.kieler.krep.editors.rif.rif.Tick#getLocal <em>Local</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.krep.editors.rif.rif.RifPackage#getTick()
 * @model
 * @generated
 */
public interface Tick extends EObject
{
  /**
   * Returns the value of the '<em><b>Nr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nr</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nr</em>' attribute.
   * @see #setNr(int)
   * @see de.cau.cs.kieler.krep.editors.rif.rif.RifPackage#getTick_Nr()
   * @model
   * @generated
   */
  int getNr();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.krep.editors.rif.rif.Tick#getNr <em>Nr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nr</em>' attribute.
   * @see #getNr()
   * @generated
   */
  void setNr(int value);

  /**
   * Returns the value of the '<em><b>Input</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.krep.editors.rif.rif.Data}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' containment reference list.
   * @see de.cau.cs.kieler.krep.editors.rif.rif.RifPackage#getTick_Input()
   * @model containment="true"
   * @generated
   */
  EList<Data> getInput();

  /**
   * Returns the value of the '<em><b>Output</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.krep.editors.rif.rif.Data}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output</em>' containment reference list.
   * @see de.cau.cs.kieler.krep.editors.rif.rif.RifPackage#getTick_Output()
   * @model containment="true"
   * @generated
   */
  EList<Data> getOutput();

  /**
   * Returns the value of the '<em><b>Local</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.krep.editors.rif.rif.Data}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Local</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Local</em>' containment reference list.
   * @see de.cau.cs.kieler.krep.editors.rif.rif.RifPackage#getTick_Local()
   * @model containment="true"
   * @generated
   */
  EList<Data> getLocal();

} // Tick
