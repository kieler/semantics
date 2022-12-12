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

import de.cau.cs.kieler.annotations.AnnotationsPackage;

import de.cau.cs.kieler.kexpressions.KExpressionsPackage;

import de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage;

import de.cau.cs.kieler.kexpressions.kext.KExtPackage;

import de.cau.cs.kieler.sccharts.Action;
import de.cau.cs.kieler.sccharts.BaseStateReference;
import de.cau.cs.kieler.sccharts.CodeEffect;
import de.cau.cs.kieler.sccharts.ControlflowRegion;
import de.cau.cs.kieler.sccharts.DataflowAssignment;
import de.cau.cs.kieler.sccharts.DataflowRegion;
import de.cau.cs.kieler.sccharts.DeferredType;
import de.cau.cs.kieler.sccharts.DelayType;
import de.cau.cs.kieler.sccharts.DuringAction;
import de.cau.cs.kieler.sccharts.EntryAction;
import de.cau.cs.kieler.sccharts.ExitAction;
import de.cau.cs.kieler.sccharts.HistoryType;
import de.cau.cs.kieler.sccharts.LocalAction;
import de.cau.cs.kieler.sccharts.ModuleScopeCall;
import de.cau.cs.kieler.sccharts.OdeAction;
import de.cau.cs.kieler.sccharts.PeriodAction;
import de.cau.cs.kieler.sccharts.PolicyClassDeclaration;
import de.cau.cs.kieler.sccharts.PolicyRegion;
import de.cau.cs.kieler.sccharts.PreemptionType;
import de.cau.cs.kieler.sccharts.Region;
import de.cau.cs.kieler.sccharts.SCCharts;
import de.cau.cs.kieler.sccharts.SCChartsFactory;
import de.cau.cs.kieler.sccharts.SCChartsPackage;
import de.cau.cs.kieler.sccharts.Scope;
import de.cau.cs.kieler.sccharts.ScopeCall;
import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.sccharts.SuspendAction;
import de.cau.cs.kieler.sccharts.Transition;

