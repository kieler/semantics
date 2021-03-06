/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.scg.ScgPackage
 * @generated
 */
public interface ScgFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ScgFactory eINSTANCE = de.cau.cs.kieler.scg.impl.ScgFactoryImpl.init();

    /**
     * Returns a new object of class '<em>SC Graphs</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>SC Graphs</em>'.
     * @generated
     */
    SCGraphs createSCGraphs();

    /**
     * Returns a new object of class '<em>Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Node</em>'.
     * @generated
     */
    Node createNode();

    /**
     * Returns a new object of class '<em>Conditional</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Conditional</em>'.
     * @generated
     */
    Conditional createConditional();

    /**
     * Returns a new object of class '<em>Surface</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Surface</em>'.
     * @generated
     */
    Surface createSurface();

    /**
     * Returns a new object of class '<em>Depth</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Depth</em>'.
     * @generated
     */
    Depth createDepth();

    /**
     * Returns a new object of class '<em>Assignment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Assignment</em>'.
     * @generated
     */
    Assignment createAssignment();

    /**
     * Returns a new object of class '<em>Fork</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Fork</em>'.
     * @generated
     */
    Fork createFork();

    /**
     * Returns a new object of class '<em>Join</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Join</em>'.
     * @generated
     */
    Join createJoin();

    /**
     * Returns a new object of class '<em>SC Graph</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>SC Graph</em>'.
     * @generated
     */
    SCGraph createSCGraph();

    /**
     * Returns a new object of class '<em>Entry</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Entry</em>'.
     * @generated
     */
    Entry createEntry();

    /**
     * Returns a new object of class '<em>Exit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exit</em>'.
     * @generated
     */
    Exit createExit();

    /**
     * Returns a new object of class '<em>Control Flow</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Control Flow</em>'.
     * @generated
     */
    ControlFlow createControlFlow();

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
     * Returns a new object of class '<em>Predecessor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Predecessor</em>'.
     * @generated
     */
    Predecessor createPredecessor();

    /**
     * Returns a new object of class '<em>Expression Dependency</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Expression Dependency</em>'.
     * @generated
     */
	ExpressionDependency createExpressionDependency();

				/**
     * Returns a new object of class '<em>Guard Dependency</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Guard Dependency</em>'.
     * @generated
     */
	GuardDependency createGuardDependency();

				/**
     * Returns a new object of class '<em>Schedule Dependency</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Schedule Dependency</em>'.
     * @generated
     */
	ScheduleDependency createScheduleDependency();

				/**
     * Returns a new object of class '<em>Tick Boundary Dependency</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Tick Boundary Dependency</em>'.
     * @generated
     */
    TickBoundaryDependency createTickBoundaryDependency();

                /**
     * Returns a new object of class '<em>Guard</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Guard</em>'.
     * @generated
     */
    Guard createGuard();

                /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ScgPackage getScgPackage();

} //ScgFactory
