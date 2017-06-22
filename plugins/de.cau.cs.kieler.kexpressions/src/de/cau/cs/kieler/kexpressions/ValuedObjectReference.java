/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.kexpressions;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Valued Object Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ValuedObjectReference has a reference to a ValuedObject and is a ComplexExpression.
 * Therefore such reference may have subExpressions. Those can be used to 
 * address a specific value. E.g. the ValuedObject could carry an array
 * value and a subExpression could be an IntValue that points to a special entry in 
 * that array. 
 * <p>
 * The distinction between a Variable and a VariableReference is mainly due to containment
 * relations. A Variable is usually defined exactly once and therefore contained by some 
 * scope element. A reference to that Variable may be required multiple times where
 * such reference need to be contained at the places where the reference is used.
 * Hence we need this distinction.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.ValuedObjectReference#getValuedObject <em>Valued Object</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.ValuedObjectReference#getIndices <em>Indices</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.ValuedObjectReference#getSubReference <em>Sub Reference</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getValuedObjectReference()
 * @model
 * @generated
 */
public interface ValuedObjectReference extends Expression {
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
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getValuedObjectReference_ValuedObject()
     * @model required="true"
     * @generated
     */
    ValuedObject getValuedObject();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.ValuedObjectReference#getValuedObject <em>Valued Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Valued Object</em>' reference.
     * @see #getValuedObject()
     * @generated
     */
    void setValuedObject(ValuedObject value);

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
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getValuedObjectReference_Indices()
     * @model containment="true"
     * @generated
     */
    EList<Expression> getIndices();

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
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getValuedObjectReference_SubReference()
     * @model containment="true"
     * @generated
     */
	ValuedObjectReference getSubReference();

				/**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.ValuedObjectReference#getSubReference <em>Sub Reference</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sub Reference</em>' containment reference.
     * @see #getSubReference()
     * @generated
     */
	void setSubReference(ValuedObjectReference value);

} // ValuedObjectReference
