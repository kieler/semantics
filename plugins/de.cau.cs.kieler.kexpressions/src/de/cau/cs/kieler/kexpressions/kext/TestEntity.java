/**
 */
package de.cau.cs.kieler.kexpressions.kext;

import de.cau.cs.kieler.kexpressions.keffects.Effect;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.kext.TestEntity#getEffect <em>Effect</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.kext.TestEntity#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kexpressions.kext.KextPackage#getTestEntity()
 * @model
 * @generated
 */
public interface TestEntity extends EObject {
    /**
     * Returns the value of the '<em><b>Effect</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Effect</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Effect</em>' containment reference.
     * @see #setEffect(Effect)
     * @see de.cau.cs.kieler.kexpressions.kext.KextPackage#getTestEntity_Effect()
     * @model containment="true"
     * @generated
     */
    Effect getEffect();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.kext.TestEntity#getEffect <em>Effect</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Effect</em>' containment reference.
     * @see #getEffect()
     * @generated
     */
    void setEffect(Effect value);

    /**
     * Returns the value of the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Expression</em>' containment reference.
     * @see #setExpression(AnnotatedExpression)
     * @see de.cau.cs.kieler.kexpressions.kext.KextPackage#getTestEntity_Expression()
     * @model containment="true"
     * @generated
     */
    AnnotatedExpression getExpression();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.kext.TestEntity#getExpression <em>Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression</em>' containment reference.
     * @see #getExpression()
     * @generated
     */
    void setExpression(AnnotatedExpression value);

} // TestEntity
