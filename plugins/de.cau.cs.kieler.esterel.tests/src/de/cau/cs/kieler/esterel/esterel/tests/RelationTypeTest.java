/**
 */
package de.cau.cs.kieler.esterel.esterel.tests;

import de.cau.cs.kieler.esterel.esterel.EsterelFactory;
import de.cau.cs.kieler.esterel.esterel.RelationType;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relation Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationTypeTest extends TestCase {

    /**
     * The fixture for this Relation Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RelationType fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(RelationTypeTest.class);
    }

    /**
     * Constructs a new Relation Type test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RelationTypeTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Relation Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(RelationType fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Relation Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RelationType getFixture() {
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
        setFixture(EsterelFactory.eINSTANCE.createRelationType());
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

} //RelationTypeTest
