/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.krep.editors.klp.klp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CJmp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.krep.editors.klp.klp.CJmp#getCond <em>Cond</em>}</li>
 *   <li>{@link de.cau.cs.kieler.krep.editors.klp.klp.CJmp#getReg <em>Reg</em>}</li>
 *   <li>{@link de.cau.cs.kieler.krep.editors.klp.klp.CJmp#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.krep.editors.klp.klp.KlpPackage#getCJmp()
 * @model
 * @generated
 */
public interface CJmp extends Instruction {
	/**
	 * Returns the value of the '<em><b>Cond</b></em>' attribute.
	 * The literals are from the enumeration {@link de.cau.cs.kieler.krep.editors.klp.klp.JumpKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cond</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cond</em>' attribute.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.JumpKind
	 * @see #setCond(JumpKind)
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.KlpPackage#getCJmp_Cond()
	 * @model
	 * @generated
	 */
	JumpKind getCond();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.krep.editors.klp.klp.CJmp#getCond <em>Cond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cond</em>' attribute.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.JumpKind
	 * @see #getCond()
	 * @generated
	 */
	void setCond(JumpKind value);

	/**
	 * Returns the value of the '<em><b>Reg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reg</em>' containment reference.
	 * @see #setReg(Read)
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.KlpPackage#getCJmp_Reg()
	 * @model containment="true"
	 * @generated
	 */
	Read getReg();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.krep.editors.klp.klp.CJmp#getReg <em>Reg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reg</em>' containment reference.
	 * @see #getReg()
	 * @generated
	 */
	void setReg(Read value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(Label)
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.KlpPackage#getCJmp_Label()
	 * @model containment="true"
	 * @generated
	 */
	Label getLabel();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.krep.editors.klp.klp.CJmp#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(Label value);

} // CJmp
