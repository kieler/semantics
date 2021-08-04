/**
 */
package de.cau.cs.kieler.kexpressions.impl;

import de.cau.cs.kieler.kexpressions.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KExpressionsFactoryImpl extends EFactoryImpl implements KExpressionsFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static KExpressionsFactory init() {
        try {
            KExpressionsFactory theKExpressionsFactory = (KExpressionsFactory)EPackage.Registry.INSTANCE.getEFactory(KExpressionsPackage.eNS_URI);
            if (theKExpressionsFactory != null) {
                return theKExpressionsFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new KExpressionsFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KExpressionsFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case KExpressionsPackage.VALUED_OBJECT: return createValuedObject();
            case KExpressionsPackage.VALUED_OBJECT_REFERENCE: return createValuedObjectReference();
            case KExpressionsPackage.INT_VALUE: return createIntValue();
            case KExpressionsPackage.FLOAT_VALUE: return createFloatValue();
            case KExpressionsPackage.BOOL_VALUE: return createBoolValue();
            case KExpressionsPackage.STRING_VALUE: return createStringValue();
            case KExpressionsPackage.VECTOR_VALUE: return createVectorValue();
            case KExpressionsPackage.IGNORE_VALUE: return createIgnoreValue();
            case KExpressionsPackage.JSON_PRAGMA: return createJsonPragma();
            case KExpressionsPackage.JSON_ANNOTATION: return createJsonAnnotation();
            case KExpressionsPackage.JSON_OBJECT_VALUE: return createJsonObjectValue();
            case KExpressionsPackage.JSON_OBJECT_MEMBER: return createJsonObjectMember();
            case KExpressionsPackage.JSON_ARRAY_VALUE: return createJsonArrayValue();
            case KExpressionsPackage.NULL_VALUE: return createNullValue();
            case KExpressionsPackage.OPERATOR_EXPRESSION: return createOperatorExpression();
            case KExpressionsPackage.TEXT_EXPRESSION: return createTextExpression();
            case KExpressionsPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
            case KExpressionsPackage.REFERENCE_DECLARATION: return createReferenceDeclaration();
            case KExpressionsPackage.GENERIC_PARAMETER_DECLARATION: return createGenericParameterDeclaration();
            case KExpressionsPackage.GENERIC_TYPE_REFERENCE: return createGenericTypeReference();
            case KExpressionsPackage.VALUE_TYPE_REFERENCE: return createValueTypeReference();
            case KExpressionsPackage.METHOD_DECLARATION: return createMethodDeclaration();
            case KExpressionsPackage.SCHEDULE_DECLARATION: return createScheduleDeclaration();
            case KExpressionsPackage.SCHEDULE_OBJECT_REFERENCE: return createScheduleObjectReference();
            case KExpressionsPackage.PARAMETER: return createParameter();
            case KExpressionsPackage.REFERENCE_CALL: return createReferenceCall();
            case KExpressionsPackage.FUNCTION_CALL: return createFunctionCall();
            case KExpressionsPackage.PRINT_CALL: return createPrintCall();
            case KExpressionsPackage.RANDOM_CALL: return createRandomCall();
            case KExpressionsPackage.RANDOMIZE_CALL: return createRandomizeCall();
            case KExpressionsPackage.EXTERN_STRING: return createExternString();
            case KExpressionsPackage.STATIC_ACCESS_EXPRESSION: return createStaticAccessExpression();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case KExpressionsPackage.COMBINE_OPERATOR:
                return createCombineOperatorFromString(eDataType, initialValue);
            case KExpressionsPackage.OPERATOR_TYPE:
                return createOperatorTypeFromString(eDataType, initialValue);
            case KExpressionsPackage.VALUE_TYPE:
                return createValueTypeFromString(eDataType, initialValue);
            case KExpressionsPackage.PRIORITY_PROTOCOL:
                return createPriorityProtocolFromString(eDataType, initialValue);
            case KExpressionsPackage.PARAMETER_ACCESS_TYPE:
                return createParameterAccessTypeFromString(eDataType, initialValue);
            case KExpressionsPackage.ACCESS_MODIFIER:
                return createAccessModifierFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case KExpressionsPackage.COMBINE_OPERATOR:
                return convertCombineOperatorToString(eDataType, instanceValue);
            case KExpressionsPackage.OPERATOR_TYPE:
                return convertOperatorTypeToString(eDataType, instanceValue);
            case KExpressionsPackage.VALUE_TYPE:
                return convertValueTypeToString(eDataType, instanceValue);
            case KExpressionsPackage.PRIORITY_PROTOCOL:
                return convertPriorityProtocolToString(eDataType, instanceValue);
            case KExpressionsPackage.PARAMETER_ACCESS_TYPE:
                return convertParameterAccessTypeToString(eDataType, instanceValue);
            case KExpressionsPackage.ACCESS_MODIFIER:
                return convertAccessModifierToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ValuedObject createValuedObject() {
        ValuedObjectImpl valuedObject = new ValuedObjectImpl();
        return valuedObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ValuedObjectReference createValuedObjectReference() {
        ValuedObjectReferenceImpl valuedObjectReference = new ValuedObjectReferenceImpl();
        return valuedObjectReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IntValue createIntValue() {
        IntValueImpl intValue = new IntValueImpl();
        return intValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FloatValue createFloatValue() {
        FloatValueImpl floatValue = new FloatValueImpl();
        return floatValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BoolValue createBoolValue() {
        BoolValueImpl boolValue = new BoolValueImpl();
        return boolValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StringValue createStringValue() {
        StringValueImpl stringValue = new StringValueImpl();
        return stringValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VectorValue createVectorValue() {
        VectorValueImpl vectorValue = new VectorValueImpl();
        return vectorValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IgnoreValue createIgnoreValue() {
        IgnoreValueImpl ignoreValue = new IgnoreValueImpl();
        return ignoreValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public JsonPragma createJsonPragma() {
        JsonPragmaImpl jsonPragma = new JsonPragmaImpl();
        return jsonPragma;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public JsonAnnotation createJsonAnnotation() {
        JsonAnnotationImpl jsonAnnotation = new JsonAnnotationImpl();
        return jsonAnnotation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public JsonObjectValue createJsonObjectValue() {
        JsonObjectValueImpl jsonObjectValue = new JsonObjectValueImpl();
        return jsonObjectValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public JsonObjectMember createJsonObjectMember() {
        JsonObjectMemberImpl jsonObjectMember = new JsonObjectMemberImpl();
        return jsonObjectMember;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public JsonArrayValue createJsonArrayValue() {
        JsonArrayValueImpl jsonArrayValue = new JsonArrayValueImpl();
        return jsonArrayValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NullValue createNullValue() {
        NullValueImpl nullValue = new NullValueImpl();
        return nullValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OperatorExpression createOperatorExpression() {
        OperatorExpressionImpl operatorExpression = new OperatorExpressionImpl();
        return operatorExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TextExpression createTextExpression() {
        TextExpressionImpl textExpression = new TextExpressionImpl();
        return textExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VariableDeclaration createVariableDeclaration() {
        VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
        return variableDeclaration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReferenceDeclaration createReferenceDeclaration() {
        ReferenceDeclarationImpl referenceDeclaration = new ReferenceDeclarationImpl();
        return referenceDeclaration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GenericParameterDeclaration createGenericParameterDeclaration() {
        GenericParameterDeclarationImpl genericParameterDeclaration = new GenericParameterDeclarationImpl();
        return genericParameterDeclaration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GenericTypeReference createGenericTypeReference() {
        GenericTypeReferenceImpl genericTypeReference = new GenericTypeReferenceImpl();
        return genericTypeReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ValueTypeReference createValueTypeReference() {
        ValueTypeReferenceImpl valueTypeReference = new ValueTypeReferenceImpl();
        return valueTypeReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ScheduleDeclaration createScheduleDeclaration() {
        ScheduleDeclarationImpl scheduleDeclaration = new ScheduleDeclarationImpl();
        return scheduleDeclaration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MethodDeclaration createMethodDeclaration() {
        MethodDeclarationImpl methodDeclaration = new MethodDeclarationImpl();
        return methodDeclaration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ScheduleObjectReference createScheduleObjectReference() {
        ScheduleObjectReferenceImpl scheduleObjectReference = new ScheduleObjectReferenceImpl();
        return scheduleObjectReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Parameter createParameter() {
        ParameterImpl parameter = new ParameterImpl();
        return parameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReferenceCall createReferenceCall() {
        ReferenceCallImpl referenceCall = new ReferenceCallImpl();
        return referenceCall;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FunctionCall createFunctionCall() {
        FunctionCallImpl functionCall = new FunctionCallImpl();
        return functionCall;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PrintCall createPrintCall() {
        PrintCallImpl printCall = new PrintCallImpl();
        return printCall;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RandomCall createRandomCall() {
        RandomCallImpl randomCall = new RandomCallImpl();
        return randomCall;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RandomizeCall createRandomizeCall() {
        RandomizeCallImpl randomizeCall = new RandomizeCallImpl();
        return randomizeCall;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExternString createExternString() {
        ExternStringImpl externString = new ExternStringImpl();
        return externString;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StaticAccessExpression createStaticAccessExpression() {
        StaticAccessExpressionImpl staticAccessExpression = new StaticAccessExpressionImpl();
        return staticAccessExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CombineOperator createCombineOperatorFromString(EDataType eDataType, String initialValue) {
        CombineOperator result = CombineOperator.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertCombineOperatorToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OperatorType createOperatorTypeFromString(EDataType eDataType, String initialValue) {
        OperatorType result = OperatorType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertOperatorTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValueType createValueTypeFromString(EDataType eDataType, String initialValue) {
        ValueType result = ValueType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertValueTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PriorityProtocol createPriorityProtocolFromString(EDataType eDataType, String initialValue) {
        PriorityProtocol result = PriorityProtocol.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPriorityProtocolToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParameterAccessType createParameterAccessTypeFromString(EDataType eDataType, String initialValue) {
        ParameterAccessType result = ParameterAccessType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertParameterAccessTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AccessModifier createAccessModifierFromString(EDataType eDataType, String initialValue) {
        AccessModifier result = AccessModifier.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAccessModifierToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public KExpressionsPackage getKExpressionsPackage() {
        return (KExpressionsPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static KExpressionsPackage getPackage() {
        return KExpressionsPackage.eINSTANCE;
    }

} //KExpressionsFactoryImpl
