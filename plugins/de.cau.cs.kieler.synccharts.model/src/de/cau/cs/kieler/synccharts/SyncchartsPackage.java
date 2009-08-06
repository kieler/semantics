/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts;

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
 * @see de.cau.cs.kieler.synccharts.SyncchartsFactory
 * @model kind="package"
 * @generated
 */
public interface SyncchartsPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "synccharts";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://kieler.cs.cau.de/synccharts";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "synccharts";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SyncchartsPackage eINSTANCE = de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl.init();

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.impl.ActionImpl
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getAction()
     * @generated
     */
    int ACTION = 0;

    /**
     * The feature id for the '<em><b>Effects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__EFFECTS = 0;

    /**
     * The feature id for the '<em><b>Trigger</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__TRIGGER = 1;

    /**
     * The feature id for the '<em><b>Triggers And Effects</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__TRIGGERS_AND_EFFECTS = 2;

    /**
     * The feature id for the '<em><b>Parent State Entry Action</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__PARENT_STATE_ENTRY_ACTION = 3;

    /**
     * The feature id for the '<em><b>Parent State Inner Action</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__PARENT_STATE_INNER_ACTION = 4;

    /**
     * The feature id for the '<em><b>Parent State Exit Action</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__PARENT_STATE_EXIT_ACTION = 5;

    /**
     * The feature id for the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__DELAY = 6;

    /**
     * The feature id for the '<em><b>Is Immediate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__IS_IMMEDIATE = 7;

    /**
     * The feature id for the '<em><b>Parent State Suspension</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__PARENT_STATE_SUSPENSION = 8;

    /**
     * The number of structural features of the '<em>Action</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_FEATURE_COUNT = 9;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.EffectImpl <em>Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.impl.EffectImpl
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getEffect()
     * @generated
     */
    int EFFECT = 3;

    /**
     * The feature id for the '<em><b>Parent EAction</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EFFECT__PARENT_EACTION = 0;

    /**
     * The number of structural features of the '<em>Effect</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EFFECT_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.impl.AssignmentImpl
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getAssignment()
     * @generated
     */
    int ASSIGNMENT = 1;

    /**
     * The feature id for the '<em><b>Parent EAction</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__PARENT_EACTION = EFFECT__PARENT_EACTION;

    /**
     * The feature id for the '<em><b>Variable</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__VARIABLE = EFFECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__EXPRESSION = EFFECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.impl.ExpressionImpl
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getExpression()
     * @generated
     */
    int EXPRESSION = 5;

    /**
     * The feature id for the '<em><b>Parent Action</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION__PARENT_ACTION = 0;

    /**
     * The feature id for the '<em><b>Parent Emisson</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION__PARENT_EMISSON = 1;

    /**
     * The feature id for the '<em><b>Parent Assignment</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION__PARENT_ASSIGNMENT = 2;

    /**
     * The feature id for the '<em><b>Parent Expression</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION__PARENT_EXPRESSION = 3;

    /**
     * The number of structural features of the '<em>Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.ComplexExpressionImpl <em>Complex Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.impl.ComplexExpressionImpl
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getComplexExpression()
     * @generated
     */
    int COMPLEX_EXPRESSION = 2;

    /**
     * The feature id for the '<em><b>Parent Action</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_EXPRESSION__PARENT_ACTION = EXPRESSION__PARENT_ACTION;

    /**
     * The feature id for the '<em><b>Parent Emisson</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_EXPRESSION__PARENT_EMISSON = EXPRESSION__PARENT_EMISSON;

    /**
     * The feature id for the '<em><b>Parent Assignment</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_EXPRESSION__PARENT_ASSIGNMENT = EXPRESSION__PARENT_ASSIGNMENT;

    /**
     * The feature id for the '<em><b>Parent Expression</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_EXPRESSION__PARENT_EXPRESSION = EXPRESSION__PARENT_EXPRESSION;

    /**
     * The feature id for the '<em><b>Sub Expressions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_EXPRESSION__SUB_EXPRESSIONS = EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Complex Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.EmissionImpl <em>Emission</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.impl.EmissionImpl
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getEmission()
     * @generated
     */
    int EMISSION = 4;

    /**
     * The feature id for the '<em><b>Parent EAction</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMISSION__PARENT_EACTION = EFFECT__PARENT_EACTION;

    /**
     * The feature id for the '<em><b>Signal</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMISSION__SIGNAL = EFFECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>New Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMISSION__NEW_VALUE = EFFECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Emission</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMISSION_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.HostCodeImpl <em>Host Code</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.impl.HostCodeImpl
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getHostCode()
     * @generated
     */
    int HOST_CODE = 6;

    /**
     * The feature id for the '<em><b>Parent EAction</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HOST_CODE__PARENT_EACTION = EFFECT__PARENT_EACTION;

    /**
     * The feature id for the '<em><b>Parent Action</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HOST_CODE__PARENT_ACTION = EFFECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Emisson</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HOST_CODE__PARENT_EMISSON = EFFECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Assignment</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HOST_CODE__PARENT_ASSIGNMENT = EFFECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Parent Expression</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HOST_CODE__PARENT_EXPRESSION = EFFECT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HOST_CODE__CODE = EFFECT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HOST_CODE__TYPE = EFFECT_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Host Code</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HOST_CODE_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 6;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.RegionImpl <em>Region</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.impl.RegionImpl
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getRegion()
     * @generated
     */
    int REGION = 7;

    /**
     * The feature id for the '<em><b>Inner States</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGION__INNER_STATES = 0;

    /**
     * The feature id for the '<em><b>Parent State</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGION__PARENT_STATE = 1;

    /**
     * The feature id for the '<em><b>Variables</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGION__VARIABLES = 2;

    /**
     * The feature id for the '<em><b>Signals</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGION__SIGNALS = 3;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGION__ID = 4;

    /**
     * The number of structural features of the '<em>Region</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGION_FEATURE_COUNT = 5;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.ValuedObjectImpl <em>Valued Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.impl.ValuedObjectImpl
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getValuedObject()
     * @generated
     */
    int VALUED_OBJECT = 13;

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
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.SignalImpl <em>Signal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.impl.SignalImpl
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getSignal()
     * @generated
     */
    int SIGNAL = 8;

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
     * The feature id for the '<em><b>Parent State</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL__PARENT_STATE = VALUED_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Is Local</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL__IS_LOCAL = VALUED_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Is Input</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL__IS_INPUT = VALUED_OBJECT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Is Output</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL__IS_OUTPUT = VALUED_OBJECT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Combine Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL__COMBINE_OPERATOR = VALUED_OBJECT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Host Combine Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL__HOST_COMBINE_OPERATOR = VALUED_OBJECT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Parent Region</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL__PARENT_REGION = VALUED_OBJECT_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Signal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_FEATURE_COUNT = VALUED_OBJECT_FEATURE_COUNT + 8;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.SignalReferenceImpl <em>Signal Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.impl.SignalReferenceImpl
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getSignalReference()
     * @generated
     */
    int SIGNAL_REFERENCE = 9;

    /**
     * The feature id for the '<em><b>Parent Action</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_REFERENCE__PARENT_ACTION = EXPRESSION__PARENT_ACTION;

    /**
     * The feature id for the '<em><b>Parent Emisson</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_REFERENCE__PARENT_EMISSON = EXPRESSION__PARENT_EMISSON;

    /**
     * The feature id for the '<em><b>Parent Assignment</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_REFERENCE__PARENT_ASSIGNMENT = EXPRESSION__PARENT_ASSIGNMENT;

    /**
     * The feature id for the '<em><b>Parent Expression</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_REFERENCE__PARENT_EXPRESSION = EXPRESSION__PARENT_EXPRESSION;

    /**
     * The feature id for the '<em><b>Signal</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_REFERENCE__SIGNAL = EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Signal Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.SignalRenamingImpl <em>Signal Renaming</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.impl.SignalRenamingImpl
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getSignalRenaming()
     * @generated
     */
    int SIGNAL_RENAMING = 10;

    /**
     * The feature id for the '<em><b>Old Signal</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_RENAMING__OLD_SIGNAL = 0;

    /**
     * The feature id for the '<em><b>New Signal</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_RENAMING__NEW_SIGNAL = 1;

    /**
     * The feature id for the '<em><b>Parent State</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_RENAMING__PARENT_STATE = 2;

    /**
     * The number of structural features of the '<em>Signal Renaming</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_RENAMING_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.impl.StateImpl
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getState()
     * @generated
     */
    int STATE = 11;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__ID = 0;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__LABEL = 1;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__TYPE = 2;

    /**
     * The feature id for the '<em><b>Signals</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__SIGNALS = 3;

    /**
     * The feature id for the '<em><b>Regions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__REGIONS = 4;

    /**
     * The feature id for the '<em><b>Entry Actions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__ENTRY_ACTIONS = 5;

    /**
     * The feature id for the '<em><b>Inner Actions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__INNER_ACTIONS = 6;

    /**
     * The feature id for the '<em><b>Exit Actions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__EXIT_ACTIONS = 7;

    /**
     * The feature id for the '<em><b>Signal Renamings</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__SIGNAL_RENAMINGS = 8;

    /**
     * The feature id for the '<em><b>Suspension Trigger</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__SUSPENSION_TRIGGER = 9;

    /**
     * The feature id for the '<em><b>Outgoing Transitions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__OUTGOING_TRANSITIONS = 10;

    /**
     * The feature id for the '<em><b>Parent Region</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__PARENT_REGION = 11;

    /**
     * The feature id for the '<em><b>Is Initial</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__IS_INITIAL = 12;

    /**
     * The feature id for the '<em><b>Is Final</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__IS_FINAL = 13;

    /**
     * The feature id for the '<em><b>Body Text</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__BODY_TEXT = 14;

    /**
     * The number of structural features of the '<em>State</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE_FEATURE_COUNT = 15;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.impl.TransitionImpl
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getTransition()
     * @generated
     */
    int TRANSITION = 12;

    /**
     * The feature id for the '<em><b>Effects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSITION__EFFECTS = ACTION__EFFECTS;

    /**
     * The feature id for the '<em><b>Trigger</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSITION__TRIGGER = ACTION__TRIGGER;

    /**
     * The feature id for the '<em><b>Triggers And Effects</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSITION__TRIGGERS_AND_EFFECTS = ACTION__TRIGGERS_AND_EFFECTS;

    /**
     * The feature id for the '<em><b>Parent State Entry Action</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSITION__PARENT_STATE_ENTRY_ACTION = ACTION__PARENT_STATE_ENTRY_ACTION;

    /**
     * The feature id for the '<em><b>Parent State Inner Action</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSITION__PARENT_STATE_INNER_ACTION = ACTION__PARENT_STATE_INNER_ACTION;

    /**
     * The feature id for the '<em><b>Parent State Exit Action</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSITION__PARENT_STATE_EXIT_ACTION = ACTION__PARENT_STATE_EXIT_ACTION;

    /**
     * The feature id for the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSITION__DELAY = ACTION__DELAY;

    /**
     * The feature id for the '<em><b>Is Immediate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSITION__IS_IMMEDIATE = ACTION__IS_IMMEDIATE;

    /**
     * The feature id for the '<em><b>Parent State Suspension</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSITION__PARENT_STATE_SUSPENSION = ACTION__PARENT_STATE_SUSPENSION;

    /**
     * The feature id for the '<em><b>Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSITION__PRIORITY = ACTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSITION__TYPE = ACTION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Target State</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSITION__TARGET_STATE = ACTION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Source State</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSITION__SOURCE_STATE = ACTION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Is History</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSITION__IS_HISTORY = ACTION_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Transition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSITION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 5;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.impl.VariableImpl
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getVariable()
     * @generated
     */
    int VARIABLE = 14;

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
     * The feature id for the '<em><b>Parent Region</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__PARENT_REGION = VALUED_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_FEATURE_COUNT = VALUED_OBJECT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.impl.VariableReferenceImpl
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getVariableReference()
     * @generated
     */
    int VARIABLE_REFERENCE = 15;

    /**
     * The feature id for the '<em><b>Parent Action</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_REFERENCE__PARENT_ACTION = EXPRESSION__PARENT_ACTION;

    /**
     * The feature id for the '<em><b>Parent Emisson</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_REFERENCE__PARENT_EMISSON = EXPRESSION__PARENT_EMISSON;

    /**
     * The feature id for the '<em><b>Parent Assignment</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_REFERENCE__PARENT_ASSIGNMENT = EXPRESSION__PARENT_ASSIGNMENT;

    /**
     * The feature id for the '<em><b>Parent Expression</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_REFERENCE__PARENT_EXPRESSION = EXPRESSION__PARENT_EXPRESSION;

    /**
     * The feature id for the '<em><b>Variable</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_REFERENCE__VARIABLE = EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Variable Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.CombineOperator <em>Combine Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.CombineOperator
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getCombineOperator()
     * @generated
     */
    int COMBINE_OPERATOR = 16;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.OperatorType <em>Operator Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.OperatorType
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getOperatorType()
     * @generated
     */
    int OPERATOR_TYPE = 17;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.StateType <em>State Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.StateType
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getStateType()
     * @generated
     */
    int STATE_TYPE = 18;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.TransitionType <em>Transition Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.TransitionType
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getTransitionType()
     * @generated
     */
    int TRANSITION_TYPE = 19;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.ValueType <em>Value Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.ValueType
     * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getValueType()
     * @generated
     */
    int VALUE_TYPE = 20;


    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.Action <em>Action</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Action</em>'.
     * @see de.cau.cs.kieler.synccharts.Action
     * @generated
     */
    EClass getAction();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.Action#getEffects <em>Effects</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Effects</em>'.
     * @see de.cau.cs.kieler.synccharts.Action#getEffects()
     * @see #getAction()
     * @generated
     */
    EReference getAction_Effects();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts.Action#getTrigger <em>Trigger</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Trigger</em>'.
     * @see de.cau.cs.kieler.synccharts.Action#getTrigger()
     * @see #getAction()
     * @generated
     */
    EReference getAction_Trigger();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.Action#getTriggersAndEffects <em>Triggers And Effects</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Triggers And Effects</em>'.
     * @see de.cau.cs.kieler.synccharts.Action#getTriggersAndEffects()
     * @see #getAction()
     * @generated
     */
    EAttribute getAction_TriggersAndEffects();

    /**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts.Action#getParentStateEntryAction <em>Parent State Entry Action</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent State Entry Action</em>'.
     * @see de.cau.cs.kieler.synccharts.Action#getParentStateEntryAction()
     * @see #getAction()
     * @generated
     */
    EReference getAction_ParentStateEntryAction();

    /**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts.Action#getParentStateInnerAction <em>Parent State Inner Action</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent State Inner Action</em>'.
     * @see de.cau.cs.kieler.synccharts.Action#getParentStateInnerAction()
     * @see #getAction()
     * @generated
     */
    EReference getAction_ParentStateInnerAction();

    /**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts.Action#getParentStateExitAction <em>Parent State Exit Action</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent State Exit Action</em>'.
     * @see de.cau.cs.kieler.synccharts.Action#getParentStateExitAction()
     * @see #getAction()
     * @generated
     */
    EReference getAction_ParentStateExitAction();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.Action#getDelay <em>Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Delay</em>'.
     * @see de.cau.cs.kieler.synccharts.Action#getDelay()
     * @see #getAction()
     * @generated
     */
    EAttribute getAction_Delay();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.Action#isIsImmediate <em>Is Immediate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Immediate</em>'.
     * @see de.cau.cs.kieler.synccharts.Action#isIsImmediate()
     * @see #getAction()
     * @generated
     */
    EAttribute getAction_IsImmediate();

    /**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts.Action#getParentStateSuspension <em>Parent State Suspension</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent State Suspension</em>'.
     * @see de.cau.cs.kieler.synccharts.Action#getParentStateSuspension()
     * @see #getAction()
     * @generated
     */
    EReference getAction_ParentStateSuspension();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.Assignment <em>Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Assignment</em>'.
     * @see de.cau.cs.kieler.synccharts.Assignment
     * @generated
     */
    EClass getAssignment();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts.Assignment#getVariable <em>Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Variable</em>'.
     * @see de.cau.cs.kieler.synccharts.Assignment#getVariable()
     * @see #getAssignment()
     * @generated
     */
    EReference getAssignment_Variable();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts.Assignment#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Expression</em>'.
     * @see de.cau.cs.kieler.synccharts.Assignment#getExpression()
     * @see #getAssignment()
     * @generated
     */
    EReference getAssignment_Expression();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.ComplexExpression <em>Complex Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Complex Expression</em>'.
     * @see de.cau.cs.kieler.synccharts.ComplexExpression
     * @generated
     */
    EClass getComplexExpression();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.ComplexExpression#getSubExpressions <em>Sub Expressions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sub Expressions</em>'.
     * @see de.cau.cs.kieler.synccharts.ComplexExpression#getSubExpressions()
     * @see #getComplexExpression()
     * @generated
     */
    EReference getComplexExpression_SubExpressions();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.ComplexExpression#getOperator <em>Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Operator</em>'.
     * @see de.cau.cs.kieler.synccharts.ComplexExpression#getOperator()
     * @see #getComplexExpression()
     * @generated
     */
    EAttribute getComplexExpression_Operator();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.Effect <em>Effect</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Effect</em>'.
     * @see de.cau.cs.kieler.synccharts.Effect
     * @generated
     */
    EClass getEffect();

    /**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts.Effect#getParentEAction <em>Parent EAction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent EAction</em>'.
     * @see de.cau.cs.kieler.synccharts.Effect#getParentEAction()
     * @see #getEffect()
     * @generated
     */
    EReference getEffect_ParentEAction();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.Emission <em>Emission</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Emission</em>'.
     * @see de.cau.cs.kieler.synccharts.Emission
     * @generated
     */
    EClass getEmission();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts.Emission#getSignal <em>Signal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Signal</em>'.
     * @see de.cau.cs.kieler.synccharts.Emission#getSignal()
     * @see #getEmission()
     * @generated
     */
    EReference getEmission_Signal();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts.Emission#getNewValue <em>New Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>New Value</em>'.
     * @see de.cau.cs.kieler.synccharts.Emission#getNewValue()
     * @see #getEmission()
     * @generated
     */
    EReference getEmission_NewValue();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.Expression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Expression</em>'.
     * @see de.cau.cs.kieler.synccharts.Expression
     * @generated
     */
    EClass getExpression();

    /**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts.Expression#getParentAction <em>Parent Action</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Action</em>'.
     * @see de.cau.cs.kieler.synccharts.Expression#getParentAction()
     * @see #getExpression()
     * @generated
     */
    EReference getExpression_ParentAction();

    /**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts.Expression#getParentEmisson <em>Parent Emisson</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Emisson</em>'.
     * @see de.cau.cs.kieler.synccharts.Expression#getParentEmisson()
     * @see #getExpression()
     * @generated
     */
    EReference getExpression_ParentEmisson();

    /**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts.Expression#getParentAssignment <em>Parent Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Assignment</em>'.
     * @see de.cau.cs.kieler.synccharts.Expression#getParentAssignment()
     * @see #getExpression()
     * @generated
     */
    EReference getExpression_ParentAssignment();

    /**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts.Expression#getParentExpression <em>Parent Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Expression</em>'.
     * @see de.cau.cs.kieler.synccharts.Expression#getParentExpression()
     * @see #getExpression()
     * @generated
     */
    EReference getExpression_ParentExpression();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.HostCode <em>Host Code</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Host Code</em>'.
     * @see de.cau.cs.kieler.synccharts.HostCode
     * @generated
     */
    EClass getHostCode();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.HostCode#getCode <em>Code</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Code</em>'.
     * @see de.cau.cs.kieler.synccharts.HostCode#getCode()
     * @see #getHostCode()
     * @generated
     */
    EAttribute getHostCode_Code();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.HostCode#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see de.cau.cs.kieler.synccharts.HostCode#getType()
     * @see #getHostCode()
     * @generated
     */
    EAttribute getHostCode_Type();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.Region <em>Region</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Region</em>'.
     * @see de.cau.cs.kieler.synccharts.Region
     * @generated
     */
    EClass getRegion();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.Region#getInnerStates <em>Inner States</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Inner States</em>'.
     * @see de.cau.cs.kieler.synccharts.Region#getInnerStates()
     * @see #getRegion()
     * @generated
     */
    EReference getRegion_InnerStates();

    /**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts.Region#getParentState <em>Parent State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent State</em>'.
     * @see de.cau.cs.kieler.synccharts.Region#getParentState()
     * @see #getRegion()
     * @generated
     */
    EReference getRegion_ParentState();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.Region#getVariables <em>Variables</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Variables</em>'.
     * @see de.cau.cs.kieler.synccharts.Region#getVariables()
     * @see #getRegion()
     * @generated
     */
    EReference getRegion_Variables();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.Region#getSignals <em>Signals</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Signals</em>'.
     * @see de.cau.cs.kieler.synccharts.Region#getSignals()
     * @see #getRegion()
     * @generated
     */
    EReference getRegion_Signals();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.Region#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see de.cau.cs.kieler.synccharts.Region#getId()
     * @see #getRegion()
     * @generated
     */
    EAttribute getRegion_Id();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.Signal <em>Signal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Signal</em>'.
     * @see de.cau.cs.kieler.synccharts.Signal
     * @generated
     */
    EClass getSignal();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts.Signal#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Value</em>'.
     * @see de.cau.cs.kieler.synccharts.Signal#getValue()
     * @see #getSignal()
     * @generated
     */
    EReference getSignal_Value();

    /**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts.Signal#getParentState <em>Parent State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent State</em>'.
     * @see de.cau.cs.kieler.synccharts.Signal#getParentState()
     * @see #getSignal()
     * @generated
     */
    EReference getSignal_ParentState();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.Signal#isIsLocal <em>Is Local</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Local</em>'.
     * @see de.cau.cs.kieler.synccharts.Signal#isIsLocal()
     * @see #getSignal()
     * @generated
     */
    EAttribute getSignal_IsLocal();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.Signal#isIsInput <em>Is Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Input</em>'.
     * @see de.cau.cs.kieler.synccharts.Signal#isIsInput()
     * @see #getSignal()
     * @generated
     */
    EAttribute getSignal_IsInput();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.Signal#isIsOutput <em>Is Output</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Output</em>'.
     * @see de.cau.cs.kieler.synccharts.Signal#isIsOutput()
     * @see #getSignal()
     * @generated
     */
    EAttribute getSignal_IsOutput();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.Signal#getCombineOperator <em>Combine Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Combine Operator</em>'.
     * @see de.cau.cs.kieler.synccharts.Signal#getCombineOperator()
     * @see #getSignal()
     * @generated
     */
    EAttribute getSignal_CombineOperator();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.Signal#getHostCombineOperator <em>Host Combine Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Host Combine Operator</em>'.
     * @see de.cau.cs.kieler.synccharts.Signal#getHostCombineOperator()
     * @see #getSignal()
     * @generated
     */
    EAttribute getSignal_HostCombineOperator();

    /**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts.Signal#getParentRegion <em>Parent Region</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Region</em>'.
     * @see de.cau.cs.kieler.synccharts.Signal#getParentRegion()
     * @see #getSignal()
     * @generated
     */
    EReference getSignal_ParentRegion();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.SignalReference <em>Signal Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Signal Reference</em>'.
     * @see de.cau.cs.kieler.synccharts.SignalReference
     * @generated
     */
    EClass getSignalReference();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts.SignalReference#getSignal <em>Signal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Signal</em>'.
     * @see de.cau.cs.kieler.synccharts.SignalReference#getSignal()
     * @see #getSignalReference()
     * @generated
     */
    EReference getSignalReference_Signal();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.SignalRenaming <em>Signal Renaming</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Signal Renaming</em>'.
     * @see de.cau.cs.kieler.synccharts.SignalRenaming
     * @generated
     */
    EClass getSignalRenaming();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts.SignalRenaming#getOldSignal <em>Old Signal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Old Signal</em>'.
     * @see de.cau.cs.kieler.synccharts.SignalRenaming#getOldSignal()
     * @see #getSignalRenaming()
     * @generated
     */
    EReference getSignalRenaming_OldSignal();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts.SignalRenaming#getNewSignal <em>New Signal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>New Signal</em>'.
     * @see de.cau.cs.kieler.synccharts.SignalRenaming#getNewSignal()
     * @see #getSignalRenaming()
     * @generated
     */
    EReference getSignalRenaming_NewSignal();

    /**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts.SignalRenaming#getParentState <em>Parent State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent State</em>'.
     * @see de.cau.cs.kieler.synccharts.SignalRenaming#getParentState()
     * @see #getSignalRenaming()
     * @generated
     */
    EReference getSignalRenaming_ParentState();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.State <em>State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>State</em>'.
     * @see de.cau.cs.kieler.synccharts.State
     * @generated
     */
    EClass getState();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.State#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see de.cau.cs.kieler.synccharts.State#getId()
     * @see #getState()
     * @generated
     */
    EAttribute getState_Id();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.State#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see de.cau.cs.kieler.synccharts.State#getLabel()
     * @see #getState()
     * @generated
     */
    EAttribute getState_Label();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.State#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see de.cau.cs.kieler.synccharts.State#getType()
     * @see #getState()
     * @generated
     */
    EAttribute getState_Type();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.State#getSignals <em>Signals</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Signals</em>'.
     * @see de.cau.cs.kieler.synccharts.State#getSignals()
     * @see #getState()
     * @generated
     */
    EReference getState_Signals();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.State#getRegions <em>Regions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Regions</em>'.
     * @see de.cau.cs.kieler.synccharts.State#getRegions()
     * @see #getState()
     * @generated
     */
    EReference getState_Regions();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.State#getEntryActions <em>Entry Actions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Entry Actions</em>'.
     * @see de.cau.cs.kieler.synccharts.State#getEntryActions()
     * @see #getState()
     * @generated
     */
    EReference getState_EntryActions();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.State#getInnerActions <em>Inner Actions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Inner Actions</em>'.
     * @see de.cau.cs.kieler.synccharts.State#getInnerActions()
     * @see #getState()
     * @generated
     */
    EReference getState_InnerActions();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.State#getExitActions <em>Exit Actions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Exit Actions</em>'.
     * @see de.cau.cs.kieler.synccharts.State#getExitActions()
     * @see #getState()
     * @generated
     */
    EReference getState_ExitActions();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.State#getSignalRenamings <em>Signal Renamings</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Signal Renamings</em>'.
     * @see de.cau.cs.kieler.synccharts.State#getSignalRenamings()
     * @see #getState()
     * @generated
     */
    EReference getState_SignalRenamings();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts.State#getSuspensionTrigger <em>Suspension Trigger</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Suspension Trigger</em>'.
     * @see de.cau.cs.kieler.synccharts.State#getSuspensionTrigger()
     * @see #getState()
     * @generated
     */
    EReference getState_SuspensionTrigger();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.State#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Outgoing Transitions</em>'.
     * @see de.cau.cs.kieler.synccharts.State#getOutgoingTransitions()
     * @see #getState()
     * @generated
     */
    EReference getState_OutgoingTransitions();

    /**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts.State#getParentRegion <em>Parent Region</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Region</em>'.
     * @see de.cau.cs.kieler.synccharts.State#getParentRegion()
     * @see #getState()
     * @generated
     */
    EReference getState_ParentRegion();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.State#isIsInitial <em>Is Initial</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Initial</em>'.
     * @see de.cau.cs.kieler.synccharts.State#isIsInitial()
     * @see #getState()
     * @generated
     */
    EAttribute getState_IsInitial();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.State#isIsFinal <em>Is Final</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Final</em>'.
     * @see de.cau.cs.kieler.synccharts.State#isIsFinal()
     * @see #getState()
     * @generated
     */
    EAttribute getState_IsFinal();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.State#getBodyText <em>Body Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Body Text</em>'.
     * @see de.cau.cs.kieler.synccharts.State#getBodyText()
     * @see #getState()
     * @generated
     */
    EAttribute getState_BodyText();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.Transition <em>Transition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Transition</em>'.
     * @see de.cau.cs.kieler.synccharts.Transition
     * @generated
     */
    EClass getTransition();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.Transition#getPriority <em>Priority</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Priority</em>'.
     * @see de.cau.cs.kieler.synccharts.Transition#getPriority()
     * @see #getTransition()
     * @generated
     */
    EAttribute getTransition_Priority();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.Transition#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see de.cau.cs.kieler.synccharts.Transition#getType()
     * @see #getTransition()
     * @generated
     */
    EAttribute getTransition_Type();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts.Transition#getTargetState <em>Target State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target State</em>'.
     * @see de.cau.cs.kieler.synccharts.Transition#getTargetState()
     * @see #getTransition()
     * @generated
     */
    EReference getTransition_TargetState();

    /**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts.Transition#getSourceState <em>Source State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Source State</em>'.
     * @see de.cau.cs.kieler.synccharts.Transition#getSourceState()
     * @see #getTransition()
     * @generated
     */
    EReference getTransition_SourceState();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.Transition#isIsHistory <em>Is History</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is History</em>'.
     * @see de.cau.cs.kieler.synccharts.Transition#isIsHistory()
     * @see #getTransition()
     * @generated
     */
    EAttribute getTransition_IsHistory();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.ValuedObject <em>Valued Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Valued Object</em>'.
     * @see de.cau.cs.kieler.synccharts.ValuedObject
     * @generated
     */
    EClass getValuedObject();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.ValuedObject#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see de.cau.cs.kieler.synccharts.ValuedObject#getName()
     * @see #getValuedObject()
     * @generated
     */
    EAttribute getValuedObject_Name();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.ValuedObject#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see de.cau.cs.kieler.synccharts.ValuedObject#getType()
     * @see #getValuedObject()
     * @generated
     */
    EAttribute getValuedObject_Type();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.ValuedObject#getInitialValue <em>Initial Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Initial Value</em>'.
     * @see de.cau.cs.kieler.synccharts.ValuedObject#getInitialValue()
     * @see #getValuedObject()
     * @generated
     */
    EAttribute getValuedObject_InitialValue();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.ValuedObject#getHostType <em>Host Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Host Type</em>'.
     * @see de.cau.cs.kieler.synccharts.ValuedObject#getHostType()
     * @see #getValuedObject()
     * @generated
     */
    EAttribute getValuedObject_HostType();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.Variable <em>Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Variable</em>'.
     * @see de.cau.cs.kieler.synccharts.Variable
     * @generated
     */
    EClass getVariable();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts.Variable#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Value</em>'.
     * @see de.cau.cs.kieler.synccharts.Variable#getValue()
     * @see #getVariable()
     * @generated
     */
    EReference getVariable_Value();

    /**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts.Variable#getParentRegion <em>Parent Region</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Region</em>'.
     * @see de.cau.cs.kieler.synccharts.Variable#getParentRegion()
     * @see #getVariable()
     * @generated
     */
    EReference getVariable_ParentRegion();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.VariableReference <em>Variable Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Variable Reference</em>'.
     * @see de.cau.cs.kieler.synccharts.VariableReference
     * @generated
     */
    EClass getVariableReference();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts.VariableReference#getVariable <em>Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Variable</em>'.
     * @see de.cau.cs.kieler.synccharts.VariableReference#getVariable()
     * @see #getVariableReference()
     * @generated
     */
    EReference getVariableReference_Variable();

    /**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.synccharts.CombineOperator <em>Combine Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Combine Operator</em>'.
     * @see de.cau.cs.kieler.synccharts.CombineOperator
     * @generated
     */
    EEnum getCombineOperator();

    /**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.synccharts.OperatorType <em>Operator Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Operator Type</em>'.
     * @see de.cau.cs.kieler.synccharts.OperatorType
     * @generated
     */
    EEnum getOperatorType();

    /**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.synccharts.StateType <em>State Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>State Type</em>'.
     * @see de.cau.cs.kieler.synccharts.StateType
     * @generated
     */
    EEnum getStateType();

    /**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.synccharts.TransitionType <em>Transition Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Transition Type</em>'.
     * @see de.cau.cs.kieler.synccharts.TransitionType
     * @generated
     */
    EEnum getTransitionType();

    /**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.synccharts.ValueType <em>Value Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Value Type</em>'.
     * @see de.cau.cs.kieler.synccharts.ValueType
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
    SyncchartsFactory getSyncchartsFactory();

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
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.ActionImpl <em>Action</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.impl.ActionImpl
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getAction()
         * @generated
         */
        EClass ACTION = eINSTANCE.getAction();

        /**
         * The meta object literal for the '<em><b>Effects</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTION__EFFECTS = eINSTANCE.getAction_Effects();

        /**
         * The meta object literal for the '<em><b>Trigger</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTION__TRIGGER = eINSTANCE.getAction_Trigger();

        /**
         * The meta object literal for the '<em><b>Triggers And Effects</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ACTION__TRIGGERS_AND_EFFECTS = eINSTANCE.getAction_TriggersAndEffects();

        /**
         * The meta object literal for the '<em><b>Parent State Entry Action</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTION__PARENT_STATE_ENTRY_ACTION = eINSTANCE.getAction_ParentStateEntryAction();

        /**
         * The meta object literal for the '<em><b>Parent State Inner Action</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTION__PARENT_STATE_INNER_ACTION = eINSTANCE.getAction_ParentStateInnerAction();

        /**
         * The meta object literal for the '<em><b>Parent State Exit Action</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTION__PARENT_STATE_EXIT_ACTION = eINSTANCE.getAction_ParentStateExitAction();

        /**
         * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ACTION__DELAY = eINSTANCE.getAction_Delay();

        /**
         * The meta object literal for the '<em><b>Is Immediate</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ACTION__IS_IMMEDIATE = eINSTANCE.getAction_IsImmediate();

        /**
         * The meta object literal for the '<em><b>Parent State Suspension</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTION__PARENT_STATE_SUSPENSION = eINSTANCE.getAction_ParentStateSuspension();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.AssignmentImpl <em>Assignment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.impl.AssignmentImpl
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getAssignment()
         * @generated
         */
        EClass ASSIGNMENT = eINSTANCE.getAssignment();

        /**
         * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSIGNMENT__VARIABLE = eINSTANCE.getAssignment_Variable();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSIGNMENT__EXPRESSION = eINSTANCE.getAssignment_Expression();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.ComplexExpressionImpl <em>Complex Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.impl.ComplexExpressionImpl
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getComplexExpression()
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
         * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMPLEX_EXPRESSION__OPERATOR = eINSTANCE.getComplexExpression_Operator();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.EffectImpl <em>Effect</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.impl.EffectImpl
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getEffect()
         * @generated
         */
        EClass EFFECT = eINSTANCE.getEffect();

        /**
         * The meta object literal for the '<em><b>Parent EAction</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EFFECT__PARENT_EACTION = eINSTANCE.getEffect_ParentEAction();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.EmissionImpl <em>Emission</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.impl.EmissionImpl
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getEmission()
         * @generated
         */
        EClass EMISSION = eINSTANCE.getEmission();

        /**
         * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EMISSION__SIGNAL = eINSTANCE.getEmission_Signal();

        /**
         * The meta object literal for the '<em><b>New Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EMISSION__NEW_VALUE = eINSTANCE.getEmission_NewValue();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.ExpressionImpl <em>Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.impl.ExpressionImpl
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getExpression()
         * @generated
         */
        EClass EXPRESSION = eINSTANCE.getExpression();

        /**
         * The meta object literal for the '<em><b>Parent Action</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXPRESSION__PARENT_ACTION = eINSTANCE.getExpression_ParentAction();

        /**
         * The meta object literal for the '<em><b>Parent Emisson</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXPRESSION__PARENT_EMISSON = eINSTANCE.getExpression_ParentEmisson();

        /**
         * The meta object literal for the '<em><b>Parent Assignment</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXPRESSION__PARENT_ASSIGNMENT = eINSTANCE.getExpression_ParentAssignment();

        /**
         * The meta object literal for the '<em><b>Parent Expression</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXPRESSION__PARENT_EXPRESSION = eINSTANCE.getExpression_ParentExpression();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.HostCodeImpl <em>Host Code</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.impl.HostCodeImpl
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getHostCode()
         * @generated
         */
        EClass HOST_CODE = eINSTANCE.getHostCode();

        /**
         * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HOST_CODE__CODE = eINSTANCE.getHostCode_Code();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HOST_CODE__TYPE = eINSTANCE.getHostCode_Type();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.RegionImpl <em>Region</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.impl.RegionImpl
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getRegion()
         * @generated
         */
        EClass REGION = eINSTANCE.getRegion();

        /**
         * The meta object literal for the '<em><b>Inner States</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REGION__INNER_STATES = eINSTANCE.getRegion_InnerStates();

        /**
         * The meta object literal for the '<em><b>Parent State</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REGION__PARENT_STATE = eINSTANCE.getRegion_ParentState();

        /**
         * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REGION__VARIABLES = eINSTANCE.getRegion_Variables();

        /**
         * The meta object literal for the '<em><b>Signals</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REGION__SIGNALS = eINSTANCE.getRegion_Signals();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REGION__ID = eINSTANCE.getRegion_Id();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.SignalImpl <em>Signal</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.impl.SignalImpl
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getSignal()
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
         * The meta object literal for the '<em><b>Parent State</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SIGNAL__PARENT_STATE = eINSTANCE.getSignal_ParentState();

        /**
         * The meta object literal for the '<em><b>Is Local</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SIGNAL__IS_LOCAL = eINSTANCE.getSignal_IsLocal();

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
         * The meta object literal for the '<em><b>Parent Region</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SIGNAL__PARENT_REGION = eINSTANCE.getSignal_ParentRegion();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.SignalReferenceImpl <em>Signal Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.impl.SignalReferenceImpl
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getSignalReference()
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
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.SignalRenamingImpl <em>Signal Renaming</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.impl.SignalRenamingImpl
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getSignalRenaming()
         * @generated
         */
        EClass SIGNAL_RENAMING = eINSTANCE.getSignalRenaming();

        /**
         * The meta object literal for the '<em><b>Old Signal</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SIGNAL_RENAMING__OLD_SIGNAL = eINSTANCE.getSignalRenaming_OldSignal();

        /**
         * The meta object literal for the '<em><b>New Signal</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SIGNAL_RENAMING__NEW_SIGNAL = eINSTANCE.getSignalRenaming_NewSignal();

        /**
         * The meta object literal for the '<em><b>Parent State</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SIGNAL_RENAMING__PARENT_STATE = eINSTANCE.getSignalRenaming_ParentState();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.StateImpl <em>State</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.impl.StateImpl
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getState()
         * @generated
         */
        EClass STATE = eINSTANCE.getState();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STATE__ID = eINSTANCE.getState_Id();

        /**
         * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STATE__LABEL = eINSTANCE.getState_Label();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STATE__TYPE = eINSTANCE.getState_Type();

        /**
         * The meta object literal for the '<em><b>Signals</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STATE__SIGNALS = eINSTANCE.getState_Signals();

        /**
         * The meta object literal for the '<em><b>Regions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STATE__REGIONS = eINSTANCE.getState_Regions();

        /**
         * The meta object literal for the '<em><b>Entry Actions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STATE__ENTRY_ACTIONS = eINSTANCE.getState_EntryActions();

        /**
         * The meta object literal for the '<em><b>Inner Actions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STATE__INNER_ACTIONS = eINSTANCE.getState_InnerActions();

        /**
         * The meta object literal for the '<em><b>Exit Actions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STATE__EXIT_ACTIONS = eINSTANCE.getState_ExitActions();

        /**
         * The meta object literal for the '<em><b>Signal Renamings</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STATE__SIGNAL_RENAMINGS = eINSTANCE.getState_SignalRenamings();

        /**
         * The meta object literal for the '<em><b>Suspension Trigger</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STATE__SUSPENSION_TRIGGER = eINSTANCE.getState_SuspensionTrigger();

        /**
         * The meta object literal for the '<em><b>Outgoing Transitions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STATE__OUTGOING_TRANSITIONS = eINSTANCE.getState_OutgoingTransitions();

        /**
         * The meta object literal for the '<em><b>Parent Region</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STATE__PARENT_REGION = eINSTANCE.getState_ParentRegion();

        /**
         * The meta object literal for the '<em><b>Is Initial</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STATE__IS_INITIAL = eINSTANCE.getState_IsInitial();

        /**
         * The meta object literal for the '<em><b>Is Final</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STATE__IS_FINAL = eINSTANCE.getState_IsFinal();

        /**
         * The meta object literal for the '<em><b>Body Text</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STATE__BODY_TEXT = eINSTANCE.getState_BodyText();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.TransitionImpl <em>Transition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.impl.TransitionImpl
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getTransition()
         * @generated
         */
        EClass TRANSITION = eINSTANCE.getTransition();

        /**
         * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TRANSITION__PRIORITY = eINSTANCE.getTransition_Priority();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TRANSITION__TYPE = eINSTANCE.getTransition_Type();

        /**
         * The meta object literal for the '<em><b>Target State</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TRANSITION__TARGET_STATE = eINSTANCE.getTransition_TargetState();

        /**
         * The meta object literal for the '<em><b>Source State</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TRANSITION__SOURCE_STATE = eINSTANCE.getTransition_SourceState();

        /**
         * The meta object literal for the '<em><b>Is History</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TRANSITION__IS_HISTORY = eINSTANCE.getTransition_IsHistory();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.ValuedObjectImpl <em>Valued Object</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.impl.ValuedObjectImpl
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getValuedObject()
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
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.VariableImpl <em>Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.impl.VariableImpl
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getVariable()
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
         * The meta object literal for the '<em><b>Parent Region</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VARIABLE__PARENT_REGION = eINSTANCE.getVariable_ParentRegion();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.impl.VariableReferenceImpl
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getVariableReference()
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
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.CombineOperator <em>Combine Operator</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.CombineOperator
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getCombineOperator()
         * @generated
         */
        EEnum COMBINE_OPERATOR = eINSTANCE.getCombineOperator();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.OperatorType <em>Operator Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.OperatorType
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getOperatorType()
         * @generated
         */
        EEnum OPERATOR_TYPE = eINSTANCE.getOperatorType();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.StateType <em>State Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.StateType
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getStateType()
         * @generated
         */
        EEnum STATE_TYPE = eINSTANCE.getStateType();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.TransitionType <em>Transition Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.TransitionType
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getTransitionType()
         * @generated
         */
        EEnum TRANSITION_TYPE = eINSTANCE.getTransitionType();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.ValueType <em>Value Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.ValueType
         * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getValueType()
         * @generated
         */
        EEnum VALUE_TYPE = eINSTANCE.getValueType();

    }

} //SyncchartsPackage
