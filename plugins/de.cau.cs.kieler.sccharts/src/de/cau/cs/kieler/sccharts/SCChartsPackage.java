/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts;

import de.cau.cs.kieler.annotations.AnnotationsPackage;

import de.cau.cs.kieler.kexpressions.KExpressionsPackage;

import de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage;

import de.cau.cs.kieler.kexpressions.kext.KExtPackage;

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
 * @see de.cau.cs.kieler.sccharts.SCChartsFactory
 * @model kind="package"
 * @generated
 */
public interface SCChartsPackage extends EPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\r\n\r\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\r\n\r\nCopyright 2013 by\r\n+ Kiel University\r\n  + Department of Computer Science\r\n    + Real-Time and Embedded Systems Group\r\n\r\nThis code is provided under the terms of the Eclipse Public License (EPL).\r\nSee the file epl-v10.html for the license text.";

    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "sccharts";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://kieler.cs.cau.de/sccharts/0.3.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "sccharts";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SCChartsPackage eINSTANCE = de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl.init();

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.SCChartsImpl <em>SC Charts</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sccharts.impl.SCChartsImpl
     * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getSCCharts()
     * @generated
     */
    int SC_CHARTS = 0;

    /**
     * The feature id for the '<em><b>Pragmas</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SC_CHARTS__PRAGMAS = AnnotationsPackage.PRAGMATABLE__PRAGMAS;

    /**
     * The feature id for the '<em><b>Root States</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SC_CHARTS__ROOT_STATES = AnnotationsPackage.PRAGMATABLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Imports</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SC_CHARTS__IMPORTS = AnnotationsPackage.PRAGMATABLE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>SC Charts</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SC_CHARTS_FEATURE_COUNT = AnnotationsPackage.PRAGMATABLE_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.ScopeImpl <em>Scope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sccharts.impl.ScopeImpl
     * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getScope()
     * @generated
     */
    int SCOPE = 1;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE__ANNOTATIONS = AnnotationsPackage.ANNOTATABLE__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE__DECLARATIONS = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE__NAME = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE__SCHEDULE = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Outgoing Links</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE__OUTGOING_LINKS = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE__INCOMING_LINKS = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE__LABEL = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Actions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE__ACTIONS = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE__REFERENCE = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Generic Parameter Declarations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE__GENERIC_PARAMETER_DECLARATIONS = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 8;

    /**
     * The number of structural features of the '<em>Scope</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE_FEATURE_COUNT = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 9;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.ScopeCallImpl <em>Scope Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sccharts.impl.ScopeCallImpl
     * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getScopeCall()
     * @generated
     */
    int SCOPE_CALL = 2;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE_CALL__SCHEDULE = KExpressionsPackage.CALL__SCHEDULE;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE_CALL__PARAMETERS = KExpressionsPackage.CALL__PARAMETERS;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE_CALL__TARGET = KExpressionsPackage.CALL_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Super</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE_CALL__SUPER = KExpressionsPackage.CALL_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Generic Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE_CALL__GENERIC_PARAMETERS = KExpressionsPackage.CALL_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Scope Call</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE_CALL_FEATURE_COUNT = KExpressionsPackage.CALL_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sccharts.impl.ActionImpl
     * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getAction()
     * @generated
     */
    int ACTION = 3;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__ANNOTATIONS = AnnotationsPackage.ANNOTATABLE__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Outgoing Links</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__OUTGOING_LINKS = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__INCOMING_LINKS = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Effects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__EFFECTS = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Trigger</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__TRIGGER = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Trigger Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__TRIGGER_DELAY = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Trigger Probability</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__TRIGGER_PROBABILITY = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__LABEL = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__DELAY = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Nondeterministic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__NONDETERMINISTIC = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 8;

    /**
     * The number of structural features of the '<em>Action</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_FEATURE_COUNT = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 9;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.LocalActionImpl <em>Local Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sccharts.impl.LocalActionImpl
     * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getLocalAction()
     * @generated
     */
    int LOCAL_ACTION = 4;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ACTION__ANNOTATIONS = ACTION__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Outgoing Links</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ACTION__OUTGOING_LINKS = ACTION__OUTGOING_LINKS;

    /**
     * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ACTION__INCOMING_LINKS = ACTION__INCOMING_LINKS;

    /**
     * The feature id for the '<em><b>Effects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ACTION__EFFECTS = ACTION__EFFECTS;

    /**
     * The feature id for the '<em><b>Trigger</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ACTION__TRIGGER = ACTION__TRIGGER;

    /**
     * The feature id for the '<em><b>Trigger Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ACTION__TRIGGER_DELAY = ACTION__TRIGGER_DELAY;

    /**
     * The feature id for the '<em><b>Trigger Probability</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ACTION__TRIGGER_PROBABILITY = ACTION__TRIGGER_PROBABILITY;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ACTION__LABEL = ACTION__LABEL;

    /**
     * The feature id for the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ACTION__DELAY = ACTION__DELAY;

    /**
     * The feature id for the '<em><b>Nondeterministic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ACTION__NONDETERMINISTIC = ACTION__NONDETERMINISTIC;

    /**
     * The number of structural features of the '<em>Local Action</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sccharts.impl.StateImpl
     * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getState()
     * @generated
     */
    int STATE = 5;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__ANNOTATIONS = SCOPE__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__DECLARATIONS = SCOPE__DECLARATIONS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__NAME = SCOPE__NAME;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__SCHEDULE = SCOPE__SCHEDULE;

    /**
     * The feature id for the '<em><b>Outgoing Links</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__OUTGOING_LINKS = SCOPE__OUTGOING_LINKS;

    /**
     * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__INCOMING_LINKS = SCOPE__INCOMING_LINKS;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__LABEL = SCOPE__LABEL;

    /**
     * The feature id for the '<em><b>Actions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__ACTIONS = SCOPE__ACTIONS;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__REFERENCE = SCOPE__REFERENCE;

    /**
     * The feature id for the '<em><b>Generic Parameter Declarations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__GENERIC_PARAMETER_DECLARATIONS = SCOPE__GENERIC_PARAMETER_DECLARATIONS;

    /**
     * The feature id for the '<em><b>Parent Region</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__PARENT_REGION = SCOPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Regions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__REGIONS = SCOPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Initial</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__INITIAL = SCOPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Final</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__FINAL = SCOPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Violation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__VIOLATION = SCOPE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Connector</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__CONNECTOR = SCOPE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Outgoing Transitions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__OUTGOING_TRANSITIONS = SCOPE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__INCOMING_TRANSITIONS = SCOPE_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Base State References</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__BASE_STATE_REFERENCES = SCOPE_FEATURE_COUNT + 8;

    /**
     * The number of structural features of the '<em>State</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 9;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.RegionImpl <em>Region</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sccharts.impl.RegionImpl
     * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getRegion()
     * @generated
     */
    int REGION = 6;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGION__ANNOTATIONS = SCOPE__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGION__DECLARATIONS = SCOPE__DECLARATIONS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGION__NAME = SCOPE__NAME;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGION__SCHEDULE = SCOPE__SCHEDULE;

    /**
     * The feature id for the '<em><b>Outgoing Links</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGION__OUTGOING_LINKS = SCOPE__OUTGOING_LINKS;

    /**
     * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGION__INCOMING_LINKS = SCOPE__INCOMING_LINKS;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGION__LABEL = SCOPE__LABEL;

    /**
     * The feature id for the '<em><b>Actions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGION__ACTIONS = SCOPE__ACTIONS;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGION__REFERENCE = SCOPE__REFERENCE;

    /**
     * The feature id for the '<em><b>Generic Parameter Declarations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGION__GENERIC_PARAMETER_DECLARATIONS = SCOPE__GENERIC_PARAMETER_DECLARATIONS;

    /**
     * The feature id for the '<em><b>Parent State</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGION__PARENT_STATE = SCOPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Counter Variable</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGION__COUNTER_VARIABLE = SCOPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>For Start</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGION__FOR_START = SCOPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>For End</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGION__FOR_END = SCOPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Override</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGION__OVERRIDE = SCOPE_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Region</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGION_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 5;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.ControlflowRegionImpl <em>Controlflow Region</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sccharts.impl.ControlflowRegionImpl
     * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getControlflowRegion()
     * @generated
     */
    int CONTROLFLOW_REGION = 7;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLFLOW_REGION__ANNOTATIONS = REGION__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLFLOW_REGION__DECLARATIONS = REGION__DECLARATIONS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLFLOW_REGION__NAME = REGION__NAME;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLFLOW_REGION__SCHEDULE = REGION__SCHEDULE;

    /**
     * The feature id for the '<em><b>Outgoing Links</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLFLOW_REGION__OUTGOING_LINKS = REGION__OUTGOING_LINKS;

    /**
     * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLFLOW_REGION__INCOMING_LINKS = REGION__INCOMING_LINKS;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLFLOW_REGION__LABEL = REGION__LABEL;

    /**
     * The feature id for the '<em><b>Actions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLFLOW_REGION__ACTIONS = REGION__ACTIONS;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLFLOW_REGION__REFERENCE = REGION__REFERENCE;

    /**
     * The feature id for the '<em><b>Generic Parameter Declarations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLFLOW_REGION__GENERIC_PARAMETER_DECLARATIONS = REGION__GENERIC_PARAMETER_DECLARATIONS;

    /**
     * The feature id for the '<em><b>Parent State</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLFLOW_REGION__PARENT_STATE = REGION__PARENT_STATE;

    /**
     * The feature id for the '<em><b>Counter Variable</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLFLOW_REGION__COUNTER_VARIABLE = REGION__COUNTER_VARIABLE;

    /**
     * The feature id for the '<em><b>For Start</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLFLOW_REGION__FOR_START = REGION__FOR_START;

    /**
     * The feature id for the '<em><b>For End</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLFLOW_REGION__FOR_END = REGION__FOR_END;

    /**
     * The feature id for the '<em><b>Override</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLFLOW_REGION__OVERRIDE = REGION__OVERRIDE;

    /**
     * The feature id for the '<em><b>States</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLFLOW_REGION__STATES = REGION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Final</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLFLOW_REGION__FINAL = REGION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Abort</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLFLOW_REGION__ABORT = REGION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Controlflow Region</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLFLOW_REGION_FEATURE_COUNT = REGION_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.DataflowRegionImpl <em>Dataflow Region</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sccharts.impl.DataflowRegionImpl
     * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getDataflowRegion()
     * @generated
     */
    int DATAFLOW_REGION = 8;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATAFLOW_REGION__ANNOTATIONS = REGION__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATAFLOW_REGION__DECLARATIONS = REGION__DECLARATIONS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATAFLOW_REGION__NAME = REGION__NAME;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATAFLOW_REGION__SCHEDULE = REGION__SCHEDULE;

    /**
     * The feature id for the '<em><b>Outgoing Links</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATAFLOW_REGION__OUTGOING_LINKS = REGION__OUTGOING_LINKS;

    /**
     * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATAFLOW_REGION__INCOMING_LINKS = REGION__INCOMING_LINKS;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATAFLOW_REGION__LABEL = REGION__LABEL;

    /**
     * The feature id for the '<em><b>Actions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATAFLOW_REGION__ACTIONS = REGION__ACTIONS;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATAFLOW_REGION__REFERENCE = REGION__REFERENCE;

    /**
     * The feature id for the '<em><b>Generic Parameter Declarations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATAFLOW_REGION__GENERIC_PARAMETER_DECLARATIONS = REGION__GENERIC_PARAMETER_DECLARATIONS;

    /**
     * The feature id for the '<em><b>Parent State</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATAFLOW_REGION__PARENT_STATE = REGION__PARENT_STATE;

    /**
     * The feature id for the '<em><b>Counter Variable</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATAFLOW_REGION__COUNTER_VARIABLE = REGION__COUNTER_VARIABLE;

    /**
     * The feature id for the '<em><b>For Start</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATAFLOW_REGION__FOR_START = REGION__FOR_START;

    /**
     * The feature id for the '<em><b>For End</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATAFLOW_REGION__FOR_END = REGION__FOR_END;

    /**
     * The feature id for the '<em><b>Override</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATAFLOW_REGION__OVERRIDE = REGION__OVERRIDE;

    /**
     * The feature id for the '<em><b>Equations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATAFLOW_REGION__EQUATIONS = REGION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Once</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATAFLOW_REGION__ONCE = REGION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Dataflow Region</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATAFLOW_REGION_FEATURE_COUNT = REGION_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sccharts.impl.TransitionImpl
     * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getTransition()
     * @generated
     */
    int TRANSITION = 9;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSITION__ANNOTATIONS = ACTION__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Outgoing Links</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSITION__OUTGOING_LINKS = ACTION__OUTGOING_LINKS;

    /**
     * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSITION__INCOMING_LINKS = ACTION__INCOMING_LINKS;

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
     * The feature id for the '<em><b>Trigger Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSITION__TRIGGER_DELAY = ACTION__TRIGGER_DELAY;

    /**
     * The feature id for the '<em><b>Trigger Probability</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSITION__TRIGGER_PROBABILITY = ACTION__TRIGGER_PROBABILITY;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSITION__LABEL = ACTION__LABEL;

    /**
     * The feature id for the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSITION__DELAY = ACTION__DELAY;

    /**
     * The feature id for the '<em><b>Nondeterministic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSITION__NONDETERMINISTIC = ACTION__NONDETERMINISTIC;

    /**
     * The feature id for the '<em><b>Preemption</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSITION__PREEMPTION = ACTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>History</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSITION__HISTORY = ACTION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Deferred</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSITION__DEFERRED = ACTION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Target State</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSITION__TARGET_STATE = ACTION_FEATURE_COUNT + 3;

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
     * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.EntryActionImpl <em>Entry Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sccharts.impl.EntryActionImpl
     * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getEntryAction()
     * @generated
     */
    int ENTRY_ACTION = 10;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_ACTION__ANNOTATIONS = LOCAL_ACTION__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Outgoing Links</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_ACTION__OUTGOING_LINKS = LOCAL_ACTION__OUTGOING_LINKS;

    /**
     * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_ACTION__INCOMING_LINKS = LOCAL_ACTION__INCOMING_LINKS;

    /**
     * The feature id for the '<em><b>Effects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_ACTION__EFFECTS = LOCAL_ACTION__EFFECTS;

    /**
     * The feature id for the '<em><b>Trigger</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_ACTION__TRIGGER = LOCAL_ACTION__TRIGGER;

    /**
     * The feature id for the '<em><b>Trigger Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_ACTION__TRIGGER_DELAY = LOCAL_ACTION__TRIGGER_DELAY;

    /**
     * The feature id for the '<em><b>Trigger Probability</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_ACTION__TRIGGER_PROBABILITY = LOCAL_ACTION__TRIGGER_PROBABILITY;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_ACTION__LABEL = LOCAL_ACTION__LABEL;

    /**
     * The feature id for the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_ACTION__DELAY = LOCAL_ACTION__DELAY;

    /**
     * The feature id for the '<em><b>Nondeterministic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_ACTION__NONDETERMINISTIC = LOCAL_ACTION__NONDETERMINISTIC;

    /**
     * The feature id for the '<em><b>Preemption</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_ACTION__PREEMPTION = LOCAL_ACTION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Entry Action</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_ACTION_FEATURE_COUNT = LOCAL_ACTION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.DuringActionImpl <em>During Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sccharts.impl.DuringActionImpl
     * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getDuringAction()
     * @generated
     */
    int DURING_ACTION = 11;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DURING_ACTION__ANNOTATIONS = LOCAL_ACTION__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Outgoing Links</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DURING_ACTION__OUTGOING_LINKS = LOCAL_ACTION__OUTGOING_LINKS;

    /**
     * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DURING_ACTION__INCOMING_LINKS = LOCAL_ACTION__INCOMING_LINKS;

    /**
     * The feature id for the '<em><b>Effects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DURING_ACTION__EFFECTS = LOCAL_ACTION__EFFECTS;

    /**
     * The feature id for the '<em><b>Trigger</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DURING_ACTION__TRIGGER = LOCAL_ACTION__TRIGGER;

    /**
     * The feature id for the '<em><b>Trigger Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DURING_ACTION__TRIGGER_DELAY = LOCAL_ACTION__TRIGGER_DELAY;

    /**
     * The feature id for the '<em><b>Trigger Probability</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DURING_ACTION__TRIGGER_PROBABILITY = LOCAL_ACTION__TRIGGER_PROBABILITY;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DURING_ACTION__LABEL = LOCAL_ACTION__LABEL;

    /**
     * The feature id for the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DURING_ACTION__DELAY = LOCAL_ACTION__DELAY;

    /**
     * The feature id for the '<em><b>Nondeterministic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DURING_ACTION__NONDETERMINISTIC = LOCAL_ACTION__NONDETERMINISTIC;

    /**
     * The feature id for the '<em><b>Reset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DURING_ACTION__RESET = LOCAL_ACTION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>During Action</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DURING_ACTION_FEATURE_COUNT = LOCAL_ACTION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.ExitActionImpl <em>Exit Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sccharts.impl.ExitActionImpl
     * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getExitAction()
     * @generated
     */
    int EXIT_ACTION = 12;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_ACTION__ANNOTATIONS = LOCAL_ACTION__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Outgoing Links</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_ACTION__OUTGOING_LINKS = LOCAL_ACTION__OUTGOING_LINKS;

    /**
     * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_ACTION__INCOMING_LINKS = LOCAL_ACTION__INCOMING_LINKS;

    /**
     * The feature id for the '<em><b>Effects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_ACTION__EFFECTS = LOCAL_ACTION__EFFECTS;

    /**
     * The feature id for the '<em><b>Trigger</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_ACTION__TRIGGER = LOCAL_ACTION__TRIGGER;

    /**
     * The feature id for the '<em><b>Trigger Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_ACTION__TRIGGER_DELAY = LOCAL_ACTION__TRIGGER_DELAY;

    /**
     * The feature id for the '<em><b>Trigger Probability</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_ACTION__TRIGGER_PROBABILITY = LOCAL_ACTION__TRIGGER_PROBABILITY;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_ACTION__LABEL = LOCAL_ACTION__LABEL;

    /**
     * The feature id for the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_ACTION__DELAY = LOCAL_ACTION__DELAY;

    /**
     * The feature id for the '<em><b>Nondeterministic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_ACTION__NONDETERMINISTIC = LOCAL_ACTION__NONDETERMINISTIC;

    /**
     * The feature id for the '<em><b>Preemption</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_ACTION__PREEMPTION = LOCAL_ACTION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Exit Action</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_ACTION_FEATURE_COUNT = LOCAL_ACTION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.SuspendActionImpl <em>Suspend Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sccharts.impl.SuspendActionImpl
     * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getSuspendAction()
     * @generated
     */
    int SUSPEND_ACTION = 13;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUSPEND_ACTION__ANNOTATIONS = LOCAL_ACTION__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Outgoing Links</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUSPEND_ACTION__OUTGOING_LINKS = LOCAL_ACTION__OUTGOING_LINKS;

    /**
     * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUSPEND_ACTION__INCOMING_LINKS = LOCAL_ACTION__INCOMING_LINKS;

    /**
     * The feature id for the '<em><b>Effects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUSPEND_ACTION__EFFECTS = LOCAL_ACTION__EFFECTS;

    /**
     * The feature id for the '<em><b>Trigger</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUSPEND_ACTION__TRIGGER = LOCAL_ACTION__TRIGGER;

    /**
     * The feature id for the '<em><b>Trigger Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUSPEND_ACTION__TRIGGER_DELAY = LOCAL_ACTION__TRIGGER_DELAY;

    /**
     * The feature id for the '<em><b>Trigger Probability</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUSPEND_ACTION__TRIGGER_PROBABILITY = LOCAL_ACTION__TRIGGER_PROBABILITY;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUSPEND_ACTION__LABEL = LOCAL_ACTION__LABEL;

    /**
     * The feature id for the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUSPEND_ACTION__DELAY = LOCAL_ACTION__DELAY;

    /**
     * The feature id for the '<em><b>Nondeterministic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUSPEND_ACTION__NONDETERMINISTIC = LOCAL_ACTION__NONDETERMINISTIC;

    /**
     * The feature id for the '<em><b>Weak</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUSPEND_ACTION__WEAK = LOCAL_ACTION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Suspend Action</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUSPEND_ACTION_FEATURE_COUNT = LOCAL_ACTION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.PeriodActionImpl <em>Period Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sccharts.impl.PeriodActionImpl
     * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getPeriodAction()
     * @generated
     */
    int PERIOD_ACTION = 14;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERIOD_ACTION__ANNOTATIONS = LOCAL_ACTION__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Outgoing Links</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERIOD_ACTION__OUTGOING_LINKS = LOCAL_ACTION__OUTGOING_LINKS;

    /**
     * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERIOD_ACTION__INCOMING_LINKS = LOCAL_ACTION__INCOMING_LINKS;

    /**
     * The feature id for the '<em><b>Effects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERIOD_ACTION__EFFECTS = LOCAL_ACTION__EFFECTS;

    /**
     * The feature id for the '<em><b>Trigger</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERIOD_ACTION__TRIGGER = LOCAL_ACTION__TRIGGER;

    /**
     * The feature id for the '<em><b>Trigger Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERIOD_ACTION__TRIGGER_DELAY = LOCAL_ACTION__TRIGGER_DELAY;

    /**
     * The feature id for the '<em><b>Trigger Probability</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERIOD_ACTION__TRIGGER_PROBABILITY = LOCAL_ACTION__TRIGGER_PROBABILITY;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERIOD_ACTION__LABEL = LOCAL_ACTION__LABEL;

    /**
     * The feature id for the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERIOD_ACTION__DELAY = LOCAL_ACTION__DELAY;

    /**
     * The feature id for the '<em><b>Nondeterministic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERIOD_ACTION__NONDETERMINISTIC = LOCAL_ACTION__NONDETERMINISTIC;

    /**
     * The number of structural features of the '<em>Period Action</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERIOD_ACTION_FEATURE_COUNT = LOCAL_ACTION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.PolicyClassDeclarationImpl <em>Policy Class Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sccharts.impl.PolicyClassDeclarationImpl
     * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getPolicyClassDeclaration()
     * @generated
     */
    int POLICY_CLASS_DECLARATION = 15;

    /**
     * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_CLASS_DECLARATION__DECLARATIONS = KExtPackage.CLASS_DECLARATION__DECLARATIONS;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_CLASS_DECLARATION__ANNOTATIONS = KExtPackage.CLASS_DECLARATION__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Valued Objects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_CLASS_DECLARATION__VALUED_OBJECTS = KExtPackage.CLASS_DECLARATION__VALUED_OBJECTS;

    /**
     * The feature id for the '<em><b>Access</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_CLASS_DECLARATION__ACCESS = KExtPackage.CLASS_DECLARATION__ACCESS;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_CLASS_DECLARATION__TYPE = KExtPackage.CLASS_DECLARATION__TYPE;

    /**
     * The feature id for the '<em><b>Input</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_CLASS_DECLARATION__INPUT = KExtPackage.CLASS_DECLARATION__INPUT;

    /**
     * The feature id for the '<em><b>Output</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_CLASS_DECLARATION__OUTPUT = KExtPackage.CLASS_DECLARATION__OUTPUT;

    /**
     * The feature id for the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_CLASS_DECLARATION__STATIC = KExtPackage.CLASS_DECLARATION__STATIC;

    /**
     * The feature id for the '<em><b>Signal</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_CLASS_DECLARATION__SIGNAL = KExtPackage.CLASS_DECLARATION__SIGNAL;

    /**
     * The feature id for the '<em><b>Const</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_CLASS_DECLARATION__CONST = KExtPackage.CLASS_DECLARATION__CONST;

    /**
     * The feature id for the '<em><b>Extern</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_CLASS_DECLARATION__EXTERN = KExtPackage.CLASS_DECLARATION__EXTERN;

    /**
     * The feature id for the '<em><b>Volatile</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_CLASS_DECLARATION__VOLATILE = KExtPackage.CLASS_DECLARATION__VOLATILE;

    /**
     * The feature id for the '<em><b>Global</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_CLASS_DECLARATION__GLOBAL = KExtPackage.CLASS_DECLARATION__GLOBAL;

    /**
     * The feature id for the '<em><b>Host Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_CLASS_DECLARATION__HOST_TYPE = KExtPackage.CLASS_DECLARATION__HOST_TYPE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_CLASS_DECLARATION__NAME = KExtPackage.CLASS_DECLARATION__NAME;

    /**
     * The feature id for the '<em><b>Host</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_CLASS_DECLARATION__HOST = KExtPackage.CLASS_DECLARATION__HOST;

    /**
     * The feature id for the '<em><b>Policy</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_CLASS_DECLARATION__POLICY = KExtPackage.CLASS_DECLARATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Policy Class Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_CLASS_DECLARATION_FEATURE_COUNT = KExtPackage.CLASS_DECLARATION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.PolicyRegionImpl <em>Policy Region</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sccharts.impl.PolicyRegionImpl
     * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getPolicyRegion()
     * @generated
     */
    int POLICY_REGION = 16;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_REGION__ANNOTATIONS = CONTROLFLOW_REGION__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_REGION__DECLARATIONS = CONTROLFLOW_REGION__DECLARATIONS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_REGION__NAME = CONTROLFLOW_REGION__NAME;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_REGION__SCHEDULE = CONTROLFLOW_REGION__SCHEDULE;

    /**
     * The feature id for the '<em><b>Outgoing Links</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_REGION__OUTGOING_LINKS = CONTROLFLOW_REGION__OUTGOING_LINKS;

    /**
     * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_REGION__INCOMING_LINKS = CONTROLFLOW_REGION__INCOMING_LINKS;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_REGION__LABEL = CONTROLFLOW_REGION__LABEL;

    /**
     * The feature id for the '<em><b>Actions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_REGION__ACTIONS = CONTROLFLOW_REGION__ACTIONS;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_REGION__REFERENCE = CONTROLFLOW_REGION__REFERENCE;

    /**
     * The feature id for the '<em><b>Generic Parameter Declarations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_REGION__GENERIC_PARAMETER_DECLARATIONS = CONTROLFLOW_REGION__GENERIC_PARAMETER_DECLARATIONS;

    /**
     * The feature id for the '<em><b>Parent State</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_REGION__PARENT_STATE = CONTROLFLOW_REGION__PARENT_STATE;

    /**
     * The feature id for the '<em><b>Counter Variable</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_REGION__COUNTER_VARIABLE = CONTROLFLOW_REGION__COUNTER_VARIABLE;

    /**
     * The feature id for the '<em><b>For Start</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_REGION__FOR_START = CONTROLFLOW_REGION__FOR_START;

    /**
     * The feature id for the '<em><b>For End</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_REGION__FOR_END = CONTROLFLOW_REGION__FOR_END;

    /**
     * The feature id for the '<em><b>Override</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_REGION__OVERRIDE = CONTROLFLOW_REGION__OVERRIDE;

    /**
     * The feature id for the '<em><b>States</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_REGION__STATES = CONTROLFLOW_REGION__STATES;

    /**
     * The feature id for the '<em><b>Final</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_REGION__FINAL = CONTROLFLOW_REGION__FINAL;

    /**
     * The feature id for the '<em><b>Abort</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_REGION__ABORT = CONTROLFLOW_REGION__ABORT;

    /**
     * The number of structural features of the '<em>Policy Region</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_REGION_FEATURE_COUNT = CONTROLFLOW_REGION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.CodeEffectImpl <em>Code Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sccharts.impl.CodeEffectImpl
     * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getCodeEffect()
     * @generated
     */
    int CODE_EFFECT = 17;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CODE_EFFECT__ANNOTATIONS = KEffectsPackage.EFFECT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CODE_EFFECT__SCHEDULE = KEffectsPackage.EFFECT__SCHEDULE;

    /**
     * The feature id for the '<em><b>Outgoing Links</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CODE_EFFECT__OUTGOING_LINKS = KEffectsPackage.EFFECT__OUTGOING_LINKS;

    /**
     * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CODE_EFFECT__INCOMING_LINKS = KEffectsPackage.EFFECT__INCOMING_LINKS;

    /**
     * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CODE_EFFECT__DECLARATIONS = KEffectsPackage.EFFECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CODE_EFFECT__STATEMENTS = KEffectsPackage.EFFECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Code Effect</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CODE_EFFECT_FEATURE_COUNT = KEffectsPackage.EFFECT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.DataflowAssignmentImpl <em>Dataflow Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sccharts.impl.DataflowAssignmentImpl
     * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getDataflowAssignment()
     * @generated
     */
    int DATAFLOW_ASSIGNMENT = 18;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATAFLOW_ASSIGNMENT__ANNOTATIONS = KEffectsPackage.ASSIGNMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATAFLOW_ASSIGNMENT__SCHEDULE = KEffectsPackage.ASSIGNMENT__SCHEDULE;

    /**
     * The feature id for the '<em><b>Outgoing Links</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATAFLOW_ASSIGNMENT__OUTGOING_LINKS = KEffectsPackage.ASSIGNMENT__OUTGOING_LINKS;

    /**
     * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATAFLOW_ASSIGNMENT__INCOMING_LINKS = KEffectsPackage.ASSIGNMENT__INCOMING_LINKS;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATAFLOW_ASSIGNMENT__REFERENCE = KEffectsPackage.ASSIGNMENT__REFERENCE;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATAFLOW_ASSIGNMENT__EXPRESSION = KEffectsPackage.ASSIGNMENT__EXPRESSION;

    /**
     * The feature id for the '<em><b>Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATAFLOW_ASSIGNMENT__OPERATOR = KEffectsPackage.ASSIGNMENT__OPERATOR;

    /**
     * The feature id for the '<em><b>Sequential</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATAFLOW_ASSIGNMENT__SEQUENTIAL = KEffectsPackage.ASSIGNMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Dataflow Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATAFLOW_ASSIGNMENT_FEATURE_COUNT = KEffectsPackage.ASSIGNMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.BaseStateReferenceImpl <em>Base State Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sccharts.impl.BaseStateReferenceImpl
     * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getBaseStateReference()
     * @generated
     */
    int BASE_STATE_REFERENCE = 19;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_STATE_REFERENCE__TARGET = 0;

    /**
     * The feature id for the '<em><b>Generic Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_STATE_REFERENCE__GENERIC_PARAMETERS = 1;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_STATE_REFERENCE__PARAMETERS = 2;

    /**
     * The number of structural features of the '<em>Base State Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_STATE_REFERENCE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.sccharts.PreemptionType <em>Preemption Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sccharts.PreemptionType
     * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getPreemptionType()
     * @generated
     */
    int PREEMPTION_TYPE = 20;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.sccharts.HistoryType <em>History Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sccharts.HistoryType
     * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getHistoryType()
     * @generated
     */
    int HISTORY_TYPE = 21;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.sccharts.DelayType <em>Delay Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sccharts.DelayType
     * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getDelayType()
     * @generated
     */
    int DELAY_TYPE = 22;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.sccharts.DeferredType <em>Deferred Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sccharts.DeferredType
     * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getDeferredType()
     * @generated
     */
    int DEFERRED_TYPE = 23;


    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.SCCharts <em>SC Charts</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SC Charts</em>'.
     * @see de.cau.cs.kieler.sccharts.SCCharts
     * @generated
     */
    EClass getSCCharts();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.sccharts.SCCharts#getRootStates <em>Root States</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Root States</em>'.
     * @see de.cau.cs.kieler.sccharts.SCCharts#getRootStates()
     * @see #getSCCharts()
     * @generated
     */
    EReference getSCCharts_RootStates();

    /**
     * Returns the meta object for the attribute list '{@link de.cau.cs.kieler.sccharts.SCCharts#getImports <em>Imports</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Imports</em>'.
     * @see de.cau.cs.kieler.sccharts.SCCharts#getImports()
     * @see #getSCCharts()
     * @generated
     */
    EAttribute getSCCharts_Imports();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.Scope <em>Scope</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Scope</em>'.
     * @see de.cau.cs.kieler.sccharts.Scope
     * @generated
     */
    EClass getScope();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sccharts.Scope#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see de.cau.cs.kieler.sccharts.Scope#getLabel()
     * @see #getScope()
     * @generated
     */
    EAttribute getScope_Label();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.sccharts.Scope#getActions <em>Actions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Actions</em>'.
     * @see de.cau.cs.kieler.sccharts.Scope#getActions()
     * @see #getScope()
     * @generated
     */
    EReference getScope_Actions();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.sccharts.Scope#getReference <em>Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Reference</em>'.
     * @see de.cau.cs.kieler.sccharts.Scope#getReference()
     * @see #getScope()
     * @generated
     */
    EReference getScope_Reference();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.sccharts.Scope#getGenericParameterDeclarations <em>Generic Parameter Declarations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Generic Parameter Declarations</em>'.
     * @see de.cau.cs.kieler.sccharts.Scope#getGenericParameterDeclarations()
     * @see #getScope()
     * @generated
     */
    EReference getScope_GenericParameterDeclarations();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.ScopeCall <em>Scope Call</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Scope Call</em>'.
     * @see de.cau.cs.kieler.sccharts.ScopeCall
     * @generated
     */
    EClass getScopeCall();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.sccharts.ScopeCall#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see de.cau.cs.kieler.sccharts.ScopeCall#getTarget()
     * @see #getScopeCall()
     * @generated
     */
    EReference getScopeCall_Target();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sccharts.ScopeCall#isSuper <em>Super</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Super</em>'.
     * @see de.cau.cs.kieler.sccharts.ScopeCall#isSuper()
     * @see #getScopeCall()
     * @generated
     */
    EAttribute getScopeCall_Super();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.sccharts.ScopeCall#getGenericParameters <em>Generic Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Generic Parameters</em>'.
     * @see de.cau.cs.kieler.sccharts.ScopeCall#getGenericParameters()
     * @see #getScopeCall()
     * @generated
     */
    EReference getScopeCall_GenericParameters();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.Action <em>Action</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Action</em>'.
     * @see de.cau.cs.kieler.sccharts.Action
     * @generated
     */
    EClass getAction();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.sccharts.Action#getEffects <em>Effects</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Effects</em>'.
     * @see de.cau.cs.kieler.sccharts.Action#getEffects()
     * @see #getAction()
     * @generated
     */
    EReference getAction_Effects();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.sccharts.Action#getTrigger <em>Trigger</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Trigger</em>'.
     * @see de.cau.cs.kieler.sccharts.Action#getTrigger()
     * @see #getAction()
     * @generated
     */
    EReference getAction_Trigger();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sccharts.Action#getTriggerDelay <em>Trigger Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Trigger Delay</em>'.
     * @see de.cau.cs.kieler.sccharts.Action#getTriggerDelay()
     * @see #getAction()
     * @generated
     */
    EAttribute getAction_TriggerDelay();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sccharts.Action#getTriggerProbability <em>Trigger Probability</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Trigger Probability</em>'.
     * @see de.cau.cs.kieler.sccharts.Action#getTriggerProbability()
     * @see #getAction()
     * @generated
     */
    EAttribute getAction_TriggerProbability();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sccharts.Action#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see de.cau.cs.kieler.sccharts.Action#getLabel()
     * @see #getAction()
     * @generated
     */
    EAttribute getAction_Label();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sccharts.Action#getDelay <em>Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Delay</em>'.
     * @see de.cau.cs.kieler.sccharts.Action#getDelay()
     * @see #getAction()
     * @generated
     */
    EAttribute getAction_Delay();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sccharts.Action#isNondeterministic <em>Nondeterministic</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Nondeterministic</em>'.
     * @see de.cau.cs.kieler.sccharts.Action#isNondeterministic()
     * @see #getAction()
     * @generated
     */
    EAttribute getAction_Nondeterministic();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.LocalAction <em>Local Action</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Local Action</em>'.
     * @see de.cau.cs.kieler.sccharts.LocalAction
     * @generated
     */
    EClass getLocalAction();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.State <em>State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>State</em>'.
     * @see de.cau.cs.kieler.sccharts.State
     * @generated
     */
    EClass getState();

    /**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.sccharts.State#getParentRegion <em>Parent Region</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Region</em>'.
     * @see de.cau.cs.kieler.sccharts.State#getParentRegion()
     * @see #getState()
     * @generated
     */
    EReference getState_ParentRegion();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.sccharts.State#getRegions <em>Regions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Regions</em>'.
     * @see de.cau.cs.kieler.sccharts.State#getRegions()
     * @see #getState()
     * @generated
     */
    EReference getState_Regions();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sccharts.State#isInitial <em>Initial</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Initial</em>'.
     * @see de.cau.cs.kieler.sccharts.State#isInitial()
     * @see #getState()
     * @generated
     */
    EAttribute getState_Initial();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sccharts.State#isFinal <em>Final</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Final</em>'.
     * @see de.cau.cs.kieler.sccharts.State#isFinal()
     * @see #getState()
     * @generated
     */
    EAttribute getState_Final();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sccharts.State#isViolation <em>Violation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Violation</em>'.
     * @see de.cau.cs.kieler.sccharts.State#isViolation()
     * @see #getState()
     * @generated
     */
    EAttribute getState_Violation();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sccharts.State#isConnector <em>Connector</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Connector</em>'.
     * @see de.cau.cs.kieler.sccharts.State#isConnector()
     * @see #getState()
     * @generated
     */
    EAttribute getState_Connector();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.sccharts.State#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Outgoing Transitions</em>'.
     * @see de.cau.cs.kieler.sccharts.State#getOutgoingTransitions()
     * @see #getState()
     * @generated
     */
    EReference getState_OutgoingTransitions();

    /**
     * Returns the meta object for the reference list '{@link de.cau.cs.kieler.sccharts.State#getIncomingTransitions <em>Incoming Transitions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Incoming Transitions</em>'.
     * @see de.cau.cs.kieler.sccharts.State#getIncomingTransitions()
     * @see #getState()
     * @generated
     */
    EReference getState_IncomingTransitions();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.sccharts.State#getBaseStateReferences <em>Base State References</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Base State References</em>'.
     * @see de.cau.cs.kieler.sccharts.State#getBaseStateReferences()
     * @see #getState()
     * @generated
     */
    EReference getState_BaseStateReferences();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.Region <em>Region</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Region</em>'.
     * @see de.cau.cs.kieler.sccharts.Region
     * @generated
     */
    EClass getRegion();

    /**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.sccharts.Region#getParentState <em>Parent State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent State</em>'.
     * @see de.cau.cs.kieler.sccharts.Region#getParentState()
     * @see #getRegion()
     * @generated
     */
    EReference getRegion_ParentState();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.sccharts.Region#getCounterVariable <em>Counter Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Counter Variable</em>'.
     * @see de.cau.cs.kieler.sccharts.Region#getCounterVariable()
     * @see #getRegion()
     * @generated
     */
    EReference getRegion_CounterVariable();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.sccharts.Region#getForStart <em>For Start</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>For Start</em>'.
     * @see de.cau.cs.kieler.sccharts.Region#getForStart()
     * @see #getRegion()
     * @generated
     */
    EReference getRegion_ForStart();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.sccharts.Region#getForEnd <em>For End</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>For End</em>'.
     * @see de.cau.cs.kieler.sccharts.Region#getForEnd()
     * @see #getRegion()
     * @generated
     */
    EReference getRegion_ForEnd();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sccharts.Region#isOverride <em>Override</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Override</em>'.
     * @see de.cau.cs.kieler.sccharts.Region#isOverride()
     * @see #getRegion()
     * @generated
     */
    EAttribute getRegion_Override();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.ControlflowRegion <em>Controlflow Region</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Controlflow Region</em>'.
     * @see de.cau.cs.kieler.sccharts.ControlflowRegion
     * @generated
     */
    EClass getControlflowRegion();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.sccharts.ControlflowRegion#getStates <em>States</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>States</em>'.
     * @see de.cau.cs.kieler.sccharts.ControlflowRegion#getStates()
     * @see #getControlflowRegion()
     * @generated
     */
    EReference getControlflowRegion_States();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sccharts.ControlflowRegion#isFinal <em>Final</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Final</em>'.
     * @see de.cau.cs.kieler.sccharts.ControlflowRegion#isFinal()
     * @see #getControlflowRegion()
     * @generated
     */
    EAttribute getControlflowRegion_Final();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sccharts.ControlflowRegion#isAbort <em>Abort</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Abort</em>'.
     * @see de.cau.cs.kieler.sccharts.ControlflowRegion#isAbort()
     * @see #getControlflowRegion()
     * @generated
     */
    EAttribute getControlflowRegion_Abort();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.DataflowRegion <em>Dataflow Region</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dataflow Region</em>'.
     * @see de.cau.cs.kieler.sccharts.DataflowRegion
     * @generated
     */
    EClass getDataflowRegion();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.sccharts.DataflowRegion#getEquations <em>Equations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Equations</em>'.
     * @see de.cau.cs.kieler.sccharts.DataflowRegion#getEquations()
     * @see #getDataflowRegion()
     * @generated
     */
    EReference getDataflowRegion_Equations();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sccharts.DataflowRegion#isOnce <em>Once</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Once</em>'.
     * @see de.cau.cs.kieler.sccharts.DataflowRegion#isOnce()
     * @see #getDataflowRegion()
     * @generated
     */
    EAttribute getDataflowRegion_Once();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.Transition <em>Transition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Transition</em>'.
     * @see de.cau.cs.kieler.sccharts.Transition
     * @generated
     */
    EClass getTransition();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sccharts.Transition#getPreemption <em>Preemption</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Preemption</em>'.
     * @see de.cau.cs.kieler.sccharts.Transition#getPreemption()
     * @see #getTransition()
     * @generated
     */
    EAttribute getTransition_Preemption();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sccharts.Transition#getHistory <em>History</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>History</em>'.
     * @see de.cau.cs.kieler.sccharts.Transition#getHistory()
     * @see #getTransition()
     * @generated
     */
    EAttribute getTransition_History();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sccharts.Transition#getDeferred <em>Deferred</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Deferred</em>'.
     * @see de.cau.cs.kieler.sccharts.Transition#getDeferred()
     * @see #getTransition()
     * @generated
     */
    EAttribute getTransition_Deferred();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.sccharts.Transition#getTargetState <em>Target State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target State</em>'.
     * @see de.cau.cs.kieler.sccharts.Transition#getTargetState()
     * @see #getTransition()
     * @generated
     */
    EReference getTransition_TargetState();

    /**
     * Returns the meta object for the container reference '{@link de.cau.cs.kieler.sccharts.Transition#getSourceState <em>Source State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Source State</em>'.
     * @see de.cau.cs.kieler.sccharts.Transition#getSourceState()
     * @see #getTransition()
     * @generated
     */
    EReference getTransition_SourceState();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.EntryAction <em>Entry Action</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Entry Action</em>'.
     * @see de.cau.cs.kieler.sccharts.EntryAction
     * @generated
     */
    EClass getEntryAction();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sccharts.EntryAction#getPreemption <em>Preemption</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Preemption</em>'.
     * @see de.cau.cs.kieler.sccharts.EntryAction#getPreemption()
     * @see #getEntryAction()
     * @generated
     */
    EAttribute getEntryAction_Preemption();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.DuringAction <em>During Action</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>During Action</em>'.
     * @see de.cau.cs.kieler.sccharts.DuringAction
     * @generated
     */
    EClass getDuringAction();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sccharts.DuringAction#getReset <em>Reset</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Reset</em>'.
     * @see de.cau.cs.kieler.sccharts.DuringAction#getReset()
     * @see #getDuringAction()
     * @generated
     */
    EAttribute getDuringAction_Reset();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.ExitAction <em>Exit Action</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Exit Action</em>'.
     * @see de.cau.cs.kieler.sccharts.ExitAction
     * @generated
     */
    EClass getExitAction();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sccharts.ExitAction#getPreemption <em>Preemption</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Preemption</em>'.
     * @see de.cau.cs.kieler.sccharts.ExitAction#getPreemption()
     * @see #getExitAction()
     * @generated
     */
    EAttribute getExitAction_Preemption();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.SuspendAction <em>Suspend Action</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Suspend Action</em>'.
     * @see de.cau.cs.kieler.sccharts.SuspendAction
     * @generated
     */
    EClass getSuspendAction();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sccharts.SuspendAction#isWeak <em>Weak</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Weak</em>'.
     * @see de.cau.cs.kieler.sccharts.SuspendAction#isWeak()
     * @see #getSuspendAction()
     * @generated
     */
    EAttribute getSuspendAction_Weak();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.PeriodAction <em>Period Action</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Period Action</em>'.
     * @see de.cau.cs.kieler.sccharts.PeriodAction
     * @generated
     */
    EClass getPeriodAction();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.PolicyClassDeclaration <em>Policy Class Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Policy Class Declaration</em>'.
     * @see de.cau.cs.kieler.sccharts.PolicyClassDeclaration
     * @generated
     */
    EClass getPolicyClassDeclaration();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.sccharts.PolicyClassDeclaration#getPolicy <em>Policy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Policy</em>'.
     * @see de.cau.cs.kieler.sccharts.PolicyClassDeclaration#getPolicy()
     * @see #getPolicyClassDeclaration()
     * @generated
     */
    EReference getPolicyClassDeclaration_Policy();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.PolicyRegion <em>Policy Region</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Policy Region</em>'.
     * @see de.cau.cs.kieler.sccharts.PolicyRegion
     * @generated
     */
    EClass getPolicyRegion();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.CodeEffect <em>Code Effect</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Code Effect</em>'.
     * @see de.cau.cs.kieler.sccharts.CodeEffect
     * @generated
     */
    EClass getCodeEffect();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.DataflowAssignment <em>Dataflow Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dataflow Assignment</em>'.
     * @see de.cau.cs.kieler.sccharts.DataflowAssignment
     * @generated
     */
    EClass getDataflowAssignment();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sccharts.DataflowAssignment#isSequential <em>Sequential</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sequential</em>'.
     * @see de.cau.cs.kieler.sccharts.DataflowAssignment#isSequential()
     * @see #getDataflowAssignment()
     * @generated
     */
    EAttribute getDataflowAssignment_Sequential();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.BaseStateReference <em>Base State Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Base State Reference</em>'.
     * @see de.cau.cs.kieler.sccharts.BaseStateReference
     * @generated
     */
    EClass getBaseStateReference();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.sccharts.BaseStateReference#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see de.cau.cs.kieler.sccharts.BaseStateReference#getTarget()
     * @see #getBaseStateReference()
     * @generated
     */
    EReference getBaseStateReference_Target();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.sccharts.BaseStateReference#getGenericParameters <em>Generic Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Generic Parameters</em>'.
     * @see de.cau.cs.kieler.sccharts.BaseStateReference#getGenericParameters()
     * @see #getBaseStateReference()
     * @generated
     */
    EReference getBaseStateReference_GenericParameters();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.sccharts.BaseStateReference#getParameters <em>Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Parameters</em>'.
     * @see de.cau.cs.kieler.sccharts.BaseStateReference#getParameters()
     * @see #getBaseStateReference()
     * @generated
     */
    EReference getBaseStateReference_Parameters();

    /**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.sccharts.PreemptionType <em>Preemption Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Preemption Type</em>'.
     * @see de.cau.cs.kieler.sccharts.PreemptionType
     * @generated
     */
    EEnum getPreemptionType();

    /**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.sccharts.HistoryType <em>History Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>History Type</em>'.
     * @see de.cau.cs.kieler.sccharts.HistoryType
     * @generated
     */
    EEnum getHistoryType();

    /**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.sccharts.DelayType <em>Delay Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Delay Type</em>'.
     * @see de.cau.cs.kieler.sccharts.DelayType
     * @generated
     */
    EEnum getDelayType();

    /**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.sccharts.DeferredType <em>Deferred Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Deferred Type</em>'.
     * @see de.cau.cs.kieler.sccharts.DeferredType
     * @generated
     */
    EEnum getDeferredType();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    SCChartsFactory getSCChartsFactory();

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
         * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.impl.SCChartsImpl <em>SC Charts</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.sccharts.impl.SCChartsImpl
         * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getSCCharts()
         * @generated
         */
        EClass SC_CHARTS = eINSTANCE.getSCCharts();

        /**
         * The meta object literal for the '<em><b>Root States</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SC_CHARTS__ROOT_STATES = eINSTANCE.getSCCharts_RootStates();

        /**
         * The meta object literal for the '<em><b>Imports</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SC_CHARTS__IMPORTS = eINSTANCE.getSCCharts_Imports();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.impl.ScopeImpl <em>Scope</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.sccharts.impl.ScopeImpl
         * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getScope()
         * @generated
         */
        EClass SCOPE = eINSTANCE.getScope();

        /**
         * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCOPE__LABEL = eINSTANCE.getScope_Label();

        /**
         * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCOPE__ACTIONS = eINSTANCE.getScope_Actions();

        /**
         * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCOPE__REFERENCE = eINSTANCE.getScope_Reference();

        /**
         * The meta object literal for the '<em><b>Generic Parameter Declarations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCOPE__GENERIC_PARAMETER_DECLARATIONS = eINSTANCE.getScope_GenericParameterDeclarations();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.impl.ScopeCallImpl <em>Scope Call</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.sccharts.impl.ScopeCallImpl
         * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getScopeCall()
         * @generated
         */
        EClass SCOPE_CALL = eINSTANCE.getScopeCall();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCOPE_CALL__TARGET = eINSTANCE.getScopeCall_Target();

        /**
         * The meta object literal for the '<em><b>Super</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCOPE_CALL__SUPER = eINSTANCE.getScopeCall_Super();

        /**
         * The meta object literal for the '<em><b>Generic Parameters</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCOPE_CALL__GENERIC_PARAMETERS = eINSTANCE.getScopeCall_GenericParameters();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.impl.ActionImpl <em>Action</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.sccharts.impl.ActionImpl
         * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getAction()
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
         * The meta object literal for the '<em><b>Trigger Delay</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ACTION__TRIGGER_DELAY = eINSTANCE.getAction_TriggerDelay();

        /**
         * The meta object literal for the '<em><b>Trigger Probability</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ACTION__TRIGGER_PROBABILITY = eINSTANCE.getAction_TriggerProbability();

        /**
         * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ACTION__LABEL = eINSTANCE.getAction_Label();

        /**
         * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ACTION__DELAY = eINSTANCE.getAction_Delay();

        /**
         * The meta object literal for the '<em><b>Nondeterministic</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ACTION__NONDETERMINISTIC = eINSTANCE.getAction_Nondeterministic();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.impl.LocalActionImpl <em>Local Action</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.sccharts.impl.LocalActionImpl
         * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getLocalAction()
         * @generated
         */
        EClass LOCAL_ACTION = eINSTANCE.getLocalAction();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.impl.StateImpl <em>State</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.sccharts.impl.StateImpl
         * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getState()
         * @generated
         */
        EClass STATE = eINSTANCE.getState();

        /**
         * The meta object literal for the '<em><b>Parent Region</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STATE__PARENT_REGION = eINSTANCE.getState_ParentRegion();

        /**
         * The meta object literal for the '<em><b>Regions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STATE__REGIONS = eINSTANCE.getState_Regions();

        /**
         * The meta object literal for the '<em><b>Initial</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STATE__INITIAL = eINSTANCE.getState_Initial();

        /**
         * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STATE__FINAL = eINSTANCE.getState_Final();

        /**
         * The meta object literal for the '<em><b>Violation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STATE__VIOLATION = eINSTANCE.getState_Violation();

        /**
         * The meta object literal for the '<em><b>Connector</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STATE__CONNECTOR = eINSTANCE.getState_Connector();

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
         * The meta object literal for the '<em><b>Base State References</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STATE__BASE_STATE_REFERENCES = eINSTANCE.getState_BaseStateReferences();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.impl.RegionImpl <em>Region</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.sccharts.impl.RegionImpl
         * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getRegion()
         * @generated
         */
        EClass REGION = eINSTANCE.getRegion();

        /**
         * The meta object literal for the '<em><b>Parent State</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REGION__PARENT_STATE = eINSTANCE.getRegion_ParentState();

        /**
         * The meta object literal for the '<em><b>Counter Variable</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REGION__COUNTER_VARIABLE = eINSTANCE.getRegion_CounterVariable();

        /**
         * The meta object literal for the '<em><b>For Start</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REGION__FOR_START = eINSTANCE.getRegion_ForStart();

        /**
         * The meta object literal for the '<em><b>For End</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REGION__FOR_END = eINSTANCE.getRegion_ForEnd();

        /**
         * The meta object literal for the '<em><b>Override</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REGION__OVERRIDE = eINSTANCE.getRegion_Override();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.impl.ControlflowRegionImpl <em>Controlflow Region</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.sccharts.impl.ControlflowRegionImpl
         * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getControlflowRegion()
         * @generated
         */
        EClass CONTROLFLOW_REGION = eINSTANCE.getControlflowRegion();

        /**
         * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTROLFLOW_REGION__STATES = eINSTANCE.getControlflowRegion_States();

        /**
         * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTROLFLOW_REGION__FINAL = eINSTANCE.getControlflowRegion_Final();

        /**
         * The meta object literal for the '<em><b>Abort</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTROLFLOW_REGION__ABORT = eINSTANCE.getControlflowRegion_Abort();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.impl.DataflowRegionImpl <em>Dataflow Region</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.sccharts.impl.DataflowRegionImpl
         * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getDataflowRegion()
         * @generated
         */
        EClass DATAFLOW_REGION = eINSTANCE.getDataflowRegion();

        /**
         * The meta object literal for the '<em><b>Equations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATAFLOW_REGION__EQUATIONS = eINSTANCE.getDataflowRegion_Equations();

        /**
         * The meta object literal for the '<em><b>Once</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATAFLOW_REGION__ONCE = eINSTANCE.getDataflowRegion_Once();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.impl.TransitionImpl <em>Transition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.sccharts.impl.TransitionImpl
         * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getTransition()
         * @generated
         */
        EClass TRANSITION = eINSTANCE.getTransition();

        /**
         * The meta object literal for the '<em><b>Preemption</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TRANSITION__PREEMPTION = eINSTANCE.getTransition_Preemption();

        /**
         * The meta object literal for the '<em><b>History</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TRANSITION__HISTORY = eINSTANCE.getTransition_History();

        /**
         * The meta object literal for the '<em><b>Deferred</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TRANSITION__DEFERRED = eINSTANCE.getTransition_Deferred();

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
         * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.impl.EntryActionImpl <em>Entry Action</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.sccharts.impl.EntryActionImpl
         * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getEntryAction()
         * @generated
         */
        EClass ENTRY_ACTION = eINSTANCE.getEntryAction();

        /**
         * The meta object literal for the '<em><b>Preemption</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ENTRY_ACTION__PREEMPTION = eINSTANCE.getEntryAction_Preemption();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.impl.DuringActionImpl <em>During Action</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.sccharts.impl.DuringActionImpl
         * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getDuringAction()
         * @generated
         */
        EClass DURING_ACTION = eINSTANCE.getDuringAction();

        /**
         * The meta object literal for the '<em><b>Reset</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DURING_ACTION__RESET = eINSTANCE.getDuringAction_Reset();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.impl.ExitActionImpl <em>Exit Action</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.sccharts.impl.ExitActionImpl
         * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getExitAction()
         * @generated
         */
        EClass EXIT_ACTION = eINSTANCE.getExitAction();

        /**
         * The meta object literal for the '<em><b>Preemption</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXIT_ACTION__PREEMPTION = eINSTANCE.getExitAction_Preemption();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.impl.SuspendActionImpl <em>Suspend Action</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.sccharts.impl.SuspendActionImpl
         * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getSuspendAction()
         * @generated
         */
        EClass SUSPEND_ACTION = eINSTANCE.getSuspendAction();

        /**
         * The meta object literal for the '<em><b>Weak</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUSPEND_ACTION__WEAK = eINSTANCE.getSuspendAction_Weak();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.impl.PeriodActionImpl <em>Period Action</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.sccharts.impl.PeriodActionImpl
         * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getPeriodAction()
         * @generated
         */
        EClass PERIOD_ACTION = eINSTANCE.getPeriodAction();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.impl.PolicyClassDeclarationImpl <em>Policy Class Declaration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.sccharts.impl.PolicyClassDeclarationImpl
         * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getPolicyClassDeclaration()
         * @generated
         */
        EClass POLICY_CLASS_DECLARATION = eINSTANCE.getPolicyClassDeclaration();

        /**
         * The meta object literal for the '<em><b>Policy</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference POLICY_CLASS_DECLARATION__POLICY = eINSTANCE.getPolicyClassDeclaration_Policy();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.impl.PolicyRegionImpl <em>Policy Region</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.sccharts.impl.PolicyRegionImpl
         * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getPolicyRegion()
         * @generated
         */
        EClass POLICY_REGION = eINSTANCE.getPolicyRegion();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.impl.CodeEffectImpl <em>Code Effect</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.sccharts.impl.CodeEffectImpl
         * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getCodeEffect()
         * @generated
         */
        EClass CODE_EFFECT = eINSTANCE.getCodeEffect();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.impl.DataflowAssignmentImpl <em>Dataflow Assignment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.sccharts.impl.DataflowAssignmentImpl
         * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getDataflowAssignment()
         * @generated
         */
        EClass DATAFLOW_ASSIGNMENT = eINSTANCE.getDataflowAssignment();

        /**
         * The meta object literal for the '<em><b>Sequential</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATAFLOW_ASSIGNMENT__SEQUENTIAL = eINSTANCE.getDataflowAssignment_Sequential();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.impl.BaseStateReferenceImpl <em>Base State Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.sccharts.impl.BaseStateReferenceImpl
         * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getBaseStateReference()
         * @generated
         */
        EClass BASE_STATE_REFERENCE = eINSTANCE.getBaseStateReference();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BASE_STATE_REFERENCE__TARGET = eINSTANCE.getBaseStateReference_Target();

        /**
         * The meta object literal for the '<em><b>Generic Parameters</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BASE_STATE_REFERENCE__GENERIC_PARAMETERS = eINSTANCE.getBaseStateReference_GenericParameters();

        /**
         * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BASE_STATE_REFERENCE__PARAMETERS = eINSTANCE.getBaseStateReference_Parameters();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.PreemptionType <em>Preemption Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.sccharts.PreemptionType
         * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getPreemptionType()
         * @generated
         */
        EEnum PREEMPTION_TYPE = eINSTANCE.getPreemptionType();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.HistoryType <em>History Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.sccharts.HistoryType
         * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getHistoryType()
         * @generated
         */
        EEnum HISTORY_TYPE = eINSTANCE.getHistoryType();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.DelayType <em>Delay Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.sccharts.DelayType
         * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getDelayType()
         * @generated
         */
        EEnum DELAY_TYPE = eINSTANCE.getDelayType();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.DeferredType <em>Deferred Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.sccharts.DeferredType
         * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getDeferredType()
         * @generated
         */
        EEnum DEFERRED_TYPE = eINSTANCE.getDeferredType();

    }

} //SCChartsPackage
