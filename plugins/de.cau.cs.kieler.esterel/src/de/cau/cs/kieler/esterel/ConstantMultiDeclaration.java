/**
 */
package de.cau.cs.kieler.esterel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Multi Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.ConstantMultiDeclaration#getConstantDecalrations <em>Constant Decalrations</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getConstantMultiDeclaration()
 * @model
 * @generated
 */
public interface ConstantMultiDeclaration extends EsterelDeclaration {
    /**
     * Returns the value of the '<em><b>Constant Decalrations</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.esterel.ConstantDeclaration}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Constant Decalrations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Constant Decalrations</em>' containment reference list.
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getConstantMultiDeclaration_ConstantDecalrations()
     * @model containment="true"
     * @generated
     */
    EList<ConstantDeclaration> getConstantDecalrations();

} // ConstantMultiDeclaration
