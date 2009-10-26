/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.krep.editors.klp.klp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.krep.editors.klp.klp.Prio#getPrio <em>Prio</em>}</li>
 *   <li>{@link de.cau.cs.kieler.krep.editors.klp.klp.Prio#getReg <em>Reg</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.krep.editors.klp.klp.KlpPackage#getPrio()
 * @model
 * @generated
 */
public interface Prio extends Instruction {
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
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.KlpPackage#getPrio_Reg()
	 * @model
	 * @generated
	 */
	Reg getReg();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.krep.editors.klp.klp.Prio#getReg <em>Reg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reg</em>' reference.
	 * @see #getReg()
	 * @generated
	 */
	void setReg(Reg value);

	/**
	 * Returns the value of the '<em><b>Prio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prio</em>' attribute.
	 * @see #setPrio(int)
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.KlpPackage#getPrio_Prio()
	 * @model
	 * @generated
	 */
	int getPrio();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.krep.editors.klp.klp.Prio#getPrio <em>Prio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prio</em>' attribute.
	 * @see #getPrio()
	 * @generated
	 */
	void setPrio(int value);

} // Prio
