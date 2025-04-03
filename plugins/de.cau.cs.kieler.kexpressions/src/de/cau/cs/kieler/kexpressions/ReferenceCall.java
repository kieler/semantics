/**
 */
package de.cau.cs.kieler.kexpressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.ReferenceCall#isSuper <em>Super</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getReferenceCall()
 * @model
 * @generated
 */
public interface ReferenceCall extends ValuedObjectReference, Call {

    /**
     * Returns the value of the '<em><b>Super</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Super</em>' attribute.
     * @see #setSuper(boolean)
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getReferenceCall_Super()
     * @model required="true"
     * @generated
     */
    boolean isSuper();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.ReferenceCall#isSuper <em>Super</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Super</em>' attribute.
     * @see #isSuper()
     * @generated
     */
    void setSuper(boolean value);
} // ReferenceCall
