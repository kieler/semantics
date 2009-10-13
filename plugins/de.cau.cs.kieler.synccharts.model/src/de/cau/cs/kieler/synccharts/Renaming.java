/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Renaming</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.Renaming#getParentState <em>Parent State</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Renaming#getOldID <em>Old ID</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Renaming#getNewID <em>New ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getRenaming()
 * @model
 * @generated
 */
public interface Renaming extends EObject {
    /**
     * Returns the value of the '<em><b>Parent State</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.State#getRenamings <em>Renamings</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parent State</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent State</em>' container reference.
     * @see #setParentState(State)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getRenaming_ParentState()
     * @see de.cau.cs.kieler.synccharts.State#getRenamings
     * @model opposite="renamings" required="true" transient="false"
     * @generated
     */
    State getParentState();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Renaming#getParentState <em>Parent State</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent State</em>' container reference.
     * @see #getParentState()
     * @generated
     */
    void setParentState(State value);

    /**
     * Returns the value of the '<em><b>Old ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Old ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Old ID</em>' attribute.
     * @see #setOldID(String)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getRenaming_OldID()
     * @model required="true"
     * @generated
     */
    String getOldID();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Renaming#getOldID <em>Old ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Old ID</em>' attribute.
     * @see #getOldID()
     * @generated
     */
    void setOldID(String value);

    /**
     * Returns the value of the '<em><b>New ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>New ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>New ID</em>' attribute.
     * @see #setNewID(String)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getRenaming_NewID()
     * @model required="true"
     * @generated
     */
    String getNewID();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Renaming#getNewID <em>New ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>New ID</em>' attribute.
     * @see #getNewID()
     * @generated
     */
    void setNewID(String value);

} // Renaming
