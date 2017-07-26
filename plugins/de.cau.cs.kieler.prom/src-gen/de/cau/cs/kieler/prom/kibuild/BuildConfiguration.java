/**
 */
package de.cau.cs.kieler.prom.kibuild;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Build Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.prom.kibuild.BuildConfiguration#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.cau.cs.kieler.prom.kibuild.BuildConfiguration#getModelCompilers <em>Model Compilers</em>}</li>
 *   <li>{@link de.cau.cs.kieler.prom.kibuild.BuildConfiguration#getSimulationCompilers <em>Simulation Compilers</em>}</li>
 *   <li>{@link de.cau.cs.kieler.prom.kibuild.BuildConfiguration#getTemplateProcessors <em>Template Processors</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.prom.kibuild.KibuildPackage#getBuildConfiguration()
 * @model
 * @generated
 */
public interface BuildConfiguration extends EObject
{
  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.prom.kibuild.AttributeMapping}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see de.cau.cs.kieler.prom.kibuild.KibuildPackage#getBuildConfiguration_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<AttributeMapping> getAttributes();

  /**
   * Returns the value of the '<em><b>Model Compilers</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.prom.kibuild.ModelCompiler}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Compilers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Compilers</em>' containment reference list.
   * @see de.cau.cs.kieler.prom.kibuild.KibuildPackage#getBuildConfiguration_ModelCompilers()
   * @model containment="true"
   * @generated
   */
  EList<ModelCompiler> getModelCompilers();

  /**
   * Returns the value of the '<em><b>Simulation Compilers</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.prom.kibuild.SimulationCompiler}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Simulation Compilers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simulation Compilers</em>' containment reference list.
   * @see de.cau.cs.kieler.prom.kibuild.KibuildPackage#getBuildConfiguration_SimulationCompilers()
   * @model containment="true"
   * @generated
   */
  EList<SimulationCompiler> getSimulationCompilers();

  /**
   * Returns the value of the '<em><b>Template Processors</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.prom.kibuild.TemplateProcessor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Template Processors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Template Processors</em>' containment reference list.
   * @see de.cau.cs.kieler.prom.kibuild.KibuildPackage#getBuildConfiguration_TemplateProcessors()
   * @model containment="true"
   * @generated
   */
  EList<TemplateProcessor> getTemplateProcessors();

} // BuildConfiguration
