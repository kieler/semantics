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
package de.cau.cs.kieler.scgsched;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.scgsched.ScgschedPackage
 * @generated
 */
public interface ScgschedFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ScgschedFactory eINSTANCE = de.cau.cs.kieler.scgsched.impl.ScgschedFactoryImpl.init();

    /**
     * Returns a new object of class '<em>SC Graph Sched</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>SC Graph Sched</em>'.
     * @generated
     */
    SCGraphSched createSCGraphSched();

    /**
     * Returns a new object of class '<em>Empty Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Empty Expression</em>'.
     * @generated
     */
    EmptyExpression createEmptyExpression();

    /**
     * Returns a new object of class '<em>Guard Expression</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Guard Expression</em>'.
     * @generated
     */
	GuardExpression createGuardExpression();

				/**
     * Returns a new object of class '<em>Schedule</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Schedule</em>'.
     * @generated
     */
    Schedule createSchedule();

    /**
     * Returns a new object of class '<em>Analysis</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Analysis</em>'.
     * @generated
     */
	Analysis createAnalysis();

				/**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ScgschedPackage getScgschedPackage();

} //ScgschedFactory
