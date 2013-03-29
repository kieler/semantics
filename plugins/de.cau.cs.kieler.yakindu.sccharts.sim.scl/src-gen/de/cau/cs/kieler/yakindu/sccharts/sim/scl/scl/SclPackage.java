/**
 */
package de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl;

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
 * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SclFactory
 * @model kind="package"
 * @generated
 */
public interface SclPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "scl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cau.de/cs/kieler/yakindu/sccharts/sim/scl/scl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "scl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SclPackage eINSTANCE = de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SclPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.ProgramImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SclPackageImpl#getProgram()
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
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__VARIABLES = 1;

  /**
   * The feature id for the '<em><b>Program</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__PROGRAM = 2;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.VariableImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SclPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = 1;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.LocalVariableImpl <em>Local Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.LocalVariableImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SclPackageImpl#getLocalVariable()
   * @generated
   */
  int LOCAL_VARIABLE = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE__NAME = 1;

  /**
   * The number of structural features of the '<em>Local Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.InstructionOrCommentSequenceImpl <em>Instruction Or Comment Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.InstructionOrCommentSequenceImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SclPackageImpl#getInstructionOrCommentSequence()
   * @generated
   */
  int INSTRUCTION_OR_COMMENT_SEQUENCE = 5;

  /**
   * The number of structural features of the '<em>Instruction Or Comment Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_OR_COMMENT_SEQUENCE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.InstructionImpl <em>Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.InstructionImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SclPackageImpl#getInstruction()
   * @generated
   */
  int INSTRUCTION = 3;

  /**
   * The number of structural features of the '<em>Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FEATURE_COUNT = INSTRUCTION_OR_COMMENT_SEQUENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.InstructionSetImpl <em>Instruction Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.InstructionSetImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SclPackageImpl#getInstructionSet()
   * @generated
   */
  int INSTRUCTION_SET = 4;

  /**
   * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SET__INSTRUCTIONS = 0;

  /**
   * The number of structural features of the '<em>Instruction Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SET_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.LabelImpl <em>Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.LabelImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SclPackageImpl#getLabel()
   * @generated
   */
  int LABEL = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__NAME = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.ScopeImpl <em>Scope</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.ScopeImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SclPackageImpl#getScope()
   * @generated
   */
  int SCOPE = 7;

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
   * The number of structural features of the '<em>Scope</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.AssignmentImpl <em>Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.AssignmentImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SclPackageImpl#getAssignment()
   * @generated
   */
  int ASSIGNMENT = 8;

  /**
   * The feature id for the '<em><b>Assignment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__ASSIGNMENT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.ConditionalImpl <em>Conditional</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.ConditionalImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SclPackageImpl#getConditional()
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
   * The number of structural features of the '<em>Conditional</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.GotoImpl <em>Goto</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.GotoImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SclPackageImpl#getGoto()
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
   * The number of structural features of the '<em>Goto</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOTO_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.ParallelImpl <em>Parallel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.ParallelImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SclPackageImpl#getParallel()
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
   * The number of structural features of the '<em>Parallel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARALLEL_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.PauseImpl <em>Pause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.PauseImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SclPackageImpl#getPause()
   * @generated
   */
  int PAUSE = 12;

  /**
   * The number of structural features of the '<em>Pause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAUSE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.CommentImpl <em>Comment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.CommentImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SclPackageImpl#getComment()
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
  int COMMENT__COMMENT = INSTRUCTION_OR_COMMENT_SEQUENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Comment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT_FEATURE_COUNT = INSTRUCTION_OR_COMMENT_SEQUENCE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Program#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Program#getName()
   * @see #getProgram()
   * @generated
   */
  EAttribute getProgram_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Program#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Program#getVariables()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Variables();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Program#getProgram <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Program</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Program#getProgram()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Program();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Variable#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Variable#getType()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Type();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Variable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Variable#getName()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Name();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.LocalVariable <em>Local Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Variable</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.LocalVariable
   * @generated
   */
  EClass getLocalVariable();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.LocalVariable#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.LocalVariable#getType()
   * @see #getLocalVariable()
   * @generated
   */
  EAttribute getLocalVariable_Type();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.LocalVariable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.LocalVariable#getName()
   * @see #getLocalVariable()
   * @generated
   */
  EAttribute getLocalVariable_Name();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Instruction
   * @generated
   */
  EClass getInstruction();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.InstructionSet <em>Instruction Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction Set</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.InstructionSet
   * @generated
   */
  EClass getInstructionSet();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.InstructionSet#getInstructions <em>Instructions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instructions</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.InstructionSet#getInstructions()
   * @see #getInstructionSet()
   * @generated
   */
  EReference getInstructionSet_Instructions();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.InstructionOrCommentSequence <em>Instruction Or Comment Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction Or Comment Sequence</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.InstructionOrCommentSequence
   * @generated
   */
  EClass getInstructionOrCommentSequence();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Label</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Label
   * @generated
   */
  EClass getLabel();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Label#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Label#getName()
   * @see #getLabel()
   * @generated
   */
  EAttribute getLabel_Name();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Scope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scope</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Scope
   * @generated
   */
  EClass getScope();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Scope#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Scope#getVariables()
   * @see #getScope()
   * @generated
   */
  EReference getScope_Variables();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Scope#getScope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Scope</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Scope#getScope()
   * @see #getScope()
   * @generated
   */
  EReference getScope_Scope();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Assignment
   * @generated
   */
  EClass getAssignment();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Assignment#getAssignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Assignment</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Assignment#getAssignment()
   * @see #getAssignment()
   * @generated
   */
  EAttribute getAssignment_Assignment();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Conditional <em>Conditional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Conditional
   * @generated
   */
  EClass getConditional();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Conditional#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expression</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Conditional#getExpression()
   * @see #getConditional()
   * @generated
   */
  EAttribute getConditional_Expression();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Conditional#getConditional <em>Conditional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Conditional</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Conditional#getConditional()
   * @see #getConditional()
   * @generated
   */
  EReference getConditional_Conditional();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Goto <em>Goto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goto</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Goto
   * @generated
   */
  EClass getGoto();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Goto#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Goto#getName()
   * @see #getGoto()
   * @generated
   */
  EAttribute getGoto_Name();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Parallel <em>Parallel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parallel</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Parallel
   * @generated
   */
  EClass getParallel();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Parallel#getThreads <em>Threads</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Threads</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Parallel#getThreads()
   * @see #getParallel()
   * @generated
   */
  EReference getParallel_Threads();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Pause <em>Pause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pause</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Pause
   * @generated
   */
  EClass getPause();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Comment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comment</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Comment
   * @generated
   */
  EClass getComment();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Comment#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Comment#getComment()
   * @see #getComment()
   * @generated
   */
  EAttribute getComment_Comment();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SclFactory getSclFactory();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.ProgramImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SclPackageImpl#getProgram()
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
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__VARIABLES = eINSTANCE.getProgram_Variables();

    /**
     * The meta object literal for the '<em><b>Program</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__PROGRAM = eINSTANCE.getProgram_Program();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.VariableImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SclPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.LocalVariableImpl <em>Local Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.LocalVariableImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SclPackageImpl#getLocalVariable()
     * @generated
     */
    EClass LOCAL_VARIABLE = eINSTANCE.getLocalVariable();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_VARIABLE__TYPE = eINSTANCE.getLocalVariable_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_VARIABLE__NAME = eINSTANCE.getLocalVariable_Name();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.InstructionImpl <em>Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.InstructionImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SclPackageImpl#getInstruction()
     * @generated
     */
    EClass INSTRUCTION = eINSTANCE.getInstruction();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.InstructionSetImpl <em>Instruction Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.InstructionSetImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SclPackageImpl#getInstructionSet()
     * @generated
     */
    EClass INSTRUCTION_SET = eINSTANCE.getInstructionSet();

    /**
     * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_SET__INSTRUCTIONS = eINSTANCE.getInstructionSet_Instructions();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.InstructionOrCommentSequenceImpl <em>Instruction Or Comment Sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.InstructionOrCommentSequenceImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SclPackageImpl#getInstructionOrCommentSequence()
     * @generated
     */
    EClass INSTRUCTION_OR_COMMENT_SEQUENCE = eINSTANCE.getInstructionOrCommentSequence();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.LabelImpl <em>Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.LabelImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SclPackageImpl#getLabel()
     * @generated
     */
    EClass LABEL = eINSTANCE.getLabel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL__NAME = eINSTANCE.getLabel_Name();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.ScopeImpl <em>Scope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.ScopeImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SclPackageImpl#getScope()
     * @generated
     */
    EClass SCOPE = eINSTANCE.getScope();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCOPE__VARIABLES = eINSTANCE.getScope_Variables();

    /**
     * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCOPE__SCOPE = eINSTANCE.getScope_Scope();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.AssignmentImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SclPackageImpl#getAssignment()
     * @generated
     */
    EClass ASSIGNMENT = eINSTANCE.getAssignment();

    /**
     * The meta object literal for the '<em><b>Assignment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGNMENT__ASSIGNMENT = eINSTANCE.getAssignment_Assignment();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.ConditionalImpl <em>Conditional</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.ConditionalImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SclPackageImpl#getConditional()
     * @generated
     */
    EClass CONDITIONAL = eINSTANCE.getConditional();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITIONAL__EXPRESSION = eINSTANCE.getConditional_Expression();

    /**
     * The meta object literal for the '<em><b>Conditional</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL__CONDITIONAL = eINSTANCE.getConditional_Conditional();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.GotoImpl <em>Goto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.GotoImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SclPackageImpl#getGoto()
     * @generated
     */
    EClass GOTO = eINSTANCE.getGoto();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOTO__NAME = eINSTANCE.getGoto_Name();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.ParallelImpl <em>Parallel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.ParallelImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SclPackageImpl#getParallel()
     * @generated
     */
    EClass PARALLEL = eINSTANCE.getParallel();

    /**
     * The meta object literal for the '<em><b>Threads</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARALLEL__THREADS = eINSTANCE.getParallel_Threads();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.PauseImpl <em>Pause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.PauseImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SclPackageImpl#getPause()
     * @generated
     */
    EClass PAUSE = eINSTANCE.getPause();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.CommentImpl <em>Comment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.CommentImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SclPackageImpl#getComment()
     * @generated
     */
    EClass COMMENT = eINSTANCE.getComment();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMENT__COMMENT = eINSTANCE.getComment_Comment();

  }

} //SclPackage
