/**
 */
package de.cau.cs.kieler.esterel.scest.scest;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.esterel.scest.scest.ScestPackage
 * @generated
 */
public interface ScestFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ScestFactory eINSTANCE = de.cau.cs.kieler.esterel.scest.scest.impl.ScestFactoryImpl.init();

  /**
   * Returns a new object of class '<em>SC Est Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SC Est Program</em>'.
   * @generated
   */
  SCEstProgram createSCEstProgram();

  /**
   * Returns a new object of class '<em>SC Est Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SC Est Module</em>'.
   * @generated
   */
  SCEstModule createSCEstModule();

  /**
   * Returns a new object of class '<em>Un Emit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Un Emit</em>'.
   * @generated
   */
  UnEmit createUnEmit();

  /**
   * Returns a new object of class '<em>Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set</em>'.
   * @generated
   */
  Set createSet();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ScestPackage getScestPackage();

} //ScestFactory
