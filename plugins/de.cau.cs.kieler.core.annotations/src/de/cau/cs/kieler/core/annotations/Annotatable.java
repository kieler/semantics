/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.core.annotations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotatable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.core.annotations.Annotatable#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.core.annotations.AnnotationsPackage#getAnnotatable()
 * @model abstract="true"
 * @generated
 */
public interface Annotatable extends EObject {
    /**
     * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.core.annotations.Annotation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Annotations</em>' containment reference list.
     * @see de.cau.cs.kieler.core.annotations.AnnotationsPackage#getAnnotatable_Annotations()
     * @model containment="true"
     * @generated
     */
    EList<Annotation> getAnnotations();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Search an Annotation object for this Annotatable with the given String name.
     * 
     * @param name the name of the Annotation, does not need to be unique
     * @returns the first Annotation that matches the name
     * <!-- end-model-doc -->
     * @model required="true"
     * @generated
     */
    Annotation getAnnotation(String name);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Search all Annotation objects for this Annotatable with the given String name.
     * 
     * @param name the name of the Annotations, does not need to be unique
     * @returns a list of all Annotations that match the name
     * <!-- end-model-doc -->
     * @model required="true" many="false"
     * @generated
     */
    EList<Annotation> getAllAnnotations(String name);

} // Annotatable
