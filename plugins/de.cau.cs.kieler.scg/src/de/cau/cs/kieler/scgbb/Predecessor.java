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

import de.cau.cs.kieler.scg.Conditional;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predecessor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgbb.Predecessor#getBasicBlock <em>Basic Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgbb.Predecessor#getBlockType <em>Block Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgbb.Predecessor#getConditional <em>Conditional</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scgbb.ScgbbPackage#getPredecessor()
 * @model
 * @generated
 */
public interface Predecessor extends EObject {
	/**
     * Returns the value of the '<em><b>Basic Block</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basic Block</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Basic Block</em>' reference.
     * @see #setBasicBlock(BasicBlock)
     * @see de.cau.cs.kieler.scgbb.ScgbbPackage#getPredecessor_BasicBlock()
     * @model required="true"
     * @generated
     */
	BasicBlock getBasicBlock();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.scgbb.Predecessor#getBasicBlock <em>Basic Block</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Basic Block</em>' reference.
     * @see #getBasicBlock()
     * @generated
     */
	void setBasicBlock(BasicBlock value);

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
     * @see de.cau.cs.kieler.scgbb.ScgbbPackage#getPredecessor_BlockType()
     * @model
     * @generated
     */
	BlockType getBlockType();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.scgbb.Predecessor#getBlockType <em>Block Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Block Type</em>' attribute.
     * @see de.cau.cs.kieler.scgbb.BlockType
     * @see #getBlockType()
     * @generated
     */
	void setBlockType(BlockType value);

	/**
     * Returns the value of the '<em><b>Conditional</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditional</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Conditional</em>' reference.
     * @see #setConditional(Conditional)
     * @see de.cau.cs.kieler.scgbb.ScgbbPackage#getPredecessor_Conditional()
     * @model
     * @generated
     */
	Conditional getConditional();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.scgbb.Predecessor#getConditional <em>Conditional</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Conditional</em>' reference.
     * @see #getConditional()
     * @generated
     */
	void setConditional(Conditional value);

} // Predecessor
