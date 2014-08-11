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
package de.cau.cs.kieler.scg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predecessor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scg.Predecessor#getBasicBlock <em>Basic Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.Predecessor#getConditional <em>Conditional</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.Predecessor#getBranchType <em>Branch Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scg.ScgPackage#getPredecessor()
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
     * @see de.cau.cs.kieler.scg.ScgPackage#getPredecessor_BasicBlock()
     * @model required="true"
     * @generated
     */
    BasicBlock getBasicBlock();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scg.Predecessor#getBasicBlock <em>Basic Block</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Basic Block</em>' reference.
     * @see #getBasicBlock()
     * @generated
     */
    void setBasicBlock(BasicBlock value);

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
     * @see de.cau.cs.kieler.scg.ScgPackage#getPredecessor_Conditional()
     * @model
     * @generated
     */
    Conditional getConditional();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scg.Predecessor#getConditional <em>Conditional</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Conditional</em>' reference.
     * @see #getConditional()
     * @generated
     */
    void setConditional(Conditional value);

				/**
     * Returns the value of the '<em><b>Branch Type</b></em>' attribute.
     * The literals are from the enumeration {@link de.cau.cs.kieler.scg.BranchType}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branch Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Branch Type</em>' attribute.
     * @see de.cau.cs.kieler.scg.BranchType
     * @see #setBranchType(BranchType)
     * @see de.cau.cs.kieler.scg.ScgPackage#getPredecessor_BranchType()
     * @model
     * @generated
     */
	BranchType getBranchType();

				/**
     * Sets the value of the '{@link de.cau.cs.kieler.scg.Predecessor#getBranchType <em>Branch Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Branch Type</em>' attribute.
     * @see de.cau.cs.kieler.scg.BranchType
     * @see #getBranchType()
     * @generated
     */
	void setBranchType(BranchType value);

} // Predecessor
