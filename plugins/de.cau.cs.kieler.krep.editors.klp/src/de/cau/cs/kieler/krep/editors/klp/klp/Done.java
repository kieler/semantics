/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.krep.editors.klp.klp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Done</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.krep.editors.klp.klp.Done#getPc <em>Pc</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.krep.editors.klp.klp.KlpPackage#getDone()
 * @model
 * @generated
 */
public interface Done extends Instruction {
	/**
	 * Returns the value of the '<em><b>Pc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pc</em>' reference.
	 * @see #setPc(Label)
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.KlpPackage#getDone_Pc()
	 * @model
	 * @generated
	 */
	Label getPc();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.krep.editors.klp.klp.Done#getPc <em>Pc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pc</em>' reference.
	 * @see #getPc()
	 * @generated
	 */
	void setPc(Label value);

} // Done
