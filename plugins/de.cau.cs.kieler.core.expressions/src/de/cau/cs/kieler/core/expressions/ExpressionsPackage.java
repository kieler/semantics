/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.expressions;

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
 * @see de.cau.cs.kieler.core.expressions.ExpressionsFactory
 * @model kind="package"
 * @generated
 */
public interface ExpressionsPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "expressions";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://kieler.cs.cau.de/expressions";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "expressions";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ExpressionsPackage eINSTANCE = de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl.init();

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.expressions.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.expressions.impl.ExpressionImpl
     * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getExpression()
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
     * The meta object id for the '{@link de.cau.cs.kieler.core.expressions.impl.ComplexExpressionImpl <em>Complex Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.expressions.impl.ComplexExpressionImpl
     * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getComplexExpression()
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
     * The meta object id for the '{@link de.cau.cs.kieler.core.expressions.impl.TextualCodeImpl <em>Textual Code</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.expressions.impl.TextualCodeImpl
     * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getTextualCode()
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
     * The meta object id for the '{@link de.cau.cs.kieler.core.expressions.impl.ValuedObjectImpl <em>Valued Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.expressions.impl.ValuedObjectImpl
     * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getValuedObject()
     * @generated
     */
    int VALUED_OBJECT = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUED_OBJECT__NAME = 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUED_OBJECT__TYPE = 1;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUED_OBJECT__INITIAL_VALUE = 2;

    /**
     * The feature id for the '<em><b>Host Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUED_OBJECT__HOST_TYPE = 3;

    /**
     * The number of structural features of the '<em>Valued Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUED_OBJECT_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.expressions.impl.SignalImpl <em>Signal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.expressions.impl.SignalImpl
     * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getSignal()
     * @generated
     */
    int SIGNAL = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL__NAME = VALUED_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL__TYPE = VALUED_OBJECT__TYPE;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL__INITIAL_VALUE = VALUED_OBJECT__INITIAL_VALUE;

    /**
     * The feature id for the '<em><b>Host Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL__HOST_TYPE = VALUED_OBJECT__HOST_TYPE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL__VALUE = VALUED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Is Input</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL__IS_INPUT = VALUED_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Is Output</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL__IS_OUTPUT = VALUED_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Combine Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL__COMBINE_OPERATOR = VALUED_OBJECT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Host Combine Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL__HOST_COMBINE_OPERATOR = VALUED_OBJECT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Signal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_FEATURE_COUNT = VALUED_OBJECT_FEATURE_COUNT + 5;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.expressions.impl.SignalReferenceImpl <em>Signal Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.expressions.impl.SignalReferenceImpl
     * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getSignalReference()
     * @generated
     */
    int SIGNAL_REFERENCE = 4;

    /**
     * The feature id for the '<em><b>Sub Expressions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_REFERENCE__SUB_EXPRESSIONS = COMPLEX_EXPRESSION__SUB_EXPRESSIONS;

    /**
     * The feature id for the '<em><b>Signal</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_REFERENCE__SIGNAL = COMPLEX_EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Signal Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_REFERENCE_FEATURE_COUNT = COMPLEX_EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.expressions.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.expressions.impl.VariableImpl
     * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getVariable()
     * @generated
     */
    int VARIABLE = 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__NAME = VALUED_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__TYPE = VALUED_OBJECT__TYPE;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__INITIAL_VALUE = VALUED_OBJECT__INITIAL_VALUE;

    /**
     * The feature id for the '<em><b>Host Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__HOST_TYPE = VALUED_OBJECT__HOST_TYPE;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__VALUE = VALUED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Const</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__CONST = VALUED_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_FEATURE_COUNT = VALUED_OBJECT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.expressions.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.expressions.impl.VariableReferenceImpl
     * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getVariableReference()
     * @generated
     */
    int VARIABLE_REFERENCE = 7;

    /**
     * The feature id for the '<em><b>Sub Expressions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_REFERENCE__SUB_EXPRESSIONS = COMPLEX_EXPRESSION__SUB_EXPRESSIONS;

    /**
     * The feature id for the '<em><b>Variable</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_REFERENCE__VARIABLE = COMPLEX_EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Variable Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_REFERENCE_FEATURE_COUNT = COMPLEX_EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.expressions.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.expressions.impl.ValueImpl
     * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getValue()
     * @generated
     */
    int VALUE = 8;

    /**
     * The number of structural features of the '<em>Value</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.expressions.impl.IntValueImpl <em>Int Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.expressions.impl.IntValueImpl
     * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getIntValue()
     * @generated
     */
    int INT_VALUE = 9;

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
     * The meta object id for the '{@link de.cau.cs.kieler.core.expressions.impl.FloatValueImpl <em>Float Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.expressions.impl.FloatValueImpl
     * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getFloatValue()
     * @generated
     */
    int FLOAT_VALUE = 10;

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
     * The meta object id for the '{@link de.cau.cs.kieler.core.expressions.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.expressions.impl.BooleanValueImpl
     * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getBooleanValue()
     * @generated
     */
    int BOOLEAN_VALUE = 11;

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
     * The meta object id for the '{@link de.cau.cs.kieler.core.expressions.impl.OperatorExpressionImpl <em>Operator Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.expressions.impl.OperatorExpressionImpl
     * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getOperatorExpression()
     * @generated
     */
    int OPERATOR_EXPRESSION = 12;

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
     * The meta object id for the '{@link de.cau.cs.kieler.core.expressions.impl.TextExpressionImpl <em>Text Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.expressions.impl.TextExpressionImpl
     * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getTextExpression()
     * @generated
     */
    int TEXT_EXPRESSION = 13;

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
     * The meta object id for the '{@link de.cau.cs.kieler.core.expressions.CombineOperator <em>Combine Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.expressions.CombineOperator
     * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getCombineOperator()
     * @generated
     */
    int COMBINE_OPERATOR = 14;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.expressions.OperatorType <em>Operator Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.expressions.OperatorType
     * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getOperatorType()
     * @generated
     */
    int OPERATOR_TYPE = 15;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.expressions.ValueType <em>Value Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.expressions.ValueType
     * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getValueType()
     * @generated
     */
    int VALUE_TYPE = 16;


    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.expressions.ComplexExpression <em>Complex Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Complex Expression</em>'.
     * @see de.cau.cs.kieler.core.expressions.ComplexExpression
     * @generated
     */
    EClass getComplexExpression();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.core.expressions.ComplexExpression#getSubExpressions <em>Sub Expressions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sub Expressions</em>'.
     * @see de.cau.cs.kieler.core.expressions.ComplexExpression#getSubExpressions()
     * @see #getComplexExpression()
     * @generated
     */
    EReference getComplexExpression_SubExpressions();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.expressions.Expression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Expression</em>'.
     * @see de.cau.cs.kieler.core.expressions.Expression
     * @generated
     */
    EClass getExpression();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.expressions.TextualCode <em>Textual Code</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Textual Code</em>'.
     * @see de.cau.cs.kieler.core.expressions.TextualCode
     * @generated
     */
    EClass getTextualCode();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.core.expressions.TextualCode#getCode <em>Code</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Code</em>'.
     * @see de.cau.cs.kieler.core.expressions.TextualCode#getCode()
     * @see #getTextualCode()
     * @generated
     */
    EAttribute getTextualCode_Code();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.core.expressions.TextualCode#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see de.cau.cs.kieler.core.expressions.TextualCode#getType()
     * @see #getTextualCode()
     * @generated
     */
    EAttribute getTextualCode_Type();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.expressions.Signal <em>Signal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Signal</em>'.
     * @see de.cau.cs.kieler.core.expressions.Signal
     * @generated
     */
    EClass getSignal();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.core.expressions.Signal#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Value</em>'.
     * @see de.cau.cs.kieler.core.expressions.Signal#getValue()
     * @see #getSignal()
     * @generated
     */
    EReference getSignal_Value();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.core.expressions.Signal#isIsInput <em>Is Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Input</em>'.
     * @see de.cau.cs.kieler.core.expressions.Signal#isIsInput()
     * @see #getSignal()
     * @generated
     */
    EAttribute getSignal_IsInput();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.core.expressions.Signal#isIsOutput <em>Is Output</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Output</em>'.
     * @see de.cau.cs.kieler.core.expressions.Signal#isIsOutput()
     * @see #getSignal()
     * @generated
     */
    EAttribute getSignal_IsOutput();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.core.expressions.Signal#getCombineOperator <em>Combine Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Combine Operator</em>'.
     * @see de.cau.cs.kieler.core.expressions.Signal#getCombineOperator()
     * @see #getSignal()
     * @generated
     */
    EAttribute getSignal_CombineOperator();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.core.expressions.Signal#getHostCombineOperator <em>Host Combine Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Host Combine Operator</em>'.
     * @see de.cau.cs.kieler.core.expressions.Signal#getHostCombineOperator()
     * @see #getSignal()
     * @generated
     */
    EAttribute getSignal_HostCombineOperator();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.expressions.SignalReference <em>Signal Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Signal Reference</em>'.
     * @see de.cau.cs.kieler.core.expressions.SignalReference
     * @generated
     */
    EClass getSignalReference();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.core.expressions.SignalReference#getSignal <em>Signal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Signal</em>'.
     * @see de.cau.cs.kieler.core.expressions.SignalReference#getSignal()
     * @see #getSignalReference()
     * @generated
     */
    EReference getSignalReference_Signal();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.expressions.ValuedObject <em>Valued Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Valued Object</em>'.
     * @see de.cau.cs.kieler.core.expressions.ValuedObject
     * @generated
     */
    EClass getValuedObject();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.core.expressions.ValuedObject#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see de.cau.cs.kieler.core.expressions.ValuedObject#getName()
     * @see #getValuedObject()
     * @generated
     */
    EAttribute getValuedObject_Name();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.core.expressions.ValuedObject#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see de.cau.cs.kieler.core.expressions.ValuedObject#getType()
     * @see #getValuedObject()
     * @generated
     */
    EAttribute getValuedObject_Type();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.core.expressions.ValuedObject#getInitialValue <em>Initial Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Initial Value</em>'.
     * @see de.cau.cs.kieler.core.expressions.ValuedObject#getInitialValue()
     * @see #getValuedObject()
     * @generated
     */
    EAttribute getValuedObject_InitialValue();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.core.expressions.ValuedObject#getHostType <em>Host Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Host Type</em>'.
     * @see de.cau.cs.kieler.core.expressions.ValuedObject#getHostType()
     * @see #getValuedObject()
     * @generated
     */
    EAttribute getValuedObject_HostType();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.expressions.Variable <em>Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Variable</em>'.
     * @see de.cau.cs.kieler.core.expressions.Variable
     * @generated
     */
    EClass getVariable();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.core.expressions.Variable#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Value</em>'.
     * @see de.cau.cs.kieler.core.expressions.Variable#getValue()
     * @see #getVariable()
     * @generated
     */
    EReference getVariable_Value();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.core.expressions.Variable#isConst <em>Const</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Const</em>'.
     * @see de.cau.cs.kieler.core.expressions.Variable#isConst()
     * @see #getVariable()
     * @generated
     */
    EAttribute getVariable_Const();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.expressions.VariableReference <em>Variable Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Variable Reference</em>'.
     * @see de.cau.cs.kieler.core.expressions.VariableReference
     * @generated
     */
    EClass getVariableReference();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.core.expressions.VariableReference#getVariable <em>Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Variable</em>'.
     * @see de.cau.cs.kieler.core.expressions.VariableReference#getVariable()
     * @see #getVariableReference()
     * @generated
     */
    EReference getVariableReference_Variable();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.expressions.Value <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Value</em>'.
     * @see de.cau.cs.kieler.core.expressions.Value
     * @generated
     */
    EClass getValue();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.expressions.IntValue <em>Int Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Int Value</em>'.
     * @see de.cau.cs.kieler.core.expressions.IntValue
     * @generated
     */
    EClass getIntValue();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.core.expressions.IntValue#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see de.cau.cs.kieler.core.expressions.IntValue#getValue()
     * @see #getIntValue()
     * @generated
     */
    EAttribute getIntValue_Value();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.expressions.FloatValue <em>Float Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Float Value</em>'.
     * @see de.cau.cs.kieler.core.expressions.FloatValue
     * @generated
     */
    EClass getFloatValue();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.core.expressions.FloatValue#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see de.cau.cs.kieler.core.expressions.FloatValue#getValue()
     * @see #getFloatValue()
     * @generated
     */
    EAttribute getFloatValue_Value();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.expressions.BooleanValue <em>Boolean Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Boolean Value</em>'.
     * @see de.cau.cs.kieler.core.expressions.BooleanValue
     * @generated
     */
    EClass getBooleanValue();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.core.expressions.BooleanValue#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see de.cau.cs.kieler.core.expressions.BooleanValue#getValue()
     * @see #getBooleanValue()
     * @generated
     */
    EAttribute getBooleanValue_Value();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.expressions.OperatorExpression <em>Operator Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Operator Expression</em>'.
     * @see de.cau.cs.kieler.core.expressions.OperatorExpression
     * @generated
     */
    EClass getOperatorExpression();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.core.expressions.OperatorExpression#getOperator <em>Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Operator</em>'.
     * @see de.cau.cs.kieler.core.expressions.OperatorExpression#getOperator()
     * @see #getOperatorExpression()
     * @generated
     */
    EAttribute getOperatorExpression_Operator();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.expressions.TextExpression <em>Text Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Text Expression</em>'.
     * @see de.cau.cs.kieler.core.expressions.TextExpression
     * @generated
     */
    EClass getTextExpression();

    /**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.core.expressions.CombineOperator <em>Combine Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Combine Operator</em>'.
     * @see de.cau.cs.kieler.core.expressions.CombineOperator
     * @generated
     */
    EEnum getCombineOperator();

    /**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.core.expressions.OperatorType <em>Operator Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Operator Type</em>'.
     * @see de.cau.cs.kieler.core.expressions.OperatorType
     * @generated
     */
    EEnum getOperatorType();

    /**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.core.expressions.ValueType <em>Value Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Value Type</em>'.
     * @see de.cau.cs.kieler.core.expressions.ValueType
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
    ExpressionsFactory getExpressionsFactory();

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
         * The meta object literal for the '{@link de.cau.cs.kieler.core.expressions.impl.ComplexExpressionImpl <em>Complex Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.expressions.impl.ComplexExpressionImpl
         * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getComplexExpression()
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
         * The meta object literal for the '{@link de.cau.cs.kieler.core.expressions.impl.ExpressionImpl <em>Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.expressions.impl.ExpressionImpl
         * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getExpression()
         * @generated
         */
        EClass EXPRESSION = eINSTANCE.getExpression();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.expressions.impl.TextualCodeImpl <em>Textual Code</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.expressions.impl.TextualCodeImpl
         * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getTextualCode()
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
         * The meta object literal for the '{@link de.cau.cs.kieler.core.expressions.impl.SignalImpl <em>Signal</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.expressions.impl.SignalImpl
         * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getSignal()
         * @generated
         */
        EClass SIGNAL = eINSTANCE.getSignal();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SIGNAL__VALUE = eINSTANCE.getSignal_Value();

        /**
         * The meta object literal for the '<em><b>Is Input</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SIGNAL__IS_INPUT = eINSTANCE.getSignal_IsInput();

        /**
         * The meta object literal for the '<em><b>Is Output</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SIGNAL__IS_OUTPUT = eINSTANCE.getSignal_IsOutput();

        /**
         * The meta object literal for the '<em><b>Combine Operator</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SIGNAL__COMBINE_OPERATOR = eINSTANCE.getSignal_CombineOperator();

        /**
         * The meta object literal for the '<em><b>Host Combine Operator</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SIGNAL__HOST_COMBINE_OPERATOR = eINSTANCE.getSignal_HostCombineOperator();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.expressions.impl.SignalReferenceImpl <em>Signal Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.expressions.impl.SignalReferenceImpl
         * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getSignalReference()
         * @generated
         */
        EClass SIGNAL_REFERENCE = eINSTANCE.getSignalReference();

        /**
         * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SIGNAL_REFERENCE__SIGNAL = eINSTANCE.getSignalReference_Signal();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.expressions.impl.ValuedObjectImpl <em>Valued Object</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.expressions.impl.ValuedObjectImpl
         * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getValuedObject()
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
         * The meta object literal for the '<em><b>Host Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VALUED_OBJECT__HOST_TYPE = eINSTANCE.getValuedObject_HostType();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.expressions.impl.VariableImpl <em>Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.expressions.impl.VariableImpl
         * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getVariable()
         * @generated
         */
        EClass VARIABLE = eINSTANCE.getVariable();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VARIABLE__VALUE = eINSTANCE.getVariable_Value();

        /**
         * The meta object literal for the '<em><b>Const</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VARIABLE__CONST = eINSTANCE.getVariable_Const();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.expressions.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.expressions.impl.VariableReferenceImpl
         * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getVariableReference()
         * @generated
         */
        EClass VARIABLE_REFERENCE = eINSTANCE.getVariableReference();

        /**
         * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VARIABLE_REFERENCE__VARIABLE = eINSTANCE.getVariableReference_Variable();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.expressions.impl.ValueImpl <em>Value</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.expressions.impl.ValueImpl
         * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getValue()
         * @generated
         */
        EClass VALUE = eINSTANCE.getValue();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.expressions.impl.IntValueImpl <em>Int Value</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.expressions.impl.IntValueImpl
         * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getIntValue()
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
         * The meta object literal for the '{@link de.cau.cs.kieler.core.expressions.impl.FloatValueImpl <em>Float Value</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.expressions.impl.FloatValueImpl
         * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getFloatValue()
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
         * The meta object literal for the '{@link de.cau.cs.kieler.core.expressions.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.expressions.impl.BooleanValueImpl
         * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getBooleanValue()
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
         * The meta object literal for the '{@link de.cau.cs.kieler.core.expressions.impl.OperatorExpressionImpl <em>Operator Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.expressions.impl.OperatorExpressionImpl
         * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getOperatorExpression()
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
         * The meta object literal for the '{@link de.cau.cs.kieler.core.expressions.impl.TextExpressionImpl <em>Text Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.expressions.impl.TextExpressionImpl
         * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getTextExpression()
         * @generated
         */
        EClass TEXT_EXPRESSION = eINSTANCE.getTextExpression();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.expressions.CombineOperator <em>Combine Operator</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.expressions.CombineOperator
         * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getCombineOperator()
         * @generated
         */
        EEnum COMBINE_OPERATOR = eINSTANCE.getCombineOperator();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.expressions.OperatorType <em>Operator Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.expressions.OperatorType
         * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getOperatorType()
         * @generated
         */
        EEnum OPERATOR_TYPE = eINSTANCE.getOperatorType();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.expressions.ValueType <em>Value Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.expressions.ValueType
         * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getValueType()
         * @generated
         */
        EEnum VALUE_TYPE = eINSTANCE.getValueType();

    }

} //ExpressionsPackage
