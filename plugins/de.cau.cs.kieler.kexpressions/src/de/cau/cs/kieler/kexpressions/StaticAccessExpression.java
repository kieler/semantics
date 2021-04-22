/**
 */
package de.cau.cs.kieler.kexpressions;

import de.cau.cs.kieler.annotations.NamedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Access Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.StaticAccessExpression#getSubReference <em>Sub Reference</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.StaticAccessExpression#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getStaticAccessExpression()
 * @model
 * @generated
 */
public interface StaticAccessExpression extends Expression {
    /**
     * Returns the value of the '<em><b>Sub Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Reference</em>' containment reference.
     * @see #setSubReference(ValuedObjectReference)
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getStaticAccessExpression_SubReference()
     * @model containment="true"
     * @generated
     */
    ValuedObjectReference getSubReference();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.StaticAccessExpression#getSubReference <em>Sub Reference</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sub Reference</em>' containment reference.
     * @see #getSubReference()
     * @generated
     */
    void setSubReference(ValuedObjectReference value);

    /**
     * Returns the value of the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(NamedObject)
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getStaticAccessExpression_Target()
     * @model
     * @generated
     */
    NamedObject getTarget();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.StaticAccessExpression#getTarget <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(NamedObject value);

} // StaticAccessExpression
