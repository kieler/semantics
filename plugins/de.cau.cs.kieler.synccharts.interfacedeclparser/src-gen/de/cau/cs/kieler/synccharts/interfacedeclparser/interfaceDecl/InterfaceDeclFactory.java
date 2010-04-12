/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.InterfaceDeclPackage
 * @generated
 */
public interface InterfaceDeclFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  InterfaceDeclFactory eINSTANCE = de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.impl.InterfaceDeclFactoryImpl.init();

  /**
   * Returns a new object of class '<em>State Extend</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Extend</em>'.
   * @generated
   */
  StateExtend createStateExtend();

  /**
   * Returns a new object of class '<em>Region Signal Dec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Region Signal Dec</em>'.
   * @generated
   */
  RegionSignalDec createRegionSignalDec();

  /**
   * Returns a new object of class '<em>Variables</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variables</em>'.
   * @generated
   */
  Variables createVariables();

  /**
   * Returns a new object of class '<em>Signals</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Signals</em>'.
   * @generated
   */
  Signals createSignals();

  /**
   * Returns a new object of class '<em>Renamings</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Renamings</em>'.
   * @generated
   */
  Renamings createRenamings();

  /**
   * Returns a new object of class '<em>Input Signals</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input Signals</em>'.
   * @generated
   */
  InputSignals createInputSignals();

  /**
   * Returns a new object of class '<em>Output Signals</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output Signals</em>'.
   * @generated
   */
  OutputSignals createOutputSignals();

  /**
   * Returns a new object of class '<em>In Output Signals</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>In Output Signals</em>'.
   * @generated
   */
  InOutputSignals createInOutputSignals();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  InterfaceDeclPackage getInterfaceDeclPackage();

} //InterfaceDeclFactory
