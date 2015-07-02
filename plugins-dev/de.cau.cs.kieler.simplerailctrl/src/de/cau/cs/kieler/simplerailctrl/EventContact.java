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
 * A representation of the model object '<em><b>Event Contact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.simplerailctrl.EventContact#getTrack <em>Track</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simplerailctrl.EventContact#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.simplerailctrl.SimplerailctrlPackage#getEventContact()
 * @model
 * @generated
 */
public interface EventContact extends Transition {
    /**
     * Returns the value of the '<em><b>Track</b></em>' attribute.
     * The literals are from the enumeration {@link de.cau.cs.kieler.simplerailctrl.TRACK}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Track</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Track</em>' attribute.
     * @see de.cau.cs.kieler.simplerailctrl.TRACK
     * @see #setTrack(TRACK)
     * @see de.cau.cs.kieler.simplerailctrl.SimplerailctrlPackage#getEventContact_Track()
     * @model
     * @generated
     */
    TRACK getTrack();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.simplerailctrl.EventContact#getTrack <em>Track</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Track</em>' attribute.
     * @see de.cau.cs.kieler.simplerailctrl.TRACK
     * @see #getTrack()
     * @generated
     */
    void setTrack(TRACK value);

    /**
     * Returns the value of the '<em><b>Position</b></em>' attribute.
     * The literals are from the enumeration {@link de.cau.cs.kieler.simplerailctrl.POSITION}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Position</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Position</em>' attribute.
     * @see de.cau.cs.kieler.simplerailctrl.POSITION
     * @see #setPosition(POSITION)
     * @see de.cau.cs.kieler.simplerailctrl.SimplerailctrlPackage#getEventContact_Position()
     * @model
     * @generated
     */
    POSITION getPosition();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.simplerailctrl.EventContact#getPosition <em>Position</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Position</em>' attribute.
     * @see de.cau.cs.kieler.simplerailctrl.POSITION
     * @see #getPosition()
     * @generated
     */
    void setPosition(POSITION value);

} // EventContact
