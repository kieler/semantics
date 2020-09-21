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
package de.cau.cs.kieler.sccharts;

import de.cau.cs.kieler.annotations.NamedObject;

import de.cau.cs.kieler.kexpressions.Call;
import de.cau.cs.kieler.kexpressions.Parameter;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scope Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.ScopeCall#getTarget <em>Target</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.ScopeCall#isSuper <em>Super</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.ScopeCall#getGenericParameters <em>Generic Parameters</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getScopeCall()
 * @model
 * @generated
 */
public interface ScopeCall extends Call {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\r\n\r\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\r\n\r\nCopyright 2013 by\r\n+ Kiel University\r\n  + Department of Computer Science\r\n    + Real-Time and Embedded Systems Group\r\n\r\nThis code is provided under the terms of the Eclipse Public License (EPL).\r\nSee the file epl-v10.html for the license text.";

    /**
     * Returns the value of the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(NamedObject)
     * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getScopeCall_Target()
     * @model
     * @generated
     */
    NamedObject getTarget();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.sccharts.ScopeCall#getTarget <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(NamedObject value);

    /**
     * Returns the value of the '<em><b>Super</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Super</em>' attribute.
     * @see #setSuper(boolean)
     * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getScopeCall_Super()
     * @model
     * @generated
     */
    boolean isSuper();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.sccharts.ScopeCall#isSuper <em>Super</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Super</em>' attribute.
     * @see #isSuper()
     * @generated
     */
    void setSuper(boolean value);

    /**
     * Returns the value of the '<em><b>Generic Parameters</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kexpressions.Parameter}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Generic Parameters</em>' containment reference list.
     * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getScopeCall_GenericParameters()
     * @model containment="true"
     * @generated
     */
    EList<Parameter> getGenericParameters();

} // ScopeCall
