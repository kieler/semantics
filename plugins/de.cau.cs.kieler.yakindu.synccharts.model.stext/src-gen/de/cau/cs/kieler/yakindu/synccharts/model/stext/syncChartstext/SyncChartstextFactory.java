/**
 */
package de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.SyncChartstextPackage
 * @generated
 */
public interface SyncChartstextFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SyncChartstextFactory eINSTANCE = de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.impl.SyncChartstextFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Variable Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Definition</em>'.
   * @generated
   */
  VariableDefinition createVariableDefinition();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SyncChartstextPackage getSyncChartstextPackage();

} //SyncChartstextFactory
