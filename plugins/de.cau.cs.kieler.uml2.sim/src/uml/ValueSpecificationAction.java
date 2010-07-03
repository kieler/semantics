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
 * A representation of the model object '<em><b>Value Specification Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A value specification action is an action that evaluates a value specification.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.ValueSpecificationAction#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getValueSpecificationAction()
 * @model
 * @generated
 */
public interface ValueSpecificationAction extends Action {
    /**
     * Returns the value of the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Value specification to be evaluated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Value</em>' containment reference.
     * @see #setValue(ValueSpecification)
     * @see uml.UmlPackage#getValueSpecificationAction_Value()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    ValueSpecification getValue();

    /**
     * Sets the value of the '{@link uml.ValueSpecificationAction#getValue <em>Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' containment reference.
     * @see #getValue()
     * @generated
     */
    void setValue(ValueSpecification value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The type of value specification must be compatible with the type of the result pin.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean compatible_type(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The multiplicity of the result pin is 1..1
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean multiplicity(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ValueSpecificationAction
