/**
 */
package de.cau.cs.kieler.esterel.esterel.impl;

import de.cau.cs.kieler.annotations.AnnotationsPackage;

import de.cau.cs.kieler.esterel.esterel.Abort;
import de.cau.cs.kieler.esterel.esterel.Await;
import de.cau.cs.kieler.esterel.esterel.Block;
import de.cau.cs.kieler.esterel.esterel.Case;
import de.cau.cs.kieler.esterel.esterel.Constant;
import de.cau.cs.kieler.esterel.esterel.ConstantDecls;
import de.cau.cs.kieler.esterel.esterel.ConstantExpression;
import de.cau.cs.kieler.esterel.esterel.ConstantRenaming;
import de.cau.cs.kieler.esterel.esterel.DelayExpr;
import de.cau.cs.kieler.esterel.esterel.Do;
import de.cau.cs.kieler.esterel.esterel.ElsIf;
import de.cau.cs.kieler.esterel.esterel.Emit;
import de.cau.cs.kieler.esterel.esterel.EsterelAssignment;
import de.cau.cs.kieler.esterel.esterel.EsterelFactory;
import de.cau.cs.kieler.esterel.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.esterel.EsterelParallel;
import de.cau.cs.kieler.esterel.esterel.EsterelThread;
import de.cau.cs.kieler.esterel.esterel.EsterelType;
import de.cau.cs.kieler.esterel.esterel.EveryDo;
import de.cau.cs.kieler.esterel.esterel.Exec;
import de.cau.cs.kieler.esterel.esterel.ExecCase;
import de.cau.cs.kieler.esterel.esterel.Exit;
import de.cau.cs.kieler.esterel.esterel.Function;
import de.cau.cs.kieler.esterel.esterel.FunctionDecl;
import de.cau.cs.kieler.esterel.esterel.FunctionExpression;
import de.cau.cs.kieler.esterel.esterel.FunctionRenaming;
import de.cau.cs.kieler.esterel.esterel.Halt;
import de.cau.cs.kieler.esterel.esterel.ISignal;
import de.cau.cs.kieler.esterel.esterel.IVariable;
import de.cau.cs.kieler.esterel.esterel.IfTest;
import de.cau.cs.kieler.esterel.esterel.Input;
import de.cau.cs.kieler.esterel.esterel.InputOutput;
import de.cau.cs.kieler.esterel.esterel.InterfaceSignalDecl;
import de.cau.cs.kieler.esterel.esterel.LocalSignalDecl;
import de.cau.cs.kieler.esterel.esterel.LocalVariable;
import de.cau.cs.kieler.esterel.esterel.Loop;
import de.cau.cs.kieler.esterel.esterel.Module;
import de.cau.cs.kieler.esterel.esterel.ModuleRenaming;
import de.cau.cs.kieler.esterel.esterel.Nothing;
import de.cau.cs.kieler.esterel.esterel.OneTypeConstantDecls;
import de.cau.cs.kieler.esterel.esterel.Output;
import de.cau.cs.kieler.esterel.esterel.Present;
import de.cau.cs.kieler.esterel.esterel.PresentCase;
import de.cau.cs.kieler.esterel.esterel.ProcCall;
import de.cau.cs.kieler.esterel.esterel.Procedure;
import de.cau.cs.kieler.esterel.esterel.ProcedureDecl;
import de.cau.cs.kieler.esterel.esterel.ProcedureRenaming;
import de.cau.cs.kieler.esterel.esterel.Program;
import de.cau.cs.kieler.esterel.esterel.Relation;
import de.cau.cs.kieler.esterel.esterel.RelationDecl;
import de.cau.cs.kieler.esterel.esterel.RelationImplication;
import de.cau.cs.kieler.esterel.esterel.RelationIncompatibility;
import de.cau.cs.kieler.esterel.esterel.RelationType;
import de.cau.cs.kieler.esterel.esterel.Renaming;
import de.cau.cs.kieler.esterel.esterel.Repeat;
import de.cau.cs.kieler.esterel.esterel.Return;
import de.cau.cs.kieler.esterel.esterel.Run;
import de.cau.cs.kieler.esterel.esterel.SensorDecl;
import de.cau.cs.kieler.esterel.esterel.SensorWithType;
import de.cau.cs.kieler.esterel.esterel.SignalReferenceExpr;
import de.cau.cs.kieler.esterel.esterel.SignalRenaming;
import de.cau.cs.kieler.esterel.esterel.Suspend;
import de.cau.cs.kieler.esterel.esterel.Sustain;
import de.cau.cs.kieler.esterel.esterel.Task;
import de.cau.cs.kieler.esterel.esterel.TaskDecl;
import de.cau.cs.kieler.esterel.esterel.TaskRenaming;
import de.cau.cs.kieler.esterel.esterel.Trap;
import de.cau.cs.kieler.esterel.esterel.TrapExpression;
import de.cau.cs.kieler.esterel.esterel.TrapHandler;
import de.cau.cs.kieler.esterel.esterel.TrapReferenceExpr;
import de.cau.cs.kieler.esterel.esterel.TrapSignal;
import de.cau.cs.kieler.esterel.esterel.Type;
import de.cau.cs.kieler.esterel.esterel.TypeDecl;
import de.cau.cs.kieler.esterel.esterel.TypeIdentifier;
import de.cau.cs.kieler.esterel.esterel.TypeRenaming;
import de.cau.cs.kieler.esterel.esterel.VariableDecl;

import de.cau.cs.kieler.kexpressions.KExpressionsPackage;

