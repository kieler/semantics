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
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scg.BasicBlock#getSchedulingBlocks <em>Scheduling Blocks</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.BasicBlock#getPredecessors <em>Predecessors</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.BasicBlock#isGoBlock <em>Go Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.BasicBlock#isDepthBlock <em>Depth Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.BasicBlock#isSynchronizerBlock <em>Synchronizer Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.BasicBlock#isEntryBlock <em>Entry Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.BasicBlock#isDeadBlock <em>Dead Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.BasicBlock#getPreGuard <em>Pre Guard</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.scg.ScgPackage#getBasicBlock()
 * @model
 * @generated
 */
public interface BasicBlock extends EObject {
    /**
	 * Returns the value of the '<em><b>Scheduling Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.scg.SchedulingBlock}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scheduling Blocks</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduling Blocks</em>' containment reference list.
	 * @see de.cau.cs.kieler.scg.ScgPackage#getBasicBlock_SchedulingBlocks()
	 * @model containment="true"
	 * @generated
	 */
    EList<SchedulingBlock> getSchedulingBlocks();

    /**
	 * Returns the value of the '<em><b>Predecessors</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.scg.Predecessor}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Predecessors</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessors</em>' containment reference list.
	 * @see de.cau.cs.kieler.scg.ScgPackage#getBasicBlock_Predecessors()
	 * @model containment="true"
	 * @generated
	 */
    EList<Predecessor> getPredecessors();

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
	 * @see de.cau.cs.kieler.scg.ScgPackage#getBasicBlock_GoBlock()
	 * @model
	 * @generated
	 */
    boolean isGoBlock();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.scg.BasicBlock#isGoBlock <em>Go Block</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Go Block</em>' attribute.
	 * @see #isGoBlock()
	 * @generated
	 */
    void setGoBlock(boolean value);

    /**
	 * Returns the value of the '<em><b>Depth Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Depth Block</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Depth Block</em>' attribute.
	 * @see #setDepthBlock(boolean)
	 * @see de.cau.cs.kieler.scg.ScgPackage#getBasicBlock_DepthBlock()
	 * @model
	 * @generated
	 */
    boolean isDepthBlock();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.scg.BasicBlock#isDepthBlock <em>Depth Block</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth Block</em>' attribute.
	 * @see #isDepthBlock()
	 * @generated
	 */
    void setDepthBlock(boolean value);

    /**
	 * Returns the value of the '<em><b>Synchronizer Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Synchronizer Block</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronizer Block</em>' attribute.
	 * @see #setSynchronizerBlock(boolean)
	 * @see de.cau.cs.kieler.scg.ScgPackage#getBasicBlock_SynchronizerBlock()
	 * @model
	 * @generated
	 */
    boolean isSynchronizerBlock();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.scg.BasicBlock#isSynchronizerBlock <em>Synchronizer Block</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronizer Block</em>' attribute.
	 * @see #isSynchronizerBlock()
	 * @generated
	 */
    void setSynchronizerBlock(boolean value);

    /**
	 * Returns the value of the '<em><b>Entry Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Block</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Block</em>' attribute.
	 * @see #setEntryBlock(boolean)
	 * @see de.cau.cs.kieler.scg.ScgPackage#getBasicBlock_EntryBlock()
	 * @model
	 * @generated
	 */
	boolean isEntryBlock();

				/**
	 * Sets the value of the '{@link de.cau.cs.kieler.scg.BasicBlock#isEntryBlock <em>Entry Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Block</em>' attribute.
	 * @see #isEntryBlock()
	 * @generated
	 */
	void setEntryBlock(boolean value);

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
	 * @see de.cau.cs.kieler.scg.ScgPackage#getBasicBlock_DeadBlock()
	 * @model
	 * @generated
	 */
    boolean isDeadBlock();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.scg.BasicBlock#isDeadBlock <em>Dead Block</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dead Block</em>' attribute.
	 * @see #isDeadBlock()
	 * @generated
	 */
    void setDeadBlock(boolean value);

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
	 * @see de.cau.cs.kieler.scg.ScgPackage#getBasicBlock_PreGuard()
	 * @model
	 * @generated
	 */
    ValuedObject getPreGuard();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.scg.BasicBlock#getPreGuard <em>Pre Guard</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Guard</em>' reference.
	 * @see #getPreGuard()
	 * @generated
	 */
    void setPreGuard(ValuedObject value);

} // BasicBlock
