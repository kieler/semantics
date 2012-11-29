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
      case SccexpPackage.STATE_SPECIFICATION: return createStateSpecification();
      case SccexpPackage.STATE_SCOPE: return createStateScope();
      case SccexpPackage.INTERFACE_SCOPE: return createInterfaceScope();
      case SccexpPackage.VARIABLE_DEFINITION: return createVariableDefinition();
      case SccexpPackage.REACTION_SCOPE: return createReactionScope();
      case SccexpPackage.EXIT_ACTION: return createExitAction();
      case SccexpPackage.INSIDE_ACTION: return createInsideAction();
      case SccexpPackage.ENTRY_ACTION: return createEntryAction();
      case SccexpPackage.SUSPEND: return createSuspend();
      case SccexpPackage.REACTION_TRIGGER: return createReactionTrigger();
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
  public StateSpecification createStateSpecification()
  {
    StateSpecificationImpl stateSpecification = new StateSpecificationImpl();
    return stateSpecification;
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
  public InterfaceScope createInterfaceScope()
  {
    InterfaceScopeImpl interfaceScope = new InterfaceScopeImpl();
    return interfaceScope;
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
  public ReactionScope createReactionScope()
  {
    ReactionScopeImpl reactionScope = new ReactionScopeImpl();
    return reactionScope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExitAction createExitAction()
  {
    ExitActionImpl exitAction = new ExitActionImpl();
    return exitAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InsideAction createInsideAction()
  {
    InsideActionImpl insideAction = new InsideActionImpl();
    return insideAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntryAction createEntryAction()
  {
    EntryActionImpl entryAction = new EntryActionImpl();
    return entryAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Suspend createSuspend()
  {
    SuspendImpl suspend = new SuspendImpl();
    return suspend;
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
