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
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.krep.editors.rif.rif.Trace#getInputs <em>Inputs</em>}</li>
 *   <li>{@link de.cau.cs.kieler.krep.editors.rif.rif.Trace#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link de.cau.cs.kieler.krep.editors.rif.rif.Trace#getLocal <em>Local</em>}</li>
 *   <li>{@link de.cau.cs.kieler.krep.editors.rif.rif.Trace#getTick <em>Tick</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.krep.editors.rif.rif.RifPackage#getTrace()
 * @model
 * @generated
 */
public interface Trace extends EObject
{
  /**
   * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.krep.editors.rif.rif.decl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inputs</em>' containment reference list.
   * @see de.cau.cs.kieler.krep.editors.rif.rif.RifPackage#getTrace_Inputs()
   * @model containment="true"
   * @generated
   */
  EList<decl> getInputs();

  /**
   * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.krep.editors.rif.rif.decl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outputs</em>' containment reference list.
   * @see de.cau.cs.kieler.krep.editors.rif.rif.RifPackage#getTrace_Outputs()
   * @model containment="true"
   * @generated
   */
  EList<decl> getOutputs();

  /**
   * Returns the value of the '<em><b>Local</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.krep.editors.rif.rif.decl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Local</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Local</em>' containment reference list.
   * @see de.cau.cs.kieler.krep.editors.rif.rif.RifPackage#getTrace_Local()
   * @model containment="true"
   * @generated
   */
  EList<decl> getLocal();

  /**
   * Returns the value of the '<em><b>Tick</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.krep.editors.rif.rif.Tick}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tick</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tick</em>' containment reference list.
   * @see de.cau.cs.kieler.krep.editors.rif.rif.RifPackage#getTrace_Tick()
   * @model containment="true"
   * @generated
   */
  EList<Tick> getTick();

} // Trace
