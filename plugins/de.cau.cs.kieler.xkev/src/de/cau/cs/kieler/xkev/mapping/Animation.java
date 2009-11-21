/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.xkev.mapping;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Animation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.Animation#getAccessID <em>Access ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.xkev.mapping.MappingPackage#getAnimation()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Animation extends EObject {
    /**
     * Returns the value of the '<em><b>Access ID</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Access ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Access ID</em>' attribute.
     * @see #setAccessID(String)
     * @see de.cau.cs.kieler.xkev.mapping.MappingPackage#getAnimation_AccessID()
     * @model default=""
     * @generated
     */
    String getAccessID();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.xkev.mapping.Animation#getAccessID <em>Access ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Access ID</em>' attribute.
     * @see #getAccessID()
     * @generated
     */
    void setAccessID(String value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    void applyAnimation();

} // Animation
