/**
 */
package de.cau.cs.kieler.esterel.esterel.impl;

import de.cau.cs.kieler.esterel.esterel.*;

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
public class EsterelFactoryImpl extends EFactoryImpl implements EsterelFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EsterelFactory init()
  {
    try
    {
      EsterelFactory theEsterelFactory = (EsterelFactory)EPackage.Registry.INSTANCE.getEFactory(EsterelPackage.eNS_URI);
      if (theEsterelFactory != null)
      {
        return theEsterelFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EsterelFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EsterelFactoryImpl()
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
      case EsterelPackage.PROGRAM: return createProgram();
      case EsterelPackage.MODULE: return createModule();
      case EsterelPackage.TYPE_IDENTIFIER: return createTypeIdentifier();
      case EsterelPackage.TYPE_DECL: return createTypeDecl();
      case EsterelPackage.TYPE: return createType();
      case EsterelPackage.CONSTANT_DECLS: return createConstantDecls();
      case EsterelPackage.ONE_TYPE_CONSTANT_DECLS: return createOneTypeConstantDecls();
      case EsterelPackage.FUNCTION_DECL: return createFunctionDecl();
      case EsterelPackage.FUNCTION: return createFunction();
      case EsterelPackage.PROCEDURE_DECL: return createProcedureDecl();
      case EsterelPackage.PROCEDURE: return createProcedure();
      case EsterelPackage.TASK_DECL: return createTaskDecl();
      case EsterelPackage.TASK: return createTask();
      case EsterelPackage.INTERFACE_SIGNAL_DECL: return createInterfaceSignalDecl();
      case EsterelPackage.ISIGNAL: return createISignal();
      case EsterelPackage.SENSOR_DECL: return createSensorDecl();
      case EsterelPackage.SENSOR_WITH_TYPE: return createSensorWithType();
      case EsterelPackage.RELATION_DECL: return createRelationDecl();
      case EsterelPackage.RELATION_TYPE: return createRelationType();
      case EsterelPackage.RELATION_IMPLICATION: return createRelationImplication();
      case EsterelPackage.RELATION_INCOMPATIBILITY: return createRelationIncompatibility();
      case EsterelPackage.ESTEREL_PARALLEL: return createEsterelParallel();
      case EsterelPackage.ESTEREL_THREAD: return createEsterelThread();
      case EsterelPackage.NOTHING: return createNothing();
      case EsterelPackage.HALT: return createHalt();
      case EsterelPackage.BLOCK: return createBlock();
      case EsterelPackage.EMIT: return createEmit();
      case EsterelPackage.SUSTAIN: return createSustain();
      case EsterelPackage.ESTEREL_ASSIGNMENT: return createEsterelAssignment();
      case EsterelPackage.PROC_CALL: return createProcCall();
      case EsterelPackage.PRESENT: return createPresent();
      case EsterelPackage.PRESENT_CASE: return createPresentCase();
      case EsterelPackage.IF_TEST: return createIfTest();
      case EsterelPackage.ELS_IF: return createElsIf();
      case EsterelPackage.LOOP: return createLoop();
      case EsterelPackage.REPEAT: return createRepeat();
      case EsterelPackage.ABORT: return createAbort();
      case EsterelPackage.CASE: return createCase();
      case EsterelPackage.AWAIT: return createAwait();
      case EsterelPackage.EVERY_DO: return createEveryDo();
      case EsterelPackage.SUSPEND: return createSuspend();
      case EsterelPackage.TRAP: return createTrap();
      case EsterelPackage.TRAP_HANDLER: return createTrapHandler();
      case EsterelPackage.EXIT: return createExit();
      case EsterelPackage.EXEC: return createExec();
      case EsterelPackage.EXEC_CASE: return createExecCase();
      case EsterelPackage.LOCAL_SIGNAL_DECL: return createLocalSignalDecl();
      case EsterelPackage.LOCAL_VARIABLE: return createLocalVariable();
      case EsterelPackage.VARIABLE_DECL: return createVariableDecl();
      case EsterelPackage.IVARIABLE: return createIVariable();
      case EsterelPackage.RUN: return createRun();
      case EsterelPackage.MODULE_RENAMING: return createModuleRenaming();
      case EsterelPackage.RENAMING: return createRenaming();
      case EsterelPackage.TYPE_RENAMING: return createTypeRenaming();
      case EsterelPackage.CONSTANT_RENAMING: return createConstantRenaming();
      case EsterelPackage.FUNCTION_RENAMING: return createFunctionRenaming();
      case EsterelPackage.PROCEDURE_RENAMING: return createProcedureRenaming();
      case EsterelPackage.TASK_RENAMING: return createTaskRenaming();
      case EsterelPackage.SIGNAL_RENAMING: return createSignalRenaming();
      case EsterelPackage.DO: return createDo();
      case EsterelPackage.DELAY_EXPR: return createDelayExpr();
      case EsterelPackage.ESTEREL_TYPE: return createEsterelType();
      case EsterelPackage.CONSTANT: return createConstant();
      case EsterelPackage.INPUT: return createInput();
      case EsterelPackage.OUTPUT: return createOutput();
      case EsterelPackage.INPUT_OUTPUT: return createInputOutput();
      case EsterelPackage.RETURN: return createReturn();
      case EsterelPackage.RELATION: return createRelation();
      case EsterelPackage.TRAP_SIGNAL: return createTrapSignal();
      case EsterelPackage.TRAP_EXPRESSION: return createTrapExpression();
      case EsterelPackage.FUNCTION_EXPRESSION: return createFunctionExpression();
      case EsterelPackage.CONSTANT_EXPRESSION: return createConstantExpression();
      case EsterelPackage.SIGNAL_REFERENCE_EXPR: return createSignalReferenceExpr();
      case EsterelPackage.TRAP_REFERENCE_EXPR: return createTrapReferenceExpr();
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
  public Module createModule()
  {
    ModuleImpl module = new ModuleImpl();
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeIdentifier createTypeIdentifier()
  {
    TypeIdentifierImpl typeIdentifier = new TypeIdentifierImpl();
    return typeIdentifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDecl createTypeDecl()
  {
    TypeDeclImpl typeDecl = new TypeDeclImpl();
    return typeDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantDecls createConstantDecls()
  {
    ConstantDeclsImpl constantDecls = new ConstantDeclsImpl();
    return constantDecls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OneTypeConstantDecls createOneTypeConstantDecls()
  {
    OneTypeConstantDeclsImpl oneTypeConstantDecls = new OneTypeConstantDeclsImpl();
    return oneTypeConstantDecls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDecl createFunctionDecl()
  {
    FunctionDeclImpl functionDecl = new FunctionDeclImpl();
    return functionDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcedureDecl createProcedureDecl()
  {
    ProcedureDeclImpl procedureDecl = new ProcedureDeclImpl();
    return procedureDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Procedure createProcedure()
  {
    ProcedureImpl procedure = new ProcedureImpl();
    return procedure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskDecl createTaskDecl()
  {
    TaskDeclImpl taskDecl = new TaskDeclImpl();
    return taskDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Task createTask()
  {
    TaskImpl task = new TaskImpl();
    return task;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceSignalDecl createInterfaceSignalDecl()
  {
    InterfaceSignalDeclImpl interfaceSignalDecl = new InterfaceSignalDeclImpl();
    return interfaceSignalDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ISignal createISignal()
  {
    ISignalImpl iSignal = new ISignalImpl();
    return iSignal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SensorDecl createSensorDecl()
  {
    SensorDeclImpl sensorDecl = new SensorDeclImpl();
    return sensorDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SensorWithType createSensorWithType()
  {
    SensorWithTypeImpl sensorWithType = new SensorWithTypeImpl();
    return sensorWithType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationDecl createRelationDecl()
  {
    RelationDeclImpl relationDecl = new RelationDeclImpl();
    return relationDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationType createRelationType()
  {
    RelationTypeImpl relationType = new RelationTypeImpl();
    return relationType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationImplication createRelationImplication()
  {
    RelationImplicationImpl relationImplication = new RelationImplicationImpl();
    return relationImplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationIncompatibility createRelationIncompatibility()
  {
    RelationIncompatibilityImpl relationIncompatibility = new RelationIncompatibilityImpl();
    return relationIncompatibility;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EsterelParallel createEsterelParallel()
  {
    EsterelParallelImpl esterelParallel = new EsterelParallelImpl();
    return esterelParallel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EsterelThread createEsterelThread()
  {
    EsterelThreadImpl esterelThread = new EsterelThreadImpl();
    return esterelThread;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Nothing createNothing()
  {
    NothingImpl nothing = new NothingImpl();
    return nothing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Halt createHalt()
  {
    HaltImpl halt = new HaltImpl();
    return halt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Emit createEmit()
  {
    EmitImpl emit = new EmitImpl();
    return emit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sustain createSustain()
  {
    SustainImpl sustain = new SustainImpl();
    return sustain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EsterelAssignment createEsterelAssignment()
  {
    EsterelAssignmentImpl esterelAssignment = new EsterelAssignmentImpl();
    return esterelAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcCall createProcCall()
  {
    ProcCallImpl procCall = new ProcCallImpl();
    return procCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Present createPresent()
  {
    PresentImpl present = new PresentImpl();
    return present;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PresentCase createPresentCase()
  {
    PresentCaseImpl presentCase = new PresentCaseImpl();
    return presentCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfTest createIfTest()
  {
    IfTestImpl ifTest = new IfTestImpl();
    return ifTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElsIf createElsIf()
  {
    ElsIfImpl elsIf = new ElsIfImpl();
    return elsIf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Loop createLoop()
  {
    LoopImpl loop = new LoopImpl();
    return loop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Repeat createRepeat()
  {
    RepeatImpl repeat = new RepeatImpl();
    return repeat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Abort createAbort()
  {
    AbortImpl abort = new AbortImpl();
    return abort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Case createCase()
  {
    CaseImpl case_ = new CaseImpl();
    return case_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Await createAwait()
  {
    AwaitImpl await = new AwaitImpl();
    return await;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EveryDo createEveryDo()
  {
    EveryDoImpl everyDo = new EveryDoImpl();
    return everyDo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Suspend createSuspend()
  {
    SuspendImpl suspend = new SuspendImpl();
    return suspend;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trap createTrap()
  {
    TrapImpl trap = new TrapImpl();
    return trap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrapHandler createTrapHandler()
  {
    TrapHandlerImpl trapHandler = new TrapHandlerImpl();
    return trapHandler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exit createExit()
  {
    ExitImpl exit = new ExitImpl();
    return exit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exec createExec()
  {
    ExecImpl exec = new ExecImpl();
    return exec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExecCase createExecCase()
  {
    ExecCaseImpl execCase = new ExecCaseImpl();
    return execCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalSignalDecl createLocalSignalDecl()
  {
    LocalSignalDeclImpl localSignalDecl = new LocalSignalDeclImpl();
    return localSignalDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalVariable createLocalVariable()
  {
    LocalVariableImpl localVariable = new LocalVariableImpl();
    return localVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDecl createVariableDecl()
  {
    VariableDeclImpl variableDecl = new VariableDeclImpl();
    return variableDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IVariable createIVariable()
  {
    IVariableImpl iVariable = new IVariableImpl();
    return iVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Run createRun()
  {
    RunImpl run = new RunImpl();
    return run;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModuleRenaming createModuleRenaming()
  {
    ModuleRenamingImpl moduleRenaming = new ModuleRenamingImpl();
    return moduleRenaming;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Renaming createRenaming()
  {
    RenamingImpl renaming = new RenamingImpl();
    return renaming;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeRenaming createTypeRenaming()
  {
    TypeRenamingImpl typeRenaming = new TypeRenamingImpl();
    return typeRenaming;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantRenaming createConstantRenaming()
  {
    ConstantRenamingImpl constantRenaming = new ConstantRenamingImpl();
    return constantRenaming;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionRenaming createFunctionRenaming()
  {
    FunctionRenamingImpl functionRenaming = new FunctionRenamingImpl();
    return functionRenaming;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcedureRenaming createProcedureRenaming()
  {
    ProcedureRenamingImpl procedureRenaming = new ProcedureRenamingImpl();
    return procedureRenaming;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskRenaming createTaskRenaming()
  {
    TaskRenamingImpl taskRenaming = new TaskRenamingImpl();
    return taskRenaming;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SignalRenaming createSignalRenaming()
  {
    SignalRenamingImpl signalRenaming = new SignalRenamingImpl();
    return signalRenaming;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Do createDo()
  {
    DoImpl do_ = new DoImpl();
    return do_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DelayExpr createDelayExpr()
  {
    DelayExprImpl delayExpr = new DelayExprImpl();
    return delayExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EsterelType createEsterelType()
  {
    EsterelTypeImpl esterelType = new EsterelTypeImpl();
    return esterelType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constant createConstant()
  {
    ConstantImpl constant = new ConstantImpl();
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Input createInput()
  {
    InputImpl input = new InputImpl();
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Output createOutput()
  {
    OutputImpl output = new OutputImpl();
    return output;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputOutput createInputOutput()
  {
    InputOutputImpl inputOutput = new InputOutputImpl();
    return inputOutput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Return createReturn()
  {
    ReturnImpl return_ = new ReturnImpl();
    return return_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relation createRelation()
  {
    RelationImpl relation = new RelationImpl();
    return relation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrapSignal createTrapSignal()
  {
    TrapSignalImpl trapSignal = new TrapSignalImpl();
    return trapSignal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrapExpression createTrapExpression()
  {
    TrapExpressionImpl trapExpression = new TrapExpressionImpl();
    return trapExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionExpression createFunctionExpression()
  {
    FunctionExpressionImpl functionExpression = new FunctionExpressionImpl();
    return functionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantExpression createConstantExpression()
  {
    ConstantExpressionImpl constantExpression = new ConstantExpressionImpl();
    return constantExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SignalReferenceExpr createSignalReferenceExpr()
  {
    SignalReferenceExprImpl signalReferenceExpr = new SignalReferenceExprImpl();
    return signalReferenceExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrapReferenceExpr createTrapReferenceExpr()
  {
    TrapReferenceExprImpl trapReferenceExpr = new TrapReferenceExprImpl();
    return trapReferenceExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EsterelPackage getEsterelPackage()
  {
    return (EsterelPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EsterelPackage getPackage()
  {
    return EsterelPackage.eINSTANCE;
  }

} //EsterelFactoryImpl
