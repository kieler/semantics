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

import de.cau.cs.kieler.kexpressions.Expression;
import de.cau.cs.kieler.kexpressions.ValuedObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.Region#getParentState <em>Parent State</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.Region#getCounterVariable <em>Counter Variable</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.Region#getForStart <em>For Start</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.Region#getForEnd <em>For End</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getRegion()
 * @model abstract="true"
 * @generated
 */
public interface Region extends Scope {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\r\n\r\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\r\n\r\nCopyright 2013 by\r\n+ Kiel University\r\n  + Department of Computer Science\r\n    + Real-Time and Embedded Systems Group\r\n\r\nThis code is provided under the terms of the Eclipse Public License (EPL).\r\nSee the file epl-v10.html for the license text.";

    /**
     * Returns the value of the '<em><b>Parent State</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.sccharts.State#getRegions <em>Regions</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parent State</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent State</em>' container reference.
     * @see #setParentState(State)
     * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getRegion_ParentState()
     * @see de.cau.cs.kieler.sccharts.State#getRegions
     * @model opposite="regions" transient="false"
     * @generated
     */
    State getParentState();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.sccharts.Region#getParentState <em>Parent State</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent State</em>' container reference.
     * @see #getParentState()
     * @generated
     */
    void setParentState(State value);

    /**
     * Returns the value of the '<em><b>Counter Variable</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Counter Variable</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Counter Variable</em>' containment reference.
     * @see #setCounterVariable(ValuedObject)
     * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getRegion_CounterVariable()
     * @model containment="true"
     * @generated
     */
    ValuedObject getCounterVariable();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.sccharts.Region#getCounterVariable <em>Counter Variable</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Counter Variable</em>' containment reference.
     * @see #getCounterVariable()
     * @generated
     */
    void setCounterVariable(ValuedObject value);

    /**
     * Returns the value of the '<em><b>For Start</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>For Start</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>For Start</em>' containment reference.
     * @see #setForStart(Expression)
     * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getRegion_ForStart()
     * @model containment="true"
     * @generated
     */
    Expression getForStart();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.sccharts.Region#getForStart <em>For Start</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>For Start</em>' containment reference.
     * @see #getForStart()
     * @generated
     */
    void setForStart(Expression value);

    /**
     * Returns the value of the '<em><b>For End</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>For End</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>For End</em>' containment reference.
     * @see #setForEnd(Expression)
     * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getRegion_ForEnd()
     * @model containment="true"
     * @generated
     */
    Expression getForEnd();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.sccharts.Region#getForEnd <em>For End</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>For End</em>' containment reference.
     * @see #getForEnd()
     * @generated
     */
    void setForEnd(Expression value);

} // Region
