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
package de.cau.cs.kieler.simplerailctrl.impl;

import de.cau.cs.kieler.simplerailctrl.EventContact;
import de.cau.cs.kieler.simplerailctrl.EventOccupied;
import de.cau.cs.kieler.simplerailctrl.EventWait;
import de.cau.cs.kieler.simplerailctrl.Node;
import de.cau.cs.kieler.simplerailctrl.RailController;
import de.cau.cs.kieler.simplerailctrl.SetPoint;
import de.cau.cs.kieler.simplerailctrl.SetSignal;
import de.cau.cs.kieler.simplerailctrl.SetSpeed;
import de.cau.cs.kieler.simplerailctrl.SimplerailctrlFactory;
import de.cau.cs.kieler.simplerailctrl.SimplerailctrlPackage;
import de.cau.cs.kieler.simplerailctrl.Transition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplerailctrlPackageImpl extends EPackageImpl implements SimplerailctrlPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eventWaitEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass transitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eventContactEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass setSpeedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass setPointEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass railControllerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass setSignalEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eventOccupiedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum trackEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum pointEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum positionEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum directionEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum signalcolorEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum motordirEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum conditionEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum conjunctionEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see de.cau.cs.kieler.simplerailctrl.SimplerailctrlPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private SimplerailctrlPackageImpl() {
        super(eNS_URI, SimplerailctrlFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link SimplerailctrlPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static SimplerailctrlPackage init() {
        if (isInited) return (SimplerailctrlPackage)EPackage.Registry.INSTANCE.getEPackage(SimplerailctrlPackage.eNS_URI);

        // Obtain or create and register package
        SimplerailctrlPackageImpl theSimplerailctrlPackage = (SimplerailctrlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SimplerailctrlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SimplerailctrlPackageImpl());

        isInited = true;

        // Create package meta-data objects
        theSimplerailctrlPackage.createPackageContents();

        // Initialize created meta-data
        theSimplerailctrlPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theSimplerailctrlPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(SimplerailctrlPackage.eNS_URI, theSimplerailctrlPackage);
        return theSimplerailctrlPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEventWait() {
        return eventWaitEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEventWait_Seconds() {
        return (EAttribute)eventWaitEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNode() {
        return nodeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getNode_OutTransitions() {
        return (EReference)nodeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNode_Initial() {
        return (EAttribute)nodeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTransition() {
        return transitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTransition_Destination() {
        return (EReference)transitionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEventContact() {
        return eventContactEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEventContact_Track() {
        return (EAttribute)eventContactEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEventContact_Position() {
        return (EAttribute)eventContactEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSetSpeed() {
        return setSpeedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSetSpeed_Track() {
        return (EAttribute)setSpeedEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSetSpeed_Speed() {
        return (EAttribute)setSpeedEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSetSpeed_Direction() {
        return (EAttribute)setSpeedEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSetPoint() {
        return setPointEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSetPoint_Point() {
        return (EAttribute)setPointEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSetPoint_Direction() {
        return (EAttribute)setPointEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRailController() {
        return railControllerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRailController_Nodes() {
        return (EReference)railControllerEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSetSignal() {
        return setSignalEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSetSignal_Track() {
        return (EAttribute)setSignalEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSetSignal_Position() {
        return (EAttribute)setSignalEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSetSignal_Color() {
        return (EAttribute)setSignalEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEventOccupied() {
        return eventOccupiedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEventOccupied_Track() {
        return (EAttribute)eventOccupiedEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEventOccupied_Condition() {
        return (EAttribute)eventOccupiedEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEventOccupied_Conjunction() {
        return (EAttribute)eventOccupiedEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getTRACK() {
        return trackEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getPOINT() {
        return pointEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getPOSITION() {
        return positionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getDIRECTION() {
        return directionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getSIGNALCOLOR() {
        return signalcolorEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getMOTORDIR() {
        return motordirEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getCONDITION() {
        return conditionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getCONJUNCTION() {
        return conjunctionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SimplerailctrlFactory getSimplerailctrlFactory() {
        return (SimplerailctrlFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        eventWaitEClass = createEClass(EVENT_WAIT);
        createEAttribute(eventWaitEClass, EVENT_WAIT__SECONDS);

        nodeEClass = createEClass(NODE);
        createEReference(nodeEClass, NODE__OUT_TRANSITIONS);
        createEAttribute(nodeEClass, NODE__INITIAL);

        transitionEClass = createEClass(TRANSITION);
        createEReference(transitionEClass, TRANSITION__DESTINATION);

        eventContactEClass = createEClass(EVENT_CONTACT);
        createEAttribute(eventContactEClass, EVENT_CONTACT__TRACK);
        createEAttribute(eventContactEClass, EVENT_CONTACT__POSITION);

        setSpeedEClass = createEClass(SET_SPEED);
        createEAttribute(setSpeedEClass, SET_SPEED__TRACK);
        createEAttribute(setSpeedEClass, SET_SPEED__SPEED);
        createEAttribute(setSpeedEClass, SET_SPEED__DIRECTION);

        setPointEClass = createEClass(SET_POINT);
        createEAttribute(setPointEClass, SET_POINT__POINT);
        createEAttribute(setPointEClass, SET_POINT__DIRECTION);

        railControllerEClass = createEClass(RAIL_CONTROLLER);
        createEReference(railControllerEClass, RAIL_CONTROLLER__NODES);

        setSignalEClass = createEClass(SET_SIGNAL);
        createEAttribute(setSignalEClass, SET_SIGNAL__TRACK);
        createEAttribute(setSignalEClass, SET_SIGNAL__POSITION);
        createEAttribute(setSignalEClass, SET_SIGNAL__COLOR);

        eventOccupiedEClass = createEClass(EVENT_OCCUPIED);
        createEAttribute(eventOccupiedEClass, EVENT_OCCUPIED__TRACK);
        createEAttribute(eventOccupiedEClass, EVENT_OCCUPIED__CONDITION);
        createEAttribute(eventOccupiedEClass, EVENT_OCCUPIED__CONJUNCTION);

        // Create enums
        trackEEnum = createEEnum(TRACK);
        pointEEnum = createEEnum(POINT);
        positionEEnum = createEEnum(POSITION);
        directionEEnum = createEEnum(DIRECTION);
        signalcolorEEnum = createEEnum(SIGNALCOLOR);
        motordirEEnum = createEEnum(MOTORDIR);
        conditionEEnum = createEEnum(CONDITION);
        conjunctionEEnum = createEEnum(CONJUNCTION);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        eventWaitEClass.getESuperTypes().add(this.getTransition());
        eventContactEClass.getESuperTypes().add(this.getTransition());
        setSpeedEClass.getESuperTypes().add(this.getNode());
        setPointEClass.getESuperTypes().add(this.getNode());
        setSignalEClass.getESuperTypes().add(this.getNode());
        eventOccupiedEClass.getESuperTypes().add(this.getTransition());

        // Initialize classes and features; add operations and parameters
        initEClass(eventWaitEClass, EventWait.class, "EventWait", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEventWait_Seconds(), ecorePackage.getEInt(), "seconds", null, 0, 1, EventWait.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getNode_OutTransitions(), this.getTransition(), null, "outTransitions", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNode_Initial(), ecorePackage.getEBoolean(), "initial", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTransition_Destination(), this.getNode(), null, "destination", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eventContactEClass, EventContact.class, "EventContact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEventContact_Track(), this.getTRACK(), "track", null, 0, 1, EventContact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEventContact_Position(), this.getPOSITION(), "position", null, 0, 1, EventContact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(setSpeedEClass, SetSpeed.class, "SetSpeed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSetSpeed_Track(), this.getTRACK(), "track", null, 0, 48, SetSpeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSetSpeed_Speed(), ecorePackage.getEInt(), "speed", null, 0, 1, SetSpeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSetSpeed_Direction(), this.getMOTORDIR(), "direction", null, 0, 1, SetSpeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(setPointEClass, SetPoint.class, "SetPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSetPoint_Point(), this.getPOINT(), "point", null, 0, 30, SetPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSetPoint_Direction(), this.getDIRECTION(), "direction", null, 0, 1, SetPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(railControllerEClass, RailController.class, "RailController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRailController_Nodes(), this.getNode(), null, "nodes", null, 0, -1, RailController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(setSignalEClass, SetSignal.class, "SetSignal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSetSignal_Track(), this.getTRACK(), "track", null, 0, 48, SetSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSetSignal_Position(), this.getPOSITION(), "position", null, 0, 2, SetSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSetSignal_Color(), this.getSIGNALCOLOR(), "color", null, 0, 1, SetSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eventOccupiedEClass, EventOccupied.class, "EventOccupied", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEventOccupied_Track(), this.getTRACK(), "track", null, 0, 48, EventOccupied.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEventOccupied_Condition(), this.getCONDITION(), "condition", null, 0, 1, EventOccupied.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEventOccupied_Conjunction(), this.getCONJUNCTION(), "conjunction", null, 0, 1, EventOccupied.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.class, "TRACK");
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.IC_JCT_0);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.IC_LN_0);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.IC_LN_1);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.IC_LN_2);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.IC_LN_3);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.IC_LN_4);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.IC_LN_5);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.IC_ST_0);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.IC_ST_1);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.IC_ST_2);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.IC_ST_3);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.IC_ST_4);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.IO_LN_0);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.IO_LN_1);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.IO_LN_2);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.KH_LN_0);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.KH_LN_1);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.KH_LN_2);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.KH_LN_3);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.KH_LN_4);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.KH_LN_5);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.KH_LN_6);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.KH_LN_7);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.KH_LN_8);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.KH_ST_0);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.KH_ST_1);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.KH_ST_2);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.KH_ST_3);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.KH_ST_4);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.KH_ST_5);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.KH_ST_6);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.KIO_LN_0);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.KIO_LN_1);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.OC_JCT_0);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.OC_LN_0);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.OC_LN_1);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.OC_LN_2);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.OC_LN_3);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.OC_LN_4);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.OC_LN_5);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.OC_ST_0);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.OC_ST_1);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.OC_ST_2);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.OC_ST_3);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.OC_ST_4);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.OI_LN_0);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.OI_LN_1);
        addEEnumLiteral(trackEEnum, de.cau.cs.kieler.simplerailctrl.TRACK.OI_LN_2);

        initEEnum(pointEEnum, de.cau.cs.kieler.simplerailctrl.POINT.class, "POINT");
        addEEnumLiteral(pointEEnum, de.cau.cs.kieler.simplerailctrl.POINT.POINT_0);
        addEEnumLiteral(pointEEnum, de.cau.cs.kieler.simplerailctrl.POINT.POINT_1);
        addEEnumLiteral(pointEEnum, de.cau.cs.kieler.simplerailctrl.POINT.POINT_2);
        addEEnumLiteral(pointEEnum, de.cau.cs.kieler.simplerailctrl.POINT.POINT_3);
        addEEnumLiteral(pointEEnum, de.cau.cs.kieler.simplerailctrl.POINT.POINT_4);
        addEEnumLiteral(pointEEnum, de.cau.cs.kieler.simplerailctrl.POINT.POINT_5);
        addEEnumLiteral(pointEEnum, de.cau.cs.kieler.simplerailctrl.POINT.POINT_6);
        addEEnumLiteral(pointEEnum, de.cau.cs.kieler.simplerailctrl.POINT.POINT_7);
        addEEnumLiteral(pointEEnum, de.cau.cs.kieler.simplerailctrl.POINT.POINT_8);
        addEEnumLiteral(pointEEnum, de.cau.cs.kieler.simplerailctrl.POINT.POINT_9);
        addEEnumLiteral(pointEEnum, de.cau.cs.kieler.simplerailctrl.POINT.POINT_10);
        addEEnumLiteral(pointEEnum, de.cau.cs.kieler.simplerailctrl.POINT.POINT_11);
        addEEnumLiteral(pointEEnum, de.cau.cs.kieler.simplerailctrl.POINT.POINT_12);
        addEEnumLiteral(pointEEnum, de.cau.cs.kieler.simplerailctrl.POINT.POINT_13);
        addEEnumLiteral(pointEEnum, de.cau.cs.kieler.simplerailctrl.POINT.POINT_14);
        addEEnumLiteral(pointEEnum, de.cau.cs.kieler.simplerailctrl.POINT.POINT_15);
        addEEnumLiteral(pointEEnum, de.cau.cs.kieler.simplerailctrl.POINT.POINT_16);
        addEEnumLiteral(pointEEnum, de.cau.cs.kieler.simplerailctrl.POINT.POINT_17);
        addEEnumLiteral(pointEEnum, de.cau.cs.kieler.simplerailctrl.POINT.POINT_18);
        addEEnumLiteral(pointEEnum, de.cau.cs.kieler.simplerailctrl.POINT.POINT_19);
        addEEnumLiteral(pointEEnum, de.cau.cs.kieler.simplerailctrl.POINT.POINT_20);
        addEEnumLiteral(pointEEnum, de.cau.cs.kieler.simplerailctrl.POINT.POINT_21);
        addEEnumLiteral(pointEEnum, de.cau.cs.kieler.simplerailctrl.POINT.POINT_22);
        addEEnumLiteral(pointEEnum, de.cau.cs.kieler.simplerailctrl.POINT.POINT_23);
        addEEnumLiteral(pointEEnum, de.cau.cs.kieler.simplerailctrl.POINT.POINT_24);
        addEEnumLiteral(pointEEnum, de.cau.cs.kieler.simplerailctrl.POINT.POINT_25);
        addEEnumLiteral(pointEEnum, de.cau.cs.kieler.simplerailctrl.POINT.POINT_26);
        addEEnumLiteral(pointEEnum, de.cau.cs.kieler.simplerailctrl.POINT.POINT_27);
        addEEnumLiteral(pointEEnum, de.cau.cs.kieler.simplerailctrl.POINT.POINT_28);
        addEEnumLiteral(pointEEnum, de.cau.cs.kieler.simplerailctrl.POINT.POINT_29);
        addEEnumLiteral(pointEEnum, de.cau.cs.kieler.simplerailctrl.POINT.EENUM_LITERAL0);

        initEEnum(positionEEnum, de.cau.cs.kieler.simplerailctrl.POSITION.class, "POSITION");
        addEEnumLiteral(positionEEnum, de.cau.cs.kieler.simplerailctrl.POSITION.FIRST);
        addEEnumLiteral(positionEEnum, de.cau.cs.kieler.simplerailctrl.POSITION.SECOND);

        initEEnum(directionEEnum, de.cau.cs.kieler.simplerailctrl.DIRECTION.class, "DIRECTION");
        addEEnumLiteral(directionEEnum, de.cau.cs.kieler.simplerailctrl.DIRECTION.BRANCH);
        addEEnumLiteral(directionEEnum, de.cau.cs.kieler.simplerailctrl.DIRECTION.STRAIGHT);

        initEEnum(signalcolorEEnum, de.cau.cs.kieler.simplerailctrl.SIGNALCOLOR.class, "SIGNALCOLOR");
        addEEnumLiteral(signalcolorEEnum, de.cau.cs.kieler.simplerailctrl.SIGNALCOLOR.RED);
        addEEnumLiteral(signalcolorEEnum, de.cau.cs.kieler.simplerailctrl.SIGNALCOLOR.OFF);
        addEEnumLiteral(signalcolorEEnum, de.cau.cs.kieler.simplerailctrl.SIGNALCOLOR.GREEN);
        addEEnumLiteral(signalcolorEEnum, de.cau.cs.kieler.simplerailctrl.SIGNALCOLOR.YELLOWGREEN);

        initEEnum(motordirEEnum, de.cau.cs.kieler.simplerailctrl.MOTORDIR.class, "MOTORDIR");
        addEEnumLiteral(motordirEEnum, de.cau.cs.kieler.simplerailctrl.MOTORDIR.FWD);
        addEEnumLiteral(motordirEEnum, de.cau.cs.kieler.simplerailctrl.MOTORDIR.REV);
        addEEnumLiteral(motordirEEnum, de.cau.cs.kieler.simplerailctrl.MOTORDIR.BRAKE);
        addEEnumLiteral(motordirEEnum, de.cau.cs.kieler.simplerailctrl.MOTORDIR.OFF);

        initEEnum(conditionEEnum, de.cau.cs.kieler.simplerailctrl.CONDITION.class, "CONDITION");
        addEEnumLiteral(conditionEEnum, de.cau.cs.kieler.simplerailctrl.CONDITION.IF);
        addEEnumLiteral(conditionEEnum, de.cau.cs.kieler.simplerailctrl.CONDITION.IF_NOT);

        initEEnum(conjunctionEEnum, de.cau.cs.kieler.simplerailctrl.CONJUNCTION.class, "CONJUNCTION");
        addEEnumLiteral(conjunctionEEnum, de.cau.cs.kieler.simplerailctrl.CONJUNCTION.AND);
        addEEnumLiteral(conjunctionEEnum, de.cau.cs.kieler.simplerailctrl.CONJUNCTION.OR);

        // Create resource
        createResource(eNS_URI);
    }

} //SimplerailctrlPackageImpl
