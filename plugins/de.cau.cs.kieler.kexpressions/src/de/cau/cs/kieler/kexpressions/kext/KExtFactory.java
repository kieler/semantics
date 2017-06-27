/**
 */
package de.cau.cs.kieler.kexpressions.kext;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.kexpressions.kext.KExtPackage
 * @generated
 */
public interface KExtFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    KExtFactory eINSTANCE = de.cau.cs.kieler.kexpressions.kext.impl.KExtFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Kext</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Kext</em>'.
     * @generated
     */
    Kext createKext();

    /**
     * Returns a new object of class '<em>Scope</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Scope</em>'.
     * @generated
     */
    KExtScope createKExtScope();

    /**
     * Returns a new object of class '<em>Test Entity</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Test Entity</em>'.
     * @generated
     */
    TestEntity createTestEntity();

    /**
     * Returns a new object of class '<em>Annotated Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Annotated Expression</em>'.
     * @generated
     */
    AnnotatedExpression createAnnotatedExpression();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    KExtPackage getKExtPackage();

} //KExtFactory
