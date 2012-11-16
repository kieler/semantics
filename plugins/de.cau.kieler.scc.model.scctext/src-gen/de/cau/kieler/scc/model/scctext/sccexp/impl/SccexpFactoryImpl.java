/**
 */
package de.cau.kieler.scc.model.scctext.sccexp.impl;

import de.cau.kieler.scc.model.scctext.sccexp.*;

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
      case SccexpPackage.ROOT: return createRoot();
      case SccexpPackage.DEF_ROOT: return createDefRoot();
      case SccexpPackage.STATE_ROOT: return createStateRoot();
      case SccexpPackage.TRANSITION_ROOT: return createTransitionRoot();
      case SccexpPackage.STATE_SCOPE: return createStateScope();
      case SccexpPackage.INTERFACE_SCOPE_ROOT: return createInterfaceScopeRoot();
      case SccexpPackage.INTERFACE_SCOPE: return createInterfaceScope();
      case SccexpPackage.INTERFACE_DECLARATION: return createInterfaceDeclaration();
      case SccexpPackage.SCC_VARIABLE_DECLARATION: return createSCCVariableDeclaration();
      case SccexpPackage.LOCAL_VARIABLE_DECLARATION: return createLocalVariableDeclaration();
      case SccexpPackage.IN_OUT_VARIABLE_DECLARATION: return createInOutVariableDeclaration();
      case SccexpPackage.OUTPUT_VARIABLEECLARATION: return createOutputVariableeclaration();
      case SccexpPackage.INPUT_VARIABLE_DECLARATION: return createInputVariableDeclaration();
      case SccexpPackage.ACTION_DECLARATION: return createActionDeclaration();
      case SccexpPackage.EXIT_ACTION_DECLARATION: return createExitActionDeclaration();
      case SccexpPackage.INSIDE_ACTION_DECLARATION: return createInsideActionDeclaration();
      case SccexpPackage.ENTRY_ACTION_DECLARATION: return createEntryActionDeclaration();
      case SccexpPackage.ACTION_VARIABLE_DECLARATION: return createActionVariableDeclaration();
      case SccexpPackage.SUSPEND_DECLARATION: return createSuspendDeclaration();
      case SccexpPackage.SUSPEND_VARIABLE_DECLARATION: return createSuspendVariableDeclaration();
      case SccexpPackage.TRANSITION_REACTION: return createTransitionReaction();
      case SccexpPackage.LOCAL: return createLocal();
      case SccexpPackage.INPUT: return createInput();
      case SccexpPackage.OUTPUT: return createOutput();
      case SccexpPackage.IN_OUT: return createInOut();
      case SccexpPackage.MY_TRIGGER: return createMyTrigger();
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
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Root createRoot()
  {
    RootImpl root = new RootImpl();
    return root;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefRoot createDefRoot()
  {
    DefRootImpl defRoot = new DefRootImpl();
    return defRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateRoot createStateRoot()
  {
    StateRootImpl stateRoot = new StateRootImpl();
    return stateRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionRoot createTransitionRoot()
  {
    TransitionRootImpl transitionRoot = new TransitionRootImpl();
    return transitionRoot;
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
  public InterfaceScopeRoot createInterfaceScopeRoot()
  {
    InterfaceScopeRootImpl interfaceScopeRoot = new InterfaceScopeRootImpl();
    return interfaceScopeRoot;
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
  public InterfaceDeclaration createInterfaceDeclaration()
  {
    InterfaceDeclarationImpl interfaceDeclaration = new InterfaceDeclarationImpl();
    return interfaceDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SCCVariableDeclaration createSCCVariableDeclaration()
  {
    SCCVariableDeclarationImpl sccVariableDeclaration = new SCCVariableDeclarationImpl();
    return sccVariableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalVariableDeclaration createLocalVariableDeclaration()
  {
    LocalVariableDeclarationImpl localVariableDeclaration = new LocalVariableDeclarationImpl();
    return localVariableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InOutVariableDeclaration createInOutVariableDeclaration()
  {
    InOutVariableDeclarationImpl inOutVariableDeclaration = new InOutVariableDeclarationImpl();
    return inOutVariableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputVariableeclaration createOutputVariableeclaration()
  {
    OutputVariableeclarationImpl outputVariableeclaration = new OutputVariableeclarationImpl();
    return outputVariableeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputVariableDeclaration createInputVariableDeclaration()
  {
    InputVariableDeclarationImpl inputVariableDeclaration = new InputVariableDeclarationImpl();
    return inputVariableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionDeclaration createActionDeclaration()
  {
    ActionDeclarationImpl actionDeclaration = new ActionDeclarationImpl();
    return actionDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExitActionDeclaration createExitActionDeclaration()
  {
    ExitActionDeclarationImpl exitActionDeclaration = new ExitActionDeclarationImpl();
    return exitActionDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InsideActionDeclaration createInsideActionDeclaration()
  {
    InsideActionDeclarationImpl insideActionDeclaration = new InsideActionDeclarationImpl();
    return insideActionDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntryActionDeclaration createEntryActionDeclaration()
  {
    EntryActionDeclarationImpl entryActionDeclaration = new EntryActionDeclarationImpl();
    return entryActionDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionVariableDeclaration createActionVariableDeclaration()
  {
    ActionVariableDeclarationImpl actionVariableDeclaration = new ActionVariableDeclarationImpl();
    return actionVariableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SuspendDeclaration createSuspendDeclaration()
  {
    SuspendDeclarationImpl suspendDeclaration = new SuspendDeclarationImpl();
    return suspendDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SuspendVariableDeclaration createSuspendVariableDeclaration()
  {
    SuspendVariableDeclarationImpl suspendVariableDeclaration = new SuspendVariableDeclarationImpl();
    return suspendVariableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionReaction createTransitionReaction()
  {
    TransitionReactionImpl transitionReaction = new TransitionReactionImpl();
    return transitionReaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Local createLocal()
  {
    LocalImpl local = new LocalImpl();
    return local;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Input createInput()
  {
    InputImpl input = new InputImpl();
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Output createOutput()
  {
    OutputImpl output = new OutputImpl();
    return output;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InOut createInOut()
  {
    InOutImpl inOut = new InOutImpl();
    return inOut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyTrigger createMyTrigger()
  {
    MyTriggerImpl myTrigger = new MyTriggerImpl();
    return myTrigger;
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
