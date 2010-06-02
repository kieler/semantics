/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.annotations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.annotations.AnnotationsPackage
 * @generated
 */
public interface AnnotationsFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    AnnotationsFactory eINSTANCE = de.cau.cs.kieler.annotations.impl.AnnotationsFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Annotation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Annotation</em>'.
     * @generated
     */
    Annotation createAnnotation();

    /**
     * Returns a new object of class '<em>String Annotation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>String Annotation</em>'.
     * @generated
     */
    StringAnnotation createStringAnnotation();

    /**
     * Returns a new object of class '<em>Reference Annotation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Reference Annotation</em>'.
     * @generated
     */
    ReferenceAnnotation createReferenceAnnotation();

    /**
     * Returns a new object of class '<em>Boolean Annotation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Boolean Annotation</em>'.
     * @generated
     */
    BooleanAnnotation createBooleanAnnotation();

    /**
     * Returns a new object of class '<em>Int Annotation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Int Annotation</em>'.
     * @generated
     */
    IntAnnotation createIntAnnotation();

    /**
     * Returns a new object of class '<em>Float Annotation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Float Annotation</em>'.
     * @generated
     */
    FloatAnnotation createFloatAnnotation();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    AnnotationsPackage getAnnotationsPackage();

} //AnnotationsFactory
