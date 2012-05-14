/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.s.s;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.s.s.SFactory
 * @model kind="package"
 * @generated
 */
public interface SPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "s";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cau.de/cs/kieler/s";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "s";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SPackage eINSTANCE = de.cau.cs.kieler.s.s.impl.SPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.ProgramImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__NAME = 0;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__PRIORITY = 1;

  /**
   * The feature id for the '<em><b>Signals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__SIGNALS = 2;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__STATES = 3;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.ContinuationImpl <em>Continuation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.ContinuationImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getContinuation()
   * @generated
   */
  int CONTINUATION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTINUATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Signals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTINUATION__SIGNALS = 1;

  /**
   * The number of structural features of the '<em>Continuation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTINUATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.StateImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getState()
   * @generated
   */
  int STATE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = CONTINUATION__NAME;

  /**
   * The feature id for the '<em><b>Signals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__SIGNALS = CONTINUATION__SIGNALS;

  /**
   * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__INSTRUCTIONS = CONTINUATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = CONTINUATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.ThreadImpl <em>Thread</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.ThreadImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getThread()
   * @generated
   */
  int THREAD = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THREAD__NAME = CONTINUATION__NAME;

  /**
   * The feature id for the '<em><b>Signals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THREAD__SIGNALS = CONTINUATION__SIGNALS;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THREAD__STATES = CONTINUATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Thread</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THREAD_FEATURE_COUNT = CONTINUATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.InstructionImpl <em>Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.InstructionImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getInstruction()
   * @generated
   */
  int INSTRUCTION = 4;

  /**
   * The feature id for the '<em><b>Continuation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION__CONTINUATION = 0;

  /**
   * The number of structural features of the '<em>Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.PrioImpl <em>Prio</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.PrioImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getPrio()
   * @generated
   */
  int PRIO = 5;

  /**
   * The feature id for the '<em><b>Continuation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIO__CONTINUATION = INSTRUCTION__CONTINUATION;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIO__PRIORITY = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Prio</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIO_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.TransImpl <em>Trans</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.TransImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getTrans()
   * @generated
   */
  int TRANS = 6;

  /**
   * The feature id for the '<em><b>Continuation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANS__CONTINUATION = INSTRUCTION__CONTINUATION;

  /**
   * The number of structural features of the '<em>Trans</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANS_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.ForkImpl <em>Fork</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.ForkImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getFork()
   * @generated
   */
  int FORK = 7;

  /**
   * The feature id for the '<em><b>Continuation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORK__CONTINUATION = INSTRUCTION__CONTINUATION;

  /**
   * The feature id for the '<em><b>Thread</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORK__THREAD = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORK__PRIORITY = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Fork</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORK_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.JoinImpl <em>Join</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.JoinImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getJoin()
   * @generated
   */
  int JOIN = 8;

  /**
   * The feature id for the '<em><b>Continuation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN__CONTINUATION = INSTRUCTION__CONTINUATION;

  /**
   * The number of structural features of the '<em>Join</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.PauseImpl <em>Pause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.PauseImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getPause()
   * @generated
   */
  int PAUSE = 9;

  /**
   * The feature id for the '<em><b>Continuation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAUSE__CONTINUATION = INSTRUCTION__CONTINUATION;

  /**
   * The number of structural features of the '<em>Pause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAUSE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.TermImpl <em>Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.TermImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getTerm()
   * @generated
   */
  int TERM = 10;

  /**
   * The feature id for the '<em><b>Continuation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__CONTINUATION = INSTRUCTION__CONTINUATION;

  /**
   * The number of structural features of the '<em>Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.HaltImpl <em>Halt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.HaltImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getHalt()
   * @generated
   */
  int HALT = 11;

  /**
   * The feature id for the '<em><b>Continuation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HALT__CONTINUATION = INSTRUCTION__CONTINUATION;

  /**
   * The number of structural features of the '<em>Halt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HALT_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.EmitImpl <em>Emit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.EmitImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getEmit()
   * @generated
   */
  int EMIT = 12;

  /**
   * The feature id for the '<em><b>Continuation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMIT__CONTINUATION = INSTRUCTION__CONTINUATION;

  /**
   * The feature id for the '<em><b>Signal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMIT__SIGNAL = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Emit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMIT_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.AbortImpl <em>Abort</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.AbortImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getAbort()
   * @generated
   */
  int ABORT = 13;

  /**
   * The feature id for the '<em><b>Continuation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT__CONTINUATION = INSTRUCTION__CONTINUATION;

  /**
   * The number of structural features of the '<em>Abort</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.IfImpl <em>If</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.IfImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getIf()
   * @generated
   */
  int IF = 14;

  /**
   * The feature id for the '<em><b>Continuation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__CONTINUATION = INSTRUCTION__CONTINUATION;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__EXPRESSION = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__INSTRUCTIONS = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>If</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.AwaitImpl <em>Await</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.AwaitImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getAwait()
   * @generated
   */
  int AWAIT = 15;

  /**
   * The feature id for the '<em><b>Continuation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AWAIT__CONTINUATION = INSTRUCTION__CONTINUATION;

  /**
   * The feature id for the '<em><b>Signal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AWAIT__SIGNAL = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Await</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AWAIT_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see de.cau.cs.kieler.s.s.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.s.s.Program#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.s.s.Program#getName()
   * @see #getProgram()
   * @generated
   */
  EAttribute getProgram_Name();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.s.s.Program#getPriority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Priority</em>'.
   * @see de.cau.cs.kieler.s.s.Program#getPriority()
   * @see #getProgram()
   * @generated
   */
  EAttribute getProgram_Priority();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.s.s.Program#getSignals <em>Signals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Signals</em>'.
   * @see de.cau.cs.kieler.s.s.Program#getSignals()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Signals();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.s.s.Program#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see de.cau.cs.kieler.s.s.Program#getStates()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_States();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see de.cau.cs.kieler.s.s.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.s.s.State#getInstructions <em>Instructions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instructions</em>'.
   * @see de.cau.cs.kieler.s.s.State#getInstructions()
   * @see #getState()
   * @generated
   */
  EReference getState_Instructions();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.Thread <em>Thread</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Thread</em>'.
   * @see de.cau.cs.kieler.s.s.Thread
   * @generated
   */
  EClass getThread();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.s.s.Thread#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see de.cau.cs.kieler.s.s.Thread#getStates()
   * @see #getThread()
   * @generated
   */
  EReference getThread_States();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.Continuation <em>Continuation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Continuation</em>'.
   * @see de.cau.cs.kieler.s.s.Continuation
   * @generated
   */
  EClass getContinuation();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.s.s.Continuation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.s.s.Continuation#getName()
   * @see #getContinuation()
   * @generated
   */
  EAttribute getContinuation_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.s.s.Continuation#getSignals <em>Signals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Signals</em>'.
   * @see de.cau.cs.kieler.s.s.Continuation#getSignals()
   * @see #getContinuation()
   * @generated
   */
  EReference getContinuation_Signals();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction</em>'.
   * @see de.cau.cs.kieler.s.s.Instruction
   * @generated
   */
  EClass getInstruction();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.s.s.Instruction#getContinuation <em>Continuation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Continuation</em>'.
   * @see de.cau.cs.kieler.s.s.Instruction#getContinuation()
   * @see #getInstruction()
   * @generated
   */
  EReference getInstruction_Continuation();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.Prio <em>Prio</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prio</em>'.
   * @see de.cau.cs.kieler.s.s.Prio
   * @generated
   */
  EClass getPrio();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.s.s.Prio#getPriority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Priority</em>'.
   * @see de.cau.cs.kieler.s.s.Prio#getPriority()
   * @see #getPrio()
   * @generated
   */
  EAttribute getPrio_Priority();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.Trans <em>Trans</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trans</em>'.
   * @see de.cau.cs.kieler.s.s.Trans
   * @generated
   */
  EClass getTrans();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.Fork <em>Fork</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fork</em>'.
   * @see de.cau.cs.kieler.s.s.Fork
   * @generated
   */
  EClass getFork();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.s.s.Fork#getThread <em>Thread</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Thread</em>'.
   * @see de.cau.cs.kieler.s.s.Fork#getThread()
   * @see #getFork()
   * @generated
   */
  EReference getFork_Thread();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.s.s.Fork#getPriority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Priority</em>'.
   * @see de.cau.cs.kieler.s.s.Fork#getPriority()
   * @see #getFork()
   * @generated
   */
  EAttribute getFork_Priority();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.Join <em>Join</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Join</em>'.
   * @see de.cau.cs.kieler.s.s.Join
   * @generated
   */
  EClass getJoin();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.Pause <em>Pause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pause</em>'.
   * @see de.cau.cs.kieler.s.s.Pause
   * @generated
   */
  EClass getPause();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term</em>'.
   * @see de.cau.cs.kieler.s.s.Term
   * @generated
   */
  EClass getTerm();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.Halt <em>Halt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Halt</em>'.
   * @see de.cau.cs.kieler.s.s.Halt
   * @generated
   */
  EClass getHalt();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.Emit <em>Emit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Emit</em>'.
   * @see de.cau.cs.kieler.s.s.Emit
   * @generated
   */
  EClass getEmit();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.s.s.Emit#getSignal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Signal</em>'.
   * @see de.cau.cs.kieler.s.s.Emit#getSignal()
   * @see #getEmit()
   * @generated
   */
  EReference getEmit_Signal();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.Abort <em>Abort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abort</em>'.
   * @see de.cau.cs.kieler.s.s.Abort
   * @generated
   */
  EClass getAbort();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.If <em>If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If</em>'.
   * @see de.cau.cs.kieler.s.s.If
   * @generated
   */
  EClass getIf();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.s.s.If#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.cau.cs.kieler.s.s.If#getExpression()
   * @see #getIf()
   * @generated
   */
  EReference getIf_Expression();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.s.s.If#getInstructions <em>Instructions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instructions</em>'.
   * @see de.cau.cs.kieler.s.s.If#getInstructions()
   * @see #getIf()
   * @generated
   */
  EReference getIf_Instructions();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.Await <em>Await</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Await</em>'.
   * @see de.cau.cs.kieler.s.s.Await
   * @generated
   */
  EClass getAwait();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.s.s.Await#getSignal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Signal</em>'.
   * @see de.cau.cs.kieler.s.s.Await#getSignal()
   * @see #getAwait()
   * @generated
   */
  EReference getAwait_Signal();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SFactory getSFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.ProgramImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROGRAM__NAME = eINSTANCE.getProgram_Name();

    /**
     * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROGRAM__PRIORITY = eINSTANCE.getProgram_Priority();

    /**
     * The meta object literal for the '<em><b>Signals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__SIGNALS = eINSTANCE.getProgram_Signals();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__STATES = eINSTANCE.getProgram_States();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.StateImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__INSTRUCTIONS = eINSTANCE.getState_Instructions();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.ThreadImpl <em>Thread</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.ThreadImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getThread()
     * @generated
     */
    EClass THREAD = eINSTANCE.getThread();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THREAD__STATES = eINSTANCE.getThread_States();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.ContinuationImpl <em>Continuation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.ContinuationImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getContinuation()
     * @generated
     */
    EClass CONTINUATION = eINSTANCE.getContinuation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTINUATION__NAME = eINSTANCE.getContinuation_Name();

    /**
     * The meta object literal for the '<em><b>Signals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTINUATION__SIGNALS = eINSTANCE.getContinuation_Signals();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.InstructionImpl <em>Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.InstructionImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getInstruction()
     * @generated
     */
    EClass INSTRUCTION = eINSTANCE.getInstruction();

    /**
     * The meta object literal for the '<em><b>Continuation</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION__CONTINUATION = eINSTANCE.getInstruction_Continuation();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.PrioImpl <em>Prio</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.PrioImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getPrio()
     * @generated
     */
    EClass PRIO = eINSTANCE.getPrio();

    /**
     * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIO__PRIORITY = eINSTANCE.getPrio_Priority();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.TransImpl <em>Trans</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.TransImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getTrans()
     * @generated
     */
    EClass TRANS = eINSTANCE.getTrans();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.ForkImpl <em>Fork</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.ForkImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getFork()
     * @generated
     */
    EClass FORK = eINSTANCE.getFork();

    /**
     * The meta object literal for the '<em><b>Thread</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORK__THREAD = eINSTANCE.getFork_Thread();

    /**
     * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORK__PRIORITY = eINSTANCE.getFork_Priority();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.JoinImpl <em>Join</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.JoinImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getJoin()
     * @generated
     */
    EClass JOIN = eINSTANCE.getJoin();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.PauseImpl <em>Pause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.PauseImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getPause()
     * @generated
     */
    EClass PAUSE = eINSTANCE.getPause();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.TermImpl <em>Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.TermImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getTerm()
     * @generated
     */
    EClass TERM = eINSTANCE.getTerm();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.HaltImpl <em>Halt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.HaltImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getHalt()
     * @generated
     */
    EClass HALT = eINSTANCE.getHalt();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.EmitImpl <em>Emit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.EmitImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getEmit()
     * @generated
     */
    EClass EMIT = eINSTANCE.getEmit();

    /**
     * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMIT__SIGNAL = eINSTANCE.getEmit_Signal();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.AbortImpl <em>Abort</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.AbortImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getAbort()
     * @generated
     */
    EClass ABORT = eINSTANCE.getAbort();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.IfImpl <em>If</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.IfImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getIf()
     * @generated
     */
    EClass IF = eINSTANCE.getIf();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF__EXPRESSION = eINSTANCE.getIf_Expression();

    /**
     * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF__INSTRUCTIONS = eINSTANCE.getIf_Instructions();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.AwaitImpl <em>Await</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.AwaitImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getAwait()
     * @generated
     */
    EClass AWAIT = eINSTANCE.getAwait();

    /**
     * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AWAIT__SIGNAL = eINSTANCE.getAwait_Signal();

  }

} //SPackage
