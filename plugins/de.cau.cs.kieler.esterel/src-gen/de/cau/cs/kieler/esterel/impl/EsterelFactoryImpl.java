/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel.impl;

import de.cau.cs.kieler.esterel.*;

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
      EsterelFactory theEsterelFactory = (EsterelFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.cau.de/cs/kieler/Esterel"); 
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
      case EsterelPackage.PROGRAMM: return createProgramm();
      case EsterelPackage.MAIN_MODULE: return createMainModule();
      case EsterelPackage.MODULE: return createModule();
      case EsterelPackage.MODULE_BODY: return createModuleBody();
      case EsterelPackage.MODULE_INTERFACE: return createModuleInterface();
      case EsterelPackage.SIGNAL_DECL: return createSignalDecl();
      case EsterelPackage.SENSOR_DECL: return createSensorDecl();
      case EsterelPackage.RELATION_DECL: return createRelationDecl();
      case EsterelPackage.RELATION: return createRelation();
      case EsterelPackage.TYPE_DECL: return createTypeDecl();
      case EsterelPackage.TYPE: return createType();
      case EsterelPackage.CONSTANT_DECL: return createConstantDecl();
      case EsterelPackage.ONE_TYPE_CONSTANT_DECL: return createOneTypeConstantDecl();
      case EsterelPackage.CONSTANT: return createConstant();
      case EsterelPackage.FUNCTION_DECL: return createFunctionDecl();
      case EsterelPackage.FUNCTION: return createFunction();
      case EsterelPackage.STATEMENT: return createStatement();
      case EsterelPackage.BLOCK: return createBlock();
      case EsterelPackage.ASSIGNMENT: return createAssignment();
      case EsterelPackage.ABORT: return createAbort();
      case EsterelPackage.ABORT_BODY: return createAbortBody();
      case EsterelPackage.ABORT_INSTANCE: return createAbortInstance();
      case EsterelPackage.ABORT_CASE: return createAbortCase();
      case EsterelPackage.ABORT_CASE_SINGLE: return createAbortCaseSingle();
      case EsterelPackage.AWAIT: return createAwait();
      case EsterelPackage.AWAIT_BODY: return createAwaitBody();
      case EsterelPackage.AWAIT_INSTANCE: return createAwaitInstance();
      case EsterelPackage.AWAIT_CASE: return createAwaitCase();
      case EsterelPackage.DO: return createDo();
      case EsterelPackage.DO_UPTO: return createDoUpto();
      case EsterelPackage.DO_WATCHING: return createDoWatching();
      case EsterelPackage.DO_WATCHING_END: return createDoWatchingEnd();
      case EsterelPackage.EMIT: return createEmit();
      case EsterelPackage.EVERY_DO: return createEveryDo();
      case EsterelPackage.EXIT: return createExit();
      case EsterelPackage.HALT: return createHalt();
      case EsterelPackage.IF_TEST: return createIfTest();
      case EsterelPackage.ELS_IF_PART: return createElsIfPart();
      case EsterelPackage.ELS_IF: return createElsIf();
      case EsterelPackage.THEN_PART: return createThenPart();
      case EsterelPackage.ELSE_PART: return createElsePart();
      case EsterelPackage.LOOP: return createLoop();
      case EsterelPackage.LOOP_EACH: return createLoopEach();
      case EsterelPackage.LOOP_DELAY: return createLoopDelay();
      case EsterelPackage.LOOP_BODY: return createLoopBody();
      case EsterelPackage.NOTHING: return createNothing();
      case EsterelPackage.PAUSE: return createPause();
      case EsterelPackage.PRESENT: return createPresent();
      case EsterelPackage.PRESENT_BODY: return createPresentBody();
      case EsterelPackage.PRESENT_EVENT_BODY: return createPresentEventBody();
      case EsterelPackage.PRESENT_CASE_LIST: return createPresentCaseList();
      case EsterelPackage.PRESENT_CASE: return createPresentCase();
      case EsterelPackage.PRESENT_EVENT: return createPresentEvent();
      case EsterelPackage.REPEAT: return createRepeat();
      case EsterelPackage.RUN: return createRun();
      case EsterelPackage.MODULE_RENAMING: return createModuleRenaming();
      case EsterelPackage.RENAMING_LIST: return createRenamingList();
      case EsterelPackage.RENAMING: return createRenaming();
      case EsterelPackage.TYPE_RENAMING: return createTypeRenaming();
      case EsterelPackage.CONSTANT_RENAMING: return createConstantRenaming();
      case EsterelPackage.FUNCTION_RENAMING: return createFunctionRenaming();
      case EsterelPackage.SIGNAL_RENAMING: return createSignalRenaming();
      case EsterelPackage.LOCAL_SIGNAL_DECL: return createLocalSignalDecl();
      case EsterelPackage.LOCAL_SIGNAL_LIST: return createLocalSignalList();
      case EsterelPackage.SUSPEND: return createSuspend();
      case EsterelPackage.SUSTAIN: return createSustain();
      case EsterelPackage.TRAP: return createTrap();
      case EsterelPackage.TRAP_DECL_LIST: return createTrapDeclList();
      case EsterelPackage.TRAP_DECL: return createTrapDecl();
      case EsterelPackage.TRAP_HANDLER_LIST: return createTrapHandlerList();
      case EsterelPackage.TRAP_HANDLER: return createTrapHandler();
      case EsterelPackage.VARIABLE: return createVariable();
      case EsterelPackage.VARIABLE_DECL: return createVariableDecl();
      case EsterelPackage.VARIABLE_LIST: return createVariableList();
      case EsterelPackage.WEAK_ABORT: return createWeakAbort();
      case EsterelPackage.WEAK_ABORT_BODY: return createWeakAbortBody();
      case EsterelPackage.WEAK_ABORT_INSTANCE: return createWeakAbortInstance();
      case EsterelPackage.WEAK_ABORT_CASE: return createWeakAbortCase();
      case EsterelPackage.DATA_EXPR: return createDataExpr();
      case EsterelPackage.DATA_UNARY_EXPR: return createDataUnaryExpr();
      case EsterelPackage.TRAP_EXPR: return createTrapExpr();
      case EsterelPackage.SIG_EXPR: return createSigExpr();
      case EsterelPackage.SIG_EXPR_AND: return createSigExprAND();
      case EsterelPackage.SIG_EXPR_UNARY: return createSigExprUnary();
      case EsterelPackage.DELAY_EXPR: return createDelayExpr();
      case EsterelPackage.DELAY_EVENT: return createDelayEvent();
      case EsterelPackage.CHANNEL_DESCRIPTION: return createChannelDescription();
      case EsterelPackage.SIGNAL: return createSignal();
      case EsterelPackage.TICK: return createTick();
      case EsterelPackage.SENSOR: return createSensor();
      case EsterelPackage.INPUT: return createInput();
      case EsterelPackage.OUTPUT: return createOutput();
      case EsterelPackage.INPUT_OUTPUT: return createInputOutput();
      case EsterelPackage.RETURN: return createReturn();
      case EsterelPackage.PARALLEL: return createParallel();
      case EsterelPackage.SEQUENCE: return createSequence();
      case EsterelPackage.LOCAL_SIGNAL: return createLocalSignal();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Programm createProgramm()
  {
    ProgrammImpl programm = new ProgrammImpl();
    return programm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MainModule createMainModule()
  {
    MainModuleImpl mainModule = new MainModuleImpl();
    return mainModule;
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
  public ModuleBody createModuleBody()
  {
    ModuleBodyImpl moduleBody = new ModuleBodyImpl();
    return moduleBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModuleInterface createModuleInterface()
  {
    ModuleInterfaceImpl moduleInterface = new ModuleInterfaceImpl();
    return moduleInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SignalDecl createSignalDecl()
  {
    SignalDeclImpl signalDecl = new SignalDeclImpl();
    return signalDecl;
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
  public ConstantDecl createConstantDecl()
  {
    ConstantDeclImpl constantDecl = new ConstantDeclImpl();
    return constantDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OneTypeConstantDecl createOneTypeConstantDecl()
  {
    OneTypeConstantDeclImpl oneTypeConstantDecl = new OneTypeConstantDeclImpl();
    return oneTypeConstantDecl;
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
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
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
  public AbortBody createAbortBody()
  {
    AbortBodyImpl abortBody = new AbortBodyImpl();
    return abortBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbortInstance createAbortInstance()
  {
    AbortInstanceImpl abortInstance = new AbortInstanceImpl();
    return abortInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbortCase createAbortCase()
  {
    AbortCaseImpl abortCase = new AbortCaseImpl();
    return abortCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbortCaseSingle createAbortCaseSingle()
  {
    AbortCaseSingleImpl abortCaseSingle = new AbortCaseSingleImpl();
    return abortCaseSingle;
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
  public AwaitBody createAwaitBody()
  {
    AwaitBodyImpl awaitBody = new AwaitBodyImpl();
    return awaitBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AwaitInstance createAwaitInstance()
  {
    AwaitInstanceImpl awaitInstance = new AwaitInstanceImpl();
    return awaitInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AwaitCase createAwaitCase()
  {
    AwaitCaseImpl awaitCase = new AwaitCaseImpl();
    return awaitCase;
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
  public DoUpto createDoUpto()
  {
    DoUptoImpl doUpto = new DoUptoImpl();
    return doUpto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoWatching createDoWatching()
  {
    DoWatchingImpl doWatching = new DoWatchingImpl();
    return doWatching;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoWatchingEnd createDoWatchingEnd()
  {
    DoWatchingEndImpl doWatchingEnd = new DoWatchingEndImpl();
    return doWatchingEnd;
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
  public ElsIfPart createElsIfPart()
  {
    ElsIfPartImpl elsIfPart = new ElsIfPartImpl();
    return elsIfPart;
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
  public ThenPart createThenPart()
  {
    ThenPartImpl thenPart = new ThenPartImpl();
    return thenPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElsePart createElsePart()
  {
    ElsePartImpl elsePart = new ElsePartImpl();
    return elsePart;
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
  public LoopEach createLoopEach()
  {
    LoopEachImpl loopEach = new LoopEachImpl();
    return loopEach;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoopDelay createLoopDelay()
  {
    LoopDelayImpl loopDelay = new LoopDelayImpl();
    return loopDelay;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoopBody createLoopBody()
  {
    LoopBodyImpl loopBody = new LoopBodyImpl();
    return loopBody;
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
  public Pause createPause()
  {
    PauseImpl pause = new PauseImpl();
    return pause;
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
  public PresentBody createPresentBody()
  {
    PresentBodyImpl presentBody = new PresentBodyImpl();
    return presentBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PresentEventBody createPresentEventBody()
  {
    PresentEventBodyImpl presentEventBody = new PresentEventBodyImpl();
    return presentEventBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PresentCaseList createPresentCaseList()
  {
    PresentCaseListImpl presentCaseList = new PresentCaseListImpl();
    return presentCaseList;
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
  public PresentEvent createPresentEvent()
  {
    PresentEventImpl presentEvent = new PresentEventImpl();
    return presentEvent;
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
  public RenamingList createRenamingList()
  {
    RenamingListImpl renamingList = new RenamingListImpl();
    return renamingList;
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
  public LocalSignalList createLocalSignalList()
  {
    LocalSignalListImpl localSignalList = new LocalSignalListImpl();
    return localSignalList;
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
  public TrapDeclList createTrapDeclList()
  {
    TrapDeclListImpl trapDeclList = new TrapDeclListImpl();
    return trapDeclList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrapDecl createTrapDecl()
  {
    TrapDeclImpl trapDecl = new TrapDeclImpl();
    return trapDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrapHandlerList createTrapHandlerList()
  {
    TrapHandlerListImpl trapHandlerList = new TrapHandlerListImpl();
    return trapHandlerList;
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
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
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
  public VariableList createVariableList()
  {
    VariableListImpl variableList = new VariableListImpl();
    return variableList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WeakAbort createWeakAbort()
  {
    WeakAbortImpl weakAbort = new WeakAbortImpl();
    return weakAbort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WeakAbortBody createWeakAbortBody()
  {
    WeakAbortBodyImpl weakAbortBody = new WeakAbortBodyImpl();
    return weakAbortBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WeakAbortInstance createWeakAbortInstance()
  {
    WeakAbortInstanceImpl weakAbortInstance = new WeakAbortInstanceImpl();
    return weakAbortInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WeakAbortCase createWeakAbortCase()
  {
    WeakAbortCaseImpl weakAbortCase = new WeakAbortCaseImpl();
    return weakAbortCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataExpr createDataExpr()
  {
    DataExprImpl dataExpr = new DataExprImpl();
    return dataExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataUnaryExpr createDataUnaryExpr()
  {
    DataUnaryExprImpl dataUnaryExpr = new DataUnaryExprImpl();
    return dataUnaryExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrapExpr createTrapExpr()
  {
    TrapExprImpl trapExpr = new TrapExprImpl();
    return trapExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SigExpr createSigExpr()
  {
    SigExprImpl sigExpr = new SigExprImpl();
    return sigExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SigExprAND createSigExprAND()
  {
    SigExprANDImpl sigExprAND = new SigExprANDImpl();
    return sigExprAND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SigExprUnary createSigExprUnary()
  {
    SigExprUnaryImpl sigExprUnary = new SigExprUnaryImpl();
    return sigExprUnary;
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
  public DelayEvent createDelayEvent()
  {
    DelayEventImpl delayEvent = new DelayEventImpl();
    return delayEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChannelDescription createChannelDescription()
  {
    ChannelDescriptionImpl channelDescription = new ChannelDescriptionImpl();
    return channelDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Signal createSignal()
  {
    SignalImpl signal = new SignalImpl();
    return signal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tick createTick()
  {
    TickImpl tick = new TickImpl();
    return tick;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sensor createSensor()
  {
    SensorImpl sensor = new SensorImpl();
    return sensor;
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
  public Sequence createSequence()
  {
    SequenceImpl sequence = new SequenceImpl();
    return sequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalSignal createLocalSignal()
  {
    LocalSignalImpl localSignal = new LocalSignalImpl();
    return localSignal;
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
