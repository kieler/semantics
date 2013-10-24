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
package de.cau.cs.kieler.scgbb;

import de.cau.cs.kieler.scgdep.SCGraphDep;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SC Graph BB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgbb.SCGraphBB#getBasicBlocks <em>Basic Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scgbb.ScgbbPackage#getSCGraphBB()
 * @model
 * @generated
 */
public interface SCGraphBB extends SCGraphDep {
    /**
     * Returns the value of the '<em><b>Basic Blocks</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.scgbb.BasicBlock}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Basic Blocks</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Basic Blocks</em>' containment reference list.
     * @see de.cau.cs.kieler.scgbb.ScgbbPackage#getSCGraphBB_BasicBlocks()
     * @model containment="true"
     * @generated
     */
    EList<BasicBlock> getBasicBlocks();

} // SCGraphBB
