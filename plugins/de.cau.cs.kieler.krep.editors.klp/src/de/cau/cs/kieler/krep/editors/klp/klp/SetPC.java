/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.krep.editors.klp.klp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set PC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.krep.editors.klp.klp.SetPC#getLabel <em>Label</em>}</li>
 *   <li>{@link de.cau.cs.kieler.krep.editors.klp.klp.SetPC#getReg <em>Reg</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.krep.editors.klp.klp.KlpPackage#getSetPC()
 * @model
 * @generated
 */
public interface SetPC extends Instruction {
	/**
	 * Returns the value of the '<em><b>Reg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reg</em>' reference.
	 * @see #setReg(Reg)
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.KlpPackage#getSetPC_Reg()
	 * @model
	 * @generated
	 */
	Reg getReg();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.krep.editors.klp.klp.SetPC#getReg <em>Reg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reg</em>' reference.
	 * @see #getReg()
	 * @generated
	 */
	void setReg(Reg value);

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
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.KlpPackage#getSetPC_Label()
	 * @model containment="true"
	 * @generated
	 */
	Label getLabel();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.krep.editors.klp.klp.SetPC#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(Label value);

} // SetPC
