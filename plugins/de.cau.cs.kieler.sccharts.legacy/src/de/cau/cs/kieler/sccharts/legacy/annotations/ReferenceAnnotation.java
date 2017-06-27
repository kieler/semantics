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
package de.cau.cs.kieler.sccharts.legacy.annotations;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ReferenceAnnotation carries a reference to an arbitrary EObject.
 * By this any EObject can be referenced from an Annotation. The distinction
 * to the ContainmentAnnotation is that the reference is only a pointer
 * to the EObject most probably in another resource.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.legacy.annotations.ReferenceAnnotation#getObject <em>Object</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.sccharts.legacy.annotations.AnnotationsPackage#getReferenceAnnotation()
 * @model
 * @generated
 */
public interface ReferenceAnnotation extends Annotation {
    /**
     * Returns the value of the '<em><b>Object</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Object</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Object</em>' reference.
     * @see #setObject(EObject)
     * @see de.cau.cs.kieler.sccharts.legacy.annotations.AnnotationsPackage#getReferenceAnnotation_Object()
     * @model required="true"
     * @generated
     */
    EObject getObject();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.sccharts.legacy.annotations.ReferenceAnnotation#getObject <em>Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Object</em>' reference.
     * @see #getObject()
     * @generated
     */
    void setObject(EObject value);

} // ReferenceAnnotation
