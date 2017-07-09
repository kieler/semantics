/**
 */
package de.cau.cs.kieler.prom.kibuild;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Compiler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.prom.kibuild.ModelCompiler#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.prom.kibuild.ModelCompiler#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.cau.cs.kieler.prom.kibuild.ModelCompiler#getSimulationCompiler <em>Simulation Compiler</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.prom.kibuild.KibuildPackage#getModelCompiler()
 * @model
 * @generated
 */
public interface ModelCompiler extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.cau.cs.kieler.prom.kibuild.KibuildPackage#getModelCompiler_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.prom.kibuild.ModelCompiler#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see de.cau.cs.kieler.prom.kibuild.KibuildPackage#getModelCompiler_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<AttributeMapping> getAttributes();

  /**
   * Returns the value of the '<em><b>Simulation Compiler</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Simulation Compiler</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simulation Compiler</em>' containment reference.
   * @see #setSimulationCompiler(TemplateProcessor)
   * @see de.cau.cs.kieler.prom.kibuild.KibuildPackage#getModelCompiler_SimulationCompiler()
   * @model containment="true"
   * @generated
   */
  TemplateProcessor getSimulationCompiler();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.prom.kibuild.ModelCompiler#getSimulationCompiler <em>Simulation Compiler</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Simulation Compiler</em>' containment reference.
   * @see #getSimulationCompiler()
   * @generated
   */
  void setSimulationCompiler(TemplateProcessor value);

} // ModelCompiler
