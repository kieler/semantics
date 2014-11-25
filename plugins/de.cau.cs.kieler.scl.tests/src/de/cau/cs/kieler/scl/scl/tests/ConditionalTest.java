/**
 */
package de.cau.cs.kieler.scl.scl.tests;

import de.cau.cs.kieler.scl.scl.Conditional;
import de.cau.cs.kieler.scl.scl.SclFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Conditional</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConditionalTest extends InstructionTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(ConditionalTest.class);
    }

    /**
     * Constructs a new Conditional test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConditionalTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Conditional test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Conditional getFixture() {
        return (Conditional)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(SclFactory.eINSTANCE.createConditional());
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

} //ConditionalTest
