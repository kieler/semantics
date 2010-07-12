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
 * A representation of the model object '<em><b>Write Variable Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * WriteVariableAction is an abstract class for variable actions that change variable values.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.WriteVariableAction#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getWriteVariableAction()
 * @model abstract="true"
 * @generated
 */
public interface WriteVariableAction extends VariableAction {
    /**
     * Returns the value of the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Value to be added or removed from the variable.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Value</em>' containment reference.
     * @see #setValue(InputPin)
     * @see uml.UmlPackage#getWriteVariableAction_Value()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    InputPin getValue();

    /**
     * Sets the value of the '{@link uml.WriteVariableAction#getValue <em>Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' containment reference.
     * @see #getValue()
     * @generated
     */
    void setValue(InputPin value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The type input pin is the same as the type of the variable.
     * self.value.type = self.variable.type
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean same_type(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The multiplicity of the input pin is 1..1.
     * self.value.multiplicity.is(1,1)
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean multiplicity(DiagnosticChain diagnostics, Map<Object, Object> context);

} // WriteVariableAction
