/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.Expression#getParentAction <em>Parent Action</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Expression#getParentEmisson <em>Parent Emisson</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Expression#getParentAssignment <em>Parent Assignment</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Expression#getParentExpression <em>Parent Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent Action</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.Action#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Action</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Action</em>' container reference.
	 * @see #setParentAction(Action)
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getExpression_ParentAction()
	 * @see de.cau.cs.kieler.synccharts.Action#getTrigger
	 * @model opposite="trigger" transient="false"
	 * @generated
	 */
	Action getParentAction();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Expression#getParentAction <em>Parent Action</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Action</em>' container reference.
	 * @see #getParentAction()
	 * @generated
	 */
	void setParentAction(Action value);

	/**
	 * Returns the value of the '<em><b>Parent Emisson</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.Emission#getNewValue <em>New Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Emisson</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Emisson</em>' container reference.
	 * @see #setParentEmisson(Emission)
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getExpression_ParentEmisson()
	 * @see de.cau.cs.kieler.synccharts.Emission#getNewValue
	 * @model opposite="newValue" transient="false"
	 * @generated
	 */
	Emission getParentEmisson();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Expression#getParentEmisson <em>Parent Emisson</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Emisson</em>' container reference.
	 * @see #getParentEmisson()
	 * @generated
	 */
	void setParentEmisson(Emission value);

	/**
	 * Returns the value of the '<em><b>Parent Assignment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.Assignment#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Assignment</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Assignment</em>' container reference.
	 * @see #setParentAssignment(Assignment)
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getExpression_ParentAssignment()
	 * @see de.cau.cs.kieler.synccharts.Assignment#getExpression
	 * @model opposite="expression" transient="false"
	 * @generated
	 */
	Assignment getParentAssignment();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Expression#getParentAssignment <em>Parent Assignment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Assignment</em>' container reference.
	 * @see #getParentAssignment()
	 * @generated
	 */
	void setParentAssignment(Assignment value);

	/**
	 * Returns the value of the '<em><b>Parent Expression</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.ComplexExpression#getSubExpressions <em>Sub Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Expression</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Expression</em>' container reference.
	 * @see #setParentExpression(ComplexExpression)
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getExpression_ParentExpression()
	 * @see de.cau.cs.kieler.synccharts.ComplexExpression#getSubExpressions
	 * @model opposite="subExpressions" transient="false"
	 * @generated
	 */
	ComplexExpression getParentExpression();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Expression#getParentExpression <em>Parent Expression</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Expression</em>' container reference.
	 * @see #getParentExpression()
	 * @generated
	 */
	void setParentExpression(ComplexExpression value);

} // Expression
