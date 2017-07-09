/**
 */
package de.cau.cs.kieler.prom.kibuild;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.prom.kibuild.KibuildFactory
 * @model kind="package"
 * @generated
 */
public interface KibuildPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "kibuild";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cau.de/cs/kieler/prom/KiBuild";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "kibuild";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  KibuildPackage eINSTANCE = de.cau.cs.kieler.prom.kibuild.impl.KibuildPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.prom.kibuild.impl.BuildConfigurationImpl <em>Build Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.prom.kibuild.impl.BuildConfigurationImpl
   * @see de.cau.cs.kieler.prom.kibuild.impl.KibuildPackageImpl#getBuildConfiguration()
   * @generated
   */
  int BUILD_CONFIGURATION = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_CONFIGURATION__ATTRIBUTES = 0;

  /**
   * The feature id for the '<em><b>Model Compilers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_CONFIGURATION__MODEL_COMPILERS = 1;

  /**
   * The feature id for the '<em><b>Simulation Compilers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_CONFIGURATION__SIMULATION_COMPILERS = 2;

  /**
   * The feature id for the '<em><b>Template Processors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_CONFIGURATION__TEMPLATE_PROCESSORS = 3;

  /**
   * The number of structural features of the '<em>Build Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_CONFIGURATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.prom.kibuild.impl.ModelCompilerImpl <em>Model Compiler</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.prom.kibuild.impl.ModelCompilerImpl
   * @see de.cau.cs.kieler.prom.kibuild.impl.KibuildPackageImpl#getModelCompiler()
   * @generated
   */
  int MODEL_COMPILER = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_COMPILER__NAME = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_COMPILER__ATTRIBUTES = 1;

  /**
   * The feature id for the '<em><b>Simulation Compiler</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_COMPILER__SIMULATION_COMPILER = 2;

  /**
   * The number of structural features of the '<em>Model Compiler</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_COMPILER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.prom.kibuild.impl.SimulationCompilerImpl <em>Simulation Compiler</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.prom.kibuild.impl.SimulationCompilerImpl
   * @see de.cau.cs.kieler.prom.kibuild.impl.KibuildPackageImpl#getSimulationCompiler()
   * @generated
   */
  int SIMULATION_COMPILER = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMULATION_COMPILER__NAME = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMULATION_COMPILER__ATTRIBUTES = 1;

  /**
   * The number of structural features of the '<em>Simulation Compiler</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMULATION_COMPILER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.prom.kibuild.impl.TemplateProcessorImpl <em>Template Processor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.prom.kibuild.impl.TemplateProcessorImpl
   * @see de.cau.cs.kieler.prom.kibuild.impl.KibuildPackageImpl#getTemplateProcessor()
   * @generated
   */
  int TEMPLATE_PROCESSOR = 3;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_PROCESSOR__ATTRIBUTES = 0;

  /**
   * The number of structural features of the '<em>Template Processor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_PROCESSOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.prom.kibuild.impl.AttributeMappingImpl <em>Attribute Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.prom.kibuild.impl.AttributeMappingImpl
   * @see de.cau.cs.kieler.prom.kibuild.impl.KibuildPackageImpl#getAttributeMapping()
   * @generated
   */
  int ATTRIBUTE_MAPPING = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_MAPPING__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_MAPPING__VALUE = 1;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_MAPPING__VALUES = 2;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_MAPPING__ATTRIBUTES = 3;

  /**
   * The number of structural features of the '<em>Attribute Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_MAPPING_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.prom.kibuild.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.prom.kibuild.impl.LiteralImpl
   * @see de.cau.cs.kieler.prom.kibuild.impl.KibuildPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__VALUE = 0;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.prom.kibuild.impl.SignedFloatImpl <em>Signed Float</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.prom.kibuild.impl.SignedFloatImpl
   * @see de.cau.cs.kieler.prom.kibuild.impl.KibuildPackageImpl#getSignedFloat()
   * @generated
   */
  int SIGNED_FLOAT = 6;

  /**
   * The feature id for the '<em><b>Sign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNED_FLOAT__SIGN = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNED_FLOAT__VALUE = 1;

  /**
   * The number of structural features of the '<em>Signed Float</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNED_FLOAT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.prom.kibuild.impl.SignedIntImpl <em>Signed Int</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.prom.kibuild.impl.SignedIntImpl
   * @see de.cau.cs.kieler.prom.kibuild.impl.KibuildPackageImpl#getSignedInt()
   * @generated
   */
  int SIGNED_INT = 7;

  /**
   * The feature id for the '<em><b>Sign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNED_INT__SIGN = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNED_INT__VALUE = 1;

  /**
   * The number of structural features of the '<em>Signed Int</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNED_INT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.prom.kibuild.impl.TextValueImpl <em>Text Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.prom.kibuild.impl.TextValueImpl
   * @see de.cau.cs.kieler.prom.kibuild.impl.KibuildPackageImpl#getTextValue()
   * @generated
   */
  int TEXT_VALUE = 8;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VALUE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Text Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.prom.kibuild.impl.NormalTemplateProcessorImpl <em>Normal Template Processor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.prom.kibuild.impl.NormalTemplateProcessorImpl
   * @see de.cau.cs.kieler.prom.kibuild.impl.KibuildPackageImpl#getNormalTemplateProcessor()
   * @generated
   */
  int NORMAL_TEMPLATE_PROCESSOR = 9;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_TEMPLATE_PROCESSOR__ATTRIBUTES = TEMPLATE_PROCESSOR__ATTRIBUTES;

  /**
   * The number of structural features of the '<em>Normal Template Processor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_TEMPLATE_PROCESSOR_FEATURE_COUNT = TEMPLATE_PROCESSOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.prom.kibuild.impl.SimulationTemplateProcessorImpl <em>Simulation Template Processor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.prom.kibuild.impl.SimulationTemplateProcessorImpl
   * @see de.cau.cs.kieler.prom.kibuild.impl.KibuildPackageImpl#getSimulationTemplateProcessor()
   * @generated
   */
  int SIMULATION_TEMPLATE_PROCESSOR = 10;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMULATION_TEMPLATE_PROCESSOR__ATTRIBUTES = TEMPLATE_PROCESSOR__ATTRIBUTES;

  /**
   * The number of structural features of the '<em>Simulation Template Processor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMULATION_TEMPLATE_PROCESSOR_FEATURE_COUNT = TEMPLATE_PROCESSOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.prom.kibuild.impl.WrapperCodeTemplateProcessorImpl <em>Wrapper Code Template Processor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.prom.kibuild.impl.WrapperCodeTemplateProcessorImpl
   * @see de.cau.cs.kieler.prom.kibuild.impl.KibuildPackageImpl#getWrapperCodeTemplateProcessor()
   * @generated
   */
  int WRAPPER_CODE_TEMPLATE_PROCESSOR = 11;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRAPPER_CODE_TEMPLATE_PROCESSOR__ATTRIBUTES = TEMPLATE_PROCESSOR__ATTRIBUTES;

  /**
   * The number of structural features of the '<em>Wrapper Code Template Processor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRAPPER_CODE_TEMPLATE_PROCESSOR_FEATURE_COUNT = TEMPLATE_PROCESSOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.prom.kibuild.Sign <em>Sign</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.prom.kibuild.Sign
   * @see de.cau.cs.kieler.prom.kibuild.impl.KibuildPackageImpl#getSign()
   * @generated
   */
  int SIGN = 12;


  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.prom.kibuild.BuildConfiguration <em>Build Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Build Configuration</em>'.
   * @see de.cau.cs.kieler.prom.kibuild.BuildConfiguration
   * @generated
   */
  EClass getBuildConfiguration();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.prom.kibuild.BuildConfiguration#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see de.cau.cs.kieler.prom.kibuild.BuildConfiguration#getAttributes()
   * @see #getBuildConfiguration()
   * @generated
   */
  EReference getBuildConfiguration_Attributes();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.prom.kibuild.BuildConfiguration#getModelCompilers <em>Model Compilers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Model Compilers</em>'.
   * @see de.cau.cs.kieler.prom.kibuild.BuildConfiguration#getModelCompilers()
   * @see #getBuildConfiguration()
   * @generated
   */
  EReference getBuildConfiguration_ModelCompilers();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.prom.kibuild.BuildConfiguration#getSimulationCompilers <em>Simulation Compilers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Simulation Compilers</em>'.
   * @see de.cau.cs.kieler.prom.kibuild.BuildConfiguration#getSimulationCompilers()
   * @see #getBuildConfiguration()
   * @generated
   */
  EReference getBuildConfiguration_SimulationCompilers();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.prom.kibuild.BuildConfiguration#getTemplateProcessors <em>Template Processors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Template Processors</em>'.
   * @see de.cau.cs.kieler.prom.kibuild.BuildConfiguration#getTemplateProcessors()
   * @see #getBuildConfiguration()
   * @generated
   */
  EReference getBuildConfiguration_TemplateProcessors();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.prom.kibuild.ModelCompiler <em>Model Compiler</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Compiler</em>'.
   * @see de.cau.cs.kieler.prom.kibuild.ModelCompiler
   * @generated
   */
  EClass getModelCompiler();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.prom.kibuild.ModelCompiler#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.prom.kibuild.ModelCompiler#getName()
   * @see #getModelCompiler()
   * @generated
   */
  EAttribute getModelCompiler_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.prom.kibuild.ModelCompiler#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see de.cau.cs.kieler.prom.kibuild.ModelCompiler#getAttributes()
   * @see #getModelCompiler()
   * @generated
   */
  EReference getModelCompiler_Attributes();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.prom.kibuild.ModelCompiler#getSimulationCompiler <em>Simulation Compiler</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Simulation Compiler</em>'.
   * @see de.cau.cs.kieler.prom.kibuild.ModelCompiler#getSimulationCompiler()
   * @see #getModelCompiler()
   * @generated
   */
  EReference getModelCompiler_SimulationCompiler();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.prom.kibuild.SimulationCompiler <em>Simulation Compiler</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simulation Compiler</em>'.
   * @see de.cau.cs.kieler.prom.kibuild.SimulationCompiler
   * @generated
   */
  EClass getSimulationCompiler();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.prom.kibuild.SimulationCompiler#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.prom.kibuild.SimulationCompiler#getName()
   * @see #getSimulationCompiler()
   * @generated
   */
  EAttribute getSimulationCompiler_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.prom.kibuild.SimulationCompiler#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see de.cau.cs.kieler.prom.kibuild.SimulationCompiler#getAttributes()
   * @see #getSimulationCompiler()
   * @generated
   */
  EReference getSimulationCompiler_Attributes();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.prom.kibuild.TemplateProcessor <em>Template Processor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template Processor</em>'.
   * @see de.cau.cs.kieler.prom.kibuild.TemplateProcessor
   * @generated
   */
  EClass getTemplateProcessor();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.prom.kibuild.TemplateProcessor#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see de.cau.cs.kieler.prom.kibuild.TemplateProcessor#getAttributes()
   * @see #getTemplateProcessor()
   * @generated
   */
  EReference getTemplateProcessor_Attributes();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.prom.kibuild.AttributeMapping <em>Attribute Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Mapping</em>'.
   * @see de.cau.cs.kieler.prom.kibuild.AttributeMapping
   * @generated
   */
  EClass getAttributeMapping();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.prom.kibuild.AttributeMapping#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.prom.kibuild.AttributeMapping#getName()
   * @see #getAttributeMapping()
   * @generated
   */
  EAttribute getAttributeMapping_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.prom.kibuild.AttributeMapping#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.cau.cs.kieler.prom.kibuild.AttributeMapping#getValue()
   * @see #getAttributeMapping()
   * @generated
   */
  EReference getAttributeMapping_Value();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.prom.kibuild.AttributeMapping#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see de.cau.cs.kieler.prom.kibuild.AttributeMapping#getValues()
   * @see #getAttributeMapping()
   * @generated
   */
  EReference getAttributeMapping_Values();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.prom.kibuild.AttributeMapping#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see de.cau.cs.kieler.prom.kibuild.AttributeMapping#getAttributes()
   * @see #getAttributeMapping()
   * @generated
   */
  EReference getAttributeMapping_Attributes();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.prom.kibuild.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see de.cau.cs.kieler.prom.kibuild.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.prom.kibuild.Literal#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.cau.cs.kieler.prom.kibuild.Literal#getValue()
   * @see #getLiteral()
   * @generated
   */
  EReference getLiteral_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.prom.kibuild.SignedFloat <em>Signed Float</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signed Float</em>'.
   * @see de.cau.cs.kieler.prom.kibuild.SignedFloat
   * @generated
   */
  EClass getSignedFloat();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.prom.kibuild.SignedFloat#getSign <em>Sign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sign</em>'.
   * @see de.cau.cs.kieler.prom.kibuild.SignedFloat#getSign()
   * @see #getSignedFloat()
   * @generated
   */
  EAttribute getSignedFloat_Sign();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.prom.kibuild.SignedFloat#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.kieler.prom.kibuild.SignedFloat#getValue()
   * @see #getSignedFloat()
   * @generated
   */
  EAttribute getSignedFloat_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.prom.kibuild.SignedInt <em>Signed Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signed Int</em>'.
   * @see de.cau.cs.kieler.prom.kibuild.SignedInt
   * @generated
   */
  EClass getSignedInt();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.prom.kibuild.SignedInt#getSign <em>Sign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sign</em>'.
   * @see de.cau.cs.kieler.prom.kibuild.SignedInt#getSign()
   * @see #getSignedInt()
   * @generated
   */
  EAttribute getSignedInt_Sign();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.prom.kibuild.SignedInt#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.kieler.prom.kibuild.SignedInt#getValue()
   * @see #getSignedInt()
   * @generated
   */
  EAttribute getSignedInt_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.prom.kibuild.TextValue <em>Text Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Value</em>'.
   * @see de.cau.cs.kieler.prom.kibuild.TextValue
   * @generated
   */
  EClass getTextValue();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.prom.kibuild.TextValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.kieler.prom.kibuild.TextValue#getValue()
   * @see #getTextValue()
   * @generated
   */
  EAttribute getTextValue_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.prom.kibuild.NormalTemplateProcessor <em>Normal Template Processor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Normal Template Processor</em>'.
   * @see de.cau.cs.kieler.prom.kibuild.NormalTemplateProcessor
   * @generated
   */
  EClass getNormalTemplateProcessor();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.prom.kibuild.SimulationTemplateProcessor <em>Simulation Template Processor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simulation Template Processor</em>'.
   * @see de.cau.cs.kieler.prom.kibuild.SimulationTemplateProcessor
   * @generated
   */
  EClass getSimulationTemplateProcessor();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.prom.kibuild.WrapperCodeTemplateProcessor <em>Wrapper Code Template Processor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Wrapper Code Template Processor</em>'.
   * @see de.cau.cs.kieler.prom.kibuild.WrapperCodeTemplateProcessor
   * @generated
   */
  EClass getWrapperCodeTemplateProcessor();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.kieler.prom.kibuild.Sign <em>Sign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Sign</em>'.
   * @see de.cau.cs.kieler.prom.kibuild.Sign
   * @generated
   */
  EEnum getSign();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  KibuildFactory getKibuildFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.prom.kibuild.impl.BuildConfigurationImpl <em>Build Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.prom.kibuild.impl.BuildConfigurationImpl
     * @see de.cau.cs.kieler.prom.kibuild.impl.KibuildPackageImpl#getBuildConfiguration()
     * @generated
     */
    EClass BUILD_CONFIGURATION = eINSTANCE.getBuildConfiguration();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILD_CONFIGURATION__ATTRIBUTES = eINSTANCE.getBuildConfiguration_Attributes();

    /**
     * The meta object literal for the '<em><b>Model Compilers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILD_CONFIGURATION__MODEL_COMPILERS = eINSTANCE.getBuildConfiguration_ModelCompilers();

    /**
     * The meta object literal for the '<em><b>Simulation Compilers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILD_CONFIGURATION__SIMULATION_COMPILERS = eINSTANCE.getBuildConfiguration_SimulationCompilers();

    /**
     * The meta object literal for the '<em><b>Template Processors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILD_CONFIGURATION__TEMPLATE_PROCESSORS = eINSTANCE.getBuildConfiguration_TemplateProcessors();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.prom.kibuild.impl.ModelCompilerImpl <em>Model Compiler</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.prom.kibuild.impl.ModelCompilerImpl
     * @see de.cau.cs.kieler.prom.kibuild.impl.KibuildPackageImpl#getModelCompiler()
     * @generated
     */
    EClass MODEL_COMPILER = eINSTANCE.getModelCompiler();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL_COMPILER__NAME = eINSTANCE.getModelCompiler_Name();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_COMPILER__ATTRIBUTES = eINSTANCE.getModelCompiler_Attributes();

    /**
     * The meta object literal for the '<em><b>Simulation Compiler</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_COMPILER__SIMULATION_COMPILER = eINSTANCE.getModelCompiler_SimulationCompiler();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.prom.kibuild.impl.SimulationCompilerImpl <em>Simulation Compiler</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.prom.kibuild.impl.SimulationCompilerImpl
     * @see de.cau.cs.kieler.prom.kibuild.impl.KibuildPackageImpl#getSimulationCompiler()
     * @generated
     */
    EClass SIMULATION_COMPILER = eINSTANCE.getSimulationCompiler();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMULATION_COMPILER__NAME = eINSTANCE.getSimulationCompiler_Name();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMULATION_COMPILER__ATTRIBUTES = eINSTANCE.getSimulationCompiler_Attributes();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.prom.kibuild.impl.TemplateProcessorImpl <em>Template Processor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.prom.kibuild.impl.TemplateProcessorImpl
     * @see de.cau.cs.kieler.prom.kibuild.impl.KibuildPackageImpl#getTemplateProcessor()
     * @generated
     */
    EClass TEMPLATE_PROCESSOR = eINSTANCE.getTemplateProcessor();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_PROCESSOR__ATTRIBUTES = eINSTANCE.getTemplateProcessor_Attributes();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.prom.kibuild.impl.AttributeMappingImpl <em>Attribute Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.prom.kibuild.impl.AttributeMappingImpl
     * @see de.cau.cs.kieler.prom.kibuild.impl.KibuildPackageImpl#getAttributeMapping()
     * @generated
     */
    EClass ATTRIBUTE_MAPPING = eINSTANCE.getAttributeMapping();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_MAPPING__NAME = eINSTANCE.getAttributeMapping_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_MAPPING__VALUE = eINSTANCE.getAttributeMapping_Value();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_MAPPING__VALUES = eINSTANCE.getAttributeMapping_Values();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_MAPPING__ATTRIBUTES = eINSTANCE.getAttributeMapping_Attributes();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.prom.kibuild.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.prom.kibuild.impl.LiteralImpl
     * @see de.cau.cs.kieler.prom.kibuild.impl.KibuildPackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LITERAL__VALUE = eINSTANCE.getLiteral_Value();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.prom.kibuild.impl.SignedFloatImpl <em>Signed Float</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.prom.kibuild.impl.SignedFloatImpl
     * @see de.cau.cs.kieler.prom.kibuild.impl.KibuildPackageImpl#getSignedFloat()
     * @generated
     */
    EClass SIGNED_FLOAT = eINSTANCE.getSignedFloat();

    /**
     * The meta object literal for the '<em><b>Sign</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIGNED_FLOAT__SIGN = eINSTANCE.getSignedFloat_Sign();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIGNED_FLOAT__VALUE = eINSTANCE.getSignedFloat_Value();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.prom.kibuild.impl.SignedIntImpl <em>Signed Int</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.prom.kibuild.impl.SignedIntImpl
     * @see de.cau.cs.kieler.prom.kibuild.impl.KibuildPackageImpl#getSignedInt()
     * @generated
     */
    EClass SIGNED_INT = eINSTANCE.getSignedInt();

    /**
     * The meta object literal for the '<em><b>Sign</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIGNED_INT__SIGN = eINSTANCE.getSignedInt_Sign();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIGNED_INT__VALUE = eINSTANCE.getSignedInt_Value();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.prom.kibuild.impl.TextValueImpl <em>Text Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.prom.kibuild.impl.TextValueImpl
     * @see de.cau.cs.kieler.prom.kibuild.impl.KibuildPackageImpl#getTextValue()
     * @generated
     */
    EClass TEXT_VALUE = eINSTANCE.getTextValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT_VALUE__VALUE = eINSTANCE.getTextValue_Value();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.prom.kibuild.impl.NormalTemplateProcessorImpl <em>Normal Template Processor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.prom.kibuild.impl.NormalTemplateProcessorImpl
     * @see de.cau.cs.kieler.prom.kibuild.impl.KibuildPackageImpl#getNormalTemplateProcessor()
     * @generated
     */
    EClass NORMAL_TEMPLATE_PROCESSOR = eINSTANCE.getNormalTemplateProcessor();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.prom.kibuild.impl.SimulationTemplateProcessorImpl <em>Simulation Template Processor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.prom.kibuild.impl.SimulationTemplateProcessorImpl
     * @see de.cau.cs.kieler.prom.kibuild.impl.KibuildPackageImpl#getSimulationTemplateProcessor()
     * @generated
     */
    EClass SIMULATION_TEMPLATE_PROCESSOR = eINSTANCE.getSimulationTemplateProcessor();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.prom.kibuild.impl.WrapperCodeTemplateProcessorImpl <em>Wrapper Code Template Processor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.prom.kibuild.impl.WrapperCodeTemplateProcessorImpl
     * @see de.cau.cs.kieler.prom.kibuild.impl.KibuildPackageImpl#getWrapperCodeTemplateProcessor()
     * @generated
     */
    EClass WRAPPER_CODE_TEMPLATE_PROCESSOR = eINSTANCE.getWrapperCodeTemplateProcessor();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.prom.kibuild.Sign <em>Sign</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.prom.kibuild.Sign
     * @see de.cau.cs.kieler.prom.kibuild.impl.KibuildPackageImpl#getSign()
     * @generated
     */
    EEnum SIGN = eINSTANCE.getSign();

  }

} //KibuildPackage
