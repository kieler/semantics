/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.krep.editors.klp.klp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Clk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.krep.editors.klp.klp.SetClk#getClk <em>Clk</em>}</li>
 *   <li>{@link de.cau.cs.kieler.krep.editors.klp.klp.SetClk#getReg <em>Reg</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.krep.editors.klp.klp.KlpPackage#getSetClk()
 * @model
 * @generated
 */
public interface SetClk extends Instruction {
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
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.KlpPackage#getSetClk_Reg()
	 * @model
	 * @generated
	 */
	Reg getReg();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.krep.editors.klp.klp.SetClk#getReg <em>Reg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reg</em>' reference.
	 * @see #getReg()
	 * @generated
	 */
	void setReg(Reg value);

	/**
	 * Returns the value of the '<em><b>Clk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clk</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clk</em>' containment reference.
	 * @see #setClk(Reg)
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.KlpPackage#getSetClk_Clk()
	 * @model containment="true"
	 * @generated
	 */
	Reg getClk();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.krep.editors.klp.klp.SetClk#getClk <em>Clk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clk</em>' containment reference.
	 * @see #getClk()
	 * @generated
	 */
	void setClk(Reg value);

} // SetClk
