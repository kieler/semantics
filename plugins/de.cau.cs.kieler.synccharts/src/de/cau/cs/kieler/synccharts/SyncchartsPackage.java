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
package de.cau.cs.kieler.synccharts;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
	String eNS_URI = "http://kieler.cs.cau.de/synccharts/0.2";

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
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DELAY = 2;

	/**
	 * The feature id for the '<em><b>Is Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__IS_IMMEDIATE = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__LABEL = 4;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 5;

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
	 * The number of structural features of the '<em>Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_FEATURE_COUNT = 0;

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
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

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
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.EmissionImpl <em>Emission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts.impl.EmissionImpl
	 * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getEmission()
	 * @generated
	 */
	int EMISSION = 4;

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
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.TextualCodeImpl <em>Textual Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts.impl.TextualCodeImpl
	 * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getTextualCode()
	 * @generated
	 */
	int TEXTUAL_CODE = 6;

	/**
	 * The feature id for the '<em><b>Sub Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CODE__SUB_EXPRESSIONS = EFFECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CODE__CODE = EFFECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CODE__TYPE = EFFECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Textual Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CODE_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.ScopeImpl <em>Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts.impl.ScopeImpl
	 * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getScope()
	 * @generated
	 */
	int SCOPE = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Signals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__SIGNALS = 2;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__VARIABLES = 3;

	/**
	 * The feature id for the '<em><b>Suspension Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__SUSPENSION_TRIGGER = 4;

	/**
	 * The feature id for the '<em><b>Exit Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__EXIT_ACTIONS = 5;

	/**
	 * The feature id for the '<em><b>Inner Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__INNER_ACTIONS = 6;

	/**
	 * The feature id for the '<em><b>Entry Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__ENTRY_ACTIONS = 7;

	/**
	 * The feature id for the '<em><b>Body Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__BODY_REFERENCE = 8;

	/**
	 * The feature id for the '<em><b>Body Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__BODY_CONTENTS = 9;

	/**
	 * The feature id for the '<em><b>Body Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__BODY_TEXT = 10;

	/**
	 * The feature id for the '<em><b>Renamings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__RENAMINGS = 11;

	/**
	 * The feature id for the '<em><b>Interface Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__INTERFACE_DECLARATION = 12;

	/**
	 * The number of structural features of the '<em>Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_FEATURE_COUNT = 13;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__ID = SCOPE__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__LABEL = SCOPE__LABEL;

	/**
	 * The feature id for the '<em><b>Signals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__SIGNALS = SCOPE__SIGNALS;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__VARIABLES = SCOPE__VARIABLES;

	/**
	 * The feature id for the '<em><b>Suspension Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__SUSPENSION_TRIGGER = SCOPE__SUSPENSION_TRIGGER;

	/**
	 * The feature id for the '<em><b>Exit Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__EXIT_ACTIONS = SCOPE__EXIT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Inner Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__INNER_ACTIONS = SCOPE__INNER_ACTIONS;

	/**
	 * The feature id for the '<em><b>Entry Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__ENTRY_ACTIONS = SCOPE__ENTRY_ACTIONS;

	/**
	 * The feature id for the '<em><b>Body Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__BODY_REFERENCE = SCOPE__BODY_REFERENCE;

	/**
	 * The feature id for the '<em><b>Body Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__BODY_CONTENTS = SCOPE__BODY_CONTENTS;

	/**
	 * The feature id for the '<em><b>Body Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__BODY_TEXT = SCOPE__BODY_TEXT;

	/**
	 * The feature id for the '<em><b>Renamings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__RENAMINGS = SCOPE__RENAMINGS;

	/**
	 * The feature id for the '<em><b>Interface Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__INTERFACE_DECLARATION = SCOPE__INTERFACE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Inner States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__INNER_STATES = SCOPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent State</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__PARENT_STATE = SCOPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Parent Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__PARENT_SCOPE = VALUED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FEATURE_COUNT = VALUED_OBJECT_FEATURE_COUNT + 6;

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
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.SubstitutionImpl <em>Substitution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts.impl.SubstitutionImpl
	 * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getSubstitution()
	 * @generated
	 */
	int SUBSTITUTION = 10;

	/**
	 * The feature id for the '<em><b>Parent Scope</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION__PARENT_SCOPE = 0;

	/**
	 * The feature id for the '<em><b>Formal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION__FORMAL = 1;

	/**
	 * The feature id for the '<em><b>Actual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION__ACTUAL = 2;

	/**
	 * The number of structural features of the '<em>Substitution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_FEATURE_COUNT = 3;

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
	int STATE__ID = SCOPE__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__LABEL = SCOPE__LABEL;

	/**
	 * The feature id for the '<em><b>Signals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
				 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
				int STATE__SIGNALS = SCOPE__SIGNALS;

				/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__VARIABLES = SCOPE__VARIABLES;

				/**
	 * The feature id for the '<em><b>Suspension Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
				 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
				int STATE__SUSPENSION_TRIGGER = SCOPE__SUSPENSION_TRIGGER;

				/**
	 * The feature id for the '<em><b>Exit Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
				 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
				int STATE__EXIT_ACTIONS = SCOPE__EXIT_ACTIONS;

				/**
	 * The feature id for the '<em><b>Inner Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
				 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
				int STATE__INNER_ACTIONS = SCOPE__INNER_ACTIONS;

				/**
	 * The feature id for the '<em><b>Entry Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
				 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
				int STATE__ENTRY_ACTIONS = SCOPE__ENTRY_ACTIONS;

				/**
	 * The feature id for the '<em><b>Body Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
				    * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
				   int STATE__BODY_REFERENCE = SCOPE__BODY_REFERENCE;

				/**
	 * The feature id for the '<em><b>Body Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STATE__BODY_CONTENTS = SCOPE__BODY_CONTENTS;

				/**
	 * The feature id for the '<em><b>Body Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
				int STATE__BODY_TEXT = SCOPE__BODY_TEXT;

				/**
	 * The feature id for the '<em><b>Renamings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
				int STATE__RENAMINGS = SCOPE__RENAMINGS;

				/**
	 * The feature id for the '<em><b>Interface Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STATE__INTERFACE_DECLARATION = SCOPE__INTERFACE_DECLARATION;

				/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
				 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
							int STATE__TYPE = SCOPE_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>Regions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
				int STATE__REGIONS = SCOPE_FEATURE_COUNT + 1;

				/**
	 * The feature id for the '<em><b>Parent Region</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
				int STATE__PARENT_REGION = SCOPE_FEATURE_COUNT + 2;

				/**
	 * The feature id for the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
				int STATE__IS_INITIAL = SCOPE_FEATURE_COUNT + 3;

				/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
				int STATE__IS_FINAL = SCOPE_FEATURE_COUNT + 4;

				/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
				int STATE__OUTGOING_TRANSITIONS = SCOPE_FEATURE_COUNT + 5;

				/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMING_TRANSITIONS = SCOPE_FEATURE_COUNT + 6;

				/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 7;

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
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__LABEL = ACTION__LABEL;

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
	 * The feature id for the '<em><b>Is History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__IS_HISTORY = ACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Source State</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE_STATE = ACTION_FEATURE_COUNT + 4;

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
	 * The feature id for the '<em><b>Parent Scope</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__PARENT_SCOPE = VALUED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__CONST = VALUED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = VALUED_OBJECT_FEATURE_COUNT + 3;

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
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts.impl.ValueImpl
	 * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 16;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.IntValueImpl <em>Int Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts.impl.IntValueImpl
	 * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getIntValue()
	 * @generated
	 */
	int INT_VALUE = 17;

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
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.FloatValueImpl <em>Float Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts.impl.FloatValueImpl
	 * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getFloatValue()
	 * @generated
	 */
	int FLOAT_VALUE = 18;

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
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts.impl.BooleanValueImpl
	 * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getBooleanValue()
	 * @generated
	 */
	int BOOLEAN_VALUE = 19;

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
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.OperatorExpressionImpl <em>Operator Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts.impl.OperatorExpressionImpl
	 * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getOperatorExpression()
	 * @generated
	 */
	int OPERATOR_EXPRESSION = 21;

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
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts.CombineOperator <em>Combine Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts.CombineOperator
	 * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getCombineOperator()
	 * @generated
	 */
	int COMBINE_OPERATOR = 22;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts.OperatorType <em>Operator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts.OperatorType
	 * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getOperatorType()
	 * @generated
	 */
	int OPERATOR_TYPE = 23;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts.StateType <em>State Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts.StateType
	 * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getStateType()
	 * @generated
	 */
	int STATE_TYPE = 24;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts.TransitionType <em>Transition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts.TransitionType
	 * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getTransitionType()
	 * @generated
	 */
	int TRANSITION_TYPE = 25;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts.ValueType <em>Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts.ValueType
	 * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getValueType()
	 * @generated
	 */
	int VALUE_TYPE = 26;


	/**
	 * The meta object id for the '<em>Parsable</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getParsable()
	 * @generated
	 */
	int PARSABLE = 27;


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
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.Action#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see de.cau.cs.kieler.synccharts.Action#getLabel()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Label();

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
	 * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.Effect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Effect</em>'.
	 * @see de.cau.cs.kieler.synccharts.Effect
	 * @generated
	 */
	EClass getEffect();

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
	 * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.TextualCode <em>Textual Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textual Code</em>'.
	 * @see de.cau.cs.kieler.synccharts.TextualCode
	 * @generated
	 */
	EClass getTextualCode();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.TextualCode#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see de.cau.cs.kieler.synccharts.TextualCode#getCode()
	 * @see #getTextualCode()
	 * @generated
	 */
	EAttribute getTextualCode_Code();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.TextualCode#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.cau.cs.kieler.synccharts.TextualCode#getType()
	 * @see #getTextualCode()
	 * @generated
	 */
	EAttribute getTextualCode_Type();

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
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts.Signal#getParentScope <em>Parent Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Scope</em>'.
	 * @see de.cau.cs.kieler.synccharts.Signal#getParentScope()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_ParentScope();

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
	 * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.Substitution <em>Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substitution</em>'.
	 * @see de.cau.cs.kieler.synccharts.Substitution
	 * @generated
	 */
	EClass getSubstitution();

	/**
	 * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts.Substitution#getParentScope <em>Parent Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Scope</em>'.
	 * @see de.cau.cs.kieler.synccharts.Substitution#getParentScope()
	 * @see #getSubstitution()
	 * @generated
	 */
	EReference getSubstitution_ParentScope();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.Substitution#getFormal <em>Formal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formal</em>'.
	 * @see de.cau.cs.kieler.synccharts.Substitution#getFormal()
	 * @see #getSubstitution()
	 * @generated
	 */
	EAttribute getSubstitution_Formal();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.Substitution#getActual <em>Actual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual</em>'.
	 * @see de.cau.cs.kieler.synccharts.Substitution#getActual()
	 * @see #getSubstitution()
	 * @generated
	 */
	EAttribute getSubstitution_Actual();

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
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.synccharts.State#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Transitions</em>'.
	 * @see de.cau.cs.kieler.synccharts.State#getIncomingTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_IncomingTransitions();

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
	 * Returns the meta object for the container reference '{@link de.cau.cs.kieler.synccharts.Variable#getParentScope <em>Parent Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Scope</em>'.
	 * @see de.cau.cs.kieler.synccharts.Variable#getParentScope()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_ParentScope();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.Variable#isConst <em>Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Const</em>'.
	 * @see de.cau.cs.kieler.synccharts.Variable#isConst()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Const();

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
	 * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see de.cau.cs.kieler.synccharts.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.IntValue <em>Int Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Value</em>'.
	 * @see de.cau.cs.kieler.synccharts.IntValue
	 * @generated
	 */
	EClass getIntValue();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.IntValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.cau.cs.kieler.synccharts.IntValue#getValue()
	 * @see #getIntValue()
	 * @generated
	 */
	EAttribute getIntValue_Value();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.FloatValue <em>Float Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Value</em>'.
	 * @see de.cau.cs.kieler.synccharts.FloatValue
	 * @generated
	 */
	EClass getFloatValue();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.FloatValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.cau.cs.kieler.synccharts.FloatValue#getValue()
	 * @see #getFloatValue()
	 * @generated
	 */
	EAttribute getFloatValue_Value();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value</em>'.
	 * @see de.cau.cs.kieler.synccharts.BooleanValue
	 * @generated
	 */
	EClass getBooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.BooleanValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.cau.cs.kieler.synccharts.BooleanValue#getValue()
	 * @see #getBooleanValue()
	 * @generated
	 */
	EAttribute getBooleanValue_Value();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope</em>'.
	 * @see de.cau.cs.kieler.synccharts.Scope
	 * @generated
	 */
	EClass getScope();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.Scope#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.cau.cs.kieler.synccharts.Scope#getId()
	 * @see #getScope()
	 * @generated
	 */
	EAttribute getScope_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.Scope#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see de.cau.cs.kieler.synccharts.Scope#getLabel()
	 * @see #getScope()
	 * @generated
	 */
	EAttribute getScope_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.Scope#getSignals <em>Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signals</em>'.
	 * @see de.cau.cs.kieler.synccharts.Scope#getSignals()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Signals();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.Scope#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see de.cau.cs.kieler.synccharts.Scope#getVariables()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Variables();

	/**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts.Scope#getSuspensionTrigger <em>Suspension Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Suspension Trigger</em>'.
	 * @see de.cau.cs.kieler.synccharts.Scope#getSuspensionTrigger()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_SuspensionTrigger();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.Scope#getExitActions <em>Exit Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exit Actions</em>'.
	 * @see de.cau.cs.kieler.synccharts.Scope#getExitActions()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_ExitActions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.Scope#getInnerActions <em>Inner Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inner Actions</em>'.
	 * @see de.cau.cs.kieler.synccharts.Scope#getInnerActions()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_InnerActions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.Scope#getEntryActions <em>Entry Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry Actions</em>'.
	 * @see de.cau.cs.kieler.synccharts.Scope#getEntryActions()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_EntryActions();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts.Scope#getBodyReference <em>Body Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Body Reference</em>'.
	 * @see de.cau.cs.kieler.synccharts.Scope#getBodyReference()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_BodyReference();

	/**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts.Scope#getBodyContents <em>Body Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body Contents</em>'.
	 * @see de.cau.cs.kieler.synccharts.Scope#getBodyContents()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_BodyContents();

	/**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts.Scope#getBodyText <em>Body Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body Text</em>'.
	 * @see de.cau.cs.kieler.synccharts.Scope#getBodyText()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_BodyText();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.Scope#getRenamings <em>Renamings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Renamings</em>'.
	 * @see de.cau.cs.kieler.synccharts.Scope#getRenamings()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Renamings();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.Scope#getInterfaceDeclaration <em>Interface Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Declaration</em>'.
	 * @see de.cau.cs.kieler.synccharts.Scope#getInterfaceDeclaration()
	 * @see #getScope()
	 * @generated
	 */
	EAttribute getScope_InterfaceDeclaration();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.OperatorExpression <em>Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator Expression</em>'.
	 * @see de.cau.cs.kieler.synccharts.OperatorExpression
	 * @generated
	 */
	EClass getOperatorExpression();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.OperatorExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see de.cau.cs.kieler.synccharts.OperatorExpression#getOperator()
	 * @see #getOperatorExpression()
	 * @generated
	 */
	EAttribute getOperatorExpression_Operator();

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
	 * Returns the meta object for data type '{@link java.lang.String <em>Parsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Parsable</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getParsable();

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
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__LABEL = eINSTANCE.getAction_Label();

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
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.EffectImpl <em>Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts.impl.EffectImpl
		 * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getEffect()
		 * @generated
		 */
		EClass EFFECT = eINSTANCE.getEffect();

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
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.TextualCodeImpl <em>Textual Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts.impl.TextualCodeImpl
		 * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getTextualCode()
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
		 * The meta object literal for the '<em><b>Parent Scope</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL__PARENT_SCOPE = eINSTANCE.getSignal_ParentScope();

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
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.SubstitutionImpl <em>Substitution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts.impl.SubstitutionImpl
		 * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getSubstitution()
		 * @generated
		 */
		EClass SUBSTITUTION = eINSTANCE.getSubstitution();

		/**
		 * The meta object literal for the '<em><b>Parent Scope</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTITUTION__PARENT_SCOPE = eINSTANCE.getSubstitution_ParentScope();

		/**
		 * The meta object literal for the '<em><b>Formal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSTITUTION__FORMAL = eINSTANCE.getSubstitution_Formal();

		/**
		 * The meta object literal for the '<em><b>Actual</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSTITUTION__ACTUAL = eINSTANCE.getSubstitution_Actual();

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
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__TYPE = eINSTANCE.getState_Type();

		/**
		 * The meta object literal for the '<em><b>Regions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__REGIONS = eINSTANCE.getState_Regions();

		/**
		 * The meta object literal for the '<em><b>Outgoing Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OUTGOING_TRANSITIONS = eINSTANCE.getState_OutgoingTransitions();

		/**
		 * The meta object literal for the '<em><b>Incoming Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INCOMING_TRANSITIONS = eINSTANCE.getState_IncomingTransitions();

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
		 * The meta object literal for the '<em><b>Parent Scope</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__PARENT_SCOPE = eINSTANCE.getVariable_ParentScope();

		/**
		 * The meta object literal for the '<em><b>Const</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__CONST = eINSTANCE.getVariable_Const();

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
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts.impl.ValueImpl
		 * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.IntValueImpl <em>Int Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts.impl.IntValueImpl
		 * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getIntValue()
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
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.FloatValueImpl <em>Float Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts.impl.FloatValueImpl
		 * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getFloatValue()
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
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts.impl.BooleanValueImpl
		 * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getBooleanValue()
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
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.ScopeImpl <em>Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts.impl.ScopeImpl
		 * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getScope()
		 * @generated
		 */
		EClass SCOPE = eINSTANCE.getScope();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPE__ID = eINSTANCE.getScope_Id();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPE__LABEL = eINSTANCE.getScope_Label();

		/**
		 * The meta object literal for the '<em><b>Signals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__SIGNALS = eINSTANCE.getScope_Signals();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__VARIABLES = eINSTANCE.getScope_Variables();

		/**
		 * The meta object literal for the '<em><b>Suspension Trigger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__SUSPENSION_TRIGGER = eINSTANCE.getScope_SuspensionTrigger();

		/**
		 * The meta object literal for the '<em><b>Exit Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__EXIT_ACTIONS = eINSTANCE.getScope_ExitActions();

		/**
		 * The meta object literal for the '<em><b>Inner Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__INNER_ACTIONS = eINSTANCE.getScope_InnerActions();

		/**
		 * The meta object literal for the '<em><b>Entry Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__ENTRY_ACTIONS = eINSTANCE.getScope_EntryActions();

		/**
		 * The meta object literal for the '<em><b>Body Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__BODY_REFERENCE = eINSTANCE.getScope_BodyReference();

		/**
		 * The meta object literal for the '<em><b>Body Contents</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__BODY_CONTENTS = eINSTANCE.getScope_BodyContents();

		/**
		 * The meta object literal for the '<em><b>Body Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__BODY_TEXT = eINSTANCE.getScope_BodyText();

		/**
		 * The meta object literal for the '<em><b>Renamings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__RENAMINGS = eINSTANCE.getScope_Renamings();

		/**
		 * The meta object literal for the '<em><b>Interface Declaration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPE__INTERFACE_DECLARATION = eINSTANCE.getScope_InterfaceDeclaration();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.OperatorExpressionImpl <em>Operator Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts.impl.OperatorExpressionImpl
		 * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getOperatorExpression()
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

		/**
		 * The meta object literal for the '<em>Parsable</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getParsable()
		 * @generated
		 */
		EDataType PARSABLE = eINSTANCE.getParsable();

	}

} //SyncchartsPackage
