/**
 */
package de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl;

import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScgFactoryImpl extends EFactoryImpl implements ScgFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ScgFactory init()
  {
    try
    {
      ScgFactory theScgFactory = (ScgFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.cau.de/cs/kieler/yakindu/sccharts/sim/scg/scg"); 
      if (theScgFactory != null)
      {
        return theScgFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ScgFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScgFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ScgPackage.PROGRAM: return createProgram();
      case ScgPackage.INSTRUCTION: return createInstruction();
      case ScgPackage.INSTRUCTION_SET: return createInstructionSet();
      case ScgPackage.INSTRUCTION_OR_COMMENT_SEQUENCE: return createInstructionOrCommentSequence();
      case ScgPackage.ASSIGNMENT: return createAssignment();
      case ScgPackage.CONDITIONAL: return createConditional();
      case ScgPackage.DEPENDENCY: return createDependency();
      case ScgPackage.COMMENT: return createComment();
      case ScgPackage.PARALLEL: return createParallel();
      case ScgPackage.SCOPE: return createScope();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction createInstruction()
  {
    InstructionImpl instruction = new InstructionImpl();
    return instruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstructionSet createInstructionSet()
  {
    InstructionSetImpl instructionSet = new InstructionSetImpl();
    return instructionSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstructionOrCommentSequence createInstructionOrCommentSequence()
  {
    InstructionOrCommentSequenceImpl instructionOrCommentSequence = new InstructionOrCommentSequenceImpl();
    return instructionOrCommentSequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignment createAssignment()
  {
    AssignmentImpl assignment = new AssignmentImpl();
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Conditional createConditional()
  {
    ConditionalImpl conditional = new ConditionalImpl();
    return conditional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dependency createDependency()
  {
    DependencyImpl dependency = new DependencyImpl();
    return dependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comment createComment()
  {
    CommentImpl comment = new CommentImpl();
    return comment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parallel createParallel()
  {
    ParallelImpl parallel = new ParallelImpl();
    return parallel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scope createScope()
  {
    ScopeImpl scope = new ScopeImpl();
    return scope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScgPackage getScgPackage()
  {
    return (ScgPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ScgPackage getPackage()
  {
    return ScgPackage.eINSTANCE;
  }

} //ScgFactoryImpl
