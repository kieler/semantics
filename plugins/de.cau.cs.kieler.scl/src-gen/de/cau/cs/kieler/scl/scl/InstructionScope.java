/**
 */
package de.cau.cs.kieler.scl.scl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scl.scl.InstructionScope#getInterface <em>Interface</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scl.scl.InstructionScope#getInstructions <em>Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scl.scl.SclPackage#getInstructionScope()
 * @model
 * @generated
 */
public interface InstructionScope extends Instruction
{
  /**
   * Returns the value of the '<em><b>Interface</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.scl.scl.VariableDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface</em>' containment reference list.
   * @see de.cau.cs.kieler.scl.scl.SclPackage#getInstructionScope_Interface()
   * @model containment="true"
   * @generated
   */
  EList<VariableDeclaration> getInterface();

  /**
   * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instructions</em>' containment reference list.
   * @see de.cau.cs.kieler.scl.scl.SclPackage#getInstructionScope_Instructions()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getInstructions();

} // InstructionScope
