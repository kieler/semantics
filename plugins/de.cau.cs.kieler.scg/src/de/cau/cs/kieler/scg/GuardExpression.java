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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guard Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scg.GuardExpression#getValuedObject <em>Valued Object</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.GuardExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scg.ScgPackage#getGuardExpression()
 * @model
 * @generated
 */
public interface GuardExpression extends EObject {
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
     * @see de.cau.cs.kieler.scg.ScgPackage#getGuardExpression_ValuedObject()
     * @model
     * @generated
     */
    ValuedObject getValuedObject();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scg.GuardExpression#getValuedObject <em>Valued Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Valued Object</em>' reference.
     * @see #getValuedObject()
     * @generated
     */
    void setValuedObject(ValuedObject value);

    /**
     * Returns the value of the '<em><b>Expression</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Expression</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Expression</em>' reference.
     * @see #setExpression(Expression)
     * @see de.cau.cs.kieler.scg.ScgPackage#getGuardExpression_Expression()
     * @model
     * @generated
     */
    Expression getExpression();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scg.GuardExpression#getExpression <em>Expression</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression</em>' reference.
     * @see #getExpression()
     * @generated
     */
    void setExpression(Expression value);

} // GuardExpression
