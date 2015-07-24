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
 * A representation of the model object '<em><b>Set Speed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.simplerailctrl.SetSpeed#getTrack <em>Track</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simplerailctrl.SetSpeed#getSpeed <em>Speed</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simplerailctrl.SetSpeed#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.simplerailctrl.SimplerailctrlPackage#getSetSpeed()
 * @model
 * @generated
 */
public interface SetSpeed extends Node {
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
     * @see de.cau.cs.kieler.simplerailctrl.SimplerailctrlPackage#getSetSpeed_Track()
     * @model upper="48"
     * @generated
     */
    EList<TRACK> getTrack();

    /**
     * Returns the value of the '<em><b>Speed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Speed</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Speed</em>' attribute.
     * @see #setSpeed(int)
     * @see de.cau.cs.kieler.simplerailctrl.SimplerailctrlPackage#getSetSpeed_Speed()
     * @model
     * @generated
     */
    int getSpeed();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.simplerailctrl.SetSpeed#getSpeed <em>Speed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Speed</em>' attribute.
     * @see #getSpeed()
     * @generated
     */
    void setSpeed(int value);

    /**
     * Returns the value of the '<em><b>Direction</b></em>' attribute.
     * The literals are from the enumeration {@link de.cau.cs.kieler.simplerailctrl.MOTORDIR}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Direction</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Direction</em>' attribute.
     * @see de.cau.cs.kieler.simplerailctrl.MOTORDIR
     * @see #setDirection(MOTORDIR)
     * @see de.cau.cs.kieler.simplerailctrl.SimplerailctrlPackage#getSetSpeed_Direction()
     * @model
     * @generated
     */
    MOTORDIR getDirection();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.simplerailctrl.SetSpeed#getDirection <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Direction</em>' attribute.
     * @see de.cau.cs.kieler.simplerailctrl.MOTORDIR
     * @see #getDirection()
     * @generated
     */
    void setDirection(MOTORDIR value);

} // SetSpeed
