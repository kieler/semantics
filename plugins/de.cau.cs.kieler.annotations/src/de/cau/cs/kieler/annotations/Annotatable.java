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
package de.cau.cs.kieler.annotations;

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
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.annotations.Annotatable#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.annotations.AnnotationsPackage#getAnnotatable()
 * @model abstract="true"
 * @generated
 */
public interface Annotatable extends EObject {
    /**
     * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.annotations.Annotation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Annotations</em>' containment reference list.
     * @see de.cau.cs.kieler.annotations.AnnotationsPackage#getAnnotatable_Annotations()
     * @model containment="true"
     * @generated
     */
    EList<Annotation> getAnnotations();

} // Annotatable
