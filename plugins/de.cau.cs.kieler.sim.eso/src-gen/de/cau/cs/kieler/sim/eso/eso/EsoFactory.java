/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.sim.eso.eso;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.sim.eso.eso.EsoPackage
 * @generated
 */
public interface EsoFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EsoFactory eINSTANCE = de.cau.cs.kieler.sim.eso.eso.impl.EsoFactoryImpl.init();

  /**
   * Returns a new object of class '<em>tracelist</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>tracelist</em>'.
   * @generated
   */
  tracelist createtracelist();

  /**
   * Returns a new object of class '<em>trace</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>trace</em>'.
   * @generated
   */
  trace createtrace();

  /**
   * Returns a new object of class '<em>tick</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>tick</em>'.
   * @generated
   */
  tick createtick();

  /**
   * Returns a new object of class '<em>signal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>signal</em>'.
   * @generated
   */
  signal createsignal();

  /**
   * Returns a new object of class '<em>kvpair</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>kvpair</em>'.
   * @generated
   */
  kvpair createkvpair();

  /**
   * Returns a new object of class '<em>Int</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int</em>'.
   * @generated
   */
  EsoInt createEsoInt();

  /**
   * Returns a new object of class '<em>String</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String</em>'.
   * @generated
   */
  EsoString createEsoString();

  /**
   * Returns a new object of class '<em>Float</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Float</em>'.
   * @generated
   */
  EsoFloat createEsoFloat();

  /**
   * Returns a new object of class '<em>Bool</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bool</em>'.
   * @generated
   */
  EsoBool createEsoBool();

  /**
   * Returns a new object of class '<em>Json</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Json</em>'.
   * @generated
   */
  EsoJson createEsoJson();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EsoPackage getEsoPackage();

} //EsoFactory
