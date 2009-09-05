/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.dsl.kits;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.synccharts.dsl.kits.KitsPackage
 * @generated
 */
public interface KitsFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  KitsFactory eINSTANCE = de.cau.cs.kieler.synccharts.dsl.kits.impl.KitsFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Region</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Region</em>'.
   * @generated
   */
  Region createRegion();

  /**
   * Returns a new object of class '<em>State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State</em>'.
   * @generated
   */
  State createState();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  KitsPackage getKitsPackage();

} //KitsFactory
