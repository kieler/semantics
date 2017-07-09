/**
 */
package de.cau.cs.kieler.prom.kibuild.impl;

import de.cau.cs.kieler.prom.kibuild.*;

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
public class KibuildFactoryImpl extends EFactoryImpl implements KibuildFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static KibuildFactory init()
  {
    try
    {
      KibuildFactory theKibuildFactory = (KibuildFactory)EPackage.Registry.INSTANCE.getEFactory(KibuildPackage.eNS_URI);
      if (theKibuildFactory != null)
      {
        return theKibuildFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new KibuildFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KibuildFactoryImpl()
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
      case KibuildPackage.BUILD_CONFIGURATION: return createBuildConfiguration();
      case KibuildPackage.MODEL_COMPILER: return createModelCompiler();
      case KibuildPackage.SIMULATION_COMPILER: return createSimulationCompiler();
      case KibuildPackage.TEMPLATE_PROCESSOR: return createTemplateProcessor();
      case KibuildPackage.ATTRIBUTE_MAPPING: return createAttributeMapping();
      case KibuildPackage.LITERAL: return createLiteral();
      case KibuildPackage.SIGNED_FLOAT: return createSignedFloat();
      case KibuildPackage.SIGNED_INT: return createSignedInt();
      case KibuildPackage.TEXT_VALUE: return createTextValue();
      case KibuildPackage.NORMAL_TEMPLATE_PROCESSOR: return createNormalTemplateProcessor();
      case KibuildPackage.SIMULATION_TEMPLATE_PROCESSOR: return createSimulationTemplateProcessor();
      case KibuildPackage.WRAPPER_CODE_TEMPLATE_PROCESSOR: return createWrapperCodeTemplateProcessor();
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
      case KibuildPackage.SIGN:
        return createSignFromString(eDataType, initialValue);
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
      case KibuildPackage.SIGN:
        return convertSignToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuildConfiguration createBuildConfiguration()
  {
    BuildConfigurationImpl buildConfiguration = new BuildConfigurationImpl();
    return buildConfiguration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelCompiler createModelCompiler()
  {
    ModelCompilerImpl modelCompiler = new ModelCompilerImpl();
    return modelCompiler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimulationCompiler createSimulationCompiler()
  {
    SimulationCompilerImpl simulationCompiler = new SimulationCompilerImpl();
    return simulationCompiler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateProcessor createTemplateProcessor()
  {
    TemplateProcessorImpl templateProcessor = new TemplateProcessorImpl();
    return templateProcessor;
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
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SignedFloat createSignedFloat()
  {
    SignedFloatImpl signedFloat = new SignedFloatImpl();
    return signedFloat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SignedInt createSignedInt()
  {
    SignedIntImpl signedInt = new SignedIntImpl();
    return signedInt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextValue createTextValue()
  {
    TextValueImpl textValue = new TextValueImpl();
    return textValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NormalTemplateProcessor createNormalTemplateProcessor()
  {
    NormalTemplateProcessorImpl normalTemplateProcessor = new NormalTemplateProcessorImpl();
    return normalTemplateProcessor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimulationTemplateProcessor createSimulationTemplateProcessor()
  {
    SimulationTemplateProcessorImpl simulationTemplateProcessor = new SimulationTemplateProcessorImpl();
    return simulationTemplateProcessor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WrapperCodeTemplateProcessor createWrapperCodeTemplateProcessor()
  {
    WrapperCodeTemplateProcessorImpl wrapperCodeTemplateProcessor = new WrapperCodeTemplateProcessorImpl();
    return wrapperCodeTemplateProcessor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sign createSignFromString(EDataType eDataType, String initialValue)
  {
    Sign result = Sign.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSignToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KibuildPackage getKibuildPackage()
  {
    return (KibuildPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static KibuildPackage getPackage()
  {
    return KibuildPackage.eINSTANCE;
  }

} //KibuildFactoryImpl
