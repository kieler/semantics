/**
 */
package de.cau.cs.kieler.simulation.kisim;

import de.cau.cs.kieler.prom.kibuild.AttributeMapping;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulation Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.simulation.kisim.SimulationConfiguration#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simulation.kisim.SimulationConfiguration#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simulation.kisim.SimulationConfiguration#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simulation.kisim.SimulationConfiguration#getExecution <em>Execution</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.simulation.kisim.KisimPackage#getSimulationConfiguration()
 * @model
 * @generated
 */
public interface SimulationConfiguration extends EObject
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
   * @see de.cau.cs.kieler.simulation.kisim.KisimPackage#getSimulationConfiguration_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<AttributeMapping> getAttributes();

  /**
   * Returns the value of the '<em><b>Handlers</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.simulation.kisim.DataHandlerConfiguration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Handlers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Handlers</em>' containment reference list.
   * @see de.cau.cs.kieler.simulation.kisim.KisimPackage#getSimulationConfiguration_Handlers()
   * @model containment="true"
   * @generated
   */
  EList<DataHandlerConfiguration> getHandlers();

  /**
   * Returns the value of the '<em><b>Initialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initialization</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initialization</em>' containment reference.
   * @see #setInitialization(Initialization)
   * @see de.cau.cs.kieler.simulation.kisim.KisimPackage#getSimulationConfiguration_Initialization()
   * @model containment="true"
   * @generated
   */
  Initialization getInitialization();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.simulation.kisim.SimulationConfiguration#getInitialization <em>Initialization</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initialization</em>' containment reference.
   * @see #getInitialization()
   * @generated
   */
  void setInitialization(Initialization value);

  /**
   * Returns the value of the '<em><b>Execution</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Execution</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Execution</em>' containment reference.
   * @see #setExecution(Execution)
   * @see de.cau.cs.kieler.simulation.kisim.KisimPackage#getSimulationConfiguration_Execution()
   * @model containment="true"
   * @generated
   */
  Execution getExecution();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.simulation.kisim.SimulationConfiguration#getExecution <em>Execution</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Execution</em>' containment reference.
   * @see #getExecution()
   * @generated
   */
  void setExecution(Execution value);

} // SimulationConfiguration
