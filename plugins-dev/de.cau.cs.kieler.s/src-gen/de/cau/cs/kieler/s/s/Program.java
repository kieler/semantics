/**
 */
package de.cau.cs.kieler.s.s;

import de.cau.cs.kieler.annotations.Annotatable;

import de.cau.cs.kieler.kexpressions.Declaration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.s.s.Program#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.s.s.Program#getPriority <em>Priority</em>}</li>
 *   <li>{@link de.cau.cs.kieler.s.s.Program#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.s.s.Program#getGlobalHostCodeInstruction <em>Global Host Code Instruction</em>}</li>
 *   <li>{@link de.cau.cs.kieler.s.s.Program#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.s.s.SPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends Annotatable
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.cau.cs.kieler.s.s.SPackage#getProgram_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.s.s.Program#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Priority</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Priority</em>' attribute.
   * @see #setPriority(int)
   * @see de.cau.cs.kieler.s.s.SPackage#getProgram_Priority()
   * @model
   * @generated
   */
  int getPriority();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.s.s.Program#getPriority <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Priority</em>' attribute.
   * @see #getPriority()
   * @generated
   */
  void setPriority(int value);

  /**
   * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.kexpressions.Declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarations</em>' containment reference list.
   * @see de.cau.cs.kieler.s.s.SPackage#getProgram_Declarations()
   * @model containment="true"
   * @generated
   */
  EList<Declaration> getDeclarations();

  /**
   * Returns the value of the '<em><b>Global Host Code Instruction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Global Host Code Instruction</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Global Host Code Instruction</em>' attribute.
   * @see #setGlobalHostCodeInstruction(String)
   * @see de.cau.cs.kieler.s.s.SPackage#getProgram_GlobalHostCodeInstruction()
   * @model
   * @generated
   */
  String getGlobalHostCodeInstruction();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.s.s.Program#getGlobalHostCodeInstruction <em>Global Host Code Instruction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Global Host Code Instruction</em>' attribute.
   * @see #getGlobalHostCodeInstruction()
   * @generated
   */
  void setGlobalHostCodeInstruction(String value);

  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.s.s.State}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>States</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see de.cau.cs.kieler.s.s.SPackage#getProgram_States()
   * @model containment="true"
   * @generated
   */
  EList<State> getStates();

} // Program
