/**
 */
package de.cau.cs.kieler.esterel.esterel.tests;

import de.cau.cs.kieler.esterel.esterel.EsterelFactory;
import de.cau.cs.kieler.esterel.esterel.LocalSignalDecl;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Local Signal Decl</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LocalSignalDeclTest extends StatementContainerTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(LocalSignalDeclTest.class);
    }

    /**
     * Constructs a new Local Signal Decl test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LocalSignalDeclTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Local Signal Decl test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected LocalSignalDecl getFixture() {
        return (LocalSignalDecl)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(EsterelFactory.eINSTANCE.createLocalSignalDecl());
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

} //LocalSignalDeclTest
