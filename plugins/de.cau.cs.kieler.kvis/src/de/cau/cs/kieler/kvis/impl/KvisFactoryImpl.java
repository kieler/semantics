/**
 */
package de.cau.cs.kieler.kvis.impl;

import de.cau.cs.kieler.kvis.*;

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
public class KvisFactoryImpl extends EFactoryImpl implements KvisFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static KvisFactory init()
  {
    try
    {
      KvisFactory theKvisFactory = (KvisFactory)EPackage.Registry.INSTANCE.getEFactory(KvisPackage.eNS_URI);
      if (theKvisFactory != null)
      {
        return theKvisFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new KvisFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KvisFactoryImpl()
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
      case KvisPackage.VISUALIZATION: return createVisualization();
      case KvisPackage.ELEMENT: return createElement();
      case KvisPackage.ANIMATION: return createAnimation();
      case KvisPackage.ATTRIBUTE_MAPPING: return createAttributeMapping();
      case KvisPackage.MAPPING: return createMapping();
      case KvisPackage.VARIABLE_DOMAIN: return createVariableDomain();
      case KvisPackage.INTERVAL: return createInterval();
      case KvisPackage.ATTRIBUTE_DOMAIN: return createAttributeDomain();
      case KvisPackage.CONDITION: return createCondition();
      case KvisPackage.VARIABLE_REFERENCE: return createVariableReference();
      case KvisPackage.MODEL_REFERENCE: return createModelReference();
      case KvisPackage.BOOLEAN_EXPRESSION: return createBooleanExpression();
      case KvisPackage.EXPRESSION: return createExpression();
      case KvisPackage.OPERAND: return createOperand();
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
      case KvisPackage.OPERATOR_TYPE:
        return createOperatorTypeFromString(eDataType, initialValue);
      case KvisPackage.ANIMATION_TYPE:
        return createAnimationTypeFromString(eDataType, initialValue);
      case KvisPackage.BOOLEAN_OPERATOR_TYPE:
        return createBooleanOperatorTypeFromString(eDataType, initialValue);
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
      case KvisPackage.OPERATOR_TYPE:
        return convertOperatorTypeToString(eDataType, instanceValue);
      case KvisPackage.ANIMATION_TYPE:
        return convertAnimationTypeToString(eDataType, instanceValue);
      case KvisPackage.BOOLEAN_OPERATOR_TYPE:
        return convertBooleanOperatorTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Visualization createVisualization()
  {
    VisualizationImpl visualization = new VisualizationImpl();
    return visualization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Animation createAnimation()
  {
    AnimationImpl animation = new AnimationImpl();
    return animation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeMapping createAttributeMapping()
  {
    AttributeMappingImpl attributeMapping = new AttributeMappingImpl();
    return attributeMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mapping createMapping()
  {
    MappingImpl mapping = new MappingImpl();
    return mapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDomain createVariableDomain()
  {
    VariableDomainImpl variableDomain = new VariableDomainImpl();
    return variableDomain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interval createInterval()
  {
    IntervalImpl interval = new IntervalImpl();
    return interval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeDomain createAttributeDomain()
  {
    AttributeDomainImpl attributeDomain = new AttributeDomainImpl();
    return attributeDomain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
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
  public ModelReference createModelReference()
  {
    ModelReferenceImpl modelReference = new ModelReferenceImpl();
    return modelReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanExpression createBooleanExpression()
  {
    BooleanExpressionImpl booleanExpression = new BooleanExpressionImpl();
    return booleanExpression;
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
  public Operand createOperand()
  {
    OperandImpl operand = new OperandImpl();
    return operand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperatorType createOperatorTypeFromString(EDataType eDataType, String initialValue)
  {
    OperatorType result = OperatorType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOperatorTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnimationType createAnimationTypeFromString(EDataType eDataType, String initialValue)
  {
    AnimationType result = AnimationType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAnimationTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanOperatorType createBooleanOperatorTypeFromString(EDataType eDataType, String initialValue)
  {
    BooleanOperatorType result = BooleanOperatorType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBooleanOperatorTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KvisPackage getKvisPackage()
  {
    return (KvisPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static KvisPackage getPackage()
  {
    return KvisPackage.eINSTANCE;
  }

} //KvisFactoryImpl