import de.cau.cs.kieler.scl.scl.SclPackage;

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
public class EsterelPackageImpl extends EPackageImpl implements EsterelPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass programEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moduleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeIdentifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantDeclsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oneTypeConstantDeclsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass procedureDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass procedureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceSignalDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iSignalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sensorDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sensorWithTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationImplicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationIncompatibilityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass esterelParallelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass esterelThreadEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nothingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass haltEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sustainEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass esterelAssignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass procCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass presentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass presentCaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifTestEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elsIfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass loopEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass repeatEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abortEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass caseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass awaitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass everyDoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass suspendEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trapEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trapHandlerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass execEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass execCaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localSignalDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass runEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moduleRenamingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass renamingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeRenamingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantRenamingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionRenamingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass procedureRenamingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskRenamingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass signalRenamingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass doEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass delayExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass esterelTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inputOutputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass returnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trapSignalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trapExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass signalReferenceExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trapReferenceExprEClass = null;

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
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private EsterelPackageImpl()
  {
    super(eNS_URI, EsterelFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link EsterelPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static EsterelPackage init()
  {
    if (isInited) return (EsterelPackage)EPackage.Registry.INSTANCE.getEPackage(EsterelPackage.eNS_URI);

    // Obtain or create and register package
    EsterelPackageImpl theEsterelPackage = (EsterelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EsterelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EsterelPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    SclPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theEsterelPackage.createPackageContents();

    // Initialize created meta-data
    theEsterelPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theEsterelPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(EsterelPackage.eNS_URI, theEsterelPackage);
    return theEsterelPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProgram()
  {
    return programEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgram_Modules()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModule()
  {
    return moduleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModule_Name()
  {
    return (EAttribute)moduleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_IntSignalDecls()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_IntTypeDecls()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_IntSensorDecls()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_IntConstantDecls()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_IntRelationDecls()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_IntTaskDecls()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_IntFunctionDecls()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_IntProcedureDecls()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeIdentifier()
  {
    return typeIdentifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeIdentifier_Type()
  {
    return (EAttribute)typeIdentifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeIdentifier_TypeID()
  {
    return (EAttribute)typeIdentifierEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeIdentifier_Operator()
  {
    return (EAttribute)typeIdentifierEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeDecl()
  {
    return typeDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeDecl_Annotations()
  {
    return (EReference)typeDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeDecl_Types()
  {
    return (EReference)typeDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_Name()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstantDecls()
  {
    return constantDeclsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantDecls_Annotations()
  {
    return (EReference)constantDeclsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantDecls_Constants()
  {
    return (EReference)constantDeclsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOneTypeConstantDecls()
  {
    return oneTypeConstantDeclsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOneTypeConstantDecls_Constants()
  {
    return (EReference)oneTypeConstantDeclsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOneTypeConstantDecls_Type()
  {
    return (EReference)oneTypeConstantDeclsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionDecl()
  {
    return functionDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionDecl_Annotations()
  {
    return (EReference)functionDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionDecl_Functions()
  {
    return (EReference)functionDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunction()
  {
    return functionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunction_Name()
  {
    return (EAttribute)functionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunction_IdList()
  {
    return (EReference)functionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunction_Type()
  {
    return (EReference)functionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcedureDecl()
  {
    return procedureDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcedureDecl_Annotations()
  {
    return (EReference)procedureDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcedureDecl_Procedures()
  {
    return (EReference)procedureDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcedure()
  {
    return procedureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProcedure_Name()
  {
    return (EAttribute)procedureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcedure_Variables()
  {
    return (EReference)procedureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcedure_Expressions()
  {
    return (EReference)procedureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTaskDecl()
  {
    return taskDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTaskDecl_Annotations()
  {
    return (EReference)taskDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTaskDecl_Tasks()
  {
    return (EReference)taskDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTask()
  {
    return taskEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTask_Name()
  {
    return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTask_Variables()
  {
    return (EReference)taskEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTask_Expressions()
  {
    return (EReference)taskEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfaceSignalDecl()
  {
    return interfaceSignalDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceSignalDecl_Annotations()
  {
    return (EReference)interfaceSignalDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceSignalDecl_Signals()
  {
    return (EReference)interfaceSignalDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getISignal()
  {
    return iSignalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getISignal_Type()
  {
    return (EAttribute)iSignalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getISignal_TypeID()
  {
    return (EAttribute)iSignalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getISignal_Func()
  {
    return (EReference)iSignalEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getISignal_Expression()
  {
    return (EReference)iSignalEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSensorDecl()
  {
    return sensorDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSensorDecl_Annotations()
  {
    return (EReference)sensorDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSensorDecl_Sensors()
  {
    return (EReference)sensorDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSensorWithType()
  {
    return sensorWithTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSensorWithType_Sensor()
  {
    return (EReference)sensorWithTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSensorWithType_Type()
  {
    return (EReference)sensorWithTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationDecl()
  {
    return relationDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationType()
  {
    return relationTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelationType_Type()
  {
    return (EAttribute)relationTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationImplication()
  {
    return relationImplicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationImplication_First()
  {
    return (EReference)relationImplicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationImplication_Second()
  {
    return (EReference)relationImplicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationIncompatibility()
  {
    return relationIncompatibilityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationIncompatibility_Incomp()
  {
    return (EReference)relationIncompatibilityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEsterelParallel()
  {
    return esterelParallelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEsterelParallel_Threads()
  {
    return (EReference)esterelParallelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEsterelThread()
  {
    return esterelThreadEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNothing()
  {
    return nothingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHalt()
  {
    return haltEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBlock()
  {
    return blockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEmit()
  {
    return emitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEmit_Signal()
  {
    return (EReference)emitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEmit_Expression()
  {
    return (EReference)emitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSustain()
  {
    return sustainEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSustain_Signal()
  {
    return (EReference)sustainEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSustain_Expression()
  {
    return (EReference)sustainEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEsterelAssignment()
  {
    return esterelAssignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEsterelAssignment_Var()
  {
    return (EReference)esterelAssignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEsterelAssignment_Expression()
  {
    return (EReference)esterelAssignmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcCall()
  {
    return procCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcCall_Proc()
  {
    return (EReference)procCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcCall_VarList()
  {
    return (EReference)procCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcCall_Kexpressions()
  {
    return (EReference)procCallEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPresent()
  {
    return presentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPresent_Expression()
  {
    return (EReference)presentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPresent_ThenAnnotations()
  {
    return (EReference)presentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPresent_ThenStatements()
  {
    return (EReference)presentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPresent_Cases()
  {
    return (EReference)presentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPresent_ElseAnnotations()
  {
    return (EReference)presentEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPresent_ElseStatements()
  {
    return (EReference)presentEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPresentCase()
  {
    return presentCaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPresentCase_Expression()
  {
    return (EReference)presentCaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfTest()
  {
    return ifTestEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfTest_Expression()
  {
    return (EReference)ifTestEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfTest_ThenAnnotations()
  {
    return (EReference)ifTestEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfTest_ThenStatements()
  {
    return (EReference)ifTestEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfTest_Elseif()
  {
    return (EReference)ifTestEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfTest_ElseAnnotations()
  {
    return (EReference)ifTestEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfTest_ElseStatements()
  {
    return (EReference)ifTestEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElsIf()
  {
    return elsIfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElsIf_Annotations()
  {
    return (EReference)elsIfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElsIf_Expression()
  {
    return (EReference)elsIfEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElsIf_ThenStatements()
  {
    return (EReference)elsIfEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLoop()
  {
    return loopEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLoop_Delay()
  {
    return (EReference)loopEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRepeat()
  {
    return repeatEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepeat_Positive()
  {
    return (EAttribute)repeatEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRepeat_Expression()
  {
    return (EReference)repeatEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbort()
  {
    return abortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbort_Weak()
  {
    return (EAttribute)abortEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbort_Delay()
  {
    return (EReference)abortEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbort_DoStatements()
  {
    return (EReference)abortEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbort_Cases()
  {
    return (EReference)abortEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCase()
  {
    return caseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCase_Delay()
  {
    return (EReference)caseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAwait()
  {
    return awaitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAwait_Delay()
  {
    return (EReference)awaitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAwait_Cases()
  {
    return (EReference)awaitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEveryDo()
  {
    return everyDoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEveryDo_Delay()
  {
    return (EReference)everyDoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSuspend()
  {
    return suspendEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSuspend_Weak()
  {
    return (EAttribute)suspendEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSuspend_Delay()
  {
    return (EReference)suspendEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrap()
  {
    return trapEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrap_TrapSignals()
  {
    return (EReference)trapEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrap_TrapHandler()
  {
    return (EReference)trapEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrapHandler()
  {
    return trapHandlerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrapHandler_TrapExpr()
  {
    return (EReference)trapHandlerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExit()
  {
    return exitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExit_Trap()
  {
    return (EReference)exitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExit_Expression()
  {
    return (EReference)exitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExec()
  {
    return execEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExec_Task()
  {
    return (EReference)execEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExec_Vars()
  {
    return (EReference)execEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExec_Kexpressions()
  {
    return (EReference)execEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExec_RetSignal()
  {
    return (EReference)execEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExec_ExecCaseList()
  {
    return (EReference)execEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExecCase()
  {
    return execCaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExecCase_Task()
  {
    return (EReference)execCaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExecCase_Vars()
  {
    return (EReference)execCaseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExecCase_Kexpressions()
  {
    return (EReference)execCaseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExecCase_RetSignal()
  {
    return (EReference)execCaseEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocalSignalDecl()
  {
    return localSignalDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocalSignalDecl_Signals()
  {
    return (EReference)localSignalDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocalVariable()
  {
    return localVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocalVariable_VarDecls()
  {
    return (EReference)localVariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableDecl()
  {
    return variableDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableDecl_Variables()
  {
    return (EReference)variableDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableDecl_Type()
  {
    return (EReference)variableDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIVariable()
  {
    return iVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIVariable_Expression()
  {
    return (EReference)iVariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRun()
  {
    return runEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRun_Module()
  {
    return (EReference)runEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRun_List()
  {
    return (EReference)runEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModuleRenaming()
  {
    return moduleRenamingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModuleRenaming_Module()
  {
    return (EReference)moduleRenamingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModuleRenaming_NewName()
  {
    return (EAttribute)moduleRenamingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRenaming()
  {
    return renamingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRenaming_Annotations()
  {
    return (EReference)renamingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRenaming_Renamings()
  {
    return (EReference)renamingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeRenaming()
  {
    return typeRenamingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeRenaming_NewName()
  {
    return (EReference)typeRenamingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeRenaming_NewType()
  {
    return (EAttribute)typeRenamingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeRenaming_OldName()
  {
    return (EReference)typeRenamingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstantRenaming()
  {
    return constantRenamingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantRenaming_NewName()
  {
    return (EReference)constantRenamingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstantRenaming_NewValue()
  {
    return (EAttribute)constantRenamingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantRenaming_OldName()
  {
    return (EReference)constantRenamingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionRenaming()
  {
    return functionRenamingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionRenaming_NewName()
  {
    return (EReference)functionRenamingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionRenaming_NewFunc()
  {
    return (EAttribute)functionRenamingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionRenaming_OldName()
  {
    return (EReference)functionRenamingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcedureRenaming()
  {
    return procedureRenamingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcedureRenaming_NewName()
  {
    return (EReference)procedureRenamingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcedureRenaming_OldName()
  {
    return (EReference)procedureRenamingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTaskRenaming()
  {
    return taskRenamingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTaskRenaming_NewName()
  {
    return (EReference)taskRenamingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTaskRenaming_OldName()
  {
    return (EReference)taskRenamingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSignalRenaming()
  {
    return signalRenamingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSignalRenaming_NewName()
  {
    return (EReference)signalRenamingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSignalRenaming_OldName()
  {
    return (EReference)signalRenamingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDo()
  {
    return doEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDo_EndingAnnotations()
  {
    return (EReference)doEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDo_Expression()
  {
    return (EReference)doEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDo_Delay()
  {
    return (EReference)doEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDo_WatchingStatements()
  {
    return (EReference)doEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDelayExpr()
  {
    return delayExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDelayExpr_Expression()
  {
    return (EReference)delayExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDelayExpr_IsImmediate()
  {
    return (EAttribute)delayExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDelayExpr_SignalExpr()
  {
    return (EReference)delayExprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEsterelType()
  {
    return esterelTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEsterelType_EstType()
  {
    return (EReference)esterelTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstant()
  {
    return constantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstant_Value()
  {
    return (EAttribute)constantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInput()
  {
    return inputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutput()
  {
    return outputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInputOutput()
  {
    return inputOutputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReturn()
  {
    return returnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelation()
  {
    return relationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelation_Annotations()
  {
    return (EReference)relationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelation_Relations()
  {
    return (EReference)relationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrapSignal()
  {
    return trapSignalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrapExpression()
  {
    return trapExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrapExpression_Trap()
  {
    return (EReference)trapExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionExpression()
  {
    return functionExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionExpression_Function()
  {
    return (EReference)functionExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionExpression_Kexpressions()
  {
    return (EReference)functionExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstantExpression()
  {
    return constantExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantExpression_Constant()
  {
    return (EReference)constantExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstantExpression_Value()
  {
    return (EAttribute)constantExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSignalReferenceExpr()
  {
    return signalReferenceExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrapReferenceExpr()
  {
    return trapReferenceExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EsterelFactory getEsterelFactory()
  {
    return (EsterelFactory)getEFactoryInstance();
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
    programEClass = createEClass(PROGRAM);
    createEReference(programEClass, PROGRAM__MODULES);

    moduleEClass = createEClass(MODULE);
    createEAttribute(moduleEClass, MODULE__NAME);
    createEReference(moduleEClass, MODULE__INT_SIGNAL_DECLS);
    createEReference(moduleEClass, MODULE__INT_TYPE_DECLS);
    createEReference(moduleEClass, MODULE__INT_SENSOR_DECLS);
    createEReference(moduleEClass, MODULE__INT_CONSTANT_DECLS);
    createEReference(moduleEClass, MODULE__INT_RELATION_DECLS);
    createEReference(moduleEClass, MODULE__INT_TASK_DECLS);
    createEReference(moduleEClass, MODULE__INT_FUNCTION_DECLS);
    createEReference(moduleEClass, MODULE__INT_PROCEDURE_DECLS);

    typeIdentifierEClass = createEClass(TYPE_IDENTIFIER);
    createEAttribute(typeIdentifierEClass, TYPE_IDENTIFIER__TYPE);
    createEAttribute(typeIdentifierEClass, TYPE_IDENTIFIER__TYPE_ID);
    createEAttribute(typeIdentifierEClass, TYPE_IDENTIFIER__OPERATOR);

    typeDeclEClass = createEClass(TYPE_DECL);
    createEReference(typeDeclEClass, TYPE_DECL__ANNOTATIONS);
    createEReference(typeDeclEClass, TYPE_DECL__TYPES);

    typeEClass = createEClass(TYPE);
    createEAttribute(typeEClass, TYPE__NAME);

    constantDeclsEClass = createEClass(CONSTANT_DECLS);
    createEReference(constantDeclsEClass, CONSTANT_DECLS__ANNOTATIONS);
    createEReference(constantDeclsEClass, CONSTANT_DECLS__CONSTANTS);

    oneTypeConstantDeclsEClass = createEClass(ONE_TYPE_CONSTANT_DECLS);
    createEReference(oneTypeConstantDeclsEClass, ONE_TYPE_CONSTANT_DECLS__CONSTANTS);
    createEReference(oneTypeConstantDeclsEClass, ONE_TYPE_CONSTANT_DECLS__TYPE);

    functionDeclEClass = createEClass(FUNCTION_DECL);
    createEReference(functionDeclEClass, FUNCTION_DECL__ANNOTATIONS);
    createEReference(functionDeclEClass, FUNCTION_DECL__FUNCTIONS);

    functionEClass = createEClass(FUNCTION);
    createEAttribute(functionEClass, FUNCTION__NAME);
    createEReference(functionEClass, FUNCTION__ID_LIST);
    createEReference(functionEClass, FUNCTION__TYPE);

    procedureDeclEClass = createEClass(PROCEDURE_DECL);
    createEReference(procedureDeclEClass, PROCEDURE_DECL__ANNOTATIONS);
    createEReference(procedureDeclEClass, PROCEDURE_DECL__PROCEDURES);

    procedureEClass = createEClass(PROCEDURE);
    createEAttribute(procedureEClass, PROCEDURE__NAME);
    createEReference(procedureEClass, PROCEDURE__VARIABLES);
    createEReference(procedureEClass, PROCEDURE__EXPRESSIONS);

    taskDeclEClass = createEClass(TASK_DECL);
    createEReference(taskDeclEClass, TASK_DECL__ANNOTATIONS);
    createEReference(taskDeclEClass, TASK_DECL__TASKS);

    taskEClass = createEClass(TASK);
    createEAttribute(taskEClass, TASK__NAME);
    createEReference(taskEClass, TASK__VARIABLES);
    createEReference(taskEClass, TASK__EXPRESSIONS);

    interfaceSignalDeclEClass = createEClass(INTERFACE_SIGNAL_DECL);
    createEReference(interfaceSignalDeclEClass, INTERFACE_SIGNAL_DECL__ANNOTATIONS);
    createEReference(interfaceSignalDeclEClass, INTERFACE_SIGNAL_DECL__SIGNALS);

    iSignalEClass = createEClass(ISIGNAL);
    createEAttribute(iSignalEClass, ISIGNAL__TYPE);
    createEAttribute(iSignalEClass, ISIGNAL__TYPE_ID);
    createEReference(iSignalEClass, ISIGNAL__FUNC);
    createEReference(iSignalEClass, ISIGNAL__EXPRESSION);

    sensorDeclEClass = createEClass(SENSOR_DECL);
    createEReference(sensorDeclEClass, SENSOR_DECL__ANNOTATIONS);
    createEReference(sensorDeclEClass, SENSOR_DECL__SENSORS);

    sensorWithTypeEClass = createEClass(SENSOR_WITH_TYPE);
    createEReference(sensorWithTypeEClass, SENSOR_WITH_TYPE__SENSOR);
    createEReference(sensorWithTypeEClass, SENSOR_WITH_TYPE__TYPE);

    relationDeclEClass = createEClass(RELATION_DECL);

    relationTypeEClass = createEClass(RELATION_TYPE);
    createEAttribute(relationTypeEClass, RELATION_TYPE__TYPE);

    relationImplicationEClass = createEClass(RELATION_IMPLICATION);
    createEReference(relationImplicationEClass, RELATION_IMPLICATION__FIRST);
    createEReference(relationImplicationEClass, RELATION_IMPLICATION__SECOND);

    relationIncompatibilityEClass = createEClass(RELATION_INCOMPATIBILITY);
    createEReference(relationIncompatibilityEClass, RELATION_INCOMPATIBILITY__INCOMP);

    esterelParallelEClass = createEClass(ESTEREL_PARALLEL);
    createEReference(esterelParallelEClass, ESTEREL_PARALLEL__THREADS);

    esterelThreadEClass = createEClass(ESTEREL_THREAD);

    nothingEClass = createEClass(NOTHING);

    haltEClass = createEClass(HALT);

    blockEClass = createEClass(BLOCK);

    emitEClass = createEClass(EMIT);
    createEReference(emitEClass, EMIT__SIGNAL);
    createEReference(emitEClass, EMIT__EXPRESSION);

    sustainEClass = createEClass(SUSTAIN);
    createEReference(sustainEClass, SUSTAIN__SIGNAL);
    createEReference(sustainEClass, SUSTAIN__EXPRESSION);

    esterelAssignmentEClass = createEClass(ESTEREL_ASSIGNMENT);
    createEReference(esterelAssignmentEClass, ESTEREL_ASSIGNMENT__VAR);
    createEReference(esterelAssignmentEClass, ESTEREL_ASSIGNMENT__EXPRESSION);

    procCallEClass = createEClass(PROC_CALL);
    createEReference(procCallEClass, PROC_CALL__PROC);
    createEReference(procCallEClass, PROC_CALL__VAR_LIST);
    createEReference(procCallEClass, PROC_CALL__KEXPRESSIONS);

    presentEClass = createEClass(PRESENT);
    createEReference(presentEClass, PRESENT__EXPRESSION);
    createEReference(presentEClass, PRESENT__THEN_ANNOTATIONS);
    createEReference(presentEClass, PRESENT__THEN_STATEMENTS);
    createEReference(presentEClass, PRESENT__CASES);
    createEReference(presentEClass, PRESENT__ELSE_ANNOTATIONS);
    createEReference(presentEClass, PRESENT__ELSE_STATEMENTS);

    presentCaseEClass = createEClass(PRESENT_CASE);
    createEReference(presentCaseEClass, PRESENT_CASE__EXPRESSION);

    ifTestEClass = createEClass(IF_TEST);
    createEReference(ifTestEClass, IF_TEST__EXPRESSION);
    createEReference(ifTestEClass, IF_TEST__THEN_ANNOTATIONS);
    createEReference(ifTestEClass, IF_TEST__THEN_STATEMENTS);
    createEReference(ifTestEClass, IF_TEST__ELSEIF);
    createEReference(ifTestEClass, IF_TEST__ELSE_ANNOTATIONS);
    createEReference(ifTestEClass, IF_TEST__ELSE_STATEMENTS);

    elsIfEClass = createEClass(ELS_IF);
    createEReference(elsIfEClass, ELS_IF__ANNOTATIONS);
    createEReference(elsIfEClass, ELS_IF__EXPRESSION);
    createEReference(elsIfEClass, ELS_IF__THEN_STATEMENTS);

    loopEClass = createEClass(LOOP);
    createEReference(loopEClass, LOOP__DELAY);

    repeatEClass = createEClass(REPEAT);
    createEAttribute(repeatEClass, REPEAT__POSITIVE);
    createEReference(repeatEClass, REPEAT__EXPRESSION);

    abortEClass = createEClass(ABORT);
    createEAttribute(abortEClass, ABORT__WEAK);
    createEReference(abortEClass, ABORT__DELAY);
    createEReference(abortEClass, ABORT__DO_STATEMENTS);
    createEReference(abortEClass, ABORT__CASES);

    caseEClass = createEClass(CASE);
    createEReference(caseEClass, CASE__DELAY);

    awaitEClass = createEClass(AWAIT);
    createEReference(awaitEClass, AWAIT__DELAY);
    createEReference(awaitEClass, AWAIT__CASES);

    everyDoEClass = createEClass(EVERY_DO);
    createEReference(everyDoEClass, EVERY_DO__DELAY);

    suspendEClass = createEClass(SUSPEND);
    createEAttribute(suspendEClass, SUSPEND__WEAK);
    createEReference(suspendEClass, SUSPEND__DELAY);

    trapEClass = createEClass(TRAP);
    createEReference(trapEClass, TRAP__TRAP_SIGNALS);
    createEReference(trapEClass, TRAP__TRAP_HANDLER);

    trapHandlerEClass = createEClass(TRAP_HANDLER);
    createEReference(trapHandlerEClass, TRAP_HANDLER__TRAP_EXPR);

    exitEClass = createEClass(EXIT);
    createEReference(exitEClass, EXIT__TRAP);
    createEReference(exitEClass, EXIT__EXPRESSION);

    execEClass = createEClass(EXEC);
    createEReference(execEClass, EXEC__TASK);
    createEReference(execEClass, EXEC__VARS);
    createEReference(execEClass, EXEC__KEXPRESSIONS);
    createEReference(execEClass, EXEC__RET_SIGNAL);
    createEReference(execEClass, EXEC__EXEC_CASE_LIST);

    execCaseEClass = createEClass(EXEC_CASE);
    createEReference(execCaseEClass, EXEC_CASE__TASK);
    createEReference(execCaseEClass, EXEC_CASE__VARS);
    createEReference(execCaseEClass, EXEC_CASE__KEXPRESSIONS);
    createEReference(execCaseEClass, EXEC_CASE__RET_SIGNAL);

    localSignalDeclEClass = createEClass(LOCAL_SIGNAL_DECL);
    createEReference(localSignalDeclEClass, LOCAL_SIGNAL_DECL__SIGNALS);

    localVariableEClass = createEClass(LOCAL_VARIABLE);
    createEReference(localVariableEClass, LOCAL_VARIABLE__VAR_DECLS);

    variableDeclEClass = createEClass(VARIABLE_DECL);
    createEReference(variableDeclEClass, VARIABLE_DECL__VARIABLES);
    createEReference(variableDeclEClass, VARIABLE_DECL__TYPE);

    iVariableEClass = createEClass(IVARIABLE);
    createEReference(iVariableEClass, IVARIABLE__EXPRESSION);

    runEClass = createEClass(RUN);
    createEReference(runEClass, RUN__MODULE);
    createEReference(runEClass, RUN__LIST);

    moduleRenamingEClass = createEClass(MODULE_RENAMING);
    createEReference(moduleRenamingEClass, MODULE_RENAMING__MODULE);
    createEAttribute(moduleRenamingEClass, MODULE_RENAMING__NEW_NAME);

    renamingEClass = createEClass(RENAMING);
    createEReference(renamingEClass, RENAMING__ANNOTATIONS);
    createEReference(renamingEClass, RENAMING__RENAMINGS);

    typeRenamingEClass = createEClass(TYPE_RENAMING);
    createEReference(typeRenamingEClass, TYPE_RENAMING__NEW_NAME);
    createEAttribute(typeRenamingEClass, TYPE_RENAMING__NEW_TYPE);
    createEReference(typeRenamingEClass, TYPE_RENAMING__OLD_NAME);

    constantRenamingEClass = createEClass(CONSTANT_RENAMING);
    createEReference(constantRenamingEClass, CONSTANT_RENAMING__NEW_NAME);
    createEAttribute(constantRenamingEClass, CONSTANT_RENAMING__NEW_VALUE);
    createEReference(constantRenamingEClass, CONSTANT_RENAMING__OLD_NAME);

    functionRenamingEClass = createEClass(FUNCTION_RENAMING);
    createEReference(functionRenamingEClass, FUNCTION_RENAMING__NEW_NAME);
    createEAttribute(functionRenamingEClass, FUNCTION_RENAMING__NEW_FUNC);
    createEReference(functionRenamingEClass, FUNCTION_RENAMING__OLD_NAME);

    procedureRenamingEClass = createEClass(PROCEDURE_RENAMING);
    createEReference(procedureRenamingEClass, PROCEDURE_RENAMING__NEW_NAME);
    createEReference(procedureRenamingEClass, PROCEDURE_RENAMING__OLD_NAME);

    taskRenamingEClass = createEClass(TASK_RENAMING);
    createEReference(taskRenamingEClass, TASK_RENAMING__NEW_NAME);
    createEReference(taskRenamingEClass, TASK_RENAMING__OLD_NAME);

    signalRenamingEClass = createEClass(SIGNAL_RENAMING);
    createEReference(signalRenamingEClass, SIGNAL_RENAMING__NEW_NAME);
    createEReference(signalRenamingEClass, SIGNAL_RENAMING__OLD_NAME);

    doEClass = createEClass(DO);
    createEReference(doEClass, DO__ENDING_ANNOTATIONS);
    createEReference(doEClass, DO__EXPRESSION);
    createEReference(doEClass, DO__DELAY);
    createEReference(doEClass, DO__WATCHING_STATEMENTS);

    delayExprEClass = createEClass(DELAY_EXPR);
    createEReference(delayExprEClass, DELAY_EXPR__EXPRESSION);
    createEAttribute(delayExprEClass, DELAY_EXPR__IS_IMMEDIATE);
    createEReference(delayExprEClass, DELAY_EXPR__SIGNAL_EXPR);

    esterelTypeEClass = createEClass(ESTEREL_TYPE);
    createEReference(esterelTypeEClass, ESTEREL_TYPE__EST_TYPE);

    constantEClass = createEClass(CONSTANT);
    createEAttribute(constantEClass, CONSTANT__VALUE);

    inputEClass = createEClass(INPUT);

    outputEClass = createEClass(OUTPUT);

    inputOutputEClass = createEClass(INPUT_OUTPUT);

    returnEClass = createEClass(RETURN);

    relationEClass = createEClass(RELATION);
    createEReference(relationEClass, RELATION__ANNOTATIONS);
    createEReference(relationEClass, RELATION__RELATIONS);

    trapSignalEClass = createEClass(TRAP_SIGNAL);

    trapExpressionEClass = createEClass(TRAP_EXPRESSION);
    createEReference(trapExpressionEClass, TRAP_EXPRESSION__TRAP);

    functionExpressionEClass = createEClass(FUNCTION_EXPRESSION);
    createEReference(functionExpressionEClass, FUNCTION_EXPRESSION__FUNCTION);
    createEReference(functionExpressionEClass, FUNCTION_EXPRESSION__KEXPRESSIONS);

    constantExpressionEClass = createEClass(CONSTANT_EXPRESSION);
    createEReference(constantExpressionEClass, CONSTANT_EXPRESSION__CONSTANT);
    createEAttribute(constantExpressionEClass, CONSTANT_EXPRESSION__VALUE);

    signalReferenceExprEClass = createEClass(SIGNAL_REFERENCE_EXPR);

    trapReferenceExprEClass = createEClass(TRAP_REFERENCE_EXPR);
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
    KExpressionsPackage theKExpressionsPackage = (KExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(KExpressionsPackage.eNS_URI);
    AnnotationsPackage theAnnotationsPackage = (AnnotationsPackage)EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    moduleEClass.getESuperTypes().add(theSclPackage.getStatementContainer());
    iSignalEClass.getESuperTypes().add(theKExpressionsPackage.getValuedObject());
    relationImplicationEClass.getESuperTypes().add(this.getRelationType());
    relationIncompatibilityEClass.getESuperTypes().add(this.getRelationType());
    esterelParallelEClass.getESuperTypes().add(theSclPackage.getStatement());
    esterelThreadEClass.getESuperTypes().add(theSclPackage.getStatementContainer());
    nothingEClass.getESuperTypes().add(theSclPackage.getStatement());
    haltEClass.getESuperTypes().add(theSclPackage.getStatement());
    blockEClass.getESuperTypes().add(theSclPackage.getStatementContainer());
    blockEClass.getESuperTypes().add(theSclPackage.getStatement());
    emitEClass.getESuperTypes().add(theSclPackage.getStatement());
    sustainEClass.getESuperTypes().add(theSclPackage.getStatement());
    esterelAssignmentEClass.getESuperTypes().add(theSclPackage.getStatement());
    procCallEClass.getESuperTypes().add(theSclPackage.getStatement());
    presentEClass.getESuperTypes().add(theSclPackage.getStatement());
    presentCaseEClass.getESuperTypes().add(theSclPackage.getStatementContainer());
    ifTestEClass.getESuperTypes().add(theSclPackage.getStatement());
    loopEClass.getESuperTypes().add(theSclPackage.getStatementContainer());
    loopEClass.getESuperTypes().add(theSclPackage.getStatement());
    repeatEClass.getESuperTypes().add(theSclPackage.getStatementContainer());
    repeatEClass.getESuperTypes().add(theSclPackage.getStatement());
    abortEClass.getESuperTypes().add(theSclPackage.getStatementContainer());
    abortEClass.getESuperTypes().add(theSclPackage.getStatement());
    caseEClass.getESuperTypes().add(theSclPackage.getStatementContainer());
    awaitEClass.getESuperTypes().add(theSclPackage.getStatementContainer());
    awaitEClass.getESuperTypes().add(theSclPackage.getStatement());
    everyDoEClass.getESuperTypes().add(theSclPackage.getStatementContainer());
    everyDoEClass.getESuperTypes().add(theSclPackage.getStatement());
    suspendEClass.getESuperTypes().add(theSclPackage.getStatementContainer());
    suspendEClass.getESuperTypes().add(theSclPackage.getStatement());
    trapEClass.getESuperTypes().add(theSclPackage.getStatementContainer());
    trapEClass.getESuperTypes().add(theSclPackage.getStatement());
    trapHandlerEClass.getESuperTypes().add(theSclPackage.getStatementContainer());
    exitEClass.getESuperTypes().add(theSclPackage.getStatement());
    execEClass.getESuperTypes().add(theSclPackage.getStatementContainer());
    execEClass.getESuperTypes().add(theSclPackage.getStatement());
    execCaseEClass.getESuperTypes().add(theSclPackage.getStatementContainer());
    localSignalDeclEClass.getESuperTypes().add(theSclPackage.getStatementContainer());
    localSignalDeclEClass.getESuperTypes().add(theSclPackage.getStatement());
    localVariableEClass.getESuperTypes().add(theSclPackage.getStatementContainer());
    localVariableEClass.getESuperTypes().add(theSclPackage.getStatement());
    iVariableEClass.getESuperTypes().add(theKExpressionsPackage.getValuedObject());
    runEClass.getESuperTypes().add(theSclPackage.getStatement());
    doEClass.getESuperTypes().add(theSclPackage.getStatementContainer());
    doEClass.getESuperTypes().add(theSclPackage.getStatement());
    esterelTypeEClass.getESuperTypes().add(this.getTypeIdentifier());
    constantEClass.getESuperTypes().add(theKExpressionsPackage.getValuedObject());
    inputEClass.getESuperTypes().add(this.getInterfaceSignalDecl());
    outputEClass.getESuperTypes().add(this.getInterfaceSignalDecl());
    inputOutputEClass.getESuperTypes().add(this.getInterfaceSignalDecl());
    returnEClass.getESuperTypes().add(this.getInterfaceSignalDecl());
    relationEClass.getESuperTypes().add(this.getRelationDecl());
    trapSignalEClass.getESuperTypes().add(this.getISignal());
    trapExpressionEClass.getESuperTypes().add(theKExpressionsPackage.getExpression());
    functionExpressionEClass.getESuperTypes().add(theKExpressionsPackage.getExpression());
    constantExpressionEClass.getESuperTypes().add(theKExpressionsPackage.getExpression());
    signalReferenceExprEClass.getESuperTypes().add(theKExpressionsPackage.getValuedObjectReference());
    trapReferenceExprEClass.getESuperTypes().add(theKExpressionsPackage.getValuedObjectReference());

    // Initialize classes and features; add operations and parameters
    initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProgram_Modules(), this.getModule(), null, "modules", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModule_Name(), ecorePackage.getEString(), "name", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_IntSignalDecls(), this.getInterfaceSignalDecl(), null, "intSignalDecls", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_IntTypeDecls(), this.getTypeDecl(), null, "intTypeDecls", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_IntSensorDecls(), this.getSensorDecl(), null, "intSensorDecls", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_IntConstantDecls(), this.getConstantDecls(), null, "intConstantDecls", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_IntRelationDecls(), this.getRelationDecl(), null, "intRelationDecls", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_IntTaskDecls(), this.getTaskDecl(), null, "intTaskDecls", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_IntFunctionDecls(), this.getFunctionDecl(), null, "intFunctionDecls", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_IntProcedureDecls(), this.getProcedureDecl(), null, "intProcedureDecls", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeIdentifierEClass, TypeIdentifier.class, "TypeIdentifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypeIdentifier_Type(), theKExpressionsPackage.getValueType(), "type", null, 0, 1, TypeIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeIdentifier_TypeID(), ecorePackage.getEString(), "typeID", null, 0, 1, TypeIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeIdentifier_Operator(), theKExpressionsPackage.getCombineOperator(), "operator", null, 0, 1, TypeIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeDeclEClass, TypeDecl.class, "TypeDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeDecl_Annotations(), theAnnotationsPackage.getAnnotation(), null, "annotations", null, 0, -1, TypeDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeDecl_Types(), this.getType(), null, "types", null, 0, -1, TypeDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getType_Name(), ecorePackage.getEString(), "name", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantDeclsEClass, ConstantDecls.class, "ConstantDecls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstantDecls_Annotations(), theAnnotationsPackage.getAnnotation(), null, "annotations", null, 0, -1, ConstantDecls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstantDecls_Constants(), this.getOneTypeConstantDecls(), null, "constants", null, 0, -1, ConstantDecls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oneTypeConstantDeclsEClass, OneTypeConstantDecls.class, "OneTypeConstantDecls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOneTypeConstantDecls_Constants(), theKExpressionsPackage.getValuedObject(), null, "constants", null, 0, -1, OneTypeConstantDecls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOneTypeConstantDecls_Type(), this.getTypeIdentifier(), null, "type", null, 0, 1, OneTypeConstantDecls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionDeclEClass, FunctionDecl.class, "FunctionDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionDecl_Annotations(), theAnnotationsPackage.getAnnotation(), null, "annotations", null, 0, -1, FunctionDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionDecl_Functions(), this.getFunction(), null, "functions", null, 0, -1, FunctionDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunction_Name(), ecorePackage.getEString(), "name", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunction_IdList(), this.getTypeIdentifier(), null, "idList", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunction_Type(), this.getTypeIdentifier(), null, "type", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(procedureDeclEClass, ProcedureDecl.class, "ProcedureDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProcedureDecl_Annotations(), theAnnotationsPackage.getAnnotation(), null, "annotations", null, 0, -1, ProcedureDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcedureDecl_Procedures(), this.getProcedure(), null, "procedures", null, 0, -1, ProcedureDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(procedureEClass, Procedure.class, "Procedure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProcedure_Name(), ecorePackage.getEString(), "name", null, 0, 1, Procedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcedure_Variables(), this.getTypeIdentifier(), null, "variables", null, 0, -1, Procedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcedure_Expressions(), this.getTypeIdentifier(), null, "expressions", null, 0, -1, Procedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(taskDeclEClass, TaskDecl.class, "TaskDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTaskDecl_Annotations(), theAnnotationsPackage.getAnnotation(), null, "annotations", null, 0, -1, TaskDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTaskDecl_Tasks(), this.getTask(), null, "tasks", null, 0, -1, TaskDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTask_Name(), ecorePackage.getEString(), "name", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTask_Variables(), this.getTypeIdentifier(), null, "variables", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTask_Expressions(), this.getTypeIdentifier(), null, "expressions", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interfaceSignalDeclEClass, InterfaceSignalDecl.class, "InterfaceSignalDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInterfaceSignalDecl_Annotations(), theAnnotationsPackage.getAnnotation(), null, "annotations", null, 0, -1, InterfaceSignalDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterfaceSignalDecl_Signals(), this.getISignal(), null, "signals", null, 0, -1, InterfaceSignalDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iSignalEClass, ISignal.class, "ISignal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getISignal_Type(), theKExpressionsPackage.getValueType(), "type", null, 0, 1, ISignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getISignal_TypeID(), ecorePackage.getEString(), "typeID", null, 0, 1, ISignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getISignal_Func(), this.getFunction(), null, "func", null, 0, 1, ISignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getISignal_Expression(), theKExpressionsPackage.getExpression(), null, "expression", null, 0, 1, ISignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sensorDeclEClass, SensorDecl.class, "SensorDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSensorDecl_Annotations(), theAnnotationsPackage.getAnnotation(), null, "annotations", null, 0, -1, SensorDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSensorDecl_Sensors(), this.getSensorWithType(), null, "sensors", null, 0, -1, SensorDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sensorWithTypeEClass, SensorWithType.class, "SensorWithType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSensorWithType_Sensor(), this.getISignal(), null, "sensor", null, 0, 1, SensorWithType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSensorWithType_Type(), this.getTypeIdentifier(), null, "type", null, 0, 1, SensorWithType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationDeclEClass, RelationDecl.class, "RelationDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(relationTypeEClass, RelationType.class, "RelationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRelationType_Type(), ecorePackage.getEString(), "type", null, 0, 1, RelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationImplicationEClass, RelationImplication.class, "RelationImplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRelationImplication_First(), this.getISignal(), null, "first", null, 0, 1, RelationImplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelationImplication_Second(), this.getISignal(), null, "second", null, 0, 1, RelationImplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationIncompatibilityEClass, RelationIncompatibility.class, "RelationIncompatibility", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRelationIncompatibility_Incomp(), this.getISignal(), null, "incomp", null, 0, -1, RelationIncompatibility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(esterelParallelEClass, EsterelParallel.class, "EsterelParallel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEsterelParallel_Threads(), this.getEsterelThread(), null, "threads", null, 0, -1, EsterelParallel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(esterelThreadEClass, EsterelThread.class, "EsterelThread", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nothingEClass, Nothing.class, "Nothing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(haltEClass, Halt.class, "Halt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(emitEClass, Emit.class, "Emit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEmit_Signal(), this.getISignal(), null, "signal", null, 0, 1, Emit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEmit_Expression(), theKExpressionsPackage.getExpression(), null, "expression", null, 0, 1, Emit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sustainEClass, Sustain.class, "Sustain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSustain_Signal(), this.getISignal(), null, "signal", null, 0, 1, Sustain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSustain_Expression(), theKExpressionsPackage.getExpression(), null, "expression", null, 0, 1, Sustain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(esterelAssignmentEClass, EsterelAssignment.class, "EsterelAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEsterelAssignment_Var(), this.getIVariable(), null, "var", null, 0, 1, EsterelAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEsterelAssignment_Expression(), theKExpressionsPackage.getExpression(), null, "expression", null, 0, 1, EsterelAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(procCallEClass, ProcCall.class, "ProcCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProcCall_Proc(), this.getProcedure(), null, "proc", null, 0, 1, ProcCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcCall_VarList(), this.getIVariable(), null, "varList", null, 0, -1, ProcCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcCall_Kexpressions(), theKExpressionsPackage.getExpression(), null, "kexpressions", null, 0, -1, ProcCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(presentEClass, Present.class, "Present", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPresent_Expression(), theKExpressionsPackage.getExpression(), null, "expression", null, 0, 1, Present.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPresent_ThenAnnotations(), theAnnotationsPackage.getAnnotation(), null, "thenAnnotations", null, 0, -1, Present.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPresent_ThenStatements(), theSclPackage.getStatement(), null, "thenStatements", null, 0, -1, Present.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPresent_Cases(), this.getPresentCase(), null, "cases", null, 0, -1, Present.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPresent_ElseAnnotations(), theAnnotationsPackage.getAnnotation(), null, "elseAnnotations", null, 0, -1, Present.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPresent_ElseStatements(), theSclPackage.getStatement(), null, "elseStatements", null, 0, -1, Present.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(presentCaseEClass, PresentCase.class, "PresentCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPresentCase_Expression(), theKExpressionsPackage.getExpression(), null, "expression", null, 0, 1, PresentCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifTestEClass, IfTest.class, "IfTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIfTest_Expression(), theKExpressionsPackage.getExpression(), null, "expression", null, 0, 1, IfTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfTest_ThenAnnotations(), theAnnotationsPackage.getAnnotation(), null, "thenAnnotations", null, 0, -1, IfTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfTest_ThenStatements(), theSclPackage.getStatement(), null, "thenStatements", null, 0, -1, IfTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfTest_Elseif(), this.getElsIf(), null, "elseif", null, 0, -1, IfTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfTest_ElseAnnotations(), theAnnotationsPackage.getAnnotation(), null, "elseAnnotations", null, 0, -1, IfTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfTest_ElseStatements(), theSclPackage.getStatement(), null, "elseStatements", null, 0, -1, IfTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elsIfEClass, ElsIf.class, "ElsIf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getElsIf_Annotations(), theAnnotationsPackage.getAnnotation(), null, "annotations", null, 0, -1, ElsIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getElsIf_Expression(), theKExpressionsPackage.getExpression(), null, "expression", null, 0, 1, ElsIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getElsIf_ThenStatements(), theSclPackage.getStatement(), null, "thenStatements", null, 0, -1, ElsIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(loopEClass, Loop.class, "Loop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLoop_Delay(), this.getDelayExpr(), null, "delay", null, 0, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(repeatEClass, Repeat.class, "Repeat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRepeat_Positive(), ecorePackage.getEBoolean(), "positive", null, 0, 1, Repeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRepeat_Expression(), theKExpressionsPackage.getExpression(), null, "expression", null, 0, 1, Repeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abortEClass, Abort.class, "Abort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbort_Weak(), ecorePackage.getEBoolean(), "weak", null, 0, 1, Abort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbort_Delay(), this.getDelayExpr(), null, "delay", null, 0, 1, Abort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbort_DoStatements(), theSclPackage.getStatement(), null, "doStatements", null, 0, -1, Abort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbort_Cases(), this.getCase(), null, "cases", null, 0, -1, Abort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(caseEClass, Case.class, "Case", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCase_Delay(), this.getDelayExpr(), null, "delay", null, 0, 1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(awaitEClass, Await.class, "Await", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAwait_Delay(), this.getDelayExpr(), null, "delay", null, 0, 1, Await.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAwait_Cases(), this.getCase(), null, "cases", null, 0, -1, Await.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(everyDoEClass, EveryDo.class, "EveryDo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEveryDo_Delay(), this.getDelayExpr(), null, "delay", null, 0, 1, EveryDo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(suspendEClass, Suspend.class, "Suspend", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSuspend_Weak(), ecorePackage.getEBoolean(), "weak", null, 0, 1, Suspend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSuspend_Delay(), this.getDelayExpr(), null, "delay", null, 0, 1, Suspend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(trapEClass, Trap.class, "Trap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTrap_TrapSignals(), this.getISignal(), null, "trapSignals", null, 0, -1, Trap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrap_TrapHandler(), this.getTrapHandler(), null, "trapHandler", null, 0, -1, Trap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(trapHandlerEClass, TrapHandler.class, "TrapHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTrapHandler_TrapExpr(), theKExpressionsPackage.getExpression(), null, "trapExpr", null, 0, 1, TrapHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exitEClass, Exit.class, "Exit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExit_Trap(), this.getTrapSignal(), null, "trap", null, 0, 1, Exit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExit_Expression(), theKExpressionsPackage.getExpression(), null, "expression", null, 0, 1, Exit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(execEClass, Exec.class, "Exec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExec_Task(), this.getTask(), null, "task", null, 0, 1, Exec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExec_Vars(), this.getIVariable(), null, "vars", null, 0, -1, Exec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExec_Kexpressions(), theKExpressionsPackage.getExpression(), null, "kexpressions", null, 0, -1, Exec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExec_RetSignal(), this.getISignal(), null, "retSignal", null, 0, 1, Exec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExec_ExecCaseList(), this.getExecCase(), null, "execCaseList", null, 0, -1, Exec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(execCaseEClass, ExecCase.class, "ExecCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExecCase_Task(), this.getTask(), null, "task", null, 0, 1, ExecCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExecCase_Vars(), this.getIVariable(), null, "vars", null, 0, -1, ExecCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExecCase_Kexpressions(), theKExpressionsPackage.getExpression(), null, "kexpressions", null, 0, -1, ExecCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExecCase_RetSignal(), this.getISignal(), null, "retSignal", null, 0, 1, ExecCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(localSignalDeclEClass, LocalSignalDecl.class, "LocalSignalDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLocalSignalDecl_Signals(), this.getISignal(), null, "signals", null, 0, -1, LocalSignalDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(localVariableEClass, LocalVariable.class, "LocalVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLocalVariable_VarDecls(), this.getVariableDecl(), null, "varDecls", null, 0, -1, LocalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableDeclEClass, VariableDecl.class, "VariableDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariableDecl_Variables(), this.getIVariable(), null, "variables", null, 0, -1, VariableDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableDecl_Type(), this.getTypeIdentifier(), null, "type", null, 0, 1, VariableDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iVariableEClass, IVariable.class, "IVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIVariable_Expression(), theKExpressionsPackage.getExpression(), null, "expression", null, 0, 1, IVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(runEClass, Run.class, "Run", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRun_Module(), this.getModuleRenaming(), null, "module", null, 0, 1, Run.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRun_List(), this.getRenaming(), null, "list", null, 0, -1, Run.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moduleRenamingEClass, ModuleRenaming.class, "ModuleRenaming", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModuleRenaming_Module(), this.getModule(), null, "module", null, 0, 1, ModuleRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModuleRenaming_NewName(), ecorePackage.getEString(), "newName", null, 0, 1, ModuleRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(renamingEClass, Renaming.class, "Renaming", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRenaming_Annotations(), theAnnotationsPackage.getAnnotation(), null, "annotations", null, 0, -1, Renaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRenaming_Renamings(), ecorePackage.getEObject(), null, "renamings", null, 0, -1, Renaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeRenamingEClass, TypeRenaming.class, "TypeRenaming", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeRenaming_NewName(), this.getType(), null, "newName", null, 0, 1, TypeRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeRenaming_NewType(), theKExpressionsPackage.getValueType(), "newType", null, 0, 1, TypeRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeRenaming_OldName(), this.getType(), null, "oldName", null, 0, 1, TypeRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantRenamingEClass, ConstantRenaming.class, "ConstantRenaming", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstantRenaming_NewName(), theKExpressionsPackage.getValuedObject(), null, "newName", null, 0, 1, ConstantRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstantRenaming_NewValue(), ecorePackage.getEString(), "newValue", null, 0, 1, ConstantRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstantRenaming_OldName(), theKExpressionsPackage.getValuedObject(), null, "oldName", null, 0, 1, ConstantRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionRenamingEClass, FunctionRenaming.class, "FunctionRenaming", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionRenaming_NewName(), this.getFunction(), null, "newName", null, 0, 1, FunctionRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunctionRenaming_NewFunc(), ecorePackage.getEString(), "newFunc", null, 0, 1, FunctionRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionRenaming_OldName(), this.getFunction(), null, "oldName", null, 0, 1, FunctionRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(procedureRenamingEClass, ProcedureRenaming.class, "ProcedureRenaming", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProcedureRenaming_NewName(), this.getProcedure(), null, "newName", null, 0, 1, ProcedureRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcedureRenaming_OldName(), this.getProcedure(), null, "oldName", null, 0, 1, ProcedureRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(taskRenamingEClass, TaskRenaming.class, "TaskRenaming", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTaskRenaming_NewName(), this.getTask(), null, "newName", null, 0, 1, TaskRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTaskRenaming_OldName(), this.getTask(), null, "oldName", null, 0, 1, TaskRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(signalRenamingEClass, SignalRenaming.class, "SignalRenaming", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSignalRenaming_NewName(), this.getISignal(), null, "newName", null, 0, 1, SignalRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSignalRenaming_OldName(), this.getISignal(), null, "oldName", null, 0, 1, SignalRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(doEClass, Do.class, "Do", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDo_EndingAnnotations(), theAnnotationsPackage.getAnnotation(), null, "endingAnnotations", null, 0, -1, Do.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDo_Expression(), this.getDelayExpr(), null, "expression", null, 0, 1, Do.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDo_Delay(), this.getDelayExpr(), null, "delay", null, 0, 1, Do.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDo_WatchingStatements(), theSclPackage.getStatement(), null, "watchingStatements", null, 0, -1, Do.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(delayExprEClass, DelayExpr.class, "DelayExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDelayExpr_Expression(), theKExpressionsPackage.getExpression(), null, "expression", null, 0, 1, DelayExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDelayExpr_IsImmediate(), ecorePackage.getEBoolean(), "isImmediate", null, 0, 1, DelayExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDelayExpr_SignalExpr(), theKExpressionsPackage.getExpression(), null, "signalExpr", null, 0, 1, DelayExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(esterelTypeEClass, EsterelType.class, "EsterelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEsterelType_EstType(), this.getType(), null, "estType", null, 0, 1, EsterelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstant_Value(), ecorePackage.getEString(), "value", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(inputOutputEClass, InputOutput.class, "InputOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(returnEClass, Return.class, "Return", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(relationEClass, Relation.class, "Relation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRelation_Annotations(), theAnnotationsPackage.getAnnotation(), null, "annotations", null, 0, -1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelation_Relations(), this.getRelationType(), null, "relations", null, 0, -1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(trapSignalEClass, TrapSignal.class, "TrapSignal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(trapExpressionEClass, TrapExpression.class, "TrapExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTrapExpression_Trap(), this.getISignal(), null, "trap", null, 0, 1, TrapExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionExpressionEClass, FunctionExpression.class, "FunctionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionExpression_Function(), this.getFunction(), null, "function", null, 0, 1, FunctionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionExpression_Kexpressions(), theKExpressionsPackage.getExpression(), null, "kexpressions", null, 0, -1, FunctionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantExpressionEClass, ConstantExpression.class, "ConstantExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstantExpression_Constant(), this.getConstant(), null, "constant", null, 0, 1, ConstantExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstantExpression_Value(), ecorePackage.getEString(), "value", null, 0, 1, ConstantExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(signalReferenceExprEClass, SignalReferenceExpr.class, "SignalReferenceExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(trapReferenceExprEClass, TrapReferenceExpr.class, "TrapReferenceExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //EsterelPackageImpl
