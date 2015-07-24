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
 * A representation of the model object '<em><b>Exit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scg.Exit#getEntry <em>Entry</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.Exit#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scg.ScgPackage#getExit()
 * @model
 * @generated
 */
public interface Exit extends Node {
    /**
	 * Returns the value of the '<em><b>Entry</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.scg.Entry#getExit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entry</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' reference.
	 * @see #setEntry(Entry)
	 * @see de.cau.cs.kieler.scg.ScgPackage#getExit_Entry()
	 * @see de.cau.cs.kieler.scg.Entry#getExit
	 * @model opposite="exit" required="true"
	 * @generated
	 */
    Entry getEntry();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.scg.Exit#getEntry <em>Entry</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry</em>' reference.
	 * @see #getEntry()
	 * @generated
	 */
    void setEntry(Entry value);

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
	 * @see de.cau.cs.kieler.scg.ScgPackage#getExit_Next()
	 * @model containment="true"
	 * @generated
	 */
    ControlFlow getNext();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.scg.Exit#getNext <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' containment reference.
	 * @see #getNext()
	 * @generated
	 */
    void setNext(ControlFlow value);

} // Exit
