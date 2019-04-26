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

import de.cau.cs.kieler.kexpressions.AccessModifier;
import de.cau.cs.kieler.kexpressions.Declaration;
import de.cau.cs.kieler.kexpressions.Schedulable;
import de.cau.cs.kieler.kexpressions.ValueType;

import de.cau.cs.kieler.kexpressions.ValuedObject;
import de.cau.cs.kieler.scl.Scope;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.Method#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.Method#getParameterDeclarations <em>Parameter Declarations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.Method#getAccess <em>Access</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends ValuedObject, Scope, Schedulable {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\r\n\r\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\r\n\r\nCopyright 2013 by\r\n+ Kiel University\r\n  + Department of Computer Science\r\n    + Real-Time and Embedded Systems Group\r\n\r\nThis code is provided under the terms of the Eclipse Public License (EPL).\r\nSee the file epl-v10.html for the license text.";

    /**
     * Returns the value of the '<em><b>Return Type</b></em>' attribute.
     * The literals are from the enumeration {@link de.cau.cs.kieler.kexpressions.ValueType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Return Type</em>' attribute.
     * @see de.cau.cs.kieler.kexpressions.ValueType
     * @see #setReturnType(ValueType)
     * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getMethod_ReturnType()
     * @model
     * @generated
     */
    ValueType getReturnType();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.sccharts.Method#getReturnType <em>Return Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Return Type</em>' attribute.
     * @see de.cau.cs.kieler.kexpressions.ValueType
     * @see #getReturnType()
     * @generated
     */
    void setReturnType(ValueType value);

    /**
     * Returns the value of the '<em><b>Parameter Declarations</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kexpressions.Declaration}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameter Declarations</em>' containment reference list.
     * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getMethod_ParameterDeclarations()
     * @model containment="true"
     * @generated
     */
    EList<Declaration> getParameterDeclarations();

    /**
     * Returns the value of the '<em><b>Access</b></em>' attribute.
     * The literals are from the enumeration {@link de.cau.cs.kieler.kexpressions.AccessModifier}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Access</em>' attribute.
     * @see de.cau.cs.kieler.kexpressions.AccessModifier
     * @see #setAccess(AccessModifier)
     * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getMethod_Access()
     * @model required="true" ordered="false"
     * @generated
     */
    AccessModifier getAccess();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.sccharts.Method#getAccess <em>Access</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Access</em>' attribute.
     * @see de.cau.cs.kieler.kexpressions.AccessModifier
     * @see #getAccess()
     * @generated
     */
    void setAccess(AccessModifier value);

} // Method
