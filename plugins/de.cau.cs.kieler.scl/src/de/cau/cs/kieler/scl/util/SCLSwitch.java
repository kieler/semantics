/**
 */
package de.cau.cs.kieler.scl.util;

import de.cau.cs.kieler.annotations.Annotatable;
import de.cau.cs.kieler.annotations.Nameable;
import de.cau.cs.kieler.annotations.NamedObject;
import de.cau.cs.kieler.annotations.Pragmatable;

import de.cau.cs.kieler.kexpressions.Call;
import de.cau.cs.kieler.kexpressions.Declaration;
import de.cau.cs.kieler.kexpressions.Expression;
import de.cau.cs.kieler.kexpressions.MethodDeclaration;
import de.cau.cs.kieler.kexpressions.Schedulable;

import de.cau.cs.kieler.kexpressions.keffects.Effect;
import de.cau.cs.kieler.kexpressions.keffects.Linkable;

import de.cau.cs.kieler.kexpressions.kext.DeclarationScope;

import de.cau.cs.kieler.scl.Assignment;
import de.cau.cs.kieler.scl.Conditional;
import de.cau.cs.kieler.scl.ElseScope;
import de.cau.cs.kieler.scl.Goto;
import de.cau.cs.kieler.scl.Label;
import de.cau.cs.kieler.scl.MethodImplementationDeclaration;
import de.cau.cs.kieler.scl.ModuleCall;
import de.cau.cs.kieler.scl.Parallel;
import de.cau.cs.kieler.scl.Pause;
import de.cau.cs.kieler.scl.Return;
import de.cau.cs.kieler.scl.SCLPackage;
import de.cau.cs.kieler.scl.SCLProgram;
import de.cau.cs.kieler.scl.Scope;
import de.cau.cs.kieler.scl.ScopeStatement;
import de.cau.cs.kieler.scl.SequencePart;
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
 * @see de.cau.cs.kieler.scl.SCLPackage
 * @generated
 */
