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
    String eNS_URI = "http://kieler.cs.cau.de/expressions/0.1.2";

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
    int VALUED_OBJECT = 4;

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
     * The feature id for the '<em><b>Host Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUED_OBJECT__HOST_TYPE = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Valued Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUED_OBJECT_FEATURE_COUNT = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 4;

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
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SIGNAL__ANNOTATIONS = VALUED_OBJECT__ANNOTATIONS;

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
     * The feature id for the '<em><b>Is Input</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL__IS_INPUT = VALUED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Is Output</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL__IS_OUTPUT = VALUED_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Combine Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL__COMBINE_OPERATOR = VALUED_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Host Combine Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL__HOST_COMBINE_OPERATOR = VALUED_OBJECT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Signal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_FEATURE_COUNT = VALUED_OBJECT_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.expressions.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.expressions.impl.VariableImpl
     * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getVariable()
     * @generated
     */
    int VARIABLE = 5;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VARIABLE__ANNOTATIONS = VALUED_OBJECT__ANNOTATIONS;

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
     * The feature id for the '<em><b>Const</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__CONST = VALUED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_FEATURE_COUNT = VALUED_OBJECT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.expressions.impl.ValuedObjectReferenceImpl <em>Valued Object Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.expressions.impl.ValuedObjectReferenceImpl
     * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getValuedObjectReference()
     * @generated
     */
    int VALUED_OBJECT_REFERENCE = 6;

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
     * The meta object id for the '{@link de.cau.cs.kieler.core.expressions.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.expressions.impl.ValueImpl
     * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getValue()
     * @generated
     */
    int VALUE = 7;

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
    int INT_VALUE = 8;

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
    int FLOAT_VALUE = 9;

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
    int BOOLEAN_VALUE = 10;

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
    int OPERATOR_EXPRESSION = 11;

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
    int TEXT_EXPRESSION = 12;

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
     * The meta object id for the '{@link de.cau.cs.kieler.core.expressions.impl.InterfaceDeclarationImpl <em>Interface Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.expressions.impl.InterfaceDeclarationImpl
     * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getInterfaceDeclaration()
     * @generated
     */
    int INTERFACE_DECLARATION = 13;

    /**
     * The number of structural features of the '<em>Interface Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_DECLARATION_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.expressions.impl.InterfaceSignalDeclImpl <em>Interface Signal Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.expressions.impl.InterfaceSignalDeclImpl
     * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getInterfaceSignalDecl()
     * @generated
     */
    int INTERFACE_SIGNAL_DECL = 14;

    /**
     * The feature id for the '<em><b>Signals</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_SIGNAL_DECL__SIGNALS = INTERFACE_DECLARATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Interface Signal Decl</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_SIGNAL_DECL_FEATURE_COUNT = INTERFACE_DECLARATION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.expressions.impl.ISignalImpl <em>ISignal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.expressions.impl.ISignalImpl
     * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getISignal()
     * @generated
     */
    int ISIGNAL = 15;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISIGNAL__ANNOTATIONS = SIGNAL__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISIGNAL__NAME = SIGNAL__NAME;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISIGNAL__TYPE = SIGNAL__TYPE;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISIGNAL__INITIAL_VALUE = SIGNAL__INITIAL_VALUE;

    /**
     * The feature id for the '<em><b>Host Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISIGNAL__HOST_TYPE = SIGNAL__HOST_TYPE;

    /**
     * The feature id for the '<em><b>Is Input</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISIGNAL__IS_INPUT = SIGNAL__IS_INPUT;

    /**
     * The feature id for the '<em><b>Is Output</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISIGNAL__IS_OUTPUT = SIGNAL__IS_OUTPUT;

    /**
     * The feature id for the '<em><b>Combine Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISIGNAL__COMBINE_OPERATOR = SIGNAL__COMBINE_OPERATOR;

    /**
     * The feature id for the '<em><b>Host Combine Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISIGNAL__HOST_COMBINE_OPERATOR = SIGNAL__HOST_COMBINE_OPERATOR;

    /**
     * The feature id for the '<em><b>Channel Descr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISIGNAL__CHANNEL_DESCR = SIGNAL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>ISignal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISIGNAL_FEATURE_COUNT = SIGNAL_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.expressions.impl.ChannelDescriptionImpl <em>Channel Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.expressions.impl.ChannelDescriptionImpl
     * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getChannelDescription()
     * @generated
     */
    int CHANNEL_DESCRIPTION = 16;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANNEL_DESCRIPTION__TYPE = 0;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANNEL_DESCRIPTION__EXPRESSION = 1;

    /**
     * The number of structural features of the '<em>Channel Description</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANNEL_DESCRIPTION_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.expressions.impl.TypeIdentifierImpl <em>Type Identifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.expressions.impl.TypeIdentifierImpl
     * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getTypeIdentifier()
     * @generated
     */
    int TYPE_IDENTIFIER = 17;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_IDENTIFIER__TYPE = 0;

    /**
     * The feature id for the '<em><b>Type ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_IDENTIFIER__TYPE_ID = 1;

    /**
     * The feature id for the '<em><b>Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_IDENTIFIER__OPERATOR = 2;

    /**
     * The number of structural features of the '<em>Type Identifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_IDENTIFIER_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.expressions.impl.InterfaceVariableDeclImpl <em>Interface Variable Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.expressions.impl.InterfaceVariableDeclImpl
     * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getInterfaceVariableDecl()
     * @generated
     */
    int INTERFACE_VARIABLE_DECL = 18;

    /**
     * The feature id for the '<em><b>Var Decls</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_VARIABLE_DECL__VAR_DECLS = INTERFACE_DECLARATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Interface Variable Decl</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_VARIABLE_DECL_FEATURE_COUNT = INTERFACE_DECLARATION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.expressions.impl.VariableDeclImpl <em>Variable Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.expressions.impl.VariableDeclImpl
     * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getVariableDecl()
     * @generated
     */
    int VARIABLE_DECL = 19;

    /**
     * The feature id for the '<em><b>Variables</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_DECL__VARIABLES = 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_DECL__TYPE = 1;

    /**
     * The number of structural features of the '<em>Variable Decl</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_DECL_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.expressions.impl.IVariableImpl <em>IVariable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.expressions.impl.IVariableImpl
     * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getIVariable()
     * @generated
     */
    int IVARIABLE = 20;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IVARIABLE__ANNOTATIONS = VARIABLE__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IVARIABLE__NAME = VARIABLE__NAME;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IVARIABLE__TYPE = VARIABLE__TYPE;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IVARIABLE__INITIAL_VALUE = VARIABLE__INITIAL_VALUE;

    /**
     * The feature id for the '<em><b>Host Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IVARIABLE__HOST_TYPE = VARIABLE__HOST_TYPE;

    /**
     * The feature id for the '<em><b>Const</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IVARIABLE__CONST = VARIABLE__CONST;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IVARIABLE__EXPRESSION = VARIABLE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>IVariable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IVARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.expressions.impl.InputImpl <em>Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.expressions.impl.InputImpl
     * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getInput()
     * @generated
     */
    int INPUT = 21;

    /**
     * The feature id for the '<em><b>Signals</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT__SIGNALS = INTERFACE_SIGNAL_DECL__SIGNALS;

    /**
     * The number of structural features of the '<em>Input</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_FEATURE_COUNT = INTERFACE_SIGNAL_DECL_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.expressions.impl.OutputImpl <em>Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.expressions.impl.OutputImpl
     * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getOutput()
     * @generated
     */
    int OUTPUT = 22;

    /**
     * The feature id for the '<em><b>Signals</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT__SIGNALS = INTERFACE_SIGNAL_DECL__SIGNALS;

    /**
     * The number of structural features of the '<em>Output</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_FEATURE_COUNT = INTERFACE_SIGNAL_DECL_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.expressions.impl.InputOutputImpl <em>Input Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.expressions.impl.InputOutputImpl
     * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getInputOutput()
     * @generated
     */
    int INPUT_OUTPUT = 23;

    /**
     * The feature id for the '<em><b>Signals</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_OUTPUT__SIGNALS = INTERFACE_SIGNAL_DECL__SIGNALS;

    /**
     * The number of structural features of the '<em>Input Output</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_OUTPUT_FEATURE_COUNT = INTERFACE_SIGNAL_DECL_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.expressions.impl.ReturnImpl <em>Return</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.expressions.impl.ReturnImpl
     * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getReturn()
     * @generated
     */
    int RETURN = 24;

    /**
     * The feature id for the '<em><b>Signals</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RETURN__SIGNALS = INTERFACE_SIGNAL_DECL__SIGNALS;

    /**
     * The number of structural features of the '<em>Return</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RETURN_FEATURE_COUNT = INTERFACE_SIGNAL_DECL_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.expressions.CombineOperator <em>Combine Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.expressions.CombineOperator
     * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getCombineOperator()
     * @generated
     */
    int COMBINE_OPERATOR = 25;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.expressions.OperatorType <em>Operator Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.expressions.OperatorType
     * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getOperatorType()
     * @generated
     */
    int OPERATOR_TYPE = 26;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.expressions.ValueType <em>Value Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.expressions.ValueType
     * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getValueType()
     * @generated
     */
    int VALUE_TYPE = 27;


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
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.expressions.ValuedObjectReference <em>Valued Object Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Valued Object Reference</em>'.
     * @see de.cau.cs.kieler.core.expressions.ValuedObjectReference
     * @generated
     */
    EClass getValuedObjectReference();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.core.expressions.ValuedObjectReference#getValuedObject <em>Valued Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Valued Object</em>'.
     * @see de.cau.cs.kieler.core.expressions.ValuedObjectReference#getValuedObject()
     * @see #getValuedObjectReference()
     * @generated
     */
    EReference getValuedObjectReference_ValuedObject();

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
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.expressions.InterfaceDeclaration <em>Interface Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interface Declaration</em>'.
     * @see de.cau.cs.kieler.core.expressions.InterfaceDeclaration
     * @generated
     */
    EClass getInterfaceDeclaration();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.expressions.InterfaceSignalDecl <em>Interface Signal Decl</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interface Signal Decl</em>'.
     * @see de.cau.cs.kieler.core.expressions.InterfaceSignalDecl
     * @generated
     */
    EClass getInterfaceSignalDecl();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.core.expressions.InterfaceSignalDecl#getSignals <em>Signals</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Signals</em>'.
     * @see de.cau.cs.kieler.core.expressions.InterfaceSignalDecl#getSignals()
     * @see #getInterfaceSignalDecl()
     * @generated
     */
    EReference getInterfaceSignalDecl_Signals();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.expressions.ISignal <em>ISignal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>ISignal</em>'.
     * @see de.cau.cs.kieler.core.expressions.ISignal
     * @generated
     */
    EClass getISignal();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.core.expressions.ISignal#getChannelDescr <em>Channel Descr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Channel Descr</em>'.
     * @see de.cau.cs.kieler.core.expressions.ISignal#getChannelDescr()
     * @see #getISignal()
     * @generated
     */
    EReference getISignal_ChannelDescr();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.expressions.ChannelDescription <em>Channel Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Channel Description</em>'.
     * @see de.cau.cs.kieler.core.expressions.ChannelDescription
     * @generated
     */
    EClass getChannelDescription();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.core.expressions.ChannelDescription#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Type</em>'.
     * @see de.cau.cs.kieler.core.expressions.ChannelDescription#getType()
     * @see #getChannelDescription()
     * @generated
     */
    EReference getChannelDescription_Type();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.core.expressions.ChannelDescription#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Expression</em>'.
     * @see de.cau.cs.kieler.core.expressions.ChannelDescription#getExpression()
     * @see #getChannelDescription()
     * @generated
     */
    EReference getChannelDescription_Expression();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.expressions.TypeIdentifier <em>Type Identifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Type Identifier</em>'.
     * @see de.cau.cs.kieler.core.expressions.TypeIdentifier
     * @generated
     */
    EClass getTypeIdentifier();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.core.expressions.TypeIdentifier#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see de.cau.cs.kieler.core.expressions.TypeIdentifier#getType()
     * @see #getTypeIdentifier()
     * @generated
     */
    EAttribute getTypeIdentifier_Type();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.core.expressions.TypeIdentifier#getTypeID <em>Type ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type ID</em>'.
     * @see de.cau.cs.kieler.core.expressions.TypeIdentifier#getTypeID()
     * @see #getTypeIdentifier()
     * @generated
     */
    EAttribute getTypeIdentifier_TypeID();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.core.expressions.TypeIdentifier#getOperator <em>Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Operator</em>'.
     * @see de.cau.cs.kieler.core.expressions.TypeIdentifier#getOperator()
     * @see #getTypeIdentifier()
     * @generated
     */
    EAttribute getTypeIdentifier_Operator();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.expressions.InterfaceVariableDecl <em>Interface Variable Decl</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interface Variable Decl</em>'.
     * @see de.cau.cs.kieler.core.expressions.InterfaceVariableDecl
     * @generated
     */
    EClass getInterfaceVariableDecl();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.core.expressions.InterfaceVariableDecl#getVarDecls <em>Var Decls</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Var Decls</em>'.
     * @see de.cau.cs.kieler.core.expressions.InterfaceVariableDecl#getVarDecls()
     * @see #getInterfaceVariableDecl()
     * @generated
     */
    EReference getInterfaceVariableDecl_VarDecls();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.expressions.VariableDecl <em>Variable Decl</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Variable Decl</em>'.
     * @see de.cau.cs.kieler.core.expressions.VariableDecl
     * @generated
     */
    EClass getVariableDecl();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.core.expressions.VariableDecl#getVariables <em>Variables</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Variables</em>'.
     * @see de.cau.cs.kieler.core.expressions.VariableDecl#getVariables()
     * @see #getVariableDecl()
     * @generated
     */
    EReference getVariableDecl_Variables();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.core.expressions.VariableDecl#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Type</em>'.
     * @see de.cau.cs.kieler.core.expressions.VariableDecl#getType()
     * @see #getVariableDecl()
     * @generated
     */
    EReference getVariableDecl_Type();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.expressions.IVariable <em>IVariable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>IVariable</em>'.
     * @see de.cau.cs.kieler.core.expressions.IVariable
     * @generated
     */
    EClass getIVariable();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.core.expressions.IVariable#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Expression</em>'.
     * @see de.cau.cs.kieler.core.expressions.IVariable#getExpression()
     * @see #getIVariable()
     * @generated
     */
    EReference getIVariable_Expression();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.expressions.Input <em>Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Input</em>'.
     * @see de.cau.cs.kieler.core.expressions.Input
     * @generated
     */
    EClass getInput();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.expressions.Output <em>Output</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Output</em>'.
     * @see de.cau.cs.kieler.core.expressions.Output
     * @generated
     */
    EClass getOutput();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.expressions.InputOutput <em>Input Output</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Input Output</em>'.
     * @see de.cau.cs.kieler.core.expressions.InputOutput
     * @generated
     */
    EClass getInputOutput();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.expressions.Return <em>Return</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Return</em>'.
     * @see de.cau.cs.kieler.core.expressions.Return
     * @generated
     */
    EClass getReturn();

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
         * The meta object literal for the '<em><b>Const</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VARIABLE__CONST = eINSTANCE.getVariable_Const();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.expressions.impl.ValuedObjectReferenceImpl <em>Valued Object Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.expressions.impl.ValuedObjectReferenceImpl
         * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getValuedObjectReference()
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
         * The meta object literal for the '{@link de.cau.cs.kieler.core.expressions.impl.InterfaceDeclarationImpl <em>Interface Declaration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.expressions.impl.InterfaceDeclarationImpl
         * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getInterfaceDeclaration()
         * @generated
         */
        EClass INTERFACE_DECLARATION = eINSTANCE.getInterfaceDeclaration();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.expressions.impl.InterfaceSignalDeclImpl <em>Interface Signal Decl</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.expressions.impl.InterfaceSignalDeclImpl
         * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getInterfaceSignalDecl()
         * @generated
         */
        EClass INTERFACE_SIGNAL_DECL = eINSTANCE.getInterfaceSignalDecl();

        /**
         * The meta object literal for the '<em><b>Signals</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERFACE_SIGNAL_DECL__SIGNALS = eINSTANCE.getInterfaceSignalDecl_Signals();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.expressions.impl.ISignalImpl <em>ISignal</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.expressions.impl.ISignalImpl
         * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getISignal()
         * @generated
         */
        EClass ISIGNAL = eINSTANCE.getISignal();

        /**
         * The meta object literal for the '<em><b>Channel Descr</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ISIGNAL__CHANNEL_DESCR = eINSTANCE.getISignal_ChannelDescr();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.expressions.impl.ChannelDescriptionImpl <em>Channel Description</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.expressions.impl.ChannelDescriptionImpl
         * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getChannelDescription()
         * @generated
         */
        EClass CHANNEL_DESCRIPTION = eINSTANCE.getChannelDescription();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CHANNEL_DESCRIPTION__TYPE = eINSTANCE.getChannelDescription_Type();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CHANNEL_DESCRIPTION__EXPRESSION = eINSTANCE.getChannelDescription_Expression();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.expressions.impl.TypeIdentifierImpl <em>Type Identifier</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.expressions.impl.TypeIdentifierImpl
         * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getTypeIdentifier()
         * @generated
         */
        EClass TYPE_IDENTIFIER = eINSTANCE.getTypeIdentifier();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TYPE_IDENTIFIER__TYPE = eINSTANCE.getTypeIdentifier_Type();

        /**
         * The meta object literal for the '<em><b>Type ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TYPE_IDENTIFIER__TYPE_ID = eINSTANCE.getTypeIdentifier_TypeID();

        /**
         * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TYPE_IDENTIFIER__OPERATOR = eINSTANCE.getTypeIdentifier_Operator();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.expressions.impl.InterfaceVariableDeclImpl <em>Interface Variable Decl</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.expressions.impl.InterfaceVariableDeclImpl
         * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getInterfaceVariableDecl()
         * @generated
         */
        EClass INTERFACE_VARIABLE_DECL = eINSTANCE.getInterfaceVariableDecl();

        /**
         * The meta object literal for the '<em><b>Var Decls</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERFACE_VARIABLE_DECL__VAR_DECLS = eINSTANCE.getInterfaceVariableDecl_VarDecls();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.expressions.impl.VariableDeclImpl <em>Variable Decl</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.expressions.impl.VariableDeclImpl
         * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getVariableDecl()
         * @generated
         */
        EClass VARIABLE_DECL = eINSTANCE.getVariableDecl();

        /**
         * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VARIABLE_DECL__VARIABLES = eINSTANCE.getVariableDecl_Variables();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VARIABLE_DECL__TYPE = eINSTANCE.getVariableDecl_Type();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.expressions.impl.IVariableImpl <em>IVariable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.expressions.impl.IVariableImpl
         * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getIVariable()
         * @generated
         */
        EClass IVARIABLE = eINSTANCE.getIVariable();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IVARIABLE__EXPRESSION = eINSTANCE.getIVariable_Expression();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.expressions.impl.InputImpl <em>Input</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.expressions.impl.InputImpl
         * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getInput()
         * @generated
         */
        EClass INPUT = eINSTANCE.getInput();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.expressions.impl.OutputImpl <em>Output</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.expressions.impl.OutputImpl
         * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getOutput()
         * @generated
         */
        EClass OUTPUT = eINSTANCE.getOutput();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.expressions.impl.InputOutputImpl <em>Input Output</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.expressions.impl.InputOutputImpl
         * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getInputOutput()
         * @generated
         */
        EClass INPUT_OUTPUT = eINSTANCE.getInputOutput();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.expressions.impl.ReturnImpl <em>Return</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.expressions.impl.ReturnImpl
         * @see de.cau.cs.kieler.core.expressions.impl.ExpressionsPackageImpl#getReturn()
         * @generated
         */
        EClass RETURN = eINSTANCE.getReturn();

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
