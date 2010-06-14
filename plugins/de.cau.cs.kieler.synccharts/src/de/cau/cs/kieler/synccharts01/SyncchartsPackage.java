/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts01;

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
 * @see de.cau.cs.kieler.synccharts01.SyncchartsFactory
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
	String eNAME = "synccharts01";

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
	String eNS_PREFIX = "synccharts01";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SyncchartsPackage eINSTANCE = de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts01.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts01.impl.ActionImpl
	 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getAction()
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
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts01.impl.EffectImpl <em>Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts01.impl.EffectImpl
	 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getEffect()
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
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts01.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts01.impl.AssignmentImpl
	 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getAssignment()
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
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts01.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts01.impl.ExpressionImpl
	 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getExpression()
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
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts01.impl.ComplexExpressionImpl <em>Complex Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts01.impl.ComplexExpressionImpl
	 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getComplexExpression()
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
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts01.impl.EmissionImpl <em>Emission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts01.impl.EmissionImpl
	 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getEmission()
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
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts01.impl.HostCodeImpl <em>Host Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts01.impl.HostCodeImpl
	 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getHostCode()
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
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts01.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts01.impl.RegionImpl
	 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getRegion()
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
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts01.impl.ValuedObjectImpl <em>Valued Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts01.impl.ValuedObjectImpl
	 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getValuedObject()
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
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts01.impl.SignalImpl <em>Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts01.impl.SignalImpl
	 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getSignal()
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
	 * The feature id for the '<em><b>Is Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__IS_INPUT = VALUED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__IS_OUTPUT = VALUED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Combine Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__COMBINE_OPERATOR = VALUED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Host Combine Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__HOST_COMBINE_OPERATOR = VALUED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parent Region</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__PARENT_REGION = VALUED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FEATURE_COUNT = VALUED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts01.impl.SignalReferenceImpl <em>Signal Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts01.impl.SignalReferenceImpl
	 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getSignalReference()
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
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts01.impl.RenamingImpl <em>Renaming</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts01.impl.RenamingImpl
	 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getRenaming()
	 * @generated
	 */
	int RENAMING = 10;

	/**
	 * The feature id for the '<em><b>Parent State</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAMING__PARENT_STATE = 0;

	/**
	 * The feature id for the '<em><b>Old ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAMING__OLD_ID = 1;

	/**
	 * The feature id for the '<em><b>New ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAMING__NEW_ID = 2;

	/**
	 * The number of structural features of the '<em>Renaming</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAMING_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts01.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts01.impl.StateImpl
	 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getState()
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
	 * The feature id for the '<em><b>Renamings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__RENAMINGS = 8;

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
	 * The feature id for the '<em><b>Body Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__BODY_REFERENCE = 15;

	/**
	 * The feature id for the '<em><b>Body Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__BODY_CONTENTS = 16;

	/**
	 * The feature id for the '<em><b>Interface Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INTERFACE_DECLARATION = 17;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 18;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts01.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts01.impl.TransitionImpl
	 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getTransition()
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
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts01.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts01.impl.VariableImpl
	 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getVariable()
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
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts01.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts01.impl.VariableReferenceImpl
	 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getVariableReference()
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
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts01.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts01.impl.ValueImpl
	 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 16;

	/**
	 * The feature id for the '<em><b>Parent Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__PARENT_ACTION = EXPRESSION__PARENT_ACTION;

	/**
	 * The feature id for the '<em><b>Parent Emisson</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__PARENT_EMISSON = EXPRESSION__PARENT_EMISSON;

	/**
	 * The feature id for the '<em><b>Parent Assignment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__PARENT_ASSIGNMENT = EXPRESSION__PARENT_ASSIGNMENT;

	/**
	 * The feature id for the '<em><b>Parent Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__PARENT_EXPRESSION = EXPRESSION__PARENT_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts01.impl.IntValueImpl <em>Int Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts01.impl.IntValueImpl
	 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getIntValue()
	 * @generated
	 */
	int INT_VALUE = 17;

	/**
	 * The feature id for the '<em><b>Parent Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VALUE__PARENT_ACTION = VALUE__PARENT_ACTION;

	/**
	 * The feature id for the '<em><b>Parent Emisson</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VALUE__PARENT_EMISSON = VALUE__PARENT_EMISSON;

	/**
	 * The feature id for the '<em><b>Parent Assignment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VALUE__PARENT_ASSIGNMENT = VALUE__PARENT_ASSIGNMENT;

	/**
	 * The feature id for the '<em><b>Parent Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VALUE__PARENT_EXPRESSION = VALUE__PARENT_EXPRESSION;

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
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts01.impl.FloatValueImpl <em>Float Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts01.impl.FloatValueImpl
	 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getFloatValue()
	 * @generated
	 */
	int FLOAT_VALUE = 18;

	/**
	 * The feature id for the '<em><b>Parent Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_VALUE__PARENT_ACTION = VALUE__PARENT_ACTION;

	/**
	 * The feature id for the '<em><b>Parent Emisson</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_VALUE__PARENT_EMISSON = VALUE__PARENT_EMISSON;

	/**
	 * The feature id for the '<em><b>Parent Assignment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_VALUE__PARENT_ASSIGNMENT = VALUE__PARENT_ASSIGNMENT;

	/**
	 * The feature id for the '<em><b>Parent Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_VALUE__PARENT_EXPRESSION = VALUE__PARENT_EXPRESSION;

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
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts01.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts01.impl.BooleanValueImpl
	 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getBooleanValue()
	 * @generated
	 */
	int BOOLEAN_VALUE = 19;

	/**
	 * The feature id for the '<em><b>Parent Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__PARENT_ACTION = VALUE__PARENT_ACTION;

	/**
	 * The feature id for the '<em><b>Parent Emisson</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__PARENT_EMISSON = VALUE__PARENT_EMISSON;

	/**
	 * The feature id for the '<em><b>Parent Assignment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__PARENT_ASSIGNMENT = VALUE__PARENT_ASSIGNMENT;

	/**
	 * The feature id for the '<em><b>Parent Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__PARENT_EXPRESSION = VALUE__PARENT_EXPRESSION;

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
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts01.CombineOperator <em>Combine Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts01.CombineOperator
	 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getCombineOperator()
	 * @generated
	 */
	int COMBINE_OPERATOR = 20;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts01.OperatorType <em>Operator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts01.OperatorType
	 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getOperatorType()
	 * @generated
	 */
	int OPERATOR_TYPE = 21;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts01.StateType <em>State Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts01.StateType
	 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getStateType()
	 * @generated
	 */
	int STATE_TYPE = 22;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts01.TransitionType <em>Transition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts01.TransitionType
	 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getTransitionType()
	 * @generated
	 */
	int TRANSITION_TYPE = 23;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts01.ValueType <em>Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts01.ValueType
	 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getValueType()
	 * @generated
	 */
	int VALUE_TYPE = 24;


	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts01.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts01.Action#getEffects <em>Effects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Effects</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Action#getEffects()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Effects();

	/**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts01.Action#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trigger</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Action#getTrigger()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Trigger();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts01.Action#getTriggersAndEffects <em>Triggers And Effects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Triggers And Effects</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Action#getTriggersAndEffects()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_TriggersAndEffects();

	/**
	 * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts01.Action#getParentStateEntryAction <em>Parent State Entry Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent State Entry Action</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Action#getParentStateEntryAction()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_ParentStateEntryAction();

	/**
	 * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts01.Action#getParentStateInnerAction <em>Parent State Inner Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent State Inner Action</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Action#getParentStateInnerAction()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_ParentStateInnerAction();

	/**
	 * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts01.Action#getParentStateExitAction <em>Parent State Exit Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent State Exit Action</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Action#getParentStateExitAction()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_ParentStateExitAction();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts01.Action#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Action#getDelay()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Delay();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts01.Action#isIsImmediate <em>Is Immediate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Immediate</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Action#isIsImmediate()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_IsImmediate();

	/**
	 * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts01.Action#getParentStateSuspension <em>Parent State Suspension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent State Suspension</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Action#getParentStateSuspension()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_ParentStateSuspension();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts01.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts01.Assignment#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Assignment#getVariable()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts01.Assignment#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Assignment#getExpression()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Expression();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts01.ComplexExpression <em>Complex Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Expression</em>'.
	 * @see de.cau.cs.kieler.synccharts01.ComplexExpression
	 * @generated
	 */
	EClass getComplexExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts01.ComplexExpression#getSubExpressions <em>Sub Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Expressions</em>'.
	 * @see de.cau.cs.kieler.synccharts01.ComplexExpression#getSubExpressions()
	 * @see #getComplexExpression()
	 * @generated
	 */
	EReference getComplexExpression_SubExpressions();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts01.ComplexExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see de.cau.cs.kieler.synccharts01.ComplexExpression#getOperator()
	 * @see #getComplexExpression()
	 * @generated
	 */
	EAttribute getComplexExpression_Operator();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts01.Effect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Effect</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Effect
	 * @generated
	 */
	EClass getEffect();

	/**
	 * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts01.Effect#getParentEAction <em>Parent EAction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent EAction</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Effect#getParentEAction()
	 * @see #getEffect()
	 * @generated
	 */
	EReference getEffect_ParentEAction();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts01.Emission <em>Emission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emission</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Emission
	 * @generated
	 */
	EClass getEmission();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts01.Emission#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Emission#getSignal()
	 * @see #getEmission()
	 * @generated
	 */
	EReference getEmission_Signal();

	/**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts01.Emission#getNewValue <em>New Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New Value</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Emission#getNewValue()
	 * @see #getEmission()
	 * @generated
	 */
	EReference getEmission_NewValue();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts01.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts01.Expression#getParentAction <em>Parent Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Action</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Expression#getParentAction()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_ParentAction();

	/**
	 * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts01.Expression#getParentEmisson <em>Parent Emisson</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Emisson</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Expression#getParentEmisson()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_ParentEmisson();

	/**
	 * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts01.Expression#getParentAssignment <em>Parent Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Assignment</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Expression#getParentAssignment()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_ParentAssignment();

	/**
	 * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts01.Expression#getParentExpression <em>Parent Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Expression</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Expression#getParentExpression()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_ParentExpression();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts01.HostCode <em>Host Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host Code</em>'.
	 * @see de.cau.cs.kieler.synccharts01.HostCode
	 * @generated
	 */
	EClass getHostCode();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts01.HostCode#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see de.cau.cs.kieler.synccharts01.HostCode#getCode()
	 * @see #getHostCode()
	 * @generated
	 */
	EAttribute getHostCode_Code();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts01.HostCode#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.cau.cs.kieler.synccharts01.HostCode#getType()
	 * @see #getHostCode()
	 * @generated
	 */
	EAttribute getHostCode_Type();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts01.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Region
	 * @generated
	 */
	EClass getRegion();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts01.Region#getInnerStates <em>Inner States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inner States</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Region#getInnerStates()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_InnerStates();

	/**
	 * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts01.Region#getParentState <em>Parent State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent State</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Region#getParentState()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_ParentState();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts01.Region#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Region#getVariables()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Variables();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts01.Region#getSignals <em>Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signals</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Region#getSignals()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Signals();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts01.Region#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Region#getId()
	 * @see #getRegion()
	 * @generated
	 */
	EAttribute getRegion_Id();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts01.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Signal
	 * @generated
	 */
	EClass getSignal();

	/**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts01.Signal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Signal#getValue()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_Value();

	/**
	 * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts01.Signal#getParentState <em>Parent State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent State</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Signal#getParentState()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_ParentState();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts01.Signal#isIsInput <em>Is Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Input</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Signal#isIsInput()
	 * @see #getSignal()
	 * @generated
	 */
	EAttribute getSignal_IsInput();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts01.Signal#isIsOutput <em>Is Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Output</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Signal#isIsOutput()
	 * @see #getSignal()
	 * @generated
	 */
	EAttribute getSignal_IsOutput();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts01.Signal#getCombineOperator <em>Combine Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Combine Operator</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Signal#getCombineOperator()
	 * @see #getSignal()
	 * @generated
	 */
	EAttribute getSignal_CombineOperator();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts01.Signal#getHostCombineOperator <em>Host Combine Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Combine Operator</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Signal#getHostCombineOperator()
	 * @see #getSignal()
	 * @generated
	 */
	EAttribute getSignal_HostCombineOperator();

	/**
	 * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts01.Signal#getParentRegion <em>Parent Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Region</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Signal#getParentRegion()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_ParentRegion();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts01.SignalReference <em>Signal Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Reference</em>'.
	 * @see de.cau.cs.kieler.synccharts01.SignalReference
	 * @generated
	 */
	EClass getSignalReference();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts01.SignalReference#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal</em>'.
	 * @see de.cau.cs.kieler.synccharts01.SignalReference#getSignal()
	 * @see #getSignalReference()
	 * @generated
	 */
	EReference getSignalReference_Signal();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts01.Renaming <em>Renaming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Renaming</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Renaming
	 * @generated
	 */
	EClass getRenaming();

	/**
	 * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts01.Renaming#getParentState <em>Parent State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent State</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Renaming#getParentState()
	 * @see #getRenaming()
	 * @generated
	 */
	EReference getRenaming_ParentState();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts01.Renaming#getOldID <em>Old ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old ID</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Renaming#getOldID()
	 * @see #getRenaming()
	 * @generated
	 */
	EAttribute getRenaming_OldID();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts01.Renaming#getNewID <em>New ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New ID</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Renaming#getNewID()
	 * @see #getRenaming()
	 * @generated
	 */
	EAttribute getRenaming_NewID();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts01.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see de.cau.cs.kieler.synccharts01.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts01.State#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.cau.cs.kieler.synccharts01.State#getId()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts01.State#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see de.cau.cs.kieler.synccharts01.State#getLabel()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Label();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts01.State#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.cau.cs.kieler.synccharts01.State#getType()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts01.State#getSignals <em>Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signals</em>'.
	 * @see de.cau.cs.kieler.synccharts01.State#getSignals()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Signals();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts01.State#getRegions <em>Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regions</em>'.
	 * @see de.cau.cs.kieler.synccharts01.State#getRegions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Regions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts01.State#getEntryActions <em>Entry Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry Actions</em>'.
	 * @see de.cau.cs.kieler.synccharts01.State#getEntryActions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_EntryActions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts01.State#getInnerActions <em>Inner Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inner Actions</em>'.
	 * @see de.cau.cs.kieler.synccharts01.State#getInnerActions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_InnerActions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts01.State#getExitActions <em>Exit Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exit Actions</em>'.
	 * @see de.cau.cs.kieler.synccharts01.State#getExitActions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ExitActions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts01.State#getRenamings <em>Renamings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Renamings</em>'.
	 * @see de.cau.cs.kieler.synccharts01.State#getRenamings()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Renamings();

	/**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts01.State#getSuspensionTrigger <em>Suspension Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Suspension Trigger</em>'.
	 * @see de.cau.cs.kieler.synccharts01.State#getSuspensionTrigger()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_SuspensionTrigger();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts01.State#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing Transitions</em>'.
	 * @see de.cau.cs.kieler.synccharts01.State#getOutgoingTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OutgoingTransitions();

	/**
	 * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts01.State#getParentRegion <em>Parent Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Region</em>'.
	 * @see de.cau.cs.kieler.synccharts01.State#getParentRegion()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ParentRegion();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts01.State#isIsInitial <em>Is Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Initial</em>'.
	 * @see de.cau.cs.kieler.synccharts01.State#isIsInitial()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_IsInitial();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts01.State#isIsFinal <em>Is Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Final</em>'.
	 * @see de.cau.cs.kieler.synccharts01.State#isIsFinal()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_IsFinal();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts01.State#getBodyText <em>Body Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body Text</em>'.
	 * @see de.cau.cs.kieler.synccharts01.State#getBodyText()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_BodyText();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts01.State#getBodyReference <em>Body Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Body Reference</em>'.
	 * @see de.cau.cs.kieler.synccharts01.State#getBodyReference()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_BodyReference();

	/**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts01.State#getBodyContents <em>Body Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body Contents</em>'.
	 * @see de.cau.cs.kieler.synccharts01.State#getBodyContents()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_BodyContents();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts01.State#getInterfaceDeclaration <em>Interface Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Declaration</em>'.
	 * @see de.cau.cs.kieler.synccharts01.State#getInterfaceDeclaration()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_InterfaceDeclaration();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts01.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts01.Transition#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Transition#getPriority()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Priority();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts01.Transition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Transition#getType()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Type();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts01.Transition#getTargetState <em>Target State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target State</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Transition#getTargetState()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_TargetState();

	/**
	 * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts01.Transition#getSourceState <em>Source State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source State</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Transition#getSourceState()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_SourceState();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts01.Transition#isIsHistory <em>Is History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is History</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Transition#isIsHistory()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_IsHistory();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts01.ValuedObject <em>Valued Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valued Object</em>'.
	 * @see de.cau.cs.kieler.synccharts01.ValuedObject
	 * @generated
	 */
	EClass getValuedObject();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts01.ValuedObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cau.cs.kieler.synccharts01.ValuedObject#getName()
	 * @see #getValuedObject()
	 * @generated
	 */
	EAttribute getValuedObject_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts01.ValuedObject#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.cau.cs.kieler.synccharts01.ValuedObject#getType()
	 * @see #getValuedObject()
	 * @generated
	 */
	EAttribute getValuedObject_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts01.ValuedObject#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see de.cau.cs.kieler.synccharts01.ValuedObject#getInitialValue()
	 * @see #getValuedObject()
	 * @generated
	 */
	EAttribute getValuedObject_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts01.ValuedObject#getHostType <em>Host Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Type</em>'.
	 * @see de.cau.cs.kieler.synccharts01.ValuedObject#getHostType()
	 * @see #getValuedObject()
	 * @generated
	 */
	EAttribute getValuedObject_HostType();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts01.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts01.Variable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Variable#getValue()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Value();

	/**
	 * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts01.Variable#getParentRegion <em>Parent Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Region</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Variable#getParentRegion()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_ParentRegion();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts01.VariableReference <em>Variable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Reference</em>'.
	 * @see de.cau.cs.kieler.synccharts01.VariableReference
	 * @generated
	 */
	EClass getVariableReference();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts01.VariableReference#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see de.cau.cs.kieler.synccharts01.VariableReference#getVariable()
	 * @see #getVariableReference()
	 * @generated
	 */
	EReference getVariableReference_Variable();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts01.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see de.cau.cs.kieler.synccharts01.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts01.IntValue <em>Int Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Value</em>'.
	 * @see de.cau.cs.kieler.synccharts01.IntValue
	 * @generated
	 */
	EClass getIntValue();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts01.IntValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.cau.cs.kieler.synccharts01.IntValue#getValue()
	 * @see #getIntValue()
	 * @generated
	 */
	EAttribute getIntValue_Value();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts01.FloatValue <em>Float Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Value</em>'.
	 * @see de.cau.cs.kieler.synccharts01.FloatValue
	 * @generated
	 */
	EClass getFloatValue();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts01.FloatValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.cau.cs.kieler.synccharts01.FloatValue#getValue()
	 * @see #getFloatValue()
	 * @generated
	 */
	EAttribute getFloatValue_Value();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts01.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value</em>'.
	 * @see de.cau.cs.kieler.synccharts01.BooleanValue
	 * @generated
	 */
	EClass getBooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts01.BooleanValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.cau.cs.kieler.synccharts01.BooleanValue#getValue()
	 * @see #getBooleanValue()
	 * @generated
	 */
	EAttribute getBooleanValue_Value();

	/**
	 * Returns the meta object for enum '{@link de.cau.cs.kieler.synccharts01.CombineOperator <em>Combine Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Combine Operator</em>'.
	 * @see de.cau.cs.kieler.synccharts01.CombineOperator
	 * @generated
	 */
	EEnum getCombineOperator();

	/**
	 * Returns the meta object for enum '{@link de.cau.cs.kieler.synccharts01.OperatorType <em>Operator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator Type</em>'.
	 * @see de.cau.cs.kieler.synccharts01.OperatorType
	 * @generated
	 */
	EEnum getOperatorType();

	/**
	 * Returns the meta object for enum '{@link de.cau.cs.kieler.synccharts01.StateType <em>State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>State Type</em>'.
	 * @see de.cau.cs.kieler.synccharts01.StateType
	 * @generated
	 */
	EEnum getStateType();

	/**
	 * Returns the meta object for enum '{@link de.cau.cs.kieler.synccharts01.TransitionType <em>Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transition Type</em>'.
	 * @see de.cau.cs.kieler.synccharts01.TransitionType
	 * @generated
	 */
	EEnum getTransitionType();

	/**
	 * Returns the meta object for enum '{@link de.cau.cs.kieler.synccharts01.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Value Type</em>'.
	 * @see de.cau.cs.kieler.synccharts01.ValueType
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
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts01.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts01.impl.ActionImpl
		 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getAction()
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
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts01.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts01.impl.AssignmentImpl
		 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getAssignment()
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
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts01.impl.ComplexExpressionImpl <em>Complex Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts01.impl.ComplexExpressionImpl
		 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getComplexExpression()
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
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts01.impl.EffectImpl <em>Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts01.impl.EffectImpl
		 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getEffect()
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
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts01.impl.EmissionImpl <em>Emission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts01.impl.EmissionImpl
		 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getEmission()
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
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts01.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts01.impl.ExpressionImpl
		 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getExpression()
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
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts01.impl.HostCodeImpl <em>Host Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts01.impl.HostCodeImpl
		 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getHostCode()
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
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts01.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts01.impl.RegionImpl
		 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getRegion()
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
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts01.impl.SignalImpl <em>Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts01.impl.SignalImpl
		 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getSignal()
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
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts01.impl.SignalReferenceImpl <em>Signal Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts01.impl.SignalReferenceImpl
		 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getSignalReference()
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
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts01.impl.RenamingImpl <em>Renaming</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts01.impl.RenamingImpl
		 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getRenaming()
		 * @generated
		 */
		EClass RENAMING = eINSTANCE.getRenaming();

		/**
		 * The meta object literal for the '<em><b>Parent State</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENAMING__PARENT_STATE = eINSTANCE.getRenaming_ParentState();

		/**
		 * The meta object literal for the '<em><b>Old ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAMING__OLD_ID = eINSTANCE.getRenaming_OldID();

		/**
		 * The meta object literal for the '<em><b>New ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAMING__NEW_ID = eINSTANCE.getRenaming_NewID();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts01.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts01.impl.StateImpl
		 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getState()
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
		 * The meta object literal for the '<em><b>Renamings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__RENAMINGS = eINSTANCE.getState_Renamings();

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
		 * The meta object literal for the '<em><b>Body Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__BODY_REFERENCE = eINSTANCE.getState_BodyReference();

		/**
		 * The meta object literal for the '<em><b>Body Contents</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__BODY_CONTENTS = eINSTANCE.getState_BodyContents();

		/**
		 * The meta object literal for the '<em><b>Interface Declaration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__INTERFACE_DECLARATION = eINSTANCE.getState_InterfaceDeclaration();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts01.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts01.impl.TransitionImpl
		 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getTransition()
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
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts01.impl.ValuedObjectImpl <em>Valued Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts01.impl.ValuedObjectImpl
		 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getValuedObject()
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
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts01.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts01.impl.VariableImpl
		 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getVariable()
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
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts01.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts01.impl.VariableReferenceImpl
		 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getVariableReference()
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
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts01.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts01.impl.ValueImpl
		 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts01.impl.IntValueImpl <em>Int Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts01.impl.IntValueImpl
		 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getIntValue()
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
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts01.impl.FloatValueImpl <em>Float Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts01.impl.FloatValueImpl
		 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getFloatValue()
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
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts01.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts01.impl.BooleanValueImpl
		 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getBooleanValue()
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
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts01.CombineOperator <em>Combine Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts01.CombineOperator
		 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getCombineOperator()
		 * @generated
		 */
		EEnum COMBINE_OPERATOR = eINSTANCE.getCombineOperator();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts01.OperatorType <em>Operator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts01.OperatorType
		 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getOperatorType()
		 * @generated
		 */
		EEnum OPERATOR_TYPE = eINSTANCE.getOperatorType();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts01.StateType <em>State Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts01.StateType
		 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getStateType()
		 * @generated
		 */
		EEnum STATE_TYPE = eINSTANCE.getStateType();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts01.TransitionType <em>Transition Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts01.TransitionType
		 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getTransitionType()
		 * @generated
		 */
		EEnum TRANSITION_TYPE = eINSTANCE.getTransitionType();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts01.ValueType <em>Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts01.ValueType
		 * @see de.cau.cs.kieler.synccharts01.impl.SyncchartsPackageImpl#getValueType()
		 * @generated
		 */
		EEnum VALUE_TYPE = eINSTANCE.getValueType();

	}

} //SyncchartsPackage
