/**
 */
package de.cau.cs.kieler.sccharts.text.sct.sct;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.sccharts.text.sct.sct.SctPackage
 * @generated
 */
public interface SctFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SctFactory eINSTANCE = de.cau.cs.kieler.sccharts.text.sct.sct.impl.SctFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Import Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import Decl</em>'.
   * @generated
   */
  ImportDecl createImportDecl();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SctPackage getSctPackage();

} //SctFactory
