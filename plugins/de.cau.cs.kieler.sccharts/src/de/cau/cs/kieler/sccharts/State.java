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
package de.cau.cs.kieler.sccharts;

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
 * sccharts may only have one initial State per Region. A final State indcates that
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
 *   <li>{@link de.cau.cs.kieler.sccharts.State#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.State#getRegions <em>Regions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.State#getParentRegion <em>Parent Region</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.State#isInitial <em>Initial</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.State#isFinal <em>Final</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.State#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.State#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getState()
 * @model
 * @generated
 */
public interface State extends Scope {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Kiel University\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.cau.cs.kieler.sccharts.StateType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.cau.cs.kieler.sccharts.StateType
	 * @see #setType(StateType)
	 * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getState_Type()
	 * @model required="true"
	 * @generated
	 */
    StateType getType();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.sccharts.State#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.cau.cs.kieler.sccharts.StateType
	 * @see #getType()
	 * @generated
	 */
    void setType(StateType value);

    /**
	 * Returns the value of the '<em><b>Regions</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.sccharts.Region}.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.sccharts.Region#getParentState <em>Parent State</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Regions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Regions</em>' containment reference list.
	 * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getState_Regions()
	 * @see de.cau.cs.kieler.sccharts.Region#getParentState
	 * @model opposite="parentState" containment="true"
	 * @generated
	 */
    EList<Region> getRegions();

    /**
	 * Returns the value of the '<em><b>Parent Region</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.sccharts.ControlflowRegion#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parent Region</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Region</em>' container reference.
	 * @see #setParentRegion(ControlflowRegion)
	 * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getState_ParentRegion()
	 * @see de.cau.cs.kieler.sccharts.ControlflowRegion#getStates
	 * @model opposite="states" transient="false"
	 * @generated
	 */
    ControlflowRegion getParentRegion();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.sccharts.State#getParentRegion <em>Parent Region</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Region</em>' container reference.
	 * @see #getParentRegion()
	 * @generated
	 */
    void setParentRegion(ControlflowRegion value);

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
	 * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getState_Initial()
	 * @model
	 * @generated
	 */
    boolean isInitial();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.sccharts.State#isInitial <em>Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' attribute.
	 * @see #isInitial()
	 * @generated
	 */
    void setInitial(boolean value);

    /**
	 * Returns the value of the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Final</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' attribute.
	 * @see #setFinal(boolean)
	 * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getState_Final()
	 * @model
	 * @generated
	 */
    boolean isFinal();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.sccharts.State#isFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' attribute.
	 * @see #isFinal()
	 * @generated
	 */
    void setFinal(boolean value);

    /**
	 * Returns the value of the '<em><b>Outgoing Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.sccharts.Transition}.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.sccharts.Transition#getSourceState <em>Source State</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Outgoing Transitions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Transitions</em>' containment reference list.
	 * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getState_OutgoingTransitions()
	 * @see de.cau.cs.kieler.sccharts.Transition#getSourceState
	 * @model opposite="sourceState" containment="true"
	 * @generated
	 */
    EList<Transition> getOutgoingTransitions();

    /**
	 * Returns the value of the '<em><b>Incoming Transitions</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.sccharts.Transition}.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.sccharts.Transition#getTargetState <em>Target State</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Incoming Transitions</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Transitions</em>' reference list.
	 * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getState_IncomingTransitions()
	 * @see de.cau.cs.kieler.sccharts.Transition#getTargetState
	 * @model opposite="targetState"
	 * @generated
	 */
    EList<Transition> getIncomingTransitions();

} // State
