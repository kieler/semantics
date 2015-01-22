/**
 */
package de.cau.cs.kieler.scgprios;

import de.cau.cs.kieler.core.kexpressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional P</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgprios.Conditional_P#getThen <em>Then</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.Conditional_P#getElse <em>Else</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.Conditional_P#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getConditional_P()
 * @model
 * @generated
 */
public interface Conditional_P extends Node_P {
    /**
     * Returns the value of the '<em><b>Then</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Then</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Then</em>' containment reference.
     * @see #setThen(ControlFlow_P)
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getConditional_P_Then()
     * @model containment="true"
     * @generated
     */
    ControlFlow_P getThen();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scgprios.Conditional_P#getThen <em>Then</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Then</em>' containment reference.
     * @see #getThen()
     * @generated
     */
    void setThen(ControlFlow_P value);

    /**
     * Returns the value of the '<em><b>Else</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Else</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Else</em>' containment reference.
     * @see #setElse(ControlFlow_P)
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getConditional_P_Else()
     * @model containment="true"
     * @generated
     */
    ControlFlow_P getElse();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scgprios.Conditional_P#getElse <em>Else</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Else</em>' containment reference.
     * @see #getElse()
     * @generated
     */
    void setElse(ControlFlow_P value);

    /**
     * Returns the value of the '<em><b>Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Condition</em>' containment reference.
     * @see #setCondition(Expression)
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getConditional_P_Condition()
     * @model containment="true"
     * @generated
     */
    Expression getCondition();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scgprios.Conditional_P#getCondition <em>Condition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Condition</em>' containment reference.
     * @see #getCondition()
     * @generated
     */
    void setCondition(Expression value);

} // Conditional_P
