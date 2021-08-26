/**
 */
package de.cau.cs.kieler.kexpressions.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.cau.cs.kieler.annotations.AnnotationsPackage;
import de.cau.cs.kieler.kexpressions.AccessModifier;
import de.cau.cs.kieler.kexpressions.BoolValue;
import de.cau.cs.kieler.kexpressions.Call;
import de.cau.cs.kieler.kexpressions.CombineOperator;
import de.cau.cs.kieler.kexpressions.Declaration;
import de.cau.cs.kieler.kexpressions.Expression;
import de.cau.cs.kieler.kexpressions.ExternString;
import de.cau.cs.kieler.kexpressions.FloatValue;
import de.cau.cs.kieler.kexpressions.FunctionCall;
import de.cau.cs.kieler.kexpressions.GenericParameterDeclaration;
import de.cau.cs.kieler.kexpressions.GenericTypeReference;
import de.cau.cs.kieler.kexpressions.IgnoreValue;
import de.cau.cs.kieler.kexpressions.IntValue;
import de.cau.cs.kieler.kexpressions.JsonAnnotation;
import de.cau.cs.kieler.kexpressions.JsonArrayValue;
import de.cau.cs.kieler.kexpressions.JsonObjectMember;
import de.cau.cs.kieler.kexpressions.JsonObjectValue;
import de.cau.cs.kieler.kexpressions.JsonPragma;
import de.cau.cs.kieler.kexpressions.KExpressionsFactory;
import de.cau.cs.kieler.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.kexpressions.MethodDeclaration;
import de.cau.cs.kieler.kexpressions.NullValue;
import de.cau.cs.kieler.kexpressions.OperatorExpression;
import de.cau.cs.kieler.kexpressions.OperatorType;
import de.cau.cs.kieler.kexpressions.Parameter;
import de.cau.cs.kieler.kexpressions.ParameterAccessType;
import de.cau.cs.kieler.kexpressions.PrintCall;
import de.cau.cs.kieler.kexpressions.PriorityProtocol;
import de.cau.cs.kieler.kexpressions.RandomCall;
import de.cau.cs.kieler.kexpressions.RandomizeCall;
import de.cau.cs.kieler.kexpressions.ReferenceCall;
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration;
import de.cau.cs.kieler.kexpressions.Referenceable;
import de.cau.cs.kieler.kexpressions.Schedulable;
import de.cau.cs.kieler.kexpressions.ScheduleDeclaration;
import de.cau.cs.kieler.kexpressions.ScheduleObjectReference;
import de.cau.cs.kieler.kexpressions.SpecialAccessExpression;
import de.cau.cs.kieler.kexpressions.StringValue;
import de.cau.cs.kieler.kexpressions.TextExpression;
import de.cau.cs.kieler.kexpressions.ThisExpression;
import de.cau.cs.kieler.kexpressions.Value;
import de.cau.cs.kieler.kexpressions.ValueType;
import de.cau.cs.kieler.kexpressions.ValueTypeReference;
import de.cau.cs.kieler.kexpressions.ValuedObject;
import de.cau.cs.kieler.kexpressions.ValuedObjectReference;
import de.cau.cs.kieler.kexpressions.VariableDeclaration;
import de.cau.cs.kieler.kexpressions.VectorValue;

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
    private EClass boolValueEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass stringValueEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass vectorValueEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ignoreValueEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass jsonPragmaEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass jsonAnnotationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass jsonObjectValueEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass jsonObjectMemberEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass jsonArrayValueEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nullValueEClass = null;

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
    private EClass declarationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass variableDeclarationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass referenceDeclarationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass genericParameterDeclarationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass genericTypeReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass valueTypeReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass scheduleDeclarationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass methodDeclarationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass scheduleObjectReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass parameterEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass callEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass referenceCallEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass functionCallEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass printCallEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass randomCallEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass randomizeCallEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass referenceableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass schedulableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass externStringEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass specialAccessExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass thisExpressionEClass = null;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum priorityProtocolEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum parameterAccessTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum accessModifierEEnum = null;

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
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#eNS_URI
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
        Object registeredKExpressionsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        KExpressionsPackageImpl theKExpressionsPackage = registeredKExpressionsPackage instanceof KExpressionsPackageImpl ? (KExpressionsPackageImpl)registeredKExpressionsPackage : new KExpressionsPackageImpl();

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
    @Override
    public EClass getExpression() {
        return expressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getValuedObject() {
        return valuedObjectEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getValuedObject_CombineOperator() {
        return (EAttribute)valuedObjectEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getValuedObject_InitialValue() {
        return (EReference)valuedObjectEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getValuedObject_Cardinalities() {
        return (EReference)valuedObjectEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getValuedObject_Label() {
        return (EAttribute)valuedObjectEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getValuedObject_GenericParameters() {
        return (EReference)valuedObjectEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getValuedObject_Parameters() {
        return (EReference)valuedObjectEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getValuedObjectReference() {
        return valuedObjectReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getValuedObjectReference_ValuedObject() {
        return (EReference)valuedObjectReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getValuedObjectReference_Indices() {
        return (EReference)valuedObjectReferenceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getValuedObjectReference_SubReference() {
        return (EReference)valuedObjectReferenceEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getValue() {
        return valueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getIntValue() {
        return intValueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIntValue_Value() {
        return (EAttribute)intValueEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getFloatValue() {
        return floatValueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFloatValue_Value() {
        return (EAttribute)floatValueEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBoolValue() {
        return boolValueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBoolValue_Value() {
        return (EAttribute)boolValueEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getStringValue() {
        return stringValueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getStringValue_Value() {
        return (EAttribute)stringValueEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getVectorValue() {
        return vectorValueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getVectorValue_Values() {
        return (EReference)vectorValueEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getVectorValue_Range() {
        return (EAttribute)vectorValueEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getIgnoreValue() {
        return ignoreValueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getJsonPragma() {
        return jsonPragmaEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getJsonPragma_Value() {
        return (EReference)jsonPragmaEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getJsonAnnotation() {
        return jsonAnnotationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getJsonAnnotation_Value() {
        return (EReference)jsonAnnotationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getJsonObjectValue() {
        return jsonObjectValueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getJsonObjectValue_Members() {
        return (EReference)jsonObjectValueEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getJsonObjectMember() {
        return jsonObjectMemberEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getJsonObjectMember_Key() {
        return (EAttribute)jsonObjectMemberEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getJsonObjectMember_Value() {
        return (EReference)jsonObjectMemberEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getJsonArrayValue() {
        return jsonArrayValueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getJsonArrayValue_Elements() {
        return (EReference)jsonArrayValueEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNullValue() {
        return nullValueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getOperatorExpression() {
        return operatorExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getOperatorExpression_Operator() {
        return (EAttribute)operatorExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getOperatorExpression_SubExpressions() {
        return (EReference)operatorExpressionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTextExpression() {
        return textExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTextExpression_Text() {
        return (EAttribute)textExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDeclaration() {
        return declarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDeclaration_ValuedObjects() {
        return (EReference)declarationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDeclaration_Access() {
        return (EAttribute)declarationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getVariableDeclaration() {
        return variableDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getVariableDeclaration_Type() {
        return (EAttribute)variableDeclarationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getVariableDeclaration_Input() {
        return (EAttribute)variableDeclarationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getVariableDeclaration_Output() {
        return (EAttribute)variableDeclarationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getVariableDeclaration_Static() {
        return (EAttribute)variableDeclarationEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getVariableDeclaration_Signal() {
        return (EAttribute)variableDeclarationEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getVariableDeclaration_Const() {
        return (EAttribute)variableDeclarationEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getVariableDeclaration_Extern() {
        return (EAttribute)variableDeclarationEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getVariableDeclaration_Volatile() {
        return (EAttribute)variableDeclarationEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getVariableDeclaration_Global() {
        return (EAttribute)variableDeclarationEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getVariableDeclaration_HostType() {
        return (EAttribute)variableDeclarationEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getReferenceDeclaration() {
        return referenceDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getReferenceDeclaration_Input() {
        return (EAttribute)referenceDeclarationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getReferenceDeclaration_Reference() {
        return (EReference)referenceDeclarationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getReferenceDeclaration_ReferenceContainer() {
        return (EReference)referenceDeclarationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getReferenceDeclaration_Parameters() {
        return (EReference)referenceDeclarationEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getReferenceDeclaration_Extern() {
        return (EReference)referenceDeclarationEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getReferenceDeclaration_GenericParameters() {
        return (EReference)referenceDeclarationEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getGenericParameterDeclaration() {
        return genericParameterDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getGenericParameterDeclaration_Reference() {
        return (EAttribute)genericParameterDeclarationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getGenericParameterDeclaration_ValueType() {
        return (EAttribute)genericParameterDeclarationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGenericParameterDeclaration_Type() {
        return (EReference)genericParameterDeclarationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getGenericTypeReference() {
        return genericTypeReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGenericTypeReference_Type() {
        return (EReference)genericTypeReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGenericTypeReference_GenericParameters() {
        return (EReference)genericTypeReferenceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getValueTypeReference() {
        return valueTypeReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getValueTypeReference_ValueType() {
        return (EAttribute)valueTypeReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getScheduleDeclaration() {
        return scheduleDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getScheduleDeclaration_Name() {
        return (EAttribute)scheduleDeclarationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getScheduleDeclaration_Global() {
        return (EAttribute)scheduleDeclarationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getScheduleDeclaration_Priorities() {
        return (EAttribute)scheduleDeclarationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getMethodDeclaration() {
        return methodDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getMethodDeclaration_Override() {
        return (EAttribute)methodDeclarationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getMethodDeclaration_ReturnType() {
        return (EAttribute)methodDeclarationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getMethodDeclaration_ParameterDeclarations() {
        return (EReference)methodDeclarationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getScheduleObjectReference() {
        return scheduleObjectReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getScheduleObjectReference_Priority() {
        return (EAttribute)scheduleObjectReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getParameter() {
        return parameterEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getParameter_AccessType() {
        return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getParameter_Expression() {
        return (EReference)parameterEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getParameter_ExplicitBinding() {
        return (EReference)parameterEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getParameter_ExplicitBindingIndices() {
        return (EReference)parameterEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCall() {
        return callEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCall_Parameters() {
        return (EReference)callEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getReferenceCall() {
        return referenceCallEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getFunctionCall() {
        return functionCallEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFunctionCall_FunctionName() {
        return (EAttribute)functionCallEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPrintCall() {
        return printCallEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRandomCall() {
        return randomCallEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRandomizeCall() {
        return randomizeCallEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getReferenceable() {
        return referenceableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSchedulable() {
        return schedulableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSchedulable_Schedule() {
        return (EReference)schedulableEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getExternString() {
        return externStringEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getExternString_Code() {
        return (EAttribute)externStringEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSpecialAccessExpression() {
        return specialAccessExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSpecialAccessExpression_Access() {
        return (EAttribute)specialAccessExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSpecialAccessExpression_SubReference() {
        return (EReference)specialAccessExpressionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSpecialAccessExpression_Container() {
        return (EReference)specialAccessExpressionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSpecialAccessExpression_Target() {
        return (EReference)specialAccessExpressionEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getThisExpression() {
        return thisExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getCombineOperator() {
        return combineOperatorEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getOperatorType() {
        return operatorTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getValueType() {
        return valueTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getPriorityProtocol() {
        return priorityProtocolEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getParameterAccessType() {
        return parameterAccessTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getAccessModifier() {
        return accessModifierEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
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
        createEAttribute(valuedObjectEClass, VALUED_OBJECT__COMBINE_OPERATOR);
        createEReference(valuedObjectEClass, VALUED_OBJECT__INITIAL_VALUE);
        createEReference(valuedObjectEClass, VALUED_OBJECT__CARDINALITIES);
        createEAttribute(valuedObjectEClass, VALUED_OBJECT__LABEL);
        createEReference(valuedObjectEClass, VALUED_OBJECT__GENERIC_PARAMETERS);
        createEReference(valuedObjectEClass, VALUED_OBJECT__PARAMETERS);

        valuedObjectReferenceEClass = createEClass(VALUED_OBJECT_REFERENCE);
        createEReference(valuedObjectReferenceEClass, VALUED_OBJECT_REFERENCE__VALUED_OBJECT);
        createEReference(valuedObjectReferenceEClass, VALUED_OBJECT_REFERENCE__INDICES);
        createEReference(valuedObjectReferenceEClass, VALUED_OBJECT_REFERENCE__SUB_REFERENCE);

        valueEClass = createEClass(VALUE);

        intValueEClass = createEClass(INT_VALUE);
        createEAttribute(intValueEClass, INT_VALUE__VALUE);

        floatValueEClass = createEClass(FLOAT_VALUE);
        createEAttribute(floatValueEClass, FLOAT_VALUE__VALUE);

        boolValueEClass = createEClass(BOOL_VALUE);
        createEAttribute(boolValueEClass, BOOL_VALUE__VALUE);

        stringValueEClass = createEClass(STRING_VALUE);
        createEAttribute(stringValueEClass, STRING_VALUE__VALUE);

        vectorValueEClass = createEClass(VECTOR_VALUE);
        createEReference(vectorValueEClass, VECTOR_VALUE__VALUES);
        createEAttribute(vectorValueEClass, VECTOR_VALUE__RANGE);

        ignoreValueEClass = createEClass(IGNORE_VALUE);

        jsonPragmaEClass = createEClass(JSON_PRAGMA);
        createEReference(jsonPragmaEClass, JSON_PRAGMA__VALUE);

        jsonAnnotationEClass = createEClass(JSON_ANNOTATION);
        createEReference(jsonAnnotationEClass, JSON_ANNOTATION__VALUE);

        jsonObjectValueEClass = createEClass(JSON_OBJECT_VALUE);
        createEReference(jsonObjectValueEClass, JSON_OBJECT_VALUE__MEMBERS);

        jsonObjectMemberEClass = createEClass(JSON_OBJECT_MEMBER);
        createEAttribute(jsonObjectMemberEClass, JSON_OBJECT_MEMBER__KEY);
        createEReference(jsonObjectMemberEClass, JSON_OBJECT_MEMBER__VALUE);

        jsonArrayValueEClass = createEClass(JSON_ARRAY_VALUE);
        createEReference(jsonArrayValueEClass, JSON_ARRAY_VALUE__ELEMENTS);

        nullValueEClass = createEClass(NULL_VALUE);

        operatorExpressionEClass = createEClass(OPERATOR_EXPRESSION);
        createEAttribute(operatorExpressionEClass, OPERATOR_EXPRESSION__OPERATOR);
        createEReference(operatorExpressionEClass, OPERATOR_EXPRESSION__SUB_EXPRESSIONS);

        textExpressionEClass = createEClass(TEXT_EXPRESSION);
        createEAttribute(textExpressionEClass, TEXT_EXPRESSION__TEXT);

        declarationEClass = createEClass(DECLARATION);
        createEReference(declarationEClass, DECLARATION__VALUED_OBJECTS);
        createEAttribute(declarationEClass, DECLARATION__ACCESS);

        variableDeclarationEClass = createEClass(VARIABLE_DECLARATION);
        createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__TYPE);
        createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__INPUT);
        createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__OUTPUT);
        createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__STATIC);
        createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__SIGNAL);
        createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__CONST);
        createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__EXTERN);
        createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__VOLATILE);
        createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__GLOBAL);
        createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__HOST_TYPE);

        referenceDeclarationEClass = createEClass(REFERENCE_DECLARATION);
        createEAttribute(referenceDeclarationEClass, REFERENCE_DECLARATION__INPUT);
        createEReference(referenceDeclarationEClass, REFERENCE_DECLARATION__REFERENCE);
        createEReference(referenceDeclarationEClass, REFERENCE_DECLARATION__REFERENCE_CONTAINER);
        createEReference(referenceDeclarationEClass, REFERENCE_DECLARATION__PARAMETERS);
        createEReference(referenceDeclarationEClass, REFERENCE_DECLARATION__EXTERN);
        createEReference(referenceDeclarationEClass, REFERENCE_DECLARATION__GENERIC_PARAMETERS);

        genericParameterDeclarationEClass = createEClass(GENERIC_PARAMETER_DECLARATION);
        createEAttribute(genericParameterDeclarationEClass, GENERIC_PARAMETER_DECLARATION__REFERENCE);
        createEAttribute(genericParameterDeclarationEClass, GENERIC_PARAMETER_DECLARATION__VALUE_TYPE);
        createEReference(genericParameterDeclarationEClass, GENERIC_PARAMETER_DECLARATION__TYPE);

        genericTypeReferenceEClass = createEClass(GENERIC_TYPE_REFERENCE);
        createEReference(genericTypeReferenceEClass, GENERIC_TYPE_REFERENCE__TYPE);
        createEReference(genericTypeReferenceEClass, GENERIC_TYPE_REFERENCE__GENERIC_PARAMETERS);

        valueTypeReferenceEClass = createEClass(VALUE_TYPE_REFERENCE);
        createEAttribute(valueTypeReferenceEClass, VALUE_TYPE_REFERENCE__VALUE_TYPE);

        methodDeclarationEClass = createEClass(METHOD_DECLARATION);
        createEAttribute(methodDeclarationEClass, METHOD_DECLARATION__OVERRIDE);
        createEAttribute(methodDeclarationEClass, METHOD_DECLARATION__RETURN_TYPE);
        createEReference(methodDeclarationEClass, METHOD_DECLARATION__PARAMETER_DECLARATIONS);

        scheduleDeclarationEClass = createEClass(SCHEDULE_DECLARATION);
        createEAttribute(scheduleDeclarationEClass, SCHEDULE_DECLARATION__NAME);
        createEAttribute(scheduleDeclarationEClass, SCHEDULE_DECLARATION__GLOBAL);
        createEAttribute(scheduleDeclarationEClass, SCHEDULE_DECLARATION__PRIORITIES);

        scheduleObjectReferenceEClass = createEClass(SCHEDULE_OBJECT_REFERENCE);
        createEAttribute(scheduleObjectReferenceEClass, SCHEDULE_OBJECT_REFERENCE__PRIORITY);

        parameterEClass = createEClass(PARAMETER);
        createEAttribute(parameterEClass, PARAMETER__ACCESS_TYPE);
        createEReference(parameterEClass, PARAMETER__EXPRESSION);
        createEReference(parameterEClass, PARAMETER__EXPLICIT_BINDING);
        createEReference(parameterEClass, PARAMETER__EXPLICIT_BINDING_INDICES);

        callEClass = createEClass(CALL);
        createEReference(callEClass, CALL__PARAMETERS);

        referenceCallEClass = createEClass(REFERENCE_CALL);

        functionCallEClass = createEClass(FUNCTION_CALL);
        createEAttribute(functionCallEClass, FUNCTION_CALL__FUNCTION_NAME);

        printCallEClass = createEClass(PRINT_CALL);

        randomCallEClass = createEClass(RANDOM_CALL);

        randomizeCallEClass = createEClass(RANDOMIZE_CALL);

        referenceableEClass = createEClass(REFERENCEABLE);

        schedulableEClass = createEClass(SCHEDULABLE);
        createEReference(schedulableEClass, SCHEDULABLE__SCHEDULE);

        externStringEClass = createEClass(EXTERN_STRING);
        createEAttribute(externStringEClass, EXTERN_STRING__CODE);

        specialAccessExpressionEClass = createEClass(SPECIAL_ACCESS_EXPRESSION);
        createEAttribute(specialAccessExpressionEClass, SPECIAL_ACCESS_EXPRESSION__ACCESS);
        createEReference(specialAccessExpressionEClass, SPECIAL_ACCESS_EXPRESSION__SUB_REFERENCE);
        createEReference(specialAccessExpressionEClass, SPECIAL_ACCESS_EXPRESSION__CONTAINER);
        createEReference(specialAccessExpressionEClass, SPECIAL_ACCESS_EXPRESSION__TARGET);

        thisExpressionEClass = createEClass(THIS_EXPRESSION);

        // Create enums
        combineOperatorEEnum = createEEnum(COMBINE_OPERATOR);
        operatorTypeEEnum = createEEnum(OPERATOR_TYPE);
        valueTypeEEnum = createEEnum(VALUE_TYPE);
        priorityProtocolEEnum = createEEnum(PRIORITY_PROTOCOL);
        parameterAccessTypeEEnum = createEEnum(PARAMETER_ACCESS_TYPE);
        accessModifierEEnum = createEEnum(ACCESS_MODIFIER);
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
    @SuppressWarnings("deprecation")
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
        expressionEClass.getESuperTypes().add(this.getSchedulable());
        valuedObjectEClass.getESuperTypes().add(theAnnotationsPackage.getNamedObject());
        valuedObjectEClass.getESuperTypes().add(theAnnotationsPackage.getAnnotatable());
        valuedObjectEClass.getESuperTypes().add(this.getReferenceable());
        valuedObjectReferenceEClass.getESuperTypes().add(this.getExpression());
        valueEClass.getESuperTypes().add(this.getExpression());
        intValueEClass.getESuperTypes().add(this.getValue());
        floatValueEClass.getESuperTypes().add(this.getValue());
        boolValueEClass.getESuperTypes().add(this.getValue());
        stringValueEClass.getESuperTypes().add(this.getValue());
        vectorValueEClass.getESuperTypes().add(this.getValue());
        ignoreValueEClass.getESuperTypes().add(this.getValue());
        jsonPragmaEClass.getESuperTypes().add(theAnnotationsPackage.getPragma());
        jsonAnnotationEClass.getESuperTypes().add(theAnnotationsPackage.getAnnotation());
        jsonObjectValueEClass.getESuperTypes().add(this.getValue());
        jsonArrayValueEClass.getESuperTypes().add(this.getValue());
        nullValueEClass.getESuperTypes().add(this.getValue());
        operatorExpressionEClass.getESuperTypes().add(this.getExpression());
        textExpressionEClass.getESuperTypes().add(this.getExpression());
        textExpressionEClass.getESuperTypes().add(theAnnotationsPackage.getAnnotatable());
        declarationEClass.getESuperTypes().add(theAnnotationsPackage.getAnnotatable());
        variableDeclarationEClass.getESuperTypes().add(this.getDeclaration());
        referenceDeclarationEClass.getESuperTypes().add(this.getDeclaration());
        genericParameterDeclarationEClass.getESuperTypes().add(this.getDeclaration());
        genericTypeReferenceEClass.getESuperTypes().add(this.getExpression());
        valueTypeReferenceEClass.getESuperTypes().add(this.getExpression());
        methodDeclarationEClass.getESuperTypes().add(this.getDeclaration());
        methodDeclarationEClass.getESuperTypes().add(this.getSchedulable());
        scheduleDeclarationEClass.getESuperTypes().add(this.getDeclaration());
        scheduleObjectReferenceEClass.getESuperTypes().add(this.getValuedObjectReference());
        callEClass.getESuperTypes().add(this.getExpression());
        referenceCallEClass.getESuperTypes().add(this.getValuedObjectReference());
        referenceCallEClass.getESuperTypes().add(this.getCall());
        functionCallEClass.getESuperTypes().add(this.getCall());
        printCallEClass.getESuperTypes().add(this.getCall());
        randomCallEClass.getESuperTypes().add(this.getCall());
        randomizeCallEClass.getESuperTypes().add(this.getCall());
        externStringEClass.getESuperTypes().add(theAnnotationsPackage.getAnnotatable());
        specialAccessExpressionEClass.getESuperTypes().add(this.getExpression());
        thisExpressionEClass.getESuperTypes().add(this.getExpression());

        // Initialize classes and features; add operations and parameters
        initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(valuedObjectEClass, ValuedObject.class, "ValuedObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getValuedObject_CombineOperator(), this.getCombineOperator(), "combineOperator", null, 1, 1, ValuedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getValuedObject_InitialValue(), this.getExpression(), null, "initialValue", null, 0, 1, ValuedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getValuedObject_Cardinalities(), this.getExpression(), null, "cardinalities", null, 0, -1, ValuedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getValuedObject_Label(), ecorePackage.getEString(), "label", null, 0, 1, ValuedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getValuedObject_GenericParameters(), this.getParameter(), null, "genericParameters", null, 0, -1, ValuedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getValuedObject_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, ValuedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(valuedObjectReferenceEClass, ValuedObjectReference.class, "ValuedObjectReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getValuedObjectReference_ValuedObject(), this.getValuedObject(), null, "valuedObject", null, 1, 1, ValuedObjectReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getValuedObjectReference_Indices(), this.getExpression(), null, "indices", null, 0, -1, ValuedObjectReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getValuedObjectReference_SubReference(), this.getValuedObjectReference(), null, "subReference", null, 0, 1, ValuedObjectReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(valueEClass, Value.class, "Value", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(intValueEClass, IntValue.class, "IntValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getIntValue_Value(), ecorePackage.getEIntegerObject(), "value", null, 1, 1, IntValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(floatValueEClass, FloatValue.class, "FloatValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getFloatValue_Value(), ecorePackage.getEDoubleObject(), "value", null, 1, 1, FloatValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(boolValueEClass, BoolValue.class, "BoolValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getBoolValue_Value(), ecorePackage.getEBooleanObject(), "value", null, 1, 1, BoolValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(stringValueEClass, StringValue.class, "StringValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getStringValue_Value(), ecorePackage.getEString(), "value", null, 1, 1, StringValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(vectorValueEClass, VectorValue.class, "VectorValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getVectorValue_Values(), this.getExpression(), null, "values", null, 1, -1, VectorValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVectorValue_Range(), ecorePackage.getEBoolean(), "range", "false", 0, 1, VectorValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(ignoreValueEClass, IgnoreValue.class, "IgnoreValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(jsonPragmaEClass, JsonPragma.class, "JsonPragma", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getJsonPragma_Value(), this.getJsonObjectValue(), null, "value", null, 0, 1, JsonPragma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(jsonAnnotationEClass, JsonAnnotation.class, "JsonAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getJsonAnnotation_Value(), this.getJsonObjectValue(), null, "value", null, 0, 1, JsonAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(jsonObjectValueEClass, JsonObjectValue.class, "JsonObjectValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getJsonObjectValue_Members(), this.getJsonObjectMember(), null, "members", null, 0, -1, JsonObjectValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        EOperation op = addEOperation(jsonObjectValueEClass, null, "getMembersMap", 1, 1, IS_UNIQUE, IS_ORDERED);
        EGenericType g1 = createEGenericType(ecorePackage.getEMap());
        EGenericType g2 = createEGenericType(ecorePackage.getEString());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(this.getValue());
        g1.getETypeArguments().add(g2);
        initEOperation(op, g1);

        initEClass(jsonObjectMemberEClass, JsonObjectMember.class, "JsonObjectMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getJsonObjectMember_Key(), ecorePackage.getEString(), "key", null, 0, 1, JsonObjectMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getJsonObjectMember_Value(), this.getValue(), null, "value", null, 0, 1, JsonObjectMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(jsonArrayValueEClass, JsonArrayValue.class, "JsonArrayValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getJsonArrayValue_Elements(), this.getValue(), null, "elements", null, 0, -1, JsonArrayValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(nullValueEClass, NullValue.class, "NullValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(operatorExpressionEClass, OperatorExpression.class, "OperatorExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getOperatorExpression_Operator(), this.getOperatorType(), "operator", null, 0, 1, OperatorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getOperatorExpression_SubExpressions(), this.getExpression(), null, "subExpressions", null, 0, -1, OperatorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(textExpressionEClass, TextExpression.class, "TextExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTextExpression_Text(), ecorePackage.getEString(), "text", null, 0, 1, TextExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(declarationEClass, Declaration.class, "Declaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDeclaration_ValuedObjects(), this.getValuedObject(), null, "valuedObjects", null, 0, -1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDeclaration_Access(), this.getAccessModifier(), "access", null, 0, 1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(variableDeclarationEClass, VariableDeclaration.class, "VariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getVariableDeclaration_Type(), this.getValueType(), "type", null, 1, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVariableDeclaration_Input(), ecorePackage.getEBoolean(), "input", null, 1, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVariableDeclaration_Output(), ecorePackage.getEBoolean(), "output", null, 1, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVariableDeclaration_Static(), ecorePackage.getEBoolean(), "static", null, 1, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVariableDeclaration_Signal(), ecorePackage.getEBoolean(), "signal", null, 1, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVariableDeclaration_Const(), ecorePackage.getEBoolean(), "const", null, 1, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVariableDeclaration_Extern(), ecorePackage.getEBoolean(), "extern", null, 1, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVariableDeclaration_Volatile(), ecorePackage.getEBoolean(), "volatile", null, 1, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVariableDeclaration_Global(), ecorePackage.getEBoolean(), "global", null, 1, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVariableDeclaration_HostType(), ecorePackage.getEString(), "hostType", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(referenceDeclarationEClass, ReferenceDeclaration.class, "ReferenceDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getReferenceDeclaration_Input(), ecorePackage.getEBoolean(), "input", "false", 1, 1, ReferenceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getReferenceDeclaration_Reference(), ecorePackage.getEObject(), null, "reference", null, 0, 1, ReferenceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getReferenceDeclaration_ReferenceContainer(), ecorePackage.getEObject(), null, "referenceContainer", null, 0, 1, ReferenceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getReferenceDeclaration_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, ReferenceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getReferenceDeclaration_Extern(), this.getExternString(), null, "extern", null, 0, -1, ReferenceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getReferenceDeclaration_GenericParameters(), this.getParameter(), null, "genericParameters", null, 0, -1, ReferenceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(genericParameterDeclarationEClass, GenericParameterDeclaration.class, "GenericParameterDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getGenericParameterDeclaration_Reference(), ecorePackage.getEBoolean(), "reference", null, 1, 1, GenericParameterDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGenericParameterDeclaration_ValueType(), this.getValueType(), "valueType", "UNKNOWN", 0, 1, GenericParameterDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getGenericParameterDeclaration_Type(), theAnnotationsPackage.getNamedObject(), null, "type", null, 0, 1, GenericParameterDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(genericTypeReferenceEClass, GenericTypeReference.class, "GenericTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getGenericTypeReference_Type(), theAnnotationsPackage.getNamedObject(), null, "type", null, 1, 1, GenericTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getGenericTypeReference_GenericParameters(), this.getParameter(), null, "genericParameters", null, 0, -1, GenericTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(valueTypeReferenceEClass, ValueTypeReference.class, "ValueTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getValueTypeReference_ValueType(), this.getValueType(), "valueType", null, 1, 1, ValueTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(methodDeclarationEClass, MethodDeclaration.class, "MethodDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getMethodDeclaration_Override(), ecorePackage.getEBoolean(), "override", null, 0, 1, MethodDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMethodDeclaration_ReturnType(), this.getValueType(), "returnType", null, 0, 1, MethodDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMethodDeclaration_ParameterDeclarations(), this.getDeclaration(), null, "parameterDeclarations", null, 0, -1, MethodDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(scheduleDeclarationEClass, ScheduleDeclaration.class, "ScheduleDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getScheduleDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, ScheduleDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getScheduleDeclaration_Global(), this.getPriorityProtocol(), "global", null, 0, 1, ScheduleDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getScheduleDeclaration_Priorities(), this.getPriorityProtocol(), "priorities", null, 0, -1, ScheduleDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(scheduleObjectReferenceEClass, ScheduleObjectReference.class, "ScheduleObjectReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getScheduleObjectReference_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, ScheduleObjectReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getParameter_AccessType(), this.getParameterAccessType(), "accessType", "CALL_BY_VALUE", 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getParameter_Expression(), this.getExpression(), null, "expression", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getParameter_ExplicitBinding(), this.getValuedObject(), null, "explicitBinding", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getParameter_ExplicitBindingIndices(), this.getExpression(), null, "explicitBindingIndices", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(callEClass, Call.class, "Call", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCall_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(referenceCallEClass, ReferenceCall.class, "ReferenceCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(functionCallEClass, FunctionCall.class, "FunctionCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getFunctionCall_FunctionName(), ecorePackage.getEString(), "functionName", null, 0, 1, FunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(printCallEClass, PrintCall.class, "PrintCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(randomCallEClass, RandomCall.class, "RandomCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(randomizeCallEClass, RandomizeCall.class, "RandomizeCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(referenceableEClass, Referenceable.class, "Referenceable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(schedulableEClass, Schedulable.class, "Schedulable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSchedulable_Schedule(), this.getScheduleObjectReference(), null, "schedule", null, 0, -1, Schedulable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(externStringEClass, ExternString.class, "ExternString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getExternString_Code(), ecorePackage.getEString(), "code", null, 0, 1, ExternString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(specialAccessExpressionEClass, SpecialAccessExpression.class, "SpecialAccessExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSpecialAccessExpression_Access(), ecorePackage.getEString(), "access", null, 1, 1, SpecialAccessExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSpecialAccessExpression_SubReference(), this.getValuedObjectReference(), null, "subReference", null, 0, 1, SpecialAccessExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSpecialAccessExpression_Container(), theAnnotationsPackage.getNamedObject(), null, "container", null, 0, 1, SpecialAccessExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSpecialAccessExpression_Target(), theAnnotationsPackage.getNamedObject(), null, "target", null, 0, 1, SpecialAccessExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(thisExpressionEClass, ThisExpression.class, "ThisExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
        addEEnumLiteral(operatorTypeEEnum, OperatorType.NOT);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.EQ);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.LT);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.LEQ);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.LOGICAL_AND);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.LOGICAL_OR);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.ADD);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.SUB);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.MULT);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.DIV);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.GEQ);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.PRE);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.GT);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.MOD);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.NE);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.VAL);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.BITWISE_AND);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.BITWISE_OR);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.POSTFIX_ADD);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.POSTFIX_SUB);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.SHIFT_LEFT);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.SHIFT_RIGHT);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.SHIFT_RIGHT_UNSIGNED);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.BITWISE_XOR);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.BITWISE_NOT);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.CONDITIONAL);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.FBY);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.CURRENT);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.WHEN);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.INIT);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.ATMOSTONEOF);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.NOR);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.IMPLIES);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.SFBY);
        addEEnumLiteral(operatorTypeEEnum, OperatorType.LAST);

        initEEnum(valueTypeEEnum, ValueType.class, "ValueType");
        addEEnumLiteral(valueTypeEEnum, ValueType.PURE);
        addEEnumLiteral(valueTypeEEnum, ValueType.BOOL);
        addEEnumLiteral(valueTypeEEnum, ValueType.UNSIGNED);
        addEEnumLiteral(valueTypeEEnum, ValueType.INT);
        addEEnumLiteral(valueTypeEEnum, ValueType.FLOAT);
        addEEnumLiteral(valueTypeEEnum, ValueType.HOST);
        addEEnumLiteral(valueTypeEEnum, ValueType.DOUBLE);
        addEEnumLiteral(valueTypeEEnum, ValueType.STRING);
        addEEnumLiteral(valueTypeEEnum, ValueType.REFERENCE);
        addEEnumLiteral(valueTypeEEnum, ValueType.SCHEDULE);
        addEEnumLiteral(valueTypeEEnum, ValueType.UNKNOWN);
        addEEnumLiteral(valueTypeEEnum, ValueType.CLOCK);
        addEEnumLiteral(valueTypeEEnum, ValueType.JSON);
        addEEnumLiteral(valueTypeEEnum, ValueType.STRUCT);
        addEEnumLiteral(valueTypeEEnum, ValueType.CLASS);
        addEEnumLiteral(valueTypeEEnum, ValueType.ENUM);
        addEEnumLiteral(valueTypeEEnum, ValueType.VOID);

        initEEnum(priorityProtocolEEnum, PriorityProtocol.class, "PriorityProtocol");
        addEEnumLiteral(priorityProtocolEEnum, PriorityProtocol.CONFLICT);
        addEEnumLiteral(priorityProtocolEEnum, PriorityProtocol.CONFLUENT);

        initEEnum(parameterAccessTypeEEnum, ParameterAccessType.class, "ParameterAccessType");
        addEEnumLiteral(parameterAccessTypeEEnum, ParameterAccessType.CALL_BY_VALUE);
        addEEnumLiteral(parameterAccessTypeEEnum, ParameterAccessType.CALL_BY_REFERENCE);
        addEEnumLiteral(parameterAccessTypeEEnum, ParameterAccessType.PURE_OUTPUT);

        initEEnum(accessModifierEEnum, AccessModifier.class, "AccessModifier");
        addEEnumLiteral(accessModifierEEnum, AccessModifier.UNDEF);
        addEEnumLiteral(accessModifierEEnum, AccessModifier.PRIVATE);
        addEEnumLiteral(accessModifierEEnum, AccessModifier.PROTECTED);
        addEEnumLiteral(accessModifierEEnum, AccessModifier.PUBLIC);

        // Create resource
        createResource(eNS_URI);
    }

} //KExpressionsPackageImpl
