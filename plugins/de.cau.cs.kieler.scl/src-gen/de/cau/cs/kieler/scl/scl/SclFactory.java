/**
 */
package de.cau.cs.kieler.scl.scl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.scl.scl.SclPackage
 * @generated
 */
public interface SclFactory extends EFactory
{
  /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  SclFactory eINSTANCE = de.cau.cs.kieler.scl.scl.impl.SclFactoryImpl.init();

  /**
     * Returns a new object of class '<em>SCL Program</em>'.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @return a new object of class '<em>SCL Program</em>'.
     * @generated
     */
  SCLProgram createSCLProgram();

  /**
     * Returns a new object of class '<em>Statement</em>'.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @return a new object of class '<em>Statement</em>'.
     * @generated
     */
  Statement createStatement();

  /**
     * Returns a new object of class '<em>Empty Statement</em>'.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @return a new object of class '<em>Empty Statement</em>'.
     * @generated
     */
  EmptyStatement createEmptyStatement();

  /**
     * Returns a new object of class '<em>Instruction Statement</em>'.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @return a new object of class '<em>Instruction Statement</em>'.
     * @generated
     */
  InstructionStatement createInstructionStatement();

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
     * Returns a new object of class '<em>Statement Sequence</em>'.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @return a new object of class '<em>Statement Sequence</em>'.
     * @generated
     */
  StatementSequence createStatementSequence();

  /**
     * Returns a new object of class '<em>Thread</em>'.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @return a new object of class '<em>Thread</em>'.
     * @generated
     */
  Thread createThread();

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
     * Returns a new object of class '<em>Statement Scope</em>'.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @return a new object of class '<em>Statement Scope</em>'.
     * @generated
     */
  StatementScope createStatementScope();

  /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
  SclPackage getSclPackage();

} //SclFactory
