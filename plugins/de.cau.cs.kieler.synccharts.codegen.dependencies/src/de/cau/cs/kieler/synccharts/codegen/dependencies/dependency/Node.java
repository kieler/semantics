/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts.codegen.dependencies.dependency;

import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.Transition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Node#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Node#getTransition <em>Transition</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Node#getPriority <em>Priority</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Node#getOutgoingDependencies <em>Outgoing Dependencies</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Node#getIncomingDependencies <em>Incoming Dependencies</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Node#getState <em>State</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Node#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.DependencyPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.DependencyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.DependencyType
	 * @see #setType(DependencyType)
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.DependencyPackage#getNode_Type()
	 * @model
	 * @generated
	 */
	DependencyType getType();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Node#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.DependencyType
	 * @see #getType()
	 * @generated
	 */
	void setType(DependencyType value);

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
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.DependencyPackage#getNode_Transition()
	 * @model
	 * @generated
	 */
	Transition getTransition();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Node#getTransition <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(Transition value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.DependencyPackage#getNode_Priority()
	 * @model
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Node#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Outgoing Dependencies</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependency}.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependency#getSourceNode <em>Source Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Dependencies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Dependencies</em>' reference list.
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.DependencyPackage#getNode_OutgoingDependencies()
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependency#getSourceNode
	 * @model opposite="sourceNode"
	 * @generated
	 */
	EList<Dependency> getOutgoingDependencies();

	/**
	 * Returns the value of the '<em><b>Incoming Dependencies</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependency}.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependency#getTargetNode <em>Target Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Dependencies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Dependencies</em>' reference list.
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.DependencyPackage#getNode_IncomingDependencies()
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependency#getTargetNode
	 * @model opposite="targetNode"
	 * @generated
	 */
	EList<Dependency> getIncomingDependencies();

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
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.DependencyPackage#getNode_State()
	 * @model required="true"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Node#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.DependencyPackage#getNode_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Node#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Node
