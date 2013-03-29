/**
 */
package de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl;

import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Assignment;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Comment;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Conditional;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Dependency;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Goto;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Instruction;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.InstructionOrComment;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.InstructionOrCommentSequence;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.InstructionSet;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.InstructionSetSingleAssignment;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Label;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Parallel;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Pause;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.ScgFactory;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.ScgPackage;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Scope;

import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SclPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScgPackageImpl extends EPackageImpl implements ScgPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dependencyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instructionSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instructionSetSingleAssignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instructionOrCommentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instructionOrCommentSequenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass labelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scopeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gotoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parallelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commentEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.ScgPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ScgPackageImpl()
  {
    super(eNS_URI, ScgFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ScgPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ScgPackage init()
  {
    if (isInited) return (ScgPackage)EPackage.Registry.INSTANCE.getEPackage(ScgPackage.eNS_URI);

    // Obtain or create and register package
    ScgPackageImpl theScgPackage = (ScgPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ScgPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ScgPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    SclPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theScgPackage.createPackageContents();

    // Initialize created meta-data
    theScgPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theScgPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ScgPackage.eNS_URI, theScgPackage);
    return theScgPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction()
  {
    return instructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssignment()
  {
    return assignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssignment_Priority()
  {
    return (EAttribute)assignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignment_Dependencies()
  {
    return (EReference)assignmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDependency()
  {
    return dependencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDependency_Dependencies()
  {
    return (EReference)dependencyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstructionSet()
  {
    return instructionSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstructionSetSingleAssignment()
  {
    return instructionSetSingleAssignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstructionOrComment()
  {
    return instructionOrCommentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstructionOrCommentSequence()
  {
    return instructionOrCommentSequenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLabel()
  {
    return labelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLabel_Priority()
  {
    return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScope()
  {
    return scopeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScope_Priority()
  {
    return (EAttribute)scopeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditional()
  {
    return conditionalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConditional_Priority()
  {
    return (EAttribute)conditionalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditional_Dependencies()
  {
    return (EReference)conditionalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGoto()
  {
    return gotoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGoto_Priority()
  {
    return (EAttribute)gotoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParallel()
  {
    return parallelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParallel_Priority()
  {
    return (EAttribute)parallelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPause()
  {
    return pauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPause_Priority()
  {
    return (EAttribute)pauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComment()
  {
    return commentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScgFactory getScgFactory()
  {
    return (ScgFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    instructionEClass = createEClass(INSTRUCTION);

    assignmentEClass = createEClass(ASSIGNMENT);
    createEAttribute(assignmentEClass, ASSIGNMENT__PRIORITY);
    createEReference(assignmentEClass, ASSIGNMENT__DEPENDENCIES);

    dependencyEClass = createEClass(DEPENDENCY);
    createEReference(dependencyEClass, DEPENDENCY__DEPENDENCIES);

    instructionSetEClass = createEClass(INSTRUCTION_SET);

    instructionSetSingleAssignmentEClass = createEClass(INSTRUCTION_SET_SINGLE_ASSIGNMENT);

    instructionOrCommentEClass = createEClass(INSTRUCTION_OR_COMMENT);

    instructionOrCommentSequenceEClass = createEClass(INSTRUCTION_OR_COMMENT_SEQUENCE);

    labelEClass = createEClass(LABEL);
    createEAttribute(labelEClass, LABEL__PRIORITY);

    scopeEClass = createEClass(SCOPE);
    createEAttribute(scopeEClass, SCOPE__PRIORITY);

    conditionalEClass = createEClass(CONDITIONAL);
    createEAttribute(conditionalEClass, CONDITIONAL__PRIORITY);
    createEReference(conditionalEClass, CONDITIONAL__DEPENDENCIES);

    gotoEClass = createEClass(GOTO);
    createEAttribute(gotoEClass, GOTO__PRIORITY);

    parallelEClass = createEClass(PARALLEL);
    createEAttribute(parallelEClass, PARALLEL__PRIORITY);

    pauseEClass = createEClass(PAUSE);
    createEAttribute(pauseEClass, PAUSE__PRIORITY);

    commentEClass = createEClass(COMMENT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    SclPackage theSclPackage = (SclPackage)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    instructionEClass.getESuperTypes().add(theSclPackage.getInstruction());
    instructionEClass.getESuperTypes().add(this.getInstructionSetSingleAssignment());
    instructionEClass.getESuperTypes().add(this.getInstructionOrComment());
    instructionEClass.getESuperTypes().add(this.getInstructionOrCommentSequence());
    assignmentEClass.getESuperTypes().add(this.getInstruction());
    assignmentEClass.getESuperTypes().add(theSclPackage.getAssignment());
    instructionSetEClass.getESuperTypes().add(theSclPackage.getInstructionSet());
    instructionSetSingleAssignmentEClass.getESuperTypes().add(theSclPackage.getInstructionSetSingleAssignment());
    instructionOrCommentEClass.getESuperTypes().add(theSclPackage.getInstructionOrComment());
    instructionOrCommentSequenceEClass.getESuperTypes().add(theSclPackage.getInstructionOrCommentSequence());
    labelEClass.getESuperTypes().add(this.getInstruction());
    labelEClass.getESuperTypes().add(theSclPackage.getLabel());
    scopeEClass.getESuperTypes().add(this.getInstruction());
    scopeEClass.getESuperTypes().add(theSclPackage.getScope());
    conditionalEClass.getESuperTypes().add(this.getInstruction());
    conditionalEClass.getESuperTypes().add(theSclPackage.getConditional());
    gotoEClass.getESuperTypes().add(this.getInstruction());
    gotoEClass.getESuperTypes().add(theSclPackage.getGoto());
    parallelEClass.getESuperTypes().add(this.getInstruction());
    parallelEClass.getESuperTypes().add(theSclPackage.getParallel());
    pauseEClass.getESuperTypes().add(this.getInstruction());
    pauseEClass.getESuperTypes().add(theSclPackage.getPause());
    commentEClass.getESuperTypes().add(this.getInstructionOrComment());
    commentEClass.getESuperTypes().add(this.getInstructionOrCommentSequence());
    commentEClass.getESuperTypes().add(theSclPackage.getComment());

    // Initialize classes and features; add operations and parameters
    initEClass(instructionEClass, Instruction.class, "Instruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAssignment_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssignment_Dependencies(), this.getDependency(), null, "dependencies", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDependency_Dependencies(), this.getAssignment(), null, "dependencies", null, 0, -1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instructionSetEClass, InstructionSet.class, "InstructionSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(instructionSetSingleAssignmentEClass, InstructionSetSingleAssignment.class, "InstructionSetSingleAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(instructionOrCommentEClass, InstructionOrComment.class, "InstructionOrComment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(instructionOrCommentSequenceEClass, InstructionOrCommentSequence.class, "InstructionOrCommentSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLabel_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scopeEClass, Scope.class, "Scope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getScope_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionalEClass, Conditional.class, "Conditional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConditional_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConditional_Dependencies(), this.getDependency(), null, "dependencies", null, 0, 1, Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(gotoEClass, Goto.class, "Goto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGoto_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, Goto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parallelEClass, Parallel.class, "Parallel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParallel_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, Parallel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pauseEClass, Pause.class, "Pause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPause_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, Pause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //ScgPackageImpl
