/**
 */
package de.cau.cs.kieler.scgprios;

import de.cau.cs.kieler.core.kexpressions.ValuedObject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Block P</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgprios.BasicBlock_P#getSchedulingBlocks <em>Scheduling Blocks</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.BasicBlock_P#getPredecessors <em>Predecessors</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.BasicBlock_P#isGoBlock <em>Go Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.BasicBlock_P#isDepthBlock <em>Depth Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.BasicBlock_P#isSynchronizerBlock <em>Synchronizer Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.BasicBlock_P#isEntryBlock <em>Entry Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.BasicBlock_P#isDeadBlock <em>Dead Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.BasicBlock_P#getPreGuard <em>Pre Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getBasicBlock_P()
 * @model
 * @generated
 */
public interface BasicBlock_P extends EObject {
    /**
     * Returns the value of the '<em><b>Scheduling Blocks</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.scgprios.SchedulingBlock_P}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scheduling Blocks</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scheduling Blocks</em>' containment reference list.
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getBasicBlock_P_SchedulingBlocks()
     * @model containment="true"
     * @generated
     */
    EList<SchedulingBlock_P> getSchedulingBlocks();

    /**
     * Returns the value of the '<em><b>Predecessors</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.scgprios.Predecessor_P}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Predecessors</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Predecessors</em>' containment reference list.
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getBasicBlock_P_Predecessors()
     * @model containment="true"
     * @generated
     */
    EList<Predecessor_P> getPredecessors();

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
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getBasicBlock_P_GoBlock()
     * @model
     * @generated
     */
    boolean isGoBlock();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scgprios.BasicBlock_P#isGoBlock <em>Go Block</em>}' attribute.
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
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getBasicBlock_P_DepthBlock()
     * @model
     * @generated
     */
    boolean isDepthBlock();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scgprios.BasicBlock_P#isDepthBlock <em>Depth Block</em>}' attribute.
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
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getBasicBlock_P_SynchronizerBlock()
     * @model
     * @generated
     */
    boolean isSynchronizerBlock();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scgprios.BasicBlock_P#isSynchronizerBlock <em>Synchronizer Block</em>}' attribute.
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
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getBasicBlock_P_EntryBlock()
     * @model
     * @generated
     */
    boolean isEntryBlock();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scgprios.BasicBlock_P#isEntryBlock <em>Entry Block</em>}' attribute.
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
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getBasicBlock_P_DeadBlock()
     * @model
     * @generated
     */
    boolean isDeadBlock();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scgprios.BasicBlock_P#isDeadBlock <em>Dead Block</em>}' attribute.
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
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getBasicBlock_P_PreGuard()
     * @model
     * @generated
     */
    ValuedObject getPreGuard();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scgprios.BasicBlock_P#getPreGuard <em>Pre Guard</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pre Guard</em>' reference.
     * @see #getPreGuard()
     * @generated
     */
    void setPreGuard(ValuedObject value);

} // BasicBlock_P
