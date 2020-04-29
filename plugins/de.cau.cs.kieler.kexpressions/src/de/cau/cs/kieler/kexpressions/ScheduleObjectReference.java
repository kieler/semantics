/**
 */
package de.cau.cs.kieler.kexpressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule Object Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.ScheduleObjectReference#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getScheduleObjectReference()
 * @model
 * @generated
 */
public interface ScheduleObjectReference extends ValuedObjectReference {
    /**
     * Returns the value of the '<em><b>Priority</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Priority</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Priority</em>' containment reference.
     * @see #setPriority(Expression)
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getScheduleObjectReference_Priority()
     * @model containment="true"
     * @generated
     */
    Expression getPriority();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.ScheduleObjectReference#getPriority <em>Priority</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Priority</em>' containment reference.
     * @see #getPriority()
     * @generated
     */
    void setPriority(Expression value);

} // ScheduleObjectReference
