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
	 * Returns a new object of class '<em>Typed String Annotation</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Typed String Annotation</em>'.
	 * @generated
	 */
    TypedStringAnnotation createTypedStringAnnotation();

    /**
	 * Returns a new object of class '<em>Comment Annotation</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comment Annotation</em>'.
	 * @generated
	 */
    CommentAnnotation createCommentAnnotation();

    /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
    AnnotationsPackage getAnnotationsPackage();

} //AnnotationsFactory
