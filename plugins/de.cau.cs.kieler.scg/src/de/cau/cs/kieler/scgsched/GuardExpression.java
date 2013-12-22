/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scgsched;

import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.core.kexpressions.ValuedObject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guard Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgsched.GuardExpression#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgsched.GuardExpression#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgsched.GuardExpression#getEmptyExpressions <em>Empty Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scgsched.ScgschedPackage#getGuardExpression()
 * @model
 * @generated
 */
public interface GuardExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' reference.
	 * @see #setName(ValuedObject)
	 * @see de.cau.cs.kieler.scgsched.ScgschedPackage#getGuardExpression_Name()
	 * @model required="true"
	 * @generated
	 */
	ValuedObject getName();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.scgsched.GuardExpression#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(ValuedObject value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see de.cau.cs.kieler.scgsched.ScgschedPackage#getGuardExpression_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.scgsched.GuardExpression#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Empty Expressions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Empty Expressions</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empty Expressions</em>' containment reference.
	 * @see #setEmptyExpressions(EmptyExpressions)
	 * @see de.cau.cs.kieler.scgsched.ScgschedPackage#getGuardExpression_EmptyExpressions()
	 * @model containment="true"
	 * @generated
	 */
	EmptyExpressions getEmptyExpressions();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.scgsched.GuardExpression#getEmptyExpressions <em>Empty Expressions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empty Expressions</em>' containment reference.
	 * @see #getEmptyExpressions()
	 * @generated
	 */
	void setEmptyExpressions(EmptyExpressions value);

} // GuardExpression
