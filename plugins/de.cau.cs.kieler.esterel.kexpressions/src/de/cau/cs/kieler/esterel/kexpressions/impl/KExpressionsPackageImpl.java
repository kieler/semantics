/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.esterel.kexpressions.impl;

import de.cau.cs.kieler.annotations.AnnotationsPackage;

import de.cau.cs.kieler.esterel.kexpressions.BooleanValue;
import de.cau.cs.kieler.esterel.kexpressions.ChannelDescription;
import de.cau.cs.kieler.esterel.kexpressions.CombineOperator;
import de.cau.cs.kieler.esterel.kexpressions.ComplexExpression;
import de.cau.cs.kieler.esterel.kexpressions.Expression;
import de.cau.cs.kieler.esterel.kexpressions.FloatValue;
import de.cau.cs.kieler.esterel.kexpressions.ISignal;
import de.cau.cs.kieler.esterel.kexpressions.IVariable;
import de.cau.cs.kieler.esterel.kexpressions.Input;
import de.cau.cs.kieler.esterel.kexpressions.InputOutput;
import de.cau.cs.kieler.esterel.kexpressions.IntValue;
import de.cau.cs.kieler.esterel.kexpressions.InterfaceDeclaration;
import de.cau.cs.kieler.esterel.kexpressions.InterfaceSignalDecl;
import de.cau.cs.kieler.esterel.kexpressions.InterfaceVariableDecl;
import de.cau.cs.kieler.esterel.kexpressions.KExpressionsFactory;
import de.cau.cs.kieler.esterel.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.esterel.kexpressions.OperatorExpression;
import de.cau.cs.kieler.esterel.kexpressions.OperatorType;
import de.cau.cs.kieler.esterel.kexpressions.Output;
import de.cau.cs.kieler.esterel.kexpressions.Return;
import de.cau.cs.kieler.esterel.kexpressions.Signal;
import de.cau.cs.kieler.esterel.kexpressions.TextExpression;
import de.cau.cs.kieler.esterel.kexpressions.TextualCode;
import de.cau.cs.kieler.esterel.kexpressions.TypeIdentifier;
import de.cau.cs.kieler.esterel.kexpressions.Value;
import de.cau.cs.kieler.esterel.kexpressions.ValueType;
import de.cau.cs.kieler.esterel.kexpressions.ValuedObject;
import de.cau.cs.kieler.esterel.kexpressions.ValuedObjectReference;
import de.cau.cs.kieler.esterel.kexpressions.Variable;
import de.cau.cs.kieler.esterel.kexpressions.VariableDecl;

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
    private EClass interfaceDeclarationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass interfaceSignalDeclEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass iSignalEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass channelDescriptionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass typeIdentifierEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass interfaceVariableDeclEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass variableDeclEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass iVariableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass inputEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass outputEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass inputOutputEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass returnEClass = null;

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
     * @see de.cau.cs.kieler.esterel.kexpressions.KExpressionsPackage#eNS_URI
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
        de.cau.cs.kieler.annotations.AnnotationsPackage.eINSTANCE.eClass();

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
    public EAttribute getSignal_IsInput() {
        return (EAttribute)signalEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSignal_IsOutput() {
        return (EAttribute)signalEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSignal_CombineOperator() {
        return (EAttribute)signalEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSignal_HostCombineOperator() {
        return (EAttribute)signalEClass.getEStructuralFeatures().get(3);
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
    public EAttribute getVariable_Const() {
        return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
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
    public EClass getTextExpression() {
        return textExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInterfaceDeclaration() {
        return interfaceDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInterfaceSignalDecl() {
        return interfaceSignalDeclEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInterfaceSignalDecl_Signals() {
        return (EReference)interfaceSignalDeclEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getISignal() {
        return iSignalEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getISignal_ChannelDescr() {
        return (EReference)iSignalEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getChannelDescription() {
        return channelDescriptionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getChannelDescription_Type() {
        return (EReference)channelDescriptionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getChannelDescription_Expression() {
        return (EReference)channelDescriptionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTypeIdentifier() {
        return typeIdentifierEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTypeIdentifier_Type() {
        return (EAttribute)typeIdentifierEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTypeIdentifier_TypeID() {
        return (EAttribute)typeIdentifierEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTypeIdentifier_Operator() {
        return (EAttribute)typeIdentifierEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInterfaceVariableDecl() {
        return interfaceVariableDeclEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInterfaceVariableDecl_VarDecls() {
        return (EReference)interfaceVariableDeclEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getVariableDecl() {
        return variableDeclEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getVariableDecl_Variables() {
        return (EReference)variableDeclEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getVariableDecl_Type() {
        return (EReference)variableDeclEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIVariable() {
        return iVariableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIVariable_Expression() {
        return (EReference)iVariableEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInput() {
        return inputEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOutput() {
        return outputEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInputOutput() {
        return inputOutputEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getReturn() {
        return returnEClass;
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
        complexExpressionEClass = createEClass(COMPLEX_EXPRESSION);
        createEReference(complexExpressionEClass, COMPLEX_EXPRESSION__SUB_EXPRESSIONS);

        expressionEClass = createEClass(EXPRESSION);

        textualCodeEClass = createEClass(TEXTUAL_CODE);
        createEAttribute(textualCodeEClass, TEXTUAL_CODE__CODE);
        createEAttribute(textualCodeEClass, TEXTUAL_CODE__TYPE);

        signalEClass = createEClass(SIGNAL);
        createEAttribute(signalEClass, SIGNAL__IS_INPUT);
        createEAttribute(signalEClass, SIGNAL__IS_OUTPUT);
        createEAttribute(signalEClass, SIGNAL__COMBINE_OPERATOR);
        createEAttribute(signalEClass, SIGNAL__HOST_COMBINE_OPERATOR);

        valuedObjectEClass = createEClass(VALUED_OBJECT);
        createEAttribute(valuedObjectEClass, VALUED_OBJECT__NAME);
        createEAttribute(valuedObjectEClass, VALUED_OBJECT__TYPE);
        createEAttribute(valuedObjectEClass, VALUED_OBJECT__INITIAL_VALUE);
        createEAttribute(valuedObjectEClass, VALUED_OBJECT__HOST_TYPE);

        variableEClass = createEClass(VARIABLE);
        createEAttribute(variableEClass, VARIABLE__CONST);

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

        textExpressionEClass = createEClass(TEXT_EXPRESSION);

        interfaceDeclarationEClass = createEClass(INTERFACE_DECLARATION);

        interfaceSignalDeclEClass = createEClass(INTERFACE_SIGNAL_DECL);
        createEReference(interfaceSignalDeclEClass, INTERFACE_SIGNAL_DECL__SIGNALS);

        iSignalEClass = createEClass(ISIGNAL);
        createEReference(iSignalEClass, ISIGNAL__CHANNEL_DESCR);

        channelDescriptionEClass = createEClass(CHANNEL_DESCRIPTION);
        createEReference(channelDescriptionEClass, CHANNEL_DESCRIPTION__TYPE);
        createEReference(channelDescriptionEClass, CHANNEL_DESCRIPTION__EXPRESSION);

        typeIdentifierEClass = createEClass(TYPE_IDENTIFIER);
        createEAttribute(typeIdentifierEClass, TYPE_IDENTIFIER__TYPE);
        createEAttribute(typeIdentifierEClass, TYPE_IDENTIFIER__TYPE_ID);
        createEAttribute(typeIdentifierEClass, TYPE_IDENTIFIER__OPERATOR);

        interfaceVariableDeclEClass = createEClass(INTERFACE_VARIABLE_DECL);
        createEReference(interfaceVariableDeclEClass, INTERFACE_VARIABLE_DECL__VAR_DECLS);

        variableDeclEClass = createEClass(VARIABLE_DECL);
        createEReference(variableDeclEClass, VARIABLE_DECL__VARIABLES);
        createEReference(variableDeclEClass, VARIABLE_DECL__TYPE);

        iVariableEClass = createEClass(IVARIABLE);
        createEReference(iVariableEClass, IVARIABLE__EXPRESSION);

        inputEClass = createEClass(INPUT);

        outputEClass = createEClass(OUTPUT);

        inputOutputEClass = createEClass(INPUT_OUTPUT);

        returnEClass = createEClass(RETURN);

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
        de.cau.cs.kieler.annotations.AnnotationsPackage theAnnotationsPackage = (de.cau.cs.kieler.annotations.AnnotationsPackage)EPackage.Registry.INSTANCE.getEPackage(de.cau.cs.kieler.annotations.AnnotationsPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        complexExpressionEClass.getESuperTypes().add(this.getExpression());
        signalEClass.getESuperTypes().add(this.getValuedObject());
        valuedObjectEClass.getESuperTypes().add(theAnnotationsPackage.getAnnotatable());
        variableEClass.getESuperTypes().add(this.getValuedObject());
        valuedObjectReferenceEClass.getESuperTypes().add(this.getComplexExpression());
        valueEClass.getESuperTypes().add(this.getExpression());
        intValueEClass.getESuperTypes().add(this.getValue());
        floatValueEClass.getESuperTypes().add(this.getValue());
        booleanValueEClass.getESuperTypes().add(this.getValue());
        operatorExpressionEClass.getESuperTypes().add(this.getComplexExpression());
        textExpressionEClass.getESuperTypes().add(this.getComplexExpression());
        textExpressionEClass.getESuperTypes().add(this.getTextualCode());
        interfaceSignalDeclEClass.getESuperTypes().add(this.getInterfaceDeclaration());
        iSignalEClass.getESuperTypes().add(this.getSignal());
        interfaceVariableDeclEClass.getESuperTypes().add(this.getInterfaceDeclaration());
        iVariableEClass.getESuperTypes().add(this.getVariable());
        inputEClass.getESuperTypes().add(this.getInterfaceSignalDecl());
        outputEClass.getESuperTypes().add(this.getInterfaceSignalDecl());
        inputOutputEClass.getESuperTypes().add(this.getInterfaceSignalDecl());
        returnEClass.getESuperTypes().add(this.getInterfaceSignalDecl());

        // Initialize classes and features; add operations and parameters
        initEClass(complexExpressionEClass, ComplexExpression.class, "ComplexExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getComplexExpression_SubExpressions(), this.getExpression(), null, "subExpressions", null, 0, -1, ComplexExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(textualCodeEClass, TextualCode.class, "TextualCode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTextualCode_Code(), ecorePackage.getEString(), "code", null, 1, 1, TextualCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTextualCode_Type(), ecorePackage.getEString(), "type", null, 0, 1, TextualCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(signalEClass, Signal.class, "Signal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSignal_IsInput(), ecorePackage.getEBoolean(), "isInput", null, 1, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSignal_IsOutput(), ecorePackage.getEBoolean(), "isOutput", null, 1, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSignal_CombineOperator(), this.getCombineOperator(), "combineOperator", null, 1, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSignal_HostCombineOperator(), ecorePackage.getEString(), "hostCombineOperator", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(valuedObjectEClass, ValuedObject.class, "ValuedObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getValuedObject_Name(), ecorePackage.getEString(), "name", null, 1, 1, ValuedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getValuedObject_Type(), this.getValueType(), "type", null, 1, 1, ValuedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getValuedObject_InitialValue(), ecorePackage.getEString(), "initialValue", null, 0, 1, ValuedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getValuedObject_HostType(), ecorePackage.getEString(), "hostType", null, 0, 1, ValuedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getVariable_Const(), ecorePackage.getEBoolean(), "const", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

        initEClass(textExpressionEClass, TextExpression.class, "TextExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(interfaceDeclarationEClass, InterfaceDeclaration.class, "InterfaceDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(interfaceSignalDeclEClass, InterfaceSignalDecl.class, "InterfaceSignalDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInterfaceSignalDecl_Signals(), this.getISignal(), null, "signals", null, 0, -1, InterfaceSignalDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(iSignalEClass, ISignal.class, "ISignal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getISignal_ChannelDescr(), this.getChannelDescription(), null, "channelDescr", null, 0, 1, ISignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(channelDescriptionEClass, ChannelDescription.class, "ChannelDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getChannelDescription_Type(), this.getTypeIdentifier(), null, "type", null, 0, 1, ChannelDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getChannelDescription_Expression(), this.getExpression(), null, "expression", null, 0, 1, ChannelDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(typeIdentifierEClass, TypeIdentifier.class, "TypeIdentifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTypeIdentifier_Type(), this.getValueType(), "type", "pure", 0, 1, TypeIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTypeIdentifier_TypeID(), ecorePackage.getEString(), "typeID", null, 0, 1, TypeIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTypeIdentifier_Operator(), this.getCombineOperator(), "operator", null, 0, 1, TypeIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(interfaceVariableDeclEClass, InterfaceVariableDecl.class, "InterfaceVariableDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInterfaceVariableDecl_VarDecls(), this.getVariableDecl(), null, "varDecls", null, 0, -1, InterfaceVariableDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(variableDeclEClass, VariableDecl.class, "VariableDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getVariableDecl_Variables(), this.getIVariable(), null, "variables", null, 0, -1, VariableDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getVariableDecl_Type(), this.getTypeIdentifier(), null, "type", null, 0, 1, VariableDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(iVariableEClass, IVariable.class, "IVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getIVariable_Expression(), this.getExpression(), null, "expression", null, 0, 1, IVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(inputOutputEClass, InputOutput.class, "InputOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(returnEClass, Return.class, "Return", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
        addEEnumLiteral(valueTypeEEnum, ValueType.DOUBLE);
        addEEnumLiteral(valueTypeEEnum, ValueType.STRING);

        // Create resource
        createResource(eNS_URI);
    }

} //KExpressionsPackageImpl
