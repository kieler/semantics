/**
 *  KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *  http://www.informatik.uni-kiel.de/rtsys/kieler/
 *   
 *  Copyright 2012 by
 *   + Christian-Albrechts-University of Kiel
 *    + Department of Computer Science
 *       + Real-Time and Embedded Systems Group
 *   
 *   This code is provided under the terms of the Eclipse Public License (EPL).
 *   See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.yakindu.model.sgraph.syncgraph;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.yakindu.sct.model.sgraph.SGraphPackage;

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
 * @see de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncgraphFactory
 * @model kind="package"
 * @generated
 */
public interface SyncgraphPackage extends EPackage {
	/**
     * The package name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNAME = "syncgraph";

	/**
     * The package namespace URI.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_URI = "http://kieler.org/syncgraph";

	/**
     * The package namespace name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_PREFIX = "syncgraph";

	/**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	SyncgraphPackage eINSTANCE = de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.impl.SyncgraphPackageImpl.init();

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.impl.SyncTransitionImpl <em>Sync Transition</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.impl.SyncTransitionImpl
     * @see de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.impl.SyncgraphPackageImpl#getSyncTransition()
     * @generated
     */
	int SYNC_TRANSITION = 0;

	/**
     * The feature id for the '<em><b>Specification</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYNC_TRANSITION__SPECIFICATION = SGraphPackage.TRANSITION__SPECIFICATION;

	/**
     * The feature id for the '<em><b>Trigger</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYNC_TRANSITION__TRIGGER = SGraphPackage.TRANSITION__TRIGGER;

	/**
     * The feature id for the '<em><b>Effect</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYNC_TRANSITION__EFFECT = SGraphPackage.TRANSITION__EFFECT;

	/**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYNC_TRANSITION__PROPERTIES = SGraphPackage.TRANSITION__PROPERTIES;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYNC_TRANSITION__DOCUMENTATION = SGraphPackage.TRANSITION__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYNC_TRANSITION__TARGET = SGraphPackage.TRANSITION__TARGET;

	/**
     * The feature id for the '<em><b>Source</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYNC_TRANSITION__SOURCE = SGraphPackage.TRANSITION__SOURCE;

	/**
     * The feature id for the '<em><b>Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYNC_TRANSITION__PRIORITY = SGraphPackage.TRANSITION__PRIORITY;

	/**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYNC_TRANSITION__TYPE = SGraphPackage.TRANSITION_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Is History</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYNC_TRANSITION__IS_HISTORY = SGraphPackage.TRANSITION_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Is Immediate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYNC_TRANSITION__IS_IMMEDIATE = SGraphPackage.TRANSITION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Sync Transition</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYNC_TRANSITION_FEATURE_COUNT = SGraphPackage.TRANSITION_FEATURE_COUNT + 3;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.impl.SyncStateImpl <em>Sync State</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.impl.SyncStateImpl
     * @see de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.impl.SyncgraphPackageImpl#getSyncState()
     * @generated
     */
	int SYNC_STATE = 1;

	/**
     * The feature id for the '<em><b>Specification</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYNC_STATE__SPECIFICATION = SGraphPackage.STATE__SPECIFICATION;

	/**
     * The feature id for the '<em><b>Reactions</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYNC_STATE__REACTIONS = SGraphPackage.STATE__REACTIONS;

	/**
     * The feature id for the '<em><b>Local Reactions</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYNC_STATE__LOCAL_REACTIONS = SGraphPackage.STATE__LOCAL_REACTIONS;

	/**
     * The feature id for the '<em><b>Scopes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYNC_STATE__SCOPES = SGraphPackage.STATE__SCOPES;

	/**
     * The feature id for the '<em><b>Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYNC_STATE__NAMESPACE = SGraphPackage.STATE__NAMESPACE;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYNC_STATE__NAME = SGraphPackage.STATE__NAME;

	/**
     * The feature id for the '<em><b>Parent Region</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYNC_STATE__PARENT_REGION = SGraphPackage.STATE__PARENT_REGION;

	/**
     * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYNC_STATE__INCOMING_TRANSITIONS = SGraphPackage.STATE__INCOMING_TRANSITIONS;

	/**
     * The feature id for the '<em><b>Outgoing Transitions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYNC_STATE__OUTGOING_TRANSITIONS = SGraphPackage.STATE__OUTGOING_TRANSITIONS;

	/**
     * The feature id for the '<em><b>Regions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYNC_STATE__REGIONS = SGraphPackage.STATE__REGIONS;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYNC_STATE__DOCUMENTATION = SGraphPackage.STATE__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Orthogonal</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYNC_STATE__ORTHOGONAL = SGraphPackage.STATE__ORTHOGONAL;

	/**
     * The feature id for the '<em><b>Substatechart</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYNC_STATE__SUBSTATECHART = SGraphPackage.STATE__SUBSTATECHART;

	/**
     * The feature id for the '<em><b>Substatechart Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYNC_STATE__SUBSTATECHART_ID = SGraphPackage.STATE__SUBSTATECHART_ID;

	/**
     * The feature id for the '<em><b>Subchart</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYNC_STATE__SUBCHART = SGraphPackage.STATE__SUBCHART;

	/**
     * The feature id for the '<em><b>Simple</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYNC_STATE__SIMPLE = SGraphPackage.STATE__SIMPLE;

	/**
     * The feature id for the '<em><b>Composite</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYNC_STATE__COMPOSITE = SGraphPackage.STATE__COMPOSITE;

	/**
     * The feature id for the '<em><b>Leaf</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYNC_STATE__LEAF = SGraphPackage.STATE__LEAF;

	/**
     * The feature id for the '<em><b>Is Initial</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYNC_STATE__IS_INITIAL = SGraphPackage.STATE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Is Final</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYNC_STATE__IS_FINAL = SGraphPackage.STATE_FEATURE_COUNT + 1;

	/**
     * The number of structural features of the '<em>Sync State</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYNC_STATE_FEATURE_COUNT = SGraphPackage.STATE_FEATURE_COUNT + 2;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.TransitionType <em>Transition Type</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.TransitionType
     * @see de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.impl.SyncgraphPackageImpl#getTransitionType()
     * @generated
     */
	int TRANSITION_TYPE = 2;


