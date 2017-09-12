/**
 */
package de.cau.cs.kieler.esterel.util;

import de.cau.cs.kieler.annotations.Annotatable;
import de.cau.cs.kieler.annotations.NamedObject;

import de.cau.cs.kieler.annotations.Pragmatable;
import de.cau.cs.kieler.esterel.*;

import de.cau.cs.kieler.kexpressions.Declaration;
import de.cau.cs.kieler.kexpressions.Expression;
import de.cau.cs.kieler.kexpressions.Referenceable;
import de.cau.cs.kieler.kexpressions.Schedulable;
import de.cau.cs.kieler.kexpressions.ValuedObject;
import de.cau.cs.kieler.kexpressions.ValuedObjectReference;

import de.cau.cs.kieler.kexpressions.kext.DeclarationScope;

import de.cau.cs.kieler.scl.Module;
import de.cau.cs.kieler.scl.Scope;
import de.cau.cs.kieler.scl.Statement;
import de.cau.cs.kieler.scl.StatementContainer;

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
 * @see de.cau.cs.kieler.esterel.EsterelPackage
 * @generated
 */
public class EsterelSwitch<T> extends Switch<T> {
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
    public EsterelSwitch() {
        if (modelPackage == null) {
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
    protected boolean isSwitchFor(EPackage ePackage) {
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
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case EsterelPackage.ESTEREL_PROGRAM: {
                EsterelProgram esterelProgram = (EsterelProgram)theEObject;
                T result = caseEsterelProgram(esterelProgram);
                if (result == null) result = casePragmatable(esterelProgram);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.ESTEREL_MODULE: {
                EsterelModule esterelModule = (EsterelModule)theEObject;
                T result = caseEsterelModule(esterelModule);
                if (result == null) result = caseModule(esterelModule);
                if (result == null) result = caseScope(esterelModule);
                if (result == null) result = caseDeclarationScope(esterelModule);
                if (result == null) result = caseStatementContainer(esterelModule);
                if (result == null) result = caseAnnotatable(esterelModule);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.ESTEREL_DECLARATION: {
                EsterelDeclaration esterelDeclaration = (EsterelDeclaration)theEObject;
                T result = caseEsterelDeclaration(esterelDeclaration);
                if (result == null) result = caseAnnotatable(esterelDeclaration);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.ESTEREL_DEFINITION: {
                EsterelDefinition esterelDefinition = (EsterelDefinition)theEObject;
                T result = caseEsterelDefinition(esterelDefinition);
                if (result == null) result = caseNamedObject(esterelDefinition);
                if (result == null) result = caseAnnotatable(esterelDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.TYPE_IDENTIFIER: {
                TypeIdentifier typeIdentifier = (TypeIdentifier)theEObject;
                T result = caseTypeIdentifier(typeIdentifier);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.TYPE_DECLARATION: {
                TypeDeclaration typeDeclaration = (TypeDeclaration)theEObject;
                T result = caseTypeDeclaration(typeDeclaration);
                if (result == null) result = caseEsterelDeclaration(typeDeclaration);
                if (result == null) result = caseAnnotatable(typeDeclaration);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.TYPE_DEFINITION: {
                TypeDefinition typeDefinition = (TypeDefinition)theEObject;
                T result = caseTypeDefinition(typeDefinition);
                if (result == null) result = caseEsterelDefinition(typeDefinition);
                if (result == null) result = caseNamedObject(typeDefinition);
                if (result == null) result = caseAnnotatable(typeDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.CONSTANT_MULTI_DECLARATION: {
                ConstantMultiDeclaration constantMultiDeclaration = (ConstantMultiDeclaration)theEObject;
                T result = caseConstantMultiDeclaration(constantMultiDeclaration);
                if (result == null) result = caseEsterelDeclaration(constantMultiDeclaration);
                if (result == null) result = caseAnnotatable(constantMultiDeclaration);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.CONSTANT_DECLARATION: {
                ConstantDeclaration constantDeclaration = (ConstantDeclaration)theEObject;
                T result = caseConstantDeclaration(constantDeclaration);
                if (result == null) result = caseEsterelDeclaration(constantDeclaration);
                if (result == null) result = caseAnnotatable(constantDeclaration);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.CONSTANT: {
                Constant constant = (Constant)theEObject;
                T result = caseConstant(constant);
                if (result == null) result = caseEsterelDefinition(constant);
                if (result == null) result = caseNamedObject(constant);
                if (result == null) result = caseAnnotatable(constant);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.FUNCTION_DECLARATION: {
                FunctionDeclaration functionDeclaration = (FunctionDeclaration)theEObject;
                T result = caseFunctionDeclaration(functionDeclaration);
                if (result == null) result = caseEsterelDeclaration(functionDeclaration);
                if (result == null) result = caseAnnotatable(functionDeclaration);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.FUNCTION: {
                Function function = (Function)theEObject;
                T result = caseFunction(function);
                if (result == null) result = caseEsterelDefinition(function);
                if (result == null) result = caseNamedObject(function);
                if (result == null) result = caseAnnotatable(function);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.PROCEDURE_DECLARATION: {
                ProcedureDeclaration procedureDeclaration = (ProcedureDeclaration)theEObject;
                T result = caseProcedureDeclaration(procedureDeclaration);
                if (result == null) result = caseEsterelDeclaration(procedureDeclaration);
                if (result == null) result = caseAnnotatable(procedureDeclaration);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.PROCEDURE: {
                Procedure procedure = (Procedure)theEObject;
                T result = caseProcedure(procedure);
                if (result == null) result = caseEsterelDefinition(procedure);
                if (result == null) result = caseNamedObject(procedure);
                if (result == null) result = caseAnnotatable(procedure);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.TASK_DECLARATION: {
                TaskDeclaration taskDeclaration = (TaskDeclaration)theEObject;
                T result = caseTaskDeclaration(taskDeclaration);
                if (result == null) result = caseEsterelDeclaration(taskDeclaration);
                if (result == null) result = caseAnnotatable(taskDeclaration);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.TASK: {
                Task task = (Task)theEObject;
                T result = caseTask(task);
                if (result == null) result = caseEsterelDefinition(task);
                if (result == null) result = caseNamedObject(task);
                if (result == null) result = caseAnnotatable(task);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.SIGNAL_DECLARATION: {
                SignalDeclaration signalDeclaration = (SignalDeclaration)theEObject;
                T result = caseSignalDeclaration(signalDeclaration);
                if (result == null) result = caseEsterelDeclaration(signalDeclaration);
                if (result == null) result = caseDeclaration(signalDeclaration);
                if (result == null) result = caseAnnotatable(signalDeclaration);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.INPUT_DECLARATION: {
                InputDeclaration inputDeclaration = (InputDeclaration)theEObject;
                T result = caseInputDeclaration(inputDeclaration);
                if (result == null) result = caseSignalDeclaration(inputDeclaration);
                if (result == null) result = caseEsterelDeclaration(inputDeclaration);
                if (result == null) result = caseDeclaration(inputDeclaration);
                if (result == null) result = caseAnnotatable(inputDeclaration);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.OUTPUT_DECLARATION: {
                OutputDeclaration outputDeclaration = (OutputDeclaration)theEObject;
                T result = caseOutputDeclaration(outputDeclaration);
                if (result == null) result = caseSignalDeclaration(outputDeclaration);
                if (result == null) result = caseEsterelDeclaration(outputDeclaration);
                if (result == null) result = caseDeclaration(outputDeclaration);
                if (result == null) result = caseAnnotatable(outputDeclaration);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.INPUT_OUTPUT_DECLARATION: {
                InputOutputDeclaration inputOutputDeclaration = (InputOutputDeclaration)theEObject;
                T result = caseInputOutputDeclaration(inputOutputDeclaration);
                if (result == null) result = caseSignalDeclaration(inputOutputDeclaration);
                if (result == null) result = caseEsterelDeclaration(inputOutputDeclaration);
                if (result == null) result = caseDeclaration(inputOutputDeclaration);
                if (result == null) result = caseAnnotatable(inputOutputDeclaration);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.RETURN_DECLARATION: {
                ReturnDeclaration returnDeclaration = (ReturnDeclaration)theEObject;
                T result = caseReturnDeclaration(returnDeclaration);
                if (result == null) result = caseSignalDeclaration(returnDeclaration);
                if (result == null) result = caseEsterelDeclaration(returnDeclaration);
                if (result == null) result = caseDeclaration(returnDeclaration);
                if (result == null) result = caseAnnotatable(returnDeclaration);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.SIGNAL: {
                Signal signal = (Signal)theEObject;
                T result = caseSignal(signal);
                if (result == null) result = caseValuedObject(signal);
                if (result == null) result = caseNamedObject(signal);
                if (result == null) result = caseAnnotatable(signal);
                if (result == null) result = caseReferenceable(signal);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.SENSOR_DECLARATION: {
                SensorDeclaration sensorDeclaration = (SensorDeclaration)theEObject;
                T result = caseSensorDeclaration(sensorDeclaration);
                if (result == null) result = caseEsterelDeclaration(sensorDeclaration);
                if (result == null) result = caseAnnotatable(sensorDeclaration);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.SENSOR: {
                Sensor sensor = (Sensor)theEObject;
                T result = caseSensor(sensor);
                if (result == null) result = caseValuedObject(sensor);
                if (result == null) result = caseNamedObject(sensor);
                if (result == null) result = caseAnnotatable(sensor);
                if (result == null) result = caseReferenceable(sensor);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.RELATION_DECLARATION: {
                RelationDeclaration relationDeclaration = (RelationDeclaration)theEObject;
                T result = caseRelationDeclaration(relationDeclaration);
                if (result == null) result = caseEsterelDeclaration(relationDeclaration);
                if (result == null) result = caseAnnotatable(relationDeclaration);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.RELATION: {
                Relation relation = (Relation)theEObject;
                T result = caseRelation(relation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.RELATION_IMPLICATION: {
                RelationImplication relationImplication = (RelationImplication)theEObject;
                T result = caseRelationImplication(relationImplication);
                if (result == null) result = caseRelation(relationImplication);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.RELATION_INCOMPATIBILITY: {
                RelationIncompatibility relationIncompatibility = (RelationIncompatibility)theEObject;
                T result = caseRelationIncompatibility(relationIncompatibility);
                if (result == null) result = caseRelation(relationIncompatibility);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.ESTEREL_STATEMENT: {
                EsterelStatement esterelStatement = (EsterelStatement)theEObject;
                T result = caseEsterelStatement(esterelStatement);
                if (result == null) result = caseStatement(esterelStatement);
                if (result == null) result = caseAnnotatable(esterelStatement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.ESTEREL_PARALLEL: {
                EsterelParallel esterelParallel = (EsterelParallel)theEObject;
                T result = caseEsterelParallel(esterelParallel);
                if (result == null) result = caseEsterelStatement(esterelParallel);
                if (result == null) result = caseStatement(esterelParallel);
                if (result == null) result = caseAnnotatable(esterelParallel);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.ESTEREL_THREAD: {
                EsterelThread esterelThread = (EsterelThread)theEObject;
                T result = caseEsterelThread(esterelThread);
                if (result == null) result = caseEsterelStatement(esterelThread);
                if (result == null) result = caseThread(esterelThread);
                if (result == null) result = caseStatement(esterelThread);
                if (result == null) result = caseScope(esterelThread);
                if (result == null) result = caseAnnotatable(esterelThread);
                if (result == null) result = caseStatementContainer(esterelThread);
                if (result == null) result = caseDeclarationScope(esterelThread);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.NOTHING: {
                Nothing nothing = (Nothing)theEObject;
                T result = caseNothing(nothing);
                if (result == null) result = caseEsterelStatement(nothing);
                if (result == null) result = caseStatement(nothing);
                if (result == null) result = caseAnnotatable(nothing);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.HALT: {
                Halt halt = (Halt)theEObject;
                T result = caseHalt(halt);
                if (result == null) result = caseEsterelStatement(halt);
                if (result == null) result = caseStatement(halt);
                if (result == null) result = caseAnnotatable(halt);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.BLOCK: {
                Block block = (Block)theEObject;
                T result = caseBlock(block);
                if (result == null) result = caseStatementContainer(block);
                if (result == null) result = caseEsterelStatement(block);
                if (result == null) result = caseStatement(block);
                if (result == null) result = caseAnnotatable(block);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.EMIT: {
                Emit emit = (Emit)theEObject;
                T result = caseEmit(emit);
                if (result == null) result = caseEsterelStatement(emit);
                if (result == null) result = caseStatement(emit);
                if (result == null) result = caseAnnotatable(emit);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.SUSTAIN: {
                Sustain sustain = (Sustain)theEObject;
                T result = caseSustain(sustain);
                if (result == null) result = caseEsterelStatement(sustain);
                if (result == null) result = caseStatement(sustain);
                if (result == null) result = caseAnnotatable(sustain);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.PROCEDURE_CALL: {
                ProcedureCall procedureCall = (ProcedureCall)theEObject;
                T result = caseProcedureCall(procedureCall);
                if (result == null) result = caseEsterelStatement(procedureCall);
                if (result == null) result = caseStatement(procedureCall);
                if (result == null) result = caseAnnotatable(procedureCall);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.PRESENT: {
                Present present = (Present)theEObject;
                T result = casePresent(present);
                if (result == null) result = caseEsterelStatement(present);
                if (result == null) result = caseStatementContainer(present);
                if (result == null) result = caseStatement(present);
                if (result == null) result = caseAnnotatable(present);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.PRESENT_CASE: {
                PresentCase presentCase = (PresentCase)theEObject;
                T result = casePresentCase(presentCase);
                if (result == null) result = caseStatementContainer(presentCase);
                if (result == null) result = caseAnnotatable(presentCase);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.IF_TEST: {
                IfTest ifTest = (IfTest)theEObject;
                T result = caseIfTest(ifTest);
                if (result == null) result = caseEsterelStatement(ifTest);
                if (result == null) result = caseStatementContainer(ifTest);
                if (result == null) result = caseStatement(ifTest);
                if (result == null) result = caseAnnotatable(ifTest);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.ELS_IF: {
                ElsIf elsIf = (ElsIf)theEObject;
                T result = caseElsIf(elsIf);
                if (result == null) result = caseEsterelStatement(elsIf);
                if (result == null) result = caseStatementContainer(elsIf);
                if (result == null) result = caseStatement(elsIf);
                if (result == null) result = caseAnnotatable(elsIf);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.LOOP: {
                Loop loop = (Loop)theEObject;
                T result = caseLoop(loop);
                if (result == null) result = caseEsterelStatement(loop);
                if (result == null) result = caseStatementContainer(loop);
                if (result == null) result = caseStatement(loop);
                if (result == null) result = caseAnnotatable(loop);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.REPEAT: {
                Repeat repeat = (Repeat)theEObject;
                T result = caseRepeat(repeat);
                if (result == null) result = caseEsterelStatement(repeat);
                if (result == null) result = caseStatementContainer(repeat);
                if (result == null) result = caseStatement(repeat);
                if (result == null) result = caseAnnotatable(repeat);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.ABORT: {
                Abort abort = (Abort)theEObject;
                T result = caseAbort(abort);
                if (result == null) result = caseEsterelStatement(abort);
                if (result == null) result = caseStatementContainer(abort);
                if (result == null) result = caseStatement(abort);
                if (result == null) result = caseAnnotatable(abort);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.CASE: {
                Case case_ = (Case)theEObject;
                T result = caseCase(case_);
                if (result == null) result = caseStatementContainer(case_);
                if (result == null) result = caseAnnotatable(case_);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.AWAIT: {
                Await await = (Await)theEObject;
                T result = caseAwait(await);
                if (result == null) result = caseEsterelStatement(await);
                if (result == null) result = caseStatementContainer(await);
                if (result == null) result = caseStatement(await);
                if (result == null) result = caseAnnotatable(await);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.EVERY_DO: {
                EveryDo everyDo = (EveryDo)theEObject;
                T result = caseEveryDo(everyDo);
                if (result == null) result = caseEsterelStatement(everyDo);
                if (result == null) result = caseStatementContainer(everyDo);
                if (result == null) result = caseStatement(everyDo);
                if (result == null) result = caseAnnotatable(everyDo);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.SUSPEND: {
                Suspend suspend = (Suspend)theEObject;
                T result = caseSuspend(suspend);
                if (result == null) result = caseEsterelStatement(suspend);
                if (result == null) result = caseStatementContainer(suspend);
                if (result == null) result = caseStatement(suspend);
                if (result == null) result = caseAnnotatable(suspend);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.TRAP: {
                Trap trap = (Trap)theEObject;
                T result = caseTrap(trap);
                if (result == null) result = caseEsterelStatement(trap);
                if (result == null) result = caseStatementContainer(trap);
                if (result == null) result = caseStatement(trap);
                if (result == null) result = caseAnnotatable(trap);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.TRAP_HANDLER: {
                TrapHandler trapHandler = (TrapHandler)theEObject;
                T result = caseTrapHandler(trapHandler);
                if (result == null) result = caseStatementContainer(trapHandler);
                if (result == null) result = caseAnnotatable(trapHandler);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.EXIT: {
                Exit exit = (Exit)theEObject;
                T result = caseExit(exit);
                if (result == null) result = caseEsterelStatement(exit);
                if (result == null) result = caseStatement(exit);
                if (result == null) result = caseAnnotatable(exit);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.EXEC: {
                Exec exec = (Exec)theEObject;
                T result = caseExec(exec);
                if (result == null) result = caseEsterelStatement(exec);
                if (result == null) result = caseStatementContainer(exec);
                if (result == null) result = caseStatement(exec);
                if (result == null) result = caseAnnotatable(exec);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.EXEC_CASE: {
                ExecCase execCase = (ExecCase)theEObject;
                T result = caseExecCase(execCase);
                if (result == null) result = caseStatementContainer(execCase);
                if (result == null) result = caseAnnotatable(execCase);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.LOCAL_SIGNAL_DECLARATION: {
                LocalSignalDeclaration localSignalDeclaration = (LocalSignalDeclaration)theEObject;
                T result = caseLocalSignalDeclaration(localSignalDeclaration);
                if (result == null) result = caseEsterelStatement(localSignalDeclaration);
                if (result == null) result = caseStatementContainer(localSignalDeclaration);
                if (result == null) result = caseDeclaration(localSignalDeclaration);
                if (result == null) result = caseStatement(localSignalDeclaration);
                if (result == null) result = caseAnnotatable(localSignalDeclaration);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.LOCAL_VARIABLE_DECLARATION: {
                LocalVariableDeclaration localVariableDeclaration = (LocalVariableDeclaration)theEObject;
                T result = caseLocalVariableDeclaration(localVariableDeclaration);
                if (result == null) result = caseEsterelStatement(localVariableDeclaration);
                if (result == null) result = caseStatementContainer(localVariableDeclaration);
                if (result == null) result = caseStatement(localVariableDeclaration);
                if (result == null) result = caseAnnotatable(localVariableDeclaration);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.ESTEREL_VARIABLE_DECLARATION: {
                EsterelVariableDeclaration esterelVariableDeclaration = (EsterelVariableDeclaration)theEObject;
                T result = caseEsterelVariableDeclaration(esterelVariableDeclaration);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.VARIABLE: {
                Variable variable = (Variable)theEObject;
                T result = caseVariable(variable);
                if (result == null) result = caseValuedObject(variable);
                if (result == null) result = caseNamedObject(variable);
                if (result == null) result = caseAnnotatable(variable);
                if (result == null) result = caseReferenceable(variable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.RUN: {
                Run run = (Run)theEObject;
                T result = caseRun(run);
                if (result == null) result = caseEsterelStatement(run);
                if (result == null) result = caseStatement(run);
                if (result == null) result = caseAnnotatable(run);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.MODULE_RENAMING: {
                ModuleRenaming moduleRenaming = (ModuleRenaming)theEObject;
                T result = caseModuleRenaming(moduleRenaming);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.RENAMING: {
                Renaming renaming = (Renaming)theEObject;
                T result = caseRenaming(renaming);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.RENAMINGS: {
                Renamings renamings = (Renamings)theEObject;
                T result = caseRenamings(renamings);
                if (result == null) result = caseAnnotatable(renamings);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.TYPE_RENAMING: {
                TypeRenaming typeRenaming = (TypeRenaming)theEObject;
                T result = caseTypeRenaming(typeRenaming);
                if (result == null) result = caseRenaming(typeRenaming);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.CONSTANT_RENAMING: {
                ConstantRenaming constantRenaming = (ConstantRenaming)theEObject;
                T result = caseConstantRenaming(constantRenaming);
                if (result == null) result = caseRenaming(constantRenaming);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.FUNCTION_RENAMING: {
                FunctionRenaming functionRenaming = (FunctionRenaming)theEObject;
                T result = caseFunctionRenaming(functionRenaming);
                if (result == null) result = caseRenaming(functionRenaming);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.PROCEDURE_RENAMING: {
                ProcedureRenaming procedureRenaming = (ProcedureRenaming)theEObject;
                T result = caseProcedureRenaming(procedureRenaming);
                if (result == null) result = caseRenaming(procedureRenaming);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.TASK_RENAMING: {
                TaskRenaming taskRenaming = (TaskRenaming)theEObject;
                T result = caseTaskRenaming(taskRenaming);
                if (result == null) result = caseRenaming(taskRenaming);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.SIGNAL_RENAMING: {
                SignalRenaming signalRenaming = (SignalRenaming)theEObject;
                T result = caseSignalRenaming(signalRenaming);
                if (result == null) result = caseRenaming(signalRenaming);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.DO: {
                Do do_ = (Do)theEObject;
                T result = caseDo(do_);
                if (result == null) result = caseEsterelStatement(do_);
                if (result == null) result = caseStatementContainer(do_);
                if (result == null) result = caseStatement(do_);
                if (result == null) result = caseAnnotatable(do_);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.DELAY_EXPR: {
                DelayExpr delayExpr = (DelayExpr)theEObject;
                T result = caseDelayExpr(delayExpr);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.TRAP_SIGNAL: {
                TrapSignal trapSignal = (TrapSignal)theEObject;
                T result = caseTrapSignal(trapSignal);
                if (result == null) result = caseSignal(trapSignal);
                if (result == null) result = caseValuedObject(trapSignal);
                if (result == null) result = caseNamedObject(trapSignal);
                if (result == null) result = caseAnnotatable(trapSignal);
                if (result == null) result = caseReferenceable(trapSignal);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.TRAP_EXPRESSION: {
                TrapExpression trapExpression = (TrapExpression)theEObject;
                T result = caseTrapExpression(trapExpression);
                if (result == null) result = caseExpression(trapExpression);
                if (result == null) result = caseSchedulable(trapExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.ESTEREL_FUNCTION_CALL: {
                EsterelFunctionCall esterelFunctionCall = (EsterelFunctionCall)theEObject;
                T result = caseEsterelFunctionCall(esterelFunctionCall);
                if (result == null) result = caseExpression(esterelFunctionCall);
                if (result == null) result = caseSchedulable(esterelFunctionCall);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.CONSTANT_EXPRESSION: {
                ConstantExpression constantExpression = (ConstantExpression)theEObject;
                T result = caseConstantExpression(constantExpression);
                if (result == null) result = caseExpression(constantExpression);
                if (result == null) result = caseSchedulable(constantExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.TRAP_REFERENCE_EXPR: {
                TrapReferenceExpr trapReferenceExpr = (TrapReferenceExpr)theEObject;
                T result = caseTrapReferenceExpr(trapReferenceExpr);
                if (result == null) result = caseValuedObjectReference(trapReferenceExpr);
                if (result == null) result = caseExpression(trapReferenceExpr);
                if (result == null) result = caseSchedulable(trapReferenceExpr);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.SIGNAL_REFERENCE_EXPR: {
                SignalReferenceExpr signalReferenceExpr = (SignalReferenceExpr)theEObject;
                T result = caseSignalReferenceExpr(signalReferenceExpr);
                if (result == null) result = caseValuedObjectReference(signalReferenceExpr);
                if (result == null) result = caseExpression(signalReferenceExpr);
                if (result == null) result = caseSchedulable(signalReferenceExpr);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.SC_EST_STATEMENT: {
                SCEstStatement scEstStatement = (SCEstStatement)theEObject;
                T result = caseSCEstStatement(scEstStatement);
                if (result == null) result = caseStatement(scEstStatement);
                if (result == null) result = caseAnnotatable(scEstStatement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.UN_EMIT: {
                UnEmit unEmit = (UnEmit)theEObject;
                T result = caseUnEmit(unEmit);
                if (result == null) result = caseSCEstStatement(unEmit);
                if (result == null) result = caseStatement(unEmit);
                if (result == null) result = caseAnnotatable(unEmit);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case EsterelPackage.SET: {
                Set set = (Set)theEObject;
                T result = caseSet(set);
                if (result == null) result = caseSCEstStatement(set);
                if (result == null) result = caseStatement(set);
                if (result == null) result = caseAnnotatable(set);
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
    public T caseEsterelProgram(EsterelProgram object) {
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
    public T caseEsterelModule(EsterelModule object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEsterelDeclaration(EsterelDeclaration object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEsterelDefinition(EsterelDefinition object) {
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
    public T caseTypeIdentifier(TypeIdentifier object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Type Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Type Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTypeDeclaration(TypeDeclaration object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Type Definition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Type Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTypeDefinition(TypeDefinition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Constant Multi Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Constant Multi Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConstantMultiDeclaration(ConstantMultiDeclaration object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Constant Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Constant Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConstantDeclaration(ConstantDeclaration object) {
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
    public T caseConstant(Constant object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Function Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Function Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFunctionDeclaration(FunctionDeclaration object) {
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
    public T caseFunction(Function object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Procedure Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Procedure Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProcedureDeclaration(ProcedureDeclaration object) {
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
    public T caseProcedure(Procedure object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Task Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Task Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTaskDeclaration(TaskDeclaration object) {
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
    public T caseTask(Task object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Signal Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Signal Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSignalDeclaration(SignalDeclaration object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Input Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Input Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInputDeclaration(InputDeclaration object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Output Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Output Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOutputDeclaration(OutputDeclaration object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Input Output Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Input Output Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInputOutputDeclaration(InputOutputDeclaration object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Return Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Return Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReturnDeclaration(ReturnDeclaration object) {
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
    public T caseSignal(Signal object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sensor Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sensor Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSensorDeclaration(SensorDeclaration object) {
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
    public T caseSensor(Sensor object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Relation Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Relation Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRelationDeclaration(RelationDeclaration object) {
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
    public T caseRelation(Relation object) {
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
    public T caseRelationImplication(RelationImplication object) {
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
    public T caseRelationIncompatibility(RelationIncompatibility object) {
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
    public T caseEsterelStatement(EsterelStatement object) {
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
    public T caseEsterelParallel(EsterelParallel object) {
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
    public T caseEsterelThread(EsterelThread object) {
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
    public T caseNothing(Nothing object) {
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
    public T caseHalt(Halt object) {
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
    public T caseBlock(Block object) {
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
    public T caseEmit(Emit object) {
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
    public T caseSustain(Sustain object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Procedure Call</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Procedure Call</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProcedureCall(ProcedureCall object) {
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
    public T casePresent(Present object) {
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
    public T casePresentCase(PresentCase object) {
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
    public T caseIfTest(IfTest object) {
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
    public T caseElsIf(ElsIf object) {
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
    public T caseLoop(Loop object) {
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
    public T caseRepeat(Repeat object) {
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
    public T caseAbort(Abort object) {
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
    public T caseCase(Case object) {
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
    public T caseAwait(Await object) {
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
    public T caseEveryDo(EveryDo object) {
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
    public T caseSuspend(Suspend object) {
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
    public T caseTrap(Trap object) {
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
    public T caseTrapHandler(TrapHandler object) {
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
    public T caseExit(Exit object) {
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
    public T caseExec(Exec object) {
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
    public T caseExecCase(ExecCase object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Local Signal Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Local Signal Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLocalSignalDeclaration(LocalSignalDeclaration object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Local Variable Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Local Variable Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLocalVariableDeclaration(LocalVariableDeclaration object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEsterelVariableDeclaration(EsterelVariableDeclaration object) {
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
    public T caseVariable(Variable object) {
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
    public T caseRun(Run object) {
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
    public T caseModuleRenaming(ModuleRenaming object) {
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
    public T caseRenaming(Renaming object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Renamings</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Renamings</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRenamings(Renamings object) {
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
    public T caseTypeRenaming(TypeRenaming object) {
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
    public T caseConstantRenaming(ConstantRenaming object) {
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
    public T caseFunctionRenaming(FunctionRenaming object) {
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
    public T caseProcedureRenaming(ProcedureRenaming object) {
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
    public T caseTaskRenaming(TaskRenaming object) {
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
    public T caseSignalRenaming(SignalRenaming object) {
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
    public T caseDo(Do object) {
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
    public T caseDelayExpr(DelayExpr object) {
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
    public T caseTrapSignal(TrapSignal object) {
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
    public T caseTrapExpression(TrapExpression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Function Call</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Function Call</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEsterelFunctionCall(EsterelFunctionCall object) {
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
    public T caseConstantExpression(ConstantExpression object) {
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
    public T caseTrapReferenceExpr(TrapReferenceExpr object) {
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
    public T caseSignalReferenceExpr(SignalReferenceExpr object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SC Est Statement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SC Est Statement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSCEstStatement(SCEstStatement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Un Emit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Un Emit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUnEmit(UnEmit object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Set</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSet(Set object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pragmatable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pragmatable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePragmatable(Pragmatable object) {
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
    public T caseAnnotatable(Annotatable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Declaration Scope</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Declaration Scope</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDeclarationScope(DeclarationScope object) {
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
    public T caseStatementContainer(StatementContainer object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Scope</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Scope</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseScope(Scope object) {
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
    public T caseModule(Module object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Named Object</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Named Object</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNamedObject(NamedObject object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDeclaration(Declaration object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Referenceable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Referenceable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReferenceable(Referenceable object) {
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
    public T caseValuedObject(ValuedObject object) {
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
    public T caseStatement(Statement object) {
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
    public T caseThread(de.cau.cs.kieler.scl.Thread object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Schedulable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Schedulable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSchedulable(Schedulable object) {
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
    public T caseExpression(Expression object) {
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
    public T caseValuedObjectReference(ValuedObjectReference object) {
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
    public T defaultCase(EObject object) {
        return null;
    }

} //EsterelSwitch
