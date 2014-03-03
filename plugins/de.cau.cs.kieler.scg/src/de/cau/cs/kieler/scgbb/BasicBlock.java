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
 *   <li>{@link de.cau.cs.kieler.scgbb.BasicBlock#isGoBlock <em>Go Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgbb.BasicBlock#isDeadBlock <em>Dead Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgbb.BasicBlock#getBlockType <em>Block Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgbb.BasicBlock#getPreGuard <em>Pre Guard</em>}</li>
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
	 * Returns the value of the '<em><b>Predecessors</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.scgbb.Predecessor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predecessors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessors</em>' containment reference list.
	 * @see de.cau.cs.kieler.scgbb.ScgbbPackage#getBasicBlock_Predecessors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Predecessor> getPredecessors();

				/**
	 * Returns the value of the '<em><b>Block Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.cau.cs.kieler.scgbb.BlockType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Type</em>' attribute.
	 * @see de.cau.cs.kieler.scgbb.BlockType
	 * @see #setBlockType(BlockType)
	 * @see de.cau.cs.kieler.scgbb.ScgbbPackage#getBasicBlock_BlockType()
	 * @model
	 * @generated
	 */
	BlockType getBlockType();

				/**
	 * Sets the value of the '{@link de.cau.cs.kieler.scgbb.BasicBlock#getBlockType <em>Block Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Type</em>' attribute.
	 * @see de.cau.cs.kieler.scgbb.BlockType
	 * @see #getBlockType()
	 * @generated
	 */
	void setBlockType(BlockType value);

				/**
	 * Returns the value of the '<em><b>Pre Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Guard</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Guard</em>' reference.
	 * @see #setPreGuard(ValuedObject)
	 * @see de.cau.cs.kieler.scgbb.ScgbbPackage#getBasicBlock_PreGuard()
	 * @model
	 * @generated
	 */
	ValuedObject getPreGuard();

				/**
	 * Sets the value of the '{@link de.cau.cs.kieler.scgbb.BasicBlock#getPreGuard <em>Pre Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Guard</em>' reference.
	 * @see #getPreGuard()
	 * @generated
	 */
	void setPreGuard(ValuedObject value);

				/**
	 * Returns the value of the '<em><b>Go Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Go Block</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Go Block</em>' attribute.
	 * @see #setGoBlock(boolean)
	 * @see de.cau.cs.kieler.scgbb.ScgbbPackage#getBasicBlock_GoBlock()
	 * @model
	 * @generated
	 */
	boolean isGoBlock();

				/**
	 * Sets the value of the '{@link de.cau.cs.kieler.scgbb.BasicBlock#isGoBlock <em>Go Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Go Block</em>' attribute.
	 * @see #isGoBlock()
	 * @generated
	 */
	void setGoBlock(boolean value);

                /**
	 * Returns the value of the '<em><b>Dead Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dead Block</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Dead Block</em>' attribute.
	 * @see #setDeadBlock(boolean)
	 * @see de.cau.cs.kieler.scgbb.ScgbbPackage#getBasicBlock_DeadBlock()
	 * @model
	 * @generated
	 */
    boolean isDeadBlock();

                /**
	 * Sets the value of the '{@link de.cau.cs.kieler.scgbb.BasicBlock#isDeadBlock <em>Dead Block</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dead Block</em>' attribute.
	 * @see #isDeadBlock()
	 * @generated
	 */
    void setDeadBlock(boolean value);

} // BasicBlock
