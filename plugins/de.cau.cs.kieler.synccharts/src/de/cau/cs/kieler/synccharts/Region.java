/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Regions represent a parallelism in SyncCharts. A {@link State} may contain
 * multiple Regions and each Region may contain multiple States. The Regions
 * are then logically executed in parallel. A SyncChart gets represented by one root Region 
 * that contains exactly one root State.
 * <p>
 * A Region is a {@link Scope} and therefore gets identified by label and id
 * and carries an interface declaration. Hence a Region may declare
 * local signals or variables.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.Region#getStates <em>States</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Region#getParentState <em>Parent State</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends Scope {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2009 by\n+ Christian-Albrechts-University of Kiel\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.synccharts.State}.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.State#getParentRegion <em>Parent Region</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>States</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getRegion_States()
	 * @see de.cau.cs.kieler.synccharts.State#getParentRegion
	 * @model opposite="parentRegion" containment="true"
	 * @generated
	 */
    EList<State> getStates();

    /**
	 * Returns the value of the '<em><b>Parent State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.State#getRegions <em>Regions</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parent State</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent State</em>' container reference.
	 * @see #setParentState(State)
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getRegion_ParentState()
	 * @see de.cau.cs.kieler.synccharts.State#getRegions
	 * @model opposite="regions" transient="false"
	 * @generated
	 */
    State getParentState();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Region#getParentState <em>Parent State</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent State</em>' container reference.
	 * @see #getParentState()
	 * @generated
	 */
    void setParentState(State value);

} // Region
