/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.esterel.kexpressions.impl;

import de.cau.cs.kieler.esterel.kexpressions.*;

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
			case KExpressionsPackage.COMPLEX_EXPRESSION: return createComplexExpression();
			case KExpressionsPackage.EXPRESSION: return createExpression();
			case KExpressionsPackage.TEXTUAL_CODE: return createTextualCode();
			case KExpressionsPackage.SIGNAL: return createSignal();
			case KExpressionsPackage.VALUED_OBJECT: return createValuedObject();
			case KExpressionsPackage.VARIABLE: return createVariable();
			case KExpressionsPackage.VALUED_OBJECT_REFERENCE: return createValuedObjectReference();
			case KExpressionsPackage.VALUE: return createValue();
			case KExpressionsPackage.INT_VALUE: return createIntValue();
			case KExpressionsPackage.FLOAT_VALUE: return createFloatValue();
			case KExpressionsPackage.BOOLEAN_VALUE: return createBooleanValue();
			case KExpressionsPackage.OPERATOR_EXPRESSION: return createOperatorExpression();
			case KExpressionsPackage.TEXT_EXPRESSION: return createTextExpression();
			case KExpressionsPackage.INTERFACE_DECLARATION: return createInterfaceDeclaration();
			case KExpressionsPackage.INTERFACE_SIGNAL_DECL: return createInterfaceSignalDecl();
			case KExpressionsPackage.ISIGNAL: return createISignal();
			case KExpressionsPackage.CHANNEL_DESCRIPTION: return createChannelDescription();
			case KExpressionsPackage.TYPE_IDENTIFIER: return createTypeIdentifier();
			case KExpressionsPackage.INTERFACE_VARIABLE_DECL: return createInterfaceVariableDecl();
			case KExpressionsPackage.VARIABLE_DECL: return createVariableDecl();
			case KExpressionsPackage.IVARIABLE: return createIVariable();
			case KExpressionsPackage.INPUT: return createInput();
			case KExpressionsPackage.OUTPUT: return createOutput();
			case KExpressionsPackage.INPUT_OUTPUT: return createInputOutput();
			case KExpressionsPackage.RETURN: return createReturn();
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
    public ComplexExpression createComplexExpression() {
		ComplexExpressionImpl complexExpression = new ComplexExpressionImpl();
		return complexExpression;
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
    public TextualCode createTextualCode() {
		TextualCodeImpl textualCode = new TextualCodeImpl();
		return textualCode;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Signal createSignal() {
		SignalImpl signal = new SignalImpl();
		return signal;
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
    public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
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
    public BooleanValue createBooleanValue() {
		BooleanValueImpl booleanValue = new BooleanValueImpl();
		return booleanValue;
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
    public InterfaceDeclaration createInterfaceDeclaration() {
		InterfaceDeclarationImpl interfaceDeclaration = new InterfaceDeclarationImpl();
		return interfaceDeclaration;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public InterfaceSignalDecl createInterfaceSignalDecl() {
		InterfaceSignalDeclImpl interfaceSignalDecl = new InterfaceSignalDeclImpl();
		return interfaceSignalDecl;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ISignal createISignal() {
		ISignalImpl iSignal = new ISignalImpl();
		return iSignal;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ChannelDescription createChannelDescription() {
		ChannelDescriptionImpl channelDescription = new ChannelDescriptionImpl();
		return channelDescription;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public TypeIdentifier createTypeIdentifier() {
		TypeIdentifierImpl typeIdentifier = new TypeIdentifierImpl();
		return typeIdentifier;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public InterfaceVariableDecl createInterfaceVariableDecl() {
		InterfaceVariableDeclImpl interfaceVariableDecl = new InterfaceVariableDeclImpl();
		return interfaceVariableDecl;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public VariableDecl createVariableDecl() {
		VariableDeclImpl variableDecl = new VariableDeclImpl();
		return variableDecl;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IVariable createIVariable() {
		IVariableImpl iVariable = new IVariableImpl();
		return iVariable;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public InputOutput createInputOutput() {
		InputOutputImpl inputOutput = new InputOutputImpl();
		return inputOutput;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Return createReturn() {
		ReturnImpl return_ = new ReturnImpl();
		return return_;
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
