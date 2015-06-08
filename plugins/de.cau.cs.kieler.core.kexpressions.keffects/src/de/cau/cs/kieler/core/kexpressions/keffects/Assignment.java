/**
 */
package de.cau.cs.kieler.core.kexpressions.keffects;

import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.core.kexpressions.ValuedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.keffects.Assignment#getValuedObject <em>Valued Object</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.keffects.Assignment#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.keffects.Assignment#getIndices <em>Indices</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.core.kexpressions.keffects.KEffectsPackage#getAssignment()
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
     * @see de.cau.cs.kieler.core.kexpressions.keffects.KEffectsPackage#getAssignment_ValuedObject()
     * @model required="true"
     * @generated
     */
	ValuedObject getValuedObject();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.keffects.Assignment#getValuedObject <em>Valued Object</em>}' reference.
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
     * @see de.cau.cs.kieler.core.kexpressions.keffects.KEffectsPackage#getAssignment_Expression()
     * @model containment="true" required="true"
     * @generated
     */
	Expression getExpression();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.keffects.Assignment#getExpression <em>Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression</em>' containment reference.
     * @see #getExpression()
     * @generated
     */
	void setExpression(Expression value);

	/**
     * Returns the value of the '<em><b>Indices</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.core.kexpressions.Expression}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Indices</em>' containment reference list.
     * @see de.cau.cs.kieler.core.kexpressions.keffects.KEffectsPackage#getAssignment_Indices()
     * @model containment="true"
     * @generated
     */
	EList<Expression> getIndices();

} // Assignment
