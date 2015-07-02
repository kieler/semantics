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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.simplerailctrl.SetSignal#getTrack <em>Track</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simplerailctrl.SetSignal#getPosition <em>Position</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simplerailctrl.SetSignal#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.simplerailctrl.SimplerailctrlPackage#getSetSignal()
 * @model
 * @generated
 */
public interface SetSignal extends Node {
    /**
     * Returns the value of the '<em><b>Track</b></em>' attribute list.
     * The list contents are of type {@link de.cau.cs.kieler.simplerailctrl.TRACK}.
     * The literals are from the enumeration {@link de.cau.cs.kieler.simplerailctrl.TRACK}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Track</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Track</em>' attribute list.
     * @see de.cau.cs.kieler.simplerailctrl.TRACK
     * @see de.cau.cs.kieler.simplerailctrl.SimplerailctrlPackage#getSetSignal_Track()
     * @model upper="48"
     * @generated
     */
    EList<TRACK> getTrack();

    /**
     * Returns the value of the '<em><b>Position</b></em>' attribute list.
     * The list contents are of type {@link de.cau.cs.kieler.simplerailctrl.POSITION}.
     * The literals are from the enumeration {@link de.cau.cs.kieler.simplerailctrl.POSITION}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Position</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Position</em>' attribute list.
     * @see de.cau.cs.kieler.simplerailctrl.POSITION
     * @see de.cau.cs.kieler.simplerailctrl.SimplerailctrlPackage#getSetSignal_Position()
     * @model upper="2"
     * @generated
     */
    EList<POSITION> getPosition();

    /**
     * Returns the value of the '<em><b>Color</b></em>' attribute.
     * The literals are from the enumeration {@link de.cau.cs.kieler.simplerailctrl.SIGNALCOLOR}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Color</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Color</em>' attribute.
     * @see de.cau.cs.kieler.simplerailctrl.SIGNALCOLOR
     * @see #setColor(SIGNALCOLOR)
     * @see de.cau.cs.kieler.simplerailctrl.SimplerailctrlPackage#getSetSignal_Color()
     * @model
     * @generated
     */
    SIGNALCOLOR getColor();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.simplerailctrl.SetSignal#getColor <em>Color</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Color</em>' attribute.
     * @see de.cau.cs.kieler.simplerailctrl.SIGNALCOLOR
     * @see #getColor()
     * @generated
     */
    void setColor(SIGNALCOLOR value);

} // SetSignal
