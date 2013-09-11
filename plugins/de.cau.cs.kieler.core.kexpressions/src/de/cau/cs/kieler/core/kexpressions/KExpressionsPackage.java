/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.core.kexpressions;

import de.cau.cs.kieler.core.annotations.AnnotationsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
 * @model kind="package"
 * @generated
 */
public interface KExpressionsPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "kexpressions";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://kieler.cs.cau.de/kexpressions/0.1.2";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "kexpressions";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    KExpressionsPackage eINSTANCE = de.cau.cs.kieler.core.kexpressions.impl.KExpressionsPackageImpl.init();

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.kexpressions.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.kexpressions.impl.ExpressionImpl
     * @see de.cau.cs.kieler.core.kexpressions.impl.KExpressionsPackageImpl#getExpression()
     * @generated
     */
    int EXPRESSION = 1;

    /**
     * The number of structural features of the '<em>Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.kexpressions.impl.ComplexExpressionImpl <em>Complex Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.kexpressions.impl.ComplexExpressionImpl
     * @see de.cau.cs.kieler.core.kexpressions.impl.KExpressionsPackageImpl#getComplexExpression()
     * @generated
     */
    int COMPLEX_EXPRESSION = 0;

    /**
     * The feature id for the '<em><b>Sub Expressions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_EXPRESSION__SUB_EXPRESSIONS = EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Complex Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.kexpressions.impl.TextualCodeImpl <em>Textual Code</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.kexpressions.impl.TextualCodeImpl
     * @see de.cau.cs.kieler.core.kexpressions.impl.KExpressionsPackageImpl#getTextualCode()
     * @generated
     */
    int TEXTUAL_CODE = 2;

    /**
     * The feature id for the '<em><b>Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXTUAL_CODE__CODE = 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXTUAL_CODE__TYPE = 1;

    /**
     * The number of structural features of the '<em>Textual Code</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXTUAL_CODE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.kexpressions.impl.ValuedObjectImpl <em>Valued Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.kexpressions.impl.ValuedObjectImpl
     * @see de.cau.cs.kieler.core.kexpressions.impl.KExpressionsPackageImpl#getValuedObject()
     * @generated
     */
    int VALUED_OBJECT = 3;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUED_OBJECT__ANNOTATIONS = AnnotationsPackage.ANNOTATABLE__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUED_OBJECT__NAME = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUED_OBJECT__TYPE = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUED_OBJECT__INITIAL_VALUE = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Is Input</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUED_OBJECT__IS_INPUT = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Is Output</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUED_OBJECT__IS_OUTPUT = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Is Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUED_OBJECT__IS_STATIC = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Is Signal</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUED_OBJECT__IS_SIGNAL = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Combine Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUED_OBJECT__COMBINE_OPERATOR = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Valued Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUED_OBJECT_FEATURE_COUNT = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 8;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.kexpressions.impl.ValuedObjectReferenceImpl <em>Valued Object Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.kexpressions.impl.ValuedObjectReferenceImpl
     * @see de.cau.cs.kieler.core.kexpressions.impl.KExpressionsPackageImpl#getValuedObjectReference()
     * @generated
     */
    int VALUED_OBJECT_REFERENCE = 4;

    /**
     * The feature id for the '<em><b>Sub Expressions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUED_OBJECT_REFERENCE__SUB_EXPRESSIONS = COMPLEX_EXPRESSION__SUB_EXPRESSIONS;

    /**
     * The feature id for the '<em><b>Valued Object</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUED_OBJECT_REFERENCE__VALUED_OBJECT = COMPLEX_EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Valued Object Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUED_OBJECT_REFERENCE_FEATURE_COUNT = COMPLEX_EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.kexpressions.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.kexpressions.impl.ValueImpl
     * @see de.cau.cs.kieler.core.kexpressions.impl.KExpressionsPackageImpl#getValue()
     * @generated
     */
    int VALUE = 5;

    /**
     * The number of structural features of the '<em>Value</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.kexpressions.impl.IntValueImpl <em>Int Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.kexpressions.impl.IntValueImpl
     * @see de.cau.cs.kieler.core.kexpressions.impl.KExpressionsPackageImpl#getIntValue()
     * @generated
     */
    int INT_VALUE = 6;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Int Value</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.kexpressions.impl.FloatValueImpl <em>Float Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.kexpressions.impl.FloatValueImpl
     * @see de.cau.cs.kieler.core.kexpressions.impl.KExpressionsPackageImpl#getFloatValue()
     * @generated
     */
    int FLOAT_VALUE = 7;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Float Value</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.kexpressions.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.kexpressions.impl.BooleanValueImpl
     * @see de.cau.cs.kieler.core.kexpressions.impl.KExpressionsPackageImpl#getBooleanValue()
     * @generated
     */
    int BOOLEAN_VALUE = 8;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Boolean Value</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.kexpressions.impl.OperatorExpressionImpl <em>Operator Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.kexpressions.impl.OperatorExpressionImpl
     * @see de.cau.cs.kieler.core.kexpressions.impl.KExpressionsPackageImpl#getOperatorExpression()
     * @generated
     */
    int OPERATOR_EXPRESSION = 9;

    /**
     * The feature id for the '<em><b>Sub Expressions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATOR_EXPRESSION__SUB_EXPRESSIONS = COMPLEX_EXPRESSION__SUB_EXPRESSIONS;

    /**
     * The feature id for the '<em><b>Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATOR_EXPRESSION__OPERATOR = COMPLEX_EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Operator Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATOR_EXPRESSION_FEATURE_COUNT = COMPLEX_EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.kexpressions.impl.TextExpressionImpl <em>Text Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.kexpressions.impl.TextExpressionImpl
     * @see de.cau.cs.kieler.core.kexpressions.impl.KExpressionsPackageImpl#getTextExpression()
     * @generated
     */
    int TEXT_EXPRESSION = 10;

    /**
     * The feature id for the '<em><b>Sub Expressions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_EXPRESSION__SUB_EXPRESSIONS = COMPLEX_EXPRESSION__SUB_EXPRESSIONS;

    /**
     * The feature id for the '<em><b>Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_EXPRESSION__CODE = COMPLEX_EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_EXPRESSION__TYPE = COMPLEX_EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Text Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_EXPRESSION_FEATURE_COUNT = COMPLEX_EXPRESSION_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.kexpressions.CombineOperator <em>Combine Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.kexpressions.CombineOperator
     * @see de.cau.cs.kieler.core.kexpressions.impl.KExpressionsPackageImpl#getCombineOperator()
     * @generated
     */
    int COMBINE_OPERATOR = 11;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.kexpressions.OperatorType <em>Operator Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.kexpressions.OperatorType
     * @see de.cau.cs.kieler.core.kexpressions.impl.KExpressionsPackageImpl#getOperatorType()
     * @generated
     */
    int OPERATOR_TYPE = 12;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.kexpressions.ValueType <em>Value Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.kexpressions.ValueType
     * @see de.cau.cs.kieler.core.kexpressions.impl.KExpressionsPackageImpl#getValueType()
     * @generated
     */
    int VALUE_TYPE = 13;


    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.kexpressions.ComplexExpression <em>Complex Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Complex Expression</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.ComplexExpression
     * @generated
     */
    EClass getComplexExpression();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.core.kexpressions.ComplexExpression#getSubExpressions <em>Sub Expressions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sub Expressions</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.ComplexExpression#getSubExpressions()
     * @see #getComplexExpression()
     * @generated
     */
    EReference getComplexExpression_SubExpressions();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.kexpressions.Expression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Expression</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.Expression
     * @generated
     */
    EClass getExpression();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.kexpressions.TextualCode <em>Textual Code</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Textual Code</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.TextualCode
     * @generated
     */
    EClass getTextualCode();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.core.kexpressions.TextualCode#getCode <em>Code</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Code</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.TextualCode#getCode()
     * @see #getTextualCode()
     * @generated
     */
    EAttribute getTextualCode_Code();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.core.kexpressions.TextualCode#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.TextualCode#getType()
     * @see #getTextualCode()
     * @generated
     */
    EAttribute getTextualCode_Type();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.kexpressions.ValuedObject <em>Valued Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Valued Object</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.ValuedObject
     * @generated
     */
    EClass getValuedObject();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.core.kexpressions.ValuedObject#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.ValuedObject#getName()
     * @see #getValuedObject()
     * @generated
     */
    EAttribute getValuedObject_Name();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.core.kexpressions.ValuedObject#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.ValuedObject#getType()
     * @see #getValuedObject()
     * @generated
     */
    EAttribute getValuedObject_Type();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.core.kexpressions.ValuedObject#getInitialValue <em>Initial Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Initial Value</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.ValuedObject#getInitialValue()
     * @see #getValuedObject()
     * @generated
     */
    EAttribute getValuedObject_InitialValue();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.core.kexpressions.ValuedObject#isIsInput <em>Is Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Input</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.ValuedObject#isIsInput()
     * @see #getValuedObject()
     * @generated
     */
    EAttribute getValuedObject_IsInput();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.core.kexpressions.ValuedObject#isIsOutput <em>Is Output</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Output</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.ValuedObject#isIsOutput()
     * @see #getValuedObject()
     * @generated
     */
    EAttribute getValuedObject_IsOutput();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.core.kexpressions.ValuedObject#isIsStatic <em>Is Static</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Static</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.ValuedObject#isIsStatic()
     * @see #getValuedObject()
     * @generated
     */
    EAttribute getValuedObject_IsStatic();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.core.kexpressions.ValuedObject#isIsSignal <em>Is Signal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Signal</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.ValuedObject#isIsSignal()
     * @see #getValuedObject()
     * @generated
     */
    EAttribute getValuedObject_IsSignal();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.core.kexpressions.ValuedObject#getCombineOperator <em>Combine Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Combine Operator</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.ValuedObject#getCombineOperator()
     * @see #getValuedObject()
     * @generated
     */
    EAttribute getValuedObject_CombineOperator();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.kexpressions.ValuedObjectReference <em>Valued Object Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Valued Object Reference</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
     * @generated
     */
    EClass getValuedObjectReference();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.core.kexpressions.ValuedObjectReference#getValuedObject <em>Valued Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Valued Object</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.ValuedObjectReference#getValuedObject()
     * @see #getValuedObjectReference()
     * @generated
     */
    EReference getValuedObjectReference_ValuedObject();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.kexpressions.Value <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Value</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.Value
     * @generated
     */
    EClass getValue();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.kexpressions.IntValue <em>Int Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Int Value</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.IntValue
     * @generated
     */
    EClass getIntValue();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.core.kexpressions.IntValue#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.IntValue#getValue()
     * @see #getIntValue()
     * @generated
     */
    EAttribute getIntValue_Value();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.kexpressions.FloatValue <em>Float Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Float Value</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.FloatValue
     * @generated
     */
    EClass getFloatValue();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.core.kexpressions.FloatValue#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.FloatValue#getValue()
     * @see #getFloatValue()
     * @generated
     */
    EAttribute getFloatValue_Value();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.kexpressions.BooleanValue <em>Boolean Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Boolean Value</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.BooleanValue
     * @generated
     */
    EClass getBooleanValue();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.core.kexpressions.BooleanValue#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.BooleanValue#getValue()
     * @see #getBooleanValue()
     * @generated
     */
    EAttribute getBooleanValue_Value();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.kexpressions.OperatorExpression <em>Operator Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Operator Expression</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.OperatorExpression
     * @generated
     */
    EClass getOperatorExpression();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.core.kexpressions.OperatorExpression#getOperator <em>Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Operator</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.OperatorExpression#getOperator()
     * @see #getOperatorExpression()
     * @generated
     */
    EAttribute getOperatorExpression_Operator();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.kexpressions.TextExpression <em>Text Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Text Expression</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.TextExpression
     * @generated
     */
    EClass getTextExpression();

    /**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.core.kexpressions.CombineOperator <em>Combine Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Combine Operator</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.CombineOperator
     * @generated
     */
    EEnum getCombineOperator();

    /**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.core.kexpressions.OperatorType <em>Operator Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Operator Type</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.OperatorType
     * @generated
     */
    EEnum getOperatorType();

    /**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.core.kexpressions.ValueType <em>Value Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Value Type</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.ValueType
     * @generated
     */
    EEnum getValueType();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    KExpressionsFactory getKExpressionsFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.kexpressions.impl.ComplexExpressionImpl <em>Complex Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.kexpressions.impl.ComplexExpressionImpl
         * @see de.cau.cs.kieler.core.kexpressions.impl.KExpressionsPackageImpl#getComplexExpression()
         * @generated
         */
        EClass COMPLEX_EXPRESSION = eINSTANCE.getComplexExpression();

        /**
         * The meta object literal for the '<em><b>Sub Expressions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPLEX_EXPRESSION__SUB_EXPRESSIONS = eINSTANCE.getComplexExpression_SubExpressions();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.kexpressions.impl.ExpressionImpl <em>Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.kexpressions.impl.ExpressionImpl
         * @see de.cau.cs.kieler.core.kexpressions.impl.KExpressionsPackageImpl#getExpression()
         * @generated
         */
        EClass EXPRESSION = eINSTANCE.getExpression();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.kexpressions.impl.TextualCodeImpl <em>Textual Code</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.kexpressions.impl.TextualCodeImpl
         * @see de.cau.cs.kieler.core.kexpressions.impl.KExpressionsPackageImpl#getTextualCode()
         * @generated
         */
        EClass TEXTUAL_CODE = eINSTANCE.getTextualCode();

        /**
         * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEXTUAL_CODE__CODE = eINSTANCE.getTextualCode_Code();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEXTUAL_CODE__TYPE = eINSTANCE.getTextualCode_Type();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.kexpressions.impl.ValuedObjectImpl <em>Valued Object</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.kexpressions.impl.ValuedObjectImpl
         * @see de.cau.cs.kieler.core.kexpressions.impl.KExpressionsPackageImpl#getValuedObject()
         * @generated
         */
        EClass VALUED_OBJECT = eINSTANCE.getValuedObject();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VALUED_OBJECT__NAME = eINSTANCE.getValuedObject_Name();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VALUED_OBJECT__TYPE = eINSTANCE.getValuedObject_Type();

        /**
         * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VALUED_OBJECT__INITIAL_VALUE = eINSTANCE.getValuedObject_InitialValue();

        /**
         * The meta object literal for the '<em><b>Is Input</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VALUED_OBJECT__IS_INPUT = eINSTANCE.getValuedObject_IsInput();

        /**
         * The meta object literal for the '<em><b>Is Output</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VALUED_OBJECT__IS_OUTPUT = eINSTANCE.getValuedObject_IsOutput();

        /**
         * The meta object literal for the '<em><b>Is Static</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VALUED_OBJECT__IS_STATIC = eINSTANCE.getValuedObject_IsStatic();

        /**
         * The meta object literal for the '<em><b>Is Signal</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VALUED_OBJECT__IS_SIGNAL = eINSTANCE.getValuedObject_IsSignal();

        /**
         * The meta object literal for the '<em><b>Combine Operator</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VALUED_OBJECT__COMBINE_OPERATOR = eINSTANCE.getValuedObject_CombineOperator();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.kexpressions.impl.ValuedObjectReferenceImpl <em>Valued Object Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.kexpressions.impl.ValuedObjectReferenceImpl
         * @see de.cau.cs.kieler.core.kexpressions.impl.KExpressionsPackageImpl#getValuedObjectReference()
         * @generated
         */
        EClass VALUED_OBJECT_REFERENCE = eINSTANCE.getValuedObjectReference();

        /**
         * The meta object literal for the '<em><b>Valued Object</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUED_OBJECT_REFERENCE__VALUED_OBJECT = eINSTANCE.getValuedObjectReference_ValuedObject();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.kexpressions.impl.ValueImpl <em>Value</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.kexpressions.impl.ValueImpl
         * @see de.cau.cs.kieler.core.kexpressions.impl.KExpressionsPackageImpl#getValue()
         * @generated
         */
        EClass VALUE = eINSTANCE.getValue();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.kexpressions.impl.IntValueImpl <em>Int Value</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.kexpressions.impl.IntValueImpl
         * @see de.cau.cs.kieler.core.kexpressions.impl.KExpressionsPackageImpl#getIntValue()
         * @generated
         */
        EClass INT_VALUE = eINSTANCE.getIntValue();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INT_VALUE__VALUE = eINSTANCE.getIntValue_Value();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.kexpressions.impl.FloatValueImpl <em>Float Value</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.kexpressions.impl.FloatValueImpl
         * @see de.cau.cs.kieler.core.kexpressions.impl.KExpressionsPackageImpl#getFloatValue()
         * @generated
         */
        EClass FLOAT_VALUE = eINSTANCE.getFloatValue();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FLOAT_VALUE__VALUE = eINSTANCE.getFloatValue_Value();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.kexpressions.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.kexpressions.impl.BooleanValueImpl
         * @see de.cau.cs.kieler.core.kexpressions.impl.KExpressionsPackageImpl#getBooleanValue()
         * @generated
         */
        EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOOLEAN_VALUE__VALUE = eINSTANCE.getBooleanValue_Value();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.kexpressions.impl.OperatorExpressionImpl <em>Operator Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.kexpressions.impl.OperatorExpressionImpl
         * @see de.cau.cs.kieler.core.kexpressions.impl.KExpressionsPackageImpl#getOperatorExpression()
         * @generated
         */
        EClass OPERATOR_EXPRESSION = eINSTANCE.getOperatorExpression();

        /**
         * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPERATOR_EXPRESSION__OPERATOR = eINSTANCE.getOperatorExpression_Operator();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.kexpressions.impl.TextExpressionImpl <em>Text Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.kexpressions.impl.TextExpressionImpl
         * @see de.cau.cs.kieler.core.kexpressions.impl.KExpressionsPackageImpl#getTextExpression()
         * @generated
         */
        EClass TEXT_EXPRESSION = eINSTANCE.getTextExpression();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.kexpressions.CombineOperator <em>Combine Operator</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.kexpressions.CombineOperator
         * @see de.cau.cs.kieler.core.kexpressions.impl.KExpressionsPackageImpl#getCombineOperator()
         * @generated
         */
        EEnum COMBINE_OPERATOR = eINSTANCE.getCombineOperator();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.kexpressions.OperatorType <em>Operator Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.kexpressions.OperatorType
         * @see de.cau.cs.kieler.core.kexpressions.impl.KExpressionsPackageImpl#getOperatorType()
         * @generated
         */
        EEnum OPERATOR_TYPE = eINSTANCE.getOperatorType();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.kexpressions.ValueType <em>Value Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.kexpressions.ValueType
         * @see de.cau.cs.kieler.core.kexpressions.impl.KExpressionsPackageImpl#getValueType()
         * @generated
         */
        EEnum VALUE_TYPE = eINSTANCE.getValueType();

    }

} //KExpressionsPackage
