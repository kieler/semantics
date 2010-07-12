/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A conditional node is a structured activity node that represents an exclusive choice among some number of alternatives.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.ConditionalNode#isIsDeterminate <em>Is Determinate</em>}</li>
 *   <li>{@link uml.ConditionalNode#isIsAssured <em>Is Assured</em>}</li>
 *   <li>{@link uml.ConditionalNode#getClause <em>Clause</em>}</li>
 *   <li>{@link uml.ConditionalNode#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getConditionalNode()
 * @model
 * @generated
 */
public interface ConditionalNode extends StructuredActivityNode {
    /**
     * Returns the value of the '<em><b>Is Determinate</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * If true, the modeler asserts that at most one test will succeed.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Is Determinate</em>' attribute.
     * @see #setIsDeterminate(boolean)
     * @see uml.UmlPackage#getConditionalNode_IsDeterminate()
     * @model default="false" dataType="uml.Boolean" required="true" ordered="false"
     * @generated
     */
    boolean isIsDeterminate();

    /**
     * Sets the value of the '{@link uml.ConditionalNode#isIsDeterminate <em>Is Determinate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Determinate</em>' attribute.
     * @see #isIsDeterminate()
     * @generated
     */
    void setIsDeterminate(boolean value);

    /**
     * Returns the value of the '<em><b>Is Assured</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * If true, the modeler asserts that at least one test will succeed.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Is Assured</em>' attribute.
     * @see #setIsAssured(boolean)
     * @see uml.UmlPackage#getConditionalNode_IsAssured()
     * @model default="false" dataType="uml.Boolean" required="true" ordered="false"
     * @generated
     */
    boolean isIsAssured();

    /**
     * Sets the value of the '{@link uml.ConditionalNode#isIsAssured <em>Is Assured</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Assured</em>' attribute.
     * @see #isIsAssured()
     * @generated
     */
    void setIsAssured(boolean value);

    /**
     * Returns the value of the '<em><b>Clause</b></em>' containment reference list.
     * The list contents are of type {@link uml.Clause}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Set of clauses composing the conditional.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Clause</em>' containment reference list.
     * @see uml.UmlPackage#getConditionalNode_Clause()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    EList<Clause> getClause();

    /**
     * Returns the value of the '<em><b>Result</b></em>' containment reference list.
     * The list contents are of type {@link uml.OutputPin}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A list of output pins that constitute the data flow outputs of the conditional.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Result</em>' containment reference list.
     * @see uml.UmlPackage#getConditionalNode_Result()
     * @model containment="true"
     * @generated
     */
    EList<OutputPin> getResult();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The result output pins have no incoming edges.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean result_no_incoming(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ConditionalNode