public class SCLSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static SCLPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SCLSwitch() {
        if (modelPackage == null) {
            modelPackage = SCLPackage.eINSTANCE;
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
            case SCLPackage.SCL_PROGRAM: {
                SCLProgram sclProgram = (SCLProgram)theEObject;
                T result = caseSCLProgram(sclProgram);
                if (result == null) result = casePragmatable(sclProgram);
                if (result == null) result = caseNameable(sclProgram);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCLPackage.MODULE: {
                de.cau.cs.kieler.scl.Module module = (de.cau.cs.kieler.scl.Module)theEObject;
                T result = caseModule(module);
                if (result == null) result = caseScope(module);
                if (result == null) result = caseNamedObject(module);
                if (result == null) result = caseDeclarationScope(module);
                if (result == null) result = caseStatementContainer(module);
                if (result == null) result = caseNameable(module);
                if (result == null) result = caseAnnotatable(module);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCLPackage.STATEMENT: {
                Statement statement = (Statement)theEObject;
                T result = caseStatement(statement);
                if (result == null) result = caseAnnotatable(statement);
                if (result == null) result = caseSequencePart(statement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCLPackage.STATEMENT_CONTAINER: {
                StatementContainer statementContainer = (StatementContainer)theEObject;
                T result = caseStatementContainer(statementContainer);
                if (result == null) result = caseAnnotatable(statementContainer);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCLPackage.SCOPE: {
                Scope scope = (Scope)theEObject;
                T result = caseScope(scope);
                if (result == null) result = caseDeclarationScope(scope);
                if (result == null) result = caseStatementContainer(scope);
                if (result == null) result = caseAnnotatable(scope);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCLPackage.PAUSE: {
                Pause pause = (Pause)theEObject;
                T result = casePause(pause);
                if (result == null) result = caseStatement(pause);
                if (result == null) result = caseAnnotatable(pause);
                if (result == null) result = caseSequencePart(pause);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCLPackage.LABEL: {
                Label label = (Label)theEObject;
                T result = caseLabel(label);
                if (result == null) result = caseStatement(label);
                if (result == null) result = caseNamedObject(label);
                if (result == null) result = caseAnnotatable(label);
                if (result == null) result = caseSequencePart(label);
                if (result == null) result = caseNameable(label);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCLPackage.GOTO: {
                Goto goto_ = (Goto)theEObject;
                T result = caseGoto(goto_);
                if (result == null) result = caseStatement(goto_);
                if (result == null) result = caseAnnotatable(goto_);
                if (result == null) result = caseSequencePart(goto_);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCLPackage.ASSIGNMENT: {
                Assignment assignment = (Assignment)theEObject;
                T result = caseAssignment(assignment);
                if (result == null) result = caseKEffects_Assignment(assignment);
                if (result == null) result = caseStatement(assignment);
                if (result == null) result = caseEffect(assignment);
                if (result == null) result = caseSequencePart(assignment);
                if (result == null) result = caseAnnotatable(assignment);
                if (result == null) result = caseSchedulable(assignment);
                if (result == null) result = caseLinkable(assignment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCLPackage.CONDITIONAL: {
                Conditional conditional = (Conditional)theEObject;
                T result = caseConditional(conditional);
                if (result == null) result = caseScope(conditional);
                if (result == null) result = caseStatement(conditional);
                if (result == null) result = caseDeclarationScope(conditional);
                if (result == null) result = caseStatementContainer(conditional);
                if (result == null) result = caseSequencePart(conditional);
                if (result == null) result = caseAnnotatable(conditional);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCLPackage.PARALLEL: {
                Parallel parallel = (Parallel)theEObject;
                T result = caseParallel(parallel);
                if (result == null) result = caseStatement(parallel);
                if (result == null) result = caseAnnotatable(parallel);
                if (result == null) result = caseSequencePart(parallel);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCLPackage.MODULE_CALL: {
                ModuleCall moduleCall = (ModuleCall)theEObject;
                T result = caseModuleCall(moduleCall);
                if (result == null) result = caseCall(moduleCall);
                if (result == null) result = caseStatement(moduleCall);
                if (result == null) result = caseExpression(moduleCall);
                if (result == null) result = caseAnnotatable(moduleCall);
                if (result == null) result = caseSequencePart(moduleCall);
                if (result == null) result = caseSchedulable(moduleCall);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCLPackage.THREAD: {
                de.cau.cs.kieler.scl.Thread thread = (de.cau.cs.kieler.scl.Thread)theEObject;
                T result = caseThread(thread);
                if (result == null) result = caseScope(thread);
                if (result == null) result = caseDeclarationScope(thread);
                if (result == null) result = caseStatementContainer(thread);
                if (result == null) result = caseAnnotatable(thread);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCLPackage.SCOPE_STATEMENT: {
                ScopeStatement scopeStatement = (ScopeStatement)theEObject;
                T result = caseScopeStatement(scopeStatement);
                if (result == null) result = caseStatement(scopeStatement);
                if (result == null) result = caseScope(scopeStatement);
                if (result == null) result = caseSequencePart(scopeStatement);
                if (result == null) result = caseDeclarationScope(scopeStatement);
                if (result == null) result = caseStatementContainer(scopeStatement);
                if (result == null) result = caseAnnotatable(scopeStatement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCLPackage.ELSE_SCOPE: {
                ElseScope elseScope = (ElseScope)theEObject;
                T result = caseElseScope(elseScope);
                if (result == null) result = caseScope(elseScope);
                if (result == null) result = caseSequencePart(elseScope);
                if (result == null) result = caseDeclarationScope(elseScope);
                if (result == null) result = caseStatementContainer(elseScope);
                if (result == null) result = caseAnnotatable(elseScope);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCLPackage.SEQUENCE_PART: {
                SequencePart sequencePart = (SequencePart)theEObject;
                T result = caseSequencePart(sequencePart);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCLPackage.RETURN: {
                Return return_ = (Return)theEObject;
                T result = caseReturn(return_);
                if (result == null) result = caseStatement(return_);
                if (result == null) result = caseAnnotatable(return_);
                if (result == null) result = caseSequencePart(return_);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCLPackage.METHOD_IMPLEMENTATION_DECLARATION: {
                MethodImplementationDeclaration methodImplementationDeclaration = (MethodImplementationDeclaration)theEObject;
                T result = caseMethodImplementationDeclaration(methodImplementationDeclaration);
                if (result == null) result = caseMethodDeclaration(methodImplementationDeclaration);
                if (result == null) result = caseScope(methodImplementationDeclaration);
                if (result == null) result = caseDeclaration(methodImplementationDeclaration);
                if (result == null) result = caseSchedulable(methodImplementationDeclaration);
                if (result == null) result = caseDeclarationScope(methodImplementationDeclaration);
                if (result == null) result = caseStatementContainer(methodImplementationDeclaration);
                if (result == null) result = caseAnnotatable(methodImplementationDeclaration);
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
    public T caseSCLProgram(SCLProgram object) {
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
    public T caseModule(de.cau.cs.kieler.scl.Module object) {
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
    public T casePause(Pause object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Label</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLabel(Label object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Goto</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Goto</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGoto(Goto object) {
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
    public T caseAssignment(Assignment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Conditional</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Conditional</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConditional(Conditional object) {
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
    public T caseParallel(Parallel object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Module Call</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Module Call</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModuleCall(ModuleCall object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Scope Statement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Scope Statement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseScopeStatement(ScopeStatement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Else Scope</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Else Scope</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseElseScope(ElseScope object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sequence Part</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sequence Part</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSequencePart(SequencePart object) {
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
    public T caseReturn(Return object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Method Implementation Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Method Implementation Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMethodImplementationDeclaration(MethodImplementationDeclaration object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Nameable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Nameable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNameable(Nameable object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Linkable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Linkable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLinkable(Linkable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Effect</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Effect</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEffect(Effect object) {
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
    public T caseKEffects_Assignment(de.cau.cs.kieler.kexpressions.keffects.Assignment object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Call</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Call</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCall(Call object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Method Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Method Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMethodDeclaration(MethodDeclaration object) {
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

} //SCLSwitch
