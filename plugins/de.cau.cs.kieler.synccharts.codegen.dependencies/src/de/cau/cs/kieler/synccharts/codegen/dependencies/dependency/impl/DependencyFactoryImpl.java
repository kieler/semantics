/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl;

import de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DependencyFactoryImpl extends EFactoryImpl implements DependencyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DependencyFactory init() {
		try {
			DependencyFactory theDependencyFactory = (DependencyFactory)EPackage.Registry.INSTANCE.getEFactory("http://kieler.cs.cau.de/dependency/0.1.0"); 
			if (theDependencyFactory != null) {
				return theDependencyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DependencyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DependencyPackage.STATE_AND_TRANSITION: return createStateAndTransition();
			case DependencyPackage.DEPENDENCY: return createDependency();
			case DependencyPackage.SIGNAL_DEPENDENCY: return createSignalDependency();
			case DependencyPackage.HIERARCHY_DEPENDENCY: return createHierarchyDependency();
			case DependencyPackage.CONTROLFLOW_DEPENDENCY: return createControlflowDependency();
			case DependencyPackage.TRANSITION_DEPENDENCY: return createTransitionDependency();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateAndTransition createStateAndTransition() {
		StateAndTransitionImpl stateAndTransition = new StateAndTransitionImpl();
		return stateAndTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency createDependency() {
		DependencyImpl dependency = new DependencyImpl();
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalDependency createSignalDependency() {
		SignalDependencyImpl signalDependency = new SignalDependencyImpl();
		return signalDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HierarchyDependency createHierarchyDependency() {
		HierarchyDependencyImpl hierarchyDependency = new HierarchyDependencyImpl();
		return hierarchyDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlflowDependency createControlflowDependency() {
		ControlflowDependencyImpl controlflowDependency = new ControlflowDependencyImpl();
		return controlflowDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionDependency createTransitionDependency() {
		TransitionDependencyImpl transitionDependency = new TransitionDependencyImpl();
		return transitionDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyPackage getDependencyPackage() {
		return (DependencyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DependencyPackage getPackage() {
		return DependencyPackage.eINSTANCE;
	}

} //DependencyFactoryImpl
