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
import de.cau.cs.kieler.scg.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment Addition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgsched.AssignmentAddition#getPosition <em>Position</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgsched.AssignmentAddition#getValuedObject <em>Valued Object</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgsched.AssignmentAddition#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scgsched.ScgschedPackage#getAssignmentAddition()
 * @model
 * @generated
 */
public interface AssignmentAddition extends Alteration {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' reference.
	 * @see #setPosition(Node)
	 * @see de.cau.cs.kieler.scgsched.ScgschedPackage#getAssignmentAddition_Position()
	 * @model required="true"
	 * @generated
	 */
	Node getPosition();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.scgsched.AssignmentAddition#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Node value);

	/**
	 * Returns the value of the '<em><b>Valued Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valued Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valued Object</em>' reference.
	 * @see #setValuedObject(ValuedObject)
	 * @see de.cau.cs.kieler.scgsched.ScgschedPackage#getAssignmentAddition_ValuedObject()
	 * @model required="true"
	 * @generated
	 */
	ValuedObject getValuedObject();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.scgsched.AssignmentAddition#getValuedObject <em>Valued Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valued Object</em>' reference.
	 * @see #getValuedObject()
	 * @generated
	 */
	void setValuedObject(ValuedObject value);

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
	 * @see de.cau.cs.kieler.scgsched.ScgschedPackage#getAssignmentAddition_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.scgsched.AssignmentAddition#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // AssignmentAddition
