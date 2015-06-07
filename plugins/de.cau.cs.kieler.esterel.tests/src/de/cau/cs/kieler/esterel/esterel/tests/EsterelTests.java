/**
 */
package de.cau.cs.kieler.esterel.esterel.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>esterel</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class EsterelTests extends TestSuite {

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
        TestSuite suite = new EsterelTests("esterel Tests");
        suite.addTestSuite(ConstantTest.class);
        suite.addTestSuite(TrapDeclTest.class);
        return suite;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EsterelTests(String name) {
        super(name);
    }

} //EsterelTests
