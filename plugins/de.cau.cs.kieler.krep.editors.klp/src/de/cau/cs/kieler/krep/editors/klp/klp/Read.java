/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.krep.editors.klp.klp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.krep.editors.klp.klp.Read#isPre <em>Pre</em>}</li>
 *   <li>{@link de.cau.cs.kieler.krep.editors.klp.klp.Read#getReg <em>Reg</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.krep.editors.klp.klp.KlpPackage#getRead()
 * @model
 * @generated
 */
public interface Read extends EObject {
	/**
	 * Returns the value of the '<em><b>Pre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre</em>' attribute.
	 * @see #setPre(boolean)
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.KlpPackage#getRead_Pre()
	 * @model
	 * @generated
	 */
	boolean isPre();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.krep.editors.klp.klp.Read#isPre <em>Pre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre</em>' attribute.
	 * @see #isPre()
	 * @generated
	 */
	void setPre(boolean value);

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
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.KlpPackage#getRead_Reg()
	 * @model
	 * @generated
	 */
	Reg getReg();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.krep.editors.klp.klp.Read#getReg <em>Reg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reg</em>' reference.
	 * @see #getReg()
	 * @generated
	 */
	void setReg(Reg value);

} // Read
