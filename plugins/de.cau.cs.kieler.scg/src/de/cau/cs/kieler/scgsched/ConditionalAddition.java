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
import de.cau.cs.kieler.scg.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Addition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgsched.ConditionalAddition#getBeforeNode <em>Before Node</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgsched.ConditionalAddition#getUntilNode <em>Until Node</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgsched.ConditionalAddition#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scgsched.ScgschedPackage#getConditionalAddition()
 * @model
 * @generated
 */
public interface ConditionalAddition extends Alteration {
	/**
	 * Returns the value of the '<em><b>Before Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Node</em>' reference.
	 * @see #setBeforeNode(Node)
	 * @see de.cau.cs.kieler.scgsched.ScgschedPackage#getConditionalAddition_BeforeNode()
	 * @model required="true"
	 * @generated
	 */
	Node getBeforeNode();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.scgsched.ConditionalAddition#getBeforeNode <em>Before Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before Node</em>' reference.
	 * @see #getBeforeNode()
	 * @generated
	 */
	void setBeforeNode(Node value);

	/**
	 * Returns the value of the '<em><b>Until Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Until Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Until Node</em>' reference.
	 * @see #setUntilNode(Node)
	 * @see de.cau.cs.kieler.scgsched.ScgschedPackage#getConditionalAddition_UntilNode()
	 * @model required="true"
	 * @generated
	 */
	Node getUntilNode();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.scgsched.ConditionalAddition#getUntilNode <em>Until Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Until Node</em>' reference.
	 * @see #getUntilNode()
	 * @generated
	 */
	void setUntilNode(Node value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see de.cau.cs.kieler.scgsched.ScgschedPackage#getConditionalAddition_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.scgsched.ConditionalAddition#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

} // ConditionalAddition
