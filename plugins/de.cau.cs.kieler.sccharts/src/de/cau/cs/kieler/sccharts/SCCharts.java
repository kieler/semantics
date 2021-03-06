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

import de.cau.cs.kieler.annotations.Nameable;
import de.cau.cs.kieler.annotations.Pragmatable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SC Charts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.SCCharts#getRootStates <em>Root States</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.SCCharts#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getSCCharts()
 * @model
 * @generated
 */
public interface SCCharts extends Pragmatable, Nameable {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\r\n\r\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\r\n\r\nCopyright 2013 by\r\n+ Kiel University\r\n  + Department of Computer Science\r\n    + Real-Time and Embedded Systems Group\r\n\r\nThis code is provided under the terms of the Eclipse Public License (EPL).\r\nSee the file epl-v10.html for the license text.";

    /**
     * Returns the value of the '<em><b>Root States</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.sccharts.State}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Root States</em>' containment reference list.
     * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getSCCharts_RootStates()
     * @model containment="true"
     * @generated
     */
    EList<State> getRootStates();

    /**
     * Returns the value of the '<em><b>Imports</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Imports</em>' attribute list.
     * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getSCCharts_Imports()
     * @model
     * @generated
     */
    EList<String> getImports();

} // SCCharts
