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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.simplerailctrl.SimplerailctrlPackage
 * @generated
 */
public interface SimplerailctrlFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SimplerailctrlFactory eINSTANCE = de.cau.cs.kieler.simplerailctrl.impl.SimplerailctrlFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Event Wait</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Event Wait</em>'.
     * @generated
     */
    EventWait createEventWait();

    /**
     * Returns a new object of class '<em>Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Node</em>'.
     * @generated
     */
    Node createNode();

    /**
     * Returns a new object of class '<em>Transition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Transition</em>'.
     * @generated
     */
    Transition createTransition();

    /**
     * Returns a new object of class '<em>Event Contact</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Event Contact</em>'.
     * @generated
     */
    EventContact createEventContact();

    /**
     * Returns a new object of class '<em>Set Speed</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Set Speed</em>'.
     * @generated
     */
    SetSpeed createSetSpeed();

    /**
     * Returns a new object of class '<em>Set Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Set Point</em>'.
     * @generated
     */
    SetPoint createSetPoint();

    /**
     * Returns a new object of class '<em>Rail Controller</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Rail Controller</em>'.
     * @generated
     */
    RailController createRailController();

    /**
     * Returns a new object of class '<em>Set Signal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Set Signal</em>'.
     * @generated
     */
    SetSignal createSetSignal();

    /**
     * Returns a new object of class '<em>Event Occupied</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Event Occupied</em>'.
     * @generated
     */
    EventOccupied createEventOccupied();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    SimplerailctrlPackage getSimplerailctrlPackage();

} //SimplerailctrlFactory
