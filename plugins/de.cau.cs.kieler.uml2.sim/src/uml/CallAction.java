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
 * A representation of the model object '<em><b>Call Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CallAction is an abstract class for actions that invoke behavior and receive return values.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.CallAction#isIsSynchronous <em>Is Synchronous</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getCallAction()
 * @model abstract="true"
 * @generated
 */
public interface CallAction extends InvocationAction {
    /**
     * Returns the value of the '<em><b>Is Synchronous</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * If true, the call is synchronous and the caller waits for completion of the invoked behavior.
     * If false, the call is asynchronous and the caller proceeds immediately and does not expect a return values.
     * 
     * <!-- end-model-doc -->
     * @return the value of the '<em>Is Synchronous</em>' attribute.
     * @see #setIsSynchronous(boolean)
     * @see uml.UmlPackage#getCallAction_IsSynchronous()
     * @model default="true" dataType="uml.Boolean" required="true" ordered="false"
     * @generated
     */
    boolean isIsSynchronous();

    /**
     * Sets the value of the '{@link uml.CallAction#isIsSynchronous <em>Is Synchronous</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Synchronous</em>' attribute.
     * @see #isIsSynchronous()
     * @generated
     */
    void setIsSynchronous(boolean value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Only synchronous call actions can have result pins.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean synchronous_call(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The number and order of argument pins must be the same as the number and order of parameters of the invoked behavior or behavioral feature. Pins are matched to parameters by order.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean number_and_order(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The type, ordering, and multiplicity of an argument pin must be the same as the corresponding parameter of the behavior or behavioral feature.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean type_ordering_multiplicity(DiagnosticChain diagnostics, Map<Object, Object> context);

} // CallAction
