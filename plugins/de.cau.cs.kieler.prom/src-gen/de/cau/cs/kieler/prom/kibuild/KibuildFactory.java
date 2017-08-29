/**
 */
package de.cau.cs.kieler.prom.kibuild;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.prom.kibuild.KibuildPackage
 * @generated
 */
public interface KibuildFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  KibuildFactory eINSTANCE = de.cau.cs.kieler.prom.kibuild.impl.KibuildFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Build Configuration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Build Configuration</em>'.
   * @generated
   */
  BuildConfiguration createBuildConfiguration();

  /**
   * Returns a new object of class '<em>Model Compiler</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Compiler</em>'.
   * @generated
   */
  ModelCompiler createModelCompiler();

  /**
   * Returns a new object of class '<em>Simulation Compiler</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simulation Compiler</em>'.
   * @generated
   */
  SimulationCompiler createSimulationCompiler();

  /**
   * Returns a new object of class '<em>Template Processor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Template Processor</em>'.
   * @generated
   */
  TemplateProcessor createTemplateProcessor();

  /**
   * Returns a new object of class '<em>Attribute Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Mapping</em>'.
   * @generated
   */
  AttributeMapping createAttributeMapping();

  /**
   * Returns a new object of class '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal</em>'.
   * @generated
   */
  Literal createLiteral();

  /**
   * Returns a new object of class '<em>Signed Float</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Signed Float</em>'.
   * @generated
   */
  SignedFloat createSignedFloat();

  /**
   * Returns a new object of class '<em>Signed Int</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Signed Int</em>'.
   * @generated
   */
  SignedInt createSignedInt();

  /**
   * Returns a new object of class '<em>Text Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text Value</em>'.
   * @generated
   */
  TextValue createTextValue();

  /**
   * Returns a new object of class '<em>Normal Template Processor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Normal Template Processor</em>'.
   * @generated
   */
  NormalTemplateProcessor createNormalTemplateProcessor();

  /**
   * Returns a new object of class '<em>Simulation Template Processor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simulation Template Processor</em>'.
   * @generated
   */
  SimulationTemplateProcessor createSimulationTemplateProcessor();

  /**
   * Returns a new object of class '<em>Wrapper Code Template Processor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wrapper Code Template Processor</em>'.
   * @generated
   */
  WrapperCodeTemplateProcessor createWrapperCodeTemplateProcessor();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  KibuildPackage getKibuildPackage();

} //KibuildFactory
