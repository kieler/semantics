/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.krep.editors.klp.klp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jmp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.krep.editors.klp.klp.Jmp#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.krep.editors.klp.klp.KlpPackage#getJmp()
 * @model
 * @generated
 */
public interface Jmp extends Instruction {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' reference.
	 * @see #setLabel(Label)
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.KlpPackage#getJmp_Label()
	 * @model
	 * @generated
	 */
	Label getLabel();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.krep.editors.klp.klp.Jmp#getLabel <em>Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(Label value);

} // Jmp
