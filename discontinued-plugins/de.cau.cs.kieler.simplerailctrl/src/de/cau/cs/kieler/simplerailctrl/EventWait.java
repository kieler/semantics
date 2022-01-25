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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Wait</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.simplerailctrl.EventWait#getSeconds <em>Seconds</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.simplerailctrl.SimplerailctrlPackage#getEventWait()
 * @model
 * @generated
 */
public interface EventWait extends Transition {
    /**
     * Returns the value of the '<em><b>Seconds</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Seconds</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Seconds</em>' attribute.
     * @see #setSeconds(int)
     * @see de.cau.cs.kieler.simplerailctrl.SimplerailctrlPackage#getEventWait_Seconds()
     * @model
     * @generated
     */
    int getSeconds();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.simplerailctrl.EventWait#getSeconds <em>Seconds</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Seconds</em>' attribute.
     * @see #getSeconds()
     * @generated
     */
    void setSeconds(int value);

} // EventWait
