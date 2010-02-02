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
			SyncchartsFactory theSyncchartsFactory = (SyncchartsFactory)EPackage.Registry.INSTANCE.getEFactory("http://kieler.cs.cau.de/synccharts"); 
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
			case SyncchartsPackage.ACTION: return createAction();
			case SyncchartsPackage.ASSIGNMENT: return createAssignment();
			case SyncchartsPackage.COMPLEX_EXPRESSION: return createComplexExpression();
			case SyncchartsPackage.EMISSION: return createEmission();
			case SyncchartsPackage.EXPRESSION: return createExpression();
			case SyncchartsPackage.HOST_CODE: return createHostCode();
			case SyncchartsPackage.REGION: return createRegion();
			case SyncchartsPackage.SIGNAL: return createSignal();
			case SyncchartsPackage.SIGNAL_REFERENCE: return createSignalReference();
			case SyncchartsPackage.RENAMING: return createRenaming();
			case SyncchartsPackage.STATE: return createState();
			case SyncchartsPackage.TRANSITION: return createTransition();
			case SyncchartsPackage.VALUED_OBJECT: return createValuedObject();
			case SyncchartsPackage.VARIABLE: return createVariable();
			case SyncchartsPackage.VARIABLE_REFERENCE: return createVariableReference();
			case SyncchartsPackage.VALUE: return createValue();
			case SyncchartsPackage.INT_VALUE: return createIntValue();
			case SyncchartsPackage.FLOAT_VALUE: return createFloatValue();
			case SyncchartsPackage.BOOLEAN_VALUE: return createBooleanValue();
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
			case SyncchartsPackage.COMBINE_OPERATOR:
				return createCombineOperatorFromString(eDataType, initialValue);
			case SyncchartsPackage.OPERATOR_TYPE:
				return createOperatorTypeFromString(eDataType, initialValue);
			case SyncchartsPackage.STATE_TYPE:
				return createStateTypeFromString(eDataType, initialValue);
			case SyncchartsPackage.TRANSITION_TYPE:
				return createTransitionTypeFromString(eDataType, initialValue);
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
			case SyncchartsPackage.COMBINE_OPERATOR:
				return convertCombineOperatorToString(eDataType, instanceValue);
			case SyncchartsPackage.OPERATOR_TYPE:
				return convertOperatorTypeToString(eDataType, instanceValue);
			case SyncchartsPackage.STATE_TYPE:
				return convertStateTypeToString(eDataType, instanceValue);
			case SyncchartsPackage.TRANSITION_TYPE:
				return convertTransitionTypeToString(eDataType, instanceValue);
			case SyncchartsPackage.VALUE_TYPE:
				return convertValueTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     */
    public Action createAction() {
        ActionImpl action = new ActionImpl();
        action.eAdapters().addAll(this.eAdapters());
        return action;
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
    public ComplexExpression createComplexExpression() {
		ComplexExpressionImpl complexExpression = new ComplexExpressionImpl();
		return complexExpression;
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
    public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public HostCode createHostCode() {
		HostCodeImpl hostCode = new HostCodeImpl();
		return hostCode;
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
     */
    public Signal createSignal() {
        SignalImpl signal = new SignalImpl();
        signal.eAdapters().addAll(this.eAdapters());
        return signal;
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
    public Renaming createRenaming() {
		RenamingImpl renaming = new RenamingImpl();
		return renaming;
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     */
    public State createState() {
        StateImpl state = new StateImpl();
        state.eAdapters().addAll(this.eAdapters());
        return state;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     */
    public Transition createTransition() {
        TransitionImpl transition = new TransitionImpl();
        transition.eAdapters().addAll(this.eAdapters());
        return transition;
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
     */
    public Variable createVariable() {
        VariableImpl variable = new VariableImpl();
        variable.eAdapters().addAll(this.eAdapters());
        return variable;
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
    public Value createValue() {
		ValueImpl value = new ValueImpl();
		return value;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IntValue createIntValue() {
		IntValueImpl intValue = new IntValueImpl();
		return intValue;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public FloatValue createFloatValue() {
		FloatValueImpl floatValue = new FloatValueImpl();
		return floatValue;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public BooleanValue createBooleanValue() {
		BooleanValueImpl booleanValue = new BooleanValueImpl();
		return booleanValue;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CombineOperator createCombineOperatorFromString(EDataType eDataType, String initialValue) {
		CombineOperator result = CombineOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String convertCombineOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public OperatorType createOperatorTypeFromString(EDataType eDataType, String initialValue) {
		OperatorType result = OperatorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String convertOperatorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public StateType createStateTypeFromString(EDataType eDataType, String initialValue) {
		StateType result = StateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String convertStateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public TransitionType createTransitionTypeFromString(EDataType eDataType, String initialValue) {
		TransitionType result = TransitionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String convertTransitionTypeToString(EDataType eDataType, Object instanceValue) {
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
