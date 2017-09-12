/**
 */
package de.cau.cs.kieler.esterel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.Function#getParameterTypes <em>Parameter Types</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.Function#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EsterelDefinition {
    /**
     * Returns the value of the '<em><b>Parameter Types</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.esterel.TypeIdentifier}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameter Types</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameter Types</em>' containment reference list.
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getFunction_ParameterTypes()
     * @model containment="true"
     * @generated
     */
    EList<TypeIdentifier> getParameterTypes();

    /**
     * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Return Type</em>' containment reference.
     * @see #setReturnType(TypeIdentifier)
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getFunction_ReturnType()
     * @model containment="true"
     * @generated
     */
    TypeIdentifier getReturnType();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.Function#getReturnType <em>Return Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Return Type</em>' containment reference.
     * @see #getReturnType()
     * @generated
     */
    void setReturnType(TypeIdentifier value);

} // Function
