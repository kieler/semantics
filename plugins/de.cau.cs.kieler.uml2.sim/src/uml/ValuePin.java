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
 * A representation of the model object '<em><b>Value Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A value pin is an input pin that provides a value by evaluating a value specification.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.ValuePin#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getValuePin()
 * @model
 * @generated
 */
public interface ValuePin extends InputPin {
    /**
     * Returns the value of the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Value that the pin will provide.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Value</em>' containment reference.
     * @see #setValue(ValueSpecification)
     * @see uml.UmlPackage#getValuePin_Value()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    ValueSpecification getValue();

    /**
     * Sets the value of the '{@link uml.ValuePin#getValue <em>Value</em>}' containment reference.
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
     * The type of value specification must be compatible with the type of the value pin.
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
     * Value pins have no incoming edges.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean no_incoming_edges(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ValuePin
