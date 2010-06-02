/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.annotations;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.annotations.ReferenceAnnotation#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.annotations.AnnotationsPackage#getReferenceAnnotation()
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
     * @see de.cau.cs.kieler.annotations.AnnotationsPackage#getReferenceAnnotation_Object()
     * @model required="true"
     * @generated
     */
    EObject getObject();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.annotations.ReferenceAnnotation#getObject <em>Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Object</em>' reference.
     * @see #getObject()
     * @generated
     */
    void setObject(EObject value);

} // ReferenceAnnotation
