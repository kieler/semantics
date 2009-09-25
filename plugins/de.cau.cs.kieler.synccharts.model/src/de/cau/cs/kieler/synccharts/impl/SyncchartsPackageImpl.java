/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts.impl;

import de.cau.cs.kieler.synccharts.Action;
import de.cau.cs.kieler.synccharts.Assignment;
import de.cau.cs.kieler.synccharts.BooleanValue;
import de.cau.cs.kieler.synccharts.CombineOperator;
import de.cau.cs.kieler.synccharts.ComplexExpression;
import de.cau.cs.kieler.synccharts.Effect;
import de.cau.cs.kieler.synccharts.Emission;
import de.cau.cs.kieler.synccharts.Expression;
import de.cau.cs.kieler.synccharts.FloatValue;
import de.cau.cs.kieler.synccharts.HostCode;
import de.cau.cs.kieler.synccharts.IntValue;
import de.cau.cs.kieler.synccharts.OperatorType;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.Renaming;
import de.cau.cs.kieler.synccharts.Signal;
import de.cau.cs.kieler.synccharts.SignalReference;
import de.cau.cs.kieler.synccharts.SignalRenaming;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.StateType;
import de.cau.cs.kieler.synccharts.SyncchartsFactory;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.TransitionType;
import de.cau.cs.kieler.synccharts.Value;
import de.cau.cs.kieler.synccharts.ValueType;
import de.cau.cs.kieler.synccharts.ValuedObject;
import de.cau.cs.kieler.synccharts.Variable;
import de.cau.cs.kieler.synccharts.VariableReference;

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
public class SyncchartsPackageImpl extends EPackageImpl implements SyncchartsPackage {
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
    private EClass assignmentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass complexExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass effectEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass emissionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass expressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hostCodeEClass = null;

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
    private EClass signalEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass signalReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass renamingEClass = null;

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
    private EClass transitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass valuedObjectEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass variableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass variableReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass valueEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass intValueEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass floatValueEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass booleanValueEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum combineOperatorEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum operatorTypeEEnum = null;

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
    private EEnum valueTypeEEnum = null;

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
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private SyncchartsPackageImpl() {
        super(eNS_URI, SyncchartsFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link SyncchartsPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static SyncchartsPackage init() {
        if (isInited) return (SyncchartsPackage)EPackage.Registry.INSTANCE.getEPackage(SyncchartsPackage.eNS_URI);

        // Obtain or create and register package
        SyncchartsPackageImpl theSyncchartsPackage = (SyncchartsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SyncchartsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SyncchartsPackageImpl());

        isInited = true;

        // Create package meta-data objects
        theSyncchartsPackage.createPackageContents();

        // Initialize created meta-data
        theSyncchartsPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theSyncchartsPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(SyncchartsPackage.eNS_URI, theSyncchartsPackage);
        return theSyncchartsPackage;
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
    public EAttribute getAction_TriggersAndEffects() {
        return (EAttribute)actionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAction_ParentStateEntryAction() {
        return (EReference)actionEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAction_ParentStateInnerAction() {
        return (EReference)actionEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAction_ParentStateExitAction() {
        return (EReference)actionEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAction_Delay() {
        return (EAttribute)actionEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAction_IsImmediate() {
        return (EAttribute)actionEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAction_ParentStateSuspension() {
        return (EReference)actionEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAssignment() {
        return assignmentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAssignment_Variable() {
        return (EReference)assignmentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAssignment_Expression() {
        return (EReference)assignmentEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getComplexExpression() {
        return complexExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getComplexExpression_SubExpressions() {
        return (EReference)complexExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getComplexExpression_Operator() {
        return (EAttribute)complexExpressionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEffect() {
        return effectEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEffect_ParentEAction() {
        return (EReference)effectEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEmission() {
        return emissionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEmission_Signal() {
        return (EReference)emissionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEmission_NewValue() {
        return (EReference)emissionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExpression() {
        return expressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExpression_ParentAction() {
        return (EReference)expressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExpression_ParentEmisson() {
        return (EReference)expressionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExpression_ParentAssignment() {
        return (EReference)expressionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExpression_ParentExpression() {
        return (EReference)expressionEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHostCode() {
        return hostCodeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getHostCode_Code() {
        return (EAttribute)hostCodeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getHostCode_Type() {
        return (EAttribute)hostCodeEClass.getEStructuralFeatures().get(1);
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
    public EReference getRegion_InnerStates() {
        return (EReference)regionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRegion_ParentState() {
        return (EReference)regionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRegion_Variables() {
        return (EReference)regionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRegion_Signals() {
        return (EReference)regionEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRegion_Id() {
        return (EAttribute)regionEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSignal() {
        return signalEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSignal_Value() {
        return (EReference)signalEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSignal_ParentState() {
        return (EReference)signalEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSignal_IsInput() {
        return (EAttribute)signalEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSignal_IsOutput() {
        return (EAttribute)signalEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSignal_CombineOperator() {
        return (EAttribute)signalEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSignal_HostCombineOperator() {
        return (EAttribute)signalEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSignal_ParentRegion() {
        return (EReference)signalEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSignalReference() {
        return signalReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSignalReference_Signal() {
        return (EReference)signalReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRenaming() {
        return renamingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRenaming_ParentState() {
        return (EReference)renamingEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRenaming_OldID() {
        return (EAttribute)renamingEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRenaming_NewID() {
        return (EAttribute)renamingEClass.getEStructuralFeatures().get(2);
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
    public EAttribute getState_Id() {
        return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getState_Label() {
        return (EAttribute)stateEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getState_Type() {
        return (EAttribute)stateEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getState_Signals() {
        return (EReference)stateEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getState_Regions() {
        return (EReference)stateEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getState_EntryActions() {
        return (EReference)stateEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getState_InnerActions() {
        return (EReference)stateEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getState_ExitActions() {
        return (EReference)stateEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getState_Renamings() {
        return (EReference)stateEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getState_SuspensionTrigger() {
        return (EReference)stateEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getState_OutgoingTransitions() {
        return (EReference)stateEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getState_ParentRegion() {
        return (EReference)stateEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getState_IsInitial() {
        return (EAttribute)stateEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getState_IsFinal() {
        return (EAttribute)stateEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getState_BodyText() {
        return (EAttribute)stateEClass.getEStructuralFeatures().get(14);
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
    public EReference getTransition_TargetState() {
        return (EReference)transitionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTransition_SourceState() {
        return (EReference)transitionEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTransition_IsHistory() {
        return (EAttribute)transitionEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getValuedObject() {
        return valuedObjectEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getValuedObject_Name() {
        return (EAttribute)valuedObjectEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getValuedObject_Type() {
        return (EAttribute)valuedObjectEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getValuedObject_InitialValue() {
        return (EAttribute)valuedObjectEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getValuedObject_HostType() {
        return (EAttribute)valuedObjectEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getVariable() {
        return variableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getVariable_Value() {
        return (EReference)variableEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getVariable_ParentRegion() {
        return (EReference)variableEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getVariableReference() {
        return variableReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getVariableReference_Variable() {
        return (EReference)variableReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getValue() {
        return valueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIntValue() {
        return intValueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIntValue_Value() {
        return (EAttribute)intValueEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFloatValue() {
        return floatValueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFloatValue_Value() {
        return (EAttribute)floatValueEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBooleanValue() {
        return booleanValueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBooleanValue_Value() {
        return (EAttribute)booleanValueEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getCombineOperator() {
        return combineOperatorEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getOperatorType() {
        return operatorTypeEEnum;
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
    public EEnum getValueType() {
        return valueTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SyncchartsFactory getSyncchartsFactory() {
        return (SyncchartsFactory)getEFactoryInstance();
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
        createEAttribute(actionEClass, ACTION__TRIGGERS_AND_EFFECTS);
        createEReference(actionEClass, ACTION__PARENT_STATE_ENTRY_ACTION);
        createEReference(actionEClass, ACTION__PARENT_STATE_INNER_ACTION);
        createEReference(actionEClass, ACTION__PARENT_STATE_EXIT_ACTION);
        createEAttribute(actionEClass, ACTION__DELAY);
        createEAttribute(actionEClass, ACTION__IS_IMMEDIATE);
        createEReference(actionEClass, ACTION__PARENT_STATE_SUSPENSION);

        assignmentEClass = createEClass(ASSIGNMENT);
        createEReference(assignmentEClass, ASSIGNMENT__VARIABLE);
        createEReference(assignmentEClass, ASSIGNMENT__EXPRESSION);

        complexExpressionEClass = createEClass(COMPLEX_EXPRESSION);
        createEReference(complexExpressionEClass, COMPLEX_EXPRESSION__SUB_EXPRESSIONS);
        createEAttribute(complexExpressionEClass, COMPLEX_EXPRESSION__OPERATOR);

        effectEClass = createEClass(EFFECT);
        createEReference(effectEClass, EFFECT__PARENT_EACTION);

        emissionEClass = createEClass(EMISSION);
        createEReference(emissionEClass, EMISSION__SIGNAL);
        createEReference(emissionEClass, EMISSION__NEW_VALUE);

        expressionEClass = createEClass(EXPRESSION);
        createEReference(expressionEClass, EXPRESSION__PARENT_ACTION);
        createEReference(expressionEClass, EXPRESSION__PARENT_EMISSON);
        createEReference(expressionEClass, EXPRESSION__PARENT_ASSIGNMENT);
        createEReference(expressionEClass, EXPRESSION__PARENT_EXPRESSION);

        hostCodeEClass = createEClass(HOST_CODE);
        createEAttribute(hostCodeEClass, HOST_CODE__CODE);
        createEAttribute(hostCodeEClass, HOST_CODE__TYPE);

        regionEClass = createEClass(REGION);
        createEReference(regionEClass, REGION__INNER_STATES);
        createEReference(regionEClass, REGION__PARENT_STATE);
        createEReference(regionEClass, REGION__VARIABLES);
        createEReference(regionEClass, REGION__SIGNALS);
        createEAttribute(regionEClass, REGION__ID);

        signalEClass = createEClass(SIGNAL);
        createEReference(signalEClass, SIGNAL__VALUE);
        createEReference(signalEClass, SIGNAL__PARENT_STATE);
        createEAttribute(signalEClass, SIGNAL__IS_INPUT);
        createEAttribute(signalEClass, SIGNAL__IS_OUTPUT);
        createEAttribute(signalEClass, SIGNAL__COMBINE_OPERATOR);
        createEAttribute(signalEClass, SIGNAL__HOST_COMBINE_OPERATOR);
        createEReference(signalEClass, SIGNAL__PARENT_REGION);

        signalReferenceEClass = createEClass(SIGNAL_REFERENCE);
        createEReference(signalReferenceEClass, SIGNAL_REFERENCE__SIGNAL);

        renamingEClass = createEClass(RENAMING);
        createEReference(renamingEClass, RENAMING__PARENT_STATE);
        createEAttribute(renamingEClass, RENAMING__OLD_ID);
        createEAttribute(renamingEClass, RENAMING__NEW_ID);

        stateEClass = createEClass(STATE);
        createEAttribute(stateEClass, STATE__ID);
        createEAttribute(stateEClass, STATE__LABEL);
        createEAttribute(stateEClass, STATE__TYPE);
        createEReference(stateEClass, STATE__SIGNALS);
        createEReference(stateEClass, STATE__REGIONS);
        createEReference(stateEClass, STATE__ENTRY_ACTIONS);
        createEReference(stateEClass, STATE__INNER_ACTIONS);
        createEReference(stateEClass, STATE__EXIT_ACTIONS);
        createEReference(stateEClass, STATE__RENAMINGS);
        createEReference(stateEClass, STATE__SUSPENSION_TRIGGER);
        createEReference(stateEClass, STATE__OUTGOING_TRANSITIONS);
        createEReference(stateEClass, STATE__PARENT_REGION);
        createEAttribute(stateEClass, STATE__IS_INITIAL);
        createEAttribute(stateEClass, STATE__IS_FINAL);
        createEAttribute(stateEClass, STATE__BODY_TEXT);

        transitionEClass = createEClass(TRANSITION);
        createEAttribute(transitionEClass, TRANSITION__PRIORITY);
        createEAttribute(transitionEClass, TRANSITION__TYPE);
        createEReference(transitionEClass, TRANSITION__TARGET_STATE);
        createEReference(transitionEClass, TRANSITION__SOURCE_STATE);
        createEAttribute(transitionEClass, TRANSITION__IS_HISTORY);

        valuedObjectEClass = createEClass(VALUED_OBJECT);
        createEAttribute(valuedObjectEClass, VALUED_OBJECT__NAME);
        createEAttribute(valuedObjectEClass, VALUED_OBJECT__TYPE);
        createEAttribute(valuedObjectEClass, VALUED_OBJECT__INITIAL_VALUE);
        createEAttribute(valuedObjectEClass, VALUED_OBJECT__HOST_TYPE);

        variableEClass = createEClass(VARIABLE);
        createEReference(variableEClass, VARIABLE__VALUE);
        createEReference(variableEClass, VARIABLE__PARENT_REGION);

        variableReferenceEClass = createEClass(VARIABLE_REFERENCE);
        createEReference(variableReferenceEClass, VARIABLE_REFERENCE__VARIABLE);

        valueEClass = createEClass(VALUE);

        intValueEClass = createEClass(INT_VALUE);
        createEAttribute(intValueEClass, INT_VALUE__VALUE);

        floatValueEClass = createEClass(FLOAT_VALUE);
        createEAttribute(floatValueEClass, FLOAT_VALUE__VALUE);

        booleanValueEClass = createEClass(BOOLEAN_VALUE);
        createEAttribute(booleanValueEClass, BOOLEAN_VALUE__VALUE);

        // Create enums
        combineOperatorEEnum = createEEnum(COMBINE_OPERATOR);
        operatorTypeEEnum = createEEnum(OPERATOR_TYPE);
        stateTypeEEnum = createEEnum(STATE_TYPE);
        transitionTypeEEnum = createEEnum(TRANSITION_TYPE);
        valueTypeEEnum = createEEnum(VALUE_TYPE);
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
        assignmentEClass.getESuperTypes().add(this.getEffect());
        complexExpressionEClass.getESuperTypes().add(this.getExpression());
        emissionEClass.getESuperTypes().add(this.getEffect());
        hostCodeEClass.getESuperTypes().add(this.getEffect());
        hostCodeEClass.getESuperTypes().add(this.getExpression());
        signalEClass.getESuperTypes().add(this.getValuedObject());
        signalReferenceEClass.getESuperTypes().add(this.getExpression());
        transitionEClass.getESuperTypes().add(this.getAction());
        variableEClass.getESuperTypes().add(this.getValuedObject());
        variableReferenceEClass.getESuperTypes().add(this.getExpression());
        valueEClass.getESuperTypes().add(this.getExpression());
        intValueEClass.getESuperTypes().add(this.getValue());
        floatValueEClass.getESuperTypes().add(this.getValue());
        booleanValueEClass.getESuperTypes().add(this.getValue());

        // Initialize classes and features; add operations and parameters
        initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAction_Effects(), this.getEffect(), this.getEffect_ParentEAction(), "effects", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAction_Trigger(), this.getExpression(), this.getExpression_ParentAction(), "trigger", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAction_TriggersAndEffects(), ecorePackage.getEString(), "triggersAndEffects", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAction_ParentStateEntryAction(), this.getState(), this.getState_EntryActions(), "parentStateEntryAction", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAction_ParentStateInnerAction(), this.getState(), this.getState_InnerActions(), "parentStateInnerAction", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAction_ParentStateExitAction(), this.getState(), this.getState_ExitActions(), "parentStateExitAction", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAction_Delay(), ecorePackage.getEInt(), "delay", "1", 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAction_IsImmediate(), ecorePackage.getEBoolean(), "isImmediate", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAction_ParentStateSuspension(), this.getState(), this.getState_SuspensionTrigger(), "parentStateSuspension", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAssignment_Variable(), this.getVariable(), null, "variable", null, 1, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAssignment_Expression(), this.getExpression(), this.getExpression_ParentAssignment(), "expression", null, 1, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(complexExpressionEClass, ComplexExpression.class, "ComplexExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getComplexExpression_SubExpressions(), this.getExpression(), this.getExpression_ParentExpression(), "subExpressions", null, 1, -1, ComplexExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getComplexExpression_Operator(), this.getOperatorType(), "operator", null, 1, 1, ComplexExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(effectEClass, Effect.class, "Effect", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEffect_ParentEAction(), this.getAction(), this.getAction_Effects(), "parentEAction", null, 1, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(emissionEClass, Emission.class, "Emission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEmission_Signal(), this.getSignal(), null, "signal", null, 1, 1, Emission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEmission_NewValue(), this.getExpression(), this.getExpression_ParentEmisson(), "newValue", null, 0, 1, Emission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getExpression_ParentAction(), this.getAction(), this.getAction_Trigger(), "parentAction", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExpression_ParentEmisson(), this.getEmission(), this.getEmission_NewValue(), "parentEmisson", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExpression_ParentAssignment(), this.getAssignment(), this.getAssignment_Expression(), "parentAssignment", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExpression_ParentExpression(), this.getComplexExpression(), this.getComplexExpression_SubExpressions(), "parentExpression", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(hostCodeEClass, HostCode.class, "HostCode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getHostCode_Code(), ecorePackage.getEString(), "code", null, 1, 1, HostCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHostCode_Type(), ecorePackage.getEString(), "type", null, 0, 1, HostCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(regionEClass, Region.class, "Region", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRegion_InnerStates(), this.getState(), this.getState_ParentRegion(), "innerStates", null, 0, -1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRegion_ParentState(), this.getState(), this.getState_Regions(), "parentState", null, 0, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRegion_Variables(), this.getVariable(), this.getVariable_ParentRegion(), "variables", null, 0, -1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRegion_Signals(), this.getSignal(), this.getSignal_ParentRegion(), "signals", null, 0, -1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRegion_Id(), ecorePackage.getEString(), "id", null, 0, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(signalEClass, Signal.class, "Signal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSignal_Value(), ecorePackage.getEObject(), null, "value", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSignal_ParentState(), this.getState(), this.getState_Signals(), "parentState", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSignal_IsInput(), ecorePackage.getEBoolean(), "isInput", null, 1, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSignal_IsOutput(), ecorePackage.getEBoolean(), "isOutput", null, 1, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSignal_CombineOperator(), this.getCombineOperator(), "combineOperator", null, 1, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSignal_HostCombineOperator(), ecorePackage.getEString(), "hostCombineOperator", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSignal_ParentRegion(), this.getRegion(), this.getRegion_Signals(), "parentRegion", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(signalReferenceEClass, SignalReference.class, "SignalReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSignalReference_Signal(), this.getSignal(), null, "signal", null, 1, 1, SignalReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(renamingEClass, Renaming.class, "Renaming", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRenaming_ParentState(), this.getState(), this.getState_Renamings(), "parentState", null, 1, 1, Renaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRenaming_OldID(), ecorePackage.getEString(), "oldID", null, 1, 1, Renaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRenaming_NewID(), ecorePackage.getEString(), "newID", null, 1, 1, Renaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getState_Id(), ecorePackage.getEString(), "id", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getState_Label(), ecorePackage.getEString(), "label", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getState_Type(), this.getStateType(), "type", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getState_Signals(), this.getSignal(), this.getSignal_ParentState(), "signals", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getState_Regions(), this.getRegion(), this.getRegion_ParentState(), "regions", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getState_EntryActions(), this.getAction(), this.getAction_ParentStateEntryAction(), "entryActions", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getState_InnerActions(), this.getAction(), this.getAction_ParentStateInnerAction(), "innerActions", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getState_ExitActions(), this.getAction(), this.getAction_ParentStateExitAction(), "exitActions", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getState_Renamings(), this.getRenaming(), this.getRenaming_ParentState(), "renamings", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getState_SuspensionTrigger(), this.getAction(), this.getAction_ParentStateSuspension(), "suspensionTrigger", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getState_OutgoingTransitions(), this.getTransition(), this.getTransition_SourceState(), "outgoingTransitions", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getState_ParentRegion(), this.getRegion(), this.getRegion_InnerStates(), "parentRegion", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getState_IsInitial(), ecorePackage.getEBoolean(), "isInitial", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getState_IsFinal(), ecorePackage.getEBoolean(), "isFinal", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getState_BodyText(), ecorePackage.getEString(), "bodyText", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTransition_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTransition_Type(), this.getTransitionType(), "type", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTransition_TargetState(), this.getState(), null, "targetState", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTransition_SourceState(), this.getState(), this.getState_OutgoingTransitions(), "sourceState", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTransition_IsHistory(), ecorePackage.getEBoolean(), "isHistory", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(valuedObjectEClass, ValuedObject.class, "ValuedObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getValuedObject_Name(), ecorePackage.getEString(), "name", null, 1, 1, ValuedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getValuedObject_Type(), this.getValueType(), "type", null, 1, 1, ValuedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getValuedObject_InitialValue(), ecorePackage.getEString(), "initialValue", null, 0, 1, ValuedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getValuedObject_HostType(), ecorePackage.getEString(), "hostType", null, 0, 1, ValuedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getVariable_Value(), ecorePackage.getEObject(), null, "value", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getVariable_ParentRegion(), this.getRegion(), this.getRegion_Variables(), "parentRegion", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(variableReferenceEClass, VariableReference.class, "VariableReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getVariableReference_Variable(), this.getVariable(), null, "variable", null, 1, 1, VariableReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(intValueEClass, IntValue.class, "IntValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getIntValue_Value(), ecorePackage.getEIntegerObject(), "value", null, 1, 1, IntValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(floatValueEClass, FloatValue.class, "FloatValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getFloatValue_Value(), ecorePackage.getEFloatObject(), "value", null, 1, 1, FloatValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(booleanValueEClass, BooleanValue.class, "BooleanValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getBooleanValue_Value(), ecorePackage.getEBooleanObject(), "value", null, 1, 1, BooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(combineOperatorEEnum, CombineOperator.class, "CombineOperator");
        addEEnumLiteral(combineOperatorEEnum, CombineOperator.NONE);
        addEEnumLiteral(combineOperatorEEnum, CombineOperator.ADD);
        addEEnumLiteral(combineOperatorEEnum, CombineOperator.MULT);
        addEEnumLiteral(combineOperatorEEnum, CombineOperator.MAX);
        addEEnumLiteral(combineOperatorEEnum, CombineOperator.MIN);
        addEEnumLiteral(combineOperatorEEnum, CombineOperator.OR);
        addEEnumLiteral(combineOperatorEEnum, CombineOperator.AND);
        addEEnumLiteral(combineOperatorEEnum, CombineOperator.HOST);

        initEEnum(operatorTypeEEnum, OperatorType.class, "OperatorType");
        addEEnumLiteral(operatorTypeEEnum, OperatorType.EQ);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.LT);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.LEQ);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.GT);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.GEQ);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.NOT);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.VAL);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.PRE);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.AND);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.OR);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.ADD);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.SUB);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.MULT);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.DIV);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.MOD);

        initEEnum(stateTypeEEnum, StateType.class, "StateType");
        addEEnumLiteral(stateTypeEEnum, StateType.NORMAL);
        addEEnumLiteral(stateTypeEEnum, StateType.PSEUDO);
        addEEnumLiteral(stateTypeEEnum, StateType.REFERENCE);
        addEEnumLiteral(stateTypeEEnum, StateType.TEXTUAL);

        initEEnum(transitionTypeEEnum, TransitionType.class, "TransitionType");
        addEEnumLiteral(transitionTypeEEnum, TransitionType.WEAKABORT);
        addEEnumLiteral(transitionTypeEEnum, TransitionType.STRONGABORT);
        addEEnumLiteral(transitionTypeEEnum, TransitionType.NORMALTERMINATION);

        initEEnum(valueTypeEEnum, ValueType.class, "ValueType");
        addEEnumLiteral(valueTypeEEnum, ValueType.PURE);
        addEEnumLiteral(valueTypeEEnum, ValueType.BOOL);
        addEEnumLiteral(valueTypeEEnum, ValueType.UNSIGNED);
        addEEnumLiteral(valueTypeEEnum, ValueType.INTEGER);
        addEEnumLiteral(valueTypeEEnum, ValueType.FLOAT);
        addEEnumLiteral(valueTypeEEnum, ValueType.HOST);

        // Create resource
        createResource(eNS_URI);
    }

} //SyncchartsPackageImpl
