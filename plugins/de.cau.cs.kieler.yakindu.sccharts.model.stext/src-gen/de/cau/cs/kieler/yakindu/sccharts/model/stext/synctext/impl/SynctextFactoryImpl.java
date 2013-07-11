/**
 */
package de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl;

import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.*;

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
public class SynctextFactoryImpl extends EFactoryImpl implements SynctextFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SynctextFactory init()
  {
    try
    {
      SynctextFactory theSynctextFactory = (SynctextFactory)EPackage.Registry.INSTANCE.getEFactory("http://kieler.cs.cau.de/yakindu/sccharts/stext/"); 
      if (theSynctextFactory != null)
      {
        return theSynctextFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SynctextFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SynctextFactoryImpl()
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
      case SynctextPackage.STATE_SCOPE: return createStateScope();
      case SynctextPackage.SIGNAL_DEFINITION: return createSignalDefinition();
      case SynctextPackage.VARIABLE_DEFINITION: return createVariableDefinition();
      case SynctextPackage.OPERATION_DEFINITION: return createOperationDefinition();
      case SynctextPackage.LOCAL_ENTRY_REACTION: return createLocalEntryReaction();
      case SynctextPackage.LOCAL_DURING_REACTION: return createLocalDuringReaction();
      case SynctextPackage.LOCAL_EXIT_REACTION: return createLocalExitReaction();
      case SynctextPackage.LOCAL_SUSPEND_REACTION: return createLocalSuspendReaction();
      case SynctextPackage.SIMPLE_SCOPE: return createSimpleScope();
      case SynctextPackage.EVENT_DEFINITION: return createEventDefinition();
      case SynctextPackage.REACTION_TRIGGER: return createReactionTrigger();
      case SynctextPackage.REACTION_EFFECT: return createReactionEffect();
      case SynctextPackage.NUMERICAL_MULTIPLY_DIVIDE_EXPRESSION: return createNumericalMultiplyDivideExpression();
      case SynctextPackage.VAL_REFERENCE_EXPRESSION: return createValReferenceExpression();
      case SynctextPackage.PRE_REFERENCE_EXPRESSION: return createPreReferenceExpression();
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
      case SynctextPackage.MULTIPLICATIVE_OPERATOR2:
        return createMultiplicativeOperator2FromString(eDataType, initialValue);
      case SynctextPackage.COMBINE_OPERATOR:
        return createCombineOperatorFromString(eDataType, initialValue);
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
      case SynctextPackage.MULTIPLICATIVE_OPERATOR2:
        return convertMultiplicativeOperator2ToString(eDataType, instanceValue);
      case SynctextPackage.COMBINE_OPERATOR:
        return convertCombineOperatorToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateScope createStateScope()
  {
    StateScopeImpl stateScope = new StateScopeImpl();
    return stateScope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SignalDefinition createSignalDefinition()
  {
    SignalDefinitionImpl signalDefinition = new SignalDefinitionImpl();
    return signalDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDefinition createVariableDefinition()
  {
    VariableDefinitionImpl variableDefinition = new VariableDefinitionImpl();
    return variableDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationDefinition createOperationDefinition()
  {
    OperationDefinitionImpl operationDefinition = new OperationDefinitionImpl();
    return operationDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalEntryReaction createLocalEntryReaction()
  {
    LocalEntryReactionImpl localEntryReaction = new LocalEntryReactionImpl();
    return localEntryReaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalDuringReaction createLocalDuringReaction()
  {
    LocalDuringReactionImpl localDuringReaction = new LocalDuringReactionImpl();
    return localDuringReaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalExitReaction createLocalExitReaction()
  {
    LocalExitReactionImpl localExitReaction = new LocalExitReactionImpl();
    return localExitReaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalSuspendReaction createLocalSuspendReaction()
  {
    LocalSuspendReactionImpl localSuspendReaction = new LocalSuspendReactionImpl();
    return localSuspendReaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleScope createSimpleScope()
  {
    SimpleScopeImpl simpleScope = new SimpleScopeImpl();
    return simpleScope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventDefinition createEventDefinition()
  {
    EventDefinitionImpl eventDefinition = new EventDefinitionImpl();
    return eventDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReactionTrigger createReactionTrigger()
  {
    ReactionTriggerImpl reactionTrigger = new ReactionTriggerImpl();
    return reactionTrigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReactionEffect createReactionEffect()
  {
    ReactionEffectImpl reactionEffect = new ReactionEffectImpl();
    return reactionEffect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumericalMultiplyDivideExpression createNumericalMultiplyDivideExpression()
  {
    NumericalMultiplyDivideExpressionImpl numericalMultiplyDivideExpression = new NumericalMultiplyDivideExpressionImpl();
    return numericalMultiplyDivideExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValReferenceExpression createValReferenceExpression()
  {
    ValReferenceExpressionImpl valReferenceExpression = new ValReferenceExpressionImpl();
    return valReferenceExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreReferenceExpression createPreReferenceExpression()
  {
    PreReferenceExpressionImpl preReferenceExpression = new PreReferenceExpressionImpl();
    return preReferenceExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiplicativeOperator2 createMultiplicativeOperator2FromString(EDataType eDataType, String initialValue)
  {
    MultiplicativeOperator2 result = MultiplicativeOperator2.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMultiplicativeOperator2ToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CombineOperator createCombineOperatorFromString(EDataType eDataType, String initialValue)
  {
    CombineOperator result = CombineOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCombineOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SynctextPackage getSynctextPackage()
  {
    return (SynctextPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SynctextPackage getPackage()
  {
    return SynctextPackage.eINSTANCE;
  }

} //SynctextFactoryImpl
