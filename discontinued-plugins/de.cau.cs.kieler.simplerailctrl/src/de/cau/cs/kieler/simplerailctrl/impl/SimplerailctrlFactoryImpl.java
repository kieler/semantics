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

import de.cau.cs.kieler.simplerailctrl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplerailctrlFactoryImpl extends EFactoryImpl implements SimplerailctrlFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SimplerailctrlFactory init() {
        try {
            SimplerailctrlFactory theSimplerailctrlFactory = (SimplerailctrlFactory)EPackage.Registry.INSTANCE.getEFactory("de.cau.cs.kieler.simplerailctrl"); 
            if (theSimplerailctrlFactory != null) {
                return theSimplerailctrlFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new SimplerailctrlFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SimplerailctrlFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case SimplerailctrlPackage.EVENT_WAIT: return createEventWait();
            case SimplerailctrlPackage.NODE: return createNode();
            case SimplerailctrlPackage.TRANSITION: return createTransition();
            case SimplerailctrlPackage.EVENT_CONTACT: return createEventContact();
            case SimplerailctrlPackage.SET_SPEED: return createSetSpeed();
            case SimplerailctrlPackage.SET_POINT: return createSetPoint();
            case SimplerailctrlPackage.RAIL_CONTROLLER: return createRailController();
            case SimplerailctrlPackage.SET_SIGNAL: return createSetSignal();
            case SimplerailctrlPackage.EVENT_OCCUPIED: return createEventOccupied();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case SimplerailctrlPackage.TRACK:
                return createTRACKFromString(eDataType, initialValue);
            case SimplerailctrlPackage.POINT:
                return createPOINTFromString(eDataType, initialValue);
            case SimplerailctrlPackage.POSITION:
                return createPOSITIONFromString(eDataType, initialValue);
            case SimplerailctrlPackage.DIRECTION:
                return createDIRECTIONFromString(eDataType, initialValue);
            case SimplerailctrlPackage.SIGNALCOLOR:
                return createSIGNALCOLORFromString(eDataType, initialValue);
            case SimplerailctrlPackage.MOTORDIR:
                return createMOTORDIRFromString(eDataType, initialValue);
            case SimplerailctrlPackage.CONDITION:
                return createCONDITIONFromString(eDataType, initialValue);
            case SimplerailctrlPackage.CONJUNCTION:
                return createCONJUNCTIONFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case SimplerailctrlPackage.TRACK:
                return convertTRACKToString(eDataType, instanceValue);
            case SimplerailctrlPackage.POINT:
                return convertPOINTToString(eDataType, instanceValue);
            case SimplerailctrlPackage.POSITION:
                return convertPOSITIONToString(eDataType, instanceValue);
            case SimplerailctrlPackage.DIRECTION:
                return convertDIRECTIONToString(eDataType, instanceValue);
            case SimplerailctrlPackage.SIGNALCOLOR:
                return convertSIGNALCOLORToString(eDataType, instanceValue);
            case SimplerailctrlPackage.MOTORDIR:
                return convertMOTORDIRToString(eDataType, instanceValue);
            case SimplerailctrlPackage.CONDITION:
                return convertCONDITIONToString(eDataType, instanceValue);
            case SimplerailctrlPackage.CONJUNCTION:
                return convertCONJUNCTIONToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventWait createEventWait() {
        EventWaitImpl eventWait = new EventWaitImpl();
        return eventWait;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Node createNode() {
        NodeImpl node = new NodeImpl();
        return node;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Transition createTransition() {
        TransitionImpl transition = new TransitionImpl();
        return transition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventContact createEventContact() {
        EventContactImpl eventContact = new EventContactImpl();
        return eventContact;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SetSpeed createSetSpeed() {
        SetSpeedImpl setSpeed = new SetSpeedImpl();
        return setSpeed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SetPoint createSetPoint() {
        SetPointImpl setPoint = new SetPointImpl();
        return setPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RailController createRailController() {
        RailControllerImpl railController = new RailControllerImpl();
        return railController;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SetSignal createSetSignal() {
        SetSignalImpl setSignal = new SetSignalImpl();
        return setSignal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventOccupied createEventOccupied() {
        EventOccupiedImpl eventOccupied = new EventOccupiedImpl();
        return eventOccupied;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TRACK createTRACKFromString(EDataType eDataType, String initialValue) {
        TRACK result = TRACK.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTRACKToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public POINT createPOINTFromString(EDataType eDataType, String initialValue) {
        POINT result = POINT.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPOINTToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public POSITION createPOSITIONFromString(EDataType eDataType, String initialValue) {
        POSITION result = POSITION.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPOSITIONToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DIRECTION createDIRECTIONFromString(EDataType eDataType, String initialValue) {
        DIRECTION result = DIRECTION.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDIRECTIONToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SIGNALCOLOR createSIGNALCOLORFromString(EDataType eDataType, String initialValue) {
        SIGNALCOLOR result = SIGNALCOLOR.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSIGNALCOLORToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MOTORDIR createMOTORDIRFromString(EDataType eDataType, String initialValue) {
        MOTORDIR result = MOTORDIR.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMOTORDIRToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CONDITION createCONDITIONFromString(EDataType eDataType, String initialValue) {
        CONDITION result = CONDITION.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertCONDITIONToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CONJUNCTION createCONJUNCTIONFromString(EDataType eDataType, String initialValue) {
        CONJUNCTION result = CONJUNCTION.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertCONJUNCTIONToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SimplerailctrlPackage getSimplerailctrlPackage() {
        return (SimplerailctrlPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static SimplerailctrlPackage getPackage() {
        return SimplerailctrlPackage.eINSTANCE;
    }

} //SimplerailctrlFactoryImpl
