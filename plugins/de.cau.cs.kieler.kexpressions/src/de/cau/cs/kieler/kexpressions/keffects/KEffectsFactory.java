/**
 */
package de.cau.cs.kieler.kexpressions.keffects;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage
 * @generated
 */
public interface KEffectsFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    KEffectsFactory eINSTANCE = de.cau.cs.kieler.kexpressions.keffects.impl.KEffectsFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Assignment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Assignment</em>'.
     * @generated
     */
    Assignment createAssignment();

    /**
     * Returns a new object of class '<em>Emission</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Emission</em>'.
     * @generated
     */
    Emission createEmission();

    /**
     * Returns a new object of class '<em>Hostcode Effect</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Hostcode Effect</em>'.
     * @generated
     */
    HostcodeEffect createHostcodeEffect();

    /**
     * Returns a new object of class '<em>Reference Call Effect</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Reference Call Effect</em>'.
     * @generated
     */
    ReferenceCallEffect createReferenceCallEffect();

    /**
     * Returns a new object of class '<em>Function Call Effect</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Function Call Effect</em>'.
     * @generated
     */
    FunctionCallEffect createFunctionCallEffect();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    KEffectsPackage getKEffectsPackage();

} //KEffectsFactory
