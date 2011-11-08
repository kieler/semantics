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
 */
package de.cau.cs.kieler.synccharts;

import de.cau.cs.kieler.core.annotations.AnnotationsPackage;

import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;

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
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2009 by\n+ Christian-Albrechts-University of Kiel\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

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
    String eNS_URI = "http://kieler.cs.cau.de/synccharts/0.2.4";

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
	 * The feature id for the '<em><b>Is Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION__IS_IMMEDIATE = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 3;

    /**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION__LABEL = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 4;

    /**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_FEATURE_COUNT = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 5;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.EffectImpl <em>Effect</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts.impl.EffectImpl
	 * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getEffect()
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
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.EmissionImpl <em>Emission</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts.impl.EmissionImpl
	 * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getEmission()
	 * @generated
	 */
    int EMISSION = 3;

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
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.ScopeImpl <em>Scope</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts.impl.ScopeImpl
	 * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getScope()
	 * @generated
	 */
    int SCOPE = 8;

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
	 * The feature id for the '<em><b>Signals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SCOPE__SIGNALS = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SCOPE__VARIABLES = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 3;

    /**
	 * The feature id for the '<em><b>Suspension Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SCOPE__SUSPENSION_TRIGGER = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 4;

    /**
	 * The feature id for the '<em><b>Exit Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SCOPE__EXIT_ACTIONS = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 5;

    /**
	 * The feature id for the '<em><b>Inner Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SCOPE__INNER_ACTIONS = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 6;

    /**
	 * The feature id for the '<em><b>Entry Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SCOPE__ENTRY_ACTIONS = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 7;

    /**
	 * The feature id for the '<em><b>Body Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SCOPE__BODY_REFERENCE = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 8;

    /**
	 * The feature id for the '<em><b>Body Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SCOPE__BODY_CONTENTS = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 9;

    /**
	 * The feature id for the '<em><b>Body Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SCOPE__BODY_TEXT = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 10;

    /**
	 * The feature id for the '<em><b>Renamings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SCOPE__RENAMINGS = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 11;

    /**
	 * The feature id for the '<em><b>Interface Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SCOPE__INTERFACE_DECLARATION = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 12;

    /**
	 * The number of structural features of the '<em>Scope</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SCOPE_FEATURE_COUNT = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 13;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts.impl.RegionImpl
	 * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getRegion()
	 * @generated
	 */
    int REGION = 4;

    /**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int REGION__ANNOTATIONS = SCOPE__ANNOTATIONS;

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
	 * The feature id for the '<em><b>Body Text</b></em>' containment reference list.
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
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int REGION__STATES = SCOPE_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.SubstitutionImpl <em>Substitution</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts.impl.SubstitutionImpl
	 * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getSubstitution()
	 * @generated
	 */
    int SUBSTITUTION = 5;

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
    int STATE = 6;

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
	 * The feature id for the '<em><b>Body Text</b></em>' containment reference list.
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
    int TRANSITION = 7;

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
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts.impl.TextEffectImpl <em>Text Effect</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts.impl.TextEffectImpl
	 * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getTextEffect()
	 * @generated
	 */
    int TEXT_EFFECT = 9;

    /**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEXT_EFFECT__CODE = KExpressionsPackage.TEXTUAL_CODE__CODE;

    /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEXT_EFFECT__TYPE = KExpressionsPackage.TEXTUAL_CODE__TYPE;

    /**
	 * The number of structural features of the '<em>Text Effect</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEXT_EFFECT_FEATURE_COUNT = KExpressionsPackage.TEXTUAL_CODE_FEATURE_COUNT + 0;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts.StateType <em>State Type</em>}' enum.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts.StateType
	 * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getStateType()
	 * @generated
	 */
    int STATE_TYPE = 10;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.synccharts.TransitionType <em>Transition Type</em>}' enum.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.synccharts.TransitionType
	 * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getTransitionType()
	 * @generated
	 */
    int TRANSITION_TYPE = 11;

    /**
	 * The meta object id for the '<em>Parsable</em>' data type.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getParsable()
	 * @generated
	 */
    int PARSABLE = 12;


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
	 * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see de.cau.cs.kieler.synccharts.Region
	 * @generated
	 */
    EClass getRegion();

    /**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.Region#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see de.cau.cs.kieler.synccharts.Region#getStates()
	 * @see #getRegion()
	 * @generated
	 */
    EReference getRegion_States();

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
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.Scope#getBodyText <em>Body Text</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body Text</em>'.
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
	 * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.TextEffect <em>Text Effect</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Effect</em>'.
	 * @see de.cau.cs.kieler.synccharts.TextEffect
	 * @generated
	 */
    EClass getTextEffect();

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
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts.impl.RegionImpl
		 * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getRegion()
		 * @generated
		 */
        EClass REGION = eINSTANCE.getRegion();

        /**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference REGION__STATES = eINSTANCE.getRegion_States();

        /**
		 * The meta object literal for the '<em><b>Parent State</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference REGION__PARENT_STATE = eINSTANCE.getRegion_ParentState();

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
		 * The meta object literal for the '<em><b>Is History</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute TRANSITION__IS_HISTORY = eINSTANCE.getTransition_IsHistory();

        /**
		 * The meta object literal for the '<em><b>Source State</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference TRANSITION__SOURCE_STATE = eINSTANCE.getTransition_SourceState();

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
		 * The meta object literal for the '<em><b>Body Text</b></em>' containment reference list feature.
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
		 * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.impl.TextEffectImpl <em>Text Effect</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.synccharts.impl.TextEffectImpl
		 * @see de.cau.cs.kieler.synccharts.impl.SyncchartsPackageImpl#getTextEffect()
		 * @generated
		 */
        EClass TEXT_EFFECT = eINSTANCE.getTextEffect();

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
