/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.Region#getInnerStates <em>Inner States</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Region#getParentState <em>Parent State</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Region#getVariables <em>Variables</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Region#getSignals <em>Signals</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Region#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends EObject {
    /**
     * Returns the value of the '<em><b>Inner States</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.synccharts.State}.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.State#getParentRegion <em>Parent Region</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inner States</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Inner States</em>' containment reference list.
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getRegion_InnerStates()
     * @see de.cau.cs.kieler.synccharts.State#getParentRegion
     * @model opposite="parentRegion" containment="true"
     * @generated
     */
    EList<State> getInnerStates();

    /**
     * Returns the value of the '<em><b>Parent State</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.State#getRegions <em>Regions</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parent State</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent State</em>' container reference.
     * @see #setParentState(State)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getRegion_ParentState()
     * @see de.cau.cs.kieler.synccharts.State#getRegions
     * @model opposite="regions" transient="false"
     * @generated
     */
    State getParentState();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Region#getParentState <em>Parent State</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent State</em>' container reference.
     * @see #getParentState()
     * @generated
     */
    void setParentState(State value);

    /**
     * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.synccharts.Variable}.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.Variable#getParentRegion <em>Parent Region</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Variables</em>' containment reference list.
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getRegion_Variables()
     * @see de.cau.cs.kieler.synccharts.Variable#getParentRegion
     * @model opposite="parentRegion" containment="true"
     * @generated
     */
    EList<Variable> getVariables();

    /**
     * Returns the value of the '<em><b>Signals</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.synccharts.Signal}.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.Signal#getParentRegion <em>Parent Region</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Signals</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Signals</em>' containment reference list.
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getRegion_Signals()
     * @see de.cau.cs.kieler.synccharts.Signal#getParentRegion
     * @model opposite="parentRegion" containment="true"
     * @generated
     */
    EList<Signal> getSignals();

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getRegion_Id()
     * @model
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Region#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

} // Region
