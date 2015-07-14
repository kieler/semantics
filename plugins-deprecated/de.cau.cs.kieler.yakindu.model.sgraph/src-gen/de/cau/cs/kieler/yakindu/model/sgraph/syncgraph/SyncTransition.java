/**
 *  KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *  http://www.informatik.uni-kiel.de/rtsys/kieler/
 *   
 *  Copyright 2012 by
 *   + Kiel University
 *    + Department of Computer Science
 *       + Real-Time and Embedded Systems Group
 *   
 *   This code is provided under the terms of the Eclipse Public License (EPL).
 *   See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.yakindu.model.sgraph.syncgraph;

import org.yakindu.sct.model.sgraph.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sync Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncTransition#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncTransition#isIsHistory <em>Is History</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncTransition#isIsImmediate <em>Is Immediate</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncgraphPackage#getSyncTransition()
 * @model
 * @generated
 */
public interface SyncTransition extends Transition {
	/**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The default value is <code>"0"</code>.
     * The literals are from the enumeration {@link de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.TransitionType}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.TransitionType
     * @see #setType(TransitionType)
     * @see de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncgraphPackage#getSyncTransition_Type()
     * @model default="0"
     * @generated
     */
	TransitionType getType();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncTransition#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.TransitionType
     * @see #getType()
     * @generated
     */
	void setType(TransitionType value);

	/**
     * Returns the value of the '<em><b>Is History</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is History</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Is History</em>' attribute.
     * @see #setIsHistory(boolean)
     * @see de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncgraphPackage#getSyncTransition_IsHistory()
     * @model default="false"
     * @generated
     */
	boolean isIsHistory();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncTransition#isIsHistory <em>Is History</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is History</em>' attribute.
     * @see #isIsHistory()
     * @generated
     */
	void setIsHistory(boolean value);

    /**
     * Returns the value of the '<em><b>Is Immediate</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Immediate</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Immediate</em>' attribute.
     * @see #setIsImmediate(boolean)
     * @see de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncgraphPackage#getSyncTransition_IsImmediate()
     * @model default="false"
     * @generated
     */
    boolean isIsImmediate();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncTransition#isIsImmediate <em>Is Immediate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Immediate</em>' attribute.
     * @see #isIsImmediate()
     * @generated
     */
    void setIsImmediate(boolean value);

} // SyncTransition
