/**
 */
package de.cau.cs.kieler.circuit.tests;

import de.cau.cs.kieler.circuit.Circuit;
import de.cau.cs.kieler.circuit.CircuitFactory;
import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Circuit</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CircuitTest extends TestCase {

	/**
	 * The fixture for this Circuit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Circuit fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CircuitTest.class);
	}

	/**
	 * Constructs a new Circuit test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Circuit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Circuit fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Circuit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Circuit getFixture() {
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
		setFixture(CircuitFactory.eINSTANCE.createCircuit());
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

} //CircuitTest
