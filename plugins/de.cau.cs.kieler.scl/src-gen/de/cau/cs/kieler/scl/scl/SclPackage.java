/**
 */
package de.cau.cs.kieler.scl.scl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.yakindu.sct.model.sgraph.SGraphPackage;

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
 * @see de.cau.cs.kieler.scl.scl.SclFactory
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
  String eNS_URI = "http://www.cau.de/cs/kieler/scl/scl";

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
  SclPackage eINSTANCE = de.cau.cs.kieler.scl.scl.impl.SclPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.scl.scl.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.scl.scl.impl.ProgramImpl
   * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getProgram()
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
   * The feature id for the '<em><b>Interface</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__INTERFACE = 1;

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
   * The meta object id for the '{@link de.cau.cs.kieler.scl.scl.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.scl.scl.impl.VariableDeclarationImpl
   * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getVariableDeclaration()
   * @generated
   */
  int VARIABLE_DECLARATION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__NAME = SGraphPackage.VARIABLE__NAME;

  /**
   * The feature id for the '<em><b>Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__INPUT = SGraphPackage.VARIABLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Output</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__OUTPUT = SGraphPackage.VARIABLE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__TYPE = SGraphPackage.VARIABLE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_FEATURE_COUNT = SGraphPackage.VARIABLE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.scl.scl.impl.InstructionImpl <em>Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.scl.scl.impl.InstructionImpl
   * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getInstruction()
   * @generated
   */
  int INSTRUCTION = 2;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION__PRIORITY = 0;

  /**
   * The number of structural features of the '<em>Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.scl.scl.impl.AssignmentImpl <em>Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.scl.scl.impl.AssignmentImpl
   * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getAssignment()
   * @generated
   */
  int ASSIGNMENT = 3;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__PRIORITY = INSTRUCTION__PRIORITY;

  /**
   * The feature id for the '<em><b>Assignment</b></em>' containment reference.
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
   * The meta object id for the '{@link de.cau.cs.kieler.scl.scl.impl.InstructionListImpl <em>Instruction List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.scl.scl.impl.InstructionListImpl
   * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getInstructionList()
   * @generated
   */
  int INSTRUCTION_LIST = 4;

  /**
   * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_LIST__INSTRUCTIONS = 0;

  /**
   * The feature id for the '<em><b>Interface</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_LIST__INTERFACE = 1;

  /**
   * The number of structural features of the '<em>Instruction List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_LIST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.scl.scl.impl.LabelImpl <em>Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.scl.scl.impl.LabelImpl
   * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getLabel()
   * @generated
   */
  int LABEL = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__NAME = 0;

  /**
   * The number of structural features of the '<em>Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.scl.scl.impl.ConditionalImpl <em>Conditional</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.scl.scl.impl.ConditionalImpl
   * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getConditional()
   * @generated
   */
  int CONDITIONAL = 6;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL__PRIORITY = INSTRUCTION__PRIORITY;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
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
   * The meta object id for the '{@link de.cau.cs.kieler.scl.scl.impl.GotoImpl <em>Goto</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.scl.scl.impl.GotoImpl
   * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getGoto()
   * @generated
   */
  int GOTO = 7;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOTO__PRIORITY = INSTRUCTION__PRIORITY;

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
   * The meta object id for the '{@link de.cau.cs.kieler.scl.scl.impl.ParallelImpl <em>Parallel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.scl.scl.impl.ParallelImpl
   * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getParallel()
   * @generated
   */
  int PARALLEL = 8;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARALLEL__PRIORITY = INSTRUCTION__PRIORITY;

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
   * The meta object id for the '{@link de.cau.cs.kieler.scl.scl.impl.PauseImpl <em>Pause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.scl.scl.impl.PauseImpl
   * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getPause()
   * @generated
   */
  int PAUSE = 9;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAUSE__PRIORITY = INSTRUCTION__PRIORITY;

  /**
   * The number of structural features of the '<em>Pause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAUSE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.scl.scl.impl.AnnotationImpl <em>Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.scl.scl.impl.AnnotationImpl
   * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getAnnotation()
   * @generated
   */
  int ANNOTATION = 10;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__COMMENT = 0;

  /**
   * The number of structural features of the '<em>Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.scl.scl.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see de.cau.cs.kieler.scl.scl.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scl.scl.Program#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.scl.scl.Program#getName()
   * @see #getProgram()
   * @generated
   */
  EAttribute getProgram_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scl.scl.Program#getInterface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Interface</em>'.
   * @see de.cau.cs.kieler.scl.scl.Program#getInterface()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Interface();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.scl.scl.Program#getProgram <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Program</em>'.
   * @see de.cau.cs.kieler.scl.scl.Program#getProgram()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Program();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.scl.scl.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Declaration</em>'.
   * @see de.cau.cs.kieler.scl.scl.VariableDeclaration
   * @generated
   */
  EClass getVariableDeclaration();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scl.scl.VariableDeclaration#isInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Input</em>'.
   * @see de.cau.cs.kieler.scl.scl.VariableDeclaration#isInput()
   * @see #getVariableDeclaration()
   * @generated
   */
  EAttribute getVariableDeclaration_Input();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scl.scl.VariableDeclaration#isOutput <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Output</em>'.
   * @see de.cau.cs.kieler.scl.scl.VariableDeclaration#isOutput()
   * @see #getVariableDeclaration()
   * @generated
   */
  EAttribute getVariableDeclaration_Output();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.scl.scl.VariableDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.cau.cs.kieler.scl.scl.VariableDeclaration#getType()
   * @see #getVariableDeclaration()
   * @generated
   */
  EReference getVariableDeclaration_Type();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.scl.scl.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction</em>'.
   * @see de.cau.cs.kieler.scl.scl.Instruction
   * @generated
   */
  EClass getInstruction();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scl.scl.Instruction#getPriority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Priority</em>'.
   * @see de.cau.cs.kieler.scl.scl.Instruction#getPriority()
   * @see #getInstruction()
   * @generated
   */
  EAttribute getInstruction_Priority();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.scl.scl.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment</em>'.
   * @see de.cau.cs.kieler.scl.scl.Assignment
   * @generated
   */
  EClass getAssignment();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.scl.scl.Assignment#getAssignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assignment</em>'.
   * @see de.cau.cs.kieler.scl.scl.Assignment#getAssignment()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Assignment();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.scl.scl.InstructionList <em>Instruction List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction List</em>'.
   * @see de.cau.cs.kieler.scl.scl.InstructionList
   * @generated
   */
  EClass getInstructionList();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scl.scl.InstructionList#getInstructions <em>Instructions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instructions</em>'.
   * @see de.cau.cs.kieler.scl.scl.InstructionList#getInstructions()
   * @see #getInstructionList()
   * @generated
   */
  EReference getInstructionList_Instructions();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scl.scl.InstructionList#getInterface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Interface</em>'.
   * @see de.cau.cs.kieler.scl.scl.InstructionList#getInterface()
   * @see #getInstructionList()
   * @generated
   */
  EReference getInstructionList_Interface();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.scl.scl.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Label</em>'.
   * @see de.cau.cs.kieler.scl.scl.Label
   * @generated
   */
  EClass getLabel();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scl.scl.Label#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.scl.scl.Label#getName()
   * @see #getLabel()
   * @generated
   */
  EAttribute getLabel_Name();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.scl.scl.Conditional <em>Conditional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional</em>'.
   * @see de.cau.cs.kieler.scl.scl.Conditional
   * @generated
   */
  EClass getConditional();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.scl.scl.Conditional#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.cau.cs.kieler.scl.scl.Conditional#getExpression()
   * @see #getConditional()
   * @generated
   */
  EReference getConditional_Expression();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.scl.scl.Conditional#getConditional <em>Conditional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Conditional</em>'.
   * @see de.cau.cs.kieler.scl.scl.Conditional#getConditional()
   * @see #getConditional()
   * @generated
   */
  EReference getConditional_Conditional();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.scl.scl.Goto <em>Goto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goto</em>'.
   * @see de.cau.cs.kieler.scl.scl.Goto
   * @generated
   */
  EClass getGoto();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scl.scl.Goto#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.scl.scl.Goto#getName()
   * @see #getGoto()
   * @generated
   */
  EAttribute getGoto_Name();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.scl.scl.Parallel <em>Parallel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parallel</em>'.
   * @see de.cau.cs.kieler.scl.scl.Parallel
   * @generated
   */
  EClass getParallel();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scl.scl.Parallel#getThreads <em>Threads</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Threads</em>'.
   * @see de.cau.cs.kieler.scl.scl.Parallel#getThreads()
   * @see #getParallel()
   * @generated
   */
  EReference getParallel_Threads();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.scl.scl.Pause <em>Pause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pause</em>'.
   * @see de.cau.cs.kieler.scl.scl.Pause
   * @generated
   */
  EClass getPause();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.scl.scl.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation</em>'.
   * @see de.cau.cs.kieler.scl.scl.Annotation
   * @generated
   */
  EClass getAnnotation();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scl.scl.Annotation#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see de.cau.cs.kieler.scl.scl.Annotation#getComment()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Comment();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.scl.scl.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scl.scl.impl.ProgramImpl
     * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getProgram()
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
     * The meta object literal for the '<em><b>Interface</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__INTERFACE = eINSTANCE.getProgram_Interface();

    /**
     * The meta object literal for the '<em><b>Program</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__PROGRAM = eINSTANCE.getProgram_Program();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.scl.scl.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scl.scl.impl.VariableDeclarationImpl
     * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getVariableDeclaration()
     * @generated
     */
    EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECLARATION__INPUT = eINSTANCE.getVariableDeclaration_Input();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECLARATION__OUTPUT = eINSTANCE.getVariableDeclaration_Output();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION__TYPE = eINSTANCE.getVariableDeclaration_Type();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.scl.scl.impl.InstructionImpl <em>Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scl.scl.impl.InstructionImpl
     * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getInstruction()
     * @generated
     */
    EClass INSTRUCTION = eINSTANCE.getInstruction();

    /**
     * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION__PRIORITY = eINSTANCE.getInstruction_Priority();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.scl.scl.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scl.scl.impl.AssignmentImpl
     * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getAssignment()
     * @generated
     */
    EClass ASSIGNMENT = eINSTANCE.getAssignment();

    /**
     * The meta object literal for the '<em><b>Assignment</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__ASSIGNMENT = eINSTANCE.getAssignment_Assignment();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.scl.scl.impl.InstructionListImpl <em>Instruction List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scl.scl.impl.InstructionListImpl
     * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getInstructionList()
     * @generated
     */
    EClass INSTRUCTION_LIST = eINSTANCE.getInstructionList();

    /**
     * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_LIST__INSTRUCTIONS = eINSTANCE.getInstructionList_Instructions();

    /**
     * The meta object literal for the '<em><b>Interface</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_LIST__INTERFACE = eINSTANCE.getInstructionList_Interface();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.scl.scl.impl.LabelImpl <em>Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scl.scl.impl.LabelImpl
     * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getLabel()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.scl.scl.impl.ConditionalImpl <em>Conditional</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scl.scl.impl.ConditionalImpl
     * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getConditional()
     * @generated
     */
    EClass CONDITIONAL = eINSTANCE.getConditional();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL__EXPRESSION = eINSTANCE.getConditional_Expression();

    /**
     * The meta object literal for the '<em><b>Conditional</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL__CONDITIONAL = eINSTANCE.getConditional_Conditional();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.scl.scl.impl.GotoImpl <em>Goto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scl.scl.impl.GotoImpl
     * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getGoto()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.scl.scl.impl.ParallelImpl <em>Parallel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scl.scl.impl.ParallelImpl
     * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getParallel()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.scl.scl.impl.PauseImpl <em>Pause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scl.scl.impl.PauseImpl
     * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getPause()
     * @generated
     */
    EClass PAUSE = eINSTANCE.getPause();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.scl.scl.impl.AnnotationImpl <em>Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scl.scl.impl.AnnotationImpl
     * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getAnnotation()
     * @generated
     */
    EClass ANNOTATION = eINSTANCE.getAnnotation();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION__COMMENT = eINSTANCE.getAnnotation_Comment();

  }

} //SclPackage
