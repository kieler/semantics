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

import de.cau.cs.kieler.core.kexpressions.ValuedObject;

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
 *   <li>{@link de.cau.cs.kieler.sccharts.For#getBodyScope <em>Body Scope</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.For#getParentScope <em>Parent Scope</em>}</li>
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
     * Returns the value of the '<em><b>Body Scope</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Body Scope</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Body Scope</em>' reference.
     * @see #setBodyScope(Scope)
     * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getFor_BodyScope()
     * @model
     * @generated
     */
    Scope getBodyScope();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.sccharts.For#getBodyScope <em>Body Scope</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Body Scope</em>' reference.
     * @see #getBodyScope()
     * @generated
     */
    void setBodyScope(Scope value);

    /**
     * Returns the value of the '<em><b>Parent Scope</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parent Scope</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Scope</em>' reference.
     * @see #setParentScope(Scope)
     * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getFor_ParentScope()
     * @model
     * @generated
     */
    Scope getParentScope();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.sccharts.For#getParentScope <em>Parent Scope</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Scope</em>' reference.
     * @see #getParentScope()
     * @generated
     */
    void setParentScope(Scope value);

} // For
