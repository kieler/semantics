/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.expressions.impl;

import de.cau.cs.kieler.expressions.BooleanValue;
import de.cau.cs.kieler.expressions.CombineOperator;
import de.cau.cs.kieler.expressions.ComplexExpression;
import de.cau.cs.kieler.expressions.Expression;
import de.cau.cs.kieler.expressions.ExpressionsFactory;
import de.cau.cs.kieler.expressions.ExpressionsPackage;
import de.cau.cs.kieler.expressions.FloatValue;
import de.cau.cs.kieler.expressions.IntValue;
import de.cau.cs.kieler.expressions.OperatorExpression;
import de.cau.cs.kieler.expressions.OperatorType;
import de.cau.cs.kieler.expressions.Signal;
import de.cau.cs.kieler.expressions.SignalReference;
import de.cau.cs.kieler.expressions.TextualCode;
import de.cau.cs.kieler.expressions.Value;
import de.cau.cs.kieler.expressions.ValueType;
import de.cau.cs.kieler.expressions.ValuedObject;
import de.cau.cs.kieler.expressions.Variable;
import de.cau.cs.kieler.expressions.VariableReference;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionsPackageImpl extends EPackageImpl implements ExpressionsPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass complexExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass expressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass textualCodeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass signalEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass signalReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass valuedObjectEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass variableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass variableReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass valueEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass intValueEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass floatValueEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass booleanValueEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass operatorExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum combineOperatorEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum operatorTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum valueTypeEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see de.cau.cs.kieler.expressions.ExpressionsPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ExpressionsPackageImpl() {
        super(eNS_URI, ExpressionsFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link ExpressionsPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ExpressionsPackage init() {
        if (isInited) return (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);

        // Obtain or create and register package
        ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExpressionsPackageImpl());

        isInited = true;

        // Create package meta-data objects
        theExpressionsPackage.createPackageContents();

        // Initialize created meta-data
        theExpressionsPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theExpressionsPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ExpressionsPackage.eNS_URI, theExpressionsPackage);
        return theExpressionsPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getComplexExpression() {
        return complexExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getComplexExpression_SubExpressions() {
        return (EReference)complexExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExpression() {
        return expressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTextualCode() {
        return textualCodeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTextualCode_Code() {
        return (EAttribute)textualCodeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTextualCode_Type() {
        return (EAttribute)textualCodeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSignal() {
        return signalEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSignal_Value() {
        return (EReference)signalEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSignal_IsInput() {
        return (EAttribute)signalEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSignal_IsOutput() {
        return (EAttribute)signalEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSignal_CombineOperator() {
        return (EAttribute)signalEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSignal_HostCombineOperator() {
        return (EAttribute)signalEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSignalReference() {
        return signalReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSignalReference_Signal() {
        return (EReference)signalReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getValuedObject() {
        return valuedObjectEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getValuedObject_Name() {
        return (EAttribute)valuedObjectEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getValuedObject_Type() {
        return (EAttribute)valuedObjectEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getValuedObject_InitialValue() {
        return (EAttribute)valuedObjectEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getValuedObject_HostType() {
        return (EAttribute)valuedObjectEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getVariable() {
        return variableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getVariable_Value() {
        return (EReference)variableEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVariable_Const() {
        return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getVariableReference() {
        return variableReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getVariableReference_Variable() {
        return (EReference)variableReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getValue() {
        return valueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIntValue() {
        return intValueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIntValue_Value() {
        return (EAttribute)intValueEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFloatValue() {
        return floatValueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFloatValue_Value() {
        return (EAttribute)floatValueEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBooleanValue() {
        return booleanValueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBooleanValue_Value() {
        return (EAttribute)booleanValueEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOperatorExpression() {
        return operatorExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOperatorExpression_Operator() {
        return (EAttribute)operatorExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getCombineOperator() {
        return combineOperatorEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getOperatorType() {
        return operatorTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getValueType() {
        return valueTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExpressionsFactory getExpressionsFactory() {
        return (ExpressionsFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        complexExpressionEClass = createEClass(COMPLEX_EXPRESSION);
        createEReference(complexExpressionEClass, COMPLEX_EXPRESSION__SUB_EXPRESSIONS);

        expressionEClass = createEClass(EXPRESSION);

        textualCodeEClass = createEClass(TEXTUAL_CODE);
        createEAttribute(textualCodeEClass, TEXTUAL_CODE__CODE);
        createEAttribute(textualCodeEClass, TEXTUAL_CODE__TYPE);

        signalEClass = createEClass(SIGNAL);
        createEReference(signalEClass, SIGNAL__VALUE);
        createEAttribute(signalEClass, SIGNAL__IS_INPUT);
        createEAttribute(signalEClass, SIGNAL__IS_OUTPUT);
        createEAttribute(signalEClass, SIGNAL__COMBINE_OPERATOR);
        createEAttribute(signalEClass, SIGNAL__HOST_COMBINE_OPERATOR);

        signalReferenceEClass = createEClass(SIGNAL_REFERENCE);
        createEReference(signalReferenceEClass, SIGNAL_REFERENCE__SIGNAL);

        valuedObjectEClass = createEClass(VALUED_OBJECT);
        createEAttribute(valuedObjectEClass, VALUED_OBJECT__NAME);
        createEAttribute(valuedObjectEClass, VALUED_OBJECT__TYPE);
        createEAttribute(valuedObjectEClass, VALUED_OBJECT__INITIAL_VALUE);
        createEAttribute(valuedObjectEClass, VALUED_OBJECT__HOST_TYPE);

        variableEClass = createEClass(VARIABLE);
        createEReference(variableEClass, VARIABLE__VALUE);
        createEAttribute(variableEClass, VARIABLE__CONST);

        variableReferenceEClass = createEClass(VARIABLE_REFERENCE);
        createEReference(variableReferenceEClass, VARIABLE_REFERENCE__VARIABLE);

        valueEClass = createEClass(VALUE);

        intValueEClass = createEClass(INT_VALUE);
        createEAttribute(intValueEClass, INT_VALUE__VALUE);

        floatValueEClass = createEClass(FLOAT_VALUE);
        createEAttribute(floatValueEClass, FLOAT_VALUE__VALUE);

        booleanValueEClass = createEClass(BOOLEAN_VALUE);
        createEAttribute(booleanValueEClass, BOOLEAN_VALUE__VALUE);

        operatorExpressionEClass = createEClass(OPERATOR_EXPRESSION);
        createEAttribute(operatorExpressionEClass, OPERATOR_EXPRESSION__OPERATOR);

        // Create enums
        combineOperatorEEnum = createEEnum(COMBINE_OPERATOR);
        operatorTypeEEnum = createEEnum(OPERATOR_TYPE);
        valueTypeEEnum = createEEnum(VALUE_TYPE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        complexExpressionEClass.getESuperTypes().add(this.getExpression());
        textualCodeEClass.getESuperTypes().add(this.getComplexExpression());
        signalEClass.getESuperTypes().add(this.getValuedObject());
        signalReferenceEClass.getESuperTypes().add(this.getComplexExpression());
        variableEClass.getESuperTypes().add(this.getValuedObject());
        variableReferenceEClass.getESuperTypes().add(this.getComplexExpression());
        valueEClass.getESuperTypes().add(this.getExpression());
        intValueEClass.getESuperTypes().add(this.getValue());
        floatValueEClass.getESuperTypes().add(this.getValue());
        booleanValueEClass.getESuperTypes().add(this.getValue());
        operatorExpressionEClass.getESuperTypes().add(this.getComplexExpression());

        // Initialize classes and features; add operations and parameters
        initEClass(complexExpressionEClass, ComplexExpression.class, "ComplexExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getComplexExpression_SubExpressions(), this.getExpression(), null, "subExpressions", null, 0, -1, ComplexExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(textualCodeEClass, TextualCode.class, "TextualCode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTextualCode_Code(), ecorePackage.getEString(), "code", null, 1, 1, TextualCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTextualCode_Type(), ecorePackage.getEString(), "type", null, 0, 1, TextualCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(signalEClass, Signal.class, "Signal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSignal_Value(), ecorePackage.getEObject(), null, "value", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSignal_IsInput(), ecorePackage.getEBoolean(), "isInput", null, 1, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSignal_IsOutput(), ecorePackage.getEBoolean(), "isOutput", null, 1, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSignal_CombineOperator(), this.getCombineOperator(), "combineOperator", null, 1, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSignal_HostCombineOperator(), ecorePackage.getEString(), "hostCombineOperator", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(signalReferenceEClass, SignalReference.class, "SignalReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSignalReference_Signal(), this.getSignal(), null, "signal", null, 1, 1, SignalReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(valuedObjectEClass, ValuedObject.class, "ValuedObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getValuedObject_Name(), ecorePackage.getEString(), "name", null, 1, 1, ValuedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getValuedObject_Type(), this.getValueType(), "type", null, 1, 1, ValuedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getValuedObject_InitialValue(), ecorePackage.getEString(), "initialValue", null, 0, 1, ValuedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getValuedObject_HostType(), ecorePackage.getEString(), "hostType", null, 0, 1, ValuedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getVariable_Value(), ecorePackage.getEObject(), null, "value", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVariable_Const(), ecorePackage.getEBoolean(), "const", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(variableReferenceEClass, VariableReference.class, "VariableReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getVariableReference_Variable(), this.getVariable(), null, "variable", null, 1, 1, VariableReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(intValueEClass, IntValue.class, "IntValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getIntValue_Value(), ecorePackage.getEIntegerObject(), "value", null, 1, 1, IntValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(floatValueEClass, FloatValue.class, "FloatValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getFloatValue_Value(), ecorePackage.getEFloatObject(), "value", null, 1, 1, FloatValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(booleanValueEClass, BooleanValue.class, "BooleanValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getBooleanValue_Value(), ecorePackage.getEBooleanObject(), "value", null, 1, 1, BooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(operatorExpressionEClass, OperatorExpression.class, "OperatorExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getOperatorExpression_Operator(), this.getOperatorType(), "operator", null, 0, 1, OperatorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(combineOperatorEEnum, CombineOperator.class, "CombineOperator");
        addEEnumLiteral(combineOperatorEEnum, CombineOperator.NONE);
        addEEnumLiteral(combineOperatorEEnum, CombineOperator.ADD);
        addEEnumLiteral(combineOperatorEEnum, CombineOperator.MULT);
        addEEnumLiteral(combineOperatorEEnum, CombineOperator.MAX);
        addEEnumLiteral(combineOperatorEEnum, CombineOperator.MIN);
        addEEnumLiteral(combineOperatorEEnum, CombineOperator.OR);
        addEEnumLiteral(combineOperatorEEnum, CombineOperator.AND);
        addEEnumLiteral(combineOperatorEEnum, CombineOperator.HOST);

        initEEnum(operatorTypeEEnum, OperatorType.class, "OperatorType");
        addEEnumLiteral(operatorTypeEEnum, OperatorType.EQ);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.LT);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.LEQ);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.GT);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.GEQ);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.NOT);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.VAL);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.PRE);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.NE);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.AND);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.OR);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.ADD);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.SUB);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.MULT);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.DIV);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.MOD);

        initEEnum(valueTypeEEnum, ValueType.class, "ValueType");
        addEEnumLiteral(valueTypeEEnum, ValueType.PURE);
        addEEnumLiteral(valueTypeEEnum, ValueType.BOOL);
        addEEnumLiteral(valueTypeEEnum, ValueType.UNSIGNED);
        addEEnumLiteral(valueTypeEEnum, ValueType.INT);
        addEEnumLiteral(valueTypeEEnum, ValueType.FLOAT);
        addEEnumLiteral(valueTypeEEnum, ValueType.HOST);

        // Create resource
        createResource(eNS_URI);
    }

} //ExpressionsPackageImpl
