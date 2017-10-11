/**
 */
package de.cau.cs.kieler.esterel;

import de.cau.cs.kieler.kexpressions.Expression;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delay Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.DelayExpression#getDelay <em>Delay</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.DelayExpression#isImmediate <em>Immediate</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.DelayExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getDelayExpression()
 * @model
 * @generated
 */
public interface DelayExpression extends EObject {
    /**
     * Returns the value of the '<em><b>Delay</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delay</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Delay</em>' containment reference.
     * @see #setDelay(Expression)
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getDelayExpression_Delay()
     * @model containment="true"
     * @generated
     */
    Expression getDelay();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.DelayExpression#getDelay <em>Delay</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delay</em>' containment reference.
     * @see #getDelay()
     * @generated
     */
    void setDelay(Expression value);

    /**
     * Returns the value of the '<em><b>Immediate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Immediate</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Immediate</em>' attribute.
     * @see #setImmediate(boolean)
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getDelayExpression_Immediate()
     * @model
     * @generated
     */
    boolean isImmediate();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.DelayExpression#isImmediate <em>Immediate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Immediate</em>' attribute.
     * @see #isImmediate()
     * @generated
     */
    void setImmediate(boolean value);

    /**
     * Returns the value of the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Expression</em>' containment reference.
     * @see #setExpression(Expression)
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getDelayExpression_Expression()
     * @model containment="true"
     * @generated
     */
    Expression getExpression();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.DelayExpression#getExpression <em>Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression</em>' containment reference.
     * @see #getExpression()
     * @generated
     */
    void setExpression(Expression value);

} // DelayExpression
