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
 * A representation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scg.Entry#getExit <em>Exit</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.Entry#getNext <em>Next</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.Entry#getMaster <em>Master</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.scg.ScgPackage#getEntry()
 * @model
 * @generated
 */
public interface Entry extends Node {
    /**
     * Returns the value of the '<em><b>Exit</b></em>' reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.scg.Exit#getEntry <em>Entry</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Exit</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Exit</em>' reference.
     * @see #setExit(Exit)
     * @see de.cau.cs.kieler.scg.ScgPackage#getEntry_Exit()
     * @see de.cau.cs.kieler.scg.Exit#getEntry
     * @model opposite="entry" required="true"
     * @generated
     */
    Exit getExit();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scg.Entry#getExit <em>Exit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Exit</em>' reference.
     * @see #getExit()
     * @generated
     */
    void setExit(Exit value);

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
     * @see de.cau.cs.kieler.scg.ScgPackage#getEntry_Next()
     * @model containment="true"
     * @generated
     */
    ControlFlow getNext();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scg.Entry#getNext <em>Next</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Next</em>' containment reference.
     * @see #getNext()
     * @generated
     */
    void setNext(ControlFlow value);

    /**
     * Returns the value of the '<em><b>Master</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Master</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Master</em>' reference.
     * @see #setMaster(Entry)
     * @see de.cau.cs.kieler.scg.ScgPackage#getEntry_Master()
     * @model
     * @generated
     */
    Entry getMaster();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scg.Entry#getMaster <em>Master</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Master</em>' reference.
     * @see #getMaster()
     * @generated
     */
    void setMaster(Entry value);

} // Entry
