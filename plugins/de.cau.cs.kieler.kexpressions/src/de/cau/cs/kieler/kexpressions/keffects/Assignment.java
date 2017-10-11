/**
 */
package de.cau.cs.kieler.kexpressions.keffects;

import de.cau.cs.kieler.kexpressions.Expression;
import de.cau.cs.kieler.kexpressions.ValuedObjectReference;
import de.cau.cs.kieler.kexpressions.keffects.Assignment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.keffects.Assignment#getReference <em>Reference</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.keffects.Assignment#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.keffects.Assignment#getOperator <em>Operator</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.keffects.Assignment#getSubReference <em>Sub Reference</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends Effect {
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
     * @see de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage#getAssignment_Reference()
     * @model containment="true"
     * @generated
     */
    ValuedObjectReference getReference();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.keffects.Assignment#getReference <em>Reference</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reference</em>' containment reference.
     * @see #getReference()
     * @generated
     */
    void setReference(ValuedObjectReference value);

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
     * @see de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage#getAssignment_Expression()
     * @model containment="true"
     * @generated
     */
	Expression getExpression();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.keffects.Assignment#getExpression <em>Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression</em>' containment reference.
     * @see #getExpression()
     * @generated
     */
	void setExpression(Expression value);

	/**
     * Returns the value of the '<em><b>Operator</b></em>' attribute.
     * The literals are from the enumeration {@link de.cau.cs.kieler.kexpressions.keffects.AssignOperator}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operator</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operator</em>' attribute.
     * @see de.cau.cs.kieler.kexpressions.keffects.AssignOperator
     * @see #setOperator(AssignOperator)
     * @see de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage#getAssignment_Operator()
     * @model
     * @generated
     */
    AssignOperator getOperator();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.keffects.Assignment#getOperator <em>Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operator</em>' attribute.
     * @see de.cau.cs.kieler.kexpressions.keffects.AssignOperator
     * @see #getOperator()
     * @generated
     */
    void setOperator(AssignOperator value);

    /**
     * Returns the value of the '<em><b>Sub Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub Reference</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Reference</em>' containment reference.
     * @see #setSubReference(ValuedObjectReference)
     * @see de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage#getAssignment_SubReference()
     * @model containment="true"
     * @generated
     */
    ValuedObjectReference getSubReference();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.keffects.Assignment#getSubReference <em>Sub Reference</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sub Reference</em>' containment reference.
     * @see #getSubReference()
     * @generated
     */
    void setSubReference(ValuedObjectReference value);

} // Assignment
