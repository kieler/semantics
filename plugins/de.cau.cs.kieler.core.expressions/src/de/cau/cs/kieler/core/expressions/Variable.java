/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.expressions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.core.expressions.Variable#getValue <em>Value</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.expressions.Variable#isConst <em>Const</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.core.expressions.ExpressionsPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends ValuedObject {
    /**
     * Returns the value of the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' containment reference.
     * @see #setValue(EObject)
     * @see de.cau.cs.kieler.core.expressions.ExpressionsPackage#getVariable_Value()
     * @model containment="true" required="true"
     * @generated
     */
    EObject getValue();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.core.expressions.Variable#getValue <em>Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' containment reference.
     * @see #getValue()
     * @generated
     */
    void setValue(EObject value);

    /**
     * Returns the value of the '<em><b>Const</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Const</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Const</em>' attribute.
     * @see #setConst(boolean)
     * @see de.cau.cs.kieler.core.expressions.ExpressionsPackage#getVariable_Const()
     * @model required="true"
     * @generated
     */
    boolean isConst();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.core.expressions.Variable#isConst <em>Const</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Const</em>' attribute.
     * @see #isConst()
     * @generated
     */
    void setConst(boolean value);

} // Variable
