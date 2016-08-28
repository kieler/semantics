/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.kexpressions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.cau.cs.kieler.kexpressions.*;

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
            case KExpressionsPackage.EXPRESSION: return createExpression();
            case KExpressionsPackage.VALUED_OBJECT: return createValuedObject();
            case KExpressionsPackage.VALUED_OBJECT_REFERENCE: return createValuedObjectReference();
            case KExpressionsPackage.VALUE: return createValue();
            case KExpressionsPackage.INT_VALUE: return createIntValue();
            case KExpressionsPackage.FLOAT_VALUE: return createFloatValue();
            case KExpressionsPackage.BOOL_VALUE: return createBoolValue();
            case KExpressionsPackage.OPERATOR_EXPRESSION: return createOperatorExpression();
            case KExpressionsPackage.TEXT_EXPRESSION: return createTextExpression();
            case KExpressionsPackage.DECLARATION: return createDeclaration();
            case KExpressionsPackage.FUNCTION_CALL: return createFunctionCall();
            case KExpressionsPackage.PARAMETER: return createParameter();
            case KExpressionsPackage.STRING_VALUE: return createStringValue();
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
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Expression createExpression() {
        ExpressionImpl expression = new ExpressionImpl();
        return expression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValuedObject createValuedObject() {
        ValuedObjectImpl valuedObject = new ValuedObjectImpl();
        return valuedObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValuedObjectReference createValuedObjectReference() {
        ValuedObjectReferenceImpl valuedObjectReference = new ValuedObjectReferenceImpl();
        return valuedObjectReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Value createValue() {
        ValueImpl value = new ValueImpl();
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IntValue createIntValue() {
        IntValueImpl intValue = new IntValueImpl();
        return intValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FloatValue createFloatValue() {
        FloatValueImpl floatValue = new FloatValueImpl();
        return floatValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BoolValue createBoolValue() {
        BoolValueImpl boolValue = new BoolValueImpl();
        return boolValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OperatorExpression createOperatorExpression() {
        OperatorExpressionImpl operatorExpression = new OperatorExpressionImpl();
        return operatorExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TextExpression createTextExpression() {
        TextExpressionImpl textExpression = new TextExpressionImpl();
        return textExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Declaration createDeclaration() {
        DeclarationImpl declaration = new DeclarationImpl();
        return declaration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FunctionCall createFunctionCall() {
        FunctionCallImpl functionCall = new FunctionCallImpl();
        return functionCall;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Parameter createParameter() {
        ParameterImpl parameter = new ParameterImpl();
        return parameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StringValue createStringValue() {
        StringValueImpl stringValue = new StringValueImpl();
        return stringValue;
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
