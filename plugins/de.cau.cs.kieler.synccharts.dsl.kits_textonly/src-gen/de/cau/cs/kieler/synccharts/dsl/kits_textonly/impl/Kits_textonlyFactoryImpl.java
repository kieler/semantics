/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl;

import de.cau.cs.kieler.synccharts.dsl.kits_textonly.*;

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
public class Kits_textonlyFactoryImpl extends EFactoryImpl implements Kits_textonlyFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Kits_textonlyFactory init()
  {
    try
    {
      Kits_textonlyFactory theKits_textonlyFactory = (Kits_textonlyFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.cau.de/cs/kieler/synccharts/dsl/Kits_textonly"); 
      if (theKits_textonlyFactory != null)
      {
        return theKits_textonlyFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Kits_textonlyFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Kits_textonlyFactoryImpl()
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
      case Kits_textonlyPackage.REGION: return createRegion();
      case Kits_textonlyPackage.STATE: return createState();
      case Kits_textonlyPackage.RENAMING: return createRenaming();
      case Kits_textonlyPackage.ACTION: return createAction();
      case Kits_textonlyPackage.TRANSITION: return createTransition();
      case Kits_textonlyPackage.TRANSITION_STATE: return createTransitionState();
      case Kits_textonlyPackage.VALUED_OBJECT: return createValuedObject();
      case Kits_textonlyPackage.VARIABLE: return createVariable();
      case Kits_textonlyPackage.SIGNAL: return createSignal();
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
      case Kits_textonlyPackage.STATE_TYPE:
        return createStateTypeFromString(eDataType, initialValue);
      case Kits_textonlyPackage.COMBINE_OPERATOR:
        return createCombineOperatorFromString(eDataType, initialValue);
      case Kits_textonlyPackage.VALUE_TYPE:
        return createValueTypeFromString(eDataType, initialValue);
      case Kits_textonlyPackage.TRANSITION_TYPE:
        return createTransitionTypeFromString(eDataType, initialValue);
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
      case Kits_textonlyPackage.STATE_TYPE:
        return convertStateTypeToString(eDataType, instanceValue);
      case Kits_textonlyPackage.COMBINE_OPERATOR:
        return convertCombineOperatorToString(eDataType, instanceValue);
      case Kits_textonlyPackage.VALUE_TYPE:
        return convertValueTypeToString(eDataType, instanceValue);
      case Kits_textonlyPackage.TRANSITION_TYPE:
        return convertTransitionTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Region createRegion()
  {
    RegionImpl region = new RegionImpl();
    return region;
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
  public Renaming createRenaming()
  {
    RenamingImpl renaming = new RenamingImpl();
    return renaming;
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
  public TransitionState createTransitionState()
  {
    TransitionStateImpl transitionState = new TransitionStateImpl();
    return transitionState;
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
  public ValueType createValueTypeFromString(EDataType eDataType, String initialValue)
  {
    ValueType result = ValueType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertValueTypeToString(EDataType eDataType, Object instanceValue)
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
  public Kits_textonlyPackage getKits_textonlyPackage()
  {
    return (Kits_textonlyPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static Kits_textonlyPackage getPackage()
  {
    return Kits_textonlyPackage.eINSTANCE;
  }

} //Kits_textonlyFactoryImpl
