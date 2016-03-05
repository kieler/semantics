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
 * A representation of the model object '<em><b>Join</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scg.Join#getFork <em>Fork</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.Join#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.scg.ScgPackage#getJoin()
 * @model
 * @generated
 */
public interface Join extends Node {
    /**
     * Returns the value of the '<em><b>Fork</b></em>' reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.scg.Fork#getJoin <em>Join</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fork</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fork</em>' reference.
     * @see #setFork(Fork)
     * @see de.cau.cs.kieler.scg.ScgPackage#getJoin_Fork()
     * @see de.cau.cs.kieler.scg.Fork#getJoin
     * @model opposite="join" required="true"
     * @generated
     */
    Fork getFork();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scg.Join#getFork <em>Fork</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fork</em>' reference.
     * @see #getFork()
     * @generated
     */
    void setFork(Fork value);

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
     * @see de.cau.cs.kieler.scg.ScgPackage#getJoin_Next()
     * @model containment="true"
     * @generated
     */
    ControlFlow getNext();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scg.Join#getNext <em>Next</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Next</em>' containment reference.
     * @see #getNext()
     * @generated
     */
    void setNext(ControlFlow value);

} // Join
