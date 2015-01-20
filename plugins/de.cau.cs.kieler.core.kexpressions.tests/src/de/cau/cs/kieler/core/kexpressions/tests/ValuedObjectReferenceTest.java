/**
 */
package de.cau.cs.kieler.core.kexpressions.tests;

import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory;
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Valued Object Reference</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValuedObjectReferenceTest extends ExpressionTest {

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static void main(String[] args) {
		TestRunner.run(ValuedObjectReferenceTest.class);
	}

    /**
	 * Constructs a new Valued Object Reference test case with the given name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ValuedObjectReferenceTest(String name) {
		super(name);
	}

    /**
	 * Returns the fixture for this Valued Object Reference test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected ValuedObjectReference getFixture() {
		return (ValuedObjectReference)fixture;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
    @Override
    protected void setUp() throws Exception {
		setFixture(KExpressionsFactory.eINSTANCE.createValuedObjectReference());
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

} //ValuedObjectReferenceTest
