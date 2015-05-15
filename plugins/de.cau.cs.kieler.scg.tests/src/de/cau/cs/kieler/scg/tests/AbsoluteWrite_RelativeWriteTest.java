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

import de.cau.cs.kieler.scg.AbsoluteWrite_RelativeWrite;
import de.cau.cs.kieler.scg.ScgFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Absolute Write Relative Write</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AbsoluteWrite_RelativeWriteTest extends DataDependencyTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(AbsoluteWrite_RelativeWriteTest.class);
    }

    /**
     * Constructs a new Absolute Write Relative Write test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbsoluteWrite_RelativeWriteTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Absolute Write Relative Write test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected AbsoluteWrite_RelativeWrite getFixture() {
        return (AbsoluteWrite_RelativeWrite)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(ScgFactory.eINSTANCE.createAbsoluteWrite_RelativeWrite());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
    @Override
    protected void tearDown() throws Exception {
        setFixture(null);
    }

} //AbsoluteWrite_RelativeWriteTest
