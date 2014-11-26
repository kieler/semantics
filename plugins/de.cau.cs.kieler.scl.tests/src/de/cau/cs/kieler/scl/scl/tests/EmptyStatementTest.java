/**
 */
package de.cau.cs.kieler.scl.scl.tests;

import de.cau.cs.kieler.scl.scl.EmptyStatement;
import de.cau.cs.kieler.scl.scl.SclFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Empty Statement</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmptyStatementTest extends StatementTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(EmptyStatementTest.class);
    }

    /**
     * Constructs a new Empty Statement test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EmptyStatementTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Empty Statement test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EmptyStatement getFixture() {
        return (EmptyStatement)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(SclFactory.eINSTANCE.createEmptyStatement());
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

} //EmptyStatementTest
