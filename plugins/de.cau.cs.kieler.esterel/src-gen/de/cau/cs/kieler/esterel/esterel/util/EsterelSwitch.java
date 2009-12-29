/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.esterel.esterel.util;

import de.cau.cs.kieler.esterel.esterel.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage
 * @generated
 */
public class EsterelSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EsterelPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EsterelSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = EsterelPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case EsterelPackage.PROGRAM:
      {
        Program program = (Program)theEObject;
        T result = caseProgram(program);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.MODULE:
      {
        Module module = (Module)theEObject;
        T result = caseModule(module);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.MODULE_BODY:
      {
        ModuleBody moduleBody = (ModuleBody)theEObject;
        T result = caseModuleBody(moduleBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.MODULE_INTERFACE:
      {
        ModuleInterface moduleInterface = (ModuleInterface)theEObject;
        T result = caseModuleInterface(moduleInterface);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.SIGNAL_DECL:
      {
        SignalDecl signalDecl = (SignalDecl)theEObject;
        T result = caseSignalDecl(signalDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.SENSOR_DECL:
      {
        SensorDecl sensorDecl = (SensorDecl)theEObject;
        T result = caseSensorDecl(sensorDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.RELATION_DECL:
      {
        RelationDecl relationDecl = (RelationDecl)theEObject;
        T result = caseRelationDecl(relationDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.RELATION_TYPE:
      {
        RelationType relationType = (RelationType)theEObject;
        T result = caseRelationType(relationType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.RELATION_IMPLICATION:
      {
        RelationImplication relationImplication = (RelationImplication)theEObject;
        T result = caseRelationImplication(relationImplication);
        if (result == null) result = caseRelationType(relationImplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.RELATION_INCOMPATIBILITY:
      {
        RelationIncompatibility relationIncompatibility = (RelationIncompatibility)theEObject;
        T result = caseRelationIncompatibility(relationIncompatibility);
        if (result == null) result = caseRelationType(relationIncompatibility);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.TYPE_DECL:
      {
        TypeDecl typeDecl = (TypeDecl)theEObject;
        T result = caseTypeDecl(typeDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.CONSTANT_DECL:
      {
        ConstantDecl constantDecl = (ConstantDecl)theEObject;
        T result = caseConstantDecl(constantDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.ONE_TYPE_CONSTANT_DECL:
      {
        OneTypeConstantDecl oneTypeConstantDecl = (OneTypeConstantDecl)theEObject;
        T result = caseOneTypeConstantDecl(oneTypeConstantDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.CONSTANT:
      {
        Constant constant = (Constant)theEObject;
        T result = caseConstant(constant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.FUNCTION_DECL:
      {
        FunctionDecl functionDecl = (FunctionDecl)theEObject;
        T result = caseFunctionDecl(functionDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.FUNCTION:
      {
        Function function = (Function)theEObject;
        T result = caseFunction(function);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.PROCEDURE_DECL:
      {
        ProcedureDecl procedureDecl = (ProcedureDecl)theEObject;
        T result = caseProcedureDecl(procedureDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.PROCEDURE:
      {
        Procedure procedure = (Procedure)theEObject;
        T result = caseProcedure(procedure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.BLOCK:
      {
        Block block = (Block)theEObject;
        T result = caseBlock(block);
        if (result == null) result = caseStatement(block);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.ASSIGNMENT:
      {
        Assignment assignment = (Assignment)theEObject;
        T result = caseAssignment(assignment);
        if (result == null) result = caseStatement(assignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.ABORT:
      {
        Abort abort = (Abort)theEObject;
        T result = caseAbort(abort);
        if (result == null) result = caseStatement(abort);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.ABORT_BODY:
      {
        AbortBody abortBody = (AbortBody)theEObject;
        T result = caseAbortBody(abortBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.ABORT_INSTANCE:
      {
        AbortInstance abortInstance = (AbortInstance)theEObject;
        T result = caseAbortInstance(abortInstance);
        if (result == null) result = caseAbortBody(abortInstance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.ABORT_CASE:
      {
        AbortCase abortCase = (AbortCase)theEObject;
        T result = caseAbortCase(abortCase);
        if (result == null) result = caseAbortBody(abortCase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.ABORT_CASE_SINGLE:
      {
        AbortCaseSingle abortCaseSingle = (AbortCaseSingle)theEObject;
        T result = caseAbortCaseSingle(abortCaseSingle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.AWAIT:
      {
        Await await = (Await)theEObject;
        T result = caseAwait(await);
        if (result == null) result = caseStatement(await);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.AWAIT_BODY:
      {
        AwaitBody awaitBody = (AwaitBody)theEObject;
        T result = caseAwaitBody(awaitBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.AWAIT_INSTANCE:
      {
        AwaitInstance awaitInstance = (AwaitInstance)theEObject;
        T result = caseAwaitInstance(awaitInstance);
        if (result == null) result = caseAwaitBody(awaitInstance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.AWAIT_CASE:
      {
        AwaitCase awaitCase = (AwaitCase)theEObject;
        T result = caseAwaitCase(awaitCase);
        if (result == null) result = caseAwaitBody(awaitCase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.DO:
      {
        Do do_ = (Do)theEObject;
        T result = caseDo(do_);
        if (result == null) result = caseStatement(do_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.DO_UPTO:
      {
        DoUpto doUpto = (DoUpto)theEObject;
        T result = caseDoUpto(doUpto);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.DO_WATCHING:
      {
        DoWatching doWatching = (DoWatching)theEObject;
        T result = caseDoWatching(doWatching);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.DO_WATCHING_END:
      {
        DoWatchingEnd doWatchingEnd = (DoWatchingEnd)theEObject;
        T result = caseDoWatchingEnd(doWatchingEnd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.EMIT:
      {
        Emit emit = (Emit)theEObject;
        T result = caseEmit(emit);
        if (result == null) result = caseStatement(emit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.EVERY_DO:
      {
        EveryDo everyDo = (EveryDo)theEObject;
        T result = caseEveryDo(everyDo);
        if (result == null) result = caseStatement(everyDo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.EXIT:
      {
        Exit exit = (Exit)theEObject;
        T result = caseExit(exit);
        if (result == null) result = caseStatement(exit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.HALT:
      {
        Halt halt = (Halt)theEObject;
        T result = caseHalt(halt);
        if (result == null) result = caseStatement(halt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.IF_TEST:
      {
        IfTest ifTest = (IfTest)theEObject;
        T result = caseIfTest(ifTest);
        if (result == null) result = caseStatement(ifTest);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.ELS_IF_PART:
      {
        ElsIfPart elsIfPart = (ElsIfPart)theEObject;
        T result = caseElsIfPart(elsIfPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.ELS_IF:
      {
        ElsIf elsIf = (ElsIf)theEObject;
        T result = caseElsIf(elsIf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.THEN_PART:
      {
        ThenPart thenPart = (ThenPart)theEObject;
        T result = caseThenPart(thenPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.ELSE_PART:
      {
        ElsePart elsePart = (ElsePart)theEObject;
        T result = caseElsePart(elsePart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.LOOP:
      {
        Loop loop = (Loop)theEObject;
        T result = caseLoop(loop);
        if (result == null) result = caseStatement(loop);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.LOOP_EACH:
      {
        LoopEach loopEach = (LoopEach)theEObject;
        T result = caseLoopEach(loopEach);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.LOOP_DELAY:
      {
        LoopDelay loopDelay = (LoopDelay)theEObject;
        T result = caseLoopDelay(loopDelay);
        if (result == null) result = caseLoopEach(loopDelay);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.LOOP_BODY:
      {
        LoopBody loopBody = (LoopBody)theEObject;
        T result = caseLoopBody(loopBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.NOTHING:
      {
        Nothing nothing = (Nothing)theEObject;
        T result = caseNothing(nothing);
        if (result == null) result = caseStatement(nothing);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.PAUSE:
      {
        Pause pause = (Pause)theEObject;
        T result = casePause(pause);
        if (result == null) result = caseStatement(pause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.PRESENT:
      {
        Present present = (Present)theEObject;
        T result = casePresent(present);
        if (result == null) result = caseStatement(present);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.PRESENT_BODY:
      {
        PresentBody presentBody = (PresentBody)theEObject;
        T result = casePresentBody(presentBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.PRESENT_EVENT_BODY:
      {
        PresentEventBody presentEventBody = (PresentEventBody)theEObject;
        T result = casePresentEventBody(presentEventBody);
        if (result == null) result = casePresentBody(presentEventBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.PRESENT_CASE_LIST:
      {
        PresentCaseList presentCaseList = (PresentCaseList)theEObject;
        T result = casePresentCaseList(presentCaseList);
        if (result == null) result = casePresentBody(presentCaseList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.PRESENT_CASE:
      {
        PresentCase presentCase = (PresentCase)theEObject;
        T result = casePresentCase(presentCase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.PRESENT_EVENT:
      {
        PresentEvent presentEvent = (PresentEvent)theEObject;
        T result = casePresentEvent(presentEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.REPEAT:
      {
        Repeat repeat = (Repeat)theEObject;
        T result = caseRepeat(repeat);
        if (result == null) result = caseStatement(repeat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.RUN:
      {
        Run run = (Run)theEObject;
        T result = caseRun(run);
        if (result == null) result = caseStatement(run);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.MODULE_RENAMING:
      {
        ModuleRenaming moduleRenaming = (ModuleRenaming)theEObject;
        T result = caseModuleRenaming(moduleRenaming);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.RENAMING_LIST:
      {
        RenamingList renamingList = (RenamingList)theEObject;
        T result = caseRenamingList(renamingList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.RENAMING:
      {
        Renaming renaming = (Renaming)theEObject;
        T result = caseRenaming(renaming);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.TYPE_RENAMING:
      {
        TypeRenaming typeRenaming = (TypeRenaming)theEObject;
        T result = caseTypeRenaming(typeRenaming);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.CONSTANT_RENAMING:
      {
        ConstantRenaming constantRenaming = (ConstantRenaming)theEObject;
        T result = caseConstantRenaming(constantRenaming);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.FUNCTION_RENAMING:
      {
        FunctionRenaming functionRenaming = (FunctionRenaming)theEObject;
        T result = caseFunctionRenaming(functionRenaming);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.PROCEDURE_RENAMING:
      {
        ProcedureRenaming procedureRenaming = (ProcedureRenaming)theEObject;
        T result = caseProcedureRenaming(procedureRenaming);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.SIGNAL_RENAMING:
      {
        SignalRenaming signalRenaming = (SignalRenaming)theEObject;
        T result = caseSignalRenaming(signalRenaming);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.LOCAL_SIGNAL_DECL:
      {
        LocalSignalDecl localSignalDecl = (LocalSignalDecl)theEObject;
        T result = caseLocalSignalDecl(localSignalDecl);
        if (result == null) result = caseStatement(localSignalDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.LOCAL_SIGNAL_LIST:
      {
        LocalSignalList localSignalList = (LocalSignalList)theEObject;
        T result = caseLocalSignalList(localSignalList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.SUSPEND:
      {
        Suspend suspend = (Suspend)theEObject;
        T result = caseSuspend(suspend);
        if (result == null) result = caseStatement(suspend);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.SUSTAIN:
      {
        Sustain sustain = (Sustain)theEObject;
        T result = caseSustain(sustain);
        if (result == null) result = caseStatement(sustain);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.TRAP:
      {
        Trap trap = (Trap)theEObject;
        T result = caseTrap(trap);
        if (result == null) result = caseStatement(trap);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.TRAP_DECL_LIST:
      {
        TrapDeclList trapDeclList = (TrapDeclList)theEObject;
        T result = caseTrapDeclList(trapDeclList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.TRAP_DECL:
      {
        TrapDecl trapDecl = (TrapDecl)theEObject;
        T result = caseTrapDecl(trapDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.TRAP_HANDLER_LIST:
      {
        TrapHandlerList trapHandlerList = (TrapHandlerList)theEObject;
        T result = caseTrapHandlerList(trapHandlerList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.TRAP_HANDLER:
      {
        TrapHandler trapHandler = (TrapHandler)theEObject;
        T result = caseTrapHandler(trapHandler);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.VARIABLE:
      {
        Variable variable = (Variable)theEObject;
        T result = caseVariable(variable);
        if (result == null) result = caseStatement(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.VARIABLE_DECL:
      {
        VariableDecl variableDecl = (VariableDecl)theEObject;
        T result = caseVariableDecl(variableDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.VARIABLE_LIST:
      {
        VariableList variableList = (VariableList)theEObject;
        T result = caseVariableList(variableList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.WEAK_ABORT:
      {
        WeakAbort weakAbort = (WeakAbort)theEObject;
        T result = caseWeakAbort(weakAbort);
        if (result == null) result = caseStatement(weakAbort);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.WEAK_ABORT_BODY:
      {
        WeakAbortBody weakAbortBody = (WeakAbortBody)theEObject;
        T result = caseWeakAbortBody(weakAbortBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.WEAK_ABORT_INSTANCE:
      {
        WeakAbortInstance weakAbortInstance = (WeakAbortInstance)theEObject;
        T result = caseWeakAbortInstance(weakAbortInstance);
        if (result == null) result = caseWeakAbortBody(weakAbortInstance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.WEAK_ABORT_CASE:
      {
        WeakAbortCase weakAbortCase = (WeakAbortCase)theEObject;
        T result = caseWeakAbortCase(weakAbortCase);
        if (result == null) result = caseWeakAbortBody(weakAbortCase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.DATA_EXPR:
      {
        DataExpr dataExpr = (DataExpr)theEObject;
        T result = caseDataExpr(dataExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.DATA_UNARY_EXPR:
      {
        DataUnaryExpr dataUnaryExpr = (DataUnaryExpr)theEObject;
        T result = caseDataUnaryExpr(dataUnaryExpr);
        if (result == null) result = caseDataExpr(dataUnaryExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.DATA_VALUE_ID:
      {
        DataValueID dataValueID = (DataValueID)theEObject;
        T result = caseDataValueID(dataValueID);
        if (result == null) result = caseDataUnaryExpr(dataValueID);
        if (result == null) result = caseDataExpr(dataValueID);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.DATA_VALUE_FLOAT:
      {
        DataValueFloat dataValueFloat = (DataValueFloat)theEObject;
        T result = caseDataValueFloat(dataValueFloat);
        if (result == null) result = caseDataUnaryExpr(dataValueFloat);
        if (result == null) result = caseDataExpr(dataValueFloat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.DATA_VALUE_BOOLEAN:
      {
        DataValueBoolean dataValueBoolean = (DataValueBoolean)theEObject;
        T result = caseDataValueBoolean(dataValueBoolean);
        if (result == null) result = caseDataUnaryExpr(dataValueBoolean);
        if (result == null) result = caseDataExpr(dataValueBoolean);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.DATA_VALUE_INT:
      {
        DataValueInt dataValueInt = (DataValueInt)theEObject;
        T result = caseDataValueInt(dataValueInt);
        if (result == null) result = caseDataUnaryExpr(dataValueInt);
        if (result == null) result = caseDataExpr(dataValueInt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.DATA_VALUE_STRING:
      {
        DataValueString dataValueString = (DataValueString)theEObject;
        T result = caseDataValueString(dataValueString);
        if (result == null) result = caseDataUnaryExpr(dataValueString);
        if (result == null) result = caseDataExpr(dataValueString);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.DATA_BLOCK:
      {
        DataBlock dataBlock = (DataBlock)theEObject;
        T result = caseDataBlock(dataBlock);
        if (result == null) result = caseDataUnaryExpr(dataBlock);
        if (result == null) result = caseDataExpr(dataBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.DATA_CURRENT:
      {
        DataCurrent dataCurrent = (DataCurrent)theEObject;
        T result = caseDataCurrent(dataCurrent);
        if (result == null) result = caseDataUnaryExpr(dataCurrent);
        if (result == null) result = caseDataExpr(dataCurrent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.DATA_PRE:
      {
        DataPre dataPre = (DataPre)theEObject;
        T result = caseDataPre(dataPre);
        if (result == null) result = caseDataUnaryExpr(dataPre);
        if (result == null) result = caseDataExpr(dataPre);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.DATA_TRAP:
      {
        DataTrap dataTrap = (DataTrap)theEObject;
        T result = caseDataTrap(dataTrap);
        if (result == null) result = caseDataUnaryExpr(dataTrap);
        if (result == null) result = caseDataExpr(dataTrap);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.DATA_FUNCTION:
      {
        DataFunction dataFunction = (DataFunction)theEObject;
        T result = caseDataFunction(dataFunction);
        if (result == null) result = caseDataUnaryExpr(dataFunction);
        if (result == null) result = caseDataExpr(dataFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.TRAP_EXPR:
      {
        TrapExpr trapExpr = (TrapExpr)theEObject;
        T result = caseTrapExpr(trapExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.SIG_EXPR:
      {
        SigExpr sigExpr = (SigExpr)theEObject;
        T result = caseSigExpr(sigExpr);
        if (result == null) result = caseTrapExpr(sigExpr);
        if (result == null) result = caseDelayEvent(sigExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.SIG_EXPR_AND:
      {
        SigExprAND sigExprAND = (SigExprAND)theEObject;
        T result = caseSigExprAND(sigExprAND);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.SIG_EXPR_UNARY:
      {
        SigExprUnary sigExprUnary = (SigExprUnary)theEObject;
        T result = caseSigExprUnary(sigExprUnary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.DELAY_EXPR:
      {
        DelayExpr delayExpr = (DelayExpr)theEObject;
        T result = caseDelayExpr(delayExpr);
        if (result == null) result = caseAwaitInstance(delayExpr);
        if (result == null) result = caseAwaitBody(delayExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.DELAY_EVENT:
      {
        DelayEvent delayEvent = (DelayEvent)theEObject;
        T result = caseDelayEvent(delayEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.CHANNEL_DESCRIPTION:
      {
        ChannelDescription channelDescription = (ChannelDescription)theEObject;
        T result = caseChannelDescription(channelDescription);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.SIGNAL:
      {
        Signal signal = (Signal)theEObject;
        T result = caseSignal(signal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.SENSOR:
      {
        Sensor sensor = (Sensor)theEObject;
        T result = caseSensor(sensor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.INPUT:
      {
        Input input = (Input)theEObject;
        T result = caseInput(input);
        if (result == null) result = caseSignalDecl(input);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.OUTPUT:
      {
        Output output = (Output)theEObject;
        T result = caseOutput(output);
        if (result == null) result = caseSignalDecl(output);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.INPUT_OUTPUT:
      {
        InputOutput inputOutput = (InputOutput)theEObject;
        T result = caseInputOutput(inputOutput);
        if (result == null) result = caseSignalDecl(inputOutput);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.RETURN:
      {
        Return return_ = (Return)theEObject;
        T result = caseReturn(return_);
        if (result == null) result = caseSignalDecl(return_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.RELATION:
      {
        Relation relation = (Relation)theEObject;
        T result = caseRelation(relation);
        if (result == null) result = caseRelationDecl(relation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.PARALLEL:
      {
        Parallel parallel = (Parallel)theEObject;
        T result = caseParallel(parallel);
        if (result == null) result = caseStatement(parallel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.SEQUENCE:
      {
        Sequence sequence = (Sequence)theEObject;
        T result = caseSequence(sequence);
        if (result == null) result = caseStatement(sequence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.LOCAL_SIGNAL:
      {
        LocalSignal localSignal = (LocalSignal)theEObject;
        T result = caseLocalSignal(localSignal);
        if (result == null) result = caseLocalSignalList(localSignal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Program</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProgram(Program object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModule(Module object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Module Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Module Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModuleBody(ModuleBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Module Interface</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Module Interface</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModuleInterface(ModuleInterface object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Signal Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Signal Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSignalDecl(SignalDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sensor Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sensor Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSensorDecl(SensorDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relation Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relation Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationDecl(RelationDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relation Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relation Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationType(RelationType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relation Implication</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relation Implication</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationImplication(RelationImplication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relation Incompatibility</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relation Incompatibility</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationIncompatibility(RelationIncompatibility object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeDecl(TypeDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstantDecl(ConstantDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>One Type Constant Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>One Type Constant Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOneTypeConstantDecl(OneTypeConstantDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstant(Constant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionDecl(FunctionDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunction(Function object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Procedure Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Procedure Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcedureDecl(ProcedureDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Procedure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Procedure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcedure(Procedure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement(Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlock(Block object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignment(Assignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abort</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abort</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbort(Abort object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abort Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abort Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbortBody(AbortBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abort Instance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abort Instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbortInstance(AbortInstance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abort Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abort Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbortCase(AbortCase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abort Case Single</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abort Case Single</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbortCaseSingle(AbortCaseSingle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Await</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Await</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAwait(Await object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Await Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Await Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAwaitBody(AwaitBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Await Instance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Await Instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAwaitInstance(AwaitInstance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Await Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Await Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAwaitCase(AwaitCase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Do</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Do</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDo(Do object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Do Upto</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Do Upto</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoUpto(DoUpto object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Do Watching</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Do Watching</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoWatching(DoWatching object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Do Watching End</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Do Watching End</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoWatchingEnd(DoWatchingEnd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Emit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Emit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmit(Emit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Every Do</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Every Do</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEveryDo(EveryDo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExit(Exit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Halt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Halt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHalt(Halt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Test</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Test</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfTest(IfTest object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Els If Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Els If Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElsIfPart(ElsIfPart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Els If</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Els If</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElsIf(ElsIf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Then Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Then Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseThenPart(ThenPart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Else Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Else Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElsePart(ElsePart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Loop</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Loop</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoop(Loop object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Loop Each</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Loop Each</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoopEach(LoopEach object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Loop Delay</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Loop Delay</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoopDelay(LoopDelay object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Loop Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Loop Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoopBody(LoopBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nothing</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nothing</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNothing(Nothing object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePause(Pause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Present</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Present</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePresent(Present object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Present Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Present Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePresentBody(PresentBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Present Event Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Present Event Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePresentEventBody(PresentEventBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Present Case List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Present Case List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePresentCaseList(PresentCaseList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Present Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Present Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePresentCase(PresentCase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Present Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Present Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePresentEvent(PresentEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Repeat</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Repeat</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRepeat(Repeat object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Run</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Run</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRun(Run object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Module Renaming</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Module Renaming</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModuleRenaming(ModuleRenaming object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Renaming List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Renaming List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRenamingList(RenamingList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Renaming</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Renaming</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRenaming(Renaming object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Renaming</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Renaming</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeRenaming(TypeRenaming object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant Renaming</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant Renaming</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstantRenaming(ConstantRenaming object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Renaming</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Renaming</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionRenaming(FunctionRenaming object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Procedure Renaming</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Procedure Renaming</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcedureRenaming(ProcedureRenaming object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Signal Renaming</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Signal Renaming</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSignalRenaming(SignalRenaming object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Local Signal Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local Signal Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocalSignalDecl(LocalSignalDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Local Signal List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local Signal List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocalSignalList(LocalSignalList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Suspend</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Suspend</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSuspend(Suspend object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sustain</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sustain</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSustain(Sustain object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trap</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trap</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrap(Trap object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trap Decl List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trap Decl List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrapDeclList(TrapDeclList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trap Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trap Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrapDecl(TrapDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trap Handler List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trap Handler List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrapHandlerList(TrapHandlerList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trap Handler</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trap Handler</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrapHandler(TrapHandler object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable(Variable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableDecl(VariableDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableList(VariableList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Weak Abort</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Weak Abort</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWeakAbort(WeakAbort object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Weak Abort Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Weak Abort Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWeakAbortBody(WeakAbortBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Weak Abort Instance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Weak Abort Instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWeakAbortInstance(WeakAbortInstance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Weak Abort Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Weak Abort Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWeakAbortCase(WeakAbortCase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataExpr(DataExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Unary Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Unary Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataUnaryExpr(DataUnaryExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Value ID</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Value ID</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataValueID(DataValueID object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Value Float</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Value Float</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataValueFloat(DataValueFloat object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Value Boolean</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Value Boolean</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataValueBoolean(DataValueBoolean object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Value Int</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Value Int</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataValueInt(DataValueInt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Value String</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Value String</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataValueString(DataValueString object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataBlock(DataBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Current</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Current</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataCurrent(DataCurrent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Pre</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Pre</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataPre(DataPre object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Trap</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Trap</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTrap(DataTrap object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataFunction(DataFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trap Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trap Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrapExpr(TrapExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sig Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sig Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSigExpr(SigExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sig Expr AND</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sig Expr AND</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSigExprAND(SigExprAND object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sig Expr Unary</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sig Expr Unary</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSigExprUnary(SigExprUnary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delay Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delay Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDelayExpr(DelayExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delay Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delay Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDelayEvent(DelayEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Channel Description</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Channel Description</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChannelDescription(ChannelDescription object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Signal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Signal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSignal(Signal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSensor(Sensor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInput(Input object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Output</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Output</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutput(Output object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input Output</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input Output</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInputOutput(InputOutput object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Return</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Return</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReturn(Return object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelation(Relation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parallel</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parallel</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParallel(Parallel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sequence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sequence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSequence(Sequence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Local Signal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local Signal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocalSignal(LocalSignal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object)
  {
    return null;
  }

} //EsterelSwitch
