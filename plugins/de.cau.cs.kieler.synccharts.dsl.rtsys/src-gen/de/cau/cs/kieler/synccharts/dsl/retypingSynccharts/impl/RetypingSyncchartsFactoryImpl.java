/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl;

import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.*;

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
public class RetypingSyncchartsFactoryImpl extends EFactoryImpl implements RetypingSyncchartsFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RetypingSyncchartsFactory init()
  {
    try
    {
      RetypingSyncchartsFactory theRetypingSyncchartsFactory = (RetypingSyncchartsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.cau.de/cs/kieler/synccharts/dsl/RetypingSynccharts"); 
      if (theRetypingSyncchartsFactory != null)
      {
        return theRetypingSyncchartsFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RetypingSyncchartsFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RetypingSyncchartsFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RetypingSyncchartsPackage.STATE: return createState();
      case RetypingSyncchartsPackage.STATE_CONTENT: return createStateContent();
      case RetypingSyncchartsPackage.ACTION: return createAction();
      case RetypingSyncchartsPackage.TRANSITION: return createTransition();
      case RetypingSyncchartsPackage.EFFECT: return createEffect();
      case RetypingSyncchartsPackage.EMISSION: return createEmission();
      case RetypingSyncchartsPackage.ASSIGNMENT: return createAssignment();
      case RetypingSyncchartsPackage.SIGNAL_REFERENCE: return createSignalReference();
      case RetypingSyncchartsPackage.VARIABLE_REFERENCE: return createVariableReference();
      case RetypingSyncchartsPackage.VALUED_OBJECT: return createValuedObject();
      case RetypingSyncchartsPackage.SIGNAL: return createSignal();
      case RetypingSyncchartsPackage.VARIABLE: return createVariable();
      case RetypingSyncchartsPackage.INT_VALUE: return createIntValue();
      case RetypingSyncchartsPackage.FLOAT_VALUE: return createFloatValue();
      case RetypingSyncchartsPackage.BOOLEAN_VALUE: return createBooleanValue();
      case RetypingSyncchartsPackage.VALUE: return createValue();
      case RetypingSyncchartsPackage.HOST_CODE: return createHostCode();
      case RetypingSyncchartsPackage.OPERATOR: return createOperator();
      case RetypingSyncchartsPackage.EXPRESSION: return createExpression();
      case RetypingSyncchartsPackage.OPERATIONS: return createOperations();
      case RetypingSyncchartsPackage.OPERATION: return createOperation();
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
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case RetypingSyncchartsPackage.STATE_TYPE:
        return createStateTypeFromString(eDataType, initialValue);
      case RetypingSyncchartsPackage.TRANSITION_TYPE:
        return createTransitionTypeFromString(eDataType, initialValue);
      case RetypingSyncchartsPackage.OPERATOR_KIND:
        return createOperatorKindFromString(eDataType, initialValue);
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
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case RetypingSyncchartsPackage.STATE_TYPE:
        return convertStateTypeToString(eDataType, instanceValue);
      case RetypingSyncchartsPackage.TRANSITION_TYPE:
        return convertTransitionTypeToString(eDataType, instanceValue);
      case RetypingSyncchartsPackage.OPERATOR_KIND:
        return convertOperatorKindToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateContent createStateContent()
  {
    StateContentImpl stateContent = new StateContentImpl();
    return stateContent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transition createTransition()
  {
    TransitionImpl transition = new TransitionImpl();
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Effect createEffect()
  {
    EffectImpl effect = new EffectImpl();
    return effect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Emission createEmission()
  {
    EmissionImpl emission = new EmissionImpl();
    return emission;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignment createAssignment()
  {
    AssignmentImpl assignment = new AssignmentImpl();
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SignalReference createSignalReference()
  {
    SignalReferenceImpl signalReference = new SignalReferenceImpl();
    return signalReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableReference createVariableReference()
  {
    VariableReferenceImpl variableReference = new VariableReferenceImpl();
    return variableReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValuedObject createValuedObject()
  {
    ValuedObjectImpl valuedObject = new ValuedObjectImpl();
    return valuedObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Signal createSignal()
  {
    SignalImpl signal = new SignalImpl();
    return signal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntValue createIntValue()
  {
    IntValueImpl intValue = new IntValueImpl();
    return intValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FloatValue createFloatValue()
  {
    FloatValueImpl floatValue = new FloatValueImpl();
    return floatValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanValue createBooleanValue()
  {
    BooleanValueImpl booleanValue = new BooleanValueImpl();
    return booleanValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HostCode createHostCode()
  {
    HostCodeImpl hostCode = new HostCodeImpl();
    return hostCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operator createOperator()
  {
    OperatorImpl operator = new OperatorImpl();
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operations createOperations()
  {
    OperationsImpl operations = new OperationsImpl();
    return operations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateType createStateTypeFromString(EDataType eDataType, String initialValue)
  {
    StateType result = StateType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertStateTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionType createTransitionTypeFromString(EDataType eDataType, String initialValue)
  {
    TransitionType result = TransitionType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTransitionTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperatorKind createOperatorKindFromString(EDataType eDataType, String initialValue)
  {
    OperatorKind result = OperatorKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOperatorKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RetypingSyncchartsPackage getRetypingSyncchartsPackage()
  {
    return (RetypingSyncchartsPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RetypingSyncchartsPackage getPackage()
  {
    return RetypingSyncchartsPackage.eINSTANCE;
  }

} //RetypingSyncchartsFactoryImpl
