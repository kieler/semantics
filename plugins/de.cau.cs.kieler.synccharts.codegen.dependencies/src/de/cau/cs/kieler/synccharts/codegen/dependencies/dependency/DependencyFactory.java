/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts.codegen.dependencies.dependency;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.DependencyPackage
 * @generated
 */
public interface DependencyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DependencyFactory eINSTANCE = de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.impl.DependencyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependency</em>'.
	 * @generated
	 */
	Dependency createDependency();

	/**
	 * Returns a new object of class '<em>Signal Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal Dependency</em>'.
	 * @generated
	 */
	SignalDependency createSignalDependency();

	/**
	 * Returns a new object of class '<em>Hierarchy Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hierarchy Dependency</em>'.
	 * @generated
	 */
	HierarchyDependency createHierarchyDependency();

	/**
	 * Returns a new object of class '<em>Controlflow Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Controlflow Dependency</em>'.
	 * @generated
	 */
	ControlflowDependency createControlflowDependency();

	/**
	 * Returns a new object of class '<em>Transition Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition Dependency</em>'.
	 * @generated
	 */
	TransitionDependency createTransitionDependency();

	/**
	 * Returns a new object of class '<em>Dependencies</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependencies</em>'.
	 * @generated
	 */
	Dependencies createDependencies();

	/**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DependencyPackage getDependencyPackage();

} //DependencyFactory
