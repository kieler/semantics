/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.cau.cs.kieler.core.annotations.AnnotationsPackage;
import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;

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
    String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Christian-Albrechts-University of Kiel\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

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
    String eNS_URI = "http://kieler.cs.cau.de/sccharts/0.1.0";

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
	 * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.sccharts.impl.ActionImpl
	 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getAction()
	 * @generated
	 */
    int ACTION = 0;

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
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION__DELAY = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION__LABEL = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 3;

    /**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION__IMMEDIATE = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 4;

    /**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_FEATURE_COUNT = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 5;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.EffectImpl <em>Effect</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.sccharts.impl.EffectImpl
	 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getEffect()
	 * @generated
	 */
    int EFFECT = 2;

    /**
	 * The number of structural features of the '<em>Effect</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EFFECT_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.sccharts.impl.AssignmentImpl
	 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getAssignment()
	 * @generated
	 */
    int ASSIGNMENT = 1;

    /**
	 * The feature id for the '<em><b>Valued Object</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ASSIGNMENT__VALUED_OBJECT = EFFECT_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ASSIGNMENT__EXPRESSION = EFFECT_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Indices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__INDICES = EFFECT_FEATURE_COUNT + 2;

				/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ASSIGNMENT_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 3;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.EmissionImpl <em>Emission</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.sccharts.impl.EmissionImpl
	 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getEmission()
	 * @generated
	 */
    int EMISSION = 3;

    /**
	 * The feature id for the '<em><b>Valued Object</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EMISSION__VALUED_OBJECT = EFFECT_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.ScopeImpl <em>Scope</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.sccharts.impl.ScopeImpl
	 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getScope()
	 * @generated
	 */
    int SCOPE = 15;

    /**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SCOPE__ANNOTATIONS = AnnotationsPackage.ANNOTATABLE__ANNOTATIONS;

    /**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SCOPE__ID = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SCOPE__LABEL = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Local Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SCOPE__LOCAL_ACTIONS = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Referenced Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SCOPE__REFERENCED_SCOPE = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 3;

    /**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SCOPE__BINDINGS = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 4;

    /**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SCOPE__DECLARATIONS = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 5;

    /**
	 * The feature id for the '<em><b>For</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SCOPE__FOR = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 6;

    /**
	 * The number of structural features of the '<em>Scope</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SCOPE_FEATURE_COUNT = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 7;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.sccharts.impl.BindingImpl
	 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getBinding()
	 * @generated
	 */
    int BINDING = 13;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.sccharts.impl.StateImpl
	 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getState()
	 * @generated
	 */
    int STATE = 4;

    /**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STATE__ANNOTATIONS = SCOPE__ANNOTATIONS;

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
	 * The feature id for the '<em><b>Local Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STATE__LOCAL_ACTIONS = SCOPE__LOCAL_ACTIONS;

    /**
	 * The feature id for the '<em><b>Referenced Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STATE__REFERENCED_SCOPE = SCOPE__REFERENCED_SCOPE;

    /**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STATE__BINDINGS = SCOPE__BINDINGS;

    /**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STATE__DECLARATIONS = SCOPE__DECLARATIONS;

    /**
	 * The feature id for the '<em><b>For</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STATE__FOR = SCOPE__FOR;

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
	 * The feature id for the '<em><b>Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STATE__INITIAL = SCOPE_FEATURE_COUNT + 3;

    /**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STATE__FINAL = SCOPE_FEATURE_COUNT + 4;

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
	 * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.Region2Impl <em>Region2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.sccharts.impl.Region2Impl
	 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getRegion2()
	 * @generated
	 */
	int REGION2 = 5;

				/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION2__ANNOTATIONS = SCOPE__ANNOTATIONS;

				/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION2__ID = SCOPE__ID;

				/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION2__LABEL = SCOPE__LABEL;

				/**
	 * The feature id for the '<em><b>Local Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION2__LOCAL_ACTIONS = SCOPE__LOCAL_ACTIONS;

				/**
	 * The feature id for the '<em><b>Referenced Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION2__REFERENCED_SCOPE = SCOPE__REFERENCED_SCOPE;

				/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION2__BINDINGS = SCOPE__BINDINGS;

				/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION2__DECLARATIONS = SCOPE__DECLARATIONS;

				/**
	 * The feature id for the '<em><b>For</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION2__FOR = SCOPE__FOR;

				/**
	 * The feature id for the '<em><b>Parent State</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION2__PARENT_STATE = SCOPE_FEATURE_COUNT + 0;

				/**
	 * The number of structural features of the '<em>Region2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION2_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 1;

				/**
	 * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.ControlflowRegionImpl <em>Controlflow Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.sccharts.impl.ControlflowRegionImpl
	 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getControlflowRegion()
	 * @generated
	 */
	int CONTROLFLOW_REGION = 6;

				/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLFLOW_REGION__ANNOTATIONS = REGION2__ANNOTATIONS;

				/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLFLOW_REGION__ID = REGION2__ID;

				/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLFLOW_REGION__LABEL = REGION2__LABEL;

				/**
	 * The feature id for the '<em><b>Local Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLFLOW_REGION__LOCAL_ACTIONS = REGION2__LOCAL_ACTIONS;

				/**
	 * The feature id for the '<em><b>Referenced Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLFLOW_REGION__REFERENCED_SCOPE = REGION2__REFERENCED_SCOPE;

				/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLFLOW_REGION__BINDINGS = REGION2__BINDINGS;

				/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLFLOW_REGION__DECLARATIONS = REGION2__DECLARATIONS;

				/**
	 * The feature id for the '<em><b>For</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLFLOW_REGION__FOR = REGION2__FOR;

				/**
	 * The feature id for the '<em><b>Parent State</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLFLOW_REGION__PARENT_STATE = REGION2__PARENT_STATE;

				/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLFLOW_REGION__STATES = REGION2_FEATURE_COUNT + 0;

				/**
	 * The number of structural features of the '<em>Controlflow Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLFLOW_REGION_FEATURE_COUNT = REGION2_FEATURE_COUNT + 1;

				/**
	 * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.DataflowRegionImpl <em>Dataflow Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.sccharts.impl.DataflowRegionImpl
	 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getDataflowRegion()
	 * @generated
	 */
	int DATAFLOW_REGION = 7;

				/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFLOW_REGION__ANNOTATIONS = REGION2__ANNOTATIONS;

				/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFLOW_REGION__ID = REGION2__ID;

				/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFLOW_REGION__LABEL = REGION2__LABEL;

				/**
	 * The feature id for the '<em><b>Local Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFLOW_REGION__LOCAL_ACTIONS = REGION2__LOCAL_ACTIONS;

				/**
	 * The feature id for the '<em><b>Referenced Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFLOW_REGION__REFERENCED_SCOPE = REGION2__REFERENCED_SCOPE;

				/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFLOW_REGION__BINDINGS = REGION2__BINDINGS;

				/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFLOW_REGION__DECLARATIONS = REGION2__DECLARATIONS;

				/**
	 * The feature id for the '<em><b>For</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFLOW_REGION__FOR = REGION2__FOR;

				/**
	 * The feature id for the '<em><b>Parent State</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFLOW_REGION__PARENT_STATE = REGION2__PARENT_STATE;

				/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFLOW_REGION__NODES = REGION2_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>Equations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFLOW_REGION__EQUATIONS = REGION2_FEATURE_COUNT + 1;

				/**
	 * The number of structural features of the '<em>Dataflow Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFLOW_REGION_FEATURE_COUNT = REGION2_FEATURE_COUNT + 2;

				/**
	 * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.sccharts.impl.NodeImpl
	 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getNode()
	 * @generated
	 */
    int NODE = 8;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.ReferenceNodeImpl <em>Reference Node</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.sccharts.impl.ReferenceNodeImpl
	 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getReferenceNode()
	 * @generated
	 */
    int REFERENCE_NODE = 9;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.CallNodeImpl <em>Call Node</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.sccharts.impl.CallNodeImpl
	 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getCallNode()
	 * @generated
	 */
    int CALL_NODE = 10;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.DefineNodeImpl <em>Define Node</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.sccharts.impl.DefineNodeImpl
	 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getDefineNode()
	 * @generated
	 */
    int DEFINE_NODE = 11;

    /**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE__ANNOTATIONS = AnnotationsPackage.ANNOTATABLE__ANNOTATIONS;

    /**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE__ID = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE__LABEL = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 1;

    /**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
   int NODE_FEATURE_COUNT = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int REFERENCE_NODE__ANNOTATIONS = NODE__ANNOTATIONS;

    /**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int REFERENCE_NODE__ID = NODE__ID;

    /**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int REFERENCE_NODE__LABEL = NODE__LABEL;

    /**
	 * The feature id for the '<em><b>Referenced Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int REFERENCE_NODE__REFERENCED_SCOPE = NODE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int REFERENCE_NODE__PARAMETERS = NODE_FEATURE_COUNT + 1;

    /**
	 * The number of structural features of the '<em>Reference Node</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int REFERENCE_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CALL_NODE__ANNOTATIONS = NODE__ANNOTATIONS;

    /**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CALL_NODE__ID = NODE__ID;

    /**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CALL_NODE__LABEL = NODE__LABEL;

    /**
	 * The feature id for the '<em><b>Call Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CALL_NODE__CALL_REFERENCE = NODE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CALL_NODE__PARAMETERS = NODE_FEATURE_COUNT + 1;

    /**
	 * The number of structural features of the '<em>Call Node</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CALL_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEFINE_NODE__ANNOTATIONS = NODE__ANNOTATIONS;

    /**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEFINE_NODE__ID = NODE__ID;

    /**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEFINE_NODE__LABEL = NODE__LABEL;

    /**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEFINE_NODE__INPUTS = NODE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEFINE_NODE__OUTPUTS = NODE_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Valued Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEFINE_NODE__VALUED_OBJECTS = NODE_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEFINE_NODE__EXPRESSIONS = NODE_FEATURE_COUNT + 3;

    /**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEFINE_NODE__STATES = NODE_FEATURE_COUNT + 4;

    /**
	 * The number of structural features of the '<em>Define Node</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEFINE_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 5;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.EquationImpl <em>Equation</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.sccharts.impl.EquationImpl
	 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getEquation()
	 * @generated
	 */
    int EQUATION = 12;

    /**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EQUATION__EXPRESSION = 0;

    /**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EQUATION__NODE = 1;

    /**
	 * The feature id for the '<em><b>Valued Object</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EQUATION__VALUED_OBJECT = 2;

    /**
	 * The number of structural features of the '<em>Equation</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EQUATION_FEATURE_COUNT = 3;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.sccharts.impl.TransitionImpl
	 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getTransition()
	 * @generated
	 */
    int TRANSITION = 14;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.TextEffectImpl <em>Text Effect</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.sccharts.impl.TextEffectImpl
	 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getTextEffect()
	 * @generated
	 */
    int TEXT_EFFECT = 16;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.FunctionCallEffectImpl <em>Function Call Effect</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.sccharts.impl.FunctionCallEffectImpl
	 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getFunctionCallEffect()
	 * @generated
	 */
    int FUNCTION_CALL_EFFECT = 17;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.LocalActionImpl <em>Local Action</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.sccharts.impl.LocalActionImpl
	 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getLocalAction()
	 * @generated
	 */
    int LOCAL_ACTION = 18;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.EntryActionImpl <em>Entry Action</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.sccharts.impl.EntryActionImpl
	 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getEntryAction()
	 * @generated
	 */
    int ENTRY_ACTION = 19;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.DuringActionImpl <em>During Action</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.sccharts.impl.DuringActionImpl
	 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getDuringAction()
	 * @generated
	 */
    int DURING_ACTION = 20;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.ExitActionImpl <em>Exit Action</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.sccharts.impl.ExitActionImpl
	 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getExitAction()
	 * @generated
	 */
    int EXIT_ACTION = 21;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.SuspendActionImpl <em>Suspend Action</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.sccharts.impl.SuspendActionImpl
	 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getSuspendAction()
	 * @generated
	 */
    int SUSPEND_ACTION = 22;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.ForImpl <em>For</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.sccharts.impl.ForImpl
	 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getFor()
	 * @generated
	 */
    int FOR = 24;

    /**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BINDING__ANNOTATIONS = AnnotationsPackage.ANNOTATABLE__ANNOTATIONS;

    /**
	 * The feature id for the '<em><b>Formal</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BINDING__FORMAL = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Actual</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BINDING__ACTUAL = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 1;

    /**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BINDING_FEATURE_COUNT = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TRANSITION__DELAY = ACTION__DELAY;

    /**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TRANSITION__LABEL = ACTION__LABEL;

    /**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TRANSITION__IMMEDIATE = ACTION__IMMEDIATE;

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
	 * The feature id for the '<em><b>Deferred</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TRANSITION__DEFERRED = ACTION_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>History</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TRANSITION__HISTORY = ACTION_FEATURE_COUNT + 3;

    /**
	 * The feature id for the '<em><b>Target State</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TRANSITION__TARGET_STATE = ACTION_FEATURE_COUNT + 4;

    /**
	 * The feature id for the '<em><b>Source State</b></em>' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TRANSITION__SOURCE_STATE = ACTION_FEATURE_COUNT + 5;

    /**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TRANSITION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 6;

    /**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEXT_EFFECT__TEXT = KExpressionsPackage.TEXT_EXPRESSION__TEXT;

    /**
	 * The number of structural features of the '<em>Text Effect</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEXT_EFFECT_FEATURE_COUNT = KExpressionsPackage.TEXT_EXPRESSION_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FUNCTION_CALL_EFFECT__FUNCTION_NAME = KExpressionsPackage.FUNCTION_CALL__FUNCTION_NAME;

    /**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FUNCTION_CALL_EFFECT__PARAMETERS = KExpressionsPackage.FUNCTION_CALL__PARAMETERS;

    /**
	 * The number of structural features of the '<em>Function Call Effect</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FUNCTION_CALL_EFFECT_FEATURE_COUNT = KExpressionsPackage.FUNCTION_CALL_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LOCAL_ACTION__DELAY = ACTION__DELAY;

    /**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LOCAL_ACTION__LABEL = ACTION__LABEL;

    /**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LOCAL_ACTION__IMMEDIATE = ACTION__IMMEDIATE;

    /**
	 * The number of structural features of the '<em>Local Action</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LOCAL_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENTRY_ACTION__DELAY = LOCAL_ACTION__DELAY;

    /**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENTRY_ACTION__LABEL = LOCAL_ACTION__LABEL;

    /**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENTRY_ACTION__IMMEDIATE = LOCAL_ACTION__IMMEDIATE;

    /**
	 * The number of structural features of the '<em>Entry Action</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENTRY_ACTION_FEATURE_COUNT = LOCAL_ACTION_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DURING_ACTION__DELAY = LOCAL_ACTION__DELAY;

    /**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DURING_ACTION__LABEL = LOCAL_ACTION__LABEL;

    /**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DURING_ACTION__IMMEDIATE = LOCAL_ACTION__IMMEDIATE;

    /**
	 * The number of structural features of the '<em>During Action</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DURING_ACTION_FEATURE_COUNT = LOCAL_ACTION_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXIT_ACTION__DELAY = LOCAL_ACTION__DELAY;

    /**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXIT_ACTION__LABEL = LOCAL_ACTION__LABEL;

    /**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXIT_ACTION__IMMEDIATE = LOCAL_ACTION__IMMEDIATE;

    /**
	 * The number of structural features of the '<em>Exit Action</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXIT_ACTION_FEATURE_COUNT = LOCAL_ACTION_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SUSPEND_ACTION__DELAY = LOCAL_ACTION__DELAY;

    /**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SUSPEND_ACTION__LABEL = LOCAL_ACTION__LABEL;

    /**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SUSPEND_ACTION__IMMEDIATE = LOCAL_ACTION__IMMEDIATE;

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
	 * The meta object id for the '{@link de.cau.cs.kieler.sccharts.impl.IterateActionImpl <em>Iterate Action</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.sccharts.impl.IterateActionImpl
	 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getIterateAction()
	 * @generated
	 */
    int ITERATE_ACTION = 23;

    /**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ITERATE_ACTION__ANNOTATIONS = LOCAL_ACTION__ANNOTATIONS;

    /**
	 * The feature id for the '<em><b>Effects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ITERATE_ACTION__EFFECTS = LOCAL_ACTION__EFFECTS;

    /**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ITERATE_ACTION__TRIGGER = LOCAL_ACTION__TRIGGER;

    /**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ITERATE_ACTION__DELAY = LOCAL_ACTION__DELAY;

    /**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ITERATE_ACTION__LABEL = LOCAL_ACTION__LABEL;

    /**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ITERATE_ACTION__IMMEDIATE = LOCAL_ACTION__IMMEDIATE;

    /**
	 * The number of structural features of the '<em>Iterate Action</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ITERATE_ACTION_FEATURE_COUNT = LOCAL_ACTION_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Loop Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FOR__LOOP_VARIABLE = 0;

    /**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FOR__FROM = 1;

    /**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FOR__TO = 2;

    /**
	 * The feature id for the '<em><b>Valued Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FOR__VALUED_OBJECT = 3;

    /**
	 * The number of structural features of the '<em>For</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FOR_FEATURE_COUNT = 4;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.sccharts.StateType <em>State Type</em>}' enum.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.sccharts.StateType
	 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getStateType()
	 * @generated
	 */
    int STATE_TYPE = 25;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.sccharts.TransitionType <em>Transition Type</em>}' enum.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.sccharts.TransitionType
	 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getTransitionType()
	 * @generated
	 */
    int TRANSITION_TYPE = 26;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.sccharts.HistoryType <em>History Type</em>}' enum.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.sccharts.HistoryType
	 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getHistoryType()
	 * @generated
	 */
    int HISTORY_TYPE = 27;

    /**
	 * The meta object id for the '<em>Parsable</em>' data type.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getParsable()
	 * @generated
	 */
    int PARSABLE = 28;


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
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sccharts.Action#isImmediate <em>Immediate</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Immediate</em>'.
	 * @see de.cau.cs.kieler.sccharts.Action#isImmediate()
	 * @see #getAction()
	 * @generated
	 */
    EAttribute getAction_Immediate();

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
	 * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see de.cau.cs.kieler.sccharts.Assignment
	 * @generated
	 */
    EClass getAssignment();

    /**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.sccharts.Assignment#getValuedObject <em>Valued Object</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Valued Object</em>'.
	 * @see de.cau.cs.kieler.sccharts.Assignment#getValuedObject()
	 * @see #getAssignment()
	 * @generated
	 */
    EReference getAssignment_ValuedObject();

    /**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.sccharts.Assignment#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see de.cau.cs.kieler.sccharts.Assignment#getExpression()
	 * @see #getAssignment()
	 * @generated
	 */
    EReference getAssignment_Expression();

    /**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.sccharts.Assignment#getIndices <em>Indices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Indices</em>'.
	 * @see de.cau.cs.kieler.sccharts.Assignment#getIndices()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Indices();

				/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.Effect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Effect</em>'.
	 * @see de.cau.cs.kieler.sccharts.Effect
	 * @generated
	 */
    EClass getEffect();

    /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.Emission <em>Emission</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emission</em>'.
	 * @see de.cau.cs.kieler.sccharts.Emission
	 * @generated
	 */
    EClass getEmission();

    /**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.sccharts.Emission#getValuedObject <em>Valued Object</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Valued Object</em>'.
	 * @see de.cau.cs.kieler.sccharts.Emission#getValuedObject()
	 * @see #getEmission()
	 * @generated
	 */
    EReference getEmission_ValuedObject();

    /**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.sccharts.Emission#getNewValue <em>New Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New Value</em>'.
	 * @see de.cau.cs.kieler.sccharts.Emission#getNewValue()
	 * @see #getEmission()
	 * @generated
	 */
    EReference getEmission_NewValue();

    /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see de.cau.cs.kieler.sccharts.Node
	 * @generated
	 */
    EClass getNode();

    /**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sccharts.Node#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.cau.cs.kieler.sccharts.Node#getId()
	 * @see #getNode()
	 * @generated
	 */
    EAttribute getNode_Id();

    /**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sccharts.Node#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see de.cau.cs.kieler.sccharts.Node#getLabel()
	 * @see #getNode()
	 * @generated
	 */
    EAttribute getNode_Label();

    /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.ReferenceNode <em>Reference Node</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Node</em>'.
	 * @see de.cau.cs.kieler.sccharts.ReferenceNode
	 * @generated
	 */
    EClass getReferenceNode();

    /**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.sccharts.ReferenceNode#getReferencedScope <em>Referenced Scope</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Scope</em>'.
	 * @see de.cau.cs.kieler.sccharts.ReferenceNode#getReferencedScope()
	 * @see #getReferenceNode()
	 * @generated
	 */
    EReference getReferenceNode_ReferencedScope();

    /**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.sccharts.ReferenceNode#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see de.cau.cs.kieler.sccharts.ReferenceNode#getParameters()
	 * @see #getReferenceNode()
	 * @generated
	 */
    EReference getReferenceNode_Parameters();

    /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.CallNode <em>Call Node</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Node</em>'.
	 * @see de.cau.cs.kieler.sccharts.CallNode
	 * @generated
	 */
    EClass getCallNode();

    /**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.sccharts.CallNode#getCallReference <em>Call Reference</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Call Reference</em>'.
	 * @see de.cau.cs.kieler.sccharts.CallNode#getCallReference()
	 * @see #getCallNode()
	 * @generated
	 */
    EReference getCallNode_CallReference();

    /**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.sccharts.CallNode#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see de.cau.cs.kieler.sccharts.CallNode#getParameters()
	 * @see #getCallNode()
	 * @generated
	 */
    EReference getCallNode_Parameters();

    /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.DefineNode <em>Define Node</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Define Node</em>'.
	 * @see de.cau.cs.kieler.sccharts.DefineNode
	 * @generated
	 */
    EClass getDefineNode();

    /**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.sccharts.DefineNode#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see de.cau.cs.kieler.sccharts.DefineNode#getInputs()
	 * @see #getDefineNode()
	 * @generated
	 */
    EReference getDefineNode_Inputs();

    /**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.sccharts.DefineNode#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see de.cau.cs.kieler.sccharts.DefineNode#getOutputs()
	 * @see #getDefineNode()
	 * @generated
	 */
    EReference getDefineNode_Outputs();

    /**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.sccharts.DefineNode#getValuedObjects <em>Valued Objects</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Valued Objects</em>'.
	 * @see de.cau.cs.kieler.sccharts.DefineNode#getValuedObjects()
	 * @see #getDefineNode()
	 * @generated
	 */
    EReference getDefineNode_ValuedObjects();

    /**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.sccharts.DefineNode#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see de.cau.cs.kieler.sccharts.DefineNode#getExpressions()
	 * @see #getDefineNode()
	 * @generated
	 */
    EReference getDefineNode_Expressions();

    /**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.sccharts.DefineNode#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see de.cau.cs.kieler.sccharts.DefineNode#getStates()
	 * @see #getDefineNode()
	 * @generated
	 */
    EReference getDefineNode_States();

    /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.Equation <em>Equation</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equation</em>'.
	 * @see de.cau.cs.kieler.sccharts.Equation
	 * @generated
	 */
    EClass getEquation();

    /**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.sccharts.Equation#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see de.cau.cs.kieler.sccharts.Equation#getExpression()
	 * @see #getEquation()
	 * @generated
	 */
    EReference getEquation_Expression();

    /**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.sccharts.Equation#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see de.cau.cs.kieler.sccharts.Equation#getNode()
	 * @see #getEquation()
	 * @generated
	 */
    EReference getEquation_Node();

    /**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.sccharts.Equation#getValuedObject <em>Valued Object</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Valued Object</em>'.
	 * @see de.cau.cs.kieler.sccharts.Equation#getValuedObject()
	 * @see #getEquation()
	 * @generated
	 */
    EReference getEquation_ValuedObject();

    /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see de.cau.cs.kieler.sccharts.Binding
	 * @generated
	 */
    EClass getBinding();

    /**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.sccharts.Binding#getFormal <em>Formal</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Formal</em>'.
	 * @see de.cau.cs.kieler.sccharts.Binding#getFormal()
	 * @see #getBinding()
	 * @generated
	 */
    EReference getBinding_Formal();

    /**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.sccharts.Binding#getActual <em>Actual</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actual</em>'.
	 * @see de.cau.cs.kieler.sccharts.Binding#getActual()
	 * @see #getBinding()
	 * @generated
	 */
    EReference getBinding_Actual();

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
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sccharts.State#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.cau.cs.kieler.sccharts.State#getType()
	 * @see #getState()
	 * @generated
	 */
    EAttribute getState_Type();

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
	 * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.Region2 <em>Region2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region2</em>'.
	 * @see de.cau.cs.kieler.sccharts.Region2
	 * @generated
	 */
	EClass getRegion2();

				/**
	 * Returns the meta object for the container reference '{@link de.cau.cs.kieler.sccharts.Region2#getParentState <em>Parent State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent State</em>'.
	 * @see de.cau.cs.kieler.sccharts.Region2#getParentState()
	 * @see #getRegion2()
	 * @generated
	 */
	EReference getRegion2_ParentState();

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
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.sccharts.DataflowRegion#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see de.cau.cs.kieler.sccharts.DataflowRegion#getNodes()
	 * @see #getDataflowRegion()
	 * @generated
	 */
	EReference getDataflowRegion_Nodes();

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
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sccharts.Transition#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see de.cau.cs.kieler.sccharts.Transition#getPriority()
	 * @see #getTransition()
	 * @generated
	 */
    EAttribute getTransition_Priority();

    /**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sccharts.Transition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.cau.cs.kieler.sccharts.Transition#getType()
	 * @see #getTransition()
	 * @generated
	 */
    EAttribute getTransition_Type();

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
	 * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope</em>'.
	 * @see de.cau.cs.kieler.sccharts.Scope
	 * @generated
	 */
    EClass getScope();

    /**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sccharts.Scope#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.cau.cs.kieler.sccharts.Scope#getId()
	 * @see #getScope()
	 * @generated
	 */
    EAttribute getScope_Id();

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
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.sccharts.Scope#getLocalActions <em>Local Actions</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Actions</em>'.
	 * @see de.cau.cs.kieler.sccharts.Scope#getLocalActions()
	 * @see #getScope()
	 * @generated
	 */
    EReference getScope_LocalActions();

    /**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.sccharts.Scope#getReferencedScope <em>Referenced Scope</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Scope</em>'.
	 * @see de.cau.cs.kieler.sccharts.Scope#getReferencedScope()
	 * @see #getScope()
	 * @generated
	 */
    EReference getScope_ReferencedScope();

    /**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.sccharts.Scope#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see de.cau.cs.kieler.sccharts.Scope#getBindings()
	 * @see #getScope()
	 * @generated
	 */
    EReference getScope_Bindings();

    /**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.sccharts.Scope#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see de.cau.cs.kieler.sccharts.Scope#getDeclarations()
	 * @see #getScope()
	 * @generated
	 */
    EReference getScope_Declarations();

    /**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.sccharts.Scope#getFor <em>For</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>For</em>'.
	 * @see de.cau.cs.kieler.sccharts.Scope#getFor()
	 * @see #getScope()
	 * @generated
	 */
    EReference getScope_For();

    /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.TextEffect <em>Text Effect</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Effect</em>'.
	 * @see de.cau.cs.kieler.sccharts.TextEffect
	 * @generated
	 */
    EClass getTextEffect();

    /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.FunctionCallEffect <em>Function Call Effect</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Call Effect</em>'.
	 * @see de.cau.cs.kieler.sccharts.FunctionCallEffect
	 * @generated
	 */
    EClass getFunctionCallEffect();

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
	 * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.IterateAction <em>Iterate Action</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterate Action</em>'.
	 * @see de.cau.cs.kieler.sccharts.IterateAction
	 * @generated
	 */
    EClass getIterateAction();

    /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.For <em>For</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For</em>'.
	 * @see de.cau.cs.kieler.sccharts.For
	 * @generated
	 */
    EClass getFor();

    /**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.sccharts.For#getLoopVariable <em>Loop Variable</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Loop Variable</em>'.
	 * @see de.cau.cs.kieler.sccharts.For#getLoopVariable()
	 * @see #getFor()
	 * @generated
	 */
    EReference getFor_LoopVariable();

    /**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sccharts.For#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see de.cau.cs.kieler.sccharts.For#getFrom()
	 * @see #getFor()
	 * @generated
	 */
    EAttribute getFor_From();

    /**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sccharts.For#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see de.cau.cs.kieler.sccharts.For#getTo()
	 * @see #getFor()
	 * @generated
	 */
    EAttribute getFor_To();

    /**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.sccharts.For#getValuedObject <em>Valued Object</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valued Object</em>'.
	 * @see de.cau.cs.kieler.sccharts.For#getValuedObject()
	 * @see #getFor()
	 * @generated
	 */
    EReference getFor_ValuedObject();

    /**
	 * Returns the meta object for enum '{@link de.cau.cs.kieler.sccharts.StateType <em>State Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>State Type</em>'.
	 * @see de.cau.cs.kieler.sccharts.StateType
	 * @generated
	 */
    EEnum getStateType();

    /**
	 * Returns the meta object for enum '{@link de.cau.cs.kieler.sccharts.TransitionType <em>Transition Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transition Type</em>'.
	 * @see de.cau.cs.kieler.sccharts.TransitionType
	 * @generated
	 */
    EEnum getTransitionType();

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
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute ACTION__DELAY = eINSTANCE.getAction_Delay();

        /**
		 * The meta object literal for the '<em><b>Immediate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute ACTION__IMMEDIATE = eINSTANCE.getAction_Immediate();

        /**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute ACTION__LABEL = eINSTANCE.getAction_Label();

        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.sccharts.impl.AssignmentImpl
		 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getAssignment()
		 * @generated
		 */
        EClass ASSIGNMENT = eINSTANCE.getAssignment();

        /**
		 * The meta object literal for the '<em><b>Valued Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ASSIGNMENT__VALUED_OBJECT = eINSTANCE.getAssignment_ValuedObject();

        /**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ASSIGNMENT__EXPRESSION = eINSTANCE.getAssignment_Expression();

        /**
		 * The meta object literal for the '<em><b>Indices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__INDICES = eINSTANCE.getAssignment_Indices();

								/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.impl.EffectImpl <em>Effect</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.sccharts.impl.EffectImpl
		 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getEffect()
		 * @generated
		 */
        EClass EFFECT = eINSTANCE.getEffect();

        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.impl.EmissionImpl <em>Emission</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.sccharts.impl.EmissionImpl
		 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getEmission()
		 * @generated
		 */
        EClass EMISSION = eINSTANCE.getEmission();

        /**
		 * The meta object literal for the '<em><b>Valued Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference EMISSION__VALUED_OBJECT = eINSTANCE.getEmission_ValuedObject();

        /**
		 * The meta object literal for the '<em><b>New Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference EMISSION__NEW_VALUE = eINSTANCE.getEmission_NewValue();

        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.sccharts.impl.NodeImpl
		 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getNode()
		 * @generated
		 */
        EClass NODE = eINSTANCE.getNode();

        /**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute NODE__ID = eINSTANCE.getNode_Id();

        /**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute NODE__LABEL = eINSTANCE.getNode_Label();

        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.impl.ReferenceNodeImpl <em>Reference Node</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.sccharts.impl.ReferenceNodeImpl
		 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getReferenceNode()
		 * @generated
		 */
        EClass REFERENCE_NODE = eINSTANCE.getReferenceNode();

        /**
		 * The meta object literal for the '<em><b>Referenced Scope</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference REFERENCE_NODE__REFERENCED_SCOPE = eINSTANCE.getReferenceNode_ReferencedScope();

        /**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference REFERENCE_NODE__PARAMETERS = eINSTANCE.getReferenceNode_Parameters();

        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.impl.CallNodeImpl <em>Call Node</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.sccharts.impl.CallNodeImpl
		 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getCallNode()
		 * @generated
		 */
        EClass CALL_NODE = eINSTANCE.getCallNode();

        /**
		 * The meta object literal for the '<em><b>Call Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference CALL_NODE__CALL_REFERENCE = eINSTANCE.getCallNode_CallReference();

        /**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference CALL_NODE__PARAMETERS = eINSTANCE.getCallNode_Parameters();

        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.impl.DefineNodeImpl <em>Define Node</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.sccharts.impl.DefineNodeImpl
		 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getDefineNode()
		 * @generated
		 */
        EClass DEFINE_NODE = eINSTANCE.getDefineNode();

        /**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference DEFINE_NODE__INPUTS = eINSTANCE.getDefineNode_Inputs();

        /**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference DEFINE_NODE__OUTPUTS = eINSTANCE.getDefineNode_Outputs();

        /**
		 * The meta object literal for the '<em><b>Valued Objects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference DEFINE_NODE__VALUED_OBJECTS = eINSTANCE.getDefineNode_ValuedObjects();

        /**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference DEFINE_NODE__EXPRESSIONS = eINSTANCE.getDefineNode_Expressions();

        /**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference DEFINE_NODE__STATES = eINSTANCE.getDefineNode_States();

        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.impl.EquationImpl <em>Equation</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.sccharts.impl.EquationImpl
		 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getEquation()
		 * @generated
		 */
        EClass EQUATION = eINSTANCE.getEquation();

        /**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference EQUATION__EXPRESSION = eINSTANCE.getEquation_Expression();

        /**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference EQUATION__NODE = eINSTANCE.getEquation_Node();

        /**
		 * The meta object literal for the '<em><b>Valued Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference EQUATION__VALUED_OBJECT = eINSTANCE.getEquation_ValuedObject();

        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.sccharts.impl.BindingImpl
		 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getBinding()
		 * @generated
		 */
        EClass BINDING = eINSTANCE.getBinding();

        /**
		 * The meta object literal for the '<em><b>Formal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference BINDING__FORMAL = eINSTANCE.getBinding_Formal();

        /**
		 * The meta object literal for the '<em><b>Actual</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference BINDING__ACTUAL = eINSTANCE.getBinding_Actual();

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
		 * The meta object literal for the '<em><b>Parent Region</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference STATE__PARENT_REGION = eINSTANCE.getState_ParentRegion();

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
		 * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.impl.Region2Impl <em>Region2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.sccharts.impl.Region2Impl
		 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getRegion2()
		 * @generated
		 */
		EClass REGION2 = eINSTANCE.getRegion2();

								/**
		 * The meta object literal for the '<em><b>Parent State</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION2__PARENT_STATE = eINSTANCE.getRegion2_ParentState();

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
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATAFLOW_REGION__NODES = eINSTANCE.getDataflowRegion_Nodes();

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
		 * The meta object literal for the '<em><b>Deferred</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute TRANSITION__DEFERRED = eINSTANCE.getTransition_Deferred();

        /**
		 * The meta object literal for the '<em><b>History</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute TRANSITION__HISTORY = eINSTANCE.getTransition_History();

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
		 * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.impl.ScopeImpl <em>Scope</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.sccharts.impl.ScopeImpl
		 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getScope()
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
		 * The meta object literal for the '<em><b>Local Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference SCOPE__LOCAL_ACTIONS = eINSTANCE.getScope_LocalActions();

        /**
		 * The meta object literal for the '<em><b>Referenced Scope</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference SCOPE__REFERENCED_SCOPE = eINSTANCE.getScope_ReferencedScope();

        /**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference SCOPE__BINDINGS = eINSTANCE.getScope_Bindings();

        /**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference SCOPE__DECLARATIONS = eINSTANCE.getScope_Declarations();

        /**
		 * The meta object literal for the '<em><b>For</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference SCOPE__FOR = eINSTANCE.getScope_For();

        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.impl.TextEffectImpl <em>Text Effect</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.sccharts.impl.TextEffectImpl
		 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getTextEffect()
		 * @generated
		 */
        EClass TEXT_EFFECT = eINSTANCE.getTextEffect();

        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.impl.FunctionCallEffectImpl <em>Function Call Effect</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.sccharts.impl.FunctionCallEffectImpl
		 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getFunctionCallEffect()
		 * @generated
		 */
        EClass FUNCTION_CALL_EFFECT = eINSTANCE.getFunctionCallEffect();

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
		 * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.impl.IterateActionImpl <em>Iterate Action</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.sccharts.impl.IterateActionImpl
		 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getIterateAction()
		 * @generated
		 */
        EClass ITERATE_ACTION = eINSTANCE.getIterateAction();

        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.impl.ForImpl <em>For</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.sccharts.impl.ForImpl
		 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getFor()
		 * @generated
		 */
        EClass FOR = eINSTANCE.getFor();

        /**
		 * The meta object literal for the '<em><b>Loop Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference FOR__LOOP_VARIABLE = eINSTANCE.getFor_LoopVariable();

        /**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute FOR__FROM = eINSTANCE.getFor_From();

        /**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute FOR__TO = eINSTANCE.getFor_To();

        /**
		 * The meta object literal for the '<em><b>Valued Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference FOR__VALUED_OBJECT = eINSTANCE.getFor_ValuedObject();

        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.StateType <em>State Type</em>}' enum.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.sccharts.StateType
		 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getStateType()
		 * @generated
		 */
        EEnum STATE_TYPE = eINSTANCE.getStateType();

        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.TransitionType <em>Transition Type</em>}' enum.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.sccharts.TransitionType
		 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getTransitionType()
		 * @generated
		 */
        EEnum TRANSITION_TYPE = eINSTANCE.getTransitionType();

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
		 * The meta object literal for the '<em>Parsable</em>' data type.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl#getParsable()
		 * @generated
		 */
        EDataType PARSABLE = eINSTANCE.getParsable();

    }

} //SCChartsPackage
