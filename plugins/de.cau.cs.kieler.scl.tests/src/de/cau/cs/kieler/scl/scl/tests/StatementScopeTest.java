/**
 */
package de.cau.cs.kieler.scl.scl.tests;

import de.cau.cs.kieler.scl.scl.SclFactory;
import de.cau.cs.kieler.scl.scl.StatementScope;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Statement Scope</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatementScopeTest extends InstructionTest {

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static void main(String[] args) {
		TestRunner.run(StatementScopeTest.class);
	}

    /**
	 * Constructs a new Statement Scope test case with the given name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public StatementScopeTest(String name) {
		super(name);
	}

    /**
	 * Returns the fixture for this Statement Scope test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected StatementScope getFixture() {
		return (StatementScope)fixture;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
    @Override
    protected void setUp() throws Exception {
		setFixture(SclFactory.eINSTANCE.createStatementScope());
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

} //StatementScopeTest
