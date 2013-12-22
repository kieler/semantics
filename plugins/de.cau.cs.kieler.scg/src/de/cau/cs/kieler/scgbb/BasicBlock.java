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

import de.cau.cs.kieler.core.kexpressions.ValuedObject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgbb.BasicBlock#getSchedulingBlocks <em>Scheduling Blocks</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgbb.BasicBlock#getGuards <em>Guards</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgbb.BasicBlock#getPredecessors <em>Predecessors</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scgbb.ScgbbPackage#getBasicBlock()
 * @model
 * @generated
 */
public interface BasicBlock extends EObject {
    /**
	 * Returns the value of the '<em><b>Scheduling Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.scgbb.SchedulingBlock}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scheduling Blocks</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduling Blocks</em>' containment reference list.
	 * @see de.cau.cs.kieler.scgbb.ScgbbPackage#getBasicBlock_SchedulingBlocks()
	 * @model containment="true"
	 * @generated
	 */
    EList<SchedulingBlock> getSchedulingBlocks();

    /**
	 * Returns the value of the '<em><b>Guards</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.core.kexpressions.ValuedObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guards</em>' containment reference list.
	 * @see de.cau.cs.kieler.scgbb.ScgbbPackage#getBasicBlock_Guards()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ValuedObject> getGuards();

				/**
	 * Returns the value of the '<em><b>Predecessors</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.scgbb.BasicBlock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predecessors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessors</em>' reference list.
	 * @see de.cau.cs.kieler.scgbb.ScgbbPackage#getBasicBlock_Predecessors()
	 * @model
	 * @generated
	 */
	EList<BasicBlock> getPredecessors();

} // BasicBlock
