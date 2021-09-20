/**
 */
package de.cau.cs.kieler.kexpressions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vector Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.VectorValue#getValues <em>Values</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.VectorValue#isRange <em>Range</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getVectorValue()
 * @model
 * @generated
 */
public interface VectorValue extends Value {
    /**
     * Returns the value of the '<em><b>Values</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kexpressions.Expression}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Values</em>' containment reference list.
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getVectorValue_Values()
     * @model containment="true" required="true"
     * @generated
     */
    EList<Expression> getValues();

    /**
     * Returns the value of the '<em><b>Range</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Range</em>' attribute.
     * @see #setRange(boolean)
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getVectorValue_Range()
     * @model default="false"
     * @generated
     */
    boolean isRange();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.VectorValue#isRange <em>Range</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Range</em>' attribute.
     * @see #isRange()
     * @generated
     */
    void setRange(boolean value);

} // VectorValue
