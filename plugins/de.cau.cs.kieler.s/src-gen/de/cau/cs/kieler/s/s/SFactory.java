/**
 */
package de.cau.cs.kieler.s.s;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.s.s.SPackage
 * @generated
 */
public interface SFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SFactory eINSTANCE = de.cau.cs.kieler.s.s.impl.SFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Program</em>'.
   * @generated
   */
  Program createProgram();

  /**
   * Returns a new object of class '<em>State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State</em>'.
   * @generated
   */
  State createState();

  /**
   * Returns a new object of class '<em>Thread</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Thread</em>'.
   * @generated
   */
  Thread createThread();

  /**
   * Returns a new object of class '<em>Continuation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Continuation</em>'.
   * @generated
   */
  Continuation createContinuation();

  /**
   * Returns a new object of class '<em>Instruction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction</em>'.
   * @generated
   */
  Instruction createInstruction();

  /**
   * Returns a new object of class '<em>Prio</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Prio</em>'.
   * @generated
   */
  Prio createPrio();

  /**
   * Returns a new object of class '<em>Trans</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trans</em>'.
   * @generated
   */
  Trans createTrans();

  /**
   * Returns a new object of class '<em>Fork</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fork</em>'.
   * @generated
   */
  Fork createFork();

  /**
   * Returns a new object of class '<em>Join</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Join</em>'.
   * @generated
   */
  Join createJoin();

  /**
   * Returns a new object of class '<em>Pause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pause</em>'.
   * @generated
   */
  Pause createPause();

  /**
   * Returns a new object of class '<em>Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Term</em>'.
   * @generated
   */
  Term createTerm();

  /**
   * Returns a new object of class '<em>Halt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Halt</em>'.
   * @generated
   */
  Halt createHalt();

  /**
   * Returns a new object of class '<em>Emit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Emit</em>'.
   * @generated
   */
  Emit createEmit();

  /**
   * Returns a new object of class '<em>Abort</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abort</em>'.
   * @generated
   */
  Abort createAbort();

  /**
   * Returns a new object of class '<em>If</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If</em>'.
   * @generated
   */
  If createIf();

  /**
   * Returns a new object of class '<em>Await</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Await</em>'.
   * @generated
   */
  Await createAwait();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SPackage getSPackage();

} //SFactory
