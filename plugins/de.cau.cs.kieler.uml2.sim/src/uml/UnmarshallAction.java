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
 * A representation of the model object '<em><b>Unmarshall Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An unmarshall action is an action that breaks an object of a known type into outputs each of which is equal to a value from a structural feature of the object.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.UnmarshallAction#getResult <em>Result</em>}</li>
 *   <li>{@link uml.UnmarshallAction#getUnmarshallType <em>Unmarshall Type</em>}</li>
 *   <li>{@link uml.UnmarshallAction#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getUnmarshallAction()
 * @model
 * @generated
 */
public interface UnmarshallAction extends Action {
    /**
     * Returns the value of the '<em><b>Result</b></em>' containment reference list.
     * The list contents are of type {@link uml.OutputPin}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The values of the structural features of the input object.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Result</em>' containment reference list.
     * @see uml.UmlPackage#getUnmarshallAction_Result()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    EList<OutputPin> getResult();

    /**
     * Returns the value of the '<em><b>Unmarshall Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The type of the object to be unmarshalled.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Unmarshall Type</em>' reference.
     * @see #setUnmarshallType(Classifier)
     * @see uml.UmlPackage#getUnmarshallAction_UnmarshallType()
     * @model required="true" ordered="false"
     * @generated
     */
    Classifier getUnmarshallType();

    /**
     * Sets the value of the '{@link uml.UnmarshallAction#getUnmarshallType <em>Unmarshall Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unmarshall Type</em>' reference.
     * @see #getUnmarshallType()
     * @generated
     */
    void setUnmarshallType(Classifier value);

    /**
     * Returns the value of the '<em><b>Object</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The object to be unmarshalled.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Object</em>' containment reference.
     * @see #setObject(InputPin)
     * @see uml.UmlPackage#getUnmarshallAction_Object()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    InputPin getObject();

    /**
     * Sets the value of the '{@link uml.UnmarshallAction#getObject <em>Object</em>}' containment reference.
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
     * The type of the object input pin must be the same as the unmarshall classifier.
     * true
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
     * The multiplicity of the object input pin is 1..1
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
     * The number of result output pins must be the same as the number of structural features of the unmarshall classifier.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean number_of_result(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The type and ordering of each result output pin must be the same as the corresponding structural feature of the unmarshall classifier.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean type_and_ordering(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The multiplicity of each result output pin must be compatible with the multiplicity of the corresponding structural features of the unmarshall classifier.
     * 
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean multiplicity_of_result(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The unmarshall classifier must have at least one structural feature.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean structural_feature(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * unmarshallType must be a Classifier with ordered attributes
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean unmarshallType_is_classifier(DiagnosticChain diagnostics, Map<Object, Object> context);

} // UnmarshallAction
