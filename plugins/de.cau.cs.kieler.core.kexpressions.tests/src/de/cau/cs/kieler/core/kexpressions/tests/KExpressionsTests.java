/**
 */
package de.cau.cs.kieler.core.kexpressions.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>kexpressions</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class KExpressionsTests extends TestSuite {

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
        TestSuite suite = new KExpressionsTests("kexpressions Tests");
        suite.addTestSuite(ValuedObjectTest.class);
        suite.addTestSuite(DeclarationTest.class);
        return suite;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KExpressionsTests(String name) {
        super(name);
    }

} //KExpressionsTests
