/**
 */
package de.cau.cs.kieler.core.kexpressions.tests;

import de.cau.cs.kieler.core.kexpressions.FunctionCall;
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionCallTest extends ExpressionTest {

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static void main(String[] args) {
		TestRunner.run(FunctionCallTest.class);
	}

    /**
	 * Constructs a new Function Call test case with the given name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public FunctionCallTest(String name) {
		super(name);
	}

    /**
	 * Returns the fixture for this Function Call test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected FunctionCall getFixture() {
		return (FunctionCall)fixture;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
    @Override
    protected void setUp() throws Exception {
		setFixture(KExpressionsFactory.eINSTANCE.createFunctionCall());
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

} //FunctionCallTest
