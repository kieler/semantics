/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scgdep;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.scgdep.ScgdepPackage
 * @generated
 */
public interface ScgdepFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ScgdepFactory eINSTANCE = de.cau.cs.kieler.scgdep.impl.ScgdepFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Dependency</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Dependency</em>'.
     * @generated
     */
    Dependency createDependency();

    /**
     * Returns a new object of class '<em>Absolute Write Read</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Absolute Write Read</em>'.
     * @generated
     */
    AbsoluteWrite_Read createAbsoluteWrite_Read();

    /**
     * Returns a new object of class '<em>Relative Write Read</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Relative Write Read</em>'.
     * @generated
     */
    RelativeWrite_Read createRelativeWrite_Read();

    /**
     * Returns a new object of class '<em>Absolute Write Relative Write</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Absolute Write Relative Write</em>'.
     * @generated
     */
    AbsoluteWrite_RelativeWrite createAbsoluteWrite_RelativeWrite();

    /**
     * Returns a new object of class '<em>Write Write</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Write Write</em>'.
     * @generated
     */
    Write_Write createWrite_Write();

    /**
     * Returns a new object of class '<em>Conditional Dep</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Conditional Dep</em>'.
     * @generated
     */
    ConditionalDep createConditionalDep();

    /**
     * Returns a new object of class '<em>Assignment Dep</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Assignment Dep</em>'.
     * @generated
     */
    AssignmentDep createAssignmentDep();

    /**
     * Returns a new object of class '<em>SC Graph Dep</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>SC Graph Dep</em>'.
     * @generated
     */
    SCGraphDep createSCGraphDep();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ScgdepPackage getScgdepPackage();

} //ScgdepFactory
