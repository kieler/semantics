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
package de.cau.cs.kieler.sccharts;

import de.cau.cs.kieler.core.kexpressions.Expression;

import de.cau.cs.kieler.core.kexpressions.ValuedObject;
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.For#getLoopVariable <em>Loop Variable</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.For#getFrom <em>From</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.For#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getFor()
 * @model
 * @generated
 */
public interface For extends EObject {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Christian-Albrechts-University of Kiel\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
     * Returns the value of the '<em><b>Loop Variable</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Loop Variable</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Loop Variable</em>' reference.
     * @see #setLoopVariable(ValuedObject)
     * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getFor_LoopVariable()
     * @model
     * @generated
     */
    ValuedObject getLoopVariable();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.sccharts.For#getLoopVariable <em>Loop Variable</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Loop Variable</em>' reference.
     * @see #getLoopVariable()
     * @generated
     */
    void setLoopVariable(ValuedObject value);

    /**
     * Returns the value of the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>From</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>From</em>' reference.
     * @see #setFrom(Expression)
     * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getFor_From()
     * @model required="true"
     * @generated
     */
    Expression getFrom();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.sccharts.For#getFrom <em>From</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From</em>' reference.
     * @see #getFrom()
     * @generated
     */
    void setFrom(Expression value);

    /**
     * Returns the value of the '<em><b>To</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>To</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>To</em>' reference.
     * @see #setTo(Expression)
     * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getFor_To()
     * @model required="true"
     * @generated
     */
    Expression getTo();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.sccharts.For#getTo <em>To</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>To</em>' reference.
     * @see #getTo()
     * @generated
     */
    void setTo(Expression value);

} // For
