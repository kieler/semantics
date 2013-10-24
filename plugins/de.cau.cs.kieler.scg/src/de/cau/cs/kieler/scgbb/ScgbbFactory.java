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
package de.cau.cs.kieler.scgbb;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.scgbb.ScgbbPackage
 * @generated
 */
public interface ScgbbFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ScgbbFactory eINSTANCE = de.cau.cs.kieler.scgbb.impl.ScgbbFactoryImpl.init();

    /**
     * Returns a new object of class '<em>SC Graph BB</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>SC Graph BB</em>'.
     * @generated
     */
    SCGraphBB createSCGraphBB();

    /**
     * Returns a new object of class '<em>Basic Block</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Basic Block</em>'.
     * @generated
     */
    BasicBlock createBasicBlock();

    /**
     * Returns a new object of class '<em>Scheduling Block</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Scheduling Block</em>'.
     * @generated
     */
    SchedulingBlock createSchedulingBlock();

    /**
     * Returns a new object of class '<em>Activation Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Activation Expression</em>'.
     * @generated
     */
    ActivationExpression createActivationExpression();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ScgbbPackage getScgbbPackage();

} //ScgbbFactory
