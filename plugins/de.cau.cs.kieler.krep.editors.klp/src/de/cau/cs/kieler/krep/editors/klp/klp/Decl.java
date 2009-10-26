/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.krep.editors.klp.klp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.krep.editors.klp.klp.Decl#getScope <em>Scope</em>}</li>
 *   <li>{@link de.cau.cs.kieler.krep.editors.klp.klp.Decl#getReg <em>Reg</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.krep.editors.klp.klp.KlpPackage#getDecl()
 * @model
 * @generated
 */
public interface Decl extends Instruction {
	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * The literals are from the enumeration {@link de.cau.cs.kieler.krep.editors.klp.klp.Scope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Scope
	 * @see #setScope(Scope)
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.KlpPackage#getDecl_Scope()
	 * @model
	 * @generated
	 */
	Scope getScope();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.krep.editors.klp.klp.Decl#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Scope
	 * @see #getScope()
	 * @generated
	 */
	void setScope(Scope value);

	/**
	 * Returns the value of the '<em><b>Reg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reg</em>' reference.
	 * @see #setReg(Reg)
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.KlpPackage#getDecl_Reg()
	 * @model
	 * @generated
	 */
	Reg getReg();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.krep.editors.klp.klp.Decl#getReg <em>Reg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reg</em>' reference.
	 * @see #getReg()
	 * @generated
	 */
	void setReg(Reg value);

} // Decl
