/**
 */
package de.cau.cs.kieler.kexpressions;

import de.cau.cs.kieler.annotations.NamedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Special Access Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.SpecialAccessExpression#getAccess <em>Access</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.SpecialAccessExpression#getSubReference <em>Sub Reference</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.SpecialAccessExpression#getContainer <em>Container</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.SpecialAccessExpression#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getSpecialAccessExpression()
 * @model
 * @generated
 */
public interface SpecialAccessExpression extends Expression {
    /**
     * Returns the value of the '<em><b>Access</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Access</em>' attribute.
     * @see #setAccess(String)
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getSpecialAccessExpression_Access()
     * @model required="true"
     * @generated
     */
    String getAccess();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.SpecialAccessExpression#getAccess <em>Access</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Access</em>' attribute.
     * @see #getAccess()
     * @generated
     */
    void setAccess(String value);

    /**
     * Returns the value of the '<em><b>Sub Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Reference</em>' containment reference.
     * @see #setSubReference(ValuedObjectReference)
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getSpecialAccessExpression_SubReference()
     * @model containment="true"
     * @generated
     */
    ValuedObjectReference getSubReference();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.SpecialAccessExpression#getSubReference <em>Sub Reference</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sub Reference</em>' containment reference.
     * @see #getSubReference()
     * @generated
     */
    void setSubReference(ValuedObjectReference value);

    /**
     * Returns the value of the '<em><b>Container</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Container</em>' reference.
     * @see #setContainer(NamedObject)
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getSpecialAccessExpression_Container()
     * @model
     * @generated
     */
    NamedObject getContainer();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.SpecialAccessExpression#getContainer <em>Container</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Container</em>' reference.
     * @see #getContainer()
     * @generated
     */
    void setContainer(NamedObject value);

    /**
     * Returns the value of the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(NamedObject)
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getSpecialAccessExpression_Target()
     * @model
     * @generated
     */
    NamedObject getTarget();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.SpecialAccessExpression#getTarget <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(NamedObject value);

} // SpecialAccessExpression
