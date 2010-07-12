/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Object Behavior Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * StartObjectBehaviorAction is an action that starts the execution either of a directly instantiated behavior or of the classifier behavior of an object. Argument values may be supplied for the input parameters of the behavior. If the behavior is invoked synchronously, then output values may be obtained for output parameters.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.StartObjectBehaviorAction#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getStartObjectBehaviorAction()
 * @model
 * @generated
 */
public interface StartObjectBehaviorAction extends CallAction {
    /**
     * Returns the value of the '<em><b>Object</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Holds the object which is either a behavior to be started or has a classifier behavior to be started.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Object</em>' containment reference.
     * @see #setObject(InputPin)
     * @see uml.UmlPackage#getStartObjectBehaviorAction_Object()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    InputPin getObject();

    /**
     * Sets the value of the '{@link uml.StartObjectBehaviorAction#getObject <em>Object</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Object</em>' containment reference.
     * @see #getObject()
     * @generated
     */
    void setObject(InputPin value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The type of the object input pin must be either a Behavior or a BehavioredClassifier with a classifier behavior.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean type_of_object(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The multiplicity of the object input pin must be [1..1].
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean multiplicity_of_object(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The number and order of the argument pins must be the same as the number and order of the in and in-out parameters of the invoked behavior. Pins are matched to parameters by order.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean number_order_arguments(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The number and order of result pins must be the same as the number and order of the in-out, out and return parameters of the invoked behavior. Pins are matched to parameters by order.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean number_order_results(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The type, ordering, and multiplicity of an argument or result pin must be the same as the corresponding parameter of the behavior.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean type_ordering_multiplicity_match(DiagnosticChain diagnostics, Map<Object, Object> context);

} // StartObjectBehaviorAction
