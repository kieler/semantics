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
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link scg.Assignment#getNext <em>Next</em>}</li>
 *   <li>{@link scg.Assignment#getAssignment <em>Assignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see scg.ScgPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends Node {
    /**
     * Returns the value of the '<em><b>Next</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Next</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Next</em>' containment reference.
     * @see #setNext(Link)
     * @see scg.ScgPackage#getAssignment_Next()
     * @model containment="true"
     * @generated
     */
    Link getNext();

    /**
     * Sets the value of the '{@link scg.Assignment#getNext <em>Next</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Next</em>' containment reference.
     * @see #getNext()
     * @generated
     */
    void setNext(Link value);

    /**
     * Returns the value of the '<em><b>Assignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Assignment</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Assignment</em>' attribute.
     * @see #setAssignment(String)
     * @see scg.ScgPackage#getAssignment_Assignment()
     * @model
     * @generated
     */
    String getAssignment();

    /**
     * Sets the value of the '{@link scg.Assignment#getAssignment <em>Assignment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Assignment</em>' attribute.
     * @see #getAssignment()
     * @generated
     */
    void setAssignment(String value);

} // Assignment
