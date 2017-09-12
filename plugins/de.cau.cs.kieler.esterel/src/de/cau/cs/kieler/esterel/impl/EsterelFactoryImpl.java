/**
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
public class EsterelFactoryImpl extends EFactoryImpl implements EsterelFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static EsterelFactory init() {
        try {
            EsterelFactory theEsterelFactory = (EsterelFactory)EPackage.Registry.INSTANCE.getEFactory(EsterelPackage.eNS_URI);
            if (theEsterelFactory != null) {
                return theEsterelFactory;
            }
        }
        catch (Exception exception) {
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
    public EsterelFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case EsterelPackage.ESTEREL_PROGRAM: return createEsterelProgram();
            case EsterelPackage.ESTEREL_MODULE: return createEsterelModule();
            case EsterelPackage.TYPE_IDENTIFIER: return createTypeIdentifier();
            case EsterelPackage.TYPE_DECLARATION: return createTypeDeclaration();
            case EsterelPackage.TYPE_DEFINITION: return createTypeDefinition();
            case EsterelPackage.CONSTANT_MULTI_DECLARATION: return createConstantMultiDeclaration();
            case EsterelPackage.CONSTANT_DECLARATION: return createConstantDeclaration();
            case EsterelPackage.CONSTANT: return createConstant();
            case EsterelPackage.FUNCTION_DECLARATION: return createFunctionDeclaration();
            case EsterelPackage.FUNCTION: return createFunction();
            case EsterelPackage.PROCEDURE_DECLARATION: return createProcedureDeclaration();
            case EsterelPackage.PROCEDURE: return createProcedure();
            case EsterelPackage.TASK_DECLARATION: return createTaskDeclaration();
            case EsterelPackage.TASK: return createTask();
            case EsterelPackage.INPUT_DECLARATION: return createInputDeclaration();
            case EsterelPackage.OUTPUT_DECLARATION: return createOutputDeclaration();
            case EsterelPackage.INPUT_OUTPUT_DECLARATION: return createInputOutputDeclaration();
            case EsterelPackage.RETURN_DECLARATION: return createReturnDeclaration();
            case EsterelPackage.SIGNAL: return createSignal();
            case EsterelPackage.SENSOR_DECLARATION: return createSensorDeclaration();
            case EsterelPackage.SENSOR: return createSensor();
            case EsterelPackage.RELATION_DECLARATION: return createRelationDeclaration();
            case EsterelPackage.RELATION: return createRelation();
            case EsterelPackage.RELATION_IMPLICATION: return createRelationImplication();
            case EsterelPackage.RELATION_INCOMPATIBILITY: return createRelationIncompatibility();
            case EsterelPackage.ESTEREL_PARALLEL: return createEsterelParallel();
            case EsterelPackage.ESTEREL_THREAD: return createEsterelThread();
            case EsterelPackage.NOTHING: return createNothing();
            case EsterelPackage.HALT: return createHalt();
            case EsterelPackage.BLOCK: return createBlock();
            case EsterelPackage.EMIT: return createEmit();
            case EsterelPackage.SUSTAIN: return createSustain();
            case EsterelPackage.PROCEDURE_CALL: return createProcedureCall();
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
            case EsterelPackage.LOCAL_SIGNAL_DECLARATION: return createLocalSignalDeclaration();
            case EsterelPackage.LOCAL_VARIABLE_DECLARATION: return createLocalVariableDeclaration();
            case EsterelPackage.ESTEREL_VARIABLE_DECLARATION: return createEsterelVariableDeclaration();
            case EsterelPackage.VARIABLE: return createVariable();
            case EsterelPackage.RUN: return createRun();
            case EsterelPackage.MODULE_RENAMING: return createModuleRenaming();
            case EsterelPackage.RENAMINGS: return createRenamings();
            case EsterelPackage.TYPE_RENAMING: return createTypeRenaming();
            case EsterelPackage.CONSTANT_RENAMING: return createConstantRenaming();
            case EsterelPackage.FUNCTION_RENAMING: return createFunctionRenaming();
            case EsterelPackage.PROCEDURE_RENAMING: return createProcedureRenaming();
            case EsterelPackage.TASK_RENAMING: return createTaskRenaming();
            case EsterelPackage.SIGNAL_RENAMING: return createSignalRenaming();
            case EsterelPackage.DO: return createDo();
            case EsterelPackage.DELAY_EXPR: return createDelayExpr();
            case EsterelPackage.TRAP_SIGNAL: return createTrapSignal();
            case EsterelPackage.TRAP_EXPRESSION: return createTrapExpression();
            case EsterelPackage.ESTEREL_FUNCTION_CALL: return createEsterelFunctionCall();
            case EsterelPackage.CONSTANT_EXPRESSION: return createConstantExpression();
            case EsterelPackage.TRAP_REFERENCE_EXPR: return createTrapReferenceExpr();
            case EsterelPackage.SIGNAL_REFERENCE_EXPR: return createSignalReferenceExpr();
            case EsterelPackage.SC_EST_STATEMENT: return createSCEstStatement();
            case EsterelPackage.UN_EMIT: return createUnEmit();
            case EsterelPackage.SET: return createSet();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EsterelProgram createEsterelProgram() {
        EsterelProgramImpl esterelProgram = new EsterelProgramImpl();
        return esterelProgram;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EsterelModule createEsterelModule() {
        EsterelModuleImpl esterelModule = new EsterelModuleImpl();
        return esterelModule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeIdentifier createTypeIdentifier() {
        TypeIdentifierImpl typeIdentifier = new TypeIdentifierImpl();
        return typeIdentifier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeDeclaration createTypeDeclaration() {
        TypeDeclarationImpl typeDeclaration = new TypeDeclarationImpl();
        return typeDeclaration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeDefinition createTypeDefinition() {
        TypeDefinitionImpl typeDefinition = new TypeDefinitionImpl();
        return typeDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConstantMultiDeclaration createConstantMultiDeclaration() {
        ConstantMultiDeclarationImpl constantMultiDeclaration = new ConstantMultiDeclarationImpl();
        return constantMultiDeclaration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConstantDeclaration createConstantDeclaration() {
        ConstantDeclarationImpl constantDeclaration = new ConstantDeclarationImpl();
        return constantDeclaration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Constant createConstant() {
        ConstantImpl constant = new ConstantImpl();
        return constant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FunctionDeclaration createFunctionDeclaration() {
        FunctionDeclarationImpl functionDeclaration = new FunctionDeclarationImpl();
        return functionDeclaration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Function createFunction() {
        FunctionImpl function = new FunctionImpl();
        return function;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcedureDeclaration createProcedureDeclaration() {
        ProcedureDeclarationImpl procedureDeclaration = new ProcedureDeclarationImpl();
        return procedureDeclaration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Procedure createProcedure() {
        ProcedureImpl procedure = new ProcedureImpl();
        return procedure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TaskDeclaration createTaskDeclaration() {
        TaskDeclarationImpl taskDeclaration = new TaskDeclarationImpl();
        return taskDeclaration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Task createTask() {
        TaskImpl task = new TaskImpl();
        return task;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputDeclaration createInputDeclaration() {
        InputDeclarationImpl inputDeclaration = new InputDeclarationImpl();
        return inputDeclaration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OutputDeclaration createOutputDeclaration() {
        OutputDeclarationImpl outputDeclaration = new OutputDeclarationImpl();
        return outputDeclaration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputOutputDeclaration createInputOutputDeclaration() {
        InputOutputDeclarationImpl inputOutputDeclaration = new InputOutputDeclarationImpl();
        return inputOutputDeclaration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReturnDeclaration createReturnDeclaration() {
        ReturnDeclarationImpl returnDeclaration = new ReturnDeclarationImpl();
        return returnDeclaration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Signal createSignal() {
        SignalImpl signal = new SignalImpl();
        return signal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SensorDeclaration createSensorDeclaration() {
        SensorDeclarationImpl sensorDeclaration = new SensorDeclarationImpl();
        return sensorDeclaration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Sensor createSensor() {
        SensorImpl sensor = new SensorImpl();
        return sensor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RelationDeclaration createRelationDeclaration() {
        RelationDeclarationImpl relationDeclaration = new RelationDeclarationImpl();
        return relationDeclaration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Relation createRelation() {
        RelationImpl relation = new RelationImpl();
        return relation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RelationImplication createRelationImplication() {
        RelationImplicationImpl relationImplication = new RelationImplicationImpl();
        return relationImplication;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RelationIncompatibility createRelationIncompatibility() {
        RelationIncompatibilityImpl relationIncompatibility = new RelationIncompatibilityImpl();
        return relationIncompatibility;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EsterelParallel createEsterelParallel() {
        EsterelParallelImpl esterelParallel = new EsterelParallelImpl();
        return esterelParallel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EsterelThread createEsterelThread() {
        EsterelThreadImpl esterelThread = new EsterelThreadImpl();
        return esterelThread;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Nothing createNothing() {
        NothingImpl nothing = new NothingImpl();
        return nothing;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Halt createHalt() {
        HaltImpl halt = new HaltImpl();
        return halt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Block createBlock() {
        BlockImpl block = new BlockImpl();
        return block;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Emit createEmit() {
        EmitImpl emit = new EmitImpl();
        return emit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Sustain createSustain() {
        SustainImpl sustain = new SustainImpl();
        return sustain;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcedureCall createProcedureCall() {
        ProcedureCallImpl procedureCall = new ProcedureCallImpl();
        return procedureCall;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Present createPresent() {
        PresentImpl present = new PresentImpl();
        return present;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PresentCase createPresentCase() {
        PresentCaseImpl presentCase = new PresentCaseImpl();
        return presentCase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IfTest createIfTest() {
        IfTestImpl ifTest = new IfTestImpl();
        return ifTest;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ElsIf createElsIf() {
        ElsIfImpl elsIf = new ElsIfImpl();
        return elsIf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Loop createLoop() {
        LoopImpl loop = new LoopImpl();
        return loop;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Repeat createRepeat() {
        RepeatImpl repeat = new RepeatImpl();
        return repeat;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Abort createAbort() {
        AbortImpl abort = new AbortImpl();
        return abort;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Case createCase() {
        CaseImpl case_ = new CaseImpl();
        return case_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Await createAwait() {
        AwaitImpl await = new AwaitImpl();
        return await;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EveryDo createEveryDo() {
        EveryDoImpl everyDo = new EveryDoImpl();
        return everyDo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Suspend createSuspend() {
        SuspendImpl suspend = new SuspendImpl();
        return suspend;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Trap createTrap() {
        TrapImpl trap = new TrapImpl();
        return trap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TrapHandler createTrapHandler() {
        TrapHandlerImpl trapHandler = new TrapHandlerImpl();
        return trapHandler;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Exit createExit() {
        ExitImpl exit = new ExitImpl();
        return exit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Exec createExec() {
        ExecImpl exec = new ExecImpl();
        return exec;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExecCase createExecCase() {
        ExecCaseImpl execCase = new ExecCaseImpl();
        return execCase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LocalSignalDeclaration createLocalSignalDeclaration() {
        LocalSignalDeclarationImpl localSignalDeclaration = new LocalSignalDeclarationImpl();
        return localSignalDeclaration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LocalVariableDeclaration createLocalVariableDeclaration() {
        LocalVariableDeclarationImpl localVariableDeclaration = new LocalVariableDeclarationImpl();
        return localVariableDeclaration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EsterelVariableDeclaration createEsterelVariableDeclaration() {
        EsterelVariableDeclarationImpl esterelVariableDeclaration = new EsterelVariableDeclarationImpl();
        return esterelVariableDeclaration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Variable createVariable() {
        VariableImpl variable = new VariableImpl();
        return variable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Run createRun() {
        RunImpl run = new RunImpl();
        return run;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModuleRenaming createModuleRenaming() {
        ModuleRenamingImpl moduleRenaming = new ModuleRenamingImpl();
        return moduleRenaming;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Renamings createRenamings() {
        RenamingsImpl renamings = new RenamingsImpl();
        return renamings;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeRenaming createTypeRenaming() {
        TypeRenamingImpl typeRenaming = new TypeRenamingImpl();
        return typeRenaming;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConstantRenaming createConstantRenaming() {
        ConstantRenamingImpl constantRenaming = new ConstantRenamingImpl();
        return constantRenaming;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FunctionRenaming createFunctionRenaming() {
        FunctionRenamingImpl functionRenaming = new FunctionRenamingImpl();
        return functionRenaming;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcedureRenaming createProcedureRenaming() {
        ProcedureRenamingImpl procedureRenaming = new ProcedureRenamingImpl();
        return procedureRenaming;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TaskRenaming createTaskRenaming() {
        TaskRenamingImpl taskRenaming = new TaskRenamingImpl();
        return taskRenaming;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SignalRenaming createSignalRenaming() {
        SignalRenamingImpl signalRenaming = new SignalRenamingImpl();
        return signalRenaming;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Do createDo() {
        DoImpl do_ = new DoImpl();
        return do_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DelayExpr createDelayExpr() {
        DelayExprImpl delayExpr = new DelayExprImpl();
        return delayExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TrapSignal createTrapSignal() {
        TrapSignalImpl trapSignal = new TrapSignalImpl();
        return trapSignal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TrapExpression createTrapExpression() {
        TrapExpressionImpl trapExpression = new TrapExpressionImpl();
        return trapExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EsterelFunctionCall createEsterelFunctionCall() {
        EsterelFunctionCallImpl esterelFunctionCall = new EsterelFunctionCallImpl();
        return esterelFunctionCall;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConstantExpression createConstantExpression() {
        ConstantExpressionImpl constantExpression = new ConstantExpressionImpl();
        return constantExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TrapReferenceExpr createTrapReferenceExpr() {
        TrapReferenceExprImpl trapReferenceExpr = new TrapReferenceExprImpl();
        return trapReferenceExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SignalReferenceExpr createSignalReferenceExpr() {
        SignalReferenceExprImpl signalReferenceExpr = new SignalReferenceExprImpl();
        return signalReferenceExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SCEstStatement createSCEstStatement() {
        SCEstStatementImpl scEstStatement = new SCEstStatementImpl();
        return scEstStatement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UnEmit createUnEmit() {
        UnEmitImpl unEmit = new UnEmitImpl();
        return unEmit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Set createSet() {
        SetImpl set = new SetImpl();
        return set;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EsterelPackage getEsterelPackage() {
        return (EsterelPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static EsterelPackage getPackage() {
        return EsterelPackage.eINSTANCE;
    }

} //EsterelFactoryImpl
