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

import de.cau.cs.kieler.scg.AbsoluteWrite_Read;
import de.cau.cs.kieler.scg.ScgFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Absolute Write Read</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AbsoluteWrite_ReadTest extends DataDependencyTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(AbsoluteWrite_ReadTest.class);
    }

    /**
     * Constructs a new Absolute Write Read test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbsoluteWrite_ReadTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Absolute Write Read test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected AbsoluteWrite_Read getFixture() {
        return (AbsoluteWrite_Read)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(ScgFactory.eINSTANCE.createAbsoluteWrite_Read());
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

} //AbsoluteWrite_ReadTest
