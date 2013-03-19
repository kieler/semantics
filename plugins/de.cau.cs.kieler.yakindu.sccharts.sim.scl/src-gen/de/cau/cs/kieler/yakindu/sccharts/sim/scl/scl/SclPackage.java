/**
 */
package de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.yakindu.sct.model.stext.stext.StextPackage;

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
   * The feature id for the '<em><b>Instruction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__INSTRUCTION = 2;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.InstructionImpl <em>Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.InstructionImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SclPackageImpl#getInstruction()
   * @generated
   */
  int INSTRUCTION = 1;

  /**
   * The feature id for the '<em><b>Second Instructions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION__SECOND_INSTRUCTIONS = 0;

  /**
   * The number of structural features of the '<em>Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SCLExpressionImpl <em>SCL Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SCLExpressionImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SclPackageImpl#getSCLExpression()
   * @generated
   */
  int SCL_EXPRESSION = 2;

  /**
   * The feature id for the '<em><b>Second Instructions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCL_EXPRESSION__SECOND_INSTRUCTIONS = StextPackage.EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Assignment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCL_EXPRESSION__ASSIGNMENT = StextPackage.EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>SCL Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCL_EXPRESSION_FEATURE_COUNT = StextPackage.EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.ConditionalImpl <em>Conditional</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.ConditionalImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SclPackageImpl#getConditional()
   * @generated
   */
  int CONDITIONAL = 3;

  /**
   * The feature id for the '<em><b>Second Instructions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL__SECOND_INSTRUCTIONS = INSTRUCTION__SECOND_INSTRUCTIONS;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL__EXPRESSION = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Instructions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL__INSTRUCTIONS = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Conditional</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.LabelImpl <em>Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.LabelImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SclPackageImpl#getLabel()
   * @generated
   */
  int LABEL = 4;

  /**
   * The feature id for the '<em><b>Second Instructions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__SECOND_INSTRUCTIONS = INSTRUCTION__SECOND_INSTRUCTIONS;

  /**
   * The feature id for the '<em><b>Instruction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__INSTRUCTION = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.GotoImpl <em>Goto</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.GotoImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SclPackageImpl#getGoto()
   * @generated
   */
  int GOTO = 5;

  /**
   * The feature id for the '<em><b>Second Instructions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOTO__SECOND_INSTRUCTIONS = INSTRUCTION__SECOND_INSTRUCTIONS;

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
  int PARALLEL = 6;

  /**
   * The feature id for the '<em><b>Second Instructions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARALLEL__SECOND_INSTRUCTIONS = INSTRUCTION__SECOND_INSTRUCTIONS;

  /**
   * The feature id for the '<em><b>First Instruction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARALLEL__FIRST_INSTRUCTION = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Second Instruction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARALLEL__SECOND_INSTRUCTION = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Parallel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARALLEL_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;


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
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Program#getInstruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Instruction</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Program#getInstruction()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Instruction();

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
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Instruction#getSecondInstructions <em>Second Instructions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Second Instructions</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Instruction#getSecondInstructions()
   * @see #getInstruction()
   * @generated
   */
  EReference getInstruction_SecondInstructions();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SCLExpression <em>SCL Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SCL Expression</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SCLExpression
   * @generated
   */
  EClass getSCLExpression();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SCLExpression#getAssignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Assignment</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SCLExpression#getAssignment()
   * @see #getSCLExpression()
   * @generated
   */
  EAttribute getSCLExpression_Assignment();

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
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Conditional#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Conditional#getExpression()
   * @see #getConditional()
   * @generated
   */
  EReference getConditional_Expression();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Conditional#getInstructions <em>Instructions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Instructions</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Conditional#getInstructions()
   * @see #getConditional()
   * @generated
   */
  EReference getConditional_Instructions();

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
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Label#getInstruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Instruction</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Label#getInstruction()
   * @see #getLabel()
   * @generated
   */
  EReference getLabel_Instruction();

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
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Parallel#getFirstInstruction <em>First Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>First Instruction</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Parallel#getFirstInstruction()
   * @see #getParallel()
   * @generated
   */
  EReference getParallel_FirstInstruction();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Parallel#getSecondInstruction <em>Second Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Second Instruction</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Parallel#getSecondInstruction()
   * @see #getParallel()
   * @generated
   */
  EReference getParallel_SecondInstruction();

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
     * The meta object literal for the '<em><b>Instruction</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__INSTRUCTION = eINSTANCE.getProgram_Instruction();

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
     * The meta object literal for the '<em><b>Second Instructions</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION__SECOND_INSTRUCTIONS = eINSTANCE.getInstruction_SecondInstructions();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SCLExpressionImpl <em>SCL Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SCLExpressionImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SclPackageImpl#getSCLExpression()
     * @generated
     */
    EClass SCL_EXPRESSION = eINSTANCE.getSCLExpression();

    /**
     * The meta object literal for the '<em><b>Assignment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCL_EXPRESSION__ASSIGNMENT = eINSTANCE.getSCLExpression_Assignment();

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
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL__EXPRESSION = eINSTANCE.getConditional_Expression();

    /**
     * The meta object literal for the '<em><b>Instructions</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL__INSTRUCTIONS = eINSTANCE.getConditional_Instructions();

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
     * The meta object literal for the '<em><b>Instruction</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABEL__INSTRUCTION = eINSTANCE.getLabel_Instruction();

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
     * The meta object literal for the '<em><b>First Instruction</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARALLEL__FIRST_INSTRUCTION = eINSTANCE.getParallel_FirstInstruction();

    /**
     * The meta object literal for the '<em><b>Second Instruction</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARALLEL__SECOND_INSTRUCTION = eINSTANCE.getParallel_SecondInstruction();

  }

} //SclPackage
