/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.simplerailctrl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.simplerailctrl.Transition#getDestination <em>Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.simplerailctrl.SimplerailctrlPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
    /**
     * Returns the value of the '<em><b>Destination</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Destination</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Destination</em>' reference.
     * @see #setDestination(Node)
     * @see de.cau.cs.kieler.simplerailctrl.SimplerailctrlPackage#getTransition_Destination()
     * @model required="true"
     * @generated
     */
    Node getDestination();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.simplerailctrl.Transition#getDestination <em>Destination</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Destination</em>' reference.
     * @see #getDestination()
     * @generated
     */
    void setDestination(Node value);

} // Transition
