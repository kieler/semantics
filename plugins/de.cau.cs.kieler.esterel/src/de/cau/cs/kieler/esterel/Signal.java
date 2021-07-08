/**
 */
package de.cau.cs.kieler.esterel;

import de.cau.cs.kieler.kexpressions.ValueType;
import de.cau.cs.kieler.kexpressions.ValuedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.Signal#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.Signal#getIdType <em>Id Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.Signal#getCombineFunction <em>Combine Function</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getSignal()
 * @model
 * @generated
 */
public interface Signal extends ValuedObject {
    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link de.cau.cs.kieler.kexpressions.ValueType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see de.cau.cs.kieler.kexpressions.ValueType
     * @see #setType(ValueType)
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getSignal_Type()
     * @model
     * @generated
     */
    ValueType getType();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.Signal#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see de.cau.cs.kieler.kexpressions.ValueType
     * @see #getType()
     * @generated
     */
    void setType(ValueType value);

    /**
     * Returns the value of the '<em><b>Id Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id Type</em>' attribute.
     * @see #setIdType(String)
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getSignal_IdType()
     * @model
     * @generated
     */
    String getIdType();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.Signal#getIdType <em>Id Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id Type</em>' attribute.
     * @see #getIdType()
     * @generated
     */
    void setIdType(String value);

    /**
     * Returns the value of the '<em><b>Combine Function</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Combine Function</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Combine Function</em>' reference.
     * @see #setCombineFunction(Function)
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getSignal_CombineFunction()
     * @model
     * @generated
     */
    Function getCombineFunction();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.Signal#getCombineFunction <em>Combine Function</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Combine Function</em>' reference.
     * @see #getCombineFunction()
     * @generated
     */
    void setCombineFunction(Function value);

} // Signal
