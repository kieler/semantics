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
 * A representation of the model object '<em><b>Set Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.simplerailctrl.SetPoint#getPoint <em>Point</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simplerailctrl.SetPoint#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.simplerailctrl.SimplerailctrlPackage#getSetPoint()
 * @model
 * @generated
 */
public interface SetPoint extends Node {
    /**
     * Returns the value of the '<em><b>Point</b></em>' attribute list.
     * The list contents are of type {@link de.cau.cs.kieler.simplerailctrl.POINT}.
     * The literals are from the enumeration {@link de.cau.cs.kieler.simplerailctrl.POINT}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Point</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Point</em>' attribute list.
     * @see de.cau.cs.kieler.simplerailctrl.POINT
     * @see de.cau.cs.kieler.simplerailctrl.SimplerailctrlPackage#getSetPoint_Point()
     * @model upper="30"
     * @generated
     */
    EList<POINT> getPoint();

    /**
     * Returns the value of the '<em><b>Direction</b></em>' attribute.
     * The literals are from the enumeration {@link de.cau.cs.kieler.simplerailctrl.DIRECTION}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Direction</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Direction</em>' attribute.
     * @see de.cau.cs.kieler.simplerailctrl.DIRECTION
     * @see #setDirection(DIRECTION)
     * @see de.cau.cs.kieler.simplerailctrl.SimplerailctrlPackage#getSetPoint_Direction()
     * @model
     * @generated
     */
    DIRECTION getDirection();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.simplerailctrl.SetPoint#getDirection <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Direction</em>' attribute.
     * @see de.cau.cs.kieler.simplerailctrl.DIRECTION
     * @see #getDirection()
     * @generated
     */
    void setDirection(DIRECTION value);

} // SetPoint
