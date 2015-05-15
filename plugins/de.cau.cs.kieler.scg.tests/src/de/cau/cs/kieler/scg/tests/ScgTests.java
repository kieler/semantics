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
package de.cau.cs.kieler.scg.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>scg</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScgTests extends TestSuite {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(suite());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static Test suite() {
        TestSuite suite = new ScgTests("scg Tests");
        suite.addTestSuite(SCGraphTest.class);
        suite.addTestSuite(NodeTest.class);
        suite.addTestSuite(ConditionalTest.class);
        suite.addTestSuite(SurfaceTest.class);
        suite.addTestSuite(DepthTest.class);
        suite.addTestSuite(AssignmentTest.class);
        suite.addTestSuite(ForkTest.class);
        suite.addTestSuite(JoinTest.class);
        suite.addTestSuite(LinkTest.class);
        suite.addTestSuite(EntryTest.class);
        suite.addTestSuite(ExitTest.class);
        suite.addTestSuite(ControlFlowTest.class);
        suite.addTestSuite(DependencyTest.class);
        suite.addTestSuite(ConditionalDependencyTest.class);
        suite.addTestSuite(ThenDependencyTest.class);
        suite.addTestSuite(ElseDependencyTest.class);
        suite.addTestSuite(DataDependencyTest.class);
        suite.addTestSuite(ControlDependencyTest.class);
        suite.addTestSuite(AbsoluteWrite_ReadTest.class);
        suite.addTestSuite(RelativeWrite_ReadTest.class);
        suite.addTestSuite(AbsoluteWrite_RelativeWriteTest.class);
        suite.addTestSuite(Write_WriteTest.class);
        return suite;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScgTests(String name) {
        super(name);
    }

} //ScgTests
