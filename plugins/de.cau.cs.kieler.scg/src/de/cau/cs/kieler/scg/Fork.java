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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fork</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scg.Fork#getJoin <em>Join</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.Fork#getNext <em>Next</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.Fork#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.scg.ScgPackage#getFork()
 * @model
 * @generated
 */
public interface Fork extends Node {
    /**
     * Returns the value of the '<em><b>Join</b></em>' reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.scg.Join#getFork <em>Fork</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Join</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Join</em>' reference.
     * @see #setJoin(Join)
     * @see de.cau.cs.kieler.scg.ScgPackage#getFork_Join()
     * @see de.cau.cs.kieler.scg.Join#getFork
     * @model opposite="fork" required="true"
     * @generated
     */
    Join getJoin();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scg.Fork#getJoin <em>Join</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Join</em>' reference.
     * @see #getJoin()
     * @generated
     */
    void setJoin(Join value);

    /**
     * Returns the value of the '<em><b>Next</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.scg.ControlFlow}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Next</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Next</em>' containment reference list.
     * @see de.cau.cs.kieler.scg.ScgPackage#getFork_Next()
     * @model containment="true" required="true"
     * @generated
     */
    EList<ControlFlow> getNext();

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The default value is <code>"PARALLEL"</code>.
     * The literals are from the enumeration {@link de.cau.cs.kieler.scg.ForkType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see de.cau.cs.kieler.scg.ForkType
     * @see #setType(ForkType)
     * @see de.cau.cs.kieler.scg.ScgPackage#getFork_Type()
     * @model default="PARALLEL" required="true"
     * @generated
     */
    ForkType getType();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scg.Fork#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see de.cau.cs.kieler.scg.ForkType
     * @see #getType()
     * @generated
     */
    void setType(ForkType value);

} // Fork
