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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Containment Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ContainmentAnnotation carries an arbitrary EObject.
 * By this any EObject can be attached as Annotation to an Annotatable.
 * The EObject will be persistently stored together with the
 * Annotatable as its child in the Annotation. Hence it also gets serialized
 * into a file when the model gets saved. Therefore here an EObject is used
 * and not any Object, because an EObject can be serialized with EMF.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.core.annotations.ContainmentAnnotation#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.core.annotations.AnnotationsPackage#getContainmentAnnotation()
 * @model
 * @generated
 */
public interface ContainmentAnnotation extends Annotation {
    /**
     * Returns the value of the '<em><b>Object</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Object</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Object</em>' containment reference.
     * @see #setObject(EObject)
     * @see de.cau.cs.kieler.core.annotations.AnnotationsPackage#getContainmentAnnotation_Object()
     * @model containment="true" required="true"
     * @generated
     */
    EObject getObject();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.core.annotations.ContainmentAnnotation#getObject <em>Object</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Object</em>' containment reference.
     * @see #getObject()
     * @generated
     */
    void setObject(EObject value);

} // ContainmentAnnotation
