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
 * A representation of the model object '<em><b>Behaviored Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A behaviored classifier may have an interface realization.
 * A classifier can have behavior specifications defined in its namespace. One of these may specify the behavior of the classifier itself.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.BehavioredClassifier#getOwnedBehavior <em>Owned Behavior</em>}</li>
 *   <li>{@link uml.BehavioredClassifier#getClassifierBehavior <em>Classifier Behavior</em>}</li>
 *   <li>{@link uml.BehavioredClassifier#getInterfaceRealization <em>Interface Realization</em>}</li>
 *   <li>{@link uml.BehavioredClassifier#getOwnedTrigger <em>Owned Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getBehavioredClassifier()
 * @model abstract="true"
 * @generated
 */
public interface BehavioredClassifier extends Classifier {
    /**
     * Returns the value of the '<em><b>Owned Behavior</b></em>' containment reference list.
     * The list contents are of type {@link uml.Behavior}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * References behavior specifications owned by a classifier.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Owned Behavior</em>' containment reference list.
     * @see uml.UmlPackage#getBehavioredClassifier_OwnedBehavior()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<Behavior> getOwnedBehavior();

    /**
     * Returns the value of the '<em><b>Classifier Behavior</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A behavior specification that specifies the behavior of the classifier itself.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Classifier Behavior</em>' reference.
     * @see #setClassifierBehavior(Behavior)
     * @see uml.UmlPackage#getBehavioredClassifier_ClassifierBehavior()
     * @model ordered="false"
     * @generated
     */
    Behavior getClassifierBehavior();

    /**
     * Sets the value of the '{@link uml.BehavioredClassifier#getClassifierBehavior <em>Classifier Behavior</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Classifier Behavior</em>' reference.
     * @see #getClassifierBehavior()
     * @generated
     */
    void setClassifierBehavior(Behavior value);

    /**
     * Returns the value of the '<em><b>Interface Realization</b></em>' containment reference list.
     * The list contents are of type {@link uml.InterfaceRealization}.
     * It is bidirectional and its opposite is '{@link uml.InterfaceRealization#getImplementingClassifier <em>Implementing Classifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The set of InterfaceRealizations owned by the BehavioredClassifier. Interface realizations reference the Interfaces of which the BehavioredClassifier is an implementation.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Interface Realization</em>' containment reference list.
     * @see uml.UmlPackage#getBehavioredClassifier_InterfaceRealization()
     * @see uml.InterfaceRealization#getImplementingClassifier
     * @model opposite="implementingClassifier" containment="true" ordered="false"
     * @generated
     */
    EList<InterfaceRealization> getInterfaceRealization();

    /**
     * Returns the value of the '<em><b>Owned Trigger</b></em>' containment reference list.
     * The list contents are of type {@link uml.Trigger}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * References Trigger descriptions owned by a Classifier.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Owned Trigger</em>' containment reference list.
     * @see uml.UmlPackage#getBehavioredClassifier_OwnedTrigger()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<Trigger> getOwnedTrigger();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * If a behavior is classifier behavior, it does not have a specification.
     * self.classifierBehavior.notEmpty() implies self.specification.isEmpty()
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean class_behavior(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Retrieves the interfaces on which this behaviored classifier has an interface realization dependency.
     * <!-- end-model-doc -->
     * @model kind="operation" ordered="false"
     * @generated
     */
    EList<Interface> getImplementedInterfaces();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Retrieves all the interfaces on which this behaviored classifier or any of its parents has an interface realization dependency.
     * <!-- end-model-doc -->
     * @model kind="operation" ordered="false"
     * @generated
     */
    EList<Interface> getAllImplementedInterfaces();

} // BehavioredClassifier
