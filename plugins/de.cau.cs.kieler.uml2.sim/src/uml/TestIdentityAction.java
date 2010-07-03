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
 * A representation of the model object '<em><b>Test Identity Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A test identity action is an action that tests if two values are identical objects.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.TestIdentityAction#getFirst <em>First</em>}</li>
 *   <li>{@link uml.TestIdentityAction#getSecond <em>Second</em>}</li>
 *   <li>{@link uml.TestIdentityAction#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getTestIdentityAction()
 * @model
 * @generated
 */
public interface TestIdentityAction extends Action {
    /**
     * Returns the value of the '<em><b>First</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gives the pin on which an object is placed.
     * <!-- end-model-doc -->
     * @return the value of the '<em>First</em>' containment reference.
     * @see #setFirst(InputPin)
     * @see uml.UmlPackage#getTestIdentityAction_First()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    InputPin getFirst();

    /**
     * Sets the value of the '{@link uml.TestIdentityAction#getFirst <em>First</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>First</em>' containment reference.
     * @see #getFirst()
     * @generated
     */
    void setFirst(InputPin value);

    /**
     * Returns the value of the '<em><b>Second</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gives the pin on which an object is placed.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Second</em>' containment reference.
     * @see #setSecond(InputPin)
     * @see uml.UmlPackage#getTestIdentityAction_Second()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    InputPin getSecond();

    /**
     * Sets the value of the '{@link uml.TestIdentityAction#getSecond <em>Second</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Second</em>' containment reference.
     * @see #getSecond()
     * @generated
     */
    void setSecond(InputPin value);

    /**
     * Returns the value of the '<em><b>Result</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Tells whether the two input objects are identical.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Result</em>' containment reference.
     * @see #setResult(OutputPin)
     * @see uml.UmlPackage#getTestIdentityAction_Result()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    OutputPin getResult();

    /**
     * Sets the value of the '{@link uml.TestIdentityAction#getResult <em>Result</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Result</em>' containment reference.
     * @see #getResult()
     * @generated
     */
    void setResult(OutputPin value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The input pins have no type.
     * self.first.type->size() = 0
     * and self.second.type->size() = 0
     * 
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean no_type(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The multiplicity of the input pins is 1..1.
     * self.first.multiplicity.is(1,1)
     * and self.second.multiplicity.is(1,1)
     * 
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean multiplicity(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The type of the result is Boolean.
     * self.result.type.oclIsTypeOf(Boolean)
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean result_is_boolean(DiagnosticChain diagnostics, Map<Object, Object> context);

} // TestIdentityAction
