/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
 
package de.cau.cs.kieler.circuit;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see de.cau.cs.kieler.circuit.CircuitFactory
 * @model kind="package"
 * @generated
 */
public interface CircuitPackage extends EPackage {
	/**
     * The package name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNAME = "circuit";

	/**
     * The package namespace URI.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_URI = "http://kieler.cs.cau.de/circuit";

	/**
     * The package namespace name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_PREFIX = "circuit";

	/**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	CircuitPackage eINSTANCE = de.cau.cs.kieler.circuit.impl.CircuitPackageImpl.init();

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.circuit.impl.LinkableImpl <em>Linkable</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.circuit.impl.LinkableImpl
     * @see de.cau.cs.kieler.circuit.impl.CircuitPackageImpl#getLinkable()
     * @generated
     */
	int LINKABLE = 3;

	/**
     * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LINKABLE__INCOMING_LINKS = 0;

	/**
     * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LINKABLE__OUTGOING_LINKS = 1;

	/**
     * The number of structural features of the '<em>Linkable</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LINKABLE_FEATURE_COUNT = 2;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.circuit.impl.ActorImpl <em>Actor</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.circuit.impl.ActorImpl
     * @see de.cau.cs.kieler.circuit.impl.CircuitPackageImpl#getActor()
     * @generated
     */
	int ACTOR = 0;

	/**
     * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACTOR__INCOMING_LINKS = LINKABLE__INCOMING_LINKS;

	/**
     * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACTOR__OUTGOING_LINKS = LINKABLE__OUTGOING_LINKS;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACTOR__NAME = LINKABLE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Inner Actors</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACTOR__INNER_ACTORS = LINKABLE_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Inner Links</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACTOR__INNER_LINKS = LINKABLE_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACTOR__TYPE = LINKABLE_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Ports</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACTOR__PORTS = LINKABLE_FEATURE_COUNT + 4;

	/**
     * The number of structural features of the '<em>Actor</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACTOR_FEATURE_COUNT = LINKABLE_FEATURE_COUNT + 5;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.circuit.impl.LinkImpl <em>Link</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.circuit.impl.LinkImpl
     * @see de.cau.cs.kieler.circuit.impl.CircuitPackageImpl#getLink()
     * @generated
     */
	int LINK = 2;

	/**
     * The meta object id for the '{@link de.cau.cs.kieler.circuit.impl.PortImpl <em>Port</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.circuit.impl.PortImpl
     * @see de.cau.cs.kieler.circuit.impl.CircuitPackageImpl#getPort()
     * @generated
     */
	int PORT = 1;

	/**
     * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PORT__INCOMING_LINKS = LINKABLE__INCOMING_LINKS;

	/**
     * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PORT__OUTGOING_LINKS = LINKABLE__OUTGOING_LINKS;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PORT__NAME = LINKABLE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PORT__TYPE = LINKABLE_FEATURE_COUNT + 1;

	/**
     * The number of structural features of the '<em>Port</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PORT_FEATURE_COUNT = LINKABLE_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LINK__NAME = AnnotationsPackage.NAMED_OBJECT__NAME;

	/**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LINK__SOURCE = AnnotationsPackage.NAMED_OBJECT_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LINK__TARGET = AnnotationsPackage.NAMED_OBJECT_FEATURE_COUNT + 1;

	/**
     * The number of structural features of the '<em>Link</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LINK_FEATURE_COUNT = AnnotationsPackage.NAMED_OBJECT_FEATURE_COUNT + 2;


	/**
     * Returns the meta object for class '{@link de.cau.cs.kieler.circuit.Actor <em>Actor</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Actor</em>'.
     * @see de.cau.cs.kieler.circuit.Actor
     * @generated
     */
	EClass getActor();

	/**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.circuit.Actor#getInnerActors <em>Inner Actors</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Inner Actors</em>'.
     * @see de.cau.cs.kieler.circuit.Actor#getInnerActors()
     * @see #getActor()
     * @generated
     */
	EReference getActor_InnerActors();

	/**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.circuit.Actor#getInnerLinks <em>Inner Links</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Inner Links</em>'.
     * @see de.cau.cs.kieler.circuit.Actor#getInnerLinks()
     * @see #getActor()
     * @generated
     */
	EReference getActor_InnerLinks();

	/**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.circuit.Actor#getPorts <em>Ports</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Ports</em>'.
     * @see de.cau.cs.kieler.circuit.Actor#getPorts()
     * @see #getActor()
     * @generated
     */
	EReference getActor_Ports();

