/**
 */
package de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.util;

import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.ScgPackage
 * @generated
 */
public class ScgAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ScgPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScgAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ScgPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScgSwitch<Adapter> modelSwitch =
    new ScgSwitch<Adapter>()
    {
      @Override
      public Adapter caseInstruction(Instruction object)
      {
        return createInstructionAdapter();
      }
      @Override
      public Adapter caseAssignment(Assignment object)
      {
        return createAssignmentAdapter();
      }
      @Override
      public Adapter caseDependency(Dependency object)
      {
        return createDependencyAdapter();
      }
      @Override
      public Adapter caseInstructionSet(InstructionSet object)
      {
        return createInstructionSetAdapter();
      }
      @Override
      public Adapter caseInstructionSetSingleAssignment(InstructionSetSingleAssignment object)
      {
        return createInstructionSetSingleAssignmentAdapter();
      }
      @Override
      public Adapter caseInstructionOrComment(InstructionOrComment object)
      {
        return createInstructionOrCommentAdapter();
      }
      @Override
      public Adapter caseInstructionOrCommentSequence(InstructionOrCommentSequence object)
      {
        return createInstructionOrCommentSequenceAdapter();
      }
      @Override
      public Adapter caseLabel(Label object)
      {
        return createLabelAdapter();
      }
      @Override
      public Adapter caseScope(Scope object)
      {
        return createScopeAdapter();
      }
      @Override
      public Adapter caseConditional(Conditional object)
      {
        return createConditionalAdapter();
      }
      @Override
      public Adapter caseGoto(Goto object)
      {
        return createGotoAdapter();
      }
      @Override
      public Adapter caseParallel(Parallel object)
      {
        return createParallelAdapter();
      }
      @Override
      public Adapter casePause(Pause object)
      {
        return createPauseAdapter();
      }
      @Override
      public Adapter caseComment(Comment object)
      {
        return createCommentAdapter();
      }
      @Override
      public Adapter caseScl_InstructionSetSingleAssignment(de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.InstructionSetSingleAssignment object)
      {
        return createScl_InstructionSetSingleAssignmentAdapter();
      }
      @Override
      public Adapter caseScl_InstructionOrComment(de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.InstructionOrComment object)
      {
        return createScl_InstructionOrCommentAdapter();
      }
      @Override
      public Adapter caseScl_InstructionOrCommentSequence(de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.InstructionOrCommentSequence object)
      {
        return createScl_InstructionOrCommentSequenceAdapter();
      }
      @Override
      public Adapter caseScl_Instruction(de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Instruction object)
      {
        return createScl_InstructionAdapter();
      }
      @Override
      public Adapter caseScl_Assignment(de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Assignment object)
      {
        return createScl_AssignmentAdapter();
      }
      @Override
      public Adapter caseScl_InstructionSet(de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.InstructionSet object)
      {
        return createScl_InstructionSetAdapter();
      }
      @Override
      public Adapter caseScl_Label(de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Label object)
      {
        return createScl_LabelAdapter();
      }
      @Override
      public Adapter caseScl_Scope(de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Scope object)
      {
        return createScl_ScopeAdapter();
      }
      @Override
      public Adapter caseScl_Conditional(de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Conditional object)
      {
        return createScl_ConditionalAdapter();
      }
      @Override
      public Adapter caseScl_Goto(de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Goto object)
      {
        return createScl_GotoAdapter();
      }
      @Override
      public Adapter caseScl_Parallel(de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Parallel object)
      {
        return createScl_ParallelAdapter();
      }
      @Override
      public Adapter caseScl_Pause(de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Pause object)
      {
        return createScl_PauseAdapter();
      }
      @Override
      public Adapter caseScl_Comment(de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Comment object)
      {
        return createScl_CommentAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Instruction
   * @generated
   */
  public Adapter createInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Assignment
   * @generated
   */
  public Adapter createAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Dependency <em>Dependency</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Dependency
   * @generated
   */
  public Adapter createDependencyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.InstructionSet <em>Instruction Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.InstructionSet
   * @generated
   */
  public Adapter createInstructionSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.InstructionSetSingleAssignment <em>Instruction Set Single Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.InstructionSetSingleAssignment
   * @generated
   */
  public Adapter createInstructionSetSingleAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.InstructionOrComment <em>Instruction Or Comment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.InstructionOrComment
   * @generated
   */
  public Adapter createInstructionOrCommentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.InstructionOrCommentSequence <em>Instruction Or Comment Sequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.InstructionOrCommentSequence
   * @generated
   */
  public Adapter createInstructionOrCommentSequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Label
   * @generated
   */
  public Adapter createLabelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Scope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Scope
   * @generated
   */
  public Adapter createScopeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Conditional <em>Conditional</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Conditional
   * @generated
   */
  public Adapter createConditionalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Goto <em>Goto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Goto
   * @generated
   */
  public Adapter createGotoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Parallel <em>Parallel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Parallel
   * @generated
   */
  public Adapter createParallelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Pause <em>Pause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Pause
   * @generated
   */
  public Adapter createPauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Comment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Comment
   * @generated
   */
  public Adapter createCommentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.InstructionSetSingleAssignment <em>Instruction Set Single Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.InstructionSetSingleAssignment
   * @generated
   */
  public Adapter createScl_InstructionSetSingleAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.InstructionOrComment <em>Instruction Or Comment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.InstructionOrComment
   * @generated
   */
  public Adapter createScl_InstructionOrCommentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.InstructionOrCommentSequence <em>Instruction Or Comment Sequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.InstructionOrCommentSequence
   * @generated
   */
  public Adapter createScl_InstructionOrCommentSequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Instruction
   * @generated
   */
  public Adapter createScl_InstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Assignment
   * @generated
   */
  public Adapter createScl_AssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.InstructionSet <em>Instruction Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.InstructionSet
   * @generated
   */
  public Adapter createScl_InstructionSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Label
   * @generated
   */
  public Adapter createScl_LabelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Scope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Scope
   * @generated
   */
  public Adapter createScl_ScopeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Conditional <em>Conditional</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Conditional
   * @generated
   */
  public Adapter createScl_ConditionalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Goto <em>Goto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Goto
   * @generated
   */
  public Adapter createScl_GotoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Parallel <em>Parallel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Parallel
   * @generated
   */
  public Adapter createScl_ParallelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Pause <em>Pause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Pause
   * @generated
   */
  public Adapter createScl_PauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Comment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Comment
   * @generated
   */
  public Adapter createScl_CommentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ScgAdapterFactory
