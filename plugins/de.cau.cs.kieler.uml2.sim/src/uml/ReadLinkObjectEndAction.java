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
 * A representation of the model object '<em><b>Read Link Object End Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A read link object end action is an action that retrieves an end object from a link object.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.ReadLinkObjectEndAction#getObject <em>Object</em>}</li>
 *   <li>{@link uml.ReadLinkObjectEndAction#getEnd <em>End</em>}</li>
 *   <li>{@link uml.ReadLinkObjectEndAction#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getReadLinkObjectEndAction()
 * @model
 * @generated
 */
public interface ReadLinkObjectEndAction extends Action {
    /**
     * Returns the value of the '<em><b>Object</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gives the input pin from which the link object is obtained.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Object</em>' containment reference.
     * @see #setObject(InputPin)
     * @see uml.UmlPackage#getReadLinkObjectEndAction_Object()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    InputPin getObject();

    /**
     * Sets the value of the '{@link uml.ReadLinkObjectEndAction#getObject <em>Object</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Object</em>' containment reference.
     * @see #getObject()
     * @generated
     */
    void setObject(InputPin value);

    /**
     * Returns the value of the '<em><b>End</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Link end to be read.
     * <!-- end-model-doc -->
     * @return the value of the '<em>End</em>' reference.
     * @see #setEnd(Property)
     * @see uml.UmlPackage#getReadLinkObjectEndAction_End()
     * @model required="true" ordered="false"
     * @generated
     */
    Property getEnd();

    /**
     * Sets the value of the '{@link uml.ReadLinkObjectEndAction#getEnd <em>End</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>End</em>' reference.
     * @see #getEnd()
     * @generated
     */
    void setEnd(Property value);

    /**
     * Returns the value of the '<em><b>Result</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Pin where the result value is placed.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Result</em>' containment reference.
     * @see #setResult(OutputPin)
     * @see uml.UmlPackage#getReadLinkObjectEndAction_Result()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    OutputPin getResult();

    /**
     * Sets the value of the '{@link uml.ReadLinkObjectEndAction#getResult <em>Result</em>}' containment reference.
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
     * The property must be an association end.
     * self.end.association.notEmpty()
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean property(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The association of the association end must be an association class.
     * self.end.Association.oclIsKindOf(AssociationClass)
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean association_of_association(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The ends of the association must not be static.
     * self.end.association.memberEnd->forall(e | not e.isStatic)
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean ends_of_association(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The type of the object input pin is the association class that owns the association end.
     * self.object.type = self.end.association
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
     * The multiplicity of the object input pin is 1..1.
     * self.object.multiplicity.is(1,1)
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
     * The type of the result output pin is the same as the type of the association end.
     * self.result.type = self.end.type
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean type_of_result(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The multiplicity of the result output pin is 1..1.
     * self.result.multiplicity.is(1,1)
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean multiplicity_of_result(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ReadLinkObjectEndAction
