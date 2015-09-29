/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.annotations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.core.annotations.AnnotationsPackage
 * @generated
 */
public interface AnnotationsFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    AnnotationsFactory eINSTANCE = de.cau.cs.kieler.core.annotations.impl.AnnotationsFactoryImpl.init();

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
     * Returns a new object of class '<em>Containment Annotation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Containment Annotation</em>'.
     * @generated
     */
    ContainmentAnnotation createContainmentAnnotation();

    /**
     * Returns a new object of class '<em>Import Annotation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Import Annotation</em>'.
     * @generated
     */
    ImportAnnotation createImportAnnotation();

    /**
     * Returns a new object of class '<em>Typed String Annotation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Typed String Annotation</em>'.
     * @generated
     */
    TypedStringAnnotation createTypedStringAnnotation();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    AnnotationsPackage getAnnotationsPackage();

} //AnnotationsFactory
