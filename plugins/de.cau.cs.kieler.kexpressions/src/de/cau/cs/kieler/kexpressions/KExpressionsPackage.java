/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.kexpressions;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.cau.cs.kieler.annotations.AnnotationsPackage;

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
 * @see de.cau.cs.kieler.kexpressions.KExpressionsFactory
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
    KExpressionsPackage eINSTANCE = de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl.init();

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.Schedulable <em>Schedulable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.Schedulable
     * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getSchedulable()
     * @generated
     */
    int SCHEDULABLE = 21;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULABLE__SCHEDULE = 0;

    /**
     * The number of structural features of the '<em>Schedulable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULABLE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.Expression <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.Expression
     * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getExpression()
     * @generated
     */
    int EXPRESSION = 0;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION__SCHEDULE = SCHEDULABLE__SCHEDULE;

    /**
     * The number of structural features of the '<em>Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_FEATURE_COUNT = SCHEDULABLE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.impl.ValuedObjectImpl <em>Valued Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.impl.ValuedObjectImpl
     * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getValuedObject()
     * @generated
     */
    int VALUED_OBJECT = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUED_OBJECT__NAME = AnnotationsPackage.NAMED_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUED_OBJECT__ANNOTATIONS = AnnotationsPackage.NAMED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Combine Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUED_OBJECT__COMBINE_OPERATOR = AnnotationsPackage.NAMED_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUED_OBJECT__INITIAL_VALUE = AnnotationsPackage.NAMED_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Cardinalities</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VALUED_OBJECT__CARDINALITIES = AnnotationsPackage.NAMED_OBJECT_FEATURE_COUNT + 3;

				/**
     * The number of structural features of the '<em>Valued Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUED_OBJECT_FEATURE_COUNT = AnnotationsPackage.NAMED_OBJECT_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.impl.ValuedObjectReferenceImpl <em>Valued Object Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.impl.ValuedObjectReferenceImpl
     * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getValuedObjectReference()
     * @generated
     */
    int VALUED_OBJECT_REFERENCE = 2;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUED_OBJECT_REFERENCE__SCHEDULE = EXPRESSION__SCHEDULE;

    /**
     * The feature id for the '<em><b>Valued Object</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUED_OBJECT_REFERENCE__VALUED_OBJECT = EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Indices</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUED_OBJECT_REFERENCE__INDICES = EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Sub Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUED_OBJECT_REFERENCE__SUB_REFERENCE = EXPRESSION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Valued Object Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUED_OBJECT_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.Value <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.Value
     * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getValue()
     * @generated
     */
    int VALUE = 3;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE__SCHEDULE = EXPRESSION__SCHEDULE;

    /**
     * The number of structural features of the '<em>Value</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.impl.IntValueImpl <em>Int Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.impl.IntValueImpl
     * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getIntValue()
     * @generated
     */
    int INT_VALUE = 4;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT_VALUE__SCHEDULE = VALUE__SCHEDULE;

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
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.impl.FloatValueImpl <em>Float Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.impl.FloatValueImpl
     * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getFloatValue()
     * @generated
     */
    int FLOAT_VALUE = 5;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT_VALUE__SCHEDULE = VALUE__SCHEDULE;

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
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.impl.BoolValueImpl <em>Bool Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.impl.BoolValueImpl
     * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getBoolValue()
     * @generated
     */
    int BOOL_VALUE = 6;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOL_VALUE__SCHEDULE = VALUE__SCHEDULE;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOL_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Bool Value</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOL_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.impl.OperatorExpressionImpl <em>Operator Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.impl.OperatorExpressionImpl
     * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getOperatorExpression()
     * @generated
     */
    int OPERATOR_EXPRESSION = 8;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.impl.TextExpressionImpl <em>Text Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.impl.TextExpressionImpl
     * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getTextExpression()
     * @generated
     */
    int TEXT_EXPRESSION = 9;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.impl.DeclarationImpl <em>Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.impl.DeclarationImpl
     * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getDeclaration()
     * @generated
     */
    int DECLARATION = 10;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.impl.VariableDeclarationImpl
     * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getVariableDeclaration()
     * @generated
     */
    int VARIABLE_DECLARATION = 11;

                /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.impl.ReferenceDeclarationImpl <em>Reference Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.impl.ReferenceDeclarationImpl
     * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getReferenceDeclaration()
     * @generated
     */
    int REFERENCE_DECLARATION = 12;

                /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.impl.FunctionCallImpl <em>Function Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.impl.FunctionCallImpl
     * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getFunctionCall()
     * @generated
     */
    int FUNCTION_CALL = 19;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.Referenceable <em>Referenceable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.Referenceable
     * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getReferenceable()
     * @generated
     */
    int REFERENCEABLE = 20;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.impl.ParameterImpl
     * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getParameter()
     * @generated
     */
    int PARAMETER = 16;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.impl.StringValueImpl <em>String Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.impl.StringValueImpl
     * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getStringValue()
     * @generated
     */
    int STRING_VALUE = 7;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_VALUE__SCHEDULE = VALUE__SCHEDULE;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>String Value</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATOR_EXPRESSION__SCHEDULE = EXPRESSION__SCHEDULE;

    /**
     * The feature id for the '<em><b>Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATOR_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Sub Expressions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATOR_EXPRESSION__SUB_EXPRESSIONS = EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Operator Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATOR_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_EXPRESSION__SCHEDULE = EXPRESSION__SCHEDULE;

    /**
     * The feature id for the '<em><b>Text</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_EXPRESSION__TEXT = EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Text Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECLARATION__ANNOTATIONS = AnnotationsPackage.ANNOTATABLE__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Valued Objects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECLARATION__VALUED_OBJECTS = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECLARATION_FEATURE_COUNT = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
   int VARIABLE_DECLARATION__ANNOTATIONS = DECLARATION__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Valued Objects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
   int VARIABLE_DECLARATION__VALUED_OBJECTS = DECLARATION__VALUED_OBJECTS;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
   int VARIABLE_DECLARATION__TYPE = DECLARATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Input</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
   int VARIABLE_DECLARATION__INPUT = DECLARATION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Output</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
   int VARIABLE_DECLARATION__OUTPUT = DECLARATION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
   int VARIABLE_DECLARATION__STATIC = DECLARATION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Signal</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
   int VARIABLE_DECLARATION__SIGNAL = DECLARATION_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Const</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
   int VARIABLE_DECLARATION__CONST = DECLARATION_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Extern</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
   int VARIABLE_DECLARATION__EXTERN = DECLARATION_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Volatile</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
   int VARIABLE_DECLARATION__VOLATILE = DECLARATION_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Host Type</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
   int VARIABLE_DECLARATION__HOST_TYPE = DECLARATION_FEATURE_COUNT + 8;

    /**
     * The number of structural features of the '<em>Variable Declaration</em>' class.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
   int VARIABLE_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
   int REFERENCE_DECLARATION__ANNOTATIONS = DECLARATION__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Valued Objects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
   int REFERENCE_DECLARATION__VALUED_OBJECTS = DECLARATION__VALUED_OBJECTS;

    /**
     * The feature id for the '<em><b>Reference</b></em>' reference.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
   int REFERENCE_DECLARATION__REFERENCE = DECLARATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Extern</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
   int REFERENCE_DECLARATION__EXTERN = DECLARATION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
   int REFERENCE_DECLARATION__PARAMETERS = DECLARATION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Reference Declaration</em>' class.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
   int REFERENCE_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.impl.ScheduleDeclarationImpl <em>Schedule Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.impl.ScheduleDeclarationImpl
     * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getScheduleDeclaration()
     * @generated
     */
    int SCHEDULE_DECLARATION = 13;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULE_DECLARATION__ANNOTATIONS = DECLARATION__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Valued Objects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULE_DECLARATION__VALUED_OBJECTS = DECLARATION__VALUED_OBJECTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULE_DECLARATION__NAME = DECLARATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Priorities</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULE_DECLARATION__PRIORITIES = DECLARATION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Global</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULE_DECLARATION__GLOBAL = DECLARATION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Schedule Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULE_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.impl.SchedulePriorityImpl <em>Schedule Priority</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.impl.SchedulePriorityImpl
     * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getSchedulePriority()
     * @generated
     */
    int SCHEDULE_PRIORITY = 14;

    /**
     * The feature id for the '<em><b>Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULE_PRIORITY__PRIORITY = 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULE_PRIORITY__TYPE = 1;

    /**
     * The number of structural features of the '<em>Schedule Priority</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULE_PRIORITY_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.impl.ScheduleObjectReferenceImpl <em>Schedule Object Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.impl.ScheduleObjectReferenceImpl
     * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getScheduleObjectReference()
     * @generated
     */
    int SCHEDULE_OBJECT_REFERENCE = 15;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULE_OBJECT_REFERENCE__SCHEDULE = VALUED_OBJECT_REFERENCE__SCHEDULE;

    /**
     * The feature id for the '<em><b>Valued Object</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULE_OBJECT_REFERENCE__VALUED_OBJECT = VALUED_OBJECT_REFERENCE__VALUED_OBJECT;

    /**
     * The feature id for the '<em><b>Indices</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULE_OBJECT_REFERENCE__INDICES = VALUED_OBJECT_REFERENCE__INDICES;

    /**
     * The feature id for the '<em><b>Sub Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULE_OBJECT_REFERENCE__SUB_REFERENCE = VALUED_OBJECT_REFERENCE__SUB_REFERENCE;

    /**
     * The feature id for the '<em><b>Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULE_OBJECT_REFERENCE__PRIORITY = VALUED_OBJECT_REFERENCE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Schedule Object Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULE_OBJECT_REFERENCE_FEATURE_COUNT = VALUED_OBJECT_REFERENCE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Call By Reference</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__CALL_BY_REFERENCE = 0;

    /**
     * The feature id for the '<em><b>Pure Output</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__PURE_OUTPUT = 1;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__EXPRESSION = 2;

    /**
     * The feature id for the '<em><b>Explicit Binding</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__EXPLICIT_BINDING = 3;

    /**
     * The feature id for the '<em><b>Explicit Binding Indices</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__EXPLICIT_BINDING_INDICES = 4;

    /**
     * The number of structural features of the '<em>Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_FEATURE_COUNT = 5;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.Call <em>Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.Call
     * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getCall()
     * @generated
     */
    int CALL = 17;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL__SCHEDULE = EXPRESSION__SCHEDULE;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL__PARAMETERS = EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Call</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.impl.ReferenceCallImpl <em>Reference Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.impl.ReferenceCallImpl
     * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getReferenceCall()
     * @generated
     */
    int REFERENCE_CALL = 18;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_CALL__SCHEDULE = VALUED_OBJECT_REFERENCE__SCHEDULE;

    /**
     * The feature id for the '<em><b>Valued Object</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_CALL__VALUED_OBJECT = VALUED_OBJECT_REFERENCE__VALUED_OBJECT;

    /**
     * The feature id for the '<em><b>Indices</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_CALL__INDICES = VALUED_OBJECT_REFERENCE__INDICES;

    /**
     * The feature id for the '<em><b>Sub Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_CALL__SUB_REFERENCE = VALUED_OBJECT_REFERENCE__SUB_REFERENCE;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_CALL__PARAMETERS = VALUED_OBJECT_REFERENCE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Reference Call</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_CALL_FEATURE_COUNT = VALUED_OBJECT_REFERENCE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CALL__SCHEDULE = CALL__SCHEDULE;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CALL__PARAMETERS = CALL__PARAMETERS;

    /**
     * The feature id for the '<em><b>Function Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CALL__FUNCTION_NAME = CALL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Function Call</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CALL_FEATURE_COUNT = CALL_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Referenceable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCEABLE_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.CombineOperator <em>Combine Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.CombineOperator
     * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getCombineOperator()
     * @generated
     */
    int COMBINE_OPERATOR = 22;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.OperatorType <em>Operator Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.OperatorType
     * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getOperatorType()
     * @generated
     */
    int OPERATOR_TYPE = 23;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.ValueType <em>Value Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.ValueType
     * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getValueType()
     * @generated
     */
    int VALUE_TYPE = 24;


    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kexpressions.SchedulePriorityType <em>Schedule Priority Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kexpressions.SchedulePriorityType
     * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getSchedulePriorityType()
     * @generated
     */
    int SCHEDULE_PRIORITY_TYPE = 25;


    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.Expression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Expression</em>'.
     * @see de.cau.cs.kieler.kexpressions.Expression
     * @generated
     */
    EClass getExpression();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.ValuedObject <em>Valued Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Valued Object</em>'.
     * @see de.cau.cs.kieler.kexpressions.ValuedObject
     * @generated
     */
    EClass getValuedObject();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kexpressions.ValuedObject#getInitialValue <em>Initial Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Initial Value</em>'.
     * @see de.cau.cs.kieler.kexpressions.ValuedObject#getInitialValue()
     * @see #getValuedObject()
     * @generated
     */
    EReference getValuedObject_InitialValue();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.kexpressions.ValuedObject#getCardinalities <em>Cardinalities</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Cardinalities</em>'.
     * @see de.cau.cs.kieler.kexpressions.ValuedObject#getCardinalities()
     * @see #getValuedObject()
     * @generated
     */
	EReference getValuedObject_Cardinalities();

				/**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kexpressions.ValuedObject#getCombineOperator <em>Combine Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Combine Operator</em>'.
     * @see de.cau.cs.kieler.kexpressions.ValuedObject#getCombineOperator()
     * @see #getValuedObject()
     * @generated
     */
    EAttribute getValuedObject_CombineOperator();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.ValuedObjectReference <em>Valued Object Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Valued Object Reference</em>'.
     * @see de.cau.cs.kieler.kexpressions.ValuedObjectReference
     * @generated
     */
    EClass getValuedObjectReference();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.kexpressions.ValuedObjectReference#getValuedObject <em>Valued Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Valued Object</em>'.
     * @see de.cau.cs.kieler.kexpressions.ValuedObjectReference#getValuedObject()
     * @see #getValuedObjectReference()
     * @generated
     */
    EReference getValuedObjectReference_ValuedObject();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.kexpressions.ValuedObjectReference#getIndices <em>Indices</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Indices</em>'.
     * @see de.cau.cs.kieler.kexpressions.ValuedObjectReference#getIndices()
     * @see #getValuedObjectReference()
     * @generated
     */
    EReference getValuedObjectReference_Indices();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kexpressions.ValuedObjectReference#getSubReference <em>Sub Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Sub Reference</em>'.
     * @see de.cau.cs.kieler.kexpressions.ValuedObjectReference#getSubReference()
     * @see #getValuedObjectReference()
     * @generated
     */
    EReference getValuedObjectReference_SubReference();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.Value <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Value</em>'.
     * @see de.cau.cs.kieler.kexpressions.Value
     * @generated
     */
    EClass getValue();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.IntValue <em>Int Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Int Value</em>'.
     * @see de.cau.cs.kieler.kexpressions.IntValue
     * @generated
     */
    EClass getIntValue();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kexpressions.IntValue#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see de.cau.cs.kieler.kexpressions.IntValue#getValue()
     * @see #getIntValue()
     * @generated
     */
    EAttribute getIntValue_Value();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.FloatValue <em>Float Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Float Value</em>'.
     * @see de.cau.cs.kieler.kexpressions.FloatValue
     * @generated
     */
    EClass getFloatValue();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kexpressions.FloatValue#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see de.cau.cs.kieler.kexpressions.FloatValue#getValue()
     * @see #getFloatValue()
     * @generated
     */
    EAttribute getFloatValue_Value();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.BoolValue <em>Bool Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Bool Value</em>'.
     * @see de.cau.cs.kieler.kexpressions.BoolValue
     * @generated
     */
    EClass getBoolValue();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kexpressions.BoolValue#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see de.cau.cs.kieler.kexpressions.BoolValue#getValue()
     * @see #getBoolValue()
     * @generated
     */
    EAttribute getBoolValue_Value();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.OperatorExpression <em>Operator Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Operator Expression</em>'.
     * @see de.cau.cs.kieler.kexpressions.OperatorExpression
     * @generated
     */
    EClass getOperatorExpression();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kexpressions.OperatorExpression#getOperator <em>Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Operator</em>'.
     * @see de.cau.cs.kieler.kexpressions.OperatorExpression#getOperator()
     * @see #getOperatorExpression()
     * @generated
     */
    EAttribute getOperatorExpression_Operator();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.kexpressions.OperatorExpression#getSubExpressions <em>Sub Expressions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sub Expressions</em>'.
     * @see de.cau.cs.kieler.kexpressions.OperatorExpression#getSubExpressions()
     * @see #getOperatorExpression()
     * @generated
     */
    EReference getOperatorExpression_SubExpressions();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.TextExpression <em>Text Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Text Expression</em>'.
     * @see de.cau.cs.kieler.kexpressions.TextExpression
     * @generated
     */
    EClass getTextExpression();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kexpressions.TextExpression#getText <em>Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Text</em>'.
     * @see de.cau.cs.kieler.kexpressions.TextExpression#getText()
     * @see #getTextExpression()
     * @generated
     */
    EAttribute getTextExpression_Text();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.Declaration <em>Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Declaration</em>'.
     * @see de.cau.cs.kieler.kexpressions.Declaration
     * @generated
     */
    EClass getDeclaration();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.kexpressions.Declaration#getValuedObjects <em>Valued Objects</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Valued Objects</em>'.
     * @see de.cau.cs.kieler.kexpressions.Declaration#getValuedObjects()
     * @see #getDeclaration()
     * @generated
     */
    EReference getDeclaration_ValuedObjects();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.VariableDeclaration <em>Variable Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Variable Declaration</em>'.
     * @see de.cau.cs.kieler.kexpressions.VariableDeclaration
     * @generated
     */
    EClass getVariableDeclaration();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kexpressions.VariableDeclaration#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see de.cau.cs.kieler.kexpressions.VariableDeclaration#getType()
     * @see #getVariableDeclaration()
     * @generated
     */
    EAttribute getVariableDeclaration_Type();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kexpressions.VariableDeclaration#isInput <em>Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Input</em>'.
     * @see de.cau.cs.kieler.kexpressions.VariableDeclaration#isInput()
     * @see #getVariableDeclaration()
     * @generated
     */
    EAttribute getVariableDeclaration_Input();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kexpressions.VariableDeclaration#isOutput <em>Output</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Output</em>'.
     * @see de.cau.cs.kieler.kexpressions.VariableDeclaration#isOutput()
     * @see #getVariableDeclaration()
     * @generated
     */
    EAttribute getVariableDeclaration_Output();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kexpressions.VariableDeclaration#isStatic <em>Static</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Static</em>'.
     * @see de.cau.cs.kieler.kexpressions.VariableDeclaration#isStatic()
     * @see #getVariableDeclaration()
     * @generated
     */
    EAttribute getVariableDeclaration_Static();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kexpressions.VariableDeclaration#isSignal <em>Signal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Signal</em>'.
     * @see de.cau.cs.kieler.kexpressions.VariableDeclaration#isSignal()
     * @see #getVariableDeclaration()
     * @generated
     */
    EAttribute getVariableDeclaration_Signal();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kexpressions.VariableDeclaration#isConst <em>Const</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Const</em>'.
     * @see de.cau.cs.kieler.kexpressions.VariableDeclaration#isConst()
     * @see #getVariableDeclaration()
     * @generated
     */
    EAttribute getVariableDeclaration_Const();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kexpressions.VariableDeclaration#isExtern <em>Extern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Extern</em>'.
     * @see de.cau.cs.kieler.kexpressions.VariableDeclaration#isExtern()
     * @see #getVariableDeclaration()
     * @generated
     */
    EAttribute getVariableDeclaration_Extern();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kexpressions.VariableDeclaration#isVolatile <em>Volatile</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Volatile</em>'.
     * @see de.cau.cs.kieler.kexpressions.VariableDeclaration#isVolatile()
     * @see #getVariableDeclaration()
     * @generated
     */
    EAttribute getVariableDeclaration_Volatile();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kexpressions.VariableDeclaration#getHostType <em>Host Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Host Type</em>'.
     * @see de.cau.cs.kieler.kexpressions.VariableDeclaration#getHostType()
     * @see #getVariableDeclaration()
     * @generated
     */
    EAttribute getVariableDeclaration_HostType();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.ReferenceDeclaration <em>Reference Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Reference Declaration</em>'.
     * @see de.cau.cs.kieler.kexpressions.ReferenceDeclaration
     * @generated
     */
    EClass getReferenceDeclaration();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.kexpressions.ReferenceDeclaration#getReference <em>Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Reference</em>'.
     * @see de.cau.cs.kieler.kexpressions.ReferenceDeclaration#getReference()
     * @see #getReferenceDeclaration()
     * @generated
     */
    EReference getReferenceDeclaration_Reference();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kexpressions.ReferenceDeclaration#getExtern <em>Extern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Extern</em>'.
     * @see de.cau.cs.kieler.kexpressions.ReferenceDeclaration#getExtern()
     * @see #getReferenceDeclaration()
     * @generated
     */
    EAttribute getReferenceDeclaration_Extern();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.kexpressions.ReferenceDeclaration#getParameters <em>Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Parameters</em>'.
     * @see de.cau.cs.kieler.kexpressions.ReferenceDeclaration#getParameters()
     * @see #getReferenceDeclaration()
     * @generated
     */
    EReference getReferenceDeclaration_Parameters();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.ScheduleDeclaration <em>Schedule Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Schedule Declaration</em>'.
     * @see de.cau.cs.kieler.kexpressions.ScheduleDeclaration
     * @generated
     */
    EClass getScheduleDeclaration();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kexpressions.ScheduleDeclaration#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see de.cau.cs.kieler.kexpressions.ScheduleDeclaration#getName()
     * @see #getScheduleDeclaration()
     * @generated
     */
    EAttribute getScheduleDeclaration_Name();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.kexpressions.ScheduleDeclaration#getPriorities <em>Priorities</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Priorities</em>'.
     * @see de.cau.cs.kieler.kexpressions.ScheduleDeclaration#getPriorities()
     * @see #getScheduleDeclaration()
     * @generated
     */
    EReference getScheduleDeclaration_Priorities();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kexpressions.ScheduleDeclaration#getGlobal <em>Global</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Global</em>'.
     * @see de.cau.cs.kieler.kexpressions.ScheduleDeclaration#getGlobal()
     * @see #getScheduleDeclaration()
     * @generated
     */
    EAttribute getScheduleDeclaration_Global();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.SchedulePriority <em>Schedule Priority</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Schedule Priority</em>'.
     * @see de.cau.cs.kieler.kexpressions.SchedulePriority
     * @generated
     */
    EClass getSchedulePriority();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kexpressions.SchedulePriority#getPriority <em>Priority</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Priority</em>'.
     * @see de.cau.cs.kieler.kexpressions.SchedulePriority#getPriority()
     * @see #getSchedulePriority()
     * @generated
     */
    EAttribute getSchedulePriority_Priority();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kexpressions.SchedulePriority#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see de.cau.cs.kieler.kexpressions.SchedulePriority#getType()
     * @see #getSchedulePriority()
     * @generated
     */
    EAttribute getSchedulePriority_Type();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.ScheduleObjectReference <em>Schedule Object Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Schedule Object Reference</em>'.
     * @see de.cau.cs.kieler.kexpressions.ScheduleObjectReference
     * @generated
     */
    EClass getScheduleObjectReference();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kexpressions.ScheduleObjectReference#getPriority <em>Priority</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Priority</em>'.
     * @see de.cau.cs.kieler.kexpressions.ScheduleObjectReference#getPriority()
     * @see #getScheduleObjectReference()
     * @generated
     */
    EAttribute getScheduleObjectReference_Priority();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.FunctionCall <em>Function Call</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Function Call</em>'.
     * @see de.cau.cs.kieler.kexpressions.FunctionCall
     * @generated
     */
    EClass getFunctionCall();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kexpressions.FunctionCall#getFunctionName <em>Function Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Function Name</em>'.
     * @see de.cau.cs.kieler.kexpressions.FunctionCall#getFunctionName()
     * @see #getFunctionCall()
     * @generated
     */
    EAttribute getFunctionCall_FunctionName();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.Referenceable <em>Referenceable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Referenceable</em>'.
     * @see de.cau.cs.kieler.kexpressions.Referenceable
     * @generated
     */
    EClass getReferenceable();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.Schedulable <em>Schedulable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Schedulable</em>'.
     * @see de.cau.cs.kieler.kexpressions.Schedulable
     * @generated
     */
    EClass getSchedulable();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.kexpressions.Schedulable#getSchedule <em>Schedule</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Schedule</em>'.
     * @see de.cau.cs.kieler.kexpressions.Schedulable#getSchedule()
     * @see #getSchedulable()
     * @generated
     */
    EReference getSchedulable_Schedule();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.Parameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Parameter</em>'.
     * @see de.cau.cs.kieler.kexpressions.Parameter
     * @generated
     */
    EClass getParameter();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kexpressions.Parameter#isCallByReference <em>Call By Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Call By Reference</em>'.
     * @see de.cau.cs.kieler.kexpressions.Parameter#isCallByReference()
     * @see #getParameter()
     * @generated
     */
    EAttribute getParameter_CallByReference();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kexpressions.Parameter#isPureOutput <em>Pure Output</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pure Output</em>'.
     * @see de.cau.cs.kieler.kexpressions.Parameter#isPureOutput()
     * @see #getParameter()
     * @generated
     */
    EAttribute getParameter_PureOutput();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.kexpressions.Parameter#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Expression</em>'.
     * @see de.cau.cs.kieler.kexpressions.Parameter#getExpression()
     * @see #getParameter()
     * @generated
     */
    EReference getParameter_Expression();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.kexpressions.Parameter#getExplicitBinding <em>Explicit Binding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Explicit Binding</em>'.
     * @see de.cau.cs.kieler.kexpressions.Parameter#getExplicitBinding()
     * @see #getParameter()
     * @generated
     */
    EReference getParameter_ExplicitBinding();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.kexpressions.Parameter#getExplicitBindingIndices <em>Explicit Binding Indices</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Explicit Binding Indices</em>'.
     * @see de.cau.cs.kieler.kexpressions.Parameter#getExplicitBindingIndices()
     * @see #getParameter()
     * @generated
     */
    EReference getParameter_ExplicitBindingIndices();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.StringValue <em>String Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>String Value</em>'.
     * @see de.cau.cs.kieler.kexpressions.StringValue
     * @generated
     */
    EClass getStringValue();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kexpressions.StringValue#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see de.cau.cs.kieler.kexpressions.StringValue#getValue()
     * @see #getStringValue()
     * @generated
     */
    EAttribute getStringValue_Value();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.Call <em>Call</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Call</em>'.
     * @see de.cau.cs.kieler.kexpressions.Call
     * @generated
     */
    EClass getCall();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.kexpressions.Call#getParameters <em>Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Parameters</em>'.
     * @see de.cau.cs.kieler.kexpressions.Call#getParameters()
     * @see #getCall()
     * @generated
     */
    EReference getCall_Parameters();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kexpressions.ReferenceCall <em>Reference Call</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Reference Call</em>'.
     * @see de.cau.cs.kieler.kexpressions.ReferenceCall
     * @generated
     */
    EClass getReferenceCall();

    /**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.kexpressions.CombineOperator <em>Combine Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Combine Operator</em>'.
     * @see de.cau.cs.kieler.kexpressions.CombineOperator
     * @generated
     */
    EEnum getCombineOperator();

    /**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.kexpressions.OperatorType <em>Operator Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Operator Type</em>'.
     * @see de.cau.cs.kieler.kexpressions.OperatorType
     * @generated
     */
    EEnum getOperatorType();

    /**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.kexpressions.ValueType <em>Value Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Value Type</em>'.
     * @see de.cau.cs.kieler.kexpressions.ValueType
     * @generated
     */
    EEnum getValueType();

    /**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.kexpressions.SchedulePriorityType <em>Schedule Priority Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Schedule Priority Type</em>'.
     * @see de.cau.cs.kieler.kexpressions.SchedulePriorityType
     * @generated
     */
    EEnum getSchedulePriorityType();

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
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.Expression <em>Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.Expression
         * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getExpression()
         * @generated
         */
        EClass EXPRESSION = eINSTANCE.getExpression();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.impl.ValuedObjectImpl <em>Valued Object</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.impl.ValuedObjectImpl
         * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getValuedObject()
         * @generated
         */
        EClass VALUED_OBJECT = eINSTANCE.getValuedObject();

        /**
         * The meta object literal for the '<em><b>Initial Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUED_OBJECT__INITIAL_VALUE = eINSTANCE.getValuedObject_InitialValue();

        /**
         * The meta object literal for the '<em><b>Cardinalities</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference VALUED_OBJECT__CARDINALITIES = eINSTANCE.getValuedObject_Cardinalities();

								/**
         * The meta object literal for the '<em><b>Combine Operator</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VALUED_OBJECT__COMBINE_OPERATOR = eINSTANCE.getValuedObject_CombineOperator();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.impl.ValuedObjectReferenceImpl <em>Valued Object Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.impl.ValuedObjectReferenceImpl
         * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getValuedObjectReference()
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
         * The meta object literal for the '<em><b>Indices</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUED_OBJECT_REFERENCE__INDICES = eINSTANCE.getValuedObjectReference_Indices();

        /**
         * The meta object literal for the '<em><b>Sub Reference</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUED_OBJECT_REFERENCE__SUB_REFERENCE = eINSTANCE.getValuedObjectReference_SubReference();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.Value <em>Value</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.Value
         * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getValue()
         * @generated
         */
        EClass VALUE = eINSTANCE.getValue();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.impl.IntValueImpl <em>Int Value</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.impl.IntValueImpl
         * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getIntValue()
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
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.impl.FloatValueImpl <em>Float Value</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.impl.FloatValueImpl
         * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getFloatValue()
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
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.impl.BoolValueImpl <em>Bool Value</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.impl.BoolValueImpl
         * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getBoolValue()
         * @generated
         */
        EClass BOOL_VALUE = eINSTANCE.getBoolValue();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOOL_VALUE__VALUE = eINSTANCE.getBoolValue_Value();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.impl.OperatorExpressionImpl <em>Operator Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.impl.OperatorExpressionImpl
         * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getOperatorExpression()
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
         * The meta object literal for the '<em><b>Sub Expressions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OPERATOR_EXPRESSION__SUB_EXPRESSIONS = eINSTANCE.getOperatorExpression_SubExpressions();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.impl.TextExpressionImpl <em>Text Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.impl.TextExpressionImpl
         * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getTextExpression()
         * @generated
         */
        EClass TEXT_EXPRESSION = eINSTANCE.getTextExpression();

        /**
         * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEXT_EXPRESSION__TEXT = eINSTANCE.getTextExpression_Text();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.impl.DeclarationImpl <em>Declaration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.impl.DeclarationImpl
         * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getDeclaration()
         * @generated
         */
        EClass DECLARATION = eINSTANCE.getDeclaration();

        /**
         * The meta object literal for the '<em><b>Valued Objects</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DECLARATION__VALUED_OBJECTS = eINSTANCE.getDeclaration_ValuedObjects();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.impl.VariableDeclarationImpl
         * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getVariableDeclaration()
         * @generated
         */
        EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VARIABLE_DECLARATION__TYPE = eINSTANCE.getVariableDeclaration_Type();

        /**
         * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VARIABLE_DECLARATION__INPUT = eINSTANCE.getVariableDeclaration_Input();

        /**
         * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VARIABLE_DECLARATION__OUTPUT = eINSTANCE.getVariableDeclaration_Output();

        /**
         * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VARIABLE_DECLARATION__STATIC = eINSTANCE.getVariableDeclaration_Static();

        /**
         * The meta object literal for the '<em><b>Signal</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VARIABLE_DECLARATION__SIGNAL = eINSTANCE.getVariableDeclaration_Signal();

        /**
         * The meta object literal for the '<em><b>Const</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VARIABLE_DECLARATION__CONST = eINSTANCE.getVariableDeclaration_Const();

        /**
         * The meta object literal for the '<em><b>Extern</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VARIABLE_DECLARATION__EXTERN = eINSTANCE.getVariableDeclaration_Extern();

        /**
         * The meta object literal for the '<em><b>Volatile</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VARIABLE_DECLARATION__VOLATILE = eINSTANCE.getVariableDeclaration_Volatile();

        /**
         * The meta object literal for the '<em><b>Host Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VARIABLE_DECLARATION__HOST_TYPE = eINSTANCE.getVariableDeclaration_HostType();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.impl.ReferenceDeclarationImpl <em>Reference Declaration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.impl.ReferenceDeclarationImpl
         * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getReferenceDeclaration()
         * @generated
         */
        EClass REFERENCE_DECLARATION = eINSTANCE.getReferenceDeclaration();

        /**
         * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REFERENCE_DECLARATION__REFERENCE = eINSTANCE.getReferenceDeclaration_Reference();

        /**
         * The meta object literal for the '<em><b>Extern</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REFERENCE_DECLARATION__EXTERN = eINSTANCE.getReferenceDeclaration_Extern();

        /**
         * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REFERENCE_DECLARATION__PARAMETERS = eINSTANCE.getReferenceDeclaration_Parameters();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.impl.ScheduleDeclarationImpl <em>Schedule Declaration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.impl.ScheduleDeclarationImpl
         * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getScheduleDeclaration()
         * @generated
         */
        EClass SCHEDULE_DECLARATION = eINSTANCE.getScheduleDeclaration();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEDULE_DECLARATION__NAME = eINSTANCE.getScheduleDeclaration_Name();

        /**
         * The meta object literal for the '<em><b>Priorities</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCHEDULE_DECLARATION__PRIORITIES = eINSTANCE.getScheduleDeclaration_Priorities();

        /**
         * The meta object literal for the '<em><b>Global</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEDULE_DECLARATION__GLOBAL = eINSTANCE.getScheduleDeclaration_Global();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.impl.SchedulePriorityImpl <em>Schedule Priority</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.impl.SchedulePriorityImpl
         * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getSchedulePriority()
         * @generated
         */
        EClass SCHEDULE_PRIORITY = eINSTANCE.getSchedulePriority();

        /**
         * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEDULE_PRIORITY__PRIORITY = eINSTANCE.getSchedulePriority_Priority();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEDULE_PRIORITY__TYPE = eINSTANCE.getSchedulePriority_Type();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.impl.ScheduleObjectReferenceImpl <em>Schedule Object Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.impl.ScheduleObjectReferenceImpl
         * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getScheduleObjectReference()
         * @generated
         */
        EClass SCHEDULE_OBJECT_REFERENCE = eINSTANCE.getScheduleObjectReference();

        /**
         * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEDULE_OBJECT_REFERENCE__PRIORITY = eINSTANCE.getScheduleObjectReference_Priority();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.impl.FunctionCallImpl <em>Function Call</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.impl.FunctionCallImpl
         * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getFunctionCall()
         * @generated
         */
        EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

        /**
         * The meta object literal for the '<em><b>Function Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FUNCTION_CALL__FUNCTION_NAME = eINSTANCE.getFunctionCall_FunctionName();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.Referenceable <em>Referenceable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.Referenceable
         * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getReferenceable()
         * @generated
         */
        EClass REFERENCEABLE = eINSTANCE.getReferenceable();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.Schedulable <em>Schedulable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.Schedulable
         * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getSchedulable()
         * @generated
         */
        EClass SCHEDULABLE = eINSTANCE.getSchedulable();

        /**
         * The meta object literal for the '<em><b>Schedule</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCHEDULABLE__SCHEDULE = eINSTANCE.getSchedulable_Schedule();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.impl.ParameterImpl <em>Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.impl.ParameterImpl
         * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getParameter()
         * @generated
         */
        EClass PARAMETER = eINSTANCE.getParameter();

        /**
         * The meta object literal for the '<em><b>Call By Reference</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAMETER__CALL_BY_REFERENCE = eINSTANCE.getParameter_CallByReference();

        /**
         * The meta object literal for the '<em><b>Pure Output</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAMETER__PURE_OUTPUT = eINSTANCE.getParameter_PureOutput();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PARAMETER__EXPRESSION = eINSTANCE.getParameter_Expression();

        /**
         * The meta object literal for the '<em><b>Explicit Binding</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PARAMETER__EXPLICIT_BINDING = eINSTANCE.getParameter_ExplicitBinding();

        /**
         * The meta object literal for the '<em><b>Explicit Binding Indices</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PARAMETER__EXPLICIT_BINDING_INDICES = eINSTANCE.getParameter_ExplicitBindingIndices();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.impl.StringValueImpl <em>String Value</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.impl.StringValueImpl
         * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getStringValue()
         * @generated
         */
        EClass STRING_VALUE = eINSTANCE.getStringValue();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STRING_VALUE__VALUE = eINSTANCE.getStringValue_Value();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.Call <em>Call</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.Call
         * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getCall()
         * @generated
         */
        EClass CALL = eINSTANCE.getCall();

        /**
         * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CALL__PARAMETERS = eINSTANCE.getCall_Parameters();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.impl.ReferenceCallImpl <em>Reference Call</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.impl.ReferenceCallImpl
         * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getReferenceCall()
         * @generated
         */
        EClass REFERENCE_CALL = eINSTANCE.getReferenceCall();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.CombineOperator <em>Combine Operator</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.CombineOperator
         * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getCombineOperator()
         * @generated
         */
        EEnum COMBINE_OPERATOR = eINSTANCE.getCombineOperator();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.OperatorType <em>Operator Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.OperatorType
         * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getOperatorType()
         * @generated
         */
        EEnum OPERATOR_TYPE = eINSTANCE.getOperatorType();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.ValueType <em>Value Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.ValueType
         * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getValueType()
         * @generated
         */
        EEnum VALUE_TYPE = eINSTANCE.getValueType();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kexpressions.SchedulePriorityType <em>Schedule Priority Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kexpressions.SchedulePriorityType
         * @see de.cau.cs.kieler.kexpressions.impl.KExpressionsPackageImpl#getSchedulePriorityType()
         * @generated
         */
        EEnum SCHEDULE_PRIORITY_TYPE = eINSTANCE.getSchedulePriorityType();

    }

} //KExpressionsPackage
