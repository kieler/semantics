/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts.codegen.dependencies.dependency;

import de.cau.cs.kieler.synccharts.State;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependency#getTargetState <em>Target State</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependency#getSourceNode <em>Source Node</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependency#getTargetNode <em>Target Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.DependencyPackage#getDependency()
 * @model
 * @generated
 */
public interface Dependency extends EObject {
	/**
	 * Returns the value of the '<em><b>Target State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target State</em>' reference.
	 * @see #setTargetState(State)
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.DependencyPackage#getDependency_TargetState()
	 * @model
	 * @generated
	 */
	State getTargetState();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependency#getTargetState <em>Target State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target State</em>' reference.
	 * @see #getTargetState()
	 * @generated
	 */
	void setTargetState(State value);

	/**
	 * Returns the value of the '<em><b>Source Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Node#getOutgoingDependencies <em>Outgoing Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Node</em>' reference.
	 * @see #setSourceNode(Node)
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.DependencyPackage#getDependency_SourceNode()
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Node#getOutgoingDependencies
	 * @model opposite="outgoingDependencies" required="true"
	 * @generated
	 */
	Node getSourceNode();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependency#getSourceNode <em>Source Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Node</em>' reference.
	 * @see #getSourceNode()
	 * @generated
	 */
	void setSourceNode(Node value);

	/**
	 * Returns the value of the '<em><b>Target Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Node#getIncomingDependencies <em>Incoming Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Node</em>' reference.
	 * @see #setTargetNode(Node)
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.DependencyPackage#getDependency_TargetNode()
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Node#getIncomingDependencies
	 * @model opposite="incomingDependencies" required="true"
	 * @generated
	 */
	Node getTargetNode();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependency#getTargetNode <em>Target Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Node</em>' reference.
	 * @see #getTargetNode()
	 * @generated
	 */
	void setTargetNode(Node value);

} // Dependency
