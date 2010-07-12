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
 * A representation of the model object '<em><b>Reclassify Object Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reclassify object action is an action that changes which classifiers classify an object.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.ReclassifyObjectAction#isIsReplaceAll <em>Is Replace All</em>}</li>
 *   <li>{@link uml.ReclassifyObjectAction#getOldClassifier <em>Old Classifier</em>}</li>
 *   <li>{@link uml.ReclassifyObjectAction#getNewClassifier <em>New Classifier</em>}</li>
 *   <li>{@link uml.ReclassifyObjectAction#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getReclassifyObjectAction()
 * @model
 * @generated
 */
public interface ReclassifyObjectAction extends Action {
    /**
     * Returns the value of the '<em><b>Is Replace All</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specifies whether existing classifiers should be removed before adding the new classifiers.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Is Replace All</em>' attribute.
     * @see #setIsReplaceAll(boolean)
     * @see uml.UmlPackage#getReclassifyObjectAction_IsReplaceAll()
     * @model default="false" dataType="uml.Boolean" required="true" ordered="false"
     * @generated
     */
    boolean isIsReplaceAll();

    /**
     * Sets the value of the '{@link uml.ReclassifyObjectAction#isIsReplaceAll <em>Is Replace All</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Replace All</em>' attribute.
     * @see #isIsReplaceAll()
     * @generated
     */
    void setIsReplaceAll(boolean value);

    /**
     * Returns the value of the '<em><b>Old Classifier</b></em>' reference list.
     * The list contents are of type {@link uml.Classifier}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A set of classifiers to be removed from the classifiers of the object.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Old Classifier</em>' reference list.
     * @see uml.UmlPackage#getReclassifyObjectAction_OldClassifier()
     * @model ordered="false"
     * @generated
     */
    EList<Classifier> getOldClassifier();

    /**
     * Returns the value of the '<em><b>New Classifier</b></em>' reference list.
     * The list contents are of type {@link uml.Classifier}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A set of classifiers to be added to the classifiers of the object.
     * <!-- end-model-doc -->
     * @return the value of the '<em>New Classifier</em>' reference list.
     * @see uml.UmlPackage#getReclassifyObjectAction_NewClassifier()
     * @model ordered="false"
     * @generated
     */
    EList<Classifier> getNewClassifier();

    /**
     * Returns the value of the '<em><b>Object</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Holds the object to be reclassified.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Object</em>' containment reference.
     * @see #setObject(InputPin)
     * @see uml.UmlPackage#getReclassifyObjectAction_Object()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    InputPin getObject();

    /**
     * Sets the value of the '{@link uml.ReclassifyObjectAction#getObject <em>Object</em>}' containment reference.
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
     * None of the new classifiers may be abstract.
     * not self.newClassifier->exists(isAbstract = true)
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean classifier_not_abstract(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The multiplicity of the input pin is 1..1.
     * self.argument.multiplicity.is(1,1)
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
     * The input pin has no type.
     * self.argument.type->size() = 0
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean input_pin(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ReclassifyObjectAction
