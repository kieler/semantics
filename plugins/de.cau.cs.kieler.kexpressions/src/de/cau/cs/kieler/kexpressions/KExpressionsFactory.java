/**
 */
package de.cau.cs.kieler.kexpressions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage
 * @generated
 */
public interface KExpressionsFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    KExpressionsFactory eINSTANCE = de.cau.cs.kieler.kexpressions.impl.KExpressionsFactoryImpl.init();

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
     * Returns a new object of class '<em>String Value</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>String Value</em>'.
     * @generated
     */
    StringValue createStringValue();

    /**
     * Returns a new object of class '<em>Vector Value</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Vector Value</em>'.
     * @generated
     */
    VectorValue createVectorValue();

    /**
     * Returns a new object of class '<em>Ignore Value</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ignore Value</em>'.
     * @generated
     */
    IgnoreValue createIgnoreValue();

    /**
     * Returns a new object of class '<em>Json Pragma</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Json Pragma</em>'.
     * @generated
     */
    JsonPragma createJsonPragma();

    /**
     * Returns a new object of class '<em>Json Annotation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Json Annotation</em>'.
     * @generated
     */
    JsonAnnotation createJsonAnnotation();

    /**
     * Returns a new object of class '<em>Json Object Value</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Json Object Value</em>'.
     * @generated
     */
    JsonObjectValue createJsonObjectValue();

    /**
     * Returns a new object of class '<em>Json Object Member</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Json Object Member</em>'.
     * @generated
     */
    JsonObjectMember createJsonObjectMember();

    /**
     * Returns a new object of class '<em>Json Array Value</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Json Array Value</em>'.
     * @generated
     */
    JsonArrayValue createJsonArrayValue();

    /**
     * Returns a new object of class '<em>Null Value</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Null Value</em>'.
     * @generated
     */
    NullValue createNullValue();

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
     * Returns a new object of class '<em>Variable Declaration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Variable Declaration</em>'.
     * @generated
     */
    VariableDeclaration createVariableDeclaration();

    /**
     * Returns a new object of class '<em>Reference Declaration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Reference Declaration</em>'.
     * @generated
     */
    ReferenceDeclaration createReferenceDeclaration();

    /**
     * Returns a new object of class '<em>Generic Parameter Declaration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Generic Parameter Declaration</em>'.
     * @generated
     */
    GenericParameterDeclaration createGenericParameterDeclaration();

    /**
     * Returns a new object of class '<em>Generic Type Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Generic Type Reference</em>'.
     * @generated
     */
    GenericTypeReference createGenericTypeReference();

    /**
     * Returns a new object of class '<em>Value Type Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Value Type Reference</em>'.
     * @generated
     */
    ValueTypeReference createValueTypeReference();

    /**
     * Returns a new object of class '<em>Schedule Declaration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Schedule Declaration</em>'.
     * @generated
     */
    ScheduleDeclaration createScheduleDeclaration();

    /**
     * Returns a new object of class '<em>Method Declaration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Method Declaration</em>'.
     * @generated
     */
    MethodDeclaration createMethodDeclaration();

    /**
     * Returns a new object of class '<em>Schedule Object Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Schedule Object Reference</em>'.
     * @generated
     */
    ScheduleObjectReference createScheduleObjectReference();

    /**
     * Returns a new object of class '<em>Parameter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Parameter</em>'.
     * @generated
     */
    Parameter createParameter();

    /**
     * Returns a new object of class '<em>Reference Call</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Reference Call</em>'.
     * @generated
     */
    ReferenceCall createReferenceCall();

    /**
     * Returns a new object of class '<em>Function Call</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Function Call</em>'.
     * @generated
     */
    FunctionCall createFunctionCall();

    /**
     * Returns a new object of class '<em>Print Call</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Print Call</em>'.
     * @generated
     */
    PrintCall createPrintCall();

    /**
     * Returns a new object of class '<em>Random Call</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Random Call</em>'.
     * @generated
     */
    RandomCall createRandomCall();

    /**
     * Returns a new object of class '<em>Randomize Call</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Randomize Call</em>'.
     * @generated
     */
    RandomizeCall createRandomizeCall();

    /**
     * Returns a new object of class '<em>Extern String</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Extern String</em>'.
     * @generated
     */
    ExternString createExternString();

    /**
     * Returns a new object of class '<em>Static Access Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Static Access Expression</em>'.
     * @generated
     */
    StaticAccessExpression createStaticAccessExpression();

    /**
     * Returns a new object of class '<em>This Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>This Expression</em>'.
     * @generated
     */
    ThisExpression createThisExpression();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    KExpressionsPackage getKExpressionsPackage();

} //KExpressionsFactory
