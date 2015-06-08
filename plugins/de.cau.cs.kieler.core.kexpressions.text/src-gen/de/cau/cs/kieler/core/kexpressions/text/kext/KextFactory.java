/**
 */
package de.cau.cs.kieler.core.kexpressions.text.kext;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.core.kexpressions.text.kext.KextPackage
 * @generated
 */
public interface KextFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  KextFactory eINSTANCE = de.cau.cs.kieler.core.kexpressions.text.kext.impl.KextFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Kext</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Kext</em>'.
   * @generated
   */
  Kext createKext();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  KextPackage getKextPackage();

} //KextFactory
