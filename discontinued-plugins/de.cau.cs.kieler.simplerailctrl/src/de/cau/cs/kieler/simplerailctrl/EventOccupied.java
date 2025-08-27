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
 * A representation of the model object '<em><b>Event Occupied</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.simplerailctrl.EventOccupied#getTrack <em>Track</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simplerailctrl.EventOccupied#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simplerailctrl.EventOccupied#getConjunction <em>Conjunction</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.simplerailctrl.SimplerailctrlPackage#getEventOccupied()
 * @model
 * @generated
 */
public interface EventOccupied extends Transition {
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
     * @see de.cau.cs.kieler.simplerailctrl.SimplerailctrlPackage#getEventOccupied_Track()
     * @model upper="48"
     * @generated
     */
    EList<TRACK> getTrack();

    /**
     * Returns the value of the '<em><b>Condition</b></em>' attribute.
     * The literals are from the enumeration {@link de.cau.cs.kieler.simplerailctrl.CONDITION}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Condition</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Condition</em>' attribute.
     * @see de.cau.cs.kieler.simplerailctrl.CONDITION
     * @see #setCondition(CONDITION)
     * @see de.cau.cs.kieler.simplerailctrl.SimplerailctrlPackage#getEventOccupied_Condition()
     * @model
     * @generated
     */
    CONDITION getCondition();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.simplerailctrl.EventOccupied#getCondition <em>Condition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Condition</em>' attribute.
     * @see de.cau.cs.kieler.simplerailctrl.CONDITION
     * @see #getCondition()
     * @generated
     */
    void setCondition(CONDITION value);

    /**
     * Returns the value of the '<em><b>Conjunction</b></em>' attribute.
     * The literals are from the enumeration {@link de.cau.cs.kieler.simplerailctrl.CONJUNCTION}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conjunction</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Conjunction</em>' attribute.
     * @see de.cau.cs.kieler.simplerailctrl.CONJUNCTION
     * @see #setConjunction(CONJUNCTION)
     * @see de.cau.cs.kieler.simplerailctrl.SimplerailctrlPackage#getEventOccupied_Conjunction()
     * @model
     * @generated
     */
    CONJUNCTION getConjunction();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.simplerailctrl.EventOccupied#getConjunction <em>Conjunction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Conjunction</em>' attribute.
     * @see de.cau.cs.kieler.simplerailctrl.CONJUNCTION
     * @see #getConjunction()
     * @generated
     */
    void setConjunction(CONJUNCTION value);

} // EventOccupied
