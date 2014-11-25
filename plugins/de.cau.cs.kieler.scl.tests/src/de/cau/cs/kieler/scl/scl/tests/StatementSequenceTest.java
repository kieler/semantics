/**
 */
package de.cau.cs.kieler.scl.scl.tests;

import de.cau.cs.kieler.scl.scl.SclFactory;
import de.cau.cs.kieler.scl.scl.StatementSequence;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Statement Sequence</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatementSequenceTest extends TestCase {

    /**
     * The fixture for this Statement Sequence test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StatementSequence fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(StatementSequenceTest.class);
    }

    /**
     * Constructs a new Statement Sequence test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StatementSequenceTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Statement Sequence test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(StatementSequence fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Statement Sequence test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StatementSequence getFixture() {
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
        setFixture(SclFactory.eINSTANCE.createStatementSequence());
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

} //StatementSequenceTest
