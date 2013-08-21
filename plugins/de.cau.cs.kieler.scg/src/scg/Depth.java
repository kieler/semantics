/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package scg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Depth</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link scg.Depth#getSurface <em>Surface</em>}</li>
 *   <li>{@link scg.Depth#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see scg.ScgPackage#getDepth()
 * @model
 * @generated
 */
public interface Depth extends Node {
    /**
     * Returns the value of the '<em><b>Surface</b></em>' reference.
     * It is bidirectional and its opposite is '{@link scg.Surface#getDepth <em>Depth</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Surface</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Surface</em>' reference.
     * @see #setSurface(Surface)
     * @see scg.ScgPackage#getDepth_Surface()
     * @see scg.Surface#getDepth
     * @model opposite="depth" required="true"
     * @generated
     */
    Surface getSurface();

    /**
     * Sets the value of the '{@link scg.Depth#getSurface <em>Surface</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Surface</em>' reference.
     * @see #getSurface()
     * @generated
     */
    void setSurface(Surface value);

    /**
     * Returns the value of the '<em><b>Next</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Next</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Next</em>' reference.
     * @see #setNext(Link)
     * @see scg.ScgPackage#getDepth_Next()
     * @model
     * @generated
     */
    Link getNext();

    /**
     * Sets the value of the '{@link scg.Depth#getNext <em>Next</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Next</em>' reference.
     * @see #getNext()
     * @generated
     */
    void setNext(Link value);

} // Depth
