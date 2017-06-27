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
     * The number of structural features of the '<em>SC Charts</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SC_CHARTS_FEATURE_COUNT = AnnotationsPackage.PRAGMATABLE_FEATURE_COUNT + 1;

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
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE__ID = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE__LABEL = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Actions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE__ACTIONS = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Reference</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE__REFERENCE = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Scope</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE_FEATURE_COUNT = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 5;

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
     * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE_CALL__PARAMETERS = KExpressionsPackage.CALL__PARAMETERS;

    /**
     * The feature id for the '<em><b>Scope</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE_CALL__SCOPE = KExpressionsPackage.CALL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Scope Call</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE_CALL_FEATURE_COUNT = KExpressionsPackage.CALL_FEATURE_COUNT + 1;

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
     * The feature id for the '<em><b>Effects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__EFFECTS = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Trigger</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__TRIGGER = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Trigger Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__TRIGGER_DELAY = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__LABEL = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__DELAY = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Action</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_FEATURE_COUNT = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 5;

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
     * The feature id for the '<em><b>Actions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__ACTIONS = SCOPE__ACTIONS;

    /**
     * The feature id for the '<em><b>Reference</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE__REFERENCE = SCOPE__REFERENCE;

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
     * The number of structural features of the '<em>State</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATE_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 8;

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
     * The feature id for the '<em><b>Actions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGION__ACTIONS = SCOPE__ACTIONS;

    /**
     * The feature id for the '<em><b>Reference</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGION__REFERENCE = SCOPE__REFERENCE;

    /**
     * The feature id for the '<em><b>Parent State</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGION__PARENT_STATE = SCOPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Region</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGION_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 1;

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
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLFLOW_REGION__ID = REGION__ID;

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
     * The feature id for the '<em><b>Reference</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLFLOW_REGION__REFERENCE = REGION__REFERENCE;

    /**
     * The feature id for the '<em><b>Parent State</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLFLOW_REGION__PARENT_STATE = REGION__PARENT_STATE;

    /**
     * The feature id for the '<em><b>States</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLFLOW_REGION__STATES = REGION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Controlflow Region</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLFLOW_REGION_FEATURE_COUNT = REGION_FEATURE_COUNT + 1;

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
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATAFLOW_REGION__ID = REGION__ID;

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
     * The feature id for the '<em><b>Reference</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATAFLOW_REGION__REFERENCE = REGION__REFERENCE;

    /**
     * The feature id for the '<em><b>Parent State</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATAFLOW_REGION__PARENT_STATE = REGION__PARENT_STATE;

    /**
     * The feature id for the '<em><b>Equations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATAFLOW_REGION__EQUATIONS = REGION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Dataflow Region</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATAFLOW_REGION_FEATURE_COUNT = REGION_FEATURE_COUNT + 1;

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
     * The number of structural features of the '<em>Entry Action</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_ACTION_FEATURE_COUNT = LOCAL_ACTION_FEATURE_COUNT + 0;

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
     * The number of structural features of the '<em>Exit Action</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_ACTION_FEATURE_COUNT = LOCAL_ACTION_FEATURE_COUNT + 0;

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
     * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.PrecedingActionImpl <em>Preceding Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sccharts.impl.PrecedingActionImpl
     * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getPrecedingAction()
     * @generated
     */
    int PRECEDING_ACTION = 14;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRECEDING_ACTION__ANNOTATIONS = LOCAL_ACTION__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Effects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRECEDING_ACTION__EFFECTS = LOCAL_ACTION__EFFECTS;

    /**
     * The feature id for the '<em><b>Trigger</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRECEDING_ACTION__TRIGGER = LOCAL_ACTION__TRIGGER;

    /**
     * The feature id for the '<em><b>Trigger Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRECEDING_ACTION__TRIGGER_DELAY = LOCAL_ACTION__TRIGGER_DELAY;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRECEDING_ACTION__LABEL = LOCAL_ACTION__LABEL;

    /**
     * The feature id for the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRECEDING_ACTION__DELAY = LOCAL_ACTION__DELAY;

    /**
     * The number of structural features of the '<em>Preceding Action</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRECEDING_ACTION_FEATURE_COUNT = LOCAL_ACTION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.SucceedingActionImpl <em>Succeeding Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sccharts.impl.SucceedingActionImpl
     * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getSucceedingAction()
     * @generated
     */
    int SUCCEEDING_ACTION = 15;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCEEDING_ACTION__ANNOTATIONS = LOCAL_ACTION__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Effects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCEEDING_ACTION__EFFECTS = LOCAL_ACTION__EFFECTS;

    /**
     * The feature id for the '<em><b>Trigger</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCEEDING_ACTION__TRIGGER = LOCAL_ACTION__TRIGGER;

    /**
     * The feature id for the '<em><b>Trigger Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCEEDING_ACTION__TRIGGER_DELAY = LOCAL_ACTION__TRIGGER_DELAY;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCEEDING_ACTION__LABEL = LOCAL_ACTION__LABEL;

    /**
     * The feature id for the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCEEDING_ACTION__DELAY = LOCAL_ACTION__DELAY;

    /**
     * The number of structural features of the '<em>Succeeding Action</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCEEDING_ACTION_FEATURE_COUNT = LOCAL_ACTION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.sccharts.PreemptionType <em>Preemption Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sccharts.PreemptionType
     * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getPreemptionType()
     * @generated
     */
    int PREEMPTION_TYPE = 16;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.sccharts.HistoryType <em>History Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sccharts.HistoryType
     * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getHistoryType()
     * @generated
     */
    int HISTORY_TYPE = 17;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.sccharts.DelayType <em>Delay Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sccharts.DelayType
     * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getDelayType()
     * @generated
     */
    int DELAY_TYPE = 18;


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
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.sccharts.Scope#getReference <em>Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Reference</em>'.
     * @see de.cau.cs.kieler.sccharts.Scope#getReference()
     * @see #getScope()
     * @generated
     */
    EReference getScope_Reference();

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
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.sccharts.ScopeCall#getScope <em>Scope</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Scope</em>'.
     * @see de.cau.cs.kieler.sccharts.ScopeCall#getScope()
     * @see #getScopeCall()
     * @generated
     */
    EReference getScopeCall_Scope();

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
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sccharts.Transition#isDeferred <em>Deferred</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Deferred</em>'.
     * @see de.cau.cs.kieler.sccharts.Transition#isDeferred()
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
     * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.PrecedingAction <em>Preceding Action</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Preceding Action</em>'.
     * @see de.cau.cs.kieler.sccharts.PrecedingAction
     * @generated
     */
    EClass getPrecedingAction();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.SucceedingAction <em>Succeeding Action</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Succeeding Action</em>'.
     * @see de.cau.cs.kieler.sccharts.SucceedingAction
     * @generated
     */
    EClass getSucceedingAction();

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
         * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCOPE__REFERENCE = eINSTANCE.getScope_Reference();

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
         * The meta object literal for the '<em><b>Scope</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCOPE_CALL__SCOPE = eINSTANCE.getScopeCall_Scope();

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
         * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.impl.PrecedingActionImpl <em>Preceding Action</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.sccharts.impl.PrecedingActionImpl
         * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getPrecedingAction()
         * @generated
         */
        EClass PRECEDING_ACTION = eINSTANCE.getPrecedingAction();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.impl.SucceedingActionImpl <em>Succeeding Action</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.sccharts.impl.SucceedingActionImpl
         * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getSucceedingAction()
         * @generated
         */
        EClass SUCCEEDING_ACTION = eINSTANCE.getSucceedingAction();

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

    }

} //SCChartsPackage
