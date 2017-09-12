/**
 */
package de.cau.cs.kieler.esterel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.TypeDeclaration#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getTypeDeclaration()
 * @model
 * @generated
 */
public interface TypeDeclaration extends EsterelDeclaration {
    /**
     * Returns the value of the '<em><b>Types</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.esterel.TypeDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Types</em>' containment reference list.
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getTypeDeclaration_Types()
     * @model containment="true"
     * @generated
     */
    EList<TypeDefinition> getTypes();

} // TypeDeclaration
