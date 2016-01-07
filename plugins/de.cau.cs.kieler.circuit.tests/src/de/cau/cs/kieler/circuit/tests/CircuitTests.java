/**
 */
package de.cau.cs.kieler.circuit.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>circuit</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class CircuitTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new CircuitTests("circuit Tests");
		suite.addTestSuite(ActorTest.class);
		suite.addTestSuite(PortTest.class);
		suite.addTestSuite(LinkTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitTests(String name) {
		super(name);
	}

} //CircuitTests
