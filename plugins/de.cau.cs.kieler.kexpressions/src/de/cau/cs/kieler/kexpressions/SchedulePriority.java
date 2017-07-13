/**
 */
package de.cau.cs.kieler.kexpressions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule Priority</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.SchedulePriority#getPriority <em>Priority</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.SchedulePriority#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getSchedulePriority()
 * @model
 * @generated
 */
public interface SchedulePriority extends EObject {
    /**
     * Returns the value of the '<em><b>Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Priority</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Priority</em>' attribute.
     * @see #setPriority(int)
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getSchedulePriority_Priority()
     * @model
     * @generated
     */
    int getPriority();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.SchedulePriority#getPriority <em>Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Priority</em>' attribute.
     * @see #getPriority()
     * @generated
     */
    void setPriority(int value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link de.cau.cs.kieler.kexpressions.SchedulePriorityType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see de.cau.cs.kieler.kexpressions.SchedulePriorityType
     * @see #setType(SchedulePriorityType)
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getSchedulePriority_Type()
     * @model
     * @generated
     */
    SchedulePriorityType getType();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.SchedulePriority#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see de.cau.cs.kieler.kexpressions.SchedulePriorityType
     * @see #getType()
     * @generated
     */
    void setType(SchedulePriorityType value);

} // SchedulePriority
