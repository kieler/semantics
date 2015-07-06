/**
 *  KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *  http://www.informatik.uni-kiel.de/rtsys/kieler/
 *   
 *  Copyright 2012 by
 *   + Kiel University
 *    + Department of Computer Science
 *       + Real-Time and Embedded Systems Group
 *   
 *   This code is provided under the terms of the Eclipse Public License (EPL).
 *   See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.impl;

import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncState;
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncTransition;
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncgraphFactory;
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncgraphPackage;
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.TransitionType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.yakindu.sct.model.sgraph.SGraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SyncgraphPackageImpl extends EPackageImpl implements SyncgraphPackage {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass syncTransitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass syncStateEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum transitionTypeEEnum = null;

	/**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncgraphPackage#eNS_URI
     * @see #init()
     * @generated
     */
	private SyncgraphPackageImpl() {
        super(eNS_URI, SyncgraphFactory.eINSTANCE);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static boolean isInited = false;

	/**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link SyncgraphPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
	public static SyncgraphPackage init() {
        if (isInited) return (SyncgraphPackage)EPackage.Registry.INSTANCE.getEPackage(SyncgraphPackage.eNS_URI);

        // Obtain or create and register package
        SyncgraphPackageImpl theSyncgraphPackage = (SyncgraphPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SyncgraphPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SyncgraphPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        SGraphPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theSyncgraphPackage.createPackageContents();

        // Initialize created meta-data
        theSyncgraphPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theSyncgraphPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(SyncgraphPackage.eNS_URI, theSyncgraphPackage);
        return theSyncgraphPackage;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSyncTransition() {
        return syncTransitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSyncTransition_Type() {
        return (EAttribute)syncTransitionEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSyncTransition_IsHistory() {
        return (EAttribute)syncTransitionEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSyncTransition_IsImmediate() {
        return (EAttribute)syncTransitionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSyncState() {
        return syncStateEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSyncState_IsInitial() {
        return (EAttribute)syncStateEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSyncState_IsFinal() {
        return (EAttribute)syncStateEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getTransitionType() {
        return transitionTypeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SyncgraphFactory getSyncgraphFactory() {
        return (SyncgraphFactory)getEFactoryInstance();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private boolean isCreated = false;

	/**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        syncTransitionEClass = createEClass(SYNC_TRANSITION);
        createEAttribute(syncTransitionEClass, SYNC_TRANSITION__TYPE);
        createEAttribute(syncTransitionEClass, SYNC_TRANSITION__IS_HISTORY);
        createEAttribute(syncTransitionEClass, SYNC_TRANSITION__IS_IMMEDIATE);

        syncStateEClass = createEClass(SYNC_STATE);
        createEAttribute(syncStateEClass, SYNC_STATE__IS_INITIAL);
        createEAttribute(syncStateEClass, SYNC_STATE__IS_FINAL);

        // Create enums
        transitionTypeEEnum = createEEnum(TRANSITION_TYPE);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private boolean isInitialized = false;

	/**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        SGraphPackage theSGraphPackage = (SGraphPackage)EPackage.Registry.INSTANCE.getEPackage(SGraphPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        syncTransitionEClass.getESuperTypes().add(theSGraphPackage.getTransition());
        syncStateEClass.getESuperTypes().add(theSGraphPackage.getState());

        // Initialize classes and features; add operations and parameters
        initEClass(syncTransitionEClass, SyncTransition.class, "SyncTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSyncTransition_Type(), this.getTransitionType(), "type", "0", 0, 1, SyncTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSyncTransition_IsHistory(), ecorePackage.getEBoolean(), "isHistory", "false", 0, 1, SyncTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSyncTransition_IsImmediate(), ecorePackage.getEBoolean(), "isImmediate", "false", 0, 1, SyncTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(syncStateEClass, SyncState.class, "SyncState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSyncState_IsInitial(), ecorePackage.getEBoolean(), "isInitial", "false", 0, 1, SyncState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSyncState_IsFinal(), ecorePackage.getEBoolean(), "isFinal", "false", 0, 1, SyncState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(transitionTypeEEnum, TransitionType.class, "TransitionType");
        addEEnumLiteral(transitionTypeEEnum, TransitionType.WEAKABORT);
        addEEnumLiteral(transitionTypeEEnum, TransitionType.STRONGABORT);
        addEEnumLiteral(transitionTypeEEnum, TransitionType.NORMALTERMINATION);

        // Create resource
        createResource(eNS_URI);
    }

} //SyncgraphPackageImpl
