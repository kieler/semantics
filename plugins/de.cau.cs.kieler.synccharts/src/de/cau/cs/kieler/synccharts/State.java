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
 */
package de.cau.cs.kieler.synccharts;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A State is the main entity in a SyncChart. States are located in a {@link Region}.
 * A SyncChart itself is represented by a top-level root Region that contains
 * exactly one root State. Every State may contain multiple parallel Regions
 * whereas a Region contains multiple States. This allows nested State
 * machines with parallelism.
 * <p>
 * A State may be initial or final or both. An initial State is the entry State of a Region.
 * SyncCharts may only have one initial State per Region. A final State indcates that
 * its parent Region has terminated and nothing needs to be done in that Region
 * and its parent State may be left via a normal termination transition.
 * <p>
 * A State is also a Scope and hence may carry an interface declaration and is
 * identified by id and label.
 * <p>
 * States have a type to indicate different properties of States. See {@link StateType}.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.State#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.State#getRegions <em>Regions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.State#getParentRegion <em>Parent Region</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.State#isIsInitial <em>Is Initial</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.State#isIsFinal <em>Is Final</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.State#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.State#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getState()
 * @model
 * @generated
 */
public interface State extends Scope {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2009 by\n+ Christian-Albrechts-University of Kiel\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.cau.cs.kieler.synccharts.StateType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.cau.cs.kieler.synccharts.StateType
	 * @see #setType(StateType)
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getState_Type()
	 * @model required="true"
	 * @generated
	 */
    StateType getType();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.synccharts.State#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.cau.cs.kieler.synccharts.StateType
	 * @see #getType()
	 * @generated
	 */
    void setType(StateType value);

    /**
	 * Returns the value of the '<em><b>Regions</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.synccharts.Region}.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.Region#getParentState <em>Parent State</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Regions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Regions</em>' containment reference list.
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getState_Regions()
	 * @see de.cau.cs.kieler.synccharts.Region#getParentState
	 * @model opposite="parentState" containment="true"
	 * @generated
	 */
    EList<Region> getRegions();

    /**
	 * Returns the value of the '<em><b>Parent Region</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.Region#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parent Region</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Region</em>' container reference.
	 * @see #setParentRegion(Region)
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getState_ParentRegion()
	 * @see de.cau.cs.kieler.synccharts.Region#getStates
	 * @model opposite="states" required="true" transient="false"
	 * @generated
	 */
    Region getParentRegion();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.synccharts.State#getParentRegion <em>Parent Region</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Region</em>' container reference.
	 * @see #getParentRegion()
	 * @generated
	 */
    void setParentRegion(Region value);

    /**
	 * Returns the value of the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Initial</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Initial</em>' attribute.
	 * @see #setIsInitial(boolean)
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getState_IsInitial()
	 * @model
	 * @generated
	 */
    boolean isIsInitial();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.synccharts.State#isIsInitial <em>Is Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Initial</em>' attribute.
	 * @see #isIsInitial()
	 * @generated
	 */
    void setIsInitial(boolean value);

    /**
	 * Returns the value of the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Final</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Final</em>' attribute.
	 * @see #setIsFinal(boolean)
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getState_IsFinal()
	 * @model
	 * @generated
	 */
    boolean isIsFinal();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.synccharts.State#isIsFinal <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Final</em>' attribute.
	 * @see #isIsFinal()
	 * @generated
	 */
    void setIsFinal(boolean value);

    /**
	 * Returns the value of the '<em><b>Outgoing Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.synccharts.Transition}.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.Transition#getSourceState <em>Source State</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Outgoing Transitions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Transitions</em>' containment reference list.
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getState_OutgoingTransitions()
	 * @see de.cau.cs.kieler.synccharts.Transition#getSourceState
	 * @model opposite="sourceState" containment="true"
	 * @generated
	 */
    EList<Transition> getOutgoingTransitions();

    /**
	 * Returns the value of the '<em><b>Incoming Transitions</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.synccharts.Transition}.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.Transition#getTargetState <em>Target State</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Incoming Transitions</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Transitions</em>' reference list.
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getState_IncomingTransitions()
	 * @see de.cau.cs.kieler.synccharts.Transition#getTargetState
	 * @model opposite="targetState"
	 * @generated
	 */
    EList<Transition> getIncomingTransitions();

} // State
