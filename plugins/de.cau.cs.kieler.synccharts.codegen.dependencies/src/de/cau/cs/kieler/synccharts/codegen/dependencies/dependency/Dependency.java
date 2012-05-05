/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts.codegen.dependencies.dependency;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependency#getSource <em>Source</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependency#getDestination <em>Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.DependencyPackage#getDependency()
 * @model
 * @generated
 */
public interface Dependency extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(StateAndTransition)
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.DependencyPackage#getDependency_Source()
	 * @model containment="true"
	 * @generated
	 */
	StateAndTransition getSource();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependency#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(StateAndTransition value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' containment reference.
	 * @see #setDestination(StateAndTransition)
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.DependencyPackage#getDependency_Destination()
	 * @model containment="true"
	 * @generated
	 */
	StateAndTransition getDestination();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependency#getDestination <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' containment reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(StateAndTransition value);

} // Dependency
