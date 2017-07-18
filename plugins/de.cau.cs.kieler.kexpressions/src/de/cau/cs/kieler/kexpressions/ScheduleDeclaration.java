/**
 */
package de.cau.cs.kieler.kexpressions;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.ScheduleDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.ScheduleDeclaration#getPriorities <em>Priorities</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getScheduleDeclaration()
 * @model
 * @generated
 */
public interface ScheduleDeclaration extends Declaration {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getScheduleDeclaration_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.ScheduleDeclaration#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Priorities</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kexpressions.SchedulePriority}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Priorities</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Priorities</em>' containment reference list.
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getScheduleDeclaration_Priorities()
     * @model containment="true"
     * @generated
     */
    EList<SchedulePriority> getPriorities();

} // ScheduleDeclaration
