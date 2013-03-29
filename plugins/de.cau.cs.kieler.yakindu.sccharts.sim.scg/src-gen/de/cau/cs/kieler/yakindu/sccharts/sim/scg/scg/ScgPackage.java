/**
 */
package de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg;

import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SclPackage;

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
 * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.ScgFactory
 * @model kind="package"
 * @generated
 */
public interface ScgPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "scg";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cau.de/cs/kieler/yakindu/sccharts/sim/scg/scg";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "scg";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ScgPackage eINSTANCE = de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ScgPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.InstructionImpl <em>Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.InstructionImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ScgPackageImpl#getInstruction()
   * @generated
   */
  int INSTRUCTION = 0;

  /**
   * The number of structural features of the '<em>Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FEATURE_COUNT = SclPackage.INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.AssignmentImpl <em>Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.AssignmentImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ScgPackageImpl#getAssignment()
   * @generated
   */
  int ASSIGNMENT = 1;

  /**
   * The feature id for the '<em><b>Assignment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__ASSIGNMENT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__PRIORITY = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Dependencies</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__DEPENDENCIES = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.DependencyImpl <em>Dependency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.DependencyImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ScgPackageImpl#getDependency()
   * @generated
   */
  int DEPENDENCY = 2;

  /**
   * The feature id for the '<em><b>Dependencies</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__DEPENDENCIES = 0;

  /**
   * The number of structural features of the '<em>Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.InstructionSetImpl <em>Instruction Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.InstructionSetImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ScgPackageImpl#getInstructionSet()
   * @generated
   */
  int INSTRUCTION_SET = 3;

  /**
   * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SET__INSTRUCTIONS = SclPackage.INSTRUCTION_SET__INSTRUCTIONS;

  /**
   * The number of structural features of the '<em>Instruction Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SET_FEATURE_COUNT = SclPackage.INSTRUCTION_SET_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.InstructionSetSingleAssignmentImpl <em>Instruction Set Single Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.InstructionSetSingleAssignmentImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ScgPackageImpl#getInstructionSetSingleAssignment()
   * @generated
   */
  int INSTRUCTION_SET_SINGLE_ASSIGNMENT = 4;

  /**
   * The number of structural features of the '<em>Instruction Set Single Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SET_SINGLE_ASSIGNMENT_FEATURE_COUNT = SclPackage.INSTRUCTION_SET_SINGLE_ASSIGNMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.InstructionOrCommentImpl <em>Instruction Or Comment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.InstructionOrCommentImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ScgPackageImpl#getInstructionOrComment()
   * @generated
   */
  int INSTRUCTION_OR_COMMENT = 5;

  /**
   * The number of structural features of the '<em>Instruction Or Comment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_OR_COMMENT_FEATURE_COUNT = SclPackage.INSTRUCTION_OR_COMMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.InstructionOrCommentSequenceImpl <em>Instruction Or Comment Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.InstructionOrCommentSequenceImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ScgPackageImpl#getInstructionOrCommentSequence()
   * @generated
   */
  int INSTRUCTION_OR_COMMENT_SEQUENCE = 6;

  /**
   * The number of structural features of the '<em>Instruction Or Comment Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_OR_COMMENT_SEQUENCE_FEATURE_COUNT = SclPackage.INSTRUCTION_OR_COMMENT_SEQUENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.LabelImpl <em>Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.LabelImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ScgPackageImpl#getLabel()
   * @generated
   */
  int LABEL = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__NAME = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__PRIORITY = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ScopeImpl <em>Scope</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ScopeImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ScgPackageImpl#getScope()
   * @generated
   */
  int SCOPE = 8;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE__VARIABLES = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Scope</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE__SCOPE = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE__PRIORITY = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Scope</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ConditionalImpl <em>Conditional</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ConditionalImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ScgPackageImpl#getConditional()
   * @generated
   */
  int CONDITIONAL = 9;

  /**
   * The feature id for the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL__EXPRESSION = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Conditional</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL__CONDITIONAL = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL__PRIORITY = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Dependencies</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL__DEPENDENCIES = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Conditional</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.GotoImpl <em>Goto</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.GotoImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ScgPackageImpl#getGoto()
   * @generated
   */
  int GOTO = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOTO__NAME = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOTO__PRIORITY = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Goto</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOTO_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ParallelImpl <em>Parallel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ParallelImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ScgPackageImpl#getParallel()
   * @generated
   */
  int PARALLEL = 11;

  /**
   * The feature id for the '<em><b>Threads</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARALLEL__THREADS = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARALLEL__PRIORITY = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Parallel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARALLEL_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.PauseImpl <em>Pause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.PauseImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ScgPackageImpl#getPause()
   * @generated
   */
  int PAUSE = 12;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAUSE__PRIORITY = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Pause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAUSE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.CommentImpl <em>Comment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.CommentImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ScgPackageImpl#getComment()
   * @generated
   */
  int COMMENT = 13;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT__COMMENT = INSTRUCTION_OR_COMMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Comment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT_FEATURE_COUNT = INSTRUCTION_OR_COMMENT_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Instruction
   * @generated
   */
  EClass getInstruction();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Assignment
   * @generated
   */
  EClass getAssignment();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Assignment#getPriority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Priority</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Assignment#getPriority()
   * @see #getAssignment()
   * @generated
   */
  EAttribute getAssignment_Priority();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Assignment#getDependencies <em>Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dependencies</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Assignment#getDependencies()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Dependencies();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Dependency <em>Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dependency</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Dependency
   * @generated
   */
  EClass getDependency();

  /**
   * Returns the meta object for the reference list '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Dependency#getDependencies <em>Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Dependencies</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Dependency#getDependencies()
   * @see #getDependency()
   * @generated
   */
  EReference getDependency_Dependencies();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.InstructionSet <em>Instruction Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction Set</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.InstructionSet
   * @generated
   */
  EClass getInstructionSet();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.InstructionSetSingleAssignment <em>Instruction Set Single Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction Set Single Assignment</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.InstructionSetSingleAssignment
   * @generated
   */
  EClass getInstructionSetSingleAssignment();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.InstructionOrComment <em>Instruction Or Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction Or Comment</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.InstructionOrComment
   * @generated
   */
  EClass getInstructionOrComment();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.InstructionOrCommentSequence <em>Instruction Or Comment Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction Or Comment Sequence</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.InstructionOrCommentSequence
   * @generated
   */
  EClass getInstructionOrCommentSequence();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Label</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Label
   * @generated
   */
  EClass getLabel();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Label#getPriority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Priority</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Label#getPriority()
   * @see #getLabel()
   * @generated
   */
  EAttribute getLabel_Priority();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Scope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scope</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Scope
   * @generated
   */
  EClass getScope();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Scope#getPriority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Priority</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Scope#getPriority()
   * @see #getScope()
   * @generated
   */
  EAttribute getScope_Priority();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Conditional <em>Conditional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Conditional
   * @generated
   */
  EClass getConditional();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Conditional#getPriority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Priority</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Conditional#getPriority()
   * @see #getConditional()
   * @generated
   */
  EAttribute getConditional_Priority();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Conditional#getDependencies <em>Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dependencies</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Conditional#getDependencies()
   * @see #getConditional()
   * @generated
   */
  EReference getConditional_Dependencies();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Goto <em>Goto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goto</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Goto
   * @generated
   */
  EClass getGoto();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Goto#getPriority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Priority</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Goto#getPriority()
   * @see #getGoto()
   * @generated
   */
  EAttribute getGoto_Priority();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Parallel <em>Parallel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parallel</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Parallel
   * @generated
   */
  EClass getParallel();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Parallel#getPriority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Priority</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Parallel#getPriority()
   * @see #getParallel()
   * @generated
   */
  EAttribute getParallel_Priority();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Pause <em>Pause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pause</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Pause
   * @generated
   */
  EClass getPause();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Pause#getPriority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Priority</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Pause#getPriority()
   * @see #getPause()
   * @generated
   */
  EAttribute getPause_Priority();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Comment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comment</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Comment
   * @generated
   */
  EClass getComment();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ScgFactory getScgFactory();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.InstructionImpl <em>Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.InstructionImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ScgPackageImpl#getInstruction()
     * @generated
     */
    EClass INSTRUCTION = eINSTANCE.getInstruction();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.AssignmentImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ScgPackageImpl#getAssignment()
     * @generated
     */
    EClass ASSIGNMENT = eINSTANCE.getAssignment();

    /**
     * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGNMENT__PRIORITY = eINSTANCE.getAssignment_Priority();

    /**
     * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__DEPENDENCIES = eINSTANCE.getAssignment_Dependencies();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.DependencyImpl <em>Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.DependencyImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ScgPackageImpl#getDependency()
     * @generated
     */
    EClass DEPENDENCY = eINSTANCE.getDependency();

    /**
     * The meta object literal for the '<em><b>Dependencies</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPENDENCY__DEPENDENCIES = eINSTANCE.getDependency_Dependencies();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.InstructionSetImpl <em>Instruction Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.InstructionSetImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ScgPackageImpl#getInstructionSet()
     * @generated
     */
    EClass INSTRUCTION_SET = eINSTANCE.getInstructionSet();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.InstructionSetSingleAssignmentImpl <em>Instruction Set Single Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.InstructionSetSingleAssignmentImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ScgPackageImpl#getInstructionSetSingleAssignment()
     * @generated
     */
    EClass INSTRUCTION_SET_SINGLE_ASSIGNMENT = eINSTANCE.getInstructionSetSingleAssignment();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.InstructionOrCommentImpl <em>Instruction Or Comment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.InstructionOrCommentImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ScgPackageImpl#getInstructionOrComment()
     * @generated
     */
    EClass INSTRUCTION_OR_COMMENT = eINSTANCE.getInstructionOrComment();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.InstructionOrCommentSequenceImpl <em>Instruction Or Comment Sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.InstructionOrCommentSequenceImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ScgPackageImpl#getInstructionOrCommentSequence()
     * @generated
     */
    EClass INSTRUCTION_OR_COMMENT_SEQUENCE = eINSTANCE.getInstructionOrCommentSequence();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.LabelImpl <em>Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.LabelImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ScgPackageImpl#getLabel()
     * @generated
     */
    EClass LABEL = eINSTANCE.getLabel();

    /**
     * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL__PRIORITY = eINSTANCE.getLabel_Priority();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ScopeImpl <em>Scope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ScopeImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ScgPackageImpl#getScope()
     * @generated
     */
    EClass SCOPE = eINSTANCE.getScope();

    /**
     * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCOPE__PRIORITY = eINSTANCE.getScope_Priority();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ConditionalImpl <em>Conditional</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ConditionalImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ScgPackageImpl#getConditional()
     * @generated
     */
    EClass CONDITIONAL = eINSTANCE.getConditional();

    /**
     * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITIONAL__PRIORITY = eINSTANCE.getConditional_Priority();

    /**
     * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL__DEPENDENCIES = eINSTANCE.getConditional_Dependencies();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.GotoImpl <em>Goto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.GotoImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ScgPackageImpl#getGoto()
     * @generated
     */
    EClass GOTO = eINSTANCE.getGoto();

    /**
     * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOTO__PRIORITY = eINSTANCE.getGoto_Priority();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ParallelImpl <em>Parallel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ParallelImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ScgPackageImpl#getParallel()
     * @generated
     */
    EClass PARALLEL = eINSTANCE.getParallel();

    /**
     * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARALLEL__PRIORITY = eINSTANCE.getParallel_Priority();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.PauseImpl <em>Pause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.PauseImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ScgPackageImpl#getPause()
     * @generated
     */
    EClass PAUSE = eINSTANCE.getPause();

    /**
     * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAUSE__PRIORITY = eINSTANCE.getPause_Priority();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.CommentImpl <em>Comment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.CommentImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ScgPackageImpl#getComment()
     * @generated
     */
    EClass COMMENT = eINSTANCE.getComment();

  }

} //ScgPackage
