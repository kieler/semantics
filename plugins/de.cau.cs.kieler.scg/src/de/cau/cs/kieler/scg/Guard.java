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
package de.cau.cs.kieler.scg;

import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.core.kexpressions.ValuedObject;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scg.Guard#getValuedObject <em>Valued Object</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.Guard#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.Guard#isSchizophrenic <em>Schizophrenic</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.Guard#getSchedulingBlockLink <em>Scheduling Block Link</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.Guard#getVolatile <em>Volatile</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.Guard#isSequentialize <em>Sequentialize</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scg.ScgPackage#getGuard()
 * @model
 * @generated
 */
public interface Guard extends EObject {
    /**
	 * Returns the value of the '<em><b>Valued Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Valued Object</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Valued Object</em>' containment reference.
	 * @see #setValuedObject(ValuedObject)
	 * @see de.cau.cs.kieler.scg.ScgPackage#getGuard_ValuedObject()
	 * @model containment="true" required="true"
	 * @generated
	 */
    ValuedObject getValuedObject();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.scg.Guard#getValuedObject <em>Valued Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valued Object</em>' containment reference.
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
	 * @see de.cau.cs.kieler.scg.ScgPackage#getGuard_Expression()
	 * @model containment="true"
	 * @generated
	 */
    Expression getExpression();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.scg.Guard#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
    void setExpression(Expression value);

				/**
	 * Returns the value of the '<em><b>Schizophrenic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schizophrenic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schizophrenic</em>' attribute.
	 * @see #setSchizophrenic(boolean)
	 * @see de.cau.cs.kieler.scg.ScgPackage#getGuard_Schizophrenic()
	 * @model
	 * @generated
	 */
	boolean isSchizophrenic();

				/**
	 * Sets the value of the '{@link de.cau.cs.kieler.scg.Guard#isSchizophrenic <em>Schizophrenic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schizophrenic</em>' attribute.
	 * @see #isSchizophrenic()
	 * @generated
	 */
	void setSchizophrenic(boolean value);

				/**
	 * Returns the value of the '<em><b>Scheduling Block Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduling Block Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduling Block Link</em>' reference.
	 * @see #setSchedulingBlockLink(SchedulingBlock)
	 * @see de.cau.cs.kieler.scg.ScgPackage#getGuard_SchedulingBlockLink()
	 * @model
	 * @generated
	 */
	SchedulingBlock getSchedulingBlockLink();

				/**
	 * Sets the value of the '{@link de.cau.cs.kieler.scg.Guard#getSchedulingBlockLink <em>Scheduling Block Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduling Block Link</em>' reference.
	 * @see #getSchedulingBlockLink()
	 * @generated
	 */
	void setSchedulingBlockLink(SchedulingBlock value);

				/**
	 * Returns the value of the '<em><b>Volatile</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.core.kexpressions.ValuedObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volatile</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volatile</em>' reference list.
	 * @see de.cau.cs.kieler.scg.ScgPackage#getGuard_Volatile()
	 * @model
	 * @generated
	 */
	EList<ValuedObject> getVolatile();

				/**
	 * Returns the value of the '<em><b>Sequentialize</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequentialize</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequentialize</em>' attribute.
	 * @see #setSequentialize(boolean)
	 * @see de.cau.cs.kieler.scg.ScgPackage#getGuard_Sequentialize()
	 * @model default="true"
	 * @generated
	 */
	boolean isSequentialize();

				/**
	 * Sets the value of the '{@link de.cau.cs.kieler.scg.Guard#isSequentialize <em>Sequentialize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequentialize</em>' attribute.
	 * @see #isSequentialize()
	 * @generated
	 */
	void setSequentialize(boolean value);

} // Guard