import de.cau.cs.kieler.scl.SCLPackage;

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
public class SCChartsPackageImpl extends EPackageImpl implements SCChartsPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\r\n\r\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\r\n\r\nCopyright 2013 by\r\n+ Kiel University\r\n  + Department of Computer Science\r\n    + Real-Time and Embedded Systems Group\r\n\r\nThis code is provided under the terms of the Eclipse Public License (EPL).\r\nSee the file epl-v10.html for the license text.";

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass scChartsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass scopeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass scopeCallEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass actionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass localActionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass stateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass regionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass controlflowRegionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataflowRegionEClass = null;

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
    private EClass entryActionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass duringActionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass exitActionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass suspendActionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass periodActionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass policyClassDeclarationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass policyRegionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass codeEffectEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataflowAssignmentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass baseStateReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass odeActionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass moduleScopeCallEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum preemptionTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum historyTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum delayTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum deferredTypeEEnum = null;

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
     * @see de.cau.cs.kieler.sccharts.SCChartsPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private SCChartsPackageImpl() {
        super(eNS_URI, SCChartsFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link SCChartsPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static SCChartsPackage init() {
        if (isInited) return (SCChartsPackage)EPackage.Registry.INSTANCE.getEPackage(SCChartsPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredSCChartsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        SCChartsPackageImpl theSCChartsPackage = registeredSCChartsPackage instanceof SCChartsPackageImpl ? (SCChartsPackageImpl)registeredSCChartsPackage : new SCChartsPackageImpl();

        isInited = true;

        // Initialize simple dependencies
        AnnotationsPackage.eINSTANCE.eClass();
        KEffectsPackage.eINSTANCE.eClass();
        KExpressionsPackage.eINSTANCE.eClass();
        KExtPackage.eINSTANCE.eClass();
        SCLPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theSCChartsPackage.createPackageContents();

        // Initialize created meta-data
        theSCChartsPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theSCChartsPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(SCChartsPackage.eNS_URI, theSCChartsPackage);
        return theSCChartsPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSCCharts() {
        return scChartsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSCCharts_RootStates() {
        return (EReference)scChartsEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSCCharts_Imports() {
        return (EAttribute)scChartsEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getScope() {
        return scopeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getScope_Label() {
        return (EAttribute)scopeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getScope_Actions() {
        return (EReference)scopeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getScope_Reference() {
        return (EReference)scopeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getScope_GenericParameterDeclarations() {
        return (EReference)scopeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getScopeCall() {
        return scopeCallEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getScopeCall_Target() {
        return (EReference)scopeCallEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getScopeCall_Super() {
        return (EAttribute)scopeCallEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getScopeCall_GenericParameters() {
        return (EReference)scopeCallEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAction() {
        return actionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAction_Effects() {
        return (EReference)actionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAction_Trigger() {
        return (EReference)actionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAction_TriggerDelay() {
        return (EAttribute)actionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAction_TriggerProbability() {
        return (EAttribute)actionEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAction_Label() {
        return (EAttribute)actionEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAction_Delay() {
        return (EAttribute)actionEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAction_Nondeterministic() {
        return (EAttribute)actionEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLocalAction() {
        return localActionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getState() {
        return stateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getState_ParentRegion() {
        return (EReference)stateEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getState_Regions() {
        return (EReference)stateEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getState_Initial() {
        return (EAttribute)stateEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getState_Final() {
        return (EAttribute)stateEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getState_Violation() {
        return (EAttribute)stateEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getState_Connector() {
        return (EAttribute)stateEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getState_OutgoingTransitions() {
        return (EReference)stateEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getState_IncomingTransitions() {
        return (EReference)stateEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getState_BaseStateReferences() {
        return (EReference)stateEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRegion() {
        return regionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRegion_ParentState() {
        return (EReference)regionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRegion_CounterVariable() {
        return (EReference)regionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRegion_ForStart() {
        return (EReference)regionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRegion_ForEnd() {
        return (EReference)regionEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getRegion_Override() {
        return (EAttribute)regionEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getControlflowRegion() {
        return controlflowRegionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getControlflowRegion_States() {
        return (EReference)controlflowRegionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getControlflowRegion_Final() {
        return (EAttribute)controlflowRegionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getControlflowRegion_Abort() {
        return (EAttribute)controlflowRegionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDataflowRegion() {
        return dataflowRegionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDataflowRegion_Equations() {
        return (EReference)dataflowRegionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDataflowRegion_Once() {
        return (EAttribute)dataflowRegionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTransition() {
        return transitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTransition_Preemption() {
        return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTransition_History() {
        return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTransition_Deferred() {
        return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTransition_TargetState() {
        return (EReference)transitionEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTransition_SourceState() {
        return (EReference)transitionEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEntryAction() {
        return entryActionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEntryAction_Preemption() {
        return (EAttribute)entryActionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDuringAction() {
        return duringActionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDuringAction_Reset() {
        return (EAttribute)duringActionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getExitAction() {
        return exitActionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getExitAction_Preemption() {
        return (EAttribute)exitActionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSuspendAction() {
        return suspendActionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSuspendAction_Weak() {
        return (EAttribute)suspendActionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPeriodAction() {
        return periodActionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPolicyClassDeclaration() {
        return policyClassDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPolicyClassDeclaration_Policy() {
        return (EReference)policyClassDeclarationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPolicyRegion() {
        return policyRegionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCodeEffect() {
        return codeEffectEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDataflowAssignment() {
        return dataflowAssignmentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDataflowAssignment_Sequential() {
        return (EAttribute)dataflowAssignmentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBaseStateReference() {
        return baseStateReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBaseStateReference_Target() {
        return (EReference)baseStateReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBaseStateReference_GenericParameters() {
        return (EReference)baseStateReferenceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBaseStateReference_Parameters() {
        return (EReference)baseStateReferenceEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getOdeAction() {
        return odeActionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getModuleScopeCall() {
        return moduleScopeCallEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getPreemptionType() {
        return preemptionTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getHistoryType() {
        return historyTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getDelayType() {
        return delayTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getDeferredType() {
        return deferredTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SCChartsFactory getSCChartsFactory() {
        return (SCChartsFactory)getEFactoryInstance();
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
        scChartsEClass = createEClass(SC_CHARTS);
        createEReference(scChartsEClass, SC_CHARTS__ROOT_STATES);
        createEAttribute(scChartsEClass, SC_CHARTS__IMPORTS);

        scopeEClass = createEClass(SCOPE);
        createEAttribute(scopeEClass, SCOPE__LABEL);
        createEReference(scopeEClass, SCOPE__ACTIONS);
        createEReference(scopeEClass, SCOPE__REFERENCE);
        createEReference(scopeEClass, SCOPE__GENERIC_PARAMETER_DECLARATIONS);

        scopeCallEClass = createEClass(SCOPE_CALL);
        createEReference(scopeCallEClass, SCOPE_CALL__TARGET);
        createEAttribute(scopeCallEClass, SCOPE_CALL__SUPER);
        createEReference(scopeCallEClass, SCOPE_CALL__GENERIC_PARAMETERS);

        actionEClass = createEClass(ACTION);
        createEReference(actionEClass, ACTION__EFFECTS);
        createEReference(actionEClass, ACTION__TRIGGER);
        createEAttribute(actionEClass, ACTION__TRIGGER_DELAY);
        createEAttribute(actionEClass, ACTION__TRIGGER_PROBABILITY);
        createEAttribute(actionEClass, ACTION__LABEL);
        createEAttribute(actionEClass, ACTION__DELAY);
        createEAttribute(actionEClass, ACTION__NONDETERMINISTIC);

        localActionEClass = createEClass(LOCAL_ACTION);

        stateEClass = createEClass(STATE);
        createEReference(stateEClass, STATE__PARENT_REGION);
        createEReference(stateEClass, STATE__REGIONS);
        createEAttribute(stateEClass, STATE__INITIAL);
        createEAttribute(stateEClass, STATE__FINAL);
        createEAttribute(stateEClass, STATE__VIOLATION);
        createEAttribute(stateEClass, STATE__CONNECTOR);
        createEReference(stateEClass, STATE__OUTGOING_TRANSITIONS);
        createEReference(stateEClass, STATE__INCOMING_TRANSITIONS);
        createEReference(stateEClass, STATE__BASE_STATE_REFERENCES);

        regionEClass = createEClass(REGION);
        createEReference(regionEClass, REGION__PARENT_STATE);
        createEReference(regionEClass, REGION__COUNTER_VARIABLE);
        createEReference(regionEClass, REGION__FOR_START);
        createEReference(regionEClass, REGION__FOR_END);
        createEAttribute(regionEClass, REGION__OVERRIDE);

        controlflowRegionEClass = createEClass(CONTROLFLOW_REGION);
        createEReference(controlflowRegionEClass, CONTROLFLOW_REGION__STATES);
        createEAttribute(controlflowRegionEClass, CONTROLFLOW_REGION__FINAL);
        createEAttribute(controlflowRegionEClass, CONTROLFLOW_REGION__ABORT);

        dataflowRegionEClass = createEClass(DATAFLOW_REGION);
        createEReference(dataflowRegionEClass, DATAFLOW_REGION__EQUATIONS);
        createEAttribute(dataflowRegionEClass, DATAFLOW_REGION__ONCE);

        transitionEClass = createEClass(TRANSITION);
        createEAttribute(transitionEClass, TRANSITION__PREEMPTION);
        createEAttribute(transitionEClass, TRANSITION__HISTORY);
        createEAttribute(transitionEClass, TRANSITION__DEFERRED);
        createEReference(transitionEClass, TRANSITION__TARGET_STATE);
        createEReference(transitionEClass, TRANSITION__SOURCE_STATE);

        entryActionEClass = createEClass(ENTRY_ACTION);
        createEAttribute(entryActionEClass, ENTRY_ACTION__PREEMPTION);

        duringActionEClass = createEClass(DURING_ACTION);
        createEAttribute(duringActionEClass, DURING_ACTION__RESET);

        exitActionEClass = createEClass(EXIT_ACTION);
        createEAttribute(exitActionEClass, EXIT_ACTION__PREEMPTION);

        suspendActionEClass = createEClass(SUSPEND_ACTION);
        createEAttribute(suspendActionEClass, SUSPEND_ACTION__WEAK);

        periodActionEClass = createEClass(PERIOD_ACTION);

        policyClassDeclarationEClass = createEClass(POLICY_CLASS_DECLARATION);
        createEReference(policyClassDeclarationEClass, POLICY_CLASS_DECLARATION__POLICY);

        policyRegionEClass = createEClass(POLICY_REGION);

        codeEffectEClass = createEClass(CODE_EFFECT);

        dataflowAssignmentEClass = createEClass(DATAFLOW_ASSIGNMENT);
        createEAttribute(dataflowAssignmentEClass, DATAFLOW_ASSIGNMENT__SEQUENTIAL);

        baseStateReferenceEClass = createEClass(BASE_STATE_REFERENCE);
        createEReference(baseStateReferenceEClass, BASE_STATE_REFERENCE__TARGET);
        createEReference(baseStateReferenceEClass, BASE_STATE_REFERENCE__GENERIC_PARAMETERS);
        createEReference(baseStateReferenceEClass, BASE_STATE_REFERENCE__PARAMETERS);

        odeActionEClass = createEClass(ODE_ACTION);

        moduleScopeCallEClass = createEClass(MODULE_SCOPE_CALL);

        // Create enums
        preemptionTypeEEnum = createEEnum(PREEMPTION_TYPE);
        historyTypeEEnum = createEEnum(HISTORY_TYPE);
        delayTypeEEnum = createEEnum(DELAY_TYPE);
        deferredTypeEEnum = createEEnum(DEFERRED_TYPE);
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

        // Obtain other dependent packages
        AnnotationsPackage theAnnotationsPackage = (AnnotationsPackage)EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI);
        KExtPackage theKExtPackage = (KExtPackage)EPackage.Registry.INSTANCE.getEPackage(KExtPackage.eNS_URI);
        KExpressionsPackage theKExpressionsPackage = (KExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(KExpressionsPackage.eNS_URI);
        KEffectsPackage theKEffectsPackage = (KEffectsPackage)EPackage.Registry.INSTANCE.getEPackage(KEffectsPackage.eNS_URI);
        SCLPackage theSCLPackage = (SCLPackage)EPackage.Registry.INSTANCE.getEPackage(SCLPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        scChartsEClass.getESuperTypes().add(theAnnotationsPackage.getPragmatable());
        scChartsEClass.getESuperTypes().add(theAnnotationsPackage.getNameable());
        scopeEClass.getESuperTypes().add(theAnnotationsPackage.getAnnotatable());
        scopeEClass.getESuperTypes().add(theKExtPackage.getDeclarationScope());
        scopeEClass.getESuperTypes().add(theAnnotationsPackage.getNamedObject());
        scopeEClass.getESuperTypes().add(theKExpressionsPackage.getSchedulable());
        scopeEClass.getESuperTypes().add(theKEffectsPackage.getLinkable());
        scopeCallEClass.getESuperTypes().add(theKExpressionsPackage.getCall());
        actionEClass.getESuperTypes().add(theAnnotationsPackage.getAnnotatable());
        actionEClass.getESuperTypes().add(theKEffectsPackage.getLinkable());
        localActionEClass.getESuperTypes().add(this.getAction());
        stateEClass.getESuperTypes().add(this.getScope());
        regionEClass.getESuperTypes().add(this.getScope());
        controlflowRegionEClass.getESuperTypes().add(this.getRegion());
        dataflowRegionEClass.getESuperTypes().add(this.getRegion());
        transitionEClass.getESuperTypes().add(this.getAction());
        entryActionEClass.getESuperTypes().add(this.getLocalAction());
        duringActionEClass.getESuperTypes().add(this.getLocalAction());
        exitActionEClass.getESuperTypes().add(this.getLocalAction());
        suspendActionEClass.getESuperTypes().add(this.getLocalAction());
        periodActionEClass.getESuperTypes().add(this.getLocalAction());
        policyClassDeclarationEClass.getESuperTypes().add(theKExtPackage.getClassDeclaration());
        policyRegionEClass.getESuperTypes().add(this.getControlflowRegion());
        codeEffectEClass.getESuperTypes().add(theKEffectsPackage.getEffect());
        codeEffectEClass.getESuperTypes().add(theSCLPackage.getScope());
        dataflowAssignmentEClass.getESuperTypes().add(theKEffectsPackage.getAssignment());
        odeActionEClass.getESuperTypes().add(this.getLocalAction());
        moduleScopeCallEClass.getESuperTypes().add(this.getScopeCall());

        // Initialize classes and features; add operations and parameters
        initEClass(scChartsEClass, SCCharts.class, "SCCharts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSCCharts_RootStates(), this.getState(), null, "rootStates", null, 0, -1, SCCharts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSCCharts_Imports(), ecorePackage.getEString(), "imports", null, 0, -1, SCCharts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(scopeEClass, Scope.class, "Scope", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getScope_Label(), ecorePackage.getEString(), "label", null, 0, 1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getScope_Actions(), this.getLocalAction(), null, "actions", null, 0, -1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getScope_Reference(), this.getScopeCall(), null, "reference", null, 0, 1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getScope_GenericParameterDeclarations(), theKExpressionsPackage.getGenericParameterDeclaration(), null, "genericParameterDeclarations", null, 0, -1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(scopeCallEClass, ScopeCall.class, "ScopeCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getScopeCall_Target(), theAnnotationsPackage.getNamedObject(), null, "target", null, 0, 1, ScopeCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getScopeCall_Super(), ecorePackage.getEBoolean(), "super", null, 1, 1, ScopeCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getScopeCall_GenericParameters(), theKExpressionsPackage.getParameter(), null, "genericParameters", null, 0, -1, ScopeCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAction_Effects(), theKEffectsPackage.getEffect(), null, "effects", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAction_Trigger(), theKExpressionsPackage.getExpression(), null, "trigger", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAction_TriggerDelay(), ecorePackage.getEInt(), "triggerDelay", "1", 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAction_TriggerProbability(), ecorePackage.getEDouble(), "triggerProbability", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAction_Label(), ecorePackage.getEString(), "label", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getAction_Delay(), this.getDelayType(), "delay", "UNDEFINED", 1, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAction_Nondeterministic(), ecorePackage.getEBoolean(), "nondeterministic", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(localActionEClass, LocalAction.class, "LocalAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getState_ParentRegion(), this.getControlflowRegion(), this.getControlflowRegion_States(), "parentRegion", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getState_Regions(), this.getRegion(), this.getRegion_ParentState(), "regions", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getState_Initial(), ecorePackage.getEBoolean(), "initial", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getState_Final(), ecorePackage.getEBoolean(), "final", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getState_Violation(), ecorePackage.getEBoolean(), "violation", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getState_Connector(), ecorePackage.getEBoolean(), "connector", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getState_OutgoingTransitions(), this.getTransition(), this.getTransition_SourceState(), "outgoingTransitions", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getState_IncomingTransitions(), this.getTransition(), this.getTransition_TargetState(), "incomingTransitions", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getState_BaseStateReferences(), this.getBaseStateReference(), null, "baseStateReferences", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(regionEClass, Region.class, "Region", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRegion_ParentState(), this.getState(), this.getState_Regions(), "parentState", null, 0, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRegion_CounterVariable(), theKExpressionsPackage.getValuedObject(), null, "counterVariable", null, 0, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRegion_ForStart(), theKExpressionsPackage.getExpression(), null, "forStart", null, 0, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRegion_ForEnd(), theKExpressionsPackage.getExpression(), null, "forEnd", null, 0, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRegion_Override(), ecorePackage.getEBoolean(), "override", null, 0, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(controlflowRegionEClass, ControlflowRegion.class, "ControlflowRegion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getControlflowRegion_States(), this.getState(), this.getState_ParentRegion(), "states", null, 0, -1, ControlflowRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getControlflowRegion_Final(), ecorePackage.getEBoolean(), "final", null, 0, 1, ControlflowRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getControlflowRegion_Abort(), ecorePackage.getEBoolean(), "abort", null, 0, 1, ControlflowRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dataflowRegionEClass, DataflowRegion.class, "DataflowRegion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDataflowRegion_Equations(), theKEffectsPackage.getAssignment(), null, "equations", null, 0, -1, DataflowRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDataflowRegion_Once(), ecorePackage.getEBoolean(), "once", null, 1, 1, DataflowRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTransition_Preemption(), this.getPreemptionType(), "preemption", "WEAK", 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTransition_History(), this.getHistoryType(), "history", "RESET", 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTransition_Deferred(), this.getDeferredType(), "deferred", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTransition_TargetState(), this.getState(), this.getState_IncomingTransitions(), "targetState", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTransition_SourceState(), this.getState(), this.getState_OutgoingTransitions(), "sourceState", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(entryActionEClass, EntryAction.class, "EntryAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEntryAction_Preemption(), this.getPreemptionType(), "preemption", "STRONG", 0, 1, EntryAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(duringActionEClass, DuringAction.class, "DuringAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDuringAction_Reset(), this.getDelayType(), "reset", "UNDEFINED", 1, 1, DuringAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(exitActionEClass, ExitAction.class, "ExitAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getExitAction_Preemption(), this.getPreemptionType(), "preemption", "STRONG", 0, 1, ExitAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(suspendActionEClass, SuspendAction.class, "SuspendAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSuspendAction_Weak(), ecorePackage.getEBoolean(), "weak", null, 0, 1, SuspendAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(periodActionEClass, PeriodAction.class, "PeriodAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(policyClassDeclarationEClass, PolicyClassDeclaration.class, "PolicyClassDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPolicyClassDeclaration_Policy(), this.getPolicyRegion(), null, "policy", null, 0, 1, PolicyClassDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(policyRegionEClass, PolicyRegion.class, "PolicyRegion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(codeEffectEClass, CodeEffect.class, "CodeEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(dataflowAssignmentEClass, DataflowAssignment.class, "DataflowAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDataflowAssignment_Sequential(), ecorePackage.getEBoolean(), "sequential", "false", 0, 1, DataflowAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(baseStateReferenceEClass, BaseStateReference.class, "BaseStateReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBaseStateReference_Target(), this.getState(), null, "target", null, 0, 1, BaseStateReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBaseStateReference_GenericParameters(), theKExpressionsPackage.getParameter(), null, "genericParameters", null, 0, -1, BaseStateReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBaseStateReference_Parameters(), theKExpressionsPackage.getParameter(), null, "parameters", null, 0, -1, BaseStateReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(odeActionEClass, OdeAction.class, "OdeAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(moduleScopeCallEClass, ModuleScopeCall.class, "ModuleScopeCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Initialize enums and add enum literals
        initEEnum(preemptionTypeEEnum, PreemptionType.class, "PreemptionType");
        addEEnumLiteral(preemptionTypeEEnum, PreemptionType.UNDEFINED);
        addEEnumLiteral(preemptionTypeEEnum, PreemptionType.WEAK);
        addEEnumLiteral(preemptionTypeEEnum, PreemptionType.STRONG);
        addEEnumLiteral(preemptionTypeEEnum, PreemptionType.TERMINATION);

        initEEnum(historyTypeEEnum, HistoryType.class, "HistoryType");
        addEEnumLiteral(historyTypeEEnum, HistoryType.RESET);
        addEEnumLiteral(historyTypeEEnum, HistoryType.SHALLOW);
        addEEnumLiteral(historyTypeEEnum, HistoryType.DEEP);

        initEEnum(delayTypeEEnum, DelayType.class, "DelayType");
        addEEnumLiteral(delayTypeEEnum, DelayType.UNDEFINED);
        addEEnumLiteral(delayTypeEEnum, DelayType.DELAYED);
        addEEnumLiteral(delayTypeEEnum, DelayType.IMMEDIATE);
        addEEnumLiteral(delayTypeEEnum, DelayType.AUTOMATIC);

        initEEnum(deferredTypeEEnum, DeferredType.class, "DeferredType");
        addEEnumLiteral(deferredTypeEEnum, DeferredType.NONE);
        addEEnumLiteral(deferredTypeEEnum, DeferredType.SHALLOW);
        addEEnumLiteral(deferredTypeEEnum, DeferredType.DEEP);

        // Create resource
        createResource(eNS_URI);
    }

} //SCChartsPackageImpl
