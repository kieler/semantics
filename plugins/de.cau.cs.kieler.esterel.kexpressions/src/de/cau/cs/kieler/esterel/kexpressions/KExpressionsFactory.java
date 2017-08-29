/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.esterel.kexpressions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.esterel.kexpressions.KExpressionsPackage
 * @generated
 */
public interface KExpressionsFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    KExpressionsFactory eINSTANCE = de.cau.cs.kieler.esterel.kexpressions.impl.KExpressionsFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Complex Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Complex Expression</em>'.
     * @generated
     */
    ComplexExpression createComplexExpression();

    /**
     * Returns a new object of class '<em>Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Expression</em>'.
     * @generated
     */
    Expression createExpression();

    /**
     * Returns a new object of class '<em>Textual Code</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Textual Code</em>'.
     * @generated
     */
    TextualCode createTextualCode();

    /**
     * Returns a new object of class '<em>Signal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Signal</em>'.
     * @generated
     */
    Signal createSignal();

    /**
     * Returns a new object of class '<em>Valued Object</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Valued Object</em>'.
     * @generated
     */
    ValuedObject createValuedObject();

    /**
     * Returns a new object of class '<em>Variable</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Variable</em>'.
     * @generated
     */
    Variable createVariable();

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
     * Returns a new object of class '<em>Boolean Value</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Boolean Value</em>'.
     * @generated
     */
    BooleanValue createBooleanValue();

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
     * Returns a new object of class '<em>Interface Declaration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interface Declaration</em>'.
     * @generated
     */
    InterfaceDeclaration createInterfaceDeclaration();

    /**
     * Returns a new object of class '<em>Interface Signal Decl</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interface Signal Decl</em>'.
     * @generated
     */
    InterfaceSignalDecl createInterfaceSignalDecl();

    /**
     * Returns a new object of class '<em>ISignal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>ISignal</em>'.
     * @generated
     */
    ISignal createISignal();

    /**
     * Returns a new object of class '<em>Channel Description</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Channel Description</em>'.
     * @generated
     */
    ChannelDescription createChannelDescription();

    /**
     * Returns a new object of class '<em>Type Identifier</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Type Identifier</em>'.
     * @generated
     */
    TypeIdentifier createTypeIdentifier();

    /**
     * Returns a new object of class '<em>Interface Variable Decl</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interface Variable Decl</em>'.
     * @generated
     */
    InterfaceVariableDecl createInterfaceVariableDecl();

    /**
     * Returns a new object of class '<em>Variable Decl</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Variable Decl</em>'.
     * @generated
     */
    VariableDecl createVariableDecl();

    /**
     * Returns a new object of class '<em>IVariable</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>IVariable</em>'.
     * @generated
     */
    IVariable createIVariable();

    /**
     * Returns a new object of class '<em>Input</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Input</em>'.
     * @generated
     */
    Input createInput();

    /**
     * Returns a new object of class '<em>Output</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Output</em>'.
     * @generated
     */
    Output createOutput();

    /**
     * Returns a new object of class '<em>Input Output</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Input Output</em>'.
     * @generated
     */
    InputOutput createInputOutput();

    /**
     * Returns a new object of class '<em>Return</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Return</em>'.
     * @generated
     */
    Return createReturn();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    KExpressionsPackage getKExpressionsPackage();

} //KExpressionsFactory
