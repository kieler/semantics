/**
 */
package de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.SCChartsExpPackage
 * @generated
 */
public interface SCChartsExpFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SCChartsExpFactory eINSTANCE = de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.impl.SCChartsExpFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Signal Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Signal Definition</em>'.
   * @generated
   */
  SignalDefinition createSignalDefinition();

  /**
   * Returns a new object of class '<em>Variable Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Definition</em>'.
   * @generated
   */
  VariableDefinition createVariableDefinition();

  /**
   * Returns a new object of class '<em>Event Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event Definition</em>'.
   * @generated
   */
  EventDefinition createEventDefinition();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SCChartsExpPackage getSCChartsExpPackage();

} //SCChartsExpFactory
