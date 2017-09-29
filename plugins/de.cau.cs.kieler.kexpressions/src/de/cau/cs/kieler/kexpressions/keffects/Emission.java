/**
 */
package de.cau.cs.kieler.kexpressions.keffects;

import de.cau.cs.kieler.kexpressions.Expression;
import de.cau.cs.kieler.kexpressions.ValuedObjectReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.keffects.Emission#getReference <em>Reference</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.keffects.Emission#getNewValue <em>New Value</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage#getEmission()
 * @model
 * @generated
 */
public interface Emission extends Effect {
	/**
     * Returns the value of the '<em><b>Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reference</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reference</em>' containment reference.
     * @see #setReference(ValuedObjectReference)
     * @see de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage#getEmission_Reference()
     * @model containment="true" required="true"
     * @generated
     */
    ValuedObjectReference getReference();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.keffects.Emission#getReference <em>Reference</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reference</em>' containment reference.
     * @see #getReference()
     * @generated
     */
    void setReference(ValuedObjectReference value);

    /**
     * Returns the value of the '<em><b>New Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * @return the value of the '<em>New Value</em>' containment reference.
     * @see #setNewValue(Expression)
     * @see de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage#getEmission_NewValue()
     * @model containment="true"
     * @generated
     */
	Expression getNewValue();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.keffects.Emission#getNewValue <em>New Value</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>New Value</em>' containment reference.
     * @see #getNewValue()
     * @generated
     */
	void setNewValue(Expression value);

} // Emission
