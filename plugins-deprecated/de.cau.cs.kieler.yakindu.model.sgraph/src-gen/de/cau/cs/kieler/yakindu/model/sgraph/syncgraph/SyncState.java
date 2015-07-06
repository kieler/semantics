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

import org.yakindu.sct.model.sgraph.State;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sync State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncState#isIsInitial <em>Is Initial</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncState#isIsFinal <em>Is Final</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncgraphPackage#getSyncState()
 * @model
 * @generated
 */
public interface SyncState extends State {
	/**
     * Returns the value of the '<em><b>Is Initial</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Initial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Is Initial</em>' attribute.
     * @see #setIsInitial(boolean)
     * @see de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncgraphPackage#getSyncState_IsInitial()
     * @model default="false"
     * @generated
     */
	boolean isIsInitial();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncState#isIsInitial <em>Is Initial</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Initial</em>' attribute.
     * @see #isIsInitial()
     * @generated
     */
	void setIsInitial(boolean value);

	/**
     * Returns the value of the '<em><b>Is Final</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Is Final</em>' attribute.
     * @see #setIsFinal(boolean)
     * @see de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncgraphPackage#getSyncState_IsFinal()
     * @model default="false"
     * @generated
     */
	boolean isIsFinal();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncState#isIsFinal <em>Is Final</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Final</em>' attribute.
     * @see #isIsFinal()
     * @generated
     */
	void setIsFinal(boolean value);

} // SyncState
