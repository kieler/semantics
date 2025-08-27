/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.kev.mapping;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SVG Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.SVGElement#getAnimation <em>Animation</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.SVGElement#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.kev.mapping.MappingPackage#getSVGElement()
 * @model
 * @generated
 */
public interface SVGElement extends EObject {
    /**
     * Returns the value of the '<em><b>Animation</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kev.mapping.Animation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>RunnableAnimation</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Animation</em>' containment reference list.
     * @see de.cau.cs.kieler.kev.mapping.MappingPackage#getSVGElement_Animation()
     * @model containment="true" required="true"
     * @generated
     */
    EList<Animation> getAnimation();

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see de.cau.cs.kieler.kev.mapping.MappingPackage#getSVGElement_Id()
     * @model required="true"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kev.mapping.SVGElement#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

} // SVGElement
