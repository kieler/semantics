/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.core.kexpressions.impl;

import de.cau.cs.kieler.core.annotations.AnnotationsPackage;

import de.cau.cs.kieler.core.kexpressions.BooleanValue;
import de.cau.cs.kieler.core.kexpressions.CombineOperator;
import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.core.kexpressions.FloatValue;
import de.cau.cs.kieler.core.kexpressions.IntValue;
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory;
import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.core.kexpressions.OperatorExpression;
import de.cau.cs.kieler.core.kexpressions.OperatorType;
import de.cau.cs.kieler.core.kexpressions.TextExpression;
import de.cau.cs.kieler.core.kexpressions.Value;
import de.cau.cs.kieler.core.kexpressions.ValueType;
import de.cau.cs.kieler.core.kexpressions.ValuedObject;
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference;

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
public class KExpressionsPackageImpl extends EPackageImpl implements KExpressionsPackage {
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
    private EClass valuedObjectEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass valuedObjectReferenceEClass = null;

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
    private EClass textExpressionEClass = null;

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
     * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private KExpressionsPackageImpl() {
        super(eNS_URI, KExpressionsFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link KExpressionsPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static KExpressionsPackage init() {
        if (isInited) return (KExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(KExpressionsPackage.eNS_URI);

        // Obtain or create and register package
        KExpressionsPackageImpl theKExpressionsPackage = (KExpressionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof KExpressionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new KExpressionsPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        AnnotationsPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theKExpressionsPackage.createPackageContents();

        // Initialize created meta-data
        theKExpressionsPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theKExpressionsPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(KExpressionsPackage.eNS_URI, theKExpressionsPackage);
        return theKExpressionsPackage;
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
    public EReference getValuedObject_InitialValue() {
        return (EReference)valuedObjectEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getValuedObject_IsInput() {
        return (EAttribute)valuedObjectEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getValuedObject_IsOutput() {
        return (EAttribute)valuedObjectEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getValuedObject_IsStatic() {
        return (EAttribute)valuedObjectEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getValuedObject_IsSignal() {
        return (EAttribute)valuedObjectEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getValuedObject_CombineOperator() {
        return (EAttribute)valuedObjectEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getValuedObjectReference() {
        return valuedObjectReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getValuedObjectReference_ValuedObject() {
        return (EReference)valuedObjectReferenceEClass.getEStructuralFeatures().get(0);
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
    public EReference getOperatorExpression_SubExpressions() {
        return (EReference)operatorExpressionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTextExpression() {
        return textExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTextExpression_Text() {
        return (EAttribute)textExpressionEClass.getEStructuralFeatures().get(0);
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
    public KExpressionsFactory getKExpressionsFactory() {
        return (KExpressionsFactory)getEFactoryInstance();
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
        expressionEClass = createEClass(EXPRESSION);

        valuedObjectEClass = createEClass(VALUED_OBJECT);
        createEAttribute(valuedObjectEClass, VALUED_OBJECT__NAME);
        createEAttribute(valuedObjectEClass, VALUED_OBJECT__TYPE);
        createEAttribute(valuedObjectEClass, VALUED_OBJECT__IS_INPUT);
        createEAttribute(valuedObjectEClass, VALUED_OBJECT__IS_OUTPUT);
        createEAttribute(valuedObjectEClass, VALUED_OBJECT__IS_STATIC);
        createEAttribute(valuedObjectEClass, VALUED_OBJECT__IS_SIGNAL);
        createEAttribute(valuedObjectEClass, VALUED_OBJECT__COMBINE_OPERATOR);
        createEReference(valuedObjectEClass, VALUED_OBJECT__INITIAL_VALUE);

        valuedObjectReferenceEClass = createEClass(VALUED_OBJECT_REFERENCE);
        createEReference(valuedObjectReferenceEClass, VALUED_OBJECT_REFERENCE__VALUED_OBJECT);

        valueEClass = createEClass(VALUE);

        intValueEClass = createEClass(INT_VALUE);
        createEAttribute(intValueEClass, INT_VALUE__VALUE);

        floatValueEClass = createEClass(FLOAT_VALUE);
        createEAttribute(floatValueEClass, FLOAT_VALUE__VALUE);

        booleanValueEClass = createEClass(BOOLEAN_VALUE);
        createEAttribute(booleanValueEClass, BOOLEAN_VALUE__VALUE);

        operatorExpressionEClass = createEClass(OPERATOR_EXPRESSION);
        createEAttribute(operatorExpressionEClass, OPERATOR_EXPRESSION__OPERATOR);
        createEReference(operatorExpressionEClass, OPERATOR_EXPRESSION__SUB_EXPRESSIONS);

        textExpressionEClass = createEClass(TEXT_EXPRESSION);
        createEAttribute(textExpressionEClass, TEXT_EXPRESSION__TEXT);

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

        // Obtain other dependent packages
        AnnotationsPackage theAnnotationsPackage = (AnnotationsPackage)EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        valuedObjectEClass.getESuperTypes().add(theAnnotationsPackage.getAnnotatable());
        valuedObjectReferenceEClass.getESuperTypes().add(this.getExpression());
        valueEClass.getESuperTypes().add(this.getExpression());
        intValueEClass.getESuperTypes().add(this.getValue());
        floatValueEClass.getESuperTypes().add(this.getValue());
        booleanValueEClass.getESuperTypes().add(this.getValue());
        operatorExpressionEClass.getESuperTypes().add(this.getExpression());
        textExpressionEClass.getESuperTypes().add(this.getExpression());

        // Initialize classes and features; add operations and parameters
        initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(valuedObjectEClass, ValuedObject.class, "ValuedObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getValuedObject_Name(), ecorePackage.getEString(), "name", null, 1, 1, ValuedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getValuedObject_Type(), this.getValueType(), "type", null, 1, 1, ValuedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getValuedObject_IsInput(), ecorePackage.getEBoolean(), "isInput", null, 1, 1, ValuedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getValuedObject_IsOutput(), ecorePackage.getEBoolean(), "isOutput", null, 1, 1, ValuedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getValuedObject_IsStatic(), ecorePackage.getEBoolean(), "isStatic", null, 1, 1, ValuedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getValuedObject_IsSignal(), ecorePackage.getEBoolean(), "isSignal", null, 1, 1, ValuedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getValuedObject_CombineOperator(), this.getCombineOperator(), "combineOperator", null, 1, 1, ValuedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getValuedObject_InitialValue(), this.getExpression(), null, "initialValue", null, 0, 1, ValuedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(valuedObjectReferenceEClass, ValuedObjectReference.class, "ValuedObjectReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getValuedObjectReference_ValuedObject(), this.getValuedObject(), null, "valuedObject", null, 1, 1, ValuedObjectReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(intValueEClass, IntValue.class, "IntValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getIntValue_Value(), ecorePackage.getEIntegerObject(), "value", null, 1, 1, IntValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(floatValueEClass, FloatValue.class, "FloatValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getFloatValue_Value(), ecorePackage.getEFloatObject(), "value", null, 1, 1, FloatValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(booleanValueEClass, BooleanValue.class, "BooleanValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getBooleanValue_Value(), ecorePackage.getEBooleanObject(), "value", null, 1, 1, BooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(operatorExpressionEClass, OperatorExpression.class, "OperatorExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getOperatorExpression_Operator(), this.getOperatorType(), "operator", null, 0, 1, OperatorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getOperatorExpression_SubExpressions(), this.getExpression(), null, "subExpressions", null, 0, -1, OperatorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(textExpressionEClass, TextExpression.class, "TextExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTextExpression_Text(), ecorePackage.getEString(), "text", null, 0, 1, TextExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
        addEEnumLiteral(valueTypeEEnum, ValueType.BOOLEAN);
        addEEnumLiteral(valueTypeEEnum, ValueType.UNSIGNED);
        addEEnumLiteral(valueTypeEEnum, ValueType.INTEGER);
        addEEnumLiteral(valueTypeEEnum, ValueType.FLOAT);
        addEEnumLiteral(valueTypeEEnum, ValueType.HOST);
        addEEnumLiteral(valueTypeEEnum, ValueType.DOUBLE);
        addEEnumLiteral(valueTypeEEnum, ValueType.STRING);

        // Create resource
        createResource(eNS_URI);
    }

} //KExpressionsPackageImpl
