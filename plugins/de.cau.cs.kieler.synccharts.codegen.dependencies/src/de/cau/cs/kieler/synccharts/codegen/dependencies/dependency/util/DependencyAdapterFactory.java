/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.util;

import de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.DependencyPackage
 * @generated
 */
public class DependencyAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DependencyPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DependencyPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencySwitch<Adapter> modelSwitch =
		new DependencySwitch<Adapter>() {
			@Override
			public Adapter caseDependency(Dependency object) {
				return createDependencyAdapter();
			}
			@Override
			public Adapter caseSignalDependency(SignalDependency object) {
				return createSignalDependencyAdapter();
			}
			@Override
			public Adapter caseHierarchyDependency(HierarchyDependency object) {
				return createHierarchyDependencyAdapter();
			}
			@Override
			public Adapter caseControlflowDependency(ControlflowDependency object) {
				return createControlflowDependencyAdapter();
			}
			@Override
			public Adapter caseTransitionDependency(TransitionDependency object) {
				return createTransitionDependencyAdapter();
			}
			@Override
			public Adapter caseDependencies(Dependencies object) {
				return createDependenciesAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependency
	 * @generated
	 */
	public Adapter createDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.SignalDependency <em>Signal Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.SignalDependency
	 * @generated
	 */
	public Adapter createSignalDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.HierarchyDependency <em>Hierarchy Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.HierarchyDependency
	 * @generated
	 */
	public Adapter createHierarchyDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.ControlflowDependency <em>Controlflow Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.ControlflowDependency
	 * @generated
	 */
	public Adapter createControlflowDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.TransitionDependency <em>Transition Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.TransitionDependency
	 * @generated
	 */
	public Adapter createTransitionDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependencies
	 * @generated
	 */
	public Adapter createDependenciesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DependencyAdapterFactory
