/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ISignal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.core.expressions.ISignal#getChannelDescr <em>Channel Descr</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.core.expressions.ExpressionsPackage#getISignal()
 * @model
 * @generated
 */
public interface ISignal extends Signal {
    /**
     * Returns the value of the '<em><b>Channel Descr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Channel Descr</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Channel Descr</em>' containment reference.
     * @see #setChannelDescr(ChannelDescription)
     * @see de.cau.cs.kieler.core.expressions.ExpressionsPackage#getISignal_ChannelDescr()
     * @model containment="true"
     * @generated
     */
    ChannelDescription getChannelDescr();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.core.expressions.ISignal#getChannelDescr <em>Channel Descr</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Channel Descr</em>' containment reference.
     * @see #getChannelDescr()
     * @generated
     */
    void setChannelDescr(ChannelDescription value);

} // ISignal
