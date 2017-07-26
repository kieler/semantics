/**
 */
package de.cau.cs.kieler.simulation.kisim;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.simulation.kisim.KisimPackage
 * @generated
 */
public interface KisimFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  KisimFactory eINSTANCE = de.cau.cs.kieler.simulation.kisim.impl.KisimFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Simulation Configuration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simulation Configuration</em>'.
   * @generated
   */
  SimulationConfiguration createSimulationConfiguration();

  /**
   * Returns a new object of class '<em>Data Handler Configuration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Handler Configuration</em>'.
   * @generated
   */
  DataHandlerConfiguration createDataHandlerConfiguration();

  /**
   * Returns a new object of class '<em>Initialization</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Initialization</em>'.
   * @generated
   */
  Initialization createInitialization();

  /**
   * Returns a new object of class '<em>Execution</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Execution</em>'.
   * @generated
   */
  Execution createExecution();

  /**
   * Returns a new object of class '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action</em>'.
   * @generated
   */
  Action createAction();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  KisimPackage getKisimPackage();

} //KisimFactory
