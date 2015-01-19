/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.util;

import de.cau.cs.kieler.core.annotations.Annotatable;

import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.core.kexpressions.FunctionCall;
import de.cau.cs.kieler.core.kexpressions.TextExpression;

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
    public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Christian-Albrechts-University of Kiel\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

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
     * @parameter ePackage the package in question.
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
            case SCChartsPackage.ACTION: {
                Action action = (Action)theEObject;
                T result = caseAction(action);
                if (result == null) result = caseAnnotatable(action);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCChartsPackage.ASSIGNMENT: {
                Assignment assignment = (Assignment)theEObject;
                T result = caseAssignment(assignment);
                if (result == null) result = caseEffect(assignment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCChartsPackage.EFFECT: {
                Effect effect = (Effect)theEObject;
                T result = caseEffect(effect);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCChartsPackage.EMISSION: {
                Emission emission = (Emission)theEObject;
                T result = caseEmission(emission);
                if (result == null) result = caseEffect(emission);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCChartsPackage.STATE: {
                State state = (State)theEObject;
                T result = caseState(state);
                if (result == null) result = caseScope(state);
                if (result == null) result = caseAnnotatable(state);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCChartsPackage.CONCURRENCY: {
                Concurrency concurrency = (Concurrency)theEObject;
                T result = caseConcurrency(concurrency);
                if (result == null) result = caseScope(concurrency);
                if (result == null) result = caseAnnotatable(concurrency);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCChartsPackage.REGION: {
                Region region = (Region)theEObject;
                T result = caseRegion(region);
                if (result == null) result = caseConcurrency(region);
                if (result == null) result = caseScope(region);
                if (result == null) result = caseAnnotatable(region);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCChartsPackage.NODE: {
                Node node = (Node)theEObject;
                T result = caseNode(node);
                if (result == null) result = caseAnnotatable(node);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCChartsPackage.INPUT_NODE: {
                InputNode inputNode = (InputNode)theEObject;
                T result = caseInputNode(inputNode);
                if (result == null) result = caseNode(inputNode);
                if (result == null) result = caseAnnotatable(inputNode);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCChartsPackage.REFERENCED_NODE: {
                ReferencedNode referencedNode = (ReferencedNode)theEObject;
                T result = caseReferencedNode(referencedNode);
                if (result == null) result = caseNode(referencedNode);
                if (result == null) result = caseAnnotatable(referencedNode);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCChartsPackage.TEST_REFERENCE_NODE: {
                TestReferenceNode testReferenceNode = (TestReferenceNode)theEObject;
                T result = caseTestReferenceNode(testReferenceNode);
                if (result == null) result = caseNode(testReferenceNode);
                if (result == null) result = caseAnnotatable(testReferenceNode);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCChartsPackage.CALL_NODE: {
                CallNode callNode = (CallNode)theEObject;
                T result = caseCallNode(callNode);
                if (result == null) result = caseNode(callNode);
                if (result == null) result = caseAnnotatable(callNode);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCChartsPackage.DATAFLOW_FEATURE: {
                DataflowFeature dataflowFeature = (DataflowFeature)theEObject;
                T result = caseDataflowFeature(dataflowFeature);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCChartsPackage.DEFINE_NODE: {
                DefineNode defineNode = (DefineNode)theEObject;
                T result = caseDefineNode(defineNode);
                if (result == null) result = caseNode(defineNode);
                if (result == null) result = caseAnnotatable(defineNode);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCChartsPackage.OUTPUT_NODE: {
                OutputNode outputNode = (OutputNode)theEObject;
                T result = caseOutputNode(outputNode);
                if (result == null) result = caseNode(outputNode);
                if (result == null) result = caseAnnotatable(outputNode);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCChartsPackage.DATAFLOW: {
                Dataflow dataflow = (Dataflow)theEObject;
                T result = caseDataflow(dataflow);
                if (result == null) result = caseConcurrency(dataflow);
                if (result == null) result = caseScope(dataflow);
                if (result == null) result = caseAnnotatable(dataflow);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCChartsPackage.SENDER: {
                Sender sender = (Sender)theEObject;
                T result = caseSender(sender);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCChartsPackage.RECEIVER: {
                Receiver receiver = (Receiver)theEObject;
                T result = caseReceiver(receiver);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCChartsPackage.TEST_SENDER: {
                TestSender testSender = (TestSender)theEObject;
                T result = caseTestSender(testSender);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCChartsPackage.TEST_RECEIVER: {
                TestReceiver testReceiver = (TestReceiver)theEObject;
                T result = caseTestReceiver(testReceiver);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCChartsPackage.BINDING: {
                Binding binding = (Binding)theEObject;
                T result = caseBinding(binding);
                if (result == null) result = caseAnnotatable(binding);
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
            case SCChartsPackage.SCOPE: {
                Scope scope = (Scope)theEObject;
                T result = caseScope(scope);
                if (result == null) result = caseAnnotatable(scope);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCChartsPackage.TEXT_EFFECT: {
                TextEffect textEffect = (TextEffect)theEObject;
                T result = caseTextEffect(textEffect);
                if (result == null) result = caseTextExpression(textEffect);
                if (result == null) result = caseEffect(textEffect);
                if (result == null) result = caseExpression(textEffect);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SCChartsPackage.FUNCTION_CALL_EFFECT: {
                FunctionCallEffect functionCallEffect = (FunctionCallEffect)theEObject;
                T result = caseFunctionCallEffect(functionCallEffect);
                if (result == null) result = caseFunctionCall(functionCallEffect);
                if (result == null) result = caseEffect(functionCallEffect);
                if (result == null) result = caseExpression(functionCallEffect);
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
            case SCChartsPackage.FOR: {
                For for_ = (For)theEObject;
                T result = caseFor(for_);
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
     * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNode(Node object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Input Node</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Input Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInputNode(InputNode object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Referenced Node</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Referenced Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReferencedNode(ReferencedNode object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Test Reference Node</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Test Reference Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTestReferenceNode(TestReferenceNode object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Call Node</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Call Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCallNode(CallNode object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dataflow Feature</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dataflow Feature</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataflowFeature(DataflowFeature object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Define Node</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Define Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDefineNode(DefineNode object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Output Node</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Output Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOutputNode(OutputNode object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dataflow</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dataflow</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataflow(Dataflow object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sender</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sender</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSender(Sender object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Receiver</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Receiver</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReceiver(Receiver object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Test Sender</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Test Sender</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTestSender(TestSender object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Test Receiver</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Test Receiver</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTestReceiver(TestReceiver object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Binding</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Binding</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBinding(Binding object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Concurrency</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Concurrency</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConcurrency(Concurrency object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Text Effect</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Text Effect</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTextEffect(TextEffect object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Function Call Effect</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Function Call Effect</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFunctionCallEffect(FunctionCallEffect object) {
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
     * Returns the result of interpreting the object as an instance of '<em>For</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>For</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFor(For object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Text Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Text Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTextExpression(TextExpression object) {
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
    public T caseFunctionCall(FunctionCall object) {
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
