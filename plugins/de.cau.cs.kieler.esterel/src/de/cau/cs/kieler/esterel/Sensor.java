/**
 */
package de.cau.cs.kieler.esterel;

import de.cau.cs.kieler.kexpressions.ValuedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.Sensor#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends ValuedObject {
    /**
     * Returns the value of the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' containment reference.
     * @see #setType(TypeIdentifier)
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getSensor_Type()
     * @model containment="true"
     * @generated
     */
    TypeIdentifier getType();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.Sensor#getType <em>Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' containment reference.
     * @see #getType()
     * @generated
     */
    void setType(TypeIdentifier value);

} // Sensor
