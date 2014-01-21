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
import de.cau.cs.kieler.scgbb.SchedulingBlock;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Addition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgsched.ConditionalAddition#getBeforeBlock <em>Before Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgsched.ConditionalAddition#getUntilBlock <em>Until Block</em>}</li>
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
	 * Returns the value of the '<em><b>Before Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before Block</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Block</em>' reference.
	 * @see #setBeforeBlock(SchedulingBlock)
	 * @see de.cau.cs.kieler.scgsched.ScgschedPackage#getConditionalAddition_BeforeBlock()
	 * @model required="true"
	 * @generated
	 */
	SchedulingBlock getBeforeBlock();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.scgsched.ConditionalAddition#getBeforeBlock <em>Before Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before Block</em>' reference.
	 * @see #getBeforeBlock()
	 * @generated
	 */
	void setBeforeBlock(SchedulingBlock value);

	/**
	 * Returns the value of the '<em><b>Until Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Until Block</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Until Block</em>' reference.
	 * @see #setUntilBlock(SchedulingBlock)
	 * @see de.cau.cs.kieler.scgsched.ScgschedPackage#getConditionalAddition_UntilBlock()
	 * @model required="true"
	 * @generated
	 */
	SchedulingBlock getUntilBlock();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.scgsched.ConditionalAddition#getUntilBlock <em>Until Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Until Block</em>' reference.
	 * @see #getUntilBlock()
	 * @generated
	 */
	void setUntilBlock(SchedulingBlock value);

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