	/**
     * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncTransition <em>Sync Transition</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sync Transition</em>'.
     * @see de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncTransition
     * @generated
     */
	EClass getSyncTransition();

	/**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncTransition#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncTransition#getType()
     * @see #getSyncTransition()
     * @generated
     */
	EAttribute getSyncTransition_Type();

	/**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncTransition#isIsHistory <em>Is History</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is History</em>'.
     * @see de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncTransition#isIsHistory()
     * @see #getSyncTransition()
     * @generated
     */
	EAttribute getSyncTransition_IsHistory();

	/**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncTransition#isIsImmediate <em>Is Immediate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Immediate</em>'.
     * @see de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncTransition#isIsImmediate()
     * @see #getSyncTransition()
     * @generated
     */
    EAttribute getSyncTransition_IsImmediate();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncState <em>Sync State</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sync State</em>'.
     * @see de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncState
     * @generated
     */
	EClass getSyncState();

	/**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncState#isIsInitial <em>Is Initial</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Initial</em>'.
     * @see de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncState#isIsInitial()
     * @see #getSyncState()
     * @generated
     */
	EAttribute getSyncState_IsInitial();

	/**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncState#isIsFinal <em>Is Final</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Final</em>'.
     * @see de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncState#isIsFinal()
     * @see #getSyncState()
     * @generated
     */
	EAttribute getSyncState_IsFinal();

	/**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.TransitionType <em>Transition Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Transition Type</em>'.
     * @see de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.TransitionType
     * @generated
     */
	EEnum getTransitionType();

	/**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
	SyncgraphFactory getSyncgraphFactory();

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
         * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.impl.SyncTransitionImpl <em>Sync Transition</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.impl.SyncTransitionImpl
         * @see de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.impl.SyncgraphPackageImpl#getSyncTransition()
         * @generated
         */
		EClass SYNC_TRANSITION = eINSTANCE.getSyncTransition();

		/**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SYNC_TRANSITION__TYPE = eINSTANCE.getSyncTransition_Type();

		/**
         * The meta object literal for the '<em><b>Is History</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SYNC_TRANSITION__IS_HISTORY = eINSTANCE.getSyncTransition_IsHistory();

		/**
         * The meta object literal for the '<em><b>Is Immediate</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SYNC_TRANSITION__IS_IMMEDIATE = eINSTANCE.getSyncTransition_IsImmediate();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.impl.SyncStateImpl <em>Sync State</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.impl.SyncStateImpl
         * @see de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.impl.SyncgraphPackageImpl#getSyncState()
         * @generated
         */
		EClass SYNC_STATE = eINSTANCE.getSyncState();

		/**
         * The meta object literal for the '<em><b>Is Initial</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SYNC_STATE__IS_INITIAL = eINSTANCE.getSyncState_IsInitial();

		/**
         * The meta object literal for the '<em><b>Is Final</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SYNC_STATE__IS_FINAL = eINSTANCE.getSyncState_IsFinal();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.TransitionType <em>Transition Type</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.TransitionType
         * @see de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.impl.SyncgraphPackageImpl#getTransitionType()
         * @generated
         */
		EEnum TRANSITION_TYPE = eINSTANCE.getTransitionType();

	}

} //SyncgraphPackage
