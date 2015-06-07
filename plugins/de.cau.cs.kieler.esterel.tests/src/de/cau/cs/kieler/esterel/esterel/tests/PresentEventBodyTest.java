/**
 */
package de.cau.cs.kieler.esterel.esterel.tests;

import de.cau.cs.kieler.esterel.esterel.EsterelFactory;
import de.cau.cs.kieler.esterel.esterel.PresentEventBody;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Present Event Body</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PresentEventBodyTest extends PresentBodyTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(PresentEventBodyTest.class);
    }

    /**
     * Constructs a new Present Event Body test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PresentEventBodyTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Present Event Body test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected PresentEventBody getFixture() {
        return (PresentEventBody)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(EsterelFactory.eINSTANCE.createPresentEventBody());
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

} //PresentEventBodyTest
