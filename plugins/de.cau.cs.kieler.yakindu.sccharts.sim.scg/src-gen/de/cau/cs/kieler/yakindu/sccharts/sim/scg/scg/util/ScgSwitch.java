/**
 */
package de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.util;

import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.*;

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
 * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.ScgPackage
 * @generated
 */
public class ScgSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ScgPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScgSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ScgPackage.eINSTANCE;
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
      case ScgPackage.INSTRUCTION:
      {
        Instruction instruction = (Instruction)theEObject;
        T result = caseInstruction(instruction);
        if (result == null) result = caseScl_Instruction(instruction);
        if (result == null) result = caseInstructionSetSingleAssignment(instruction);
        if (result == null) result = caseInstructionOrComment(instruction);
        if (result == null) result = caseInstructionOrCommentSequence(instruction);
        if (result == null) result = caseScl_InstructionSetSingleAssignment(instruction);
        if (result == null) result = caseScl_InstructionOrComment(instruction);
        if (result == null) result = caseScl_InstructionOrCommentSequence(instruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScgPackage.ASSIGNMENT:
      {
        Assignment assignment = (Assignment)theEObject;
        T result = caseAssignment(assignment);
        if (result == null) result = caseInstruction(assignment);
        if (result == null) result = caseScl_Assignment(assignment);
        if (result == null) result = caseScl_Instruction(assignment);
        if (result == null) result = caseInstructionSetSingleAssignment(assignment);
        if (result == null) result = caseInstructionOrComment(assignment);
        if (result == null) result = caseInstructionOrCommentSequence(assignment);
        if (result == null) result = caseScl_InstructionSetSingleAssignment(assignment);
        if (result == null) result = caseScl_InstructionOrComment(assignment);
        if (result == null) result = caseScl_InstructionOrCommentSequence(assignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScgPackage.DEPENDENCY:
      {
        Dependency dependency = (Dependency)theEObject;
        T result = caseDependency(dependency);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScgPackage.INSTRUCTION_SET:
      {
        InstructionSet instructionSet = (InstructionSet)theEObject;
        T result = caseInstructionSet(instructionSet);
        if (result == null) result = caseScl_InstructionSet(instructionSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScgPackage.INSTRUCTION_SET_SINGLE_ASSIGNMENT:
      {
        InstructionSetSingleAssignment instructionSetSingleAssignment = (InstructionSetSingleAssignment)theEObject;
        T result = caseInstructionSetSingleAssignment(instructionSetSingleAssignment);
        if (result == null) result = caseScl_InstructionSetSingleAssignment(instructionSetSingleAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScgPackage.INSTRUCTION_OR_COMMENT:
      {
        InstructionOrComment instructionOrComment = (InstructionOrComment)theEObject;
        T result = caseInstructionOrComment(instructionOrComment);
        if (result == null) result = caseScl_InstructionOrComment(instructionOrComment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScgPackage.INSTRUCTION_OR_COMMENT_SEQUENCE:
      {
        InstructionOrCommentSequence instructionOrCommentSequence = (InstructionOrCommentSequence)theEObject;
        T result = caseInstructionOrCommentSequence(instructionOrCommentSequence);
        if (result == null) result = caseScl_InstructionOrCommentSequence(instructionOrCommentSequence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScgPackage.LABEL:
      {
        Label label = (Label)theEObject;
        T result = caseLabel(label);
        if (result == null) result = caseInstruction(label);
        if (result == null) result = caseScl_Label(label);
        if (result == null) result = caseScl_Instruction(label);
        if (result == null) result = caseInstructionSetSingleAssignment(label);
        if (result == null) result = caseInstructionOrComment(label);
        if (result == null) result = caseInstructionOrCommentSequence(label);
        if (result == null) result = caseScl_InstructionSetSingleAssignment(label);
        if (result == null) result = caseScl_InstructionOrComment(label);
        if (result == null) result = caseScl_InstructionOrCommentSequence(label);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScgPackage.SCOPE:
      {
        Scope scope = (Scope)theEObject;
        T result = caseScope(scope);
        if (result == null) result = caseInstruction(scope);
        if (result == null) result = caseScl_Scope(scope);
        if (result == null) result = caseScl_Instruction(scope);
        if (result == null) result = caseInstructionSetSingleAssignment(scope);
        if (result == null) result = caseInstructionOrComment(scope);
        if (result == null) result = caseInstructionOrCommentSequence(scope);
        if (result == null) result = caseScl_InstructionSetSingleAssignment(scope);
        if (result == null) result = caseScl_InstructionOrComment(scope);
        if (result == null) result = caseScl_InstructionOrCommentSequence(scope);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScgPackage.CONDITIONAL:
      {
        Conditional conditional = (Conditional)theEObject;
        T result = caseConditional(conditional);
        if (result == null) result = caseInstruction(conditional);
        if (result == null) result = caseScl_Conditional(conditional);
        if (result == null) result = caseScl_Instruction(conditional);
        if (result == null) result = caseInstructionSetSingleAssignment(conditional);
        if (result == null) result = caseInstructionOrComment(conditional);
        if (result == null) result = caseInstructionOrCommentSequence(conditional);
        if (result == null) result = caseScl_InstructionSetSingleAssignment(conditional);
        if (result == null) result = caseScl_InstructionOrComment(conditional);
        if (result == null) result = caseScl_InstructionOrCommentSequence(conditional);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScgPackage.GOTO:
      {
        Goto goto_ = (Goto)theEObject;
        T result = caseGoto(goto_);
        if (result == null) result = caseInstruction(goto_);
        if (result == null) result = caseScl_Goto(goto_);
        if (result == null) result = caseScl_Instruction(goto_);
        if (result == null) result = caseInstructionSetSingleAssignment(goto_);
        if (result == null) result = caseInstructionOrComment(goto_);
        if (result == null) result = caseInstructionOrCommentSequence(goto_);
        if (result == null) result = caseScl_InstructionSetSingleAssignment(goto_);
        if (result == null) result = caseScl_InstructionOrComment(goto_);
        if (result == null) result = caseScl_InstructionOrCommentSequence(goto_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScgPackage.PARALLEL:
      {
        Parallel parallel = (Parallel)theEObject;
        T result = caseParallel(parallel);
        if (result == null) result = caseInstruction(parallel);
        if (result == null) result = caseScl_Parallel(parallel);
        if (result == null) result = caseScl_Instruction(parallel);
        if (result == null) result = caseInstructionSetSingleAssignment(parallel);
        if (result == null) result = caseInstructionOrComment(parallel);
        if (result == null) result = caseInstructionOrCommentSequence(parallel);
        if (result == null) result = caseScl_InstructionSetSingleAssignment(parallel);
        if (result == null) result = caseScl_InstructionOrComment(parallel);
        if (result == null) result = caseScl_InstructionOrCommentSequence(parallel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScgPackage.PAUSE:
      {
        Pause pause = (Pause)theEObject;
        T result = casePause(pause);
        if (result == null) result = caseInstruction(pause);
        if (result == null) result = caseScl_Pause(pause);
        if (result == null) result = caseScl_Instruction(pause);
        if (result == null) result = caseInstructionSetSingleAssignment(pause);
        if (result == null) result = caseInstructionOrComment(pause);
        if (result == null) result = caseInstructionOrCommentSequence(pause);
        if (result == null) result = caseScl_InstructionSetSingleAssignment(pause);
        if (result == null) result = caseScl_InstructionOrComment(pause);
        if (result == null) result = caseScl_InstructionOrCommentSequence(pause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScgPackage.COMMENT:
      {
        Comment comment = (Comment)theEObject;
        T result = caseComment(comment);
        if (result == null) result = caseInstructionOrComment(comment);
        if (result == null) result = caseInstructionOrCommentSequence(comment);
        if (result == null) result = caseScl_Comment(comment);
        if (result == null) result = caseScl_InstructionOrComment(comment);
        if (result == null) result = caseScl_InstructionOrCommentSequence(comment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
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
   * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignment(Assignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dependency</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dependency</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDependency(Dependency object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstructionSet(InstructionSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction Set Single Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction Set Single Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstructionSetSingleAssignment(InstructionSetSingleAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction Or Comment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction Or Comment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstructionOrComment(InstructionOrComment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction Or Comment Sequence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction Or Comment Sequence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstructionOrCommentSequence(InstructionOrCommentSequence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Label</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLabel(Label object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scope</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scope</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScope(Scope object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conditional</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conditional</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditional(Conditional object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Goto</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Goto</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGoto(Goto object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parallel</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parallel</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParallel(Parallel object)
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
   * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComment(Comment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction Set Single Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction Set Single Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScl_InstructionSetSingleAssignment(de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.InstructionSetSingleAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction Or Comment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction Or Comment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScl_InstructionOrComment(de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.InstructionOrComment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction Or Comment Sequence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction Or Comment Sequence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScl_InstructionOrCommentSequence(de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.InstructionOrCommentSequence object)
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
  public T caseScl_Instruction(de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Instruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScl_Assignment(de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Assignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScl_InstructionSet(de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.InstructionSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Label</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScl_Label(de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Label object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scope</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scope</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScl_Scope(de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Scope object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conditional</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conditional</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScl_Conditional(de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Conditional object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Goto</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Goto</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScl_Goto(de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Goto object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parallel</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parallel</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScl_Parallel(de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Parallel object)
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
  public T caseScl_Pause(de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Pause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScl_Comment(de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Comment object)
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

} //ScgSwitch
