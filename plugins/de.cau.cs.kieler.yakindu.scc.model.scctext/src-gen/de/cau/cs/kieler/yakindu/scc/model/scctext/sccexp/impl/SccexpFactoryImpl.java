/**
 */
package de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl;

import de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.*;

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
public class SccexpFactoryImpl extends EFactoryImpl implements SccexpFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SccexpFactory init()
  {
    try
    {
      SccexpFactory theSccexpFactory = (SccexpFactory)EPackage.Registry.INSTANCE.getEFactory("http://cau.kieler.de/scc/SCCExp"); 
      if (theSccexpFactory != null)
      {
        return theSccexpFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SccexpFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SccexpFactoryImpl()
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
      case SccexpPackage.STATE_SCOPE: return createStateScope();
      case SccexpPackage.SIGNAL_DEFINITION: return createSignalDefinition();
      case SccexpPackage.VARIABLE_DEFINITION: return createVariableDefinition();
      case SccexpPackage.LOCAL_REACTION: return createLocalReaction();
      case SccexpPackage.STATE_ACTION: return createStateAction();
      case SccexpPackage.ENTRY: return createEntry();
      case SccexpPackage.INSIDE: return createInside();
      case SccexpPackage.EXIT: return createExit();
      case SccexpPackage.SIMPLE_SCOPE: return createSimpleScope();
      case SccexpPackage.EVENT_DEFINITION: return createEventDefinition();
      case SccexpPackage.REACTION_TRIGGER: return createReactionTrigger();
      case SccexpPackage.REACTION_EFFECT: return createReactionEffect();
      case SccexpPackage.PRE_VALUE_EXPRESSIONRETURNS: return createPreValueExpressionreturns();
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
      case SccexpPackage.COMBINE_OPERATOR:
        return createCombineOperatorFromString(eDataType, initialValue);
      case SccexpPackage.VAR_DIRECTION:
        return createVarDirectionFromString(eDataType, initialValue);
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
      case SccexpPackage.COMBINE_OPERATOR:
        return convertCombineOperatorToString(eDataType, instanceValue);
      case SccexpPackage.VAR_DIRECTION:
        return convertVarDirectionToString(eDataType, instanceValue);
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
  public LocalReaction createLocalReaction()
  {
    LocalReactionImpl localReaction = new LocalReactionImpl();
    return localReaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateAction createStateAction()
  {
    StateActionImpl stateAction = new StateActionImpl();
    return stateAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entry createEntry()
  {
    EntryImpl entry = new EntryImpl();
    return entry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Inside createInside()
  {
    InsideImpl inside = new InsideImpl();
    return inside;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exit createExit()
  {
    ExitImpl exit = new ExitImpl();
    return exit;
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
  public PreValueExpressionreturns createPreValueExpressionreturns()
  {
    PreValueExpressionreturnsImpl preValueExpressionreturns = new PreValueExpressionreturnsImpl();
    return preValueExpressionreturns;
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
  public VarDirection createVarDirectionFromString(EDataType eDataType, String initialValue)
  {
    VarDirection result = VarDirection.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertVarDirectionToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SccexpPackage getSccexpPackage()
  {
    return (SccexpPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SccexpPackage getPackage()
  {
    return SccexpPackage.eINSTANCE;
  }

} //SccexpFactoryImpl
