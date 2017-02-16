/**
 */
package de.cau.cs.kieler.kicool;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.kicool.KiCoolPackage
 * @generated
 */
public interface KiCoolFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    KiCoolFactory eINSTANCE = de.cau.cs.kieler.kicool.impl.KiCoolFactoryImpl.init();

    /**
     * Returns a new object of class '<em>System</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>System</em>'.
     * @generated
     */
    System createSystem();

    /**
     * Returns a new object of class '<em>Processor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Processor</em>'.
     * @generated
     */
    Processor createProcessor();

    /**
     * Returns a new object of class '<em>Processor System</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Processor System</em>'.
     * @generated
     */
    ProcessorSystem createProcessorSystem();

    /**
     * Returns a new object of class '<em>Processor Group</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Processor Group</em>'.
     * @generated
     */
    ProcessorGroup createProcessorGroup();

    /**
     * Returns a new object of class '<em>Processor Alternative Group</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Processor Alternative Group</em>'.
     * @generated
     */
    ProcessorAlternativeGroup createProcessorAlternativeGroup();

    /**
     * Returns a new object of class '<em>Metric</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Metric</em>'.
     * @generated
     */
    Metric createMetric();

    /**
     * Returns a new object of class '<em>Processor Context</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Processor Context</em>'.
     * @generated
     */
    ProcessorContext createProcessorContext();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    KiCoolPackage getKiCoolPackage();

} //KiCoolFactory
