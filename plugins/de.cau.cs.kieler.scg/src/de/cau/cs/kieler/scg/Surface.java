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
package de.cau.cs.kieler.scg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Surface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scg.Surface#getDepth <em>Depth</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.scg.ScgPackage#getSurface()
 * @model
 * @generated
 */
public interface Surface extends Node {
    /**
	 * Returns the value of the '<em><b>Depth</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.scg.Depth#getSurface <em>Surface</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Depth</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Depth</em>' reference.
	 * @see #setDepth(Depth)
	 * @see de.cau.cs.kieler.scg.ScgPackage#getSurface_Depth()
	 * @see de.cau.cs.kieler.scg.Depth#getSurface
	 * @model opposite="surface" required="true"
	 * @generated
	 */
    Depth getDepth();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.scg.Surface#getDepth <em>Depth</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth</em>' reference.
	 * @see #getDepth()
	 * @generated
	 */
    void setDepth(Depth value);

} // Surface
