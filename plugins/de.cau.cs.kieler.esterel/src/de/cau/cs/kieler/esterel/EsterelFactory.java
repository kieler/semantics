/**
 */
package de.cau.cs.kieler.esterel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.esterel.EsterelPackage
 * @generated
 */
public interface EsterelFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EsterelFactory eINSTANCE = de.cau.cs.kieler.esterel.impl.EsterelFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Program</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Program</em>'.
     * @generated
     */
    EsterelProgram createEsterelProgram();

    /**
     * Returns a new object of class '<em>Module</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Module</em>'.
     * @generated
     */
    EsterelModule createEsterelModule();

    /**
     * Returns a new object of class '<em>Type Identifier</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Type Identifier</em>'.
     * @generated
     */
    TypeIdentifier createTypeIdentifier();

    /**
     * Returns a new object of class '<em>Type Declaration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Type Declaration</em>'.
     * @generated
     */
    TypeDeclaration createTypeDeclaration();

    /**
     * Returns a new object of class '<em>Type Definition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Type Definition</em>'.
     * @generated
     */
    TypeDefinition createTypeDefinition();

    /**
     * Returns a new object of class '<em>Constant Multi Declaration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Constant Multi Declaration</em>'.
     * @generated
     */
    ConstantMultiDeclaration createConstantMultiDeclaration();

    /**
     * Returns a new object of class '<em>Constant Declaration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Constant Declaration</em>'.
     * @generated
     */
    ConstantDeclaration createConstantDeclaration();

    /**
     * Returns a new object of class '<em>Constant</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Constant</em>'.
     * @generated
     */
    Constant createConstant();

    /**
     * Returns a new object of class '<em>Function Declaration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Function Declaration</em>'.
     * @generated
     */
    FunctionDeclaration createFunctionDeclaration();

    /**
     * Returns a new object of class '<em>Function</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Function</em>'.
     * @generated
     */
    Function createFunction();

    /**
     * Returns a new object of class '<em>Procedure Declaration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Procedure Declaration</em>'.
     * @generated
     */
    ProcedureDeclaration createProcedureDeclaration();

    /**
     * Returns a new object of class '<em>Procedure</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Procedure</em>'.
     * @generated
     */
    Procedure createProcedure();

    /**
     * Returns a new object of class '<em>Task Declaration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Task Declaration</em>'.
     * @generated
     */
    TaskDeclaration createTaskDeclaration();

    /**
     * Returns a new object of class '<em>Task</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Task</em>'.
     * @generated
     */
    Task createTask();

    /**
     * Returns a new object of class '<em>Input Declaration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Input Declaration</em>'.
     * @generated
     */
    InputDeclaration createInputDeclaration();

    /**
     * Returns a new object of class '<em>Output Declaration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Output Declaration</em>'.
     * @generated
     */
    OutputDeclaration createOutputDeclaration();

    /**
     * Returns a new object of class '<em>Input Output Declaration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Input Output Declaration</em>'.
     * @generated
     */
    InputOutputDeclaration createInputOutputDeclaration();

    /**
     * Returns a new object of class '<em>Return Declaration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Return Declaration</em>'.
     * @generated
     */
    ReturnDeclaration createReturnDeclaration();

    /**
     * Returns a new object of class '<em>Signal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Signal</em>'.
     * @generated
     */
    Signal createSignal();

    /**
     * Returns a new object of class '<em>Sensor Declaration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sensor Declaration</em>'.
     * @generated
     */
    SensorDeclaration createSensorDeclaration();

    /**
     * Returns a new object of class '<em>Sensor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sensor</em>'.
     * @generated
     */
    Sensor createSensor();

    /**
     * Returns a new object of class '<em>Relation Declaration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Relation Declaration</em>'.
     * @generated
     */
    RelationDeclaration createRelationDeclaration();

    /**
     * Returns a new object of class '<em>Relation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Relation</em>'.
     * @generated
     */
    Relation createRelation();

    /**
     * Returns a new object of class '<em>Relation Implication</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Relation Implication</em>'.
     * @generated
     */
    RelationImplication createRelationImplication();

    /**
     * Returns a new object of class '<em>Relation Incompatibility</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Relation Incompatibility</em>'.
     * @generated
     */
    RelationIncompatibility createRelationIncompatibility();

    /**
     * Returns a new object of class '<em>Parallel</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Parallel</em>'.
     * @generated
     */
    EsterelParallel createEsterelParallel();

    /**
     * Returns a new object of class '<em>Thread</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Thread</em>'.
     * @generated
     */
    EsterelThread createEsterelThread();

    /**
     * Returns a new object of class '<em>Nothing</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Nothing</em>'.
     * @generated
     */
    Nothing createNothing();

    /**
     * Returns a new object of class '<em>Halt</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Halt</em>'.
     * @generated
     */
    Halt createHalt();

    /**
     * Returns a new object of class '<em>Block</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Block</em>'.
     * @generated
     */
    Block createBlock();

    /**
     * Returns a new object of class '<em>Emit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Emit</em>'.
     * @generated
     */
    Emit createEmit();

    /**
     * Returns a new object of class '<em>Sustain</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sustain</em>'.
     * @generated
     */
    Sustain createSustain();

    /**
     * Returns a new object of class '<em>Procedure Call</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Procedure Call</em>'.
     * @generated
     */
    ProcedureCall createProcedureCall();

    /**
     * Returns a new object of class '<em>Present</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Present</em>'.
     * @generated
     */
    Present createPresent();

    /**
     * Returns a new object of class '<em>Present Case</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Present Case</em>'.
     * @generated
     */
    PresentCase createPresentCase();

    /**
     * Returns a new object of class '<em>If Test</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>If Test</em>'.
     * @generated
     */
    IfTest createIfTest();

    /**
     * Returns a new object of class '<em>Els If</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Els If</em>'.
     * @generated
     */
    ElsIf createElsIf();

    /**
     * Returns a new object of class '<em>Loop</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Loop</em>'.
     * @generated
     */
    Loop createLoop();

    /**
     * Returns a new object of class '<em>Repeat</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Repeat</em>'.
     * @generated
     */
    Repeat createRepeat();

    /**
     * Returns a new object of class '<em>Abort</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Abort</em>'.
     * @generated
     */
    Abort createAbort();

    /**
     * Returns a new object of class '<em>Case</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Case</em>'.
     * @generated
     */
    Case createCase();

    /**
     * Returns a new object of class '<em>Await</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Await</em>'.
     * @generated
     */
    Await createAwait();

    /**
     * Returns a new object of class '<em>Every Do</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Every Do</em>'.
     * @generated
     */
    EveryDo createEveryDo();

    /**
     * Returns a new object of class '<em>Suspend</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Suspend</em>'.
     * @generated
     */
    Suspend createSuspend();

    /**
     * Returns a new object of class '<em>Trap</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Trap</em>'.
     * @generated
     */
    Trap createTrap();

    /**
     * Returns a new object of class '<em>Trap Handler</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Trap Handler</em>'.
     * @generated
     */
    TrapHandler createTrapHandler();

    /**
     * Returns a new object of class '<em>Exit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exit</em>'.
     * @generated
     */
    Exit createExit();

    /**
     * Returns a new object of class '<em>Exec</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exec</em>'.
     * @generated
     */
    Exec createExec();

    /**
     * Returns a new object of class '<em>Exec Case</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exec Case</em>'.
     * @generated
     */
    ExecCase createExecCase();

    /**
     * Returns a new object of class '<em>Local Signal Declaration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Local Signal Declaration</em>'.
     * @generated
     */
    LocalSignalDeclaration createLocalSignalDeclaration();

    /**
     * Returns a new object of class '<em>Local Variable Declaration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Local Variable Declaration</em>'.
     * @generated
     */
    LocalVariableDeclaration createLocalVariableDeclaration();

    /**
     * Returns a new object of class '<em>Variable Declaration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Variable Declaration</em>'.
     * @generated
     */
    EsterelVariableDeclaration createEsterelVariableDeclaration();

    /**
     * Returns a new object of class '<em>Variable</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Variable</em>'.
     * @generated
     */
    Variable createVariable();

    /**
     * Returns a new object of class '<em>Run</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Run</em>'.
     * @generated
     */
    Run createRun();

    /**
     * Returns a new object of class '<em>Module Renaming</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Module Renaming</em>'.
     * @generated
     */
    ModuleRenaming createModuleRenaming();

    /**
     * Returns a new object of class '<em>Renamings</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Renamings</em>'.
     * @generated
     */
    Renamings createRenamings();

    /**
     * Returns a new object of class '<em>Type Renaming</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Type Renaming</em>'.
     * @generated
     */
    TypeRenaming createTypeRenaming();

    /**
     * Returns a new object of class '<em>Constant Renaming</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Constant Renaming</em>'.
     * @generated
     */
    ConstantRenaming createConstantRenaming();

    /**
     * Returns a new object of class '<em>Function Renaming</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Function Renaming</em>'.
     * @generated
     */
    FunctionRenaming createFunctionRenaming();

    /**
     * Returns a new object of class '<em>Procedure Renaming</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Procedure Renaming</em>'.
     * @generated
     */
    ProcedureRenaming createProcedureRenaming();

    /**
     * Returns a new object of class '<em>Task Renaming</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Task Renaming</em>'.
     * @generated
     */
    TaskRenaming createTaskRenaming();

    /**
     * Returns a new object of class '<em>Signal Renaming</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Signal Renaming</em>'.
     * @generated
     */
    SignalRenaming createSignalRenaming();

    /**
     * Returns a new object of class '<em>Do</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Do</em>'.
     * @generated
     */
    Do createDo();

    /**
     * Returns a new object of class '<em>Delay Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Delay Expr</em>'.
     * @generated
     */
    DelayExpr createDelayExpr();

    /**
     * Returns a new object of class '<em>Trap Signal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Trap Signal</em>'.
     * @generated
     */
    TrapSignal createTrapSignal();

    /**
     * Returns a new object of class '<em>Trap Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Trap Expression</em>'.
     * @generated
     */
    TrapExpression createTrapExpression();

    /**
     * Returns a new object of class '<em>Function Call</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Function Call</em>'.
     * @generated
     */
    EsterelFunctionCall createEsterelFunctionCall();

    /**
     * Returns a new object of class '<em>Constant Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Constant Expression</em>'.
     * @generated
     */
    ConstantExpression createConstantExpression();

    /**
     * Returns a new object of class '<em>Trap Reference Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Trap Reference Expr</em>'.
     * @generated
     */
    TrapReferenceExpr createTrapReferenceExpr();

    /**
     * Returns a new object of class '<em>Signal Reference Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Signal Reference Expr</em>'.
     * @generated
     */
    SignalReferenceExpr createSignalReferenceExpr();

    /**
     * Returns a new object of class '<em>Tick Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Tick Reference</em>'.
     * @generated
     */
    TickReference createTickReference();

    /**
     * Returns a new object of class '<em>SC Est Statement</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>SC Est Statement</em>'.
     * @generated
     */
    SCEstStatement createSCEstStatement();

    /**
     * Returns a new object of class '<em>Un Emit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Un Emit</em>'.
     * @generated
     */
    UnEmit createUnEmit();

    /**
     * Returns a new object of class '<em>Set</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Set</em>'.
     * @generated
     */
    Set createSet();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    EsterelPackage getEsterelPackage();

} //EsterelFactory
