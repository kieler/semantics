/**
 */
package de.cau.cs.kieler.kexpressions.keffects;

import org.eclipse.emf.common.util.EList;

import de.cau.cs.kieler.kexpressions.Expression;
import de.cau.cs.kieler.kexpressions.ValuedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.keffects.Assignment#getValuedObject <em>Valued Object</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.keffects.Assignment#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.keffects.Assignment#getIndices <em>Indices</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.keffects.Assignment#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends Effect {
	/**
     * Returns the value of the '<em><b>Valued Object</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valued Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Valued Object</em>' reference.
     * @see #setValuedObject(ValuedObject)
     * @see de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage#getAssignment_ValuedObject()
     * @model
     * @generated
     */
	ValuedObject getValuedObject();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.keffects.Assignment#getValuedObject <em>Valued Object</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Valued Object</em>' reference.
     * @see #getValuedObject()
     * @generated
     */
	void setValuedObject(ValuedObject value);

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
     * Returns the value of the '<em><b>Indices</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kexpressions.Expression}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Indices</em>' containment reference list.
     * @see de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage#getAssignment_Indices()
     * @model containment="true"
     * @generated
     */
	EList<Expression> getIndices();

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

} // Assignment
