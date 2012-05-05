/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts.codegen.dependencies.dependency;

import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.Transition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State And Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.StateAndTransition#getState <em>State</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.StateAndTransition#getTransition <em>Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.DependencyPackage#getStateAndTransition()
 * @model
 * @generated
 */
public interface StateAndTransition extends EObject {
	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(State)
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.DependencyPackage#getStateAndTransition_State()
	 * @model
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.StateAndTransition#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' reference.
	 * @see #setTransition(Transition)
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.DependencyPackage#getStateAndTransition_Transition()
	 * @model
	 * @generated
	 */
	Transition getTransition();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.StateAndTransition#getTransition <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(Transition value);

} // StateAndTransition
