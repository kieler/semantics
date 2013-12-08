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
package de.cau.cs.kieler.scgbb;

import de.cau.cs.kieler.core.kexpressions.Expression;

import de.cau.cs.kieler.core.kexpressions.ValuedObject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activation Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgbb.ActivationExpression#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgbb.ActivationExpression#getBasicBlocks <em>Basic Blocks</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgbb.ActivationExpression#getGuard <em>Guard</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgbb.ActivationExpression#getEmptyExpressions <em>Empty Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scgbb.ScgbbPackage#getActivationExpression()
 * @model
 * @generated
 */
public interface ActivationExpression extends EObject {
    /**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' containment reference.
	 * @see #setGuardExpression(Expression)
	 * @see de.cau.cs.kieler.scgbb.ScgbbPackage#getActivationExpression_GuardExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getGuardExpression();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.scgbb.ActivationExpression#getGuardExpression <em>Guard Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Expression</em>' containment reference.
	 * @see #getGuardExpression()
	 * @generated
	 */
	void setGuardExpression(Expression value);

				/**
	 * Returns the value of the '<em><b>Basic Blocks</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.scgbb.BasicBlock}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Basic Blocks</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Basic Blocks</em>' reference list.
	 * @see de.cau.cs.kieler.scgbb.ScgbbPackage#getActivationExpression_BasicBlocks()
	 * @model
	 * @generated
	 */
    EList<BasicBlock> getBasicBlocks();

				/**
	 * Returns the value of the '<em><b>Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' reference.
	 * @see #setGuard(ValuedObject)
	 * @see de.cau.cs.kieler.scgbb.ScgbbPackage#getActivationExpression_Guard()
	 * @model required="true"
	 * @generated
	 */
	ValuedObject getGuard();

				/**
	 * Sets the value of the '{@link de.cau.cs.kieler.scgbb.ActivationExpression#getGuard <em>Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(ValuedObject value);

				/**
	 * Returns the value of the '<em><b>Empty Expressions</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.scgbb.ActivationExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Empty Expressions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empty Expressions</em>' reference list.
	 * @see de.cau.cs.kieler.scgbb.ScgbbPackage#getActivationExpression_EmptyExpressions()
	 * @model
	 * @generated
	 */
	EList<ActivationExpression> getEmptyExpressions();

} // ActivationExpression
