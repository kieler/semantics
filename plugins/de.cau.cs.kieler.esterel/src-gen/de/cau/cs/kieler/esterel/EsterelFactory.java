/**
 * <copyright>
 * </copyright>
 *
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
public interface EsterelFactory extends EFactory
{
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
  Program createProgram();

  /**
   * Returns a new object of class '<em>Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module</em>'.
   * @generated
   */
  Module createModule();

  /**
   * Returns a new object of class '<em>Module Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module Body</em>'.
   * @generated
   */
  ModuleBody createModuleBody();

  /**
   * Returns a new object of class '<em>Module Interface</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module Interface</em>'.
   * @generated
   */
  ModuleInterface createModuleInterface();

  /**
   * Returns a new object of class '<em>Signal Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Signal Decl</em>'.
   * @generated
   */
  SignalDecl createSignalDecl();

  /**
   * Returns a new object of class '<em>Sensor Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sensor Decl</em>'.
   * @generated
   */
  SensorDecl createSensorDecl();

  /**
   * Returns a new object of class '<em>Relation Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relation Decl</em>'.
   * @generated
   */
  RelationDecl createRelationDecl();

  /**
   * Returns a new object of class '<em>Relation Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relation Type</em>'.
   * @generated
   */
  RelationType createRelationType();

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
   * Returns a new object of class '<em>Type Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Decl</em>'.
   * @generated
   */
  TypeDecl createTypeDecl();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Constant Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant Decl</em>'.
   * @generated
   */
  ConstantDecl createConstantDecl();

  /**
   * Returns a new object of class '<em>One Type Constant Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>One Type Constant Decl</em>'.
   * @generated
   */
  OneTypeConstantDecl createOneTypeConstantDecl();

  /**
   * Returns a new object of class '<em>Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant</em>'.
   * @generated
   */
  Constant createConstant();

  /**
   * Returns a new object of class '<em>Function Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Decl</em>'.
   * @generated
   */
  FunctionDecl createFunctionDecl();

  /**
   * Returns a new object of class '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function</em>'.
   * @generated
   */
  Function createFunction();

  /**
   * Returns a new object of class '<em>Procedure Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Procedure Decl</em>'.
   * @generated
   */
  ProcedureDecl createProcedureDecl();

  /**
   * Returns a new object of class '<em>Procedure</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Procedure</em>'.
   * @generated
   */
  Procedure createProcedure();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block</em>'.
   * @generated
   */
  Block createBlock();

  /**
   * Returns a new object of class '<em>Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assignment</em>'.
   * @generated
   */
  Assignment createAssignment();

  /**
   * Returns a new object of class '<em>Abort</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abort</em>'.
   * @generated
   */
  Abort createAbort();

  /**
   * Returns a new object of class '<em>Abort Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abort Body</em>'.
   * @generated
   */
  AbortBody createAbortBody();

  /**
   * Returns a new object of class '<em>Abort Instance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abort Instance</em>'.
   * @generated
   */
  AbortInstance createAbortInstance();

  /**
   * Returns a new object of class '<em>Abort Case</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abort Case</em>'.
   * @generated
   */
  AbortCase createAbortCase();

  /**
   * Returns a new object of class '<em>Abort Case Single</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abort Case Single</em>'.
   * @generated
   */
  AbortCaseSingle createAbortCaseSingle();

  /**
   * Returns a new object of class '<em>Await</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Await</em>'.
   * @generated
   */
  Await createAwait();

  /**
   * Returns a new object of class '<em>Await Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Await Body</em>'.
   * @generated
   */
  AwaitBody createAwaitBody();

  /**
   * Returns a new object of class '<em>Await Instance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Await Instance</em>'.
   * @generated
   */
  AwaitInstance createAwaitInstance();

  /**
   * Returns a new object of class '<em>Await Case</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Await Case</em>'.
   * @generated
   */
  AwaitCase createAwaitCase();

  /**
   * Returns a new object of class '<em>Do</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Do</em>'.
   * @generated
   */
  Do createDo();

  /**
   * Returns a new object of class '<em>Do Upto</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Do Upto</em>'.
   * @generated
   */
  DoUpto createDoUpto();

  /**
   * Returns a new object of class '<em>Do Watching</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Do Watching</em>'.
   * @generated
   */
  DoWatching createDoWatching();

  /**
   * Returns a new object of class '<em>Do Watching End</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Do Watching End</em>'.
   * @generated
   */
  DoWatchingEnd createDoWatchingEnd();

  /**
   * Returns a new object of class '<em>Emit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Emit</em>'.
   * @generated
   */
  Emit createEmit();

  /**
   * Returns a new object of class '<em>Every Do</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Every Do</em>'.
   * @generated
   */
  EveryDo createEveryDo();

  /**
   * Returns a new object of class '<em>Exit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exit</em>'.
   * @generated
   */
  Exit createExit();

  /**
   * Returns a new object of class '<em>Halt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Halt</em>'.
   * @generated
   */
  Halt createHalt();

  /**
   * Returns a new object of class '<em>If Test</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Test</em>'.
   * @generated
   */
  IfTest createIfTest();

  /**
   * Returns a new object of class '<em>Els If Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Els If Part</em>'.
   * @generated
   */
  ElsIfPart createElsIfPart();

  /**
   * Returns a new object of class '<em>Els If</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Els If</em>'.
   * @generated
   */
  ElsIf createElsIf();

  /**
   * Returns a new object of class '<em>Then Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Then Part</em>'.
   * @generated
   */
  ThenPart createThenPart();

  /**
   * Returns a new object of class '<em>Else Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Else Part</em>'.
   * @generated
   */
  ElsePart createElsePart();

  /**
   * Returns a new object of class '<em>Loop</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Loop</em>'.
   * @generated
   */
  Loop createLoop();

  /**
   * Returns a new object of class '<em>Loop Each</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Loop Each</em>'.
   * @generated
   */
  LoopEach createLoopEach();

  /**
   * Returns a new object of class '<em>Loop Delay</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Loop Delay</em>'.
   * @generated
   */
  LoopDelay createLoopDelay();

  /**
   * Returns a new object of class '<em>Loop Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Loop Body</em>'.
   * @generated
   */
  LoopBody createLoopBody();

  /**
   * Returns a new object of class '<em>Nothing</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Nothing</em>'.
   * @generated
   */
  Nothing createNothing();

  /**
   * Returns a new object of class '<em>Pause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pause</em>'.
   * @generated
   */
  Pause createPause();

  /**
   * Returns a new object of class '<em>Present</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Present</em>'.
   * @generated
   */
  Present createPresent();

  /**
   * Returns a new object of class '<em>Present Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Present Body</em>'.
   * @generated
   */
  PresentBody createPresentBody();

  /**
   * Returns a new object of class '<em>Present Event Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Present Event Body</em>'.
   * @generated
   */
  PresentEventBody createPresentEventBody();

  /**
   * Returns a new object of class '<em>Present Case List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Present Case List</em>'.
   * @generated
   */
  PresentCaseList createPresentCaseList();

  /**
   * Returns a new object of class '<em>Present Case</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Present Case</em>'.
   * @generated
   */
  PresentCase createPresentCase();

  /**
   * Returns a new object of class '<em>Present Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Present Event</em>'.
   * @generated
   */
  PresentEvent createPresentEvent();

  /**
   * Returns a new object of class '<em>Repeat</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Repeat</em>'.
   * @generated
   */
  Repeat createRepeat();

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
   * Returns a new object of class '<em>Renaming List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Renaming List</em>'.
   * @generated
   */
  RenamingList createRenamingList();

  /**
   * Returns a new object of class '<em>Renaming</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Renaming</em>'.
   * @generated
   */
  Renaming createRenaming();

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
   * Returns a new object of class '<em>Signal Renaming</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Signal Renaming</em>'.
   * @generated
   */
  SignalRenaming createSignalRenaming();

  /**
   * Returns a new object of class '<em>Local Signal Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Signal Decl</em>'.
   * @generated
   */
  LocalSignalDecl createLocalSignalDecl();

  /**
   * Returns a new object of class '<em>Local Signal List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Signal List</em>'.
   * @generated
   */
  LocalSignalList createLocalSignalList();

  /**
   * Returns a new object of class '<em>Suspend</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Suspend</em>'.
   * @generated
   */
  Suspend createSuspend();

  /**
   * Returns a new object of class '<em>Sustain</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sustain</em>'.
   * @generated
   */
  Sustain createSustain();

  /**
   * Returns a new object of class '<em>Trap</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trap</em>'.
   * @generated
   */
  Trap createTrap();

  /**
   * Returns a new object of class '<em>Trap Decl List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trap Decl List</em>'.
   * @generated
   */
  TrapDeclList createTrapDeclList();

  /**
   * Returns a new object of class '<em>Trap Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trap Decl</em>'.
   * @generated
   */
  TrapDecl createTrapDecl();

  /**
   * Returns a new object of class '<em>Trap Handler List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trap Handler List</em>'.
   * @generated
   */
  TrapHandlerList createTrapHandlerList();

  /**
   * Returns a new object of class '<em>Trap Handler</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trap Handler</em>'.
   * @generated
   */
  TrapHandler createTrapHandler();

  /**
   * Returns a new object of class '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable</em>'.
   * @generated
   */
  Variable createVariable();

  /**
   * Returns a new object of class '<em>Variable Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Decl</em>'.
   * @generated
   */
  VariableDecl createVariableDecl();

  /**
   * Returns a new object of class '<em>Variable List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable List</em>'.
   * @generated
   */
  VariableList createVariableList();

  /**
   * Returns a new object of class '<em>Weak Abort</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Weak Abort</em>'.
   * @generated
   */
  WeakAbort createWeakAbort();

  /**
   * Returns a new object of class '<em>Weak Abort Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Weak Abort Body</em>'.
   * @generated
   */
  WeakAbortBody createWeakAbortBody();

  /**
   * Returns a new object of class '<em>Weak Abort Instance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Weak Abort Instance</em>'.
   * @generated
   */
  WeakAbortInstance createWeakAbortInstance();

  /**
   * Returns a new object of class '<em>Weak Abort Case</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Weak Abort Case</em>'.
   * @generated
   */
  WeakAbortCase createWeakAbortCase();

  /**
   * Returns a new object of class '<em>Data Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Expr</em>'.
   * @generated
   */
  DataExpr createDataExpr();

  /**
   * Returns a new object of class '<em>Data Unary Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Unary Expr</em>'.
   * @generated
   */
  DataUnaryExpr createDataUnaryExpr();

  /**
   * Returns a new object of class '<em>Data Value ID</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Value ID</em>'.
   * @generated
   */
  DataValueID createDataValueID();

  /**
   * Returns a new object of class '<em>Data Value Float</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Value Float</em>'.
   * @generated
   */
  DataValueFloat createDataValueFloat();

  /**
   * Returns a new object of class '<em>Data Value Boolean</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Value Boolean</em>'.
   * @generated
   */
  DataValueBoolean createDataValueBoolean();

  /**
   * Returns a new object of class '<em>Data Value Int</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Value Int</em>'.
   * @generated
   */
  DataValueInt createDataValueInt();

  /**
   * Returns a new object of class '<em>Data Value String</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Value String</em>'.
   * @generated
   */
  DataValueString createDataValueString();

  /**
   * Returns a new object of class '<em>Data Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Block</em>'.
   * @generated
   */
  DataBlock createDataBlock();

  /**
   * Returns a new object of class '<em>Data Current</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Current</em>'.
   * @generated
   */
  DataCurrent createDataCurrent();

  /**
   * Returns a new object of class '<em>Data Pre</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Pre</em>'.
   * @generated
   */
  DataPre createDataPre();

  /**
   * Returns a new object of class '<em>Data Trap</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Trap</em>'.
   * @generated
   */
  DataTrap createDataTrap();

  /**
   * Returns a new object of class '<em>Data Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Function</em>'.
   * @generated
   */
  DataFunction createDataFunction();

  /**
   * Returns a new object of class '<em>Trap Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trap Expr</em>'.
   * @generated
   */
  TrapExpr createTrapExpr();

  /**
   * Returns a new object of class '<em>Sig Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sig Expr</em>'.
   * @generated
   */
  SigExpr createSigExpr();

  /**
   * Returns a new object of class '<em>Sig Expr AND</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sig Expr AND</em>'.
   * @generated
   */
  SigExprAND createSigExprAND();

  /**
   * Returns a new object of class '<em>Sig Expr Unary</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sig Expr Unary</em>'.
   * @generated
   */
  SigExprUnary createSigExprUnary();

  /**
   * Returns a new object of class '<em>Delay Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delay Expr</em>'.
   * @generated
   */
  DelayExpr createDelayExpr();

  /**
   * Returns a new object of class '<em>Delay Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delay Event</em>'.
   * @generated
   */
  DelayEvent createDelayEvent();

  /**
   * Returns a new object of class '<em>Channel Description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Channel Description</em>'.
   * @generated
   */
  ChannelDescription createChannelDescription();

  /**
   * Returns a new object of class '<em>Signal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Signal</em>'.
   * @generated
   */
  Signal createSignal();

  /**
   * Returns a new object of class '<em>Sensor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sensor</em>'.
   * @generated
   */
  Sensor createSensor();

  /**
   * Returns a new object of class '<em>Input</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input</em>'.
   * @generated
   */
  Input createInput();

  /**
   * Returns a new object of class '<em>Output</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output</em>'.
   * @generated
   */
  Output createOutput();

  /**
   * Returns a new object of class '<em>Input Output</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input Output</em>'.
   * @generated
   */
  InputOutput createInputOutput();

  /**
   * Returns a new object of class '<em>Return</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Return</em>'.
   * @generated
   */
  Return createReturn();

  /**
   * Returns a new object of class '<em>Relation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relation</em>'.
   * @generated
   */
  Relation createRelation();

  /**
   * Returns a new object of class '<em>Parallel</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parallel</em>'.
   * @generated
   */
  Parallel createParallel();

  /**
   * Returns a new object of class '<em>Sequence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sequence</em>'.
   * @generated
   */
  Sequence createSequence();

  /**
   * Returns a new object of class '<em>Local Signal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Signal</em>'.
   * @generated
   */
  LocalSignal createLocalSignal();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EsterelPackage getEsterelPackage();

} //EsterelFactory
