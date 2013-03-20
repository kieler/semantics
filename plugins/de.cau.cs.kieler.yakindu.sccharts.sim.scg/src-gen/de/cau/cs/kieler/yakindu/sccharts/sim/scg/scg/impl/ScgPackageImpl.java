/**
 */
package de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl;

import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Conditional;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Goto;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Instruction;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Label;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Parallel;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Pause;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.SCLExpression;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.ScgFactory;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.ScgPackage;

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
  private EClass sclExpressionEClass = null;

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
  private EClass labelEClass = null;

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
  public EClass getSCLExpression()
  {
    return sclExpressionEClass;
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
  public EClass getLabel()
  {
    return labelEClass;
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
  public EClass getParallel()
  {
    return parallelEClass;
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
  public EReference getPause_Dependencies()
  {
    return (EReference)pauseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPause_SecondInstructions()
  {
    return (EReference)pauseEClass.getEStructuralFeatures().get(2);
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

    sclExpressionEClass = createEClass(SCL_EXPRESSION);

    conditionalEClass = createEClass(CONDITIONAL);

    labelEClass = createEClass(LABEL);

    gotoEClass = createEClass(GOTO);

    parallelEClass = createEClass(PARALLEL);

    pauseEClass = createEClass(PAUSE);
    createEAttribute(pauseEClass, PAUSE__PRIORITY);
    createEReference(pauseEClass, PAUSE__DEPENDENCIES);
    createEReference(pauseEClass, PAUSE__SECOND_INSTRUCTIONS);
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
    sclExpressionEClass.getESuperTypes().add(this.getInstruction());
    sclExpressionEClass.getESuperTypes().add(theSclPackage.getSCLExpression());
    conditionalEClass.getESuperTypes().add(this.getInstruction());
    conditionalEClass.getESuperTypes().add(theSclPackage.getConditional());
    labelEClass.getESuperTypes().add(this.getInstruction());
    labelEClass.getESuperTypes().add(theSclPackage.getLabel());
    gotoEClass.getESuperTypes().add(this.getInstruction());
    gotoEClass.getESuperTypes().add(theSclPackage.getGoto());
    parallelEClass.getESuperTypes().add(this.getInstruction());
    parallelEClass.getESuperTypes().add(theSclPackage.getParallel());
    pauseEClass.getESuperTypes().add(this.getInstruction());
    pauseEClass.getESuperTypes().add(theSclPackage.getPause());

    // Initialize classes and features; add operations and parameters
    initEClass(instructionEClass, Instruction.class, "Instruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sclExpressionEClass, SCLExpression.class, "SCLExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(conditionalEClass, Conditional.class, "Conditional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(gotoEClass, Goto.class, "Goto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(parallelEClass, Parallel.class, "Parallel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(pauseEClass, Pause.class, "Pause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPause_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, Pause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPause_Dependencies(), this.getInstruction(), null, "dependencies", null, 0, -1, Pause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPause_SecondInstructions(), this.getInstruction(), null, "secondInstructions", null, 0, 1, Pause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //ScgPackageImpl
