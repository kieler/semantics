/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl;

import de.cau.cs.kieler.synccharts.SyncchartsPackage;

import de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.ControlflowDependency;
import de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependency;
import de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.DependencyFactory;
import de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.DependencyPackage;
import de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.HierarchyDependency;
import de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.SignalDependency;
import de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.StateAndTransition;
import de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.TransitionDependency;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DependencyPackageImpl extends EPackageImpl implements DependencyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateAndTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hierarchyDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlflowDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionDependencyEClass = null;

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
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.DependencyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DependencyPackageImpl() {
		super(eNS_URI, DependencyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DependencyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DependencyPackage init() {
		if (isInited) return (DependencyPackage)EPackage.Registry.INSTANCE.getEPackage(DependencyPackage.eNS_URI);

		// Obtain or create and register package
		DependencyPackageImpl theDependencyPackage = (DependencyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DependencyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DependencyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SyncchartsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDependencyPackage.createPackageContents();

		// Initialize created meta-data
		theDependencyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDependencyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DependencyPackage.eNS_URI, theDependencyPackage);
		return theDependencyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateAndTransition() {
		return stateAndTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateAndTransition_State() {
		return (EReference)stateAndTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateAndTransition_Transition() {
		return (EReference)stateAndTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependency() {
		return dependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependency_Source() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependency_Destination() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalDependency() {
		return signalDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHierarchyDependency() {
		return hierarchyDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlflowDependency() {
		return controlflowDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionDependency() {
		return transitionDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyFactory getDependencyFactory() {
		return (DependencyFactory)getEFactoryInstance();
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
		stateAndTransitionEClass = createEClass(STATE_AND_TRANSITION);
		createEReference(stateAndTransitionEClass, STATE_AND_TRANSITION__STATE);
		createEReference(stateAndTransitionEClass, STATE_AND_TRANSITION__TRANSITION);

		dependencyEClass = createEClass(DEPENDENCY);
		createEReference(dependencyEClass, DEPENDENCY__SOURCE);
		createEReference(dependencyEClass, DEPENDENCY__DESTINATION);

		signalDependencyEClass = createEClass(SIGNAL_DEPENDENCY);

		hierarchyDependencyEClass = createEClass(HIERARCHY_DEPENDENCY);

		controlflowDependencyEClass = createEClass(CONTROLFLOW_DEPENDENCY);

		transitionDependencyEClass = createEClass(TRANSITION_DEPENDENCY);
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
		SyncchartsPackage theSyncchartsPackage = (SyncchartsPackage)EPackage.Registry.INSTANCE.getEPackage(SyncchartsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		signalDependencyEClass.getESuperTypes().add(this.getDependency());
		hierarchyDependencyEClass.getESuperTypes().add(this.getDependency());
		controlflowDependencyEClass.getESuperTypes().add(this.getDependency());
		transitionDependencyEClass.getESuperTypes().add(this.getDependency());

		// Initialize classes and features; add operations and parameters
		initEClass(stateAndTransitionEClass, StateAndTransition.class, "StateAndTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateAndTransition_State(), theSyncchartsPackage.getState(), null, "state", null, 0, 1, StateAndTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateAndTransition_Transition(), theSyncchartsPackage.getTransition(), null, "transition", null, 0, 1, StateAndTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependency_Source(), this.getStateAndTransition(), null, "source", null, 0, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependency_Destination(), this.getStateAndTransition(), null, "destination", null, 0, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalDependencyEClass, SignalDependency.class, "SignalDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hierarchyDependencyEClass, HierarchyDependency.class, "HierarchyDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controlflowDependencyEClass, ControlflowDependency.class, "ControlflowDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitionDependencyEClass, TransitionDependency.class, "TransitionDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DependencyPackageImpl
