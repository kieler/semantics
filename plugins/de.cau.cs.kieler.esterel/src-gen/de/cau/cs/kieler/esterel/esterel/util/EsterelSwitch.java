/**
 */
package de.cau.cs.kieler.esterel.esterel.util;

import de.cau.cs.kieler.annotations.Annotatable;

import de.cau.cs.kieler.esterel.esterel.*;

import de.cau.cs.kieler.kexpressions.Expression;
import de.cau.cs.kieler.kexpressions.ValuedObject;
import de.cau.cs.kieler.kexpressions.ValuedObjectReference;

import de.cau.cs.kieler.scl.scl.Statement;
import de.cau.cs.kieler.scl.scl.StatementContainer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
public class EsterelSwitch<T> extends Switch<T>
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
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
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
        if (result == null) result = caseStatementContainer(module);
        if (result == null) result = caseAnnotatable(module);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.TYPE_IDENTIFIER:
      {
        TypeIdentifier typeIdentifier = (TypeIdentifier)theEObject;
        T result = caseTypeIdentifier(typeIdentifier);
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
      case EsterelPackage.CONSTANT_DECLS:
      {
        ConstantDecls constantDecls = (ConstantDecls)theEObject;
        T result = caseConstantDecls(constantDecls);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.ONE_TYPE_CONSTANT_DECLS:
      {
        OneTypeConstantDecls oneTypeConstantDecls = (OneTypeConstantDecls)theEObject;
        T result = caseOneTypeConstantDecls(oneTypeConstantDecls);
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
      case EsterelPackage.TASK_DECL:
      {
        TaskDecl taskDecl = (TaskDecl)theEObject;
        T result = caseTaskDecl(taskDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.TASK:
      {
        Task task = (Task)theEObject;
        T result = caseTask(task);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.INTERFACE_SIGNAL_DECL:
      {
        InterfaceSignalDecl interfaceSignalDecl = (InterfaceSignalDecl)theEObject;
        T result = caseInterfaceSignalDecl(interfaceSignalDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.ISIGNAL:
      {
        ISignal iSignal = (ISignal)theEObject;
        T result = caseISignal(iSignal);
        if (result == null) result = caseValuedObject(iSignal);
        if (result == null) result = caseAnnotatable(iSignal);
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
      case EsterelPackage.SENSOR_WITH_TYPE:
      {
        SensorWithType sensorWithType = (SensorWithType)theEObject;
        T result = caseSensorWithType(sensorWithType);
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
      case EsterelPackage.ESTEREL_PARALLEL:
      {
        EsterelParallel esterelParallel = (EsterelParallel)theEObject;
        T result = caseEsterelParallel(esterelParallel);
        if (result == null) result = caseStatement(esterelParallel);
        if (result == null) result = caseAnnotatable(esterelParallel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.ESTEREL_THREAD:
      {
        EsterelThread esterelThread = (EsterelThread)theEObject;
        T result = caseEsterelThread(esterelThread);
        if (result == null) result = caseStatementContainer(esterelThread);
        if (result == null) result = caseAnnotatable(esterelThread);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.NOTHING:
      {
        Nothing nothing = (Nothing)theEObject;
        T result = caseNothing(nothing);
        if (result == null) result = caseStatement(nothing);
        if (result == null) result = caseAnnotatable(nothing);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.HALT:
      {
        Halt halt = (Halt)theEObject;
        T result = caseHalt(halt);
        if (result == null) result = caseStatement(halt);
        if (result == null) result = caseAnnotatable(halt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.BLOCK:
      {
        Block block = (Block)theEObject;
        T result = caseBlock(block);
        if (result == null) result = caseStatementContainer(block);
        if (result == null) result = caseStatement(block);
        if (result == null) result = caseAnnotatable(block);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.EMIT:
      {
        Emit emit = (Emit)theEObject;
        T result = caseEmit(emit);
        if (result == null) result = caseStatement(emit);
        if (result == null) result = caseAnnotatable(emit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.SUSTAIN:
      {
        Sustain sustain = (Sustain)theEObject;
        T result = caseSustain(sustain);
        if (result == null) result = caseStatement(sustain);
        if (result == null) result = caseAnnotatable(sustain);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.ESTEREL_ASSIGNMENT:
      {
        EsterelAssignment esterelAssignment = (EsterelAssignment)theEObject;
        T result = caseEsterelAssignment(esterelAssignment);
        if (result == null) result = caseStatement(esterelAssignment);
        if (result == null) result = caseAnnotatable(esterelAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.PROC_CALL:
      {
        ProcCall procCall = (ProcCall)theEObject;
        T result = caseProcCall(procCall);
        if (result == null) result = caseStatement(procCall);
        if (result == null) result = caseAnnotatable(procCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.PRESENT:
      {
        Present present = (Present)theEObject;
        T result = casePresent(present);
        if (result == null) result = caseStatement(present);
        if (result == null) result = caseAnnotatable(present);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.PRESENT_CASE:
      {
        PresentCase presentCase = (PresentCase)theEObject;
        T result = casePresentCase(presentCase);
        if (result == null) result = caseStatementContainer(presentCase);
        if (result == null) result = caseAnnotatable(presentCase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.IF_TEST:
      {
        IfTest ifTest = (IfTest)theEObject;
        T result = caseIfTest(ifTest);
        if (result == null) result = caseStatement(ifTest);
        if (result == null) result = caseAnnotatable(ifTest);
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
      case EsterelPackage.LOOP:
      {
        Loop loop = (Loop)theEObject;
        T result = caseLoop(loop);
        if (result == null) result = caseStatementContainer(loop);
        if (result == null) result = caseStatement(loop);
        if (result == null) result = caseAnnotatable(loop);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.REPEAT:
      {
        Repeat repeat = (Repeat)theEObject;
        T result = caseRepeat(repeat);
        if (result == null) result = caseStatementContainer(repeat);
        if (result == null) result = caseStatement(repeat);
        if (result == null) result = caseAnnotatable(repeat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.ABORT:
      {
        Abort abort = (Abort)theEObject;
        T result = caseAbort(abort);
        if (result == null) result = caseStatementContainer(abort);
        if (result == null) result = caseStatement(abort);
        if (result == null) result = caseAnnotatable(abort);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.CASE:
      {
        Case case_ = (Case)theEObject;
        T result = caseCase(case_);
        if (result == null) result = caseStatementContainer(case_);
        if (result == null) result = caseAnnotatable(case_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.AWAIT:
      {
        Await await = (Await)theEObject;
        T result = caseAwait(await);
        if (result == null) result = caseStatementContainer(await);
        if (result == null) result = caseStatement(await);
        if (result == null) result = caseAnnotatable(await);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.EVERY_DO:
      {
        EveryDo everyDo = (EveryDo)theEObject;
        T result = caseEveryDo(everyDo);
        if (result == null) result = caseStatementContainer(everyDo);
        if (result == null) result = caseStatement(everyDo);
        if (result == null) result = caseAnnotatable(everyDo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.SUSPEND:
      {
        Suspend suspend = (Suspend)theEObject;
        T result = caseSuspend(suspend);
        if (result == null) result = caseStatementContainer(suspend);
        if (result == null) result = caseStatement(suspend);
        if (result == null) result = caseAnnotatable(suspend);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.TRAP:
      {
        Trap trap = (Trap)theEObject;
        T result = caseTrap(trap);
        if (result == null) result = caseStatementContainer(trap);
        if (result == null) result = caseStatement(trap);
        if (result == null) result = caseAnnotatable(trap);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.TRAP_HANDLER:
      {
        TrapHandler trapHandler = (TrapHandler)theEObject;
        T result = caseTrapHandler(trapHandler);
        if (result == null) result = caseStatementContainer(trapHandler);
        if (result == null) result = caseAnnotatable(trapHandler);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.EXIT:
      {
        Exit exit = (Exit)theEObject;
        T result = caseExit(exit);
        if (result == null) result = caseStatement(exit);
        if (result == null) result = caseAnnotatable(exit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.EXEC:
      {
        Exec exec = (Exec)theEObject;
        T result = caseExec(exec);
        if (result == null) result = caseStatementContainer(exec);
        if (result == null) result = caseStatement(exec);
        if (result == null) result = caseAnnotatable(exec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.EXEC_CASE:
      {
        ExecCase execCase = (ExecCase)theEObject;
        T result = caseExecCase(execCase);
        if (result == null) result = caseStatementContainer(execCase);
        if (result == null) result = caseAnnotatable(execCase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.LOCAL_SIGNAL_DECL:
      {
        LocalSignalDecl localSignalDecl = (LocalSignalDecl)theEObject;
        T result = caseLocalSignalDecl(localSignalDecl);
        if (result == null) result = caseStatementContainer(localSignalDecl);
        if (result == null) result = caseStatement(localSignalDecl);
        if (result == null) result = caseAnnotatable(localSignalDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.LOCAL_VARIABLE:
      {
        LocalVariable localVariable = (LocalVariable)theEObject;
        T result = caseLocalVariable(localVariable);
        if (result == null) result = caseStatementContainer(localVariable);
        if (result == null) result = caseStatement(localVariable);
        if (result == null) result = caseAnnotatable(localVariable);
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
      case EsterelPackage.IVARIABLE:
      {
        IVariable iVariable = (IVariable)theEObject;
        T result = caseIVariable(iVariable);
        if (result == null) result = caseValuedObject(iVariable);
        if (result == null) result = caseAnnotatable(iVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.RUN:
      {
        Run run = (Run)theEObject;
        T result = caseRun(run);
        if (result == null) result = caseStatement(run);
        if (result == null) result = caseAnnotatable(run);
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
      case EsterelPackage.TASK_RENAMING:
      {
        TaskRenaming taskRenaming = (TaskRenaming)theEObject;
        T result = caseTaskRenaming(taskRenaming);
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
      case EsterelPackage.DO:
      {
        Do do_ = (Do)theEObject;
        T result = caseDo(do_);
        if (result == null) result = caseStatementContainer(do_);
        if (result == null) result = caseStatement(do_);
        if (result == null) result = caseAnnotatable(do_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.DELAY_EXPR:
      {
        DelayExpr delayExpr = (DelayExpr)theEObject;
        T result = caseDelayExpr(delayExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.ESTEREL_TYPE:
      {
        EsterelType esterelType = (EsterelType)theEObject;
        T result = caseEsterelType(esterelType);
        if (result == null) result = caseTypeIdentifier(esterelType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.CONSTANT:
      {
        Constant constant = (Constant)theEObject;
        T result = caseConstant(constant);
        if (result == null) result = caseValuedObject(constant);
        if (result == null) result = caseAnnotatable(constant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.INPUT:
      {
        Input input = (Input)theEObject;
        T result = caseInput(input);
        if (result == null) result = caseInterfaceSignalDecl(input);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.OUTPUT:
      {
        Output output = (Output)theEObject;
        T result = caseOutput(output);
        if (result == null) result = caseInterfaceSignalDecl(output);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.INPUT_OUTPUT:
      {
        InputOutput inputOutput = (InputOutput)theEObject;
        T result = caseInputOutput(inputOutput);
        if (result == null) result = caseInterfaceSignalDecl(inputOutput);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.RETURN:
      {
        Return return_ = (Return)theEObject;
        T result = caseReturn(return_);
        if (result == null) result = caseInterfaceSignalDecl(return_);
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
      case EsterelPackage.TRAP_SIGNAL:
      {
        TrapSignal trapSignal = (TrapSignal)theEObject;
        T result = caseTrapSignal(trapSignal);
        if (result == null) result = caseISignal(trapSignal);
        if (result == null) result = caseValuedObject(trapSignal);
        if (result == null) result = caseAnnotatable(trapSignal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.TRAP_EXPRESSION:
      {
        TrapExpression trapExpression = (TrapExpression)theEObject;
        T result = caseTrapExpression(trapExpression);
        if (result == null) result = caseExpression(trapExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.FUNCTION_EXPRESSION:
      {
        FunctionExpression functionExpression = (FunctionExpression)theEObject;
        T result = caseFunctionExpression(functionExpression);
        if (result == null) result = caseExpression(functionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.CONSTANT_EXPRESSION:
      {
        ConstantExpression constantExpression = (ConstantExpression)theEObject;
        T result = caseConstantExpression(constantExpression);
        if (result == null) result = caseExpression(constantExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.TRAP_REFERENCE_EXPR:
      {
        TrapReferenceExpr trapReferenceExpr = (TrapReferenceExpr)theEObject;
        T result = caseTrapReferenceExpr(trapReferenceExpr);
        if (result == null) result = caseValuedObjectReference(trapReferenceExpr);
        if (result == null) result = caseExpression(trapReferenceExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EsterelPackage.SIGNAL_REFERENCE_EXPR:
      {
        SignalReferenceExpr signalReferenceExpr = (SignalReferenceExpr)theEObject;
        T result = caseSignalReferenceExpr(signalReferenceExpr);
        if (result == null) result = caseValuedObjectReference(signalReferenceExpr);
        if (result == null) result = caseExpression(signalReferenceExpr);
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
   * Returns the result of interpreting the object as an instance of '<em>Type Identifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Identifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeIdentifier(TypeIdentifier object)
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
   * Returns the result of interpreting the object as an instance of '<em>Constant Decls</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant Decls</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstantDecls(ConstantDecls object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>One Type Constant Decls</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>One Type Constant Decls</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOneTypeConstantDecls(OneTypeConstantDecls object)
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
   * Returns the result of interpreting the object as an instance of '<em>Task Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Task Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTaskDecl(TaskDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Task</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTask(Task object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface Signal Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Signal Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfaceSignalDecl(InterfaceSignalDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ISignal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ISignal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseISignal(ISignal object)
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
   * Returns the result of interpreting the object as an instance of '<em>Sensor With Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sensor With Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSensorWithType(SensorWithType object)
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
  public T caseEsterelParallel(EsterelParallel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Thread</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Thread</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEsterelThread(EsterelThread object)
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
  public T caseEsterelAssignment(EsterelAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Proc Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Proc Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcCall(ProcCall object)
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
   * Returns the result of interpreting the object as an instance of '<em>Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCase(Case object)
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
   * Returns the result of interpreting the object as an instance of '<em>Exec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExec(Exec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exec Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exec Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExecCase(ExecCase object)
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
   * Returns the result of interpreting the object as an instance of '<em>Local Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocalVariable(LocalVariable object)
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
   * Returns the result of interpreting the object as an instance of '<em>IVariable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IVariable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIVariable(IVariable object)
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
   * Returns the result of interpreting the object as an instance of '<em>Task Renaming</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Task Renaming</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTaskRenaming(TaskRenaming object)
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
  public T caseEsterelType(EsterelType object)
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
   * Returns the result of interpreting the object as an instance of '<em>Trap Signal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trap Signal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrapSignal(TrapSignal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trap Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trap Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrapExpression(TrapExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionExpression(FunctionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstantExpression(ConstantExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trap Reference Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trap Reference Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrapReferenceExpr(TrapReferenceExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Signal Reference Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Signal Reference Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSignalReferenceExpr(SignalReferenceExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotatable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotatable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotatable(Annotatable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement Container</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement Container</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatementContainer(StatementContainer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Valued Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Valued Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValuedObject(ValuedObject object)
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
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Valued Object Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Valued Object Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValuedObjectReference(ValuedObjectReference object)
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
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //EsterelSwitch
