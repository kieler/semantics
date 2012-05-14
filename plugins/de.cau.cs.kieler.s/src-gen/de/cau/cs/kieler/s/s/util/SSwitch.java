/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.s.s.util;

import de.cau.cs.kieler.s.s.Abort;
import de.cau.cs.kieler.s.s.Await;
import de.cau.cs.kieler.s.s.Continuation;
import de.cau.cs.kieler.s.s.Emit;
import de.cau.cs.kieler.s.s.Fork;
import de.cau.cs.kieler.s.s.Halt;
import de.cau.cs.kieler.s.s.If;
import de.cau.cs.kieler.s.s.Instruction;
import de.cau.cs.kieler.s.s.Join;
import de.cau.cs.kieler.s.s.Pause;
import de.cau.cs.kieler.s.s.Prio;
import de.cau.cs.kieler.s.s.Program;
import de.cau.cs.kieler.s.s.SPackage;
import de.cau.cs.kieler.s.s.State;
import de.cau.cs.kieler.s.s.Term;
import de.cau.cs.kieler.s.s.Trans;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.s.s.SPackage
 * @generated
 */
public class SSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SPackage.PROGRAM:
      {
        Program program = (Program)theEObject;
        T result = caseProgram(program);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPackage.STATE:
      {
        State state = (State)theEObject;
        T result = caseState(state);
        if (result == null) result = caseContinuation(state);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPackage.THREAD:
      {
        de.cau.cs.kieler.s.s.Thread thread = (de.cau.cs.kieler.s.s.Thread)theEObject;
        T result = caseThread(thread);
        if (result == null) result = caseContinuation(thread);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPackage.CONTINUATION:
      {
        Continuation continuation = (Continuation)theEObject;
        T result = caseContinuation(continuation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPackage.INSTRUCTION:
      {
        Instruction instruction = (Instruction)theEObject;
        T result = caseInstruction(instruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPackage.PRIO:
      {
        Prio prio = (Prio)theEObject;
        T result = casePrio(prio);
        if (result == null) result = caseInstruction(prio);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPackage.TRANS:
      {
        Trans trans = (Trans)theEObject;
        T result = caseTrans(trans);
        if (result == null) result = caseInstruction(trans);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPackage.FORK:
      {
        Fork fork = (Fork)theEObject;
        T result = caseFork(fork);
        if (result == null) result = caseInstruction(fork);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPackage.JOIN:
      {
        Join join = (Join)theEObject;
        T result = caseJoin(join);
        if (result == null) result = caseInstruction(join);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPackage.PAUSE:
      {
        Pause pause = (Pause)theEObject;
        T result = casePause(pause);
        if (result == null) result = caseInstruction(pause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPackage.TERM:
      {
        Term term = (Term)theEObject;
        T result = caseTerm(term);
        if (result == null) result = caseInstruction(term);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPackage.HALT:
      {
        Halt halt = (Halt)theEObject;
        T result = caseHalt(halt);
        if (result == null) result = caseInstruction(halt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPackage.EMIT:
      {
        Emit emit = (Emit)theEObject;
        T result = caseEmit(emit);
        if (result == null) result = caseInstruction(emit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPackage.ABORT:
      {
        Abort abort = (Abort)theEObject;
        T result = caseAbort(abort);
        if (result == null) result = caseInstruction(abort);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPackage.IF:
      {
        If if_ = (If)theEObject;
        T result = caseIf(if_);
        if (result == null) result = caseInstruction(if_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPackage.AWAIT:
      {
        Await await = (Await)theEObject;
        T result = caseAwait(await);
        if (result == null) result = caseInstruction(await);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Program</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProgram(Program object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseState(State object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Thread</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Thread</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseThread(de.cau.cs.kieler.s.s.Thread object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Continuation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Continuation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContinuation(Continuation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction(Instruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Prio</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Prio</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrio(Prio object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trans</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trans</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrans(Trans object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fork</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fork</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFork(Fork object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Join</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Join</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJoin(Join object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePause(Pause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTerm(Term object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Halt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Halt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHalt(Halt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Emit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Emit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmit(Emit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abort</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abort</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbort(Abort object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIf(If object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Await</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Await</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAwait(Await object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SSwitch