	/**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.circuit.Actor#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see de.cau.cs.kieler.circuit.Actor#getType()
     * @see #getActor()
     * @generated
     */
	EAttribute getActor_Type();

	/**
     * Returns the meta object for class '{@link de.cau.cs.kieler.circuit.Link <em>Link</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Link</em>'.
     * @see de.cau.cs.kieler.circuit.Link
     * @generated
     */
	EClass getLink();

	/**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.circuit.Link#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source</em>'.
     * @see de.cau.cs.kieler.circuit.Link#getSource()
     * @see #getLink()
     * @generated
     */
	EReference getLink_Source();

	/**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.circuit.Link#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see de.cau.cs.kieler.circuit.Link#getTarget()
     * @see #getLink()
     * @generated
     */
	EReference getLink_Target();

	/**
     * Returns the meta object for class '{@link de.cau.cs.kieler.circuit.Port <em>Port</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Port</em>'.
     * @see de.cau.cs.kieler.circuit.Port
     * @generated
     */
	EClass getPort();

	/**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.circuit.Port#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see de.cau.cs.kieler.circuit.Port#getType()
     * @see #getPort()
     * @generated
     */
	EAttribute getPort_Type();

	/**
     * Returns the meta object for class '{@link de.cau.cs.kieler.circuit.Linkable <em>Linkable</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Linkable</em>'.
     * @see de.cau.cs.kieler.circuit.Linkable
     * @generated
     */
	EClass getLinkable();

	/**
     * Returns the meta object for the reference list '{@link de.cau.cs.kieler.circuit.Linkable#getIncomingLinks <em>Incoming Links</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Incoming Links</em>'.
     * @see de.cau.cs.kieler.circuit.Linkable#getIncomingLinks()
     * @see #getLinkable()
     * @generated
     */
	EReference getLinkable_IncomingLinks();

	/**
     * Returns the meta object for the reference list '{@link de.cau.cs.kieler.circuit.Linkable#getOutgoingLinks <em>Outgoing Links</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Outgoing Links</em>'.
     * @see de.cau.cs.kieler.circuit.Linkable#getOutgoingLinks()
     * @see #getLinkable()
     * @generated
     */
	EReference getLinkable_OutgoingLinks();

	/**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
	CircuitFactory getCircuitFactory();

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
         * The meta object literal for the '{@link de.cau.cs.kieler.circuit.impl.ActorImpl <em>Actor</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.circuit.impl.ActorImpl
         * @see de.cau.cs.kieler.circuit.impl.CircuitPackageImpl#getActor()
         * @generated
         */
		EClass ACTOR = eINSTANCE.getActor();

		/**
         * The meta object literal for the '<em><b>Inner Actors</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ACTOR__INNER_ACTORS = eINSTANCE.getActor_InnerActors();

		/**
         * The meta object literal for the '<em><b>Inner Links</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ACTOR__INNER_LINKS = eINSTANCE.getActor_InnerLinks();

		/**
         * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ACTOR__PORTS = eINSTANCE.getActor_Ports();

		/**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ACTOR__TYPE = eINSTANCE.getActor_Type();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.circuit.impl.LinkImpl <em>Link</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.circuit.impl.LinkImpl
         * @see de.cau.cs.kieler.circuit.impl.CircuitPackageImpl#getLink()
         * @generated
         */
		EClass LINK = eINSTANCE.getLink();

		/**
         * The meta object literal for the '<em><b>Source</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference LINK__SOURCE = eINSTANCE.getLink_Source();

		/**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference LINK__TARGET = eINSTANCE.getLink_Target();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.circuit.impl.PortImpl <em>Port</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.circuit.impl.PortImpl
         * @see de.cau.cs.kieler.circuit.impl.CircuitPackageImpl#getPort()
         * @generated
         */
		EClass PORT = eINSTANCE.getPort();

		/**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute PORT__TYPE = eINSTANCE.getPort_Type();

		/**
         * The meta object literal for the '{@link de.cau.cs.kieler.circuit.impl.LinkableImpl <em>Linkable</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.circuit.impl.LinkableImpl
         * @see de.cau.cs.kieler.circuit.impl.CircuitPackageImpl#getLinkable()
         * @generated
         */
		EClass LINKABLE = eINSTANCE.getLinkable();

		/**
         * The meta object literal for the '<em><b>Incoming Links</b></em>' reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference LINKABLE__INCOMING_LINKS = eINSTANCE.getLinkable_IncomingLinks();

		/**
         * The meta object literal for the '<em><b>Outgoing Links</b></em>' reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference LINKABLE__OUTGOING_LINKS = eINSTANCE.getLinkable_OutgoingLinks();

	}

} //CircuitPackage
