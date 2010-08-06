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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Variable is a data object that may be used for internal calculations. It is not directly
 * intended for communication with concurrent program parts. Variables may be overridden
 * multiple times within one synchronous tick. Hence writing a signal in concurrent program parts
 * is not allowed. Therefore Variables, unlike Signals, do not need a combine strategy.
 * <p>
 * A Variable always carries a value and therefore needs a proper type. A Variable may be
 * tagged to be a constant by the const attribute and then the value is given by the
 * initialValue.
 * <p>
 * Due to the restrictions in broadcast communication, the usage of Variables is discouraged
 * everywhere where Signals could be used instead.
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
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
