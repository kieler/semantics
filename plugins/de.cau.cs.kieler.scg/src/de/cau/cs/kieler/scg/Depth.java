/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Depth</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scg.Depth#getSurface <em>Surface</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.Depth#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.scg.ScgPackage#getDepth()
 * @model
 * @generated
 */
public interface Depth extends Node {
    /**
	 * Returns the value of the '<em><b>Surface</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.scg.Surface#getDepth <em>Depth</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Surface</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Surface</em>' reference.
	 * @see #setSurface(Surface)
	 * @see de.cau.cs.kieler.scg.ScgPackage#getDepth_Surface()
	 * @see de.cau.cs.kieler.scg.Surface#getDepth
	 * @model opposite="depth" required="true"
	 * @generated
	 */
    Surface getSurface();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.scg.Depth#getSurface <em>Surface</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surface</em>' reference.
	 * @see #getSurface()
	 * @generated
	 */
    void setSurface(Surface value);

    /**
	 * Returns the value of the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Next</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' containment reference.
	 * @see #setNext(ControlFlow)
	 * @see de.cau.cs.kieler.scg.ScgPackage#getDepth_Next()
	 * @model containment="true"
	 * @generated
	 */
    ControlFlow getNext();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.scg.Depth#getNext <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' containment reference.
	 * @see #getNext()
	 * @generated
	 */
    void setNext(ControlFlow value);

} // Depth
