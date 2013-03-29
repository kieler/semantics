/**
 */
package de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.ScgPackage
 * @generated
 */
public interface ScgFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ScgFactory eINSTANCE = de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ScgFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Instruction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction</em>'.
   * @generated
   */
  Instruction createInstruction();

  /**
   * Returns a new object of class '<em>Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assignment</em>'.
   * @generated
   */
  Assignment createAssignment();

  /**
   * Returns a new object of class '<em>Dependency</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dependency</em>'.
   * @generated
   */
  Dependency createDependency();

  /**
   * Returns a new object of class '<em>Instruction Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction Set</em>'.
   * @generated
   */
  InstructionSet createInstructionSet();

  /**
   * Returns a new object of class '<em>Instruction Set Single Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction Set Single Assignment</em>'.
   * @generated
   */
  InstructionSetSingleAssignment createInstructionSetSingleAssignment();

  /**
   * Returns a new object of class '<em>Instruction Or Comment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction Or Comment</em>'.
   * @generated
   */
  InstructionOrComment createInstructionOrComment();

  /**
   * Returns a new object of class '<em>Instruction Or Comment Sequence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction Or Comment Sequence</em>'.
   * @generated
   */
  InstructionOrCommentSequence createInstructionOrCommentSequence();

  /**
   * Returns a new object of class '<em>Label</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Label</em>'.
   * @generated
   */
  Label createLabel();

  /**
   * Returns a new object of class '<em>Scope</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scope</em>'.
   * @generated
   */
  Scope createScope();

  /**
   * Returns a new object of class '<em>Conditional</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conditional</em>'.
   * @generated
   */
  Conditional createConditional();

  /**
   * Returns a new object of class '<em>Goto</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Goto</em>'.
   * @generated
   */
  Goto createGoto();

  /**
   * Returns a new object of class '<em>Parallel</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parallel</em>'.
   * @generated
   */
  Parallel createParallel();

  /**
   * Returns a new object of class '<em>Pause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pause</em>'.
   * @generated
   */
  Pause createPause();

  /**
   * Returns a new object of class '<em>Comment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comment</em>'.
   * @generated
   */
  Comment createComment();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ScgPackage getScgPackage();

} //ScgFactory
