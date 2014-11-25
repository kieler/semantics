/**
 */
package de.cau.cs.kieler.scl.scl.tests;

import de.cau.cs.kieler.scl.scl.Goto;
import de.cau.cs.kieler.scl.scl.SclFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Goto</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GotoTest extends InstructionTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(GotoTest.class);
    }

    /**
     * Constructs a new Goto test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GotoTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Goto test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Goto getFixture() {
        return (Goto)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(SclFactory.eINSTANCE.createGoto());
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

} //GotoTest
