/**
 */
package de.cau.cs.kieler.circuit.tests;

import de.cau.cs.kieler.circuit.CircuitFactory;
import de.cau.cs.kieler.circuit.Relation;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationTest extends LinkableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RelationTest.class);
	}

	/**
	 * Constructs a new Relation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Relation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Relation getFixture() {
		return (Relation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CircuitFactory.eINSTANCE.createRelation());
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

} //RelationTest
