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
import de.cau.cs.kieler.sccharts.Action;
import de.cau.cs.kieler.sccharts.Binding;
import de.cau.cs.kieler.sccharts.CallNode;
import de.cau.cs.kieler.sccharts.ControlflowRegion;
import de.cau.cs.kieler.sccharts.DataflowRegion;
import de.cau.cs.kieler.sccharts.DefineNode;
import de.cau.cs.kieler.sccharts.DuringAction;
import de.cau.cs.kieler.sccharts.EntryAction;
import de.cau.cs.kieler.sccharts.Equation;
import de.cau.cs.kieler.sccharts.ExitAction;
import de.cau.cs.kieler.sccharts.HistoryType;
import de.cau.cs.kieler.sccharts.IterateAction;
import de.cau.cs.kieler.sccharts.LocalAction;
import de.cau.cs.kieler.sccharts.Node;
import de.cau.cs.kieler.sccharts.ReferenceNode;
import de.cau.cs.kieler.sccharts.Region;
import de.cau.cs.kieler.sccharts.SCChartsFactory;
import de.cau.cs.kieler.sccharts.SCChartsPackage;
import de.cau.cs.kieler.sccharts.Scope;
import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.sccharts.StateType;
import de.cau.cs.kieler.sccharts.SuspendAction;
import de.cau.cs.kieler.sccharts.Transition;
import de.cau.cs.kieler.sccharts.TransitionType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
    public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Kiel University\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

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
    private EClass nodeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass referenceNodeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass callNodeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass defineNodeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass equationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass bindingEClass = null;

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
    private EClass scopeEClass = null;

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
    private EClass iterateActionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum stateTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum transitionTypeEEnum = null;

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
    private EDataType parsableEDataType = null;

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
        SCChartsPackageImpl theSCChartsPackage = (SCChartsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SCChartsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SCChartsPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        KEffectsPackage.eINSTANCE.eClass();

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
    public EClass getAction() {
        return actionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAction_Effects() {
        return (EReference)actionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAction_Trigger() {
        return (EReference)actionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAction_Delay() {
        return (EAttribute)actionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAction_Label() {
        return (EAttribute)actionEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAction_Immediate() {
        return (EAttribute)actionEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getState() {
        return stateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getState_Type() {
        return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getState_Regions() {
        return (EReference)stateEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getState_ParentRegion() {
        return (EReference)stateEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getState_Initial() {
        return (EAttribute)stateEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getState_Final() {
        return (EAttribute)stateEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getState_OutgoingTransitions() {
        return (EReference)stateEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getState_IncomingTransitions() {
        return (EReference)stateEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRegion() {
        return regionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRegion_ParentState() {
        return (EReference)regionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getControlflowRegion() {
        return controlflowRegionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getControlflowRegion_States() {
        return (EReference)controlflowRegionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataflowRegion() {
        return dataflowRegionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataflowRegion_Nodes() {
        return (EReference)dataflowRegionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataflowRegion_Equations() {
        return (EReference)dataflowRegionEClass.getEStructuralFeatures().get(1);
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
    public EAttribute getNode_Id() {
        return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNode_Label() {
        return (EAttribute)nodeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getReferenceNode() {
        return referenceNodeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getReferenceNode_ReferencedScope() {
        return (EReference)referenceNodeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getReferenceNode_Parameters() {
        return (EReference)referenceNodeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCallNode() {
        return callNodeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCallNode_CallReference() {
        return (EReference)callNodeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCallNode_Parameters() {
        return (EReference)callNodeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDefineNode() {
        return defineNodeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDefineNode_Inputs() {
        return (EReference)defineNodeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDefineNode_Outputs() {
        return (EReference)defineNodeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDefineNode_ValuedObjects() {
        return (EReference)defineNodeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDefineNode_Expressions() {
        return (EReference)defineNodeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDefineNode_States() {
        return (EReference)defineNodeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEquation() {
        return equationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEquation_Expression() {
        return (EReference)equationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEquation_Node() {
        return (EReference)equationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEquation_ValuedObject() {
        return (EReference)equationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBinding() {
        return bindingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBinding_Formal() {
        return (EReference)bindingEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBinding_Actual() {
        return (EReference)bindingEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBinding_Indices() {
        return (EReference)bindingEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBinding_Value() {
        return (EReference)bindingEClass.getEStructuralFeatures().get(3);
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
    public EAttribute getTransition_Priority() {
        return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTransition_Type() {
        return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTransition_Deferred() {
        return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTransition_History() {
        return (EAttribute)transitionEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTransition_TargetState() {
        return (EReference)transitionEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTransition_SourceState() {
        return (EReference)transitionEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getScope() {
        return scopeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getScope_Id() {
        return (EAttribute)scopeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getScope_Label() {
        return (EAttribute)scopeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getScope_LocalActions() {
        return (EReference)scopeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getScope_ReferencedScope() {
        return (EReference)scopeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getScope_Bindings() {
        return (EReference)scopeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getScope_Declarations() {
        return (EReference)scopeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLocalAction() {
        return localActionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEntryAction() {
        return entryActionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDuringAction() {
        return duringActionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExitAction() {
        return exitActionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSuspendAction() {
        return suspendActionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSuspendAction_Weak() {
        return (EAttribute)suspendActionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIterateAction() {
        return iterateActionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getStateType() {
        return stateTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getTransitionType() {
        return transitionTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getHistoryType() {
        return historyTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getParsable() {
        return parsableEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
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
        actionEClass = createEClass(ACTION);
        createEReference(actionEClass, ACTION__EFFECTS);
        createEReference(actionEClass, ACTION__TRIGGER);
        createEAttribute(actionEClass, ACTION__DELAY);
        createEAttribute(actionEClass, ACTION__LABEL);
        createEAttribute(actionEClass, ACTION__IMMEDIATE);

        stateEClass = createEClass(STATE);
        createEAttribute(stateEClass, STATE__TYPE);
        createEReference(stateEClass, STATE__REGIONS);
        createEReference(stateEClass, STATE__PARENT_REGION);
        createEAttribute(stateEClass, STATE__INITIAL);
        createEAttribute(stateEClass, STATE__FINAL);
        createEReference(stateEClass, STATE__OUTGOING_TRANSITIONS);
        createEReference(stateEClass, STATE__INCOMING_TRANSITIONS);

        regionEClass = createEClass(REGION);
        createEReference(regionEClass, REGION__PARENT_STATE);

        controlflowRegionEClass = createEClass(CONTROLFLOW_REGION);
        createEReference(controlflowRegionEClass, CONTROLFLOW_REGION__STATES);

        dataflowRegionEClass = createEClass(DATAFLOW_REGION);
        createEReference(dataflowRegionEClass, DATAFLOW_REGION__NODES);
        createEReference(dataflowRegionEClass, DATAFLOW_REGION__EQUATIONS);

        nodeEClass = createEClass(NODE);
        createEAttribute(nodeEClass, NODE__ID);
        createEAttribute(nodeEClass, NODE__LABEL);

        referenceNodeEClass = createEClass(REFERENCE_NODE);
        createEReference(referenceNodeEClass, REFERENCE_NODE__REFERENCED_SCOPE);
        createEReference(referenceNodeEClass, REFERENCE_NODE__PARAMETERS);

        callNodeEClass = createEClass(CALL_NODE);
        createEReference(callNodeEClass, CALL_NODE__CALL_REFERENCE);
        createEReference(callNodeEClass, CALL_NODE__PARAMETERS);

        defineNodeEClass = createEClass(DEFINE_NODE);
        createEReference(defineNodeEClass, DEFINE_NODE__INPUTS);
        createEReference(defineNodeEClass, DEFINE_NODE__OUTPUTS);
        createEReference(defineNodeEClass, DEFINE_NODE__VALUED_OBJECTS);
        createEReference(defineNodeEClass, DEFINE_NODE__EXPRESSIONS);
        createEReference(defineNodeEClass, DEFINE_NODE__STATES);

        equationEClass = createEClass(EQUATION);
        createEReference(equationEClass, EQUATION__EXPRESSION);
        createEReference(equationEClass, EQUATION__NODE);
        createEReference(equationEClass, EQUATION__VALUED_OBJECT);

        bindingEClass = createEClass(BINDING);
        createEReference(bindingEClass, BINDING__FORMAL);
        createEReference(bindingEClass, BINDING__ACTUAL);
        createEReference(bindingEClass, BINDING__INDICES);
        createEReference(bindingEClass, BINDING__VALUE);

        transitionEClass = createEClass(TRANSITION);
        createEAttribute(transitionEClass, TRANSITION__PRIORITY);
        createEAttribute(transitionEClass, TRANSITION__TYPE);
        createEAttribute(transitionEClass, TRANSITION__DEFERRED);
        createEAttribute(transitionEClass, TRANSITION__HISTORY);
        createEReference(transitionEClass, TRANSITION__TARGET_STATE);
        createEReference(transitionEClass, TRANSITION__SOURCE_STATE);

        scopeEClass = createEClass(SCOPE);
        createEAttribute(scopeEClass, SCOPE__ID);
        createEAttribute(scopeEClass, SCOPE__LABEL);
        createEReference(scopeEClass, SCOPE__LOCAL_ACTIONS);
        createEReference(scopeEClass, SCOPE__REFERENCED_SCOPE);
        createEReference(scopeEClass, SCOPE__BINDINGS);
        createEReference(scopeEClass, SCOPE__DECLARATIONS);

        localActionEClass = createEClass(LOCAL_ACTION);

        entryActionEClass = createEClass(ENTRY_ACTION);

        duringActionEClass = createEClass(DURING_ACTION);

        exitActionEClass = createEClass(EXIT_ACTION);

        suspendActionEClass = createEClass(SUSPEND_ACTION);
        createEAttribute(suspendActionEClass, SUSPEND_ACTION__WEAK);

        iterateActionEClass = createEClass(ITERATE_ACTION);

        // Create enums
        stateTypeEEnum = createEEnum(STATE_TYPE);
        transitionTypeEEnum = createEEnum(TRANSITION_TYPE);
        historyTypeEEnum = createEEnum(HISTORY_TYPE);

        // Create data types
        parsableEDataType = createEDataType(PARSABLE);
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
        KEffectsPackage theKEffectsPackage = (KEffectsPackage)EPackage.Registry.INSTANCE.getEPackage(KEffectsPackage.eNS_URI);
        KExpressionsPackage theKExpressionsPackage = (KExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(KExpressionsPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        actionEClass.getESuperTypes().add(theAnnotationsPackage.getAnnotatable());
        stateEClass.getESuperTypes().add(this.getScope());
        regionEClass.getESuperTypes().add(this.getScope());
        controlflowRegionEClass.getESuperTypes().add(this.getRegion());
        dataflowRegionEClass.getESuperTypes().add(this.getRegion());
        nodeEClass.getESuperTypes().add(theAnnotationsPackage.getAnnotatable());
        referenceNodeEClass.getESuperTypes().add(this.getNode());
        callNodeEClass.getESuperTypes().add(this.getNode());
        defineNodeEClass.getESuperTypes().add(this.getNode());
        bindingEClass.getESuperTypes().add(theAnnotationsPackage.getAnnotatable());
        transitionEClass.getESuperTypes().add(this.getAction());
        scopeEClass.getESuperTypes().add(theAnnotationsPackage.getAnnotatable());
        localActionEClass.getESuperTypes().add(this.getAction());
        entryActionEClass.getESuperTypes().add(this.getLocalAction());
        duringActionEClass.getESuperTypes().add(this.getLocalAction());
        exitActionEClass.getESuperTypes().add(this.getLocalAction());
        suspendActionEClass.getESuperTypes().add(this.getLocalAction());
        iterateActionEClass.getESuperTypes().add(this.getLocalAction());

        // Initialize classes and features; add operations and parameters
        initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAction_Effects(), theKEffectsPackage.getEffect(), null, "effects", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAction_Trigger(), theKExpressionsPackage.getExpression(), null, "trigger", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAction_Delay(), ecorePackage.getEInt(), "delay", "1", 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAction_Label(), ecorePackage.getEString(), "label", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getAction_Immediate(), ecorePackage.getEBoolean(), "immediate", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getState_Type(), this.getStateType(), "type", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getState_Regions(), this.getRegion(), this.getRegion_ParentState(), "regions", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getState_ParentRegion(), this.getControlflowRegion(), this.getControlflowRegion_States(), "parentRegion", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getState_Initial(), ecorePackage.getEBoolean(), "initial", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getState_Final(), ecorePackage.getEBoolean(), "final", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getState_OutgoingTransitions(), this.getTransition(), this.getTransition_SourceState(), "outgoingTransitions", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getState_IncomingTransitions(), this.getTransition(), this.getTransition_TargetState(), "incomingTransitions", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(regionEClass, Region.class, "Region", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRegion_ParentState(), this.getState(), this.getState_Regions(), "parentState", null, 0, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(controlflowRegionEClass, ControlflowRegion.class, "ControlflowRegion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getControlflowRegion_States(), this.getState(), this.getState_ParentRegion(), "states", null, 0, -1, ControlflowRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dataflowRegionEClass, DataflowRegion.class, "DataflowRegion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDataflowRegion_Nodes(), this.getNode(), null, "nodes", null, 0, -1, DataflowRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDataflowRegion_Equations(), this.getEquation(), null, "equations", null, 0, -1, DataflowRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getNode_Id(), ecorePackage.getEString(), "id", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNode_Label(), ecorePackage.getEString(), "label", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(referenceNodeEClass, ReferenceNode.class, "ReferenceNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getReferenceNode_ReferencedScope(), this.getScope(), null, "referencedScope", null, 0, 1, ReferenceNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getReferenceNode_Parameters(), theKExpressionsPackage.getValuedObjectReference(), null, "parameters", null, 0, -1, ReferenceNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(callNodeEClass, CallNode.class, "CallNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCallNode_CallReference(), this.getDefineNode(), null, "callReference", null, 1, 1, CallNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCallNode_Parameters(), theKExpressionsPackage.getValuedObjectReference(), null, "parameters", null, 0, -1, CallNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(defineNodeEClass, DefineNode.class, "DefineNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDefineNode_Inputs(), theKExpressionsPackage.getDeclaration(), null, "inputs", null, 0, -1, DefineNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDefineNode_Outputs(), theKExpressionsPackage.getDeclaration(), null, "outputs", null, 0, -1, DefineNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDefineNode_ValuedObjects(), theKExpressionsPackage.getValuedObject(), null, "valuedObjects", null, 0, -1, DefineNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDefineNode_Expressions(), theKExpressionsPackage.getExpression(), null, "expressions", null, 0, -1, DefineNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDefineNode_States(), this.getState(), null, "states", null, 0, -1, DefineNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(equationEClass, Equation.class, "Equation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEquation_Expression(), theKExpressionsPackage.getExpression(), null, "expression", null, 1, 1, Equation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEquation_Node(), this.getNode(), null, "node", null, 0, 1, Equation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEquation_ValuedObject(), theKExpressionsPackage.getValuedObject(), null, "valuedObject", null, 1, 1, Equation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(bindingEClass, Binding.class, "Binding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBinding_Formal(), theKExpressionsPackage.getValuedObject(), null, "formal", null, 0, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBinding_Actual(), theKExpressionsPackage.getValuedObject(), null, "actual", null, 0, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBinding_Indices(), theKExpressionsPackage.getExpression(), null, "indices", null, 0, -1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBinding_Value(), theKExpressionsPackage.getValue(), null, "value", null, 0, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTransition_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTransition_Type(), this.getTransitionType(), "type", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTransition_Deferred(), ecorePackage.getEBoolean(), "deferred", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTransition_History(), this.getHistoryType(), "history", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTransition_TargetState(), this.getState(), this.getState_IncomingTransitions(), "targetState", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTransition_SourceState(), this.getState(), this.getState_OutgoingTransitions(), "sourceState", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(scopeEClass, Scope.class, "Scope", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getScope_Id(), ecorePackage.getEString(), "id", null, 0, 1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getScope_Label(), ecorePackage.getEString(), "label", null, 0, 1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getScope_LocalActions(), this.getLocalAction(), null, "localActions", null, 0, -1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getScope_ReferencedScope(), this.getScope(), null, "referencedScope", null, 0, 1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getScope_Bindings(), this.getBinding(), null, "bindings", null, 0, -1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getScope_Declarations(), theKExpressionsPackage.getDeclaration(), null, "declarations", null, 0, -1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(localActionEClass, LocalAction.class, "LocalAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(entryActionEClass, EntryAction.class, "EntryAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(duringActionEClass, DuringAction.class, "DuringAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(exitActionEClass, ExitAction.class, "ExitAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(suspendActionEClass, SuspendAction.class, "SuspendAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSuspendAction_Weak(), ecorePackage.getEBoolean(), "weak", null, 0, 1, SuspendAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(iterateActionEClass, IterateAction.class, "IterateAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Initialize enums and add enum literals
        initEEnum(stateTypeEEnum, StateType.class, "StateType");
        addEEnumLiteral(stateTypeEEnum, StateType.NORMAL);
        addEEnumLiteral(stateTypeEEnum, StateType.CONNECTOR);
        addEEnumLiteral(stateTypeEEnum, StateType.REFERENCE);
        addEEnumLiteral(stateTypeEEnum, StateType.TEXTUAL);

        initEEnum(transitionTypeEEnum, TransitionType.class, "TransitionType");
        addEEnumLiteral(transitionTypeEEnum, TransitionType.WEAKABORT);
        addEEnumLiteral(transitionTypeEEnum, TransitionType.STRONGABORT);
        addEEnumLiteral(transitionTypeEEnum, TransitionType.TERMINATION);

        initEEnum(historyTypeEEnum, HistoryType.class, "HistoryType");
        addEEnumLiteral(historyTypeEEnum, HistoryType.RESET);
        addEEnumLiteral(historyTypeEEnum, HistoryType.SHALLOW);
        addEEnumLiteral(historyTypeEEnum, HistoryType.DEEP);

        // Initialize data types
        initEDataType(parsableEDataType, String.class, "Parsable", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //SCChartsPackageImpl
