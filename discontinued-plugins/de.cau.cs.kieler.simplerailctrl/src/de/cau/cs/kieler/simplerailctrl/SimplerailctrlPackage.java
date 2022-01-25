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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.simplerailctrl.SimplerailctrlFactory
 * @model kind="package"
 * @generated
 */
public interface SimplerailctrlPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "simplerailctrl";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "de.cau.cs.kieler.simplerailctrl";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "simplerailctrl";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SimplerailctrlPackage eINSTANCE = de.cau.cs.kieler.simplerailctrl.impl.SimplerailctrlPackageImpl.init();

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.simplerailctrl.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.simplerailctrl.impl.TransitionImpl
     * @see de.cau.cs.kieler.simplerailctrl.impl.SimplerailctrlPackageImpl#getTransition()
     * @generated
     */
    int TRANSITION = 2;

    /**
     * The feature id for the '<em><b>Destination</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSITION__DESTINATION = 0;

    /**
     * The number of structural features of the '<em>Transition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSITION_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.simplerailctrl.impl.EventWaitImpl <em>Event Wait</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.simplerailctrl.impl.EventWaitImpl
     * @see de.cau.cs.kieler.simplerailctrl.impl.SimplerailctrlPackageImpl#getEventWait()
     * @generated
     */
    int EVENT_WAIT = 0;

    /**
     * The feature id for the '<em><b>Destination</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_WAIT__DESTINATION = TRANSITION__DESTINATION;

    /**
     * The feature id for the '<em><b>Seconds</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_WAIT__SECONDS = TRANSITION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Event Wait</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_WAIT_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.simplerailctrl.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.simplerailctrl.impl.NodeImpl
     * @see de.cau.cs.kieler.simplerailctrl.impl.SimplerailctrlPackageImpl#getNode()
     * @generated
     */
    int NODE = 1;

    /**
     * The feature id for the '<em><b>Out Transitions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE__OUT_TRANSITIONS = 0;

    /**
     * The feature id for the '<em><b>Initial</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE__INITIAL = 1;

    /**
     * The number of structural features of the '<em>Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.simplerailctrl.impl.EventContactImpl <em>Event Contact</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.simplerailctrl.impl.EventContactImpl
     * @see de.cau.cs.kieler.simplerailctrl.impl.SimplerailctrlPackageImpl#getEventContact()
     * @generated
     */
    int EVENT_CONTACT = 3;

    /**
     * The feature id for the '<em><b>Destination</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CONTACT__DESTINATION = TRANSITION__DESTINATION;

    /**
     * The feature id for the '<em><b>Track</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CONTACT__TRACK = TRANSITION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Position</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CONTACT__POSITION = TRANSITION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Event Contact</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_CONTACT_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.simplerailctrl.impl.SetSpeedImpl <em>Set Speed</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.simplerailctrl.impl.SetSpeedImpl
     * @see de.cau.cs.kieler.simplerailctrl.impl.SimplerailctrlPackageImpl#getSetSpeed()
     * @generated
     */
    int SET_SPEED = 4;

    /**
     * The feature id for the '<em><b>Out Transitions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_SPEED__OUT_TRANSITIONS = NODE__OUT_TRANSITIONS;

    /**
     * The feature id for the '<em><b>Initial</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_SPEED__INITIAL = NODE__INITIAL;

    /**
     * The feature id for the '<em><b>Track</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_SPEED__TRACK = NODE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Speed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_SPEED__SPEED = NODE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Direction</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_SPEED__DIRECTION = NODE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Set Speed</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_SPEED_FEATURE_COUNT = NODE_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.simplerailctrl.impl.SetPointImpl <em>Set Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.simplerailctrl.impl.SetPointImpl
     * @see de.cau.cs.kieler.simplerailctrl.impl.SimplerailctrlPackageImpl#getSetPoint()
     * @generated
     */
    int SET_POINT = 5;

    /**
     * The feature id for the '<em><b>Out Transitions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_POINT__OUT_TRANSITIONS = NODE__OUT_TRANSITIONS;

    /**
     * The feature id for the '<em><b>Initial</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_POINT__INITIAL = NODE__INITIAL;

    /**
     * The feature id for the '<em><b>Point</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_POINT__POINT = NODE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Direction</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_POINT__DIRECTION = NODE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Set Point</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_POINT_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.simplerailctrl.impl.RailControllerImpl <em>Rail Controller</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.simplerailctrl.impl.RailControllerImpl
     * @see de.cau.cs.kieler.simplerailctrl.impl.SimplerailctrlPackageImpl#getRailController()
     * @generated
     */
    int RAIL_CONTROLLER = 6;

    /**
     * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RAIL_CONTROLLER__NODES = 0;

    /**
     * The number of structural features of the '<em>Rail Controller</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RAIL_CONTROLLER_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.simplerailctrl.impl.SetSignalImpl <em>Set Signal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.simplerailctrl.impl.SetSignalImpl
     * @see de.cau.cs.kieler.simplerailctrl.impl.SimplerailctrlPackageImpl#getSetSignal()
     * @generated
     */
    int SET_SIGNAL = 7;

    /**
     * The feature id for the '<em><b>Out Transitions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_SIGNAL__OUT_TRANSITIONS = NODE__OUT_TRANSITIONS;

    /**
     * The feature id for the '<em><b>Initial</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_SIGNAL__INITIAL = NODE__INITIAL;

    /**
     * The feature id for the '<em><b>Track</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_SIGNAL__TRACK = NODE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Position</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_SIGNAL__POSITION = NODE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Color</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_SIGNAL__COLOR = NODE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Set Signal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_SIGNAL_FEATURE_COUNT = NODE_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.simplerailctrl.impl.EventOccupiedImpl <em>Event Occupied</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.simplerailctrl.impl.EventOccupiedImpl
     * @see de.cau.cs.kieler.simplerailctrl.impl.SimplerailctrlPackageImpl#getEventOccupied()
     * @generated
     */
    int EVENT_OCCUPIED = 8;

    /**
     * The feature id for the '<em><b>Destination</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_OCCUPIED__DESTINATION = TRANSITION__DESTINATION;

    /**
     * The feature id for the '<em><b>Track</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_OCCUPIED__TRACK = TRANSITION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Condition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_OCCUPIED__CONDITION = TRANSITION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Conjunction</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_OCCUPIED__CONJUNCTION = TRANSITION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Event Occupied</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_OCCUPIED_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.simplerailctrl.TRACK <em>TRACK</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.simplerailctrl.TRACK
     * @see de.cau.cs.kieler.simplerailctrl.impl.SimplerailctrlPackageImpl#getTRACK()
     * @generated
     */
    int TRACK = 9;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.simplerailctrl.POINT <em>POINT</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.simplerailctrl.POINT
     * @see de.cau.cs.kieler.simplerailctrl.impl.SimplerailctrlPackageImpl#getPOINT()
     * @generated
     */
    int POINT = 10;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.simplerailctrl.POSITION <em>POSITION</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.simplerailctrl.POSITION
     * @see de.cau.cs.kieler.simplerailctrl.impl.SimplerailctrlPackageImpl#getPOSITION()
     * @generated
     */
    int POSITION = 11;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.simplerailctrl.DIRECTION <em>DIRECTION</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.simplerailctrl.DIRECTION
     * @see de.cau.cs.kieler.simplerailctrl.impl.SimplerailctrlPackageImpl#getDIRECTION()
     * @generated
     */
    int DIRECTION = 12;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.simplerailctrl.SIGNALCOLOR <em>SIGNALCOLOR</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.simplerailctrl.SIGNALCOLOR
     * @see de.cau.cs.kieler.simplerailctrl.impl.SimplerailctrlPackageImpl#getSIGNALCOLOR()
     * @generated
     */
    int SIGNALCOLOR = 13;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.simplerailctrl.MOTORDIR <em>MOTORDIR</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.simplerailctrl.MOTORDIR
     * @see de.cau.cs.kieler.simplerailctrl.impl.SimplerailctrlPackageImpl#getMOTORDIR()
     * @generated
     */
    int MOTORDIR = 14;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.simplerailctrl.CONDITION <em>CONDITION</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.simplerailctrl.CONDITION
     * @see de.cau.cs.kieler.simplerailctrl.impl.SimplerailctrlPackageImpl#getCONDITION()
     * @generated
     */
    int CONDITION = 15;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.simplerailctrl.CONJUNCTION <em>CONJUNCTION</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.simplerailctrl.CONJUNCTION
     * @see de.cau.cs.kieler.simplerailctrl.impl.SimplerailctrlPackageImpl#getCONJUNCTION()
     * @generated
     */
    int CONJUNCTION = 16;


    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.simplerailctrl.EventWait <em>Event Wait</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Event Wait</em>'.
     * @see de.cau.cs.kieler.simplerailctrl.EventWait
     * @generated
     */
    EClass getEventWait();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.simplerailctrl.EventWait#getSeconds <em>Seconds</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Seconds</em>'.
     * @see de.cau.cs.kieler.simplerailctrl.EventWait#getSeconds()
     * @see #getEventWait()
     * @generated
     */
    EAttribute getEventWait_Seconds();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.simplerailctrl.Node <em>Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node</em>'.
     * @see de.cau.cs.kieler.simplerailctrl.Node
     * @generated
     */
    EClass getNode();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.simplerailctrl.Node#getOutTransitions <em>Out Transitions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Out Transitions</em>'.
     * @see de.cau.cs.kieler.simplerailctrl.Node#getOutTransitions()
     * @see #getNode()
     * @generated
     */
    EReference getNode_OutTransitions();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.simplerailctrl.Node#isInitial <em>Initial</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Initial</em>'.
     * @see de.cau.cs.kieler.simplerailctrl.Node#isInitial()
     * @see #getNode()
     * @generated
     */
    EAttribute getNode_Initial();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.simplerailctrl.Transition <em>Transition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Transition</em>'.
     * @see de.cau.cs.kieler.simplerailctrl.Transition
     * @generated
     */
    EClass getTransition();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.simplerailctrl.Transition#getDestination <em>Destination</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Destination</em>'.
     * @see de.cau.cs.kieler.simplerailctrl.Transition#getDestination()
     * @see #getTransition()
     * @generated
     */
    EReference getTransition_Destination();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.simplerailctrl.EventContact <em>Event Contact</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Event Contact</em>'.
     * @see de.cau.cs.kieler.simplerailctrl.EventContact
     * @generated
     */
    EClass getEventContact();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.simplerailctrl.EventContact#getTrack <em>Track</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Track</em>'.
     * @see de.cau.cs.kieler.simplerailctrl.EventContact#getTrack()
     * @see #getEventContact()
     * @generated
     */
    EAttribute getEventContact_Track();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.simplerailctrl.EventContact#getPosition <em>Position</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Position</em>'.
     * @see de.cau.cs.kieler.simplerailctrl.EventContact#getPosition()
     * @see #getEventContact()
     * @generated
     */
    EAttribute getEventContact_Position();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.simplerailctrl.SetSpeed <em>Set Speed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Set Speed</em>'.
     * @see de.cau.cs.kieler.simplerailctrl.SetSpeed
     * @generated
     */
    EClass getSetSpeed();

    /**
     * Returns the meta object for the attribute list '{@link de.cau.cs.kieler.simplerailctrl.SetSpeed#getTrack <em>Track</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Track</em>'.
     * @see de.cau.cs.kieler.simplerailctrl.SetSpeed#getTrack()
     * @see #getSetSpeed()
     * @generated
     */
    EAttribute getSetSpeed_Track();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.simplerailctrl.SetSpeed#getSpeed <em>Speed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Speed</em>'.
     * @see de.cau.cs.kieler.simplerailctrl.SetSpeed#getSpeed()
     * @see #getSetSpeed()
     * @generated
     */
    EAttribute getSetSpeed_Speed();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.simplerailctrl.SetSpeed#getDirection <em>Direction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Direction</em>'.
     * @see de.cau.cs.kieler.simplerailctrl.SetSpeed#getDirection()
     * @see #getSetSpeed()
     * @generated
     */
    EAttribute getSetSpeed_Direction();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.simplerailctrl.SetPoint <em>Set Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Set Point</em>'.
     * @see de.cau.cs.kieler.simplerailctrl.SetPoint
     * @generated
     */
    EClass getSetPoint();

    /**
     * Returns the meta object for the attribute list '{@link de.cau.cs.kieler.simplerailctrl.SetPoint#getPoint <em>Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Point</em>'.
     * @see de.cau.cs.kieler.simplerailctrl.SetPoint#getPoint()
     * @see #getSetPoint()
     * @generated
     */
    EAttribute getSetPoint_Point();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.simplerailctrl.SetPoint#getDirection <em>Direction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Direction</em>'.
     * @see de.cau.cs.kieler.simplerailctrl.SetPoint#getDirection()
     * @see #getSetPoint()
     * @generated
     */
    EAttribute getSetPoint_Direction();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.simplerailctrl.RailController <em>Rail Controller</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Rail Controller</em>'.
     * @see de.cau.cs.kieler.simplerailctrl.RailController
     * @generated
     */
    EClass getRailController();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.simplerailctrl.RailController#getNodes <em>Nodes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Nodes</em>'.
     * @see de.cau.cs.kieler.simplerailctrl.RailController#getNodes()
     * @see #getRailController()
     * @generated
     */
    EReference getRailController_Nodes();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.simplerailctrl.SetSignal <em>Set Signal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Set Signal</em>'.
     * @see de.cau.cs.kieler.simplerailctrl.SetSignal
     * @generated
     */
    EClass getSetSignal();

    /**
     * Returns the meta object for the attribute list '{@link de.cau.cs.kieler.simplerailctrl.SetSignal#getTrack <em>Track</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Track</em>'.
     * @see de.cau.cs.kieler.simplerailctrl.SetSignal#getTrack()
     * @see #getSetSignal()
     * @generated
     */
    EAttribute getSetSignal_Track();

    /**
     * Returns the meta object for the attribute list '{@link de.cau.cs.kieler.simplerailctrl.SetSignal#getPosition <em>Position</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Position</em>'.
     * @see de.cau.cs.kieler.simplerailctrl.SetSignal#getPosition()
     * @see #getSetSignal()
     * @generated
     */
    EAttribute getSetSignal_Position();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.simplerailctrl.SetSignal#getColor <em>Color</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Color</em>'.
     * @see de.cau.cs.kieler.simplerailctrl.SetSignal#getColor()
     * @see #getSetSignal()
     * @generated
     */
    EAttribute getSetSignal_Color();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.simplerailctrl.EventOccupied <em>Event Occupied</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Event Occupied</em>'.
     * @see de.cau.cs.kieler.simplerailctrl.EventOccupied
     * @generated
     */
    EClass getEventOccupied();

    /**
     * Returns the meta object for the attribute list '{@link de.cau.cs.kieler.simplerailctrl.EventOccupied#getTrack <em>Track</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Track</em>'.
     * @see de.cau.cs.kieler.simplerailctrl.EventOccupied#getTrack()
     * @see #getEventOccupied()
     * @generated
     */
    EAttribute getEventOccupied_Track();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.simplerailctrl.EventOccupied#getCondition <em>Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Condition</em>'.
     * @see de.cau.cs.kieler.simplerailctrl.EventOccupied#getCondition()
     * @see #getEventOccupied()
     * @generated
     */
    EAttribute getEventOccupied_Condition();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.simplerailctrl.EventOccupied#getConjunction <em>Conjunction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Conjunction</em>'.
     * @see de.cau.cs.kieler.simplerailctrl.EventOccupied#getConjunction()
     * @see #getEventOccupied()
     * @generated
     */
    EAttribute getEventOccupied_Conjunction();

    /**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.simplerailctrl.TRACK <em>TRACK</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>TRACK</em>'.
     * @see de.cau.cs.kieler.simplerailctrl.TRACK
     * @generated
     */
    EEnum getTRACK();

    /**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.simplerailctrl.POINT <em>POINT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>POINT</em>'.
     * @see de.cau.cs.kieler.simplerailctrl.POINT
     * @generated
     */
    EEnum getPOINT();

    /**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.simplerailctrl.POSITION <em>POSITION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>POSITION</em>'.
     * @see de.cau.cs.kieler.simplerailctrl.POSITION
     * @generated
     */
    EEnum getPOSITION();

    /**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.simplerailctrl.DIRECTION <em>DIRECTION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>DIRECTION</em>'.
     * @see de.cau.cs.kieler.simplerailctrl.DIRECTION
     * @generated
     */
    EEnum getDIRECTION();

    /**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.simplerailctrl.SIGNALCOLOR <em>SIGNALCOLOR</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>SIGNALCOLOR</em>'.
     * @see de.cau.cs.kieler.simplerailctrl.SIGNALCOLOR
     * @generated
     */
    EEnum getSIGNALCOLOR();

    /**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.simplerailctrl.MOTORDIR <em>MOTORDIR</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>MOTORDIR</em>'.
     * @see de.cau.cs.kieler.simplerailctrl.MOTORDIR
     * @generated
     */
    EEnum getMOTORDIR();

    /**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.simplerailctrl.CONDITION <em>CONDITION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>CONDITION</em>'.
     * @see de.cau.cs.kieler.simplerailctrl.CONDITION
     * @generated
     */
    EEnum getCONDITION();

    /**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.simplerailctrl.CONJUNCTION <em>CONJUNCTION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>CONJUNCTION</em>'.
     * @see de.cau.cs.kieler.simplerailctrl.CONJUNCTION
     * @generated
     */
    EEnum getCONJUNCTION();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    SimplerailctrlFactory getSimplerailctrlFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.simplerailctrl.impl.EventWaitImpl <em>Event Wait</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.simplerailctrl.impl.EventWaitImpl
         * @see de.cau.cs.kieler.simplerailctrl.impl.SimplerailctrlPackageImpl#getEventWait()
         * @generated
         */
        EClass EVENT_WAIT = eINSTANCE.getEventWait();

        /**
         * The meta object literal for the '<em><b>Seconds</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EVENT_WAIT__SECONDS = eINSTANCE.getEventWait_Seconds();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.simplerailctrl.impl.NodeImpl <em>Node</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.simplerailctrl.impl.NodeImpl
         * @see de.cau.cs.kieler.simplerailctrl.impl.SimplerailctrlPackageImpl#getNode()
         * @generated
         */
        EClass NODE = eINSTANCE.getNode();

        /**
         * The meta object literal for the '<em><b>Out Transitions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE__OUT_TRANSITIONS = eINSTANCE.getNode_OutTransitions();

        /**
         * The meta object literal for the '<em><b>Initial</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE__INITIAL = eINSTANCE.getNode_Initial();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.simplerailctrl.impl.TransitionImpl <em>Transition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.simplerailctrl.impl.TransitionImpl
         * @see de.cau.cs.kieler.simplerailctrl.impl.SimplerailctrlPackageImpl#getTransition()
         * @generated
         */
        EClass TRANSITION = eINSTANCE.getTransition();

        /**
         * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TRANSITION__DESTINATION = eINSTANCE.getTransition_Destination();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.simplerailctrl.impl.EventContactImpl <em>Event Contact</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.simplerailctrl.impl.EventContactImpl
         * @see de.cau.cs.kieler.simplerailctrl.impl.SimplerailctrlPackageImpl#getEventContact()
         * @generated
         */
        EClass EVENT_CONTACT = eINSTANCE.getEventContact();

        /**
         * The meta object literal for the '<em><b>Track</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EVENT_CONTACT__TRACK = eINSTANCE.getEventContact_Track();

        /**
         * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EVENT_CONTACT__POSITION = eINSTANCE.getEventContact_Position();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.simplerailctrl.impl.SetSpeedImpl <em>Set Speed</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.simplerailctrl.impl.SetSpeedImpl
         * @see de.cau.cs.kieler.simplerailctrl.impl.SimplerailctrlPackageImpl#getSetSpeed()
         * @generated
         */
        EClass SET_SPEED = eINSTANCE.getSetSpeed();

        /**
         * The meta object literal for the '<em><b>Track</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SET_SPEED__TRACK = eINSTANCE.getSetSpeed_Track();

        /**
         * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SET_SPEED__SPEED = eINSTANCE.getSetSpeed_Speed();

        /**
         * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SET_SPEED__DIRECTION = eINSTANCE.getSetSpeed_Direction();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.simplerailctrl.impl.SetPointImpl <em>Set Point</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.simplerailctrl.impl.SetPointImpl
         * @see de.cau.cs.kieler.simplerailctrl.impl.SimplerailctrlPackageImpl#getSetPoint()
         * @generated
         */
        EClass SET_POINT = eINSTANCE.getSetPoint();

        /**
         * The meta object literal for the '<em><b>Point</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SET_POINT__POINT = eINSTANCE.getSetPoint_Point();

        /**
         * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SET_POINT__DIRECTION = eINSTANCE.getSetPoint_Direction();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.simplerailctrl.impl.RailControllerImpl <em>Rail Controller</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.simplerailctrl.impl.RailControllerImpl
         * @see de.cau.cs.kieler.simplerailctrl.impl.SimplerailctrlPackageImpl#getRailController()
         * @generated
         */
        EClass RAIL_CONTROLLER = eINSTANCE.getRailController();

        /**
         * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RAIL_CONTROLLER__NODES = eINSTANCE.getRailController_Nodes();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.simplerailctrl.impl.SetSignalImpl <em>Set Signal</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.simplerailctrl.impl.SetSignalImpl
         * @see de.cau.cs.kieler.simplerailctrl.impl.SimplerailctrlPackageImpl#getSetSignal()
         * @generated
         */
        EClass SET_SIGNAL = eINSTANCE.getSetSignal();

        /**
         * The meta object literal for the '<em><b>Track</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SET_SIGNAL__TRACK = eINSTANCE.getSetSignal_Track();

        /**
         * The meta object literal for the '<em><b>Position</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SET_SIGNAL__POSITION = eINSTANCE.getSetSignal_Position();

        /**
         * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SET_SIGNAL__COLOR = eINSTANCE.getSetSignal_Color();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.simplerailctrl.impl.EventOccupiedImpl <em>Event Occupied</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.simplerailctrl.impl.EventOccupiedImpl
         * @see de.cau.cs.kieler.simplerailctrl.impl.SimplerailctrlPackageImpl#getEventOccupied()
         * @generated
         */
        EClass EVENT_OCCUPIED = eINSTANCE.getEventOccupied();

        /**
         * The meta object literal for the '<em><b>Track</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EVENT_OCCUPIED__TRACK = eINSTANCE.getEventOccupied_Track();

        /**
         * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EVENT_OCCUPIED__CONDITION = eINSTANCE.getEventOccupied_Condition();

        /**
         * The meta object literal for the '<em><b>Conjunction</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EVENT_OCCUPIED__CONJUNCTION = eINSTANCE.getEventOccupied_Conjunction();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.simplerailctrl.TRACK <em>TRACK</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.simplerailctrl.TRACK
         * @see de.cau.cs.kieler.simplerailctrl.impl.SimplerailctrlPackageImpl#getTRACK()
         * @generated
         */
        EEnum TRACK = eINSTANCE.getTRACK();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.simplerailctrl.POINT <em>POINT</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.simplerailctrl.POINT
         * @see de.cau.cs.kieler.simplerailctrl.impl.SimplerailctrlPackageImpl#getPOINT()
         * @generated
         */
        EEnum POINT = eINSTANCE.getPOINT();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.simplerailctrl.POSITION <em>POSITION</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.simplerailctrl.POSITION
         * @see de.cau.cs.kieler.simplerailctrl.impl.SimplerailctrlPackageImpl#getPOSITION()
         * @generated
         */
        EEnum POSITION = eINSTANCE.getPOSITION();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.simplerailctrl.DIRECTION <em>DIRECTION</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.simplerailctrl.DIRECTION
         * @see de.cau.cs.kieler.simplerailctrl.impl.SimplerailctrlPackageImpl#getDIRECTION()
         * @generated
         */
        EEnum DIRECTION = eINSTANCE.getDIRECTION();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.simplerailctrl.SIGNALCOLOR <em>SIGNALCOLOR</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.simplerailctrl.SIGNALCOLOR
         * @see de.cau.cs.kieler.simplerailctrl.impl.SimplerailctrlPackageImpl#getSIGNALCOLOR()
         * @generated
         */
        EEnum SIGNALCOLOR = eINSTANCE.getSIGNALCOLOR();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.simplerailctrl.MOTORDIR <em>MOTORDIR</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.simplerailctrl.MOTORDIR
         * @see de.cau.cs.kieler.simplerailctrl.impl.SimplerailctrlPackageImpl#getMOTORDIR()
         * @generated
         */
        EEnum MOTORDIR = eINSTANCE.getMOTORDIR();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.simplerailctrl.CONDITION <em>CONDITION</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.simplerailctrl.CONDITION
         * @see de.cau.cs.kieler.simplerailctrl.impl.SimplerailctrlPackageImpl#getCONDITION()
         * @generated
         */
        EEnum CONDITION = eINSTANCE.getCONDITION();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.simplerailctrl.CONJUNCTION <em>CONJUNCTION</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.simplerailctrl.CONJUNCTION
         * @see de.cau.cs.kieler.simplerailctrl.impl.SimplerailctrlPackageImpl#getCONJUNCTION()
         * @generated
         */
        EEnum CONJUNCTION = eINSTANCE.getCONJUNCTION();

    }

} //SimplerailctrlPackage
