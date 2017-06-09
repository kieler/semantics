/**
 */
package de.cau.cs.kieler.scl.scl.util;

import de.cau.cs.kieler.annotations.Annotatable;

import de.cau.cs.kieler.kexpressions.keffects.Effect;

import de.cau.cs.kieler.scl.scl.Assignment;
import de.cau.cs.kieler.scl.scl.Conditional;
import de.cau.cs.kieler.scl.scl.ElseScope;
import de.cau.cs.kieler.scl.scl.Goto;
import de.cau.cs.kieler.scl.scl.Label;
import de.cau.cs.kieler.scl.scl.Parallel;
import de.cau.cs.kieler.scl.scl.Pause;
import de.cau.cs.kieler.scl.scl.SCLProgram;
import de.cau.cs.kieler.scl.scl.SclPackage;
import de.cau.cs.kieler.scl.scl.Scope;
import de.cau.cs.kieler.scl.scl.ScopeStatement;
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
 * @see de.cau.cs.kieler.scl.scl.SclPackage
 * @generated
 */
public class SclSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static SclPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SclSwitch() {
        if (modelPackage == null) {
            modelPackage = SclPackage.eINSTANCE;
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
            case SclPackage.SCL_PROGRAM: {
                SCLProgram sclProgram = (SCLProgram)theEObject;
                T result = caseSCLProgram(sclProgram);
                if (result == null) result = caseScope(sclProgram);
                if (result == null) result = caseStatementContainer(sclProgram);
                if (result == null) result = caseAnnotatable(sclProgram);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.STATEMENT: {
                Statement statement = (Statement)theEObject;
                T result = caseStatement(statement);
                if (result == null) result = caseAnnotatable(statement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.STATEMENT_CONTAINER: {
                StatementContainer statementContainer = (StatementContainer)theEObject;
                T result = caseStatementContainer(statementContainer);
                if (result == null) result = caseAnnotatable(statementContainer);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.SCOPE: {
                Scope scope = (Scope)theEObject;
                T result = caseScope(scope);
                if (result == null) result = caseStatementContainer(scope);
                if (result == null) result = caseAnnotatable(scope);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.PAUSE: {
                Pause pause = (Pause)theEObject;
                T result = casePause(pause);
                if (result == null) result = caseStatement(pause);
                if (result == null) result = caseAnnotatable(pause);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.LABEL: {
                Label label = (Label)theEObject;
                T result = caseLabel(label);
                if (result == null) result = caseStatement(label);
                if (result == null) result = caseAnnotatable(label);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.GOTO: {
                Goto goto_ = (Goto)theEObject;
                T result = caseGoto(goto_);
                if (result == null) result = caseStatement(goto_);
                if (result == null) result = caseAnnotatable(goto_);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.ASSIGNMENT: {
                Assignment assignment = (Assignment)theEObject;
                T result = caseAssignment(assignment);
                if (result == null) result = caseKEffects_Assignment(assignment);
                if (result == null) result = caseStatement(assignment);
                if (result == null) result = caseEffect(assignment);
                if (result == null) result = caseAnnotatable(assignment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.CONDITIONAL: {
                Conditional conditional = (Conditional)theEObject;
                T result = caseConditional(conditional);
                if (result == null) result = caseScope(conditional);
                if (result == null) result = caseStatement(conditional);
                if (result == null) result = caseStatementContainer(conditional);
                if (result == null) result = caseAnnotatable(conditional);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.PARALLEL: {
                Parallel parallel = (Parallel)theEObject;
                T result = caseParallel(parallel);
                if (result == null) result = caseStatement(parallel);
                if (result == null) result = caseAnnotatable(parallel);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.THREAD: {
                de.cau.cs.kieler.scl.scl.Thread thread = (de.cau.cs.kieler.scl.scl.Thread)theEObject;
                T result = caseThread(thread);
                if (result == null) result = caseScope(thread);
                if (result == null) result = caseStatementContainer(thread);
                if (result == null) result = caseAnnotatable(thread);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.SCOPE_STATEMENT: {
                ScopeStatement scopeStatement = (ScopeStatement)theEObject;
                T result = caseScopeStatement(scopeStatement);
                if (result == null) result = caseStatement(scopeStatement);
                if (result == null) result = caseScope(scopeStatement);
                if (result == null) result = caseStatementContainer(scopeStatement);
                if (result == null) result = caseAnnotatable(scopeStatement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.ELSE_SCOPE: {
                ElseScope elseScope = (ElseScope)theEObject;
                T result = caseElseScope(elseScope);
                if (result == null) result = caseScope(elseScope);
                if (result == null) result = caseStatementContainer(elseScope);
                if (result == null) result = caseAnnotatable(elseScope);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SCL Program</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SCL Program</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSCLProgram(SCLProgram object) {
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
    public T caseThread(de.cau.cs.kieler.scl.scl.Thread object) {
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

} //SclSwitch
