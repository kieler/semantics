/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.util;

import de.cau.cs.kieler.annotations.Annotatable;
import de.cau.cs.kieler.annotations.Pragmatable;
import de.cau.cs.kieler.kexpressions.Call;
import de.cau.cs.kieler.kexpressions.Expression;
import de.cau.cs.kieler.kexpressions.Identifiable;
import de.cau.cs.kieler.kexpressions.Schedulable;
import de.cau.cs.kieler.kexpressions.kext.DeclarationScope;
import de.cau.cs.kieler.sccharts.*;
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
 * @see de.cau.cs.kieler.sccharts.SCChartsPackage
 * @generated
 */
public class SCChartsSwitch<T> extends Switch<T> {
    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\r\n\r\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\r\n\r\nCopyright 2013 by\r\n+ Kiel University\r\n  + Department of Computer Science\r\n    + Real-Time and Embedded Systems Group\r\n\r\nThis code is provided under the terms of the Eclipse Public License (EPL).\r\nSee the file epl-v10.html for the license text.";
				/**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static SCChartsPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SCChartsSwitch() {
        if (modelPackage == null) {
            modelPackage = SCChartsPackage.eINSTANCE;
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
            case SCChartsPackage.SC_CHARTS: {
                SCCharts scCharts = (SCCharts)theEObject;
                T result = caseSCCharts(scCharts);
                if (result == null) result = casePragmatable(scCharts);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCChartsPackage.SCOPE: {
                Scope scope = (Scope)theEObject;
                T result = caseScope(scope);
                if (result == null) result = caseAnnotatable(scope);
                if (result == null) result = caseDeclarationScope(scope);
                if (result == null) result = caseIdentifiable(scope);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCChartsPackage.SCOPE_CALL: {
                ScopeCall scopeCall = (ScopeCall)theEObject;
                T result = caseScopeCall(scopeCall);
                if (result == null) result = caseCall(scopeCall);
                if (result == null) result = caseExpression(scopeCall);
                if (result == null) result = caseSchedulable(scopeCall);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCChartsPackage.ACTION: {
                Action action = (Action)theEObject;
                T result = caseAction(action);
                if (result == null) result = caseAnnotatable(action);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCChartsPackage.LOCAL_ACTION: {
                LocalAction localAction = (LocalAction)theEObject;
                T result = caseLocalAction(localAction);
                if (result == null) result = caseAction(localAction);
                if (result == null) result = caseAnnotatable(localAction);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCChartsPackage.STATE: {
                State state = (State)theEObject;
                T result = caseState(state);
                if (result == null) result = caseScope(state);
                if (result == null) result = caseAnnotatable(state);
                if (result == null) result = caseDeclarationScope(state);
                if (result == null) result = caseIdentifiable(state);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCChartsPackage.REGION: {
                Region region = (Region)theEObject;
                T result = caseRegion(region);
                if (result == null) result = caseScope(region);
                if (result == null) result = caseAnnotatable(region);
                if (result == null) result = caseDeclarationScope(region);
                if (result == null) result = caseIdentifiable(region);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCChartsPackage.CONTROLFLOW_REGION: {
                ControlflowRegion controlflowRegion = (ControlflowRegion)theEObject;
                T result = caseControlflowRegion(controlflowRegion);
                if (result == null) result = caseRegion(controlflowRegion);
                if (result == null) result = caseScope(controlflowRegion);
                if (result == null) result = caseAnnotatable(controlflowRegion);
                if (result == null) result = caseDeclarationScope(controlflowRegion);
                if (result == null) result = caseIdentifiable(controlflowRegion);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCChartsPackage.DATAFLOW_REGION: {
                DataflowRegion dataflowRegion = (DataflowRegion)theEObject;
                T result = caseDataflowRegion(dataflowRegion);
                if (result == null) result = caseRegion(dataflowRegion);
                if (result == null) result = caseScope(dataflowRegion);
                if (result == null) result = caseAnnotatable(dataflowRegion);
                if (result == null) result = caseDeclarationScope(dataflowRegion);
                if (result == null) result = caseIdentifiable(dataflowRegion);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCChartsPackage.TRANSITION: {
                Transition transition = (Transition)theEObject;
                T result = caseTransition(transition);
                if (result == null) result = caseAction(transition);
                if (result == null) result = caseAnnotatable(transition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCChartsPackage.ENTRY_ACTION: {
                EntryAction entryAction = (EntryAction)theEObject;
                T result = caseEntryAction(entryAction);
                if (result == null) result = caseLocalAction(entryAction);
                if (result == null) result = caseAction(entryAction);
                if (result == null) result = caseAnnotatable(entryAction);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCChartsPackage.DURING_ACTION: {
                DuringAction duringAction = (DuringAction)theEObject;
                T result = caseDuringAction(duringAction);
                if (result == null) result = caseLocalAction(duringAction);
                if (result == null) result = caseAction(duringAction);
                if (result == null) result = caseAnnotatable(duringAction);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCChartsPackage.EXIT_ACTION: {
                ExitAction exitAction = (ExitAction)theEObject;
                T result = caseExitAction(exitAction);
                if (result == null) result = caseLocalAction(exitAction);
                if (result == null) result = caseAction(exitAction);
                if (result == null) result = caseAnnotatable(exitAction);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCChartsPackage.SUSPEND_ACTION: {
                SuspendAction suspendAction = (SuspendAction)theEObject;
                T result = caseSuspendAction(suspendAction);
                if (result == null) result = caseLocalAction(suspendAction);
                if (result == null) result = caseAction(suspendAction);
                if (result == null) result = caseAnnotatable(suspendAction);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCChartsPackage.PRECEDING_ACTION: {
                PrecedingAction precedingAction = (PrecedingAction)theEObject;
                T result = casePrecedingAction(precedingAction);
                if (result == null) result = caseLocalAction(precedingAction);
                if (result == null) result = caseAction(precedingAction);
                if (result == null) result = caseAnnotatable(precedingAction);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCChartsPackage.SUCCEEDING_ACTION: {
                SucceedingAction succeedingAction = (SucceedingAction)theEObject;
                T result = caseSucceedingAction(succeedingAction);
                if (result == null) result = caseLocalAction(succeedingAction);
                if (result == null) result = caseAction(succeedingAction);
                if (result == null) result = caseAnnotatable(succeedingAction);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Action</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAction(Action object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>State</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>State</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseState(State object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Region</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Region</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRegion(Region object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Controlflow Region</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Controlflow Region</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseControlflowRegion(ControlflowRegion object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dataflow Region</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dataflow Region</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataflowRegion(DataflowRegion object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTransition(Transition object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Scope Call</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Scope Call</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseScopeCall(ScopeCall object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Local Action</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Local Action</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLocalAction(LocalAction object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entry Action</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entry Action</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntryAction(EntryAction object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>During Action</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>During Action</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDuringAction(DuringAction object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exit Action</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exit Action</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExitAction(ExitAction object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Suspend Action</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Suspend Action</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSuspendAction(SuspendAction object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Preceding Action</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Preceding Action</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePrecedingAction(PrecedingAction object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Succeeding Action</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Succeeding Action</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSucceedingAction(SucceedingAction object) {
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
     * Returns the result of interpreting the object as an instance of '<em>SC Charts</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SC Charts</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSCCharts(SCCharts object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Identifiable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identifiable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentifiable(Identifiable object) {
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

} //SCChartsSwitch
