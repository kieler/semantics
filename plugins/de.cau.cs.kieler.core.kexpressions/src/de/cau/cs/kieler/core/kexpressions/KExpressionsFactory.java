/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.core.kexpressions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage
 * @generated
 */
public interface KExpressionsFactory extends EFactory {
    /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    KExpressionsFactory eINSTANCE = de.cau.cs.kieler.core.kexpressions.impl.KExpressionsFactoryImpl.init();

    /**
	 * Returns a new object of class '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression</em>'.
	 * @generated
	 */
    Expression createExpression();

    /**
	 * Returns a new object of class '<em>Valued Object</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valued Object</em>'.
	 * @generated
	 */
    ValuedObject createValuedObject();

    /**
	 * Returns a new object of class '<em>Valued Object Reference</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valued Object Reference</em>'.
	 * @generated
	 */
    ValuedObjectReference createValuedObjectReference();

    /**
	 * Returns a new object of class '<em>Value</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value</em>'.
	 * @generated
	 */
    Value createValue();

    /**
	 * Returns a new object of class '<em>Int Value</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Value</em>'.
	 * @generated
	 */
    IntValue createIntValue();

    /**
	 * Returns a new object of class '<em>Float Value</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Float Value</em>'.
	 * @generated
	 */
    FloatValue createFloatValue();

    /**
	 * Returns a new object of class '<em>Bool Value</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bool Value</em>'.
	 * @generated
	 */
    BoolValue createBoolValue();

    /**
	 * Returns a new object of class '<em>Operator Expression</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operator Expression</em>'.
	 * @generated
	 */
    OperatorExpression createOperatorExpression();

    /**
	 * Returns a new object of class '<em>Text Expression</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Expression</em>'.
	 * @generated
	 */
    TextExpression createTextExpression();

    /**
	 * Returns a new object of class '<em>Declaration</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declaration</em>'.
	 * @generated
	 */
    Declaration createDeclaration();

    /**
	 * Returns a new object of class '<em>Function Call</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Call</em>'.
	 * @generated
	 */
    FunctionCall createFunctionCall();

    /**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
    Parameter createParameter();

    /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
    KExpressionsPackage getKExpressionsPackage();

} //KExpressionsFactory
