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
package de.cau.cs.kieler.sccharts.impl;

import de.cau.cs.kieler.sccharts.*;

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
public class SCChartsFactoryImpl extends EFactoryImpl implements SCChartsFactory {
    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\r\n\r\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\r\n\r\nCopyright 2013 by\r\n+ Kiel University\r\n  + Department of Computer Science\r\n    + Real-Time and Embedded Systems Group\r\n\r\nThis code is provided under the terms of the Eclipse Public License (EPL).\r\nSee the file epl-v10.html for the license text.";

				/**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SCChartsFactory init() {
        try {
            SCChartsFactory theSCChartsFactory = (SCChartsFactory)EPackage.Registry.INSTANCE.getEFactory(SCChartsPackage.eNS_URI);
            if (theSCChartsFactory != null) {
                return theSCChartsFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new SCChartsFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SCChartsFactoryImpl() {
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
            case SCChartsPackage.SC_CHARTS: return createSCCharts();
            case SCChartsPackage.SCOPE_CALL: return createScopeCall();
            case SCChartsPackage.STATE: return createState();
            case SCChartsPackage.CONTROLFLOW_REGION: return createControlflowRegion();
            case SCChartsPackage.DATAFLOW_REGION: return createDataflowRegion();
            case SCChartsPackage.TRANSITION: return createTransition();
            case SCChartsPackage.ENTRY_ACTION: return createEntryAction();
            case SCChartsPackage.DURING_ACTION: return createDuringAction();
            case SCChartsPackage.EXIT_ACTION: return createExitAction();
            case SCChartsPackage.SUSPEND_ACTION: return createSuspendAction();
            case SCChartsPackage.PRECEDING_ACTION: return createPrecedingAction();
            case SCChartsPackage.SUCCEEDING_ACTION: return createSucceedingAction();
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
            case SCChartsPackage.PREEMPTION_TYPE:
                return createPreemptionTypeFromString(eDataType, initialValue);
            case SCChartsPackage.HISTORY_TYPE:
                return createHistoryTypeFromString(eDataType, initialValue);
            case SCChartsPackage.DELAY_TYPE:
                return createDelayTypeFromString(eDataType, initialValue);
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
            case SCChartsPackage.PREEMPTION_TYPE:
                return convertPreemptionTypeToString(eDataType, instanceValue);
            case SCChartsPackage.HISTORY_TYPE:
                return convertHistoryTypeToString(eDataType, instanceValue);
            case SCChartsPackage.DELAY_TYPE:
                return convertDelayTypeToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public State createState() {
        StateImpl state = new StateImpl();
        return state;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ControlflowRegion createControlflowRegion() {
        ControlflowRegionImpl controlflowRegion = new ControlflowRegionImpl();
        return controlflowRegion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataflowRegion createDataflowRegion() {
        DataflowRegionImpl dataflowRegion = new DataflowRegionImpl();
        return dataflowRegion;
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
    public EntryAction createEntryAction() {
        EntryActionImpl entryAction = new EntryActionImpl();
        return entryAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DuringAction createDuringAction() {
        DuringActionImpl duringAction = new DuringActionImpl();
        return duringAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExitAction createExitAction() {
        ExitActionImpl exitAction = new ExitActionImpl();
        return exitAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SuspendAction createSuspendAction() {
        SuspendActionImpl suspendAction = new SuspendActionImpl();
        return suspendAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PrecedingAction createPrecedingAction() {
        PrecedingActionImpl precedingAction = new PrecedingActionImpl();
        return precedingAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SucceedingAction createSucceedingAction() {
        SucceedingActionImpl succeedingAction = new SucceedingActionImpl();
        return succeedingAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PreemptionType createPreemptionTypeFromString(EDataType eDataType, String initialValue) {
        PreemptionType result = PreemptionType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPreemptionTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SCCharts createSCCharts() {
        SCChartsImpl scCharts = new SCChartsImpl();
        return scCharts;
    }

				/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScopeCall createScopeCall() {
        ScopeCallImpl scopeCall = new ScopeCallImpl();
        return scopeCall;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HistoryType createHistoryTypeFromString(EDataType eDataType, String initialValue) {
        HistoryType result = HistoryType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertHistoryTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DelayType createDelayTypeFromString(EDataType eDataType, String initialValue) {
        DelayType result = DelayType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDelayTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SCChartsPackage getSCChartsPackage() {
        return (SCChartsPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static SCChartsPackage getPackage() {
        return SCChartsPackage.eINSTANCE;
    }

} //SCChartsFactoryImpl
