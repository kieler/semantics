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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.Region#getParentState <em>Parent State</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends Scope {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Kiel University\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

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

} // Region
