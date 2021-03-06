/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.legacy.sccharts;

import de.cau.cs.kieler.sccharts.legacy.kexpressions.ValuedObjectReference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.legacy.sccharts.ReferenceNode#getReferencedScope <em>Referenced Scope</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.legacy.sccharts.ReferenceNode#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.sccharts.legacy.sccharts.SCChartsPackage#getReferenceNode()
 * @model
 * @generated
 */
public interface ReferenceNode extends Node {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Kiel University\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
     * Returns the value of the '<em><b>Referenced Scope</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referenced Scope</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referenced Scope</em>' reference.
     * @see #setReferencedScope(Scope)
     * @see de.cau.cs.kieler.sccharts.legacy.sccharts.SCChartsPackage#getReferenceNode_ReferencedScope()
     * @model
     * @generated
     */
    Scope getReferencedScope();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.sccharts.legacy.sccharts.ReferenceNode#getReferencedScope <em>Referenced Scope</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Referenced Scope</em>' reference.
     * @see #getReferencedScope()
     * @generated
     */
    void setReferencedScope(Scope value);

    /**
     * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.sccharts.legacy.kexpressions.ValuedObjectReference}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameters</em>' containment reference list.
     * @see de.cau.cs.kieler.sccharts.legacy.sccharts.SCChartsPackage#getReferenceNode_Parameters()
     * @model containment="true"
     * @generated
     */
    EList<ValuedObjectReference> getParameters();

} // ReferenceNode
