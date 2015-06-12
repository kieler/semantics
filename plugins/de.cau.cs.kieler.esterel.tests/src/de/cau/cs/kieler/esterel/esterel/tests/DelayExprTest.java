/**
 */
package de.cau.cs.kieler.esterel.esterel.tests;

import de.cau.cs.kieler.esterel.esterel.DelayExpr;
import de.cau.cs.kieler.esterel.esterel.EsterelFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Delay Expr</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DelayExprTest extends TestCase {

    /**
     * The fixture for this Delay Expr test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DelayExpr fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(DelayExprTest.class);
    }

    /**
     * Constructs a new Delay Expr test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DelayExprTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Delay Expr test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(DelayExpr fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Delay Expr test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DelayExpr getFixture() {
        return fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(EsterelFactory.eINSTANCE.createDelayExpr());
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

} //DelayExprTest
