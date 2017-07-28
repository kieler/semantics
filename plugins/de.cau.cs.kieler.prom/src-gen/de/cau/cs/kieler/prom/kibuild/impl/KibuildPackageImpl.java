/**
 */
package de.cau.cs.kieler.prom.kibuild.impl;

import de.cau.cs.kieler.prom.kibuild.AttributeMapping;
import de.cau.cs.kieler.prom.kibuild.BuildConfiguration;
import de.cau.cs.kieler.prom.kibuild.KibuildFactory;
import de.cau.cs.kieler.prom.kibuild.KibuildPackage;
import de.cau.cs.kieler.prom.kibuild.Literal;
import de.cau.cs.kieler.prom.kibuild.ModelCompiler;
import de.cau.cs.kieler.prom.kibuild.NormalTemplateProcessor;
import de.cau.cs.kieler.prom.kibuild.Sign;
import de.cau.cs.kieler.prom.kibuild.SignedFloat;
import de.cau.cs.kieler.prom.kibuild.SignedInt;
import de.cau.cs.kieler.prom.kibuild.SimulationCompiler;
import de.cau.cs.kieler.prom.kibuild.SimulationTemplateProcessor;
import de.cau.cs.kieler.prom.kibuild.TemplateProcessor;
import de.cau.cs.kieler.prom.kibuild.TextValue;
import de.cau.cs.kieler.prom.kibuild.WrapperCodeTemplateProcessor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KibuildPackageImpl extends EPackageImpl implements KibuildPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass buildConfigurationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelCompilerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simulationCompilerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass templateProcessorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass signedFloatEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass signedIntEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass normalTemplateProcessorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simulationTemplateProcessorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wrapperCodeTemplateProcessorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum signEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see de.cau.cs.kieler.prom.kibuild.KibuildPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private KibuildPackageImpl()
  {
    super(eNS_URI, KibuildFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link KibuildPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static KibuildPackage init()
  {
    if (isInited) return (KibuildPackage)EPackage.Registry.INSTANCE.getEPackage(KibuildPackage.eNS_URI);

    // Obtain or create and register package
    KibuildPackageImpl theKibuildPackage = (KibuildPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof KibuildPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new KibuildPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theKibuildPackage.createPackageContents();

    // Initialize created meta-data
    theKibuildPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theKibuildPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(KibuildPackage.eNS_URI, theKibuildPackage);
    return theKibuildPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBuildConfiguration()
  {
    return buildConfigurationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuildConfiguration_Attributes()
  {
    return (EReference)buildConfigurationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuildConfiguration_ModelCompilers()
  {
    return (EReference)buildConfigurationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuildConfiguration_SimulationCompilers()
  {
    return (EReference)buildConfigurationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuildConfiguration_TemplateProcessors()
  {
    return (EReference)buildConfigurationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelCompiler()
  {
    return modelCompilerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModelCompiler_Name()
  {
    return (EAttribute)modelCompilerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelCompiler_Attributes()
  {
    return (EReference)modelCompilerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelCompiler_SimulationProcessor()
  {
    return (EReference)modelCompilerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimulationCompiler()
  {
    return simulationCompilerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimulationCompiler_Name()
  {
    return (EAttribute)simulationCompilerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimulationCompiler_Attributes()
  {
    return (EReference)simulationCompilerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTemplateProcessor()
  {
    return templateProcessorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateProcessor_Attributes()
  {
    return (EReference)templateProcessorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeMapping()
  {
    return attributeMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttributeMapping_Name()
  {
    return (EAttribute)attributeMappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributeMapping_Value()
  {
    return (EReference)attributeMappingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributeMapping_Values()
  {
    return (EReference)attributeMappingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributeMapping_Attributes()
  {
    return (EReference)attributeMappingEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteral()
  {
    return literalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLiteral_Value()
  {
    return (EReference)literalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSignedFloat()
  {
    return signedFloatEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSignedFloat_Sign()
  {
    return (EAttribute)signedFloatEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSignedFloat_Value()
  {
    return (EAttribute)signedFloatEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSignedInt()
  {
    return signedIntEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSignedInt_Sign()
  {
    return (EAttribute)signedIntEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSignedInt_Value()
  {
    return (EAttribute)signedIntEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextValue()
  {
    return textValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTextValue_Value()
  {
    return (EAttribute)textValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNormalTemplateProcessor()
  {
    return normalTemplateProcessorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimulationTemplateProcessor()
  {
    return simulationTemplateProcessorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWrapperCodeTemplateProcessor()
  {
    return wrapperCodeTemplateProcessorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSign()
  {
    return signEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KibuildFactory getKibuildFactory()
  {
    return (KibuildFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    buildConfigurationEClass = createEClass(BUILD_CONFIGURATION);
    createEReference(buildConfigurationEClass, BUILD_CONFIGURATION__ATTRIBUTES);
    createEReference(buildConfigurationEClass, BUILD_CONFIGURATION__MODEL_COMPILERS);
    createEReference(buildConfigurationEClass, BUILD_CONFIGURATION__SIMULATION_COMPILERS);
    createEReference(buildConfigurationEClass, BUILD_CONFIGURATION__TEMPLATE_PROCESSORS);

    modelCompilerEClass = createEClass(MODEL_COMPILER);
    createEAttribute(modelCompilerEClass, MODEL_COMPILER__NAME);
    createEReference(modelCompilerEClass, MODEL_COMPILER__ATTRIBUTES);
    createEReference(modelCompilerEClass, MODEL_COMPILER__SIMULATION_PROCESSOR);

    simulationCompilerEClass = createEClass(SIMULATION_COMPILER);
    createEAttribute(simulationCompilerEClass, SIMULATION_COMPILER__NAME);
    createEReference(simulationCompilerEClass, SIMULATION_COMPILER__ATTRIBUTES);

    templateProcessorEClass = createEClass(TEMPLATE_PROCESSOR);
    createEReference(templateProcessorEClass, TEMPLATE_PROCESSOR__ATTRIBUTES);

    attributeMappingEClass = createEClass(ATTRIBUTE_MAPPING);
    createEAttribute(attributeMappingEClass, ATTRIBUTE_MAPPING__NAME);
    createEReference(attributeMappingEClass, ATTRIBUTE_MAPPING__VALUE);
    createEReference(attributeMappingEClass, ATTRIBUTE_MAPPING__VALUES);
    createEReference(attributeMappingEClass, ATTRIBUTE_MAPPING__ATTRIBUTES);

    literalEClass = createEClass(LITERAL);
    createEReference(literalEClass, LITERAL__VALUE);

    signedFloatEClass = createEClass(SIGNED_FLOAT);
    createEAttribute(signedFloatEClass, SIGNED_FLOAT__SIGN);
    createEAttribute(signedFloatEClass, SIGNED_FLOAT__VALUE);

    signedIntEClass = createEClass(SIGNED_INT);
    createEAttribute(signedIntEClass, SIGNED_INT__SIGN);
    createEAttribute(signedIntEClass, SIGNED_INT__VALUE);

    textValueEClass = createEClass(TEXT_VALUE);
    createEAttribute(textValueEClass, TEXT_VALUE__VALUE);

    normalTemplateProcessorEClass = createEClass(NORMAL_TEMPLATE_PROCESSOR);

    simulationTemplateProcessorEClass = createEClass(SIMULATION_TEMPLATE_PROCESSOR);

    wrapperCodeTemplateProcessorEClass = createEClass(WRAPPER_CODE_TEMPLATE_PROCESSOR);

    // Create enums
    signEEnum = createEEnum(SIGN);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    normalTemplateProcessorEClass.getESuperTypes().add(this.getTemplateProcessor());
    simulationTemplateProcessorEClass.getESuperTypes().add(this.getTemplateProcessor());
    wrapperCodeTemplateProcessorEClass.getESuperTypes().add(this.getTemplateProcessor());

    // Initialize classes and features; add operations and parameters
    initEClass(buildConfigurationEClass, BuildConfiguration.class, "BuildConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBuildConfiguration_Attributes(), this.getAttributeMapping(), null, "attributes", null, 0, -1, BuildConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuildConfiguration_ModelCompilers(), this.getModelCompiler(), null, "modelCompilers", null, 0, -1, BuildConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuildConfiguration_SimulationCompilers(), this.getSimulationCompiler(), null, "simulationCompilers", null, 0, -1, BuildConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuildConfiguration_TemplateProcessors(), this.getTemplateProcessor(), null, "templateProcessors", null, 0, -1, BuildConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelCompilerEClass, ModelCompiler.class, "ModelCompiler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModelCompiler_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelCompiler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelCompiler_Attributes(), this.getAttributeMapping(), null, "attributes", null, 0, -1, ModelCompiler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelCompiler_SimulationProcessor(), this.getTemplateProcessor(), null, "simulationProcessor", null, 0, 1, ModelCompiler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simulationCompilerEClass, SimulationCompiler.class, "SimulationCompiler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSimulationCompiler_Name(), ecorePackage.getEString(), "name", null, 0, 1, SimulationCompiler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimulationCompiler_Attributes(), this.getAttributeMapping(), null, "attributes", null, 0, -1, SimulationCompiler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(templateProcessorEClass, TemplateProcessor.class, "TemplateProcessor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTemplateProcessor_Attributes(), this.getAttributeMapping(), null, "attributes", null, 0, -1, TemplateProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeMappingEClass, AttributeMapping.class, "AttributeMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttributeMapping_Name(), ecorePackage.getEString(), "name", null, 0, 1, AttributeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttributeMapping_Value(), this.getLiteral(), null, "value", null, 0, 1, AttributeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttributeMapping_Values(), this.getLiteral(), null, "values", null, 0, -1, AttributeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttributeMapping_Attributes(), this.getAttributeMapping(), null, "attributes", null, 0, -1, AttributeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLiteral_Value(), ecorePackage.getEObject(), null, "value", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(signedFloatEClass, SignedFloat.class, "SignedFloat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSignedFloat_Sign(), this.getSign(), "sign", null, 0, 1, SignedFloat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSignedFloat_Value(), ecorePackage.getEFloatObject(), "value", null, 0, 1, SignedFloat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(signedIntEClass, SignedInt.class, "SignedInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSignedInt_Sign(), this.getSign(), "sign", null, 0, 1, SignedInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSignedInt_Value(), ecorePackage.getEInt(), "value", null, 0, 1, SignedInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(textValueEClass, TextValue.class, "TextValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTextValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, TextValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(normalTemplateProcessorEClass, NormalTemplateProcessor.class, "NormalTemplateProcessor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(simulationTemplateProcessorEClass, SimulationTemplateProcessor.class, "SimulationTemplateProcessor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(wrapperCodeTemplateProcessorEClass, WrapperCodeTemplateProcessor.class, "WrapperCodeTemplateProcessor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Initialize enums and add enum literals
    initEEnum(signEEnum, Sign.class, "Sign");
    addEEnumLiteral(signEEnum, Sign.POSITIVE);
    addEEnumLiteral(signEEnum, Sign.NEGATIVE);

    // Create resource
    createResource(eNS_URI);
  }

} //KibuildPackageImpl
