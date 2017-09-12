/**
 */
package de.cau.cs.kieler.esterel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.ConstantDeclaration#getConstants <em>Constants</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.ConstantDeclaration#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getConstantDeclaration()
 * @model
 * @generated
 */
public interface ConstantDeclaration extends EsterelDeclaration {
    /**
     * Returns the value of the '<em><b>Constants</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.esterel.Constant}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Constants</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Constants</em>' containment reference list.
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getConstantDeclaration_Constants()
     * @model containment="true"
     * @generated
     */
    EList<Constant> getConstants();

    /**
     * Returns the value of the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' containment reference.
     * @see #setType(TypeIdentifier)
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getConstantDeclaration_Type()
     * @model containment="true"
     * @generated
     */
    TypeIdentifier getType();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.ConstantDeclaration#getType <em>Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' containment reference.
     * @see #getType()
     * @generated
     */
    void setType(TypeIdentifier value);

} // ConstantDeclaration
