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
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An interface is a kind of classifier that represents a declaration of a set of coherent public features and obligations. An interface specifies a contract; any instance of a classifier that realizes the interface must fulfill that contract. The obligations that may be associated with an interface are in the form of various kinds of constraints (such as pre- and post-conditions) or protocol specifications, which may impose ordering restrictions on interactions through the interface.
 * Interfaces may include receptions (in addition to operations).
 * Since an interface specifies conformance characteristics, it does not own detailed behavior specifications. Instead, interfaces may own a protocol state machine that specifies event sequences and pre/post conditions for the operations and receptions described by the interface.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.Interface#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link uml.Interface#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link uml.Interface#getNestedClassifier <em>Nested Classifier</em>}</li>
 *   <li>{@link uml.Interface#getRedefinedInterface <em>Redefined Interface</em>}</li>
 *   <li>{@link uml.Interface#getOwnedReception <em>Owned Reception</em>}</li>
 *   <li>{@link uml.Interface#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends Classifier {
    /**
     * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
     * The list contents are of type {@link uml.Property}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The attributes (i.e. the properties) owned by the class.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Owned Attribute</em>' containment reference list.
     * @see uml.UmlPackage#getInterface_OwnedAttribute()
     * @model containment="true"
     * @generated
     */
    EList<Property> getOwnedAttribute();

    /**
     * Returns the value of the '<em><b>Owned Operation</b></em>' containment reference list.
     * The list contents are of type {@link uml.Operation}.
     * It is bidirectional and its opposite is '{@link uml.Operation#getInterface <em>Interface</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The operations owned by the class.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Owned Operation</em>' containment reference list.
     * @see uml.UmlPackage#getInterface_OwnedOperation()
     * @see uml.Operation#getInterface
     * @model opposite="interface" containment="true"
     * @generated
     */
    EList<Operation> getOwnedOperation();

    /**
     * Returns the value of the '<em><b>Nested Classifier</b></em>' containment reference list.
     * The list contents are of type {@link uml.Classifier}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * References all the Classifiers that are defined (nested) within the Class.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Nested Classifier</em>' containment reference list.
     * @see uml.UmlPackage#getInterface_NestedClassifier()
     * @model containment="true"
     * @generated
     */
    EList<Classifier> getNestedClassifier();

    /**
     * Returns the value of the '<em><b>Redefined Interface</b></em>' reference list.
     * The list contents are of type {@link uml.Interface}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * References all the Interfaces redefined by this Interface.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Redefined Interface</em>' reference list.
     * @see uml.UmlPackage#getInterface_RedefinedInterface()
     * @model ordered="false"
     * @generated
     */
    EList<Interface> getRedefinedInterface();

    /**
     * Returns the value of the '<em><b>Owned Reception</b></em>' containment reference list.
     * The list contents are of type {@link uml.Reception}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Receptions that objects providing this interface are willing to accept.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Owned Reception</em>' containment reference list.
     * @see uml.UmlPackage#getInterface_OwnedReception()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<Reception> getOwnedReception();

    /**
     * Returns the value of the '<em><b>Protocol</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * References a protocol state machine specifying the legal sequences of the invocation of the behavioral features described in the interface.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Protocol</em>' containment reference.
     * @see #setProtocol(ProtocolStateMachine)
     * @see uml.UmlPackage#getInterface_Protocol()
     * @model containment="true" ordered="false"
     * @generated
     */
    ProtocolStateMachine getProtocol();

    /**
     * Sets the value of the '{@link uml.Interface#getProtocol <em>Protocol</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Protocol</em>' containment reference.
     * @see #getProtocol()
     * @generated
     */
    void setProtocol(ProtocolStateMachine value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The visibility of all features owned by an interface must be public.
     * self.feature->forAll(f | f.visibility = #public)
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean visibility(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Creates an operation with the specified name, parameter names, parameter types, and return type (or null) as an owned operation of this interface.
     * @param name The name for the new operation, or null.
     * @param parameterNames The parameter names for the new operation, or null.
     * @param parameterTypes The parameter types for the new operation, or null.
     * @param returnType The return type for the new operation, or null.
     * <!-- end-model-doc -->
     * @model required="true" ordered="false" nameDataType="uml.String" nameOrdered="false" parameterNamesDataType="uml.String" parameterNamesMany="true" parameterNamesOrdered="false" parameterTypesMany="true" parameterTypesOrdered="false" returnTypeOrdered="false"
     * @generated
     */
    Operation createOwnedOperation(String name, EList<String> parameterNames, EList<Type> parameterTypes, Type returnType);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Creates a property with the specified name, type, lower bound, and upper bound as an owned attribute of this interface.
     * @param name The name for the new attribute, or null.
     * @param type The type for the new attribute, or null.
     * @param lower The lower bound for the new attribute.
     * @param upper The upper bound for the new attribute.
     * <!-- end-model-doc -->
     * @model required="true" ordered="false" nameDataType="uml.String" nameOrdered="false" typeOrdered="false" lowerDataType="uml.Integer" lowerRequired="true" lowerOrdered="false" upperDataType="uml.UnlimitedNatural" upperRequired="true" upperOrdered="false"
     * @generated
     */
    Property createOwnedAttribute(String name, Type type, int lower, int upper);

} // Interface
