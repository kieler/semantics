/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esi;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.esi.EsiPackage
 * @generated
 */
public interface EsiFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EsiFactory eINSTANCE = de.cau.cs.kieler.esi.impl.EsiFactoryImpl.init();

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
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EsiPackage getEsiPackage();

} //EsiFactory
