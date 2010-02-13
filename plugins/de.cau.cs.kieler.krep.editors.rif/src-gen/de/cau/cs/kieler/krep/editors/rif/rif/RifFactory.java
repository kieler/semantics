/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.krep.editors.rif.rif;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.krep.editors.rif.rif.RifPackage
 * @generated
 */
public interface RifFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RifFactory eINSTANCE = de.cau.cs.kieler.krep.editors.rif.rif.impl.RifFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Trace</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trace</em>'.
   * @generated
   */
  Trace createTrace();

  /**
   * Returns a new object of class '<em>decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>decl</em>'.
   * @generated
   */
  decl createdecl();

  /**
   * Returns a new object of class '<em>Tick</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tick</em>'.
   * @generated
   */
  Tick createTick();

  /**
   * Returns a new object of class '<em>Data</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data</em>'.
   * @generated
   */
  Data createData();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RifPackage getRifPackage();

} //RifFactory
