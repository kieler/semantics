/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts.impl;

import de.cau.cs.kieler.synccharts.*;

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
public class SyncchartsFactoryImpl extends EFactoryImpl implements SyncchartsFactory {
	/**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static SyncchartsFactory init() {
        try {
            SyncchartsFactory theSyncchartsFactory = (SyncchartsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.informatik.uni-kiel.de/rtsys/synccharts"); 
            if (theSyncchartsFactory != null) {
                return theSyncchartsFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new SyncchartsFactoryImpl();
    }

	/**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SyncchartsFactoryImpl() {
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
            case SyncchartsPackage.STATE: return createState();
            case SyncchartsPackage.SIGNAL: return createSignal();
            case SyncchartsPackage.VALUED_OBJECT: return createValuedObject();
            case SyncchartsPackage.EMISSION: return createEmission();
            case SyncchartsPackage.TRANSITION: return createTransition();
            case SyncchartsPackage.EXPRESSION: return createExpression();
            case SyncchartsPackage.SIGNAL_RENAMING: return createSignalRenaming();
            case SyncchartsPackage.OPERATOR: return createOperator();
            case SyncchartsPackage.ACTION: return createAction();
            case SyncchartsPackage.SUSPENSION_TRIGGER: return createSuspensionTrigger();
            case SyncchartsPackage.ASSIGNMENT: return createAssignment();
            case SyncchartsPackage.VARIABLE: return createVariable();
            case SyncchartsPackage.REGION: return createRegion();
            case SyncchartsPackage.COMPLEX_EXPRESSION: return createComplexExpression();
            case SyncchartsPackage.SIGNAL_REFERENCE: return createSignalReference();
            case SyncchartsPackage.VARIABLE_REFERENCE: return createVariableReference();
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
            case SyncchartsPackage.STATE_KIND:
                return createStateKindFromString(eDataType, initialValue);
            case SyncchartsPackage.STATE_FLAG:
                return createStateFlagFromString(eDataType, initialValue);
            case SyncchartsPackage.TRANSITION_KIND:
                return createTransitionKindFromString(eDataType, initialValue);
            case SyncchartsPackage.OPERATOR_KIND:
                return createOperatorKindFromString(eDataType, initialValue);
            case SyncchartsPackage.COMBINE_TYPE:
                return createCombineTypeFromString(eDataType, initialValue);
            case SyncchartsPackage.VALUE_TYPE:
                return createValueTypeFromString(eDataType, initialValue);
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
            case SyncchartsPackage.STATE_KIND:
                return convertStateKindToString(eDataType, instanceValue);
            case SyncchartsPackage.STATE_FLAG:
                return convertStateFlagToString(eDataType, instanceValue);
            case SyncchartsPackage.TRANSITION_KIND:
                return convertTransitionKindToString(eDataType, instanceValue);
            case SyncchartsPackage.OPERATOR_KIND:
                return convertOperatorKindToString(eDataType, instanceValue);
            case SyncchartsPackage.COMBINE_TYPE:
                return convertCombineTypeToString(eDataType, instanceValue);
            case SyncchartsPackage.VALUE_TYPE:
                return convertValueTypeToString(eDataType, instanceValue);
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
	public Signal createSignal() {
        SignalImpl signal = new SignalImpl();
        return signal;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ValuedObject createValuedObject() {
        ValuedObjectImpl valuedObject = new ValuedObjectImpl();
        return valuedObject;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Emission createEmission() {
        EmissionImpl emission = new EmissionImpl();
        return emission;
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
	public Expression createExpression() {
        ExpressionImpl expression = new ExpressionImpl();
        return expression;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SignalRenaming createSignalRenaming() {
        SignalRenamingImpl signalRenaming = new SignalRenamingImpl();
        return signalRenaming;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Operator createOperator() {
        OperatorImpl operator = new OperatorImpl();
        return operator;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Action createAction() {
        ActionImpl action = new ActionImpl();
        return action;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SuspensionTrigger createSuspensionTrigger() {
        SuspensionTriggerImpl suspensionTrigger = new SuspensionTriggerImpl();
        return suspensionTrigger;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Assignment createAssignment() {
        AssignmentImpl assignment = new AssignmentImpl();
        return assignment;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Variable createVariable() {
        VariableImpl variable = new VariableImpl();
        return variable;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Region createRegion() {
        RegionImpl region = new RegionImpl();
        return region;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ComplexExpression createComplexExpression() {
        ComplexExpressionImpl complexExpression = new ComplexExpressionImpl();
        return complexExpression;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SignalReference createSignalReference() {
        SignalReferenceImpl signalReference = new SignalReferenceImpl();
        return signalReference;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public VariableReference createVariableReference() {
        VariableReferenceImpl variableReference = new VariableReferenceImpl();
        return variableReference;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public StateKind createStateKindFromString(EDataType eDataType, String initialValue) {
        StateKind result = StateKind.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertStateKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public StateFlag createStateFlagFromString(EDataType eDataType, String initialValue) {
        StateFlag result = StateFlag.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertStateFlagToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TransitionKind createTransitionKindFromString(EDataType eDataType, String initialValue) {
        TransitionKind result = TransitionKind.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertTransitionKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public OperatorKind createOperatorKindFromString(EDataType eDataType, String initialValue) {
        OperatorKind result = OperatorKind.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertOperatorKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CombineType createCombineTypeFromString(EDataType eDataType, String initialValue) {
        CombineType result = CombineType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertCombineTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ValueType createValueTypeFromString(EDataType eDataType, String initialValue) {
        ValueType result = ValueType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertValueTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SyncchartsPackage getSyncchartsPackage() {
        return (SyncchartsPackage)getEPackage();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
	@Deprecated
	public static SyncchartsPackage getPackage() {
        return SyncchartsPackage.eINSTANCE;
    }

} //SyncchartsFactoryImpl
