/**
 */
package de.cau.cs.kieler.scl.scl.tests;

import de.cau.cs.kieler.scl.scl.SclFactory;
import de.cau.cs.kieler.scl.scl.Statement;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatementTest extends TestCase {

    /**
	 * The fixture for this Statement test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected Statement fixture = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static void main(String[] args) {
		TestRunner.run(StatementTest.class);
	}

    /**
	 * Constructs a new Statement test case with the given name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public StatementTest(String name) {
		super(name);
	}

    /**
	 * Sets the fixture for this Statement test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void setFixture(Statement fixture) {
		this.fixture = fixture;
	}

    /**
	 * Returns the fixture for this Statement test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected Statement getFixture() {
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
		setFixture(SclFactory.eINSTANCE.createStatement());
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

} //StatementTest
