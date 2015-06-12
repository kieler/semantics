/**
 */
package de.cau.cs.kieler.esterel.esterel.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Esterel</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class EsterelAllTests extends TestSuite {

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
        TestSuite suite = new EsterelAllTests("Esterel Tests");
        suite.addTest(EsterelTests.suite());
        return suite;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EsterelAllTests(String name) {
        super(name);
    }

} //EsterelAllTests
