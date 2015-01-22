/**
 */
package de.cau.cs.kieler.scgprios;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predecessor P</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgprios.Predecessor_P#getBasicBlock <em>Basic Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.Predecessor_P#getConditional <em>Conditional</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.Predecessor_P#getBranchType <em>Branch Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getPredecessor_P()
 * @model
 * @generated
 */
public interface Predecessor_P extends EObject {
    /**
     * Returns the value of the '<em><b>Basic Block</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Basic Block</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Basic Block</em>' reference.
     * @see #setBasicBlock(BasicBlock_P)
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getPredecessor_P_BasicBlock()
     * @model required="true"
     * @generated
     */
    BasicBlock_P getBasicBlock();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scgprios.Predecessor_P#getBasicBlock <em>Basic Block</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Basic Block</em>' reference.
     * @see #getBasicBlock()
     * @generated
     */
    void setBasicBlock(BasicBlock_P value);

    /**
     * Returns the value of the '<em><b>Conditional</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conditional</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Conditional</em>' reference.
     * @see #setConditional(Conditional_P)
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getPredecessor_P_Conditional()
     * @model
     * @generated
     */
    Conditional_P getConditional();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scgprios.Predecessor_P#getConditional <em>Conditional</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Conditional</em>' reference.
     * @see #getConditional()
     * @generated
     */
    void setConditional(Conditional_P value);

    /**
     * Returns the value of the '<em><b>Branch Type</b></em>' attribute.
     * The literals are from the enumeration {@link de.cau.cs.kieler.scgprios.BranchType_P}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Branch Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Branch Type</em>' attribute.
     * @see de.cau.cs.kieler.scgprios.BranchType_P
     * @see #setBranchType(BranchType_P)
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getPredecessor_P_BranchType()
     * @model
     * @generated
     */
    BranchType_P getBranchType();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scgprios.Predecessor_P#getBranchType <em>Branch Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Branch Type</em>' attribute.
     * @see de.cau.cs.kieler.scgprios.BranchType_P
     * @see #getBranchType()
     * @generated
     */
    void setBranchType(BranchType_P value);

} // Predecessor_P
