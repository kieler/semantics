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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.simplerailctrl.Node#getOutTransitions <em>Out Transitions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simplerailctrl.Node#isInitial <em>Initial</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.simplerailctrl.SimplerailctrlPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
    /**
     * Returns the value of the '<em><b>Out Transitions</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.simplerailctrl.Transition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Out Transitions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Out Transitions</em>' containment reference list.
     * @see de.cau.cs.kieler.simplerailctrl.SimplerailctrlPackage#getNode_OutTransitions()
     * @model containment="true"
     * @generated
     */
    EList<Transition> getOutTransitions();

    /**
     * Returns the value of the '<em><b>Initial</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Initial</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Initial</em>' attribute.
     * @see #setInitial(boolean)
     * @see de.cau.cs.kieler.simplerailctrl.SimplerailctrlPackage#getNode_Initial()
     * @model required="true"
     * @generated
     */
    boolean isInitial();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.simplerailctrl.Node#isInitial <em>Initial</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Initial</em>' attribute.
     * @see #isInitial()
     * @generated
     */
    void setInitial(boolean value);

} // Node
