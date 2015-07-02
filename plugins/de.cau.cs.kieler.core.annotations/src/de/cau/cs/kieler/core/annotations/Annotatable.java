/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.annotations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotatable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Annotatable abstract class allows subclasses to be annotated by arbitrary information.
 * An Annotatable has a list of attached Annotation objects and defines convenience functions
 * to search annotations with a specific name.
 * <!-- end-model-doc -->
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
     * Search an annotation with the given name.
     * 
     * @param name the name of the annotation, does not need to be unique
     * @returns the first annotation that matches the name
     * <!-- end-model-doc -->
     * @model required="true"
     * @generated
     */
    Annotation getAnnotation(String name);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Search all annotations with the given name.
     * 
     * @param name the name of the annotations, does not need to be unique
     * @returns a list of all annotations that match the name
     * <!-- end-model-doc -->
     * @model required="true" many="false"
     * @generated
     */
    EList<Annotation> getAllAnnotations(String name);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Remove all annotations with the given name.
     * 
     * @param name name of the annotations to remove
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    void removeAllAnnotations(String name);

} // Annotatable
