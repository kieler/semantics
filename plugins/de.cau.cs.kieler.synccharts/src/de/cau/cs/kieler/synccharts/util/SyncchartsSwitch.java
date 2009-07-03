/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts.util;

import de.cau.cs.kieler.synccharts.*;

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
 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage
 * @generated
 */
public class SyncchartsSwitch<T> {
	/**
     * The cached model package
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static SyncchartsPackage modelPackage;

	/**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SyncchartsSwitch() {
        if (modelPackage == null) {
            modelPackage = SyncchartsPackage.eINSTANCE;
        }
    }

	/**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
	public T doSwitch(EObject theEObject) {
        return doSwitch(theEObject.eClass(), theEObject);
    }

	/**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
        if (theEClass.eContainer() == modelPackage) {
            return doSwitch(theEClass.getClassifierID(), theEObject);
        }
        else {
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
	protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case SyncchartsPackage.STATE: {
                State state = (State)theEObject;
                T result = caseState(state);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SyncchartsPackage.SIGNAL: {
                Signal signal = (Signal)theEObject;
                T result = caseSignal(signal);
                if (result == null) result = caseValuedObject(signal);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SyncchartsPackage.VALUED_OBJECT: {
                ValuedObject valuedObject = (ValuedObject)theEObject;
                T result = caseValuedObject(valuedObject);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SyncchartsPackage.EMISSION: {
                Emission emission = (Emission)theEObject;
                T result = caseEmission(emission);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SyncchartsPackage.TRANSITION: {
                Transition transition = (Transition)theEObject;
                T result = caseTransition(transition);
                if (result == null) result = caseAction(transition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SyncchartsPackage.EXPRESSION: {
                Expression expression = (Expression)theEObject;
                T result = caseExpression(expression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SyncchartsPackage.SIGNAL_RENAMING: {
                SignalRenaming signalRenaming = (SignalRenaming)theEObject;
                T result = caseSignalRenaming(signalRenaming);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SyncchartsPackage.OPERATOR: {
                Operator operator = (Operator)theEObject;
                T result = caseOperator(operator);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SyncchartsPackage.ACTION: {
                Action action = (Action)theEObject;
                T result = caseAction(action);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SyncchartsPackage.SUSPENSION_TRIGGER: {
                SuspensionTrigger suspensionTrigger = (SuspensionTrigger)theEObject;
                T result = caseSuspensionTrigger(suspensionTrigger);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SyncchartsPackage.ASSIGNMENT: {
                Assignment assignment = (Assignment)theEObject;
                T result = caseAssignment(assignment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SyncchartsPackage.VARIABLE: {
                Variable variable = (Variable)theEObject;
                T result = caseVariable(variable);
                if (result == null) result = caseValuedObject(variable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SyncchartsPackage.REGION: {
                Region region = (Region)theEObject;
                T result = caseRegion(region);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SyncchartsPackage.COMPLEX_EXPRESSION: {
                ComplexExpression complexExpression = (ComplexExpression)theEObject;
                T result = caseComplexExpression(complexExpression);
                if (result == null) result = caseExpression(complexExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SyncchartsPackage.SIGNAL_REFERENCE: {
                SignalReference signalReference = (SignalReference)theEObject;
                T result = caseSignalReference(signalReference);
                if (result == null) result = caseExpression(signalReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SyncchartsPackage.VARIABLE_REFERENCE: {
                VariableReference variableReference = (VariableReference)theEObject;
                T result = caseVariableReference(variableReference);
                if (result == null) result = caseExpression(variableReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
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
     * Returns the result of interpreting the object as an instance of '<em>Emission</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Emission</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseEmission(Emission object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseOperator(Operator object) {
        return null;
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
     * Returns the result of interpreting the object as an instance of '<em>Suspension Trigger</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Suspension Trigger</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSuspensionTrigger(SuspensionTrigger object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Complex Expression</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Complex Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseComplexExpression(ComplexExpression object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Signal Reference</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Signal Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSignalReference(SignalReference object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Variable Reference</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Variable Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseVariableReference(VariableReference object) {
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
	public T defaultCase(EObject object) {
        return null;
    }

} //SyncchartsSwitch
