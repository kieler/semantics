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

import de.cau.cs.kieler.sccharts.legacy.annotations.Annotatable;

import de.cau.cs.kieler.sccharts.legacy.kexpressions.Expression;
import de.cau.cs.kieler.sccharts.legacy.kexpressions.Value;
import de.cau.cs.kieler.sccharts.legacy.kexpressions.ValuedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.legacy.sccharts.Binding#getFormal <em>Formal</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.legacy.sccharts.Binding#getActual <em>Actual</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.legacy.sccharts.Binding#getIndices <em>Indices</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.legacy.sccharts.Binding#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.sccharts.legacy.sccharts.SCChartsPackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends Annotatable {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Kiel University\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
     * Returns the value of the '<em><b>Formal</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Formal</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Formal</em>' reference.
     * @see #setFormal(ValuedObject)
     * @see de.cau.cs.kieler.sccharts.legacy.sccharts.SCChartsPackage#getBinding_Formal()
     * @model
     * @generated
     */
    ValuedObject getFormal();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.sccharts.legacy.sccharts.Binding#getFormal <em>Formal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Formal</em>' reference.
     * @see #getFormal()
     * @generated
     */
    void setFormal(ValuedObject value);

    /**
     * Returns the value of the '<em><b>Actual</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Actual</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Actual</em>' reference.
     * @see #setActual(ValuedObject)
     * @see de.cau.cs.kieler.sccharts.legacy.sccharts.SCChartsPackage#getBinding_Actual()
     * @model
     * @generated
     */
    ValuedObject getActual();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.sccharts.legacy.sccharts.Binding#getActual <em>Actual</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Actual</em>' reference.
     * @see #getActual()
     * @generated
     */
    void setActual(ValuedObject value);

    /**
     * Returns the value of the '<em><b>Indices</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.sccharts.legacy.kexpressions.Expression}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Indices</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Indices</em>' containment reference list.
     * @see de.cau.cs.kieler.sccharts.legacy.sccharts.SCChartsPackage#getBinding_Indices()
     * @model containment="true"
     * @generated
     */
    EList<Expression> getIndices();

    /**
     * Returns the value of the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' containment reference.
     * @see #setValue(Value)
     * @see de.cau.cs.kieler.sccharts.legacy.sccharts.SCChartsPackage#getBinding_Value()
     * @model containment="true"
     * @generated
     */
    Value getValue();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.sccharts.legacy.sccharts.Binding#getValue <em>Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' containment reference.
     * @see #getValue()
     * @generated
     */
    void setValue(Value value);

} // Binding
