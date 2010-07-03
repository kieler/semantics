/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Realization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An interface realization is a specialized realization relationship between a classifier and an interface. This relationship signifies that the realizing classifier conforms to the contract specified by the interface.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.InterfaceRealization#getContract <em>Contract</em>}</li>
 *   <li>{@link uml.InterfaceRealization#getImplementingClassifier <em>Implementing Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getInterfaceRealization()
 * @model
 * @generated
 */
public interface InterfaceRealization extends Realization {
    /**
     * Returns the value of the '<em><b>Contract</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * References the Interface specifying the conformance contract.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Contract</em>' reference.
     * @see #setContract(Interface)
     * @see uml.UmlPackage#getInterfaceRealization_Contract()
     * @model required="true" ordered="false"
     * @generated
     */
    Interface getContract();

    /**
     * Sets the value of the '{@link uml.InterfaceRealization#getContract <em>Contract</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Contract</em>' reference.
     * @see #getContract()
     * @generated
     */
    void setContract(Interface value);

    /**
     * Returns the value of the '<em><b>Implementing Classifier</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link uml.BehavioredClassifier#getInterfaceRealization <em>Interface Realization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * References the BehavioredClassifier that owns this Interfacerealization (i.e., the classifier that realizes the Interface to which it points).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Implementing Classifier</em>' container reference.
     * @see #setImplementingClassifier(BehavioredClassifier)
     * @see uml.UmlPackage#getInterfaceRealization_ImplementingClassifier()
     * @see uml.BehavioredClassifier#getInterfaceRealization
     * @model opposite="interfaceRealization" required="true" transient="false" ordered="false"
     * @generated
     */
    BehavioredClassifier getImplementingClassifier();

    /**
     * Sets the value of the '{@link uml.InterfaceRealization#getImplementingClassifier <em>Implementing Classifier</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Implementing Classifier</em>' container reference.
     * @see #getImplementingClassifier()
     * @generated
     */
    void setImplementingClassifier(BehavioredClassifier value);

} // InterfaceRealization
