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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controlflow Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Regions represent a parallelism in sccharts. A {@link State} may contain
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
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.legacy.sccharts.ControlflowRegion#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.sccharts.legacy.sccharts.SCChartsPackage#getControlflowRegion()
 * @model
 * @generated
 */
public interface ControlflowRegion extends Region {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Kiel University\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
     * Returns the value of the '<em><b>States</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.sccharts.legacy.sccharts.State}.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.sccharts.legacy.sccharts.State#getParentRegion <em>Parent Region</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>States</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>States</em>' containment reference list.
     * @see de.cau.cs.kieler.sccharts.legacy.sccharts.SCChartsPackage#getControlflowRegion_States()
     * @see de.cau.cs.kieler.sccharts.legacy.sccharts.State#getParentRegion
     * @model opposite="parentRegion" containment="true"
     * @generated
     */
    EList<State> getStates();

} // ControlflowRegion
